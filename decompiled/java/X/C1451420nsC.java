package X;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451420nsC extends AbstractC1451430nsD {
    public final CreativeInfo LLILZ;
    public final CreativeModel LLILZIL;
    public final ImageAlbumData LLILZLL;
    public final C1450090nq3 LLIZ;
    public final Function0<Unit> LLIZLLLIL;
    public final C1DRG LLJ;
    public final List<StickerItemModel> LLJI;
    public final Map<String, Long> LLJIJIL;
    public List<SingleImageData> LLJILJIL;
    public final Map<String, C19A3> LLJILJILJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLJILJIL.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        C1450990nrV c1450990nrV;
        SingleImageData singleImageData = null;
        if (obj instanceof C1450990nrV) {
            c1450990nrV = (C1450990nrV) obj;
        } else {
            c1450990nrV = null;
        }
        if (c1450990nrV != null) {
            C1450990nrV c1450990nrV2 = (C1450990nrV) obj;
            Iterator<SingleImageData> it2 = this.LLILZLL.getImageList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                SingleImageData next = it2.next();
                if (Intrinsics.LJFF(c1450990nrV2.LLJJIJIIJIL.getId(), next.getId())) {
                    singleImageData = next;
                    break;
                }
            }
            if (!Intrinsics.LJFF(singleImageData, c1450990nrV2.LLJJIJIIJIL)) {
                return -2;
            }
            String id = c1450990nrV.LLJJIJIIJIL.getId();
            Iterator<SingleImageData> it3 = this.LLJILJIL.iterator();
            int i = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(id, it3.next().getId())) {
                    if (i >= 0) {
                        return i;
                    }
                } else {
                    i++;
                }
            }
        }
        return -2;
    }

    public final C19A3 LJJIJL(int i) {
        return (C19A3) ((LinkedHashMap) this.LLJILJILJ).get(LJJIJLIJ(i));
    }

    public final String LJJIJLIJ(int i) {
        List<SingleImageData> list = this.LLJILJIL;
        return ((SingleImageData) ListProtector.get(list, i % list.size())).getId();
    }

    public final void LJJIL(List list) {
        C1450990nrV c1450990nrV;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String id = ((SingleImageData) it2.next()).getId();
            if (id != null && !this.LLJIJIL.containsKey(id)) {
                this.LLJIJIL.put(id, Long.valueOf(this.LLJIJIL.size()));
            }
        }
        this.LLJILJIL = list;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                Object obj2 = ((LinkedHashMap) this.LLJILJILJ).get(((SingleImageData) obj).getId());
                if ((obj2 instanceof C1450990nrV) && (c1450990nrV = (C1450990nrV) obj2) != null) {
                    c1450990nrV.LLLLJI = i;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        notifyDataSetChanged();
    }

    public final void LJJIZ(boolean z) {
        Iterator it2 = ((LinkedHashMap) this.LLJILJILJ).values().iterator();
        while (it2.hasNext()) {
            C1450990nrV c1450990nrV = (C1450990nrV) ((C19A3) it2.next());
            if (c1450990nrV.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                if (z && c1450990nrV.LLJZIJLIL) {
                    C786410Ut5.LLIIII(c1450990nrV.LJIJJLI(), 0);
                }
                if (!z && c1450990nrV.LJIJJLI().getVisibility() == 0) {
                    C786410Ut5.LLIIII(c1450990nrV.LJIJJLI(), 8);
                }
                if (c1450990nrV.LJIJJLI().getVisibility() == 8) {
                    C1450070nq1.LIZ("change surface surface is gone");
                    c1450990nrV.LLLLLLJ = false;
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        this.LLILLJJLI.remove((Scene) obj);
        if (((LinkedHashMap) this.LLJILJILJ).containsValue(obj)) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((LinkedHashMap) this.LLJILJILJ).entrySet()) {
                if (Intrinsics.LJFF(entry.getValue(), obj)) {
                    arrayList.add(entry.getKey());
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.LLJILJILJ.remove(it2.next());
            }
            return;
        }
        String strLJJIJLIJ = LJJIJLIJ(i);
        if (this.LLJILJILJ.containsKey(strLJJIJLIJ) && Intrinsics.LJFF(((LinkedHashMap) this.LLJILJILJ).get(strLJJIJLIJ), obj)) {
            C19719512Dh.LIZJ(this.LLJILJILJ).remove(strLJJIJLIJ);
        }
    }

    public C1451420nsC(CreativeInfo creativeInfo, CreativeModel creativeModel, ImageAlbumData imageAlbumData, C19A3 c19a3, C1450090nq3 c1450090nq3, Function0 function0, C1DRG c1drg, List list) {
        super(c19a3);
        this.LLILZ = creativeInfo;
        this.LLILZIL = creativeModel;
        this.LLILZLL = imageAlbumData;
        this.LLIZ = c1450090nq3;
        this.LLIZLLLIL = function0;
        this.LLJ = c1drg;
        this.LLJI = list;
        this.LLJIJIL = new LinkedHashMap();
        List<SingleImageData> imageList = imageAlbumData.getImageList();
        for (SingleImageData singleImageData : imageList) {
            ArrayList arrayList = new ArrayList(singleImageData.getStickerInfo().getStickers());
            arrayList.addAll(this.LLJI);
            singleImageData.setStickerInfo(new ImageStickerInfo(arrayList, singleImageData.getStickerInfo().getRecoverStickers()));
            String id = singleImageData.getId();
            if (id != null && !this.LLJIJIL.containsKey(id)) {
                this.LLJIJIL.put(id, Long.valueOf(this.LLJIJIL.size()));
            }
        }
        this.LLJILJIL = imageList;
        this.LLJILJILJ = new LinkedHashMap();
    }
}

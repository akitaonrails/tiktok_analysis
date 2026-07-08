package X;

import Y.ARunnableS35S0201000_31;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: renamed from: X.15Ga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20491015Ga extends C15GR<C20448614zs> {
    public boolean LJIJ;
    public boolean LJIJI;
    public long LJIJJ;
    public String LJIJJLI;
    public boolean LJIL;
    public C20491215Gc LJJ;
    public boolean LJJI;

    @Override // X.C15GR
    public final AbstractC683590Qrd<C20448614zs> LIZIZ() {
        C20494715Hl c20494715Hl = new C20494715Hl(this.LJIIIIZZ, this.LJIILLIIL, this.LJIILL);
        c20494715Hl.LLJ = this.LJIJ;
        c20494715Hl.LLJIJIL = this.LJIJI;
        c20494715Hl.LLJILJILJ = this.LJIIJ;
        c20494715Hl.LLJJJJJIL = this.LJJ;
        c20494715Hl.LLJJJJLIIL = this.LJJI;
        return c20494715Hl;
    }

    public final void LJI() {
        final C20494715Hl c20494715Hl;
        C20491215Gc c20491215Gc;
        AbstractC683510QrV abstractC683510QrV = this.LJFF;
        if (!(abstractC683510QrV instanceof C20494715Hl) || (c20491215Gc = (c20494715Hl = (C20494715Hl) abstractC683510QrV).LLJJJJJIL) == null) {
            return;
        }
        if (!c20491215Gc.LIZJ.isEmpty()) {
            ((LinkedHashMap) c20494715Hl.LLJJJJJIL.LIZJ).forEach(new BiConsumer() { // from class: X.15Gb
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    boolean z;
                    C20494715Hl c20494715Hl2 = c20494715Hl;
                    MusicModel musicModel = (MusicModel) obj;
                    Integer num = (Integer) obj2;
                    C15HO c15hoLLLFZ = c20494715Hl2.LLLFZ(musicModel);
                    C15HY c15hy = new C15HY(c20494715Hl2.LLILZIL, musicModel, num.intValue(), false, c15hoLLLFZ);
                    Fragment fragment = c20494715Hl2.LL;
                    int iIntValue = num.intValue();
                    boolean z2 = c20494715Hl2.LLJILJIL;
                    if (musicModel.getMatchedPGCSoundInfo() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C15IK.LJIIL(c15hy, fragment, c15hoLLLFZ, musicModel, iIntValue, z2, z, c20494715Hl2.LLJJJJJIL);
                }
            });
            ((LinkedHashMap) c20494715Hl.LLJJJJJIL.LIZJ).clear();
        }
        if (c20494715Hl.LLJJJJJIL.LIZLLL.isEmpty()) {
            return;
        }
        c20494715Hl.LLJJJJJIL.LIZLLL.forEach(new Consumer() { // from class: X.15Gd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C20494715Hl c20494715Hl2 = c20494715Hl;
                MusicCollectionItem musicCollectionItem = (MusicCollectionItem) obj;
                C20491215Gc c20491215Gc2 = c20494715Hl2.LLJJJJJIL;
                String str = musicCollectionItem.mcId;
                if (!c20491215Gc2.LIZ.contains(str)) {
                    c20491215Gc2.LIZ.add(str);
                    C15HO c15ho = c20494715Hl2.LLIZLLLIL;
                    C15IK.LJIILL(c15ho.LIZ, "", musicCollectionItem.mcId, musicCollectionItem.mcName, c15ho.LJIILIIL, c15ho.LJIILLIIL, "playlist");
                }
            }
        });
        c20494715Hl.LLJJJJJIL.LIZLLL.clear();
    }

    public final void LJII(Fragment fragment) {
        AbstractC683510QrV abstractC683510QrV = this.LJFF;
        if (abstractC683510QrV instanceof C20494715Hl) {
            ((C20494715Hl) abstractC683510QrV).LL = fragment;
        }
    }

    public final void LJIIIIZZ(C15H0 c15h0) {
        AbstractC683510QrV abstractC683510QrV = this.LJFF;
        if (abstractC683510QrV instanceof C20494715Hl) {
            ((C20494715Hl) abstractC683510QrV).LLILLJJLI = c15h0;
        }
    }

    public final void LJIIIZ(C15HO c15ho) {
        AbstractC683510QrV abstractC683510QrV = this.LJFF;
        if (abstractC683510QrV instanceof C20494715Hl) {
            ((C20494715Hl) abstractC683510QrV).LLIZLLLIL = c15ho;
        }
    }

    public final void LJIIJ(Pair<Long, Long> pair) {
        AbstractC683510QrV abstractC683510QrV = this.LJFF;
        if (abstractC683510QrV instanceof C20494715Hl) {
            ((C20494715Hl) abstractC683510QrV).LLILZ = pair;
        }
    }

    @Override // X.C15GR, X.InterfaceC20492315Gn
    public final void LLJJJIL(List<C20448614zs> list, boolean z) {
        super.LLJJJIL(list, z);
        if (list != null && this.LJIJJ > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIJJ;
            HashMap map = new HashMap();
            map.put("tab_name", "your_sounds");
            map.put("show_duration", String.valueOf(jCurrentTimeMillis));
            C20684815ws.LJIJ("local_music_show_duration", C117000cS.LIZ(map));
        }
        if (!this.LJIL) {
            this.LJIL = true;
            if (!TextUtils.isEmpty(this.LJIJJLI) && list != null) {
                for (int i = 0; i < list.size(); i++) {
                    MusicModel musicModel = ((C20448614zs) ListProtector.get(list, i)).LIZIZ;
                    if (musicModel != null && this.LJIJJLI.equals(musicModel.getMusicId()) && (this.LJFF instanceof C20494715Hl)) {
                        HandlerHook.viewPost(this.LIZIZ, new ARunnableS35S0201000_31(i, musicModel, this, 4));
                        return;
                    }
                }
            }
        }
    }

    public C20491015Ga(Context context, View view, C15GU c15gu, int i, C0P6P c0p6p, InterfaceC20494515Hj<C15HP> interfaceC20494515Hj, int i2, int i3) {
        super(context, view, c15gu, i, c0p6p, interfaceC20494515Hj, i2, i3);
    }

    public C20491015Ga(Context context, View view, C15GU c15gu, int i, C0P6P c0p6p, InterfaceC20494515Hj<C15HP> interfaceC20494515Hj, int i2, int i3, int i4) {
        super(context, view, c15gu, i, c0p6p, interfaceC20494515Hj, i2, i3, i4);
    }

    public C20491015Ga(Context context, View view, C15GU c15gu, int i, C0P6P c0p6p, InterfaceC20494515Hj<C15HP> interfaceC20494515Hj, int i2, EnumC20491915Gj enumC20491915Gj, int i3) {
        super(context, view, c15gu, i, c0p6p, interfaceC20494515Hj, i2, enumC20491915Gj, i3);
    }
}

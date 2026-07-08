package X;

import android.net.Uri;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355500Dwi extends C348880Dm2 {
    public final InterfaceC1455860nzM LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;

    @Override // X.C348880Dm2
    public final void LIZJ() {
        VecNLETrackSPtr tracks = this.LIZ.LIZJ().getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.FILTER) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).getSlots().iterator();
            while (it3.hasNext()) {
                ((C355510Dwj) this.LJ.getValue()).LIZJ(this.LIZ.LIZJ(), it3.next());
            }
        }
        C350410DoV.LIZ(this.LIZ.LJ, true, false);
    }

    public C355500Dwi(C1463670oBx c1463670oBx, InterfaceC1455860nzM interfaceC1455860nzM) {
        super(c1463670oBx);
        this.LIZJ = interfaceC1455860nzM;
        this.LIZLLL = C452501pT.LIZIZ(new AwS549S0100000_5(c1463670oBx, 175));
        this.LJ = C452501pT.LIZIZ(new AwS406S0200000_5(this, c1463670oBx, 26));
    }

    @Override // X.C348880Dm2
    public final void LJII(float f, String str) {
        NLETrackSlot nLETrackSlot;
        NLETrack next;
        VecNLETrackSlotSPtr sortedSlots;
        C355510Dwj c355510Dwj = (C355510Dwj) this.LJ.getValue();
        NLEModel nLEModelLIZJ = this.LIZ.LIZJ();
        c355510Dwj.getClass();
        Iterator<NLETrack> it2 = nLEModelLIZJ.getTracks().iterator();
        while (true) {
            nLETrackSlot = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (C351220Dpo.LLJI(next)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack != null && (sortedSlots = nLETrack.getSortedSlots()) != null) {
            nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(sortedSlots);
        }
        InterfaceC354920Dvm interfaceC354920Dvm = c355510Dwj.LJFF;
        if (interfaceC354920Dvm != null && interfaceC354920Dvm.LJJJLZIJ(true, nLETrackSlot, f, false, EnumC356070Dxd.COMMIT)) {
            C350410DoV.LIZ(this.LIZ.LJ, true, false);
        }
    }

    @Override // X.C348880Dm2
    public final void LJ(FilterBean filterBean, FilterBean filterBean2, float f, boolean z) {
        Object obj;
        String extra;
        String extra2;
        long maxEnd;
        Uri thumbnailFileUri;
        VecNLETrackSPtr tracks = this.LIZ.LIZJ().getTracks();
        ArrayList<NLETrack> arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.FILTER) {
                arrayList.add(nLETrack);
            }
        }
        NLETrackSlot nLETrackSlot = null;
        if (arrayList.size() == 1) {
            obj = ListProtector.get(arrayList, 0);
        } else {
            obj = null;
            for (NLETrack nLETrack2 : arrayList) {
                NLENode nLENode = (NLENode) C13LP.LJJJLL(nLETrack2.getSlots());
                if (nLENode != null) {
                    extra = nLENode.getExtra("filter_type");
                } else {
                    extra = null;
                }
                boolean zLJFF = Intrinsics.LJFF(extra, "carousel");
                if (nLENode != null) {
                    extra2 = nLENode.getExtra("global_filter_type");
                } else {
                    extra2 = null;
                }
                boolean zLJFF2 = Intrinsics.LJFF(extra2, "color_filter");
                if (zLJFF || zLJFF2) {
                    obj = nLETrack2;
                }
            }
        }
        NLETrack mainTrack = this.LIZ.LIZJ().getMainTrack();
        if (mainTrack != null) {
            maxEnd = mainTrack.getMaxEnd();
        } else {
            maxEnd = 0;
        }
        ResourceItem resourceItem = new ResourceItem();
        resourceItem.setPath(filterBean2.getFilterFolder());
        resourceItem.setName(filterBean2.getName());
        resourceItem.setResourceId(filterBean2.getResId());
        resourceItem.setEffectId(filterBean2.getId());
        String extra3 = filterBean2.getExtra();
        String str = "";
        if (extra3 == null) {
            extra3 = "";
        }
        resourceItem.extra = extra3;
        String thumbnailFilePath = filterBean2.getThumbnailFilePath();
        if (thumbnailFilePath != null || ((thumbnailFileUri = filterBean2.getThumbnailFileUri()) != null && (thumbnailFilePath = thumbnailFileUri.getPath()) != null)) {
            str = thumbnailFilePath;
        }
        resourceItem.setIcon(str);
        NLETrack nLETrack3 = (NLETrack) obj;
        if (nLETrack3 != null) {
            C355530Dwl c355530Dwl = new C355530Dwl(EnumC356350Dy5.REPLACE, nLETrack3, maxEnd, (String) null, 16);
            String categoryKey = filterBean2.getCategoryKey();
            VecNLETrackSlotSPtr slots = nLETrack3.getSlots();
            if (slots != null) {
                nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots);
            }
            LJIIIIZZ(c355530Dwl, categoryKey, resourceItem, nLETrackSlot, f, z);
            return;
        }
        LJIIIIZZ(new C355530Dwl(EnumC356350Dy5.ADD, (NLETrack) null, maxEnd, (String) null, 16), filterBean2.getCategoryKey(), resourceItem, null, f, z);
    }

    public final void LJIIIIZZ(C355530Dwl c355530Dwl, String str, ResourceItem resourceItem, NLETrackSlot nLETrackSlot, float f, boolean z) {
        if (nLETrackSlot != null) {
            nLETrackSlot.setStartTime(0L);
            nLETrackSlot.setEndTime(C352310DrZ.LIZJ(this.LIZ.getDuration()));
        }
        NLETrackSlot nLETrackSlotLIZ = ((C355510Dwj) this.LJ.getValue()).LIZ(c355530Dwl, str, Float.valueOf(f), resourceItem, nLETrackSlot, this.LIZ.LIZJ());
        if (nLETrackSlotLIZ != null) {
            nLETrackSlotLIZ.setExtra("filter_type", "carousel");
            if (z) {
                nLETrackSlotLIZ.setExtra("global_filter_type", "color_filter");
            }
            C350410DoV.LIZ(this.LIZ.LJ, true, false);
        }
    }

    @Override // X.C348880Dm2
    public final void LIZ(String str, List<Pair<String, Float>> list, String str2, String str3, String str4, String str5, String str6, float f, boolean z) {
        long maxEnd;
        String str7 = str6;
        NLETrack mainTrack = this.LIZ.LIZJ().getMainTrack();
        if (mainTrack != null) {
            maxEnd = mainTrack.getMaxEnd();
        } else {
            maxEnd = 0;
        }
        ResourceItem resourceItem = new ResourceItem();
        resourceItem.setPath(str);
        resourceItem.setName(str3);
        resourceItem.setResourceId(str5);
        str4.toString();
        resourceItem.setEffectId(str4);
        if (str7 == null) {
            str7 = "";
        }
        resourceItem.extra = str7;
        resourceItem.setIcon("");
        LJIIIIZZ(new C355530Dwl(EnumC356350Dy5.ADD, (NLETrack) null, maxEnd, (String) null, 16), str2, resourceItem, null, f, z);
    }
}

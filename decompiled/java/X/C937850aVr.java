package X;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSupportNewLayoutInFeedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.AnchorLayoutSetting;
import tikcast.linkmic.common.LayoutState;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0aVr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937850aVr implements InterfaceC920220a3Q {
    public final EnumC940090aZT LIZ;
    public MultiGuestLayoutExtra LIZIZ;
    public long LIZJ;
    public InterfaceC937900aVw LIZLLL;
    public final ConcurrentHashMap<String, C937860aVs> LJ = new ConcurrentHashMap<>();

    @Override // X.InterfaceC940760aaY
    public final void LJFF(int i, String str) {
    }

    @Override // X.InterfaceC920220a3Q
    public final int LJII() {
        MultiGuestLayoutExtra multiGuestLayoutExtra;
        MultiGuestLayoutExtra multiGuestLayoutExtra2;
        if (C01ZD.LIZ(7) && (((multiGuestLayoutExtra = LIZIZ().multiGuestLayoutExtra) == null || multiGuestLayoutExtra.enlargeStatus != 0) && (multiGuestLayoutExtra2 = LIZIZ().multiGuestLayoutExtra) != null && multiGuestLayoutExtra2.currentPanelLayoutType == 7)) {
            return 1;
        }
        MultiGuestLayoutExtra multiGuestLayoutExtra3 = LIZIZ().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra3 == null && (multiGuestLayoutExtra3 = this.LIZIZ) == null) {
            return 0;
        }
        return multiGuestLayoutExtra3.currentLayoutStyle;
    }

    @Override // X.InterfaceC920220a3Q
    public final void LJIILL() {
        this.LIZIZ = null;
    }

    @Override // X.InterfaceC940760aaY
    public final void LJIJI(LayoutState layoutState, List<SpotInfo> list, MultiGuestLayoutExtra multiGuestLayoutExtra) {
    }

    @Override // X.InterfaceC940760aaY
    public final void LJJI(String str) {
    }

    @Override // X.InterfaceC940760aaY
    public final void LJJII(String str) {
    }

    @Override // X.InterfaceC940760aaY
    public final void LJJIJ(String str) {
    }

    @Override // X.InterfaceC940760aaY
    public final void LJJIJIIJIL(String str) {
    }

    public final InterfaceC937900aVw LJIIZILJ() {
        long j = this.LIZJ;
        if (LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue() && j > 0) {
            InterfaceC937900aVw interfaceC937900aVw = this.LIZLLL;
            return interfaceC937900aVw == null ? C915980Zwa.LJIIIIZZ().PG2(j) : interfaceC937900aVw;
        }
        if (LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage()) {
            return C915980Zwa.LJIIIIZZ().Ci(null);
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            return interfaceC954180awCLLJLL.LLIIJLIL();
        }
        return null;
    }

    @Override // X.InterfaceC920220a3Q
    public final Rect LJJIIJ() {
        InterfaceC940060aZQ interfaceC940060aZQ;
        FrameLayout frameLayoutLL;
        Rect rect = new Rect();
        InterfaceC937900aVw interfaceC937900aVwLJIIZILJ = LJIIZILJ();
        if ((interfaceC937900aVwLJIIZILJ instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLJIIZILJ) != null && (frameLayoutLL = interfaceC940060aZQ.LL()) != null) {
            frameLayoutLL.getGlobalVisibleRect(rect);
        }
        return rect;
    }

    @Override // X.InterfaceC920220a3Q
    public final String LIZ() {
        return LIZIZ().layoutKey;
    }

    public final LayoutState LIZIZ() {
        InterfaceC940060aZQ interfaceC940060aZQ;
        C955320ay2 c955320ay2LJJLIIIJL;
        InterfaceC937900aVw interfaceC937900aVwLJIIZILJ = LJIIZILJ();
        if (!(interfaceC937900aVwLJIIZILJ instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLJIIZILJ) == null || (c955320ay2LJJLIIIJL = interfaceC940060aZQ.LJJLIIIJL()) == null) {
            LayoutState layoutState = new LayoutState();
            C20441214yg.LJ("LayoutDataSource", "currentLayoutState = null");
            return layoutState;
        }
        LayoutState layoutState2 = new LayoutState();
        layoutState2.layoutId = c955320ay2LJJLIIIJL.LIZ;
        layoutState2.layoutKey = c955320ay2LJJLIIIJL.LIZIZ;
        layoutState2.multiGuestLayoutExtra = c955320ay2LJJLIIIJL.LIZJ;
        return layoutState2;
    }

    @Override // X.InterfaceC920220a3Q
    public final int LIZJ() {
        MultiGuestLayoutExtra multiGuestLayoutExtra = LIZIZ().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra != null) {
            return multiGuestLayoutExtra.currentMaxPosition;
        }
        return 0;
    }

    @Override // X.InterfaceC920220a3Q
    public final AnchorLayoutSetting LIZLLL() {
        AnchorLayoutSetting anchorLayoutSetting;
        MultiGuestDataHolder multiGuestDataHolderLJJIFFI = PlaybookUtilKt.LJJIFFI();
        return (multiGuestDataHolderLJJIFFI == null || (anchorLayoutSetting = multiGuestDataHolderLJJIFFI.LJIJJ) == null) ? new AnchorLayoutSetting() : anchorLayoutSetting;
    }

    @Override // X.InterfaceC920220a3Q
    public final boolean LJ() {
        MultiGuestLayoutExtra multiGuestLayoutExtra = LIZIZ().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra != null && multiGuestLayoutExtra.currentLayoutStyle == 2) {
            return true;
        }
        MultiGuestLayoutExtra multiGuestLayoutExtra2 = LIZIZ().multiGuestLayoutExtra;
        return multiGuestLayoutExtra2 != null && multiGuestLayoutExtra2.currentLayoutStyle == 1;
    }

    @Override // X.InterfaceC920220a3Q
    public final boolean LJI() {
        MultiGuestLayoutExtra multiGuestLayoutExtra = LIZIZ().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra != null && multiGuestLayoutExtra.currentLayoutStyle == 4) {
            return true;
        }
        MultiGuestLayoutExtra multiGuestLayoutExtra2 = LIZIZ().multiGuestLayoutExtra;
        return multiGuestLayoutExtra2 != null && multiGuestLayoutExtra2.currentLayoutStyle == 2;
    }

    @Override // X.InterfaceC920220a3Q
    public final List<C957020b0m> LJIIIZ() {
        InterfaceC940060aZQ interfaceC940060aZQ;
        C942080acg c942080acgLJLJI;
        C947470alN c947470alN;
        List<C957020b0m> list;
        InterfaceC937900aVw interfaceC937900aVwLJIIZILJ = LJIIZILJ();
        return (!(interfaceC937900aVwLJIIZILJ instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLJIIZILJ) == null || (c942080acgLJLJI = interfaceC940060aZQ.LJLJI()) == null || (c947470alN = c942080acgLJLJI.LIZ) == null || (list = c947470alN.LIZLLL) == null) ? C13BV.INSTANCE : list;
    }

    @Override // X.InterfaceC920220a3Q
    public final int LJIIJ() {
        MultiGuestLayoutExtra multiGuestLayoutExtra = LIZIZ().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra != null) {
            return multiGuestLayoutExtra.enlargeStatus;
        }
        return 0;
    }

    @Override // X.InterfaceC920220a3Q
    public final int LJIIJJI() {
        MultiGuestLayoutExtra multiGuestLayoutExtra = LIZIZ().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra != null) {
            return multiGuestLayoutExtra.originLayoutStyle;
        }
        return 0;
    }

    @Override // X.InterfaceC920220a3Q
    public final List<PosIdentity> LJIIL() {
        List<C957020b0m> listLJIIIZ = LJIIIZ();
        ArrayList arrayList = new ArrayList();
        for (C957020b0m c957020b0m : listLJIIIZ) {
            MultiGuestSpotExtra multiGuestExtra = c957020b0m.getMultiGuestExtra();
            if (multiGuestExtra != null && multiGuestExtra.isEnlarged) {
                arrayList.add(c957020b0m);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            PosIdentity posIdentity = ((C957020b0m) it2.next()).getPosIdentity();
            if (posIdentity != null) {
                arrayList2.add(posIdentity);
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC920220a3Q
    public final LayoutState LJIILIIL() {
        return LIZIZ();
    }

    @Override // X.InterfaceC920220a3Q
    public final boolean LJIILJJIL() {
        MultiGuestLayoutExtra multiGuestLayoutExtra = LIZIZ().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra != null && multiGuestLayoutExtra.enlargeStatus == 1) {
            return true;
        }
        MultiGuestLayoutExtra multiGuestLayoutExtra2 = LIZIZ().multiGuestLayoutExtra;
        return multiGuestLayoutExtra2 != null && multiGuestLayoutExtra2.enlargeStatus == 2;
    }

    @Override // X.InterfaceC920220a3Q
    public final boolean LJIJJ() {
        MultiGuestLayoutExtra multiGuestLayoutExtra = LIZIZ().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra != null && multiGuestLayoutExtra.currentPanelLayoutType == 6) {
            return true;
        }
        MultiGuestLayoutExtra multiGuestLayoutExtra2 = LIZIZ().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra2 != null && multiGuestLayoutExtra2.currentPanelLayoutType == 7) {
            return true;
        }
        MultiGuestLayoutExtra multiGuestLayoutExtra3 = LIZIZ().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra3 != null && multiGuestLayoutExtra3.currentPanelLayoutType == 11) {
            return true;
        }
        MultiGuestLayoutExtra multiGuestLayoutExtra4 = LIZIZ().multiGuestLayoutExtra;
        return multiGuestLayoutExtra4 != null && multiGuestLayoutExtra4.currentPanelLayoutType == 12;
    }

    @Override // X.InterfaceC920220a3Q
    public final String LJIL() {
        return LIZIZ().layoutId;
    }

    @Override // X.InterfaceC920220a3Q
    public final boolean LJJIFFI() {
        MultiGuestLayoutExtra multiGuestLayoutExtra = LIZIZ().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra != null && multiGuestLayoutExtra.currentLayoutStyle == 1) {
            return true;
        }
        MultiGuestLayoutExtra multiGuestLayoutExtra2 = LIZIZ().multiGuestLayoutExtra;
        return multiGuestLayoutExtra2 != null && multiGuestLayoutExtra2.currentLayoutStyle == 3;
    }

    @Override // X.InterfaceC920220a3Q
    public final boolean LJJIIZ() {
        MultiGuestLayoutExtra multiGuestLayoutExtra;
        MultiGuestLayoutExtra multiGuestLayoutExtra2 = LIZIZ().multiGuestLayoutExtra;
        return (multiGuestLayoutExtra2 != null ? Integer.valueOf(multiGuestLayoutExtra2.currentLayoutStyle) : null) == null || ((multiGuestLayoutExtra = LIZIZ().multiGuestLayoutExtra) != null && multiGuestLayoutExtra.currentLayoutStyle == 0) || LJIIIZ().isEmpty() || getPanelLayoutType() == 1;
    }

    @Override // X.InterfaceC920220a3Q
    public final boolean LJJIIZI() {
        MultiGuestLayoutExtra multiGuestLayoutExtra = LIZIZ().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra != null && multiGuestLayoutExtra.currentPanelLayoutType == 6) {
            return true;
        }
        MultiGuestLayoutExtra multiGuestLayoutExtra2 = LIZIZ().multiGuestLayoutExtra;
        return multiGuestLayoutExtra2 != null && multiGuestLayoutExtra2.currentPanelLayoutType == 7;
    }

    @Override // X.InterfaceC920220a3Q
    public final int LJJIJIIJI() {
        MultiGuestLayoutExtra multiGuestLayoutExtra = LIZIZ().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra != null) {
            return multiGuestLayoutExtra.originMaxPosition;
        }
        return 0;
    }

    @Override // X.InterfaceC920220a3Q
    public final int getPanelLayoutType() {
        MultiGuestLayoutExtra multiGuestLayoutExtra = LIZIZ().multiGuestLayoutExtra;
        if (multiGuestLayoutExtra != null) {
            return multiGuestLayoutExtra.currentPanelLayoutType;
        }
        MultiGuestLayoutExtra multiGuestLayoutExtra2 = this.LIZIZ;
        if (multiGuestLayoutExtra2 != null) {
            return multiGuestLayoutExtra2.currentPanelLayoutType;
        }
        return 1;
    }

    @Override // X.InterfaceC920220a3Q
    public final EnumC940090aZT getPageType() {
        return this.LIZ;
    }

    @Override // X.InterfaceC920220a3Q
    public final long getRoomId() {
        return this.LIZJ;
    }

    public C937850aVr(EnumC940090aZT enumC940090aZT) {
        this.LIZ = enumC940090aZT;
    }

    @Override // X.InterfaceC920220a3Q
    public final boolean LJIIIIZZ(String str) {
        Object obj;
        MultiGuestSpotExtra multiGuestExtra;
        Iterator<C957020b0m> it2 = LJIIIZ().iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            C957020b0m next = it2.next();
            PosIdentity posIdentity = next.getPosIdentity();
            if (posIdentity != null) {
                obj = posIdentity.value;
            }
            if (Intrinsics.LJFF(obj, str)) {
                obj = next;
                break;
            }
        }
        C957020b0m c957020b0m = (C957020b0m) obj;
        if (c957020b0m != null && (multiGuestExtra = c957020b0m.getMultiGuestExtra()) != null) {
            return multiGuestExtra.isSingleZoomEnabled;
        }
        return false;
    }

    @Override // X.InterfaceC920220a3Q
    public final C957020b0m LJIILLIIL(String str) {
        Object obj;
        Iterator<C957020b0m> it2 = LJIIIZ().iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            C957020b0m next = it2.next();
            PosIdentity posIdentity = next.getPosIdentity();
            if (posIdentity != null) {
                obj = posIdentity.value;
            }
            if (Intrinsics.LJFF(obj, str)) {
                obj = next;
                break;
            }
        }
        return (C957020b0m) obj;
    }

    @Override // X.InterfaceC920220a3Q
    public final PosIdentity LJIJ(String str) {
        C957020b0m next;
        String str2;
        Iterator<C957020b0m> it2 = LJIIIZ().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                PosIdentity posIdentity = next.getPosIdentity();
                if (posIdentity != null) {
                    str2 = posIdentity.value;
                } else {
                    str2 = null;
                }
                if (Intrinsics.LJFF(str2, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C957020b0m c957020b0m = next;
        if (c957020b0m == null) {
            return null;
        }
        return c957020b0m.getPosIdentity();
    }

    @Override // X.InterfaceC920220a3Q
    public final boolean LJIJJLI(String str) {
        Object obj;
        MultiGuestSpotExtra multiGuestExtra;
        Iterator<C957020b0m> it2 = LJIIIZ().iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                break;
            }
            C957020b0m next = it2.next();
            PosIdentity posIdentity = next.getPosIdentity();
            if (posIdentity != null) {
                obj = posIdentity.value;
            }
            if (Intrinsics.LJFF(obj, str)) {
                obj = next;
                break;
            }
        }
        C957020b0m c957020b0m = (C957020b0m) obj;
        if (c957020b0m != null && (multiGuestExtra = c957020b0m.getMultiGuestExtra()) != null) {
            return multiGuestExtra.isEnlarged;
        }
        return false;
    }

    public final void LJJ(List<C957020b0m> list) {
        String str;
        EnumC920250a3T enumC920250a3T;
        C11PQ<List<EnumC920250a3T>> c11pq;
        EnumC920250a3T enumC920250a3T2;
        Iterator<C957020b0m> it2 = list.iterator();
        while (it2.hasNext()) {
            PosIdentity posIdentity = it2.next().getPosIdentity();
            if (posIdentity != null && (str = posIdentity.value) != null) {
                if (LJIIIIZZ(str)) {
                    if (LJIJJLI(str)) {
                        enumC920250a3T = EnumC920250a3T.CAN_ZOOM_TO_MIN;
                    } else {
                        enumC920250a3T = EnumC920250a3T.CAN_ZOOM_TO_MAX;
                    }
                } else {
                    enumC920250a3T = EnumC920250a3T.ZOOM_DISABLED;
                }
                if (enumC920250a3T != null) {
                    if (!this.LJ.contains(str)) {
                        ConcurrentHashMap<String, C937860aVs> concurrentHashMap = this.LJ;
                        C11PQ c11pq2 = new C11PQ();
                        if (LJIIIIZZ(str)) {
                            if (LJIJJLI(str)) {
                                enumC920250a3T2 = EnumC920250a3T.CAN_ZOOM_TO_MIN;
                            } else {
                                enumC920250a3T2 = EnumC920250a3T.CAN_ZOOM_TO_MAX;
                            }
                        } else {
                            enumC920250a3T2 = EnumC920250a3T.ZOOM_DISABLED;
                        }
                        if (enumC920250a3T2 != null) {
                            c11pq2.onNext(Collections.singletonList(enumC920250a3T2));
                        }
                        concurrentHashMap.put(str, new C937860aVs(c11pq2));
                    }
                    C937860aVs c937860aVs = this.LJ.get(str);
                    if (c937860aVs != null && (c11pq = c937860aVs.LIZ) != null) {
                        c11pq.onNext(Collections.singletonList(enumC920250a3T));
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC940760aaY
    public final void LJJIII(List<C957020b0m> list) {
        LJJ(list);
    }

    @Override // X.InterfaceC940760aaY
    public final void LJJIIJZLJL(C942080acg c942080acg) {
        List<C957020b0m> listLJIIIZ;
        if (LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue()) {
            listLJIIIZ = c942080acg.LIZ.LIZLLL;
        } else {
            listLJIIIZ = LJIIIZ();
        }
        LJJ(listLJIIIZ);
    }
}

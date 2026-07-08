package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ab.EcSearchAutoPlayConfig;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.lynx.core.ui.viewholder.DynamicViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import ttpobfuscated.fe;

/* JADX INFO: renamed from: X.0Pbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C648170Pbb implements InterfaceC648310Pbp, C0PCQ, InterfaceC648270Pbl, InterfaceC650540PfQ, InterfaceC1141530foN, InterfaceC648220Pbg {
    public final C648160Pba LL;
    public C648230Pbh LLILZ;
    public InterfaceC648270Pbl LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJI;
    public final List<C0CSE> LLILLJJLI = new CopyOnWriteArrayList();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 924));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 923));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 922));

    @Override // X.InterfaceC648310Pbp
    public final boolean K4() {
        return false;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        return true;
    }

    @Override // X.InterfaceC648220Pbg
    public final void LIZJ() {
    }

    @Override // X.InterfaceC648270Pbl
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    public final InterfaceC648070PbR LJ() {
        return (InterfaceC648070PbR) this.LLILZIL.getValue();
    }

    public final InterfaceC648270Pbl LJFF() {
        View view;
        Object obj = this.LLILZLL;
        if ((obj instanceof View) && (obj instanceof View) && (view = (View) obj) != null && view.getWindowVisibility() == 8) {
            LIZLLL(LJI().itemView);
        }
        this.LL.LJIIJ.LIZIZ(this.LLILZLL);
        return this.LLILZLL;
    }

    public final DynamicViewHolder LJI() {
        return (DynamicViewHolder) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        C1D66 c1d66LIZ;
        if (this.LLIZLLLIL) {
            LJ().LJJJLIIL();
        } else {
            C648300Pbo.LIZLLL(this);
        }
        if (!Intrinsics.LJFF(C651830PhV.LJFF(C647320PaE.LIZJ(this.LL)), Boolean.TRUE) || (c1d66LIZ = C647320PaE.LIZ(this.LL)) == null) {
            return;
        }
        c1d66LIZ.LIZLLL(EnumC648210Pbf.ON_PLAY_STOP, null);
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLIL() {
        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
        DynamicPatch dynamicPatchLIZIZ = C647320PaE.LIZIZ(this.LL);
        EcSearchAutoPlayConfig.EcSearchAutoPlayConfigModel ecSearchAutoPlayConfigModelLIZ = EcSearchAutoPlayConfig.LIZ();
        List<Integer> list = ecSearchAutoPlayConfigModelLIZ != null ? ecSearchAutoPlayConfigModelLIZ.originType : null;
        c649470Pdh.getClass();
        if (C649470Pdh.LJJIIJ(dynamicPatchLIZIZ, list) && C293730BfH.LIZ()) {
            C648230Pbh c648230Pbh = this.LLILZ;
            if (c648230Pbh == null || !c648230Pbh.LJ) {
                return;
            }
            AnonymousClass0956 anonymousClass0956 = c648230Pbh.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c648230Pbh.LIZLLL = null;
            c648230Pbh.LJFF();
            return;
        }
        InterfaceC648270Pbl interfaceC648270PblLJFF = LJFF();
        if (interfaceC648270PblLJFF != null) {
            if (!(interfaceC648270PblLJFF instanceof C661440Px0)) {
                interfaceC648270PblLJFF.LLLLLIL();
            } else if (C648050PbP.LIZ(C647320PaE.LIZJ(this.LL))) {
                ((C661440Px0) interfaceC648270PblLJFF).LJIJI();
            } else {
                ((C661440Px0) interfaceC648270PblLJFF).LJIJJLI(EnumC651030PgD.DO_NOTHING);
            }
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        if (this.LLJI) {
            return true;
        }
        if (this.LLIZLLLIL) {
            return LJ().N1();
        }
        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
        String strLIZJ = C647320PaE.LIZJ(this.LL);
        c649470Pdh.getClass();
        Boolean boolLJJIII = C649470Pdh.LJJIII(strLIZJ);
        return boolLJJIII != null ? boolLJJIII.booleanValue() : LIZLLL(LJI().itemView);
    }

    @Override // X.InterfaceC648220Pbg
    public final void bind() {
        String strLIZJ = C647320PaE.LIZJ(this.LL);
        this.LLJI = strLIZJ != null && a0.LJJIIZI(strLIZJ, "search_preserve_autoplay", false);
        View view = LJI().itemView;
        if (LIZLLL(view)) {
            if (LJFF() instanceof C658550PsL) {
                C653660PkS c653660PkSLIZ = this.LL.LIZLLL.LIZ();
                if (c653660PkSLIZ != null) {
                    c653660PkSLIZ.LJIIIZ = "live_cover";
                }
                ((C658550PsL) LJFF()).LJIJ(this.LL.LJFF.LIZ(), this.LL.LIZLLL.LIZ());
            }
            DynamicPatch dynamicPatchLIZIZ = C647320PaE.LIZIZ(this.LL);
            this.LLIZ = dynamicPatchLIZIZ != null && dynamicPatchLIZIZ.isAutoplay();
        } else {
            this.LLILZLL = null;
        }
        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
        DynamicPatch dynamicPatchLIZIZ2 = C647320PaE.LIZIZ(this.LL);
        EcSearchAutoPlayConfig.EcSearchAutoPlayConfigModel ecSearchAutoPlayConfigModelLIZ = EcSearchAutoPlayConfig.LIZ();
        List<Integer> list = ecSearchAutoPlayConfigModelLIZ != null ? ecSearchAutoPlayConfigModelLIZ.originType : null;
        c649470Pdh.getClass();
        if (C649470Pdh.LJJIIJ(dynamicPatchLIZIZ2, list) && C293730BfH.LIZ() && this.LLILZ == null) {
            C648230Pbh c648230Pbh = new C648230Pbh(view);
            this.LLILZ = c648230Pbh;
            c648230Pbh.LIZ();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return (C0PCQ) this.LLJ.getValue();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        if (this.LLIZLLLIL) {
            return LJ().isPlaying();
        }
        InterfaceC648270Pbl interfaceC648270PblLJFF = LJFF();
        if (interfaceC648270PblLJFF != null) {
            return interfaceC648270PblLJFF.isPlaying();
        }
        return false;
    }

    @Override // X.InterfaceC648310Pbp
    public final InterfaceC648720PcU n5() {
        return new C652600Pik();
    }

    @Override // X.InterfaceC648220Pbg
    public final void LIZ() {
        RecyclerView recyclerView;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558360qeg.LJIIL(LJI().itemView, null, 3);
        if (interfaceC665370Q7zLJIIL != null) {
            LJ().LLILLIZIL(interfaceC665370Q7zLJIIL);
        }
        EventBus.LIZLLL().LJIJJ(this);
        C1548820qPI.LIZLLL("js_event_ecom_card_chunk_response_event", this);
        if (Intrinsics.LJFF(C651830PhV.LJFF(C647320PaE.LIZJ(this.LL)), Boolean.TRUE)) {
            C1548820qPI.LIZLLL("card_play_completed", this);
            if (C0BQ9.LIZ()) {
                C1548820qPI.LIZLLL("modifySoundStatus", this);
            }
        }
        C648230Pbh c648230Pbh = this.LLILZ;
        if (c648230Pbh == null || (recyclerView = c648230Pbh.LIZIZ) == null) {
            return;
        }
        recyclerView.addOnScrollListener((AbstractC1585810rMx) c648230Pbh.LJFF.getValue());
    }

    @Override // X.InterfaceC648220Pbg
    public final void LIZIZ() {
        RecyclerView recyclerView;
        LJ().H1();
        EventBus.LIZLLL().LJJI(this);
        C1548820qPI.LJIIIIZZ("js_event_ecom_card_chunk_response_event", this);
        if (Intrinsics.LJFF(C651830PhV.LJFF(C647320PaE.LIZJ(this.LL)), Boolean.TRUE)) {
            C1548820qPI.LJIIIIZZ("card_play_completed", this);
            if (C0BQ9.LIZ()) {
                C1548820qPI.LJIIIIZZ("modifySoundStatus", this);
            }
        }
        C648230Pbh c648230Pbh = this.LLILZ;
        if (c648230Pbh != null && (recyclerView = c648230Pbh.LIZIZ) != null) {
            recyclerView.removeOnScrollListener((AbstractC1585810rMx) c648230Pbh.LJFF.getValue());
        }
        C648230Pbh c648230Pbh2 = this.LLILZ;
        if (c648230Pbh2 != null) {
            AnonymousClass0956 anonymousClass0956 = c648230Pbh2.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c648230Pbh2.LIZLLL = null;
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        View viewLJJIIJ;
        InterfaceC648270Pbl interfaceC648270PblLJFF = LJFF();
        return (interfaceC648270PblLJFF == null || (viewLJJIIJ = interfaceC648270PblLJFF.LJJIIJ()) == null) ? LJI().itemView : viewLJJIIJ;
    }

    @Override // X.C0PCQ
    public final double LLFZ() {
        if (!(LJFF() instanceof View)) {
            return 0.0d;
        }
        int[] iArr = new int[2];
        ((View) LJFF()).getLocationOnScreen(iArr);
        double dLJIIIIZZ = ((double) (C12ES.LJIIIIZZ(LJI().itemView.getContext()) - iArr[1])) / ((double) ((View) LJFF()).getHeight());
        if (dLJIIIIZZ > 1.0d) {
            return 1.0d;
        }
        return dLJIIIIZZ;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLJJJ() {
        if (C293730BfH.LIZ()) {
            C649470Pdh c649470Pdh = C649470Pdh.LIZ;
            DynamicPatch dynamicPatchLIZIZ = C647320PaE.LIZIZ(this.LL);
            EcSearchAutoPlayConfig.EcSearchAutoPlayConfigModel ecSearchAutoPlayConfigModelLIZ = EcSearchAutoPlayConfig.LIZ();
            List<Integer> list = ecSearchAutoPlayConfigModelLIZ != null ? ecSearchAutoPlayConfigModelLIZ.originType : null;
            c649470Pdh.getClass();
            if (C649470Pdh.LJJIIJ(dynamicPatchLIZIZ, list)) {
                C648230Pbh c648230Pbh = this.LLILZ;
                if (c648230Pbh != null) {
                    c648230Pbh.LJ = true;
                    c648230Pbh.LJ();
                    ((CopyOnWriteArrayList) c648230Pbh.LIZJ).clear();
                    return;
                }
                return;
            }
        }
        InterfaceC648270Pbl interfaceC648270PblLJFF = LJFF();
        if (interfaceC648270PblLJFF != null) {
            if (interfaceC648270PblLJFF instanceof C661440Px0) {
                ((C661440Px0) interfaceC648270PblLJFF).LJIIZILJ();
            } else {
                interfaceC648270PblLJFF.LLJJJ();
            }
        }
    }

    @Override // X.InterfaceC648310Pbp
    public final InterfaceC648720PcU LLL() {
        return C648300Pbo.LIZ(this);
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
        InterfaceC648270Pbl interfaceC648270PblLJFF = LJFF();
        if (interfaceC648270PblLJFF != null) {
            interfaceC648270PblLJFF.LLLLLILLIL();
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void O4() {
        InterfaceC648270Pbl interfaceC648270PblLJFF = LJFF();
        if (interfaceC648270PblLJFF != null) {
            interfaceC648270PblLJFF.O4();
        }
    }

    @Override // X.InterfaceC648310Pbp
    public final View d5() {
        return LJI().itemView;
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        return C655580PnY.LIZIZ(this);
    }

    @Override // X.InterfaceC648310Pbp
    public final int y1() {
        return hashCode();
    }

    @Override // X.C0PCQ
    public final boolean R1() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC650540PfQ
    public final boolean mm() {
        return this.LLJI;
    }

    public C648170Pbb(C648160Pba c648160Pba) {
        this.LL = c648160Pba;
    }

    public final boolean LIZLLL(View view) {
        String strLIZJ = C647320PaE.LIZJ(this.LL);
        if (strLIZJ != null && a0.LJJIIZI(strLIZJ, "skip_find_auto_play_view=1", false)) {
            return false;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(view);
        while (!arrayDeque.isEmpty()) {
            View view2 = (View) arrayDeque.getFirst();
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    if (viewGroup.getChildAt(i).getVisibility() == 0) {
                        if (viewGroup.getChildAt(i) instanceof C658550PsL) {
                            this.LLILZLL = (C658550PsL) viewGroup.getChildAt(i);
                            return true;
                        }
                        if (viewGroup.getChildAt(i) instanceof C661440Px0) {
                            this.LLILZLL = (C661440Px0) viewGroup.getChildAt(i);
                            return true;
                        }
                        if (Intrinsics.LJFF(viewGroup.getChildAt(i).getTag(R.id.p7s), Unit.LIZ)) {
                            this.LLIZLLLIL = true;
                            return true;
                        }
                        arrayDeque.addLast(viewGroup.getChildAt(i));
                    }
                }
            }
            arrayDeque.pollFirst();
        }
        return false;
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
        if (Intrinsics.LJFF(C651830PhV.LJFF(C647320PaE.LIZJ(this.LL)), Boolean.TRUE)) {
            ((CopyOnWriteArrayList) this.LLILLJJLI).add(c650630PfZ);
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        Object c098200Yq;
        JSONObject jSONObjectLIZIZ;
        String str;
        String strOptString;
        SparkContext sparkContext;
        String str2 = c262100zr.LIZ;
        if (Intrinsics.LJFF(str2, "js_event_ecom_card_chunk_response_event")) {
            C648230Pbh c648230Pbh = this.LLILZ;
            if (c648230Pbh != null) {
                c648230Pbh.LIZIZ(LJI().itemView);
                return;
            }
            return;
        }
        Object obj = null;
        if (Intrinsics.LJFF(str2, "card_play_completed")) {
            if (!Intrinsics.LJFF(C651830PhV.LJFF(C647320PaE.LIZJ(this.LL)), Boolean.TRUE)) {
                return;
            }
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                C1872780ypo.LIZ.getClass();
                jSONObjectLIZIZ = C1872780ypo.LIZIZ(interfaceC1107590evd2);
            } else {
                jSONObjectLIZIZ = null;
            }
            C1D66 c1d66LIZ = C647320PaE.LIZ(this.LL);
            if (c1d66LIZ != null && (sparkContext = c1d66LIZ.LJFF) != null) {
                str = sparkContext.containerId;
            } else {
                str = null;
            }
            if (jSONObjectLIZIZ != null) {
                strOptString = jSONObjectLIZIZ.optString("containerId");
            } else {
                strOptString = null;
            }
            if (str == null || str.length() == 0 || strOptString == null || strOptString.length() == 0 || !Intrinsics.LJFF(str, strOptString)) {
                return;
            }
            C1D66 c1d66LIZ2 = C647320PaE.LIZ(this.LL);
            if (c1d66LIZ2 != null) {
                c1d66LIZ2.LIZLLL(EnumC648210Pbf.ON_PLAY_COMPLETE, null);
            }
            Iterator it2 = ((CopyOnWriteArrayList) this.LLILLJJLI).iterator();
            while (it2.hasNext()) {
                ((C0CSE) it2.next()).LJJLIIIJ();
            }
            return;
        }
        if (!Intrinsics.LJFF(str2, "modifySoundStatus") || !C0BQ9.LIZ() || (interfaceC1107590evd = c262100zr.LIZIZ) == null) {
            return;
        }
        C1872780ypo.LIZ.getClass();
        try {
            c098200Yq = Boolean.valueOf(JSONObjectProtectorUtils.getBoolean(C1872780ypo.LIZIZ(interfaceC1107590evd), "muted"));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        boolean zBooleanValue = bool.booleanValue();
        C659080PtC.LIZJ(zBooleanValue ? 1 : 0);
        if (zBooleanValue) {
            return;
        }
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        if (!c2174741A9g.LJIILJJIL()) {
            return;
        }
        C659080PtC.LIZ = false;
        c2174741A9g.LJIILL("general_search", EnumC655500PnQ.CLICK_UNMUTE_BUTTON, C0SVP.STYLE_NO_BUTTON);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSearchMediaViewCreateEvent(C20534082q c20534082q) {
        if (LJFF() == null) {
            Map<String, Object> mapLIZ = this.LL.LJ.LIZ();
            boolean z = true;
            if (mapLIZ != null) {
                int i = c20534082q.LIZ;
                Object obj = mapLIZ.get(fe.e);
                if ((obj instanceof Integer) && i == ((Number) obj).intValue()) {
                    if (LIZLLL(LJI().itemView)) {
                        if (LJFF() instanceof C658550PsL) {
                            C653660PkS c653660PkSLIZ = this.LL.LIZLLL.LIZ();
                            if (c653660PkSLIZ != null) {
                                c653660PkSLIZ.LJIIIZ = "live_cover";
                            }
                            ((C658550PsL) LJFF()).LJIJ(this.LL.LJFF.LIZ(), this.LL.LIZLLL.LIZ());
                        }
                        DynamicPatch dynamicPatchLIZIZ = C647320PaE.LIZIZ(this.LL);
                        if (dynamicPatchLIZIZ == null || !dynamicPatchLIZIZ.isAutoplay()) {
                            z = false;
                        }
                        this.LLIZ = z;
                        return;
                    }
                    this.LLILZLL = null;
                }
            }
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
        if (Intrinsics.LJFF(C651830PhV.LJFF(C647320PaE.LIZJ(this.LL)), Boolean.TRUE)) {
            ((CopyOnWriteArrayList) this.LLILLJJLI).add(c650630PfZ);
        }
    }

    @Override // X.InterfaceC648310Pbp
    public final void LJJLL(Aweme aweme, C0PBW c0pbw) {
        C648300Pbo.LIZIZ(this, aweme, c0pbw);
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        C1D66 c1d66LIZ;
        if (this.LLIZLLLIL) {
            LJ().W0(150L, null);
        } else {
            C648300Pbo.LJ(this, j);
        }
        if (Intrinsics.LJFF(C651830PhV.LJFF(C647320PaE.LIZJ(this.LL)), Boolean.TRUE) && (c1d66LIZ = C647320PaE.LIZ(this.LL)) != null) {
            c1d66LIZ.LIZLLL(EnumC648210Pbf.ON_PLAY_START, null);
        }
    }
}

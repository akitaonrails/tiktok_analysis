package X;

import Y.AObserverS214S0100000_10;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.ab.EcSearchAutoPlayConfig;
import com.ss.android.ugc.aweme.ab.general.ECGeneralSearchCardConfig;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.delegate.LifecycleDelegate;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PbN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewOnAttachStateChangeListenerC648030PbN extends RecyclerView.ViewHolder implements C0PTJ, C0PUC, InterfaceC648130PbX, InterfaceC650540PfQ, InterfaceC639340P5w, View.OnAttachStateChangeListener, InterfaceC648310Pbp, C0PCQ, InterfaceC648090PbT, InterfaceC1141530foN, InterfaceC661780PxY {
    public static long LLJJLIIIJLLLLLLLZ = -1;
    public static long LLJL = -1;
    public static long LLJLIL = -1;
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public final C01GW LL;
    public int LLILLJJLI;
    public C647830Pb3 LLILLL;
    public final C01GW LLILZ;
    public boolean LLILZIL;
    public InterfaceC648720PcU LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public Integer LLJ;
    public C653660PkS LLJI;
    public WeakReference<InterfaceC641090PCp> LLJIJIL;
    public C648230Pbh LLJILJIL;
    public WeakReference<DynamicPatch> LLJILJILJ;
    public InterfaceC648270Pbl LLJILLL;
    public InterfaceC648270Pbl LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public long LLJJIJIL;
    public String LLJJJ;
    public final C01GW LLJJJIL;
    public final AObserverS214S0100000_10 LLJJJJ;
    public final ViewOnAttachStateChangeListenerC648030PbN LLJJJJJIL;
    public C0PU6 LLJJJJLIIL;
    public Function0<Unit> LLJJL;

    @Override // X.C0PUC
    public final SearchResultParam I() {
        return null;
    }

    @Override // X.C0PT8
    public final void I2(ISearchContextAbility iSearchContextAbility) {
    }

    @Override // X.InterfaceC648270Pbl
    public final void LJJJJ() {
    }

    @Override // X.InterfaceC648130PbX
    public final C0PUC LJJZZI() {
        return this;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        return true;
    }

    @Override // X.C0PUC
    public final void LLLLLZ() {
    }

    @Override // X.C0PUC
    public final void LLZZ() {
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        return null;
    }

    @Override // X.C0PUC
    public final int k2() {
        return -1;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        return true;
    }

    @Override // X.C0PUC
    public final void n4(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        return null;
    }

    @Override // X.InterfaceC648310Pbp
    public final boolean K4() {
        if (this.LLJJI) {
            return false;
        }
        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
        String str = this.LLJJJ;
        c649470Pdh.getClass();
        if (Intrinsics.LJFF(C649470Pdh.LJJIII(str), Boolean.TRUE)) {
            return true;
        }
        String str2 = this.LLJJJ;
        if (str2 == null) {
            str2 = "";
        }
        String strLIZ = C647540Paa.LIZ(str2);
        for (String str3 : new String[]{"hotspot", "activity-video", "official-video", "trending-place"}) {
            if (Intrinsics.LJFF(str3, strLIZ)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() throws JSONException {
        if (!this.LLJJIJI) {
            if (this.LLJJI) {
                S5().LJJJLIIL();
                return;
            } else {
                C648300Pbo.LIZLLL(this);
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("play_status", 0);
        jSONObject.put("card_offset", C679280Qkg.LIZIZ(Integer.valueOf(this.itemView.getTop())));
        C645710PUj c645710PUjR5 = R5();
        if (c645710PUjR5 != null) {
            c645710PUjR5.LL.LIZ("card_should_play", jSONObject);
        }
        InterfaceC648270Pbl interfaceC648270Pbl = this.LLJJ;
        if (interfaceC648270Pbl != null) {
            interfaceC648270Pbl.LJJJLIIL();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
        if (!this.LLJJIJI) {
            if (this.LLJJI) {
                S5().LJJLIIIJLLLLLLLZ();
                return;
            }
            InterfaceC648270Pbl interfaceC648270PblT5 = T5();
            if (interfaceC648270PblT5 != null) {
                interfaceC648270PblT5.LJJLIIIJLLLLLLLZ();
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releasePlayer currentPlayingLynxView=");
        InterfaceC648270Pbl interfaceC648270Pbl = this.LLJJ;
        sbLIZ.append(interfaceC648270Pbl != null ? interfaceC648270Pbl.hashCode() : 0);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC648270Pbl interfaceC648270Pbl2 = this.LLJJ;
        if (interfaceC648270Pbl2 != null) {
            interfaceC648270Pbl2.LJJLIIIJLLLLLLLZ();
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLJJJ() {
        if (this.LLJJIJI) {
            return;
        }
        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
        WeakReference<DynamicPatch> weakReference = this.LLJILJILJ;
        DynamicPatch dynamicPatch = weakReference != null ? weakReference.get() : null;
        EcSearchAutoPlayConfig.EcSearchAutoPlayConfigModel ecSearchAutoPlayConfigModelLIZ = EcSearchAutoPlayConfig.LIZ();
        List<Integer> list = ecSearchAutoPlayConfigModelLIZ != null ? ecSearchAutoPlayConfigModelLIZ.originType : null;
        c649470Pdh.getClass();
        if (C649470Pdh.LJJIIJ(dynamicPatch, list) && C293730BfH.LIZ()) {
            C648230Pbh c648230Pbh = this.LLJILJIL;
            if (c648230Pbh != null) {
                c648230Pbh.LJ = true;
                c648230Pbh.LJ();
                ((CopyOnWriteArrayList) c648230Pbh.LIZJ).clear();
                return;
            }
            return;
        }
        InterfaceC648270Pbl interfaceC648270PblT5 = T5();
        if (interfaceC648270PblT5 != null) {
            if (interfaceC648270PblT5 instanceof C661440Px0) {
                ((C661440Px0) interfaceC648270PblT5).LJIIZILJ();
            } else {
                interfaceC648270PblT5.LLJJJ();
            }
        }
    }

    @Override // X.InterfaceC648310Pbp
    public final InterfaceC648720PcU LLL() {
        InterfaceC648720PcU interfaceC648720PcU = this.LLILZLL;
        return interfaceC648720PcU == null ? C648300Pbo.LIZ(this) : interfaceC648720PcU;
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLIL() {
        DynamicPatch dynamicPatch;
        if (this.LLJJIJI) {
            return;
        }
        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
        WeakReference<DynamicPatch> weakReference = this.LLJILJILJ;
        String str = null;
        DynamicPatch dynamicPatch2 = weakReference != null ? weakReference.get() : null;
        EcSearchAutoPlayConfig.EcSearchAutoPlayConfigModel ecSearchAutoPlayConfigModelLIZ = EcSearchAutoPlayConfig.LIZ();
        List<Integer> list = ecSearchAutoPlayConfigModelLIZ != null ? ecSearchAutoPlayConfigModelLIZ.originType : null;
        c649470Pdh.getClass();
        if (C649470Pdh.LJJIIJ(dynamicPatch2, list) && C293730BfH.LIZ()) {
            C648230Pbh c648230Pbh = this.LLJILJIL;
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
        InterfaceC648270Pbl interfaceC648270PblT5 = T5();
        if (interfaceC648270PblT5 != null) {
            if (!(interfaceC648270PblT5 instanceof C661440Px0)) {
                interfaceC648270PblT5.LLLLLIL();
                return;
            }
            WeakReference<DynamicPatch> weakReference2 = this.LLJILJILJ;
            if (weakReference2 != null && (dynamicPatch = weakReference2.get()) != null) {
                str = dynamicPatch.schema;
            }
            if (C648050PbP.LIZ(str)) {
                ((C661440Px0) interfaceC648270PblT5).LJIJI();
            } else {
                ((C661440Px0) interfaceC648270PblT5).LJIJJLI(EnumC651030PgD.DO_NOTHING);
            }
        }
    }

    public final C647830Pb3 P5() {
        C647830Pb3 c647830Pb3 = this.LLILLL;
        if (c647830Pb3 != null) {
            return c647830Pb3;
        }
        return null;
    }

    public final C645710PUj R5() {
        return (C645710PUj) this.LLILZ.getValue();
    }

    public final InterfaceC648070PbR S5() {
        return (InterfaceC648070PbR) this.LL.getValue();
    }

    public final InterfaceC648270Pbl T5() {
        Object obj = this.LLJILLL;
        if ((obj instanceof View) && ((View) obj).getWindowVisibility() == 8) {
            N5(this.itemView);
        }
        return this.LLJILLL;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        if (!this.LLJJIJI) {
            if (this.LLJJI) {
                return S5().isPlaying();
            }
            InterfaceC648270Pbl interfaceC648270PblT5 = T5();
            if (interfaceC648270PblT5 != null) {
                return interfaceC648270PblT5.isPlaying();
            }
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPlaying=");
        InterfaceC648270Pbl interfaceC648270Pbl = this.LLJJ;
        sbLIZ.append(interfaceC648270Pbl != null ? interfaceC648270Pbl.isPlaying() : false);
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC648270Pbl interfaceC648270Pbl2 = this.LLJJ;
        if (interfaceC648270Pbl2 != null) {
            return interfaceC648270Pbl2.isPlaying();
        }
        return false;
    }

    @Override // X.C0PT8
    public final C653660PkS l3() {
        C653660PkS c653660PkS = this.LLJI;
        return c653660PkS == null ? new C653660PkS() : c653660PkS;
    }

    @Override // X.InterfaceC648310Pbp
    public final InterfaceC648720PcU n5() {
        InterfaceC648720PcU interfaceC648720PcU = this.LLILZLL;
        return interfaceC648720PcU == null ? new C652600Pik() : interfaceC648720PcU;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        if (C301440Bri.LIZ()) {
            return this.LLJJIII;
        }
        return true;
    }

    @Override // X.C0PUC
    public final Aweme LJIIIIZZ() {
        C647830Pb3 c647830Pb3;
        DynamicPatch dynamicPatch;
        List<Aweme> awemeList;
        Aweme aweme;
        C645710PUj c645710PUjR5 = R5();
        if (c645710PUjR5 == null || (c647830Pb3 = c645710PUjR5.LL) == null || (dynamicPatch = c647830Pb3.LJIIIIZZ) == null || (!(dynamicPatch.getOriginType() == 8 || dynamicPatch.getOriginType() == 20 || dynamicPatch.getOriginType() == 33) || (awemeList = dynamicPatch.getAwemeList()) == null || (aweme = (Aweme) C13LP.LJJJLL(awemeList)) == null)) {
            return null;
        }
        return aweme;
    }

    @Override // X.InterfaceC648270Pbl
    public final View LJJIIJ() {
        View viewLJJIIJ;
        InterfaceC648270Pbl interfaceC648270PblT5 = T5();
        return (interfaceC648270PblT5 == null || (viewLJJIIJ = interfaceC648270PblT5.LJJIIJ()) == null) ? this.itemView : viewLJJIIJ;
    }

    @Override // X.C0PCQ
    public final double LLFZ() {
        if (!(T5() instanceof View)) {
            return 0.0d;
        }
        int[] iArr = new int[2];
        ((View) T5()).getLocationOnScreen(iArr);
        double dLJIIIIZZ = ((double) (C12ES.LJIIIIZZ(this.itemView.getContext()) - iArr[1])) / ((double) ((View) T5()).getHeight());
        if (dLJIIIIZZ > 1.0d) {
            return 1.0d;
        }
        return dLJIIIIZZ;
    }

    @Override // X.C0PTJ
    public final void LLIILZL() throws JSONException {
        Taco tacoLIZ;
        C645710PUj c645710PUjR5 = R5();
        if (c645710PUjR5 != null) {
            LynxView lynxView = c645710PUjR5.LL.LJ;
            if (lynxView != null) {
                lynxView.onEnterBackground();
            }
            LifecycleDelegate lifecycleDelegate = c645710PUjR5.LLILLL;
            lifecycleDelegate.getClass();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "recycled");
            lifecycleDelegate.LJII("pageScroll", jSONObject);
        }
        if (!K4() || (tacoLIZ = C0PCE.LIZ(this.itemView, false)) == null) {
            return;
        }
        InterfaceC648720PcU interfaceC648720PcU = (InterfaceC648720PcU) ((SparseArray) tacoLIZ.LLIZLLLIL.getValue()).get(hashCode());
        if (interfaceC648720PcU != null) {
            interfaceC648720PcU.LIZ();
        }
    }

    @Override // X.InterfaceC648270Pbl
    public final void LLLLLILLIL() {
        InterfaceC648270Pbl interfaceC648270PblT5 = T5();
        if (interfaceC648270PblT5 != null) {
            interfaceC648270PblT5.LLLLLILLIL();
        }
    }

    @Override // X.InterfaceC648130PbX
    public final InterfaceC648270Pbl LLLLLLLZIL() {
        return T5();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        if (C643360PLi.LIZ()) {
            return false;
        }
        if (this.LLJJIJI) {
            return true;
        }
        if (this.LLILZIL) {
            N5(this.itemView);
            return true;
        }
        if (this.LLJJI) {
            return S5().N1();
        }
        C649470Pdh c649470Pdh = C649470Pdh.LIZ;
        String str = this.LLJJJ;
        c649470Pdh.getClass();
        Boolean boolLJJIII = C649470Pdh.LJJIII(str);
        return boolLJJIII != null ? boolLJJIII.booleanValue() : N5(this.itemView);
    }

    @Override // X.InterfaceC648270Pbl
    public final void O4() {
        InterfaceC648270Pbl interfaceC648270PblT5 = T5();
        if (interfaceC648270PblT5 != null) {
            interfaceC648270PblT5.O4();
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        return C655580PnY.LIZ(this);
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return C659230PtR.LIZIZ(this);
    }

    @Override // X.C0PUC
    public final int getViewType() {
        return T5() == null ? 8 : 62;
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

    @Override // X.C0PUC
    public final boolean LIZLLL() {
        return this.LLIZLLLIL;
    }

    @Override // X.C0PUC
    public final boolean LLLZZIL() {
        return this.LLIZ;
    }

    @Override // X.C0PCQ
    public final boolean R1() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC661780PxY
    public final boolean c0() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC648310Pbp
    public final View d5() {
        return this.itemView;
    }

    @Override // X.C0PUC
    public final View getItemView() {
        return this.itemView;
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC650540PfQ
    public final boolean mm() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC648090PbT
    public final void LJLLLL(AwS554S0100000_10 awS554S0100000_10) {
        this.LLJJL = awS554S0100000_10;
    }

    @Override // X.C0PT8
    public final void LLLIL(C653660PkS c653660PkS) {
        this.LLJI = c653660PkS;
        String str = c653660PkS.LJFF;
        if (!TextUtils.isEmpty(str)) {
            this.itemView.setTag(this.LLJI);
            P5().LJIILIIL = str;
        }
    }

    @Override // X.C0PUC
    public final void LLLILZLLLI(int i) {
        this.LLJ = Integer.valueOf(i);
    }

    @Override // X.InterfaceC639340P5w
    public final void LLLIZZ(boolean z) {
        U5(z);
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) throws JSONException {
        if (this.LLJJIJI) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("play_status", 1);
            jSONObject.put("card_offset", C679280Qkg.LIZIZ(Integer.valueOf(this.itemView.getTop())));
            EnumC587050N0t enumC587050N0t = c587060N0u.LIZ;
            if (enumC587050N0t != EnumC587050N0t.SCROLL_TO_BOTTOM && enumC587050N0t != EnumC587050N0t.SCROLL_TO_TOP) {
                jSONObject.put("type", "didAppear");
            } else {
                jSONObject.put("type", "scroll");
            }
            C645710PUj c645710PUjR5 = R5();
            if (c645710PUjR5 != null) {
                c645710PUjR5.LL.LIZ("card_should_play", jSONObject);
            }
        }
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
        C659230PtR.LIZJ(this, c650630PfZ);
    }

    public final boolean N5(View view) {
        String str = this.LLJJJ;
        if (str != null && a0.LJJIIZI(str, "skip_find_auto_play_view=1", false)) {
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
                            this.LLJILLL = (C658550PsL) viewGroup.getChildAt(i);
                            return true;
                        }
                        if (viewGroup.getChildAt(i) instanceof C661440Px0) {
                            this.LLJILLL = (C661440Px0) viewGroup.getChildAt(i);
                            return true;
                        }
                        if (Intrinsics.LJFF(viewGroup.getChildAt(i).getTag(R.id.p7s), Unit.LIZ)) {
                            this.LLJJI = true;
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

    public final void U5(boolean z) {
        C659720PuE.LIZ.getClass();
        if (C659720PuE.LIZ()) {
            return;
        }
        int iLIZ = (int) C418040GaI.LIZ(4);
        if (z) {
            this.itemView.setPadding(iLIZ, iLIZ, iLIZ / 2, 0);
        } else {
            this.itemView.setPadding(iLIZ / 2, iLIZ, iLIZ, 0);
        }
    }

    public final void V5(InterfaceC648720PcU interfaceC648720PcU) {
        this.LLILZLL = interfaceC648720PcU;
        C653830Pkj.LIZ(this.itemView, new C652630Pin(interfaceC648720PcU, this));
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C648230Pbh c648230Pbh;
        if (Intrinsics.LJFF(c262100zr.LIZ, "js_event_ecom_card_chunk_response_event") && (c648230Pbh = this.LLJILJIL) != null) {
            c648230Pbh.LIZIZ(this.itemView);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSearchMediaViewCreateEvent(C20534082q c20534082q) {
        int i;
        boolean zIsAutoplay;
        DynamicPatch dynamicPatch;
        if (T5() != null) {
            return;
        }
        C645710PUj c645710PUjR5 = R5();
        if (c645710PUjR5 != null) {
            i = c645710PUjR5.LLILZ.LLIZ;
        } else {
            i = -1;
        }
        if (c20534082q.LIZ != i) {
            String str = this.LLJJJ;
            if (str == null) {
                str = "";
            }
            if (!C1903607cw.LIZ(str)) {
                return;
            }
        }
        InterfaceC641090PCp interfaceC641090PCp = null;
        if (N5(this.itemView)) {
            if (T5() instanceof C658550PsL) {
                C653660PkS c653660PkS = this.LLJI;
                if (c653660PkS != null) {
                    c653660PkS.LJIIIZ = "live_cover";
                }
                C658550PsL c658550PsL = (C658550PsL) T5();
                WeakReference<InterfaceC641090PCp> weakReference = this.LLJIJIL;
                if (weakReference != null) {
                    interfaceC641090PCp = weakReference.get();
                }
                c658550PsL.LJIJ(interfaceC641090PCp, this.LLJI);
            }
            WeakReference<DynamicPatch> weakReference2 = this.LLJILJILJ;
            if (weakReference2 != null && (dynamicPatch = weakReference2.get()) != null) {
                zIsAutoplay = dynamicPatch.isAutoplay();
            } else {
                zIsAutoplay = false;
            }
            this.LLJJIJIIJIL = zIsAutoplay;
            return;
        }
        this.LLJILLL = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) throws JSONException {
        List<AbstractC648060PbQ> list;
        SearchRefreshPredictMobCanShowVM searchRefreshPredictMobCanShowVM;
        MutableLiveData mutableLiveData;
        RecyclerView recyclerView;
        DynamicPatch dynamicPatch;
        List<Aweme> awemeList;
        Aweme aweme;
        C645710PUj c645710PUjR5;
        C647830Pb3 c647830Pb3;
        this.LLJJIJIL = System.currentTimeMillis();
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558360qeg.LJIIL(this.itemView, null, 3);
        if (interfaceC665370Q7zLJIIL != null) {
            S5().LLILLIZIL(interfaceC665370Q7zLJIIL);
        }
        this.LLIZLLLIL = true;
        EventBus.LIZLLL().LJIJJ(this);
        C1548820qPI.LIZLLL("js_event_ecom_card_chunk_response_event", this);
        C645710PUj c645710PUjR52 = R5();
        if (c645710PUjR52 != null && (list = c645710PUjR52.LLILLJJLI) != null) {
            Iterator<AbstractC648060PbQ> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJFF();
            }
            WeakReference<DynamicPatch> weakReference = this.LLJILJILJ;
            if (weakReference != null && (dynamicPatch = weakReference.get()) != null && (awemeList = dynamicPatch.getAwemeList()) != null && (aweme = (Aweme) C13LP.LJJJLZIJ(getAdapterPosition(), awemeList)) != null && (c645710PUjR5 = R5()) != null && (c647830Pb3 = c645710PUjR5.LL) != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("aid", aweme.getAid());
                jSONObject.put("dig_status", aweme.getUserDigg());
                c647830Pb3.LIZ("changeDiggState", jSONObject);
            }
            C648230Pbh c648230Pbh = this.LLJILJIL;
            if (c648230Pbh != null && (recyclerView = c648230Pbh.LIZIZ) != null) {
                recyclerView.addOnScrollListener((AbstractC1585810rMx) c648230Pbh.LJFF.getValue());
            }
            Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
            if (fragmentLIZ != null && (searchRefreshPredictMobCanShowVM = (SearchRefreshPredictMobCanShowVM) this.LLJJJIL.getValue()) != null && (mutableLiveData = searchRefreshPredictMobCanShowVM.LLILLJJLI) != null) {
                mutableLiveData.observe(fragmentLIZ, this.LLJJJJ);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        List<AbstractC648060PbQ> list;
        SearchRefreshPredictMobCanShowVM searchRefreshPredictMobCanShowVM;
        MutableLiveData mutableLiveData;
        C648260Pbk c648260Pbk;
        RecyclerView recyclerView;
        C647830Pb3 c647830Pb3;
        DynamicPatch dynamicPatch;
        boolean z;
        String str;
        List<String> list2;
        S5().H1();
        Long lValueOf = Long.valueOf(this.LLJJIJIL);
        if (!C08A4.LIZIZ(Long.valueOf(lValueOf.longValue()))) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            C645710PUj c645710PUjR5 = R5();
            if (c645710PUjR5 != null && (c647830Pb3 = c645710PUjR5.LL) != null && (dynamicPatch = c647830Pb3.LJIIIIZZ) != null) {
                C0P6M c0p6m = C0P6M.LIZ;
                boolean z2 = c647830Pb3.LJIJ;
                c0p6m.getClass();
                if (!C1205904nh.LIZ()) {
                    Integer numValueOf = Integer.valueOf(dynamicPatch.getOriginType());
                    String str2 = dynamicPatch.schema;
                    ECGeneralSearchCardConfig eCGeneralSearchCardConfig = C0CA0.LIZ;
                    if (str2 != null && (list2 = ((ECGeneralSearchCardConfig) C0CA0.LIZIZ.getValue()).channelList) != null) {
                        z = false;
                        for (String str3 : list2) {
                            if (str3 != null && a0.LJJIIZI(str2, str3, false)) {
                                z = true;
                            }
                        }
                    } else {
                        z = false;
                    }
                    List<Integer> list3 = ((ECGeneralSearchCardConfig) C0CA0.LIZIZ.getValue()).originTypeList;
                    if ((list3 != null && list3.contains(numValueOf)) || z) {
                        try {
                            C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                            Pair[] pairArr = new Pair[5];
                            pairArr[0] = new Pair("page_name", "general_search");
                            pairArr[1] = new Pair("search_id", ((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LLILLL);
                            String string = Integer.valueOf(dynamicPatch.getOriginType()).toString();
                            if (string == null) {
                                string = "";
                            }
                            pairArr[2] = new Pair("origin_type", string);
                            pairArr[3] = new Pair("duration", String.valueOf(System.currentTimeMillis() - jLongValue));
                            if (z2) {
                                str = "1";
                            } else {
                                str = CardStruct.IStatusCode.DEFAULT;
                            }
                            pairArr[4] = new Pair("render_status", str);
                            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                            c1507790pL7.getClass();
                            C1507790pL7.LIZJ("rd_tiktokec_search_result_show", mapLJIIJ);
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                }
            }
            this.LLJJIJIL = 0L;
        }
        this.LLIZLLLIL = false;
        this.LLIZ = false;
        EventBus.LIZLLL().LJJI(this);
        C1548820qPI.LJIIIIZZ("js_event_ecom_card_chunk_response_event", this);
        C645710PUj c645710PUjR52 = R5();
        if (c645710PUjR52 != null && (list = c645710PUjR52.LLILLJJLI) != null) {
            Iterator<AbstractC648060PbQ> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LJI();
            }
            C648230Pbh c648230Pbh = this.LLJILJIL;
            if (c648230Pbh != null && (recyclerView = c648230Pbh.LIZIZ) != null) {
                recyclerView.removeOnScrollListener((AbstractC1585810rMx) c648230Pbh.LJFF.getValue());
            }
            InterfaceC648720PcU interfaceC648720PcU = this.LLILZLL;
            if ((interfaceC648720PcU instanceof C648260Pbk) && (c648260Pbk = (C648260Pbk) interfaceC648720PcU) != null) {
                AnonymousClass0956 anonymousClass0956 = c648260Pbk.LJIILL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c648260Pbk.LJIILL = null;
                c648260Pbk.LJIILJJIL.clear();
            }
            C648230Pbh c648230Pbh2 = this.LLJILJIL;
            if (c648230Pbh2 != null) {
                AnonymousClass0956 anonymousClass09562 = c648230Pbh2.LIZLLL;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
                c648230Pbh2.LIZLLL = null;
            }
            if (C946803n0.LIZ(this.itemView) != null && (searchRefreshPredictMobCanShowVM = (SearchRefreshPredictMobCanShowVM) this.LLJJJIL.getValue()) != null && (mutableLiveData = searchRefreshPredictMobCanShowVM.LLILLJJLI) != null) {
                mutableLiveData.removeObserver(this.LLJJJJ);
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
        C647830Pb3 c647830Pb3;
        LynxView lynxView;
        s lynxContext;
        C645710PUj c645710PUjR5 = R5();
        if (c645710PUjR5 != null && (c647830Pb3 = c645710PUjR5.LL) != null && (lynxView = c647830Pb3.LJ) != null && (lynxContext = lynxView.getLynxContext()) != null) {
            C0DYC.LIZIZ(lynxContext, "play_metrics", c664400Q4g);
        }
    }

    @Override // X.InterfaceC661780PxY
    public final void w3(InterfaceC648270Pbl interfaceC648270Pbl) {
        this.LLJJ = interfaceC648270Pbl;
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
        C659230PtR.LIZ(this, c650630PfZ);
    }

    @Override // X.InterfaceC648310Pbp
    public final void LJJLL(Aweme aweme, C0PBW c0pbw) {
        C648300Pbo.LIZIZ(this, aweme, c0pbw);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    @Override // X.InterfaceC648350Pbt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W0(long r6, X.C587060N0u r8) throws org.json.JSONException {
        /*
            r5 = this;
            boolean r0 = r5.LLJJIJI
            r3 = 0
            if (r0 == 0) goto L50
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r1 = "play_status"
            r0 = 1
            r4.put(r1, r0)
            android.view.View r0 = r5.itemView
            int r0 = r0.getTop()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = X.C679280Qkg.LIZIZ(r0)
            java.lang.String r0 = "card_offset"
            r4.put(r0, r1)
            if (r8 == 0) goto L4e
            X.0N0t r2 = r8.LIZ
        L27:
            X.0N0t r0 = X.EnumC587050N0t.SCROLL_TO_BOTTOM
            java.lang.String r1 = "type"
            if (r2 == r0) goto L48
            if (r8 == 0) goto L31
            X.0N0t r3 = r8.LIZ
        L31:
            X.0N0t r0 = X.EnumC587050N0t.SCROLL_TO_TOP
            if (r3 == r0) goto L48
            java.lang.String r0 = "didAppear"
            r4.put(r1, r0)
        L3a:
            X.0PUj r0 = r5.R5()
            if (r0 == 0) goto L47
            X.0Pb3 r1 = r0.LL
            java.lang.String r0 = "card_should_play"
            r1.LIZ(r0, r4)
        L47:
            return
        L48:
            java.lang.String r0 = "scroll"
            r4.put(r1, r0)
            goto L3a
        L4e:
            r2 = r3
            goto L27
        L50:
            boolean r0 = r5.LLJJI
            if (r0 == 0) goto L5e
            X.0PbR r2 = r5.S5()
            r0 = 150(0x96, double:7.4E-322)
            r2.W0(r0, r3)
            return
        L5e:
            X.C648300Pbo.LJ(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnAttachStateChangeListenerC648030PbN.W0(long, X.0N0u):void");
    }

    public ViewOnAttachStateChangeListenerC648030PbN(Fragment fragment, C648330Pbr c648330Pbr, long j) {
        List<AbstractC648060PbQ> list;
        Object next;
        super(c648330Pbr);
        this.LL = C452501pT.LIZIZ(new AwS554S0100000_10(c648330Pbr, 939));
        this.LLILLJJLI = -1;
        this.LLILZ = C452501pT.LIZIZ(new C645720PUk(c648330Pbr, this, fragment, j));
        this.LLJJIII = true;
        this.LLJJJ = "";
        this.LLJJJIL = C452501pT.LIZIZ(new AwS554S0100000_10(c648330Pbr, 938));
        this.LLJJJJ = new AObserverS214S0100000_10(this, 93);
        c648330Pbr.addOnAttachStateChangeListener(this);
        C645710PUj c645710PUjR5 = R5();
        if (c645710PUjR5 != null && (list = c645710PUjR5.LLILLJJLI) != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next instanceof C647810Pb1) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AbstractC648060PbQ abstractC648060PbQ = (AbstractC648060PbQ) next;
            if (abstractC648060PbQ != null) {
                ((C647810Pb1) abstractC648060PbQ).LLJILJILJ = new InterfaceC647910PbB() { // from class: X.0PbO
                    @Override // X.InterfaceC647910PbB
                    public final void onStart() {
                    }

                    @Override // X.InterfaceC647910PbB
                    public final void LIZ() {
                        ViewOnAttachStateChangeListenerC648030PbN viewOnAttachStateChangeListenerC648030PbN = this.LIZ;
                        if (viewOnAttachStateChangeListenerC648030PbN.LLILZIL) {
                            viewOnAttachStateChangeListenerC648030PbN.LLILZIL = false;
                            View view = viewOnAttachStateChangeListenerC648030PbN.itemView;
                            if (!view.isAttachedToWindow()) {
                                view.addOnAttachStateChangeListener(new C0R48(viewOnAttachStateChangeListenerC648030PbN, view, 8));
                                return;
                            }
                            Function0<Unit> function0 = viewOnAttachStateChangeListenerC648030PbN.LLJJL;
                            if (function0 != null) {
                                function0.invoke();
                            }
                        }
                    }

                    @Override // X.InterfaceC647910PbB
                    public final void LIZLLL() {
                        ViewOnAttachStateChangeListenerC648030PbN viewOnAttachStateChangeListenerC648030PbN = this.LIZ;
                        View view = viewOnAttachStateChangeListenerC648030PbN.itemView;
                        viewOnAttachStateChangeListenerC648030PbN.getClass();
                        C648300Pbo.LIZJ(viewOnAttachStateChangeListenerC648030PbN, view);
                        ViewOnAttachStateChangeListenerC648030PbN viewOnAttachStateChangeListenerC648030PbN2 = this.LIZ;
                        if (viewOnAttachStateChangeListenerC648030PbN2.LLILZIL) {
                            return;
                        }
                        View view2 = viewOnAttachStateChangeListenerC648030PbN2.itemView;
                        if (!view2.isAttachedToWindow()) {
                            view2.addOnAttachStateChangeListener(new C0R48(viewOnAttachStateChangeListenerC648030PbN2, view2, 9));
                            return;
                        }
                        Function0<Unit> function0 = viewOnAttachStateChangeListenerC648030PbN2.LLJJL;
                        if (function0 != null) {
                            function0.invoke();
                        }
                    }
                };
            }
        }
        this.LLJJJJJIL = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:233:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(androidx.fragment.app.Fragment r20, com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r21, java.util.Map<java.lang.String, ? extends java.lang.Object> r22, X.InterfaceC641090PCp r23, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.LynxSSRInfo r24, com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel r25, boolean r26, boolean r27) {
        /*
            Method dump skipped, instruction units count: 1607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnAttachStateChangeListenerC648030PbN.I5(androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch, java.util.Map, X.0PCp, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.LynxSSRInfo, com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel, boolean, boolean):void");
    }
}

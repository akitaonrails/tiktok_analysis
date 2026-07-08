package X;

import Y.AObserverS225S0100000_22;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.als.h0;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import ge.i;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425620nCa extends i<InterfaceC1425690nCh, C1425590nCX, C1425650nCd, C1425600nCY> implements InterfaceC1425690nCh, InterfaceC379610EuV {
    public static final C1425640nCc LLJJJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final ShortVideoContext LLJJ;
    public final h0<Float> LLJJI;
    public final h0<Float> LLJJIII;
    public Scene LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public C1425520nCQ LLJJJIL;
    public boolean LLJJJJ;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0nCc] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1425620nCa.class, "editTabStateApi", "getEditTabStateApi()Lcom/ss/android/ugc/aweme/editorpro/EditorTabStateApi;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1425620nCa.class, "templateListApi", "getTemplateListApi()Lcom/ss/android/ugc/aweme/editorpro/TemplateHelpApi;", 0), new C2217381BqS(C1425620nCa.class, "topBarApi", "getTopBarApi()Lcom/ss/android/ugc/aweme/editorpro/topbar/EditorTabTopBarApi;", 0)};
        LLJJJJJIL = new Object() { // from class: X.0nCc
        };
    }

    private final InterfaceC1425510nCP H4() {
        return (InterfaceC1425510nCP) this.LLJJIJIIJIL.getValue(this, LLJJJJLIIL[0]);
    }

    private final InterfaceC1424260nAO P4() {
        return (InterfaceC1424260nAO) this.LLJJIJIL.getValue(this, LLJJJJLIIL[1]);
    }

    private final InterfaceC1425550nCT T4() {
        return (InterfaceC1425550nCT) this.LLJJJ.getValue(this, LLJJJJLIIL[2]);
    }

    private final void k5() {
        C531110KsH.LIZJ(C531110KsH.LIZ, this.LLJILJILJ, this.LLJJ, true, System.currentTimeMillis(), null, false, null, false, false, false, true, 1008);
    }

    @Override // ge.i
    public Function0<C1425590nCX> E3() {
        return new AwS566S0100000_22(this, 105);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1425650nCd> o2() {
        return AFwS210S0000000_22.get$arr$(58);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1425600nCY> w2() {
        return new AwS566S0100000_22(this, 104);
    }

    @Override // X.InterfaceC1425690nCh
    public void wF0() {
        C569590MVp.LIZIZ.LIZJ("editor://pro/new_edit", this.LLJILJILJ, this.LLJJ);
    }

    public final void d5() {
        if (C288810BTr.LIZ()) {
            k5();
            C0MWG c0mwg = C0MWG.LIZ;
            ShortVideoContext shortVideoContext = this.LLJJ;
            c0mwg.getClass();
            C0MWG.LIZ("new_edit", shortVideoContext, false);
        } else {
            wF0();
        }
        C0MWG c0mwg2 = C0MWG.LIZ;
        ShortVideoContext shortVideoContext2 = this.LLJJ;
        c0mwg2.getClass();
        C0MWG.LIZIZ(false, shortVideoContext2);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        H4().zT().observe(this, new AObserverS225S0100000_22(this, 12));
        H4().ey1(new InterfaceC21580219cu() { // from class: X.0nCb
            @Override // X.InterfaceC21580219cu
            public final void LJI() {
            }

            @Override // X.InterfaceC21580219cu
            public final void b3() {
            }

            @Override // X.InterfaceC21580219cu
            public final void c3() {
            }

            @Override // X.InterfaceC21580219cu
            public final void d3(int i) {
            }

            @Override // X.InterfaceC21580219cu
            public final void a3(int i) {
                Float fLIZ;
                View view;
                C1425620nCa c1425620nCa = this.LIZ;
                Scene scene = c1425620nCa.LLJJIJI;
                if (scene != null && (view = scene.mView) != null) {
                    c1425620nCa.Z4(view);
                }
                C1425520nCQ c1425520nCQ = this.LIZ.LLJJJIL;
                if (c1425520nCQ != null && (fLIZ = c1425520nCQ.LIZ()) != null) {
                    C1425620nCa c1425620nCa2 = this.LIZ;
                    float fFloatValue = fLIZ.floatValue();
                    c1425620nCa2.LLJJI.LJII(Float.valueOf(fFloatValue));
                    if (fFloatValue == 1.0f && !c1425620nCa2.LLJJJJ) {
                        C0MWG c0mwg = C0MWG.LIZ;
                        ShortVideoContext shortVideoContext = c1425620nCa2.LLJJ;
                        c0mwg.getClass();
                        C0MWG.LIZJ(false, shortVideoContext);
                        c1425620nCa2.LLJJJJ = true;
                    }
                    if (fFloatValue == 0.0f) {
                        c1425620nCa2.LLJJJJ = false;
                    }
                }
                this.LIZ.F4(i);
            }
        });
    }

    @Override // X.InterfaceC1425690nCh
    public /* bridge */ /* synthetic */ C385670FAf BM() {
        return this.LLJJIII;
    }

    public h0<Float> K4() {
        return this.LLJJI;
    }

    public h0<Float> O4() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1425690nCh
    public /* bridge */ /* synthetic */ C385670FAf Wn() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final void F4(int i) {
        View view;
        View view2;
        Scene scene = this.LLJJIJI;
        Object parent = null;
        if (scene != null && (view2 = scene.mView) != null) {
            parent = view2.getParent();
        }
        if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
            int top = view.getTop();
            int i2 = i - top;
            if (i2 <= 0) {
                if (!Intrinsics.LIZLLL(this.LLJJIII.LIZJ(), 0.0f)) {
                    this.LLJJIII.LJII(Float.valueOf(0.0f));
                    return;
                }
                return;
            }
            Pair<Integer, Integer> pairXb1 = P4().Xb1();
            if (pairXb1 == null) {
                return;
            }
            int iIntValue = pairXb1.getSecond().intValue();
            float f = 1.0f;
            if (i2 > iIntValue) {
                if (!Intrinsics.LIZLLL(this.LLJJIII.LIZJ(), 1.0f)) {
                    this.LLJJIII.LJII(Float.valueOf(1.0f));
                    return;
                }
                return;
            }
            h0<Float> h0Var = this.LLJJIII;
            float f2 = i2;
            int i3 = iIntValue - top;
            if (i3 < 1) {
                i3 = 1;
            }
            float f3 = f2 / i3;
            if (f3 <= 1.0f) {
                f = f3;
            }
            h0Var.LJII(Float.valueOf(f));
        }
    }

    public final void Z4(View view) {
        if (this.LLJJJIL != null) {
            return;
        }
        this.LLJJJIL = new C1425520nCQ(view);
    }

    public C1425620nCa(C19A3 c19a3, C1DRG c1drg, ShortVideoContext shortVideoContext) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = shortVideoContext;
        this.LLJJI = new h0<>(null);
        this.LLJJIII = new h0<>(null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1425510nCP.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1424260nAO.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1425550nCT.class, null);
    }
}

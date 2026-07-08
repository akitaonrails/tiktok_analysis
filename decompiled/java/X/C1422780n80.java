package X;

import Y.AObjectS245S0100000_22;
import Y.AObjectS305S0200000_22;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import ge.i;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0n80, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422780n80 extends i<InterfaceC1422790n81, C1424780nBE, C1422810n83, C1422170n71> implements InterfaceC1422790n81, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJLIIIJLLLLLLLZ;
    public static final int LLJL;
    public final C1DRG LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C1422410n7P LLJJ;
    public final C1422530n7b LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C1422180n72 LLJJJIL;
    public final Map<TemplateCategoryData, Long> LLJJJJ;
    public final Function0<C1422810n83> LLJJJJJIL;
    public final Function0<C1422170n71> LLJJJJLIIL;
    public final Function0<Boolean> LLJJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1422780n80.class, "templateTabSearchApi", "getTemplateTabSearchApi()Lcom/ss/android/ugc/aweme/template/search/TemplateTabSearchApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1422780n80.class, "coreApi", "getCoreApi()Lcom/ss/android/ugc/aweme/tools/mvtemplate/search/datasource/TemplateSearchCoreApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1422780n80.class, "previewApi", "getPreviewApi()Lcom/ss/android/ugc/aweme/tools/mvtemplate/mvpreview/TemplatePreviewUIApi;", 0);
        c09r3.getClass();
        LLJJLIIIJLLLLLLLZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJL = 8;
    }

    private final InterfaceC1422590n7h P4() {
        return (InterfaceC1422590n7h) this.LLJJJ.getValue();
    }

    private final InterfaceC1423900n9o Z4() {
        return (InterfaceC1423900n9o) this.LLJJIII.getValue(this, LLJJLIIIJLLLLLLLZ[0]);
    }

    public final InterfaceC1422440n7S K4() {
        return (InterfaceC1422440n7S) this.LLJJIJI.getValue(this, LLJJLIIIJLLLLLLLZ[1]);
    }

    public final C1422420n7Q O4() {
        return (C1422420n7Q) this.LLJJIJIL.getValue();
    }

    public final InterfaceC1422770n7z T4() {
        return (InterfaceC1422770n7z) this.LLJJIJIIJIL.getValue(this, LLJJLIIIJLLLLLLLZ[2]);
    }

    public final void fo2() {
        i3(AFwS261S0000000_22.get$arr$(146));
    }

    private final void Xi() {
        C385670FAf<C443120HZe<Boolean, C1419590n2r, Float>> c385670FAfQx1;
        C1422900n8C c1422900n8CIr;
        InterfaceC1423900n9o interfaceC1423900n9oZ4 = Z4();
        if (interfaceC1423900n9oZ4 != null && (c1422900n8CIr = interfaceC1423900n9oZ4.ir()) != null) {
            c1422900n8CIr.LIZ.LIZ(this, new AObjectS305S0200000_22(c1422900n8CIr, this, 7));
        }
        InterfaceC1422440n7S interfaceC1422440n7SK4 = K4();
        if (interfaceC1422440n7SK4 != null) {
            interfaceC1422440n7SK4.Jb2().LIZ(this, new AObjectS305S0200000_22(interfaceC1422440n7SK4, this, 8));
            LiveEvent<C1422880n8A> liveEventWo = interfaceC1422440n7SK4.wo();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            liveEventWo.LJII(this, state, new AObjectS245S0100000_22(this, 100));
            interfaceC1422440n7SK4.CX0().LJII(this, state, new AObjectS245S0100000_22(this, 101));
        }
        InterfaceC1422770n7z interfaceC1422770n7zT4 = T4();
        if (interfaceC1422770n7zT4 == null || (c385670FAfQx1 = interfaceC1422770n7zT4.qx1()) == null) {
            return;
        }
        c385670FAfQx1.LIZ(this, new AObjectS245S0100000_22(this, 102));
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        super.hide();
        InterfaceC1422590n7h interfaceC1422590n7hP4 = P4();
        if (interfaceC1422590n7hP4 != null) {
            interfaceC1422590n7hP4.ya0(this.LLJJL);
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        super.onPause();
        i3(AFwS261S0000000_22.get$arr$(147));
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        i3(AFwS261S0000000_22.get$arr$(148));
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        i3(new AwS601S0100000_22(this, 266));
        InterfaceC1422440n7S interfaceC1422440n7SK4 = K4();
        if (interfaceC1422440n7SK4 != null) {
            interfaceC1422440n7SK4.reset();
        }
        C1422420n7Q c1422420n7QO4 = O4();
        if (c1422420n7QO4 != null) {
            c1422420n7QO4.T2();
        }
        this.LLJJJJ.put(null, Long.valueOf(System.currentTimeMillis()));
        InterfaceC1422590n7h interfaceC1422590n7hP4 = P4();
        if (interfaceC1422590n7hP4 != null) {
            interfaceC1422590n7hP4.J70(this.LLJJL);
        }
        F4(20, false);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1422810n83> o2() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1422170n71> w2() {
        return this.LLJJJJLIIL;
    }

    private final void F4(int i, boolean z) {
        C1422860n88 c1422860n88Bn;
        h0<Pair<String, Integer>> h0Var;
        Pair<String, Integer> pairLIZJ;
        InterfaceC1423900n9o interfaceC1423900n9oZ4 = Z4();
        if (interfaceC1423900n9oZ4 != null && (c1422860n88Bn = interfaceC1423900n9oZ4.bn()) != null && (h0Var = c1422860n88Bn.LIZ) != null && (pairLIZJ = h0Var.LIZJ()) != null) {
            String first = pairLIZJ.getFirst();
            InterfaceC1422440n7S interfaceC1422440n7SK4 = K4();
            if (interfaceC1422440n7SK4 == null) {
                return;
            }
            interfaceC1422440n7SK4.R62(first, i, z);
        }
    }

    public final void d5(List<C1422430n7R> list, int i) {
        C1422420n7Q c1422420n7QO4 = O4();
        if (c1422420n7QO4 == null) {
            return;
        }
        c1422420n7QO4.H2(list, i);
    }

    public C1422780n80(C19A3 c19a3, C1DRG c1drg, C1DRG c1drg2, C1422410n7P c1422410n7P, C1422530n7b c1422530n7b) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c1drg2;
        this.LLJJ = c1422410n7P;
        this.LLJJI = c1422530n7b;
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1423900n9o.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1422440n7S.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1422770n7z.class, null);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 402));
        this.LLJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 403));
        this.LLJJJIL = new C1422180n72(K4(), T4(), O4(), new AwS566S0100000_22(this, 406));
        this.LLJJJJ = new LinkedHashMap();
        this.LLJJJJJIL = new AwS566S0100000_22(this, 401);
        this.LLJJJJLIIL = new AwS566S0100000_22(this, 405);
        this.LLJJL = new AwS566S0100000_22(this, 404);
    }
}

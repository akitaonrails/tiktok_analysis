package X;

import X.InterfaceC1647890sz5;
import Y.AObjectS246S0100000_25;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: renamed from: X.0t12, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1649100t12<T extends InterfaceC1647890sz5> extends AbstractC2255721DQs<T> implements InterfaceC1647890sz5, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C1DRG LL;
    public final C1649540t1k LLILLJJLI;
    public final h0<Boolean> LLILLL;
    public final h0<Integer> LLILZ;
    public final h0<Boolean> LLILZIL;
    public final h0<Boolean> LLILZLL;
    public final h0<Boolean> LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public int LLJILJILJ;
    public DisplayManager LLJILLL;
    public final DisplayManager.DisplayListener LLJJ;
    public final InterfaceC1655690tBf LLJJI;
    public boolean LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1649100t12.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1649100t12.class, "surfaceSizeAdapter", "getSurfaceSizeAdapter()Lcom/ss/android/ugc/aweme/utils/SurfaceSizeAdapter;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1649100t12.class, "activityBehaviorRegistry", "getActivityBehaviorRegistry()Lcom/ss/android/ugc/aweme/saa/activity/AVListenableActivityBehaviorRegistry;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1649100t12.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1649100t12.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public T X1() {
        return this;
    }

    private final InterfaceC1649090t11 T2() {
        return (InterfaceC1649090t11) this.LLJ.getValue(this, LLJJIJI[1]);
    }

    private final InterfaceC577370Mkh W1() {
        return (InterfaceC577370Mkh) this.LLJI.getValue(this, LLJJIJI[2]);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJJIJI[0]);
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLJIJIL.getValue(this, LLJJIJI[3]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLJILJIL.getValue(this, LLJJIJI[4]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        Configuration configuration;
        super.onCreate();
        Resources resources = getActivity().getResources();
        this.LLJILJILJ = (resources == null || (configuration = resources.getConfiguration()) == null) ? 0 : configuration.screenWidthDp;
        this.LLILZ.LJII(Integer.valueOf(ScreenUtils.getScreenWidth(getActivity())));
        Object objJ2 = C786410Ut5.J2(getActivity(), "display");
        DisplayManager displayManager = objJ2 instanceof DisplayManager ? (DisplayManager) objJ2 : null;
        this.LLJILLL = displayManager;
        if (displayManager != null) {
            displayManager.registerDisplayListener(this.LLJJ, null);
        }
        InterfaceC577370Mkh interfaceC577370MkhW1 = W1();
        if (interfaceC577370MkhW1 != null) {
            interfaceC577370MkhW1.LJLJJL(this.LLJJI);
        }
        getRecordControlApi().xM2().LIZ(this, new AObjectS246S0100000_25(this, 214));
        getRecordControlApi().cJ0().LIZ(this, new AObjectS246S0100000_25(this, 215));
        getCameraApiComponent().Dm2().LIZ(this, new AObjectS246S0100000_25(this, 216));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        DisplayManager displayManager = this.LLJILLL;
        if (displayManager != null) {
            displayManager.unregisterDisplayListener(this.LLJJ);
        }
        InterfaceC577370Mkh interfaceC577370MkhW1 = W1();
        if (interfaceC577370MkhW1 != null) {
            interfaceC577370MkhW1.LJIIZILJ(this.LLJJI);
        }
        this.LLJILLL = null;
    }

    public h0<Boolean> G2() {
        return this.LLILLL;
    }

    public h0<Boolean> H2() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1647890sz5
    public /* bridge */ /* synthetic */ C385670FAf Lg1() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1647890sz5
    public /* bridge */ /* synthetic */ C385670FAf RS() {
        return this.LLIZ;
    }

    public h0<Boolean> Z1() {
        return this.LLIZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public h0<Integer> o2() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1647890sz5
    public /* bridge */ /* synthetic */ C385670FAf sK0() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1647890sz5
    public /* bridge */ /* synthetic */ C385670FAf va() {
        return this.LLILZIL;
    }

    public h0<Boolean> w2() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1647890sz5
    public /* bridge */ /* synthetic */ C385670FAf wm1() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1647890sz5
    public boolean xu0() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC1647890sz5
    public void H90(boolean z) {
        this.LLILZLL.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1647890sz5
    public void OU1(InterfaceC1649550t1l interfaceC1649550t1l) {
        C1649540t1k c1649540t1k = this.LLILLJJLI;
        if (c1649540t1k != null) {
            c1649540t1k.LL.remove(interfaceC1649550t1l);
        }
    }

    public final void W2(int i) {
        if (C12VA.LIZ().LJIIJJI.invoke().booleanValue()) {
            C1415610mwR.LIZIZ = -1;
            C1415610mwR.LIZ = -1;
        }
        InterfaceC1649090t11 interfaceC1649090t11T2 = T2();
        if (interfaceC1649090t11T2 != null) {
            interfaceC1649090t11T2.LIZ(null, getCameraApiComponent().getPreviewView(), getCameraApiComponent().St2().getViewFunction().getView(), false);
        }
        this.LLILZ.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1647890sz5
    public void gX1(boolean z) {
        this.LLILZIL.LJII(Boolean.valueOf(z));
        this.LLILLL.LJII(Boolean.TRUE);
    }

    @Override // X.InterfaceC1647890sz5
    public void m10(boolean z) {
        this.LLIZ.LJII(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC1647890sz5
    public void oL0(InterfaceC1649550t1l interfaceC1649550t1l) {
        C1649540t1k c1649540t1k = this.LLILLJJLI;
        if (c1649540t1k != null) {
            c1649540t1k.LL.add(interfaceC1649550t1l);
        }
    }

    @Override // X.InterfaceC1647890sz5
    public void t82(boolean z) {
        this.LLJJIII = z;
    }

    public C1649100t12(C1DRG c1drg, C1649540t1k c1649540t1k) {
        h0<Boolean> h0Var;
        this.LL = c1drg;
        this.LLILLJJLI = c1649540t1k;
        Boolean bool = Boolean.FALSE;
        this.LLILLL = new h0<>(bool);
        this.LLILZ = new h0<>(0);
        if (!C1462920oAk.LIZLLL() && !C343070Dcf.LJ(c1drg)) {
            h0Var = new C538770LBb<>(bool);
        } else {
            h0Var = new h0<>(bool);
        }
        this.LLILZIL = h0Var;
        this.LLILZLL = new C538770LBb(bool);
        this.LLIZ = new h0<>(Boolean.TRUE);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1649090t11.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC577370Mkh.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
        this.LLJJ = new DisplayManager.DisplayListener(this) { // from class: X.0t14
            public final /* synthetic */ C1649100t12<T> LL;

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayAdded(int i) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayRemoved(int i) {
            }

            {
                this.LL = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayChanged(int i) {
                int screenWidth = ScreenUtils.getScreenWidth(this.LL.getActivity());
                Integer numLIZJ = this.LL.LLILZ.LIZJ();
                if (numLIZJ == null || screenWidth != numLIZJ.intValue()) {
                    this.LL.W2(screenWidth);
                }
            }
        };
        this.LLJJI = new InterfaceC1655690tBf(this) { // from class: X.0t13
            public final /* synthetic */ C1649100t12<T> LIZ;

            {
                this.LIZ = this;
            }

            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // X.InterfaceC1655690tBf
            public final void onConfigurationChanged(Configuration configuration) {
                Integer numLIZJ;
                if (configuration == null) {
                    return;
                }
                int screenWidth = ScreenUtils.getScreenWidth(this.LIZ.getActivity());
                C1649100t12<T> c1649100t12 = this.LIZ;
                if (c1649100t12.LLJILJILJ != configuration.screenWidthDp || (numLIZJ = c1649100t12.LLILZ.LIZJ()) == null || screenWidth != numLIZJ.intValue()) {
                    C1649100t12<T> c1649100t122 = this.LIZ;
                    c1649100t122.LLJILJILJ = configuration.screenWidthDp;
                    c1649100t122.W2(screenWidth);
                }
            }
        };
    }
}

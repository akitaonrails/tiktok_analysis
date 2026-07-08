package X;

import X.C05YF;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.193O, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C193O<API extends C05YF, STATE, ACTION> extends AbstractC1664470tPp<API, STATE, ACTION> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public final C1DRG LLILLL;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C193M.class, null);
    public final Function0<ACTION> LLILZIL = new AwS576S0100000_32(this, 275);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C193O.class, "optionsManagerApi", "getOptionsManagerApi()Lcom/ss/android/ugc/aweme/shortvideo/component/option/manager/PublishOptionsManagerApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public abstract ACTION B3();

    public abstract InterfaceC1738600vLO E3();

    public void O3() {
    }

    public abstract void Q3();

    public abstract void e4();

    @Override // X.AbstractC1664470tPp
    public abstract Function0<STATE> o2();

    public abstract void v3();

    public boolean z4() {
        return true;
    }

    public final C193M H3() {
        return (C193M) this.LLILZ.getValue(this, LLILZLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public String getComponentName() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishOptionItemComponent(");
        sbLIZ.append(E3().getKey());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC2255721DQs
    public final void onCreate() {
        super.onCreate();
        long jCurrentTimeMillis = System.currentTimeMillis();
        O3();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Component{");
        sbLIZ.append(E3().getKey());
        sbLIZ.append("} onComponentCreate cost: ");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C193V c193v = C193V.LIZIZ;
        C201955140j.LJIILJJIL(c193v, strLIZIZ);
        boolean zZ4 = z4();
        if (zZ4) {
            e4();
            v3();
            Q3();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Component{");
        sbLIZ2.append(E3().getKey());
        sbLIZ2.append("} onCreate total cost: ");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ2.append(" supportOption=");
        sbLIZ2.append(zZ4);
        C201955140j.LJIILJJIL(c193v, C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.AbstractC1664470tPp
    public final Function0<ACTION> w2() {
        return this.LLILZIL;
    }

    public C193O(C1DRG c1drg) {
        this.LLILLL = c1drg;
    }

    public final void q3(C10J3 c10j3) {
        H3().KL1(E3(), G2().LIZ.getClass(), B3().getClass(), G2(), B3(), c10j3);
    }

    public final void o4(AnonymousClass1931<?, STATE, ACTION> anonymousClass1931, InterfaceC19223310Il interfaceC19223310Il) {
        H3().LW(G2().LIZ.getClass(), B3().getClass(), anonymousClass1931, interfaceC19223310Il);
    }
}

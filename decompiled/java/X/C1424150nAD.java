package X;

import com.bytedance.crash.Npth;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.IndexedValue;

/* JADX INFO: renamed from: X.0nAD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1424150nAD extends AbstractC2255721DQs<InterfaceC1412230mqz> implements InterfaceC379610EuV, InterfaceC1412230mqz {
    public static final C1424170nAF LLILZIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public boolean LLILLL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public Pair<Integer, Integer> LLILZ = new Pair<>(-1, -1);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0nAF] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1424150nAD.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZIL = new Object() { // from class: X.0nAF
        };
        LLIZ = 8;
    }

    public InterfaceC1412230mqz Z1() {
        return this;
    }

    private final int G2() {
        return ((Number) C1454860nxk.LIZLLL.getValue()).intValue();
    }

    private final List<Integer> H2() {
        return (List) C1454860nxk.LIZJ.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Pair<Integer, Integer> o2() {
        if (this.LLILZ.getFirst().intValue() <= 0 || this.LLILZ.getSecond().intValue() <= 0) {
            p("needDowngrade: false, previousCanvasSize is invalid.");
            return null;
        }
        Pair<Integer, Integer> pair = this.LLILZ;
        int iIntValue = pair.getFirst().intValue();
        int iIntValue2 = pair.getSecond().intValue();
        boolean z = iIntValue >= iIntValue2;
        int iMin = Math.min(iIntValue, iIntValue2);
        C717610SCx c717610SCx = (C717610SCx) C13LP.LLIIL(H2()).iterator();
        if (!c717610SCx.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = c717610SCx.next();
        if (c717610SCx.hasNext()) {
            int iAbs = Math.abs(((Number) ((IndexedValue) next).LIZIZ).intValue() - iMin);
            do {
                Object next2 = c717610SCx.next();
                int iAbs2 = Math.abs(((Number) ((IndexedValue) next2).LIZIZ).intValue() - iMin);
                if (iAbs > iAbs2) {
                    next = next2;
                    iAbs = iAbs2;
                }
            } while (c717610SCx.hasNext());
        }
        int i = ((IndexedValue) next).LIZ;
        if (i >= G2()) {
            W2("needDowngrade: false, already the target resolution.");
            return null;
        }
        int i2 = i + 1;
        int iLJIIJ = C1697810uHb.LJIIJ(H2());
        if (i2 > iLJIIJ) {
            i2 = iLJIIJ;
        }
        if (i2 == i) {
            W2("needDowngrade: false, almost the minimal resolution.");
            return null;
        }
        if (z) {
            int iIntValue3 = ((Number) ListProtector.get(H2(), i2)).intValue();
            return new Pair<>(Integer.valueOf((iIntValue * iIntValue3) / iIntValue2), Integer.valueOf(iIntValue3));
        }
        int iIntValue4 = ((Number) ListProtector.get(H2(), i2)).intValue();
        return new Pair<>(Integer.valueOf(iIntValue4), Integer.valueOf((iIntValue2 * iIntValue4) / iIntValue));
    }

    private final InterfaceC1455860nzM w2() {
        return (InterfaceC1455860nzM) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    private final InterfaceC1452170ntP T2() {
        return w2().g().getValue();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1424150nAD(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final void W1(boolean z) {
        if (this.LLILLL) {
            W2("needDowngrade: false, has downgraded");
            return;
        }
        InterfaceC1452170ntP interfaceC1452170ntPT2 = T2();
        if (interfaceC1452170ntPT2 != null) {
            this.LLILZ = interfaceC1452170ntPT2.getCanvasSize();
            Pair<Integer, Integer> pairO2 = o2();
            if (pairO2 != null) {
                this.LLILLL = true;
                m3(interfaceC1452170ntPT2, pairO2.getFirst().intValue(), pairO2.getSecond().intValue(), z);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("downgradeResolution: true -> ");
                sbLIZ.append(pairO2.getFirst().intValue());
                sbLIZ.append('x');
                sbLIZ.append(pairO2.getSecond().intValue());
                W2(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    private final void W2(String str) {
        C201955140j.LIZLLL(C1424160nAE.LIZIZ, "EditPreviewResolution", str);
    }

    private final void c3(boolean z) {
        if (!this.LLILLL) {
            W2("resetResolution: false, not downgraded");
            return;
        }
        InterfaceC1452170ntP interfaceC1452170ntPT2 = T2();
        if (interfaceC1452170ntPT2 != null) {
            if (this.LLILZ.getFirst().intValue() > 0 && this.LLILZ.getSecond().intValue() > 0) {
                this.LLILLL = false;
                m3(interfaceC1452170ntPT2, this.LLILZ.getFirst().intValue(), this.LLILZ.getSecond().intValue(), z);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("resetResolution: true, -> ");
                sbLIZ.append(this.LLILZ.getFirst().intValue());
                sbLIZ.append('x');
                sbLIZ.append(this.LLILZ.getSecond().intValue());
                W2(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("resetResolution: false, previousCanvasSize is invalid. ");
            sbLIZ2.append(this.LLILZ.getFirst().intValue());
            sbLIZ2.append('x');
            sbLIZ2.append(this.LLILZ.getSecond().intValue());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            p(strLIZIZ);
            Npth.reportBizException("EditPreviewResolution", new IllegalStateException(strLIZIZ), strLIZIZ, C2097608Jq.LJ());
        }
    }

    private final void p(String str) {
        C201955140j.LJIIIIZZ(C1424160nAE.LIZIZ, "EditPreviewResolution", str);
    }

    @Override // X.InterfaceC1412230mqz
    public void lN2(boolean z) {
        W2("unselect item");
        c3(z);
    }

    @Override // X.InterfaceC1412230mqz
    public void uT0(boolean z) {
        W2("onApplyMaterial");
        W1(z);
    }

    private final void m3(InterfaceC1452170ntP interfaceC1452170ntP, int i, int i2, boolean z) {
        Pair<Integer, Integer> canvasSize = interfaceC1452170ntP.getCanvasSize();
        interfaceC1452170ntP.Vf(i, i2);
        interfaceC1452170ntP.Pf(i, i2);
        if (z) {
            interfaceC1452170ntP.jg();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("set resolution: ");
        sbLIZ.append(canvasSize.getFirst().intValue());
        sbLIZ.append('x');
        sbLIZ.append(canvasSize.getSecond().intValue());
        sbLIZ.append(" -> ");
        sbLIZ.append(i);
        sbLIZ.append('x');
        sbLIZ.append(i2);
        W2(C2188811AlT.LIZIZ(sbLIZ));
    }
}

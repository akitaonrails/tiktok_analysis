package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1645270sur extends AbstractC2255721DQs<InterfaceC1650270t2v> implements InterfaceC1650270t2v, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public final C1DRG LL;
    public final boolean LLILLJJLI;
    public final C1645270sur LLILLL = this;
    public final C19EG LLILZ = (C19EG) getDiContainer().LJII(C19EG.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final C01GW LLILZLL = C452501pT.LIZ(EnumC452301pR.NONE, AFwS214S0000000_25.get$arr$(76));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 79));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1645270sur.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    private final InterfaceC1645280sus X1() {
        return (InterfaceC1645280sus) this.LLILZLL.getValue();
    }

    private final InterfaceC1645340suy Z1() {
        return (InterfaceC1645340suy) this.LLIZ.getValue();
    }

    private final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLILZIL.getValue(this, LLIZLLLIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        X1().LIZ(Z1());
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        X1().destroy();
    }

    public C1645270sur W1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final void w2(EnumC1645310suv enumC1645310suv) {
        List list;
        int iIndexOf;
        FilterBean filterBean;
        C385670FAf<FilterBean> c385670FAfI70;
        LiveData<C1643870ssb> liveDataRT;
        C1643870ssb value;
        InterfaceC1639870sm9 interfaceC1639870sm9;
        InterfaceC1640320sms interfaceC1640320smsLJJI;
        MutableLiveData mutableLiveDataLJFF;
        InterfaceC2254081DKk interfaceC2254081DKkSt2;
        InterfaceC1645720sva effectController;
        if (this.LLILLJJLI && (interfaceC2254081DKkSt2 = getCameraApiComponent().St2()) != null && (effectController = interfaceC2254081DKkSt2.getEffectController()) != null) {
            effectController.po();
        }
        InterfaceC1644770su3 interfaceC1644770su3 = (InterfaceC1644770su3) findReadyComponent(this, InterfaceC1644770su3.class);
        FilterBean filterBeanLIZJ = null;
        if (interfaceC1644770su3 == null || (liveDataRT = interfaceC1644770su3.RT()) == null || (value = liveDataRT.getValue()) == null || (interfaceC1639870sm9 = value.LIZIZ) == null || (interfaceC1640320smsLJJI = interfaceC1639870sm9.LJJI()) == null || (mutableLiveDataLJFF = interfaceC1640320smsLJJI.LJFF()) == null || (list = (List) mutableLiveDataLJFF.getValue()) == null) {
            list = C13BV.INSTANCE;
        }
        if (interfaceC1644770su3 == null || (c385670FAfI70 = interfaceC1644770su3.i70()) == null || (filterBeanLIZJ = c385670FAfI70.LIZJ()) == null || (iIndexOf = list.indexOf(filterBeanLIZJ)) < 0) {
            iIndexOf = 0;
        }
        int i = C1645300suu.LIZ[enumC1645310suv.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    filterBean = filterBeanLIZJ;
                } else {
                    throw new C1954807lC();
                }
            } else {
                filterBean = (FilterBean) C13LP.LJJJLZIJ(iIndexOf + 1, list);
            }
        } else {
            filterBean = (FilterBean) C13LP.LJJJLZIJ(iIndexOf - 1, list);
        }
        if (filterBean != null && interfaceC1644770su3 != null) {
            interfaceC1644770su3.MO(filterBean, "slide", true ^ Intrinsics.LJFF(filterBean, filterBeanLIZJ), true, Intrinsics.LJFF(filterBean, filterBeanLIZJ), true);
        }
    }

    @Override // X.InterfaceC1650270t2v
    public void zx(float f) {
        InterfaceC2254081DKk interfaceC2254081DKkSt2;
        InterfaceC1645720sva effectController;
        if (this.LLILLJJLI && (interfaceC2254081DKkSt2 = getCameraApiComponent().St2()) != null && (effectController = interfaceC2254081DKkSt2.getEffectController()) != null) {
            effectController.po();
        }
        X1().LIZIZ(f);
    }

    public C1645270sur(C1DRG c1drg, boolean z) {
        this.LL = c1drg;
        this.LLILLJJLI = z;
    }

    @Override // X.InterfaceC1650270t2v
    public void ke(float f, float f2) {
        InterfaceC2254081DKk interfaceC2254081DKkSt2;
        InterfaceC1645720sva effectController;
        if (this.LLILLJJLI && (interfaceC2254081DKkSt2 = getCameraApiComponent().St2()) != null && (effectController = interfaceC2254081DKkSt2.getEffectController()) != null) {
            effectController.po();
        }
        X1().LIZJ(f, f2, this.LLILZ.getWindow().getDecorView().getWidth());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o2(float r7, X.EnumC430170Gtr r8) {
        /*
            r6 = this;
            boolean r0 = r6.LLILLJJLI
            if (r0 == 0) goto L17
            X.0t2r r0 = r6.getCameraApiComponent()
            X.1DKk r0 = r0.St2()
            if (r0 == 0) goto L17
            X.0sva r0 = r0.getEffectController()
            if (r0 == 0) goto L17
            r0.po()
        L17:
            java.lang.Class<X.0su3> r0 = X.InterfaceC1644770su3.class
            X.05YF r5 = r6.findReadyComponent(r6, r0)
            X.0su3 r5 = (X.InterfaceC1644770su3) r5
            if (r5 == 0) goto L81
            androidx.lifecycle.LiveData r0 = r5.RT()
            if (r0 == 0) goto L81
            java.lang.Object r0 = r0.getValue()
            X.0ssb r0 = (X.C1643870ssb) r0
            if (r0 == 0) goto L81
            X.0sm9 r0 = r0.LIZIZ
            X.0sms r0 = r0.LJJI()
            androidx.lifecycle.MutableLiveData r0 = r0.LJFF()
            java.lang.Object r4 = r0.getValue()
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L43
            X.13BV r4 = X.C13BV.INSTANCE
        L43:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L4a
            return
        L4a:
            X.0FAf r0 = r5.i70()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r0.LIZJ()
            com.ss.android.ugc.aweme.filter.FilterBean r0 = (com.ss.android.ugc.aweme.filter.FilterBean) r0
            if (r0 == 0) goto L5e
            int r3 = r4.indexOf(r0)
            if (r3 >= 0) goto L5f
        L5e:
            r3 = 0
        L5f:
            X.0Gtr r2 = X.EnumC430170Gtr.LEFT
            if (r8 != r2) goto L7d
            int r1 = r3 + (-1)
            java.lang.Object r1 = X.C13LP.LJJJLZIJ(r1, r4)
            com.ss.android.ugc.aweme.filter.FilterBean r1 = (com.ss.android.ugc.aweme.filter.FilterBean) r1
        L6b:
            if (r8 == r2) goto L75
            int r0 = r3 + 1
            java.lang.Object r0 = X.C13LP.LJJJLZIJ(r0, r4)
            com.ss.android.ugc.aweme.filter.FilterBean r0 = (com.ss.android.ugc.aweme.filter.FilterBean) r0
        L75:
            if (r1 == 0) goto L81
            if (r0 == 0) goto L81
            r5.jP1(r1, r0, r7)
            return
        L7d:
            r1 = r0
            goto L6b
        L7f:
            r0 = 0
            goto L5e
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1645270sur.o2(float, X.0Gtr):void");
    }
}

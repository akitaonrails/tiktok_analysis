package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0cp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1026630cp3 implements InterfaceC1026710cpB {
    public final List<InterfaceC1026720cpC> LIZ;
    public final C1026490cop LIZIZ;
    public final int LIZJ;
    public final List<InterfaceC1026740cpE> LIZLLL;
    public final List<InterfaceC1025840cnm> LJ;

    @Override // X.InterfaceC1026710cpB
    public final List<InterfaceC1026740cpE> LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1026710cpB
    public final Object LIZ(InterfaceC1364105Vn<? super C1026670cp7> interfaceC1364105Vn) {
        C1026830cpN c1026830cpN;
        C1026830cpN c1026830cpNLIZ;
        final AbstractC1026880cpS abstractC1026880cpS;
        String str;
        boolean z;
        String str2;
        Context context;
        C1025880cnq c1025880cnqLIZIZ;
        C1025520cnG c1025520cnGLIZ;
        C1025880cnq c1025880cnqLIZIZ2;
        Context context2;
        C1025880cnq c1025880cnqLIZIZ3;
        C1025520cnG c1025520cnGLIZ2;
        Context context3;
        C1025880cnq c1025880cnqLIZIZ4;
        C1025520cnG c1025520cnGLIZ3;
        AbstractC1026880cpS abstractC1026880cpS2 = null;
        if (this.LIZJ >= this.LIZ.size()) {
            try {
                InterfaceC1026720cpC interfaceC1026720cpC = (InterfaceC1026720cpC) C13LP.LJJLIIIJL(this.LIZ);
                if (interfaceC1026720cpC != null && (c1026830cpNLIZ = interfaceC1026720cpC.LIZ()) != null && (abstractC1026880cpS = c1026830cpNLIZ.LIZIZ) != null) {
                    abstractC1026880cpS2 = new AbstractC1026880cpS() { // from class: X.0cpM
                        @Override // X.AbstractC1026880cpS
                        public final C1025520cnG LIZ() {
                            return abstractC1026880cpS.LIZ();
                        }

                        @Override // X.AbstractC1026880cpS
                        public final C1025880cnq LIZIZ() {
                            return abstractC1026880cpS.LIZIZ();
                        }
                    };
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getUnspecifiedInfo() , processorPayload = ");
                sbLIZ.append(abstractC1026880cpS2);
                C2188811AlT.LIZIZ(sbLIZ);
                c1026830cpN = new C1026830cpN("no_one_can_consume", abstractC1026880cpS2, false, false, 28);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getUnspecifiedInfo() exception , message = ");
                    sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                c1026830cpN = new C1026830cpN("no_one_can_consume", null, false, false, 28);
            }
            C1026670cp7 c1026670cp7 = new C1026670cp7(-1, "failed_cause_no_one_can_consume");
            List<InterfaceC1026740cpE> list = this.LIZLLL;
            if (list != null) {
                Iterator<InterfaceC1026740cpE> it2 = list.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(c1026830cpN, c1026670cp7);
                }
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("finishProceedWithNoResponse(),onRouterResult() processorType = ");
            sbLIZ3.append(c1026830cpN.LIZ);
            sbLIZ3.append(", result = ");
            sbLIZ3.append(c1026670cp7);
            C2188811AlT.LIZIZ(sbLIZ3);
            return c1026670cp7;
        }
        InterfaceC1026720cpC interfaceC1026720cpC2 = (InterfaceC1026720cpC) ListProtector.get(this.LIZ, this.LIZJ);
        C1026830cpN c1026830cpNLIZ2 = interfaceC1026720cpC2.LIZ();
        if (this.LIZJ == 0) {
            AbstractC1026880cpS abstractC1026880cpS3 = c1026830cpNLIZ2.LIZIZ;
            if (abstractC1026880cpS3 != null && (c1025520cnGLIZ3 = abstractC1026880cpS3.LIZ()) != null) {
                str = c1025520cnGLIZ3.LIZLLL;
            } else {
                str = null;
            }
            boolean z2 = false;
            if (str != null && !a0.LJJJIL(str)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                AbstractC1026880cpS abstractC1026880cpS4 = c1026830cpNLIZ2.LIZIZ;
                if (abstractC1026880cpS4 != null && (c1025880cnqLIZIZ4 = abstractC1026880cpS4.LIZIZ()) != null) {
                    context3 = c1025880cnqLIZIZ4.LIZ;
                } else {
                    context3 = null;
                }
                C03EJ.LIZ(context3, "your refer is null!! check it!!,the refer can not be null");
            }
            AbstractC1026880cpS abstractC1026880cpS5 = c1026830cpNLIZ2.LIZIZ;
            if (abstractC1026880cpS5 != null && (c1025520cnGLIZ2 = abstractC1026880cpS5.LIZ()) != null) {
                str2 = c1025520cnGLIZ2.LIZIZ;
            } else {
                str2 = null;
            }
            if (str2 == null || a0.LJJJIL(str2)) {
                z2 = true;
            }
            if (z2) {
                AbstractC1026880cpS abstractC1026880cpS6 = c1026830cpNLIZ2.LIZIZ;
                if (abstractC1026880cpS6 != null && (c1025880cnqLIZIZ3 = abstractC1026880cpS6.LIZIZ()) != null) {
                    context2 = c1025880cnqLIZIZ3.LIZ;
                } else {
                    context2 = null;
                }
                C03EJ.LIZ(context2, "your routerScene is null!! check it!!,the routerScene can not be null");
            }
            AbstractC1026880cpS abstractC1026880cpS7 = c1026830cpNLIZ2.LIZIZ;
            if (abstractC1026880cpS7 != null) {
                abstractC1026880cpS7.LIZ();
            }
            AbstractC1026880cpS abstractC1026880cpS8 = c1026830cpNLIZ2.LIZIZ;
            if (abstractC1026880cpS8 != null && (c1025880cnqLIZIZ2 = abstractC1026880cpS8.LIZIZ()) != null) {
                context = c1025880cnqLIZIZ2.LIZ;
            } else {
                context = null;
            }
            C03EJ.LIZ(context, "handle commerce router go()");
            List<InterfaceC1026740cpE> list2 = this.LIZLLL;
            if (list2 != null) {
                for (InterfaceC1026740cpE interfaceC1026740cpE : list2) {
                    AbstractC1026880cpS abstractC1026880cpS9 = c1026830cpNLIZ2.LIZIZ;
                    if (abstractC1026880cpS9 != null) {
                        c1025880cnqLIZIZ = abstractC1026880cpS9.LIZIZ();
                    } else {
                        c1025880cnqLIZIZ = null;
                    }
                    AbstractC1026880cpS abstractC1026880cpS10 = c1026830cpNLIZ2.LIZIZ;
                    if (abstractC1026880cpS10 != null) {
                        c1025520cnGLIZ = abstractC1026880cpS10.LIZ();
                    } else {
                        c1025520cnGLIZ = null;
                    }
                    interfaceC1026740cpE.LIZIZ(c1025880cnqLIZIZ, c1025520cnGLIZ);
                }
            }
        }
        return interfaceC1026720cpC2.LIZIZ(new C1026630cp3(this.LIZ, this.LIZIZ, this.LIZJ + 1, this.LIZLLL, this.LJ), interfaceC1364105Vn);
    }

    public /* synthetic */ C1026630cp3(List list, C1026490cop c1026490cop, List list2, List list3) {
        this(list, c1026490cop, 0, list2, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1026630cp3(List<? extends InterfaceC1026720cpC> list, C1026490cop c1026490cop, int i, List<InterfaceC1026740cpE> list2, List<InterfaceC1025840cnm> list3) {
        this.LIZ = list;
        this.LIZIZ = c1026490cop;
        this.LIZJ = i;
        this.LIZLLL = list2;
        this.LJ = list3;
    }
}

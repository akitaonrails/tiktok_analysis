package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.MiniOspLifeObserver;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS86S1000000_1;

/* JADX INFO: renamed from: X.03c8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C879403c8 {
    public static final C879403c8 LIZ;
    public static LifecycleOwner LIZIZ;
    public static final LinkedList<PaymentInfo> LIZJ;
    public static Region LIZLLL;
    public static AnonymousClass0956 LJ;
    public static final HashMap<String, Boolean> LJFF;
    public static final ReentrantLock LJI;
    public static final ReentrantLock LJII;
    public static final MiniOspLifeObserver LJIIIIZZ;

    static {
        C879403c8 c879403c8 = new C879403c8();
        LIZ = c879403c8;
        LIZJ = new LinkedList<>();
        LJFF = new HashMap<>();
        LJI = new ReentrantLock(true);
        LJII = new ReentrantLock(true);
        LJIIIIZZ = new MiniOspLifeObserver(c879403c8);
    }

    public static void LIZIZ() {
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner = LIZIZ;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(LJIIIIZZ);
        }
        LIZIZ = null;
        AnonymousClass0956 anonymousClass0956 = LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        LIZJ.clear();
        LJ = null;
        LIZLLL = null;
        LJFF.clear();
    }

    public static List LIZLLL() {
        Object objLIZ = C959003oy.LIZ(LJI, AFwS185S0000000_1.get$arr$(80));
        if (C189200o6.m7isFailureimpl(objLIZ)) {
            objLIZ = null;
        }
        List list = (List) objLIZ;
        return list == null ? C13BV.INSTANCE : list;
    }

    public static void LIZ(PaymentInfo paymentInfo) {
        if (paymentInfo == null) {
            return;
        }
        C959003oy.LIZ(LJI, new AwS545S0100000_1(paymentInfo, 1188));
    }

    public static void LJ(String str) {
        if (str == null) {
            return;
        }
        C959003oy.LIZ(LJI, new AwS86S1000000_1(str, 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r15, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C879603cA
            if (r0 == 0) goto L23
            r13 = r3
            X.03cA r13 = (X.C879603cA) r13
            int r2 = r13.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r13.LLILLL = r2
        L14:
            java.lang.Object r0 = r13.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r13.LLILLL
            r6 = 0
            r1 = 1
            if (r2 == 0) goto L31
            if (r2 != r1) goto L29
            goto L4a
        L23:
            X.03cA r13 = new X.03cA
            r13.<init>(r14, r3)
            goto L14
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r0)
            X.03sT r4 = com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi.LIZ     // Catch: java.lang.Throwable -> L5d
            r13.LLILLL = r1     // Catch: java.lang.Throwable -> L5d
            r0 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L5d
            r5 = r15
            r7 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            java.lang.Object r0 = r4.LIZLLL(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L5d
            if (r0 != r3) goto L4d
            return r3
        L4a:
            X.C155000ia.LIZIZ(r0)     // Catch: java.lang.Throwable -> L5d
        L4d:
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0     // Catch: java.lang.Throwable -> L5d
            T r0 = r0.data     // Catch: java.lang.Throwable -> L5d
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData) r0     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r1 = r0.regionInfo     // Catch: java.lang.Throwable -> L5d
        L57:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L5d
            goto L69
        L5b:
            r1 = r6
            goto L57
        L5d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L69:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L70
            return r1
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C879403c8.LIZJ(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region, X.05Vn):java.lang.Object");
    }
}

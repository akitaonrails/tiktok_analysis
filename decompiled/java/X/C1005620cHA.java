package X;

import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cHA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1005620cHA {
    public static final C1005620cHA LIZ = new C1005620cHA();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(556));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(555));
    public static final List<AnonymousClass0957<Boolean>> LIZLLL = new ArrayList();

    static {
        for (Object obj : ServiceManager.get().getServices(ISmartCheckService.class)) {
            LIZ.getClass();
            ((ConcurrentHashMap) LIZJ.getValue()).put(obj, Boolean.TRUE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            r17 = this;
            r3 = r18
            boolean r0 = r3 instanceof X.C1005640cHC
            if (r0 == 0) goto Lb6
            r8 = r3
            X.0cHC r8 = (X.C1005640cHC) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb6
            int r2 = r2 - r1
            r8.LLILLL = r2
        L14:
            java.lang.Object r9 = r8.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r11 = 0
            r6 = 1
            if (r0 == 0) goto L50
            if (r0 != r6) goto Lbf
            X.C155000ia.LIZIZ(r9)
        L25:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            X.13um r0 = X.C20162213um.LIZ
            r0.getClass()
            X.17vp r2 = X.C21187917vp.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "finish init: "
            r1.append(r0)
            java.lang.String r10 = ","
            r13 = 0
            r16 = 62
            r12 = r11
            r14 = r11
            r15 = r11
            java.lang.String r0 = X.C13LP.LJJLIIIJ(r9, r10, r11, r12, r13, r14, r15, r16)
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            r0 = 6
            X.C21187917vp.LIZ(r2, r11, r0)
        L4d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L50:
            X.C155000ia.LIZIZ(r9)
            com.ss.android.ugc.aweme.ecommerce.smartcheck.core.SmartCheckSettingModel r0 = X.C21187717vn.LIZ()
            boolean r0 = r0.enable
            if (r0 != 0) goto L68
            com.ss.android.ugc.aweme.ecommerce.ab.SmartCheckSettingModelV2 r0 = X.C21187817vo.LIZ()
            com.ss.android.ugc.aweme.ecommerce.ab.SmartCheckSettingModelV2$SmartCheckSwitch r0 = r0.switchConfig
            boolean r0 = r0.masterSwitch
            if (r0 != 0) goto L68
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L68:
            X.01GW r0 = X.C1005620cHA.LIZIZ
            java.lang.Object r1 = r0.getValue()
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            r0 = 0
            boolean r0 = r1.compareAndSet(r0, r6)
            if (r0 == 0) goto L4d
            X.01GW r0 = X.C1005620cHA.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r5 = r0.iterator()
        L87:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lab
            java.lang.Object r4 = r5.next()
            com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService r4 = (com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService) r4
            java.util.List<X.0957<java.lang.Boolean>> r3 = X.C1005620cHA.LIZLLL
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            X.0cH5 r1 = new X.0cH5
            r1.<init>(r4, r11)
            r0 = 3
            X.099G r0 = X.C23250099c.LIZIZ(r2, r11, r11, r1, r0)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r0)
            goto L87
        Lab:
            java.util.List<X.0957<java.lang.Boolean>> r0 = X.C1005620cHA.LIZLLL
            r8.LLILLL = r6
            java.lang.Object r9 = X.C1D9F.LIZ(r0, r8)
            if (r9 != r7) goto L25
            return r7
        Lb6:
            X.0cHC r8 = new X.0cHC
            r0 = r17
            r8.<init>(r0, r3)
            goto L14
        Lbf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1005620cHA.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f8  */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01aa -> B:52:0x01c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.String r25, boolean r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, X.InterfaceC1364105Vn<? super kotlin.Unit> r32) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1005620cHA.LIZ(java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }
}

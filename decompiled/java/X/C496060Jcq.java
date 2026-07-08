package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0Jcq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496060Jcq extends AbstractC496140Jcy<C496090Jct> {
    public static final /* synthetic */ int LJFF = 0;

    @Override // X.AbstractC496140Jcy
    public final boolean LIZJ() {
        return false;
    }

    public C496060Jcq(C495920Jcc c495920Jcc, List<? extends AbstractC495790JcP<?>> list) {
        super(c495920Jcc, list);
    }

    @Override // X.AbstractC496140Jcy
    public final Object LIZ(LifecycleCoroutineScope lifecycleCoroutineScope, boolean z) {
        C1DFB c1dfb = C0PEM.LIZJ;
        C099G c099gLIZIZ = C23250099c.LIZIZ(lifecycleCoroutineScope, c1dfb, null, new C496010Jcl(this, z, null), 2);
        C099G c099gLIZIZ2 = C23250099c.LIZIZ(lifecycleCoroutineScope, c1dfb, null, new C496000Jck(this, null), 2);
        List<AbstractC495790JcP<?>> list = this.LIZIZ;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (AbstractC495790JcP<?> abstractC495790JcP : list) {
            linkedHashMap.put(abstractC495790JcP, C23250099c.LIZIZ(lifecycleCoroutineScope, C0PEM.LIZJ, null, new C495900Jca(c099gLIZIZ2, abstractC495790JcP, null), 2));
        }
        return new C496090Jct(c099gLIZIZ, linkedHashMap, C23250099c.LIZIZ(lifecycleCoroutineScope, C0PEM.LIZJ, null, new C495910Jcb(c099gLIZIZ2, null), 2));
    }

    @Override // X.AbstractC496140Jcy
    public final /* bridge */ /* synthetic */ Object LIZIZ(C496090Jct c496090Jct, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(137907);
        Object objLIZLLL = LIZLLL(c496090Jct, interfaceC1364105Vn);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objLIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C496090Jct r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            r0 = 137907(0x21ab3, float:1.93249E-40)
            boolean r8 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            boolean r0 = r11 instanceof X.C496080Jcs
            if (r0 == 0) goto L34
            r7 = r11
            X.0Jcs r7 = (X.C496080Jcs) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L34
            int r2 = r2 - r1
            r7.LLILLL = r2
        L19:
            java.lang.Object r4 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r5) goto L56
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r8 == 0) goto L33
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L33:
            throw r1
        L34:
            X.0Jcs r7 = new X.0Jcs
            r7.<init>(r9, r11)
            goto L19
        L3a:
            X.C155000ia.LIZIZ(r4)
            androidx.lifecycle.MutableLiveData<X.0JdB<X.0Jcw>> r2 = r9.LIZLLL     // Catch: java.lang.Throwable -> La7
            X.0JdB r1 = new X.0JdB     // Catch: java.lang.Throwable -> La7
            r0 = 2
            r1.<init>(r0, r3, r3)     // Catch: java.lang.Throwable -> La7
            r2.setValue(r1)     // Catch: java.lang.Throwable -> La7
            r7.LLILLL = r5     // Catch: java.lang.Throwable -> La7
            java.lang.Object r4 = r10.LIZ(r7)     // Catch: java.lang.Throwable -> La7
            if (r4 != r6) goto L59
            if (r8 == 0) goto L55
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L55:
            return r6
        L56:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Throwable -> La7
        L59:
            X.0Jcw r4 = (X.C496120Jcw) r4     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = "LiveProfileRepository"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = "response Code = "
            r1.append(r0)     // Catch: java.lang.Throwable -> La7
            int r0 = r4.LJ     // Catch: java.lang.Throwable -> La7
            r1.append(r0)     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> La7
            X.C20441214yg.LIZIZ(r2, r0)     // Catch: java.lang.Throwable -> La7
            int r1 = r4.LJ     // Catch: java.lang.Throwable -> La7
            r0 = 4024075(0x3d670b, float:5.63893E-39)
            if (r1 != r0) goto L85
            androidx.lifecycle.MutableLiveData<X.0JdB<X.0Jcw>> r2 = r9.LIZLLL     // Catch: java.lang.Throwable -> La7
            X.0JdB r1 = new X.0JdB     // Catch: java.lang.Throwable -> La7
            r0 = 4
            r1.<init>(r0, r4, r3)     // Catch: java.lang.Throwable -> La7
            r2.setValue(r1)     // Catch: java.lang.Throwable -> La7
            goto L9f
        L85:
            com.bytedance.android.live.base.model.user.User r0 = r4.LIZ     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L94
            androidx.lifecycle.MutableLiveData<X.0JdB<X.0Jcw>> r1 = r9.LIZLLL     // Catch: java.lang.Throwable -> La7
            X.0JdB r0 = new X.0JdB     // Catch: java.lang.Throwable -> La7
            r0.<init>(r5, r4, r3)     // Catch: java.lang.Throwable -> La7
            r1.setValue(r0)     // Catch: java.lang.Throwable -> La7
            goto L9f
        L94:
            androidx.lifecycle.MutableLiveData<X.0JdB<X.0Jcw>> r2 = r9.LIZLLL     // Catch: java.lang.Throwable -> La7
            X.0JdB r1 = new X.0JdB     // Catch: java.lang.Throwable -> La7
            r0 = 3
            r1.<init>(r0, r4, r3)     // Catch: java.lang.Throwable -> La7
            r2.setValue(r1)     // Catch: java.lang.Throwable -> La7
        L9f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r8 == 0) goto La6
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        La6:
            return r0
        La7:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = r1 instanceof X.C094W
            if (r0 == 0) goto Lb7
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r8 == 0) goto Lb6
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lb6:
            return r0
        Lb7:
            if (r8 == 0) goto Lbc
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        Lbc:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C496060Jcq.LIZLLL(X.0Jct, X.05Vn):java.lang.Object");
    }
}

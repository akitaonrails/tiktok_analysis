package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0Lcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C547060Lcu extends AbstractC547050Lct {
    public final C01GW LIZIZ;
    public final AtomicBoolean LIZJ;
    public final C054G LIZLLL;

    public final ICreationAsyncTaskManager LIZJ() {
        return (ICreationAsyncTaskManager) this.LIZIZ.getValue();
    }

    public C547060Lcu(String str) {
        super(str);
        this.LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(488));
        this.LIZJ = new AtomicBoolean(false);
        this.LIZLLL = C2296808zG.LIZ(new C2232408os(C786410Ut5.h4()).plus(C2296908zH.LIZ()));
    }

    public static final void LIZLLL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[AsyncTaskHandle] ");
        sbLIZ.append(str);
        C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    @Override // X.InterfaceC2180908gZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C547080Lcw
            if (r0 == 0) goto Lb9
            r5 = r8
            X.0Lcw r5 = (X.C547080Lcw) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb9
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 0
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L3e
            if (r0 == r2) goto L6c
            if (r0 != r6) goto Lc0
            X.C155000ia.LIZIZ(r1)
        L26:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "acquire completed for taskId: "
            r1.append(r0)
            java.lang.String r0 = r7.LIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LIZLLL(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "acquire called for taskId: "
            r1.append(r0)
            java.lang.String r0 = r7.LIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LIZLLL(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.LIZJ
            r0.set(r2)
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r1 = r7.LIZJ()
            if (r1 == 0) goto L75
            java.lang.String r0 = r7.LIZ
            r5.LLILLL = r2
            java.lang.Object r1 = r1.LJFF(r0, r5)
            if (r1 != r4) goto L6f
            return r4
        L6c:
            X.C155000ia.LIZIZ(r1)
        L6f:
            X.0LSZ r1 = (X.C0LSZ) r1
            if (r1 == 0) goto L75
            java.lang.String r3 = r1.LJ
        L75:
            java.lang.String r0 = "STOPPED"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 == 0) goto L26
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Restoring task: "
            r1.append(r0)
            java.lang.String r0 = r7.LIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LIZLLL(r0)
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r3 = r7.LIZJ()
            if (r3 == 0) goto L26
            java.lang.String r0 = r7.LIZ
            java.util.List r2 = java.util.Collections.singletonList(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "AsyncTaskHandle"
            r1.append(r0)
            java.lang.String r0 = r7.LIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r5.LLILLL = r6
            java.lang.Object r0 = r3.LJIJI(r0, r2, r5)
            if (r0 != r4) goto L26
            return r4
        Lb9:
            X.0Lcw r5 = new X.0Lcw
            r5.<init>(r7, r8)
            goto L12
        Lc0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C547060Lcu.LIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    @Override // X.InterfaceC2180908gZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C547090Lcx
            if (r0 == 0) goto L8d
            r6 = r8
            X.0Lcx r6 = (X.C547090Lcx) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8d
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L53
            if (r0 != r2) goto L93
            X.C155000ia.LIZIZ(r1)
        L24:
            X.0LSZ r1 = (X.C0LSZ) r1
            if (r1 == 0) goto L81
            java.lang.String r0 = r1.LJFF
            boolean r0 = X.C381270ExB.LIZ(r0)
            if (r0 != r2) goto L81
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r1 = r7.LIZJ()
            if (r1 == 0) goto L3b
            java.lang.String r0 = r7.LIZ
            r1.LJII(r0)
        L3b:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "release completed for taskId: "
            r1.append(r0)
            java.lang.String r0 = r7.LIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LIZLLL(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L53:
            X.C155000ia.LIZIZ(r1)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "release called for taskId: "
            r1.append(r0)
            java.lang.String r0 = r7.LIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LIZLLL(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.LIZJ
            r0.set(r3)
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r1 = r7.LIZJ()
            if (r1 == 0) goto L81
            java.lang.String r0 = r7.LIZ
            r6.LLILLL = r2
            java.lang.Object r1 = r1.LJFF(r0, r6)
            if (r1 != r5) goto L24
            return r5
        L81:
            X.054G r2 = r7.LIZLLL
            X.0Lcv r1 = new X.0Lcv
            r1.<init>(r7, r4)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r4, r4, r1, r0)
            goto L3b
        L8d:
            X.0Lcx r6 = new X.0Lcx
            r6.<init>(r7, r8)
            goto L12
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C547060Lcu.LIZIZ(X.05Vn):java.lang.Object");
    }
}

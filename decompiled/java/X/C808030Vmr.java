package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.report.ClickReportInfo;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import com.ss.android.ugc.aweme.report.ShowReportInfo;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Vmr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C808030Vmr implements InterfaceC808200Vn8<String, OutreachFlowReportItem, C795630VIz> {
    public final InterfaceC808060Vmu LIZ;
    public final Gson LIZIZ = C08JS.LIZIZ();
    public final Type LIZJ = new TypeToken<List<ClickReportInfo>>() { // from class: X.0Vmq
    }.getType();

    public C808030Vmr(InterfaceC808060Vmu interfaceC808060Vmu) {
        this.LIZ = interfaceC808060Vmu;
    }

    @Override // X.InterfaceC808200Vn8
    public final String LIZJ(OutreachFlowReportItem outreachFlowReportItem) {
        OutreachInfo outreachInfo = outreachFlowReportItem.outreachInfo;
        if (outreachInfo != null) {
            return outreachInfo.outreachType;
        }
        return null;
    }

    @Override // X.InterfaceC808200Vn8
    public final Pair<String, OutreachFlowReportItem> LJI(C795630VIz c795630VIz) {
        C795630VIz c795630VIz2 = c795630VIz;
        return new Pair<>(c795630VIz2.LIZ, new OutreachFlowReportItem((OutreachInfo) GsonProtectorUtils.fromJson(this.LIZIZ, c795630VIz2.LJII, OutreachInfo.class), null, c795630VIz2.LIZLLL, c795630VIz2.LJ, (ShowReportInfo) GsonProtectorUtils.fromJson(this.LIZIZ, c795630VIz2.LJFF, ShowReportInfo.class), (List) GsonProtectorUtils.fromJson(this.LIZIZ, c795630VIz2.LJI, this.LIZJ)));
    }

    @Override // X.InterfaceC808200Vn8
    public final Object LIZ(List list, C808150Vn3 c808150Vn3) {
        if (((ArrayList) list).isEmpty()) {
            return Unit.LIZ;
        }
        InterfaceC808060Vmu interfaceC808060Vmu = this.LIZ;
        if (interfaceC808060Vmu != null) {
            Object objLIZ = interfaceC808060Vmu.LIZ(list, c808150Vn3);
            if (objLIZ == C099R.LJFF()) {
                return objLIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC808200Vn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.util.Set<java.lang.String> r7, X.InterfaceC1364105Vn<? super java.util.List<? extends X.C795630VIz>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C808040Vms
            if (r0 == 0) goto L5b
            r5 = r8
            X.0Vms r5 = (X.C808040Vms) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5b
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 == r1) goto L53
            if (r0 != r2) goto L61
            X.C155000ia.LIZIZ(r4)
        L25:
            if (r4 != 0) goto L29
        L27:
            X.13BV r4 = X.C13BV.INSTANCE
        L29:
            return r4
        L2a:
            X.C155000ia.LIZIZ(r4)
            if (r7 == 0) goto L46
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L46
            X.0Vmu r1 = r6.LIZ
            if (r1 == 0) goto L27
            java.util.List r0 = X.C13LP.LLIIII(r7)
            r5.LLILLL = r2
            java.lang.Object r4 = r1.LIZJ(r0, r5)
            if (r4 != r3) goto L25
            return r3
        L46:
            X.0Vmu r0 = r6.LIZ
            if (r0 == 0) goto L58
            r5.LLILLL = r1
            java.lang.Object r4 = r0.LIZLLL(r5)
            if (r4 != r3) goto L56
            return r3
        L53:
            X.C155000ia.LIZIZ(r4)
        L56:
            if (r4 != 0) goto L29
        L58:
            X.13BV r4 = X.C13BV.INSTANCE
            return r4
        L5b:
            X.0Vms r5 = new X.0Vms
            r5.<init>(r6, r8)
            goto L12
        L61:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C808030Vmr.LIZLLL(java.util.Set, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    @Override // X.InterfaceC808200Vn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(java.lang.String r6, X.InterfaceC1364105Vn<? super java.lang.Integer> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C808050Vmt
            if (r0 == 0) goto L45
            r4 = r7
            X.0Vmt r4 = (X.C808050Vmt) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L4b
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L28:
            java.lang.Integer r0 = X.C2286608xc.LJ(r1)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r1)
            r1 = 0
            if (r6 != 0) goto L38
            java.lang.Integer r0 = X.C2286608xc.LJ(r1)
            return r0
        L38:
            X.0Vmu r0 = r5.LIZ
            if (r0 == 0) goto L28
            r4.LLILLL = r2
            java.lang.Object r1 = r0.LJ(r6, r4)
            if (r1 != r3) goto L22
            return r3
        L45:
            X.0Vmt r4 = new X.0Vmt
            r4.<init>(r5, r7)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C808030Vmr.LJFF(java.lang.String, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC808200Vn8
    public final Object LIZIZ(int i, String str, C808150Vn3 c808150Vn3) {
        if (str != null && i > 0) {
            InterfaceC808060Vmu interfaceC808060Vmu = this.LIZ;
            if (interfaceC808060Vmu != null) {
                Object objLIZIZ = interfaceC808060Vmu.LIZIZ(i, str, c808150Vn3);
                if (objLIZIZ == C099R.LJFF()) {
                    return objLIZIZ;
                }
                return Unit.LIZ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    @Override // X.InterfaceC808200Vn8
    public final Object LJ(long j, Object obj, Object obj2) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        String str;
        String str2 = (String) obj;
        OutreachFlowReportItem outreachFlowReportItem = (OutreachFlowReportItem) obj2;
        try {
            c098200Yq = this.LIZIZ.LJIILLIIL(outreachFlowReportItem.outreachInfo, OutreachInfo.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj3 = "{}";
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = "{}";
        }
        String str3 = (String) c098200Yq;
        String str4 = outreachFlowReportItem.triggerScene;
        String str5 = outreachFlowReportItem.triggerSession;
        try {
            c098200Yq2 = this.LIZIZ.LJIILLIIL(outreachFlowReportItem.showReportInfo, ShowReportInfo.class);
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) == null) {
            obj3 = c098200Yq2;
        }
        String str6 = (String) obj3;
        try {
            c098200Yq3 = this.LIZIZ.LJIILL(outreachFlowReportItem.clickReportInfo);
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq3) != null) {
            c098200Yq3 = "[]";
        }
        String str7 = (String) c098200Yq3;
        OutreachInfo outreachInfo = outreachFlowReportItem.outreachInfo;
        String str8 = null;
        if (outreachInfo != null) {
            str8 = outreachInfo.outreachType;
            str = outreachInfo.outreachKey;
        } else {
            str = null;
        }
        return new C795630VIz(str2, j, str, str8, str4, str5, str6, str7, str3);
    }
}

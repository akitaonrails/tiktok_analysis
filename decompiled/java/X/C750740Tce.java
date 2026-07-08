package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.UserHonor;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750740Tce {
    public static final /* synthetic */ int LJIIL = 0;
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final ImageModel LJ;
    public final UserHonor LJFF;
    public int LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public Map<Integer, Integer> LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;

    public C750740Tce() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C750740Tce)) {
            return false;
        }
        C750740Tce c750740Tce = (C750740Tce) obj;
        return this.LIZ == c750740Tce.LIZ && Intrinsics.LJFF(this.LIZIZ, c750740Tce.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c750740Tce.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c750740Tce.LIZLLL) && Intrinsics.LJFF(this.LJ, c750740Tce.LJ) && Intrinsics.LJFF(this.LJFF, c750740Tce.LJFF);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode = (iY2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageModel imageModel = this.LJ;
        int iHashCode3 = (iHashCode2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        UserHonor userHonor = this.LJFF;
        return iHashCode3 + (userHonor != null ? userHonor.hashCode() : 0);
    }

    public /* synthetic */ C750740Tce(int i) {
        this(0L, "", null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.lang.Integer r14, X.InterfaceC1364105Vn<? super java.lang.Integer> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C750750Tcf
            if (r0 == 0) goto L20
            r12 = r15
            X.0Tcf r12 = (X.C750750Tcf) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r12.LLILLL = r2
        L12:
            java.lang.Object r1 = r12.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r12.LLILLL
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            goto L62
        L20:
            X.0Tcf r12 = new X.0Tcf
            r12.<init>(r13, r15)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L72
            java.lang.Class<com.bytedance.android.live.usermanage.model.CommerceApi> r0 = com.bytedance.android.live.usermanage.model.CommerceApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L72
            java.lang.Object r4 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L72
            com.bytedance.android.live.usermanage.model.CommerceApi r4 = (com.bytedance.android.live.usermanage.model.CommerceApi) r4     // Catch: java.lang.Exception -> L72
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()     // Catch: java.lang.Exception -> L72
            X.0Jki r0 = r0.user()     // Catch: java.lang.Exception -> L72
            long r5 = r13.LIZ     // Catch: java.lang.Exception -> L72
            long r7 = r0.getCurrentUserId()     // Catch: java.lang.Exception -> L72
            X.1DgM r0 = r0.getCurrentUser()     // Catch: java.lang.Exception -> L72
            java.lang.String r9 = r0.getSecUid()     // Catch: java.lang.Exception -> L72
            java.lang.String r10 = r13.LIZIZ     // Catch: java.lang.Exception -> L72
            r12.LLILLL = r2     // Catch: java.lang.Exception -> L72
            r11 = r14
            java.lang.Object r1 = r4.checkAdminECommercePermission(r5, r7, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L72
            if (r1 != r3) goto L65
            return r3
        L62:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L72
        L65:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Exception -> L72
            T r0 = r1.data     // Catch: java.lang.Exception -> L72
            com.bytedance.android.live.usermanage.model.CheckAdminECommercePermissionData r0 = (com.bytedance.android.live.usermanage.model.CheckAdminECommercePermissionData) r0     // Catch: java.lang.Exception -> L72
            int r0 = r0.status     // Catch: java.lang.Exception -> L72
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> L72
            return r0
        L72:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            boolean r1 = r2 instanceof X.C501520Jle
            r0 = 0
            if (r1 == 0) goto L88
            X.0Jle r2 = (X.C501520Jle) r2
        L7d:
            if (r2 == 0) goto L87
            int r0 = r2.getErrorCode()
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
        L87:
            return r0
        L88:
            r2 = r0
            goto L7d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C750740Tce.LIZ(java.lang.Integer, X.05Vn):java.lang.Object");
    }

    public C750740Tce(long j, String str, String str2, String str3, ImageModel imageModel, UserHonor userHonor) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = imageModel;
        this.LJFF = userHonor;
    }
}

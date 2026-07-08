package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ilQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity$performSave$1", f = "ProfileBgImagePreviewActivity.kt", l = {635}, m = "invokeSuspend")
public final class C1255020ilQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ProfileBgImagePreviewActivity LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1255020ilQ(ProfileBgImagePreviewActivity profileBgImagePreviewActivity, Bitmap bitmap, InterfaceC1364105Vn<? super C1255020ilQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = profileBgImagePreviewActivity;
        this.LLILLL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1255020ilQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r8 = "ProfileBgImagePreviewActivity@7895.performSave$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LL
            r7 = 1
            if (r0 == 0) goto L19
            if (r0 != r7) goto La8
            X.C155000ia.LIZIZ(r10)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L19:
            X.C155000ia.LIZIZ(r10)
            r5 = 0
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = "profile_background_"
            r2.append(r0)     // Catch: java.lang.Exception -> L6a
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L6a
            r2.append(r0)     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = ".png"
            r2.append(r0)     // Catch: java.lang.Exception -> L6a
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r2)     // Catch: java.lang.Exception -> L6a
            com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity r0 = r9.LLILLJJLI     // Catch: java.lang.Exception -> L6a
            android.net.Uri r1 = X.C2400409as.LIZ(r0, r1)     // Catch: java.lang.Exception -> L6a
            com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity r0 = r9.LLILLJJLI     // Catch: java.lang.Exception -> L6a
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Exception -> L6a
            java.io.OutputStream r3 = X.C09NT.LJFF(r0, r1)     // Catch: java.lang.Exception -> L6a
            if (r3 == 0) goto L90
            android.graphics.Bitmap r2 = r9.LLILLL     // Catch: java.lang.Exception -> L6a
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L55
            r0 = 100
            r2.compress(r1, r0, r3)     // Catch: java.lang.Throwable -> L55
            X.C2107108Nh.LIZ(r3, r5)     // Catch: java.lang.Exception -> L6a
            goto L90
        L55:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L5c
            throw r1     // Catch: java.lang.Throwable -> L5a
        L5a:
            r0 = move-exception
            goto L5e
        L5c:
            r0 = move-exception
            r1 = r5
        L5e:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L62
            goto L64
        L62:
            r0 = move-exception
            goto L5e
        L64:
            X.C2107108Nh.LIZ(r3, r1)     // Catch: java.lang.Exception -> L68
            throw r0     // Catch: java.lang.Exception -> L68
        L68:
            r4 = move-exception
            goto L6b
        L6a:
            r4 = move-exception
        L6b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r4)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "performSave failed: "
            r1.append(r0)
            java.lang.String r0 = r4.getMessage()
            r1.append(r0)
            java.lang.String r3 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r2 = "ProfileBgImagePreview"
            X.0ijX r1 = X.EnumC1253850ijX.OTHERS
            java.lang.String r0 = ""
            X.C1248210iaR.LIZJ(r2, r3, r1, r0)
            X.C1AF0.LJ(r4)
            r3 = 0
            goto L91
        L90:
            r3 = 1
        L91:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0Cg7 r1 = new X.0Cg7
            com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity r0 = r9.LLILLJJLI
            r1.<init>(r0, r3, r5)
            r9.LL = r7
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r6) goto L13
            X.C1C7U.LIZIZ(r8)
            return r6
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1255020ilQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

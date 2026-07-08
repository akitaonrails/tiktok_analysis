package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarCreateRequest;
import com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarCreationApi;
import com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarTaskStatusResponse;

/* JADX INFO: renamed from: X.0HEN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HEN implements C0HES {
    public static final C0HEW LIZIZ = new C0HEW();
    public final SocialAvatarCreationApi LIZ;

    public C0HEN(SocialAvatarCreationApi socialAvatarCreationApi) {
        this.LIZ = socialAvatarCreationApi;
    }

    @Override // X.C0HES
    public final Object LIZJ(C442710HXp c442710HXp) {
        return LIZIZ.LIZ(new C0HEM(this, null), c442710HXp);
    }

    @Override // X.C0HES
    public final Object LIZ(SocialAvatarCreateRequest socialAvatarCreateRequest, C0HHL c0hhl) {
        if (!C1644806cI.LIZJ()) {
            return new C0HET(new IllegalStateException("Experiment not enabled"));
        }
        return LIZIZ.LIZIZ(c0hhl, new C0HEP(this, socialAvatarCreateRequest, null));
    }

    public final Object LJ(String str, InterfaceC1364105Vn<? super SocialAvatarTaskStatusResponse> interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(202537);
        if (!C1644806cI.LIZJ()) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
            return null;
        }
        Object objLIZ = LIZIZ.LIZ(new C0HEL(this, str, null), interfaceC1364105Vn);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objLIZ;
    }

    public final Object LJFF(String str, AbstractC23140094w abstractC23140094w) {
        if (!C1644806cI.LIZJ()) {
            return null;
        }
        return LIZIZ.LIZ(new C0HEK(this, str, 6, null), abstractC23140094w);
    }

    @Override // X.C0HES
    public final Object LIZIZ(long j, int i, String str, C442730HXr c442730HXr) {
        return LIZIZ.LIZ(new C0HEO(j, 1, i, this, str, null), c442730HXr);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(int r9, long r10, long r12, X.InterfaceC1364105Vn r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof X.C0HER
            if (r0 == 0) goto L4f
            r7 = r14
            X.0HER r7 = (X.C0HER) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4f
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 1
            if (r0 == 0) goto L28
            if (r0 != r5) goto L55
            X.C155000ia.LIZIZ(r1)
        L22:
            X.08Uu r1 = (X.AbstractC2126608Uu) r1
            r1.checkValid()
            return r1
        L28:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = X.C1644806cI.LIZIZ()
            if (r0 != 0) goto L33
            r0 = 0
            return r0
        L33:
            com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarCreationApi r4 = r8.LIZ
            com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarLikeRequest r3 = new com.ss.android.ugc.profile.business.ur.socialavatar.network.SocialAvatarLikeRequest
            java.lang.Long r2 = X.C2286608xc.LJFF(r10)
            java.lang.Long r1 = X.C2286608xc.LJFF(r12)
            java.lang.Integer r0 = X.C2286608xc.LJ(r9)
            r3.<init>(r2, r1, r0)
            r7.LLILLL = r5
            java.lang.Object r1 = r4.commitSocialAvatarLikeAction(r3, r7)
            if (r1 != r6) goto L22
            return r6
        L4f:
            X.0HER r7 = new X.0HER
            r7.<init>(r8, r14)
            goto L12
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HEN.LIZLLL(int, long, long, X.05Vn):java.lang.Object");
    }
}

package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HZF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.entrances.SocialAvatarProfileFloatingNoticeUtil$showFloatingNotice$1", f = "SocialAvatarProfileFloatingNoticeUtil.kt", l = {113, 120}, m = "invokeSuspend")
public final class C0HZF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC20660715sz LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ C1257230ioz LLILZ;
    public final /* synthetic */ C0HZD LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HZF(InterfaceC20660715sz interfaceC20660715sz, Activity activity, C1257230ioz c1257230ioz, C0HZD c0hzd, InterfaceC1364105Vn<? super C0HZF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC20660715sz;
        this.LLILLL = activity;
        this.LLILZ = c1257230ioz;
        this.LLILZIL = c0hzd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HZF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            r11 = r15
            java.lang.String r6 = "SocialAvatarProfileFloatingNoticeUtil@ac82.showFloatingNotice$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r14.LL
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L1d
            if (r0 == r5) goto L47
            if (r0 != r4) goto L6c
            X.C155000ia.LIZIZ(r11)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r11)
            X.0HZH r0 = X.C0HZH.LIZ
            r0.getClass()
            X.01GW r0 = X.C0HZH.LIZJ
            java.lang.Object r2 = r0.getValue()
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarService r2 = (com.ss.android.ugc.ur.socialavatar.ISocialAvatarService) r2
            if (r2 == 0) goto L17
            boolean r0 = X.C435330H5f.LIZ()
            if (r0 == 0) goto L44
            java.lang.String r1 = "social_avatar_icon_img"
        L37:
            r14.LL = r5
            r0 = 0
            java.lang.Object r11 = r2.LIZ(r1, r0, r14)
            if (r11 != r3) goto L4a
            X.C1C7U.LIZIZ(r6)
            return r3
        L44:
            java.lang.String r1 = "social_avatar_floating_notice"
            goto L37
        L47:
            X.C155000ia.LIZIZ(r11)
        L4a:
            X.01bL r11 = (X.C364901bL) r11
            if (r11 == 0) goto L17
            X.15sz r8 = r14.LLILLJJLI
            android.app.Activity r9 = r14.LLILLL
            X.0ioz r10 = r14.LLILZ
            X.0HZD r12 = r14.LLILZIL
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.0HZG r7 = new X.0HZG
            r13 = 0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r14.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r14, r0, r7)
            if (r0 != r3) goto L17
            X.C1C7U.LIZIZ(r6)
            return r3
        L6c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0HZF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

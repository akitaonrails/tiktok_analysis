package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl$showDMNewStickersPopup$1", f = "SocialAvatarServiceImpl.kt", l = {782, 786}, m = "invokeSuspend")
public final class C437440HDi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SocialAvatarServiceImpl LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C19EG LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C0HXZ LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437440HDi(SocialAvatarServiceImpl socialAvatarServiceImpl, String str, boolean z, C19EG c19eg, String str2, String str3, C0HXZ c0hxz, InterfaceC1364105Vn<? super C437440HDi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = socialAvatarServiceImpl;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = c19eg;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = c0hxz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437440HDi(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            java.lang.String r8 = "SocialAvatarServiceImpl@45de.showDMNewStickersPopup$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r3 = X.C099R.LJFF()
            r4 = r18
            int r0 = r4.LL
            java.lang.String r7 = "has_fetched_aiself_side_task_status"
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L20
            if (r0 == r6) goto L4d
            if (r0 != r2) goto L90
            X.C155000ia.LIZIZ(r19)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L20:
            X.C155000ia.LIZIZ(r19)
            X.0HYP r0 = X.C0HYP.LIZ
            r0.getClass()
            com.bytedance.keva.Keva r1 = X.C0HYP.LJ()
            r0 = 0
            boolean r0 = r1.getBoolean(r7, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L69
            com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl r0 = r4.LLILLJJLI
            X.01GW r0 = r0.LIZ
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService r1 = (com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService) r1
            java.lang.String r0 = r4.LLILLL
            r4.LL = r6
            java.lang.Object r0 = r1.LIZIZ(r0, r4)
            if (r0 != r3) goto L50
            X.C1C7U.LIZIZ(r8)
            return r3
        L4d:
            X.C155000ia.LIZIZ(r19)
        L50:
            com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl r0 = r4.LLILLJJLI
            X.0zpH r5 = r0.LJIJJ()
            java.lang.String r1 = "SocialAvatarService"
            java.lang.String r0 = "sa_dm_stickers_sheet fetched social avatar status"
            r5.LIZ(r1, r0)
            X.0HYP r0 = X.C0HYP.LIZ
            r0.getClass()
            com.bytedance.keva.Keva r0 = X.C0HYP.LJ()
            r0.storeBoolean(r7, r6)
        L69:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0HDj r9 = new X.0HDj
            com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl r10 = r4.LLILLJJLI
            java.lang.String r11 = r4.LLILLL
            boolean r12 = r4.LLILZ
            X.19EG r13 = r4.LLILZIL
            java.lang.String r14 = r4.LLILZLL
            java.lang.String r15 = r4.LLIZ
            X.0HXZ r0 = r4.LLIZLLLIL
            r17 = 0
            r16 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r4.LL = r2
            java.lang.Object r0 = X.C23250099c.LJI(r4, r1, r9)
            if (r0 != r3) goto L1a
            X.C1C7U.LIZIZ(r8)
            return r3
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C437440HDi.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

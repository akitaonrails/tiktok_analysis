package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NoS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$onRefreshInternal$5", f = "BulletinProfileViewModel.kt", l = {599, 608, 608}, m = "invokeSuspend")
public final class C605180NoS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ BulletinProfileViewModel LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605180NoS(boolean z, BulletinProfileViewModel bulletinProfileViewModel, long j, InterfaceC1364105Vn<? super C605180NoS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = z;
        this.LLILZIL = bulletinProfileViewModel;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C605180NoS c605180NoS = new C605180NoS(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c605180NoS.LLILLL = obj;
        return c605180NoS;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r4 = r19
            java.lang.String r11 = "BulletinProfileViewModel@3b06.onRefreshInternal$5"
            X.C1C7U.LIZ(r11)
            java.lang.Object r8 = X.C099R.LJFF()
            r6 = r18
            int r0 = r6.LLILLJJLI
            r9 = 3
            r7 = 2
            r3 = 1
            if (r0 == 0) goto L33
            if (r0 == r3) goto L54
            if (r0 == r7) goto L9f
            if (r0 != r9) goto Lc0
            java.lang.Object r3 = r6.LL
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse r3 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse) r3
            java.lang.Object r2 = r6.LLILLL
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel r2 = (com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel) r2
            X.C155000ia.LIZIZ(r4)
        L25:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingList r4 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinSettingList) r4
            long r5 = r6.LLILZLL
            r7 = 0
            r2.LQ2(r3, r4, r5, r7)
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L33:
            X.C155000ia.LIZIZ(r4)
            java.lang.Object r10 = r6.LLILLL
            X.01wk r10 = (X.InterfaceC497601wk) r10
            boolean r0 = r6.LLILZ
            if (r0 == 0) goto L72
            boolean r0 = X.C0OJX.LIZIZ()
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel r2 = r6.LLILZIL
            long r0 = r6.LLILZLL
            r6.LLILLJJLI = r3
            java.lang.Object r4 = r2.AQ2(r0, r6)
            if (r4 != r8) goto L57
            X.C1C7U.LIZIZ(r11)
            return r8
        L54:
            X.C155000ia.LIZIZ(r4)
        L57:
            kotlin.Pair r4 = (kotlin.Pair) r4
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel r12 = r6.LLILZIL
            java.lang.Object r13 = r4.getFirst()
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse r13 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse) r13
            r14 = 0
            long r15 = r6.LLILZLL
            java.lang.Object r0 = r4.getSecond()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r17 = r0.booleanValue()
            r12.LQ2(r13, r14, r15, r17)
            goto L2d
        L72:
            X.0NoR r3 = new X.0NoR
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel r2 = r6.LLILZIL
            long r0 = r6.LLILZLL
            r5 = 0
            r3.<init>(r2, r0, r5)
            X.099G r4 = X.C23250099c.LIZIZ(r10, r5, r5, r3, r9)
            X.0NoQ r3 = new X.0NoQ
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel r2 = r6.LLILZIL
            long r0 = r6.LLILZLL
            r3.<init>(r2, r0, r5)
            X.099G r0 = X.C23250099c.LIZIZ(r10, r5, r5, r3, r9)
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel r2 = r6.LLILZIL
            r6.LLILLL = r0
            r6.LL = r2
            r6.LLILLJJLI = r7
            java.lang.Object r4 = r4.LJLIIIL(r6)
            if (r4 != r8) goto Laa
            X.C1C7U.LIZIZ(r11)
            return r8
        L9f:
            java.lang.Object r2 = r6.LL
            com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel r2 = (com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel) r2
            java.lang.Object r0 = r6.LLILLL
            X.0957 r0 = (X.AnonymousClass0957) r0
            X.C155000ia.LIZIZ(r4)
        Laa:
            com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse r4 = (com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinAccountInfoResponse) r4
            r6.LLILLL = r2
            r6.LL = r4
            r6.LLILLJJLI = r9
            java.lang.Object r0 = r0.LJLIIIL(r6)
            if (r0 != r8) goto Lbc
            X.C1C7U.LIZIZ(r11)
            return r8
        Lbc:
            r3 = r4
            r4 = r0
            goto L25
        Lc0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C605180NoS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

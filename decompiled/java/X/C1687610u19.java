package X;

import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.ConnectNowFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u19, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.nearby.ui.ConnectNowFragment$tryLoadBgm$2", f = "ConnectNowFragment.kt", l = {416}, m = "invokeSuspend")
public final class C1687610u19 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ConnectNowFragment LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687610u19(ConnectNowFragment connectNowFragment, boolean z, InterfaceC1364105Vn<? super C1687610u19> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = connectNowFragment;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1687610u19 c1687610u19 = new C1687610u19(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1687610u19.LLILLJJLI = obj;
        return c1687610u19;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "ConnectNowFragment@7e4a.tryLoadBgm$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LL
            r7 = 1
            if (r0 == 0) goto L19
            if (r0 != r7) goto L11
            goto L56
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.aweme.relation.ffp.nearby.ui.ConnectNowFragment r5 = r9.LLILLL
            boolean r4 = r9.LLILZ
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Throwable -> L5f
            java.lang.Class<com.ss.android.ugc.aweme.music.service.IMusicService> r0 = com.ss.android.ugc.aweme.music.service.IMusicService.class
            java.lang.Object r1 = r1.getService(r0)     // Catch: java.lang.Throwable -> L5f
            com.ss.android.ugc.aweme.music.service.IMusicService r1 = (com.ss.android.ugc.aweme.music.service.IMusicService) r1     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            if (r1 == 0) goto L5b
            java.lang.String r0 = r5.LLJI     // Catch: java.lang.Throwable -> L5f
            com.ss.android.ugc.aweme.music.model.Music r0 = r1.LJII(r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L5b
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = r0.convertToMusicModel()     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L5b
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Throwable -> L5f
            X.08pq r0 = X.C2107308Nj.LIZ     // Catch: java.lang.Throwable -> L5f
            X.08pq r1 = r0.LLIILII()     // Catch: java.lang.Throwable -> L5f
            X.0u1A r0 = new X.0u1A     // Catch: java.lang.Throwable -> L5f
            r0.<init>(r5, r4, r2, r3)     // Catch: java.lang.Throwable -> L5f
            r9.LL = r7     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r0 = X.C23250099c.LJI(r9, r1, r0)     // Catch: java.lang.Throwable -> L5f
            if (r0 != r6) goto L59
            X.C1C7U.LIZIZ(r8)
            return r6
        L56:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> L5f
        L59:
            kotlin.Unit r3 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L5f
        L5b:
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L5f
            goto L6b
        L5f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L6b:
            com.ss.android.ugc.aweme.relation.ffp.nearby.ui.ConnectNowFragment r0 = r9.LLILLL
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r3)
            if (r3 == 0) goto L7c
            X.0zpH r2 = r0.LLJ
            java.lang.String r1 = "ConnectNowMatchVM"
            java.lang.String r0 = "connect now music fetching failed"
            r2.LIZJ(r1, r0, r3)
        L7c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1687610u19.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

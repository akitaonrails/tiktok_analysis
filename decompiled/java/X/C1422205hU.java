package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper$handleFailedInMain$1", f = "ReplaceMusicWithMovieHelper.kt", l = {}, m = "invokeSuspend")
public final class C1422205hU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ReplaceMusicWithMovieHelper LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1422205hU(ReplaceMusicWithMovieHelper replaceMusicWithMovieHelper, Aweme aweme, long j, InterfaceC1364105Vn<? super C1422205hU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = replaceMusicWithMovieHelper;
        this.LLILLJJLI = aweme;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1422205hU(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r3 = "ReplaceMusicWithMovieHelper@8c47.handleFailedInMain$1"
            X.C1C7U.LIZ(r3)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r11)
            X.0mGx r2 = new X.0mGx
            com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper r0 = r10.LL
            android.app.Activity r0 = r0.LL
            if (r0 != 0) goto L14
            r0 = 0
        L14:
            r2.<init>(r0)
            r0 = 2131832379(0x7f112e3b, float:1.929781E38)
            r2.LJIIIZ(r0)
            com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper r0 = r10.LL
            X.05vl r0 = r0.LLILLJJLI
            if (r0 == 0) goto L5f
            boolean r1 = r0.LIZIZ
            r0 = 1
            if (r1 != r0) goto L5f
        L28:
            r2.LIZ(r0)
            r2.LJIIJJI()
            com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper r0 = r10.LL
            com.ss.android.ugc.aweme.main.replace.ReplaceMusicWithMovieHelper.LIZJ(r0)
            java.lang.Class<com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService> r4 = com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService.class
            r5 = 0
            r8 = 14
            r9 = 0
            r6 = r5
            r7 = r5
            java.lang.Object r4 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r4, r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService r4 = (com.ss.android.ugc.aweme.port.in.IReplaceMusicDownloadService) r4
            if (r4 == 0) goto L59
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.LLILLJJLI
            java.lang.String r9 = r0.getGroupId()
            if (r9 != 0) goto L4d
            java.lang.String r9 = ""
        L4d:
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = r10.LLILLJJLI
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = r10.LLILLL
            long r6 = r6 - r0
            r4.LJFF(r5, r6, r8, r9)
        L59:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r3)
            return r0
        L5f:
            r0 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1422205hU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

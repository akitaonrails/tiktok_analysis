package X;

import android.view.View;
import com.ss.android.ugc.aweme.share.qrcode.util.ShareLinkServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e4x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.qrcode.util.ShareLinkServiceImpl$showShareProfileDialog$1$2$1$clickChannelView$1", f = "ShareLinkServiceImpl.kt", l = {235, 238}, m = "invokeSuspend")
public final class C1074930e4x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ InterfaceC1369790lkX LLILLL;
    public final /* synthetic */ ShareLinkServiceImpl LLILZ;
    public final /* synthetic */ C19EG LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1074930e4x(View view, InterfaceC1369790lkX interfaceC1369790lkX, ShareLinkServiceImpl shareLinkServiceImpl, C19EG c19eg, InterfaceC1364105Vn<? super C1074930e4x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = interfaceC1369790lkX;
        this.LLILZ = shareLinkServiceImpl;
        this.LLILZIL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1074930e4x(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "ShareLinkServiceImpl@e626.showShareProfileDialog$1$2$1$clickChannelView$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r7.LL
            r2 = 0
            r5 = 1
            r4 = 2
            if (r0 == 0) goto L5d
            if (r0 == r5) goto La1
            if (r0 != r4) goto L99
            X.C155000ia.LIZIZ(r8)
        L17:
            X.0lnB r8 = (X.C1371430lnB) r8
            X.0lmP r1 = com.ss.android.ugc.aweme.sharer.model.SharePackage.Companion
            java.lang.String r0 = r8.LIZLLL
            r1.getClass()
            int r0 = r0.length()
            if (r0 <= 0) goto L4c
            X.0lkX r1 = r7.LLILLL
            X.19EG r0 = r7.LLILZIL
            boolean r0 = r1.LJJIFFI(r8, r0, r2)
            if (r0 == 0) goto L46
            X.0lkX r0 = r7.LLILLL
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel
            if (r0 == 0) goto L46
            X.0mGx r1 = new X.0mGx
            X.19EG r0 = r7.LLILZIL
            r1.<init>(r0)
            r0 = 2131829543(0x7f112327, float:1.9292058E38)
            r1.LJIIIZ(r0)
            r1.LJIIJJI()
        L46:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L4c:
            X.0mGx r1 = new X.0mGx
            X.19EG r0 = r7.LLILZIL
            r1.<init>(r0)
            r0 = 2131848062(0x7f116b7e, float:1.932962E38)
            r1.LJIIIZ(r0)
            r1.LJIIJJI()
            goto L46
        L5d:
            X.C155000ia.LIZIZ(r8)
            java.lang.String r0 = com.bytedance.tux.sheet.sheet.TuxSheet._pnsPageId
            android.view.View r1 = r7.LLILLJJLI
            X.0De7 r0 = X.C343970De7.LIZ
            X.C1391190mJ3.LJ(r1, r0)
            X.0lkX r0 = r7.LLILLL
            java.lang.String r1 = r0.key()
            java.lang.String r0 = "instagram_story"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L89
            com.ss.android.ugc.aweme.share.qrcode.util.ShareLinkServiceImpl r2 = r7.LLILZ
            X.0lkX r1 = r7.LLILLL
            X.19EG r0 = r7.LLILZIL
            r7.LL = r5
            java.lang.Object r0 = r2.LJI(r1, r0, r7)
            if (r0 != r3) goto La4
            X.C1C7U.LIZIZ(r6)
            return r3
        L89:
            com.ss.android.ugc.aweme.share.qrcode.util.ShareLinkServiceImpl r1 = r7.LLILZ
            X.0lkX r0 = r7.LLILLL
            r7.LL = r4
            java.lang.Object r8 = r1.LIZLLL(r0, r2, r7)
            if (r8 != r3) goto L17
            X.C1C7U.LIZIZ(r6)
            return r3
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La1:
            X.C155000ia.LIZIZ(r8)
        La4:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1074930e4x.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

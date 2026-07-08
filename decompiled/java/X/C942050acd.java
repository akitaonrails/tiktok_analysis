package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0acd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji.MultiGuestMicSeatEmojiPlayer$checkPositionHasChangedAndClearEmojiView$1", f = "MultiGuestMicSeatEmojiPlayer.kt", l = {357}, m = "invokeSuspend")
public final class C942050acd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C942410adD LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C942050acd(C942410adD c942410adD, InterfaceC1364105Vn<? super C942050acd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c942410adD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C942050acd(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.String r3 = "MultiGuestMicSeatEmojiPlayer@e495.checkPositionHasChangedAndClearEmojiView$1"
            X.C1C7U.LIZ(r3)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LL
            r1 = 1
            if (r0 == 0) goto L98
            if (r0 != r1) goto La9
            X.C155000ia.LIZIZ(r5)
        L13:
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            r2 = 0
            if (r5 == 0) goto L96
            int r0 = r5.top
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
        L1e:
            X.0adD r0 = r4.LLILLJJLI
            android.graphics.Rect r0 = r0.LJFF
            if (r0 == 0) goto L94
            int r0 = r0.top
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
        L2a:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7e
            if (r5 == 0) goto L92
            int r0 = r5.bottom
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
        L38:
            X.0adD r0 = r4.LLILLJJLI
            android.graphics.Rect r0 = r0.LJFF
            if (r0 == 0) goto L90
            int r0 = r0.bottom
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
        L44:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7e
            if (r5 == 0) goto L8e
            int r0 = r5.left
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
        L52:
            X.0adD r0 = r4.LLILLJJLI
            android.graphics.Rect r0 = r0.LJFF
            if (r0 == 0) goto L8c
            int r0 = r0.left
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
        L5e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L7e
            if (r5 == 0) goto L8a
            int r0 = r5.right
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)
        L6c:
            X.0adD r0 = r4.LLILLJJLI
            android.graphics.Rect r0 = r0.LJFF
            if (r0 == 0) goto L78
            int r0 = r0.right
            java.lang.Integer r2 = X.C2286608xc.LJ(r0)
        L78:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 != 0) goto L84
        L7e:
            X.0adD r1 = r4.LLILLJJLI
            r0 = 0
            r1.LIZLLL(r0)
        L84:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r3)
            return r0
        L8a:
            r1 = r2
            goto L6c
        L8c:
            r0 = r2
            goto L5e
        L8e:
            r1 = r2
            goto L52
        L90:
            r0 = r2
            goto L44
        L92:
            r1 = r2
            goto L38
        L94:
            r0 = r2
            goto L2a
        L96:
            r1 = r2
            goto L1e
        L98:
            X.C155000ia.LIZIZ(r5)
            X.0adD r0 = r4.LLILLJJLI
            r4.LL = r1
            java.lang.Object r5 = r0.LIZIZ(r4)
            if (r5 != r2) goto L13
            X.C1C7U.LIZIZ(r3)
            return r2
        La9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C942050acd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

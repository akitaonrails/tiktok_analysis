package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Xl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.GroupAvatarLocalGenerator$generateGroupAvatarBitmap$bitmapList$1$1", f = "GroupAvatarLocalGenerator.kt", l = {57}, m = "invokeSuspend")
public final class C1623906Xl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ UrlModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1623906Xl(UrlModel urlModel, InterfaceC1364105Vn<? super C1623906Xl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = urlModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1623906Xl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "GroupAvatarLocalGenerator@9a3f.generateGroupAvatarBitmap$bitmapList$1$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 1
            if (r0 == 0) goto L17
            if (r0 != r6) goto L97
            X.C155000ia.LIZIZ(r10)
        L13:
            X.C1C7U.LIZIZ(r8)
            return r10
        L17:
            X.C155000ia.LIZIZ(r10)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r9.LLILLJJLI
            com.ss.android.ugc.aweme.base.ImageUrlModel r7 = X.C438710HIf.LIZ(r0)
            r9.LL = r6
            X.099m r4 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r9)
            r4.<init>(r0)
            X.01GW r0 = X.C1ECN.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.im.common.setting.IMLocalGroupAvatarConfig r0 = (com.ss.android.ugc.aweme.im.common.setting.IMLocalGroupAvatarConfig) r0
            java.util.List<java.lang.String> r1 = r0.uriList
            boolean r0 = r1 instanceof java.util.Collection
            r5 = 0
            if (r0 == 0) goto L60
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L60
        L40:
            X.0kl3 r2 = X.C1331660kl2.LJIIIIZZ(r7)
            X.0200 r1 = new X.0200
            r0 = 2
            r1.<init>(r4, r0)
            r2.LJJII(r1)
        L4d:
            java.lang.Object r10 = r4.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r10 != r0) goto L5a
            X.C099Q.LIZJ(r9)
        L5a:
            if (r10 != r3) goto L13
            X.C1C7U.LIZIZ(r8)
            return r3
        L60:
            java.util.Iterator r2 = r1.iterator()
        L64:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r7.getUri()
            if (r0 == 0) goto L64
            boolean r0 = kotlin.text.a0.LJJIIZI(r0, r1, r5)
            if (r0 != r6) goto L64
            X.0I0B r0 = X.C0I0B.LJFF
            r0.LIZJ()
            android.content.Context r0 = X.C894660Z7w.LIZ()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2130971077(0x7f0409c5, float:1.7550882E38)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r1, r0)
            X.C189200o6.m2constructorimpl(r0)
            r4.resumeWith(r0)
            goto L4d
        L97:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1623906Xl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

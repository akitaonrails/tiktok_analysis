package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.PhotoToStickerExtra;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l35, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.longpresspanel.PhotoToStickerHelper$clickPhotoToSticker$2", f = "PhotoToStickerHelper.kt", l = {112, 117, 149}, m = "invokeSuspend")
public final class C1342850l35 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ Comment LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ PhotoToStickerExtra LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342850l35(Comment comment, Activity activity, PhotoToStickerExtra photoToStickerExtra, InterfaceC1364105Vn<? super C1342850l35> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = comment;
        this.LLILZ = activity;
        this.LLILZIL = photoToStickerExtra;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1342850l35(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r3 = r16
            java.lang.String r8 = "PhotoToStickerHelper@6846.clickPhotoToSticker$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r15.LLILLJJLI
            r2 = 3
            r4 = 2
            r7 = 1
            if (r0 == 0) goto L21
            if (r0 == r7) goto L39
            if (r0 == r4) goto L76
            if (r0 != r2) goto L9f
            X.C155000ia.LIZIZ(r3)
        L1b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L21:
            X.C155000ia.LIZIZ(r3)
            com.ss.android.ugc.aweme.comment.model.Comment r0 = r15.LLILLL
            com.ss.android.ugc.aweme.commentv2.commentlist.CommentApiV2 r3 = com.ss.android.ugc.aweme.commentv2.commentlist.CommentApiV2.LIZIZ     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = r0.getCid()     // Catch: java.lang.Throwable -> L42
            long r5 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> L42
            r15.LLILLJJLI = r7     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r3.LJIJJ(r5, r15)     // Catch: java.lang.Throwable -> L42
            if (r3 != r1) goto L3c
            goto La7
        L39:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L42
        L3c:
            com.ss.android.ugc.aweme.comment.easteregg.model.PhotoToStickerResponse r3 = (com.ss.android.ugc.aweme.comment.easteregg.model.PhotoToStickerResponse) r3     // Catch: java.lang.Throwable -> L42
            X.C189200o6.m2constructorimpl(r3)     // Catch: java.lang.Throwable -> L42
            goto L4e
        L42:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r3 = new X.00Yq
            r3.<init>(r0)
            X.C189200o6.m2constructorimpl(r3)
        L4e:
            r0 = r3
            android.app.Activity r11 = r15.LLILZ
            com.ss.android.ugc.aweme.comment.model.PhotoToStickerExtra r12 = r15.LLILZIL
            com.ss.android.ugc.aweme.comment.model.Comment r13 = r15.LLILLL
            boolean r3 = X.C189200o6.m8isSuccessimpl(r3)
            if (r3 == 0) goto L7b
            r10 = r0
            com.ss.android.ugc.aweme.comment.easteregg.model.PhotoToStickerResponse r10 = (com.ss.android.ugc.aweme.comment.easteregg.model.PhotoToStickerResponse) r10
            X.1DFH r3 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0l34 r9 = new X.0l34
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            r15.LL = r0
            r15.LLILLJJLI = r4
            java.lang.Object r3 = X.C23250099c.LJI(r15, r3, r9)
            if (r3 != r1) goto L7b
            X.C1C7U.LIZIZ(r8)
            return r1
        L76:
            java.lang.Object r0 = r15.LL
            X.C155000ia.LIZIZ(r3)
        L7b:
            com.ss.android.ugc.aweme.comment.model.PhotoToStickerExtra r11 = r15.LLILZIL
            android.app.Activity r12 = r15.LLILZ
            com.ss.android.ugc.aweme.comment.model.Comment r13 = r15.LLILLL
            java.lang.Throwable r10 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r10 == 0) goto L1b
            X.1DFH r3 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0l33 r9 = new X.0l33
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            r15.LL = r0
            r15.LLILLJJLI = r2
            java.lang.Object r0 = X.C23250099c.LJI(r15, r3, r9)
            if (r0 != r1) goto L1b
            X.C1C7U.LIZIZ(r8)
            return r1
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La7:
            X.C1C7U.LIZIZ(r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1342850l35.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

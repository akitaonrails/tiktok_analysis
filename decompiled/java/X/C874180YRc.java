package X;

import com.ss.bduploader.BDImageXInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.uploader.upload.IMPhotoUploadTask$fetchUploadConfig$1", f = "IMPhotoUploadTask.kt", l = {187}, m = "invokeSuspend")
public final class C874180YRc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C874190YRd LLILLL;
    public final /* synthetic */ BDImageXInfo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C874180YRc(C874190YRd c874190YRd, BDImageXInfo bDImageXInfo, InterfaceC1364105Vn<? super C874180YRc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c874190YRd;
        this.LLILZ = bDImageXInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C874180YRc c874180YRc = new C874180YRc(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c874180YRc.LLILLJJLI = obj;
        return c874180YRc;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "IMPhotoUploadTask@cf51.fetchUploadConfig$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 1
            if (r0 == 0) goto L7b
            if (r0 != r4) goto L99
            X.C155000ia.LIZIZ(r8)
            X.00o6 r8 = (X.C189200o6) r8
            java.lang.Object r1 = r8.m10unboximpl()
        L19:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            r4 = 0
            if (r0 == 0) goto L21
            r1 = r4
        L21:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L65
            java.util.Iterator r3 = r1.iterator()
        L29:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.im.core.proto.MediaUploadConfig r0 = (com.bytedance.im.core.proto.MediaUploadConfig) r0
            X.0YDu r1 = r0.type
            X.0YDu r0 = X.EnumC870720YDu.IMG
            if (r1 != r0) goto L29
            r4 = r2
        L3d:
            com.bytedance.im.core.proto.MediaUploadConfig r4 = (com.bytedance.im.core.proto.MediaUploadConfig) r4
            if (r4 == 0) goto L65
            X.0YQG r1 = X.C0YQB.LIZ(r4)
            X.0YRd r2 = r7.LLILLL
            com.ss.bduploader.BDImageXUploader r0 = r2.LLILZLL
            if (r0 == 0) goto L4e
            r0.close()
        L4e:
            r2.LLJ = r1
            r2.LIZIZ()
            com.ss.bduploader.BDImageXUploader r1 = r2.LLILZLL
            if (r1 == 0) goto L5f
            X.0YRb r0 = new X.0YRb
            r0.<init>(r2)
            r1.setListener(r0)
        L5f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L65:
            X.0YRd r4 = r7.LLILLL
            com.ss.bduploader.BDImageXInfo r1 = r7.LLILZ
            X.0YRk r3 = new X.0YRk
            java.lang.String r0 = r1.mErrorMsg
            if (r0 != 0) goto L71
            java.lang.String r0 = "token is expired, retry fetch failed"
        L71:
            r3.<init>(r0)
            long r1 = r1.mErrorCode
            int r0 = (int) r1
            r4.LIZJ(r0, r3)
            goto L5f
        L7b:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r3 = r7.LLILLJJLI
            X.0YO0 r2 = new X.0YO0
            X.0YRd r0 = r7.LLILLL
            X.0YH7 r1 = r0.LLILLL
            X.0YHF r0 = r0.LLILZ
            r2.<init>(r1, r0)
            r7.LLILLJJLI = r3
            r7.LL = r4
            java.lang.Object r1 = r2.LIZIZ(r7)
            if (r1 != r5) goto L19
            X.C1C7U.LIZIZ(r6)
            return r5
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C874180YRc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

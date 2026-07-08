package X;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0m60, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.qrcode.util.InstagramStoryShareImageRenderer$waitForQrAndBackground$2", f = "InstagramStoryShareImageRenderer.kt", l = {88}, m = "invokeSuspend")
public final class C1383100m60 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;

    public C1383100m60(InterfaceC1364105Vn<? super C1383100m60> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1383100m60(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C11FQ c11fq;
        WeakReference<Bitmap> weakReference;
        Bitmap bitmap;
        C1C7U.LIZ("InstagramStoryShareImageRenderer@a4ae.waitForQrAndBackground$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C155000ia.LIZIZ(obj);
        do {
            WeakReference<C11FQ> weakReference2 = C1383110m61.LIZIZ;
            if (weakReference2 != null && (c11fq = weakReference2.get()) != null && c11fq.LLILLL && (weakReference = C1383110m61.LIZ) != null && (bitmap = weakReference.get()) != null && !bitmap.isRecycled()) {
                C1C7U.LIZIZ("InstagramStoryShareImageRenderer@a4ae.waitForQrAndBackground$2");
                return true;
            }
            this.LL = 1;
        } while (AnonymousClass0958.LIZIZ(100L, this) != objLJFF);
        C1C7U.LIZIZ("InstagramStoryShareImageRenderer@a4ae.waitForQrAndBackground$2");
        return objLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C1383100m60(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

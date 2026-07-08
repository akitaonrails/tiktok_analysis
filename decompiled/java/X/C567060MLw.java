package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MLw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publish.service.DmtInternalPublishServiceImpl$extractForwardCanvasCoverFallback$1$bitmap$1", f = "DmtInternalPublishServiceImpl.kt", l = {347}, m = "invokeSuspend")
public final class C567060MLw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ C0MN0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567060MLw(C0MN0 c0mn0, InterfaceC1364105Vn<? super C567060MLw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0mn0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567060MLw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DmtInternalPublishServiceImpl@9f14.extractForwardCanvasCoverFallback$1$bitmap$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C567330MMx c567330MMx = new C567330MMx();
            C0MN0 c0mn0 = this.LLILLJJLI;
            this.LL = 1;
            obj = C1D7S.LIZ(c567330MMx, c0mn0, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DmtInternalPublishServiceImpl@9f14.extractForwardCanvasCoverFallback$1$bitmap$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("DmtInternalPublishServiceImpl@9f14.extractForwardCanvasCoverFallback$1$bitmap$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

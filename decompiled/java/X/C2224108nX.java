package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08nX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.shooting.PhotoProcessor$enterEditPageAfterImageCapture$getOutputFileTask$1", f = "PhotoProcessor.kt", l = {210}, m = "invokeSuspend")
public final class C2224108nX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C578810Mn1 LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2224108nX(C578810Mn1 c578810Mn1, Bitmap bitmap, String str, InterfaceC1364105Vn<? super C2224108nX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c578810Mn1;
        this.LLILLL = bitmap;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2224108nX(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PhotoProcessor@9c21.enterEditPageAfterImageCapture$getOutputFileTask$1");
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
            C578810Mn1 c578810Mn1 = this.LLILLJJLI;
            Bitmap bitmap = this.LLILLL;
            String str = this.LLILZ;
            this.LL = 1;
            c578810Mn1.getClass();
            obj = C578810Mn1.LJII(bitmap, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PhotoProcessor@9c21.enterEditPageAfterImageCapture$getOutputFileTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PhotoProcessor@9c21.enterEditPageAfterImageCapture$getOutputFileTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

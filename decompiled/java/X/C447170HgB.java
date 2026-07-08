package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.android.livesdk.widget.multiImageview.loader.MultiIconLoadHelper$fetchImageUrls$2$1", f = "MultiIconLoadHelper.kt", l = {67}, m = "invokeSuspend")
public final class C447170HgB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ C447180HgC LLILLJJLI;
    public final /* synthetic */ C0HTW LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C447170HgB(C447180HgC c447180HgC, C0HTW c0htw, InterfaceC1364105Vn<? super C447170HgB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c447180HgC;
        this.LLILLL = c0htw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C447170HgB(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        C1C7U.LIZ("MultiIconLoadHelper@8f7e.fetchImageUrls$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C447180HgC c447180HgC = this.LLILLJJLI;
                C0HTW c0htw = this.LLILLL;
                this.LL = 1;
                c447180HgC.getClass();
                obj = C447180HgC.LIZJ(c0htw, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MultiIconLoadHelper@8f7e.fetchImageUrls$2$1");
                    return objLJFF;
                }
            }
            bitmap = (Bitmap) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            bitmap = null;
        }
        C1C7U.LIZIZ("MultiIconLoadHelper@8f7e.fetchImageUrls$2$1");
        return bitmap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

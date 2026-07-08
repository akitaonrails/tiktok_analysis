package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.vision.utils.ImageUtils$storeImageAsync$1", f = "ImageUtils.kt", l = {}, m = "invokeSuspend")
public final class C475601tC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ Function1<String, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C475601tC(String str, Bitmap bitmap, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C475601tC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = bitmap;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C475601tC(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C1C7U.LIZ("ImageUtils@acc9.storeImageAsync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        Bitmap bitmap = this.LLILLJJLI;
        Function1<String, Unit> function1 = this.LLILLL;
        try {
            C0VSV c0vsv = new C0VSV(new C0VSJ(str));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, c0vsv);
            c0vsv.flush();
            c0vsv.close();
            if (function1 == null) {
                unit = null;
            } else {
                function1.invoke(str);
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ImageUtils@acc9.storeImageAsync$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

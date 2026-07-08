package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01t0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment$Companion$saveInputBitmapToCache$2", f = "LongPressAwemeFragment.kt", l = {}, m = "invokeSuspend")
public final class C474401t0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ File LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C474401t0(Bitmap bitmap, File file, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = file;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C474401t0(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("LongPressAwemeFragment$Companion@f31.saveInputBitmapToCache$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0VSV c0vsv = new C0VSV(this.LL);
        Throwable th = null;
        try {
            Boolean boolValueOf = Boolean.valueOf(this.LLILLJJLI.compress(Bitmap.CompressFormat.PNG, 100, c0vsv));
            C2107108Nh.LIZ(c0vsv, null);
            C1C7U.LIZIZ("LongPressAwemeFragment$Companion@f31.saveInputBitmapToCache$2");
            return boolValueOf;
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                throw th2;
            } catch (Throwable th4) {
                th = th4;
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                C2107108Nh.LIZ(c0vsv, th);
                throw th;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

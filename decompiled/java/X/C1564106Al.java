package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.ECSuggestPageSnapShotManager$captureFragmentBitmap$1", f = "ECSuggestPageSnapShotManager.kt", l = {}, m = "invokeSuspend")
public final class C1564106Al extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1564106Al(View view, Bitmap bitmap, boolean z, InterfaceC1364105Vn<? super C1564106Al> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
        this.LLILLJJLI = bitmap;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1564106Al(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECSuggestPageSnapShotManager@616.captureFragmentBitmap$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C683900Qs8 c683900Qs8 = C683900Qs8.LIZ;
            Context contextN3 = C786410Ut5.N3(this.LL.getContext());
            Bitmap bitmap = this.LLILLJJLI;
            boolean z = this.LLILLL;
            c683900Qs8.getClass();
            C683900Qs8.LIZJ(contextN3, bitmap, z);
            C786410Ut5.LJJJJ(this.LLILLJJLI);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ECSuggestPageSnapShotManager@616.captureFragmentBitmap$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C786410Ut5.LJJJJ(this.LLILLJJLI);
            throw th;
        }
    }
}

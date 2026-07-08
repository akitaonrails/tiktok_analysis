package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.098Q, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.ailive.AILiveUpdatedModelComponent$evaluateNewModel$hasFace$1$1", f = "AILiveUpdatedModelComponent.kt", l = {}, m = "invokeSuspend")
public final class C098Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C098Q(String str, InterfaceC1364105Vn<? super C098Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C098Q(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AILiveUpdatedModelComponent@e783.evaluateNewModel$hasFace$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2497109qT.LIZ.getClass();
        C2497109qT.LIZIZ.await();
        Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(this.LL, null);
        boolean z = false;
        if (bitmapLIZLLL != null && C2497109qT.LIZ(bitmapLIZLLL) == EnumC23225098d.HAS_FACE) {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("AILiveUpdatedModelComponent@e783.evaluateNewModel$hasFace$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

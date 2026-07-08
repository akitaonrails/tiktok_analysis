package X;

import android.content.Context;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoImageC2PAManager$writeC2PAToPhoto$1", f = "TakoImageC2PAManager.kt", l = {84}, m = "invokeSuspend")
public final class C15452063e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ Uri LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15452063e(Context context, Uri uri, InterfaceC1364105Vn<? super C15452063e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15452063e(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoImageC2PAManager@c341.writeC2PAToPhoto$1");
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
            C140D c140d = C140D.LIZ;
            Context context = this.LLILLJJLI;
            String string = this.LLILLL.toString();
            c140d.getClass();
            String strLJIL = C140D.LJIL(context, string);
            if (strLJIL == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TakoImageC2PAManager@c341.writeC2PAToPhoto$1");
                return unit;
            }
            C15453063f c15453063f = C15453063f.LIZ;
            this.LL = 1;
            c15453063f.getClass();
            if (C15453063f.LIZIZ(strLJIL, this) == objLJFF) {
                C1C7U.LIZIZ("TakoImageC2PAManager@c341.writeC2PAToPhoto$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoImageC2PAManager@c341.writeC2PAToPhoto$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

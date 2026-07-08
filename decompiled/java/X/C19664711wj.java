package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.11wj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.liveeventsticker.logic.BaseLiveEventStickerDelegate$requestSetSticker$1$1", f = "BaseLiveEventStickerDelegate.kt", l = {}, m = "invokeSuspend")
public final class C19664711wj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Function1<C19663611wY, Unit> LLILLJJLI;
    public final /* synthetic */ C19663611wY LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ AbstractC19664311wf LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19664711wj(boolean z, Function1<? super C19663611wY, Unit> function1, C19663611wY c19663611wY, Function0<Unit> function0, AbstractC19664311wf abstractC19664311wf, InterfaceC1364105Vn<? super C19664711wj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = function1;
        this.LLILLL = c19663611wY;
        this.LLILZ = function0;
        this.LLILZIL = abstractC19664311wf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19664711wj(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("BaseLiveEventStickerDelegate@5929.requestSetSticker$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            Function1<C19663611wY, Unit> function1 = this.LLILLJJLI;
            if (function1 != null) {
                function1.invoke(this.LLILLL);
            }
        } else {
            Function0<Unit> function0 = this.LLILZ;
            if (function0 != null) {
                function0.invoke();
            }
        }
        AbstractC19664311wf abstractC19664311wf = this.LLILZIL;
        String strValueOf = String.valueOf(this.LLILLL.LIZLLL);
        boolean z = this.LL;
        abstractC19664311wf.getClass();
        AbstractC19664311wf.LJIIIIZZ(strValueOf, z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseLiveEventStickerDelegate@5929.requestSetSticker$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

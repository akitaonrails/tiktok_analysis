package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.11wk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.liveeventsticker.logic.BaseLiveEventStickerDelegate$requestUnsetSticker$1$1", f = "BaseLiveEventStickerDelegate.kt", l = {}, m = "invokeSuspend")
public final class C19664811wk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ AbstractC19664311wf LLILZ;
    public final /* synthetic */ C19663611wY LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19664811wk(boolean z, Function0<Unit> function0, Function0<Unit> function02, AbstractC19664311wf abstractC19664311wf, C19663611wY c19663611wY, InterfaceC1364105Vn<? super C19664811wk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
        this.LLILZ = abstractC19664311wf;
        this.LLILZIL = c19663611wY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19664811wk(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("BaseLiveEventStickerDelegate@5929.requestUnsetSticker$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            Function0<Unit> function0 = this.LLILLJJLI;
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            Function0<Unit> function02 = this.LLILLL;
            if (function02 != null) {
                function02.invoke();
            }
        }
        AbstractC19664311wf abstractC19664311wf = this.LLILZ;
        String strValueOf = String.valueOf(this.LLILZIL.LIZLLL);
        boolean z = this.LL;
        abstractC19664311wf.getClass();
        AbstractC19664311wf.LJIIIIZZ(strValueOf, z);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseLiveEventStickerDelegate@5929.requestUnsetSticker$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

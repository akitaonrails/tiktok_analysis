package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TsF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectController$setEffect$2$2", f = "LiveEffectController.kt", l = {}, m = "invokeSuspend")
public final class C760410TsF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ Function0<Boolean> LL;
    public final /* synthetic */ Function1<LiveEffect, Unit> LLILLJJLI;
    public final /* synthetic */ C259800zU<LiveEffect> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ Function1<LiveEffect, Unit> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C760410TsF(Function0<Boolean> function0, Function1<? super LiveEffect, Unit> function1, C259800zU<LiveEffect> c259800zU, String str, String str2, boolean z, Function1<? super LiveEffect, Unit> function12, String str3, InterfaceC1364105Vn<? super C760410TsF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
        this.LLILLJJLI = function1;
        this.LLILLL = c259800zU;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = z;
        this.LLIZ = function12;
        this.LLIZLLLIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760410TsF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectController@4857.setEffect$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.invoke().booleanValue()) {
            Function1<LiveEffect, Unit> function1 = this.LLILLJJLI;
            if (function1 != null) {
                function1.invoke(this.LLILLL.element);
            }
            C0U8T c0u8t = C0U8T.LIZ;
            String str = this.LLILZ;
            String strLJLL = this.LLILZIL;
            if (strLJLL == null && (strLJLL = this.LLILLL.element.LJLL()) == null) {
                strLJLL = "";
            }
            LiveEffect liveEffect = this.LLILLL.element;
            boolean z = this.LLILZLL;
            c0u8t.getClass();
            C0U8T.LJIIJJI(liveEffect, str, strLJLL, z);
            Function1<LiveEffect, Unit> function12 = this.LLIZ;
            if (function12 != null) {
                function12.invoke(this.LLILLL.element);
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setEffect: applyStickerCondition ");
            sbLIZ.append(this.LLIZLLLIL);
            sbLIZ.append(" failed");
            C20441214yg.LJ("LiveEffectController", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1C7U.LIZIZ("LiveEffectController@4857.setEffect$2$2");
        return true;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

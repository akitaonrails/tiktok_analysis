package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0FId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.text.TextEditFontListAbility$setCache$2$1", f = "TextEditFontListAbility.kt", l = {}, m = "invokeSuspend")
public final class C387730FId extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Effect LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ Function1<C0FMO, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C387730FId(Effect effect, Effect effect2, String str, String str2, String str3, String str4, String str5, Function1<? super C0FMO, Unit> function1, InterfaceC1364105Vn<? super C387730FId> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = effect;
        this.LLILLJJLI = effect2;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = str5;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C387730FId(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function1<C0FMO, Unit> function1;
        C1C7U.LIZ("TextEditFontListAbility@a0ef.setCache$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Effect effect = this.LL;
        Effect effect2 = this.LLILLJJLI;
        String str = this.LLILLL;
        if (str == null) {
            str = "";
        }
        C0FMO c0fmo = new C0FMO(effect, effect2, str, this.LLILZ, this.LLILZIL);
        effect.getEffectId();
        String str2 = this.LLILZLL;
        String str3 = this.LLIZ;
        C0FIW.LIZ.put(str2, c0fmo);
        if (Intrinsics.LJFF(str2, "pin_entrance")) {
            C0FIW.LIZIZ = str3;
        }
        if (Intrinsics.LJFF(this.LLILZLL, "pin_entrance") && (function1 = this.LLIZLLLIL) != null) {
            function1.invoke(c0fmo);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextEditFontListAbility@a0ef.setCache$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

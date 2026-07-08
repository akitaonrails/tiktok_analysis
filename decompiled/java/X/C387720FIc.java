package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0FIc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.text.TextEditFontListAbility$setCache$1$1", f = "TextEditFontListAbility.kt", l = {}, m = "invokeSuspend")
public final class C387720FIc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Effect LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function1<C0FMO, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C387720FIc(Effect effect, Effect effect2, String str, String str2, String str3, String str4, Function1<? super C0FMO, Unit> function1, InterfaceC1364105Vn<? super C387720FIc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = effect;
        this.LLILLJJLI = effect2;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C387720FIc(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function1<C0FMO, Unit> function1;
        C1C7U.LIZ("TextEditFontListAbility@a0ef.setCache$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Effect effect = this.LL;
        C0FMO c0fmo = new C0FMO(effect, this.LLILLJJLI, this.LLILLL, "", "", this.LLILZ);
        effect.getEffectId();
        String str = this.LLILZIL;
        String str2 = this.LLILZLL;
        C0FIW.LIZ.put(str, c0fmo);
        if (Intrinsics.LJFF(str, "pin_entrance")) {
            C0FIW.LIZIZ = str2;
        }
        if (Intrinsics.LJFF(this.LLILZIL, "pin_entrance") && (function1 = this.LLIZ) != null) {
            function1.invoke(c0fmo);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextEditFontListAbility@a0ef.setCache$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

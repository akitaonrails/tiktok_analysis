package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.compose.MusicGiftDetailListKt$MusicGiftListPanel$2$1", f = "MusicGiftDetailList.kt", l = {156}, m = "invokeSuspend")
public final class C596010NZf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ InterfaceC1664360tPe<C1147640fyE> LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C1690080u58 LLIZ;
    public final /* synthetic */ C05P1<Function0<Unit>> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C596010NZf(boolean z, boolean z2, boolean z3, InterfaceC1664360tPe<C1147640fyE> interfaceC1664360tPe, String str, C1690080u58 c1690080u58, C05P1<? extends Function0<Unit>> c05p1, InterfaceC1364105Vn<? super C596010NZf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = interfaceC1664360tPe;
        this.LLILZLL = str;
        this.LLIZ = c1690080u58;
        this.LLIZLLLIL = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C596010NZf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftDetailListKt@31a0.MusicGiftListPanel$2$1");
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
            if (this.LLILLJJLI && !this.LLILLL && !this.LLILZ && !this.LLILZIL.isEmpty() && this.LLILZLL == null) {
                final C013C c013c = new C013C();
                InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(C20028913Yh.LJIIIZ(new C623370Och(this.LLIZ, this.LLILZIL)));
                final C05P1<Function0<Unit>> c05p1 = this.LLIZLLLIL;
                InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0NZe
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                        if (((Boolean) obj2).booleanValue()) {
                            C013C c013c2 = c013c;
                            if (!c013c2.element) {
                                c013c2.element = true;
                                c05p1.getValue().invoke();
                            }
                        }
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (interfaceC346201WaLJIILL.collect(interfaceC346701Wf, this) == objLJFF) {
                    C1C7U.LIZIZ("MusicGiftDetailListKt@31a0.MusicGiftListPanel$2$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MusicGiftDetailListKt@31a0.MusicGiftListPanel$2$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftDetailListKt@31a0.MusicGiftListPanel$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

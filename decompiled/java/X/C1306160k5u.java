package X;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0k5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.recommendeffect.compose.HorizontalCarouselKt$Panel$4$1", f = "HorizontalCarousel.kt", l = {164}, m = "invokeSuspend")
public final class C1306160k5u extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690080u58 LLILLJJLI;
    public final /* synthetic */ Function2<String, Integer, Unit> LLILLL;
    public final /* synthetic */ C05P0<Integer> LLILZ;
    public final /* synthetic */ C05P0<String> LLILZIL;
    public final /* synthetic */ C05P0<Pair<Integer, Integer>> LLILZLL;
    public final /* synthetic */ C05P0<Boolean> LLIZ;
    public final /* synthetic */ C05P0<Integer> LLIZLLLIL;
    public final /* synthetic */ C05P0<Integer> LLJ;
    public final /* synthetic */ InterfaceC497601wk LLJI;
    public final /* synthetic */ C05P0<C09AE> LLJIJIL;
    public final /* synthetic */ Function2<String, Integer, Unit> LLJILJIL;
    public final /* synthetic */ C05P0<EnumC994870bzp> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1306160k5u(C1690080u58 c1690080u58, Function2<? super String, ? super Integer, Unit> function2, C05P0<Integer> c05p0, C05P0<String> c05p02, C05P0<Pair<Integer, Integer>> c05p03, C05P0<Boolean> c05p04, C05P0<Integer> c05p05, C05P0<Integer> c05p06, InterfaceC497601wk interfaceC497601wk, C05P0<C09AE> c05p07, Function2<? super String, ? super Integer, Unit> function22, C05P0<EnumC994870bzp> c05p08, InterfaceC1364105Vn<? super C1306160k5u> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690080u58;
        this.LLILLL = function2;
        this.LLILZ = c05p0;
        this.LLILZIL = c05p02;
        this.LLILZLL = c05p03;
        this.LLIZ = c05p04;
        this.LLIZLLLIL = c05p05;
        this.LLJ = c05p06;
        this.LLJI = interfaceC497601wk;
        this.LLJIJIL = c05p07;
        this.LLJILJIL = function22;
        this.LLJILJILJ = c05p08;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1306160k5u(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HorizontalCarouselKt@558d.Panel$4$1");
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
            C1339310kxN c1339310kxN = new C1339310kxN(C20028913Yh.LJIIIZ(new AwS564S0100000_20(this.LLILLJJLI, 22)), 2);
            final C1690080u58 c1690080u58 = this.LLILLJJLI;
            final Function2<String, Integer, Unit> function2 = this.LLILLL;
            final C05P0<Integer> c05p0 = this.LLILZ;
            final C05P0<String> c05p02 = this.LLILZIL;
            final C05P0<Pair<Integer, Integer>> c05p03 = this.LLILZLL;
            final C05P0<Boolean> c05p04 = this.LLIZ;
            final C05P0<Integer> c05p05 = this.LLIZLLLIL;
            final C05P0<Integer> c05p06 = this.LLJ;
            final InterfaceC497601wk interfaceC497601wk = this.LLJI;
            final C05P0<C09AE> c05p07 = this.LLJIJIL;
            final Function2<String, Integer, Unit> function22 = this.LLJILJIL;
            final C05P0<EnumC994870bzp> c05p08 = this.LLJILJILJ;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0k5w
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Integer numLJ;
                    String str;
                    String str2;
                    ((Boolean) obj2).booleanValue();
                    if (c1690080u58.LJII() == 0 && c1690080u58.LJIIIIZZ() == 0) {
                        c05p0.setValue(0);
                    } else {
                        int iLIZLLL = c1690080u58.LJIIIZ().LIZLLL() + (((int) (c1690080u58.LJIIIZ().LIZ() >> 32)) / 2);
                        Iterator<C06XG> it2 = c1690080u58.LJIIIZ().LJII().iterator();
                        C06XG next = null;
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (it2.hasNext()) {
                                int iAbs = Math.abs(next.getOffset() - iLIZLLL);
                                do {
                                    C06XG next2 = it2.next();
                                    int iAbs2 = Math.abs(next2.getOffset() - iLIZLLL);
                                    if (iAbs > iAbs2) {
                                        next = next2;
                                        iAbs = iAbs2;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        C06XG c06xg = next;
                        if (c06xg != null && (numLJ = C2286608xc.LJ(c06xg.getIndex())) != null) {
                            c05p0.setValue(Integer.valueOf(numLJ.intValue()));
                        }
                    }
                    if (c05p02.getValue().length() == 0) {
                        int iIntValue = c05p03.getValue().getFirst().intValue();
                        int iIntValue2 = c05p03.getValue().getSecond().intValue();
                        int iLJII = c1690080u58.LJII();
                        int iLJIIIIZZ = c1690080u58.LJIIIIZZ();
                        if (iLJII > iIntValue || (iLJII >= iIntValue && iLJIIIIZZ > iIntValue2)) {
                            str = "left";
                        } else {
                            str = "right";
                        }
                        C05P0<String> c05p09 = c05p02;
                        if (c05p04.getValue().booleanValue()) {
                            if (Intrinsics.LJFF(str, "left")) {
                                str2 = "edit_page_slide_left";
                            } else {
                                str2 = "edit_page_slide_right";
                            }
                        } else if (Intrinsics.LJFF(str, "left")) {
                            str2 = "wheel_slide_left";
                        } else {
                            str2 = "wheel_slide_right";
                        }
                        c05p09.setValue(str2);
                    }
                    function2.invoke(c05p02.getValue(), C2286608xc.LJ(c05p0.getValue().intValue()));
                    c05p02.setValue("");
                    c05p05.setValue(Integer.valueOf(c1690080u58.LJIIIIZZ()));
                    c05p06.setValue(Integer.valueOf(c1690080u58.LJII()));
                    C1667120tU6.LJFF(interfaceC497601wk, c05p07, function22, c05p08);
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c1339310kxN.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$4$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

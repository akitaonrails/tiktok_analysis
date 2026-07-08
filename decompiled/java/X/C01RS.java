package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01RS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSRequestLogicComponent$fetchTTSAudioFile$1$1", f = "TTSRequestLogicComponent.kt", l = {139}, m = "invokeSuspend")
public final class C01RS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C09SX LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ List<Boolean> LLILZIL;
    public final /* synthetic */ C259800zU<Pair<Integer, String>> LLILZLL;
    public final /* synthetic */ Function2<Integer, String, Unit> LLIZ;
    public final /* synthetic */ Function1<List<String>, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01RS(C09SX c09sx, List<String> list, List<String> list2, List<Boolean> list3, C259800zU<Pair<Integer, String>> c259800zU, Function2<? super Integer, ? super String, Unit> function2, Function1<? super List<String>, Unit> function1, InterfaceC1364105Vn<? super C01RS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09sx;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = list3;
        this.LLILZLL = c259800zU;
        this.LLIZ = function2;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01RS(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1$1");
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
            C2501109r7 c2501109r7 = new C2501109r7(new C01RQ(this.LLIZ, this.LLILZLL, null), new C2501109r7(new C01RP(null), new C095D(new C01RT(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, null)), 1), 0);
            final Function2<Integer, String, Unit> function2 = this.LLIZ;
            final Function1<List<String>, Unit> function1 = this.LLIZLLLIL;
            InterfaceC346701Wf<Object> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.01RR
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    C443120HZe c443120HZe = (C443120HZe) obj2;
                    if (((List) c443120HZe.getFirst()).contains("")) {
                        function2.invoke((Integer) c443120HZe.getSecond(), (String) c443120HZe.getThird());
                    } else {
                        function1.invoke((List<String>) c443120HZe.getFirst());
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c2501109r7.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

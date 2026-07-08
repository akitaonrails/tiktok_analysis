package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01RU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSRequestLogicComponent$fetchTTSAudioFile$1", f = "TTSRequestLogicComponent.kt", l = {118}, m = "invokeSuspend")
public final class C01RU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function2<Integer, String, Unit> LLILLJJLI;
    public final /* synthetic */ C09SX LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ List<Boolean> LLILZLL;
    public final /* synthetic */ Function1<List<String>, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01RU(Function2<? super Integer, ? super String, Unit> function2, C09SX c09sx, List<String> list, List<String> list2, List<Boolean> list3, Function1<? super List<String>, Unit> function1, InterfaceC1364105Vn<? super C01RU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = c09sx;
        this.LLILZ = list;
        this.LLILZIL = list2;
        this.LLILZLL = list3;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01RU(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [T, kotlin.Pair] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = new Pair(C2286608xc.LJ(0), "");
                C01RS c01rs = new C01RS(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, c259800zU, this.LLILLJJLI, this.LLIZ, null);
                this.LL = 1;
                if (C099A.LIZIZ(20000L, c01rs, this) == objLJFF) {
                    C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1");
                    return objLJFF;
                }
            }
        } catch (C094W e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ex:");
            sbLIZ.append(e);
            C201955140j.LIZIZ("TTSPanelUIComponent", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLJJLI.invoke(C2286608xc.LJ(-1), e.toString());
        } catch (C1494690ozz e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ex:");
            sbLIZ2.append(e2);
            C201955140j.LIZIZ("TTSPanelUIComponent", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLILLJJLI.invoke(C2286608xc.LJ(-1), e2.toString());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

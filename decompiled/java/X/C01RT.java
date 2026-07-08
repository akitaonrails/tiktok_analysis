package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01RT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSRequestLogicComponent$fetchTTSAudioFile$1$1$1", f = "TTSRequestLogicComponent.kt", l = {120, 130}, m = "invokeSuspend")
public final class C01RT extends C09AX implements Function2<InterfaceC346701Wf<? super C443120HZe<? extends List<? extends String>, ? extends Integer, ? extends String>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C09SX LLILLL;
    public final /* synthetic */ List<String> LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ List<Boolean> LLILZLL;
    public final /* synthetic */ C259800zU<Pair<Integer, String>> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01RT(C09SX c09sx, List<String> list, List<String> list2, List<Boolean> list3, C259800zU<Pair<Integer, String>> c259800zU, InterfaceC1364105Vn<? super C01RT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c09sx;
        this.LLILZ = list;
        this.LLILZIL = list2;
        this.LLILZLL = list3;
        this.LLIZ = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01RT c01rt = new C01RT(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c01rt.LLILLJJLI = obj;
        return c01rt;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [T, kotlin.Pair] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C1C7U.LIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C09SX c09sx = this.LLILLL;
            List<String> list = this.LLILZ;
            List<String> list2 = this.LLILZIL;
            CreativeInfo creativeInfo = c09sx.LJJJLIIL().getCreativeInfo();
            List<Boolean> list3 = this.LLILZLL;
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = c09sx.W1(list, list2, creativeInfo, list3, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1$1$1");
                return objLJFF;
            }
        }
        C443120HZe c443120HZe = (C443120HZe) obj;
        if (!((List) c443120HZe.getFirst()).contains("")) {
            this.LLILLJJLI = null;
            this.LL = 2;
            if (interfaceC346701Wf.emit(c443120HZe, this) == objLJFF) {
                C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1$1$1");
                return objLJFF;
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1$1$1");
            return unit2;
        }
        this.LLIZ.element = new Pair(c443120HZe.getSecond(), c443120HZe.getThird());
        throw new RuntimeException((String) c443120HZe.getThird());
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C443120HZe<? extends List<? extends String>, ? extends Integer, ? extends String>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

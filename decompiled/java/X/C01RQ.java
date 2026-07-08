package X;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01RQ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.panel.TTSRequestLogicComponent$fetchTTSAudioFile$1$1$3", f = "TTSRequestLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C01RQ extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C443120HZe<? extends List<? extends String>, ? extends Integer, ? extends String>>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function2<Integer, String, Unit> LL;
    public final /* synthetic */ C259800zU<Pair<Integer, String>> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01RQ(Function2<? super Integer, ? super String, Unit> function2, C259800zU<Pair<Integer, String>> c259800zU, InterfaceC1364105Vn<? super C01RQ> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = function2;
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(this.LLILLJJLI.element.getFirst(), this.LLILLJJLI.element.getSecond());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTSRequestLogicComponent@4d24.fetchTTSAudioFile$1$1$3");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C443120HZe<? extends List<? extends String>, ? extends Integer, ? extends String>> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01RQ(this.LL, this.LLILLJJLI, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

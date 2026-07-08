package X;

import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LXc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineProcessingViewModel$retryGeneration$2$1", f = "AIGCOfflineProcessingViewModel.kt", l = {}, m = "invokeSuspend")
public final class C544500LXc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AIGCOfflineProcessingViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544500LXc(AIGCOfflineProcessingViewModel aIGCOfflineProcessingViewModel, String str, InterfaceC1364105Vn<? super C544500LXc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aIGCOfflineProcessingViewModel;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C544500LXc(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOfflineProcessingViewModel@fe8e.retryGeneration$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C545090LZj c545090LZj = this.LL.LLJILJIL;
        String str = this.LLILLJJLI;
        c545090LZj.getClass();
        C23250099c.LIZLLL(C545090LZj.LIZLLL, null, null, new C545100LZk(str, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineProcessingViewModel@fe8e.retryGeneration$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

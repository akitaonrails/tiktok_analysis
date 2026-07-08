package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.recorder.exit.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS409S0200000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LAk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.exit.RecordExitComponent$realSaveDraft$1$1", f = "RecordExitComponent.kt", l = {}, m = "invokeSuspend")
public final class C538600LAk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ p LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C538600LAk(VideoPublishEditModel videoPublishEditModel, p pVar, InterfaceC1364105Vn<? super C538600LAk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = pVar;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C538600LAk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordExitComponent@10c9.realSaveDraft$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C565790MGz c565790MGz = C565790MGz.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LL;
        AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(this.LLILLJJLI, videoPublishEditModel, 98);
        c565790MGz.getClass();
        C565790MGz.LIZ(videoPublishEditModel, awS409S0200000_8, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordExitComponent@10c9.realSaveDraft$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

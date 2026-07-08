package X;

import com.ss.android.ugc.gamora.recorder.sticker.l0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L4g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.RecordStickerLogicComponent$handleAIGCGenerationFromAlbum$1$didTimeout$1", f = "RecordStickerLogicComponent.kt", l = {730}, m = "invokeSuspend")
public final class C537000L4g extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ l0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537000L4g(l0 l0Var, InterfaceC1364105Vn<? super C537000L4g> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = l0Var;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C537000L4g(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordStickerLogicComponent@6428.handleAIGCGenerationFromAlbum$1$didTimeout$1");
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
            C581160Mqo c581160Mqo = new C581160Mqo(this.LLILLJJLI.b, 5);
            this.LL = 1;
            if (C09IC.LJIIZILJ(c581160Mqo, this) == objLJFF) {
                C1C7U.LIZIZ("RecordStickerLogicComponent@6428.handleAIGCGenerationFromAlbum$1$didTimeout$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("RecordStickerLogicComponent@6428.handleAIGCGenerationFromAlbum$1$didTimeout$1");
        return false;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

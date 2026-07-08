package X;

import com.ss.android.ugc.aweme.sticker.types.ar.uploadpicsticker.UploadPicStickerARPresenter;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L4h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.RecordStickerLogicComponent$handleAIGCGenerationFromAlbum$1$1", f = "RecordStickerLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C537010L4h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ l0 LL;
    public final /* synthetic */ List<C1621190sI1> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537010L4h(l0 l0Var, List<C1621190sI1> list, InterfaceC1364105Vn<? super C537010L4h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = l0Var;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C537010L4h(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordStickerLogicComponent@6428.handleAIGCGenerationFromAlbum$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        UploadPicStickerARPresenter uploadPicStickerARPresenter = this.LL.f;
        if (uploadPicStickerARPresenter != null) {
            uploadPicStickerARPresenter.LJJJJ(this.LLILLJJLI, true);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordStickerLogicComponent@6428.handleAIGCGenerationFromAlbum$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

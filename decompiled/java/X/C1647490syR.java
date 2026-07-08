package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0syR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.RecordLiveEventStickerComponent$addLiveEventSticker$1", f = "RecordLiveEventStickerComponent.kt", l = {126}, m = "invokeSuspend")
public final class C1647490syR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0FTJ<StickerModel> LLILLJJLI;
    public final /* synthetic */ C1656510tCz LLILLL;
    public final /* synthetic */ StickerModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1647490syR(C0FTJ<? extends StickerModel> c0ftj, C1656510tCz c1656510tCz, StickerModel stickerModel, InterfaceC1364105Vn<? super C1647490syR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ftj;
        this.LLILLL = c1656510tCz;
        this.LLILZ = stickerModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1647490syR(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LiveEventCountDownStickerModel liveEventCountDownStickerModel;
        C1C7U.LIZ("RecordLiveEventStickerComponent@ada8.addLiveEventSticker$1");
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
            C0FTJ<StickerModel> c0ftj = this.LLILLJJLI;
            if (c0ftj != null) {
                this.LL = 1;
                if (c0ftj.LJIJJ(false, this) == objLJFF) {
                    C1C7U.LIZIZ("RecordLiveEventStickerComponent@ada8.addLiveEventSticker$1");
                    return objLJFF;
                }
            }
        }
        this.LLILLL.mK0();
        StickerModel stickerModel = this.LLILZ;
        if ((stickerModel instanceof LiveEventCountDownStickerModel) && (liveEventCountDownStickerModel = (LiveEventCountDownStickerModel) stickerModel) != null) {
            this.LLILLL.w2(liveEventCountDownStickerModel);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RecordLiveEventStickerComponent@ada8.addLiveEventSticker$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecordLiveEventStickerComponent@ada8.addLiveEventSticker$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

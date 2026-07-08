package X;

import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationComponent$navToEditPage$1$1$1", f = "AIGCGenerationComponent.kt", l = {}, m = "invokeSuspend")
public final class C544830LYj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AIGCGenerationComponent LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ MediaModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544830LYj(AIGCGenerationComponent aIGCGenerationComponent, String str, MediaModel mediaModel, InterfaceC1364105Vn<? super C544830LYj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aIGCGenerationComponent;
        this.LLILLJJLI = str;
        this.LLILLL = mediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C544830LYj(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        CreativeModel creativeModel;
        AIGCOfflineModel aIGCOfflineModel;
        CreativeModel creativeModel2;
        C1C7U.LIZ("AIGCGenerationComponent@e333.navToEditPage$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ShortVideoContext shortVideoContext = this.LL.getShortVideoContext();
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (aIGCOfflineModel = creativeModel.aigcOfflineModel) != null) {
            AIGCOfflineModel aIGCOfflineModelLIZ = AIGCOfflineModel.LIZ(aIGCOfflineModel, false, false, true, null, null, null, null, 0, 0, null, null, null, null, null, null, this.LLILLJJLI, false, true, this.LLILLL, false, null, -5, 255998);
            ShortVideoContext shortVideoContext2 = this.LL.getShortVideoContext();
            if (shortVideoContext2 != null && (creativeModel2 = shortVideoContext2.creativeModel) != null) {
                creativeModel2.aigcOfflineModel = aIGCOfflineModelLIZ;
            }
        }
        InterfaceC1648570t0B recordControlApi = this.LL.getRecordControlApi();
        if (recordControlApi != null) {
            recordControlApi.Sf0(new C0LZD("stop_record"));
        }
        this.LL.d5().AQ2(new C0LYL(false));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCGenerationComponent@e333.navToEditPage$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

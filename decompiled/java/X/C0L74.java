package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS252S0300000_8;
import njp.a;

/* JADX INFO: renamed from: X.0L74, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.stage.VideoPublishStage$action$2", f = "VideoPublishStage.kt", l = {98}, m = "invokeSuspend")
public final class C0L74 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AwemeDraft LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0M5O<Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L74(C0M5O<Object> c0m5o, InterfaceC1364105Vn<? super C0L74> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0m5o;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L74(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AwemeDraft awemeDraftLIZLLL;
        C1C7U.LIZ("VideoPublishStage@f245.action$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                awemeDraftLIZLLL = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            VideoPublishEditModel videoPublishEditModelClone = ((C540370LHf) this.LLILLL).LIZ.LIZ.clone();
            String str = ((C540370LHf) this.LLILLL).LIZ.LIZ.creativeModel.draftInfoModel.saveDraftScene;
            new C1438570nXT(str);
            awemeDraftLIZLLL = C1438570nXT.LIZLLL(videoPublishEditModelClone);
            String str2 = videoPublishEditModelClone.creativeModel.nleInfoModel.nleDataPath;
            if (C123100dR.LIZ(str2) && C123100dR.LIZ(videoPublishEditModelClone.getNleData())) {
                String nleData = videoPublishEditModelClone.getNleData();
                if (nleData == null) {
                    nleData = "";
                }
                C2350209Iu.LIZ(str2, nleData);
            }
            C0M6F c0m6fLJI = C0CHQ.LIZ().LJI();
            String strLIZ = C0DMI.LIZ();
            this.LL = awemeDraftLIZLLL;
            this.LLILLJJLI = 1;
            obj = c0m6fLJI.LJII(videoPublishEditModelClone, awemeDraftLIZLLL, strLIZ, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VideoPublishStage@f245.action$2");
                return objLJFF;
            }
        }
        C0CNO.LIZLLL(0L, new AwS252S0300000_8((AwemeDraft) obj, awemeDraftLIZLLL, (AwemeDraft) this.LLILLL, (C0M5O<Object>) 39));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoPublishStage@f245.action$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

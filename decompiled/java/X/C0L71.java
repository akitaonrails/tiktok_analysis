package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L71, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.exit.RecordExitComponent$publish$1$1$1$newDraft$1", f = "RecordExitComponent.kt", l = {1160, 1170}, m = "invokeSuspend")
public final class C0L71 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft>, Object> {
    public int LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L71(VideoPublishEditModel videoPublishEditModel, boolean z, InterfaceC1364105Vn<? super C0L71> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L71(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordExitComponent@10c9.publish$1$1$1$newDraft$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("RecordExitComponent@10c9.publish$1$1$1$newDraft$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            AwemeDraft awemeDraft = ((C540340LHc) obj).LIZIZ;
            C1C7U.LIZIZ("RecordExitComponent@10c9.publish$1$1$1$newDraft$1");
            return awemeDraft;
        }
        C155000ia.LIZIZ(obj);
        new C1438570nXT("publish on record");
        AwemeDraft awemeDraftLIZLLL = C1438570nXT.LIZLLL(this.LLILLJJLI);
        if (!this.LLILLL) {
            C1428470nHB.LIZJ(this.LLILLJJLI.creativeModel.draftInfoModel);
            InterfaceC545580LaW interfaceC545580LaWLIZIZ = C0CHQ.LIZ().LJI().LIZIZ();
            C538590LAj c538590LAj = new C538590LAj(this.LLILLJJLI, new C0M2T(false, "VideoRecordNewActivity", null, 5, false, 28), false);
            this.LL = 1;
            obj = interfaceC545580LaWLIZIZ.LJI(c538590LAj, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RecordExitComponent@10c9.publish$1$1$1$newDraft$1");
                return objLJFF;
            }
            AwemeDraft awemeDraft2 = ((C540340LHc) obj).LIZIZ;
            C1C7U.LIZIZ("RecordExitComponent@10c9.publish$1$1$1$newDraft$1");
            return awemeDraft2;
        }
        C0M6F c0m6fLJI = C0CHQ.LIZ().LJI();
        VideoPublishEditModel videoPublishEditModel = this.LLILLJJLI;
        String string = UUID.randomUUID().toString();
        this.LL = 2;
        obj = c0m6fLJI.LJII(videoPublishEditModel, awemeDraftLIZLLL, string, "autoSaveDraftAfterPublished", this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("RecordExitComponent@10c9.publish$1$1$1$newDraft$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("RecordExitComponent@10c9.publish$1$1$1$newDraft$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super AwemeDraft> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

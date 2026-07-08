package X;

import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.recorder.exit.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS409S0200000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LtM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.exit.RecordExitComponent$publish$1$1$1", f = "RecordExitComponent.kt", l = {1155}, m = "invokeSuspend")
public final class C557260LtM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ p LLILZ;
    public final /* synthetic */ CreativeLoadingDialog LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C557260LtM(VideoPublishEditModel videoPublishEditModel, Integer num, p pVar, CreativeLoadingDialog creativeLoadingDialog, boolean z, InterfaceC1364105Vn<? super C557260LtM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = num;
        this.LLILZ = pVar;
        this.LLILZIL = creativeLoadingDialog;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C557260LtM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Object objLJI = obj;
        C1C7U.LIZ("RecordExitComponent@10c9.publish$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            this.LLILLJJLI.isPrivate = 1;
            Integer num = this.LLILLL;
            if (num != null && num.intValue() == 2) {
                this.LLILLJJLI.isPrivate = 2;
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C0L71 c0l71 = new C0L71(this.LLILLJJLI, this.LLILZLL, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c0l71);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("RecordExitComponent@10c9.publish$1$1$1");
                return objLJFF;
            }
        }
        AwemeDraft awemeDraft = (AwemeDraft) objLJI;
        if (awemeDraft == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("RecordExitComponent@10c9.publish$1$1$1");
            return unit;
        }
        new C1438570nXT("publish on record");
        VideoPublishEditModel videoPublishEditModelLIZJ = C1438570nXT.LIZJ(awemeDraft, false);
        PostPageModel postPageModel = videoPublishEditModelLIZJ.creativeModel.postPageModel;
        CaptionModel captionModel = postPageModel.captionModel;
        C13BV c13bv = C13BV.INSTANCE;
        captionModel.markupExtra = c13bv;
        captionModel.markupText = null;
        postPageModel.markupCaption = null;
        postPageModel.markupExtra = c13bv;
        videoPublishEditModelLIZJ.setTitle(null);
        C1466090oFr.LJ(videoPublishEditModelLIZJ.creativeModel.stickerModel);
        C1436990nUv.LJIIIIZZ(videoPublishEditModelLIZJ, false);
        C1431870nMf c1431870nMfLJJJLL = C0CHQ.LIZ().getPublishService().LJJJLL();
        C19EG c19eg = this.LLILZ.LLJI;
        if (videoPublishEditModelLIZJ.getTtStoryUploadModel() != null) {
            z = true;
        } else {
            z = false;
        }
        C557270LtN.LIZ(c1431870nMfLJJJLL, c19eg, videoPublishEditModelLIZJ, 0, z, false, AFwS239S0000000_8.get$arr$(211), null, null, 196);
        C565790MGz c565790MGz = C565790MGz.LIZ;
        AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(this.LLILZ, videoPublishEditModelLIZJ, 97);
        c565790MGz.getClass();
        C565790MGz.LIZ(videoPublishEditModelLIZJ, awS409S0200000_8, null);
        this.LLILZIL.dismiss();
        if (this.LLILZLL) {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILZ.LLJI);
            c1389890mGx.LJIIIZ(2131857950);
            c1389890mGx.LJIIJJI();
            this.LLILZ.clear();
        } else {
            C1439190nYT.LIZJ();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecordExitComponent@10c9.publish$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

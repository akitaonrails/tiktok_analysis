package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08wO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.aigcresult.list.VideoFileFrameExtraction$saveFrameBitmap$2", f = "VideoFileFrameExtraction.kt", l = {}, m = "invokeSuspend")
public final class C2279008wO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2279008wO(VideoPublishEditModel videoPublishEditModel, Bitmap bitmap, InterfaceC1364105Vn<? super C2279008wO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2279008wO(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoFileFrameExtraction@e0b3.saveFrameBitmap$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VideoPublishEditModel videoPublishEditModel = this.LL;
        String str = null;
        if (videoPublishEditModel == null) {
            C1C7U.LIZIZ("VideoFileFrameExtraction@e0b3.saveFrameBitmap$2");
            return null;
        }
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        CreativeInfo creativeInfo = videoPublishEditModel.getCreativeInfo();
        C0MI0 c0mi0 = C0MI0.EDITOR_PRO_AIGC;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ai_transition_");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".png");
        String strLJIILL = pathService.LJIILL(creativeInfo, c0mi0, C2188811AlT.LIZIZ(sbLIZ), true);
        boolean zLIZ = C2243308qd.LIZ(this.LLILLJJLI, strLJIILL);
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("saveFrameBitmap isSuccess = ");
        sbLIZ2.append(zLIZ);
        sbLIZ2.append(' ');
        sbLIZ2.append(strLJIILL);
        C201955140j.LIZLLL(c563650M8t, "AI_Transition", C2188811AlT.LIZIZ(sbLIZ2));
        if (zLIZ) {
            str = strLJIILL;
        }
        C1C7U.LIZIZ("VideoFileFrameExtraction@e0b3.saveFrameBitmap$2");
        return str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

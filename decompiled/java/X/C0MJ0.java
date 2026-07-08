package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MJ0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.LyricsRuleTemplateApplier$apply$1$1", f = "LyricsRuleTemplateApplier.kt", l = {}, m = "invokeSuspend")
public final class C0MJ0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1415130mvf LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ EditPreviewInfo LLILZ;
    public final /* synthetic */ VideoPublishEditModel LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MJ0(boolean z, C1415130mvf c1415130mvf, Function0<Unit> function0, EditPreviewInfo editPreviewInfo, VideoPublishEditModel videoPublishEditModel, Function0<Unit> function02, InterfaceC1364105Vn<? super C0MJ0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c1415130mvf;
        this.LLILLL = function0;
        this.LLILZ = editPreviewInfo;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = function02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MJ0(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        VideoPublishEditModel videoPublishEditModel;
        EditPreviewInfo previewInfo;
        List<EditVideoSegment> videoList;
        C1463670oBx c1463670oBx;
        NLEModel nLEModelLIZJ;
        NLETrack mainTrack;
        boolean z;
        C1C7U.LIZ("LyricsRuleTemplateApplier@cea7.apply$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            InterfaceC1452170ntP value = this.LLILLJJLI.LIZ.g().getValue();
            if ((value instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) value) != null && (nLEModelLIZJ = c1463670oBx.LIZJ()) != null && (mainTrack = nLEModelLIZJ.getMainTrack()) != null) {
                long maxEnd = mainTrack.getMaxEnd();
                if (maxEnd > 0) {
                    if (mainTrack.getEndTime() == 0) {
                        mainTrack.setEndTime(maxEnd);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (nLEModelLIZJ.getEndTime() == 0) {
                        nLEModelLIZJ.setEndTime(maxEnd);
                    } else if (z) {
                    }
                    C0E9H c0e9h = c1463670oBx.LJ;
                    if (c0e9h != null) {
                        Boolean.valueOf(c0e9h.commit());
                    }
                }
            }
        }
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
        if (this.LLILZ != null && (videoPublishEditModel = this.LLILZIL) != null && ((previewInfo = videoPublishEditModel.getPreviewInfo()) == null || (videoList = previewInfo.getVideoList()) == null || videoList.isEmpty())) {
            this.LLILZIL.setPreviewInfo(this.LLILZ);
        }
        this.LLILLJJLI.LJ();
        this.LLILZLL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LyricsRuleTemplateApplier@cea7.apply$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

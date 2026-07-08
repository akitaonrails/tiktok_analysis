package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoTitleBarViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.stitch.StitchTrimmingRootScene$onCompleteTrim$1$1", f = "StitchTrimmingRootScene.kt", l = {}, m = "invokeSuspend")
public final class C574430Mfx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StitchParams LL;
    public final /* synthetic */ AIGCInfo LLILLJJLI;
    public final /* synthetic */ C19768712Wf LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C574430Mfx(StitchParams stitchParams, AIGCInfo aIGCInfo, C19768712Wf c19768712Wf, InterfaceC1364105Vn<? super C574430Mfx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = stitchParams;
        this.LLILLJJLI = aIGCInfo;
        this.LLILLL = c19768712Wf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C574430Mfx(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StitchTrimmingRootScene@bc91.onCompleteTrim$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EditVideoSegment videoSegment = this.LL.getVideoSegment();
        if (videoSegment != null) {
            videoSegment.setAigcInfo(this.LLILLJJLI);
        }
        CutVideoTitleBarViewModel cutVideoTitleBarViewModel = this.LLILLL.LLJJJIL;
        if (cutVideoTitleBarViewModel == null) {
            cutVideoTitleBarViewModel = null;
        }
        cutVideoTitleBarViewModel.lR2(true);
        C0FNU.LIZ(this.LLILLL.LLJJL);
        C19768712Wf.LLLLJ(false);
        this.LLILLL.LLLLILI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StitchTrimmingRootScene@bc91.onCompleteTrim$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

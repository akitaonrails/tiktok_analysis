package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0EKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.task.RepairEditPageNLEDataTask", f = "RepairEditPageNLEDataTask.kt", l = {80, 123, 128, 130}, m = "run")
public final class C362950EKv extends AbstractC23140094w {
    public NLEModel LL;
    public VideoPublishEditModel LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C362910EKr LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C362950EKv(C362910EKr c362910EKr, InterfaceC1364105Vn<? super C362950EKv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c362910EKr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepairEditPageNLEDataTask@15bb.run$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZ.LIZJ(this);
        C1C7U.LIZIZ("RepairEditPageNLEDataTask@15bb.run$1");
        return objLIZJ;
    }
}

package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0E91, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E91 extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ C0E48 LLILLJJLI;
    public final /* synthetic */ C0E93 LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ C259800zU<NLETrackSlot> LLILZIL;
    public final /* synthetic */ C013C LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E91(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, C0E93 c0e93, Function0<Unit> function0, C259800zU<NLETrackSlot> c259800zU, C013C c013c) {
        super(1);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = c0e48;
        this.LLILLL = c0e93;
        this.LLILZ = function0;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c013c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        VideoPublishEditModel videoPublishEditModel = this.LL;
        if (videoPublishEditModel != null) {
            C259800zU<NLETrackSlot> c259800zU = this.LLILZIL;
            C013C c013c = this.LLILZLL;
            C0E48 c0e48 = this.LLILLJJLI;
            NLETrackSlot nLETrackSlot = c259800zU.element;
            if (nLETrackSlot != null && nLETrackSlot.getAIMatting() != null) {
                nLETrackSlot.setAIMatting(null);
                C350870DpF.LIZ(c0e48, false);
            }
            C0EI4 c0ei4 = C0EI4.LIZ;
            boolean z = c013c.element;
            C0EI5 c0ei5 = C0EI5.AUTO_CUTOUT;
            EnumC373350EkP enumC373350EkP = EnumC373350EkP.EXIT_EP;
            c0ei4.getClass();
            C0EI4.LIZLLL(videoPublishEditModel, false, z, c0ei5, enumC373350EkP);
        }
        if (this.LLILLJJLI.LLLLLLIL() != null) {
            this.LLILLL.LIZIZ.w6(null, false, false);
        }
        EditModelProvider.Companion.getClass();
        C0E1T.LIZ().setBgmSoundTrimModel$tools_camera_edit_release(null);
        this.LLILZ.invoke();
        return Unit.LIZ;
    }
}

package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0E92, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E92 extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ C0E93 LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ C0E48 LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ C259800zU<NLETrackSlot> LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E92(C0E93 c0e93, VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, Function0<Unit> function0, C259800zU<NLETrackSlot> c259800zU, C013C c013c, Function0<Unit> function02) {
        super(1);
        this.LL = c0e93;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = c0e48;
        this.LLILZ = function0;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c013c;
        this.LLIZ = function02;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LIZJ(2, this.LL.LIZ.getString(2131830449), new C0E91(this.LLILLJJLI, this.LLILLL, this.LL, this.LLILZ, this.LLILZIL, this.LLILZLL));
        c1397620mTQ2.LIZJ(1, this.LL.LIZ.getString(2131830448), new AwS584S0100000_5(this.LLIZ, (Function0<Unit>) 935));
        return Unit.LIZ;
    }
}

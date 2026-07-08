package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0E0H, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E0H extends C09AY implements Function2<NLETrackSlot, Long, Unit> {
    public final /* synthetic */ C354510Dv7 LL;
    public final /* synthetic */ C0E0B LLILLJJLI;
    public final /* synthetic */ ResourceItem LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C0E0I LLILZIL;
    public final /* synthetic */ NLETrackSlot LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E0H(C354510Dv7 c354510Dv7, C0E0B c0e0b, ResourceItem resourceItem, int i, C0E0I c0e0i, NLETrackSlot nLETrackSlot) {
        super(2);
        this.LL = c354510Dv7;
        this.LLILLJJLI = c0e0b;
        this.LLILLL = resourceItem;
        this.LLILZ = i;
        this.LLILZIL = c0e0i;
        this.LLILZLL = nLETrackSlot;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(NLETrackSlot nLETrackSlot, Long l) {
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        l.longValue();
        C354510Dv7 c354510Dv7 = this.LL;
        c354510Dv7.LJIIJJI = nLETrackSlot2;
        this.LLILLJJLI.LIZJ(this.LLILLL, c354510Dv7, this.LLILZ, this.LLILZIL, nLETrackSlot2, this.LLILZLL, true);
        return Unit.LIZ;
    }
}

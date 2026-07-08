package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0E0E, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E0E extends C09AY implements Function2<NLETrackSlot, Long, Unit> {
    public final /* synthetic */ C0E0B LL;
    public final /* synthetic */ C354510Dv7 LLILLJJLI;
    public final /* synthetic */ ResourceItem LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C0E0I LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E0E(C0E0B c0e0b, C354510Dv7 c354510Dv7, ResourceItem resourceItem, int i, C0E0I c0e0i) {
        super(2);
        this.LL = c0e0b;
        this.LLILLJJLI = c354510Dv7;
        this.LLILLL = resourceItem;
        this.LLILZ = i;
        this.LLILZIL = c0e0i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(NLETrackSlot nLETrackSlot, Long l) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLETrackSlot nLETrackSlot2 = nLETrackSlot;
        long jLongValue = l.longValue();
        C0E48 c0e48 = this.LL.LIZIZ;
        if (c0e48 != null) {
            nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
        } else {
            nLETrackSlotLLLLLLIL = null;
        }
        this.LLILLJJLI.LJIIJJI = nLETrackSlot2;
        if (nLETrackSlotLLLLLLIL != null) {
            nLETrackSlotLLLLLLIL.setExtra("magic_freeze_time_stamp", String.valueOf(jLongValue - nLETrackSlotLLLLLLIL.getStartTime()));
        }
        this.LL.LIZJ(this.LLILLL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, nLETrackSlotLLLLLLIL, null, false);
        return Unit.LIZ;
    }
}

package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.assem.EmotePollInfoAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JRI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JRI extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ EmotePollInfoAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JRI(EmotePollInfoAssem emotePollInfoAssem) {
        super(2);
        this.LL = emotePollInfoAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            Boolean boolValueOf = Boolean.valueOf(((Boolean) c291001Au2.LIZ).booleanValue());
            EmotePollInfoAssem emotePollInfoAssem = this.LL;
            boolValueOf.booleanValue();
            emotePollInfoAssem.kp();
        }
        return Unit.LIZ;
    }
}

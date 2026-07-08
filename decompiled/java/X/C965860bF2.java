package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkMicState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bF2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965860bF2 extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C966020bFI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965860bF2(C966020bFI c966020bFI) {
        super(0);
        this.LL = c966020bFI;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean zIsIdleOrInitOrWaiting;
        if (this.LL.LJIILIIL()) {
            EnumC969200bKQ enumC969200bKQ = this.LL.LJIIIZ.LIZ;
            zIsIdleOrInitOrWaiting = true;
            if (enumC969200bKQ != EnumC969200bKQ.Idle && enumC969200bKQ != EnumC969200bKQ.Wait) {
                zIsIdleOrInitOrWaiting = false;
            }
        } else {
            zIsIdleOrInitOrWaiting = LinkMicState.Companion.isIdleOrInitOrWaiting(this.LL.LJIIIIZZ);
        }
        return Boolean.valueOf(zIsIdleOrInitOrWaiting);
    }
}

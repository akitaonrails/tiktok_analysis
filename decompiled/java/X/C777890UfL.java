package X;

import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0UfL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777890UfL extends C09AY implements InterfaceC1631630sYr<Boolean, Integer, CharSequence, PunishEventInfo, Unit> {
    public final /* synthetic */ C776870Udh LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C777890UfL(C776870Udh c776870Udh) {
        super(4);
        this.LL = c776870Udh;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Boolean bool, Integer num, CharSequence charSequence, PunishEventInfo punishEventInfo) {
        boolean zBooleanValue = bool.booleanValue();
        C776870Udh c776870Udh = this.LL;
        c776870Udh.LJIIIZ(num.intValue(), punishEventInfo, charSequence, null, zBooleanValue);
        return Unit.LIZ;
    }
}

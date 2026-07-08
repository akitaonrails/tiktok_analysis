package Y;

import X.C09JN;
import X.C1C7U;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.serverpush.compose.unlogin.PushSettingsUnLoginVM;
import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: loaded from: classes31.dex */
public class AfS10S1110000_30 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS10S1110000_30 afS10S1110000_30, Object obj) {
        C1C7U.LIZ("PushSettingsUnLoginVM@2a0b.requestUpdateSwitch$2");
        if (((BaseResponse) obj).status_code != 0) {
            ((PushSettingsUnLoginVM) afS10S1110000_30.l1).xQ2(afS10S1110000_30.s0, !afS10S1110000_30.z2);
            ((PushSettingsUnLoginVM) afS10S1110000_30.l1).zQ2(afS10S1110000_30.s0, !afS10S1110000_30.z2);
        }
        C1C7U.LIZIZ("PushSettingsUnLoginVM@2a0b.requestUpdateSwitch$2");
    }

    public static final void accept$1(AfS10S1110000_30 afS10S1110000_30, Object obj) {
        C1C7U.LIZ("PushSettingsUnLoginVM@2a0b.requestUpdateSwitch$3");
        ((PushSettingsUnLoginVM) afS10S1110000_30.l1).xQ2(afS10S1110000_30.s0, !afS10S1110000_30.z2);
        ((PushSettingsUnLoginVM) afS10S1110000_30.l1).zQ2(afS10S1110000_30.s0, !afS10S1110000_30.z2);
        ((PushSettingsUnLoginVM) afS10S1110000_30.l1).setState(AFwS274S0000000_30.get$arr$(352));
        C1C7U.LIZIZ("PushSettingsUnLoginVM@2a0b.requestUpdateSwitch$3");
    }

    public AfS10S1110000_30(PushSettingsUnLoginVM pushSettingsUnLoginVM, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = pushSettingsUnLoginVM;
        this.s0 = str;
        this.z2 = z;
    }
}

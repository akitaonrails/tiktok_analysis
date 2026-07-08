package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMultiGuestShareBgOptSetting;
import com.bytedance.android.livesdk.sei.VoiceChatSeiAppData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aZt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940350aZt extends C09AY implements Function1<C945320ahu, Unit> {
    public final /* synthetic */ C940470aa5 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C940350aZt(C940470aa5 c940470aa5) {
        super(1);
        this.LL = c940470aa5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C945320ahu c945320ahu) {
        C945320ahu c945320ahu2 = c945320ahu;
        C940470aa5 c940470aa5 = this.LL;
        c940470aa5.getClass();
        C927970aFv c927970aFv = C927970aFv.LIZ;
        InterfaceC937900aVw interfaceC937900aVw = c940470aa5.LLIZ;
        c927970aFv.getClass();
        C927970aFv.LIZIZ = interfaceC937900aVw;
        if (!LinkMicMultiGuestShareBgOptSetting.INSTANCE.isEnable() || c940470aa5.LLJJI == -1) {
            c940470aa5.LLJJI = C969340bKe.LJFF(c945320ahu2);
        }
        if (c940470aa5.LLJJI == 16) {
            InterfaceC937900aVw interfaceC937900aVw2 = c940470aa5.LLIZ;
            if (interfaceC937900aVw2 != null) {
                interfaceC937900aVw2.LJLIIIL(c945320ahu2, VoiceChatSeiAppData.class, new C940360aZu(c940470aa5, c945320ahu2));
            }
        } else {
            c940470aa5.LJ(c945320ahu2);
        }
        return Unit.LIZ;
    }
}

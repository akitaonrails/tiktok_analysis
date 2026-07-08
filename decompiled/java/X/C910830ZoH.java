package X;

import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageOnScreenAnalyticsAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraVideoCardAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C910830ZoH extends C2217421BqW implements Function0<Boolean> {
    public C910830ZoH(DMCameraVideoCardAssem dMCameraVideoCardAssem) {
        super(0, dMCameraVideoCardAssem, DMCameraVideoCardAssem.class, "checkIsOnFirstScreen", "checkIsOnFirstScreen()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Boolean boolValueOf;
        DMCameraVideoCardAssem dMCameraVideoCardAssem = (DMCameraVideoCardAssem) this.receiver;
        C869590Y9l c869590Y9lUp = dMCameraVideoCardAssem.up();
        MessageOnScreenAnalyticsAbility messageOnScreenAnalyticsAbility = (MessageOnScreenAnalyticsAbility) C1558520qew.LIZ(C1558520qew.LJIIL(dMCameraVideoCardAssem), MessageOnScreenAnalyticsAbility.class, null);
        return Boolean.valueOf((messageOnScreenAnalyticsAbility == null || (boolValueOf = Boolean.valueOf(messageOnScreenAnalyticsAbility.A41(c869590Y9lUp.getUuid()))) == null) ? false : boolValueOf.booleanValue());
    }
}

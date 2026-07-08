package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.compliance.privacy.settings.video.PrivacySettingDialogRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tiktok.tpsc.privacy.video.PrivacyVideoRestrictionModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS156S0400000_28;
import kotlin.jvm.internal.AwS2S0520000_28;

/* JADX INFO: renamed from: X.10BN, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10BN extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ DialogC1389620mGW LL;
    public final /* synthetic */ PrivacySettingDialogRouter LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ Bundle LLILZIL;
    public final /* synthetic */ PrivacyVideoRestrictionModel LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10BN(DialogC1389620mGW dialogC1389620mGW, PrivacySettingDialogRouter privacySettingDialogRouter, Aweme aweme, C19EG c19eg, Bundle bundle, PrivacyVideoRestrictionModel privacyVideoRestrictionModel, boolean z, boolean z2) {
        super(1);
        this.LL = dialogC1389620mGW;
        this.LLILLJJLI = privacySettingDialogRouter;
        this.LLILLL = aweme;
        this.LLILZ = c19eg;
        this.LLILZIL = bundle;
        this.LLILZLL = privacyVideoRestrictionModel;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C786410Ut5.LJIIJ(this.LL);
            this.LLILLJJLI.tryOpenSheet(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
        } else {
            C10A1 c10a1LJFF = C191871104n.LJFF();
            String aid = this.LLILLL.getAid();
            Aweme aweme = this.LLILLL;
            DialogC1389620mGW dialogC1389620mGW = this.LL;
            PrivacySettingDialogRouter privacySettingDialogRouter = this.LLILLJJLI;
            AwS2S0520000_28 awS2S0520000_28 = new AwS2S0520000_28(this.LLILZIL, this.LLILZ, dialogC1389620mGW, privacySettingDialogRouter, aweme, this.LLIZ, this.LLIZLLLIL, 0);
            AwS156S0400000_28 awS156S0400000_28 = new AwS156S0400000_28(this.LL, this.LLILZ, this.LLILLJJLI, this.LLILLL, 2);
            c10a1LJFF.getClass();
            C10A1.LIZ(aid, awS156S0400000_28, awS2S0520000_28);
        }
        return Unit.LIZ;
    }
}

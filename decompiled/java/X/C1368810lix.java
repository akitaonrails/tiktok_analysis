package X;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.internalshare.impl.experiment.SocialShareSearchDebuggingConfig;
import com.ss.android.ugc.aweme.socialsharesearch.api.ISocialSearchService;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368810lix extends AbstractC1368920lj8 {
    public final C1368870lj3 LLJIJIL;
    public View LLJILJIL;
    public EditText LLJILJILJ;
    public ImageView LLJILLL;
    public final C01GW LLJJ;
    public final InterfaceC1368900lj6 LLJJI;
    public boolean LLJJIII;
    public final C1368830liz LLJJIJI;
    public EnumC994470bzB LLJJIJIIJIL;

    @Override // X.AbstractC1368920lj8, X.InterfaceC1368960ljC
    public final void onDestroy() {
        InterfaceC1368900lj6 interfaceC1368900lj6;
        EditText editText;
        if (LIZJ().LJIILJJIL == null) {
            EditText editText2 = this.LLJILJILJ;
            if (editText2 != null) {
                editText2.clearFocus();
            }
            KeyboardUtils.LIZIZ(this.LLJILJILJ);
        }
        if (this.LLJJIII) {
            C1362630lYz.LIZ.getClass();
            C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
            if (c2096308Jd != null) {
                c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.SEARCH_USER.getValue()));
            }
            this.LLJJIII = false;
        }
        if (!C286630BLh.LIZ() || (interfaceC1368900lj6 = this.LLJJI) == null || (editText = this.LLJILJILJ) == null) {
            return;
        }
        editText.removeTextChangedListener(interfaceC1368900lj6);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0liz] */
    public C1368810lix(C1368870lj3 c1368870lj3) {
        InterfaceC1368900lj6 interfaceC1368900lj6LJ;
        super(c1368870lj3);
        this.LLJIJIL = c1368870lj3;
        this.LLJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 49));
        ISocialSearchService.LIZ.getClass();
        ISocialSearchService iSocialSearchServiceLIZ = C1368240li2.LIZ();
        if (iSocialSearchServiceLIZ != null) {
            interfaceC1368900lj6LJ = iSocialSearchServiceLIZ.LJ();
        } else {
            interfaceC1368900lj6LJ = null;
        }
        this.LLJJI = interfaceC1368900lj6LJ;
        this.LLJJIJI = new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0liz
            @Override // X.InterfaceC1006670cIr
            public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                C1602200rnO c1602200rnO3 = c1602200rnO2;
                if (((Boolean) C279080Awk.LIZ.getValue()).booleanValue() && c1602200rnO3.LIZJ()) {
                    SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                    SocialShareSearchDebuggingConfig socialShareSearchDebuggingConfig = C1268904xr.LIZ;
                    SocialShareSearchDebuggingConfig socialShareSearchDebuggingConfig2 = (SocialShareSearchDebuggingConfig) settingsManagerLIZLLL.LJIIIIZZ("social_share_search_debugging", SocialShareSearchDebuggingConfig.class, socialShareSearchDebuggingConfig);
                    if (socialShareSearchDebuggingConfig2 != null) {
                        socialShareSearchDebuggingConfig = socialShareSearchDebuggingConfig2;
                    }
                    if (!socialShareSearchDebuggingConfig.configFetchFail) {
                        ISocialSearchService.LIZ.getClass();
                        ISocialSearchService iSocialSearchServiceLIZ2 = C1368240li2.LIZ();
                        if (iSocialSearchServiceLIZ2 != null) {
                            iSocialSearchServiceLIZ2.LIZLLL();
                        }
                    }
                }
            }
        };
        this.LLJJIJIIJIL = EnumC994470bzB.HIDE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    @Override // X.InterfaceC1368960ljC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1368810lix.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}

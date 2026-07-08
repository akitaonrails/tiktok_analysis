package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.06qc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1733606qc extends LinearLayout {
    public final C01GW LL;
    public C1733806qe LLILLJJLI;

    private final PrivacySettingsFeature getPrivacySettings() {
        return (PrivacySettingsFeature) this.LL.getValue();
    }

    public final void LIZ() {
        C1231704rr c1231704rr = C1734106qh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGraduationSheet dismiss, state = ");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.getClass();
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ(this, C343970De7.LIZ);
    }

    public final void LIZIZ() {
        C1231704rr c1231704rr = C1734106qh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AgeGraduationSheet updateSettings, state = ");
        sbLIZ.append(this.LLILLJJLI);
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.getClass();
        C1733806qe c1733806qe = this.LLILLJJLI;
        if (c1733806qe != null) {
            getPrivacySettings().LJFF("message_read_status", c1733806qe.LIZ ? 1 : 2, C11S5.LIZ(), C1701940uOG.LIZIZ(), AFwS187S0000000_2.get$arr$(415), AFwS229S0000000_2.get$arr$(266), false);
            InterfaceC897380ZIi.LIZIZ.getClass();
            C897370ZIh.LIZ().LJ().LJIIIZ(c1733806qe.LIZIZ ? EnumC1643306c3.FRIENDS : EnumC1643306c3.NO_ONE, AFwS187S0000000_2.get$arr$(1039));
        }
    }

    public C1733606qc(Context context) {
        super(context, null, 0);
        this.LL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1144));
        setOrientation(1);
        setGravity(1);
    }
}

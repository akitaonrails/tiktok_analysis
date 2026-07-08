package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideDialogConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdExternalGuideTriggerCondition;
import com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS665S0100000_16;

/* JADX INFO: renamed from: X.0dHT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044250dHT extends AbsAdExternalGuideHandler {
    public final Context LJ;
    public final AdExternalGuideDialogConfig LJFF;

    @Override // com.ss.android.ugc.aweme.landpage.externalguide.AbsAdExternalGuideHandler
    public final boolean LJ() {
        if (!C0DHG.LIZ() || C1388190mED.LIZ(this.LJ) == null) {
            C1397580mTM c1397580mTM = new C1397580mTM(this.LJ);
            c1397580mTM.LJI(this.LJFF.getTitle());
            c1397580mTM.LIZIZ(this.LJFF.getDescription());
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new AwS595S0100000_16(this, 244));
            new C1397510mTF(c1397580mTM).LIZLLL();
        } else {
            C632670Orh.LIZIZ(this.LJ, new C19719212De(1800533441, new AwS665S0100000_16(this, 3), true));
        }
        LJIIIZ(2L);
        return true;
    }

    public C1044250dHT(Context context, AdExternalGuideTriggerCondition adExternalGuideTriggerCondition, AbstractC1038360d7y abstractC1038360d7y, AdExternalGuideDialogConfig adExternalGuideDialogConfig) {
        super(adExternalGuideTriggerCondition, abstractC1038360d7y);
        this.LJ = context;
        this.LJFF = adExternalGuideDialogConfig;
    }
}

package X;

import com.ss.android.ugc.aweme.captionsheet.BaseCaptionSheetFragment;
import com.ss.android.ugc.aweme.captionsheet.CaptionSecondaryPanelFragment;
import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import com.ss.android.ugc.aweme.captionsheet.DMTranslationPanelFragment;
import com.ss.android.ugc.aweme.captionsheet.LandscapeCaptionPanelFragment;
import com.ss.android.ugc.aweme.captionsheet.PhotoTranslationPanelFragment;
import com.ss.android.ugc.aweme.captionsheet.PhotoTranslationPanelFragmentV2;

/* JADX INFO: renamed from: X.15z0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20698015z0 {
    public final C20698415z4 LIZ;

    public C20698015z0(C20698415z4 c20698415z4) {
        this.LIZ = c20698415z4;
    }

    public final BaseCaptionSheetFragment LIZ(EnumC20698315z3 enumC20698315z3) {
        BaseCaptionSheetFragment landscapeCaptionPanelFragment;
        int i = C20698215z2.LIZ[enumC20698315z3.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            landscapeCaptionPanelFragment = new DMTranslationPanelFragment(0);
                        } else {
                            throw new C1954807lC();
                        }
                    } else if (!((Boolean) C257550A7l.LIZ.getValue()).booleanValue()) {
                        landscapeCaptionPanelFragment = new PhotoTranslationPanelFragmentV2(0);
                    } else {
                        landscapeCaptionPanelFragment = new PhotoTranslationPanelFragment(0);
                    }
                } else {
                    landscapeCaptionPanelFragment = new CaptionSecondaryPanelFragment(0);
                }
            } else {
                landscapeCaptionPanelFragment = new CaptionsPanelFragment(0);
            }
        } else {
            landscapeCaptionPanelFragment = new LandscapeCaptionPanelFragment(0);
        }
        landscapeCaptionPanelFragment.LLILLJJLI = this.LIZ;
        return landscapeCaptionPanelFragment;
    }
}

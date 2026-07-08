package X;

import android.content.Context;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0MFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565430MFp extends C0MG0<MentionDataItem, C0M37> {
    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    @Override // X.C0MG0
    public final C0M37 LJIIIZ(MentionDataItem mentionDataItem) {
        int iIntValue;
        int iIntValue2;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1p, getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = -7829368;
        }
        return new C0M37(mentionDataItem, iIntValue, iIntValue2, null);
    }

    @Override // X.C0MG0
    public final String LJIIL(C0M37 c0m37) {
        MentionDataItem mentionDataItem = c0m37.LL;
        if (mentionDataItem != null) {
            return mentionDataItem.name;
        }
        return null;
    }

    public C565430MFp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.xv);
    }

    public final C1325340kaq LJIILLIIL(C557390LtZ c557390LtZ, C565430MFp c565430MFp) {
        return new C1325340kaq(new C565460MFs(c557390LtZ, c565430MFp, null));
    }
}

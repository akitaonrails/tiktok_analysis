package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.jsb.comment.ExteriorRecordModel;

/* JADX INFO: renamed from: X.0LH8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LH8 implements C0MB4 {
    public static final C0LH8 LIZ = new C0LH8();

    @Override // X.C0MB4
    public final boolean LIZ(Context context, Bundle bundle) {
        boolean z;
        boolean z2;
        ExteriorRecordModel exteriorRecordModel;
        C0LGC c0lgc;
        if (bundle != null && bundle.containsKey("exterior_record_model") && (exteriorRecordModel = (ExteriorRecordModel) bundle.getParcelable("exterior_record_model")) != null && (c0lgc = exteriorRecordModel.recordPageType) != null && c0lgc.getType() == C0LG8.PHOTO_SEARCH.getType()) {
            if (C1403010mc7.LIZ.LJ().LJFF(context) == 0) {
                return true;
            }
            return false;
        }
        if (C1403010mc7.LIZ.LJ().LJFF(context) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (C1403010mc7.LIZ.LJ().LJ(context) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return true;
        }
        return false;
    }
}

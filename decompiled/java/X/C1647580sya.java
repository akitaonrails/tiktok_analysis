package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0sya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1647580sya {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, EnumC1647570syZ.RECORD_COMBINE.getTag()) && !TextUtils.equals(charSequence, EnumC1647570syZ.RECORD_COMBINE_15.getTag()) && !TextUtils.equals(charSequence, EnumC1647570syZ.RECORD_COMBINE_60.getTag()) && !TextUtils.equals(charSequence, EnumC1647570syZ.RECORD_COMBINE_LIGHTENING.getTag())) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, EnumC1647570syZ.RECORD_LIGHTENING_VIDEO.getTag()) && !TextUtils.equals(charSequence, EnumC1647570syZ.RECORD_LIGHTENING_PHOTO_AND_VIDEO.getTag())) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(CharSequence charSequence) {
        return TextUtils.equals(charSequence, EnumC1647570syZ.LIVE.getTag());
    }

    public static boolean LIZLLL(CharSequence charSequence) {
        return TextUtils.equals(charSequence, "record_mode_mv");
    }

    public static boolean LJ(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, EnumC1647570syZ.RECORD_SPLIT_3MIN.getTag()) && !TextUtils.equals(charSequence, EnumC1647570syZ.RECORD_SPLIT_LIGHTENING.getTag())) {
            return false;
        }
        return true;
    }
}

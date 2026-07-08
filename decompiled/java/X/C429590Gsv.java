package X;

import com.ss.android.ugc.aweme.ability.IPhotoNestHeaderAbility;

/* JADX INFO: renamed from: X.0Gsv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429590Gsv {
    public static final boolean LIZ(IPhotoNestHeaderAbility iPhotoNestHeaderAbility, boolean z) {
        Integer numValueOf = Integer.valueOf(iPhotoNestHeaderAbility.dM1());
        if ((numValueOf != null && (numValueOf.intValue() == 0 || numValueOf.intValue() == 2 || numValueOf.intValue() == 3)) || (!z && numValueOf != null && numValueOf.intValue() == 1)) {
            return true;
        }
        return false;
    }
}

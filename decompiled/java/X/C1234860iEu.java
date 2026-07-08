package X;

import com.ss.android.ugc.profile.business.ur.school.datasource.CampusGroup;

/* JADX INFO: renamed from: X.0iEu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234860iEu {
    public static final EnumC1234850iEt LIZ(CampusGroup campusGroup) {
        Integer num = campusGroup.verifyStatus;
        int value = EnumC1229960i70.IN_GROUP.getValue();
        if (num != null && num.intValue() == value) {
            return EnumC1234850iEt.MY_GROUPS;
        }
        return EnumC1234850iEt.EXPLORE;
    }
}

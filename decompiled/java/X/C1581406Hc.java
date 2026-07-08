package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.UserInteractionRecord;

/* JADX INFO: renamed from: X.06Hc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1581406Hc {
    public static final C1581806Hg LIZ(UserInteractionRecord userInteractionRecord) {
        int value;
        String str = userInteractionRecord.id;
        int value2 = 0;
        if (str == null || str.length() == 0) {
            C1AF0.LIZJ("UserInteractionRecord.id is null");
        }
        String str2 = userInteractionRecord.id;
        if (str2 == null) {
            str2 = "";
        }
        C06G4 c06g4 = userInteractionRecord.targetType;
        if (c06g4 != null) {
            value = c06g4.getValue();
        } else {
            value = 0;
        }
        EnumC1581606He enumC1581606He = userInteractionRecord.businessType;
        if (enumC1581606He != null) {
            value2 = enumC1581606He.getValue();
        }
        return new C1581806Hg(str2, value, value2, userInteractionRecord.data);
    }

    public static final UserInteractionRecord LIZIZ(C1581806Hg c1581806Hg) {
        C06G4 c06g4;
        if (c1581806Hg.LIZ.length() == 0) {
            C1AF0.LIZJ("UserInteractionRecord.id is null");
        }
        String str = c1581806Hg.LIZ;
        C06GN c06gn = C06G4.Companion;
        int i = c1581806Hg.LIZIZ;
        c06gn.getClass();
        EnumC1581606He enumC1581606He = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    c06g4 = null;
                } else {
                    c06g4 = C06G4.CONVERSATION;
                }
            } else {
                c06g4 = C06G4.USER;
            }
        } else {
            c06g4 = C06G4.UNKNOWN;
        }
        C1581906Hh c1581906Hh = EnumC1581606He.Companion;
        int i2 = c1581806Hg.LIZJ;
        c1581906Hh.getClass();
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    enumC1581606He = EnumC1581606He.STREAK_PET;
                }
            } else {
                enumC1581606He = EnumC1581606He.STREAK;
            }
        } else {
            enumC1581606He = EnumC1581606He.UNKNOWN;
        }
        return new UserInteractionRecord(str, c06g4, enumC1581606He, c1581806Hg.LIZLLL);
    }
}

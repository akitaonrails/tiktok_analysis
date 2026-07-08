package X;

import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.profile.business.ur.school.addschool.GraduationYearPageAssem;
import com.ss.android.ugc.profile.business.ur.school.addschool.SelectSchoolPageAssem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.SearchSchoolMembersAssem;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.EditCampusPageAssem;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.CorrectSchoolPageAssem;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterEmailPageAssem;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterPinPageAssem;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DMj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC337870DMj {
    public static final EnumC337870DMj CORRECT_SCHOOL;
    public static final EnumC337870DMj EDIT_CAMPUS;
    public static final EnumC337870DMj ENTER_EMAIL;
    public static final EnumC337870DMj ENTER_PIN;
    public static final EnumC337870DMj FIND_SCHOOL_FRIENDS;
    public static final EnumC337870DMj GRADUATION_YEAR;
    public static final /* synthetic */ EnumC337870DMj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC337870DMj SEARCH_SCHOOL_FRIENDS;
    public static final EnumC337870DMj SELECT_SCHOOL;

    public static InterfaceC2044707zh<EnumC337870DMj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC337870DMj enumC337870DMj = new EnumC337870DMj("SELECT_SCHOOL", 0);
        SELECT_SCHOOL = enumC337870DMj;
        EnumC337870DMj enumC337870DMj2 = new EnumC337870DMj("EDIT_CAMPUS", 1);
        EDIT_CAMPUS = enumC337870DMj2;
        EnumC337870DMj enumC337870DMj3 = new EnumC337870DMj("GRADUATION_YEAR", 2);
        GRADUATION_YEAR = enumC337870DMj3;
        EnumC337870DMj enumC337870DMj4 = new EnumC337870DMj("FIND_SCHOOL_FRIENDS", 3);
        FIND_SCHOOL_FRIENDS = enumC337870DMj4;
        EnumC337870DMj enumC337870DMj5 = new EnumC337870DMj("ENTER_EMAIL", 4);
        ENTER_EMAIL = enumC337870DMj5;
        EnumC337870DMj enumC337870DMj6 = new EnumC337870DMj("CORRECT_SCHOOL", 5);
        CORRECT_SCHOOL = enumC337870DMj6;
        EnumC337870DMj enumC337870DMj7 = new EnumC337870DMj("ENTER_PIN", 6);
        ENTER_PIN = enumC337870DMj7;
        EnumC337870DMj enumC337870DMj8 = new EnumC337870DMj("SEARCH_SCHOOL_FRIENDS", 7);
        SEARCH_SCHOOL_FRIENDS = enumC337870DMj8;
        EnumC337870DMj[] enumC337870DMjArr = {enumC337870DMj, enumC337870DMj2, enumC337870DMj3, enumC337870DMj4, enumC337870DMj5, enumC337870DMj6, enumC337870DMj7, enumC337870DMj8};
        LL = enumC337870DMjArr;
        LLILLJJLI = new C2254308sP(enumC337870DMjArr);
    }

    public static EnumC337870DMj[] values() {
        return (EnumC337870DMj[]) LL.clone();
    }

    public final C13IQ<? extends UISlotAssem> pageAssem() {
        Class cls;
        switch (C337860DMi.LIZ[ordinal()]) {
            case 1:
                cls = SelectSchoolPageAssem.class;
                break;
            case 2:
                cls = EditCampusPageAssem.class;
                break;
            case 3:
                cls = GraduationYearPageAssem.class;
                break;
            case 4:
                cls = FindSchoolFriendsPageContainerAssem.class;
                break;
            case 5:
                cls = SearchSchoolMembersAssem.class;
                break;
            case 6:
                cls = EnterEmailPageAssem.class;
                break;
            case 7:
                cls = CorrectSchoolPageAssem.class;
                break;
            case 8:
                cls = EnterPinPageAssem.class;
                break;
            default:
                throw new C1954807lC();
        }
        return C13LE.LIZ(cls);
    }

    public static EnumC337870DMj valueOf(String str) {
        return (EnumC337870DMj) C08FF.LIZ(EnumC337870DMj.class, str);
    }

    public EnumC337870DMj(String str, int i) {
    }
}

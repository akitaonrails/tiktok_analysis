package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZPl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC899230ZPl {
    public static final EnumC899230ZPl ADD_PEOPLE;
    public static final EnumC899230ZPl INVITE_LINK;
    public static final EnumC899230ZPl INVITE_PEOPLE;
    public static final /* synthetic */ EnumC899230ZPl[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC899230ZPl> getEntries() {
        return LLILZ;
    }

    static {
        EnumC899230ZPl enumC899230ZPl = new EnumC899230ZPl("ADD_PEOPLE", 0, R.raw.icon_person_plus_fill, 2131831351);
        ADD_PEOPLE = enumC899230ZPl;
        EnumC899230ZPl enumC899230ZPl2 = new EnumC899230ZPl("INVITE_PEOPLE", 1, R.raw.icon_person_plus_fill, 2131831354);
        INVITE_PEOPLE = enumC899230ZPl2;
        EnumC899230ZPl enumC899230ZPl3 = new EnumC899230ZPl("INVITE_LINK", 2, R.raw.icon_link_fill, 2131831353);
        INVITE_LINK = enumC899230ZPl3;
        EnumC899230ZPl[] enumC899230ZPlArr = {enumC899230ZPl, enumC899230ZPl2, enumC899230ZPl3};
        LLILLL = enumC899230ZPlArr;
        LLILZ = new C2254308sP(enumC899230ZPlArr);
    }

    public static EnumC899230ZPl[] values() {
        return (EnumC899230ZPl[]) LLILLL.clone();
    }

    public final int getIcon() {
        return this.LL;
    }

    public final int getText() {
        return this.LLILLJJLI;
    }

    public static EnumC899230ZPl valueOf(String str) {
        return (EnumC899230ZPl) C08FF.LIZ(EnumC899230ZPl.class, str);
    }

    public EnumC899230ZPl(String str, int i, int i2, int i3) {
        this.LL = i2;
        this.LLILLJJLI = i3;
    }
}

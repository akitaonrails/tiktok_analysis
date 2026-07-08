package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gXe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1169600gXe {
    public static final EnumC1169600gXe BOTH_AVATAR_AND_NICKNAME;
    public static final /* synthetic */ EnumC1169600gXe[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1169600gXe ONLY_AVATAR;
    public static final EnumC1169600gXe ONLY_NICKNAME;
    public final boolean LL;
    public final boolean LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1169600gXe> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1169600gXe enumC1169600gXe = new EnumC1169600gXe("ONLY_AVATAR", 0, true, false);
        ONLY_AVATAR = enumC1169600gXe;
        EnumC1169600gXe enumC1169600gXe2 = new EnumC1169600gXe("ONLY_NICKNAME", 1, false, true);
        ONLY_NICKNAME = enumC1169600gXe2;
        EnumC1169600gXe enumC1169600gXe3 = new EnumC1169600gXe("BOTH_AVATAR_AND_NICKNAME", 2, true, true);
        BOTH_AVATAR_AND_NICKNAME = enumC1169600gXe3;
        EnumC1169600gXe[] enumC1169600gXeArr = {enumC1169600gXe, enumC1169600gXe2, enumC1169600gXe3};
        LLILLL = enumC1169600gXeArr;
        LLILZ = new C2254308sP(enumC1169600gXeArr);
    }

    public static EnumC1169600gXe[] values() {
        return (EnumC1169600gXe[]) LLILLL.clone();
    }

    public final boolean getShowAvatar() {
        return this.LL;
    }

    public final boolean getShowNickname() {
        return this.LLILLJJLI;
    }

    public static EnumC1169600gXe valueOf(String str) {
        return (EnumC1169600gXe) C08FF.LIZ(EnumC1169600gXe.class, str);
    }

    public EnumC1169600gXe(String str, int i, boolean z, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = z2;
    }
}

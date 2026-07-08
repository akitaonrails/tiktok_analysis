package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hlb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1216690hlb {
    public static final EnumC1216690hlb DESTRUCTIVE;
    public static final EnumC1216690hlb GO_LIVE;
    public static final EnumC1216690hlb INVITE;
    public static final EnumC1216690hlb JOIN;
    public static final /* synthetic */ EnumC1216690hlb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1216690hlb MEMBER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1216690hlb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1216690hlb enumC1216690hlb = new EnumC1216690hlb("JOIN", 0, R.id.nxz);
        JOIN = enumC1216690hlb;
        EnumC1216690hlb enumC1216690hlb2 = new EnumC1216690hlb("INVITE", 1, R.id.nxx);
        INVITE = enumC1216690hlb2;
        EnumC1216690hlb enumC1216690hlb3 = new EnumC1216690hlb("MEMBER", 2, R.id.ny2);
        MEMBER = enumC1216690hlb3;
        EnumC1216690hlb enumC1216690hlb4 = new EnumC1216690hlb("GO_LIVE", 3, R.id.nxt);
        GO_LIVE = enumC1216690hlb4;
        EnumC1216690hlb enumC1216690hlb5 = new EnumC1216690hlb("DESTRUCTIVE", 4, R.id.nxr);
        DESTRUCTIVE = enumC1216690hlb5;
        EnumC1216690hlb[] enumC1216690hlbArr = {enumC1216690hlb, enumC1216690hlb2, enumC1216690hlb3, enumC1216690hlb4, enumC1216690hlb5};
        LLILLJJLI = enumC1216690hlbArr;
        LLILLL = new C2254308sP(enumC1216690hlbArr);
    }

    public static EnumC1216690hlb[] values() {
        return (EnumC1216690hlb[]) LLILLJJLI.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public static EnumC1216690hlb valueOf(String str) {
        return (EnumC1216690hlb) C08FF.LIZ(EnumC1216690hlb.class, str);
    }

    public EnumC1216690hlb(String str, int i, int i2) {
        this.LL = i2;
    }
}

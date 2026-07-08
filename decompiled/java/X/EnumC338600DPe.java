package X;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC338600DPe implements Serializable {
    public static final EnumC338600DPe GROUP;
    public static final /* synthetic */ EnumC338600DPe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC338600DPe POST;
    public static final EnumC338600DPe USER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC338600DPe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC338600DPe enumC338600DPe = new EnumC338600DPe("POST", 0, "posts");
        POST = enumC338600DPe;
        EnumC338600DPe enumC338600DPe2 = new EnumC338600DPe("GROUP", 1, "groups");
        GROUP = enumC338600DPe2;
        EnumC338600DPe enumC338600DPe3 = new EnumC338600DPe("USER", 2, "members");
        USER = enumC338600DPe3;
        EnumC338600DPe[] enumC338600DPeArr = {enumC338600DPe, enumC338600DPe2, enumC338600DPe3};
        LLILLJJLI = enumC338600DPeArr;
        LLILLL = new C2254308sP(enumC338600DPeArr);
    }

    public static EnumC338600DPe[] values() {
        return (EnumC338600DPe[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC338600DPe valueOf(String str) {
        return (EnumC338600DPe) C08FF.LIZ(EnumC338600DPe.class, str);
    }

    public EnumC338600DPe(String str, int i, String str2) {
        this.LL = str2;
    }
}

package X;

import java.util.Collections;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1154830g9p {
    public static final EnumC1154830g9p CAMERA;
    public static final /* synthetic */ EnumC1154830g9p[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1154830g9p PHOTOALBUM;
    public static final EnumC1154830g9p UNKNOWN;
    public final List<String> LL;

    public static InterfaceC2044707zh<EnumC1154830g9p> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1154830g9p enumC1154830g9p = new EnumC1154830g9p("CAMERA", 0, Collections.singletonList("android.permission.CAMERA"));
        CAMERA = enumC1154830g9p;
        EnumC1154830g9p enumC1154830g9p2 = new EnumC1154830g9p("PHOTOALBUM", 1, C13BV.INSTANCE);
        PHOTOALBUM = enumC1154830g9p2;
        EnumC1154830g9p enumC1154830g9p3 = new EnumC1154830g9p("UNKNOWN", 2, Collections.singletonList(null));
        UNKNOWN = enumC1154830g9p3;
        EnumC1154830g9p[] enumC1154830g9pArr = {enumC1154830g9p, enumC1154830g9p2, enumC1154830g9p3};
        LLILLJJLI = enumC1154830g9pArr;
        LLILLL = new C2254308sP(enumC1154830g9pArr);
    }

    public static EnumC1154830g9p[] values() {
        return (EnumC1154830g9p[]) LLILLJJLI.clone();
    }

    public final List<String> getPermission() {
        return this.LL;
    }

    public static EnumC1154830g9p valueOf(String str) {
        return (EnumC1154830g9p) C08FF.LIZ(EnumC1154830g9p.class, str);
    }

    public EnumC1154830g9p(String str, int i, List list) {
        this.LL = list;
    }
}

package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.144o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class EnumC202064144o {
    public static final EnumC202064144o APPEND;
    public static final EnumC202064144o BACK;
    public static final EnumC202064144o DEFAULT;
    public static final /* synthetic */ EnumC202064144o[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC202064144o REPLACE;

    public static InterfaceC2044707zh<EnumC202064144o> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC202064144o enumC202064144o = new EnumC202064144o(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC202064144o;
        EnumC202064144o enumC202064144o2 = new EnumC202064144o("REPLACE", 1);
        REPLACE = enumC202064144o2;
        EnumC202064144o enumC202064144o3 = new EnumC202064144o("APPEND", 2);
        APPEND = enumC202064144o3;
        EnumC202064144o enumC202064144o4 = new EnumC202064144o("BACK", 3);
        BACK = enumC202064144o4;
        EnumC202064144o[] enumC202064144oArr = {enumC202064144o, enumC202064144o2, enumC202064144o3, enumC202064144o4};
        LL = enumC202064144oArr;
        LLILLJJLI = new C2254308sP(enumC202064144oArr);
    }

    public static EnumC202064144o[] values() {
        return (EnumC202064144o[]) LL.clone();
    }

    public static EnumC202064144o valueOf(String str) {
        return (EnumC202064144o) C08FF.LIZ(EnumC202064144o.class, str);
    }

    public EnumC202064144o(String str, int i) {
    }
}

package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.05nm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1461205nm {
    public static final EnumC1461205nm DEFAULT;
    public static final /* synthetic */ EnumC1461205nm[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1461205nm UPDATE_MEMBER;
    public static final EnumC1461205nm UPDATE_USER;

    public static InterfaceC2044707zh<EnumC1461205nm> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1461205nm enumC1461205nm = new EnumC1461205nm(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1461205nm;
        EnumC1461205nm enumC1461205nm2 = new EnumC1461205nm("UPDATE_MEMBER", 1);
        UPDATE_MEMBER = enumC1461205nm2;
        EnumC1461205nm enumC1461205nm3 = new EnumC1461205nm("UPDATE_USER", 2);
        UPDATE_USER = enumC1461205nm3;
        EnumC1461205nm[] enumC1461205nmArr = {enumC1461205nm, enumC1461205nm2, enumC1461205nm3};
        LL = enumC1461205nmArr;
        LLILLJJLI = new C2254308sP(enumC1461205nmArr);
    }

    public static EnumC1461205nm[] values() {
        return (EnumC1461205nm[]) LL.clone();
    }

    public static EnumC1461205nm valueOf(String str) {
        return (EnumC1461205nm) C08FF.LIZ(EnumC1461205nm.class, str);
    }

    public EnumC1461205nm(String str, int i) {
    }
}

package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bQn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC973150bQn {
    public static final EnumC973150bQn DEFAULT;
    public static final /* synthetic */ EnumC973150bQn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC973150bQn SMALL;

    public static InterfaceC2044707zh<EnumC973150bQn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC973150bQn enumC973150bQn = new EnumC973150bQn(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC973150bQn;
        EnumC973150bQn enumC973150bQn2 = new EnumC973150bQn("SMALL", 1);
        SMALL = enumC973150bQn2;
        EnumC973150bQn[] enumC973150bQnArr = {enumC973150bQn, enumC973150bQn2};
        LL = enumC973150bQnArr;
        LLILLJJLI = new C2254308sP(enumC973150bQnArr);
    }

    public static EnumC973150bQn[] values() {
        return (EnumC973150bQn[]) LL.clone();
    }

    public static EnumC973150bQn valueOf(String str) {
        return (EnumC973150bQn) C08FF.LIZ(EnumC973150bQn.class, str);
    }

    public EnumC973150bQn(String str, int i) {
    }
}

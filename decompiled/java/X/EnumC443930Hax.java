package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Hax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC443930Hax {
    public static final EnumC443930Hax DEFAULT;
    public static final EnumC443930Hax LAZY;
    public static final /* synthetic */ EnumC443930Hax[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC443930Hax> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC443930Hax enumC443930Hax = new EnumC443930Hax(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC443930Hax;
        EnumC443930Hax enumC443930Hax2 = new EnumC443930Hax("LAZY", 1);
        LAZY = enumC443930Hax2;
        EnumC443930Hax[] enumC443930HaxArr = {enumC443930Hax, enumC443930Hax2};
        LL = enumC443930HaxArr;
        LLILLJJLI = new C2254308sP(enumC443930HaxArr);
    }

    public static EnumC443930Hax[] values() {
        return (EnumC443930Hax[]) LL.clone();
    }

    public static EnumC443930Hax valueOf(String str) {
        return (EnumC443930Hax) C08FF.LIZ(EnumC443930Hax.class, str);
    }

    public EnumC443930Hax(String str, int i) {
    }
}

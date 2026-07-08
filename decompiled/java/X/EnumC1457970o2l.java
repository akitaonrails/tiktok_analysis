package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0o2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1457970o2l {
    public static final EnumC1457970o2l DEFAULT;
    public static final /* synthetic */ EnumC1457970o2l[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1457970o2l LOADING;
    public static final EnumC1457970o2l PLAYING;

    public static InterfaceC2044707zh<EnumC1457970o2l> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1457970o2l enumC1457970o2l = new EnumC1457970o2l("LOADING", 0);
        LOADING = enumC1457970o2l;
        EnumC1457970o2l enumC1457970o2l2 = new EnumC1457970o2l("PLAYING", 1);
        PLAYING = enumC1457970o2l2;
        EnumC1457970o2l enumC1457970o2l3 = new EnumC1457970o2l(LivePreviewCTASmartDisplayManager.DEFAULT, 2);
        DEFAULT = enumC1457970o2l3;
        EnumC1457970o2l[] enumC1457970o2lArr = {enumC1457970o2l, enumC1457970o2l2, enumC1457970o2l3};
        LL = enumC1457970o2lArr;
        LLILLJJLI = new C2254308sP(enumC1457970o2lArr);
    }

    public static EnumC1457970o2l[] values() {
        return (EnumC1457970o2l[]) LL.clone();
    }

    public static EnumC1457970o2l valueOf(String str) {
        return (EnumC1457970o2l) C08FF.LIZ(EnumC1457970o2l.class, str);
    }

    public EnumC1457970o2l(String str, int i) {
    }
}

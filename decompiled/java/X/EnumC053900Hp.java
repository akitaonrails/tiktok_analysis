package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC053900Hp {
    public static final EnumC053900Hp DEFAULT;
    public static final EnumC053900Hp FAKE_NULLIFY_CARD;
    public static final /* synthetic */ EnumC053900Hp[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC053900Hp> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC053900Hp enumC053900Hp = new EnumC053900Hp(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC053900Hp;
        EnumC053900Hp enumC053900Hp2 = new EnumC053900Hp("FAKE_NULLIFY_CARD", 1);
        FAKE_NULLIFY_CARD = enumC053900Hp2;
        EnumC053900Hp[] enumC053900HpArr = {enumC053900Hp, enumC053900Hp2};
        LL = enumC053900HpArr;
        LLILLJJLI = new C2254308sP(enumC053900HpArr);
    }

    public static EnumC053900Hp[] values() {
        return (EnumC053900Hp[]) LL.clone();
    }

    public static EnumC053900Hp valueOf(String str) {
        return (EnumC053900Hp) C08FF.LIZ(EnumC053900Hp.class, str);
    }

    public EnumC053900Hp(String str, int i) {
    }
}

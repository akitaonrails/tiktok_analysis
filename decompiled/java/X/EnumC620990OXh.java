package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OXh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC620990OXh {
    public static final EnumC620990OXh DEFAULT;
    public static final EnumC620990OXh FAIL;
    public static final /* synthetic */ EnumC620990OXh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC620990OXh RETHINK_REMOVE;
    public static final EnumC620990OXh START;
    public static final EnumC620990OXh SUCCESS;

    public static InterfaceC2044707zh<EnumC620990OXh> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC620990OXh enumC620990OXh = new EnumC620990OXh(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC620990OXh;
        EnumC620990OXh enumC620990OXh2 = new EnumC620990OXh("START", 1);
        START = enumC620990OXh2;
        EnumC620990OXh enumC620990OXh3 = new EnumC620990OXh("SUCCESS", 2);
        SUCCESS = enumC620990OXh3;
        EnumC620990OXh enumC620990OXh4 = new EnumC620990OXh("FAIL", 3);
        FAIL = enumC620990OXh4;
        EnumC620990OXh enumC620990OXh5 = new EnumC620990OXh("RETHINK_REMOVE", 4);
        RETHINK_REMOVE = enumC620990OXh5;
        EnumC620990OXh[] enumC620990OXhArr = {enumC620990OXh, enumC620990OXh2, enumC620990OXh3, enumC620990OXh4, enumC620990OXh5};
        LL = enumC620990OXhArr;
        LLILLJJLI = new C2254308sP(enumC620990OXhArr);
    }

    public static EnumC620990OXh[] values() {
        return (EnumC620990OXh[]) LL.clone();
    }

    public static EnumC620990OXh valueOf(String str) {
        return (EnumC620990OXh) C08FF.LIZ(EnumC620990OXh.class, str);
    }

    public EnumC620990OXh(String str, int i) {
    }
}

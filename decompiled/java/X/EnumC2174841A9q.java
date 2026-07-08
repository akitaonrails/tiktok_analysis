package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1A9q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2174841A9q {
    public static final EnumC2174841A9q DEFAULT;
    public static final EnumC2174841A9q FOLLOW_DUAL;
    public static final EnumC2174841A9q FOLLOW_SINGLE;
    public static final EnumC2174841A9q HIDDEN;
    public static final /* synthetic */ EnumC2174841A9q[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC2174841A9q SEND_A_WAVE;

    public static InterfaceC2044707zh<EnumC2174841A9q> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC2174841A9q enumC2174841A9q = new EnumC2174841A9q(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC2174841A9q;
        EnumC2174841A9q enumC2174841A9q2 = new EnumC2174841A9q("FOLLOW_DUAL", 1);
        FOLLOW_DUAL = enumC2174841A9q2;
        EnumC2174841A9q enumC2174841A9q3 = new EnumC2174841A9q("FOLLOW_SINGLE", 2);
        FOLLOW_SINGLE = enumC2174841A9q3;
        EnumC2174841A9q enumC2174841A9q4 = new EnumC2174841A9q("HIDDEN", 3);
        HIDDEN = enumC2174841A9q4;
        EnumC2174841A9q enumC2174841A9q5 = new EnumC2174841A9q("SEND_A_WAVE", 4);
        SEND_A_WAVE = enumC2174841A9q5;
        EnumC2174841A9q[] enumC2174841A9qArr = {enumC2174841A9q, enumC2174841A9q2, enumC2174841A9q3, enumC2174841A9q4, enumC2174841A9q5};
        LL = enumC2174841A9qArr;
        LLILLJJLI = new C2254308sP(enumC2174841A9qArr);
    }

    public static EnumC2174841A9q[] values() {
        return (EnumC2174841A9q[]) LL.clone();
    }

    public static EnumC2174841A9q valueOf(String str) {
        return (EnumC2174841A9q) C08FF.LIZ(EnumC2174841A9q.class, str);
    }

    public EnumC2174841A9q(String str, int i) {
    }
}

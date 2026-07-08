package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Fq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC048800Fq {
    public static final EnumC048800Fq DEFAULT;
    public static final /* synthetic */ EnumC048800Fq[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC048800Fq POST_MODE;

    public static InterfaceC2044707zh<EnumC048800Fq> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC048800Fq enumC048800Fq = new EnumC048800Fq("POST_MODE", 0);
        POST_MODE = enumC048800Fq;
        EnumC048800Fq enumC048800Fq2 = new EnumC048800Fq(LivePreviewCTASmartDisplayManager.DEFAULT, 1);
        DEFAULT = enumC048800Fq2;
        EnumC048800Fq[] enumC048800FqArr = {enumC048800Fq, enumC048800Fq2};
        LL = enumC048800FqArr;
        LLILLJJLI = new C2254308sP(enumC048800FqArr);
    }

    public static EnumC048800Fq[] values() {
        return (EnumC048800Fq[]) LL.clone();
    }

    public static EnumC048800Fq valueOf(String str) {
        return (EnumC048800Fq) C08FF.LIZ(EnumC048800Fq.class, str);
    }

    public EnumC048800Fq(String str, int i) {
    }
}

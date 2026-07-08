package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992990bwn {
    public static final EnumC992990bwn DEFAULT;
    public static final /* synthetic */ EnumC992990bwn[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC992990bwn REVISIT_REWARD;

    public static InterfaceC2044707zh<EnumC992990bwn> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC992990bwn enumC992990bwn = new EnumC992990bwn(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC992990bwn;
        EnumC992990bwn enumC992990bwn2 = new EnumC992990bwn("REVISIT_REWARD", 1);
        REVISIT_REWARD = enumC992990bwn2;
        EnumC992990bwn[] enumC992990bwnArr = {enumC992990bwn, enumC992990bwn2};
        LL = enumC992990bwnArr;
        LLILLJJLI = new C2254308sP(enumC992990bwnArr);
    }

    public static EnumC992990bwn[] values() {
        return (EnumC992990bwn[]) LL.clone();
    }

    public static EnumC992990bwn valueOf(String str) {
        return (EnumC992990bwn) C08FF.LIZ(EnumC992990bwn.class, str);
    }

    public EnumC992990bwn(String str, int i) {
    }
}

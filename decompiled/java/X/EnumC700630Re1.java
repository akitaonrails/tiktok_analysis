package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Re1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC700630Re1 {
    public static final EnumC700630Re1 COLD;
    public static final EnumC700630Re1 DEFAULT;
    public static final /* synthetic */ EnumC700630Re1[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC700630Re1 REALTIME;
    public final String LL;

    public static InterfaceC2044707zh<EnumC700630Re1> getEntries() {
        return LLILLL;
    }

    static {
        EnumC700630Re1 enumC700630Re1 = new EnumC700630Re1(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
        DEFAULT = enumC700630Re1;
        EnumC700630Re1 enumC700630Re12 = new EnumC700630Re1("REALTIME", 1, "realtime");
        REALTIME = enumC700630Re12;
        EnumC700630Re1 enumC700630Re13 = new EnumC700630Re1("COLD", 2, "cold");
        COLD = enumC700630Re13;
        EnumC700630Re1[] enumC700630Re1Arr = {enumC700630Re1, enumC700630Re12, enumC700630Re13};
        LLILLJJLI = enumC700630Re1Arr;
        LLILLL = new C2254308sP(enumC700630Re1Arr);
    }

    public static EnumC700630Re1[] values() {
        return (EnumC700630Re1[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC700630Re1 valueOf(String str) {
        return (EnumC700630Re1) C08FF.LIZ(EnumC700630Re1.class, str);
    }

    public EnumC700630Re1(String str, int i, String str2) {
        this.LL = str2;
    }
}

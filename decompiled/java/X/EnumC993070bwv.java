package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bwv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993070bwv {
    public static final EnumC993070bwv DEFAULT;
    public static final /* synthetic */ EnumC993070bwv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993070bwv SERVICE_PLUS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC993070bwv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993070bwv enumC993070bwv = new EnumC993070bwv(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC993070bwv;
        EnumC993070bwv enumC993070bwv2 = new EnumC993070bwv("SERVICE_PLUS", 1, 1);
        SERVICE_PLUS = enumC993070bwv2;
        EnumC993070bwv[] enumC993070bwvArr = {enumC993070bwv, enumC993070bwv2};
        LLILLJJLI = enumC993070bwvArr;
        LLILLL = new C2254308sP(enumC993070bwvArr);
    }

    public static EnumC993070bwv[] values() {
        return (EnumC993070bwv[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC993070bwv valueOf(String str) {
        return (EnumC993070bwv) C08FF.LIZ(EnumC993070bwv.class, str);
    }

    public EnumC993070bwv(String str, int i, int i2) {
        this.LL = i2;
    }
}

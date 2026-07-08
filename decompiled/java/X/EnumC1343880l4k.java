package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0l4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1343880l4k {
    public static final EnumC1343880l4k DEFAULT;
    public static final EnumC1343880l4k FOLLOW;
    public static final /* synthetic */ EnumC1343880l4k[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1343880l4k MATCHED_FRIEND;
    public static final EnumC1343880l4k MUTUAL_FOLLOW;
    public static final EnumC1343880l4k NO_RELATION;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1343880l4k> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1343880l4k enumC1343880l4k = new EnumC1343880l4k(LivePreviewCTASmartDisplayManager.DEFAULT, 0, -1);
        DEFAULT = enumC1343880l4k;
        EnumC1343880l4k enumC1343880l4k2 = new EnumC1343880l4k("NO_RELATION", 1, 0);
        NO_RELATION = enumC1343880l4k2;
        EnumC1343880l4k enumC1343880l4k3 = new EnumC1343880l4k("FOLLOW", 2, 1);
        FOLLOW = enumC1343880l4k3;
        EnumC1343880l4k enumC1343880l4k4 = new EnumC1343880l4k("MUTUAL_FOLLOW", 3, 2);
        MUTUAL_FOLLOW = enumC1343880l4k4;
        EnumC1343880l4k enumC1343880l4k5 = new EnumC1343880l4k("MATCHED_FRIEND", 4, 3);
        MATCHED_FRIEND = enumC1343880l4k5;
        EnumC1343880l4k[] enumC1343880l4kArr = {enumC1343880l4k, enumC1343880l4k2, enumC1343880l4k3, enumC1343880l4k4, enumC1343880l4k5};
        LLILLJJLI = enumC1343880l4kArr;
        LLILLL = new C2254308sP(enumC1343880l4kArr);
    }

    public static EnumC1343880l4k[] values() {
        return (EnumC1343880l4k[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1343880l4k valueOf(String str) {
        return (EnumC1343880l4k) C08FF.LIZ(EnumC1343880l4k.class, str);
    }

    public EnumC1343880l4k(String str, int i, int i2) {
        this.LL = i2;
    }
}

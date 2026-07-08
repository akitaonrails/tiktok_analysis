package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0C8u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC308860C8u {
    public static final EnumC308860C8u FIRST_SEARCH_IN_SESSION;
    public static final EnumC308860C8u INNER_FLOW_VIDEO;
    public static final /* synthetic */ EnumC308860C8u[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC308860C8u NO_VIDEO;
    public static final EnumC308860C8u OUTER_FLOW_VIDEO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC308860C8u> getEntries() {
        return LLILLL;
    }

    static {
        EnumC308860C8u enumC308860C8u = new EnumC308860C8u("FIRST_SEARCH_IN_SESSION", 0, "-1");
        FIRST_SEARCH_IN_SESSION = enumC308860C8u;
        EnumC308860C8u enumC308860C8u2 = new EnumC308860C8u("OUTER_FLOW_VIDEO", 1, CardStruct.IStatusCode.DEFAULT);
        OUTER_FLOW_VIDEO = enumC308860C8u2;
        EnumC308860C8u enumC308860C8u3 = new EnumC308860C8u("INNER_FLOW_VIDEO", 2, "1");
        INNER_FLOW_VIDEO = enumC308860C8u3;
        EnumC308860C8u enumC308860C8u4 = new EnumC308860C8u("NO_VIDEO", 3, "2");
        NO_VIDEO = enumC308860C8u4;
        EnumC308860C8u[] enumC308860C8uArr = {enumC308860C8u, enumC308860C8u2, enumC308860C8u3, enumC308860C8u4};
        LLILLJJLI = enumC308860C8uArr;
        LLILLL = new C2254308sP(enumC308860C8uArr);
    }

    public static EnumC308860C8u[] values() {
        return (EnumC308860C8u[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC308860C8u valueOf(String str) {
        return (EnumC308860C8u) C08FF.LIZ(EnumC308860C8u.class, str);
    }

    public EnumC308860C8u(String str, int i, String str2) {
        this.LL = str2;
    }
}

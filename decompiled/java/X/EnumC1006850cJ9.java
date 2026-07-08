package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cJ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1006850cJ9 {
    public static final EnumC1006850cJ9 HAS_DID;
    public static final EnumC1006850cJ9 HAS_UID;
    public static final /* synthetic */ EnumC1006850cJ9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1006850cJ9 NOT_READY;
    public static final EnumC1006850cJ9 NO_DID_OR_UID;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1006850cJ9> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1006850cJ9 enumC1006850cJ9 = new EnumC1006850cJ9("NOT_READY", 0, CardStruct.IStatusCode.DEFAULT);
        NOT_READY = enumC1006850cJ9;
        EnumC1006850cJ9 enumC1006850cJ92 = new EnumC1006850cJ9("NO_DID_OR_UID", 1, "1");
        NO_DID_OR_UID = enumC1006850cJ92;
        EnumC1006850cJ9 enumC1006850cJ93 = new EnumC1006850cJ9("HAS_DID", 2, "2");
        HAS_DID = enumC1006850cJ93;
        EnumC1006850cJ9 enumC1006850cJ94 = new EnumC1006850cJ9("HAS_UID", 3, "3");
        HAS_UID = enumC1006850cJ94;
        EnumC1006850cJ9[] enumC1006850cJ9Arr = {enumC1006850cJ9, enumC1006850cJ92, enumC1006850cJ93, enumC1006850cJ94};
        LLILLJJLI = enumC1006850cJ9Arr;
        LLILLL = new C2254308sP(enumC1006850cJ9Arr);
    }

    public static EnumC1006850cJ9[] values() {
        return (EnumC1006850cJ9[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1006850cJ9 valueOf(String str) {
        return (EnumC1006850cJ9) C08FF.LIZ(EnumC1006850cJ9.class, str);
    }

    public EnumC1006850cJ9(String str, int i, String str2) {
        this.LL = str2;
    }
}

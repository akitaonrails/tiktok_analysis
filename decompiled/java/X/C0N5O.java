package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N5O, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5O implements InterfaceC593520NPq<String> {
    public static final /* synthetic */ C0N5O[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N5O NOT_MATCH_DATA;
    public static final C0N5O OUT_OF_INDEX;
    public final String LL;

    public static InterfaceC2044707zh<C0N5O> getEntries() {
        return LLILLL;
    }

    static {
        C0N5O c0n5o = new C0N5O("NOT_MATCH_DATA", 0, CardStruct.IStatusCode.DEFAULT);
        NOT_MATCH_DATA = c0n5o;
        C0N5O c0n5o2 = new C0N5O("OUT_OF_INDEX", 1, "1");
        OUT_OF_INDEX = c0n5o2;
        C0N5O[] c0n5oArr = {c0n5o, c0n5o2};
        LLILLJJLI = c0n5oArr;
        LLILLL = new C2254308sP(c0n5oArr);
    }

    public static C0N5O[] values() {
        return (C0N5O[]) LLILLJJLI.clone();
    }

    @Override // X.InterfaceC593520NPq
    public String getParamValue() {
        return this.LL;
    }

    public static C0N5O valueOf(String str) {
        return (C0N5O) C08FF.LIZ(C0N5O.class, str);
    }

    public C0N5O(String str, int i, String str2) {
        this.LL = str2;
    }
}

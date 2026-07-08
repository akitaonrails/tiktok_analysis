package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Xfb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC854490Xfb {
    public static final EnumC854490Xfb DIGITAL_0;
    public static final EnumC854490Xfb DIGITAL_1;
    public static final /* synthetic */ EnumC854490Xfb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC854490Xfb NULL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC854490Xfb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC854490Xfb enumC854490Xfb = new EnumC854490Xfb("DIGITAL_0", 0, CardStruct.IStatusCode.DEFAULT);
        DIGITAL_0 = enumC854490Xfb;
        EnumC854490Xfb enumC854490Xfb2 = new EnumC854490Xfb("DIGITAL_1", 1, "1");
        DIGITAL_1 = enumC854490Xfb2;
        EnumC854490Xfb enumC854490Xfb3 = new EnumC854490Xfb("NULL", 2, "null");
        NULL = enumC854490Xfb3;
        EnumC854490Xfb[] enumC854490XfbArr = {enumC854490Xfb, enumC854490Xfb2, enumC854490Xfb3};
        LLILLJJLI = enumC854490XfbArr;
        LLILLL = new C2254308sP(enumC854490XfbArr);
    }

    public static EnumC854490Xfb[] values() {
        return (EnumC854490Xfb[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC854490Xfb valueOf(String str) {
        return (EnumC854490Xfb) C08FF.LIZ(EnumC854490Xfb.class, str);
    }

    public EnumC854490Xfb(String str, int i, String str2) {
        this.LL = str2;
    }
}

package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rrx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1605030rrx {
    public static final EnumC1605030rrx DEFAULT;
    public static final EnumC1605030rrx INITIAL;
    public static final /* synthetic */ EnumC1605030rrx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1605030rrx LOAD_MORE;
    public static final EnumC1605030rrx REFRESH;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1605030rrx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1605030rrx enumC1605030rrx = new EnumC1605030rrx(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1605030rrx;
        EnumC1605030rrx enumC1605030rrx2 = new EnumC1605030rrx("INITIAL", 1, 1);
        INITIAL = enumC1605030rrx2;
        EnumC1605030rrx enumC1605030rrx3 = new EnumC1605030rrx("REFRESH", 2, 2);
        REFRESH = enumC1605030rrx3;
        EnumC1605030rrx enumC1605030rrx4 = new EnumC1605030rrx("LOAD_MORE", 3, 3);
        LOAD_MORE = enumC1605030rrx4;
        EnumC1605030rrx[] enumC1605030rrxArr = {enumC1605030rrx, enumC1605030rrx2, enumC1605030rrx3, enumC1605030rrx4};
        LLILLJJLI = enumC1605030rrxArr;
        LLILLL = new C2254308sP(enumC1605030rrxArr);
    }

    public static EnumC1605030rrx[] values() {
        return (EnumC1605030rrx[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1605030rrx valueOf(String str) {
        return (EnumC1605030rrx) C08FF.LIZ(EnumC1605030rrx.class, str);
    }

    public EnumC1605030rrx(String str, int i, int i2) {
        this.LL = i2;
    }
}

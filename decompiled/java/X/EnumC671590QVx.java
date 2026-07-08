package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC671590QVx {
    public static final EnumC671590QVx DEFAULT;
    public static final /* synthetic */ EnumC671590QVx[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC671590QVx X_CLOSE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC671590QVx> getEntries() {
        return LLILLL;
    }

    static {
        EnumC671590QVx enumC671590QVx = new EnumC671590QVx(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 1);
        DEFAULT = enumC671590QVx;
        EnumC671590QVx enumC671590QVx2 = new EnumC671590QVx("X_CLOSE", 1, 2);
        X_CLOSE = enumC671590QVx2;
        EnumC671590QVx[] enumC671590QVxArr = {enumC671590QVx, enumC671590QVx2};
        LLILLJJLI = enumC671590QVxArr;
        LLILLL = new C2254308sP(enumC671590QVxArr);
    }

    public static EnumC671590QVx[] values() {
        return (EnumC671590QVx[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC671590QVx valueOf(String str) {
        return (EnumC671590QVx) C08FF.LIZ(EnumC671590QVx.class, str);
    }

    public EnumC671590QVx(String str, int i, int i2) {
        this.LL = i2;
    }
}

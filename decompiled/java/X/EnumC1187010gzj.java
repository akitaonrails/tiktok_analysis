package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1187010gzj {
    public static final EnumC1187010gzj DEFAULT;
    public static final /* synthetic */ EnumC1187010gzj[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1187010gzj ONE_CLICK;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1187010gzj> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1187010gzj enumC1187010gzj = new EnumC1187010gzj(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC1187010gzj;
        EnumC1187010gzj enumC1187010gzj2 = new EnumC1187010gzj("ONE_CLICK", 1, 1);
        ONE_CLICK = enumC1187010gzj2;
        EnumC1187010gzj[] enumC1187010gzjArr = {enumC1187010gzj, enumC1187010gzj2};
        LLILLJJLI = enumC1187010gzjArr;
        LLILLL = new C2254308sP(enumC1187010gzjArr);
    }

    public static EnumC1187010gzj[] values() {
        return (EnumC1187010gzj[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC1187010gzj valueOf(String str) {
        return (EnumC1187010gzj) C08FF.LIZ(EnumC1187010gzj.class, str);
    }

    public EnumC1187010gzj(String str, int i, int i2) {
        this.LL = i2;
    }
}

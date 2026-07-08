package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC311360CIk {
    public static final EnumC311360CIk DEFAULT;
    public static final /* synthetic */ EnumC311360CIk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC311360CIk NORMAL;
    public int LL;

    public static InterfaceC2044707zh<EnumC311360CIk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC311360CIk enumC311360CIk = new EnumC311360CIk(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC311360CIk;
        EnumC311360CIk enumC311360CIk2 = new EnumC311360CIk("NORMAL", 1, 1);
        NORMAL = enumC311360CIk2;
        EnumC311360CIk[] enumC311360CIkArr = {enumC311360CIk, enumC311360CIk2};
        LLILLJJLI = enumC311360CIkArr;
        LLILLL = new C2254308sP(enumC311360CIkArr);
    }

    public static EnumC311360CIk[] values() {
        return (EnumC311360CIk[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC311360CIk valueOf(String str) {
        return (EnumC311360CIk) C08FF.LIZ(EnumC311360CIk.class, str);
    }

    public final void setValue(int i) {
        this.LL = i;
    }

    public EnumC311360CIk(String str, int i, int i2) {
        this.LL = i2;
    }
}

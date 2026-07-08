package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0UDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC768630UDd {
    public static final EnumC768630UDd DEFAULT;
    public static final /* synthetic */ EnumC768630UDd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC768630UDd OFF;
    public static final EnumC768630UDd ON;

    public static InterfaceC2044707zh<EnumC768630UDd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC768630UDd enumC768630UDd = new EnumC768630UDd(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC768630UDd;
        EnumC768630UDd enumC768630UDd2 = new EnumC768630UDd("ON", 1);
        ON = enumC768630UDd2;
        EnumC768630UDd enumC768630UDd3 = new EnumC768630UDd("OFF", 2);
        OFF = enumC768630UDd3;
        EnumC768630UDd[] enumC768630UDdArr = {enumC768630UDd, enumC768630UDd2, enumC768630UDd3};
        LL = enumC768630UDdArr;
        LLILLJJLI = new C2254308sP(enumC768630UDdArr);
    }

    public static EnumC768630UDd[] values() {
        return (EnumC768630UDd[]) LL.clone();
    }

    public static EnumC768630UDd valueOf(String str) {
        return (EnumC768630UDd) C08FF.LIZ(EnumC768630UDd.class, str);
    }

    public EnumC768630UDd(String str, int i) {
    }
}

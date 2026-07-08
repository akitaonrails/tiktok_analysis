package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0cw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC1030940cw0 {
    public static final EnumC1030940cw0 DEFAULT;
    public static final /* synthetic */ EnumC1030940cw0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1030940cw0 REQUEST_START;
    public static final EnumC1030940cw0 RESPONSE_IN_TIME;
    public static final EnumC1030940cw0 RESPONSE_IN_TIME_NO_NET;
    public static final EnumC1030940cw0 RESPONSE_TIMEOUT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1030940cw0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1030940cw0 enumC1030940cw0 = new EnumC1030940cw0(LivePreviewCTASmartDisplayManager.DEFAULT, 0, -1);
        DEFAULT = enumC1030940cw0;
        EnumC1030940cw0 enumC1030940cw02 = new EnumC1030940cw0("REQUEST_START", 1, 0);
        REQUEST_START = enumC1030940cw02;
        EnumC1030940cw0 enumC1030940cw03 = new EnumC1030940cw0("RESPONSE_IN_TIME", 2, 1);
        RESPONSE_IN_TIME = enumC1030940cw03;
        EnumC1030940cw0 enumC1030940cw04 = new EnumC1030940cw0("RESPONSE_IN_TIME_NO_NET", 3, 2);
        RESPONSE_IN_TIME_NO_NET = enumC1030940cw04;
        EnumC1030940cw0 enumC1030940cw05 = new EnumC1030940cw0("RESPONSE_TIMEOUT", 4, 3);
        RESPONSE_TIMEOUT = enumC1030940cw05;
        EnumC1030940cw0[] enumC1030940cw0Arr = {enumC1030940cw0, enumC1030940cw02, enumC1030940cw03, enumC1030940cw04, enumC1030940cw05};
        LLILLJJLI = enumC1030940cw0Arr;
        LLILLL = new C2254308sP(enumC1030940cw0Arr);
    }

    public static EnumC1030940cw0[] values() {
        return (EnumC1030940cw0[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC1030940cw0 valueOf(String str) {
        return (EnumC1030940cw0) C08FF.LIZ(EnumC1030940cw0.class, str);
    }

    public EnumC1030940cw0(String str, int i, int i2) {
        this.LL = i2;
    }
}

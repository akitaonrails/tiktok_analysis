package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0soq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class EnumC1641540soq {
    public static final EnumC1641540soq DEFAULT_STICKER_PRIORITY;
    public static final EnumC1641540soq HIGH_INTERCEPT_STICKER_PRIORITY;
    public static final /* synthetic */ EnumC1641540soq[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1641540soq LOAD_STICKER_PRIORITY;
    public static final EnumC1641540soq LOOP_CHAIN_STICKER_PRIORITY;
    public static final EnumC1641540soq NOTICE_STICKER_PRIORITY;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1641540soq> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1641540soq enumC1641540soq = new EnumC1641540soq("LOAD_STICKER_PRIORITY", 0, -100);
        LOAD_STICKER_PRIORITY = enumC1641540soq;
        EnumC1641540soq enumC1641540soq2 = new EnumC1641540soq("DEFAULT_STICKER_PRIORITY", 1, 0);
        DEFAULT_STICKER_PRIORITY = enumC1641540soq2;
        EnumC1641540soq enumC1641540soq3 = new EnumC1641540soq("LOOP_CHAIN_STICKER_PRIORITY", 2, 100);
        LOOP_CHAIN_STICKER_PRIORITY = enumC1641540soq3;
        EnumC1641540soq enumC1641540soq4 = new EnumC1641540soq("NOTICE_STICKER_PRIORITY", 3, 200);
        NOTICE_STICKER_PRIORITY = enumC1641540soq4;
        EnumC1641540soq enumC1641540soq5 = new EnumC1641540soq("HIGH_INTERCEPT_STICKER_PRIORITY", 4, LSPassThroughRecordSizeConfig.DEFAULT);
        HIGH_INTERCEPT_STICKER_PRIORITY = enumC1641540soq5;
        EnumC1641540soq[] enumC1641540soqArr = {enumC1641540soq, enumC1641540soq2, enumC1641540soq3, enumC1641540soq4, enumC1641540soq5};
        LLILLJJLI = enumC1641540soqArr;
        LLILLL = new C2254308sP(enumC1641540soqArr);
    }

    public static EnumC1641540soq[] values() {
        return (EnumC1641540soq[]) LLILLJJLI.clone();
    }

    public final int getPriority() {
        return this.LL;
    }

    public static EnumC1641540soq valueOf(String str) {
        return (EnumC1641540soq) C08FF.LIZ(EnumC1641540soq.class, str);
    }

    public EnumC1641540soq(String str, int i, int i2) {
        this.LL = i2;
    }
}

package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0qR2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1549900qR2 {
    public static final /* synthetic */ EnumC1549900qR2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1549900qR2 LOAD_FINISH;
    public static final EnumC1549900qR2 LOAD_INIT;
    public static final EnumC1549900qR2 LOAD_RES_LOADED;
    public static final EnumC1549900qR2 LOAD_START;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1549900qR2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1549900qR2 enumC1549900qR2 = new EnumC1549900qR2("LOAD_INIT", 0, 0);
        LOAD_INIT = enumC1549900qR2;
        EnumC1549900qR2 enumC1549900qR22 = new EnumC1549900qR2("LOAD_START", 1, 100);
        LOAD_START = enumC1549900qR22;
        EnumC1549900qR2 enumC1549900qR23 = new EnumC1549900qR2("LOAD_RES_LOADED", 2, 200);
        LOAD_RES_LOADED = enumC1549900qR23;
        EnumC1549900qR2 enumC1549900qR24 = new EnumC1549900qR2("LOAD_FINISH", 3, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        LOAD_FINISH = enumC1549900qR24;
        EnumC1549900qR2[] enumC1549900qR2Arr = {enumC1549900qR2, enumC1549900qR22, enumC1549900qR23, enumC1549900qR24};
        LLILLJJLI = enumC1549900qR2Arr;
        LLILLL = new C2254308sP(enumC1549900qR2Arr);
    }

    public static EnumC1549900qR2[] values() {
        return (EnumC1549900qR2[]) LLILLJJLI.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public static EnumC1549900qR2 valueOf(String str) {
        return (EnumC1549900qR2) C08FF.LIZ(EnumC1549900qR2.class, str);
    }

    public EnumC1549900qR2(String str, int i, int i2) {
        this.LL = i2;
    }
}

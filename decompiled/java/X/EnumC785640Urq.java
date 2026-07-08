package X;

import com.bytedance.android.livesdk.livesetting.other.LiveTestSkipAABCheckSettings;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Urq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class EnumC785640Urq {
    public static final EnumC785640Urq CAST;
    public static final EnumC785640Urq CMAF;
    public static final /* synthetic */ EnumC785640Urq[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC785640Urq P2P;
    public static final EnumC785640Urq QUIC;
    public static final EnumC785640Urq RTMGLOBAL;
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final String[] LLILZ;

    public static InterfaceC2044707zh<EnumC785640Urq> getEntries() {
        return LLILZLL;
    }

    static {
        LiveTestSkipAABCheckSettings liveTestSkipAABCheckSettings = LiveTestSkipAABCheckSettings.INSTANCE;
        EnumC785640Urq enumC785640Urq = new EnumC785640Urq("P2P", 0, "df_live_p2p", "com.ss.android.ugc.aweme.dflivep2p", liveTestSkipAABCheckSettings.getValue());
        P2P = enumC785640Urq;
        EnumC785640Urq enumC785640Urq2 = new EnumC785640Urq("RTMGLOBAL", 1, "df_live_rtmglobal", "com.ss.android.ugc.aweme.dflivertmglobal", liveTestSkipAABCheckSettings.getValue(), new String[]{"com.ss.android.ugc.i18n.quic"});
        RTMGLOBAL = enumC785640Urq2;
        EnumC785640Urq enumC785640Urq3 = new EnumC785640Urq("QUIC", 2, "df_live_quic", "com.ss.android.ugc.i18n.quic", liveTestSkipAABCheckSettings.getValue());
        QUIC = enumC785640Urq3;
        EnumC785640Urq enumC785640Urq4 = new EnumC785640Urq("CAST", 3, "df_live_cast", "com.ss.android.ugc.aweme.cast", liveTestSkipAABCheckSettings.getValue());
        CAST = enumC785640Urq4;
        EnumC785640Urq enumC785640Urq5 = new EnumC785640Urq("CMAF", 4, "df_live_cmaf", "com.ss.android.ugc.i18n.cmaf", liveTestSkipAABCheckSettings.getValue());
        CMAF = enumC785640Urq5;
        EnumC785640Urq[] enumC785640UrqArr = {enumC785640Urq, enumC785640Urq2, enumC785640Urq3, enumC785640Urq4, enumC785640Urq5};
        LLILZIL = enumC785640UrqArr;
        LLILZLL = new C2254308sP(enumC785640UrqArr);
    }

    public static EnumC785640Urq[] values() {
        return (EnumC785640Urq[]) LLILZIL.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("packageName:");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" dependentPkgName:");
        sbLIZ.append(C13LQ.LJJJ(this.LLILZ, null, null, null, AFwS245S0000000_12.get$arr$(55), 31));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String[] getDependPlugins() {
        return this.LLILZ;
    }

    public final String getDfModuleName() {
        return this.LL;
    }

    public final String getPackageName() {
        return this.LLILLJJLI;
    }

    public final boolean isSkipAAB() {
        return this.LLILLL;
    }

    public static EnumC785640Urq valueOf(String str) {
        return (EnumC785640Urq) C08FF.LIZ(EnumC785640Urq.class, str);
    }

    public /* synthetic */ EnumC785640Urq(String str, int i, String str2, String str3, boolean z) {
        this(str, i, str2, str3, z, new String[0]);
    }

    public EnumC785640Urq(String str, int i, String str2, String str3, boolean z, String[] strArr) {
        this.LL = str2;
        this.LLILLJJLI = str3;
        this.LLILLL = z;
        this.LLILZ = strArr;
    }
}

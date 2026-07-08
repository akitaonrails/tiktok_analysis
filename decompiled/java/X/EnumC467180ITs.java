package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ITs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC467180ITs {
    public static final EnumC467180ITs DECISION_GROUP;
    public static final EnumC467180ITs DEFAULT;
    public static final EnumC467180ITs EPI;
    public static final /* synthetic */ EnumC467180ITs[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC467180ITs SERVER_DECISION_GROUP;
    public static final EnumC467180ITs SERVER_FEATURE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC467180ITs> getEntries() {
        return LLILLL;
    }

    static {
        EnumC467180ITs enumC467180ITs = new EnumC467180ITs(LivePreviewCTASmartDisplayManager.DEFAULT, 0, "default");
        DEFAULT = enumC467180ITs;
        EnumC467180ITs enumC467180ITs2 = new EnumC467180ITs("EPI", 1, "epi");
        EPI = enumC467180ITs2;
        EnumC467180ITs enumC467180ITs3 = new EnumC467180ITs("DECISION_GROUP", 2, "decision_group");
        DECISION_GROUP = enumC467180ITs3;
        EnumC467180ITs enumC467180ITs4 = new EnumC467180ITs("SERVER_DECISION_GROUP", 3, "server_decision_group");
        SERVER_DECISION_GROUP = enumC467180ITs4;
        EnumC467180ITs enumC467180ITs5 = new EnumC467180ITs("SERVER_FEATURE", 4, "server_feature");
        SERVER_FEATURE = enumC467180ITs5;
        EnumC467180ITs[] enumC467180ITsArr = {enumC467180ITs, enumC467180ITs2, enumC467180ITs3, enumC467180ITs4, enumC467180ITs5};
        LLILLJJLI = enumC467180ITsArr;
        LLILLL = new C2254308sP(enumC467180ITsArr);
    }

    public static EnumC467180ITs[] values() {
        return (EnumC467180ITs[]) LLILLJJLI.clone();
    }

    public final String getGroupName() {
        return this.LL;
    }

    public static EnumC467180ITs valueOf(String str) {
        return (EnumC467180ITs) C08FF.LIZ(EnumC467180ITs.class, str);
    }

    public EnumC467180ITs(String str, int i, String str2) {
        this.LL = str2;
    }
}

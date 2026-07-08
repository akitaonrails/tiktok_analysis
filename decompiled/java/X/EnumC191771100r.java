package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.100r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class EnumC191771100r implements AnonymousClass1018 {
    public static final EnumC191771100r CARE_MODE_ON;
    public static final EnumC191771100r CARE_MODE_RECOMMEND;
    public static final EnumC191771100r FILTER_ALL;
    public static final /* synthetic */ EnumC191771100r[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC191771100r PAUSE_INTERACTIONS;

    public EnumC191771100r() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC191771100r> getEntries() {
        return LLILLJJLI;
    }

    public abstract /* synthetic */ int getConditionType();

    public abstract /* synthetic */ int getPriority();

    public abstract /* synthetic */ boolean shouldShow(Object obj);

    static {
        EnumC191771100r enumC191771100r = new EnumC191771100r() { // from class: X.100o
            public final int LLILLL = 100;
            public final int LLILZ = EnumC191769100p.FILTER_ALL.ordinal();

            @Override // X.EnumC191771100r, X.AnonymousClass1018
            public final int getConditionType() {
                return this.LLILZ;
            }

            @Override // X.EnumC191771100r, X.AnonymousClass1018
            public final int getPriority() {
                return this.LLILLL;
            }

            @Override // X.EnumC191771100r, X.AnonymousClass1018
            public final boolean shouldShow(Object obj) {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("privacy_setting_filter_all_new_version", false) || !(obj instanceof Aweme) || !Intrinsics.LJFF(AwemeExtKt.getAuthorUid((Aweme) obj), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
                    return false;
                }
                C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
                if (c1888220zEi.LJFF() || !c1888220zEi.LIZLLL()) {
                    return false;
                }
                return true;
            }
        };
        FILTER_ALL = enumC191771100r;
        EnumC191771100r enumC191771100r2 = new EnumC191771100r() { // from class: X.100q
            public final int LLILLL = 200;
            public final int LLILZ = EnumC191769100p.CARE_MODE_ON.ordinal();

            @Override // X.EnumC191771100r, X.AnonymousClass1018
            public final int getConditionType() {
                return this.LLILZ;
            }

            @Override // X.EnumC191771100r, X.AnonymousClass1018
            public final int getPriority() {
                return this.LLILLL;
            }

            @Override // X.EnumC191771100r, X.AnonymousClass1018
            public final boolean shouldShow(Object obj) {
                if ((obj instanceof Aweme) && Intrinsics.LJFF(AwemeExtKt.getAuthorUid((Aweme) obj), C0XQ7.LJFF().getCurUserId()) && C1888220zEi.LIZIZ.LJFF()) {
                    return true;
                }
                return false;
            }
        };
        CARE_MODE_ON = enumC191771100r2;
        EnumC191771100r enumC191771100r3 = new EnumC191771100r() { // from class: X.100g
            public final int LLILLL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            public final int LLILZ = EnumC191769100p.CARE_MODE_RECOMMEND.ordinal();

            @Override // X.EnumC191771100r, X.AnonymousClass1018
            public final int getConditionType() {
                return this.LLILZ;
            }

            @Override // X.EnumC191771100r, X.AnonymousClass1018
            public final int getPriority() {
                return this.LLILLL;
            }

            @Override // X.EnumC191771100r, X.AnonymousClass1018
            public final boolean shouldShow(Object obj) {
                boolean zLIZIZ;
                if (!(obj instanceof Aweme) || !Intrinsics.LJFF(AwemeExtKt.getAuthorUid((Aweme) obj), C0XQ7.LJFF().getCurUserId())) {
                    return false;
                }
                C1888220zEi c1888220zEi = C1888220zEi.LIZIZ;
                int iLIZIZ = c1888220zEi.LIZIZ();
                EnumC1490680otW enumC1490680otW = EnumC1490680otW.VULNERABLE;
                if ((iLIZIZ != enumC1490680otW.getValue() && c1888220zEi.LIZIZ() != EnumC1490680otW.WHITE_LIST.getValue()) || c1888220zEi.LJFF()) {
                    return false;
                }
                if (c1888220zEi.LIZIZ() == enumC1490680otW.getValue()) {
                    zLIZIZ = C191756100c.LIZIZ.LIZLLL();
                } else {
                    if (c1888220zEi.LIZIZ() != EnumC1490680otW.WHITE_LIST.getValue()) {
                        return false;
                    }
                    zLIZIZ = C191764100k.LIZIZ.LIZIZ();
                }
                if (!zLIZIZ) {
                    return false;
                }
                return true;
            }
        };
        CARE_MODE_RECOMMEND = enumC191771100r3;
        EnumC191771100r enumC191771100r4 = new EnumC191771100r() { // from class: X.100s
            public final int LLILLL = 400;
            public final int LLILZ = EnumC191769100p.PAUSE_INTERACTION.ordinal();

            @Override // X.EnumC191771100r, X.AnonymousClass1018
            public final int getConditionType() {
                return this.LLILZ;
            }

            @Override // X.EnumC191771100r, X.AnonymousClass1018
            public final int getPriority() {
                return this.LLILLL;
            }

            @Override // X.EnumC191771100r, X.AnonymousClass1018
            public final boolean shouldShow(Object obj) {
                Aweme aweme;
                if (ComplianceServiceProvider.LJIJJ().LJIIJJI()) {
                    String authorUid = null;
                    if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null) {
                        authorUid = AwemeExtKt.getAuthorUid(aweme);
                    }
                    if (Intrinsics.LJFF(authorUid, C0XQ7.LJFF().getCurUserId())) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        PAUSE_INTERACTIONS = enumC191771100r4;
        EnumC191771100r[] enumC191771100rArr = {enumC191771100r, enumC191771100r2, enumC191771100r3, enumC191771100r4};
        LL = enumC191771100rArr;
        LLILLJJLI = new C2254308sP(enumC191771100rArr);
    }

    public static EnumC191771100r[] values() {
        return (EnumC191771100r[]) LL.clone();
    }

    public static EnumC191771100r valueOf(String str) {
        return (EnumC191771100r) C08FF.LIZ(EnumC191771100r.class, str);
    }

    public EnumC191771100r(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }

    @Override // X.AnonymousClass1018
    public boolean shouldShowWrapper(Object obj, String str, String str2) {
        return AnonymousClass1019.LIZ(this, obj, str, str2);
    }
}

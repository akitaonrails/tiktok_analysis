package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1022, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AnonymousClass1022 implements AnonymousClass1018 {
    public static final AnonymousClass1022 CONTENT_CHECK;
    public static final AnonymousClass1022 GENERIC;
    public static final /* synthetic */ AnonymousClass1022[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final AnonymousClass1022 MODERATION;
    public static final AnonymousClass1022 PROHIBITED;
    public static final AnonymousClass1022 RESTRICTED;

    public AnonymousClass1022() {
        throw null;
    }

    public static InterfaceC2044707zh<AnonymousClass1022> getEntries() {
        return LLILLJJLI;
    }

    @Override // X.AnonymousClass1018
    public abstract /* synthetic */ int getConditionType();

    @Override // X.AnonymousClass1018
    public abstract /* synthetic */ int getPriority();

    @Override // X.AnonymousClass1018
    public abstract /* synthetic */ boolean shouldShow(Object obj);

    static {
        AnonymousClass1022 anonymousClass1022 = new AnonymousClass1022() { // from class: X.1028
            public final int LLILLL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
            public final int LLILZ = AnonymousClass1027.CONTENT_CHECK.ordinal();

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final int getConditionType() {
                return this.LLILZ;
            }

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final int getPriority() {
                return this.LLILLL;
            }

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final boolean shouldShow(Object obj) {
                if (!(obj instanceof Aweme)) {
                    return false;
                }
                Aweme aweme = (Aweme) obj;
                if ((AwemeExtKt.getReviewStatus(aweme) != 4 && AwemeExtKt.getReviewStatus(aweme) != 5) || !C1400505dz.LIZ(aweme)) {
                    return false;
                }
                return true;
            }
        };
        CONTENT_CHECK = anonymousClass1022;
        AnonymousClass1022 anonymousClass10222 = new AnonymousClass1022() { // from class: X.102A
            public final int LLILLL = 500;
            public final int LLILZ = AnonymousClass1027.PROHIBITED.ordinal();

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final int getConditionType() {
                return this.LLILZ;
            }

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final int getPriority() {
                return this.LLILLL;
            }

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final boolean shouldShow(Object obj) {
                if (!(obj instanceof Aweme)) {
                    return false;
                }
                Aweme aweme = (Aweme) obj;
                if ((!AwemeExtKt.isProhibited(aweme) && AwemeExtKt.getReviewStatus(aweme) != 1) || !C1400505dz.LIZ(aweme)) {
                    return false;
                }
                return true;
            }
        };
        PROHIBITED = anonymousClass10222;
        AnonymousClass1022 anonymousClass10223 = new AnonymousClass1022() { // from class: X.1023
            public final int LLILLL = 400;
            public final int LLILZ = AnonymousClass1027.GENERIC.ordinal();

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final int getConditionType() {
                return this.LLILZ;
            }

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final int getPriority() {
                return this.LLILLL;
            }

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final boolean shouldShow(Object obj) {
                Aweme aweme;
                Boolean bool;
                Boolean bool2;
                Boolean bool3;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null) {
                    return false;
                }
                Boolean bool4 = aweme.getContentClassificationMaskInfo().showMask;
                if ((bool4 == null || !bool4.booleanValue() || (str5 = aweme.getContentClassificationMaskInfo().title) == null || str5.length() == 0) && (((bool = aweme.getReportMaskInfo().showMask) == null || !bool.booleanValue() || (str3 = aweme.getReportMaskInfo().title) == null || str3.length() == 0 || (str4 = aweme.getReportMaskInfo().cancelMaskLabel) == null || str4.length() == 0) && (((bool2 = aweme.getGeneralMaskInfo().showMask) == null || !bool2.booleanValue() || (str = aweme.getGeneralMaskInfo().title) == null || str.length() == 0 || (str2 = aweme.getGeneralMaskInfo().content) == null || str2.length() == 0) && ((bool3 = aweme.getPhotosensitiveMaskInfo().showMask) == null || !bool3.booleanValue() || !ComplianceServiceProvider.LJI().LJJJ() || ComplianceServiceProvider.LJI().LJIJ() == 2)))) {
                    return false;
                }
                return true;
            }
        };
        GENERIC = anonymousClass10223;
        AnonymousClass1022 anonymousClass10224 = new AnonymousClass1022() { // from class: X.102B
            public final int LLILLL = 399;
            public final int LLILZ = AnonymousClass1027.RESTRICTED.ordinal();

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final int getConditionType() {
                return this.LLILZ;
            }

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final int getPriority() {
                return this.LLILLL;
            }

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final boolean shouldShow(Object obj) {
                if (!(obj instanceof Aweme)) {
                    return false;
                }
                Aweme aweme = (Aweme) obj;
                if (!C1007160cJe.LIZ(aweme) || !C1400505dz.LIZ(aweme)) {
                    return false;
                }
                return true;
            }
        };
        RESTRICTED = anonymousClass10224;
        AnonymousClass1022 anonymousClass10225 = new AnonymousClass1022() { // from class: X.1029
            public final int LLILLL = 350;
            public final int LLILZ = AnonymousClass1027.MODERATION.ordinal();

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final int getConditionType() {
                return this.LLILZ;
            }

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final int getPriority() {
                return this.LLILLL;
            }

            @Override // X.AnonymousClass1022, X.AnonymousClass1018
            public final boolean shouldShow(Object obj) {
                if (!(obj instanceof Aweme)) {
                    return false;
                }
                Aweme aweme = (Aweme) obj;
                if (AwemeExtKt.getReviewStatus(aweme) != 6 || !C1400505dz.LIZ(aweme)) {
                    return false;
                }
                return true;
            }
        };
        MODERATION = anonymousClass10225;
        AnonymousClass1022[] anonymousClass1022Arr = {anonymousClass1022, anonymousClass10222, anonymousClass10223, anonymousClass10224, anonymousClass10225};
        LL = anonymousClass1022Arr;
        LLILLJJLI = new C2254308sP(anonymousClass1022Arr);
    }

    public static AnonymousClass1022[] values() {
        return (AnonymousClass1022[]) LL.clone();
    }

    public static AnonymousClass1022 valueOf(String str) {
        return (AnonymousClass1022) C08FF.LIZ(AnonymousClass1022.class, str);
    }

    public AnonymousClass1022(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }

    @Override // X.AnonymousClass1018
    public boolean shouldShowWrapper(Object obj, String str, String str2) {
        return AnonymousClass1019.LIZ(this, obj, str, str2);
    }
}

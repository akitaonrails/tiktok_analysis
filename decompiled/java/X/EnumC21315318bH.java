package X;

import com.ss.android.ugc.aweme.tracker.LSError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.18bH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class EnumC21315318bH implements LSError {
    public static final /* synthetic */ EnumC21315318bH[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC21315318bH PARSE_JSON_ERROR;
    public static final EnumC21315318bH PT_GET_VALUE_ERROR;
    public static final EnumC21315318bH PT_ONEVENT_APPEND_ERROR;
    public static final EnumC21315318bH PT_ONEVENT_ERROR;
    public static final EnumC21315318bH PT_SETTINGS_ERROR;

    public EnumC21315318bH() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC21315318bH> getEntries() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public abstract /* synthetic */ String message();

    static {
        EnumC21315318bH enumC21315318bH = new EnumC21315318bH() { // from class: X.18bM
            @Override // X.EnumC21315318bH, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "pass_through_onevent_error";
            }

            @Override // X.EnumC21315318bH, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P0;
            }
        };
        PT_ONEVENT_ERROR = enumC21315318bH;
        EnumC21315318bH enumC21315318bH2 = new EnumC21315318bH() { // from class: X.18bI
            @Override // X.EnumC21315318bH, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "pass_through_json_error";
            }

            @Override // X.EnumC21315318bH, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        PARSE_JSON_ERROR = enumC21315318bH2;
        EnumC21315318bH enumC21315318bH3 = new EnumC21315318bH() { // from class: X.18bK
            @Override // X.EnumC21315318bH, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "pass_through_onevent_append_error";
            }

            @Override // X.EnumC21315318bH, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        PT_ONEVENT_APPEND_ERROR = enumC21315318bH3;
        EnumC21315318bH enumC21315318bH4 = new EnumC21315318bH() { // from class: X.18bL
            @Override // X.EnumC21315318bH, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "pass_through_settings_error";
            }

            @Override // X.EnumC21315318bH, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        PT_SETTINGS_ERROR = enumC21315318bH4;
        EnumC21315318bH enumC21315318bH5 = new EnumC21315318bH() { // from class: X.18bJ
            @Override // X.EnumC21315318bH, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "pass_through_get_kvmap_error";
            }

            @Override // X.EnumC21315318bH, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        PT_GET_VALUE_ERROR = enumC21315318bH5;
        EnumC21315318bH[] enumC21315318bHArr = {enumC21315318bH, enumC21315318bH2, enumC21315318bH3, enumC21315318bH4, enumC21315318bH5};
        LL = enumC21315318bHArr;
        LLILLJJLI = new C2254308sP(enumC21315318bHArr);
    }

    public static EnumC21315318bH[] values() {
        return (EnumC21315318bH[]) LL.clone();
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public String toUniqueString() {
        return C1205500hTY.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public LSError.Priority priority() {
        return LSError.Priority.P3;
    }

    public static EnumC21315318bH valueOf(String str) {
        return (EnumC21315318bH) C08FF.LIZ(EnumC21315318bH.class, str);
    }

    public EnumC21315318bH(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}

package X;

import com.ss.android.ugc.aweme.tracker.LSError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hTf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class EnumC1205570hTf implements LSError {
    public static final /* synthetic */ EnumC1205570hTf[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1205570hTf POI_QUIZ_CARD_ERROR;
    public static final EnumC1205570hTf POI_QUIZ_HOME_PAGE_ERROR;
    public static final EnumC1205570hTf POI_QUIZ_MAP_ERROR;
    public static final EnumC1205570hTf POI_QUIZ_PAGE_VM;

    public EnumC1205570hTf() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1205570hTf> getEntries() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public abstract /* synthetic */ String message();

    static {
        EnumC1205570hTf enumC1205570hTf = new EnumC1205570hTf() { // from class: X.0hTh
            @Override // X.EnumC1205570hTf, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_quiz_home_page_error";
            }

            @Override // X.EnumC1205570hTf, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P2;
            }
        };
        POI_QUIZ_HOME_PAGE_ERROR = enumC1205570hTf;
        EnumC1205570hTf enumC1205570hTf2 = new EnumC1205570hTf() { // from class: X.0hTi
            @Override // X.EnumC1205570hTf, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_quiz_map_error";
            }

            @Override // X.EnumC1205570hTf, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P2;
            }
        };
        POI_QUIZ_MAP_ERROR = enumC1205570hTf2;
        EnumC1205570hTf enumC1205570hTf3 = new EnumC1205570hTf() { // from class: X.0hTg
            @Override // X.EnumC1205570hTf, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_quiz_card";
            }

            @Override // X.EnumC1205570hTf, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P2;
            }
        };
        POI_QUIZ_CARD_ERROR = enumC1205570hTf3;
        EnumC1205570hTf enumC1205570hTf4 = new EnumC1205570hTf() { // from class: X.0hTj
            @Override // X.EnumC1205570hTf, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_quiz_page_vm";
            }

            @Override // X.EnumC1205570hTf, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P2;
            }
        };
        POI_QUIZ_PAGE_VM = enumC1205570hTf4;
        EnumC1205570hTf[] enumC1205570hTfArr = {enumC1205570hTf, enumC1205570hTf2, enumC1205570hTf3, enumC1205570hTf4};
        LL = enumC1205570hTfArr;
        LLILLJJLI = new C2254308sP(enumC1205570hTfArr);
    }

    public static EnumC1205570hTf[] values() {
        return (EnumC1205570hTf[]) LL.clone();
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public String toUniqueString() {
        return C1205500hTY.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public LSError.Priority priority() {
        return LSError.Priority.P3;
    }

    public static EnumC1205570hTf valueOf(String str) {
        return (EnumC1205570hTf) C08FF.LIZ(EnumC1205570hTf.class, str);
    }

    public EnumC1205570hTf(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}

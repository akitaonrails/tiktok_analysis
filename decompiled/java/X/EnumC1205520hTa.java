package X;

import com.ss.android.ugc.aweme.tracker.LSError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hTa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class EnumC1205520hTa implements LSError {
    public static final /* synthetic */ EnumC1205520hTa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1205520hTa LYNX_TIMING_INFO_PARSE_ERROR;

    public EnumC1205520hTa() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1205520hTa> getEntries() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public abstract /* synthetic */ String message();

    static {
        EnumC1205520hTa enumC1205520hTa = new EnumC1205520hTa() { // from class: X.0hTe
            @Override // X.EnumC1205520hTa, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "lynx_timing_info_parse_error";
            }
        };
        LYNX_TIMING_INFO_PARSE_ERROR = enumC1205520hTa;
        EnumC1205520hTa[] enumC1205520hTaArr = {enumC1205520hTa};
        LL = enumC1205520hTaArr;
        LLILLJJLI = new C2254308sP(enumC1205520hTaArr);
    }

    public static EnumC1205520hTa[] values() {
        return (EnumC1205520hTa[]) LL.clone();
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public String toUniqueString() {
        return C1205500hTY.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public LSError.Priority priority() {
        return LSError.Priority.P3;
    }

    public static EnumC1205520hTa valueOf(String str) {
        return (EnumC1205520hTa) C08FF.LIZ(EnumC1205520hTa.class, str);
    }

    public EnumC1205520hTa(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}

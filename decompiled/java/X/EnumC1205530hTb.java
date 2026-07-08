package X;

import com.ss.android.ugc.aweme.tracker.LSError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class EnumC1205530hTb implements LSError {
    public static final /* synthetic */ EnumC1205530hTb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1205530hTb SGLM_LAYOUT_CHILDREN_ERROR;

    public EnumC1205530hTb() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1205530hTb> getEntries() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public abstract /* synthetic */ String message();

    static {
        EnumC1205530hTb enumC1205530hTb = new EnumC1205530hTb() { // from class: X.0hTd
            @Override // X.EnumC1205530hTb, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "nearby_sglm_layout_children_error";
            }

            @Override // X.EnumC1205530hTb, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        SGLM_LAYOUT_CHILDREN_ERROR = enumC1205530hTb;
        EnumC1205530hTb[] enumC1205530hTbArr = {enumC1205530hTb};
        LL = enumC1205530hTbArr;
        LLILLJJLI = new C2254308sP(enumC1205530hTbArr);
    }

    public static EnumC1205530hTb[] values() {
        return (EnumC1205530hTb[]) LL.clone();
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public String toUniqueString() {
        return C1205500hTY.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public LSError.Priority priority() {
        return LSError.Priority.P3;
    }

    public static EnumC1205530hTb valueOf(String str) {
        return (EnumC1205530hTb) C08FF.LIZ(EnumC1205530hTb.class, str);
    }

    public EnumC1205530hTb(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}

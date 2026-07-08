package X;

import com.ss.android.ugc.aweme.tracker.LSError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hUK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class EnumC1205980hUK implements LSError {
    public static final /* synthetic */ EnumC1205980hUK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1205980hUK POI_REALTIME_FEATURE;

    public EnumC1205980hUK() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1205980hUK> getEntries() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public abstract /* synthetic */ String message();

    static {
        EnumC1205980hUK enumC1205980hUK = new EnumC1205980hUK() { // from class: X.0hUL
            @Override // X.EnumC1205980hUK, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_realtime_feature";
            }

            @Override // X.EnumC1205980hUK, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        POI_REALTIME_FEATURE = enumC1205980hUK;
        EnumC1205980hUK[] enumC1205980hUKArr = {enumC1205980hUK};
        LL = enumC1205980hUKArr;
        LLILLJJLI = new C2254308sP(enumC1205980hUKArr);
    }

    public static EnumC1205980hUK[] values() {
        return (EnumC1205980hUK[]) LL.clone();
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public String toUniqueString() {
        return C1205500hTY.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public LSError.Priority priority() {
        return LSError.Priority.P3;
    }

    public static EnumC1205980hUK valueOf(String str) {
        return (EnumC1205980hUK) C08FF.LIZ(EnumC1205980hUK.class, str);
    }

    public EnumC1205980hUK(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}

package X;

import com.ss.android.ugc.aweme.tracker.LSError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hTZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class EnumC1205510hTZ implements LSError {
    public static final /* synthetic */ EnumC1205510hTZ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1205510hTZ POI_RECOMMEND_PRELOAD;

    public EnumC1205510hTZ() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1205510hTZ> getEntries() {
        return LLILLJJLI;
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public abstract /* synthetic */ String message();

    static {
        EnumC1205510hTZ enumC1205510hTZ = new EnumC1205510hTZ() { // from class: X.0hTc
            @Override // X.EnumC1205510hTZ, com.ss.android.ugc.aweme.tracker.LSError
            public final String message() {
                return "poi_recommend_preload";
            }

            @Override // X.EnumC1205510hTZ, com.ss.android.ugc.aweme.tracker.LSError
            public final LSError.Priority priority() {
                return LSError.Priority.P1;
            }
        };
        POI_RECOMMEND_PRELOAD = enumC1205510hTZ;
        EnumC1205510hTZ[] enumC1205510hTZArr = {enumC1205510hTZ};
        LL = enumC1205510hTZArr;
        LLILLJJLI = new C2254308sP(enumC1205510hTZArr);
    }

    public static EnumC1205510hTZ[] values() {
        return (EnumC1205510hTZ[]) LL.clone();
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public String toUniqueString() {
        return C1205500hTY.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.tracker.LSError
    public LSError.Priority priority() {
        return LSError.Priority.P3;
    }

    public static EnumC1205510hTZ valueOf(String str) {
        return (EnumC1205510hTZ) C08FF.LIZ(EnumC1205510hTZ.class, str);
    }

    public EnumC1205510hTZ(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}

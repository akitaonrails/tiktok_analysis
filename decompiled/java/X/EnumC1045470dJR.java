package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dJR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class EnumC1045470dJR implements InterfaceC1022770cip {
    public static final /* synthetic */ EnumC1045470dJR[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1045470dJR PROGRESS_25P;
    public static final EnumC1045470dJR PROGRESS_50P;
    public static final EnumC1045470dJR PROGRESS_75P;

    public EnumC1045470dJR() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1045470dJR> getEntries() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC1022770cip
    public abstract /* synthetic */ String label(boolean z);

    @Override // X.InterfaceC1022770cip
    public abstract /* synthetic */ boolean valid(long j, long j2);

    static {
        EnumC1045470dJR enumC1045470dJR = new EnumC1045470dJR() { // from class: X.0dJW
            @Override // X.EnumC1045470dJR, X.InterfaceC1022770cip
            public final String label(boolean z) {
                return z ? "view_firstquartile" : "first_quartile";
            }

            @Override // X.EnumC1045470dJR, X.InterfaceC1022770cip
            public final boolean valid(long j, long j2) {
                if (j2 <= 0 || j / j2 < getPercent()) {
                    return false;
                }
                return true;
            }
        };
        PROGRESS_25P = enumC1045470dJR;
        EnumC1045470dJR enumC1045470dJR2 = new EnumC1045470dJR() { // from class: X.0dJX
            @Override // X.EnumC1045470dJR, X.InterfaceC1022770cip
            public final String label(boolean z) {
                return z ? "view_midpoint" : "midpoint";
            }

            @Override // X.EnumC1045470dJR, X.InterfaceC1022770cip
            public final boolean valid(long j, long j2) {
                if (j2 <= 0 || j / j2 < getPercent()) {
                    return false;
                }
                return true;
            }
        };
        PROGRESS_50P = enumC1045470dJR2;
        EnumC1045470dJR enumC1045470dJR3 = new EnumC1045470dJR() { // from class: X.0dJY
            @Override // X.EnumC1045470dJR, X.InterfaceC1022770cip
            public final String label(boolean z) {
                return z ? "view_thirdquartile" : "third_quartile";
            }

            @Override // X.EnumC1045470dJR, X.InterfaceC1022770cip
            public final boolean valid(long j, long j2) {
                if (j2 <= 0 || j / j2 < getPercent()) {
                    return false;
                }
                return true;
            }
        };
        PROGRESS_75P = enumC1045470dJR3;
        EnumC1045470dJR[] enumC1045470dJRArr = {enumC1045470dJR, enumC1045470dJR2, enumC1045470dJR3};
        LL = enumC1045470dJRArr;
        LLILLJJLI = new C2254308sP(enumC1045470dJRArr);
    }

    public static EnumC1045470dJR[] values() {
        return (EnumC1045470dJR[]) LL.clone();
    }

    public final float getPercent() {
        int i = C1045460dJQ.LIZ[ordinal()];
        if (i == 1) {
            return 0.25f;
        }
        if (i == 2) {
            return 0.5f;
        }
        if (i == 3) {
            return 0.75f;
        }
        throw new C1954807lC();
    }

    public static EnumC1045470dJR valueOf(String str) {
        return (EnumC1045470dJR) C08FF.LIZ(EnumC1045470dJR.class, str);
    }

    public EnumC1045470dJR(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}

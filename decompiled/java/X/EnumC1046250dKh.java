package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class EnumC1046250dKh implements InterfaceC1022770cip {
    public static final /* synthetic */ EnumC1046250dKh[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1046250dKh PROGRESS_15S;
    public static final EnumC1046250dKh PROGRESS_2S;
    public static final EnumC1046250dKh PROGRESS_6S;

    public EnumC1046250dKh() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1046250dKh> getEntries() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC1022770cip
    public abstract /* synthetic */ String label(boolean z);

    @Override // X.InterfaceC1022770cip
    public abstract /* synthetic */ boolean valid(long j, long j2);

    static {
        EnumC1046250dKh enumC1046250dKh = new EnumC1046250dKh() { // from class: X.0dKj
            @Override // X.EnumC1046250dKh, X.InterfaceC1022770cip
            public final String label(boolean z) {
                return z ? "view_2s" : "play_2s";
            }

            @Override // X.EnumC1046250dKh, X.InterfaceC1022770cip
            public final boolean valid(long j, long j2) {
                if (j >= getLength() && j2 >= getLength()) {
                    return true;
                }
                return false;
            }
        };
        PROGRESS_2S = enumC1046250dKh;
        EnumC1046250dKh enumC1046250dKh2 = new EnumC1046250dKh() { // from class: X.0dKk
            @Override // X.EnumC1046250dKh, X.InterfaceC1022770cip
            public final String label(boolean z) {
                return z ? "view_6s" : "play_6s";
            }

            @Override // X.EnumC1046250dKh, X.InterfaceC1022770cip
            public final boolean valid(long j, long j2) {
                if (j >= getLength() && j2 >= getLength()) {
                    return true;
                }
                return false;
            }
        };
        PROGRESS_6S = enumC1046250dKh2;
        EnumC1046250dKh enumC1046250dKh3 = new EnumC1046250dKh() { // from class: X.0dKi
            @Override // X.EnumC1046250dKh, X.InterfaceC1022770cip
            public final String label(boolean z) {
                return z ? "view_15s" : "play_15s";
            }

            @Override // X.EnumC1046250dKh, X.InterfaceC1022770cip
            public final boolean valid(long j, long j2) {
                if (j >= getLength() && j2 >= getLength()) {
                    return true;
                }
                return false;
            }
        };
        PROGRESS_15S = enumC1046250dKh3;
        EnumC1046250dKh[] enumC1046250dKhArr = {enumC1046250dKh, enumC1046250dKh2, enumC1046250dKh3};
        LL = enumC1046250dKhArr;
        LLILLJJLI = new C2254308sP(enumC1046250dKhArr);
    }

    public static EnumC1046250dKh[] values() {
        return (EnumC1046250dKh[]) LL.clone();
    }

    public final long getLength() {
        int i = C1046240dKg.LIZ[ordinal()];
        if (i == 1) {
            return 6000L;
        }
        if (i == 2) {
            return 15000L;
        }
        if (i == 3) {
            return 2000L;
        }
        throw new C1954807lC();
    }

    public static EnumC1046250dKh valueOf(String str) {
        return (EnumC1046250dKh) C08FF.LIZ(EnumC1046250dKh.class, str);
    }

    public EnumC1046250dKh(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}

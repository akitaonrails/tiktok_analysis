package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15x3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20685915x3 {

    @InterfaceC1294060jmO
    public static final EnumC20685915x3 CARD;
    public static final /* synthetic */ EnumC20685915x3[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC20685915x3 VIDEO;

    public EnumC20685915x3() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC20685915x3> getEntries() {
        return LLILLJJLI;
    }

    public abstract String getKeyForCount();

    public abstract String getKeyForStart();

    public abstract Integer getMaxCount();

    public abstract int getPeriod();

    static {
        EnumC20685915x3 enumC20685915x3 = new EnumC20685915x3() { // from class: X.15x6
            public final String LLILLL;

            {
                C20686015x4.LIZ.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("card_follow_cnt_");
                sbLIZ.append(C20686015x4.LIZIZ());
                this.LLILLL = C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.EnumC20685915x3
            public final Integer getMaxCount() {
                return null;
            }

            @Override // X.EnumC20685915x3
            public final int getPeriod() {
                return -1;
            }

            @Override // X.EnumC20685915x3
            public final String getKeyForStart() {
                C20686015x4.LIZ.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("card_follow_start_");
                sbLIZ.append(C20686015x4.LIZIZ());
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.EnumC20685915x3
            public final String getKeyForCount() {
                return this.LLILLL;
            }
        };
        CARD = enumC20685915x3;
        EnumC20685915x3 enumC20685915x32 = new EnumC20685915x3() { // from class: X.15x5
            public final String LLILLL;

            {
                C20686015x4.LIZ.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("video_follow_cnt_");
                sbLIZ.append(C20686015x4.LIZIZ());
                this.LLILLL = C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.EnumC20685915x3
            public final Integer getMaxCount() {
                return 5;
            }

            @Override // X.EnumC20685915x3
            public final int getPeriod() {
                return 24;
            }

            @Override // X.EnumC20685915x3
            public final String getKeyForStart() {
                C20686015x4.LIZ.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("video_follow_start_");
                sbLIZ.append(C20686015x4.LIZIZ());
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.EnumC20685915x3
            public final String getKeyForCount() {
                return this.LLILLL;
            }
        };
        VIDEO = enumC20685915x32;
        EnumC20685915x3[] enumC20685915x3Arr = {enumC20685915x3, enumC20685915x32};
        LL = enumC20685915x3Arr;
        LLILLJJLI = new C2254308sP(enumC20685915x3Arr);
    }

    public static EnumC20685915x3[] values() {
        return (EnumC20685915x3[]) LL.clone();
    }

    public static EnumC20685915x3 valueOf(String str) {
        return (EnumC20685915x3) C08FF.LIZ(EnumC20685915x3.class, str);
    }

    public EnumC20685915x3(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}

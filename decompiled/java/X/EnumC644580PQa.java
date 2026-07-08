package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PQa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC644580PQa {
    public static final /* synthetic */ EnumC644580PQa[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC644580PQa P0_VISIBLE_MAIN_CONTENT;
    public static final EnumC644580PQa P1_NEXT_ROW_MAIN_CONTENT;
    public static final EnumC644580PQa P2_VISIBLE_SECONDARY;
    public static final EnumC644580PQa P3_PREFETCH_AHEAD;
    public final int LL;

    public static InterfaceC2044707zh<EnumC644580PQa> getEntries() {
        return LLILLL;
    }

    static {
        EnumC644580PQa enumC644580PQa = new EnumC644580PQa("P0_VISIBLE_MAIN_CONTENT", 0, 0);
        P0_VISIBLE_MAIN_CONTENT = enumC644580PQa;
        EnumC644580PQa enumC644580PQa2 = new EnumC644580PQa("P1_NEXT_ROW_MAIN_CONTENT", 1, 1);
        P1_NEXT_ROW_MAIN_CONTENT = enumC644580PQa2;
        EnumC644580PQa enumC644580PQa3 = new EnumC644580PQa("P2_VISIBLE_SECONDARY", 2, 2);
        P2_VISIBLE_SECONDARY = enumC644580PQa3;
        EnumC644580PQa enumC644580PQa4 = new EnumC644580PQa("P3_PREFETCH_AHEAD", 3, 3);
        P3_PREFETCH_AHEAD = enumC644580PQa4;
        EnumC644580PQa[] enumC644580PQaArr = {enumC644580PQa, enumC644580PQa2, enumC644580PQa3, enumC644580PQa4};
        LLILLJJLI = enumC644580PQaArr;
        LLILLL = new C2254308sP(enumC644580PQaArr);
    }

    public static EnumC644580PQa[] values() {
        return (EnumC644580PQa[]) LLILLJJLI.clone();
    }

    public final EnumC644580PQa downgrade() {
        int i = C644590PQb.LIZ[ordinal()];
        if (i == 1) {
            return P1_NEXT_ROW_MAIN_CONTENT;
        }
        if (i == 2) {
            return P2_VISIBLE_SECONDARY;
        }
        if (i == 3) {
            return P3_PREFETCH_AHEAD;
        }
        if (i == 4) {
            return P3_PREFETCH_AHEAD;
        }
        throw new C1954807lC();
    }

    public final EnumC1331380kka toFrescoPriority() {
        int i = C644590PQb.LIZ[ordinal()];
        if (i == 1) {
            return EnumC1331380kka.HIGH;
        }
        if (i == 2) {
            return EnumC1331380kka.MEDIUM;
        }
        if (i == 3) {
            return EnumC1331380kka.LOW;
        }
        if (i == 4) {
            return EnumC1331380kka.LOW;
        }
        throw new C1954807lC();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC644580PQa valueOf(String str) {
        return (EnumC644580PQa) C08FF.LIZ(EnumC644580PQa.class, str);
    }

    public EnumC644580PQa(String str, int i, int i2) {
        this.LL = i2;
    }
}

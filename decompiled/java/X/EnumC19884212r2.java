package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.12r2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public enum EnumC19884212r2 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);

    public static final C19883812qy LLILLL;
    public final int LL;

    static {
        int iHighestOneBit;
        C19884112r1 c19884112r1 = new C19884112r1();
        for (EnumC19884212r2 enumC19884212r2 : values()) {
            Integer numValueOf = Integer.valueOf(enumC19884212r2.LL);
            int i = c19884112r1.LIZIZ + 1;
            Object[] objArr = c19884112r1.LIZ;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                if (i2 > length && (length = length + (length >> 1) + 1) < i2 && (length = (iHighestOneBit = Integer.highestOneBit(i2 - 1)) + iHighestOneBit) < 0) {
                    length = Integer.MAX_VALUE;
                }
                c19884112r1.LIZ = Arrays.copyOf(objArr, length);
            }
            C19862512nX.LIZ(numValueOf, enumC19884212r2);
            Object[] objArr2 = c19884112r1.LIZ;
            int i3 = c19884112r1.LIZIZ;
            int i4 = i3 + i3;
            objArr2[i4] = numValueOf;
            objArr2[i4 + 1] = enumC19884212r2;
            c19884112r1.LIZIZ = i3 + 1;
        }
        C19864012nm c19864012nm = c19884112r1.LIZJ;
        if (c19864012nm != null) {
            throw c19864012nm.LIZ();
        }
        C19883812qy c19883812qyLIZLLL = C19883812qy.LIZLLL(c19884112r1.LIZIZ, c19884112r1.LIZ, c19884112r1);
        C19864012nm c19864012nm2 = c19884112r1.LIZJ;
        if (c19864012nm2 != null) {
            throw c19864012nm2.LIZ();
        }
        LLILLL = c19883812qyLIZLLL;
    }

    EnumC19884212r2(int i) {
        this.LL = i;
    }
}

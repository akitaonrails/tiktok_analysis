package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: X.130B, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public enum C130B implements InterfaceC19935612zK {
    EDITION_UNKNOWN(0),
    EDITION_LEGACY(900),
    EDITION_PROTO2(998),
    EDITION_PROTO3(999),
    EDITION_2023(LSPassThroughRecordSizeConfig.DEFAULT),
    EDITION_2024(1001),
    EDITION_1_TEST_ONLY(1),
    EDITION_2_TEST_ONLY(2),
    EDITION_99997_TEST_ONLY(99997),
    EDITION_99998_TEST_ONLY(99998),
    EDITION_99999_TEST_ONLY(99999),
    EDITION_MAX(Integer.MAX_VALUE);

    public static final C130C LLILLJJLI;
    public static final C130B[] LLILLL;
    public final int LL;

    /* JADX WARN: Type inference failed for: r0v24, types: [X.130C] */
    static {
        C19373810qu.LIZ(EnumC19373110qn.PUBLIC, "Edition");
        LLILLJJLI = new InterfaceC19922212xA<C130B>() { // from class: X.130C
            @Override // X.InterfaceC19922212xA
            public final InterfaceC19931112yb LIZJ(int i) {
                return C130B.forNumber(i);
            }
        };
        LLILLL = values();
    }

    public static C199422130y getDescriptor() {
        return (C199422130y) ListProtector.get(Collections.unmodifiableList(Arrays.asList(C131K.LJJLIIIJJI.LLILZ)), 0);
    }

    public final C199422130y getDescriptorForType() {
        return getDescriptor();
    }

    public final C199423130z getValueDescriptor() {
        return (C199423130z) ListProtector.get(getDescriptor().LJIJ(), ordinal());
    }

    public static InterfaceC19922212xA<C130B> internalGetValueMap() {
        return LLILLJJLI;
    }

    @Override // X.InterfaceC19931112yb
    public final int getNumber() {
        return this.LL;
    }

    public static C130B forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 900) {
                        if (i != Integer.MAX_VALUE) {
                            switch (i) {
                                case 998:
                                    return EDITION_PROTO2;
                                case 999:
                                    return EDITION_PROTO3;
                                case LSPassThroughRecordSizeConfig.DEFAULT /* 1000 */:
                                    return EDITION_2023;
                                case 1001:
                                    return EDITION_2024;
                                default:
                                    switch (i) {
                                        case 99997:
                                            return EDITION_99997_TEST_ONLY;
                                        case 99998:
                                            return EDITION_99998_TEST_ONLY;
                                        case 99999:
                                            return EDITION_99999_TEST_ONLY;
                                        default:
                                            return null;
                                    }
                            }
                        }
                        return EDITION_MAX;
                    }
                    return EDITION_LEGACY;
                }
                return EDITION_2_TEST_ONLY;
            }
            return EDITION_1_TEST_ONLY;
        }
        return EDITION_UNKNOWN;
    }

    public static C130B valueOf(C199423130z c199423130z) {
        if (c199423130z.LLILZLL == getDescriptor()) {
            return LLILLL[c199423130z.LLILLJJLI];
        }
        throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }

    public static C130B valueOf(String str) {
        return (C130B) C08FF.LIZ(C130B.class, str);
    }

    public static C130B valueOf(int i) {
        return forNumber(i);
    }

    C130B(int i) {
        this.LL = i;
    }
}

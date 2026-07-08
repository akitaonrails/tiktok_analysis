package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'OLDER' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: X.0YMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC873090YMx implements WireEnum {
    public static final ProtoAdapter<EnumC873090YMx> ADAPTER;
    public static final EnumC873090YMx FROM_LATEST;
    public static final EnumC873090YMx FROM_NEW_TO_OLD;
    public static final EnumC873090YMx FROM_OLD_TO_NEW;
    public static final /* synthetic */ EnumC873090YMx[] LLILLJJLI;
    public static final EnumC873090YMx NEWER;
    public static final EnumC873090YMx OLDER;
    public final int LL;
    public final Boolean deprecated;

    static {
        Boolean bool = Boolean.TRUE;
        EnumC873090YMx enumC873090YMx = new EnumC873090YMx(0, 1, bool, "OLDER");
        OLDER = enumC873090YMx;
        EnumC873090YMx enumC873090YMx2 = new EnumC873090YMx(1, 2, bool, "NEWER");
        NEWER = enumC873090YMx2;
        EnumC873090YMx enumC873090YMx3 = new EnumC873090YMx(2, 3, bool, "FROM_LATEST");
        FROM_LATEST = enumC873090YMx3;
        EnumC873090YMx enumC873090YMx4 = new EnumC873090YMx(3, 4, null, "FROM_OLD_TO_NEW");
        FROM_OLD_TO_NEW = enumC873090YMx4;
        EnumC873090YMx enumC873090YMx5 = new EnumC873090YMx(4, 5, null, "FROM_NEW_TO_OLD");
        FROM_NEW_TO_OLD = enumC873090YMx5;
        LLILLJJLI = new EnumC873090YMx[]{enumC873090YMx, enumC873090YMx2, enumC873090YMx3, enumC873090YMx4, enumC873090YMx5};
        ADAPTER = new EnumAdapter<EnumC873090YMx>() { // from class: X.0YN0
            @Override // com.squareup.wire.EnumAdapter
            public final WireEnum LIZ(int i) {
                return EnumC873090YMx.fromValue(i);
            }
        };
    }

    public static EnumC873090YMx[] values() {
        return (EnumC873090YMx[]) LLILLJJLI.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static EnumC873090YMx fromValue(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return FROM_NEW_TO_OLD;
                    }
                    return FROM_OLD_TO_NEW;
                }
                return FROM_LATEST;
            }
            return NEWER;
        }
        return OLDER;
    }

    public static EnumC873090YMx valueOf(String str) {
        return (EnumC873090YMx) C08FF.LIZ(EnumC873090YMx.class, str);
    }

    public EnumC873090YMx(int i, int i2, Boolean bool, String str) {
        this.LL = i2;
        this.deprecated = bool;
    }
}

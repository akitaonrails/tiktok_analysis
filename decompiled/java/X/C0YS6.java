package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SET_PROPERTY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: X.0YS6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YS6 implements WireEnum {
    public static final ProtoAdapter<C0YS6> ADAPTER;
    public static final C0YS6 ADD_PROPERTY_ITEM;
    public static final C0YS6 DEL_PROPERTY;
    public static final /* synthetic */ C0YS6[] LLILLJJLI;
    public static final C0YS6 MODIFY_PROPERTY;
    public static final C0YS6 REMOVE_PROPERTY_ITEM;
    public static final C0YS6 SET_PROPERTY;
    public static final C0YS6 XSET_PROPERTY;
    public final int LL;
    public final Boolean deprecated;

    static {
        C0YS6 c0ys6 = new C0YS6(0, 0, null, "ADD_PROPERTY_ITEM");
        ADD_PROPERTY_ITEM = c0ys6;
        C0YS6 c0ys62 = new C0YS6(1, 1, null, "REMOVE_PROPERTY_ITEM");
        REMOVE_PROPERTY_ITEM = c0ys62;
        Boolean bool = Boolean.TRUE;
        C0YS6 c0ys63 = new C0YS6(2, 2, bool, "SET_PROPERTY");
        SET_PROPERTY = c0ys63;
        C0YS6 c0ys64 = new C0YS6(3, 3, bool, "DEL_PROPERTY");
        DEL_PROPERTY = c0ys64;
        C0YS6 c0ys65 = new C0YS6(4, 4, bool, "XSET_PROPERTY");
        XSET_PROPERTY = c0ys65;
        C0YS6 c0ys66 = new C0YS6(5, 5, bool, "MODIFY_PROPERTY");
        MODIFY_PROPERTY = c0ys66;
        LLILLJJLI = new C0YS6[]{c0ys6, c0ys62, c0ys63, c0ys64, c0ys65, c0ys66};
        ADAPTER = new EnumAdapter<C0YS6>() { // from class: X.0YS7
            @Override // com.squareup.wire.EnumAdapter
            public final WireEnum LIZ(int i) {
                return C0YS6.fromValue(i);
            }
        };
    }

    public static C0YS6[] values() {
        return (C0YS6[]) LLILLJJLI.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0YS6 fromValue(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return MODIFY_PROPERTY;
                        }
                        return XSET_PROPERTY;
                    }
                    return DEL_PROPERTY;
                }
                return SET_PROPERTY;
            }
            return REMOVE_PROPERTY_ITEM;
        }
        return ADD_PROPERTY_ITEM;
    }

    public static C0YS6 valueOf(String str) {
        return (C0YS6) C08FF.LIZ(C0YS6.class, str);
    }

    public C0YS6(int i, int i2, Boolean bool, String str) {
        this.LL = i2;
        this.deprecated = bool;
    }
}

package X;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INVISIBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: X.0YUT, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YUT implements WireEnum {
    public static final ProtoAdapter<C0YUT> ADAPTER;
    public static final C0YUT AVAILABLE;
    public static final C0YUT BANNED;
    public static final C0YUT DELETED;
    public static final C0YUT INVISIBLE;
    public static final /* synthetic */ C0YUT[] LLILLJJLI;
    public static final C0YUT NOT_EXIST;
    public static final C0YUT RECALLED;
    public static final C0YUT VIOLATIVE;
    public final int LL;
    public final Boolean deprecated;

    static {
        C0YUT c0yut = new C0YUT(0, 0, null, "AVAILABLE");
        AVAILABLE = c0yut;
        C0YUT c0yut2 = new C0YUT(1, 1, null, "NOT_EXIST");
        NOT_EXIST = c0yut2;
        Boolean bool = Boolean.TRUE;
        C0YUT c0yut3 = new C0YUT(2, 2, bool, "INVISIBLE");
        INVISIBLE = c0yut3;
        C0YUT c0yut4 = new C0YUT(3, 3, null, "RECALLED");
        RECALLED = c0yut4;
        C0YUT c0yut5 = new C0YUT(4, 4, bool, "DELETED");
        DELETED = c0yut5;
        C0YUT c0yut6 = new C0YUT(5, 5, null, "VIOLATIVE");
        VIOLATIVE = c0yut6;
        C0YUT c0yut7 = new C0YUT(6, 6, null, "BANNED");
        BANNED = c0yut7;
        LLILLJJLI = new C0YUT[]{c0yut, c0yut2, c0yut3, c0yut4, c0yut5, c0yut6, c0yut7};
        ADAPTER = new EnumAdapter<C0YUT>() { // from class: X.0YUU
            @Override // com.squareup.wire.EnumAdapter
            public final WireEnum LIZ(int i) {
                return C0YUT.fromValue(i);
            }
        };
    }

    public static C0YUT[] values() {
        return (C0YUT[]) LLILLJJLI.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.LL;
    }

    public static C0YUT fromValue(int i) {
        switch (i) {
            case 0:
                return AVAILABLE;
            case 1:
                return NOT_EXIST;
            case 2:
                return INVISIBLE;
            case 3:
                return RECALLED;
            case 4:
                return DELETED;
            case 5:
                return VIOLATIVE;
            case 6:
                return BANNED;
            default:
                return null;
        }
    }

    public static C0YUT valueOf(String str) {
        return (C0YUT) C08FF.LIZ(C0YUT.class, str);
    }

    public C0YUT(int i, int i2, Boolean bool, String str) {
        this.LL = i2;
        this.deprecated = bool;
    }
}

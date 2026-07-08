package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hlX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class EnumC1216650hlX {
    public static final /* synthetic */ EnumC1216650hlX[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1216650hlX PADDING_16;
    public static final EnumC1216650hlX PADDING_28;
    public static final EnumC1216650hlX PADDING_32;

    public EnumC1216650hlX() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1216650hlX> getEntries() {
        return LLILLJJLI;
    }

    public abstract int toPx();

    static {
        EnumC1216650hlX enumC1216650hlX = new EnumC1216650hlX() { // from class: X.0hiv
            @Override // X.EnumC1216650hlX
            public final int toPx() {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
        };
        PADDING_16 = enumC1216650hlX;
        EnumC1216650hlX enumC1216650hlX2 = new EnumC1216650hlX() { // from class: X.0hiw
            @Override // X.EnumC1216650hlX
            public final int toPx() {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            }
        };
        PADDING_28 = enumC1216650hlX2;
        EnumC1216650hlX enumC1216650hlX3 = new EnumC1216650hlX() { // from class: X.0hix
            @Override // X.EnumC1216650hlX
            public final int toPx() {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            }
        };
        PADDING_32 = enumC1216650hlX3;
        EnumC1216650hlX[] enumC1216650hlXArr = {enumC1216650hlX, enumC1216650hlX2, enumC1216650hlX3};
        LL = enumC1216650hlXArr;
        LLILLJJLI = new C2254308sP(enumC1216650hlXArr);
    }

    public static EnumC1216650hlX[] values() {
        return (EnumC1216650hlX[]) LL.clone();
    }

    public static EnumC1216650hlX valueOf(String str) {
        return (EnumC1216650hlX) C08FF.LIZ(EnumC1216650hlX.class, str);
    }

    public EnumC1216650hlX(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}

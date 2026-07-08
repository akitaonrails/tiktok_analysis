package X;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12s2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class EnumC19890412s2 implements InterfaceC1394580mOW<AbstractC19891512sD<?>> {
    public static final C19891012s8 LL;
    public static final C19890912s7 LLILLJJLI;
    public static final /* synthetic */ EnumC19890412s2[] LLILLL;

    public EnumC19890412s2() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.12s7] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.12s8] */
    static {
        ?? r3 = new EnumC19890412s2() { // from class: X.12s8
            @Override // X.InterfaceC1394580mOW
            public final boolean apply(AbstractC19891512sD<?> abstractC19891512sD) {
                Type type = abstractC19891512sD.runtimeType;
                if (!(type instanceof TypeVariable) && !(type instanceof WildcardType)) {
                    return true;
                }
                return false;
            }
        };
        LL = r3;
        ?? r2 = new EnumC19890412s2() { // from class: X.12s7
            @Override // X.InterfaceC1394580mOW
            public final boolean apply(AbstractC19891512sD<?> abstractC19891512sD) {
                return abstractC19891512sD.getRawType().isInterface();
            }
        };
        LLILLJJLI = r2;
        LLILLL = new EnumC19890412s2[]{r3, r2};
    }

    public static EnumC19890412s2[] values() {
        return (EnumC19890412s2[]) LLILLL.clone();
    }

    public static EnumC19890412s2 valueOf(String str) {
        return (EnumC19890412s2) C08FF.LIZ(EnumC19890412s2.class, str);
    }

    public EnumC19890412s2(String str, int i) {
    }
}

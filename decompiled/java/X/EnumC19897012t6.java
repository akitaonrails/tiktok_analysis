package X;

import java.lang.reflect.ParameterizedType;
import java.util.Objects;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12t6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class EnumC19897012t6 {
    public static final EnumC19897012t6 LL;
    public static final /* synthetic */ EnumC19897012t6[] LLILLJJLI = {new EnumC19897012t6() { // from class: X.12t7
        @Override // X.EnumC19897012t6
        public final Class<?> LIZJ(Class<?> cls) {
            return cls.getEnclosingClass();
        }
    }, new EnumC19897012t6() { // from class: X.12t8
        @Override // X.EnumC19897012t6
        public final Class<?> LIZJ(Class<?> cls) {
            if (cls.isLocalClass()) {
                return null;
            }
            return cls.getEnclosingClass();
        }
    }};

    /* JADX INFO: Fake field, exist only in values array */
    EnumC19897012t6 EF2;

    public EnumC19897012t6() {
        throw null;
    }

    public abstract Class<?> LIZJ(Class<?> cls);

    static {
        new C19897412tA<String>() { // from class: X.12t9
        };
        ParameterizedType parameterizedType = (ParameterizedType) C19897312t9.class.getGenericSuperclass();
        Objects.requireNonNull(parameterizedType);
        for (EnumC19897012t6 enumC19897012t6 : values()) {
            if (enumC19897012t6.LIZJ(C19897412tA.class) == parameterizedType.getOwnerType()) {
                LL = enumC19897012t6;
                return;
            }
        }
        throw new AssertionError();
    }

    public static EnumC19897012t6[] values() {
        return (EnumC19897012t6[]) LLILLJJLI.clone();
    }

    public static EnumC19897012t6 valueOf(String str) {
        return (EnumC19897012t6) C08FF.LIZ(EnumC19897012t6.class, str);
    }

    public EnumC19897012t6(String str, int i) {
    }
}

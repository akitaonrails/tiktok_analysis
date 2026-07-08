package X;

import com.bytedance.retrofit2.mime.TypedInput;

/* JADX INFO: renamed from: X.0X52, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X52<T> {
    public final C2175508fh LIZ;
    public final T LIZIZ;
    public final TypedInput LIZJ;
    public C1494570ozn LIZLLL;

    public final int LIZ() {
        return this.LIZ.LIZIZ;
    }

    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    public static <T> C0X52<T> LIZIZ(TypedInput typedInput, C2175508fh c2175508fh) {
        if (typedInput != null) {
            if (c2175508fh != null) {
                if (!c2175508fh.LIZJ()) {
                    return new C0X52<>(c2175508fh, null, typedInput);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            }
            throw new NullPointerException("rawResponse == null");
        }
        throw new NullPointerException("body == null");
    }

    public static <T> C0X52<T> LIZLLL(T t, C2175508fh c2175508fh) {
        if (c2175508fh != null) {
            if (c2175508fh.LIZJ()) {
                return new C0X52<>(c2175508fh, t, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        throw new NullPointerException("rawResponse == null");
    }

    public C0X52(C2175508fh c2175508fh, T t, TypedInput typedInput) {
        this.LIZ = c2175508fh;
        this.LIZIZ = t;
        this.LIZJ = typedInput;
    }
}

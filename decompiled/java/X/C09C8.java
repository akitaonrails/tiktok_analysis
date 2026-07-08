package X;

import android.os.Build;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.09C8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public class C09C8 implements Type {
    public final Type LL;

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return Build.VERSION.SDK_INT >= 28 ? this.LL.getTypeName() : this.LL.toString();
    }

    public final String toString() {
        return this.LL.toString();
    }

    public C09C8(Type type) {
        this.LL = type;
    }
}

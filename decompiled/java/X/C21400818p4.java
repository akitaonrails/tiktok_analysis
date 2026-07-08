package X;

import android.text.Editable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18p4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21400818p4 extends Editable.Factory {
    public static final Object LIZ = new Object();
    public static volatile C21400818p4 LIZIZ;
    public static Class<?> LIZJ;

    public C21400818p4() {
        try {
            LIZJ = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C21400818p4.class.getClassLoader());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = LIZJ;
        if (cls != null) {
            return new C21401218p8(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }
}

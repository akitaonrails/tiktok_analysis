package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: X.19u2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21686419u2 {
    public final Method LIZ;
    public boolean LIZIZ = true;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public List<RecyclerView.ViewHolder> LJIIJ;

    public C21686419u2() {
        try {
            Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("isRemoved", new Class[0]);
            this.LIZ = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Failed to access isRemoved method in ViewHolder", e);
        }
    }
}

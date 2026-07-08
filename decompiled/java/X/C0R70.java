package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0R70, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0R70 {
    public final String LIZ;
    public final WeakReference<View> LIZIZ;
    public C0R73 LIZLLL;
    public final String LJFF;
    public final List<C0R70> LIZJ = new ArrayList();
    public final C01GW LJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1621));

    public String LIZ() {
        return C0RCN.LIZIZ(this.LIZIZ.get(), true, this.LIZ);
    }

    public C0R73 LIZIZ() {
        C0R73 c0r73;
        View view = this.LIZIZ.get();
        C0R73 c0r73LIZ = null;
        if (view != null) {
            if (view.getVisibility() != 0) {
                this.LIZLLL = null;
                return null;
            }
            if (((Boolean) this.LJ.getValue()).booleanValue() && (c0r73 = this.LIZLLL) != null && c0r73.LIZIZ(view)) {
                return this.LIZLLL;
            }
            c0r73LIZ = C0R72.LIZ(view, this.LJFF);
            this.LIZLLL = c0r73LIZ;
            if (view.getHeight() > 0 && view.getWidth() > 0 && ((Boolean) this.LJ.getValue()).booleanValue()) {
                int size = ((ArrayList) this.LIZJ).size();
                for (int i = 0; i < size; i++) {
                    C0R73 c0r73LIZIZ = ((C0R70) ListProtector.get(this.LIZJ, i)).LIZIZ();
                    if (c0r73LIZIZ != null) {
                        ((ArrayList) c0r73LIZ.LJFF).add(c0r73LIZIZ);
                    }
                }
            }
        }
        return c0r73LIZ;
    }

    public C0R70(View view, String str) {
        this.LIZ = str;
        this.LIZIZ = new WeakReference<>(view);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(':');
        sbLIZ.append(hashCode());
        this.LJFF = C2188811AlT.LIZIZ(sbLIZ);
    }
}

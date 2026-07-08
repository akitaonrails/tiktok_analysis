package X;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;

/* JADX INFO: renamed from: X.0ROM, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public abstract class C0ROM<DATA, CONTEXT> {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(431));
    public boolean LIZIZ;

    public abstract boolean LIZ(DATA data, CONTEXT context);

    public ViewGroup LIZIZ(Context context) {
        return null;
    }

    public boolean LIZLLL() {
        return this instanceof C0RND;
    }

    public C13IQ<?> LJFF() {
        return null;
    }

    public abstract String LJI();

    public List<C0ROM<DATA, CONTEXT>> LJ() {
        return (List) this.LIZ.getValue();
    }

    public void LJII(C694940RNs c694940RNs) {
        this.LIZIZ = false;
    }

    public C694940RNs LIZJ(boolean z, List list, C694940RNs c694940RNs, AwS412S0200000_11 awS412S0200000_11) {
        Map<String, ViewGroup> map;
        ViewGroup viewGroup;
        if (c694940RNs != null && (map = c694940RNs.LIZJ) != null && (viewGroup = map.get(LJI())) != null) {
            C0ROR.LIZ(viewGroup, z, false);
        }
        return c694940RNs;
    }
}

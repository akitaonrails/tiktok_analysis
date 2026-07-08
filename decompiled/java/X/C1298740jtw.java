package X;

import android.view.MotionEvent;
import com.lynx.react.bridge.JavaOnlyMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jtw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298740jtw extends C1298730jtv {
    public final C1298900juC LJI;
    public final C1298900juC LJII;
    public final C1298900juC LJIIIIZZ;
    public final boolean LJIIIZ;
    public final Map<Integer, C1298900juC> LJIIJ;
    public final JavaOnlyMap LJIIJJI;
    public HashMap<Integer, InterfaceC1326530kcl> LJIIL;
    public MotionEvent LJIILIIL;

    @Override // X.C1298730jtv
    public final ArrayList<Object> LIZ() {
        ArrayList<Object> arrayListLIZ = super.LIZ();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Boolean.valueOf(this.LJIIIZ));
        if (this.LJIIIZ) {
            arrayList.add(this.LJIIJJI);
        } else {
            arrayList.add(Float.valueOf(this.LJI.LIZ));
            arrayList.add(Float.valueOf(this.LJI.LIZIZ));
            arrayList.add(Float.valueOf(this.LJII.LIZ));
            arrayList.add(Float.valueOf(this.LJII.LIZIZ));
            arrayList.add(Float.valueOf(this.LJIIIIZZ.LIZ));
            arrayList.add(Float.valueOf(this.LJIIIIZZ.LIZIZ));
        }
        arrayListLIZ.add(arrayList);
        return arrayListLIZ;
    }

    public C1298740jtw(String str, JavaOnlyMap javaOnlyMap) {
        super(-1, str, EnumC1298710jtt.kTouch);
        this.LJIIIZ = true;
        this.LJIIJJI = javaOnlyMap;
    }

    public C1298740jtw(int i, String str, Map<Integer, C1298900juC> map) {
        super(i, str, EnumC1298710jtt.kTouch);
        this.LJIIIZ = true;
        this.LJIIJ = map;
    }

    public C1298740jtw(int i, String str, C1298900juC c1298900juC, C1298900juC c1298900juC2, C1298900juC c1298900juC3) {
        super(i, str, EnumC1298710jtt.kTouch);
        this.LJI = c1298900juC;
        this.LJII = c1298900juC2;
        this.LJIIIIZZ = c1298900juC3;
    }
}

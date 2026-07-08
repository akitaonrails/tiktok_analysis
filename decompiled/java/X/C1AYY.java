package X;

import android.content.Context;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1AYY, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AYY extends C1AYS {
    public final Context LJIIIIZZ;
    public final InterfaceC2181151AXx LJIIIZ;
    public final HashMap<Integer, C1AX3> LJIIJ;

    public final C1AX3 LJIIIIZZ(int i) {
        C1AX3 c1ax3 = this.LJIIJ.get(Integer.valueOf(i));
        if (c1ax3 == null) {
            C1AX3 c1ax3LIZIZ = LIZIZ(EnumC918810a19.StateInit);
            this.LJIIJ.put(Integer.valueOf(i), c1ax3LIZIZ);
            return c1ax3LIZIZ;
        }
        return c1ax3;
    }

    @Override // X.C1AYS
    public final boolean LJI(C1AXI c1axi, FrameLayout frameLayout) {
        boolean z;
        C1AX3 next;
        C1AXI c1axi2;
        String str;
        Long l;
        Long l2;
        boolean zLJFF;
        String str2;
        String string;
        Iterator<C1AX3> it2 = this.LJI.iterator();
        while (true) {
            z = false;
            if (it2.hasNext()) {
                next = it2.next();
                C1AX3 c1ax3 = next;
                if (c1axi.LIZJ != null && (str2 = c1ax3.LIZ.LIZJ) != null) {
                    String string2 = a0.LJLIIIL(str2).toString();
                    String str3 = c1axi.LIZJ;
                    if (str3 != null) {
                        string = a0.LJLIIIL(str3).toString();
                    } else {
                        string = null;
                    }
                    zLJFF = Intrinsics.LJFF(string2, string);
                } else {
                    Long l3 = c1axi.LIZIZ;
                    if (l3 != null && (l2 = c1ax3.LIZ.LIZIZ) != null) {
                        zLJFF = Intrinsics.LJFF(l2, l3);
                    }
                }
                if (zLJFF) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1AX3 c1ax32 = next;
        if (c1ax32 != null) {
            c1axi2 = c1ax32.LIZ;
        } else {
            c1axi2 = null;
        }
        FrameLayout frameLayout2 = frameLayout;
        if (c1axi2 != null) {
            C1AXI c1axi3 = c1ax32.LIZ;
            EnumC918810a19 enumC918810a19 = c1axi3.LIZ;
            EnumC918810a19 enumC918810a192 = c1axi.LIZ;
            if (enumC918810a19 == null || (enumC918810a192 != null && C1AXI.LJIIJ.getValue().contains(new Pair(enumC918810a19, enumC918810a192)))) {
                if (c1axi3.LIZIZ == null && (l = c1axi.LIZIZ) != null) {
                    c1axi3.LIZIZ = l;
                }
                if (c1axi3.LIZJ == null && (str = c1axi.LIZJ) != null) {
                    c1axi3.LIZJ = str;
                }
                EnumC918810a19 enumC918810a193 = c1axi3.LIZ;
                EnumC918810a19 enumC918810a194 = c1axi.LIZ;
                if (enumC918810a193 != enumC918810a194 && enumC918810a194 != null) {
                    if (enumC918810a193 != null) {
                        c1axi3.LJI = enumC918810a193;
                    }
                    c1axi3.LIZ = enumC918810a194;
                    z = true;
                }
                if (!Intrinsics.LJFF(c1axi.LIZLLL, c1axi3.LIZLLL)) {
                    SurfaceView surfaceView = c1axi.LIZLLL;
                    if (surfaceView == null) {
                        c1axi3.LJIIIIZZ = true;
                    } else {
                        c1axi3.LIZLLL = surfaceView;
                    }
                    z = true;
                }
                if (!Intrinsics.LJFF(c1axi.LJFF, c1axi3.LJFF)) {
                    WeakReference<InterfaceC1268870j7l> weakReference = c1axi.LJFF;
                    if (weakReference == null) {
                        c1axi3.LJIIIIZZ = true;
                        return true;
                    }
                    c1axi3.LJFF = weakReference;
                    return true;
                }
            }
            return z;
        }
        if (frameLayout == null) {
            C1091250eVH c1091250eVH = new C1091250eVH(this.LJIIIIZZ, null, 6, 0);
            c1091250eVH.setId(R.id.ysn);
            c1091250eVH.setEnableFixedSize(true);
            frameLayout2 = c1091250eVH;
        }
        return this.LJI.add(new C1AX3(c1axi, frameLayout2));
    }

    public C1AYY(Context context, InterfaceC2181151AXx interfaceC2181151AXx, C2181141AXw c2181141AXw, int i) {
        super(context, interfaceC2181151AXx, c2181141AXw, i);
        this.LJIIIIZZ = context;
        this.LJIIIZ = interfaceC2181151AXx;
        this.LJIIJ = new HashMap<>();
    }
}

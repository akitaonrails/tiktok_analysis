package X;

import android.graphics.drawable.Animatable;
import com.lynx.tasm.ui.image.t;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0kMZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1316490kMZ<BUILDER extends t<BUILDER, REQUEST, IMAGE, INFO>, REQUEST, IMAGE, INFO> {
    public static final C1316280kME LJIIIIZZ = new C1320700kTM<Object>() { // from class: X.0kME
        @Override // X.C1320700kTM, X.InterfaceC1320650kTH
        public final void LJ(String str, Object obj, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    };
    public static final NullPointerException LJIIIZ = new NullPointerException("No image request was specified!");
    public static final AtomicLong LJIIJ = new AtomicLong();
    public boolean LIZ;
    public boolean LJI;
    public Object LIZIZ = null;
    public REQUEST LIZJ = null;
    public REQUEST LIZLLL = null;
    public InterfaceC1320650kTH<? super INFO> LJ = null;
    public boolean LJFF = false;
    public AbstractC1319960kSA LJII = null;

    public abstract InterfaceC1320200kSY LIZ(AbstractC1319960kSA abstractC1319960kSA, Object obj, Object obj2, EnumC1320050kSJ enumC1320050kSJ);
}

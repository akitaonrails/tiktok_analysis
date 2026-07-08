package X;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS383S0200000_17;

/* JADX INFO: renamed from: X.0bSV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C974210bSV {
    public static final /* synthetic */ int LJIJ = 0;
    public final String LIZ;
    public final WeakReference<InterfaceC978780bZs> LIZIZ;
    public C974250bSZ LIZJ;
    public AwS383S0200000_17 LJ;
    public long LJI;
    public boolean LJII;
    public boolean LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public Number LJIILJJIL;
    public Number LJIILL;
    public boolean LJIIZILJ;
    public final List<C943950afh> LIZLLL = new ArrayList();
    public String LJFF = "others";
    public C974230bSX LJIIIIZZ = new C974230bSX(31);
    public final Map<String, String> LJIILLIIL = new LinkedHashMap();

    public C974210bSV(String str, WeakReference<InterfaceC978780bZs> weakReference) {
        this.LIZ = str;
        this.LIZIZ = weakReference;
        if (!TextUtils.equals(str, "start_co_host") && !TextUtils.equals(str, "start_match") && !TextUtils.equals(str, "start_rematch")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
            sbLIZ.append('_');
            sbLIZ.append("LinkStartEvent");
            sbLIZ.append("_17");
            C1AZW.LJFF(C2188811AlT.LIZIZ(sbLIZ), "type error", null, null);
        }
    }
}

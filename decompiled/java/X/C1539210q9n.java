package X;

import android.net.Uri;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0q9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1539210q9n implements InterfaceC1531560pxS {
    public Uri LIZ;
    public final EnumC1067640dtC LIZIZ = EnumC1067640dtC.SDUI;
    public final Map<String, JSONObject> LIZJ = new LinkedHashMap();
    public final List<AbstractC1317190kNh> LIZLLL = new ArrayList();
    public final C01GW LJ;
    public final Integer LJFF;
    public final Integer LJI;
    public InterfaceC1538820q9A LJII;
    public JSONObject LJIIIIZZ;

    @Override // X.InterfaceC1531560pxS
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.InterfaceC1531560pxS
    public final HybridSchemaParam LIZJ() {
        return null;
    }

    @Override // X.InterfaceC1531560pxS
    public final void LJ(HybridSchemaParam hybridSchemaParam) {
    }

    @Override // X.InterfaceC1531560pxS
    public final Map<String, Object> LJFF() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1539210q9n) && Intrinsics.LJFF(this.LIZ, ((C1539210q9n) obj).LIZ);
    }

    public final int hashCode() {
        Uri uri = this.LIZ;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SDUIKitInitParams(loadUri=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1531560pxS
    public final Uri LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1531560pxS
    public final EnumC1067640dtC getType() {
        return this.LIZIZ;
    }

    public C1539210q9n(Uri uri) {
        this.LIZ = uri;
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new C1537970q7n(this));
        this.LJ = c01gwLIZ;
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
        if (c1538050q7v != null) {
            ((Map) c01gwLIZ.getValue()).putAll(c1538050q7v);
        }
        this.LJFF = -1;
        this.LJI = -1;
    }

    @Override // X.InterfaceC1531560pxS
    public final void LIZLLL(Map<String, ? extends Object> map) {
        if (map != null) {
            ((Map) this.LJ.getValue()).putAll(map);
        }
    }

    @Override // X.InterfaceC1531560pxS
    public final void LJI(Uri uri) {
        this.LIZ = uri;
    }
}

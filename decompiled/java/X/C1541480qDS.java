package X;

import android.net.Uri;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qDS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541480qDS implements InterfaceC1531560pxS {
    public Uri LIZ;
    public C844210X9v LIZJ;
    public C1542400qEw LIZLLL;
    public InterfaceC1541760qDu LJ;
    public List<Pair<Class<? extends AbstractC1541650qDj<?>>, Function1<AbstractC1541650qDj<?>, Unit>>> LJI;
    public Boolean LJII;
    public Integer LJIIIIZZ;
    public InterfaceC1047700dN2 LJIIJJI;
    public HybridSchemaParam LJIIL;
    public C1536360q5C LJIILIIL;
    public Boolean LJIILJJIL;
    public Boolean LJIILL;
    public boolean LJIILLIIL;
    public final EnumC1067640dtC LIZIZ = EnumC1067640dtC.WEB;
    public final C1542280qEk LJFF = new C1542280qEk();
    public final C01GW LJIIIZ = C452501pT.LIZ(EnumC452301pR.NONE, new C1537940q7k(this));
    public final Map<String, String> LJIIJ = new LinkedHashMap();
    public boolean LJIIZILJ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1541480qDS) && Intrinsics.LJFF(this.LIZ, ((C1541480qDS) obj).LIZ);
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
        sbLIZ.append("WebKitInitParams(loadUri=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1531560pxS
    public final boolean LIZIZ() {
        HybridSchemaParam hybridSchemaParam = this.LJIIL;
        if (hybridSchemaParam != null) {
            return hybridSchemaParam.getUseForest();
        }
        return false;
    }

    public final Map<String, Object> LJIIIIZZ() {
        return (Map) this.LJIIIZ.getValue();
    }

    @Override // X.InterfaceC1531560pxS
    public final Map<String, Object> LJFF() {
        return LJIIIIZZ();
    }

    @Override // X.InterfaceC1531560pxS
    public final Uri LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1531560pxS
    public final HybridSchemaParam LIZJ() {
        return this.LJIIL;
    }

    @Override // X.InterfaceC1531560pxS
    public final EnumC1067640dtC getType() {
        return this.LIZIZ;
    }

    public C1541480qDS(Uri uri) {
        this.LIZ = uri;
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        C1538050q7v c1538050q7v = C1161970gLL.LIZIZ().LIZLLL;
        if (c1538050q7v != null) {
            LJIIIIZZ().putAll(c1538050q7v);
        }
    }

    @Override // X.InterfaceC1531560pxS
    public final void LIZLLL(Map<String, ? extends Object> map) {
        if (map != null) {
            LJIIIIZZ().putAll(map);
        }
    }

    @Override // X.InterfaceC1531560pxS
    public final void LJ(HybridSchemaParam hybridSchemaParam) {
        this.LJIIL = hybridSchemaParam;
    }

    @Override // X.InterfaceC1531560pxS
    public final void LJI(Uri uri) {
        this.LIZ = uri;
    }

    public final void LJII(Class<? extends AbstractC1541650qDj<?>> cls, Function1<? super AbstractC1541650qDj<?>, Unit> function1) {
        if (this.LJI == null) {
            this.LJI = new ArrayList();
        }
        List<Pair<Class<? extends AbstractC1541650qDj<?>>, Function1<AbstractC1541650qDj<?>, Unit>>> list = this.LJI;
        if (list != null) {
            ((ArrayList) list).add(new Pair(cls, function1));
        }
    }
}

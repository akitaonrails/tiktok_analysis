package X;

import androidx.lifecycle.LifecycleObserver;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0m2u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1381180m2u implements InterfaceC1381130m2p {
    public String LIZIZ;
    public String LIZJ;
    public LifecycleObserver LJFF;
    public InterfaceC1381790m3t LJI;
    public Set<String> LJII;
    public EnumC1381120m2o LJIIIIZZ;
    public boolean LJIIIZ;
    public Function1<? super SparkContext, Unit> LJIIJ;
    public String LIZ = "video";
    public Map<String, String> LIZLLL = new LinkedHashMap();
    public Map<String, String> LJ = new LinkedHashMap();

    @Override // X.InterfaceC1381130m2p
    public final void LIZ() {
        this.LJIIIZ = true;
    }

    @Override // X.InterfaceC1381130m2p
    public final void LIZLLL() {
        this.LJII = null;
    }

    @Override // X.InterfaceC1381130m2p
    public final InterfaceC1381790m3t LIZIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1381130m2p
    public final String LJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1381130m2p
    public final EnumC1381120m2o LJII() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1381130m2p
    public final LifecycleObserver LJIILIIL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1381130m2p
    public final Set<String> LJIILJJIL() {
        return this.LJII;
    }

    @Override // X.InterfaceC1381130m2p
    public final Map<String, String> getCommonParams() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1381130m2p
    public final Map<String, String> getExtra() {
        return this.LJ;
    }

    @Override // X.InterfaceC1381130m2p
    public final String getObjectID() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1381130m2p
    public final String getReportType() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1381130m2p
    public final void LIZJ(LifecycleObserver lifecycleObserver) {
        this.LJFF = lifecycleObserver;
    }

    @Override // X.InterfaceC1381130m2p
    public final void LJFF(EnumC1381120m2o enumC1381120m2o) {
        this.LJIIIIZZ = enumC1381120m2o;
    }

    @Override // X.InterfaceC1381130m2p
    public final void LJI(InterfaceC1381790m3t interfaceC1381790m3t) {
        this.LJI = interfaceC1381790m3t;
    }

    @Override // X.InterfaceC1381130m2p
    public final void LJIIIIZZ(String str) {
        this.LIZJ = str;
    }

    @Override // X.InterfaceC1381130m2p
    public final void LJIIIZ(Function1<? super SparkContext, Unit> function1) {
        this.LJIIJ = function1;
    }

    @Override // X.InterfaceC1381130m2p
    public final void LJIIJ(String str) {
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC1381130m2p
    public final void LJIIJJI(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC1381130m2p
    public final void LJIIL(Map<String, String> map) {
        this.LIZLLL = map;
    }

    @Override // X.InterfaceC1381130m2p
    public final void setExtra(Map<String, String> map) {
        this.LJ = map;
    }
}

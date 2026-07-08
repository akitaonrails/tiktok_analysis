package X;

import androidx.lifecycle.LifecycleObserver;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0m2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public interface InterfaceC1381130m2p {
    void LIZ();

    InterfaceC1381790m3t LIZIZ();

    void LIZJ(LifecycleObserver lifecycleObserver);

    void LIZLLL();

    String LJ();

    void LJFF(EnumC1381120m2o enumC1381120m2o);

    void LJI(InterfaceC1381790m3t interfaceC1381790m3t);

    EnumC1381120m2o LJII();

    void LJIIIIZZ(String str);

    void LJIIIZ(Function1<? super SparkContext, Unit> function1);

    void LJIIJ(String str);

    void LJIIJJI(String str);

    void LJIIL(Map<String, String> map);

    LifecycleObserver LJIILIIL();

    Set<String> LJIILJJIL();

    Map<String, String> getCommonParams();

    Map<String, String> getExtra();

    String getObjectID();

    String getReportType();

    void setExtra(Map<String, String> map);
}

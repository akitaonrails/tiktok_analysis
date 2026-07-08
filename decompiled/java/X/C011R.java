package X;

import com.bytedance.hybrid.spark.SparkContext;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.011R, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C011R implements InterfaceC1107960ewE {
    public final Map<String, String> LL;

    @Override // X.InterfaceC1108000ewI
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC1107960ewE
    public final Function1<SparkContext, Unit> LJFF() {
        return new C203100qL(((C011S) this).LLILLJJLI);
    }

    public C011R(Map map) {
        this.LL = map;
    }
}

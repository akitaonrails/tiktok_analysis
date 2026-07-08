package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.TemplateData;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0qP9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public class C1548730qP9 {
    public TemplateData LIZ;
    public AnonymousClass0957<TemplateData> LIZIZ;
    public Function1<? super String, Unit> LJFF;
    public InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super Boolean, Unit> LJI;
    public Function2<? super LynxError, ? super String, Unit> LJII;
    public AbstractC1542200qEc LJIIIIZZ;
    public final Map<String, Object> LIZJ = new LinkedHashMap();
    public final Map<String, Object> LIZLLL = new LinkedHashMap();
    public String LJ = "";
    public final Map<String, C1311220kE4> LJIIIZ = new LinkedHashMap();
    public final ConcurrentHashMap<Class<?>, InterfaceC1537470q6z<?>> LJIIJ = new ConcurrentHashMap<>();
    public String LJIIJJI = "";

    public final SparkContext LIZ(Map map, boolean z) {
        String str = this.LJ;
        TemplateData templateData = this.LIZ;
        AnonymousClass0957<TemplateData> anonymousClass0957 = this.LIZIZ;
        Function1<? super String, Unit> function1 = this.LJFF;
        InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super Boolean, Unit> interfaceC1631620sYq = this.LJI;
        C1538010q7r c1538010q7rLIZ = C1539460qAC.LIZ(templateData, null, null, str, this.LJIIIZ, function1, this.LJII, interfaceC1631620sYq, anonymousClass0957);
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(this.LJIIJJI);
        sparkContext.LJJLIIIJILLIZJL(this.LIZJ);
        sparkContext.usePreload = z;
        sparkContext.LJJJJZ(c1538010q7rLIZ);
        AbstractC1542200qEc abstractC1542200qEc = this.LJIIIIZZ;
        if (abstractC1542200qEc != null) {
            sparkContext.LJJJJZI(abstractC1542200qEc);
        }
        for (Map.Entry entry : ((LinkedHashMap) this.LIZLLL).entrySet()) {
            Object value = entry.getValue();
            if (value instanceof String) {
                sparkContext.LJJJZ((String) entry.getKey(), (String) entry.getValue());
            } else if (value instanceof Integer) {
                sparkContext.LJJJLZIJ(((Integer) entry.getValue()).intValue(), (String) entry.getKey());
            } else if (value instanceof Double) {
                sparkContext.LJJJLL(((Double) entry.getValue()).doubleValue(), (String) entry.getKey());
            } else if (value instanceof Boolean) {
                sparkContext.LJJL((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            sparkContext.LJJJZ((String) entry2.getKey(), (String) entry2.getValue());
        }
        for (Map.Entry<Class<?>, InterfaceC1537470q6z<?>> entry3 : this.LJIIJ.entrySet()) {
            sparkContext.LJJ(entry3.getKey(), entry3.getValue().LIZ());
        }
        return sparkContext;
    }
}

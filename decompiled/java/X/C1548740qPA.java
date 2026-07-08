package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0qPA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1548740qPA extends C09AY implements InterfaceC1631620sYq<Context, String, C1537480q70, SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB> {
    public final /* synthetic */ C1548770qPD LL;
    public final /* synthetic */ C1097680efe LLILLJJLI;
    public final /* synthetic */ AbstractC1539010q9T LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1548740qPA(C1548770qPD c1548770qPD, C1097680efe c1097680efe, C1538010q7r c1538010q7r) {
        super(3);
        this.LL = c1548770qPD;
        this.LLILLJJLI = c1097680efe;
        this.LLILLL = c1538010q7r;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1631620sYq
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB invoke(Context context, String str, C1537480q70 c1537480q70) {
        Context context2 = context;
        String str2 = str;
        C1537480q70 c1537480q702 = c1537480q70;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("->EComSparkLoader.preloadFactory,\nschema: ");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        this.LL.LJIILLIIL.getClass();
        this.LL.LIZJ.putAll(new HashMap());
        if (c1537480q702 instanceof SparkContext) {
            SparkContext sparkContext = (SparkContext) c1537480q702;
            sparkContext.usePreload = this.LLILLJJLI.LJIIZILJ;
            sparkContext.LJJLIIJ(str2);
            sparkContext.LJJJZ("enable_pending_js_task", CardStruct.IStatusCode.DEFAULT);
            sparkContext.LJJLIIIJILLIZJL(this.LL.LIZJ);
            sparkContext.LJJJJZ(this.LLILLL);
            this.LL.getClass();
            for (Map.Entry<Class<?>, InterfaceC1537470q6z<?>> entry : this.LL.LJIIJ.entrySet()) {
                sparkContext.LJJ(entry.getKey(), entry.getValue().LIZ());
            }
            C1541950qED.LIZJ.getClass();
            return new C1541950qED(context2, sparkContext).LIZ(false);
        }
        C1548770qPD c1548770qPD = this.LL;
        c1548770qPD.LJIIJJI = str2;
        boolean z = this.LLILLJJLI.LJIIZILJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enable_pending_js_task", CardStruct.IStatusCode.DEFAULT);
        SparkContext sparkContextLIZ = c1548770qPD.LIZ(linkedHashMap, z);
        C1541950qED.LIZJ.getClass();
        return new C1541950qED(context2, sparkContextLIZ).LIZ(false);
    }
}

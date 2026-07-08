package X;

import com.bytedance.android.btm.impl.setting.SchemaRulesModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jbI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287180jbI extends C09AY implements Function0<Object> {
    public final /* synthetic */ SchemaRulesModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1287180jbI(SchemaRulesModel schemaRulesModel) {
        super(0);
        this.LL = schemaRulesModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchemaUtils init success\nrules: ");
        sbLIZ.append(GsonProtectorUtils.toJson((Gson) C18EU.LJIIIZ.getValue(), this.LL));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}

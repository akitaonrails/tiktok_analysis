package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.146v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202123146v extends C09AY implements Function0<Unit> {
    public C202123146v() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C202120146s.LIZ().storeBoolean("dex2oat_task_has_triggered", false);
        C202120146s.LIZ().storeBoolean("dex2oat_cmd_has_triggered", false);
        C202120146s.LIZ().storeInt("dex2oat_cmd_not_triggered_reason", -1);
        C202120146s.LIZ().storeInt("dex2oat_cmd_execute_result", -1);
        C202120146s.LIZ().storeInt("dex2oat_cmd_triggered_type", -1);
        return Unit.LIZ;
    }
}

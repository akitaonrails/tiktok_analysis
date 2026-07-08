package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.011N, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C011N extends C09AY implements Function0<Unit> {
    public C011N() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Gson gson = C1822270xWL.LIZ;
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null) {
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(contextLIZ, "aweme://roma_redirect/?spark_page=ba_leadgen_terms");
        }
        return Unit.LIZ;
    }
}

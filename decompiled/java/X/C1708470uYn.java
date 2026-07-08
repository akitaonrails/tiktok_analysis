package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.pipo.payments.IPipoExternalPaymentsService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS62S1300000_26;

/* JADX INFO: renamed from: X.0uYn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708470uYn {
    public static final C1708470uYn LIZ = new C1708470uYn();

    public static void LIZ(Context context, String str, Function2 function2, Function1 function1) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            function1.invoke(str);
            return;
        }
        IPipoService iPipoService = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
        if (iPipoService != null) {
            if (iPipoService.LJI()) {
                Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IPipoExternalPaymentsService.class, false, false, false, 14, null);
                if (objPluggableSpi$default == null) {
                    function1.invoke(str);
                    return;
                } else {
                    function2.invoke(c19egLIZIZ, objPluggableSpi$default);
                    return;
                }
            }
            iPipoService.LJIILJJIL(new AwS62S1300000_26(function1, (Function1<? super String, Unit>) str, (String) function2, (Function2<? super C19EG, ? super IPipoExternalPaymentsService, Unit>) c19egLIZIZ, (C19EG) 7));
            return;
        }
        function1.invoke(str);
    }
}

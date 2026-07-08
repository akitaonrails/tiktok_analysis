package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0pCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1502500pCa {
    public static final void LIZIZ(ISeaPdpCommunicationService iSeaPdpCommunicationService, Object obj, List<String> list) {
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            iSeaPdpCommunicationService.H6(obj, it2.next());
        }
    }

    public static final void LIZ(ISeaPdpCommunicationService iSeaPdpCommunicationService, Object obj, String str, Function2<? super Map<String, ? extends Object>, ? super C1757320vpa, C1502460pCW> function2) {
        iSeaPdpCommunicationService.Pd(obj, str, new AwS567S0100000_23(function2, (Function2<? super Map<String, ? extends Object>, ? super C1757320vpa, C1502460pCW>) 179));
    }
}

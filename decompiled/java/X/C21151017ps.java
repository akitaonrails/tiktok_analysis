package X;

import com.ss.android.ugc.aweme.service.earlyfeedback.QuestionnaireData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21151017ps {
    public static final /* synthetic */ int LIZ = 0;

    public static AbstractC21150817pq LIZ(String str, List list) {
        InterfaceC20638715pR interfaceC20638715pR;
        if (Intrinsics.LJFF(str, "interest")) {
            interfaceC20638715pR = C20638815pS.LIZ;
        } else {
            if (Intrinsics.LJFF(str, "useful")) {
                interfaceC20638715pR = C21151117pt.LIZ;
            }
            return C21150917pr.LIZ;
        }
        if (interfaceC20638715pR != null) {
            if (list != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((QuestionnaireData) it2.next()).type);
                }
                if (!arrayList.isEmpty() && !C13LP.LJJJJ(str, arrayList)) {
                    return new C21150717pp(interfaceC20638715pR);
                }
            }
            return new C21150617po(interfaceC20638715pR);
        }
        return C21150917pr.LIZ;
    }
}

package X;

import com.ss.android.ugc.aweme.service.earlyfeedback.QuestionnaireData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17pu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21151217pu {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(InterfaceC20638715pR interfaceC20638715pR, List list, int i, int i2) {
        Object next;
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((QuestionnaireData) next).type, interfaceC20638715pR.getType())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        QuestionnaireData questionnaireData = (QuestionnaireData) next;
        if (questionnaireData == null) {
            return false;
        }
        String type = interfaceC20638715pR.getType();
        if (Intrinsics.LJFF(type, "interest")) {
            if (i >= questionnaireData.skipCount) {
                return true;
            }
            return false;
        }
        if (Intrinsics.LJFF(type, "useful") && i2 >= questionnaireData.skipCount) {
            return true;
        }
        return false;
    }
}

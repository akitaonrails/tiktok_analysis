package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Dm0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C348860Dm0 {
    public static final /* synthetic */ int LIZ = 0;

    public static NLETrack LIZ(NLEModel nLEModel) {
        Object next;
        Iterator it2 = ((ArrayList) C351220Dpo.LJIJJ(nLEModel)).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                NLETrack nLETrack = (NLETrack) next;
                if (C351220Dpo.LLILLL(nLETrack) || C351220Dpo.LLJILLL(nLETrack)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (NLETrack) next;
    }
}

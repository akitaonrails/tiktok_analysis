package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.Collections;

/* JADX INFO: renamed from: X.0kxr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1339610kxr implements InterfaceC1345780l7o, Observer<C1339660kxw> {
    public Context LL;
    public InterfaceC1339710ky1 LLILLJJLI;
    public Comment LLILLL;
    public C1339520kxi LLILZ;

    @Override // X.InterfaceC1345780l7o
    public final void resetTranslate() {
        Comment comment = this.LLILLL;
        if (comment != null && C1351950lHl.LJI(comment)) {
            C1343710l4T.LIZ.getClass();
            C1343710l4T.LIZLLL(comment);
        }
    }

    @Override // X.InterfaceC1345780l7o
    public final void translate() {
        Comment comment = this.LLILLL;
        if (comment != null && C1351950lHl.LJI(comment)) {
            C1343710l4T c1343710l4T = C1343710l4T.LIZ;
            C1339520kxi c1339520kxi = this.LLILZ;
            c1343710l4T.getClass();
            C1343710l4T.LJFF(Collections.singletonList(comment), c1339520kxi);
        }
    }

    public C1339610kxr(Context context) {
        this.LL = context;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C1339660kxw c1339660kxw) {
        Activity activityLIZ;
        String asrText;
        C1339660kxw c1339660kxw2 = c1339660kxw;
        Comment comment = c1339660kxw2.LIZ;
        if (comment != null && (activityLIZ = C2493909px.LIZ(this.LL)) != null && !activityLIZ.isFinishing() && c1339660kxw2.LIZLLL != 1) {
            if (c1339660kxw2.LIZIZ) {
                C1339520kxi c1339520kxi = this.LLILZ;
                InterfaceC1339710ky1 interfaceC1339710ky1 = this.LLILLJJLI;
                if (c1339520kxi != null && interfaceC1339710ky1 != null) {
                    CmtAudioStruct audioStruct = comment.getAudioStruct();
                    if (audioStruct != null) {
                        asrText = audioStruct.getAsrText();
                    } else {
                        asrText = null;
                    }
                    interfaceC1339710ky1.LIZ(comment, asrText);
                    return;
                }
                return;
            }
            Exception exc = c1339660kxw2.LIZJ;
            if (exc == null) {
                return;
            }
            C1354920lMY.LIZJ(this.LL, exc);
        }
    }
}

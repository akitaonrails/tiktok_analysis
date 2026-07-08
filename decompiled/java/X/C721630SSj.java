package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0SSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721630SSj {
    public final C0SRL LIZ;
    public ViewStub LIZIZ;
    public View LIZJ;
    public InterfaceC721020SQa LIZLLL;

    public C721630SSj(C0SRL c0srl) {
        ViewStub viewStub;
        this.LIZ = c0srl;
        ViewGroup viewGroup = c0srl.LIZLLL;
        if (viewGroup != null) {
            viewStub = (ViewStub) viewGroup.findViewById(R.id.vs_report_mask);
        } else {
            viewStub = null;
        }
        this.LIZIZ = viewStub;
        C10IT c10it = C10IT.LIZ;
        Aweme aweme = c0srl.LIZJ;
        c10it.getClass();
        boolean zLJIILJJIL = C10IT.LJIILJJIL(aweme);
        Aweme aweme2 = c0srl.LIZJ;
        LIZIZ(zLJIILJJIL, aweme2 != null ? aweme2.getReportMaskInfo() : null);
    }

    public final void LIZ(String str) {
        String str2;
        String aid;
        C2344009Gk c2344009Gk = new C2344009Gk();
        PostModeDetailParams postModeDetailParams = this.LIZ.LJII;
        String authorUid = null;
        if (postModeDetailParams != null) {
            str2 = postModeDetailParams.eventType;
        } else {
            str2 = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        Aweme aweme = this.LIZ.LIZJ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        Aweme aweme2 = this.LIZ.LIZJ;
        if (aweme2 != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme2);
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(boolean r6, com.ss.android.ugc.aweme.feed.model.VideoMaskInfo r7) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C721630SSj.LIZIZ(boolean, com.ss.android.ugc.aweme.feed.model.VideoMaskInfo):void");
    }
}

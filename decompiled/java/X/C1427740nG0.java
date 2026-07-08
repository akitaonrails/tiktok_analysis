package X;

import com.ss.android.ugc.aweme.creative.model.TemplateCompareData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nG0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1427740nG0 extends AbstractC1434490nQt {
    public C1431070nLN LLILZLL;
    public VideoPublishEditModel LLIZ;
    public long LLIZLLLIL;
    public String LLJ;
    public C2207831Bb3 LLJI;

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.PUGC_TEMPLATE_UPLOAD;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e6  */
    @Override // X.AbstractC1434490nQt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C1404610meh r12, X.C1431070nLN r13) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1427740nG0.LJII(X.0meh, X.0nLN):void");
    }

    public final void LJIILL(C1427770nG3 c1427770nG3, int i) {
        C1431070nLN c1431070nLN = null;
        if (C306650C0h.LIZ()) {
            VideoPublishEditModel videoPublishEditModel = this.LLIZ;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            TemplateCompareData templateCompareData = videoPublishEditModel.creativeModel.pugcTemplateData.templateCompareData;
            if (templateCompareData != null) {
                C2286708xd.LJIIIIZZ(templateCompareData.failFlag, true);
            }
        }
        C1431070nLN c1431070nLN2 = this.LLILZLL;
        if (c1431070nLN2 != null) {
            c1431070nLN = c1431070nLN2;
        }
        c1431070nLN.LIZLLL(i, c1427770nG3);
    }

    public final void LJIILJJIL(long j, Long l, boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(z ? 1 : 0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZLLL(l, "error_code");
        c0lab.LIZIZ(j, "duration");
        c0lab.LJ("creation_id", this.LLJ);
        C20684815ws.LJIILLIIL("pugc_template_upload_event", c0lab.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;

/* JADX INFO: renamed from: X.0MRL, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0MRL extends C0MRN {
    @Override // X.C0MRN
    public final boolean LLLLJ() {
        ForwardMedia forwardMedia = this.LLJJJ;
        return LLLLLJLJLL(forwardMedia != null ? C566580MKa.LIZ(forwardMedia).LIZIZ : null);
    }

    @Override // X.C0MRN
    public final void LLLLJI() {
        ForwardMedia forwardMedia = this.LLJJJ;
        if (LLLLLJLJLL(forwardMedia != null ? C566580MKa.LIZ(forwardMedia).LIZIZ : null)) {
            LLLLLJIL();
            return;
        }
        C0MRQ c0mrq = this.LLJL;
        c0mrq.getClass();
        C0MRS c0mrs = C0MRS.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c0mrq.LIZ);
        sbLIZ.append(" stop");
        C201955140j.LJIILJJIL(c0mrs, C2188811AlT.LIZIZ(sbLIZ));
        c0mrq.LIZ.stop();
    }

    @Override // X.C0MRN
    public final void LLLLLJIL() {
        ForwardMedia forwardMedia = this.LLJJJ;
        if (C0MRM.LIZ(forwardMedia != null ? C566580MKa.LIZ(forwardMedia).LIZIZ : null)) {
            super.LLLLLJIL();
        }
    }

    public final boolean LLLLLJLJLL(MusicBuzModel musicBuzModel) {
        String uri;
        UrlModel urlModel;
        if (musicBuzModel == null) {
            return false;
        }
        String str = musicBuzModel.musicPath;
        MusicObject musicObject = musicBuzModel.music;
        if (musicObject != null && (urlModel = musicObject.playUrl) != null) {
            uri = urlModel.getUri();
        } else {
            uri = null;
        }
        if (str != null && str.length() != 0) {
            this.LLJL.LIZ.LJIJ(str);
        } else {
            if (uri == null || uri.length() == 0) {
                return false;
            }
            this.LLJL.LIZ.LJZI(uri, C08F1.LIZIZ(uri), null);
        }
        return true;
    }
}

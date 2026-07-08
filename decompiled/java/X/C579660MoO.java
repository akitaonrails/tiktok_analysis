package X;

import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;

/* JADX INFO: renamed from: X.0MoO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579660MoO {
    public final AbstractC19852312lt<AVMusicWaveBean> LIZ;
    public final AbstractC19852312lt<MultiEditVideoStatusRecordData> LIZIZ;
    public final Object LIZJ;

    public final AVMusicWaveBean LIZ() {
        if (this.LIZ.isPresent()) {
            return this.LIZ.get();
        }
        return null;
    }

    public final MultiEditVideoStatusRecordData LIZIZ() {
        if (this.LIZIZ.isPresent()) {
            return this.LIZIZ.get();
        }
        return null;
    }

    public C579660MoO(AbstractC19852312lt<AVMusicWaveBean> abstractC19852312lt, AbstractC19852312lt<MultiEditVideoStatusRecordData> abstractC19852312lt2, Object obj) {
        this.LIZ = abstractC19852312lt;
        this.LIZIZ = abstractC19852312lt2;
        this.LIZJ = obj;
    }
}

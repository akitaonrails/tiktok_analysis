package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0Xho, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855860Xho extends AbstractC855920Xhu {
    public final VideoPublishEditModel LIZJ;
    public final ArrayList<AbstractC855890Xhr> LIZLLL;

    @Override // X.AbstractC855920Xhu
    public final AbstractC855890Xhr LIZ() {
        AbstractC855890Xhr next;
        Iterator<AbstractC855890Xhr> it2 = this.LIZLLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            AbstractC855890Xhr abstractC855890Xhr = next;
            if (C384190F4n.LIZ(this.LIZJ)) {
                if (abstractC855890Xhr.LIZIZ() == C0FPS.LONG_VIDEO.getScene()) {
                    break;
                }
            } else if (abstractC855890Xhr.LIZIZ() == C0FPS.SHORT_VIDEO.getScene()) {
                break;
            }
        }
        return next;
    }

    @Override // X.AbstractC855920Xhu
    public final boolean LJ() {
        AbstractC855890Xhr abstractC855890XhrLIZ = LIZ();
        return abstractC855890XhrLIZ != null && abstractC855890XhrLIZ.LJ();
    }

    @Override // X.AbstractC855920Xhu
    public final VideoPublishEditModel LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC855920Xhu
    public final ArrayList<AbstractC855890Xhr> LIZLLL() {
        return this.LIZLLL;
    }

    public C855860Xho(VideoPublishEditModel videoPublishEditModel, ArrayList<AbstractC855890Xhr> arrayList) {
        super(videoPublishEditModel, arrayList);
        this.LIZJ = videoPublishEditModel;
        this.LIZLLL = arrayList;
    }
}

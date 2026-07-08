package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.ss.android.ugc.aweme.story.celebration.CelebrationRenderedVideo;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.data.CelebrationMaterialData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MLB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MLB {
    public final int LIZ;
    public final CopyOnWriteArrayList<C0E4S> LIZIZ = new CopyOnWriteArrayList<>();
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(341));
    public List<OnThisDayTiktokMediaModel> LIZLLL;
    public List<OnThisDayTiktokMediaModel> LJ;
    public boolean LJFF;
    public CelebrationRenderedVideo LJI;

    public final void LIZLLL() {
        List<ForwardMedia> forwardMediaList;
        synchronized (this) {
            try {
                if (this.LJFF) {
                    return;
                }
                if (LIZIZ().isEmpty()) {
                    C568030MPp c568030MPp = C568030MPp.LIZ;
                    int i = this.LIZ;
                    c568030MPp.getClass();
                    CelebrationMaterialData celebrationMaterialDataLJFF = C568030MPp.LJFF(i, null);
                    if (celebrationMaterialDataLJFF != null && (forwardMediaList = celebrationMaterialDataLJFF.getForwardMediaList()) != null) {
                        for (ForwardMedia forwardMedia : forwardMediaList) {
                            if (C565710MGr.LIZ(forwardMedia, null) != null) {
                                LIZIZ().add(forwardMedia);
                                this.LJFF = true;
                            }
                        }
                    }
                } else {
                    Iterator<ForwardMedia> it2 = LIZIZ().iterator();
                    while (it2.hasNext()) {
                        if (C565710MGr.LIZ(it2.next(), null) != null) {
                            this.LJFF = true;
                        }
                    }
                }
                this.LJI = C568030MPp.LJIIIZ(C568030MPp.LIZ, this.LIZ);
                C554890LpX c554890LpX = C554890LpX.LIZIZ;
                StringBuilder sb = new StringBuilder();
                sb.append("CeleMaterialDataStore, initDataFromKeva, type = ");
                sb.append(this.LIZ);
                sb.append(", forwardMedia size = ");
                sb.append(LIZIZ().size());
                sb.append(", hasRenderVideo = ");
                sb.append(this.LJI != null);
                C201955140j.LIZJ(c554890LpX, sb.toString());
                this.LJFF = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final CopyOnWriteArrayList<ForwardMedia> LIZIZ() {
        return (CopyOnWriteArrayList) this.LIZJ.getValue();
    }

    public final List<ForwardMedia> LIZJ() {
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getForwardMedias, type = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", size = ");
        sbLIZ.append(LIZIZ().size());
        C201955140j.LIZLLL(c554890LpX, "CeleMaterialDataStore", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LJFF) {
            LIZLLL();
        }
        return Collections.synchronizedList(LIZIZ());
    }

    public final List<ForwardMedia> LJ() {
        if (this.LJFF) {
            this.LIZIZ.clear();
            ArrayList arrayList = new ArrayList();
            for (ForwardMedia forwardMedia : LIZIZ()) {
                if (C565710MGr.LIZ(forwardMedia, null) != null) {
                    this.LJFF = true;
                } else {
                    arrayList.add(forwardMedia);
                }
            }
            LIZIZ().removeAll(arrayList);
        } else {
            LIZLLL();
        }
        return LIZIZ();
    }

    public C0MLB(int i) {
        this.LIZ = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel> r23) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MLB.LIZ(java.util.List):boolean");
    }
}

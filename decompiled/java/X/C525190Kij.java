package X;

import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0Kij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525190Kij {
    public final Set<WeakReference<InterfaceC523480Kfy>> LIZ = new LinkedHashSet();

    public final void LIZIZ(InterfaceC523480Kfy interfaceC523480Kfy) {
        int size = this.LIZ.size();
        C19719612Di.LJJIII(this.LIZ, AFwS239S0000000_8.get$arr$(337), true);
        if (size != this.LIZ.size()) {
            C1450080nq2 c1450080nq2 = C1450080nq2.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[LivePhotoSync] cleanupStaleReferences: removed ");
            sbLIZ.append(size - this.LIZ.size());
            sbLIZ.append(" stale refs");
            C201955140j.LIZLLL(c1450080nq2, "livephoto", C2188811AlT.LIZIZ(sbLIZ));
        }
        Set<WeakReference<InterfaceC523480Kfy>> set = this.LIZ;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<WeakReference<InterfaceC523480Kfy>> it2 = set.iterator();
            while (it2.hasNext()) {
                if (it2.next().get() == interfaceC523480Kfy) {
                    return;
                }
            }
        }
        this.LIZ.add(new WeakReference<>(interfaceC523480Kfy));
        C201955140j.LIZLLL(C1450080nq2.LIZIZ, "livephoto", "[LivePhotoSync] register: " + interfaceC523480Kfy.getClass().getSimpleName() + ", totalCount=" + this.LIZ.size());
    }

    public final void LIZ(TikTokMediaModel tikTokMediaModel, C529740Kq4 c529740Kq4) {
        String livePhotoPreviewMode;
        String simpleName;
        if (!tikTokMediaModel.LJIIJJI()) {
            return;
        }
        LivePhotoInfo livePhotoInfo = tikTokMediaModel.livePhotoInfo;
        C1450080nq2 c1450080nq2 = C1450080nq2.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[LivePhotoSync] onLivePhotoStateChanged: mediaId=");
        sbLIZ.append(((MediaModel) tikTokMediaModel).id);
        sbLIZ.append(", mode=");
        Boolean boolValueOf = null;
        if (livePhotoInfo != null) {
            livePhotoPreviewMode = livePhotoInfo.getLivePhotoPreviewMode();
        } else {
            livePhotoPreviewMode = null;
        }
        sbLIZ.append(livePhotoPreviewMode);
        sbLIZ.append(", hasUserClicked=");
        if (livePhotoInfo != null) {
            boolValueOf = Boolean.valueOf(livePhotoInfo.getHasUserClickedIcon());
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", source=");
        if (c529740Kq4 != null) {
            simpleName = C529740Kq4.class.getSimpleName();
        } else {
            simpleName = "null";
        }
        sbLIZ.append(simpleName);
        sbLIZ.append(", targetCount=");
        sbLIZ.append(this.LIZ.size());
        C201955140j.LIZLLL(c1450080nq2, "livephoto", C2188811AlT.LIZIZ(sbLIZ));
        Iterator<WeakReference<InterfaceC523480Kfy>> it2 = this.LIZ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            InterfaceC523480Kfy interfaceC523480Kfy = it2.next().get();
            if (interfaceC523480Kfy != null && interfaceC523480Kfy != c529740Kq4) {
                interfaceC523480Kfy.LLJLL(tikTokMediaModel);
                i++;
            }
        }
        C1450080nq2 c1450080nq22 = C1450080nq2.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[LivePhotoSync] synced to ");
        sbLIZ2.append(i);
        sbLIZ2.append(" targets");
        C201955140j.LIZLLL(c1450080nq22, "livephoto", C2188811AlT.LIZIZ(sbLIZ2));
    }
}

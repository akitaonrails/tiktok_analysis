package X;

import android.view.View;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0Kgg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523920Kgg implements InterfaceC529920KqM {
    public final Set<String> LIZ = new LinkedHashSet();

    @Override // X.InterfaceC529920KqM
    public final void LIZ(int i, View view, TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel != null) {
            this.LIZ.add(((MediaModel) tikTokMediaModel).id);
        }
    }
}

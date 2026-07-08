package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokGroupSceneFragment;
import java.util.UUID;

/* JADX INFO: renamed from: X.11As, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19458011As extends C19A3 {
    public final String LLJILLL;
    public TikTokGroupSceneFragment LLJJ;

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public AbstractC19458011As() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TikTokGroupScene#");
        sbLIZ.append(getClass().getName());
        sbLIZ.append('#');
        sbLIZ.append(UUID.randomUUID());
        this.LLJILLL = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.bytedance.scene.Scene
    public void onDestroyView() {
        super.onDestroyView();
        TikTokGroupSceneFragment tikTokGroupSceneFragment = this.LLJJ;
        if (tikTokGroupSceneFragment != null) {
            C19EH c19ehLJIIJ = C20622515mp.LJIILLIIL(this).LJIIJ();
            c19ehLJIIJ.LJIIZILJ(tikTokGroupSceneFragment);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}

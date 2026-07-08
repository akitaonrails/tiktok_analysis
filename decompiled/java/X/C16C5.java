package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import java.util.List;

/* JADX INFO: renamed from: X.16C5, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C16C5 extends C19A3 {
    public final int LLJILLL = 4;
    public C16CD LLJJ;
    public RecyclerView LLJJI;
    public C16CH LLJJIII;
    public ViewGroup LLJJIJI;
    public View LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public List<C16CI> LLJJJ;

    public abstract void LLLLIIIILLL(List<TikTokMediaModel> list, boolean z);

    public abstract void LLLLIILL();

    @Override // com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!this.LLJJIJIL) {
            this.LLJJIJIL = true;
            LLLLIILL();
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}

package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.11Ui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19509011Ui extends C19A3 {
    public ViewGroup LLJILLL;
    public LayoutInflater LLJJ;
    public Context LLJJI;
    public int LLJJIII = -1;
    public int LLJJIJI = -1;

    public abstract ViewGroup LLLLIIIILLL();

    @Override // com.bytedance.scene.Scene
    public final LayoutInflater LLJJJJJIL() {
        if (this.mActivity == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Scene is attached to the Activity.");
        }
        LayoutInflater layoutInflater = this.LLJJ;
        return layoutInflater != null ? layoutInflater : super.LLJJJJJIL();
    }

    @Override // com.bytedance.scene.Scene
    public final Context onGetSceneContext() {
        Context context = this.LLJJI;
        return context != null ? context : super.onGetSceneContext();
    }

    @Override // com.bytedance.scene.Scene
    public final void onAttach() {
        super.onAttach();
        int i = this.LLJJIII;
        if (i == -1 && this.LLJJIJI == -1) {
            return;
        }
        if (i == requireActivity().hashCode() && this.LLJJIJI == requireActivity().getTheme().hashCode()) {
            return;
        }
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJJIII = requireActivity().hashCode();
        this.LLJJIJI = requireActivity().getTheme().hashCode();
        this.LLJJ = getLayoutInflater();
        this.LLJJI = requireSceneContext();
        this.LLJILLL = (ViewGroup) this.mView;
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = this.LLJILLL;
        if (viewGroup2 != null && viewGroup2.getParent() != null) {
            throw new IllegalArgumentException("ReuseGroupScene reuseView already have parent");
        }
        ViewGroup viewGroup3 = this.LLJILLL;
        if (viewGroup3 != null) {
            return viewGroup3;
        }
        return LLLLIIIILLL();
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}

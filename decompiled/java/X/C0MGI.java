package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MGI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MGI extends C19A3 {
    public final AIPortraitEnterParams LLJILLL;

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        Unit unit;
        try {
            FragmentManager fragmentManagerLJIILLIIL = C20622515mp.LJIILLIIL(this);
            Fragment fragmentLJJJJZI = fragmentManagerLJIILLIIL.LJJJJZI("aiPortraitTabFragmentEditorTabTag");
            if (fragmentLJJJJZI != null) {
                C19EH c19ehLJIIJ = fragmentManagerLJIILLIIL.LJIIJ();
                c19ehLJIIJ.LJIIZILJ(fragmentLJJJJZI);
                c19ehLJIIJ.LJIIL();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        super.onDestroyView();
    }

    public C0MGI(AIPortraitEnterParams aIPortraitEnterParams) {
        this.LLJILLL = aIPortraitEnterParams;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.gu2).setPadding(0, ScreenUtils.getStatusBarHeight(this.mActivity), 0, 0);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.emq, viewGroup, false);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}

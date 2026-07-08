package X;

import com.bytedance.android.live.effect.navi.NaviAvatarListViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;

/* JADX INFO: renamed from: X.0U90, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U90 implements C0U45 {
    public final /* synthetic */ NaviAvatarListViewModel LIZ;

    @Override // X.C0U45
    public final void LIZIZ(LiveEffect liveEffect, int i, long j) {
    }

    @Override // X.C0U45
    public final void LIZJ(LiveEffect liveEffect) {
    }

    public C0U90(NaviAvatarListViewModel naviAvatarListViewModel) {
        this.LIZ = naviAvatarListViewModel;
    }

    @Override // X.C0U45
    public final void LIZ(LiveEffect liveEffect) {
        String name;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download navi effect success, effectname: ");
        if (liveEffect != null) {
            name = liveEffect.getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        C20441214yg.LJIIIZ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ));
        if (liveEffect != null) {
            NaviAvatarListViewModel naviAvatarListViewModel = this.LIZ;
            String name2 = liveEffect.getName();
            if (name2 == null) {
                name2 = "";
            }
            naviAvatarListViewModel.xQ2(new C0U92(liveEffect.LIZJ, name2));
        }
    }

    @Override // X.C0U45
    public final void LJ(LiveEffect liveEffect, ExceptionResult exceptionResult) {
        String name;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cannot download navi effect, effectname: ");
        if (liveEffect != null) {
            name = liveEffect.getName();
        } else {
            name = null;
        }
        sbLIZ.append(name);
        C20441214yg.LJFF("LiveNaviAvatar", "download navi effect error", new Exception(C2188811AlT.LIZIZ(sbLIZ)));
        if (liveEffect != null) {
            NaviAvatarListViewModel naviAvatarListViewModel = this.LIZ;
            String name2 = liveEffect.getName();
            if (name2 == null) {
                name2 = "";
            }
            naviAvatarListViewModel.xQ2(new C0U92(liveEffect.LIZJ, name2));
        }
    }
}

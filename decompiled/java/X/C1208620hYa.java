package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistFragmentAssem;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistRemoveFeedsFragmentAssem;
import com.ss.android.ugc.aweme.mix.manageplaylist.ManagePlaylistFragmentAssem;
import com.ss.android.ugc.aweme.poi.quiz.data.PoiQuizConfigModel;
import com.ss.android.ugc.aweme.poi.quiz.data.RetainBtnInfo;
import com.ss.android.ugc.aweme.poi.quiz.fragment.PoiQuizFragment;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: renamed from: X.0hYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208620hYa extends AbstractC2173821A5s {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC2173821A5s
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            case 2:
                LIZIZ$2(this);
                break;
            case 3:
                LIZIZ$3(this);
                break;
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C1208620hYa c1208620hYa) {
        ((EditPlaylistFragmentAssem) c1208620hYa.l0).Jo().vQ2();
    }

    public static final void LIZIZ$1(C1208620hYa c1208620hYa) {
        EditPlaylistRemoveFeedsFragmentAssem editPlaylistRemoveFeedsFragmentAssem = (EditPlaylistRemoveFeedsFragmentAssem) c1208620hYa.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = EditPlaylistRemoveFeedsFragmentAssem.LLJILJILJ;
        editPlaylistRemoveFeedsFragmentAssem.Lo(false);
    }

    public static final void LIZIZ$2(C1208620hYa c1208620hYa) {
        ((ManagePlaylistFragmentAssem) c1208620hYa.l0).Jo().vQ2();
    }

    public static final void LIZIZ$3(C1208620hYa c1208620hYa) {
        RetainBtnInfo retainBtnInfo;
        C1182900gt6 c1182900gt6 = C1182900gt6.LIZ;
        c1182900gt6.getClass();
        c1182900gt6.LIZJ("poi_quiz_retain_dialog", AFwS256S0000000_18.get$arr$(993));
        final PoiQuizFragment poiQuizFragment = (PoiQuizFragment) c1208620hYa.l0;
        InterfaceC20660615sy interfaceC20660615sy = new InterfaceC20660615sy() { // from class: X.0gy4
            @Override // X.InterfaceC20658015sY
            public final boolean Xu() {
                return poiQuizFragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
            }

            @Override // X.InterfaceC20658015sY
            public final C688120Qyw i2() {
                Context context = poiQuizFragment.getContext();
                if (context != null) {
                    return new C688120Qyw(context, poiQuizFragment, null);
                }
                return null;
            }

            @Override // X.InterfaceC20658015sY
            public final String getSceneId() {
                return C634060Otw.LIZ(this);
            }

            @Override // X.InterfaceC20660615sy
            public final boolean t2() {
                return C0BMW.LIZ();
            }
        };
        C19EG activity = poiQuizFragment.getActivity();
        PoiQuizConfigModel poiQuizConfigModel = ((PoiQuizFragment) c1208620hYa.l0).SR().LLJ;
        if (poiQuizConfigModel != null) {
            retainBtnInfo = poiQuizConfigModel.retainButtonInfo;
        } else {
            retainBtnInfo = null;
        }
        PopupManager.LJIIZILJ(new C1189270h3N(interfaceC20660615sy, activity, retainBtnInfo), new C1668306g5("ls_poi_quiz_retain_dialog"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1208620hYa(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }
}

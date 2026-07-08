package X;

import Y.ARunnableS110S0100000_10;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchRootFragment;
import java.util.LinkedList;
import kotlin.jvm.internal.AwS254S0300000_10;

/* JADX INFO: renamed from: X.0Qwt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C686850Qwt extends C686870Qwv {
    public final C19EG LJ;
    public final SearchRootFragment LJFF;

    @Override // X.C686870Qwv, X.C0QTN
    public final View LIZIZ(int i) {
        Context sceneContext;
        SAFFragmentRootScene sAFFragmentRootSceneIb;
        SearchRootFragment searchRootFragment = this.LJFF;
        if (searchRootFragment != null && (sAFFragmentRootSceneIb = searchRootFragment.ib()) != null) {
            sceneContext = sAFFragmentRootSceneIb.getSceneContext();
        } else {
            sceneContext = null;
        }
        SAFHelper.LIZ.getClass();
        if (SAFHelper.LJIIJJI() && sceneContext != null) {
            if (C800870VbJ.LIZ()) {
                LinkedList<View> linkedList = this.LIZIZ.get(Integer.valueOf(i));
                if (linkedList != null) {
                    synchronized (linkedList) {
                        try {
                            View viewPoll = linkedList.poll();
                            if (viewPoll != null) {
                                return viewPoll;
                            }
                            this.LIZIZ.remove(Integer.valueOf(i));
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
                return C20742916Ex.LIZ(sceneContext, i, new FrameLayout(sceneContext), false, -1);
            }
            if (((Boolean) C800870VbJ.LIZIZ.getValue()).booleanValue()) {
                return C20742916Ex.LIZ(sceneContext, i, new FrameLayout(sceneContext), false, -1);
            }
            return C786410Ut5.Td(C786410Ut5.ne(sceneContext), i, new FrameLayout(sceneContext), false);
        }
        return super.LIZIZ(i);
    }

    public C686850Qwt(C19EG c19eg, SearchRootFragment searchRootFragment) {
        super(c19eg);
        this.LJ = c19eg;
        this.LJFF = searchRootFragment;
    }

    @Override // X.C686870Qwv, X.AbstractC686880Qww
    public final void LIZJ(C686940Qx2 c686940Qx2, long j) {
        Context sceneContext;
        SAFFragmentRootScene sAFFragmentRootSceneIb;
        if (!C800870VbJ.LIZ()) {
            return;
        }
        SAFHelper.LIZ.getClass();
        if (SAFHelper.LJIIJJI()) {
            SearchRootFragment searchRootFragment = this.LJFF;
            if (searchRootFragment != null && (sAFFragmentRootSceneIb = searchRootFragment.ib()) != null) {
                sceneContext = sAFFragmentRootSceneIb.getSceneContext();
            } else {
                return;
            }
        } else {
            sceneContext = this.LJ;
        }
        if (sceneContext != null) {
            AwS254S0300000_10 awS254S0300000_10 = new AwS254S0300000_10(this, c686940Qx2, sceneContext, 0);
            if (j > 0) {
                C786410Ut5.LJLIIL(j, C686950Qx3.LIZ, new ARunnableS110S0100000_10(awS254S0300000_10, 3));
            } else {
                C786410Ut5.LJJZZIII(C686950Qx3.LIZ, new ARunnableS110S0100000_10(awS254S0300000_10, 3));
            }
        }
    }
}

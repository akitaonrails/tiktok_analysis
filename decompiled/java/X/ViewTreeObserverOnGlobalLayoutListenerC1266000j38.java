package X;

import android.graphics.Rect;
import android.text.Editable;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Lifecycle;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.publicgroup.assem.groupcreation.GroupCreationFormAssem;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcIntroFragmentV2;
import com.ss.android.ugc.profile.business.ur.editprofile.pronouns.ui.ProfileEditPronounsFragment;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0j38, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1266000j38 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() throws Throwable {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1266000j38 viewTreeObserverOnGlobalLayoutListenerC1266000j38) throws Throwable {
        String string;
        if (((C1749260vca) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l0).getVisibility() == 0 && ((RelationSearchAssem) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.RESUMED)) {
            Rect rect = new Rect();
            ((C1749260vca) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l0).getRootView().getWindowVisibleDisplayFrame(rect);
            int iHeight = rect.height();
            RelationSearchAssem relationSearchAssem = (RelationSearchAssem) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1;
            Integer num = relationSearchAssem.LLJJIII;
            if (num == null) {
                relationSearchAssem.LLJJIII = Integer.valueOf(iHeight);
                return;
            }
            C1749260vca c1749260vca = (C1749260vca) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l0;
            int iIntValue = num.intValue() - iHeight;
            if (Math.abs(iIntValue) > ((double) c1749260vca.getRootView().getHeight()) * 0.15d) {
                if (iIntValue > 0) {
                    if (!relationSearchAssem.LLJJI) {
                        C1247240iYs.LIZ.getClass();
                        if (C1247240iYs.LIZIZ == 0) {
                            C1247240iYs.LIZIZ = System.currentTimeMillis();
                            C1247240iYs.LIZJ = 0;
                            C1247240iYs.LIZLLL = 0;
                        }
                        relationSearchAssem.LLJJI = true;
                    }
                } else if (iIntValue < 0 && relationSearchAssem.LLJJI) {
                    C1247240iYs c1247240iYs = C1247240iYs.LIZ;
                    String enterFrom = relationSearchAssem.Go().getEnterFrom();
                    Editable editableLLLLJI = C2204961BRm.LLLLJI(c1749260vca.getEditTextView(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5voztDmOIvzegUTreHXGGb6uioYevFDEIkKg/mUm2Q4eUHT8RMfDyTWMU=", null));
                    if (editableLLLLJI == null || (string = editableLLLLJI.toString()) == null) {
                        string = "";
                    }
                    c1247240iYs.getClass();
                    if (C1247240iYs.LIZIZ != 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - C1247240iYs.LIZIZ;
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LJFF("enter_from", enterFrom);
                        c2344009Gk.LJFF(Scene.SCENE_SERVICE, "follower_following_list");
                        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                        c2344009Gk.LIZJ(C1247240iYs.LIZJ, "selection_count");
                        c2344009Gk.LIZJ(C1247240iYs.LIZLLL, "query_count");
                        c2344009Gk.LJFF("search_keyword", string);
                        C20684815ws.LJIILLIIL("social_search_session_summary", c2344009Gk.LIZ);
                        C1247240iYs.LIZIZ = 0L;
                    }
                    relationSearchAssem.LLJJI = false;
                }
                relationSearchAssem.LLJJIII = Integer.valueOf(iHeight);
            }
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1266000j38 viewTreeObserverOnGlobalLayoutListenerC1266000j38) {
        C118300cf c118300cf = (C118300cf) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l0;
        int height = ((ProfileAigcIntroFragmentV2) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1).cS().getHeight();
        int height2 = ((ProfileAigcIntroFragmentV2) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1).WR().getHeight();
        if (height < height2) {
            height = height2;
        }
        c118300cf.element = height;
        if (((ProfileAigcIntroFragmentV2) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1).WR().getHeight() < ((C118300cf) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l0).element) {
            ((ProfileAigcIntroFragmentV2) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1).WR().setHeight(((C118300cf) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l0).element);
        }
        C786410Ut5.C3(((ProfileAigcIntroFragmentV2) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1).cS().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1266000j38);
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1266000j38 viewTreeObserverOnGlobalLayoutListenerC1266000j38) {
        C118300cf c118300cf = (C118300cf) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l0;
        int height = ((ProfileAigcIntroFragmentV2) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1).WR().getHeight();
        int height2 = ((ProfileAigcIntroFragmentV2) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1).cS().getHeight();
        if (height < height2) {
            height = height2;
        }
        c118300cf.element = height;
        if (((ProfileAigcIntroFragmentV2) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1).cS().getHeight() < ((C118300cf) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l0).element) {
            ((ProfileAigcIntroFragmentV2) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1).cS().setHeight(((C118300cf) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l0).element);
        }
        C786410Ut5.C3(((ProfileAigcIntroFragmentV2) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1).WR().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1266000j38);
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1266000j38 viewTreeObserverOnGlobalLayoutListenerC1266000j38) {
        ((InterfaceC1233230iCH) C1252710ihh.LIZJ((ProfileEditPronounsFragment) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l0, C13LE.LIZ(InterfaceC1233230iCH.class))).sj(((ProfileEditPronounsFragment) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l0).mS((View) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1));
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC1266000j38 viewTreeObserverOnGlobalLayoutListenerC1266000j38) {
        ViewTreeObserver viewTreeObserver;
        C21578619ce c21578619ceKp = ((GroupCreationFormAssem) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l0).kp();
        if (c21578619ceKp != null && (viewTreeObserver = c21578619ceKp.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1266000j38);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1266000j38, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        ((Function0) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1).invoke();
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC1266000j38 viewTreeObserverOnGlobalLayoutListenerC1266000j38) {
        ((C197039127h) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l0).setWidth(((C197039127h) viewTreeObserverOnGlobalLayoutListenerC1266000j38.l1).getWidth());
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1266000j38(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

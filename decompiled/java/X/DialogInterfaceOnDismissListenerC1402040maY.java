package X;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.friendstab.ui.input.FriendsTextPublishKeyboardFragment;
import com.ss.android.ugc.aweme.friendstab.ui.input.viewmodel.FriendsTextPublishViewModel;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.minis.page.main.fragment.ShareSheetPanelFragment;
import com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponAssem;
import com.ss.android.ugc.aweme.stemfeed.ui.StemFeedPopupObserver;
import com.tts.oecverify.BdTuring;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS259S0000000_21;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0maY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class DialogInterfaceOnDismissListenerC1402040maY implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
            case 5:
                onDismiss$5(this, dialogInterface);
                break;
            case 6:
                onDismiss$6(this, dialogInterface);
                break;
            case 7:
                onDismiss$7(this, dialogInterface);
                break;
            case 8:
                onDismiss$8(this, dialogInterface);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onDismiss$9(this, dialogInterface);
                break;
        }
    }

    public DialogInterfaceOnDismissListenerC1402040maY(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1402040maY dialogInterfaceOnDismissListenerC1402040maY, DialogInterface dialogInterface) {
        InterfaceC1346260l8a interfaceC1346260l8a = ((CommentLongPressFragment) dialogInterfaceOnDismissListenerC1402040maY.l0).LLJILJILJ;
        if (interfaceC1346260l8a != null) {
            interfaceC1346260l8a.onCancel();
        }
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        CommentLongPressFragment commentLongPressFragment = (CommentLongPressFragment) dialogInterfaceOnDismissListenerC1402040maY.l0;
        C1369870lkf.LJ(commentLongPressFragment.LLJJIJIIJIL, commentLongPressFragment.LLJJIJI);
    }

    public static final void onDismiss$1(DialogInterfaceOnDismissListenerC1402040maY dialogInterfaceOnDismissListenerC1402040maY, DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener;
        C1373630lqj c1373630lqj = ((DialogC1372820lpQ) dialogInterfaceOnDismissListenerC1402040maY.l0).LLJILJILJ;
        Dialog dialog = c1373630lqj.LJ;
        if (dialog != null && (onDismissListener = c1373630lqj.LJIJ) != null) {
            onDismissListener.onDismiss(dialog);
        }
        InterfaceC1371520lnK interfaceC1371520lnK = c1373630lqj.LJIIZILJ;
        if (interfaceC1371520lnK != null) {
            interfaceC1371520lnK.dismissDialog();
        }
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC1402040maY dialogInterfaceOnDismissListenerC1402040maY, DialogInterface dialogInterface) {
        ((C1396190mR7) dialogInterfaceOnDismissListenerC1402040maY.l0).LLILZLL = false;
    }

    public static final void onDismiss$3(DialogInterfaceOnDismissListenerC1402040maY dialogInterfaceOnDismissListenerC1402040maY, DialogInterface dialogInterface) {
        C20684815ws.onEventV3("close_first_stem_feed_prompt");
        StemFeedPopupObserver stemFeedPopupObserver = ((C1620550sGz) dialogInterfaceOnDismissListenerC1402040maY.l0).LLILLL;
        if (stemFeedPopupObserver != null) {
            stemFeedPopupObserver.j81();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onDismiss$4(DialogInterfaceOnDismissListenerC1402040maY dialogInterfaceOnDismissListenerC1402040maY, DialogInterface dialogInterface) {
        int i;
        Window window;
        View decorView;
        FriendsTextPublishKeyboardFragment friendsTextPublishKeyboardFragment = (FriendsTextPublishKeyboardFragment) ((C259800zU) dialogInterfaceOnDismissListenerC1402040maY.l0).element;
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(377);
        if (!friendsTextPublishKeyboardFragment.LLJJIII && FriendsTextPublishViewModel.wQ2(friendsTextPublishKeyboardFragment.MR().getState().LL)) {
            C1389910mGz c1389910mGz = new C1389910mGz(friendsTextPublishKeyboardFragment);
            c1389910mGz.LIZ.LIZIZ = 0;
            c1389910mGz.LJIIIZ(2131850121);
            C19EG activity = friendsTextPublishKeyboardFragment.getActivity();
            if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                Rect rect = new Rect();
                decorView.getGlobalVisibleRect(rect);
                int i2 = rect.bottom;
                View viewFindViewById = decorView.findViewById(R.id.content);
                if (viewFindViewById != null) {
                    viewFindViewById.getGlobalVisibleRect(rect);
                }
                i = i2 - rect.bottom;
            } else {
                i = 0;
            }
            c1389910mGz.LIZIZ(((Math.max(i, 0) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C14LC.LJIILIIL)))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - FriendsTextPublishKeyboardFragment.LLJJJJ);
            c1389910mGz.LJ(3000L);
            c1389910mGz.LIZ(true);
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LIZLLL = 3;
            c1360890lWB.LJ = null;
            c1389910mGz.LJI(com.zhiliaoapp.musically.R.style.y0);
            aFwS259S0000000_21.invoke(c1389910mGz);
            c1389910mGz.LJIIJJI();
        }
        if (!friendsTextPublishKeyboardFragment.LLJJIII) {
            FriendsTextPublishViewModel friendsTextPublishViewModelMR = friendsTextPublishKeyboardFragment.MR();
            C23250099c.LIZLLL(friendsTextPublishViewModelMR.LLILLL, null, null, new C1395340mPk(friendsTextPublishViewModelMR, null), 3);
        }
    }

    public static final void onDismiss$5(DialogInterfaceOnDismissListenerC1402040maY dialogInterfaceOnDismissListenerC1402040maY, DialogInterface dialogInterface) {
        ((InterfaceC1346260l8a) dialogInterfaceOnDismissListenerC1402040maY.l0).onCancel();
    }

    public static final void onDismiss$6(DialogInterfaceOnDismissListenerC1402040maY dialogInterfaceOnDismissListenerC1402040maY, DialogInterface dialogInterface) {
        C1391990mKL c1391990mKL = (C1391990mKL) ((MinisCouponAssem) dialogInterfaceOnDismissListenerC1402040maY.l0).LLILZLL.getValue();
        ((MinisCouponAssem) dialogInterfaceOnDismissListenerC1402040maY.l0).getClass();
        c1391990mKL.LIZ(MinisCouponAssem.m269do(5L));
        ((MinisCouponAssem) dialogInterfaceOnDismissListenerC1402040maY.l0).ko(true);
        C11JF c11jf = ((MinisCouponAssem) dialogInterfaceOnDismissListenerC1402040maY.l0).LLILZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        MinisCouponAssem minisCouponAssem = (MinisCouponAssem) dialogInterfaceOnDismissListenerC1402040maY.l0;
        minisCouponAssem.LLILZ = null;
        minisCouponAssem.LLILZIL = null;
    }

    public static final void onDismiss$7(DialogInterfaceOnDismissListenerC1402040maY dialogInterfaceOnDismissListenerC1402040maY, DialogInterface dialogInterface) {
        C19EG c19eg;
        AbstractDialogInterfaceC1397690mTX abstractDialogInterfaceC1397690mTX = (AbstractDialogInterfaceC1397690mTX) dialogInterfaceOnDismissListenerC1402040maY.l0;
        DialogInterface.OnDismissListener onDismissListener = abstractDialogInterfaceC1397690mTX.LLILZ;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(abstractDialogInterfaceC1397690mTX);
        }
        Activity activityLIZ = C1388190mED.LIZ(((AbstractDialogInterfaceC1397690mTX) dialogInterfaceOnDismissListenerC1402040maY.l0).LLILLJJLI);
        if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null) {
            C1766560w4U.LIZ(c19eg, ((AbstractDialogInterfaceC1397690mTX) dialogInterfaceOnDismissListenerC1402040maY.l0).LIZJ());
        }
    }

    public static final void onDismiss$8(DialogInterfaceOnDismissListenerC1402040maY dialogInterfaceOnDismissListenerC1402040maY, DialogInterface dialogInterface) {
        Context context;
        LifecycleOwner lifecycleOwnerLIZIZ;
        SharePanelViewModel sharePanelViewModel;
        InterfaceC1364970lcl interfaceC1364970lcl;
        WeakReference<InterfaceC1364970lcl> weakReference = ViewOnTouchListenerC1364750lcP.LLJILJILJ;
        if (weakReference != null && (interfaceC1364970lcl = weakReference.get()) != null) {
            interfaceC1364970lcl.onDismiss();
        }
        ViewOnTouchListenerC1364760lcQ viewOnTouchListenerC1364760lcQ = (ViewOnTouchListenerC1364760lcQ) dialogInterfaceOnDismissListenerC1402040maY.l0;
        if (C1388190mED.LIZIZ(viewOnTouchListenerC1364760lcQ.LLILZLL) != null) {
            C487280J9a.LIZJ(viewOnTouchListenerC1364760lcQ);
        }
        if (C1865840yec.LIZ()) {
            ViewOnTouchListenerC1364750lcP.LL.getClass();
            ViewOnTouchListenerC1364760lcQ viewOnTouchListenerC1364760lcQ2 = ViewOnTouchListenerC1364750lcP.LLILLJJLI;
            if (viewOnTouchListenerC1364760lcQ2 != null && (context = viewOnTouchListenerC1364760lcQ2.getContext()) != null && (lifecycleOwnerLIZIZ = C0SY5.LIZIZ(context)) != null && (sharePanelViewModel = ViewOnTouchListenerC1364750lcP.LLILLL) != null) {
                sharePanelViewModel.onDestroy(lifecycleOwnerLIZIZ);
            }
            ViewOnTouchListenerC1364760lcQ viewOnTouchListenerC1364760lcQ3 = ViewOnTouchListenerC1364750lcP.LLILLJJLI;
            if (viewOnTouchListenerC1364760lcQ3 != null && C1388190mED.LIZIZ(viewOnTouchListenerC1364760lcQ3.LLILZLL) != null) {
                C487280J9a.LIZJ(viewOnTouchListenerC1364760lcQ3);
            }
            ViewOnTouchListenerC1364750lcP.LLILLJJLI = null;
            ViewOnTouchListenerC1364750lcP.LLILLL = null;
            ViewOnTouchListenerC1364750lcP.LLILZ = null;
            ViewOnTouchListenerC1364750lcP.LLILZIL = null;
            ViewOnTouchListenerC1364750lcP.LLILZLL = null;
            ViewOnTouchListenerC1364750lcP.LLJILLL = false;
            ViewOnTouchListenerC1364750lcP.LLJJ = -1L;
            AnonymousClass0956 anonymousClass0956 = ViewOnTouchListenerC1364750lcP.LLIZLLLIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
        }
    }

    public static final void onDismiss$9(DialogInterfaceOnDismissListenerC1402040maY dialogInterfaceOnDismissListenerC1402040maY, DialogInterface dialogInterface) {
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        ShareSheetPanelFragment shareSheetPanelFragment = (ShareSheetPanelFragment) dialogInterfaceOnDismissListenerC1402040maY.l0;
        C1369870lkf.LJ(shareSheetPanelFragment.LLJIJIL, shareSheetPanelFragment.LLJI);
    }
}

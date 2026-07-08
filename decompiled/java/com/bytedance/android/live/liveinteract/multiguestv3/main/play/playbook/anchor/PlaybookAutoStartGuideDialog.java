package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor;

import X.C098200Yq;
import X.C1143680frq;
import X.C1324720kZq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915190ZvJ;
import X.C960203pA;
import X.C978360bZC;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookAutoStartGuideDialog extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZz8/KTxiOSMyMScjJiR9KSsvISAhZhUgKDYxJyonCDonJxY4KD0nDzAlLSoXISQgJig=";
    public Playbook LL;
    public Function0<Unit> LLILLJJLI;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Window window2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window2 = dialog.getWindow()) != null) {
            window2.setGravity(80);
            int iLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
            window2.setBackgroundDrawable(new InsetDrawable((Drawable) new ColorDrawable(0), iLIZIZ, 0, iLIZIZ, 0));
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            attributes.y = (int) C497740JfY.LIZIZ(16.0f);
            window2.setAttributes(attributes);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Function0<Unit> function0 = this.LLILLJJLI;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        Boolean boolValueOf;
        String str;
        super.onViewCreated(view, bundle);
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        Playbook playbook = this.LL;
        if (playbook != null) {
            j = playbook.playbookId;
        } else {
            j = 0;
        }
        C978360bZC.LJJIII(j, "show", "");
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.14vP
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long j2;
                C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                Playbook playbook2 = this.LL.LL;
                if (playbook2 != null) {
                    j2 = playbook2.playbookId;
                } else {
                    j2 = 0;
                }
                C978360bZC.LJJIII(j2, "click", "got_it");
                this.LL.dismiss();
            }
        }, view.findViewById(R.id.qos));
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.14vO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long j2;
                C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                Playbook playbook2 = this.LL.LL;
                if (playbook2 != null) {
                    j2 = playbook2.playbookId;
                } else {
                    j2 = 0;
                }
                C978360bZC.LJJIII(j2, "click", "close");
                this.LL.dismiss();
            }
        }, view.findViewById(R.id.qot));
        C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.qov);
        Context context = getContext();
        if (context != null) {
            boolValueOf = Boolean.valueOf(C960203pA.LIZIZ(context));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            str = "playbook_auto_guide_dark.png";
        } else {
            str = "playbook_auto_guide_light.png";
        }
        C1143680frq.LIZLLL(c1324720kZq, "tiktok_live_interaction_normal_4", str);
        if (C497740JfY.LJJ()) {
            C786410Ut5.Yb(c1324720kZq, -1.0f);
        } else {
            C786410Ut5.Yb(c1324720kZq, 1.0f);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.bmu, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}

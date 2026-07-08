package com.bytedance.android.live.liveinteract.multiguestv3.main.common;

import X.C2021507vx;
import X.C492400JSs;
import X.C500260Jjc;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class DialogManager {
    public final Map<String, List<DialogFragment>> LIZ = new LinkedHashMap();

    public DialogManager(Lifecycle lifecycle) {
        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.common.DialogManager.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (C2021507vx.LIZ[event.ordinal()] == 1) {
                    for (Map.Entry entry : ((LinkedHashMap) DialogManager.this.LIZ).entrySet()) {
                        for (DialogFragment dialogFragment : (Iterable) entry.getValue()) {
                            if (dialogFragment.isAdded()) {
                                dialogFragment.dismissAllowingStateLoss();
                            }
                        }
                        ((List) entry.getValue()).clear();
                    }
                }
            }
        });
    }

    public static void LIZ(DialogManager dialogManager, AbsAigcBottomDialog absAigcBottomDialog, String str, FragmentManager fragmentManager) {
        Boolean boolValueOf;
        List list = (List) ((LinkedHashMap) dialogManager.LIZ).get(str);
        if (list != null) {
            boolValueOf = Boolean.valueOf(list.contains(absAigcBottomDialog));
        } else {
            boolValueOf = null;
        }
        if (!C500260Jjc.LJJJI(boolValueOf)) {
            absAigcBottomDialog.getLifecycle().addObserver(new DialogManager$showDialog$1(dialogManager, str, absAigcBottomDialog));
            List<DialogFragment> arrayList = (List) ((LinkedHashMap) dialogManager.LIZ).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(absAigcBottomDialog);
            try {
                C492400JSs.LIZ(absAigcBottomDialog, fragmentManager, str);
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                List list2 = (List) ((LinkedHashMap) dialogManager.LIZ).get(str);
                if (list2 != null) {
                    list2.remove(absAigcBottomDialog);
                }
            }
            dialogManager.LIZ.put(str, arrayList);
        }
    }
}

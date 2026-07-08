package com.bytedance.android.live.liveinteract.multiguestv3.main.common;

import X.C356901a3;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog;
import com.bytedance.android.livesdk.LiveDialogFragment;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class DialogManager$showDialog$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ DialogManager LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ LiveDialogFragment LLILLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
        DialogManager dialogManager = this.LL;
        String str = this.LLILLJJLI;
        LiveDialogFragment liveDialogFragment = this.LLILLL;
        List list = (List) ((LinkedHashMap) dialogManager.LIZ).get(str);
        if (list != null) {
            list.remove(liveDialogFragment);
        }
        this.LLILLL.getLifecycle().removeObserver(this);
    }

    public DialogManager$showDialog$1(DialogManager dialogManager, String str, AbsAigcBottomDialog absAigcBottomDialog) {
        this.LL = dialogManager;
        this.LLILLJJLI = str;
        this.LLILLL = absAigcBottomDialog;
    }
}

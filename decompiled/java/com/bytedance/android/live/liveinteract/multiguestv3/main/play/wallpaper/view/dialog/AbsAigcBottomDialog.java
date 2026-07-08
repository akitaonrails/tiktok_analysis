package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog;

import X.C786410Ut5;
import Y.ACListenerS150S0100000_15;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.anchor.AigcWallpaperManageDialog;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes16.dex */
public abstract class AbsAigcBottomDialog extends LiveDialogFragment {
    public final boolean LL;

    public AbsAigcBottomDialog() {
        this(false);
    }

    public abstract void MR();

    public abstract void NR(View view);

    public abstract int getLayoutId();

    public abstract void initData();

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public boolean onBackPressed() {
        return !(this instanceof AigcWallpaperManageDialog);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C500980Jkm createParams() {
        /*
            r4 = this;
            android.content.Context r0 = r4.getContext()
            if (r0 == 0) goto L48
            int r3 = X.C465640INu.LIZIZ(r0)
        La:
            X.0Jkm r2 = new X.0Jkm
            int r0 = r4.getLayoutId()
            r2.<init>(r0)
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r4.dataChannel
            if (r1 == 0) goto L44
            java.lang.Class<X.0TZM> r0 = X.C0TZM.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L44
            boolean r1 = r0.booleanValue()
            if (r1 != 0) goto L45
            r0 = 8388629(0x800015, float:1.1754973E-38)
        L2a:
            r2.LJII = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.LJI = r0
            if (r1 == 0) goto L42
            r0 = -1
        L33:
            r2.LJIIIZ = r0
            if (r1 == 0) goto L38
            r3 = -1
        L38:
            r2.LJIIJ = r3
            if (r1 == 0) goto L4a
            r0 = 2131887795(0x7f1206b3, float:1.9410207E38)
            r2.LIZJ = r0
            return r2
        L42:
            r0 = r3
            goto L33
        L44:
            r1 = 1
        L45:
            r0 = 80
            goto L2a
        L48:
            r3 = 0
            goto La
        L4a:
            r0 = 2131887796(0x7f1206b4, float:1.941021E38)
            r2.LIZJ = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog.createParams():X.0Jkm");
    }

    public AbsAigcBottomDialog(boolean z) {
        this.LL = z;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.yg_);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS150S0100000_15(this, 87), viewFindViewById);
        }
        NR(view);
        MR();
        initData();
        setCancelable(false);
    }
}

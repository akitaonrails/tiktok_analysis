package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog;

import X.C16FS;
import X.C786410Ut5;
import Y.ACListenerS150S0100000_15;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes16.dex */
public final class AigcWallpaperInfoDialog extends AbsAigcBottomDialog {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+HELIOSKSwiZz8/KTxiPi4/JDUtOSohZjMlLDh9LCwtJSA0ZgQlLiwEKSkgOS4jLTcFJyk8DCwtJSA0";

    public AigcWallpaperInfoDialog() {
        super(true);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void MR() {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final int getLayoutId() {
        return R.layout.hbz;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void initData() {
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.AbsAigcBottomDialog
    public final void NR(View view) {
        C786410Ut5.h8((C16FS) view.findViewById(R.id.at4), new ACListenerS150S0100000_15(this, 88));
    }
}

package com.bytedance.android.live.rank.impl.sticker.classrank;

import X.C1091250eVH;
import X.C1119420fEi;
import X.C1846990yAD;
import X.C1847000yAE;
import X.C1847140yAS;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class ClassRankStickerWidget extends LiveWidget {
    public C1847140yAS LL;
    public C1847000yAE LLILLJJLI;
    public C1846990yAD LLILLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.g37;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LL = new C1847140yAS((C1091250eVH) this.contentView);
        this.LLILLJJLI = new C1847000yAE((C1091250eVH) this.contentView, RankTypeV2.LJIL);
        this.LLILLL = new C1846990yAD(this.contentView, true);
        C1119420fEi c1119420fEi = (C1119420fEi) this.dataChannel.gg0(ClassRankStickerModel.class);
        if (c1119420fEi != null) {
            C1847140yAS c1847140yAS = this.LL;
            if (c1847140yAS != null) {
                c1847140yAS.LIZIZ(c1119420fEi);
            }
            C1847000yAE c1847000yAE = this.LLILLJJLI;
            if (c1847000yAE != null) {
                c1847000yAE.LIZIZ(c1119420fEi);
            }
            C1846990yAD c1846990yAD = this.LLILLL;
            if (c1846990yAD != null) {
                c1846990yAD.LIZIZ(c1119420fEi);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C1846990yAD c1846990yAD = this.LLILLL;
        if (c1846990yAD != null) {
            c1846990yAD.onDestroy();
        }
    }
}

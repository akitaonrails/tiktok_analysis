package com.bytedance.android.live.rank.impl.sticker.team;

import X.C1091250eVH;
import X.C1119420fEi;
import X.C1119430fEj;
import X.C1846650y9f;
import X.C1846660y9g;
import X.C1846680y9i;
import X.C1846690y9j;
import X.C1847180yAW;
import X.C500260Jjc;
import X.InterfaceC1846720y9m;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.rank.TeamRankStickerSetting;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class TeamRankStickerWidget extends LiveWidget {
    public InterfaceC1846720y9m<C1119420fEi> LL;
    public C1846650y9f LLILLJJLI;
    public InterfaceC1846720y9m<C1119430fEj> LLILLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hq6;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        if (TeamRankStickerSetting.INSTANCE.getUseNewStyle()) {
            C500260Jjc.LJIILIIL(findViewById(R.id.c8r));
            C500260Jjc.LLFFF(findViewById(R.id.squ));
            this.LL = new C1847180yAW((C1091250eVH) this.contentView);
            this.LLILLL = new C1846690y9j((C1091250eVH) this.contentView, true);
        } else {
            C500260Jjc.LLFFF(findViewById(R.id.c8r));
            C500260Jjc.LJIILIIL(findViewById(R.id.squ));
            this.LL = new C1846660y9g((C1091250eVH) this.contentView);
            this.LLILLL = new C1846680y9i((C1091250eVH) this.contentView, true);
        }
        this.LLILLJJLI = new C1846650y9f((C1091250eVH) this.contentView);
        C1119420fEi c1119420fEi = (C1119420fEi) this.dataChannel.gg0(TeamRankStickerModelChannel.class);
        if (c1119420fEi != null) {
            InterfaceC1846720y9m<C1119420fEi> interfaceC1846720y9m = this.LL;
            if (interfaceC1846720y9m != null) {
                interfaceC1846720y9m.LIZIZ(c1119420fEi);
            }
            C1846650y9f c1846650y9f = this.LLILLJJLI;
            if (c1846650y9f != null) {
                c1846650y9f.LIZJ();
            }
            InterfaceC1846720y9m<C1119430fEj> interfaceC1846720y9m2 = this.LLILLL;
            if (interfaceC1846720y9m2 != null) {
                interfaceC1846720y9m2.LIZIZ(c1119420fEi);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC1846720y9m<C1119430fEj> interfaceC1846720y9m = this.LLILLL;
        if (interfaceC1846720y9m != null) {
            interfaceC1846720y9m.onDestroy();
        }
    }
}

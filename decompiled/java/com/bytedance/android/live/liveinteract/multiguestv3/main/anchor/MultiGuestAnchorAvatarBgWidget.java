package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor;

import X.AbstractC1320710kTN;
import X.C09JN;
import X.C1121670fIL;
import X.C11JF;
import X.C1291830jin;
import X.C1320810kTX;
import X.C1322200kVm;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1325700kbQ;
import X.C16F5;
import X.C1701940uOG;
import X.C1819620xS4;
import X.C19490011Na;
import X.C786410Ut5;
import X.C930940aKi;
import X.InterfaceC944150ag1;
import Y.AfS176S0100000_7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiGuestAnchorAvatarBgWidget extends LiveWidget implements InterfaceC944150ag1 {
    public C1324720kZq LL;
    public C1324720kZq LLILLJJLI;
    public C16F5 LLILLL;
    public C11JF LLILZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hes;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [REQUEST, X.0kbR] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C1324720kZq c1324720kZq;
        List urls;
        User owner;
        super.onCreate();
        this.LL = (C1324720kZq) findViewById(R.id.pn1);
        this.LLILLJJLI = (C1324720kZq) findViewById(R.id.pn4);
        C16F5 c16f5 = (C16F5) findViewById(R.id.zfm);
        this.LLILLL = c16f5;
        if (c16f5 == null) {
            c16f5 = null;
        }
        C786410Ut5.LLJJJJ(c16f5, 0);
        this.LLILZ = (C11JF) C19490011Na.LIZ(0L, 1L, TimeUnit.SECONDS).LJLIIL(6L).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS176S0100000_7(this, 128), new C09JN() { // from class: X.00L1
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("MultiGuestAnchorAvatarBgWidget@b983.startCountdown$2");
                C1C7U.LIZIZ("MultiGuestAnchorAvatarBgWidget@b983.startCountdown$2");
            }
        });
        C1324720kZq c1324720kZq2 = this.LL;
        if (c1324720kZq2 == null) {
            c1324720kZq2 = null;
        }
        C786410Ut5.LLJJIII(c1324720kZq2, 0);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        ImageModel avatarThumb = (room == null || (owner = room.getOwner()) == null) ? null : owner.getAvatarThumb();
        C1324720kZq c1324720kZq3 = this.LL;
        if (c1324720kZq3 == null) {
            c1324720kZq = null;
            c1324720kZq3 = null;
        } else {
            c1324720kZq = c1324720kZq3;
        }
        int width = c1324720kZq3.getWidth();
        C1324720kZq c1324720kZq4 = this.LL;
        if (c1324720kZq4 == null) {
            c1324720kZq4 = null;
        }
        C1121670fIL.LJIILIIL(c1324720kZq, avatarThumb, width, c1324720kZq4.getHeight(), R.drawable.el_);
        C1324720kZq c1324720kZq5 = this.LLILLJJLI;
        if (c1324720kZq5 == null) {
            c1324720kZq5 = null;
        }
        C786410Ut5.LLJJIII(c1324720kZq5, 0);
        C1291830jin c1291830jin = new C1291830jin(0.74698794f);
        if (avatarThumb == null || (urls = avatarThumb.getUrls()) == null || urls.size() != 0) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(avatarThumb);
            c1324610kZfLJIIIZ.LJJIIZI(0.74698794f);
            C1324720kZq c1324720kZq6 = this.LLILLJJLI;
            c1324610kZfLJIIIZ.LJJI(c1324720kZq6 != null ? c1324720kZq6 : null);
            return;
        }
        C1325700kbQ c1325700kbQLIZJ = C1325700kbQ.LIZJ(R.drawable.el_);
        c1325700kbQLIZJ.LJIILIIL = c1291830jin;
        ?? LIZ = c1325700kbQLIZJ.LIZ();
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LIZLLL = LIZ;
        C1324720kZq c1324720kZq7 = this.LLILLJJLI;
        if (c1324720kZq7 == null) {
            c1324720kZq7 = null;
        }
        c1320810kTXLIZJ.LJIILJJIL = c1324720kZq7.getController();
        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        C1324720kZq c1324720kZq8 = this.LLILLJJLI;
        (c1324720kZq8 != null ? c1324720kZq8 : null).setController(abstractC1320710kTNLIZ);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C11JF c11jf = this.LLILZ;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }
}

package com.bytedance.android.live.publicscreen.impl.widget;

import X.AbstractC1110800f0o;
import X.AbstractC1111600f26;
import X.AbstractC1111810f2R;
import X.AbstractC1136060ffY;
import X.C01GW;
import X.C0IJ7;
import X.C1109770ez9;
import X.C1111050f1D;
import X.C1111930f2d;
import X.C1112390f3N;
import X.C1161920gLG;
import X.C16FJ;
import X.C485950J3x;
import X.C486790J7d;
import X.C781550UlF;
import X.C786410Ut5;
import X.EnumC19356910oB;
import X.EnumC584680MwU;
import X.InterfaceC1109090ey3;
import X.InterfaceC1112060f2q;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.model.message.RoomVerifyMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.WidgetCreateTimeUtil;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS44S0102000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class GameDualDevicePublicScreenWidget extends PublicScreenWidget {
    @Override // X.InterfaceC1112050f2p
    public final boolean fu() {
        return true;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gzn;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.android.live.publicscreen.api.IPublicScreenHolderWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, X.InterfaceC1112050f2p
    public final void qe1(InterfaceC1112060f2q interfaceC1112060f2q, Object obj) {
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, X.InterfaceC1112050f2p
    public final void w10(InterfaceC1112060f2q interfaceC1112060f2q) {
    }

    @Override // com.bytedance.android.live.publicscreen.impl.widget.PublicScreenWidget, com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        Room room;
        int iLJIIIIZZ;
        C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>> c1111050f1D;
        C781550UlF c781550UlF;
        AbstractC1111600f26 abstractC1111600f26;
        AbstractC1111600f26 abstractC1111600f262;
        View viewSd;
        this.LLJILJILJ = new C1111930f2d<Object>() { // from class: X.0f2r
            @Override // X.C1111930f2d
            public final void LJJJLIIL() {
                IMessageManager iMessageManager = this.mMessageManager;
                if (iMessageManager != null) {
                    iMessageManager.addMessageListener(C001A.CHAT.getIntType(), (OnIMMessageListener) this);
                }
                IMessageManager iMessageManager2 = this.mMessageManager;
                if (iMessageManager2 != null) {
                    iMessageManager2.addMessageListener(C001A.GIFT.getIntType(), (OnIMMessageListener) this);
                }
                IMessageManager iMessageManager3 = this.mMessageManager;
                if (iMessageManager3 != null) {
                    iMessageManager3.addMessageListener(C001A.MEMBER.getIntType(), (OnIMMessageListener) this);
                }
                IMessageManager iMessageManager4 = this.mMessageManager;
                if (iMessageManager4 != null) {
                    iMessageManager4.addMessageListener(C001A.LIKE.getIntType(), (OnIMMessageListener) this);
                }
                IMessageManager iMessageManager5 = this.mMessageManager;
                if (iMessageManager5 != null) {
                    iMessageManager5.addMessageListener(C001A.SOCIAL.getIntType(), (OnIMMessageListener) this);
                }
                IMessageManager iMessageManager6 = this.mMessageManager;
                if (iMessageManager6 != null) {
                    iMessageManager6.addMessageListener(C001A.ROOM.getIntType(), (OnIMMessageListener) this);
                }
                IMessageManager iMessageManager7 = this.mMessageManager;
                if (iMessageManager7 != null) {
                    iMessageManager7.addMessageListener(C001A.IM_DELETE.getIntType(), (OnIMMessageListener) this);
                }
                IMessageManager iMessageManager8 = this.mMessageManager;
                if (iMessageManager8 != null) {
                    iMessageManager8.addMessageListener(C001A.ROOM_VERIFY.getIntType(), (OnIMMessageListener) this);
                }
            }

            @Override // X.C1111930f2d, com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                super.onMessage(iMessage);
                if (iMessage instanceof RoomVerifyMessage) {
                    int i = ((RoomVerifyMessage) iMessage).verifyAction;
                    if (i != 3) {
                        if (i == 4) {
                            C784440Upu.LIZ().LIZIZ(new C751500Tds(true));
                            return;
                        }
                        return;
                    }
                    C784440Upu.LIZ().LIZIZ(new C751500Tds(false));
                }
            }
        };
        this.LLJILJILJ.attachView(this);
        this.LLL = 0;
        C16FJ c16fj = this.LLJLLL;
        if (c16fj != null) {
            c16fj.setOverScrollMode(EnumC19356910oB.NONE);
        }
        C16FJ c16fj2 = this.LLJLLL;
        if (c16fj2 != null) {
            c16fj2.setScrollMode(EnumC584680MwU.NONE);
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLJJJJJIL = room;
        G1();
        C1112390f3N c1112390f3N = this.LLJLLIL;
        if (c1112390f3N != null) {
            C1109770ez9 c1109770ez9 = this.LLJILJILJ.LLLJL;
            AbstractC1111600f26 abstractC1111600f263 = c1112390f3N.LIZJ;
            if (abstractC1111600f263 != null) {
                abstractC1111600f263.LLILLL = c1109770ez9;
            }
        }
        AbstractC1111810f2R<AbstractC1110800f0o<? extends AbstractC1136060ffY>, C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>>> abstractC1111810f2R = this.LLJLIL;
        if (abstractC1111810f2R != null) {
            abstractC1111810f2R.LIZIZ = this.LLJILJILJ.LLLJL;
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.idr);
        AbstractC1111810f2R<AbstractC1110800f0o<? extends AbstractC1136060ffY>, C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>>> abstractC1111810f2R2 = this.LLJLIL;
        if (abstractC1111810f2R2 != null) {
            iLJIIIIZZ = abstractC1111810f2R2.LJIIIIZZ();
        } else {
            iLJIIIIZZ = 0;
        }
        AbstractC1111810f2R<AbstractC1110800f0o<? extends AbstractC1136060ffY>, C1111050f1D<AbstractC1110800f0o<? extends AbstractC1136060ffY>>> abstractC1111810f2R3 = this.LLJLIL;
        if (abstractC1111810f2R3 != null) {
            C01GW c01gw = C485950J3x.LIZ;
            if (C485950J3x.LIZ(iLJIIIIZZ) && LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
                viewSd = C485950J3x.LIZJ(frameLayout, iLJIIIIZZ);
            } else {
                viewSd = C786410Ut5.Sd(iLJIIIIZZ, C786410Ut5.ne(getContext()), frameLayout);
            }
            c1111050f1D = (C1111050f1D) abstractC1111810f2R3.LJIILJJIL(viewSd);
        } else {
            c1111050f1D = null;
        }
        this.LLJLILLLLZIIL = c1111050f1D;
        F1(frameLayout);
        C1112390f3N c1112390f3N2 = this.LLJLLIL;
        if (c1112390f3N2 != null && (abstractC1111600f262 = c1112390f3N2.LIZJ) != null) {
            abstractC1111600f262.LLLIL();
        }
        List<InterfaceC1109090ey3> listIS0 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).IS0();
        if (!listIS0.isEmpty()) {
            for (InterfaceC1109090ey3 interfaceC1109090ey3 : listIS0) {
                C1112390f3N c1112390f3N3 = this.LLJLLIL;
                if (c1112390f3N3 != null && (abstractC1111600f26 = c1112390f3N3.LIZJ) != null) {
                    interfaceC1109090ey3.LJ(abstractC1111600f26);
                }
            }
        }
        C1112390f3N c1112390f3N4 = this.LLJLLIL;
        if (c1112390f3N4 != null) {
            List<InterfaceC1112060f2q> listLIZLLL = this.LLJILJILJ.LLJLL.LIZLLL();
            AbstractC1111600f26 abstractC1111600f264 = c1112390f3N4.LIZJ;
            if (abstractC1111600f264 != null) {
                abstractC1111600f264.LL = listLIZLLL;
            }
        }
        C1112390f3N c1112390f3N5 = this.LLJLLIL;
        if (c1112390f3N5 != null) {
            c1112390f3N5.LIZIZ(new AwS44S0102000_17(c1112390f3N5, 0, this.LLJILJILJ.LLJLL.LJ(), 1));
        }
        enableSubWidgetManager(new WidgetCreateTimeUtil(null), C486790J7d.LIZ, LiveWidgetNonOpProvider.Companion.getInstance(), C0IJ7.LIZLLL(getContext()));
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        C1112390f3N c1112390f3N6 = this.LLJLLIL;
        if (c1112390f3N6 != null && (c781550UlF = c1112390f3N6.LIZ) != null) {
            c781550UlF.setVerticalFadingEdgeEnabled(true);
        }
        C16FJ c16fj3 = this.LLJLLL;
        if (c16fj3 != null) {
            c16fj3.setVerticalFadingEdgeEnabled(true);
        }
    }
}

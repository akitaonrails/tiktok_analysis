package com.bytedance.android.live.publicscreen.impl.giftHistory;

import X.AnonymousClass0206;
import X.C01GW;
import X.C1113690f5T;
import X.C1113890f5n;
import X.C20516015Pq;
import X.C236100vf;
import X.C452501pT;
import X.C473050Igp;
import X.C500260Jjc;
import X.C930940aKi;
import X.EnumC1083260eIO;
import X.EnumC1112150f2z;
import X.InterfaceC1113880f5m;
import X.InterfaceC1113900f5o;
import Y.AObserverS221S0100000_17;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.broadcast.api.AddDisplaySourceOptionEvent;
import com.bytedance.android.live.broadcast.api.DisplaySourceOptionsChannel;
import com.bytedance.android.live.broadcast.api.RemoveDisplaySourceOptionEvent;
import com.bytedance.android.live.publicscreen.api.ExternalFilterChangeChannel;
import com.bytedance.android.live.publicscreen.api.GiftHistoryNumChannel;
import com.bytedance.android.live.publicscreen.impl.DisplaySourceOptionWrappersChannel;
import com.bytedance.android.live.publicscreen.impl.GiftHistoryEnabledChannel;
import com.bytedance.android.live.publicscreen.impl.widget.ExtendedPublicScreenWidget;
import com.bytedance.android.live.publicscreen.impl.widget.ExtendedScreenFilterWidget;
import com.bytedance.android.livesdk.comp.api.game.LocalActionMessageClick;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenType;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class GiftHistoryWidgetHelper implements GenericLifecycleObserver {
    public final LifecycleOwner LL;
    public final DataChannel LLILLJJLI;
    public final TextView LLILLL;
    public final C20516015Pq LLILZ;
    public final int LLILZIL = R.id.yq2;
    public final int LLILZLL = R.id.yq9;
    public final boolean LLIZ;
    public final InterfaceC1113880f5m LLIZLLLIL;
    public LiveWidget LLJ;
    public LiveWidget LLJI;
    public final LiveWidget LLJIJIL;
    public boolean LLJILJIL;
    public final C236100vf LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final List<C1113890f5n> LLJJI;
    public final int LLJJIII;
    public final int LLJJIJI;
    public final int LLJJIJIIJIL;
    public LiveWidget LLJJIJIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    public final void LIZ() {
        C236100vf c236100vf = this.LLJILJILJ;
        Integer num = (Integer) this.LLILLJJLI.gg0(GiftHistoryNumChannel.class);
        c236100vf.LIZ(num == null || num.intValue() != 0);
    }

    public final void LIZJ() {
        if (this.LLJI == null) {
            this.LLJI = this.LLIZLLLIL.LIZ(this.LLILZ.getId(), this.LLILZ, ExtendedPublicScreenWidget.class, new Object[]{Boolean.TRUE});
        }
        C500260Jjc.LLFFF(this.LLILLL);
        LiveWidget liveWidget = this.LLJI;
        if (liveWidget != null) {
            liveWidget.show();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (this.LLILLJJLI.gg0(LiveExtendedScreenStatus.class) == EnumC1083260eIO.SHOW && this.LLILLJJLI.gg0(LiveExtendedScreenType.class) == EnumC1112150f2z.ExtendedGift) {
            LIZ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (this.LLILLJJLI.gg0(LiveExtendedScreenStatus.class) == EnumC1083260eIO.SHOW && this.LLILLJJLI.gg0(LiveExtendedScreenType.class) == EnumC1112150f2z.ExtendedGift) {
            LIZIZ("backend");
        }
    }

    public final void LIZIZ(String str) {
        boolean z;
        C236100vf c236100vf = this.LLJILJILJ;
        Integer num = (Integer) this.LLILLJJLI.gg0(GiftHistoryNumChannel.class);
        if (num != null && num.intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        c236100vf.LIZIZ(str, z);
    }

    public GiftHistoryWidgetHelper(LifecycleOwner lifecycleOwner, DataChannel dataChannel, TextView textView, C20516015Pq c20516015Pq, boolean z, C1113690f5T c1113690f5T) {
        long id;
        this.LL = lifecycleOwner;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = textView;
        this.LLILZ = c20516015Pq;
        this.LLIZ = z;
        this.LLIZLLLIL = c1113690f5T;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LLJILJILJ = new C236100vf(strValueOf, id, "extended_filed");
        this.LLJILLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(555));
        this.LLJJ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(556));
        this.LLJJI = new ArrayList();
        this.LLJJIII = R.id.ys5;
        this.LLJJIJI = R.id.ys6;
        this.LLJJIJIIJIL = R.id.ys7;
        dataChannel.zW(GiftHistoryEnabledChannel.class, Boolean.valueOf(z));
        List<InterfaceC1113900f5o> list = (List) dataChannel.gg0(DisplaySourceOptionsChannel.class);
        if (list != null) {
            for (InterfaceC1113900f5o interfaceC1113900f5o : list) {
                ((ArrayList) this.LLJJI).add(new C1113890f5n(interfaceC1113900f5o, View.generateViewId(), this.LLIZLLLIL));
            }
        }
        this.LLILLJJLI.zW(DisplaySourceOptionWrappersChannel.class, this.LLJJI);
        this.LLJIJIL = this.LLIZLLLIL.LJFF(this.LLILZIL, ExtendedScreenFilterWidget.class);
        C473050Igp.LIZIZ().LJ.observe(this.LL, new AObserverS221S0100000_17(this, 54));
        this.LL.getLifecycle().addObserver(this);
        DataChannel dataChannel2 = this.LLILLJJLI;
        dataChannel2.BQ2(this.LL, ExternalFilterChangeChannel.class, new AwS596S0100000_17(this, 692));
        dataChannel2.BQ2(this.LL, LocalActionMessageClick.class, new AwS596S0100000_17(this, 693));
        dataChannel2.BQ2(this.LL, GiftHistoryNumChannel.class, new AwS596S0100000_17(this, 694));
        dataChannel2.BQ2(this.LL, LiveExtendedScreenStatus.class, new AwS596S0100000_17(this, 695));
        this.LLILLJJLI.BQ2(this.LL, AddDisplaySourceOptionEvent.class, new AwS596S0100000_17(this, 696));
        this.LLILLJJLI.BQ2(this.LL, RemoveDisplaySourceOptionEvent.class, new AwS596S0100000_17(this, 697));
    }
}

package X;

import Y.ACListenerS142S0100000_7;
import Y.ARunnableS76S0200000_7;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.android.feed.api.ILiveFeedApiService;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.feed.skylight.CommonSkylightDataManager;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import mf.a;
import webcast.api.feed.WatchLaterInfo;

/* JADX INFO: renamed from: X.0Inn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477370Inn extends ConstraintLayout {
    public final C01GW LL;
    public C11NJ LLILLJJLI;
    public C0P0T LLILLL;
    public final ARunnableS76S0200000_7 LLILZ;
    public boolean LLILZIL;

    private final TextView getNumberBadge() {
        return (TextView) this.LL.getValue();
    }

    public final void e0() {
        C0P0T c0p0t;
        HandlerHook.viewRemoveCallbacks(this, this.LLILZ);
        C0P0T c0p0t2 = this.LLILLL;
        if (c0p0t2 != null && c0p0t2.isShowing() && (c0p0t = this.LLILLL) != null) {
            c0p0t.dismiss();
        }
        this.LLILLL = null;
    }

    public final void h0() {
        List<FeedItem> list;
        FeedItem next;
        WatchLaterInfo watchLaterInfo;
        Room room;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_watch_later_button_click");
        c474500IjALIZ.LJJII("live_merge", "enter_from_merge");
        c474500IjALIZ.LJJII(getWatchLaterNum(), "watch_later_num");
        c474500IjALIZ.LIZ();
        ILiveFeedApiService iLiveFeedApiService = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
        if (iLiveFeedApiService != null) {
            iLiveFeedApiService.zX1();
            BaseListResponse<FeedItem, FeedExtra> baseListResponseLJIIL = CommonSkylightDataManager.LIZ.LJIIL(EnumC471790Ien.ROOM, Boolean.FALSE);
            if (baseListResponseLJIIL != null && (list = baseListResponseLJIIL.data) != null) {
                Iterator<FeedItem> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (next.type == 22) {
                            break;
                        }
                    }
                }
                FeedItem feedItem = next;
                if (feedItem != null && (watchLaterInfo = feedItem.watchLaterInfo) != null && (room = watchLaterInfo.latestRoom) != null) {
                    ILiveFeedApiService iLiveFeedApiService2 = (ILiveFeedApiService) C1161920gLG.LIZJ(ILiveFeedApiService.class);
                    if (iLiveFeedApiService2 != null) {
                        iLiveFeedApiService2.zr();
                        C468640IZi.LL.LIZJ(getContext(), room, false);
                        return;
                    }
                    return;
                }
            }
        }
        SmartRouter.buildRoute(getContext(), "//live/watch_later_history").open();
    }

    private final String getWatchLaterNum() {
        CharSequence text;
        String string;
        TextView numberBadge = getNumberBadge();
        return (numberBadge == null || (text = numberBadge.getText()) == null || (string = text.toString()) == null || string.length() == 0 || string == null) ? CardStruct.IStatusCode.DEFAULT : string;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C11NJ c11nj = new C11NJ();
        this.LLILLJJLI = c11nj;
        c11nj.LIZ(C784440Upu.LIZ().LJ(C468580IZc.class).LJJLJLI(new AfS176S0100000_7(this, 110)));
        C11NJ c11nj2 = this.LLILLJJLI;
        if (c11nj2 != null) {
            c11nj2.LIZ(C784440Upu.LIZ().LJ(C468770IZv.class).LJJLJLI(new AfS176S0100000_7(this, 111)));
        }
        DataChannelGlobal.LLILZ.CQ2(TopLiveSkylightVisibilityChannel.class, this, new AwS586S0100000_7(this, 251));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11NJ c11nj = this.LLILLJJLI;
        if (c11nj != null) {
            c11nj.dispose();
        }
        this.LLILLJJLI = null;
        DataChannelGlobal.LLILZ.zQ2(this);
        e0();
    }

    public final void i0(int i) {
        if (i > 0) {
            TextView numberBadge = getNumberBadge();
            if (numberBadge != null) {
                numberBadge.setText(String.valueOf(i));
            }
            C339190DRl.LIZLLL(getNumberBadge());
            return;
        }
        C339190DRl.LIZIZ(getNumberBadge());
    }

    public final void j0(int i) {
        i0(i);
        if (!this.LLILZIL && isShown()) {
            this.LLILZIL = true;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_watch_later_button_show");
            c474500IjALIZ.LJJII("live_merge", "enter_from_merge");
            c474500IjALIZ.LJJII(getWatchLaterNum(), "watch_later_num");
            c474500IjALIZ.LIZ();
        }
    }

    public C477370Inn(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C477370Inn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 367));
        this.LLILZ = new ARunnableS76S0200000_7(context, this, 31);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.djh, this, true);
        View.OnClickListener aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(this, 137);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS142S0100000_7) : aCListenerS142S0100000_7);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }
}

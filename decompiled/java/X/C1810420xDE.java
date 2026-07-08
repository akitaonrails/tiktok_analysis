package X;

import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xDE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1810420xDE implements InterfaceC465240IMg {
    public final RankPageController LL;
    public final InterfaceC1810670xDd LLILLJJLI;
    public boolean LLILLL;
    public final WeakHandler LLILZ = new WeakHandler(this);
    public View LLILZIL;
    public final RankTypeV2 LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;

    public final void LIZ(RankListV2Response.WeeklyRookieRankExtra weeklyRookieRankExtra) {
        InterfaceC1810670xDd interfaceC1810670xDd;
        int i;
        int i2;
        String str;
        View viewDk;
        InterfaceC1810050xCd interfaceC1810050xCd;
        LayoutInflater layoutInflaterGx;
        if (!this.LLILLL && this.LLIZ && weeklyRookieRankExtra != null && (interfaceC1810670xDd = this.LLILLJJLI) != null && interfaceC1810670xDd.y5()) {
            this.LLILLL = true;
            this.LLILZ.removeMessages(1);
            if (this.LLIZLLLIL && weeklyRookieRankExtra.lastrankanchorbeyondthreshold) {
                if (Intrinsics.LJFF(this.LLILZLL, RankTypeV2.LIZJ)) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(new Date(C158B.LIZ()));
                    int i3 = calendar.get(3);
                    C20337914i1<Long> c20337914i1 = InterfaceC1094280eaA.ad;
                    calendar.setTime(new Date(c20337914i1.LIZIZ().longValue()));
                    int i4 = calendar.get(3);
                    c20337914i1.LJFF(Long.valueOf(C158B.LIZ()));
                    if (i3 == i4) {
                        return;
                    }
                } else {
                    RankTypeV2 rankTypeV2 = this.LLILZLL;
                    if (rankTypeV2 != null) {
                        i = rankTypeV2.type;
                    } else {
                        i = 0;
                    }
                    String strValueOf = String.valueOf(i);
                    C20337914i1<Map<String, String>> c20337914i12 = InterfaceC1094160eZy.H1;
                    Map<String, String> mapLIZIZ = c20337914i12.LIZIZ();
                    RankTypeV2 rankTypeV22 = this.LLILZLL;
                    if (rankTypeV22 != null) {
                        i2 = rankTypeV22.showRankKeepUpTip;
                    } else {
                        i2 = 0;
                    }
                    if (mapLIZIZ == null || (str = mapLIZIZ.get(strValueOf)) == null) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    long jLIZIZ = C0IZJ.LIZIZ(str);
                    if (i2 != 2) {
                        if (i2 != 3) {
                            return;
                        }
                        Calendar calendar2 = Calendar.getInstance();
                        calendar2.setTime(new Date(C158B.LIZ()));
                        int i5 = calendar2.get(3);
                        calendar2.setTime(new Date(jLIZIZ));
                        if (i5 == calendar2.get(3)) {
                            return;
                        }
                    } else {
                        Calendar calendar3 = Calendar.getInstance();
                        Calendar calendar4 = Calendar.getInstance();
                        calendar4.setTimeInMillis(jLIZIZ);
                        if (calendar3.get(6) == calendar4.get(6)) {
                            return;
                        }
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(strValueOf, String.valueOf(C158B.LIZ()));
                    if (mapLIZIZ != null) {
                        linkedHashMap.putAll(mapLIZIZ);
                    }
                    c20337914i12.LJFF(linkedHashMap);
                }
                InterfaceC1810670xDd interfaceC1810670xDd2 = this.LLILLJJLI;
                View viewTd = null;
                if (interfaceC1810670xDd2 != null) {
                    viewDk = interfaceC1810670xDd2.Dk();
                } else {
                    viewDk = null;
                }
                if (this.LLILZIL == null && viewDk != null && (viewDk instanceof ViewGroup)) {
                    InterfaceC1810670xDd interfaceC1810670xDd3 = this.LLILLJJLI;
                    if (interfaceC1810670xDd3 != null && (layoutInflaterGx = interfaceC1810670xDd3.Gx()) != null) {
                        viewTd = C786410Ut5.Td(layoutInflaterGx, R.layout.h41, (ViewGroup) viewDk, false);
                    }
                    this.LLILZIL = viewTd;
                }
                final View view = this.LLILZIL;
                if (view == null) {
                    return;
                }
                RankPageController rankPageController = this.LL;
                if (rankPageController != null && (interfaceC1810050xCd = rankPageController.LLIZLLLIL) != null) {
                    interfaceC1810050xCd.ko(view, true);
                }
                C786410Ut5.LJLLLLLL(0, view);
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xDb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                    }
                }, view);
                this.LLILZ.sendEmptyMessageDelayed(1, Mp4ScreenVideoLoadTimeout.CONTROL);
                C16FS c16fs = (C16FS) view.findViewById(R.id.cw1);
                if (c16fs != null) {
                    C786410Ut5.h8(c16fs, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xDK
                        @Override // X.AbstractViewOnClickListenerC1105820esm
                        public final void LIZ() {
                            C786410Ut5.LJLLLLLL(8, view);
                            this.LLILZ.removeMessages(1);
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1200L);
                        }
                    });
                }
                View viewFindViewById = view.findViewById(R.id.lxw);
                if (viewFindViewById != null) {
                    C1143680frq.LIZLLL(viewFindViewById, C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_1"), "ttlive_rank_rookie_list_tip_bg.png");
                }
                View viewFindViewById2 = view.findViewById(R.id.lxx);
                if (viewFindViewById2 != null) {
                    C1143680frq.LIZLLL(viewFindViewById2, C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_3"), "ttlive_rank_rookie_tip_pic.webp");
                }
                TextView textView = (TextView) view.findViewById(R.id.tv_tip_msg);
                if (textView == null) {
                    return;
                }
                textView.setText(C497740JfY.LJIJI(2131844001));
            }
        }
    }

    @Override // X.InterfaceC465240IMg
    public final void handleMsg(Message message) {
        Integer numValueOf;
        if (message != null && (numValueOf = Integer.valueOf(message.what)) != null && numValueOf.intValue() == 1) {
            View view = this.LLILZIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        C20441214yg.LJ("RankTipController", " unknown message");
    }

    public C1810420xDE(RankPageController rankPageController, RankListController rankListController, InterfaceC1810670xDd interfaceC1810670xDd) {
        RankTypeV2 rankTypeV2;
        boolean z;
        RankRootViewModel rankRootViewModelLIZ;
        C1810410xDD c1810410xDD;
        this.LL = rankPageController;
        this.LLILLJJLI = interfaceC1810670xDd;
        if (rankListController != null && (c1810410xDD = rankListController.LLILLL) != null) {
            rankTypeV2 = c1810410xDD.LIZIZ;
        } else {
            rankTypeV2 = null;
        }
        this.LLILZLL = rankTypeV2;
        boolean z2 = false;
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LIZJ) || (rankTypeV2 != null && rankTypeV2.showRankKeepUpTip > 0)) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZ = z;
        if (rankListController != null && (rankRootViewModelLIZ = rankListController.LIZ()) != null) {
            z2 = rankRootViewModelLIZ.LLILLL;
        }
        this.LLIZLLLIL = z2;
    }
}

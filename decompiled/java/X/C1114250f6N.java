package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.dataChannel.EmoteBaseInformationListChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.performance.emote.EmotePerformanceTrackerViewModel;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0f6N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114250f6N extends ConstraintLayout implements InterfaceC1114270f6P {
    public final DataChannel LL;
    public final boolean LLILLJJLI;
    public final InterfaceC1095590ecH LLILLL;
    public final C1110180ezo LLILZ;
    public C1114260f6O LLILZIL;
    public final C20632315oP LLILZLL;
    public final ArrayList<AbstractC1114240f6M> LLIZ;
    public C1151520g4U LLIZLLLIL;
    public String LLJ;
    public EmoteModel LLJI;
    public Integer LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;
    public final ArrayList<EmoteModel> LLJJ;
    public boolean LLJJI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.LLJJI = false;
        C1151520g4U c1151520g4U = this.LLIZLLLIL;
        if (c1151520g4U != null) {
            this.LLILZLL.LJI(c1151520g4U);
            this.LLIZLLLIL = null;
        }
        super.onDetachedFromWindow();
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    private final EmotePerformanceTrackerViewModel getEmotePerformanceTracker() {
        return (EmotePerformanceTrackerViewModel) this.LLJILLL.getValue();
    }

    public final List<EmoteModel> getAllEmotesList() {
        return this.LLJJ;
    }

    public final String getEnterFrom() {
        return this.LLJILJIL;
    }

    public final boolean getSendShowEventFirst() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1114270f6P
    public final void LLJLIL(int i) {
        this.LLJJI = true;
        i0(i);
    }

    public final void h0(int i) {
        C1114260f6O c1114260f6O = this.LLILZIL;
        if (c1114260f6O != null) {
            c1114260f6O.LIZIZ(i);
        }
        C20632315oP c20632315oP = this.LLILZLL;
        Iterator<AbstractC1114240f6M> it2 = this.LLIZ.iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next().I5() == i) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        c20632315oP.LJ(i2, false);
    }

    public final void i0(int i) {
        Room room;
        int i2;
        String str;
        DataChannel dataChannel = this.LL;
        String str2 = this.LLJILJIL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        ArrayList arrayList = new ArrayList(this.LLILZ.LLJIJIL);
        ArrayList arrayList2 = new ArrayList(this.LLILZ.LLJI);
        if (i != 2) {
            if (i == 3) {
                str3 = "super_fan";
            }
        } else {
            str3 = "fan_club";
        }
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(arrayList);
            arrayList3.addAll(arrayList2);
            C443120HZe c443120HZeLJFF = C498500Jgm.LJFF(arrayList3);
            if (((Number) c443120HZeLJFF.getSecond()).intValue() >= 0) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_panel_fans_club_sticker_tab_show");
                c474500IjALIZ.LJJII(str2, "show_entrance");
                c474500IjALIZ.LJJII(String.valueOf(room.getOwnerUserId()), "anchor_id");
                c474500IjALIZ.LJJII(room.getIdStr(), "room_id");
                if (((Number) c443120HZeLJFF.getFirst()).intValue() > 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                c474500IjALIZ.LJJII(Integer.valueOf(i2), "has_sub_tab");
                c474500IjALIZ.LJJII(C1114370f6Z.LJIIIZ(), "subscribe_state");
                C498500Jgm.LIZ(c474500IjALIZ, dataChannel);
                c474500IjALIZ.LJJII(c443120HZeLJFF.getSecond(), "fans_club_sticker_num");
                c474500IjALIZ.LJJII(c443120HZeLJFF.getThird(), "customized_fans_club_sticker_num");
                if (C500260Jjc.LJIIZILJ(dataChannel)) {
                    str = "anchor";
                } else {
                    str = "user";
                }
                c474500IjALIZ.LJJII(str, "user_type");
                if (!TextUtils.isEmpty(str3)) {
                    c474500IjALIZ.LJJII(str3, "tab_type");
                }
                c474500IjALIZ.LIZ();
            }
        }
    }

    public final void setEnterFrom(String str) {
        String str2;
        C1110180ezo c1110180ezo = this.LLILZ;
        if (c1110180ezo != null) {
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            c1110180ezo.LLJILJIL = str2;
        }
        this.LLJILJIL = str;
    }

    public final void setSendShowEventFirst(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void e0(boolean z, boolean z2) {
        int i;
        if (z) {
            boolean zWd2 = ((IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)).wd2();
            ArrayList<EmoteModel> arrayList = this.LLJJ;
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            if (dataChannelGlobal.gg0(C930940aKi.class) != null) {
                HashMap map = new HashMap();
                String str = (String) dataChannelGlobal.gg0(C1148170fz5.class);
                String str2 = "comment";
                if (str == null) {
                    str = "comment";
                }
                if (!a0.LJJJIL(str)) {
                    str2 = str;
                }
                map.put("show_entrance", str2);
                C498500Jgm.LIZIZ(map);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_privilege_emote_bar_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJIIZI(map);
                ArrayList arrayList2 = new ArrayList();
                Iterator<EmoteModel> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(it2.next().emoteId);
                }
                c474500IjALIZ.LJJII(arrayList2.toString(), "privilege_emotes_label");
                c474500IjALIZ.LIZ();
            }
            this.LLJILJILJ = false;
            C1114260f6O c1114260f6O = this.LLILZIL;
            if (c1114260f6O != null) {
                i = c1114260f6O.LJIIIIZZ;
            } else {
                i = 2;
            }
            i0(i);
            int size = this.LLJJ.size();
            JSONObject jSONObject = new JSONObject();
            C0K04.LIZLLL(1, "limit_emotes_size", jSONObject);
            C0K04.LIZLLL(size, "total_emotes_size", jSONObject);
            C510380Jzw.LJIL("subscription_emote_panel_show", jSONObject);
            if (!zWd2 && !C500260Jjc.LJIIZILJ(this.LL)) {
                C498500Jgm.LJ("emote_bar", null);
                return;
            }
            return;
        }
        EmotePerformanceTrackerViewModel emotePerformanceTracker = getEmotePerformanceTracker();
        if (emotePerformanceTracker != null) {
            emotePerformanceTracker.LLILLL = System.currentTimeMillis();
        }
        EmotePerformanceTrackerViewModel emotePerformanceTracker2 = getEmotePerformanceTracker();
        if (emotePerformanceTracker2 != null) {
            emotePerformanceTracker2.xQ2();
        }
    }

    public C1114250f6N(Context context, DataChannel dataChannel, boolean z, C1114310f6T c1114310f6T, C1114300f6S c1114300f6S) {
        super(context);
        this.LL = dataChannel;
        this.LLILLJJLI = z;
        this.LLILLL = c1114300f6S;
        this.LLILZ = new C1110180ezo(dataChannel, c1114310f6T, c1114300f6S);
        this.LLIZ = new ArrayList<>();
        this.LLJILJIL = "";
        this.LLJILLL = C452501pT.LIZIZ(new AwS551S0100000_7(context, 760));
        this.LLJJ = new ArrayList<>();
        C786410Ut5.Sd(R.layout.hrh, C786410Ut5.ne(context), this);
        this.LLILZLL = (C20632315oP) findViewById(R.id.view_pager);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        this.LLJIJIL = (Integer) dataChannelGlobal.gg0(C1148290fzH.class);
        dataChannelGlobal.IQ2(C1148290fzH.class);
        dataChannelGlobal.DQ2(EmoteBaseInformationListChannel.class, this, new AwS596S0100000_17(this, 553));
        EmotePerformanceTrackerViewModel emotePerformanceTracker = getEmotePerformanceTracker();
        if (emotePerformanceTracker != null) {
            emotePerformanceTracker.init();
        }
        SystemClock.elapsedRealtime();
    }
}

package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchAweme;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptGuestDistributeStateSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0If0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C471920If0 extends RecyclerView.ViewHolder {
    public static int LLJJIJI = -1;
    public final ViewGroup LL;
    public final C0IYF LLILLJJLI;
    public final String LLILLL;
    public final TextView LLILZ;
    public final C1324720kZq LLILZIL;
    public final TextView LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public final View LLJ;
    public final View LLJI;
    public final View LLJIJIL;
    public final C1324720kZq LLJILJIL;
    public final TextView LLJILJILJ;
    public LiveSearchAweme LLJILLL;
    public Room LLJJ;
    public int LLJJI;
    public int LLJJIII;

    public final Map<String, String> I5() {
        Room room = this.LLJJ;
        if (room == null) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from_merge", C472230IfV.LIZ());
        linkedHashMap.put("enter_method", C472230IfV.LIZIZ());
        linkedHashMap.put("action_type", "click");
        User owner = room.getOwner();
        linkedHashMap.put("anchor_id", String.valueOf(owner != null ? Long.valueOf(owner.getId()) : null));
        linkedHashMap.put("room_id", String.valueOf(room.getId()));
        return linkedHashMap;
    }

    public final void L5() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_show");
        c474500IjALIZ.LJJIIZI(I5());
        c474500IjALIZ.LJJII("small_picture", "live_window_mode");
        c474500IjALIZ.LJJII(this.LLILLL, "tab_type");
        if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
            c474500IjALIZ.LJJII(Integer.valueOf(C0IXN.LIZ()), "is_from_guest_distribute");
        }
        c474500IjALIZ.LIZ();
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_search_result_show");
        Map<String, String> mapI5 = I5();
        N5(mapI5);
        c474500IjALIZ2.LJJIIZI(mapI5);
        c474500IjALIZ2.LIZ();
    }

    public final void N5(Map<String, String> map) {
        AbstractC472000If8 abstractC472000If8;
        String str;
        String str2;
        String str3;
        AbstractC472000If8 abstractC472000If82;
        String str4;
        LiveSearchAweme liveSearchAweme = this.LLJILLL;
        String str5 = null;
        if (liveSearchAweme != null) {
            abstractC472000If8 = liveSearchAweme.LIZIZ;
        } else {
            abstractC472000If8 = null;
        }
        if (abstractC472000If8 instanceof C472010If9) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (liveSearchAweme != null) {
            str2 = liveSearchAweme.LIZJ;
        } else {
            str2 = null;
        }
        String str6 = "";
        if (str2 == null) {
            str2 = "";
        }
        map.put("search_id", str2);
        LiveSearchAweme liveSearchAweme2 = this.LLJILLL;
        if (liveSearchAweme2 == null || (str3 = liveSearchAweme2.LIZLLL) == null) {
            str3 = "";
        }
        map.put("search_keyword", str3);
        LiveSearchAweme liveSearchAweme3 = this.LLJILLL;
        if (liveSearchAweme3 != null && (abstractC472000If82 = liveSearchAweme3.LIZIZ) != null && (str4 = abstractC472000If82.LIZ) != null) {
            str6 = str4;
        }
        map.put("result_source", str6);
        LiveSearchAweme liveSearchAweme4 = this.LLJILLL;
        if (liveSearchAweme4 != null) {
            str5 = liveSearchAweme4.LJ;
        }
        map.put("search_type", C472230IfV.LIZJ(str5));
        map.put("token_type", "live_card");
        map.put("rank_index", String.valueOf(this.LLJJIII));
        map.put("is_success", str);
    }

    public final void P5(int i, int i2) {
        int measuredWidth = (this.LL.getMeasuredWidth() - 3) / 2;
        LLJJIJI = measuredWidth;
        if (i > 0 && i2 > 0) {
            measuredWidth = (measuredWidth * i2) / i;
        }
        ViewGroup.LayoutParams layoutParams = this.LLILZIL.getLayoutParams();
        int i3 = layoutParams.width;
        int i4 = LLJJIJI;
        if (i3 == i4 && layoutParams.height == measuredWidth) {
            return;
        }
        layoutParams.width = i4;
        layoutParams.height = measuredWidth;
        C786410Ut5.u6(this.LLILZIL, layoutParams);
    }

    public C471920If0(View view, ViewGroup viewGroup, C471930If1 c471930If1) {
        super(view);
        this.LL = viewGroup;
        this.LLILLJJLI = c471930If1;
        this.LLILLL = "search";
        this.LLILZ = (TextView) view.findViewById(R.id.title);
        this.LLILZIL = (C1324720kZq) view.findViewById(R.id.mvv);
        this.LLILZLL = (TextView) view.findViewById(R.id.b_x);
        this.LLIZ = view.findViewById(R.id.o1m);
        this.LLIZLLLIL = view.findViewById(R.id.o12);
        this.LLJ = view.findViewById(R.id.mjh);
        view.findViewById(R.id.mjj);
        view.findViewById(R.id.mji);
        this.LLJI = view.findViewById(R.id.mlg);
        this.LLJIJIL = view.findViewById(R.id.mle);
        view.findViewById(R.id.mlh);
        view.findViewById(R.id.mlf);
        view.findViewById(R.id.mli);
        view.findViewById(R.id.pvi);
        this.LLJILJIL = (C1324720kZq) view.findViewById(R.id.mtx);
        this.LLJILJILJ = (TextView) view.findViewById(R.id.n2l);
        this.LLJJI = -1;
        this.LLJJIII = -1;
    }
}

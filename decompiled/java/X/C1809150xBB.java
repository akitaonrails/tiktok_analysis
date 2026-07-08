package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchSugEntity;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchSugExtra;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xBB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809150xBB extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLIZ = 0;
    public final InterfaceC1809200xBG LL;
    public final LiveIconView LLILLJJLI;
    public final C16F5 LLILLL;
    public final LiveIconView LLILZ;
    public LiveSearchSugEntity LLILZIL;
    public InterfaceC1809230xBJ LLILZLL;

    public final Map<String, String> I5() {
        String str;
        String str2;
        String str3;
        LiveSearchSugExtra liveSearchSugExtra;
        LiveSearchSugEntity liveSearchSugEntity = this.LLILZIL;
        String str4 = (liveSearchSugEntity == null || !Intrinsics.LJFF(liveSearchSugEntity.sugType, "history")) ? "sug" : "history";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from_merge", C472230IfV.LIZ());
        linkedHashMap.put("enter_method", C472230IfV.LIZIZ());
        linkedHashMap.put("action_type", "click");
        LiveSearchSugEntity liveSearchSugEntity2 = this.LLILZIL;
        String str5 = liveSearchSugEntity2 != null ? liveSearchSugEntity2.LIZIZ : null;
        String str6 = "";
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("raw_query", str5);
        LiveSearchSugEntity liveSearchSugEntity3 = this.LLILZIL;
        if (liveSearchSugEntity3 == null || (str = liveSearchSugEntity3.content) == null) {
            str = "";
        }
        linkedHashMap.put("words_content", str);
        linkedHashMap.put("words_type", str4);
        LiveSearchSugEntity liveSearchSugEntity4 = this.LLILZIL;
        if (liveSearchSugEntity4 == null || (liveSearchSugExtra = liveSearchSugEntity4.extra) == null || (str2 = liveSearchSugExtra.recallReason) == null) {
            str2 = "";
        }
        linkedHashMap.put("recall_source", str2);
        InterfaceC1809230xBJ interfaceC1809230xBJ = this.LLILZLL;
        linkedHashMap.put("rank_index", String.valueOf(interfaceC1809230xBJ != null ? interfaceC1809230xBJ.LIZ(this.LLILZIL) : -1));
        LiveSearchSugEntity liveSearchSugEntity5 = this.LLILZIL;
        if (liveSearchSugEntity5 != null && (str3 = liveSearchSugEntity5.LIZJ) != null) {
            str6 = str3;
        }
        linkedHashMap.put("impr_id", str6);
        LiveSearchSugEntity liveSearchSugEntity6 = this.LLILZIL;
        linkedHashMap.put("new_sug_session_id", String.valueOf(liveSearchSugEntity6 != null ? liveSearchSugEntity6.LIZLLL : null));
        return linkedHashMap;
    }

    public final void L5(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trending_words_click");
        Map<String, String> mapI5 = I5();
        mapI5.put("click_area", str);
        c474500IjALIZ.LJJIIZI(mapI5);
        c474500IjALIZ.LIZ();
    }

    public C1809150xBB(View view, InterfaceC1809200xBG interfaceC1809200xBG) {
        super(view);
        this.LL = interfaceC1809200xBG;
        this.LLILLJJLI = (LiveIconView) view.findViewById(R.id.jx1);
        this.LLILLL = (C16F5) view.findViewById(R.id.zf0);
        this.LLILZ = (LiveIconView) view.findViewById(R.id.lh2);
        C427690Gpr.LJ(view, 0.0f);
    }
}

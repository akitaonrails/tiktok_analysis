package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchSugEntity;
import com.bytedance.android.livesdk.feed.drawerfeed.search.model.LiveSearchSugExtra;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0xBA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809140xBA extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLILZ = 0;
    public final InterfaceC1809200xBG LL;
    public LiveSearchSugEntity LLILLJJLI;
    public InterfaceC1809230xBJ LLILLL;

    public final Map<String, String> I5() {
        String str;
        String str2;
        String str3;
        LiveSearchSugExtra liveSearchSugExtra;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from_merge", C472230IfV.LIZ());
        linkedHashMap.put("enter_method", C472230IfV.LIZIZ());
        linkedHashMap.put("action_type", "click");
        LiveSearchSugEntity liveSearchSugEntity = this.LLILLJJLI;
        String str4 = liveSearchSugEntity != null ? liveSearchSugEntity.LIZIZ : null;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("raw_query", str4);
        LiveSearchSugEntity liveSearchSugEntity2 = this.LLILLJJLI;
        if (liveSearchSugEntity2 == null || (str = liveSearchSugEntity2.content) == null) {
            str = "";
        }
        linkedHashMap.put("words_content", str);
        linkedHashMap.put("words_type", "history");
        LiveSearchSugEntity liveSearchSugEntity3 = this.LLILLJJLI;
        if (liveSearchSugEntity3 == null || (liveSearchSugExtra = liveSearchSugEntity3.extra) == null || (str2 = liveSearchSugExtra.recallReason) == null) {
            str2 = "";
        }
        linkedHashMap.put("recall_source", str2);
        InterfaceC1809230xBJ interfaceC1809230xBJ = this.LLILLL;
        linkedHashMap.put("rank_index", String.valueOf(interfaceC1809230xBJ != null ? interfaceC1809230xBJ.LIZ(this.LLILLJJLI) : -1));
        LiveSearchSugEntity liveSearchSugEntity4 = this.LLILLJJLI;
        if (liveSearchSugEntity4 != null && (str3 = liveSearchSugEntity4.LIZJ) != null) {
            str5 = str3;
        }
        linkedHashMap.put("impr_id", str5);
        LiveSearchSugEntity liveSearchSugEntity5 = this.LLILLJJLI;
        linkedHashMap.put("new_sug_session_id", String.valueOf(liveSearchSugEntity5 != null ? liveSearchSugEntity5.LIZLLL : null));
        return linkedHashMap;
    }

    public C1809140xBA(View view, InterfaceC1809200xBG interfaceC1809200xBG) {
        super(view);
        this.LL = interfaceC1809200xBG;
    }
}

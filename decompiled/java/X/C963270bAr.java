package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0bAr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C963270bAr {
    public final long LIZ;
    public EnumC963280bAs LIZIZ = EnumC963280bAs.OTHERS;
    public final HashMap<Long, C963810bBj> LIZJ = new HashMap<>();
    public List<C963810bBj> LIZLLL = C13BV.INSTANCE;

    public C963270bAr(long j) {
        this.LIZ = j;
    }

    public final C474500IjA LIZ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJII(Long.valueOf(this.LIZ), "channel_id");
        return c474500IjALIZ;
    }

    public final C474500IjA LIZIZ(String str, C963810bBj c963810bBj) {
        String str2;
        C474500IjA c474500IjALIZ = LIZ(str);
        c474500IjALIZ.LJJII(String.valueOf(c963810bBj.LIZ), "to_anchor_id");
        if (c963810bBj.LIZ()) {
            str2 = "following";
        } else if (c963810bBj.LIZIZ == 3) {
            str2 = "follow_back";
        } else {
            str2 = "follow";
        }
        c474500IjALIZ.LJJII(str2, "button_type");
        return c474500IjALIZ;
    }

    public final void LIZJ(RecyclerView.LayoutManager layoutManager, List<?> list) {
        Object obj;
        if (!(layoutManager instanceof LinearLayoutManager)) {
            return;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            if (list != null) {
                obj = ListProtector.get(list, iFindFirstVisibleItemPosition);
            } else {
                obj = null;
            }
            if (obj instanceof C963810bBj) {
                C963810bBj c963810bBj = (C963810bBj) obj;
                if (!this.LIZJ.containsKey(Long.valueOf(c963810bBj.LIZ))) {
                    LIZIZ("follow_prompt_after_cohost_anchor_show", c963810bBj).LIZ();
                }
                this.LIZJ.put(Long.valueOf(c963810bBj.LIZ), (C963810bBj) obj);
            }
            if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                iFindFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }
}

package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0gXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1169720gXq {
    public final HashMap<Class<? extends PowerCell>, Integer> LIZ;
    public final HashMap<Class<? extends PowerCell>, Integer> LIZIZ;

    public C1169720gXq() {
        HashMap<Class<? extends PowerCell>, Integer> map = new HashMap<>();
        this.LIZ = map;
        HashMap<Class<? extends PowerCell>, Integer> map2 = new HashMap<>();
        this.LIZIZ = map2;
        map.put(MixFeedCell.class, Integer.valueOf(R.layout.do8));
        map2.put(MixFeedCell.class, 8);
    }
}

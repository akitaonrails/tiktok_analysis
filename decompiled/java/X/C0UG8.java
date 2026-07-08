package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectBackgroundCoexistSetting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0UG8, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UG8 {
    public static final List<C0UG1> LJIIIZ;
    public static final List<String> LJIIJ;
    public final List<C0UG1> LIZ;
    public final List<String> LIZIZ;
    public final C0UG9 LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;
    public final C0UGE LJFF;
    public final String LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;

    static {
        LinkedList linkedList = new LinkedList();
        LJIIIZ = linkedList;
        LJIIJ = new LinkedList();
        linkedList.add(new C0UG1("beauty", Arrays.asList(1, 2, 3)));
        linkedList.add(new C0UG1(C0UD4.LJFF, Arrays.asList(1, 2, 3)));
        Iterator<String> it2 = C0UD4.LJIIJ.iterator();
        while (it2.hasNext()) {
            LJIIIZ.add(new C0UG1(it2.next(), Arrays.asList(1, 3)));
        }
        List<C0UG1> list = LJIIIZ;
        list.add(new C0UG1("livegame", Collections.singletonList(3)));
        list.add(new C0UG1(C0UD4.LIZ, Collections.singletonList(2)));
        list.add(new C0UG1(C0UD4.LIZIZ, Arrays.asList(1, 2)));
        if (LiveEffectBackgroundCoexistSetting.INSTANCE.enable()) {
            list.add(new C0UG1("livebackground", Arrays.asList(1, 2)));
        } else {
            list.add(new C0UG1("livebackground", Collections.singletonList(3)));
        }
        list.add(new C0UG1(C0UD4.LJ, Arrays.asList(1, 2)));
        list.add(new C0UG1("livefiltercomposerexperiment", Arrays.asList(1, 2, 3)));
        list.add(new C0UG1("liveguestbeauty", Arrays.asList(1, 2, 3)));
        list.add(new C0UG1("livehorizontaleffects", Arrays.asList(1, 2)));
        list.add(new C0UG1("tiktok_live_boards", Arrays.asList(1, 2, 3)));
        list.add(new C0UG1(C0UD4.LIZLLL, Arrays.asList(1, 2, 3)));
        list.add(new C0UG1("gift_monitor", Arrays.asList(1, 2, 3)));
        list.add(new C0UG1("interaction_games", Arrays.asList(1, 2, 3)));
        list.add(new C0UG1("live_dance", Arrays.asList(1, 2, 3)));
        List<String> list2 = LJIIJ;
        list2.add(C0UD4.LJFF);
        list2.add("livefiltercomposerexperiment");
        list2.add("makeupforever");
        new ArrayList(Arrays.asList(1, 2, 3));
    }

    public C0UG8(C0UGC c0ugc) {
        this.LJII = true;
        this.LJIIIIZZ = true;
        this.LIZJ = c0ugc.LIZJ;
        List<String> list = c0ugc.LIZ;
        this.LIZIZ = list == null ? Collections.emptyList() : list;
        List<String> list2 = c0ugc.LIZIZ;
        this.LIZLLL = list2 == null ? Collections.emptyList() : list2;
        this.LIZ = LJIIIZ;
        this.LJ = LJIIJ;
        this.LJI = c0ugc.LIZLLL;
        this.LJII = c0ugc.LJ;
        this.LJIIIIZZ = true;
        this.LJFF = c0ugc.LJFF;
    }
}

package Y;

import X.C0H7B;
import X.C0H7E;
import X.C1203204nG;
import X.C1388190mED;
import X.C13BV;
import X.C15438062q;
import X.C1C7U;
import X.C2097908Jt;
import X.C442090HVf;
import X.C442110HVh;
import android.content.Context;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.poi.commonalbum.model.AlbumTrackParams;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS372S0200000_6;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS1S0410000_6 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Map<String, String> map;
        AlbumTrackParams albumTrackParams;
        AlbumTrackParams albumTrackParams2;
        String str;
        LocalServiceAlbumVM localServiceAlbumVM = (LocalServiceAlbumVM) this.l0;
        List<MediaModel> list = (List) this.l1;
        localServiceAlbumVM.LLILZLL.clear();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (MediaModel mediaModel : list) {
            arrayList.add(new C0H7B(mediaModel.LJFF(), mediaModel, false, -1, false, new AwS372S0200000_6(111)));
        }
        localServiceAlbumVM.LLILZIL.clear();
        localServiceAlbumVM.LLILZIL.addAll(arrayList);
        Iterator it2 = arrayList.iterator();
        while (true) {
            map = null;
            if (!it2.hasNext()) {
                break;
            }
            C0H7B c0h7b = (C0H7B) it2.next();
            MediaModel mediaModel2 = c0h7b.LLILLJJLI;
            if (mediaModel2 != null && (str = mediaModel2.albumClass) != null && str.length() > 0) {
                CopyOnWriteArrayList<C0H7B> copyOnWriteArrayList = localServiceAlbumVM.LLILZLL.get(str);
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.add(c0h7b);
                } else {
                    ConcurrentHashMap<String, CopyOnWriteArrayList<C0H7B>> concurrentHashMap = localServiceAlbumVM.LLILZLL;
                    CopyOnWriteArrayList<C0H7B> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList2.add(c0h7b);
                    concurrentHashMap.put(str, copyOnWriteArrayList2);
                }
            }
        }
        LocalServiceAlbumVM localServiceAlbumVM2 = (LocalServiceAlbumVM) this.l0;
        CopyOnWriteArrayList<C0H7B> copyOnWriteArrayList3 = localServiceAlbumVM2.LLILZIL;
        Context context = (Context) this.l2;
        boolean z = this.z4;
        Function1 function1 = (Function1) this.l3;
        if (!localServiceAlbumVM2.LLIZLLLIL) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C442110HVh c442110HVh = localServiceAlbumVM2.LLJI;
            long j = jCurrentTimeMillis - (c442110HVh != null ? c442110HVh.LJI : 0L);
            int size = copyOnWriteArrayList3.size();
            PageFinder pageFinderVia = PageFinder.via(context != null ? C1388190mED.LIZIZ(context) : null);
            C442110HVh c442110HVh2 = localServiceAlbumVM2.LLJI;
            C442090HVf.LJ(j, size, pageFinderVia, (c442110HVh2 == null || (albumTrackParams2 = c442110HVh2.LJFF) == null) ? null : albumTrackParams2.generalMobParams);
            localServiceAlbumVM2.LLIZLLLIL = true;
        }
        PageFinder pageFinderVia2 = PageFinder.via(context);
        String str2 = z ? "1" : CardStruct.IStatusCode.DEFAULT;
        C442110HVh c442110HVh3 = localServiceAlbumVM2.LLJI;
        if (c442110HVh3 != null && (albumTrackParams = c442110HVh3.LJFF) != null) {
            map = albumTrackParams.generalMobParams;
        }
        C442090HVf.LIZLLL(pageFinderVia2, "fetch_image_done", str2, map);
        if (function1 != null) {
            function1.invoke(copyOnWriteArrayList3);
        }
    }

    public final void LIZ$1() {
        Map<String, String> map;
        AlbumTrackParams albumTrackParams;
        AlbumTrackParams albumTrackParams2;
        String str;
        LocalServiceAlbumVM localServiceAlbumVM = (LocalServiceAlbumVM) this.l0;
        List<MediaModel> list = (List) this.l1;
        List<C0H7E> list2 = (CopyOnWriteArrayList) localServiceAlbumVM.getState().LLIZLLLIL.LIZ;
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        C442110HVh c442110HVh = localServiceAlbumVM.LLJI;
        boolean z = list2.size() >= (c442110HVh != null ? c442110HVh.LJ : 0);
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C0H7E c0h7e : list2) {
            Pair pair = new Pair(c0h7e.LIZ, Integer.valueOf(c0h7e.LIZIZ));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (MediaModel mediaModel : list) {
            Integer num = (Integer) linkedHashMap.get(mediaModel);
            boolean z2 = num != null;
            arrayList.add(new C0H7B(mediaModel.LJFF(), mediaModel, z2, num != null ? num.intValue() : -1, C1203204nG.LIZ() && z && !z2, null));
        }
        localServiceAlbumVM.LLILZIL.addAll(arrayList);
        Iterator it2 = arrayList.iterator();
        while (true) {
            map = null;
            if (!it2.hasNext()) {
                break;
            }
            C0H7B c0h7b = (C0H7B) it2.next();
            MediaModel mediaModel2 = c0h7b.LLILLJJLI;
            if (mediaModel2 != null && (str = mediaModel2.albumClass) != null && str.length() > 0) {
                CopyOnWriteArrayList<C0H7B> copyOnWriteArrayList = localServiceAlbumVM.LLILZLL.get(str);
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.add(c0h7b);
                } else {
                    ConcurrentHashMap<String, CopyOnWriteArrayList<C0H7B>> concurrentHashMap = localServiceAlbumVM.LLILZLL;
                    CopyOnWriteArrayList<C0H7B> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>();
                    copyOnWriteArrayList2.add(c0h7b);
                    concurrentHashMap.put(str, copyOnWriteArrayList2);
                }
            }
        }
        if (!((LocalServiceAlbumVM) this.l0).LLIZLLLIL) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            LocalServiceAlbumVM localServiceAlbumVM2 = (LocalServiceAlbumVM) this.l0;
            C442110HVh c442110HVh2 = localServiceAlbumVM2.LLJI;
            long j = jCurrentTimeMillis - (c442110HVh2 != null ? c442110HVh2.LJI : 0L);
            int size = localServiceAlbumVM2.LLILZIL.size();
            Context context = (Context) this.l2;
            PageFinder pageFinderVia = PageFinder.via(context != null ? C1388190mED.LIZIZ(context) : null);
            C442110HVh c442110HVh3 = ((LocalServiceAlbumVM) this.l0).LLJI;
            C442090HVf.LJ(j, size, pageFinderVia, (c442110HVh3 == null || (albumTrackParams2 = c442110HVh3.LJFF) == null) ? null : albumTrackParams2.generalMobParams);
            ((LocalServiceAlbumVM) this.l0).LLIZLLLIL = true;
        }
        PageFinder pageFinderVia2 = PageFinder.via((Context) this.l2);
        String str2 = this.z4 ? "1" : CardStruct.IStatusCode.DEFAULT;
        C442110HVh c442110HVh4 = ((LocalServiceAlbumVM) this.l0).LLJI;
        if (c442110HVh4 != null && (albumTrackParams = c442110HVh4.LJFF) != null) {
            map = albumTrackParams.generalMobParams;
        }
        C442090HVf.LIZLLL(pageFinderVia2, "fetch_image_done", str2, map);
        Function1 function1 = (Function1) this.l3;
        if (function1 != null) {
            function1.invoke(arrayList);
        }
    }

    public static final void run$0(ARunnableS1S0410000_6 aRunnableS1S0410000_6) {
        boolean zLIZ;
        C1C7U.LIZ("LocalServiceAlbumVM@35d7.fetchAlbumWithBlock$1$1");
        try {
            aRunnableS1S0410000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LocalServiceAlbumVM@35d7.fetchAlbumWithBlock$1$1");
    }

    public static final void run$1(ARunnableS1S0410000_6 aRunnableS1S0410000_6) {
        boolean zLIZ;
        C1C7U.LIZ("LocalServiceAlbumVM@35d7.fetchAlbumWithBlock$2$1");
        try {
            aRunnableS1S0410000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LocalServiceAlbumVM@35d7.fetchAlbumWithBlock$2$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS1S0410000_6(LocalServiceAlbumVM localServiceAlbumVM, LocalServiceAlbumVM localServiceAlbumVM2, List<? extends MediaModel> list, Context context, boolean z, Function1<? super List<C0H7B>, Unit> function1) {
        this.$t = function1;
        this.l0 = localServiceAlbumVM;
        this.l1 = localServiceAlbumVM2;
        this.l2 = list;
        this.z4 = context;
        this.l3 = z;
    }
}

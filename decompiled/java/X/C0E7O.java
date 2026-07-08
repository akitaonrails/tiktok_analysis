package X;

import Y.AComparatorS24S0000000_5;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E7O, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E7O {
    public static final List<C350030Dnt> LIZ(C0E7P c0e7p, TrackShowType trackShowType) {
        int i = 0;
        switch (C0E7M.LIZ[trackShowType.ordinal()]) {
            case 1:
            case 2:
                ArrayList arrayList = new ArrayList();
                if (!c0e7p.LJI.isEmpty()) {
                    List<C350030Dnt> list = c0e7p.LJI;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<C350030Dnt> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(C350030Dnt.LIZ(it2.next(), 0));
                    }
                    arrayList.addAll(arrayList2);
                    i = 1;
                }
                if (!c0e7p.LJII.isEmpty()) {
                    List<C350030Dnt> list2 = c0e7p.LJII;
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<C350030Dnt> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(C350030Dnt.LIZ(it3.next(), i));
                    }
                    arrayList.addAll(arrayList3);
                    i++;
                }
                if (!c0e7p.LIZLLL.isEmpty()) {
                    List<C350030Dnt> list3 = c0e7p.LIZLLL;
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    Iterator<C350030Dnt> it4 = list3.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(C350030Dnt.LIZ(it4.next(), i));
                    }
                    arrayList.addAll(arrayList4);
                    i++;
                }
                if (!c0e7p.LJIIIIZZ.isEmpty()) {
                    List<C350030Dnt> list4 = c0e7p.LJIIIIZZ;
                    ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list4, 10));
                    Iterator<C350030Dnt> it5 = list4.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(C350030Dnt.LIZ(it5.next(), i));
                    }
                    arrayList.addAll(arrayList5);
                    i++;
                }
                if (!c0e7p.LJ.isEmpty()) {
                    List<C350030Dnt> list5 = c0e7p.LJ;
                    ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(list5, 10));
                    Iterator<C350030Dnt> it6 = list5.iterator();
                    while (it6.hasNext()) {
                        arrayList6.add(C350030Dnt.LIZ(it6.next(), i));
                    }
                    arrayList.addAll(arrayList6);
                    i++;
                }
                if (!(!c0e7p.LJFF.isEmpty())) {
                    return arrayList;
                }
                List<C350030Dnt> list6 = c0e7p.LJFF;
                ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(list6, 10));
                Iterator<C350030Dnt> it7 = list6.iterator();
                while (it7.hasNext()) {
                    arrayList7.add(C350030Dnt.LIZ(it7.next(), i));
                }
                arrayList.addAll(arrayList7);
                return arrayList;
            case 3:
                return c0e7p.LIZJ;
            case 4:
            case 5:
                ArrayList arrayList8 = new ArrayList();
                for (C350030Dnt c350030Dnt : C13LP.LJLLLL(new AComparatorS24S0000000_5(100), c0e7p.LJI)) {
                    int i2 = i + 1;
                    arrayList8.add(C350030Dnt.LIZ(c350030Dnt, i));
                    if (Intrinsics.LJFF(c350030Dnt.LJ, "EDITOR_MUSIC") || Intrinsics.LJFF(c350030Dnt.LJ, "BGM")) {
                        List<C350030Dnt> list7 = c0e7p.LJIIIZ;
                        ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(list7, 10));
                        Iterator<C350030Dnt> it8 = list7.iterator();
                        while (it8.hasNext()) {
                            arrayList9.add(C350030Dnt.LIZ(it8.next(), i2));
                            i2++;
                        }
                        arrayList8.addAll(arrayList9);
                    }
                    i = i2;
                }
                return arrayList8;
            case 6:
                List<C350030Dnt> list8 = c0e7p.LJI;
                ArrayList arrayList10 = new ArrayList();
                for (C350030Dnt c350030Dnt2 : list8) {
                    if (Intrinsics.LJFF(c350030Dnt2.LJ, "AUDIO_RECORD")) {
                        arrayList10.add(c350030Dnt2);
                    }
                }
                List listLJLLLL = C13LP.LJLLLL(new AComparatorS24S0000000_5(101), arrayList10);
                ArrayList arrayList11 = new ArrayList(C15438062q.LJIJJ(listLJLLLL, 10));
                Iterator it9 = listLJLLLL.iterator();
                while (it9.hasNext()) {
                    arrayList11.add(C350030Dnt.LIZ((C350030Dnt) it9.next(), i));
                    i++;
                }
                return arrayList11;
            case 7:
                return c0e7p.LJII;
            case 8:
                return c0e7p.LIZLLL;
            case BdTuring.TYPE_ECAF /* 9 */:
                return c0e7p.LJIIIIZZ;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return c0e7p.LJFF;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return c0e7p.LJ;
            default:
                return C13BV.INSTANCE;
        }
    }
}

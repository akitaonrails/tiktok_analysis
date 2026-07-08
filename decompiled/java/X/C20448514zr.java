package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.14zr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20448514zr {
    public static final List<C20448614zs> LIZ(C20449014zw<String, Object> c20449014zw) {
        List<C20448614zs> list;
        Object objLIZ = c20449014zw.LIZ("list_data");
        if (!C19719512Dh.LJI(objLIZ) || (list = (List) objLIZ) == null) {
            return new ArrayList();
        }
        return list;
    }

    public static final List<MusicModel> LIZIZ(C20449014zw<String, Object> c20449014zw) {
        List list;
        Object objLIZ = c20449014zw.LIZ("list_data");
        if ((objLIZ instanceof List) && (list = (List) objLIZ) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MusicModel musicModel = ((C20448614zs) it2.next()).LIZIZ;
                if (musicModel != null) {
                    arrayList.add(musicModel);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((MusicModel) obj).getMusicItemType() != MusicModel.MusicItemType.LOADING_VIEW) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return C13BV.INSTANCE;
    }

    public static final List<MusicModel> LIZJ(C20449014zw<String, Object> c20449014zw) {
        List list;
        Object objLIZ = c20449014zw.LIZ("list_data");
        if ((objLIZ instanceof List) && (list = (List) objLIZ) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                int i = ((C20448614zs) obj).LIZ;
                if (i == 0 || i == 900) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                MusicModel musicModel = ((C20448614zs) it2.next()).LIZIZ;
                if (musicModel != null) {
                    arrayList2.add(musicModel);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (((MusicModel) obj2).getMusicItemType() != MusicModel.MusicItemType.LOADING_VIEW) {
                    arrayList3.add(obj2);
                }
            }
            return arrayList3;
        }
        return C13BV.INSTANCE;
    }

    public static final List<C20448614zs> LJ(List<? extends MusicModel> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends MusicModel> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C20448614zs(0, it2.next(), 12));
        }
        return arrayList;
    }

    public static final List<C20448614zs> LJFF(List<? extends MusicModel> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends MusicModel> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C20448614zs(903, it2.next(), 12));
        }
        return arrayList;
    }

    public static final void LIZLLL(C20449014zw<String, Object> c20449014zw, List<? extends MusicModel> list) {
        c20449014zw.LIZIZ("list_data", LJ(list));
    }
}

package X;

import Y.ARunnableS39S0400000_31;
import android.app.Activity;
import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v7.o;

/* JADX INFO: renamed from: X.154B, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C154B {
    public final DataCenter LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public Cursor LJ;

    public C154B(DataCenter dataCenter) {
        this.LIZ = dataCenter;
    }

    public static List LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C20448614zs(861, null, null, null));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C20448614zs(0, (MusicModel) it2.next(), null, null));
        }
        return arrayList;
    }

    public final C15O7<List<MusicModel>> LIZIZ(WeakReference<Activity> weakReference) {
        o oVar = new o();
        C2344809Gs.LIZLLL(3, "Local Sound", "Start Load Local Sound");
        ArrayList arrayList = new ArrayList();
        if (weakReference.get() != null) {
            try {
                C823050WQl.LIZLLL().execute(new ARunnableS39S0400000_31(this, weakReference, arrayList, oVar, 5));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LIZLLL(3, "Local Sound", "Scan Music throw a Exception");
                C2344809Gs.LJI(e);
            }
        }
        return oVar.LIZ;
    }
}

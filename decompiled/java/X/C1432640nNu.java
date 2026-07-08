package X;

import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0nNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432640nNu {
    public static final /* synthetic */ int LIZ = 0;

    public static final ArrayList<C1429800nJK> LIZ(List<? extends EditVideoSegment> list) {
        if (C580130Mp9.LIZ(list)) {
            return null;
        }
        ArrayList<C1429800nJK> arrayList = new ArrayList<>(list.size());
        for (EditVideoSegment editVideoSegment : list) {
            C1429800nJK c1429800nJK = new C1429800nJK();
            c1429800nJK.LIZ = editVideoSegment.getVideoPath();
            if (editVideoSegment.getVideoCutInfo() != null) {
                editVideoSegment.getVideoCutInfo().getStart();
                c1429800nJK.LIZIZ = editVideoSegment.getVideoCutInfo().getEnd() - editVideoSegment.getVideoCutInfo().getStart();
            } else {
                c1429800nJK.LIZIZ = editVideoSegment.getVideoFileInfo().getDuration();
            }
            arrayList.add(c1429800nJK);
        }
        return arrayList;
    }

    public static final ArrayList<C1429800nJK> LIZIZ(List<C1432730nO3> list) {
        if (C580130Mp9.LIZ(list)) {
            return null;
        }
        ArrayList<C1429800nJK> arrayList = new ArrayList<>(list.size());
        for (C1432730nO3 c1432730nO3 : list) {
            C1429800nJK c1429800nJK = new C1429800nJK();
            c1429800nJK.LIZ = c1432730nO3.LIZ;
            c1429800nJK.LIZIZ = c1432730nO3.LIZJ;
            arrayList.add(c1429800nJK);
        }
        return arrayList;
    }
}

package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719790SLh {
    public final ViewGroup LIZ;
    public List<C719820SLk> LIZIZ;
    public Float LIZJ;
    public View LIZLLL;
    public Float LJ;
    public View LJFF;
    public List<View> LJI;

    public final void LIZ() {
        ViewGroup viewGroup = this.LIZ;
        Object obj = viewGroup;
        for (Object parent = viewGroup.getParent(); parent instanceof ViewGroup; parent = ((View) parent).getParent()) {
            if (Intrinsics.LJFF(obj.getClass().getSimpleName(), "VideoViewCellRootView")) {
                List<View> arrayList = this.LJI;
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                ViewGroup viewGroup2 = (ViewGroup) parent;
                int childCount = viewGroup2.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup2.getChildAt(i);
                    if (childAt != obj && childAt.getVisibility() == 0) {
                        C786410Ut5.LJLLLLLL(4, childAt);
                        if (!arrayList.contains(childAt)) {
                            arrayList.add(childAt);
                        }
                    }
                }
                this.LJI = arrayList;
                return;
            }
            obj = parent;
        }
    }

    public final void LIZIZ() {
        List<View> list = this.LJI;
        if (list != null) {
            Iterator<View> it2 = list.iterator();
            while (it2.hasNext()) {
                C786410Ut5.LJLLLLLL(0, it2.next());
            }
        }
        this.LJI = null;
    }

    public final void LIZJ() {
        List<C719820SLk> list = this.LIZIZ;
        if (list != null) {
            for (C719820SLk c719820SLk : list) {
                c719820SLk.LIZ.setTranslationZ(c719820SLk.LIZIZ);
                c719820SLk.LIZ.setOutlineProvider(c719820SLk.LIZJ);
                c719820SLk.LIZ.setClipToOutline(c719820SLk.LIZLLL);
            }
        }
        this.LIZIZ = null;
        View view = this.LIZLLL;
        if (view != null) {
            Float f = this.LIZJ;
            view.setTranslationZ(f != null ? f.floatValue() : 0.0f);
        }
        this.LIZLLL = null;
        this.LIZJ = null;
        View view2 = this.LJFF;
        if (view2 != null) {
            Float f2 = this.LJ;
            view2.setTranslationZ(f2 != null ? f2.floatValue() : 0.0f);
        }
        this.LJFF = null;
        this.LJ = null;
    }

    public C719790SLh(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }
}

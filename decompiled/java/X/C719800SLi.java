package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0SLi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719800SLi {
    public final ViewGroup LIZ;
    public boolean LIZIZ;
    public boolean LIZJ = true;
    public boolean LIZLLL;
    public List<Pair<ViewGroup, Boolean>> LJ;
    public List<Pair<ViewGroup, Boolean>> LJFF;

    public final void LIZ() {
        if (!this.LIZLLL) {
            this.LIZIZ = this.LIZ.getClipToOutline();
            this.LIZJ = this.LIZ.getClipChildren();
            this.LIZLLL = true;
        }
        if (this.LIZ.getClipToOutline()) {
            this.LIZ.setClipToOutline(false);
        }
        if (this.LIZ.getClipChildren()) {
            this.LIZ.setClipChildren(false);
        }
    }

    public final void LIZIZ() {
        if (this.LJ != null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ViewParent parent = this.LIZ.getParent();
        while (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.getClipChildren()) {
                arrayList.add(new Pair(parent, Boolean.TRUE));
                viewGroup.setClipChildren(false);
            }
            parent = viewGroup.getParent();
        }
        this.LJ = arrayList;
    }

    public final void LIZJ() {
        if (this.LIZLLL) {
            if (this.LIZIZ && this.LIZ.getOutlineProvider() != null) {
                this.LIZ.setClipToOutline(true);
            }
            if (this.LIZJ) {
                this.LIZ.setClipChildren(true);
            }
            this.LIZLLL = false;
        }
    }

    public final void LIZLLL() {
        List<Pair<ViewGroup, Boolean>> list = this.LJFF;
        if (list != null) {
            for (Pair<ViewGroup, Boolean> pair : list) {
                pair.getFirst().setClipToPadding(pair.getSecond().booleanValue());
            }
        }
        this.LJFF = null;
    }

    public final void LJ() {
        List<Pair<ViewGroup, Boolean>> list = this.LJ;
        if (list != null) {
            for (Pair<ViewGroup, Boolean> pair : list) {
                pair.getFirst().setClipChildren(pair.getSecond().booleanValue());
            }
        }
        this.LJ = null;
    }

    public C719800SLi(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }
}

package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0cPM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1010700cPM implements C0PPF {
    public final C1010580cPA LL;
    public final Aweme LLILLJJLI;
    public final List<AbstractC1010710cPN<View>> LLILLL;
    public List<? extends AbstractC1010710cPN<? extends View>> LLILZ;

    public abstract void LIZIZ();

    public abstract void LIZJ();

    @Override // X.C0PPF
    public final void unBind() {
    }

    @Override // X.C0PPF
    public void bind() {
        ViewGroup viewGroup = this.LL.LIZIZ;
        if (viewGroup != null) {
            C1009940cO8.LJI(viewGroup);
        }
        LIZJ();
        ViewGroup viewGroup2 = this.LL.LIZIZ;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        LIZIZ();
        List<AbstractC1010710cPN<View>> list = this.LLILLL;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (((AbstractC1010710cPN) obj).LJFF(this.LL)) {
                arrayList.add(obj);
            }
        }
        this.LLILZ = arrayList;
        List<AbstractC1010710cPN<View>> list2 = this.LLILLL;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (ArrayList) list2) {
            if (!((AbstractC1010710cPN) obj2).LJFF(this.LL)) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            View viewLIZIZ = ((AbstractC1010710cPN) it2.next()).LIZIZ();
            if (viewLIZIZ != null) {
                C786410Ut5.LJLLLLLL(8, viewLIZIZ);
            }
        }
        Iterator it3 = ((ArrayList) this.LLILZ).iterator();
        while (it3.hasNext()) {
            ((AbstractC1010710cPN) it3.next()).bind();
        }
    }

    @Override // X.C0PPF
    public final void onViewAttachedToWindow() {
        Iterator<? extends AbstractC1010710cPN<? extends View>> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            it2.next().onViewAttachedToWindow();
        }
    }

    @Override // X.C0PPF
    public final void onViewDetachedFromWindow() {
        Iterator<? extends AbstractC1010710cPN<? extends View>> it2 = this.LLILZ.iterator();
        while (it2.hasNext()) {
            it2.next().onViewDetachedFromWindow();
        }
    }

    public AbstractC1010700cPM(C1010580cPA c1010580cPA) {
        this.LL = c1010580cPA;
        this.LLILLJJLI = c1010580cPA.LJI.getAweme();
        ViewGroup viewGroup = c1010580cPA.LIZ;
        if (viewGroup != null) {
            viewGroup.getContext();
        }
        this.LLILLL = new ArrayList();
        this.LLILZ = new ArrayList();
    }
}

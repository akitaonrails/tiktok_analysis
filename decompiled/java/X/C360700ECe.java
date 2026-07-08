package X;

import android.util.SparseArray;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import java.util.List;

/* JADX INFO: renamed from: X.0ECe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360700ECe extends AbstractC527410KmJ {
    public final InterfaceC360550EBp LLILZ;
    public final List<C357590E0f> LLILZIL;
    public final SparseArray<AbstractC360500EBk> LLILZLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILZIL.size();
    }

    @Override // X.AbstractC527410KmJ
    public final UserVisibleHintGroupScene LJJIJL(int i) {
        C357590E0f c357590E0f = (C357590E0f) ListProtector.get(this.LLILZIL, i);
        AbstractC360500EBk abstractC360500EBk = this.LLILZLL.get(i);
        if (abstractC360500EBk == null) {
            AbstractC360500EBk abstractC360500EBkLIZ = this.LLILZ.LIZ(c357590E0f);
            abstractC360500EBkLIZ.disableSupportRestore();
            this.LLILZLL.put(i, abstractC360500EBkLIZ);
            return abstractC360500EBkLIZ;
        }
        return abstractC360500EBk;
    }

    public C360700ECe(C19A3 c19a3, InterfaceC360550EBp interfaceC360550EBp, List<C357590E0f> list) {
        super(c19a3);
        this.LLILZ = interfaceC360550EBp;
        this.LLILZIL = list;
        this.LLILZLL = new SparseArray<>();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        this.LLILLJJLI.remove((Scene) obj);
        if ((obj instanceof UserVisibleHintGroupScene) && obj != null) {
            this.LLILZLL.remove(i);
        }
    }
}

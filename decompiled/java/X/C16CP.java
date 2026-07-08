package X;

import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.bytedance.scene.group.UserVisibleHintGroupScene;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.16CP, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16CP extends AbstractC527410KmJ {
    public final InterfaceC20735516Cb LLILZ;
    public final Map<Integer, C16CS> LLILZIL;
    public List<TikTokMediaModel> LLILZLL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.LLILZLL.size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        if (((LinkedHashMap) this.LLILZIL).containsValue(obj)) {
            return -1;
        }
        return -2;
    }

    @Override // X.AbstractC527410KmJ
    public final UserVisibleHintGroupScene LJJIJL(int i) {
        TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(i, this.LLILZLL);
        C16CV c16cv = new C16CV();
        c16cv.LLJJIJIIJIL = this.LLILZ;
        c16cv.LLJJIJIL = tikTokMediaModel;
        this.LLILZIL.put(Integer.valueOf(i), c16cv);
        return c16cv;
    }

    public C16CP(C19A3 c19a3, InterfaceC20735516Cb interfaceC20735516Cb) {
        super(c19a3);
        this.LLILZ = interfaceC20735516Cb;
        this.LLILZIL = new LinkedHashMap();
        this.LLILZLL = new ArrayList();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        this.LLILLJJLI.remove((Scene) obj);
        if ((obj instanceof C16CS) && obj != null) {
            this.LLILZIL.remove(Integer.valueOf(i));
        }
    }
}

package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyReverseExperiment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766950U6r extends PagerAdapter {
    public final DataChannel LLILLJJLI;
    public final LiveSmallItemBeautyViewModel LLILLL;
    public final ComposerFilterViewModel LLILZ;
    public C766590U5h LLIZLLLIL;
    public C761510Tu1 LLJ;
    public AbstractC761520Tu2 LLJIJIL;
    public LifecycleOwner LLJILJIL;
    public final List<String> LLILZIL = new ArrayList();
    public final List<String> LLILZLL = new ArrayList();
    public final HashMap<String, AbstractC761520Tu2> LLIZ = new HashMap<>();
    public int LLJI = -1;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIJJ(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LLILZIL).size() + 1;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIJJLI(int i) {
        if (i == ((ArrayList) this.LLILZIL).size()) {
            return C0UD4.LJI;
        }
        return (CharSequence) ListProtector.get(this.LLILZIL, i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJJI(int i, ViewGroup viewGroup) {
        AbstractC761520Tu2 abstractC761520Tu2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((ArrayList) this.LLILZIL).size());
        sbLIZ.append(", ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(C13LP.LJJLIIIJ(this.LLILZIL, ",", null, null, 0, null, null, 62));
        C20441214yg.LIZIZ("AIBeauty", C2188811AlT.LIZIZ(sbLIZ));
        if (!(!((ArrayList) this.LLILZIL).isEmpty()) && !LiveBeautyReverseExperiment.INSTANCE.isInExperiment()) {
            C766590U5h c766590U5h = this.LLIZLLLIL;
            abstractC761520Tu2 = c766590U5h;
            if (c766590U5h == null) {
                C766590U5h c766590U5h2 = new C766590U5h(viewGroup, this.LLILLJJLI, this.LLILLL, "beauty", "beauty");
                this.LLIZLLLIL = c766590U5h2;
                abstractC761520Tu2 = c766590U5h2;
            }
        } else if (i == ((ArrayList) this.LLILZIL).size()) {
            C761510Tu1 c761510Tu1 = this.LLJ;
            abstractC761520Tu2 = c761510Tu1;
            if (c761510Tu1 == null) {
                C761510Tu1 c761510Tu12 = new C761510Tu1(viewGroup, this.LLILLJJLI, this.LLILZ, this.LLJILJIL);
                this.LLJ = c761510Tu12;
                abstractC761520Tu2 = c761510Tu12;
            }
        } else if (LiveAIBeautySetting.INSTANCE.enableAIBeauty() && Intrinsics.LJFF(C13LP.LJJJLZIJ(i, this.LLILZIL), "optimize")) {
            DataChannel dataChannel = this.LLILLJJLI;
            LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = this.LLILLL;
            ListProtector.get(this.LLILZIL, i);
            ListProtector.get(this.LLILZLL, i);
            C0U7H c0u7h = new C0U7H(viewGroup, dataChannel, liveSmallItemBeautyViewModel);
            this.LLIZ.put((String) ListProtector.get(this.LLILZIL, i), c0u7h);
            abstractC761520Tu2 = c0u7h;
        } else {
            C766590U5h c766590U5h3 = new C766590U5h(viewGroup, this.LLILLJJLI, this.LLILLL, (String) ListProtector.get(this.LLILZIL, i), (String) ListProtector.get(this.LLILZLL, i));
            this.LLIZ.put((String) ListProtector.get(this.LLILZIL, i), c766590U5h3);
            abstractC761520Tu2 = c766590U5h3;
        }
        viewGroup.addView(abstractC761520Tu2.LIZ);
        return abstractC761520Tu2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJJIFFI(View view, Object obj) {
        if (obj instanceof C766590U5h) {
            return Intrinsics.LJFF(((AbstractC761520Tu2) obj).LIZ, view);
        }
        if (obj instanceof C761510Tu1) {
            return Intrinsics.LJFF(((AbstractC761520Tu2) obj).LIZ, view);
        }
        if (obj instanceof C0U7H) {
            return Intrinsics.LJFF(((AbstractC761520Tu2) obj).LIZ, view);
        }
        return false;
    }

    public C766950U6r(DataChannel dataChannel, LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, ComposerFilterViewModel composerFilterViewModel) {
        this.LLILLJJLI = dataChannel;
        this.LLILLL = liveSmallItemBeautyViewModel;
        this.LLILZ = composerFilterViewModel;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIZILJ(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof AbstractC761520Tu2) {
            AbstractC761520Tu2 abstractC761520Tu2 = (AbstractC761520Tu2) obj;
            abstractC761520Tu2.LIZJ();
            C786410Ut5.LJJJLZIJ(abstractC761520Tu2.LIZ, viewGroup);
        }
        if (((obj instanceof C766590U5h) || (obj instanceof C0U7H)) && i >= 0 && i < ((ArrayList) this.LLILZIL).size()) {
            this.LLIZ.remove(ListProtector.get(this.LLILZIL, i));
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJJIIZ(ViewGroup viewGroup, int i, Object obj) {
        AbstractC761520Tu2 abstractC761520Tu2;
        if (!Intrinsics.LJFF(this.LLJIJIL, obj)) {
            if (obj instanceof AbstractC761520Tu2) {
                abstractC761520Tu2 = (AbstractC761520Tu2) obj;
            } else {
                abstractC761520Tu2 = null;
            }
            this.LLJIJIL = abstractC761520Tu2;
            if (abstractC761520Tu2 != null) {
                abstractC761520Tu2.LIZLLL();
            }
        }
    }
}

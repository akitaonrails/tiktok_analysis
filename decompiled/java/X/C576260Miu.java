package X;

import Y.ARunnableS77S0200000_8;
import android.view.View;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS252S0300000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Miu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576260Miu extends AbstractC2255721DQs<InterfaceC568220MQi> implements InterfaceC379610EuV, InterfaceC568220MQi {
    public static final int LLJ = 8;
    public final int LL;
    public final Scene LLILLJJLI;
    public final ForwardMedia LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final C1DRG LLILZLL;
    public final Map<String, List<Function1<C0LAB, Unit>>> LLIZ = new LinkedHashMap();
    public final C01GW LLIZLLLIL;

    public InterfaceC568220MQi W1() {
        return this;
    }

    private final C576250Mit X1() {
        return (C576250Mit) this.LLIZLLLIL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC568220MQi
    public void gx1() {
        C576250Mit c576250MitX1 = X1();
        Iterator<View> it2 = c576250MitX1.LLJILJIL.LIZ().iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                break;
            }
            View view = (View) c09re.next();
            if (!Intrinsics.LJFF(view.getTag(R.id.pku), "view_will_remove")) {
                view.setTag(R.id.pku, "view_will_remove");
                view.animate().alpha(0.0f).scaleX(0.9f).scaleY(0.9f).setDuration(200L).withEndAction(new ARunnableS77S0200000_8(c576250MitX1, view, 31)).start();
            }
        }
        C576270Miv c576270Miv = c576250MitX1.LLJJIII;
        if (((C576280Miw) c576270Miv.LIZLLL.LIZ).LIZ != -1 && (!c576270Miv.LJII.isEmpty())) {
            int size = c576270Miv.LJII.isEmpty() ? -1 : (c576270Miv.LJI + 1) % c576270Miv.LJII.size();
            c576270Miv.LJI = size;
            Integer num = (Integer) C13LP.LJJJLZIJ(size, c576270Miv.LJII);
            c576270Miv.LIZ(num != null ? num.intValue() : -1);
        }
        Iterator<View> it3 = c576250MitX1.LLJILJIL.LIZ().iterator();
        while (true) {
            C09RE c09re2 = (C09RE) it3;
            if (!c09re2.hasNext()) {
                return;
            }
            View view2 = (View) c09re2.next();
            if (!Intrinsics.LJFF(view2.getTag(R.id.pku), "view_will_remove")) {
                C786410Ut5.T4(view2, 0.0f);
                C786410Ut5.Ob(view2, 0.9f);
                C786410Ut5.pc(view2, 0.9f);
                view2.animate().alpha(1.0f).scaleY(1.0f).scaleY(1.0f).setDuration(200L).start();
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        X1().LIZIZ();
    }

    @Override // X.InterfaceC568220MQi
    public void rg2() {
        X1().LIZJ();
    }

    public final int Z1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILZLL;
    }

    public final int getHeight() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC568220MQi
    public void zM0(String str, Function1<? super C0LAB, Unit> function1) {
        Map<String, List<Function1<C0LAB, Unit>>> map = this.LLIZ;
        List<Function1<C0LAB, Unit>> arrayList = map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(str, arrayList);
        }
        arrayList.add(function1);
    }

    public C576260Miu(int i, View view, Scene scene, ForwardMedia forwardMedia, int i2, int i3, C1DRG c1drg, Function0<Unit> function0) {
        this.LL = i;
        this.LLILLJJLI = scene;
        this.LLILLL = forwardMedia;
        this.LLILZ = i2;
        this.LLILZIL = i3;
        this.LLILZLL = c1drg;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS252S0300000_8(view, (View) this, (C576260Miu) function0, (Function0<Unit>) 36));
    }
}

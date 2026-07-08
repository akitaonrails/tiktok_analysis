package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15o2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20630015o2 extends C09AY implements Function0<List<? extends Fragment>> {
    public final /* synthetic */ InterfaceC20622815ms LL;
    public final /* synthetic */ FragmentManager LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20630015o2(FragmentManager fragmentManager, InterfaceC20622815ms interfaceC20622815ms) {
        super(0);
        this.LL = interfaceC20622815ms;
        this.LLILLJJLI = fragmentManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Fragment> invoke() {
        InterfaceC214897198d interfaceC214897198d;
        C214932199m dynamicParentScene;
        SAFFragmentRootScene sAFFragmentRootScene;
        InterfaceC214902198i interfaceC214902198i;
        List<InterfaceC20630715o9> listLIZIZ = C20629915o1.LIZIZ(this.LL);
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC20630715o9> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            InterfaceC214902198i interfaceC214902198iF0 = it2.next().F0();
            if ((interfaceC214902198iF0 instanceof Fragment) && interfaceC214902198iF0 != null) {
                arrayList.add(interfaceC214902198iF0);
            }
        }
        Set setLJIIIZ = C15442062u.LJIIIZ(C13LP.LLIIJI(arrayList), this.LLILLJJLI.LJJLIIIJL());
        InterfaceC20622815ms interfaceC20622815ms = this.LL;
        if ((interfaceC20622815ms instanceof InterfaceC214897198d) && (interfaceC214897198d = (InterfaceC214897198d) interfaceC20622815ms) != null && (dynamicParentScene = interfaceC214897198d.getDynamicParentScene()) != null && (sAFFragmentRootScene = dynamicParentScene.LLJI) != null && (interfaceC214902198i = sAFFragmentRootScene.LLJJ) != null) {
            setLJIIIZ = C15442062u.LJIIIIZZ(interfaceC214902198i, setLJIIIZ);
        }
        return C13LP.LLIIII(setLJIIIZ);
    }
}

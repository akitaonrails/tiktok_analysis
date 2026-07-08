package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0w14, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1764440w14 implements InterfaceC1146704e9 {
    public final InterfaceC665370Q7z LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1266));
    public boolean LLILLL;

    public static final void LJI() {
    }

    public void LJII() {
    }

    public abstract boolean LJIIIIZZ(String str, List list, Boolean bool, Map map);

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SeaPdpFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SeaPdpFragmentScope.class);
        return arrayList;
    }

    public AbstractC1764440w14(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = interfaceC665370Q7z;
        new WeakReference(this);
    }
}

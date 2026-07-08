package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.SeaHeadViewHolderScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0w0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1764240w0k<T extends View, VO> implements InterfaceC1146704e9 {
    public final T LL;
    public final InterfaceC665370Q7z LLILLJJLI;
    public boolean LLILLL;
    public C1068804Fy LLILZ;
    public VO LLILZIL;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1294));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1293));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1291));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1292));

    public abstract FrameLayout.LayoutParams LJIIJJI();

    public abstract boolean LJIILIIL(VO vo);

    public void LJIILJJIL() {
    }

    public void LJIILL() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SeaPdpFragmentScope.class, SeaHeadViewHolderScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SeaPdpFragmentScope.class);
        arrayList.add(SeaHeadViewHolderScope.class);
        return arrayList;
    }

    public final ISeaListHelper LJIIL() {
        return (ISeaListHelper) this.LLIZ.getValue();
    }

    public AbstractC1764240w0k(T t, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LL = t;
        this.LLILLJJLI = interfaceC665370Q7z;
    }
}

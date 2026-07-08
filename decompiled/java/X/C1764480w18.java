package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.SeaHeadViewHolderScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.image.ISeaHeadImageHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.pendant.ISeaPendantHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track.ISeaTrackHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.godav1.SeaPdpHeadGodaV1ViewHolder;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0w18, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764480w18 implements InterfaceC713360RyY, InterfaceC737790Swr {
    public final SeaPdpHeadGodaV1ViewHolder LL;
    public final Fragment LLILLJJLI;
    public final InterfaceC665370Q7z LLILLL;
    public final Lifecycle LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(537));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1605));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1601));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1602));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1600));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1603));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1604));

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILZLL.getValue();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SeaHeadViewHolderScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLJ.getValue(), ISeaHeadContainerHelper.class);
        c0qsjLIZIZ.unbindAbility(this.LLIZ.getValue(), ISeaHeadImageHelper.class);
        c0qsjLIZIZ.unbindAbility(this.LLIZLLLIL.getValue(), ISeaListHelper.class);
        c0qsjLIZIZ.unbindAbility(this.LLJI.getValue(), ISeaPendantHelper.class);
        c0qsjLIZIZ.unbindAbility(this.LLJIJIL.getValue(), ISeaTrackHelper.class);
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{SeaHeadViewHolderScope.class});
        c0qsjLIZIZ.bindAbility(this.LLJ.getValue(), ISeaHeadContainerHelper.class);
        c0qsjLIZIZ.bindAbility(this.LLIZ.getValue(), ISeaHeadImageHelper.class);
        c0qsjLIZIZ.bindAbility(this.LLIZLLLIL.getValue(), ISeaListHelper.class);
        c0qsjLIZIZ.bindAbility(this.LLJI.getValue(), ISeaPendantHelper.class);
        c0qsjLIZIZ.bindAbility(this.LLJIJIL.getValue(), ISeaTrackHelper.class);
    }

    public C1764480w18(SeaPdpHeadGodaV1ViewHolder seaPdpHeadGodaV1ViewHolder, Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z, LifecycleRegistry lifecycleRegistry) {
        this.LL = seaPdpHeadGodaV1ViewHolder;
        this.LLILLJJLI = fragment;
        this.LLILLL = interfaceC665370Q7z;
        this.LLILZ = lifecycleRegistry;
    }
}

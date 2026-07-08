package X;

import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;
import kotlin.jvm.internal.AwS659S0100000_10;

/* JADX INFO: renamed from: X.0Qhd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677390Qhd implements InterfaceC676500QgC {
    public C676510QgD LL;
    public C054G LLILLJJLI;
    public C678140Qiq LLILLL;
    public MixShopSearchBizVM LLILZ;
    public C678130Qip LLILZIL;
    public final AwS659S0100000_10 LLILZLL = new AwS659S0100000_10(this, 8);
    public final AwS624S0100000_10 LLIZ = new AwS624S0100000_10(this, 95);
    public final AwS554S0100000_10 LLIZLLLIL = new AwS554S0100000_10(this, 993);

    @Override // X.InterfaceC676500QgC
    public final void onCreate() {
    }

    @Override // X.InterfaceC676500QgC
    public final void onPause() {
    }

    @Override // X.InterfaceC676500QgC
    public final void onResume() {
    }

    @Override // X.InterfaceC676500QgC
    public final void onDestroy() {
        C054G c054g = this.LLILLJJLI;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, null);
        }
        this.LLILLJJLI = null;
        this.LL = null;
    }
}

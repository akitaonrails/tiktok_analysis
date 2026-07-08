package X;

import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0Qiy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678220Qiy implements InterfaceC676500QgC {
    public C678230Qiz LL;
    public C678130Qip LLILLJJLI;
    public MixShopSearchBizVM LLILLL;

    @Override // X.InterfaceC676500QgC
    public final void onCreate() {
    }

    @Override // X.InterfaceC676500QgC
    public final void onDestroy() {
    }

    @Override // X.InterfaceC676500QgC
    public final void onPause() {
    }

    @Override // X.InterfaceC676500QgC
    public final void onResume() {
    }

    public final List<C0DXR> LIZ() {
        List<C0DXR> list;
        Iterable iterable;
        C678230Qiz c678230Qiz = this.LL;
        List<C0DXR> listSingletonList = Collections.singletonList(new C0HA2(c678230Qiz != null ? c678230Qiz.LIZLLL : null));
        C678230Qiz c678230Qiz2 = this.LL;
        if (c678230Qiz2 == null || (list = c678230Qiz2.LJIIIIZZ) == null || list.isEmpty()) {
            return listSingletonList;
        }
        C678230Qiz c678230Qiz3 = this.LL;
        if (c678230Qiz3 == null || (iterable = c678230Qiz3.LJIIIIZZ) == null) {
            iterable = C13BV.INSTANCE;
        }
        return C13LP.LJLIL(iterable, listSingletonList);
    }
}

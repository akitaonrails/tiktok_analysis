package X;

import com.ss.android.ugc.aweme.im.avatarloader.api.IMAvatarLoaderApi;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelPreloadSortedListViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZCA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelPreloadSortedListViewModel$preLoadShareList$1$1", f = "SharePanelPreloadSortedListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0ZCA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SharePanelPreloadSortedListViewModel LL;
    public final /* synthetic */ List<IMContact> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0ZCA(SharePanelPreloadSortedListViewModel sharePanelPreloadSortedListViewModel, List<? extends IMContact> list, InterfaceC1364105Vn<? super C0ZCA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = sharePanelPreloadSortedListViewModel;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZCA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SharePanelPreloadSortedListViewModel@c97c.preLoadShareList$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SharePanelPreloadSortedListViewModel sharePanelPreloadSortedListViewModel = this.LL;
        List listLL = C13LP.LL(this.LLILLJJLI, 6);
        sharePanelPreloadSortedListViewModel.getClass();
        Iterator it2 = listLL.iterator();
        while (it2.hasNext()) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(((BaseContact) it2.next()).getDisplayAvatar()));
            if (C289770BXj.LIZ()) {
                IMAvatarLoaderApi.LIZ.getClass();
                C04TK.LIZIZ.LIZLLL(c1331670kl3LJIIIIZZ);
            } else {
                c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
            }
            c1331670kl3LJIIIIZZ.LJJIFFI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SharePanelPreloadSortedListViewModel@c97c.preLoadShareList$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

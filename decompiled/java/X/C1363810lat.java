package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelPreloadSortedListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelPreloadSortedListViewModel$preLoadShareList$1", f = "SharePanelPreloadSortedListViewModel.kt", l = {82, 97}, m = "invokeSuspend")
public final class C1363810lat extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<IMContact>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1364850lcZ LLILLL;
    public final /* synthetic */ C1368260li4 LLILZ;
    public final /* synthetic */ SharePanelPreloadSortedListViewModel LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1363810lat(C1364850lcZ c1364850lcZ, C1368260li4 c1368260li4, SharePanelPreloadSortedListViewModel sharePanelPreloadSortedListViewModel, long j, InterfaceC1364105Vn<? super C1363810lat> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1364850lcZ;
        this.LLILZ = c1368260li4;
        this.LLILZIL = sharePanelPreloadSortedListViewModel;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1363810lat c1363810lat = new C1363810lat(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1363810lat.LLILLJJLI = obj;
        return c1363810lat;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1363810lat.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<IMContact>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.detail.edm.viewmodel.SearchEDMVideoDetailSharedVM$onRefresh$searchAwemeItem$1", f = "SearchEDMVideoDetailSharedVM.kt", l = {}, m = "invokeSuspend")
public final class C326230Cqb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C209500rN>>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326230Cqb(int i, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = i;
        this.LLILZ = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326230Cqb(this.LLILLL, this.LL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List listSingletonList;
        C1C7U.LIZ("SearchEDMVideoDetailSharedVM@b342.onRefresh$searchAwemeItem$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Aweme aweme = (Aweme) DetailApi.LIZIZ(this.LLILLL, this.LL, this.LLILLJJLI, this.LLILZ).getSecond();
        if (aweme != null && C123100dR.LIZ(aweme.getAid())) {
            listSingletonList = Collections.singletonList(new C209500rN(aweme));
        } else {
            listSingletonList = null;
        }
        C1C7U.LIZIZ("SearchEDMVideoDetailSharedVM@b342.onRefresh$searchAwemeItem$1");
        return listSingletonList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends C209500rN>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

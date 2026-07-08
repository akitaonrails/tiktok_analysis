package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectPagingScene;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0J17, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectPagingScene$setupListContainer$3$8$1", f = "MaterialSelectPagingScene.kt", l = {}, m = "invokeSuspend")
public final class C0J17 extends C09AX implements Function2<List<? extends OnThisDayTiktokMediaModel>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MaterialSelectPagingScene LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0J17(MaterialSelectPagingScene materialSelectPagingScene, InterfaceC1364105Vn<? super C0J17> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = materialSelectPagingScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0J17 c0j17 = new C0J17(this.LLILLJJLI, interfaceC1364105Vn);
        c0j17.LL = obj;
        return c0j17;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MaterialSelectPagingScene@7b25.setupListContainer$3$8$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Collection collection = (Collection) this.LL;
        C0J1D c0j1d = this.LLILLJJLI.LLLFF;
        if (c0j1d != null) {
            c0j1d.LLLI(new ArrayList(collection));
            C2286608xc.LJ(0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MaterialSelectPagingScene@7b25.setupListContainer$3$8$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends OnThisDayTiktokMediaModel> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

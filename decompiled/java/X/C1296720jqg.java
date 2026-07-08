package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells.LoadingV2Cell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0jqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.v2.cells.LoadingV2Cell$onCreateItemView$3", f = "LoadingV2Cell.kt", l = {107}, m = "invokeSuspend")
public final class C1296720jqg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LoadingV2Cell LLILLJJLI;
    public final /* synthetic */ ViewGroup LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1296720jqg(LoadingV2Cell loadingV2Cell, ViewGroup viewGroup, InterfaceC1364105Vn<? super C1296720jqg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = loadingV2Cell;
        this.LLILLL = viewGroup;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1296720jqg(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1294160jmY c1294160jmY;
        PlayerController playerController;
        C1C7U.LIZ("LoadingV2Cell@95b8.onCreateItemView$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            LoadingV2Cell loadingV2Cell = this.LLILLJJLI;
            Context context = this.LLILLL.getContext();
            this.LL = 1;
            obj = loadingV2Cell.P5(context, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LoadingV2Cell@95b8.onCreateItemView$3");
                return objLJFF;
            }
        }
        DataSource dataSource = (DataSource) obj;
        if (dataSource != null && (c1294160jmY = this.LLILLJJLI.LLILZIL) != null && (playerController = c1294160jmY.LLILLJJLI) != null) {
            playerController.start(dataSource);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LoadingV2Cell@95b8.onCreateItemView$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

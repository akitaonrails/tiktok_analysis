package X;

import com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxHorizontalTopListCombinePod;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS159S1100000_10;
import njp.a;

/* JADX INFO: renamed from: X.0PDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.InboxSkylightWidgetV2$rerankSkylight$1", f = "InboxSkylightWidgetV2.kt", l = {1407}, m = "invokeSuspend")
public final class C641300PDk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SkylightListViewModel LLILLJJLI;
    public final /* synthetic */ InboxSkylightWidgetV2 LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C641300PDk(SkylightListViewModel skylightListViewModel, InboxSkylightWidgetV2 inboxSkylightWidgetV2, String str, InterfaceC1364105Vn<? super C641300PDk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = skylightListViewModel;
        this.LLILLL = inboxSkylightWidgetV2;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C641300PDk(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSkylightWidgetV2@8936.rerankSkylight$1");
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
            SkylightListViewModel skylightListViewModel = this.LLILLJJLI;
            InboxHorizontalTopListCombinePod inboxHorizontalTopListCombinePod = this.LLILLL.LLJJJJLIIL;
            AwS159S1100000_10 awS159S1100000_10 = new AwS159S1100000_10(this.LLILLJJLI, this.LLILZ, 5);
            this.LL = 1;
            if (skylightListViewModel.NQ2(inboxHorizontalTopListCombinePod, awS159S1100000_10, this) == objLJFF) {
                C1C7U.LIZIZ("InboxSkylightWidgetV2@8936.rerankSkylight$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxSkylightWidgetV2@8936.rerankSkylight$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

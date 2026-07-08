package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.services.ICommentTopBarAbilityService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarText;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lHG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.comment.TTEcCommentTopBarImpl$onBindComponentView$1", f = "TTEcCommentTopBarImpl.kt", l = {70}, m = "invokeSuspend")
public final class C1351640lHG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1351650lHH LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Aweme LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1351640lHG(AbstractC1351650lHH abstractC1351650lHH, Fragment fragment, Integer num, String str, Aweme aweme, InterfaceC1364105Vn<? super C1351640lHG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1351650lHH;
        this.LLILLL = fragment;
        this.LLILZ = num;
        this.LLILZIL = str;
        this.LLILZLL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1351640lHG(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252321DDq c2252321DDqLIZIZ;
        C1C7U.LIZ("TTEcCommentTopBarImpl@ec2f.onBindComponentView$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AbstractC1351650lHH abstractC1351650lHH = this.LLILLJJLI;
            if (abstractC1351650lHH != null && (c2252321DDqLIZIZ = abstractC1351650lHH.LIZIZ()) != null) {
                final Fragment fragment = this.LLILLL;
                final Integer num = this.LLILZ;
                final String str = this.LLILZIL;
                final Aweme aweme = this.LLILZLL;
                InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0lHE
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                        ICommentTopBarAbilityService iCommentTopBarAbilityService;
                        String str2 = (String) obj2;
                        if (C1533950q1J.LJ(str2) && (iCommentTopBarAbilityService = (ICommentTopBarAbilityService) C13LP.LJJJLIIL(ServiceManager.get().getServices(ICommentTopBarAbilityService.class))) != null) {
                            iCommentTopBarAbilityService.LIZ(fragment, num.intValue(), str, aweme, null, null, null, null, null, new CommentTopBarText(str2, null, null, null), null);
                        }
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (c2252321DDqLIZIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                    C1C7U.LIZIZ("TTEcCommentTopBarImpl@ec2f.onBindComponentView$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TTEcCommentTopBarImpl@ec2f.onBindComponentView$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

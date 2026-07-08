package X;

import com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService;
import com.ss.android.ugc.aweme.base.vm.MentionListViewModel;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import njp.a;

/* JADX INFO: renamed from: X.0CZa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.MentionListViewModel$mixSearchRefresh$2$1", f = "MentionListViewModel.kt", l = {517, 529}, m = "invokeSuspend")
public final class C315680CZa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends List<? extends C20611915l7>, ? extends C237600vu>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<List<C20611915l7>> LLILLL;
    public final /* synthetic */ MentionListViewModel LLILZ;
    public final /* synthetic */ List<C20611915l7> LLILZIL;
    public final /* synthetic */ AnonymousClass0957<C237600vu> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C315680CZa(AnonymousClass0957<? extends List<C20611915l7>> anonymousClass0957, MentionListViewModel mentionListViewModel, List<C20611915l7> list, AnonymousClass0957<C237600vu> anonymousClass09572, InterfaceC1364105Vn<? super C315680CZa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0957;
        this.LLILZ = mentionListViewModel;
        this.LLILZIL = list;
        this.LLILZLL = anonymousClass09572;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315680CZa(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("MentionListViewModel@ff55.mixSearchRefresh$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    obj2 = this.LL;
                    C155000ia.LIZIZ(obj);
                    Pair pair = new Pair(obj2, obj);
                    C1C7U.LIZIZ("MentionListViewModel@ff55.mixSearchRefresh$2$1");
                    return pair;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0957<List<C20611915l7>> anonymousClass0957 = this.LLILLL;
            this.LLILLJJLI = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MentionListViewModel@ff55.mixSearchRefresh$2$1");
                return objLJFF;
            }
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            HorizontalMentionMixSearchService horizontalMentionMixSearchServiceWQ2 = this.LLILZ.wQ2();
            List<C20611915l7> list2 = this.LLILZIL;
            C13BV c13bv = C13BV.INSTANCE;
            horizontalMentionMixSearchServiceWQ2.getClass();
            List<C20611915l7> listLJIIIZ = HorizontalMentionMixSearchService.LJIIIZ(list2, list, c13bv, AFwS232S0000000_4.get$arr$(192));
            MentionListViewModel mentionListViewModel = this.LLILZ;
            mentionListViewModel.GQ2(mentionListViewModel.IQ2(listLJIIIZ), true);
        }
        AnonymousClass0957<C237600vu> anonymousClass09572 = this.LLILZLL;
        this.LL = list;
        this.LLILLJJLI = 2;
        Object objLJLIIIL = anonymousClass09572.LJLIIIL(this);
        if (objLJLIIIL == objLJFF) {
            C1C7U.LIZIZ("MentionListViewModel@ff55.mixSearchRefresh$2$1");
            return objLJFF;
        }
        obj2 = list;
        obj = objLJLIIIL;
        Pair pair2 = new Pair(obj2, obj);
        C1C7U.LIZIZ("MentionListViewModel@ff55.mixSearchRefresh$2$1");
        return pair2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends List<? extends C20611915l7>, ? extends C237600vu>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

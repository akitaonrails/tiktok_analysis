package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.IMentionMixSearchService;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import njp.a;

/* JADX INFO: renamed from: X.0Cc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel$performMixSearchRefresh$2$1", f = "StoryUserListViewModel.kt", l = {425, 443}, m = "invokeSuspend")
public final class C317250Cc7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends List<? extends User>, ? extends C00ED>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<List<User>> LLILLL;
    public final /* synthetic */ IMentionMixSearchService LLILZ;
    public final /* synthetic */ List<User> LLILZIL;
    public final /* synthetic */ StoryUserListViewModel LLILZLL;
    public final /* synthetic */ AnonymousClass0957<C00ED> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C317250Cc7(AnonymousClass0957<? extends List<? extends User>> anonymousClass0957, IMentionMixSearchService iMentionMixSearchService, List<? extends User> list, StoryUserListViewModel storyUserListViewModel, AnonymousClass0957<C00ED> anonymousClass09572, InterfaceC1364105Vn<? super C317250Cc7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0957;
        this.LLILZ = iMentionMixSearchService;
        this.LLILZIL = list;
        this.LLILZLL = storyUserListViewModel;
        this.LLIZ = anonymousClass09572;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317250Cc7(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("StoryUserListViewModel@f7dd.performMixSearchRefresh$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    obj2 = this.LL;
                    C155000ia.LIZIZ(obj);
                    Pair pair = new Pair(obj2, obj);
                    C1C7U.LIZIZ("StoryUserListViewModel@f7dd.performMixSearchRefresh$2$1");
                    return pair;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0957<List<User>> anonymousClass0957 = this.LLILLL;
            this.LLILLJJLI = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("StoryUserListViewModel@f7dd.performMixSearchRefresh$2$1");
                return objLJFF;
            }
        }
        List<? extends User> list = (List) obj;
        if (!list.isEmpty()) {
            List<User> listLJII = this.LLILZ.LJII(this.LLILZIL, list, C13BV.INSTANCE);
            List<User> list2 = this.LLILZIL;
            HashSet hashSet = new HashSet();
            Iterator<User> it2 = list2.iterator();
            while (it2.hasNext()) {
                hashSet.add(it2.next().getUid());
            }
            StoryUserListViewModel storyUserListViewModel = this.LLILZLL;
            List<C317160Cby> listEQ2 = storyUserListViewModel.EQ2(listLJII, hashSet, null);
            storyUserListViewModel.listClear();
            storyUserListViewModel.listAddAll(listEQ2);
            if (!((C325570CpX) storyUserListViewModel.getState()).LLILLJJLI) {
                storyUserListViewModel.setState(AFwS232S0000000_4.get$arr$(252));
            }
        }
        AnonymousClass0957<C00ED> anonymousClass09572 = this.LLIZ;
        this.LL = list;
        this.LLILLJJLI = 2;
        Object objLJLIIIL = anonymousClass09572.LJLIIIL(this);
        if (objLJLIIIL == objLJFF) {
            C1C7U.LIZIZ("StoryUserListViewModel@f7dd.performMixSearchRefresh$2$1");
            return objLJFF;
        }
        obj2 = list;
        obj = objLJLIIIL;
        Pair pair2 = new Pair(obj2, obj);
        C1C7U.LIZIZ("StoryUserListViewModel@f7dd.performMixSearchRefresh$2$1");
        return pair2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends List<? extends User>, ? extends C00ED>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

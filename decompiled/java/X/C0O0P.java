package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.story.service.StoryServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O0P, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.service.StoryServiceImpl$filterAlreadyViewedInFeed$1", f = "StoryServiceImpl.kt", l = {289}, m = "invokeSuspend")
public final class C0O0P extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public StoryServiceImpl LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ Function1<T, List<Aweme>> LLILZLL;

    /* JADX INFO: Incorrect field signature: TT; */
    public final /* synthetic */ C0X12 LLIZ;
    public final /* synthetic */ StoryServiceImpl LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;+Ljava/util/List<+Lcom/ss/android/ugc/aweme/feed/model/Aweme;>;>;TT;Lcom/ss/android/ugc/aweme/story/service/StoryServiceImpl;Ljava/lang/String;LX/05Vn<-LX/0O0P;>;)V */
    public C0O0P(Function1 function1, C0X12 c0x12, StoryServiceImpl storyServiceImpl, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = function1;
        this.LLIZ = c0x12;
        this.LLIZLLLIL = storyServiceImpl;
        this.LLJ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0O0P c0o0p = new C0O0P(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c0o0p.LLILZIL = obj;
        return c0o0p;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0X12 c0x12;
        StoryServiceImpl storyServiceImpl;
        String str;
        List<Aweme> list;
        UserStoryCurrentInfo currentInfo;
        UserStory userStory;
        List<Aweme> stories;
        Aweme aweme;
        String aid;
        C1C7U.LIZ("StoryServiceImpl@9399.filterAlreadyViewedInFeed$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        try {
            if (i != 0) {
                if (i == 1) {
                    List list2 = (List) this.LLILLL;
                    str = (String) this.LLILLJJLI;
                    storyServiceImpl = this.LL;
                    c0x12 = (C0X12) this.LLILZIL;
                    C155000ia.LIZIZ(obj);
                    list = list2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                Function1<T, List<Aweme>> function1 = this.LLILZLL;
                c0x12 = this.LLIZ;
                storyServiceImpl = this.LLIZLLLIL;
                str = this.LLJ;
                List listLJJJJLI = C13LP.LJJJJLI(function1.invoke((T) c0x12));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (ArrayList) listLJJJJLI) {
                    if (C729510SjV.LJJIJIL((Aweme) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.isEmpty()) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StoryServiceImpl@9399.filterAlreadyViewedInFeed$1");
                    return unit;
                }
                C11NZ<List<C0VNS>> c11nzLJFF = C1593830rZt.LIZIZ.LJFF();
                this.LLILZIL = c0x12;
                this.LL = storyServiceImpl;
                this.LLILLJJLI = str;
                this.LLILLL = arrayList;
                this.LLILZ = 1;
                obj = C11UD.LIZJ(c11nzLJFF, this);
                list = arrayList;
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("StoryServiceImpl@9399.filterAlreadyViewedInFeed$1");
                    return objLJFF;
                }
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C0VNS) it2.next()).LIZ);
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList2);
            for (Aweme aweme2 : list) {
                UserStory userStory2 = aweme2.getUserStory();
                if (userStory2 != null) {
                    currentInfo = userStory2.getCurrentInfo();
                } else {
                    currentInfo = null;
                }
                if (currentInfo == null && (userStory = aweme2.getUserStory()) != null && (stories = userStory.getStories()) != null && (aweme = (Aweme) C13LP.LJJJLZIJ(0, stories)) != null && (aid = aweme.getAid()) != null && setLLIIJI.contains(aid)) {
                    String requestId = c0x12.getRequestId();
                    storyServiceImpl.getClass();
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", str);
                    c2344009Gk.LJIIIIZZ("group_id", aid);
                    c2344009Gk.LJIIIIZZ("request_id", requestId);
                    C20684815ws.LJIILLIIL("story_already_viewed", c2344009Gk.LIZ);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryServiceImpl@9399.filterAlreadyViewedInFeed$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

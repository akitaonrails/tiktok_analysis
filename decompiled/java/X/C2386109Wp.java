package X;

import com.ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.friends.model.SummonFriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09Wp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.sharedar.viewmodel.SessionShareViewModel$realSearchFriendsByKeyV1$2", f = "SessionShareViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2386109Wp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SummonFriendList>, Object> {
    public final /* synthetic */ C2385709Wl LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2386109Wp(C2385709Wl c2385709Wl, long j, long j2, String str, String str2, InterfaceC1364105Vn<? super C2386109Wp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2385709Wl;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2386109Wp(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SummonFriendList summonFriendList;
        ?? arrayList;
        User user;
        C1C7U.LIZ("SessionShareViewModel@57ac.realSearchFriendsByKeyV1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ArrayList arrayList2 = new ArrayList();
        List listLL = C13LP.LL(this.LL.LJIIJ, (int) this.LLILLJJLI);
        arrayList2.addAll(listLL);
        ((ArrayList) this.LL.LJIIJ).removeAll(listLL);
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = this.LLILLL;
        C013C c013c = new C013C();
        c013c.element = this.LL.LJI;
        do {
            long size = arrayList2.size();
            long j = this.LLILLJJLI;
            if (size >= j) {
                break;
            }
            summonFriendList = SummonFriendApi.LIZ.searchFriends(this.LLILZ, j, c238400w2.element, 1, this.LLILZIL, 1).execute().LIZIZ;
            List<SummonFriendItem> list = summonFriendList.items;
            if (list != null) {
                C2385709Wl c2385709Wl = this.LL;
                arrayList = new ArrayList();
                for (SummonFriendItem summonFriendItem : list) {
                    SummonFriendItem summonFriendItem2 = summonFriendItem;
                    if (summonFriendItem2 != null && (user = summonFriendItem2.mUser) != null) {
                        c2385709Wl.getClass();
                        if (user.getFollowStatus() == 2 && C2385709Wl.LIZ(user)) {
                            arrayList.add(summonFriendItem);
                        }
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            c238400w2.element = summonFriendList.cursor;
            c013c.element = summonFriendList.hasMore;
            List listLL2 = C13LP.LL(arrayList, ((int) this.LLILLJJLI) - arrayList2.size());
            arrayList2.addAll(listLL2);
            ((ArrayList) this.LL.LJIIJ).addAll(C13LP.LLD(arrayList.size() - listLL2.size(), arrayList));
            if (!c013c.element) {
                break;
            }
        } while (Intrinsics.LJFF(summonFriendList.keyword, this.LL.LIZLLL));
        C2385709Wl c2385709Wl2 = this.LL;
        c2385709Wl2.LJII = c238400w2.element;
        c2385709Wl2.LJI = c013c.element;
        SummonFriendList summonFriendList2 = new SummonFriendList(arrayList2, c238400w2.element, c013c.element, this.LLILZ);
        C1C7U.LIZIZ("SessionShareViewModel@57ac.realSearchFriendsByKeyV1$2");
        return summonFriendList2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SummonFriendList> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

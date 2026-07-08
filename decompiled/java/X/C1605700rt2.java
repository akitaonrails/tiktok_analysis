package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserFilterStoryInfo;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rt2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1605700rt2 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ List<Object> LL;
    public final /* synthetic */ Function1<Object, User> LLILLJJLI;
    public final /* synthetic */ C1605720rt4 LLILLL;
    public final /* synthetic */ List<UserFilterStoryInfo> LLILZ;
    public final /* synthetic */ EnumC1606080rte LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1605700rt2(List<Object> list, Function1<Object, ? extends User> function1, C1605720rt4 c1605720rt4, List<UserFilterStoryInfo> list2, EnumC1606080rte enumC1606080rte) {
        super(0);
        this.LL = list;
        this.LLILLJJLI = function1;
        this.LLILLL = c1605720rt4;
        this.LLILZ = list2;
        this.LLILZIL = enumC1606080rte;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserFilterStoryInfo userFilterStoryInfo;
        UserFilterStoryInfo next;
        ArrayList arrayList = new ArrayList(this.LL);
        Function1<Object, User> function1 = this.LLILLJJLI;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            User userInvoke = function1.invoke(it2.next());
            if (userInvoke != null) {
                arrayList2.add(userInvoke);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<User> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (hashSet.add(((User) obj).getUid())) {
                arrayList3.add(obj);
            }
        }
        C1605720rt4 c1605720rt4 = this.LLILLL;
        List<UserFilterStoryInfo> list = this.LLILZ;
        EnumC1606080rte enumC1606080rte = this.LLILZIL;
        c1605720rt4.getClass();
        for (User user : arrayList3) {
            String uid = user.getUid();
            if (uid != null) {
                InterfaceC1605730rt5 interfaceC1605730rt5 = c1605720rt4.LIZJ;
                if (list != null) {
                    Iterator<UserFilterStoryInfo> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        if (Intrinsics.LJFF(String.valueOf(next.userId), user.getUid())) {
                            break;
                        }
                    }
                    userFilterStoryInfo = next;
                } else {
                    userFilterStoryInfo = null;
                }
                C727780Sgi c727780SgiLJFF = interfaceC1605730rt5.LJFF(user, userFilterStoryInfo, null);
                EnumC1605740rt6 enumC1605740rt6 = EnumC1605740rt6.FROM_SERVER;
                enumC1605740rt6.setScene(enumC1606080rte);
                c1605720rt4.LIZLLL(uid, c727780SgiLJFF, enumC1605740rt6);
            }
        }
        return Unit.LIZ;
    }
}

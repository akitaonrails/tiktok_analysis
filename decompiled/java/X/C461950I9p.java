package X;

import android.os.Build;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3PublishStatusViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS372S0200000_6;

/* JADX INFO: renamed from: X.0I9p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461950I9p extends C09AY implements Function1<C461930I9n, Unit> {
    public final /* synthetic */ FriendsV3PublishStatusViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C461950I9p(FriendsV3PublishStatusViewModel friendsV3PublishStatusViewModel) {
        super(1);
        this.LL = friendsV3PublishStatusViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C461930I9n c461930I9n) {
        C461930I9n c461930I9n2 = c461930I9n;
        List<C0IA3> list = c461930I9n2.LLILLJJLI;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (C0IA3 c0ia3 : list) {
                if ((c0ia3 instanceof C462030I9x) && c0ia3 != null) {
                    arrayList.add(c0ia3);
                }
            }
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(c461930I9n2.LLILLJJLI);
                final AFwS236S0000000_6 aFwS236S0000000_6 = AFwS236S0000000_6.get$arr$(460);
                if (Build.VERSION.SDK_INT >= 24) {
                    arrayList2.removeIf(new Predicate() { // from class: X.0I9q
                        @Override // java.util.function.Predicate
                        public final /* synthetic */ boolean test(Object obj) {
                            return ((Boolean) aFwS236S0000000_6.invoke(obj)).booleanValue();
                        }
                    });
                } else {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (((Boolean) aFwS236S0000000_6.invoke(it2.next())).booleanValue()) {
                            it2.remove();
                        }
                    }
                }
                this.LL.setState(new AwS372S0200000_6(arrayList2, (List<C0IA3>) arrayList, (List<C462030I9x>) 70));
            }
        }
        return Unit.LIZ;
    }
}

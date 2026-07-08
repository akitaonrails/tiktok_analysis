package X;

import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.020H, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020H extends C09AY implements Function1 {
    public final int $t;

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020H(int i) {
        super(1);
        this.$t = i;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$0(C020H c020h, Object obj) {
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(C020H c020h, Object obj) {
        List<User> list = (List) obj;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (User user : list) {
            arrayList.add(new Pair(user.getUid(), user));
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(C020H c020h, Object obj) {
        List<User> list = (List) obj;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (User user : list) {
            arrayList.add(new Pair(user.getUid(), user));
        }
        return arrayList;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(C020H c020h, Object obj) {
        List<User> list = (List) obj;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (User user : list) {
            arrayList.add(new Pair(user.getUid(), user));
        }
        return arrayList;
    }
}

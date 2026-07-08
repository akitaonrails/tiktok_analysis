package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.IBusinessData;

/* JADX INFO: renamed from: X.01Dt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C298701Dt extends C09AY implements Function1<List<IBusinessData>, Unit> {
    public final /* synthetic */ C2632010c LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C298701Dt(C2632010c c2632010c, String str, long j, boolean z) {
        super(1);
        this.LL = c2632010c;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<IBusinessData> list) {
        IBusinessData next;
        String str;
        List<IBusinessData> list2 = list;
        if (list2 != null) {
            Iterator<IBusinessData> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.name, "live_goal_indicator_stream_goal")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            IBusinessData iBusinessData = next;
            if (iBusinessData != null && (str = iBusinessData.extra) != null) {
                C2632010c c2632010c = this.LL;
                C500260Jjc.LJJJJJ(c2632010c.LL, null, new C312301Iz(c2632010c, this.LLILLJJLI, this.LLILLL, this.LLILZ, str, null), 3);
            }
        }
        return Unit.LIZ;
    }
}

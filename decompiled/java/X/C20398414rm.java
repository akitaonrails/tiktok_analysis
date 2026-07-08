package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.adapter.RecommendListFragment;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14rm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20398414rm extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ RecommendListFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20398414rm(RecommendListFragment recommendListFragment) {
        super(1);
        this.LL = recommendListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        Object next;
        int iIntValue = num.intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractivePlaybookHeaderHeightData height:");
        sbLIZ.append(iIntValue);
        C2188811AlT.LIZIZ(sbLIZ);
        Iterator<?> it2 = this.LL.NR().LL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if ((next instanceof C20407814tI) || (next instanceof C1890550zIT)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.LL.getClass();
        int iMax = Math.max(iIntValue, RecommendListFragment.LLJ);
        if (next != null) {
            C410901il c410901il = new C410901il();
            c410901il.addAll(this.LL.NR().LL);
            c410901il.remove(next);
            if (next instanceof C20407814tI) {
                c410901il.add(new C20407814tI(iMax));
            } else {
                c410901il.add(new C1890550zIT(iMax));
            }
            this.LL.OR(c410901il);
        }
        return Unit.LIZ;
    }
}

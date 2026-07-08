package X;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fUG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129060fUG extends C09AY implements Function1<AbstractC1132210fZL, Unit> {
    public final /* synthetic */ C1128960fU6 LL;
    public final /* synthetic */ C259800zU<AbstractC1132210fZL> LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C238400w2 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129060fUG(C1128960fU6 c1128960fU6, C259800zU<AbstractC1132210fZL> c259800zU, long j, C238400w2 c238400w2) {
        super(1);
        this.LL = c1128960fU6;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = j;
        this.LLILZ = c238400w2;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [T, X.0fZL, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1132210fZL abstractC1132210fZL) {
        LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> linkedList;
        AbstractC1132210fZL abstractC1132210fZL2 = abstractC1132210fZL;
        if (this.LL.LIZLLL && this.LLILLJJLI.element.getClass() != abstractC1132210fZL2.getClass()) {
            if (abstractC1132210fZL2 instanceof C1132240fZO) {
                this.LL.LIZJ(this.LLILLL);
                this.LL.LIZIZ(this.LLILZ.element, "", false);
            } else if (abstractC1132210fZL2 instanceof C1132220fZM) {
                C1132220fZM c1132220fZM = (C1132220fZM) abstractC1132210fZL2;
                this.LLILZ.element = c1132220fZM.LIZLLL.fuelGiftId;
                this.LL.LIZJ(this.LLILLL);
                this.LL.LIZIZ(this.LLILZ.element, c1132220fZM.LIZ, true);
                C1128960fU6 c1128960fU6 = this.LL;
                C1127050fR1 c1127050fR1 = c1128960fU6.LIZJ;
                if (c1127050fR1 != null && (linkedList = c1127050fR1.LL) != null) {
                    Iterator<AbstractC1126600fQI<? extends AnonymousClass0054>> it2 = linkedList.iterator();
                    int i = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        AbstractC1126600fQI<? extends AnonymousClass0054> next = it2.next();
                        if (next != null && next.LJIIZILJ != null && !(next.LJIIZILJ instanceof C012E)) {
                            if (i > 0) {
                                AbstractC1126600fQI abstractC1126600fQI = (AbstractC1126600fQI) C13LP.LJJJLZIJ(i, linkedList);
                                if (abstractC1126600fQI != null) {
                                    abstractC1126600fQI.LJIIZILJ = null;
                                }
                                c1128960fU6.LIZJ.notifyItemChanged(i);
                            }
                        } else {
                            i++;
                        }
                    }
                }
            } else if (!(abstractC1132210fZL2 instanceof C1132230fZN)) {
                throw new C1954807lC();
            }
            this.LLILLJJLI.element = abstractC1132210fZL2;
        }
        return Unit.LIZ;
    }
}

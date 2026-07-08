package X;

import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OrX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C632570OrX extends C09AY implements InterfaceC1631630sYr<InterfaceC1669590tY5, Integer, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ List<C632560OrW> LL;
    public final /* synthetic */ C05P1<C631220OpM> LLILLJJLI;
    public final /* synthetic */ Function1<C632090Oql, Unit> LLILLL;
    public final /* synthetic */ Fragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C632570OrX(List<C632560OrW> list, C05P1<C631220OpM> c05p1, Function1<? super C632090Oql, Unit> function1, Fragment fragment) {
        super(4);
        this.LL = list;
        this.LLILLJJLI = c05p1;
        this.LLILLL = function1;
        this.LLILZ = fragment;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(InterfaceC1669590tY5 interfaceC1669590tY5, Integer num, InterfaceC1680500tpg interfaceC1680500tpg, Integer num2) {
        int i;
        int iIntValue = num.intValue();
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 48) == 0) {
            if (interfaceC1680500tpg2.LJIJI(iIntValue)) {
                i = 32;
            } else {
                i = 16;
            }
            iIntValue2 |= i;
        }
        if ((iIntValue2 & 145) == 144 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C1668890tWx.LJFF(((C632560OrW) ListProtector.get(this.LL, iIntValue)).getMusicItem(), ((C632560OrW) ListProtector.get(this.LL, iIntValue)).getReportReviewStatus(), this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1680500tpg2, 0);
        }
        return Unit.LIZ;
    }
}

package X;

import com.ss.android.ugc.aweme.setting.serverpush.compose.login.PushSettingsLoginVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15ye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20695815ye extends C09AY implements Function1<C20304914ch, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Function1<C20696015yg, String> LLILLJJLI;
    public final /* synthetic */ PushSettingsLoginVM LLILLL;
    public final /* synthetic */ Function1<AbstractC20694715yT, AbstractC20694715yT> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20695815ye(boolean z, Function1<? super C20696015yg, String> function1, PushSettingsLoginVM pushSettingsLoginVM, Function1<? super AbstractC20694715yT, ? extends AbstractC20694715yT> function12) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = function1;
        this.LLILLL = pushSettingsLoginVM;
        this.LLILZ = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C20304914ch c20304914ch) {
        Object objInvoke;
        List<C20696015yg> list = c20304914ch.LL;
        boolean z = this.LL;
        Function1<C20696015yg, String> function1 = this.LLILLJJLI;
        AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this.LLILZ, (Function1<? super C291001Au<Long>, Unit>) 563);
        C013C c013c = new C013C();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C20696015yg c20696015yg : list) {
            if (!z || !c013c.element) {
                List<AbstractC20694715yT> list2 = c20696015yg.LIZIZ;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                boolean z2 = false;
                for (Object obj : list2) {
                    if ((!z || !c013c.element) && (objInvoke = awS610S0100000_31.invoke(obj)) != null) {
                        c013c.element = true;
                        z2 = true;
                        obj = objInvoke;
                    }
                    arrayList2.add(obj);
                }
                if (z2) {
                    String strInvoke = function1.invoke(c20696015yg);
                    if (strInvoke == null) {
                        strInvoke = c20696015yg.LIZ;
                    }
                    c20696015yg = new C20696015yg(strInvoke, arrayList2, c20696015yg.LIZJ, c20696015yg.LIZLLL, c20696015yg.LJ);
                }
            }
            arrayList.add(c20696015yg);
        }
        this.LLILLL.setState(new AwS609S0100000_30(arrayList, (List<C20696015yg>) 342));
        return Unit.LIZ;
    }
}

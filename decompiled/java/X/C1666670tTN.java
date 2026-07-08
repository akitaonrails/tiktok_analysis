package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS35S0100001_8;
import kotlin.jvm.internal.AwS487S0200000_25;
import kotlin.jvm.internal.AwS674S0100000_25;
import kotlin.jvm.internal.AwS75S1000000_25;

/* JADX INFO: renamed from: X.0tTN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666670tTN extends C09AY implements Function1<C0MAE, Unit> {
    public final /* synthetic */ List<C1666650tTL> LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;
    public final /* synthetic */ InterfaceC1685750ty9 LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ float LLILZIL;
    public final /* synthetic */ Function1<String, Unit> LLILZLL;
    public final /* synthetic */ List<String> LLIZ;
    public final /* synthetic */ float LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1666670tTN(List<C1666650tTL> list, C05P0<Boolean> c05p0, InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, Function1<? super String, Unit> function1, List<String> list2, float f3) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = c05p0;
        this.LLILLL = interfaceC1685750ty9;
        this.LLILZ = f;
        this.LLILZIL = f2;
        this.LLILZLL = function1;
        this.LLIZ = list2;
        this.LLIZLLLIL = f3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0MAE c0mae) {
        C0MAE c0mae2 = c0mae;
        ArrayList arrayList = new ArrayList(this.LL);
        String[] predictedDNTLangs = C1839820xye.LIZ().LJIIIIZZ().getPredictedDNTLangs();
        ArrayList arrayList2 = new ArrayList();
        for (String str : predictedDNTLangs) {
            C20703515zt.LIZ.getClass();
            String strLJII = C20703515zt.LJII(str);
            if (strLJII != null) {
                arrayList2.add(new C1666650tTL(str, strLJII));
                C19719612Di.LJJIIJ(arrayList, new AwS75S1000000_25(str, 13), true);
            }
        }
        if (this.LLILLJJLI.getValue().booleanValue()) {
            c0mae2.LIZIZ(null, null, new C19719212De(-1976628112, new AwS487S0200000_25(this.LLILLL, (InterfaceC1685750ty9) this.LLILLJJLI, (C05P0<Boolean>) 9), true));
        }
        if (predictedDNTLangs.length != 0 && (!false)) {
            c0mae2.LIZIZ(null, null, new C19719212De(1702691673, new AwS674S0100000_25(this.LLILLL, 36), true));
            c0mae2.LIZJ(arrayList2.size(), null, new C5183020f((List) arrayList2, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 174), new C19719212De(-1091073711, new C1666640tTK(arrayList2, this.LLILLL, this.LLILZ, this.LLILZIL, arrayList2, this.LLILZLL, this.LLIZ), true));
            c0mae2.LIZIZ(null, null, new C19719212De(-736226814, new AwS35S0100001_8(this.LLILLL, this.LLIZLLLIL, 1), true));
            c0mae2.LIZIZ(null, null, new C19719212De(1914791713, new AwS674S0100000_25(this.LLILLL, 37), true));
        }
        c0mae2.LIZJ(arrayList.size(), null, new C5183020f((List) arrayList, (List<Function1<Function1<? super Boolean, Unit>, Unit>>) 175), new C19719212De(-1091073711, new C1666660tTM(arrayList, this.LLILLL, this.LLILZ, this.LLILZIL, arrayList, this.LLILZLL, this.LLIZ), true));
        c0mae2.LIZIZ(null, null, new C19719212De(1209028587, new AwS35S0100001_8(this.LLILLL, this.LLIZLLLIL, 2), true));
        return Unit.LIZ;
    }
}

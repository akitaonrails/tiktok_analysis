package X;

import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661970tLn extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ AbstractC1664850tQR<T, U> LL;

    /* JADX INFO: Incorrect field signature: TU; */
    public final /* synthetic */ InterfaceC1461640o8g LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/0tQR<TT;TU;>;TU;)V */
    public C1661970tLn(AbstractC1664850tQR abstractC1664850tQR, InterfaceC1461640o8g interfaceC1461640o8g) {
        super(1);
        this.LL = abstractC1664850tQR;
        this.LLILLJJLI = interfaceC1461640o8g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, X.0o8g, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        C1661980tLo<U> c1661980tLo = this.LL.LIZIZ;
        ?? r5 = this.LLILLJJLI;
        T t = c1661980tLo.LIZJ;
        c1661980tLo.LIZJ = r5;
        if (t != 0 && !Intrinsics.LJFF(t, r5)) {
            for (Map.Entry entry : ((LinkedHashMap) c1661980tLo.LIZIZ).entrySet()) {
                InterfaceC2217241BqE interfaceC2217241BqE = (InterfaceC2217241BqE) entry.getKey();
                List list = (List) entry.getValue();
                Object obj = interfaceC2217241BqE.get(t);
                Object obj2 = interfaceC2217241BqE.get(r5);
                if (!Intrinsics.LJFF(obj, obj2)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((Function2) it2.next()).invoke(obj2, r5);
                    }
                }
            }
        }
        this.LL.LJ(this.LLILLJJLI);
        return Unit.LIZ;
    }
}

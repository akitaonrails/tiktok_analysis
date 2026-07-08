package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.DMGameEffectTemplateComponent$fetchTemplates$1", f = "DMGameEffectTemplateComponent.kt", l = {81, 87}, m = "invokeSuspend")
public final class C1167240gTq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C1170110gYT LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1167240gTq(Context context, C1170110gYT c1170110gYT, InterfaceC1364105Vn<? super C1167240gTq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = c1170110gYT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1167240gTq(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DMGameEffectTemplateComponent@3448.fetchTemplates$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("DMGameEffectTemplateComponent@3448.fetchTemplates$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC911530ZpP interfaceC911530ZpPLJJIFFI = C912070ZqH.LIZIZ.LJJIFFI();
            Context context = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC911530ZpPLJJIFFI.LJIIIIZZ(context, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DMGameEffectTemplateComponent@3448.fetchTemplates$1");
                return objLJFF;
            }
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1206040hUQ.LIZ((C1698606ky) it2.next()));
        }
        C1446060njY c1446060njY = C1446060njY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effects size: ");
        sbLIZ.append(list.size());
        C201955140j.LIZLLL(c1446060njY, "DMGameEffectTemplateComponent", C2188811AlT.LIZIZ(sbLIZ));
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1167140gTg c1167140gTg = new C1167140gTg(this.LLILLL, arrayList, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1167140gTg) == objLJFF) {
            C1C7U.LIZIZ("DMGameEffectTemplateComponent@3448.fetchTemplates$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DMGameEffectTemplateComponent@3448.fetchTemplates$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

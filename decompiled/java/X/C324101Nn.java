package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;
import njp.a;

/* JADX INFO: renamed from: X.01Nn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$extractOpenGlEsVersion$2", f = "EffectParser.kt", l = {241}, m = "invokeSuspend")
public final class C324101Nn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ File LLILLL;
    public final /* synthetic */ AbstractC2252651DEx LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324101Nn(File file, AbstractC2252651DEx abstractC2252651DEx, InterfaceC1364105Vn<? super C324101Nn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = file;
        this.LLILZ = abstractC2252651DEx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C324101Nn c324101Nn = new C324101Nn(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c324101Nn.LLILLJJLI = obj;
        return c324101Nn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectParserKt@53dc.extractOpenGlEsVersion$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object next = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            Regex regex = new Regex("AmazingFeature/xshader/([a-zA-Z0-9_]+).frag$");
            List listLJJII = C09RB.LJJII(C08QB.LJIIL(this.LLILLL));
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listLJJII) {
                if (regex.containsMatchIn(((File) obj2).getPath())) {
                    arrayList.add(obj2);
                }
            }
            AbstractC2252651DEx abstractC2252651DEx = this.LLILZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C315101Kb((File) it2.next(), abstractC2252651DEx, null), 3));
            }
            this.LL = 1;
            obj = C1D9F.LIZ(arrayList2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EffectParserKt@53dc.extractOpenGlEsVersion$2");
                return objLJFF;
            }
        }
        Iterator it3 = ((ArrayList) C13LP.LJJJJLI((Iterable) obj)).iterator();
        if (it3.hasNext()) {
            next = it3.next();
            while (it3.hasNext()) {
                next = C2286608xc.LJ(Math.max(((Number) next).intValue(), ((Number) it3.next()).intValue()));
            }
        }
        C1C7U.LIZIZ("EffectParserKt@53dc.extractOpenGlEsVersion$2");
        return next;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

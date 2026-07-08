package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0QCN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.translation.model.TranslationLangKevaCache$1", f = "TranslationLangKevaCache.kt", l = {}, m = "invokeSuspend")
public final class C0QCN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0QCN(InterfaceC1364105Vn<? super C0QCN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QCN(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List listLJJLL;
        C1C7U.LIZ("TranslationLangKevaCache@7fa3.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2252321DDq c2252321DDq = C20700315zN.LIZIZ;
        String[] strArrLIZJ = C20700315zN.LIZJ();
        if (strArrLIZJ != null) {
            listLJJLL = C13LQ.LJJLL(strArrLIZJ);
        } else {
            listLJJLL = null;
        }
        c2252321DDq.setValue(listLJJLL);
        C2252321DDq c2252321DDq2 = C20700315zN.LIZJ;
        Object value = c2252321DDq2.getValue();
        if (value == null) {
            value = C20700315zN.LIZ.getString("key_selected_translation_language", "");
        }
        c2252321DDq2.setValue(value);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TranslationLangKevaCache@7fa3.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0QCN(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

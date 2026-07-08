package X;

import com.ss.android.ugc.aweme.api.pipeline.TemplateConsumeCoreParam;
import com.ss.android.ugc.aweme.shortvideo.model.SummaryData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipeline.node.PrefillAlbumDataNodeKt$prefillAlbumDataNode$1", f = "PrefillAlbumDataNode.kt", l = {}, m = "invokeSuspend")
public final class C531660KtA extends C09AX implements Function2<C531670KtB, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;

    public C531660KtA(InterfaceC1364105Vn<? super C531660KtA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C531660KtA c531660KtA = new C531660KtA(interfaceC1364105Vn);
        c531660KtA.LL = obj;
        return c531660KtA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Unit unit;
        C1C7U.LIZ("PrefillAlbumDataNodeKt@5503.prefillAlbumDataNode$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C531670KtB c531670KtB = (C531670KtB) this.LL;
        TemplateConsumeCoreParam templateConsumeCoreParam = c531670KtB.LIZ;
        String str = templateConsumeCoreParam.templateId;
        EnumC1412640mre enumC1412640mre = templateConsumeCoreParam.templateType;
        C1412390mrF c1412390mrF = templateConsumeCoreParam.dispatchType;
        String str2 = c531670KtB.LIZIZ;
        if (str2 != null && str2.length() != 0) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C0FQK.LIZ;
            if (!concurrentHashMap.containsKey(str)) {
                SummaryData summaryDataLIZIZ = C0LE0.LIZIZ(str2);
                if (!summaryDataLIZIZ.slots.isEmpty()) {
                    concurrentHashMap.put(str, new C531550Ksz(enumC1412640mre, c1412390mrF, new C532330KuF(null, null, null, null, null, null, null, str2, null, 1918), summaryDataLIZIZ));
                }
                z = false;
            }
            z = true;
        } else {
            z = false;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PrefillAlbumDataNode ready=");
        sbLIZ.append(z);
        sbLIZ.append(", id=");
        sbLIZ.append(templateConsumeCoreParam.templateId);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("PrefillAlbumDataNodeKt@5503.prefillAlbumDataNode$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C531670KtB c531670KtB, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c531670KtB, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

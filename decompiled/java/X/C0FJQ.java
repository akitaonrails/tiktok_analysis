package X;

import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment.PastMemoryTextFontConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FJQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.component.sticker.OnThisDayStickerFontPrepareHelper$prepareIfNeeded$1", f = "OnThisDayStickerFontPrepareHelper.kt", l = {}, m = "invokeSuspend")
public final class C0FJQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0FI2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FJQ(C0FI2 c0fi2, InterfaceC1364105Vn<? super C0FJQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0fi2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FJQ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OnThisDayStickerFontPrepareHelper@ce0.prepareIfNeeded$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C576290Mix.LIZ.getClass();
        Map mapLIZIZ = C576290Mix.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapLIZIZ.entrySet()) {
            if (C0FI2.LJJI((String) entry.getValue()) == null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            C576290Mix c576290Mix = C576290Mix.LIZ;
            Object value = entry2.getValue();
            c576290Mix.getClass();
            String str = ((PastMemoryTextFontConfig) C576290Mix.LIZJ.getValue()).fontNameResourceIdMap.get(value);
            if (str != null) {
                arrayList.add(str);
            }
        }
        List listLLIIII = C13LP.LLIIII(C13LP.LLIIJI(arrayList));
        if (listLLIIII.isEmpty()) {
            C0FJP.LIZIZ.LJJLIIIJILLIZJL(true);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("OnThisDayStickerFontPrepareHelper@ce0.prepareIfNeeded$1");
            return unit;
        }
        if (C0FJP.LIZIZ.isCompleted() && !((Boolean) C0FJP.LIZIZ.LJJJIL()).booleanValue()) {
            C0FJP.LIZIZ = C090F.LIZIZ();
        }
        C19565911gn.LIZ();
        C122T.LIZ();
        C122T.LIZIZ();
        C1429810nJL c1429810nJL = C1429810nJL.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start download font list. resourceIds=");
        sbLIZ.append(listLLIIII);
        C201955140j.LJIILJJIL(c1429810nJL, C2188811AlT.LIZIZ(sbLIZ));
        C0FI2 c0fi2 = this.LL;
        C0FJU c0fju = new C0FJU() { // from class: X.0FJR
            @Override // X.C0FJU
            public final void LIZIZ(C0FJT c0fjt) {
                C1429810nJL c1429810nJL2 = C1429810nJL.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("download font list success. info=");
                sbLIZ2.append(c0fjt);
                C201955140j.LJIILJJIL(c1429810nJL2, C2188811AlT.LIZIZ(sbLIZ2));
                C0FJP.LIZIZ.LJJLIIIJILLIZJL(Boolean.TRUE);
            }

            @Override // X.C0FJU
            public final void LIZ(C0FJS c0fjs, ExceptionResult exceptionResult) {
                C1429810nJL c1429810nJL2 = C1429810nJL.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("download font list failed. code=");
                sbLIZ2.append(exceptionResult.getErrorCode());
                sbLIZ2.append(", stage=");
                sbLIZ2.append(c0fjs);
                C201955140j.LJIIJ(c1429810nJL2, C2188811AlT.LIZIZ(sbLIZ2), exceptionResult.getException());
                C0FJP.LIZIZ.LJJLIIIJILLIZJL(Boolean.FALSE);
            }
        };
        c0fi2.getClass();
        if (listLLIIII.isEmpty()) {
            c0fju.LIZIZ(C0FJT.SKIPPED);
        } else {
            ArrayList arrayList2 = new ArrayList();
            HashMap map = new HashMap();
            for (TextFontStyleData textFontStyleData : c0fi2.LIZIZ.values()) {
                map.put(textFontStyleData.LJ.getResourceId(), textFontStyleData);
            }
            for (Object obj2 : listLLIIII) {
                TextFontStyleData textFontStyleData2 = (TextFontStyleData) map.get(obj2);
                if (textFontStyleData2 == null || !c0fi2.LJJIIJZLJL(textFontStyleData2.fileName)) {
                    arrayList2.add(obj2);
                }
            }
            if (arrayList2.isEmpty()) {
                c0fju.LIZIZ(C0FJT.MEMORY_CACHE);
            } else {
                HashMap map2 = new HashMap();
                map2.put("panel", c0fi2.LIZ);
                C196909122h.LIZ().LJJIJIIJI(arrayList2, false, map2, new C0FX7(c0fi2, c0fju, 0));
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("OnThisDayStickerFontPrepareHelper@ce0.prepareIfNeeded$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

package X;

import Y.ACallableS175S0300000_5;
import com.ss.android.ugc.aweme.editSticker.text.font.TextFontStyleData;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0FJP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FJP {
    public static final C054G LIZ = C2296808zG.LIZIZ();
    public static C099F LIZIZ = C090F.LIZIZ();

    public static void LIZIZ() {
        C0FI2 c0fi2LJIJJLI = C0FI2.LJIJJLI("textfont");
        if (((Boolean) C272830Amf.LIZ.getValue()).booleanValue()) {
            C23250099c.LIZLLL(LIZ, C0PEM.LIZJ, null, new C0FJQ(c0fi2LJIJJLI, null), 2);
            return;
        }
        C576290Mix.LIZ.getClass();
        Map mapLIZIZ = C576290Mix.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapLIZIZ.entrySet()) {
            if (C0FI2.LJJI((String) entry.getValue()) == null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getValue());
        }
        if (arrayList.isEmpty()) {
            LIZIZ.LJJLIIIJILLIZJL(Boolean.TRUE);
            return;
        }
        if (LIZIZ.isCompleted() && !((Boolean) LIZIZ.LJJJIL()).booleanValue()) {
            LIZIZ = C090F.LIZIZ();
        }
        LIZIZ.start();
        C19565911gn.LIZ();
        C122T.LIZ();
        C122T.LIZIZ();
        LIZ(c0fi2LJIJJLI, "textfont", arrayList, AFwS234S0000000_5.get$arr$(451), new AwS584S0100000_5(c0fi2LJIJJLI, 961));
    }

    public static void LIZ(final C0FI2 c0fi2, final String str, final List list, final Function1 function1, final Function1 function12) {
        C1429810nJL c1429810nJL = C1429810nJL.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(str);
        sbLIZ.append("] downloadFonts start");
        C201955140j.LJIILJJIL(c1429810nJL, C2188811AlT.LIZIZ(sbLIZ));
        C15O7.LIZJ(new ACallableS175S0300000_5(c0fi2, Boolean.FALSE, new IFetchEffectChannelListener() { // from class: X.0FHm
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                C1429810nJL c1429810nJL2 = C1429810nJL.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('[');
                sbLIZ2.append(str);
                sbLIZ2.append("] downloadFonts fetch fontList failed");
                C201955140j.LJII(c1429810nJL2, C2188811AlT.LIZIZ(sbLIZ2));
                function1.invoke(-2);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                C1429810nJL c1429810nJL2 = C1429810nJL.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('[');
                sbLIZ2.append(str);
                sbLIZ2.append("] downloadFonts fetch fontList done");
                C201955140j.LJIILJJIL(c1429810nJL2, C2188811AlT.LIZIZ(sbLIZ2));
                final ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                for (String str2 : list) {
                    TextFontStyleData textFontStyleDataLJIILL = C0FI2.LJIILL(str2);
                    if (textFontStyleDataLJIILL != null) {
                        if (C0FI2.LJJI(str2) == null) {
                            arrayList3.add(textFontStyleDataLJIILL);
                        }
                        arrayList2.add(textFontStyleDataLJIILL);
                    } else {
                        arrayList.add(str2);
                    }
                }
                if (arrayList2.isEmpty()) {
                    C1429810nJL c1429810nJL3 = C1429810nJL.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append('[');
                    sbLIZ3.append(str);
                    sbLIZ3.append("] downloadFonts download skipped because font list is empty");
                    C201955140j.LJII(c1429810nJL3, C2188811AlT.LIZIZ(sbLIZ3));
                    function1.invoke(-1);
                    function12.invoke(list);
                    return;
                }
                if (!arrayList.isEmpty()) {
                    function12.invoke(arrayList);
                }
                if (arrayList3.isEmpty()) {
                    function1.invoke(Integer.valueOf(!arrayList.isEmpty() ? 1 : 0));
                    return;
                }
                C1429810nJL c1429810nJL4 = C1429810nJL.LIZIZ;
                StringBuilder sb = new StringBuilder(e3.e);
                sb.append(str);
                sb.append("] start download font file ");
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((TextFontStyleData) it2.next()).fontName);
                }
                sb.append(arrayList4);
                C201955140j.LJIILJJIL(c1429810nJL4, sb.toString());
                final AtomicInteger atomicInteger = new AtomicInteger(0);
                final AtomicInteger atomicInteger2 = new AtomicInteger(0);
                C0FI2 c0fi22 = c0fi2;
                final String str3 = str;
                final Function1<Integer, Unit> function13 = function1;
                c0fi22.LJFF(arrayList3, new C0FIA() { // from class: X.0FHl
                    @Override // X.C0FIA
                    public final void LIZIZ() {
                    }

                    @Override // X.C0FIA
                    public final void LJ() {
                    }

                    @Override // X.C0FIA
                    public final void onFail() {
                        C1429810nJL c1429810nJL5 = C1429810nJL.LIZIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append('[');
                        sbLIZ4.append(str3);
                        sbLIZ4.append("] downloadFonts download font failed");
                        C201955140j.LJII(c1429810nJL5, C2188811AlT.LIZIZ(sbLIZ4));
                        if (atomicInteger2.incrementAndGet() + atomicInteger.get() == arrayList3.size()) {
                            function13.invoke(-2);
                        }
                    }

                    @Override // X.C0FIA
                    public final void LIZ(TextMotionData textMotionData) {
                        String id;
                        int i;
                        C1429810nJL c1429810nJL5 = C1429810nJL.LIZIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append('[');
                        sbLIZ4.append(str3);
                        sbLIZ4.append("] downloadFonts download font success effectId:");
                        Effect effect = textMotionData.LIZJ;
                        String name = null;
                        if (effect != null) {
                            id = effect.getId();
                        } else {
                            id = null;
                        }
                        sbLIZ4.append(id);
                        sbLIZ4.append(" name:");
                        Effect effect2 = textMotionData.LIZJ;
                        if (effect2 != null) {
                            name = effect2.getName();
                        }
                        sbLIZ4.append(name);
                        C201955140j.LJIILJJIL(c1429810nJL5, C2188811AlT.LIZIZ(sbLIZ4));
                        int iIncrementAndGet = atomicInteger.incrementAndGet();
                        int i2 = atomicInteger2.get();
                        if (iIncrementAndGet + i2 == arrayList3.size()) {
                            if (i2 == 0) {
                                if (arrayList.isEmpty()) {
                                    i = 0;
                                } else {
                                    i = 1;
                                }
                            } else {
                                i = -2;
                            }
                            function13.invoke(Integer.valueOf(i));
                        }
                    }
                }, 0);
            }
        }, 1));
    }
}

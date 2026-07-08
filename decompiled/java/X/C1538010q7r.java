package X;

import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0q7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538010q7r extends AbstractC1539010q9T {
    public final String LLILLJJLI;
    public final TemplateData LLILLL;
    public final AnonymousClass0957<TemplateData> LLILZ;
    public final Function1<String, Unit> LLILZIL;
    public final InterfaceC1631620sYq<String, Map<String, ? extends Object>, Boolean, Unit> LLILZLL;
    public final Function2<LynxError, String, Unit> LLIZLLLIL;
    public final Map<String, C1311220kE4> LLJILJIL;
    public final Integer LLJILLL;
    public final Integer LLJJ;
    public final Function1<String, Unit> LLIZ = null;
    public final Function1<String, Unit> LLJ = null;
    public final Function1<Map<String, Object>, Unit> LLJI = null;
    public final InterfaceC1631620sYq<Map<String, Object>, Map<String, Long>, String, Unit> LLJIJIL = null;
    public final Map<Object, Object> LLJILJILJ = null;

    @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
    public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
        if (C1523870pl3.LIZ[interfaceC1531560pxS.getType().ordinal()] == 1) {
            C1537910q7h c1537910q7h = (C1537910q7h) interfaceC1531560pxS;
            String str = this.LLILLJJLI;
            if (str != null && !a0.LJJJIL(str)) {
                c1537910q7h.LJIILJJIL = str;
            }
            TemplateData templateData = this.LLILLL;
            if (templateData != null) {
                c1537910q7h.LJIJJ = templateData;
            }
            AnonymousClass0957<TemplateData> anonymousClass0957 = this.LLILZ;
            if (anonymousClass0957 != null) {
                c1537910q7h.LJJ = anonymousClass0957;
            }
            Integer num = this.LLJILLL;
            if (num != null) {
                num.intValue();
                c1537910q7h.LJIILL = this.LLJILLL;
            }
            Integer num2 = this.LLJJ;
            if (num2 != null) {
                num2.intValue();
                c1537910q7h.LJIILLIIL = this.LLJJ;
            }
            Map<Object, Object> linkedHashMap = this.LLJILJILJ;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap<>();
            }
            c1537910q7h.LJIL = linkedHashMap;
            c1537910q7h.LJJ(this.LLJILJIL);
            final Map<String, Object> mapLJIJI = c1537910q7h.LJIJI();
            final String strValueOf = String.valueOf(c1537910q7h.LIZ());
            c1537910q7h.LJIIIIZZ(new LynxViewClient() { // from class: X.0q7t
                @Override // com.lynx.tasm.LynxViewClient
                public final void LJIIJ() {
                    C1538010q7r c1538010q7r = this.LL;
                    InterfaceC1631620sYq<String, Map<String, ? extends Object>, Boolean, Unit> interfaceC1631620sYq = c1538010q7r.LLILZLL;
                    if (interfaceC1631620sYq != null) {
                        interfaceC1631620sYq.invoke(strValueOf, mapLJIJI, Boolean.valueOf(c1538010q7r.LLILLL != null));
                    }
                }

                @Override // com.lynx.tasm.LynxViewClient
                public final void LJIILJJIL() {
                    Function1<String, Unit> function1 = this.LL.LLIZ;
                    if (function1 != null) {
                        function1.invoke(strValueOf);
                    }
                }

                @Override // com.lynx.tasm.LynxViewClient
                public final void LJJIFFI() {
                    Function1<String, Unit> function1 = this.LL.LLJ;
                    if (function1 != null) {
                        function1.invoke(strValueOf);
                    }
                }

                @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
                public final void LJFF(LynxError lynxError) {
                    Function2<LynxError, String, Unit> function2 = this.LL.LLIZLLLIL;
                    if (function2 != null) {
                        function2.invoke(lynxError, strValueOf);
                    }
                }

                @Override // com.lynx.tasm.LynxViewClient
                public final void LJIIZILJ(String str2) {
                    Function1<String, Unit> function1 = this.LL.LLILZIL;
                    if (function1 != null) {
                        function1.invoke(strValueOf);
                    }
                }

                @Override // com.lynx.tasm.LynxViewClient
                public final void onTimingSetup(Map<String, Object> map) {
                    super.onTimingSetup(map);
                    Function1<Map<String, Object>, Unit> function1 = this.LL.LLJI;
                    if (function1 != null) {
                        function1.invoke(map);
                    }
                }

                @Override // com.lynx.tasm.LynxViewClient
                public final void LJJIIZ(String str2, Map map, Map map2) {
                    InterfaceC1631620sYq<Map<String, Object>, Map<String, Long>, String, Unit> interfaceC1631620sYq = this.LL.LLJIJIL;
                    if (interfaceC1631620sYq != null) {
                        interfaceC1631620sYq.invoke(map, map2, str2);
                    }
                }
            });
        }
    }

    public C1538010q7r(TemplateData templateData, Integer num, Integer num2, String str, Map map, Function1 function1, Function2 function2, InterfaceC1631620sYq interfaceC1631620sYq, AnonymousClass0957 anonymousClass0957) {
        this.LLILLJJLI = str;
        this.LLILLL = templateData;
        this.LLILZ = anonymousClass0957;
        this.LLILZIL = function1;
        this.LLILZLL = interfaceC1631620sYq;
        this.LLIZLLLIL = function2;
        this.LLJILJIL = map;
        this.LLJILLL = num;
        this.LLJJ = num2;
    }
}

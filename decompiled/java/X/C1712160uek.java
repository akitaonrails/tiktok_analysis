package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.ranges.IntRange;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0uek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712160uek extends AbstractC1712250uet {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZIZ;
        C1722550uvV c1722550uvVLJIILIIL;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1717770unn.LIZIZ().LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        if (activityLIZIZ instanceof C19EG) {
            C1712130ueh c1712130ueh = C1712130ueh.LIZ;
            C19EG c19eg = (C19EG) activityLIZIZ;
            if (C1712130ueh.LIZIZ != null) {
                c1712130ueh.getClass();
                InterfaceC902903fv interfaceC902903fv = C1712130ueh.LIZIZ;
                if (interfaceC902903fv != null) {
                    interfaceC902903fv.LIZ();
                }
                C1712130ueh.LIZIZ = null;
                C1712130ueh.LIZJ = null;
            } else {
                c1712130ueh.getClass();
            }
            IPipoCcdcService iPipoCcdcService = (IPipoCcdcService) PluggableExtentionKt.pluggableSpi$default(IPipoCcdcService.class, false, false, false, 14, null);
            if (iPipoCcdcService != null) {
                c1722550uvVLJIILIIL = iPipoCcdcService.LJIILIIL(c19eg, c19eg, new InterfaceC1722540uvU() { // from class: X.0ueo
                    @Override // X.InterfaceC1722540uvU
                    public final void LIZIZ(List<String> list) {
                    }

                    @Override // X.InterfaceC1722540uvU
                    public final void LIZJ() {
                        C1712130ueh.LIZ.getClass();
                        EnumC1712120ueg enumC1712120ueg = C1712130ueh.LIZJ;
                        EnumC1712120ueg enumC1712120ueg2 = EnumC1712120ueg.SCANNING;
                        if (enumC1712120ueg != enumC1712120ueg2) {
                            C1712130ueh.LIZJ = enumC1712120ueg2;
                            C1712130ueh.LIZ(null, "SCANNING", null);
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.InterfaceC1722540uvU
                    public final void LIZ(C897203f0 c897203f0) {
                        char[] charArray;
                        Object obj;
                        Object obj2;
                        C1712130ueh.LIZ.getClass();
                        EnumC1712120ueg enumC1712120ueg = C1712130ueh.LIZJ;
                        EnumC1712120ueg enumC1712120ueg2 = EnumC1712120ueg.ENABLED;
                        if (enumC1712120ueg != enumC1712120ueg2) {
                            C1712130ueh.LIZJ = enumC1712120ueg2;
                            C259800zU c259800zU = new C259800zU();
                            C259800zU c259800zU2 = new C259800zU();
                            String str = c897203f0.LIZIZ;
                            if (str != null && (charArray = str.toCharArray()) != null) {
                                ArrayList arrayList = new ArrayList();
                                for (char c : charArray) {
                                    if ('0' <= c && c < ':') {
                                        arrayList.add(Character.valueOf(c));
                                    }
                                }
                                char[] cArrLLFFF = C13LP.LLFFF(arrayList);
                                if (cArrLLFFF != null) {
                                    String str2 = new String(cArrLLFFF);
                                    try {
                                        String strLJJLIIIJLLLLLLLZ = a0.LJJLIIIJLLLLLLLZ(str2, new IntRange(0, 1));
                                        C189200o6.m2constructorimpl(strLJJLIIIJLLLLLLLZ);
                                        obj = strLJJLIIIJLLLLLLLZ;
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        C098200Yq c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                        obj = c098200Yq;
                                    }
                                    boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                                    T t = obj;
                                    if (zM7isFailureimpl) {
                                        t = 0;
                                    }
                                    c259800zU.element = t;
                                    try {
                                        String strSubstring = str2.substring(2, Math.min(str2.length(), 4));
                                        C189200o6.m2constructorimpl(strSubstring);
                                        obj2 = strSubstring;
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        C098200Yq c098200Yq2 = new C098200Yq(th2);
                                        C189200o6.m2constructorimpl(c098200Yq2);
                                        obj2 = c098200Yq2;
                                    }
                                    boolean zM7isFailureimpl2 = C189200o6.m7isFailureimpl(obj2);
                                    T t2 = obj2;
                                    if (zM7isFailureimpl2) {
                                        t2 = 0;
                                    }
                                    c259800zU2.element = t2;
                                }
                            }
                            C1712130ueh c1712130ueh2 = C1712130ueh.LIZ;
                            HashMap map = new HashMap();
                            map.put("card_number", c897203f0.LIZ);
                            T t3 = c259800zU2.element;
                            if (t3 != 0) {
                                map.put("year", t3);
                            }
                            T t4 = c259800zU.element;
                            if (t4 != 0) {
                                map.put("month", t4);
                            }
                            c1712130ueh2.getClass();
                            C1712130ueh.LIZ(null, "SUCCESS", map);
                        }
                    }

                    @Override // X.InterfaceC1722540uvU
                    public final void onError(int i) {
                        C1712130ueh.LIZ.getClass();
                        EnumC1712120ueg enumC1712120ueg = C1712130ueh.LIZJ;
                        EnumC1712120ueg enumC1712120ueg2 = EnumC1712120ueg.ENABLED;
                        if (enumC1712120ueg != enumC1712120ueg2) {
                            C1712130ueh.LIZJ = enumC1712120ueg2;
                            C1712130ueh.LIZ(Integer.valueOf(i), "ERROR", null);
                        }
                    }
                });
            } else {
                c1722550uvVLJIILIIL = null;
            }
            C1712130ueh.LIZIZ = c1722550uvVLJIILIIL;
            if (c1722550uvVLJIILIIL != null) {
                c1722550uvVLJIILIIL.LIZIZ();
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1712170uel.class, null), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, C1717770unn.LIZJ().getApplicationContext().getString(2131834217), null, 4);
    }
}

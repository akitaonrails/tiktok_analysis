package X;

import com.bytedance.provider.impl.GScope;
import com.ss.android.tracker.event.EventParamsProtocol;
import com.ss.android.ugc.aweme.share.download.event.provider.BaseDownloadParamsGroupProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0m2N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1380850m2N {
    public static final void LIZ(Class<? extends AbstractC207072161e> cls) throws IllegalAccessException, InstantiationException {
        GScope gScope = GScope.LL;
        AbstractC207072161e abstractC207072161eNewInstance = cls.newInstance();
        List listLIZIZ = C1554610qYd.LIZIZ(gScope, BaseDownloadParamsGroupProvider.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                InterfaceC1282004zy param = ((EventParamsProtocol) it2.next()).getParam();
                if (param != null) {
                    abstractC207072161eNewInstance.LJII(param);
                }
            }
        }
        abstractC207072161eNewInstance.LJIIIIZZ();
    }

    public static void LIZLLL(GScope gScope, Long l, Long l2, Integer num, int i) {
        C1380860m2O c1380860m2O;
        long jLongValue;
        long jLongValue2;
        int iIntValue;
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            l2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(gScope, "Download", C1380860m2O.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (c1380860m2O = (C1380860m2O) interfaceC1555100qZQLIZIZ.getSource()) != null) {
            GScope gScope2 = GScope.LL;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = c1380860m2O.LLILZIL;
            }
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = c1380860m2O.LLILZLL;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = c1380860m2O.LLIZ;
            }
            C1554960qZC.LIZ(gScope2, new C1380860m2O(c1380860m2O.LLILLJJLI, c1380860m2O.LL, c1380860m2O.LLILLL, c1380860m2O.LLILZ, c1380860m2O.LLIZLLLIL, jLongValue, jLongValue2, iIntValue), C1380860m2O.class, "Download");
        }
    }

    public static void LIZJ(GScope gScope, Long l, String str, Integer num, Integer num2, String str2, Integer num3, int i) {
        C1380840m2M c1380840m2M;
        long jLongValue;
        int iIntValue;
        int iIntValue2;
        String str3 = str2;
        Integer num4 = num2;
        String str4 = str;
        if ((i & 1) != 0) {
            l = null;
        }
        if ((i & 2) != 0) {
            str4 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            num3 = null;
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(gScope, "Download", C1380840m2M.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (c1380840m2M = (C1380840m2M) interfaceC1555100qZQLIZIZ.getSource()) != null) {
            GScope gScope2 = GScope.LL;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = c1380840m2M.LLIZ;
            }
            if (str4 == null) {
                str4 = c1380840m2M.LLILZLL;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = c1380840m2M.LLIZLLLIL;
            }
            if (num4 == null) {
                num4 = c1380840m2M.LLJ;
            }
            if (str3 == null) {
                str3 = c1380840m2M.LLJI;
            }
            if (num3 != null) {
                iIntValue2 = num3.intValue();
            } else {
                iIntValue2 = c1380840m2M.LLJIJIL;
            }
            C1554960qZC.LIZ(gScope2, new C1380840m2M(c1380840m2M.LL, c1380840m2M.LLILLJJLI, c1380840m2M.LLILLL, c1380840m2M.LLILZ, c1380840m2M.LLILZIL, str4, jLongValue, iIntValue, num4, str3, iIntValue2, c1380840m2M.LLJILJIL), C1380840m2M.class, "Download");
        }
    }

    public static void LIZIZ(GScope gScope, String str, Long l, Long l2, Long l3, Integer num, Integer num2, Integer num3, String str2, String str3, int i) {
        C1380830m2L c1380830m2L;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        if ((i & 1) != 0) {
            str6 = null;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            l2 = null;
        }
        if ((i & 8) != 0) {
            l3 = null;
        }
        if ((i & 16) != 0) {
            num = null;
        }
        if ((i & 32) != 0) {
            num2 = null;
        }
        if ((i & 64) != 0) {
            num3 = null;
        }
        if ((i & 128) != 0) {
            str5 = null;
        }
        if ((i & 256) != 0) {
            str4 = null;
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(gScope, "Download", C1380830m2L.class, null);
        if (interfaceC1555100qZQLIZIZ != null && (c1380830m2L = (C1380830m2L) interfaceC1555100qZQLIZIZ.getSource()) != null) {
            GScope gScope2 = GScope.LL;
            if (str6 == null) {
                str6 = c1380830m2L.LLILLJJLI;
            }
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = c1380830m2L.LLILLL;
            }
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = c1380830m2L.LLILZ;
            }
            if (l3 != null) {
                jLongValue3 = l3.longValue();
            } else {
                jLongValue3 = c1380830m2L.LLILZIL;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = c1380830m2L.LLILZLL;
            }
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = c1380830m2L.LLIZ;
            }
            if (num3 != null) {
                iIntValue3 = num3.intValue();
            } else {
                iIntValue3 = c1380830m2L.LLIZLLLIL;
            }
            if (str4 == null) {
                str4 = c1380830m2L.LLJI;
            }
            C1554960qZC.LIZ(gScope2, new C1380830m2L(c1380830m2L.LL, str6, jLongValue, jLongValue2, jLongValue3, iIntValue, iIntValue2, iIntValue3, str5, str4, c1380830m2L.LLJIJIL), C1380830m2L.class, "Download");
        }
    }
}

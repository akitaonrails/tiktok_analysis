package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Z5G, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z5G implements InterfaceC883330Yl1, InterfaceC497601wk, C0Z5D {
    public static final C0Z5G LL;
    public static final AtomicReference<List<C0Z5H>> LLILLJJLI;
    public static final C1DFB LLILLL;
    public static AnonymousClass0956 LLILZ;
    public static final IDMRiskyKeywordsService LLILZIL;
    public static final Keva LLILZLL;
    public static final Regex LLIZ;
    public static final Regex LLIZLLLIL;

    static {
        C0Z5G c0z5g = new C0Z5G();
        LL = c0z5g;
        LLILLJJLI = new AtomicReference<>(null);
        LLILLL = C0PEM.LIZJ;
        IDMRiskyKeywordsService iDMRiskyKeywordsService = (IDMRiskyKeywordsService) PluggableExtentionKt.pluggableSpiForReal(IDMRiskyKeywordsService.class);
        LLILZIL = iDMRiskyKeywordsService;
        LLILZLL = Keva.getRepo("group_chat_keywords_filter_local_cache");
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZ();
        C883250Ykt c883250Ykt = C883250Ykt.LL;
        C883250Ykt.LIZIZ(c0z5g);
        if (iDMRiskyKeywordsService != null) {
            iDMRiskyKeywordsService.LIZJ(c0z5g);
        }
        LLIZ = new Regex("[\\p{P}]+");
        LLIZLLLIL = new Regex("\\s+");
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[LOOP:1: B:27:0x0087->B:56:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0Z5G.LIZIZ(java.lang.String):boolean");
    }

    public static List LIZJ(List list) {
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!a0.LJJJIL((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (String str : arrayList) {
            arrayList2.add(new C0Z5H(str, LLIZLLLIL.split(str, 0)));
        }
        return arrayList2;
    }

    @Override // X.C0Z5D
    public final void LIZ(List<String> list) {
        LLILLJJLI.set(LIZJ(list));
        if (C296690Bk3.LIZ()) {
            try {
                Keva keva = LLILZLL;
                C882400YjW.LIZ.getClass();
                C882400YjW.LIZ();
                C883250Ykt c883250Ykt = C883250Ykt.LL;
                keva.storeStringArray(C461720I8s.LIZIZ(), (String[]) list.toArray(new String[0]));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC883330Yl1
    public final void LJII(EnumC883280Ykw enumC883280Ykw, C883460YlE c883460YlE) {
        try {
            LLILLJJLI.set(C13BV.INSTANCE);
            AnonymousClass0956 anonymousClass0956 = LLILZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            LLILZ = C23250099c.LIZLLL(this, null, null, new C0Z5F(null), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}

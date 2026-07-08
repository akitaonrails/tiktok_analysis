package X;

import Y.AComparatorS50S0000000_31;
import Y.ARunnableS131S0100000_31;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ECMallPreloadPdpResourceTask;
import com.ss.android.ugc.aweme.ecommerce.image.resource.EcOperationResourceTask;
import com.ss.android.ugc.aweme.ecommerce.taskmanger.DemoTask;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;

/* JADX INFO: renamed from: X.150c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204496150c {
    public static final C204496150c LIZIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZJ;
    public static final Map<EnumC1153730g83, Long> LIZLLL;
    public static final ExecutorService LJ;
    public volatile List LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C204496150c.class, "allTask", "getAllTask()Ljava/util/List;", 0);
        C13LE.LIZ.getClass();
        LIZJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LIZIZ = new C204496150c();
        LIZLLL = new LinkedHashMap();
        LJ = C823050WQl.LIZJ();
    }

    public final List<AbstractRunnableC204495150b> LIZJ() {
        List<AbstractRunnableC204495150b> list = this.LIZ;
        if (list == null) {
            synchronized (this) {
                list = this.LIZ;
                if (list == null) {
                    List<AbstractRunnableC204495150b> listLJJLL = C13LQ.LJJLL(new Object[]{new ECMallPreloadPdpResourceTask(), new EcOperationResourceTask(), new DemoTask()});
                    this.LIZ = listLJJLL;
                    return listLJJLL;
                }
            }
        }
        return list;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.util.List r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204496150c.LIZ(java.util.List):void");
    }

    public static void LIZIZ(List list) {
        long jLongValue;
        ArrayList<AbstractRunnableC204495150b> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((AbstractRunnableC204495150b) obj).LIZJ()) {
                arrayList.add(obj);
            }
        }
        for (AbstractRunnableC204495150b abstractRunnableC204495150b : arrayList) {
            LIZIZ.getClass();
            long j = abstractRunnableC204495150b.LLILZ;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = (Long) ((LinkedHashMap) LIZLLL).get(abstractRunnableC204495150b.LL);
            long j2 = 0;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            long j3 = j - (jCurrentTimeMillis - jLongValue);
            if (j3 >= 0) {
                j2 = j3;
            }
            C1091940eWO.LIZIZ(j2, new ARunnableS131S0100000_31(abstractRunnableC204495150b, 132));
        }
    }

    public final void LIZLLL(EnumC1153730g83 enumC1153730g83) {
        List<AbstractRunnableC204495150b> listLIZJ = LIZJ();
        ArrayList arrayList = new ArrayList();
        for (AbstractRunnableC204495150b abstractRunnableC204495150b : listLIZJ) {
            if (abstractRunnableC204495150b.LL == enumC1153730g83) {
                arrayList.add(abstractRunnableC204495150b);
            }
        }
        final List<AbstractRunnableC204495150b> listLJLLLL = C13LP.LJLLLL(new AComparatorS50S0000000_31(6), arrayList);
        if (listLJLLLL.isEmpty()) {
            return;
        }
        LIZLLL.put(enumC1153730g83, Long.valueOf(System.currentTimeMillis()));
        AbstractC204498150e abstractC204498150e = new AbstractC204498150e() { // from class: X.150d
            @Override // X.AbstractC204498150e
            public final void LIZ() {
                C204496150c c204496150c = C204496150c.LIZIZ;
                List<AbstractRunnableC204495150b> list = listLJLLLL;
                c204496150c.getClass();
                C204496150c.LIZIZ(list);
            }

            @Override // X.AbstractC204498150e
            public final void LIZIZ() throws JSONException {
                C204496150c c204496150c = C204496150c.LIZIZ;
                List<AbstractRunnableC204495150b> list = listLJLLLL;
                c204496150c.getClass();
                C204496150c.LIZ(list);
            }

            @Override // X.AbstractC204498150e
            public final void LIZJ() throws JSONException {
                C204496150c c204496150c = C204496150c.LIZIZ;
                List<AbstractRunnableC204495150b> list = listLJLLLL;
                c204496150c.getClass();
                C204496150c.LIZ(list);
                C204496150c.LIZIZ(listLJLLLL);
            }
        };
        for (AbstractRunnableC204495150b abstractRunnableC204495150b2 : listLJLLLL) {
            if (!abstractRunnableC204495150b2.LLILZIL) {
                abstractRunnableC204495150b2.LIZ(EnumC1782320wTu.UNSCHEDULED);
                abstractRunnableC204495150b2.LLJ = 3;
            }
            abstractRunnableC204495150b2.LLIZLLLIL.add(abstractC204498150e);
        }
        LIZ(listLJLLLL);
        LIZIZ(listLJLLLL);
    }
}

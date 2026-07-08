package X;

import Y.AfS50S1200000_31;
import Y.AkS468S0100000_3;
import Y.AkS480S0100000_18;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResultDM;
import com.ss.android.ugc.aweme.translation.model.TranslationResultDM;
import com.ss.android.ugc.aweme.translation.repo.BizCompTranslationContent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: renamed from: X.163B, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C163B extends C163A<C207134163o, C1869610ykh, C163J> {
    public static final C164C LJI = new Object() { // from class: X.164C
    };
    public static C163B LJII;
    public static C163J LJIIIIZZ;
    public final EnumC207101162h LJ;
    public final String LJFF = "BizCompTranslationRepo";

    @Override // X.C163A
    public final AbstractC1361510lXB LIZJ() {
        C163J c163j = LJIIIIZZ;
        if (c163j == null) {
            return null;
        }
        return c163j;
    }

    @Override // X.C163A
    public final String LJFF() {
        return this.LJFF;
    }

    public C163B(EnumC207101162h enumC207101162h) {
        this.LJ = enumC207101162h;
    }

    @Override // X.C163A
    public final EnumC207100162g LIZLLL(C207134163o c207134163o) {
        return EnumC207100162g.DIRECT_MESSAGE;
    }

    public static final void LJIILLIIL(List<C207134163o> list, C163B c163b, String str) {
        for (C207134163o c207134163o : list) {
            c163b.getClass();
            C163J c163j = LJIIIIZZ;
            if (c163j == null) {
                c163j = null;
            }
            String strLIZIZ = c163j.LIZIZ(c207134163o, str);
            c163b.LIZJ.remove(strLIZIZ);
            C11RK<Boolean> c11rkRemove = c163b.LIZLLL.remove(strLIZIZ);
            if (c11rkRemove != null) {
                c11rkRemove.onNext(Boolean.FALSE);
                c11rkRemove.onComplete();
            }
        }
    }

    @Override // X.C163A
    public final C11NZ LJII(String str, final boolean z, List list) {
        C11NZ<MultiTranslationResultDM> c11nzLJ;
        final String strLLIIZ = C161N.LIZIZ.LLIIZ();
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) list).iterator();
        while (true) {
            C163J c163j = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            C163J c163j2 = LJIIIIZZ;
            if (c163j2 != null) {
                c163j = c163j2;
            }
            if (c163j.LIZLLL(next, strLLIIZ) == null) {
                arrayList2.add(next);
            }
        }
        List listSubList = arrayList2;
        while (!listSubList.isEmpty()) {
            int iMin = Math.min(listSubList.size(), 20);
            List<C207134163o> listSubList2 = listSubList.subList(0, iMin);
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listSubList2, 10));
            for (C207134163o c207134163o : listSubList2) {
                String str2 = c207134163o.LIZLLL;
                String str3 = c207134163o.LJ;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList3.add(new BizCompTranslationContent(str2, str3));
            }
            String json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), arrayList3);
            String json2 = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), C13LQ.LJJLL(C161N.LIZIZ.LL()));
            try {
                C161O c161oLIZ = C1236630iHl.LIZ();
                if (c161oLIZ == null || (c11nzLJ = c161oLIZ.LJ(json, strLLIIZ, json2)) == null) {
                    c11nzLJ = C11IR.LL;
                }
            } catch (ExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                AbstractC2126608Uu.getCompatibleException(e);
                c11nzLJ = C11IR.LL;
            }
            arrayList.add(c11nzLJ.LJL(C11S5.LIZ()).LJJJJZI(new AkS480S0100000_18(listSubList2, 0)));
            listSubList = listSubList.subList(iMin, listSubList.size());
        }
        AnonymousClass0983 anonymousClass0983LJLLLL = C11NZ.LJIILJJIL(arrayList).LJJJI(new AkS468S0100000_3(this, 5)).LJLJLLL().LJJIJLIJ().LJJJJZI(new InterfaceC1487280oo2() { // from class: X.163N
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                C163B c163b = this.LL;
                String str4 = strLLIIZ;
                boolean z2 = z;
                for (Pair pair : (List) obj) {
                    C207134163o c207134163o2 = (C207134163o) pair.getFirst();
                    TranslationResultDM translationResultDM = (TranslationResultDM) pair.getSecond();
                    c163b.getClass();
                    C163J c163j3 = C163B.LJIIIIZZ;
                    if (c163j3 == null) {
                        c163j3 = null;
                    }
                    String strLIZIZ = c163j3.LIZIZ(c207134163o2, str4);
                    String str5 = translationResultDM.translatedText;
                    if (str5 != null) {
                        C163J c163j4 = C163B.LJIIIIZZ;
                        if (c163j4 == null) {
                            c163j4 = null;
                        }
                        String str6 = c207134163o2.LIZLLL;
                        if (str6 == null) {
                            str6 = "";
                        }
                        C163J.LJI(c163j4, c207134163o2, str6, c207134163o2.LJ, translationResultDM.detectedSrcLang, str5, str4, z2);
                        C11RK<Boolean> c11rkRemove = c163b.LIZLLL.remove(strLIZIZ);
                        if (c11rkRemove != null) {
                            c11rkRemove.onNext(Boolean.TRUE);
                            c11rkRemove.onComplete();
                            if (Unit.LIZ == null) {
                            }
                        }
                    }
                    C11RK<Boolean> c11rkRemove2 = c163b.LIZLLL.remove(strLIZIZ);
                    if (c11rkRemove2 != null) {
                        c11rkRemove2.onNext(Boolean.FALSE);
                        c11rkRemove2.onComplete();
                    }
                }
                return Boolean.TRUE;
            }
        }).LJJIIZ(new InterfaceC781210Ukh() { // from class: X.163y
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C163B.LJIILLIIL(arrayList2, this, strLLIIZ);
            }
        }).LJJIJIIJI(new AfS50S1200000_31(arrayList2, this, strLLIIZ, 0)).LJJIIJZLJL(new InterfaceC781210Ukh() { // from class: X.163z
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                C163B.LJIILLIIL(arrayList2, this, strLLIIZ);
            }
        }).LJJLIIIJJI().LJLLLL();
        for (Object obj : arrayList2) {
            C163J c163j3 = LJIIIIZZ;
            if (c163j3 == null) {
                c163j3 = null;
            }
            this.LIZJ.put(c163j3.LIZIZ(obj, strLLIIZ), anonymousClass0983LJLLLL);
        }
        return anonymousClass0983LJLLLL;
    }

    @Override // X.C163A
    public final C11NZ LJIILJJIL(C207134163o c207134163o, final C162U c162u, final String str, final InterfaceC1389740mGi interfaceC1389740mGi, String str2) {
        String json;
        C11NZ<MultiTranslationResultDM> c11nzLJ;
        final C207134163o c207134163o2 = c207134163o;
        String json2 = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), Collections.singletonList(new BizCompTranslationContent(c207134163o2.LIZLLL, c207134163o2.LJ)));
        C161N c161n = C161N.LIZIZ;
        if (!c161n.LJJLI(c207134163o2)) {
            json = GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), C13LQ.LJJLL(c161n.LL()));
        } else {
            json = null;
        }
        try {
            C161O c161oLIZ = C1236630iHl.LIZ();
            if (c161oLIZ == null || (c11nzLJ = c161oLIZ.LJ(json2, str, json)) == null) {
                c11nzLJ = C11IR.LL;
            }
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
            c11nzLJ = C11IR.LL;
        }
        return c11nzLJ.LJJJLZIJ(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.163K
            /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
            @Override // X.InterfaceC1487280oo2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r31) {
                /*
                    Method dump skipped, instruction units count: 423
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C163K.apply(java.lang.Object):java.lang.Object");
            }
        }).LJL(C11S5.LIZ());
    }
}

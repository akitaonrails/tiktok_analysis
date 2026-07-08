package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ZtT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914050ZtT implements InterfaceC872410YKh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC872410YKh
    public final Object LIZ() {
        switch (this.$t) {
            case 0:
                return LIZ$0(this);
            case 1:
                return LIZ$1(this);
            case 2:
                return LIZ$2(this);
            case 3:
                return LIZ$3(this);
            case 4:
                return LIZ$4(this);
            case 5:
                return LIZ$5(this);
            case 6:
                return LIZ$6(this);
            case 7:
                return LIZ$7(this);
            case 8:
                return LIZ$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return LIZ$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return LIZ$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return LIZ$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return LIZ$12(this);
            default:
                return null;
        }
    }

    public static final Object LIZ$0(C914050ZtT c914050ZtT) {
        ((Runnable) c914050ZtT.l0).run();
        return null;
    }

    public static final Object LIZ$1(C914050ZtT c914050ZtT) {
        ((C868200Y4c) c914050ZtT.l0).LJIILJJIL.LJIIZILJ().getDomain().LIZJ().LLJZ(((C868200Y4c) c914050ZtT.l0).LJIILJJIL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJJJL(((C868200Y4c) c914050ZtT.l0).LJIILJJIL.getUid()));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5, types: [long] */
    public static final Object LIZ$10(C914050ZtT c914050ZtT) throws Throwable {
        List<Pair<String, String>> listLIZJ = ((C864930XwR) c914050ZtT.l0).LIZLLL.LIZJ().LIZJ("local_delete_time");
        if (listLIZJ != null) {
            long j = ((C864930XwR) c914050ZtT.l0).LIZJ.LJIIIZ().LJJLIIIIJ.LJJIJL.LIZJ + ((C864930XwR) c914050ZtT.l0).LIZJ.LJIIIZ().LJJLIIIIJ.LJJIJL.LIZLLL;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C868780Y6i c868780Y6iLIZLLL = ((C864930XwR) c914050ZtT.l0).LIZJ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("scanAndCommitPendingDeletes: ");
            sbLIZ.append(listLIZJ.size());
            sbLIZ.append(" pending");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c868780Y6iLIZLLL.getClass();
            C868780Y6i.LJ(c868780Y6iLIZLLL, "DeleteMsgHandler", strLIZIZ, 4);
            for (Pair<String, String> pair : listLIZJ) {
                String first = pair.getFirst();
                String second = pair.getSecond();
                C869590Y9l c869590Y9lLJJJI = ((C864930XwR) c914050ZtT.l0).LIZLLL.LJI().LJJJI(first);
                String str = "local_delete_is_local";
                if (c869590Y9lLJJJI == null) {
                    ((C864930XwR) c914050ZtT.l0).LIZLLL.LIZJ().LLJJIJI(first, "local_delete_time");
                    ((C864930XwR) c914050ZtT.l0).LIZLLL.LIZJ().LLJJIJI(first, "local_delete_is_local");
                } else if (c869590Y9lLJJJI.getDeleted() != 1) {
                    ((C864930XwR) c914050ZtT.l0).LIZLLL.LIZJ().LLJJIJI(first, "local_delete_time");
                    ((C864930XwR) c914050ZtT.l0).LIZLLL.LIZJ().LLJJIJI(first, "local_delete_is_local");
                } else {
                    try {
                        str = CastLongProtector.parseLong(second);
                        long j2 = jCurrentTimeMillis - str;
                        if (j2 >= j) {
                            ((C864930XwR) c914050ZtT.l0).LJIIJJI(str, first, c869590Y9lLJJJI.getConversationId());
                        } else {
                            ((C864930XwR) c914050ZtT.l0).LJIJ(j - j2, str, first, c869590Y9lLJJJI.getConversationId());
                        }
                    } catch (NumberFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                        ((C864930XwR) c914050ZtT.l0).LIZLLL.LIZJ().LLJJIJI(first, "local_delete_time");
                        ((C864930XwR) c914050ZtT.l0).LIZLLL.LIZJ().LLJJIJI(first, str);
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static final Object LIZ$11(C914050ZtT c914050ZtT) {
        return Boolean.valueOf(((C868990Y7d) c914050ZtT.l0).LIZLLL.LJIIJJI().LJJJJLL());
    }

    public static final Object LIZ$12(C914050ZtT c914050ZtT) {
        ((C868990Y7d) c914050ZtT.l0).LIZJ.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJLIIIJJI(((C868990Y7d) c914050ZtT.l0).LIZJ.getUid(), ((C868990Y7d) c914050ZtT.l0).LIZJ.LJIIIZ().LJJJLL);
        return Boolean.TRUE;
    }

    public static final Object LIZ$2(C914050ZtT c914050ZtT) {
        ((C868200Y4c) c914050ZtT.l0).LJIILJJIL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJLIIIJILLIZJL(((C868200Y4c) c914050ZtT.l0).LJIILJJIL.getUid());
        return null;
    }

    public static final Object LIZ$3(C914050ZtT c914050ZtT) {
        ((C868200Y4c) c914050ZtT.l0).LJIILJJIL();
        return null;
    }

    public static final Object LIZ$4(C914050ZtT c914050ZtT) throws Throwable {
        ((C872420YKi) c914050ZtT.l0).LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel loadNewerMessageList onRun");
        C869590Y9l c869590Y9lLJI = ((C872420YKi) c914050ZtT.l0).LJI();
        C872420YKi c872420YKi = (C872420YKi) c914050ZtT.l0;
        C869590Y9l c869590Y9lLJJIIZ = c872420YKi.LLJJIJIL.LJI().LJJIIZ(c872420YKi.LL, null, false);
        ((C872420YKi) c914050ZtT.l0).LLILLJJLI.toListCopy();
        C872420YKi c872420YKi2 = (C872420YKi) c914050ZtT.l0;
        return new C0YL3(c872420YKi2.LJIIL(c872420YKi2.LLILLL + 5), c869590Y9lLJI, c869590Y9lLJJIIZ);
    }

    public static final Object LIZ$5(C914050ZtT c914050ZtT) {
        return ((C867970Y3f) c914050ZtT.l0).LLILZ.LJIILIIL().LJIIIIZZ(((C867970Y3f) c914050ZtT.l0).LLILLL);
    }

    public static final Object LIZ$6(C914050ZtT c914050ZtT) {
        ((C0Y9I) c914050ZtT.l0).LL.LJIIZILJ().getDomain().LIZ().LLILLL.LJIIZILJ().getDomain().LIZJ().LLJZ(((C0Y9I) c914050ZtT.l0).LL.LJIIZILJ().LIZIZ().LIZIZ().LJI().LJJJJL(((C0Y9I) c914050ZtT.l0).LL.getUid()));
        return null;
    }

    public static final Object LIZ$7(C914050ZtT c914050ZtT) {
        ((C872520YKs) c914050ZtT.l0).LLIZLLLIL.LIZLLL().LJIIJJI("MessageBrowserModel initMessageList onRun");
        C869580Y9k c869580Y9kLJI = ((C872520YKs) c914050ZtT.l0).LLJ.LJI();
        C872520YKs c872520YKs = (C872520YKs) c914050ZtT.l0;
        C0Y6Q c0y6qLJJJLIIL = c869580Y9kLJI.LJJJLIIL(c872520YKs.LLILLL, c872520YKs.LL, c872520YKs.LLILLJJLI);
        ((C872520YKs) c914050ZtT.l0).LLILZLL = true;
        return c0y6qLJJJLIIL.LIZ(Collections.emptyList());
    }

    public static final Object LIZ$8(C914050ZtT c914050ZtT) {
        C869590Y9l c869590Y9l;
        ((C872520YKs) c914050ZtT.l0).LLIZLLLIL.LIZLLL().LJIIJJI("MessageBrowserModel loadNewerMessageList onRun");
        C872520YKs c872520YKs = (C872520YKs) c914050ZtT.l0;
        if (c872520YKs.LLILZ.isEmpty()) {
            c869590Y9l = null;
        } else {
            c869590Y9l = c872520YKs.LLILZ.get(0);
        }
        C872520YKs c872520YKs2 = (C872520YKs) c914050ZtT.l0;
        C0Y8T c0y8tLIZ = c872520YKs2.LLIZLLLIL.LJIIZILJ().LIZLLL().LIZ().LIZ(c872520YKs2.LL);
        if (c869590Y9l != null && c0y8tLIZ != null && c0y8tLIZ.getLastShowMessage() != null && c869590Y9l.getIndex() < c0y8tLIZ.getLastShowMessage().getIndex()) {
            C869580Y9k c869580Y9kLJI = ((C872520YKs) c914050ZtT.l0).LLJ.LJI();
            String str = ((C872520YKs) c914050ZtT.l0).LL;
            long index = c869590Y9l.getIndex();
            C872520YKs c872520YKs3 = (C872520YKs) c914050ZtT.l0;
            List list = (List) c869580Y9kLJI.LJJLJ(str, index, c872520YKs3.LLILLL + 5, c872520YKs3.LLILLJJLI).LIZ(Collections.emptyList());
            int size = list.size();
            C872520YKs c872520YKs4 = (C872520YKs) c914050ZtT.l0;
            if (size > c872520YKs4.LLILLL) {
                List listSubList = list.subList(list.size() - ((C872520YKs) c914050ZtT.l0).LLILLL, list.size());
                ((C872520YKs) c914050ZtT.l0).LLILZLL = false;
                return listSubList;
            }
            c872520YKs4.LLILZLL = true;
            return list;
        }
        return Collections.emptyList();
    }

    public static final Object LIZ$9(C914050ZtT c914050ZtT) {
        ((C872520YKs) c914050ZtT.l0).LLIZLLLIL.LIZLLL().LJIIJJI("MessageBrowserModel loadOlderMessageList onRun");
        C872520YKs c872520YKs = (C872520YKs) c914050ZtT.l0;
        if (!c872520YKs.LLILZ.isEmpty()) {
            C869590Y9l c869590Y9l = c872520YKs.LLILZ.get(r1.size() - 1);
            if (c869590Y9l != null) {
                C869580Y9k c869580Y9kLJI = ((C872520YKs) c914050ZtT.l0).LLJ.LJI();
                String str = ((C872520YKs) c914050ZtT.l0).LL;
                long index = c869590Y9l.getIndex();
                C872520YKs c872520YKs2 = (C872520YKs) c914050ZtT.l0;
                return c869580Y9kLJI.LJJLL(str, index, c872520YKs2.LLILLL, c872520YKs2.LLILLJJLI);
            }
        }
        return Collections.emptyList();
    }

    public C914050ZtT(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

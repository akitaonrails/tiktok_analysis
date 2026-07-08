package X;

import android.os.Handler;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.163I, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C163I implements InterfaceC1344290l5P {
    public static C207137163r LJFF;
    public static final C163I LIZ = new C163I();
    public static final Handler LIZIZ = C161N.LIZIZ.LLIILII();
    public static final AnonymousClass1638<Comment> LIZJ = new AnonymousClass1638<>(C1697810uHb.LJIILJJIL(new C163L()));
    public static final C11NJ LIZLLL = new C11NJ();
    public static final ConcurrentLinkedDeque<C207137163r> LJ = new ConcurrentLinkedDeque<>();
    public static final C163X LJI = C163X.LL;

    @Override // X.InterfaceC1344290l5P
    public final void LIZ() {
        LJ.clear();
    }

    public static void LJII(C207137163r c207137163r) {
        C11NZ c11nzLJLL;
        AnonymousClass1638<Comment> anonymousClass1638 = LIZJ;
        List<Comment> list = c207137163r.LIZ;
        boolean z = c207137163r.LIZIZ;
        String str = c207137163r.LIZJ;
        anonymousClass1638.getClass();
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass1636<Comment, C163A<Comment, ? extends C164B, ? extends AbstractC1361510lXB<Comment, ? extends C164B>>> anonymousClass1636 : anonymousClass1638.LIZ) {
            ArrayList arrayList2 = new ArrayList();
            for (Comment comment : list) {
                if (anonymousClass1636.LJIIJ(comment, EnumC715680S5m.NOT_OVERWRITTEN)) {
                    arrayList2.add(comment);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(anonymousClass1636.LIZIZ().LJII(str, z, arrayList2));
            }
        }
        if (arrayList.isEmpty()) {
            c11nzLJLL = C11NZ.LJJJJZ(Boolean.FALSE);
        } else {
            c11nzLJLL = C11NZ.LJLL(arrayList, new InterfaceC1487280oo2() { // from class: X.00DY
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    Object[] objArr = (Object[]) obj;
                    int length = objArr.length;
                    boolean z2 = false;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (!((Boolean) objArr[i]).booleanValue()) {
                                break;
                            }
                            i++;
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    return Boolean.valueOf(z2);
                }
            });
        }
        LIZLLL.LIZ(C1239300iM4.LJ(c11nzLJLL.LJJJLZIJ(C11S5.LIZ()), AFwS276S0000000_31.get$arr$(2), AFwS221S0000000_31.get$arr$(17), AFwS276S0000000_31.get$arr$(3)));
    }

    @Override // X.InterfaceC1344290l5P
    public final void LIZIZ(String str) {
        C1361410lX1.LJ.getClass();
        ((C1361440lX4) C1361410lX1.LJFF.getValue()).LIZ.remove(str);
    }

    @Override // X.InterfaceC1344290l5P
    public final String LIZJ(Comment comment) {
        C1361470lX7 c1361470lX7LJI = C1361410lX1.LJ.LJI(comment, C161N.LIZIZ.LLIIZ());
        if (c1361470lX7LJI != null) {
            return c1361470lX7LJI.LJFF;
        }
        return null;
    }

    @Override // X.InterfaceC1344290l5P
    public final int LIZLLL(String str) {
        C1361410lX1.LJ.getClass();
        ConcurrentHashMap<String, C1361470lX7> concurrentHashMap = ((C1361440lX4) C1361410lX1.LJFF.getValue()).LIZ.get(str);
        if (concurrentHashMap != null) {
            return concurrentHashMap.size();
        }
        return 0;
    }

    @Override // X.InterfaceC1344290l5P
    public final boolean LJ(Comment comment) {
        if (C1361410lX1.LJ.LJI(comment, C161N.LIZIZ.LLIIZ()) != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1344290l5P
    public final void LJFF(String str, boolean z, List list) {
        List listSingletonList;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Comment comment = (Comment) it2.next();
            List<Comment> replyComments = comment.getReplyComments();
            if (replyComments != null) {
                listSingletonList = C13LP.LJLILLLLZI(comment, replyComments);
            } else {
                listSingletonList = Collections.singletonList(comment);
            }
            C19719612Di.LJJI(listSingletonList, arrayList);
        }
        LJI(str, arrayList, z, false);
    }

    public static final void LJI(final String str, final List list, final boolean z, final boolean z2) {
        C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.163O
            public final void LIZ() {
                C207137163r c207137163r;
                if (z2) {
                    C163I c163i = C163I.LIZ;
                    List<Comment> list2 = list;
                    boolean z3 = z;
                    String str2 = str;
                    C207137163r c207137163r2 = new C207137163r(list2, z3, str2 != null ? str2 : "");
                    c163i.getClass();
                    C163I.LJII(c207137163r2);
                    return;
                }
                ConcurrentLinkedDeque<C207137163r> concurrentLinkedDeque = C163I.LJ;
                C207137163r c207137163rPeekLast = concurrentLinkedDeque.peekLast();
                C207137163r c207137163rPollLast = concurrentLinkedDeque.pollLast();
                if (c207137163rPeekLast != null && c207137163rPeekLast.LIZIZ == z && Intrinsics.LJFF(c207137163rPeekLast.LIZJ, str) && c207137163rPollLast != null && (!c207137163rPollLast.LIZ.isEmpty())) {
                    c207137163r = new C207137163r(C13LP.LJLIL(c207137163rPollLast.LIZ, list), z, str);
                } else {
                    List<Comment> list3 = list;
                    boolean z4 = z;
                    String str3 = str;
                    c207137163r = new C207137163r(list3, z4, str3 != null ? str3 : "");
                }
                concurrentLinkedDeque.add(c207137163r);
                C163I.LIZ.getClass();
                Handler handler = C163I.LIZIZ;
                C163X c163x = C163I.LJI;
                handler.removeCallbacks(c163x);
                C786410Ut5.LJLIIL(50L, handler, c163x);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CommentTranslationMultiTranslationManager@3db9.queueTranslationRequest$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CommentTranslationMultiTranslationManager@3db9.queueTranslationRequest$1");
            }
        });
    }
}

package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0ZtR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C914030ZtR implements InterfaceC864800XwE {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC864800XwE
    public final void LIZ(Object obj) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, obj);
                break;
            case 1:
                LIZ$1(this, obj);
                break;
            case 2:
                LIZ$2(this, obj);
                break;
            case 3:
                LIZ$3(this, obj);
                break;
            case 4:
                LIZ$4(this, obj);
                break;
            case 5:
                LIZ$5(this, obj);
                break;
            case 6:
                LIZ$6(this, obj);
                break;
            case 7:
                LIZ$7(this, obj);
                break;
            case 8:
                LIZ$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, obj);
                break;
        }
    }

    public C914030ZtR(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C914030ZtR c914030ZtR, Object obj) {
        C0YL3 c0yl3 = (C0YL3) obj;
        if (c0yl3 == null) {
            ((C872420YKi) c914030ZtR.l0).LLJIJIL.set(false);
            return;
        }
        List<C869590Y9l> listSubList = c0yl3.LIZ;
        C872420YKi c872420YKi = (C872420YKi) c914030ZtR.l0;
        c872420YKi.LLJ = c0yl3.LIZIZ;
        c872420YKi.LLJI = c0yl3.LIZJ;
        int size = listSubList.size();
        C872420YKi c872420YKi2 = (C872420YKi) c914030ZtR.l0;
        int i = c872420YKi2.LLILLL;
        if (size > i) {
            listSubList = listSubList.subList(size - i, size);
            ((C872420YKi) c914030ZtR.l0).LLIZ = false;
        } else {
            c872420YKi2.LLIZ = true;
        }
        ((C872420YKi) c914030ZtR.l0).LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel loadNewerMessageList onCallback");
        C872420YKi c872420YKi3 = (C872420YKi) c914030ZtR.l0;
        C868780Y6i c868780Y6iLIZLLL = c872420YKi3.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel onPerformLoadNewer, result:");
        sbLIZ.append(listSubList.size());
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        c872420YKi3.LLJIJIL.set(false);
        c872420YKi3.u6(listSubList, true);
        if (listSubList.size() >= c872420YKi3.LLILLL) {
            return;
        }
        c872420YKi3.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel onPerformLoadNewer, less than limit, loadNewer");
        c872420YKi3.LJIJJLI();
    }

    public static final void LIZ$1(C914030ZtR c914030ZtR, Object obj) {
        List<C869590Y9l> list = (List) obj;
        int size = 0;
        ((C872420YKi) c914030ZtR.l0).LLJIJIL.set(false);
        if (list != null) {
            size = list.size();
        }
        C868780Y6i c868780Y6iLIZLLL = ((C872420YKi) c914030ZtR.l0).LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel loadOlderMessageList onCallback, resultSize:");
        sbLIZ.append(size);
        sbLIZ.append(", pageLimit:");
        sbLIZ.append(((C872420YKi) c914030ZtR.l0).LLILLL);
        sbLIZ.append(", previewMode=");
        sbLIZ.append(((C872420YKi) c914030ZtR.l0).LLJILJIL);
        sbLIZ.append(", mUptoOldest=");
        sbLIZ.append(((C872420YKi) c914030ZtR.l0).LLIZLLLIL);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (list == null) {
            ((C872420YKi) c914030ZtR.l0).Us(null, EnumC872590YKz.SKIPPED);
            return;
        }
        if (!list.isEmpty()) {
            ((C872420YKi) c914030ZtR.l0).Us(list, EnumC872590YKz.SUCCESS);
        }
        if (list.size() >= ((C872420YKi) c914030ZtR.l0).LLILLL) {
            return;
        }
        C872420YKi c872420YKi = (C872420YKi) c914030ZtR.l0;
        c872420YKi.LIZJ(c872420YKi.LJIIIIZZ());
    }

    public static final void LIZ$10(C914030ZtR c914030ZtR, Object obj) {
        List<C869590Y9l> list = (List) obj;
        C868780Y6i c868780Y6iLIZLLL = ((C872520YKs) c914030ZtR.l0).LLIZLLLIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageBrowserModel loadOlderMessageList onCallback, result:");
        sbLIZ.append(list.size());
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        C872520YKs c872520YKs = (C872520YKs) c914030ZtR.l0;
        c872520YKs.LLIZ = false;
        c872520YKs.Us(list, EnumC872590YKz.SUCCESS);
    }

    public static final void LIZ$11(C914030ZtR c914030ZtR, Object obj) {
        C869590Y9l c869590Y9l;
        C0Y7T c0y7t = (C0Y7T) obj;
        if (c0y7t != null && (c0y7t.LIZ instanceof C0Y76) && (c869590Y9l = c0y7t.LIZIZ) != null) {
            ((C0Y87) c914030ZtR.l0).LIZJ(c869590Y9l);
            return;
        }
        C0Y87 c0y87 = (C0Y87) c914030ZtR.l0;
        C0YMW c0ymw = C0YMW.newBuilder().LIZ;
        c0ymw.statusMsg = "saveMessage fail";
        c0y87.LIZIZ(c0ymw);
    }

    public static final void LIZ$12(C914030ZtR c914030ZtR, Object obj) {
        List<C869590Y9l> list = (List) obj;
        C0YB5 c0yb5 = (C0YB5) c914030ZtR.l0;
        SystemClock.uptimeMillis();
        c0yb5.getClass();
        if (list != null && list.size() > 0) {
            ((C0YB5) c914030ZtR.l0).LIZJ(list);
            ((C0YB5) c914030ZtR.l0).LIZJ.LJIIZILJ().getDomain().LIZ.LJJIIJZLJL(new C0Y3I("message refreshing"), list);
        } else {
            ((C0YB5) c914030ZtR.l0).LIZJ(new ArrayList());
        }
    }

    public static final void LIZ$13(C914030ZtR c914030ZtR, Object obj) {
        ((C871200YFq) c914030ZtR.l0).LJFF((List) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079 A[PHI: r3
      0x0079: PHI (r3v1 boolean) = (r3v0 boolean), (r3v4 boolean) binds: [B:21:0x0076, B:8:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$2(X.C914030ZtR r6, java.lang.Object r7) {
        /*
            android.util.Pair r7 = (android.util.Pair) r7
            r2 = 1
            r4 = 0
            if (r7 == 0) goto L75
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r7.first
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L75
            r3 = 1
        L11:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object r0 = r7.second
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L79
            r5 = 1
        L1c:
            java.lang.Object r0 = r6.l0
            X.0YKi r0 = (X.C872420YKi) r0
            if (r5 == 0) goto L73
            if (r3 != 0) goto L73
        L24:
            r0.LLIZLLLIL = r2
            X.0YEM r0 = r0.LLJJIJIIJIL
            X.0Y6i r2 = r0.LIZLLL()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "MessageModel continueLoadingOlder gap="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", atDbOldest="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", mUptoOldest="
            r1.append(r0)
            java.lang.Object r0 = r6.l0
            X.0YKi r0 = (X.C872420YKi) r0
            boolean r0 = r0.LLIZLLLIL
            r1.append(r0)
            java.lang.String r0 = ", cid="
            r1.append(r0)
            java.lang.Object r0 = r6.l0
            X.0YKi r0 = (X.C872420YKi) r0
            java.lang.String r0 = r0.LL
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.LJIIJJI(r0)
            if (r3 == 0) goto Lb6
            java.lang.Object r5 = r6.l0
            X.0YKi r5 = (X.C872420YKi) r5
            X.0Y8T r6 = r5.LJ()
            if (r6 != 0) goto L7b
            r5.LJIJJ()
            return
        L73:
            r2 = 0
            goto L24
        L75:
            r3 = 0
            if (r7 == 0) goto L79
            goto L11
        L79:
            r5 = 0
            goto L1c
        L7b:
            X.0YEM r0 = r5.LLJJIJIIJIL
            X.0Y6i r2 = r0.LIZLLL()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "MessageModel resolveOlderGap enqueue, cid="
            r1.append(r0)
            java.lang.String r0 = r5.LL
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.LJIIJJI(r0)
            X.0YEM r0 = r5.LLJJIJIIJIL
            X.0XwD r0 = r0.LJIIZILJ()
            X.0Y52 r0 = r0.getDomain()
            X.0Y3z r3 = r0.LIZJ()
            java.util.List r2 = r5.LJIIIIZZ()
            r1 = 0
            r0 = 28
            X.0YL9 r0 = X.C0YL8.LIZ(r6, r2, r4, r1, r0)
            r3.LJLLJ(r0)
            r5.LJIJJ()
            return
        Lb6:
            java.lang.Object r0 = r6.l0
            X.0YKi r0 = (X.C872420YKi) r0
            r0.LJIJJ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C914030ZtR.LIZ$2(X.0ZtR, java.lang.Object):void");
    }

    public static final void LIZ$3(C914030ZtR c914030ZtR, Object obj) {
        Runnable runnable = (Runnable) c914030ZtR.l0;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void LIZ$4(C914030ZtR c914030ZtR, Object obj) {
        ((InterfaceC863600XuI) c914030ZtR.l0).onSuccess(obj);
    }

    public static final void LIZ$5(C914030ZtR c914030ZtR, Object obj) {
        ((InterfaceC863600XuI) c914030ZtR.l0).onSuccess(obj);
    }

    public static final void LIZ$6(C914030ZtR c914030ZtR, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            InterfaceC863600XuI interfaceC863600XuI = (InterfaceC863600XuI) c914030ZtR.l0;
            if (interfaceC863600XuI != null) {
                interfaceC863600XuI.onSuccess(Boolean.TRUE);
                return;
            }
            return;
        }
        InterfaceC863600XuI interfaceC863600XuI2 = (InterfaceC863600XuI) c914030ZtR.l0;
        C0YMW c0ymw = C0YMW.newBuilder().LIZ;
        c0ymw.code = -3001;
        c0ymw.statusMsg = "batchUpdateLocalExt failed";
        interfaceC863600XuI2.LIZIZ(c0ymw);
    }

    public static final void LIZ$7(C914030ZtR c914030ZtR, Object obj) {
        ((ConcurrentHashMap) ((C0Y60) c914030ZtR.l0).LJI).remove("preload");
    }

    public static final void LIZ$8(C914030ZtR c914030ZtR, Object obj) {
        List<C869590Y9l> list = (List) obj;
        ((C872520YKs) c914030ZtR.l0).LLIZLLLIL.LIZLLL().LJIIJJI("MessageBrowserModel initMessageList onCallback");
        C872520YKs c872520YKs = (C872520YKs) c914030ZtR.l0;
        C868780Y6i c868780Y6iLIZLLL = c872520YKs.LLIZLLLIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageBrowserModel onPerformInit, result:");
        sbLIZ.append(list.size());
        sbLIZ.append(", from:");
        sbLIZ.append("");
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        c872520YKs.LLIZ = false;
        c872520YKs.LLILZ.addAll(list);
        c872520YKs.a(1, "", list, null);
    }

    public static final void LIZ$9(C914030ZtR c914030ZtR, Object obj) {
        List<C869590Y9l> list = (List) obj;
        C868780Y6i c868780Y6iLIZLLL = ((C872520YKs) c914030ZtR.l0).LLIZLLLIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageBrowserModel loadNewerMessageList onCallback, result:");
        sbLIZ.append(list.size());
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        ((C872520YKs) c914030ZtR.l0).LLIZ = false;
        if (!list.isEmpty()) {
            Collections.reverse(list);
            ((C872520YKs) c914030ZtR.l0).LLILZ.addList(list);
            ((C872520YKs) c914030ZtR.l0).u6(list, true);
            return;
        }
        ((C872520YKs) c914030ZtR.l0).u6(list, false);
    }

    public C914030ZtR(C0YB5 c0yb5, long j, int i) {
        this.$t = i;
        this.l0 = c0yb5;
    }
}

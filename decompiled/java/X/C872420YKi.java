package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.im.core.model.SingleConReadInfoHelper;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessagesInConversationRequestBody;
import com.bytedance.im.core.proto.MessagesInConversationResponseBody;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0YKi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C872420YKi implements InterfaceC868420Y4y, InterfaceC871950YIn, InterfaceC871600YHe {
    public final String LL;
    public InterfaceC872570YKx LLILLJJLI;
    public final boolean LLILZLL;
    public C869590Y9l LLJ;
    public C869590Y9l LLJI;
    public volatile boolean LLJILJIL;
    public final C0YL7 LLJILJILJ;
    public long LLJILLL;
    public C0YPQ LLJJ;
    public boolean LLJJI;
    public final SingleConReadInfoHelper LLJJIII;
    public final boolean LLJJIJI;
    public final C0YEM LLJJIJIIJIL;
    public final C0Y9J LLJJIJIL;
    public int LLILLL = 20;
    public final Object LLILZ = new Object();
    public final Set<InterfaceC868420Y4y> LLILZIL = new HashSet();
    public boolean LLIZ = true;
    public boolean LLIZLLLIL = false;
    public final AtomicBoolean LLJIJIL = new AtomicBoolean(false);

    @Override // X.InterfaceC871950YIn
    public final void LIZ() {
    }

    @Override // X.InterfaceC868420Y4y
    public final void nc(List<C869590Y9l> list) {
    }

    @Override // X.InterfaceC868420Y4y
    public final void ns(String str) {
    }

    public final List<InterfaceC868420Y4y> LIZLLL() {
        ArrayList arrayList;
        synchronized (this.LLILZ) {
            try {
                arrayList = new ArrayList(this.LLILZIL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return arrayList;
    }

    public final C0Y8T LJ() {
        return this.LLJJIJIIJIL.LJIIZILJ().LIZLLL().LIZ().LIZ(this.LL);
    }

    public final Executor LJFF() {
        return this.LLJJIJIIJIL.LJIIIZ().LJJJLL.isEmpty() ? this.LLJJIJIIJIL.LJIIL().LIZIZ() : this.LLJJIJIIJIL.LJIIL().LIZ();
    }

    public final C869590Y9l LJI() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(EnumC868450Y5b.LEGACY_MESSAGE_TYPE_SYSTEM.getValue()));
        return this.LLJJIJIL.LJI().LJJIIZ(this.LL, arrayList, true);
    }

    @Override // X.InterfaceC871600YHe
    public final void LJII() {
        LJIIIZ(this.LLILLL, null, "MessageModel.initMessageList.default");
    }

    @Override // X.InterfaceC871600YHe
    public final List<C869590Y9l> LJIIIIZZ() {
        return this.LLILLJJLI.toListCopy();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d A[PHI: r9 r10
      0x014d: PHI (r9v1 boolean) = (r9v0 boolean), (r9v4 boolean) binds: [B:33:0x00fe, B:35:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x014d: PHI (r10v2 boolean) = (r10v1 boolean), (r10v5 boolean) binds: [B:33:0x00fe, B:35:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C872420YKi.LJIJJ():void");
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.0Y0q, java.lang.Object] */
    public final void LJIJJLI() {
        if (this.LLJILJIL) {
            return;
        }
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        c868780Y6iLIZLLL.getClass();
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageModel ", "enable resolve and always load newer", 4);
        C870180YBs c870180YBsLIZ = this.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZ();
        final String str = this.LL;
        c870180YBsLIZ.getClass();
        final C0YEM c0yem = c870180YBsLIZ.LLILLL;
        final ?? r7 = new AbstractC867440Y1e(c0yem) { // from class: X.0Y0q
            @Override // X.AbstractC867440Y1e
            public final boolean LJ() {
                return true;
            }

            {
                int value = C0YMR.GET_MESSAGES_BY_CONVERSATION.getValue();
            }

            @Override // X.AbstractC867440Y1e
            public final boolean LJIIIIZZ(C0YIN c0yin) {
                ResponseBody responseBody = c0yin.LLIZ.body;
                if (responseBody != null && responseBody.messages_in_conversation_body != null) {
                    return true;
                }
                return false;
            }

            @Override // X.AbstractC867440Y1e
            public final void LJII(final C0YIN c0yin, C0Y1G c0y1g) {
                if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
                    final String str2 = (String) c0yin.LLILZIL[0];
                    final MessagesInConversationResponseBody messagesInConversationResponseBody = c0yin.LLIZ.body.messages_in_conversation_body;
                    this.LIZJ.LJIIJJI().LIZJ(new InterfaceC872410YKh<List<C869590Y9l>>() { // from class: X.0Y7R
                        @Override // X.InterfaceC872410YKh
                        public final List<C869590Y9l> LIZ() {
                            C869590Y9l c869590Y9l;
                            ArrayList arrayList = new ArrayList();
                            try {
                                Boolean bool = messagesInConversationResponseBody.has_more;
                                if (bool != null) {
                                    bool.booleanValue();
                                }
                                List<MessageBody> listLIZIZ = C0Y81.LIZIZ(messagesInConversationResponseBody, this.LIZJ.LIZJ, 11, c0yin.LJIIIZ(), "LoadNewerHandler");
                                String str3 = c0yin.LLIZ.region;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                for (MessageBody messageBody : listLIZIZ) {
                                    Integer num = messageBody.status;
                                    if (num == null || num.intValue() != 1) {
                                        HashMap map = new HashMap();
                                        map.put("s:get_msg_log_id", c0yin.LJIIIZ());
                                        C0Y7T c0y7tLIZJ = this.LIZJ.LIZJ.LJIIZILJ().getDomain().LIZLLL().LIZIZ().LIZJ(messageBody, str3, 11, map, 5);
                                        if ((c0y7tLIZJ.LIZ instanceof C0Y76) && (c869590Y9l = c0y7tLIZJ.LIZIZ) != null) {
                                            arrayList.add(c869590Y9l);
                                        }
                                    }
                                }
                                Collections.sort(arrayList);
                                return arrayList;
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                this.LIZJ.LIZJ.LIZLLL().LJIIIZ("LoadNewerHandler saveMsg", e);
                                this.LIZJ.LIZJ.LJIIZILJ().LJFF().LIZ().LJIILIIL(1, e);
                                return arrayList;
                            }
                        }
                    }, new InterfaceC864800XwE<List<C869590Y9l>>() { // from class: X.0Y0p
                        @Override // X.InterfaceC864800XwE
                        public final void LIZ(List<C869590Y9l> list) {
                            List<C869590Y9l> list2 = list;
                            C868200Y4c c868200Y4c = this.LIZIZ.LIZJ.LJIIZILJ().getDomain().LIZ;
                            String str3 = str2;
                            c868200Y4c.getClass();
                            if (!TextUtils.isEmpty(str3)) {
                                c868200Y4c.LJIIZILJ(str3, new C868410Y4x(list2));
                            }
                        }
                    }, false, this.LIZJ.LJIIL().LIZJ());
                }
            }
        };
        final C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
        if (c0y8tLIZ != null && !c0y8tLIZ.isLocal()) {
            c0yem.LJIIJJI().LIZJ(new C914060ZtU(r7, str, c0y8tLIZ, 5), new InterfaceC864800XwE<Long>() { // from class: X.0Y7b
                @Override // X.InterfaceC864800XwE
                public final void LIZ(Long l) {
                    Long l2 = l;
                    if (l2.longValue() == -1) {
                        C868200Y4c c868200Y4c = r7.LIZJ.LJIIZILJ().getDomain().LIZ;
                        String str2 = str;
                        c868200Y4c.getClass();
                        if (!TextUtils.isEmpty(str2)) {
                            c868200Y4c.LJIIZILJ(str2, new C868410Y4x(null));
                            return;
                        }
                        return;
                    }
                    C867300Y0q c867300Y0q = r7;
                    C0Y8T c0y8t = c0y8tLIZ;
                    long jLongValue = l2.longValue();
                    c867300Y0q.getClass();
                    int iIntValue = MessagesInConversationRequestBody.DEFAULT_LIMIT.intValue();
                    C868980Y7c c868980Y7c = new C868980Y7c();
                    c868980Y7c.LIZLLL = c0y8t.getConversationId();
                    c868980Y7c.LJFF = Long.valueOf(c0y8t.getConversationShortId());
                    c868980Y7c.LJ = Integer.valueOf(c0y8t.getConversationType());
                    c868980Y7c.LJI = EnumC873090YMx.FROM_OLD_TO_NEW;
                    c868980Y7c.LJII = Long.valueOf(jLongValue);
                    c868980Y7c.LJIIIIZZ = Integer.valueOf(iIntValue);
                    MessagesInConversationRequestBody messagesInConversationRequestBodyBuild = c868980Y7c.build();
                    C1ES0 c1es0 = new C1ES0();
                    c1es0.LJIIJJI = messagesInConversationRequestBodyBuild;
                    c867300Y0q.LJIIIZ(c0y8t.getInboxType(), c1es0.build(), null, c0y8t.getConversationId());
                }
            }, false, c0yem.LJIIL().LIZJ());
            return;
        }
        C868200Y4c c868200Y4c = c0yem.LJIIZILJ().getDomain().LIZ;
        c868200Y4c.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        c868200Y4c.LJIIZILJ(str, new C868410Y4x(null));
    }

    public final void LJIL() {
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel requestPreviewHistoryMessage, cid:");
        sbLIZ.append(this.LL);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        C0Y8T c0y8tLJ = LJ();
        if (c0y8tLJ == null) {
            this.LLJJIJIIJIL.LIZLLL().LJI("MessageModel requestPreviewHistoryMessage failed: conversation is null");
            return;
        }
        this.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZJ().LLLF(new C0Y8F(this.LL, c0y8tLJ.getConversationShortId(), this.LLILLL, c0y8tLJ.getInboxType()));
    }

    @Override // X.InterfaceC871600YHe
    public final void LJJIII() {
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel loadOlderMessageList, previewMode=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", mUptoOldest=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", msgListSize=");
        sbLIZ.append(this.LLILLJJLI.size());
        sbLIZ.append(", cid=");
        sbLIZ.append(this.LL);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJILJIL && this.LLIZLLLIL && !this.LLILLJJLI.isEmpty()) {
            this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel loadOlderMessageList skipped in preview after first page loaded");
            Us(null, EnumC872590YKz.SUCCESS);
            return;
        }
        C0Y8T c0y8tLJ = LJ();
        if (c0y8tLJ == null) {
            Us(null, EnumC872590YKz.SKIPPED);
            return;
        }
        if (this.LLJIJIL.get()) {
            this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel loadOlderMessageList querying now");
            Us(null, EnumC872590YKz.SKIPPED);
        } else if (this.LLJIJIL.compareAndSet(false, true)) {
            this.LLJJIJIIJIL.LJIIJJI().LIZJ(new C914040ZtS(this, c0y8tLJ, 0), new C914030ZtR(this, 1), true, LJFF());
        }
    }

    @Override // X.InterfaceC871600YHe
    public final void LJJIZ() {
        this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel unregisterAll");
        this.LLILLJJLI.clear();
        this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel unregister multiple observers path");
        synchronized (this.LLILZ) {
            try {
                ((HashSet) this.LLILZIL).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C868200Y4c c868200Y4c = this.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZ;
        c868200Y4c.getClass();
        c868200Y4c.LJII(this.LL, this);
        ((CopyOnWriteArraySet) this.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZ.LJI).remove(this);
    }

    @Override // X.InterfaceC871600YHe
    public final void LJJJI() {
        this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel loadNewerMessageList");
        if (this.LLJILJIL) {
            return;
        }
        if (this.LLIZ) {
            this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel loadNewerMessageList upToNewest");
            u6(null, true);
        } else if (this.LLILLJJLI.isEmpty()) {
            u6(null, false);
            LJII();
        } else if (this.LLJIJIL.compareAndSet(false, true)) {
            this.LLJJIJIIJIL.LJIIJJI().LIZJ(new C914050ZtT(this, 4), new C914030ZtR(this, 0), true, LJFF());
        } else {
            this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel loadNewerMessageList querying now");
            u6(null, false);
        }
    }

    @Override // X.InterfaceC871600YHe
    public final void resume() {
        this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel resume");
        if (this.LLJJIJI && this.LLILZLL) {
            this.LLJJIJIIJIL.LJIIZILJ().LIZLLL().LIZLLL().LJJIJIIJIL(this.LL);
        } else if (this.LLILZLL) {
            this.LLJJIJIIJIL.LJIIZILJ().LIZLLL().LIZLLL().LJJJI(this.LL);
        }
        this.LLJJIII.LIZIZ();
    }

    @Override // X.InterfaceC871600YHe
    public final void stop() {
        this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel stop");
        if (this.LLJJIJI && this.LLILZLL) {
            this.LLJJIJIIJIL.LJIIZILJ().LIZLLL().LIZLLL().LJJJLZIJ(this.LL);
        } else if (this.LLILZLL) {
            this.LLJJIJIIJIL.LJIIZILJ().LIZLLL().LIZLLL().LJJJIL(this.LL);
        }
        removeMessages(1);
    }

    @Override // X.InterfaceC871600YHe
    public final C869590Y9l LJIILJJIL() {
        return this.LLJ;
    }

    @Override // X.InterfaceC871600YHe
    public final boolean LJIJ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC871600YHe
    public final boolean LJJJJI() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC871600YHe
    public final int LJJJJIZL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC871600YHe
    public final C869590Y9l LLLII() {
        return this.LLJI;
    }

    public final boolean LIZIZ(List<C869590Y9l> list) {
        List listLIZJ;
        if (!LJJ(list)) {
            return false;
        }
        long index = Long.MAX_VALUE;
        long index2 = -1;
        for (C869590Y9l c869590Y9l : list) {
            if (C0YL6.LIZ(c869590Y9l)) {
                if (c869590Y9l.getIndex() < index) {
                    index = c869590Y9l.getIndex();
                }
                if (c869590Y9l.getIndex() > index2) {
                    index2 = c869590Y9l.getIndex();
                }
            }
        }
        if (index2 <= 0 || (listLIZJ = this.LLJJIJIL.LJI().LIZJ(index, this.LL, LSPassThroughRecordSizeConfig.DEFAULT, index2)) == null || listLIZJ.isEmpty() || listLIZJ.size() >= 1000) {
            return false;
        }
        this.LLJILJILJ.getClass();
        C788930Ux9 c788930Ux9LIZIZ = C0YL7.LIZIZ(listLIZJ);
        if (c788930Ux9LIZIZ == null || !c788930Ux9LIZIZ.LIZIZ) {
            return false;
        }
        return true;
    }

    public final void LIZJ(List<C869590Y9l> list) {
        if (this.LLJILJIL) {
            this.LLIZLLLIL = true;
            LJIL();
        } else if (!LJJ(list)) {
            this.LLIZLLLIL = true;
            LJIJJ();
        } else {
            this.LLIZLLLIL = false;
            this.LLJJIJIIJIL.LJIIJJI().LIZJ(new C914040ZtS(this, list, 1), new C914030ZtR(this, 2), true, LJFF());
        }
    }

    public final boolean LJIIJ(List<C869590Y9l> list) {
        if (list.isEmpty() || ((C869590Y9l) ListProtector.get(list, list.size() - 1)).getIndex() == this.LLJJIJIL.LJI().LJJIFFI(this.LL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC871600YHe
    public final void LJIIJJI(int i) {
        this.LLILLL = i;
    }

    public final List LJIIL(int i) {
        C869590Y9l c869590Y9l;
        if (this.LLILLJJLI.isEmpty()) {
            c869590Y9l = null;
        } else {
            c869590Y9l = this.LLILLJJLI.get(0);
        }
        C0Y8T c0y8tLJ = LJ();
        if (c869590Y9l != null && c0y8tLJ != null) {
            C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("MessageModel loadNewMessages using queryNewerMessageListByOrderIndex with orderIndex ");
            sbLIZ.append(c869590Y9l.getOrderIndex());
            c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
            return (List) this.LLJJIJIL.LJI().LJJLJLI(i, c869590Y9l.getOrderIndex(), this.LL).LIZ(Collections.emptyList());
        }
        return Collections.emptyList();
    }

    public final boolean LJJ(List<C869590Y9l> list) {
        if (!this.LLJJIJIIJIL.LJIIIZ().LJJLIIIIJ.LJJJJLI || !this.LLJJIJIIJIL.LJIIIZ().LJJJJZ.LIZ) {
            return false;
        }
        this.LLJILJILJ.getClass();
        C788930Ux9 c788930Ux9LIZIZ = C0YL7.LIZIZ(list);
        if (c788930Ux9LIZIZ != null && c788930Ux9LIZIZ.LIZIZ) {
            return true;
        }
        return false;
    }

    public final boolean LJJI(List<C869590Y9l> list) {
        if (list.isEmpty() || ((C869590Y9l) ListProtector.get(list, 0)).getIndex() == this.LLJJIJIL.LJI().LJJIJ(this.LL)) {
            return true;
        }
        return false;
    }

    public final boolean LJJIFFI(List<C869590Y9l> list) {
        if (LJIIJ(list) && !LIZIZ(list)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC871600YHe
    public final void LJJJIL(InterfaceC868420Y4y interfaceC868420Y4y) {
        boolean zIsEmpty;
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel register, autoGetConversationInfo:");
        sbLIZ.append(true);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel register multiple observers path");
        synchronized (this.LLILZ) {
            try {
                zIsEmpty = ((HashSet) this.LLILZIL).isEmpty();
                ((HashSet) this.LLILZIL).add(interfaceC868420Y4y);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (zIsEmpty) {
            C868200Y4c c868200Y4c = this.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZ;
            c868200Y4c.getClass();
            c868200Y4c.LJIIL(this.LL, this);
        }
        this.LLJJIJIIJIL.LJIIZILJ().LIZLLL().LIZ().LJFF(this.LL);
    }

    @Override // X.InterfaceC871600YHe
    public final void LJLLLL(long j) {
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel initMessageListAroundIndexFromRemote index=");
        sbLIZ.append(j);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIJIIJIL.LJIIJJI().LIZJ(new C872470YKn(this, j), null, true, LJFF());
    }

    @Override // X.InterfaceC871600YHe
    public final void LLILLL(final long j) {
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel initMessageListByIndex index=");
        sbLIZ.append(j);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJIJIL.compareAndSet(false, true)) {
            this.LLJILLL = SystemClock.uptimeMillis();
            this.LLJJIJIIJIL.LJIIJJI().LIZJ(new InterfaceC872410YKh<C0YL0>() { // from class: X.0YKq
                @Override // X.InterfaceC872410YKh
                public final C0YL0 LIZ() throws Throwable {
                    C869580Y9k c869580Y9kLJI = this.LIZIZ.LLJJIJIL.LJI();
                    C872420YKi c872420YKi = this.LIZIZ;
                    String str = c872420YKi.LL;
                    List<C869590Y9l> listLJJZZI = c869580Y9kLJI.LJJZZI(c872420YKi.LLILLL, j, str);
                    this.LIZIZ.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel initMessageListByIndex, mix link onRun");
                    if (listLJJZZI != null) {
                        this.LIZIZ.LLILLJJLI.clear();
                        this.LIZIZ.LLILLJJLI.addAll(listLJJZZI);
                    }
                    C869590Y9l c869590Y9lLJI = this.LIZIZ.LJI();
                    C872420YKi c872420YKi2 = this.LIZIZ;
                    return new C0YL0(c869590Y9lLJI, c872420YKi2.LLJJIJIL.LJI().LJJIIZ(c872420YKi2.LL, null, false), this.LIZIZ.LJJI(listLJJZZI), this.LIZIZ.LJJIFFI(listLJJZZI), listLJJZZI);
                }
            }, new InterfaceC864800XwE<C0YL0>() { // from class: X.0YKj
                public final /* synthetic */ String LIZIZ = "MessageModelWrapper";

                @Override // X.InterfaceC864800XwE
                public final void LIZ(C0YL0 c0yl0) {
                    C0Y8T c0y8tLJ;
                    int i;
                    int code;
                    String message;
                    long msgId;
                    C869590Y9l c869590Y9l;
                    C0YL0 c0yl02 = c0yl0;
                    this.LIZJ.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel initMessageListByIndex onCallback");
                    if (c0yl02 == null) {
                        this.LIZJ.LLJIJIL.set(false);
                        return;
                    }
                    C872420YKi c872420YKi = this.LIZJ;
                    c872420YKi.LLIZLLLIL = c0yl02.LIZLLL;
                    c872420YKi.LLIZ = c0yl02.LIZJ;
                    c872420YKi.LLJ = c0yl02.LIZ;
                    c872420YKi.LLJI = c0yl02.LIZIZ;
                    C872420YKi c872420YKi2 = this.LIZJ;
                    List<C869590Y9l> list = c0yl02.LJ;
                    long j2 = j;
                    String str = this.LIZIZ;
                    Long lValueOf = Long.valueOf(j2);
                    C868780Y6i c868780Y6iLIZLLL2 = c872420YKi2.LLJJIJIIJIL.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("MessageModel onPerformInitLocation start, result:");
                    sbLIZ2.append(list.size());
                    sbLIZ2.append(", targetIndex:");
                    sbLIZ2.append(j2);
                    sbLIZ2.append(", from:");
                    sbLIZ2.append(str);
                    c868780Y6iLIZLLL2.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                    if (!c872420YKi2.LLJJI && c872420YKi2.LLJILLL > 0) {
                        C870460YCu c870460YCuLIZ = c872420YKi2.LLJJIJIIJIL.LJIIZILJ().LJFF().LIZ();
                        String str2 = c872420YKi2.LL;
                        long jUptimeMillis = SystemClock.uptimeMillis() - c872420YKi2.LLJILLL;
                        int size = list.size();
                        C0YPQ c0ypq = c872420YKi2.LLJJ;
                        if (c0ypq == null) {
                            i = 1;
                            code = -1;
                        } else {
                            i = 0;
                            code = c0ypq.getCode();
                        }
                        C0YPQ c0ypq2 = c872420YKi2.LLJJ;
                        if (c0ypq2 == null) {
                            message = "";
                        } else {
                            message = c0ypq2.getMessage();
                        }
                        if (!list.isEmpty() && (c869590Y9l = (C869590Y9l) ListProtector.get(list, 0)) != null) {
                            msgId = c869590Y9l.getMsgId();
                        } else {
                            msgId = -1;
                        }
                        c870460YCuLIZ.LJIIL(jUptimeMillis, str2, msgId, size, i, code, message);
                    }
                    c872420YKi2.LLJJI = true;
                    c872420YKi2.LLJIJIL.set(false);
                    int i2 = 0;
                    int i3 = 0;
                    for (C869590Y9l c869590Y9l2 : c872420YKi2.LLILLJJLI.toListCopy()) {
                        if (c869590Y9l2.getIndex() < j2) {
                            i2++;
                        } else if (c869590Y9l2.getIndex() > j2) {
                            i3++;
                        }
                    }
                    Pair pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
                    int iIntValue = ((Integer) pair.first).intValue();
                    int iIntValue2 = ((Integer) pair.second).intValue();
                    int i4 = c872420YKi2.LLILLL / 2;
                    c872420YKi2.a(1, str, list, lValueOf);
                    if (iIntValue < i4 - 1 && c872420YKi2.LLIZLLLIL) {
                        c872420YKi2.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel onPerformInitLocation, continueLoadingOlder");
                        c872420YKi2.LIZJ(c872420YKi2.LJIIIIZZ());
                    }
                    if (iIntValue2 < i4 && c872420YKi2.LLIZ) {
                        c872420YKi2.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel onPerformInitLocation, requestNewerMessage");
                        c872420YKi2.LJIJJLI();
                    }
                    if (list.size() <= 15 && iIntValue <= 10) {
                        c872420YKi2.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel onPerformInitLocation, loadOlderMessageList");
                        c872420YKi2.LJJIII();
                    }
                    if (list.size() <= 15 && iIntValue2 <= 10) {
                        c872420YKi2.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel onPerformInitLocation, loadNewerMessageList");
                        c872420YKi2.LJJJI();
                    }
                    if (list.size() < c872420YKi2.LLILLL || (c0y8tLJ = c872420YKi2.LJ()) == null) {
                        return;
                    }
                    c872420YKi2.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZJ().LJLLJ(C0YL8.LIZ(c0y8tLJ, c872420YKi2.LJIIIIZZ(), false, null, 28));
                    C868780Y6i c868780Y6iLIZLLL3 = c872420YKi2.LLJJIJIIJIL.LIZLLL();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("resolve message gap, called from onPerformInitLocation with input size ");
                    sbLIZ3.append(list.size());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                    c868780Y6iLIZLLL3.getClass();
                    C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL3, "MessageModel ", strLIZIZ, 4);
                }
            }, true, LJFF());
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
        if (c869590Y9l != null && this.LLILLJJLI.update(c869590Y9l)) {
            C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
            c868780Y6iLIZLLL.getClass();
            C868780Y6i.LJ(c868780Y6iLIZLLL, "RecallMsgFeature", "Update message list", 4);
            Iterator it2 = ((ArrayList) LIZLLL()).iterator();
            while (it2.hasNext()) {
                ((InterfaceC868420Y4y) it2.next()).LLILZ(c869590Y9l);
            }
            return;
        }
        C868780Y6i c868780Y6iLIZLLL2 = this.LLJJIJIIJIL.LIZLLL();
        c868780Y6iLIZLLL2.getClass();
        C868780Y6i.LJ(c868780Y6iLIZLLL2, "RecallMsgFeature", "failed to update message list", 4);
    }

    @Override // X.InterfaceC871600YHe
    public final void LLJI(InterfaceC868420Y4y interfaceC868420Y4y) {
        this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel unregister one observer in multiple observers path");
        synchronized (this.LLILZ) {
            try {
                ((HashSet) this.LLILZIL).remove(interfaceC868420Y4y);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC871600YHe
    public final void LLLILZ(C914150Ztd c914150Ztd) {
        LJIIIZ(this.LLILLL, c914150Ztd, "MessageModelWrapper: getMessageListSuspend");
    }

    @Override // X.InterfaceC871600YHe
    public final void LLLILZJ(boolean z) {
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel setPreviewMode enabled:");
        sbLIZ.append(z);
        sbLIZ.append(", was:");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", mUptoOldest:");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", msgListSize:");
        sbLIZ.append(this.LLILLJJLI.size());
        sbLIZ.append(", cid:");
        sbLIZ.append(this.LL);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        boolean z2 = this.LLJILJIL;
        this.LLJILJIL = z;
        if (z2 && !z) {
            this.LLIZLLLIL = false;
            this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel setPreviewMode: reset mUptoOldest=false for normal loading");
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
        if (c869590Y9l == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) LIZLLL();
        if (arrayList.isEmpty()) {
            return;
        }
        this.LLJJIJIIJIL.LJIIIZ().getClass();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC868420Y4y) it2.next()).Re(c869590Y9l);
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void mf(C869590Y9l c869590Y9l) {
        if (this.LLILLJJLI.delete(c869590Y9l)) {
            Iterator it2 = ((ArrayList) LIZLLL()).iterator();
            while (it2.hasNext()) {
                ((InterfaceC868420Y4y) it2.next()).mf(c869590Y9l);
            }
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void Jk(final C869590Y9l c869590Y9l, final int i) {
        if (this.LLJJIJI && !this.LLIZ) {
            C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
            c868780Y6iLIZLLL.getClass();
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageModel ", "skip onAddMessage because it's from search", 4);
            if (c869590Y9l != null) {
                if (this.LLJI == null || c869590Y9l.getOrderIndex() > this.LLJI.getOrderIndex()) {
                    this.LLJI = c869590Y9l;
                    return;
                }
                return;
            }
            return;
        }
        if (c869590Y9l.getLocalCache(-1) == null && !this.LLIZ) {
            LJIIIZ(this.LLILLL, new InterfaceC863600XuI() { // from class: X.0YLA
                @Override // X.InterfaceC863600XuI
                public final void LIZIZ(C0YMW c0ymw) {
                    this.LJIILIIL(c869590Y9l, i);
                }

                @Override // X.InterfaceC863600XuI
                public final void onSuccess(Object obj) {
                    this.LJIILIIL(c869590Y9l, i);
                }
            }, "MessageModel.onAddMessage");
        } else {
            LJIILIIL(c869590Y9l, i);
        }
    }

    public final void LJIILIIL(final C869590Y9l c869590Y9l, final int i) {
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel onAddMessageInner, mUptoNewest:");
        sbLIZ.append(this.LLIZ);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLIZ) {
            return;
        }
        this.LLJJIJIIJIL.LJIIJJI().LIZJ(new InterfaceC872410YKh<Void>() { // from class: X.0YKu
            @Override // X.InterfaceC872410YKh
            public final Void LIZ() {
                C869590Y9l c869590Y9l2 = c869590Y9l;
                if (c869590Y9l2 != null && i == C0YIF.LIZ) {
                    this.LLILLJJLI.add(c869590Y9l2);
                    if (this.LLILLJJLI.size() > 3000) {
                        C872420YKi c872420YKi = this;
                        c872420YKi.LLILLJJLI = c872420YKi.LLILLJJLI.toSubList(0, LivePreCreateNextRoomPlayer.ENABLE);
                    }
                }
                Iterator it2 = ((ArrayList) this.LIZLLL()).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC868420Y4y) it2.next()).Jk(c869590Y9l, i);
                }
                return null;
            }
        }, new C914010ZtP(3), false, this.LLJJIJIIJIL.LJIIL().LIZJ());
    }

    @Override // X.InterfaceC871600YHe
    public final void LLIIL(C0Y3I c0y3i, C869590Y9l c869590Y9l) {
        LJJJLZIJ(c0y3i, c869590Y9l, null);
    }

    @Override // X.InterfaceC868420Y4y
    public final void Us(final List<C869590Y9l> list, final EnumC872590YKz enumC872590YKz) {
        int size;
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadOlder size ");
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        sbLIZ.append(" and total size ");
        sbLIZ.append(this.LLILLJJLI.size());
        sbLIZ.append(" and result ");
        sbLIZ.append(enumC872590YKz);
        c868780Y6iLIZLLL.LJIIL("MessageModel ", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIJIIJIL.LJIIJJI().LIZJ(new InterfaceC872410YKh<Void>() { // from class: X.0YKm
            @Override // X.InterfaceC872410YKh
            public final Void LIZ() {
                List list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    this.LIZJ.LLILLJJLI.appendList(list);
                }
                Iterator it2 = ((ArrayList) this.LIZJ.LIZLLL()).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC868420Y4y) it2.next()).Us(list, enumC872590YKz);
                }
                C0Y8T c0y8tLJ = this.LIZJ.LJ();
                if (c0y8tLJ != null && enumC872590YKz == EnumC872590YKz.SUCCESS && !this.LIZJ.LLJILJIL) {
                    int size2 = this.LIZJ.LLILLJJLI.size();
                    C872420YKi c872420YKi = this.LIZJ;
                    boolean z = size2 < c872420YKi.LLILLL && !c872420YKi.LLJILJIL;
                    List<C869590Y9l> listLJIIIIZZ = this.LIZJ.LJIIIIZZ();
                    this.LIZJ.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZJ().LJLLJ(C0YL8.LIZ(c0y8tLJ, listLJIIIIZZ, z, null, 24));
                    C868780Y6i c868780Y6iLIZLLL2 = this.LIZJ.LLJJIJIIJIL.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("resolve message gap, called from onLoadOlder recent chain with input size ");
                    sbLIZ2.append(listLJIIIIZZ.size());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    c868780Y6iLIZLLL2.getClass();
                    C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "MessageModel ", strLIZIZ, 4);
                }
                C872420YKi c872420YKi2 = this.LIZJ;
                c872420YKi2.LLJJIII.LIZLLL = c872420YKi2.LJIIIIZZ();
                return null;
            }
        }, null, false, this.LLJJIJIIJIL.LJIIL().LIZJ());
    }

    @Override // X.InterfaceC868420Y4y
    public final void kl(List<C869590Y9l> list, List<C869590Y9l> list2) {
        int size = this.LLILLJJLI.size();
        if (this.LLJJIJIIJIL.LJIIIZ().LJJLIIIIJ.LJJJJI && list.isEmpty()) {
            C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onResolveMsgGap[suppressEmptyReplace] convId=");
            sbLIZ.append(this.LL);
            sbLIZ.append(" sizeBefore=");
            sbLIZ.append(size);
            sbLIZ.append(" insertedSize=");
            sbLIZ.append(list2.size());
            sbLIZ.append(" newest=");
            sbLIZ.append(this.LLIZ);
            sbLIZ.append(" oldest=");
            sbLIZ.append(this.LLIZLLLIL);
            sbLIZ.append(" thread=");
            sbLIZ.append(C786410Ut5.u3().getName());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c868780Y6iLIZLLL.getClass();
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageModel ", strLIZIZ, 4);
            return;
        }
        this.LLILLJJLI.replaceList(list);
        List<C869590Y9l> listCopy = this.LLILLJJLI.toListCopy();
        boolean zLJJIFFI = LJJIFFI(listCopy);
        boolean zLJJI = LJJI(listCopy);
        this.LLIZLLLIL = zLJJIFFI;
        this.LLIZ = zLJJI;
        C868780Y6i c868780Y6iLIZLLL2 = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onResolveMsgGap replace list with replaced size ");
        sbLIZ2.append(this.LLILLJJLI.size());
        sbLIZ2.append(" and mUptoOldest ");
        sbLIZ2.append(this.LLIZLLLIL);
        sbLIZ2.append(" and mUptoNewest ");
        sbLIZ2.append(this.LLIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c868780Y6iLIZLLL2.getClass();
        C868780Y6i.LJ(c868780Y6iLIZLLL2, "MessageModel ", strLIZIZ2, 4);
        Iterator it2 = ((ArrayList) LIZLLL()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC868420Y4y) it2.next()).kl(list, list2);
        }
        this.LLJJIII.LIZLLL = LJIIIIZZ();
    }

    @Override // X.InterfaceC868420Y4y
    public final void su(C869590Y9l c869590Y9l, boolean z) {
        if (!this.LLIZ) {
            return;
        }
        Iterator it2 = ((ArrayList) LIZLLL()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC868420Y4y) it2.next()).su(c869590Y9l, z);
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void u6(final List<C869590Y9l> list, final boolean z) {
        int size;
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadNewer size ");
        if (list != null) {
            size = list.size();
        } else {
            size = -1;
        }
        sbLIZ.append(size);
        sbLIZ.append(" and total size ");
        sbLIZ.append(this.LLILLJJLI.size());
        c868780Y6iLIZLLL.LJIIL("MessageModel ", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJILJIL) {
            return;
        }
        this.LLJJIJIIJIL.LJIIJJI().LIZJ(new InterfaceC872410YKh<Void>() { // from class: X.0YKl
            @Override // X.InterfaceC872410YKh
            public final Void LIZ() {
                List list2;
                List list3 = list;
                if (list3 != null && !list3.isEmpty()) {
                    ArrayList arrayList = new ArrayList(list);
                    Collections.reverse(arrayList);
                    this.LIZJ.LLILLJJLI.addList(arrayList);
                }
                Iterator it2 = ((ArrayList) this.LIZJ.LIZLLL()).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC868420Y4y) it2.next()).u6(list, z);
                }
                C0Y8T c0y8tLJ = this.LIZJ.LJ();
                if (c0y8tLJ != null && (list2 = list) != null && !list2.isEmpty()) {
                    this.LIZJ.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZJ().LJLLJ(C0YL8.LIZ(c0y8tLJ, this.LIZJ.LJIIIIZZ(), false, EnumC873090YMx.FROM_OLD_TO_NEW, 16));
                    C868780Y6i c868780Y6iLIZLLL2 = this.LIZJ.LLJJIJIIJIL.LIZLLL();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("resolve message gap, called from onLoadNewer recent conv chain with input size ");
                    sbLIZ2.append(this.LIZJ.LLILLJJLI.size());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    c868780Y6iLIZLLL2.getClass();
                    C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "MessageModel ", strLIZIZ, 4);
                }
                C872420YKi c872420YKi = this.LIZJ;
                c872420YKi.LLJJIII.LIZLLL = c872420YKi.LJIIIIZZ();
                return null;
            }
        }, null, false, this.LLJJIJIIJIL.LJIIL().LIZJ());
    }

    @Override // X.InterfaceC868420Y4y
    public final void Ip(final int i, final C0YC9 c0yc9, final C869590Y9l c869590Y9l) {
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel onSendMessage statusCode=");
        sbLIZ.append(i);
        sbLIZ.append(" message id=");
        sbLIZ.append(c869590Y9l.getMsgId());
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJIJI && !this.LLIZ) {
            C868780Y6i c868780Y6iLIZLLL2 = this.LLJJIJIIJIL.LIZLLL();
            c868780Y6iLIZLLL2.getClass();
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "MessageModel ", "skip onSendMessage because it's from search", 4);
            this.LLJJIII.LIZLLL = LJIIIIZZ();
            if (i != C0YIF.LIZ) {
                return;
            }
            if (this.LLJI == null || c869590Y9l.getOrderIndex() > this.LLJI.getOrderIndex()) {
                this.LLJI = c869590Y9l;
            }
            List<InterfaceC868420Y4y> listLIZLLL = LIZLLL();
            if (c0yc9 != null) {
                c0yc9.LIZIZ();
            }
            Iterator it2 = ((ArrayList) listLIZLLL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC868420Y4y) it2.next()).Ip(i, c0yc9, c869590Y9l);
            }
            return;
        }
        if (!this.LLIZ) {
            LJIIIZ(this.LLILLL, new InterfaceC863600XuI() { // from class: X.0YL5
                @Override // X.InterfaceC863600XuI
                public final void LIZIZ(C0YMW c0ymw) {
                    C0YC9 c0yc92 = c0yc9;
                    if (c0yc92 != null) {
                        c0yc92.LIZIZ();
                    }
                    this.LJIJI(i, c0yc9, c869590Y9l);
                }

                @Override // X.InterfaceC863600XuI
                public final void onSuccess(Object obj) {
                    C0YC9 c0yc92 = c0yc9;
                    if (c0yc92 != null) {
                        c0yc92.LIZIZ();
                    }
                    this.LJIJI(i, c0yc9, c869590Y9l);
                }
            }, "MessageModel.onSendMessage");
        } else {
            if (c0yc9 != null) {
                c0yc9.LIZIZ();
            }
            LJIJI(i, c0yc9, c869590Y9l);
        }
        this.LLJJIII.LIZLLL = LJIIIIZZ();
    }

    public final void LJIIIZ(final int i, final InterfaceC863600XuI interfaceC863600XuI, final String str) {
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel initMessageList from: ");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILLL = SystemClock.uptimeMillis();
        this.LLJIJIL.set(true);
        this.LLJJIJIIJIL.LJIIJJI().LIZJ(new InterfaceC872410YKh<List<C869590Y9l>>() { // from class: X.0YKo
            @Override // X.InterfaceC872410YKh
            public final List<C869590Y9l> LIZ() {
                this.LIZIZ.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel initMessageList onRun");
                C0Y8T c0y8tLIZ = this.LIZIZ.LLJJIJIL.LJIIJJI().LIZ(this.LIZIZ.LL, false);
                long minIndex = 0;
                if (c0y8tLIZ != null && c0y8tLIZ.getMinIndex() > 0) {
                    minIndex = c0y8tLIZ.getMinIndex();
                }
                C868780Y6i c868780Y6iLIZLLL2 = this.LIZIZ.LLJJIJIIJIL.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MessageModel initMessageList convMinIndex: ");
                sbLIZ2.append(minIndex);
                c868780Y6iLIZLLL2.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                C0Y6Q c0y6qLJJJJZI = this.LIZIZ.LLJJIJIL.LJI().LJJJJZI(i, minIndex, this.LIZIZ.LL);
                this.LIZIZ.LLJJ = c0y6qLJJJJZI.LIZIZ;
                List<C869590Y9l> list = (List) c0y6qLJJJJZI.LIZ(Collections.emptyList());
                this.LIZIZ.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZJ.LIZ(C0YLC.LOAD_MSG_LIST);
                if (list != null) {
                    this.LIZIZ.LLILLJJLI.clear();
                    this.LIZIZ.LLILLJJLI.addAll(list);
                }
                return list;
            }
        }, new InterfaceC864800XwE<List<C869590Y9l>>() { // from class: X.0YKk
            @Override // X.InterfaceC864800XwE
            public final void LIZ(List<C869590Y9l> list) {
                int i2;
                int code;
                String message;
                long msgId;
                C869590Y9l c869590Y9l;
                List<C869590Y9l> list2 = list;
                if (list2 == null) {
                    this.LIZLLL.LLJIJIL.set(false);
                    return;
                }
                this.LIZLLL.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel initMessageList onCallback");
                this.LIZLLL.LLIZ = true;
                C872420YKi c872420YKi = this.LIZLLL;
                int i3 = i;
                String str2 = str;
                C868780Y6i c868780Y6iLIZLLL2 = c872420YKi.LLJJIJIIJIL.LIZLLL();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MessageModel onPerformInit start, result:");
                sbLIZ2.append(list2.size());
                sbLIZ2.append(", pageLimit:");
                sbLIZ2.append(i3);
                c868780Y6iLIZLLL2.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                if (i3 <= 0) {
                    i3 = c872420YKi.LLILLL;
                }
                if (!c872420YKi.LLJJI && c872420YKi.LLJILLL > 0) {
                    C870460YCu c870460YCuLIZ = c872420YKi.LLJJIJIIJIL.LJIIZILJ().LJFF().LIZ();
                    String str3 = c872420YKi.LL;
                    long jUptimeMillis = SystemClock.uptimeMillis() - c872420YKi.LLJILLL;
                    int size = list2.size();
                    C0YPQ c0ypq = c872420YKi.LLJJ;
                    if (c0ypq == null) {
                        i2 = 1;
                        code = -1;
                    } else {
                        i2 = 0;
                        code = c0ypq.getCode();
                    }
                    C0YPQ c0ypq2 = c872420YKi.LLJJ;
                    if (c0ypq2 == null) {
                        message = "";
                    } else {
                        message = c0ypq2.getMessage();
                    }
                    if (!list2.isEmpty() && (c869590Y9l = (C869590Y9l) ListProtector.get(list2, 0)) != null) {
                        msgId = c869590Y9l.getMsgId();
                    } else {
                        msgId = -1;
                    }
                    c870460YCuLIZ.LJIIL(jUptimeMillis, str3, msgId, size, i2, code, message);
                }
                c872420YKi.LLJJI = true;
                c872420YKi.LLJIJIL.set(false);
                c872420YKi.a(1, str2, list2, null);
                if (c872420YKi.LLJILJIL) {
                    c872420YKi.LLIZLLLIL = true;
                    c872420YKi.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel onPerformInit, preview mode, load preview messages");
                    c872420YKi.LJIL();
                } else if (list2.size() < i3) {
                    c872420YKi.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel onPerformInit, less than limit, loadHistory");
                    c872420YKi.LIZJ(list2);
                } else {
                    C0Y8T c0y8tLJ = c872420YKi.LJ();
                    if (c0y8tLJ != null) {
                        c872420YKi.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZJ().LJLLJ(C0YL8.LIZ(c0y8tLJ, c872420YKi.LJIIIIZZ(), true, null, 24));
                        C868780Y6i c868780Y6iLIZLLL3 = c872420YKi.LLJJIJIIJIL.LIZLLL();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("resolve message gap, called from onPerformInit with input size ");
                        sbLIZ3.append(list2.size());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                        c868780Y6iLIZLLL3.getClass();
                        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL3, "MessageModel ", strLIZIZ, 4);
                    }
                }
                InterfaceC863600XuI interfaceC863600XuI2 = interfaceC863600XuI;
                if (interfaceC863600XuI2 == null) {
                    return;
                }
                interfaceC863600XuI2.onSuccess(list2);
            }
        }, true, LJFF());
    }

    public final void LJIILL(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        Integer numValueOf;
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel onGetMessage, list:");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", msgSource:");
        sbLIZ.append(i);
        sbLIZ.append(", mUptoNewest:");
        sbLIZ.append(this.LLIZ);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLIZ) {
            return;
        }
        LJIILLIIL(list, i, c0y7p);
    }

    public final void LJIILLIIL(final List<C869590Y9l> list, final int i, final C0Y7P c0y7p) {
        int size;
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel onPerformGetMessage, result:");
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        sbLIZ.append(size);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (list != null && !list.isEmpty()) {
            this.LLJJIJIIJIL.LJIIJJI().LIZJ(new InterfaceC872410YKh<Void>() { // from class: X.0YKp
                @Override // X.InterfaceC872410YKh
                public final Void LIZ() {
                    int i2;
                    this.LIZLLL.LLILLJJLI.addList(list);
                    Iterator it2 = ((ArrayList) this.LIZLLL.LIZLLL()).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC868420Y4y) it2.next()).d5(list, i, c0y7p);
                    }
                    C0Y8T c0y8tLJ = this.LIZLLL.LJ();
                    if (c0y8tLJ != null && ((i2 = i) == 3 || i2 == 16)) {
                        this.LIZLLL.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZJ().LJLLJ(C0YL8.LIZ(c0y8tLJ, this.LIZLLL.LJIIIIZZ(), false, null, 28));
                        C868780Y6i c868780Y6iLIZLLL2 = this.LIZLLL.LLJJIJIIJIL.LIZLLL();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("resolve message gap, called from onPerformGetMessage with input size ");
                        sbLIZ2.append(list.size());
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        c868780Y6iLIZLLL2.getClass();
                        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "MessageModel ", strLIZIZ, 4);
                    }
                    C872420YKi c872420YKi = this.LIZLLL;
                    c872420YKi.LLJJIII.LIZLLL = c872420YKi.LJIIIIZZ();
                    return null;
                }
            }, null, false, this.LLJJIJIIJIL.LJIIL().LIZJ());
        }
    }

    public final void LJIIZILJ(long j, String str, List list) {
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel onPerformInitAroundIndex start, result:");
        sbLIZ.append(list.size());
        sbLIZ.append(", targetIndex:");
        sbLIZ.append(j);
        sbLIZ.append(", from:");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.clear();
        this.LLILLJJLI.addAll(list);
        a(1, str, list, Long.valueOf(j));
    }

    public final void LJIJI(final int i, final C0YC9 c0yc9, final C869590Y9l c869590Y9l) {
        if (!this.LLIZ) {
            return;
        }
        this.LLJJIJIIJIL.LJIIJJI().LIZJ(new InterfaceC872410YKh<Void>() { // from class: X.0YKr
            @Override // X.InterfaceC872410YKh
            public final Void LIZ() {
                C869590Y9l c869590Y9l2 = c869590Y9l;
                if (c869590Y9l2 != null && i == C0YIF.LIZ) {
                    this.LLILLJJLI.add(c869590Y9l2);
                    if (this.LLILLJJLI.size() > 3000) {
                        C872420YKi c872420YKi = this;
                        c872420YKi.LLILLJJLI = c872420YKi.LLILLJJLI.toSubList(0, LivePreCreateNextRoomPlayer.ENABLE);
                    }
                }
                for (InterfaceC868420Y4y interfaceC868420Y4y : (ArrayList) this.LIZLLL()) {
                    C0YC9 c0yc92 = c0yc9;
                    if (c0yc92 != null) {
                        c0yc92.LIZIZ();
                    }
                    interfaceC868420Y4y.Ip(i, c0yc9, c869590Y9l);
                }
                return null;
            }
        }, new C914010ZtP(1), false, this.LLJJIJIIJIL.LJIIL().LIZJ());
    }

    @Override // X.InterfaceC871600YHe
    public final void LJJJLZIJ(final C0Y3I c0y3i, final C869590Y9l c869590Y9l, final InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel addOrUpdateMessage");
        this.LLJJIJIIJIL.LJIIIZ().getClass();
        this.LLJJIJIIJIL.LJIIJJI().LIZJ(new C914040ZtS(this, c869590Y9l, 2), new InterfaceC864800XwE<Pair<C0Y8T, Boolean>>() { // from class: X.0Xwa
            @Override // X.InterfaceC864800XwE
            public final void LIZ(Pair<C0Y8T, Boolean> pair) {
                Pair<C0Y8T, Boolean> pair2 = pair;
                int i = -3001;
                if (pair2.first != null) {
                    this.LIZLLL.LLJJIJIIJIL.LJIIZILJ().LIZLLL().LIZLLL().LJJL(2, (C0Y8T) pair2.first);
                    InterfaceC863600XuI interfaceC863600XuI2 = interfaceC863600XuI;
                    if (interfaceC863600XuI2 != null) {
                        interfaceC863600XuI2.onSuccess(c869590Y9l);
                    }
                } else {
                    c869590Y9l.setMsgStatus(3);
                    InterfaceC863600XuI interfaceC863600XuI3 = interfaceC863600XuI;
                    if (interfaceC863600XuI3 != null) {
                        interfaceC863600XuI3.LIZIZ(C0YMW.from(C0YIN.LJFF(this.LIZLLL.LLJJIJIIJIL, -3001)));
                    }
                }
                if (((Boolean) pair2.second).booleanValue()) {
                    C868200Y4c c868200Y4c = this.LIZLLL.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZ;
                    if (pair2.first != null) {
                        i = C0YIF.LIZ;
                    }
                    c868200Y4c.LJIJ(c869590Y9l, i);
                    return;
                }
                C868200Y4c c868200Y4c2 = this.LIZLLL.LLJJIJIIJIL.LJIIZILJ().getDomain().LIZ;
                C0Y3I c0y3i2 = c0y3i;
                c0y3i2.getClass();
                c868200Y4c2.LJJIIJZLJL(c0y3i2, Collections.singletonList(c869590Y9l));
            }
        }, false, this.LLJJIJIIJIL.LJIIL().LIZJ());
    }

    @Override // X.InterfaceC868420Y4y
    public final void d5(final List<C869590Y9l> list, final int i, final C0Y7P c0y7p) {
        if (this.LLJJIJI && !this.LLIZ) {
            C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
            c868780Y6iLIZLLL.getClass();
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "MessageModel ", "skip onGetMessage because it's from search", 4);
            this.LLJJIII.LIZLLL = LJIIIIZZ();
            C869590Y9l c869590Y9l = null;
            long jMax = Long.MIN_VALUE;
            for (C869590Y9l c869590Y9l2 : list) {
                if (jMax >= c869590Y9l2.getOrderIndex()) {
                    c869590Y9l = c869590Y9l2;
                }
                jMax = Math.max(jMax, c869590Y9l2.getOrderIndex());
            }
            if (c869590Y9l == null) {
                c869590Y9l = this.LLJ;
            }
            this.LLJI = c869590Y9l;
            LJIILLIIL(list, i, c0y7p);
            return;
        }
        if (!this.LLIZ) {
            InterfaceC863600XuI interfaceC863600XuI = new InterfaceC863600XuI() { // from class: X.0YL4
                @Override // X.InterfaceC863600XuI
                public final void LIZIZ(C0YMW c0ymw) {
                    this.LIZLLL.LJIILL(list, i, c0y7p);
                }

                @Override // X.InterfaceC863600XuI
                public final void onSuccess(Object obj) {
                    this.LIZLLL.LJIILL(list, i, c0y7p);
                }
            };
            this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel loadNewerMessageListToEnd");
            if (!this.LLIZ && !this.LLJILJIL) {
                if (this.LLILLJJLI.isEmpty()) {
                    LJII();
                } else if (this.LLJIJIL.compareAndSet(false, true)) {
                    this.LLJJIJIIJIL.LJIIJJI().LIZJ(new C914040ZtS(this, this.LLILLJJLI.toListCopy(), 3), new C914020ZtQ(interfaceC863600XuI, this, 1), true, LJFF());
                } else {
                    this.LLJJIJIIJIL.LIZLLL().LJIIJJI("MessageModel loadNewerMessageListToEnd querying now");
                    C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                    c0ymw.code = -10;
                    interfaceC863600XuI.LIZIZ(c0ymw);
                }
            }
        } else {
            LJIILL(list, i, c0y7p);
        }
        this.LLJJIII.LIZLLL = LJIIIIZZ();
    }

    @Override // X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
        Iterator it2 = ((ArrayList) LIZLLL()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC868420Y4y) it2.next()).hk(c0y3i, i, c0ya6);
        }
    }

    @Override // X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
        C868780Y6i c868780Y6iLIZLLL = this.LLJJIJIIJIL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onQueryMessage direction ");
        sbLIZ.append(1);
        sbLIZ.append(" startIndex ");
        sbLIZ.append(l);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c868780Y6iLIZLLL.getClass();
        C868780Y6i.LJ(c868780Y6iLIZLLL, "MessageModel ", strLIZIZ, 4);
        Iterator it2 = ((ArrayList) LIZLLL()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC868420Y4y) it2.next()).a(1, str, list, l);
        }
        this.LLJJIII.LIZLLL = LJIIIIZZ();
        this.LLJJIII.LIZIZ();
    }

    @Override // X.InterfaceC868420Y4y
    public final void gb(final C0Y3I c0y3i, final List<C869590Y9l> list, final Map<String, Map<String, String>> map, final int i) {
        if (list != null && !list.isEmpty()) {
            if (i != 7 && i != 12 && i != 13) {
                this.LLJJIJIIJIL.LJIIJJI().LIZJ(new InterfaceC872410YKh<Void>() { // from class: X.0YKw
                    @Override // X.InterfaceC872410YKh
                    public final Void LIZ() {
                        this.LJ.LLILLJJLI.updateList(list);
                        for (InterfaceC868420Y4y interfaceC868420Y4y : (ArrayList) this.LJ.LIZLLL()) {
                            C0Y3I c0y3i2 = c0y3i;
                            c0y3i2.getClass();
                            interfaceC868420Y4y.gb(c0y3i2, list, map, i);
                        }
                        return null;
                    }
                }, null, false, this.LLJJIJIIJIL.LJIIL().LIZJ());
            } else {
                this.LLJJIJIIJIL.LJIIJJI().LIZJ(new InterfaceC872410YKh<Void>() { // from class: X.0YKv
                    @Override // X.InterfaceC872410YKh
                    public final Void LIZ() {
                        this.LJ.LLILLJJLI.addList(list);
                        for (InterfaceC868420Y4y interfaceC868420Y4y : (ArrayList) this.LJ.LIZLLL()) {
                            C0Y3I c0y3i2 = c0y3i;
                            c0y3i2.getClass();
                            interfaceC868420Y4y.gb(c0y3i2, list, map, i);
                        }
                        return null;
                    }
                }, null, false, this.LLJJIJIIJIL.LJIIL().LIZJ());
            }
        }
    }

    public C872420YKi(C0YEM c0yem, String str, boolean z, boolean z2, boolean z3) {
        this.LLJILJIL = false;
        new HashMap();
        this.LLJILLL = -1L;
        this.LLJJ = null;
        this.LLJJI = false;
        C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageModel constructor, conversationId:");
        sbLIZ.append(str);
        sbLIZ.append(", unreadLiveControl:");
        sbLIZ.append(z);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJIJIIJIL = c0yem;
        this.LLILLJJLI = new C872530YKt(true);
        if (c0yem.LJIIZILJ().getDomain().LIZJ.LIZLLL(C0YLC.LOAD_MSG_LIST)) {
            c0yem.LIZLLL().LJIIJJI("MessageModel hit load msg list drop in constructor");
            this.LLILLJJLI = new InterfaceC872570YKx() { // from class: X.0YL2
                @Override // X.InterfaceC872570YKx
                public final boolean add(C869590Y9l c869590Y9l) {
                    return false;
                }

                @Override // X.InterfaceC872570YKx
                public final void addAll(List<C869590Y9l> list) {
                }

                @Override // X.InterfaceC872570YKx
                public final void addList(List<C869590Y9l> list) {
                }

                @Override // X.InterfaceC872570YKx
                public final void appendList(List<C869590Y9l> list) {
                }

                @Override // X.InterfaceC872570YKx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
                public final void clear() {
                }

                @Override // X.InterfaceC872570YKx
                public final boolean delete(C869590Y9l c869590Y9l) {
                    return false;
                }

                @Override // X.InterfaceC872570YKx, java.util.AbstractList, java.util.List
                public final C869590Y9l get(int i) {
                    return null;
                }

                @Override // X.InterfaceC872570YKx
                public final boolean isEmpty() {
                    return false;
                }

                @Override // X.InterfaceC872570YKx
                public final void replaceList(List<C869590Y9l> list) {
                }

                @Override // X.InterfaceC872570YKx
                public final int size() {
                    return 0;
                }

                @Override // X.InterfaceC872570YKx
                public final InterfaceC872570YKx toSubList(int i, int i2) {
                    return this;
                }

                @Override // X.InterfaceC872570YKx
                public final boolean update(C869590Y9l c869590Y9l) {
                    return false;
                }

                @Override // X.InterfaceC872570YKx
                public final void updateList(List<C869590Y9l> list) {
                }

                @Override // X.InterfaceC872570YKx
                public final List<C869590Y9l> toListCopy() {
                    return Collections.emptyList();
                }
            };
        }
        this.LLJJIJIL = c0yem.LJIIZILJ().LIZIZ().LIZIZ();
        this.LL = str;
        this.LLILZLL = z;
        this.LLJJIJI = z2;
        this.LLJILJIL = z3;
        this.LLJILJILJ = new C0YL7(c0yem.LIZLLL(), c0yem.LJIIIZ().LIZIZ);
        this.LLJJIII = new SingleConReadInfoHelper(c0yem, str, c0yem.LJIIIZ().LJJIZ);
    }

    @Override // X.InterfaceC868420Y4y
    public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
        Iterator it2 = ((ArrayList) LIZLLL()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC868420Y4y) it2.next()).mp(c0y3i, c869590Y9l, map, map2, l, l2);
        }
    }
}

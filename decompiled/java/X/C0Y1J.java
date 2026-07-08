package X;

import android.util.Pair;
import com.bytedance.im.core.proto.ConversationParticipantsListRequestBody;
import com.bytedance.im.core.proto.ConversationParticipantsListResponseBody;
import com.bytedance.im.core.proto.ParticipantsPage;
import com.bytedance.im.core.proto.ResponseBody;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0Y1J, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y1J extends AbstractC867440Y1e<List<C0YAE>> {
    public final List<C0YAE> LJ;
    public final boolean LJFF;

    @Override // X.AbstractC867440Y1e
    public final boolean LJ() {
        return true;
    }

    public C0Y1J(C0YEM c0yem) {
        this(c0yem, null, true);
    }

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        ConversationParticipantsListResponseBody conversationParticipantsListResponseBody;
        ResponseBody responseBody = c0yin.LLIZ.body;
        if (responseBody != null && (conversationParticipantsListResponseBody = responseBody.conversation_participants_body) != null && conversationParticipantsListResponseBody.participants_page != null) {
            return true;
        }
        return false;
    }

    public final void LJIIL(String str) {
        LJIIJJI(str, 0L, null);
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(final C0YIN c0yin, final C0Y1G c0y1g) {
        if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
            final ParticipantsPage participantsPage = c0yin.LLIZ.body.conversation_participants_body.participants_page;
            final String str = (String) c0yin.LLILZIL[0];
            if (participantsPage.has_more.booleanValue()) {
                this.LIZJ.LJIIJJI().LIZIZ(new InterfaceC872410YKh<Object>() { // from class: X.0Y1I
                    @Override // X.InterfaceC872410YKh
                    public final Object LIZ() {
                        ((ArrayList) this.LIZLLL.LJ).addAll(C0Y8V.LIZJ(str, participantsPage.participants));
                        this.LIZLLL.LJIIJJI(str, participantsPage.cursor.longValue(), c0yin.LLILZ);
                        return null;
                    }
                }, new C914010ZtP(8));
                return;
            } else {
                this.LIZJ.LJIIJJI().LIZIZ(new C914060ZtU(this, str, participantsPage, 4), new InterfaceC864800XwE<Pair<C0Y8T, List<C0YAE>>>() { // from class: X.0XwC
                    @Override // X.InterfaceC864800XwE
                    public final void LIZ(Pair<C0Y8T, List<C0YAE>> pair) {
                        Object obj;
                        Pair<C0Y8T, List<C0YAE>> pair2 = pair;
                        if (this.LIZJ.LJFF && (obj = pair2.second) != null && !((List) obj).isEmpty()) {
                            this.LIZJ.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJII(str, (List) pair2.second);
                        }
                        this.LIZJ.LIZJ(pair2.second);
                        c0y1g.run();
                    }
                });
                return;
            }
        }
        LIZ(c0yin);
        c0y1g.run();
    }

    public C0Y1J(C0YEM c0yem, C914110ZtZ c914110ZtZ, boolean z) {
        super(c0yem, C0YMR.CONVERSATION_PARTICIPANTS_LIST.getValue(), c914110ZtZ);
        this.LJ = new ArrayList();
        this.LJFF = z;
    }

    public final long LJIIJJI(String str, long j, InterfaceC864880XwM interfaceC864880XwM) {
        ((CopyOnWriteArraySet) this.LIZJ.LJIIZILJ().getDomain().LIZIZ.LJFF).add(str);
        C0Y8T c0y8tLJIL = this.LIZJ.LJIIZILJ().LIZLLL().LIZ().LJIL(str);
        if (c0y8tLJIL == null) {
            return -1L;
        }
        C0Y1K c0y1k = new C0Y1K();
        c0y1k.LIZLLL = str;
        c0y1k.LJ = Long.valueOf(c0y8tLJIL.getConversationShortId());
        c0y1k.LJFF = Integer.valueOf(c0y8tLJIL.getConversationType());
        c0y1k.LJI = Long.valueOf(j);
        ConversationParticipantsListRequestBody conversationParticipantsListRequestBodyBuild = c0y1k.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJIJJ = conversationParticipantsListRequestBodyBuild;
        return LJIIIZ(c0y8tLJIL.getInboxType(), c1es0.build(), interfaceC864880XwM, str, Long.valueOf(j));
    }
}

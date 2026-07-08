package X;

import com.bytedance.im.core.model.DeleteConversationRequest;
import com.bytedance.im.core.proto.DeleteConversationRequestBody;
import com.bytedance.im.core.proto.DeleteStrangerConversationRequestBody;
import com.bytedance.im.core.proto.RequestBody;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Y2D, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y2D extends AbstractC867440Y1e<String> {
    public boolean LJ;
    public boolean LJFF;
    public long LJI;
    public int LJII;
    public int LJIIIIZZ;
    public RequestBody LJIIIZ;
    public volatile boolean LJIIJ;

    @Override // X.AbstractC867440Y1e
    public final boolean LJ() {
        return true;
    }

    @Override // X.AbstractC867440Y1e
    public final boolean LJIIIIZZ(C0YIN c0yin) {
        return true;
    }

    public C0Y2D(C0YEM c0yem) {
        this(c0yem, null);
    }

    public final void LJIIL(C0Y8T c0y8t) {
        this.LIZJ.LJIIJJI().LIZJ(new C914040ZtS(this, c0y8t, 15), new C914020ZtQ(c0y8t, this, 5), false, this.LIZJ.LJIIL().LIZJ());
    }

    public final void LJIILIIL(C0Y8T c0y8t) {
        RequestBody requestBodyBuild;
        int inboxType = c0y8t.getInboxType();
        String conversationId = c0y8t.getConversationId();
        this.LIZJ.LJIIZILJ().getDomain().LIZIZ.LJIIJJI(inboxType, conversationId);
        this.LJIIIIZZ = inboxType;
        this.LJI = System.currentTimeMillis();
        if (this.LJ) {
            C0Y2G c0y2g = new C0Y2G();
            c0y2g.LIZLLL = Long.valueOf(c0y8t.getConversationShortId());
            DeleteStrangerConversationRequestBody deleteStrangerConversationRequestBodyBuild = c0y2g.build();
            C1ES0 c1es0 = new C1ES0();
            c1es0.LJJJJLI = deleteStrangerConversationRequestBodyBuild;
            requestBodyBuild = c1es0.build();
        } else {
            C0Y2F c0y2f = new C0Y2F();
            c0y2f.LIZLLL = conversationId;
            c0y2f.LJ = Long.valueOf(c0y8t.getConversationShortId());
            c0y2f.LJFF = Integer.valueOf(c0y8t.getConversationType());
            c0y2f.LJI = Long.valueOf(c0y8t.getLastMessageIndex());
            c0y2f.LJII = Long.valueOf(c0y8t.getMaxIndexV2());
            c0y2f.LJIIIIZZ = Integer.valueOf(c0y8t.getBadgeCount());
            DeleteConversationRequestBody deleteConversationRequestBodyBuild = c0y2f.build();
            C1ES0 c1es02 = new C1ES0();
            c1es02.LJIJ = deleteConversationRequestBodyBuild;
            requestBodyBuild = c1es02.build();
            this.LJIIIZ = requestBodyBuild;
        }
        if (this.LJIIJ) {
            HashMap map = new HashMap();
            map.put("retry", "refresh_conv");
            LJIIJ(inboxType, requestBodyBuild, null, map, conversationId);
            return;
        }
        LJIIIZ(inboxType, requestBodyBuild, null, conversationId);
    }

    public final void LJIILJJIL(DeleteConversationRequest deleteConversationRequest) {
        if (deleteConversationRequest == null) {
            this.LIZJ.LIZLLL().LJI("DeleteConversationHandler retryDeleteReq, request invalid");
            return;
        }
        this.LJFF = true;
        this.LJ = false;
        this.LJII = deleteConversationRequest.retryTimes;
        this.LJI = deleteConversationRequest.userDelTime;
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteConversationHandler retryDeleteReq, cid:");
        sbLIZ.append(deleteConversationRequest.conversationId);
        sbLIZ.append(", retryTimes:");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", userDelTime:");
        sbLIZ.append(this.LJI);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJIJ = deleteConversationRequest.toReqBody();
        RequestBody requestBodyBuild = c1es0.build();
        if (this.LJIIJ) {
            HashMap map = new HashMap();
            map.put("retry", "refresh_conv");
            LJIIJ(deleteConversationRequest.inboxType, requestBodyBuild, null, map, deleteConversationRequest.conversationId);
            return;
        }
        LJIIIZ(deleteConversationRequest.inboxType, requestBodyBuild, null, deleteConversationRequest.conversationId);
    }

    public C0Y2D(C0YEM c0yem, InterfaceC863600XuI interfaceC863600XuI) {
        super(c0yem, C0YMR.MARK_CONVERSATION_DELETE.getValue(), interfaceC863600XuI);
        this.LJIIJ = false;
        this.LJ = false;
    }

    @Override // X.AbstractC867440Y1e
    public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteConversationHandler handleResponse, isSuccess:");
        sbLIZ.append(c0yin.LJIIJJI());
        sbLIZ.append(", mStranger:");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mIsRetry:");
        sbLIZ.append(this.LJFF);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        String str = (String) c0yin.LLILZIL[0];
        if (!this.LJIIJ && C0Y81.LJ(c0yin.LLIZ, this.LIZJ.LJIIIZ().LJJJJJ)) {
            this.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJLIIIJLLLLLLLZ(c0yin.LJI(), new C914110ZtZ(this, str, 5), str);
            return;
        }
        if (!this.LJ) {
            if (c0yin.LJIIJJI()) {
                C0Y2H c0y2h = this.LIZJ.LJIIZILJ().LIZLLL().LIZJ().LIZIZ;
                if (c0y2h != null) {
                    c0y2h.remove(str);
                }
            } else if (!this.LJFF && this.LJIIIZ != null) {
                C0Y2J c0y2jLIZJ = this.LIZJ.LJIIZILJ().LIZLLL().LIZJ();
                int i = this.LJIIIIZZ;
                DeleteConversationRequestBody deleteConversationRequestBody = this.LJIIIZ.delete_conversation_body;
                C0Y2H c0y2h2 = c0y2jLIZJ.LIZIZ;
                if (c0y2h2 != null) {
                    c0y2h2.LIZIZ(i, str, deleteConversationRequestBody);
                }
            }
            this.LIZJ.LJIIZILJ().LJFF().LIZ().LJI(str, this.LJ, this.LJFF, this.LJII, this.LJI, c0yin.LJIIJJI(), true, C0YMW.from(c0yin));
            return;
        }
        if (c0yin.LJIIJJI()) {
            C0Y8T c0y8tLIZ = this.LIZJ.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true);
            if (c0y8tLIZ != null && c0y8tLIZ.getLastMessageIndex() > 0) {
                LJIIL(c0y8tLIZ);
                this.LIZJ.LJIIZILJ().LJFF().LIZ().LJI(str, this.LJ, this.LJFF, this.LJII, this.LJI, true, false, C0YMW.from(c0yin));
                return;
            } else {
                LIZJ(str);
                this.LIZJ.LJIIZILJ().LIZLLL().LIZLLL().LJJIL(c0y8tLIZ);
                return;
            }
        }
        LIZ(C0YIN.LJFF(this.LIZJ, -9999));
        this.LIZJ.LJIIZILJ().LJFF().LIZ().LJI(str, this.LJ, this.LJFF, this.LJII, this.LJI, false, false, C0YMW.from(c0yin));
    }

    public final void LJIIJJI(String str, boolean z) {
        C868780Y6i c868780Y6iLIZLLL = this.LIZJ.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteConversationHandler delete, cid:");
        sbLIZ.append(str);
        sbLIZ.append(", isLocal:");
        sbLIZ.append(z);
        sbLIZ.append(", isStranger:");
        sbLIZ.append(this.LJ);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        C0Y8T c0y8tLIZ = this.LIZJ.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true);
        if (c0y8tLIZ == null) {
            LIZ(C0YIN.LJFF(this.LIZJ, -1017));
            return;
        }
        if (!this.LJ) {
            LJIIL(c0y8tLIZ);
            if (!z && !c0y8tLIZ.isTemp()) {
                LJIILIIL(c0y8tLIZ);
                return;
            }
            return;
        }
        if (!z) {
            LJIILIIL(c0y8tLIZ);
        } else {
            LJIIL(c0y8tLIZ);
        }
    }
}

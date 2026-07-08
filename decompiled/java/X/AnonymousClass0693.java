package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0693, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0693 implements IChatRequestRepository {
    public static final C01GW<AnonymousClass0693> LIZJ = C452501pT.LIZIZ(new AnonymousClass0696());
    public final Keva LIZIZ = Keva.getRepo("chat_request_keva");

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository
    public final boolean LIZ(String str) {
        return Intrinsics.LJFF(LJI(str), "chat_request_start");
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository
    public final boolean LIZIZ(String str) {
        if (!LIZLLL(str) && !LIZ(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository
    public final void LIZJ(String str) {
        this.LIZIZ.erase(C786410Ut5.j4("chat_request_notice_%s", new Object[]{str}));
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository
    public final boolean LIZLLL(String str) {
        return Intrinsics.LJFF(LJI(str), "chat_request_sent");
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository
    public final AnonymousClass0691 LJFF(String str) {
        String strLJI = LJI(str);
        if (Intrinsics.LJFF(strLJI, "chat_request_sent")) {
            return AnonymousClass0691.REQUEST_SENT;
        }
        if (Intrinsics.LJFF(strLJI, "chat_request_start")) {
            return AnonymousClass0691.START_REQUEST;
        }
        return AnonymousClass0691.NOT_CHAT_REQUEST;
    }

    public final String LJI(String str) {
        return this.LIZIZ.getString(C786410Ut5.j4("chat_request_notice_%s", new Object[]{str}), CardStruct.IStatusCode.DEFAULT);
    }

    public final boolean LJII(String str) {
        if (!LJIIIIZZ(str) && !LIZIZ(str)) {
            return false;
        }
        return true;
    }

    public final boolean LJIIIIZZ(String str) {
        Keva keva = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("a:msg_req_type");
        sbLIZ.append(str);
        return Intrinsics.LJFF(keva.getString(C2188811AlT.LIZIZ(sbLIZ), CardStruct.IStatusCode.DEFAULT), "1");
    }

    public final void LJIIIZ(List<? extends C869590Y9l> list) {
        ArrayList arrayList = new ArrayList();
        for (C869590Y9l c869590Y9l : list) {
            if (Intrinsics.LJFF(c869590Y9l.getExt().get("a:msg_req_type"), "1")) {
                arrayList.add(c869590Y9l);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LJIIJ(((C869590Y9l) it2.next()).getConversationId());
        }
    }

    public final void LJIIJ(String str) {
        Keva keva = this.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("a:msg_req_type");
        sbLIZ.append(str);
        keva.storeString(C2188811AlT.LIZIZ(sbLIZ), "1");
    }

    public final boolean LJIIJJI(String str) {
        if (!LIZ(str) && !LIZLLL(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository
    public final void LJ(String str, AnonymousClass0691 anonymousClass0691) {
        this.LIZIZ.storeString(C786410Ut5.j4("chat_request_notice_%s", new Object[]{str}), anonymousClass0691.getRepositoryValue());
    }
}

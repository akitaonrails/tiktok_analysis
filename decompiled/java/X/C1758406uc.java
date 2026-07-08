package X;

import com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;

/* JADX INFO: renamed from: X.06uc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1758406uc {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Long LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final boolean LJI;
    public final boolean LJII;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1758406uc(SessionInfo sessionInfo) {
        String conversationId = sessionInfo.getConversationId();
        boolean zIsGroupChat = sessionInfo.isGroupChat();
        boolean zIsReportPage = sessionInfo.isReportPage();
        Long searchTargetIndex = sessionInfo.getSearchTargetIndex();
        boolean zIsFromLeadDmAdEntrance = sessionInfo.isFromLeadDmAdEntrance();
        String uuid = sessionInfo.getUuid();
        IMAIServiceAPI.LIZ.getClass();
        this(conversationId, zIsGroupChat, zIsReportPage, searchTargetIndex, zIsFromLeadDmAdEntrance, uuid, AnonymousClass0629.LIZ().LIZ().LJIL(sessionInfo.getConversationId()), sessionInfo.isPreviewMode());
    }

    public C1758406uc(String str, boolean z, boolean z2, Long l, boolean z3, String str2, boolean z4, boolean z5) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = l;
        this.LJ = z3;
        this.LJFF = str2;
        this.LJI = z4;
        this.LJII = z5;
    }
}

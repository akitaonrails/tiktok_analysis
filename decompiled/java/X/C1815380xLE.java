package X;

import java.util.List;
import webcast.api.smb.SMBRecommendBoardResponse;

/* JADX INFO: renamed from: X.0xLE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815380xLE {
    public static final List<InterfaceC1891350zJl> LIZ(C470590Icr<SMBRecommendBoardResponse.Data> c470590Icr) {
        SMBRecommendBoardResponse.Data.BoardDSLCompatibility boardDSLCompatibility;
        SMBRecommendBoardResponse.Data data = c470590Icr.data;
        if (data == null || (boardDSLCompatibility = data.boardDslCompatibility) == null || !boardDSLCompatibility.hasIncompatibleDsl) {
            return null;
        }
        return C1697810uHb.LJIILJJIL(new C1815400xLG(boardDSLCompatibility.incompatibleNoticeIcon, boardDSLCompatibility.incompatibleNoticeContent, boardDSLCompatibility.incompatibleNoticeSchema, boardDSLCompatibility.incompatibleNoticeHeading, boardDSLCompatibility.updateBtnText));
    }
}

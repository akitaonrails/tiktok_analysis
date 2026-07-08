package X;

import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoServerCardProtocol;
import com.ss.android.ugc.aweme.tako.botpage.cards.p010default.TakoDefaultAnswerProtocol;
import com.ss.android.ugc.aweme.tako.botpage.cards.p010default.TakoDefaultSendProtocol;

/* JADX INFO: renamed from: X.0yRc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857780yRc {
    public static final ITakoServerCardProtocol LIZ(InterfaceC1858000yRy interfaceC1858000yRy) {
        TakoDefaultSendProtocol takoDefaultSendProtocol = new TakoDefaultSendProtocol();
        TakoDefaultAnswerProtocol takoDefaultAnswerProtocol = new TakoDefaultAnswerProtocol();
        if (!(interfaceC1858000yRy instanceof C326880Cre)) {
            return null;
        }
        C326880Cre c326880Cre = (C326880Cre) interfaceC1858000yRy;
        if ((!C1858670yT3.LJIIIZ(c326880Cre.LLILLL)) && c326880Cre.LLILLL.sender.isSelf) {
            return takoDefaultSendProtocol;
        }
        if (!takoDefaultAnswerProtocol.ru1(c326880Cre)) {
            return null;
        }
        return takoDefaultAnswerProtocol;
    }
}

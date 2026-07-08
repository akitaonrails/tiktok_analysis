package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatlist.api.model.LastMessageProperty;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0YbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877470YbZ extends AbstractC880120Yfq {
    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return R.raw.icon_multiple_square;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return 2131835690;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        C0Y8T c0y8t;
        Long lLJIILIIL;
        T t = this.LLILLJJLI.LIZJ;
        if (!(t instanceof C0Y8T) || (c0y8t = (C0Y8T) t) == null) {
            return;
        }
        C0Y8T c0y8t2 = this.LLILZ;
        C869590Y9l lastShowMessage = c0y8t2 != null ? c0y8t2.getLastShowMessage() : null;
        IDmHelper iDmHelper = (IDmHelper) PluggableExtentionKt.pluggableSpi$default(IDmHelper.class, false, false, false, 14, null);
        LastMessageProperty lastMessagePropertyLIZ = iDmHelper != null ? iDmHelper.LIZ(c0y8t) : null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("conversationInMemory: ");
        sbLIZ.append(c0y8t);
        C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("lastMsgInMemory: ");
        sbLIZ2.append(lastShowMessage);
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("propertyInMemory: ");
        sbLIZ3.append(lastMessagePropertyLIZ);
        C2188811AlT.LIZIZ(sbLIZ3);
        String strLJFF = C0YNP.LJFF(c0y8t.getConversationId(), "chat_cell_preview_draft_time_ms");
        String strValueOf = String.valueOf((strLJFF == null || (lLJIILIIL = C2095008Iq.LJIILIIL(strLJFF)) == null) ? 0L : lLJIILIIL.longValue());
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("chatPreviewDraftTimestampInMemory: ");
        sbLIZ4.append(strValueOf);
        C2188811AlT.LIZIZ(sbLIZ4);
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C872810YLv(c0y8t.getConversationId(), lastShowMessage, lastMessagePropertyLIZ, c0y8t, strValueOf, this, null), 3);
    }

    @Override // X.AbstractC880120Yfq
    public final boolean LJI() {
        return (C289900BXw.LIZ() && C2213981Bky.LIZIZ.isRegressionTest()) ? false : true;
    }

    public C877470YbZ(Activity activity, C879540Yeu c879540Yeu, C878950Ydx c878950Ydx) {
        super(activity, c879540Yeu, c878950Ydx);
    }
}

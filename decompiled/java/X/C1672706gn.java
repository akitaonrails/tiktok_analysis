package X;

import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.service.IMessageViewHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06gn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1672706gn extends C09AY implements InterfaceC1631630sYr<SystemContent.Key, SpannableStringBuilder, Integer, Integer, Unit> {
    public final /* synthetic */ SessionInfo LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;
    public final /* synthetic */ C1672606gm LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1672706gn(SessionInfo sessionInfo, C869590Y9l c869590Y9l, C1672606gm c1672606gm) {
        super(4);
        this.LL = sessionInfo;
        this.LLILLJJLI = c869590Y9l;
        this.LLILLL = c1672606gm;
    }

    @Override // X.InterfaceC1631630sYr
    public /* bridge */ /* synthetic */ Unit invoke(SystemContent.Key key, SpannableStringBuilder spannableStringBuilder, Integer num, Integer num2) {
        String strLJI;
        C1622006Ws<Function2<C869590Y9l, SystemContent.Key, Object>> c1622006Ws;
        Function2<C869590Y9l, SystemContent.Key, Object> function2;
        Object objInvoke;
        SystemContent.Key key2 = key;
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        IMessageViewHelper.LIZ.getClass();
        IMessageViewHelper iMessageViewHelperLIZ = C1672806go.LIZ();
        if (iMessageViewHelperLIZ != null) {
            iMessageViewHelperLIZ.LJFF(key2, this.LL, this.LLILLJJLI);
        }
        C1622306Wv c1622306Wv = this.LLILLL.LJFF;
        if (c1622306Wv != null && (c1622006Ws = c1622306Wv.LIZIZ) != null && (function2 = c1622006Ws.LIZ) != null && (objInvoke = function2.invoke(this.LLILLJJLI, key2)) != null) {
            C786410Ut5.q2(spannableStringBuilder2, objInvoke, iIntValue, iIntValue2, 17);
        } else {
            IMessageViewHelper iMessageViewHelperLIZ2 = C1672806go.LIZ();
            if (iMessageViewHelperLIZ2 != null) {
                C1672606gm c1672606gm = this.LLILLL;
                int i = c1672606gm.LIZJ;
                IMUser iMUser = c1672606gm.LJI;
                IMessageViewHelper iMessageViewHelperLIZ3 = C1672806go.LIZ();
                if (iMessageViewHelperLIZ3 == null || (strLJI = iMessageViewHelperLIZ3.LJI(this.LLILLJJLI)) == null) {
                    strLJI = "";
                }
                C1680206i0 c1680206i0LIZ = iMessageViewHelperLIZ2.LIZ(i, iMUser, strLJI, this.LL, this.LLILLJJLI);
                if (c1680206i0LIZ != null) {
                    c1680206i0LIZ.LLIZLLLIL = key2;
                    C786410Ut5.q2(spannableStringBuilder2, c1680206i0LIZ, iIntValue, iIntValue2, 33);
                }
            }
        }
        return Unit.LIZ;
    }
}

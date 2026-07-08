package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qr5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566050qr5 extends C09AY implements Function1<C1566060qr6, Unit> {
    public final /* synthetic */ Aweme LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566050qr5(Aweme aweme, String str) {
        super(1);
        this.LL = aweme;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1566060qr6 c1566060qr6) {
        String imprId;
        C1566060qr6 c1566060qr62 = c1566060qr6;
        Aweme aweme = this.LL;
        if (aweme == null) {
            c1566060qr62.getClass();
        } else {
            String[] strArr = (String[]) c1566060qr62.LJFF.getValue();
            if (strArr != null) {
                System.arraycopy(strArr, 1, strArr, 0, strArr.length - 1);
                Object[] objArr = (Object[]) c1566060qr62.LJFF.getValue();
                if (objArr != null) {
                    int length = strArr.length - 1;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aid:");
                    sbLIZ.append(aweme.getAid());
                    objArr[length] = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            LogPbBean logPbBean = aweme.getLogPbBean();
            if (logPbBean != null) {
                imprId = logPbBean.getImprId();
            } else {
                imprId = null;
            }
            c1566060qr62.LIZJ = imprId;
        }
        c1566060qr62.LJ = this.LLILLJJLI;
        return Unit.LIZ;
    }
}

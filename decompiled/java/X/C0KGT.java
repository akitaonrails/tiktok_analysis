package X;

import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KGT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KGT extends C09AY implements Function1<C514770KGt, Unit> {
    public final /* synthetic */ C514760KGs LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KGT(C514760KGs c514760KGs) {
        super(1);
        this.LL = c514760KGs;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C514770KGt c514770KGt) {
        String strLJIIL;
        C514770KGt c514770KGt2 = c514770KGt;
        SubInfo subInfo = c514770KGt2.LIZ;
        if (subInfo != null) {
            long jLongValue = subInfo.subStartTime.longValue();
            SimpleDateFormat simpleDateFormat = C963140bAe.LIZ;
            String str = simpleDateFormat.format(new Date(jLongValue));
            str.toString();
            String str2 = simpleDateFormat.format(new Date(subInfo.subEndTime.longValue()));
            str2.toString();
            int i = subInfo.renewalPeriod;
            if (i == 1) {
                strLJIIL = C497740JfY.LJIJJ(2131844393, Integer.valueOf(i), str, str2);
            } else {
                strLJIIL = C497740JfY.LJIIL(2131755914, i, Integer.valueOf(i), str, str2);
            }
            this.LL.LL.setText(strLJIIL);
            if (c514770KGt2.LIZIZ && c514770KGt2.LJIIJ) {
                C16F5 c16f5 = this.LL.LL;
                if (c16f5 != null) {
                    C500260Jjc.LLFFF(c16f5);
                }
            } else {
                C16F5 c16f52 = this.LL.LL;
                if (c16f52 != null) {
                    C500260Jjc.LJIILIIL(c16f52);
                }
            }
        }
        return Unit.LIZ;
    }
}

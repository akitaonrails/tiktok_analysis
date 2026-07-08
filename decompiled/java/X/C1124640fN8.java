package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.message.common.Text;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0fN8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124640fN8 extends C09AY implements InterfaceC1631620sYq<Long, Integer, String, Unit> {
    public final /* synthetic */ C1124680fNC LL;
    public final /* synthetic */ GiftPanelBanner LLILLJJLI;
    public final /* synthetic */ InterfaceC1124700fNE LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1124640fN8(C1124680fNC c1124680fNC, GiftPanelBanner giftPanelBanner, InterfaceC1124700fNE interfaceC1124700fNE) {
        super(3);
        this.LL = c1124680fNC;
        this.LLILLJJLI = giftPanelBanner;
        this.LLILLL = interfaceC1124700fNE;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Long l, Integer num, String str) throws JSONException {
        C1123800fLm.LJ(this.LL.LJFF, SystemClock.uptimeMillis() - l.longValue(), num, str);
        C244400x0 c244400x0 = C244400x0.LIZ;
        Text text = this.LLILLJJLI.displayText;
        c244400x0.getClass();
        if ((!a0.LJJJIL(C244400x0.LIZ(text))) && this.LLILLJJLI.leftIcon != null) {
            this.LLILLL.LIZIZ(this.LL);
        }
        return Unit.LIZ;
    }
}

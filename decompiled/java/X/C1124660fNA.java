package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import com.bytedance.android.livesdk.model.message.common.Text;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0fNA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124660fNA extends C09AY implements InterfaceC1631620sYq<Long, Integer, String, Unit> {
    public final /* synthetic */ C1127440fRe LL;
    public final /* synthetic */ GiftPanelBanner LLILLJJLI;
    public final /* synthetic */ C1127390fRZ LLILLL;
    public final /* synthetic */ GiftPanelBanner LLILZ;
    public final /* synthetic */ AbstractC1126600fQI<? extends AnonymousClass0054> LLILZIL;
    public final /* synthetic */ AbstractC1126600fQI<? extends AnonymousClass0054> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1124660fNA(C1127440fRe c1127440fRe, GiftPanelBanner giftPanelBanner, C1127390fRZ c1127390fRZ, GiftPanelBanner giftPanelBanner2, AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2) {
        super(3);
        this.LL = c1127440fRe;
        this.LLILLJJLI = giftPanelBanner;
        this.LLILLL = c1127390fRZ;
        this.LLILZ = giftPanelBanner2;
        this.LLILZIL = abstractC1126600fQI;
        this.LLILZLL = abstractC1126600fQI2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Long l, Integer num, String str) throws JSONException {
        C1123800fLm.LJ(this.LL.LJI, SystemClock.uptimeMillis() - l.longValue(), num, str);
        C244400x0 c244400x0 = C244400x0.LIZ;
        Text text = this.LLILLJJLI.displayText;
        c244400x0.getClass();
        if ((!a0.LJJJIL(C244400x0.LIZ(text))) && this.LLILLJJLI.leftIcon != null) {
            this.LLILLL.LJJLIIIJ(this.LLILZ, this.LL, this.LLILZIL, this.LLILZLL, EnumC1127500fRk.GIFT);
        } else {
            this.LLILLL.LJJLIIIIJ(this.LL);
        }
        return Unit.LIZ;
    }
}

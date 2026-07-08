package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.IGiftService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120670fGj extends C09AY implements Function0<Unit> {
    public final /* synthetic */ JSONObject LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC1120680fGk LLILLL;
    public final /* synthetic */ C259800zU<String> LLILZ;
    public final /* synthetic */ C1120650fGh LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1120670fGj(JSONObject jSONObject, String str, InterfaceC1120680fGk interfaceC1120680fGk, C259800zU<String> c259800zU, C1120650fGh c1120650fGh) {
        super(0);
        this.LL = jSONObject;
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC1120680fGk;
        this.LLILZ = c259800zU;
        this.LLILZIL = c1120650fGh;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        User userLIZJ = null;
        String str = this.LL.has("gift_enter_from") ? this.LLILLJJLI : null;
        String toMemberId = this.LLILLL.getToMemberId();
        Long lLJIILIIL = toMemberId != null ? C2095008Iq.LJIILIIL(toMemberId) : null;
        if (this.LLILZ.element.length() > 0) {
            C1120650fGh c1120650fGh = this.LLILZIL;
            String str2 = this.LLILZ.element;
            c1120650fGh.getClass();
            userLIZJ = C1120650fGh.LIZJ(str2);
        }
        C1129740fVM c1129740fVM = new C1129740fVM(str, null, null, null, userLIZJ, lLJIILIIL, true, 30);
        IGiftService iGiftService = (IGiftService) C1161920gLG.LIZJ(IGiftService.class);
        if (iGiftService != null) {
            iGiftService.openGiftDialog("gift", c1129740fVM);
        }
        return Unit.LIZ;
    }
}

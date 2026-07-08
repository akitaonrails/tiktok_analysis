package X;

import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import java.util.LinkedHashMap;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0fjB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138310fjB extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final /* synthetic */ C1136280ffu LL;
    public final /* synthetic */ GiftMessage LLILLJJLI;
    public final /* synthetic */ C1135280feI LLILLL;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        String string;
        int iIntValue;
        Integer numLIZIZ = C1138350fjF.LIZIZ(th);
        String strLIZJ = C1138350fjF.LIZJ(th);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("error happens on Name:");
        sbLIZ.append(coroutineContext.get(C1138320fjC.LLILLJJLI));
        sbLIZ.append(" errorCode:");
        sbLIZ.append(numLIZIZ);
        sbLIZ.append(" errorMsg:");
        sbLIZ.append(strLIZJ);
        C20441214yg.LJFF("RenderRequestHelper_ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ), th);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (numLIZIZ == null || (string = numLIZIZ.toString()) == null) {
            string = "";
        }
        linkedHashMap.put("error_code", string);
        linkedHashMap.put("error_msg", strLIZJ);
        linkedHashMap.put("is_background", String.valueOf(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isAppBackground() ? 1 : 0));
        C1136500fgG.LIZ("gift_effect_composition_play_start_runtime_error", linkedHashMap, th, false);
        C1136280ffu c1136280ffu = this.LL;
        GiftMessage giftMessage = this.LLILLJJLI;
        C1135280feI c1135280feI = this.LLILLL;
        if (numLIZIZ != null) {
            iIntValue = numLIZIZ.intValue();
        } else {
            iIntValue = -1;
        }
        c1136280ffu.LIZ(giftMessage, c1135280feI, iIntValue, strLIZJ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1138310fjB(C2185208hG c2185208hG, C1136280ffu c1136280ffu, GiftMessage giftMessage, C1135280feI c1135280feI) {
        super(c2185208hG);
        this.LL = c1136280ffu;
        this.LLILLJJLI = giftMessage;
        this.LLILLL = c1135280feI;
    }
}

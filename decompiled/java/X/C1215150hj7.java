package X;

import Y.ARunnableS119S0100000_19;
import android.content.Context;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0hj7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1215150hj7 extends C2217421BqW implements Function2<Boolean, String, Unit> {
    public C1215150hj7(C19628311qr c19628311qr) {
        super(2, c19628311qr, C19628311qr.class, "mentionRiskCallBack", "mentionRiskCallBack(ZLjava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, String str) {
        C19EG c19egLIZIZ;
        boolean zBooleanValue = bool.booleanValue();
        String str2 = str;
        C19628311qr c19628311qr = (C19628311qr) this.receiver;
        if (zBooleanValue) {
            Context context = c19628311qr.getMentionStickerView().getContext();
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                c1389890mGx.LJIIJ(str2);
                c1389890mGx.LJIIJJI();
            }
            HandlerHook.viewPostDelay(c19628311qr.getMentionStickerView(), new ARunnableS119S0100000_19(c19628311qr, 183), 200L);
        } else {
            c19628311qr.getClass();
        }
        return Unit.LIZ;
    }
}

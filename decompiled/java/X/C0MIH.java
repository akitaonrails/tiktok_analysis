package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MIH, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C0MIH extends C2217421BqW implements Function0<Unit> {
    public C0MIH(C0MIK c0mik) {
        super(0, c0mik, C0MIK.class, "pollingErrorToast", "pollingErrorToast()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0MIK c0mik = (C0MIK) this.receiver;
        Activity activity = c0mik.LJIIIIZZ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(c0mik.LJIIIIZZ.getString(2131825944));
        C1390380mHk.LIZ(activity, 6015, creativeToastBuilder);
        return Unit.LIZ;
    }
}

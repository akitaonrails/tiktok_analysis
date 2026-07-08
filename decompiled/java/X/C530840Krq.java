package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Krq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C530840Krq extends C2217421BqW implements Function2<Integer, Integer, Unit> {
    public C530840Krq(C0MIK c0mik) {
        super(2, c0mik, C0MIK.class, "quotaError", "quotaError(Ljava/lang/Integer;Ljava/lang/Integer;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Integer num2) {
        C0MIK c0mik = (C0MIK) this.receiver;
        Activity activity = c0mik.LJIIIIZZ;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(c0mik.LJIIIIZZ.getString(2131825914, num));
        C1390380mHk.LIZ(activity, 6015, creativeToastBuilder);
        return Unit.LIZ;
    }
}

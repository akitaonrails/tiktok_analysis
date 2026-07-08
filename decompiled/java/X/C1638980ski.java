package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ski, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1638980ski extends C2217421BqW implements Function1<Activity, Unit> {
    public C1638980ski(Object obj) {
        super(1, obj, EffectInfoViewModel.class, "loginUser", "loginUser(Landroid/app/Activity;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Activity activity) {
        ((EffectInfoViewModel) this.receiver).xR2(activity);
        return Unit.LIZ;
    }
}

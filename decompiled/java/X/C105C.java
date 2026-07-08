package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices.LocationServicesManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.105C, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C105C extends C2217421BqW implements Function1<View, Unit> {
    public C105C(Object obj) {
        super(1, obj, C105H.class, "onClickOpenDeviceSettings", "onClickOpenDeviceSettings(Landroid/view/View;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        this.receiver.getClass();
        LocationServicesManager locationServicesManager = LocationServicesManager.LIZ;
        Context context = view.getContext();
        locationServicesManager.getClass();
        LocationServicesManager.LJIIIIZZ(context);
        return Unit.LIZ;
    }
}

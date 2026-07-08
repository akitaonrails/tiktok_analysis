package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraVideoCardAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ZoI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C910840ZoI extends C2217421BqW implements Function2<View, Boolean, Unit> {
    public C910840ZoI(DMCameraVideoCardAssem dMCameraVideoCardAssem) {
        super(2, dMCameraVideoCardAssem, DMCameraVideoCardAssem.class, "onClick", "onClick(Landroid/view/View;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((DMCameraVideoCardAssem) this.receiver).Ap(view, zBooleanValue);
        return Unit.LIZ;
    }
}

package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraPhotoCardAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ZoR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C910930ZoR extends C2217421BqW implements Function2<View, Boolean, Unit> {
    public C910930ZoR(DMCameraPhotoCardAssem dMCameraPhotoCardAssem) {
        super(2, dMCameraPhotoCardAssem, DMCameraPhotoCardAssem.class, "onClick", "onClick(Landroid/view/View;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((DMCameraPhotoCardAssem) this.receiver).Ep(view, zBooleanValue);
        return Unit.LIZ;
    }
}

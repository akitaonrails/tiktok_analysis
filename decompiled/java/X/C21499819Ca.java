package X;

import android.os.Bundle;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19Ca, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21499819Ca extends C09AY implements Function0<Unit> {
    public final /* synthetic */ BaseActivity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21499819Ca(BaseActivity baseActivity) {
        super(0);
        this.LL = baseActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        NavigationScene navigationScene = ((InterfaceC20622815ms) this.LL).getNavigationScene();
        if (navigationScene != null) {
            navigationScene.registerChildSceneLifecycleCallbacks(new C0Y8U() { // from class: X.19Cb
                @Override // X.C0Y8U, X.C19AH
                public final void LJJI(Scene scene, Bundle bundle) {
                    InterfaceC21500319Cf interfaceC21500319Cf = (InterfaceC21500319Cf) scene.getClass().getAnnotation(InterfaceC21500319Cf.class);
                    if (interfaceC21500319Cf != null) {
                        String strFeatureKey = interfaceC21500319Cf.featureKey();
                        if (C123100dR.LIZ(strFeatureKey)) {
                            C1440005kM.LIZ(new C1916770zyl(strFeatureKey));
                        }
                    }
                }
            }, true);
        }
        return Unit.LIZ;
    }
}

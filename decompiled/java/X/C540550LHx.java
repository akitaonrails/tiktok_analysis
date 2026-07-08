package X;

import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0LHx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C540550LHx extends C2217421BqW implements InterfaceC1631620sYq<Boolean, Boolean, Function0<? extends Unit>, Unit> {
    public C540550LHx(ImageEditRootScene imageEditRootScene) {
        super(3, imageEditRootScene, ImageEditRootScene.class, "saveData", "saveData(ZZLkotlin/jvm/functions/Function0;)V", 0);
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Boolean bool, Boolean bool2, Function0<? extends Unit> function0) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        ((ImageEditRootScene) this.receiver).LLLZZIL(function0, zBooleanValue, zBooleanValue2);
        return Unit.LIZ;
    }
}

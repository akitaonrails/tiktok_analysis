package X;

import com.ss.android.ugc.aweme.commerce.tools.sticker.service.ICommerceToolsStickerService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.08D2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08D2 implements C08D1 {
    public static final C08D2 LIZ = new C08D2();

    @Override // X.C08D1
    public final void LIZ(Effect effect) {
        ((ICommerceToolsStickerService) ServiceManager.get().getService(ICommerceToolsStickerService.class)).LJIIIZ(effect.getAdRawData());
    }
}

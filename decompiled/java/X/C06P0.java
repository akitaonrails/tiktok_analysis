package X;

import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.service.IIMSocialAvatarService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06P0, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06P0 extends C09AY implements Function0<IIMSocialAvatarService> {
    public C06P0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IIMSocialAvatarService invoke() {
        return IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService();
    }
}

package X;

import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fxO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147120fxO extends C09AY implements Function0<C1143590frh> {
    public final /* synthetic */ IMusicGiftService LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147120fxO(IMusicGiftService iMusicGiftService) {
        super(0);
        this.LL = iMusicGiftService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1143590frh invoke() {
        C1143590frh c1143590frhH01;
        IMusicGiftService iMusicGiftService = this.LL;
        return (iMusicGiftService == null || (c1143590frhH01 = iMusicGiftService.h01()) == null) ? new C1143590frh(0.0f, 0.0f, 0.0f) : c1143590frhH01;
    }
}

package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.virtual.AudienceDecorationStateViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01p2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C449801p2 extends C09AY implements Function0<InterfaceC390601fU> {
    public final /* synthetic */ AudienceDecorationStateViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C449801p2(AudienceDecorationStateViewModel audienceDecorationStateViewModel) {
        super(0);
        this.LL = audienceDecorationStateViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC390601fU invoke() {
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        if (iEffectService != null) {
            return iEffectService.getEffectBoardService(((C1145200fuI) this.LL.LL.getValue()).LLILLJJLI == EnumC1083620eIy.PREVIEW_CARD ? "preview_card" : "audience", String.valueOf(C500260Jjc.LJJLIIIJ(((C1145200fuI) this.LL.LL.getValue()).LLILLL)));
        }
        return null;
    }
}

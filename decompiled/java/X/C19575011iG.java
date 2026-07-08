package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import v7.o;

/* JADX INFO: renamed from: X.11iG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19575011iG implements IAVEffectService.EffectPlatformLoader {
    public final IAVEffectService LIZ;
    public InterfaceC1635410sex LIZIZ = null;

    public C19575011iG(IAVEffectService iAVEffectService) {
        this.LIZ = iAVEffectService;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.EffectPlatformLoader
    public final void load(final InterfaceC2385309Wh<InterfaceC1635410sex, Void> interfaceC2385309Wh) {
        final o oVar = new o();
        InterfaceC1635410sex interfaceC1635410sex = this.LIZIZ;
        if (interfaceC1635410sex == null) {
            IAVEffectService iAVEffectService = this.LIZ;
            C844470XAv.LIZ.getClass();
            iAVEffectService.buildEffectPlatform(C844470XAv.LIZ(), new IAVEffectService.IAVEffectReadyCallback<InterfaceC1635410sex>() { // from class: X.11iI
                @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
                public final void finish(InterfaceC1635410sex interfaceC1635410sex2) {
                    InterfaceC1635410sex interfaceC1635410sex3 = interfaceC1635410sex2;
                    this.LIZ.LIZIZ = interfaceC1635410sex3;
                    oVar.LJ(interfaceC1635410sex3);
                    oVar.LIZ.LIZLLL(interfaceC2385309Wh);
                }
            }, C297340Bl6.LIZ());
        } else {
            oVar.LJ(interfaceC1635410sex);
            oVar.LIZ.LIZLLL((InterfaceC2385309Wh<TResult, TContinuationResult>) interfaceC2385309Wh);
        }
    }
}

package X;

import com.bytedance.android.live.effect.api.IEffectService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xOo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817600xOo extends C09AY implements Function0<InterfaceC1814530xJr> {
    public C1817600xOo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC1814530xJr invoke() {
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        if (iEffectService != null) {
            return iEffectService.getBoardsDisplayStateManager();
        }
        return null;
    }
}

package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0sLd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1623430sLd implements InterfaceC1623440sLe {
    public static final C1623430sLd LIZ = new C1623430sLd();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1623440sLe
    public final C1623450sLf LIZ(InterfaceC1624480sNK interfaceC1624480sNK, Effect effect) {
        String effectId;
        String effectId2;
        List<String> children;
        String effectId3;
        if (effect != null && effect.getEffectId() != null) {
            InterfaceC1625470sOv interfaceC1625470sOvLJII = interfaceC1624480sNK.LJII();
            String effectId4 = effect.getEffectId();
            Effect effectLJI = interfaceC1625470sOvLJII.LJI();
            String effectId5 = null;
            if (effectLJI != null) {
                effectId = effectLJI.getEffectId();
            } else {
                effectId = null;
            }
            if (Intrinsics.LJFF(effectId4, effectId)) {
                return new C1623450sLf();
            }
            String effectId6 = effect.getEffectId();
            Effect effect2 = (Effect) interfaceC1625470sOvLJII.LJIIJ().getValue();
            if (effect2 != null) {
                effectId2 = effect2.getEffectId();
            } else {
                effectId2 = null;
            }
            if (Intrinsics.LJFF(effectId6, effectId2)) {
                return new C1623450sLf();
            }
            if (!TextUtils.isEmpty(effect.getParentId())) {
                String parentId = effect.getParentId();
                Effect effect3 = (Effect) interfaceC1625470sOvLJII.LJIIJ().getValue();
                if (effect3 != null) {
                    effectId3 = effect3.getEffectId();
                } else {
                    effectId3 = null;
                }
                if (u.LJIJI(parentId, effectId3, false)) {
                    return new C1623450sLf();
                }
            }
            if (C1624570sNT.LJIL(effect) && (children = effect.getChildren()) != null && !children.isEmpty()) {
                Effect effectLJI2 = interfaceC1625470sOvLJII.LJI();
                if (effectLJI2 != null) {
                    effectId5 = effectLJI2.getEffectId();
                }
                if (C13LP.LJJJJ(effectId5, children)) {
                    return new C1623450sLf();
                }
            }
            return new C1623450sLf(false, "not_latest_want_to_use_sticker");
        }
        return new C1623450sLf();
    }
}

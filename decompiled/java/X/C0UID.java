package X;

import com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;

/* JADX INFO: renamed from: X.0UID, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UID {
    public static final boolean LIZ() {
        if (!TryModeGuidanceSetting.INSTANCE.isV1()) {
            return false;
        }
        Boolean bool = InterfaceC772600USk.Ff.LIZIZ().get("brightness_guidance");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final boolean LIZIZ() {
        if (!TryModeGuidanceSetting.INSTANCE.isV2()) {
            return false;
        }
        Boolean bool = InterfaceC772600USk.Gf.LIZIZ().get("effect_guidance");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final boolean LIZJ() {
        if (!TryModeGuidanceSetting.INSTANCE.isV2()) {
            return false;
        }
        Boolean bool = InterfaceC772600USk.Gf.LIZIZ().get("enhance_guidance");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final boolean LIZLLL() {
        TryModeGuidanceSetting tryModeGuidanceSetting = TryModeGuidanceSetting.INSTANCE;
        if (tryModeGuidanceSetting.isV1()) {
            Boolean bool = InterfaceC772600USk.Ff.LIZIZ().get("face_guidance");
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }
        if (tryModeGuidanceSetting.isV2()) {
            Boolean bool2 = InterfaceC772600USk.Gf.LIZIZ().get("face_guidance");
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return true;
        }
        if (!tryModeGuidanceSetting.isV3()) {
            return false;
        }
        Boolean bool3 = InterfaceC772600USk.Hf.LIZIZ().get("face_guidance");
        if (bool3 != null) {
            return bool3.booleanValue();
        }
        return true;
    }

    public static final boolean LJ() {
        if (!TryModeGuidanceSetting.INSTANCE.isV3()) {
            return false;
        }
        Boolean bool = InterfaceC772600USk.Hf.LIZIZ().get("interact_guidance");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final boolean LJFF() {
        if (!TryModeGuidanceSetting.INSTANCE.isV2()) {
            return false;
        }
        Boolean bool = InterfaceC772600USk.Gf.LIZIZ().get("music_guidance");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final boolean LJI() {
        if (!TryModeGuidanceSetting.INSTANCE.isV1()) {
            return false;
        }
        Boolean bool = InterfaceC772600USk.Ff.LIZIZ().get("volume_guidance");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final void LJII() {
        if (TryModeGuidanceSetting.INSTANCE.isV2()) {
            C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC772600USk.Gf;
            c20337914i1.LIZIZ().put("effect_guidance", Boolean.FALSE);
            c20337914i1.LIZJ();
        }
    }

    public static final void LJIIIIZZ() {
        C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC772600USk.Gf;
        c20337914i1.LIZIZ().put("music_guidance", Boolean.FALSE);
        c20337914i1.LIZJ();
    }

    public static final void LJIIIZ() {
        C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC772600USk.Hf;
        c20337914i1.LIZIZ().put("quick_qa_guidance", Boolean.FALSE);
        c20337914i1.LIZJ();
    }

    public static final boolean LJIIJ(DataChannel dataChannel) {
        if (C500260Jjc.LJJIFFI(InterfaceC772600USk.Af.LIZIZ()) && C500260Jjc.LJJJIL(dataChannel) && C474650IjP.LIZ()) {
            return true;
        }
        return false;
    }
}

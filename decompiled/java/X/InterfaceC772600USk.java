package X;

import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0USk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public interface InterfaceC772600USk {
    public static final C20337914i1<Boolean> Af;
    public static final C20337914i1<Boolean> Bf;
    public static final C20337914i1<Boolean> Cf;
    public static final C20337914i1<Boolean> Df;
    public static final C20337914i1<Boolean> Ef;
    public static final C20337914i1<Map<String, Boolean>> Ff;
    public static final C20337914i1<Map<String, Boolean>> Gf;
    public static final C20337914i1<Map<String, Boolean>> Hf;
    public static final C20337914i1<Boolean> If;
    public static final C20337914i1<Boolean> zf;

    static {
        Boolean bool = Boolean.FALSE;
        zf = new C20337914i1<>("in_preview_has_enter_try_mode_room", Boolean.class, bool);
        Af = new C20337914i1<>("has_enter_try_mode_room", Boolean.class, bool);
        Boolean bool2 = Boolean.TRUE;
        Bf = new C20337914i1<>("try_mode_co_host_webp_showed", Boolean.class, bool2);
        Cf = new C20337914i1<>("try_mode_multi_guest_webp_showed", Boolean.class, bool2);
        Df = new C20337914i1<>("try_mode_interaction_webp_showed", Boolean.class, bool2);
        Ef = new C20337914i1<>("try_mode_gifts_webp_showed", Boolean.class, bool2);
        Ff = new C20337914i1<>("try_mode_guidance_option_one", new TypeToken<Map<String, Boolean>>() { // from class: X.0USl
        }.getType(), new HashMap());
        Gf = new C20337914i1<>("try_mode_guidance_option_two", new TypeToken<Map<String, Boolean>>() { // from class: X.0USm
        }.getType(), new HashMap());
        Hf = new C20337914i1<>("try_mode_guidance_option_three", new TypeToken<Map<String, Boolean>>() { // from class: X.0USn
        }.getType(), new HashMap());
        If = new C20337914i1<>("in_preview_has_enter_preview_fragment", Boolean.class, bool);
    }
}

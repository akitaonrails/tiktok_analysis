package X;

import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0oAB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462570oAB {
    public static final List<String> LIZ = Arrays.asList("addyours", "location", "donation", "interactiveemoji", "hashtag", "mention", "pollsticker", "CountdownSticker", "musicsticker", "emojislidersticker", "linksticker", "articlesticker", "social_avatar_sticker", "socialavatar", "dm_group_chat");

    public static boolean LIZ(Effect effect) {
        if (LJIILLIIL(effect) || effect.getTags().contains("time") || effect.getTags().contains("date") || LJIJI(effect) || ((effect.getTags() != null && effect.getTags().contains("tenor")) || LJIIJJI(effect) || LJI(effect))) {
            return false;
        }
        return true;
    }

    public static int LIZIZ(Effect effect) {
        if (effect.getTags().contains("weather")) {
            return 2;
        }
        if (effect.getTags().contains("time")) {
            return 3;
        }
        if (effect.getTags().contains("date")) {
            return 4;
        }
        if (LJ(effect)) {
            return 5;
        }
        return 1;
    }

    public static boolean LIZJ(Effect effect) {
        return effect.getTags().contains("addyours");
    }

    public static boolean LIZLLL(Effect effect) {
        return effect.getTags().contains("articlesticker");
    }

    public static boolean LJ(Effect effect) {
        return effect.getTags().contains("UploadImageSticker");
    }

    public static boolean LJFF(Effect effect) {
        if (effect.getTags() == null) {
            return false;
        }
        return effect.getTags().contains("custom_sticker_from_panel");
    }

    public static boolean LJI(Effect effect) {
        if (effect.getTags() == null) {
            return false;
        }
        return effect.getTags().contains("custom_sticker_uploaded");
    }

    public static boolean LJII(Effect effect) {
        List<String> tags = effect.getTags();
        if (tags == null) {
            return false;
        }
        return tags.contains("dm_group_chat");
    }

    public static boolean LJIIIIZZ(Effect effect) {
        return effect.getTags().contains("donation");
    }

    public static boolean LJIIIZ(Effect effect) {
        if (C1634250sd5.LIZIZ().LJFF(effect) != null && ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIIJJI() != null) {
            if (!effect.getTags().contains("ecommerce") && !C1634250sd5.LIZIZ().LJFF(effect).getKey().equals(((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIIJJI())) {
                return false;
            }
            return true;
        }
        return effect.getTags().contains("ecommerce");
    }

    public static boolean LJIIJ(Effect effect) {
        return effect.getTags().contains("gif");
    }

    public static boolean LJIIJJI(Effect effect) {
        if (effect.getTags() == null) {
            return false;
        }
        return effect.getTags().contains("im_sticker");
    }

    public static boolean LJIIL(Effect effect) {
        return effect.getTags().contains("interactiveemoji");
    }

    public static boolean LJIILIIL(Effect effect) {
        if (!LIZJ(effect) && !effect.getTags().contains("location") && !LJIIIIZZ(effect) && !effect.getTags().contains("hashtag") && !LJIIZILJ(effect) && !effect.getTags().contains("pollsticker") && !LJIILJJIL(effect) && !LJIIL(effect) && !LJIJ(effect) && !effect.getTags().contains("emojislidersticker") && !effect.getTags().contains("linksticker") && !LIZLLL(effect) && !effect.getTags().contains("social_avatar_sticker") && !effect.getTags().contains("secretreplies") && !LJII(effect) && !LJIILL(effect)) {
            return false;
        }
        return true;
    }

    public static boolean LJIILJJIL(Effect effect) {
        return effect.getTags().contains("CountdownSticker");
    }

    public static boolean LJIILL(Effect effect) {
        return effect.getTags().contains("lyricssticker");
    }

    public static boolean LJIILLIIL(Effect effect) {
        return effect.getTags().contains("MagnifierSticker");
    }

    public static boolean LJIIZILJ(Effect effect) {
        return effect.getTags().contains("mention");
    }

    public static boolean LJIJ(Effect effect) {
        return effect.getTags().contains("musicsticker");
    }

    public static boolean LJIJI(Effect effect) {
        if (effect.getTags() == null) {
            return false;
        }
        return effect.getTags().contains("set_sticker");
    }

    public static boolean LJIJJ(Effect effect) {
        return effect.getTags().contains("socialavatar");
    }
}

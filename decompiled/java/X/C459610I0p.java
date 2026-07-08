package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0I0p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459610I0p {
    public static final boolean LIZ(SocialAvatarStickerStruct socialAvatarStickerStruct) {
        List<String> expression;
        if (socialAvatarStickerStruct.getId() == null || (expression = socialAvatarStickerStruct.getExpression()) == null || expression.isEmpty()) {
            return false;
        }
        return true;
    }

    public static final List<String> LIZIZ(Aweme aweme) {
        List<String> expression;
        Object objLJJJLL;
        if (aweme.getInteractStickerStructs() == null) {
            return C13BV.INSTANCE;
        }
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        ArrayList arrayList = new ArrayList();
        for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
            SocialAvatarStickerStruct socialAvatarStickerStruct = interactStickerStruct.getSocialAvatarStickerStruct();
            if (socialAvatarStickerStruct != null && LIZ(socialAvatarStickerStruct)) {
                arrayList.add(interactStickerStruct);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            SocialAvatarStickerStruct socialAvatarStickerStruct2 = ((InteractStickerStruct) it2.next()).getSocialAvatarStickerStruct();
            if (socialAvatarStickerStruct2 != null && (expression = socialAvatarStickerStruct2.getExpression()) != null && (objLJJJLL = C13LP.LJJJLL(expression)) != null) {
                arrayList2.add(objLJJJLL);
            }
        }
        return arrayList2;
    }
}

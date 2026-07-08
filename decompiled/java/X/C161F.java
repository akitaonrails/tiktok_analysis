package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.161F, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C161F {
    public static final C161F LIZ = new C161F();

    public static final String LIZIZ(Aweme aweme) {
        String textStickerMajorityLang;
        if (aweme == null || (textStickerMajorityLang = aweme.getTextStickerMajorityLang()) == null) {
            return "";
        }
        return textStickerMajorityLang;
    }

    public static final boolean LIZLLL(List<InteractStickerStruct> list) {
        if (list == null) {
            return false;
        }
        for (InteractStickerStruct interactStickerStruct : list) {
            if (interactStickerStruct != null && interactStickerStruct.getType() == 18) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return C13LQ.LJIILLIIL(LIZIZ(aweme), C0SCU.LIZ().LL());
    }

    public static final List LIZ(Aweme aweme, List list) {
        String textStruct;
        String strLIZIZ = LIZIZ(aweme);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it2.next();
            String str = null;
            if (interactStickerStruct.getType() == 18) {
                TextStickerInfo textInfo = interactStickerStruct.getTextInfo();
                if (textInfo != null) {
                    str = textInfo.srcLanguage;
                }
                if (Intrinsics.LJFF(str, strLIZIZ) && C123100dR.LIZ(interactStickerStruct.getTextStruct()) && (textStruct = interactStickerStruct.getTextStruct()) != null) {
                    arrayList.add(textStruct);
                }
            }
        }
        return arrayList;
    }

    public static final List LIZJ(Aweme aweme, List list) {
        String str;
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(0, 0, 0);
        if (list == null || aweme == null) {
            return listLJIILJJIL;
        }
        String strLIZIZ = LIZIZ(aweme);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it2.next();
            if (interactStickerStruct != null && interactStickerStruct.getType() == 18) {
                interactStickerStruct.getTextStruct();
                TextStickerInfo textInfo = interactStickerStruct.getTextInfo();
                if (textInfo != null) {
                    TextStickerInfo textInfo2 = interactStickerStruct.getTextInfo();
                    if (textInfo2 != null) {
                        str = textInfo2.srcLanguage;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, strLIZIZ)) {
                        ListProtector.set(listLJIILJJIL, 0, Integer.valueOf(((Number) ListProtector.get(listLJIILJJIL, 0)).intValue() + 1));
                        if (Intrinsics.LJFF(textInfo.bgColor, "#00000000")) {
                            ListProtector.set(listLJIILJJIL, 1, Integer.valueOf(((Number) ListProtector.get(listLJIILJJIL, 1)).intValue() + 1));
                        } else {
                            ListProtector.set(listLJIILJJIL, 2, Integer.valueOf(((Number) ListProtector.get(listLJIILJJIL, 2)).intValue() + 1));
                        }
                    }
                }
            }
        }
        return listLJIILJJIL;
    }
}

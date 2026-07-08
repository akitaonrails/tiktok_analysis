package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0irK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1258680irK {
    public static final /* synthetic */ int LIZ = 0;

    public static AnchorCommonStruct LIZJ(Aweme aweme) {
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        AnchorCommonStruct anchorCommonStruct = null;
        if (anchors == null) {
            return null;
        }
        Iterator<AnchorCommonStruct> it2 = anchors.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AnchorCommonStruct next = it2.next();
            if (next.getType() == 41) {
                anchorCommonStruct = next;
                break;
            }
        }
        return anchorCommonStruct;
    }

    public static InteractStickerStruct LIZLLL(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        InteractStickerStruct interactStickerStruct = null;
        if (interactStickerStructs == null) {
            return null;
        }
        Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InteractStickerStruct next = it2.next();
            if (next.getType() == 25) {
                interactStickerStruct = next;
                break;
            }
        }
        return interactStickerStruct;
    }

    public static List LIZ(C1259360isQ c1259360isQ, String str) {
        List<T> list = c1259360isQ.mmItems;
        ArrayList arrayList = null;
        if (list != 0) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                List<AnchorCommonStruct> anchors = ((Aweme) obj).getAnchors();
                if (anchors != null && !anchors.isEmpty()) {
                    Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            AnchorCommonStruct next = it2.next();
                            if (next.getType() == 41 && Intrinsics.LJFF(next.getDataFromExtra("third_id", ""), str)) {
                                arrayList.add(obj);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static Aweme LIZIZ(C1259360isQ c1259360isQ, String str) {
        Long lValueOf;
        List<T> list = c1259360isQ.mmItems;
        Object obj = null;
        if (list == 0) {
            return null;
        }
        Iterator it2 = list.iterator();
        loop0: while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            List<InteractStickerStruct> interactStickerStructs = ((Aweme) next).getInteractStickerStructs();
            if (interactStickerStructs != null && !interactStickerStructs.isEmpty()) {
                for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                    if (interactStickerStruct.getType() == 25) {
                        CountDownStickerStruct countDownStickerStruct = interactStickerStruct.getCountDownStickerStruct();
                        if (countDownStickerStruct != null) {
                            lValueOf = Long.valueOf(countDownStickerStruct.getEventId());
                        } else {
                            lValueOf = null;
                        }
                        if (Intrinsics.LJFF(String.valueOf(lValueOf), str)) {
                            obj = next;
                            break loop0;
                        }
                    }
                }
            }
        }
        return (Aweme) obj;
    }
}

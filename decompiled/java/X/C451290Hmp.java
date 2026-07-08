package X;

import com.ss.android.ugc.aweme.im.common.experiment.DMTypingRecommendationNewPositionConfig;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.viewmodel.TypingRecommendationVM;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Hmp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.TypingRecommendationVM$loadDefaultStickers$1$1", f = "TypingRecommendationVM.kt", l = {}, m = "invokeSuspend")
public final class C451290Hmp extends C09AX implements InterfaceC1631620sYq<List<? extends StickerItem>, AbstractC450030Hkn<List<? extends StickerItem>>, InterfaceC1364105Vn<? super List<? extends StickerItem>>, Object> {
    public /* synthetic */ Object LL;
    public /* synthetic */ AbstractC450030Hkn LLILLJJLI;
    public final /* synthetic */ TypingRecommendationVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C451290Hmp(TypingRecommendationVM typingRecommendationVM, InterfaceC1364105Vn<? super C451290Hmp> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = typingRecommendationVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterable iterable;
        C1C7U.LIZ("TypingRecommendationVM@7aaa.loadDefaultStickers$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Iterable iterable2 = (Iterable) this.LL;
        AbstractC450030Hkn abstractC450030Hkn = this.LLILLJJLI;
        this.LLILLL.getClass();
        DMTypingRecommendationNewPositionConfig dMTypingRecommendationNewPositionConfigLIZ = C451310Hmr.LIZ();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        for (StickerItem stickerItem : C13LP.LL(iterable2, dMTypingRecommendationNewPositionConfigLIZ.maxRecent)) {
            String strLIZIZ = C453560HqU.LIZIZ(stickerItem);
            if (strLIZIZ != null && linkedHashSet.add(strLIZIZ)) {
                arrayList.add(stickerItem);
            }
        }
        if (abstractC450030Hkn instanceof C450040Hko) {
            iterable = (Iterable) ((C450040Hko) abstractC450030Hkn).LIZ;
        } else {
            iterable = C13BV.INSTANCE;
        }
        for (StickerItem stickerItem2 : C13LP.LL(iterable, dMTypingRecommendationNewPositionConfigLIZ.maxFavourite)) {
            String strLIZIZ2 = C453560HqU.LIZIZ(stickerItem2);
            if (strLIZIZ2 != null && linkedHashSet.add(strLIZIZ2)) {
                arrayList.add(stickerItem2);
            }
        }
        List listLL = C13LP.LL(arrayList, dMTypingRecommendationNewPositionConfigLIZ.maxTotal);
        C1C7U.LIZIZ("TypingRecommendationVM@7aaa.loadDefaultStickers$1$1");
        return listLL;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(List<? extends StickerItem> list, AbstractC450030Hkn<List<? extends StickerItem>> abstractC450030Hkn, InterfaceC1364105Vn<? super List<? extends StickerItem>> interfaceC1364105Vn) {
        C451290Hmp c451290Hmp = new C451290Hmp(this.LLILLL, interfaceC1364105Vn);
        c451290Hmp.LL = list;
        c451290Hmp.LLILLJJLI = abstractC450030Hkn;
        return c451290Hmp.invokeSuspend(Unit.LIZ);
    }
}

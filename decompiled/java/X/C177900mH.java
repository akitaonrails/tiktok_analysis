package X;

import com.bytedance.android.livesdk.comp.api.musicgift.IMusicGiftService;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00mH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C177900mH extends C09AY implements Function0<Unit> {
    public final /* synthetic */ ArrayList<GiftPage> LL;
    public final /* synthetic */ List<Long> LLILLJJLI;
    public final /* synthetic */ List<Gift> LLILLL;
    public final /* synthetic */ Function1<ArrayList<GiftPage>, Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C177900mH(ArrayList arrayList, List list, List list2, C5183020f c5183020f, AnonymousClass0206 anonymousClass0206) {
        super(0);
        this.LL = arrayList;
        this.LLILLJJLI = list;
        this.LLILLL = list2;
        this.LLILZ = c5183020f;
        this.LLILZIL = anonymousClass0206;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ArrayList<GiftPage> arrayList = this.LL;
        List<Long> list = this.LLILLJJLI;
        List<Gift> list2 = this.LLILLL;
        GiftPage giftPageLIZ = C177800mG.LIZ(arrayList);
        if (giftPageLIZ != null && Intrinsics.LJFF(C177800mG.LIZIZ(arrayList), list)) {
            giftPageLIZ.favouriteGifts = list2;
            C177800mG.LIZLLL(arrayList);
            C177800mG.LIZJ(arrayList);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<Gift> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(it2.next().id));
            }
            IMusicGiftService iMusicGiftService = (IMusicGiftService) C1161920gLG.LIZJ(IMusicGiftService.class);
            if (iMusicGiftService != null) {
                iMusicGiftService.py1(arrayList2);
            }
            if (arrayList != null) {
                this.LLILZ.invoke(arrayList);
            }
        }
        this.LLILZIL.invoke();
        return Unit.LIZ;
    }
}

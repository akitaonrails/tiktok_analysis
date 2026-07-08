package X;

import com.bytedance.android.livesdk.gift.model.MusicGiftListResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147740fyO extends C09AY implements Function1<MusicGiftListResponse.Data, C1147420fxs> {
    public final /* synthetic */ C1147690fyJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147740fyO(C1147690fyJ c1147690fyJ) {
        super(1);
        this.LL = c1147690fyJ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1147420fxs invoke(MusicGiftListResponse.Data data) {
        MusicGiftListResponse.Data data2 = data;
        this.LL.LIZIZ.getClass();
        long j = data2.moodId;
        List<MusicGiftListResponse.Data.Tab> list = data2.tabs;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<MusicGiftListResponse.Data.Tab> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C1147750fyP.LIZ(it2.next()));
        }
        return new C1147420fxs(j, arrayList);
    }
}

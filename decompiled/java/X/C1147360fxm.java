package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.MusicGiftMood;
import com.bytedance.android.livesdk.gift.model.MusicGiftMoodColor;
import com.bytedance.android.livesdk.gift.model.MusicGiftMoodsResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147360fxm extends C09AY implements Function1<MusicGiftMoodsResponse.Data, List<? extends C1147390fxp>> {
    public final /* synthetic */ C1147690fyJ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147360fxm(C1147690fyJ c1147690fyJ) {
        super(1);
        this.LL = c1147690fyJ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends C1147390fxp> invoke(MusicGiftMoodsResponse.Data data) {
        String str;
        C1147750fyP c1147750fyP = this.LL.LIZIZ;
        List<MusicGiftMood> list = data.moods;
        c1147750fyP.getClass();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (MusicGiftMood musicGiftMood : list) {
            long j = musicGiftMood.moodId;
            ImageModel imageModel = musicGiftMood.icon;
            ImageModel imageModel2 = musicGiftMood.disc;
            String str2 = musicGiftMood.name;
            String str3 = musicGiftMood.title;
            MusicGiftMoodColor musicGiftMoodColor = musicGiftMood.color;
            String str4 = null;
            if (musicGiftMoodColor != null) {
                str4 = musicGiftMoodColor.giftListHex;
            }
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            if (musicGiftMoodColor != null && (str = musicGiftMoodColor.secondaryPageHex) != null) {
                str5 = str;
            }
            arrayList.add(new C1147390fxp(j, imageModel, imageModel2, str2, str3, str4, str5));
        }
        return arrayList;
    }
}

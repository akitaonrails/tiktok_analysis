package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBlockInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoCertInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoFollowInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPrivateInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoRelationInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0R2Y, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R2Y extends C09AY implements Function1<TakoMixFeed, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0R2Y(String str, String str2, String str3, String str4, String str5) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TakoMixFeed takoMixFeed) {
        List listSingletonList;
        List listSingletonList2;
        TakoMixFeed takoMixFeed2 = takoMixFeed;
        String str = this.LL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        takoMixFeed2.text = str;
        String str3 = this.LLILLJJLI;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = this.LLILLL;
        if (str4 != null && str4.length() != 0) {
            listSingletonList = Collections.singletonList(this.LLILLL);
        } else {
            listSingletonList = C13BV.INSTANCE;
        }
        BaseImage baseImage = new BaseImage(null, null, listSingletonList, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262139, null);
        String str5 = this.LLILZ;
        if (str5 != null) {
            str2 = str5;
        }
        String str6 = this.LLILZIL;
        if (str6 != null && str6.length() != 0) {
            listSingletonList2 = Collections.singletonList(this.LLILZIL);
        } else {
            listSingletonList2 = C13BV.INSTANCE;
        }
        takoMixFeed2.videoList = Collections.singletonList(new TakoVideoItem(str3, 0L, baseImage, new TakoUserItem(0L, str2, "", new BaseImage(null, null, listSingletonList2, null, 0, 0, null, null, null, null, null, null, null, null, null, 0, 0, null, 262139, null), "", new TakoCertInfo(false, ""), new TakoRelationInfo(new TakoBlockInfo(false, false), new TakoFollowInfo(-1, -1, 0)), new TakoPrivateInfo(false)), "", 0L, null, null, new LinkedHashMap(), null, null));
        takoMixFeed2.cardType = 1023;
        return Unit.LIZ;
    }
}

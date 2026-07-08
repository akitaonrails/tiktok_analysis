package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.tako.model.SearchVideoItem;
import com.ss.android.ugc.aweme.tako.model.TakoEventTracker;
import com.ss.android.ugc.aweme.tako.model.TakoSearchCarryInItem;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ybY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863940ybY extends C09AY implements Function1<TakoCarriedUpData, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ TakoEventTracker LLILLL;
    public final /* synthetic */ TakoSearchCarryInItem LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<Aweme> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1863940ybY(String str, String str2, TakoEventTracker takoEventTracker, TakoSearchCarryInItem takoSearchCarryInItem, String str3, List<? extends Aweme> list, String str4, String str5) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = takoEventTracker;
        this.LLILZ = takoSearchCarryInItem;
        this.LLILZIL = str3;
        this.LLILZLL = list;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TakoCarriedUpData takoCarriedUpData) {
        Integer num;
        String str;
        String strLJJIII;
        String str2;
        String str3;
        String str4;
        String string;
        String str5;
        String string2;
        Integer num2;
        long diggCount;
        List<String> urlList;
        UrlModel cover;
        TakoCarriedUpData takoCarriedUpData2 = takoCarriedUpData;
        takoCarriedUpData2.setRepeatKey(this.LL);
        takoCarriedUpData2.setSendMsgContent(this.LLILLJJLI);
        TakoEventTracker takoEventTracker = this.LLILLL;
        ArrayList arrayList = null;
        if (takoEventTracker != null) {
            num = takoEventTracker.cardType;
        } else {
            num = null;
        }
        takoCarriedUpData2.setAnswerCardType(num);
        TakoEventTracker takoEventTracker2 = this.LLILLL;
        if (takoEventTracker2 != null) {
            str = takoEventTracker2.messageId;
        } else {
            str = null;
        }
        takoCarriedUpData2.setAnswerMsgId(str);
        String str6 = this.LLILZ.text;
        String str7 = "";
        if (str6 != null) {
            strLJJIII = u.LJJIII(str6, "\n", "", false);
        } else {
            strLJJIII = null;
        }
        takoCarriedUpData2.setAnswerMsgContent(strLJJIII);
        List<Aweme> list = this.LLILZ.videos;
        if (list != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (Aweme aweme : list) {
                String aid = aweme.getAid();
                if (aid == null) {
                    aid = "";
                }
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    diggCount = statistics.getDiggCount();
                } else {
                    diggCount = 0;
                }
                Video video = aweme.getVideo();
                if (video == null || (cover = video.getCover()) == null || (urlList = cover.getUrlList()) == null) {
                    urlList = C13BV.INSTANCE;
                }
                arrayList.add(new SearchVideoItem(aid, diggCount, urlList));
            }
        }
        takoCarriedUpData2.setAnswerVideoList(arrayList);
        takoCarriedUpData2.setAnswerBingList(this.LLILZ.bings);
        takoCarriedUpData2.setAnswerImageList(this.LLILZ.images);
        takoCarriedUpData2.setAnswerReferenceList(this.LLILZ.references);
        takoCarriedUpData2.setAnswerPlaceHolders(this.LLILZ.placeholderSources);
        takoCarriedUpData2.setAnswerDisclaimerContent(this.LLILZIL);
        takoCarriedUpData2.setSugList(this.LLILZ.sugs);
        takoCarriedUpData2.setAnswerAwemeListCache(this.LLILZLL);
        Pair[] pairArr = new Pair[6];
        String str8 = this.LLIZ;
        if (str8 == null) {
            str8 = "";
        }
        pairArr[0] = new Pair("universal_rank", str8);
        TakoEventTracker takoEventTracker3 = this.LLILLL;
        if (takoEventTracker3 == null || (str2 = takoEventTracker3.messageType) == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("message_type", str2);
        TakoEventTracker takoEventTracker4 = this.LLILLL;
        if (takoEventTracker4 == null || (str3 = takoEventTracker4.logId) == null) {
            str3 = "";
        }
        pairArr[2] = new Pair("log_id", str3);
        TakoEventTracker takoEventTracker5 = this.LLILLL;
        if (takoEventTracker5 == null || (str4 = takoEventTracker5.idList) == null) {
            str4 = "";
        }
        pairArr[3] = new Pair("id_list", str4);
        TakoEventTracker takoEventTracker6 = this.LLILLL;
        if (takoEventTracker6 == null || (string = Integer.valueOf(takoEventTracker6.isQuoteVideo()).toString()) == null) {
            string = "";
        }
        pairArr[4] = new Pair("is_quote_video", string);
        String str9 = this.LLIZLLLIL;
        if (str9 == null) {
            str9 = "";
        }
        pairArr[5] = new Pair("abase_id", str9);
        takoCarriedUpData2.setMessageMobParams(C2097608Jq.LJIIIIZZ(pairArr));
        Pair[] pairArr2 = new Pair[3];
        TakoEventTracker takoEventTracker7 = this.LLILLL;
        if (takoEventTracker7 == null || (str5 = takoEventTracker7.logId) == null) {
            str5 = "";
        }
        pairArr2[0] = new Pair("log_id", str5);
        TakoEventTracker takoEventTracker8 = this.LLILLL;
        if (takoEventTracker8 == null || (num2 = takoEventTracker8.cardType) == null || (string2 = num2.toString()) == null) {
            string2 = "";
        }
        pairArr2[1] = new Pair("engine_message_type", string2);
        String str10 = this.LLIZLLLIL;
        if (str10 != null) {
            str7 = str10;
        }
        pairArr2[2] = new Pair("abase_id", str7);
        takoCarriedUpData2.setSugMobParams(C2097608Jq.LJIIIIZZ(pairArr2));
        return Unit.LIZ;
    }
}

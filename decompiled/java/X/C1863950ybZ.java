package X;

import com.ss.android.ugc.aweme.tako.model.SmartSearchItem;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ybZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1863950ybZ extends C09AY implements Function1<TakoCarriedUpData, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Integer LLILZIL;
    public final /* synthetic */ SmartSearchItem LLILZLL;
    public final /* synthetic */ List<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1863950ybZ(String str, String str2, String str3, String str4, Integer num, SmartSearchItem smartSearchItem, List<String> list) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = num;
        this.LLILZLL = smartSearchItem;
        this.LLIZ = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(TakoCarriedUpData takoCarriedUpData) {
        String str;
        String string;
        TakoCarriedUpData takoCarriedUpData2 = takoCarriedUpData;
        C324800CoI.LIZ.getClass();
        if (!C324800CoI.LIZ() || (str = this.LL) == null || str.length() <= 0) {
            str = null;
        }
        takoCarriedUpData2.setRepeatKey(str);
        String str2 = this.LLILLJJLI;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        takoCarriedUpData2.setSendMsgContent(str2);
        takoCarriedUpData2.setSendInteractionType(this.LLILLL);
        takoCarriedUpData2.setAnswerMsgContent(this.LLILZ);
        takoCarriedUpData2.setAnswerCardType(this.LLILZIL);
        Pair[] pairArr = new Pair[4];
        String str4 = this.LLILZLL.panelImplId;
        if (str4 == null) {
            str4 = "";
        }
        pairArr[0] = new Pair("panel_impr_id", str4);
        String str5 = this.LLILZLL.wordContent;
        if (str5 == null) {
            str5 = "";
        }
        pairArr[1] = new Pair("words_content", str5);
        String str6 = this.LLILZLL.messageType;
        if (str6 == null) {
            str6 = "";
        }
        pairArr[2] = new Pair("message_type", str6);
        Integer numIsPhoto = this.LLILZLL.isPhoto();
        if (numIsPhoto != null && (string = numIsPhoto.toString()) != null) {
            str3 = string;
        }
        pairArr[3] = new Pair("is_photo", str3);
        takoCarriedUpData2.setMessageMobParams(C2097608Jq.LJIIIIZZ(pairArr));
        takoCarriedUpData2.setSugList(this.LLIZ);
        return Unit.LIZ;
    }
}

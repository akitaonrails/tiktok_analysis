package X;

import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.MessageAbilityImpl;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yWD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860630yWD extends C09AY implements Function1<List<? extends BaseImage>, Unit> {
    public final /* synthetic */ Map<String, String> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ MessageAbilityImpl LLILZ;
    public final /* synthetic */ TakoReferenceAskInfo LLILZIL;
    public final /* synthetic */ TakoEditAskInfo LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ Map<String, String> LLJI;
    public final /* synthetic */ Map<String, String> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860630yWD(C830490Whz c830490Whz, String str, String str2, MessageAbilityImpl messageAbilityImpl, TakoReferenceAskInfo takoReferenceAskInfo, TakoEditAskInfo takoEditAskInfo, int i, String str3, int i2, Map map, Map map2) {
        super(1);
        this.LL = c830490Whz;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = messageAbilityImpl;
        this.LLILZIL = takoReferenceAskInfo;
        this.LLILZLL = takoEditAskInfo;
        this.LLIZ = i;
        this.LLIZLLLIL = str3;
        this.LLJ = i2;
        this.LLJI = map;
        this.LLJIJIL = map2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends BaseImage> list) throws JSONException {
        Long lValueOf;
        Integer numValueOf;
        String strLIZJ;
        Map mapLJ;
        List<? extends BaseImage> list2 = list;
        this.LL.put("message_content", this.LLILLJJLI);
        this.LL.put("message_id", this.LLILLL);
        this.LL.put("image_info", AnonymousClass1418.LJ(list2));
        this.LL.put("image_count", String.valueOf(list2.size()));
        C201996141y c201996141y = C201996141y.LIZ;
        C1863380yae c1863380yae = this.LLILZ.LL.LLJJJJ;
        Map<String, String> mapLIZ = null;
        if (c1863380yae != null) {
            lValueOf = Long.valueOf(c1863380yae.LJII);
        } else {
            lValueOf = null;
        }
        C1863380yae c1863380yae2 = this.LLILZ.LL.LLJJJJ;
        if (c1863380yae2 != null) {
            numValueOf = Integer.valueOf(c1863380yae2.LJIIIIZZ);
        } else {
            numValueOf = null;
        }
        c201996141y.getClass();
        String strLJ = C201996141y.LJ(numValueOf, lValueOf);
        if (strLJ != null) {
            this.LL.put("is_memory", strLJ);
        }
        MessageAbilityImpl messageAbilityImpl = this.LLILZ;
        String str = this.LL.get("interaction_type");
        TakoReferenceAskInfo takoReferenceAskInfo = this.LLILZIL;
        TakoEditAskInfo takoEditAskInfo = this.LLILZLL;
        messageAbilityImpl.getClass();
        this.LL.put("interaction_type", MessageAbilityImpl.LJII(str, takoReferenceAskInfo, takoEditAskInfo));
        String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(this.LLIZ));
        if (strLIZLLL == null) {
            strLIZLLL = this.LLIZLLLIL;
            if (strLIZLLL.length() == 0) {
                strLIZLLL = null;
            }
        }
        if (this.LLIZ == 6001) {
            strLIZJ = "image_to_video";
        } else {
            strLIZJ = C1855920yOc.LIZJ(Integer.valueOf(this.LLJ));
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        Map<String, String> map = this.LLJI;
        if (map != null) {
            mapLJ = C2097608Jq.LJIIL(map, C2097608Jq.LJIIIIZZ(new Pair("mode", strLIZJ), new Pair("sub_mode", strLIZLLL)));
        } else {
            mapLJ = C2097608Jq.LJ();
        }
        Map<String, String> map2 = this.LL;
        Map<String, String> map3 = this.LLJIJIL;
        if (map3 == null) {
            TakoEnterParams takoEnterParams = this.LLILZ.LLILZ;
            if (takoEnterParams != null) {
                mapLIZ = C1862500yZE.LIZ(takoEnterParams, false);
            }
        } else {
            mapLIZ = map3;
        }
        c1862330yYx.getClass();
        C1862330yYx.LJLLI(mapLJ, map2, mapLIZ);
        this.LLILZ.LJI();
        return Unit.LIZ;
    }
}

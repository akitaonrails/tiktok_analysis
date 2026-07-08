package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.AIGCStyleConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplateAsset;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.model.TakoPageContext;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yIk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852280yIk extends C09AY implements Function1<String, Boolean> {
    public final /* synthetic */ CreativeTemplate LL;
    public final /* synthetic */ InterfaceC665370Q7z LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ TakoPageContext LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ Context LLIZ;
    public final /* synthetic */ C1852650yJL LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1852280yIk(CreativeTemplate creativeTemplate, InterfaceC665370Q7z interfaceC665370Q7z, Context context, String str, TakoPageContext takoPageContext, Integer num, Context context2, C1852650yJL c1852650yJL, String str2) {
        super(1);
        this.LL = creativeTemplate;
        this.LLILLJJLI = interfaceC665370Q7z;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = takoPageContext;
        this.LLILZLL = num;
        this.LLIZ = context2;
        this.LLIZLLLIL = c1852650yJL;
        this.LLJ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        List<CreativeTemplateAsset> list;
        boolean zLJIIIZ;
        Map<String, String> commonParams;
        TakoEnterParams takoEnterParamsDN1;
        AIGCStyleConfig aIGCStyleConfig;
        String str2;
        String str3;
        String str4;
        String str5;
        IMessageAbility iMessageAbility;
        ITakoContextAbility iTakoContextAbility;
        String str6 = str;
        C1561220qjI.LIZ.getClass();
        String str7 = null;
        if (C1561220qjI.LIZ()) {
            zLJIIIZ = false;
            if (this.LL != null) {
                InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
                if (interfaceC665370Q7z != null && (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null)) != null) {
                    commonParams = iTakoContextAbility.getCommonParams();
                } else {
                    commonParams = null;
                }
                InterfaceC665370Q7z interfaceC665370Q7z2 = this.LLILLJJLI;
                if (interfaceC665370Q7z2 != null && (iMessageAbility = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z2, IMessageAbility.class, null)) != null) {
                    takoEnterParamsDN1 = iMessageAbility.DN1();
                } else {
                    takoEnterParamsDN1 = null;
                }
                C1852290yIl c1852290yIl = C1852290yIl.LIZ;
                Context context = this.LLILLL;
                CreativeTemplate creativeTemplate = this.LL;
                C1852650yJL c1852650yJLLIZ = C1852640yJK.LIZ(this.LLILZ, null);
                if (c1852650yJLLIZ != null) {
                    aIGCStyleConfig = c1852650yJLLIZ.LJIIJ;
                } else {
                    aIGCStyleConfig = null;
                }
                if (commonParams != null) {
                    str2 = commonParams.get("enter_from");
                } else {
                    str2 = null;
                }
                String str8 = "";
                if (str2 == null) {
                    str2 = "";
                }
                if (commonParams == null || (str3 = commonParams.get("enter_method")) == null) {
                    str3 = "";
                }
                String str9 = this.LLILZ;
                TakoPageContext takoPageContext = this.LLILZIL;
                Pair[] pairArr = new Pair[3];
                if (takoEnterParamsDN1 != null) {
                    str7 = takoEnterParamsDN1.processId;
                }
                pairArr[0] = new Pair("process_id", String.valueOf(str7));
                if (commonParams == null || (str4 = commonParams.get("tako_session_id")) == null) {
                    str4 = "";
                }
                zLJIIIZ = true;
                pairArr[1] = new Pair("tako_session_id", str4);
                if (commonParams != null && (str5 = commonParams.get("tako_chat_id")) != null) {
                    str8 = str5;
                }
                pairArr[2] = new Pair("tako_chat_id", str8);
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                String str10 = this.LLJ;
                if (str10 != null) {
                    mapLJIIJ.put("push_id", str10);
                }
                Integer num = this.LLILZLL;
                c1852290yIl.getClass();
                C1852290yIl.LIZ(context, creativeTemplate, aIGCStyleConfig, str2, str3, str9, takoPageContext, mapLJIIJ, num);
            }
        } else {
            C1854260yLw c1854260yLw = C1854260yLw.LIZ;
            C1852270yIj c1852270yIj = C1852270yIj.LIZ;
            CreativeTemplate creativeTemplate2 = this.LL;
            if (creativeTemplate2 != null) {
                list = creativeTemplate2.assets;
            } else {
                list = null;
            }
            c1852270yIj.getClass();
            List listLJFF = C1852270yIj.LJFF(list);
            CreativeTemplate creativeTemplate3 = this.LL;
            if (creativeTemplate3 != null) {
                str7 = creativeTemplate3.templateId;
            }
            zLJIIIZ = C1854260yLw.LJIIIZ(c1854260yLw, this.LLIZ, this.LLIZLLLIL, this.LLILLJJLI, str6, listLJFF, str7, null, null, this.LLILZLL, null, 1416);
        }
        return Boolean.valueOf(zLJIIIZ);
    }
}

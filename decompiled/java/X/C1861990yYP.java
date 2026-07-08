package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.MessageAbilityImpl;
import com.ss.android.ugc.aweme.tako.ccl.net.TakoLanguageStyleSetting;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yYP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.ability.MessageAbilityImpl$handleOnboarding$2", f = "IMessageAbility.kt", l = {1227}, m = "invokeSuspend")
public final class C1861990yYP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1863380yae LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;
    public final /* synthetic */ MessageAbilityImpl LLILZ;
    public final /* synthetic */ C1862000yYQ LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1861990yYP(C1863380yae c1863380yae, Map<String, String> map, MessageAbilityImpl messageAbilityImpl, C1862000yYQ c1862000yYQ, String str, InterfaceC1364105Vn<? super C1861990yYP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1863380yae;
        this.LLILLL = map;
        this.LLILZ = messageAbilityImpl;
        this.LLILZIL = c1862000yYQ;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1861990yYP(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String screenType;
        List<String> list;
        String string;
        C1C7U.LIZ("MessageAbilityImpl@2b26.handleOnboarding$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str2 = this.LLILLJJLI.LJ;
            this.LLILLL.put("process_id", str2);
            this.LLILLL.put("tako_session_id", this.LLILLJJLI.LJIILIIL);
            this.LLILLL.put("tako_chat_id", this.LLILLJJLI.LJFF);
            this.LLILLL.put("send_mode", "220");
            C1862700yZY.LIZJ(str2, new Pair("session_source", "initiate_new_session"), null);
            TakoEnterParams takoEnterParams = this.LLILZ.LLILZ;
            if (takoEnterParams == null || (screenType = takoEnterParams.getScreenType()) == null) {
                screenType = "full_screen";
            }
            C1862700yZY.LIZJ(str2, new Pair("screen_type", screenType), null);
            C1862000yYQ c1862000yYQ = this.LLILZIL;
            String str3 = c1862000yYQ.LIZ;
            String str4 = c1862000yYQ.LIZIZ;
            C1862010yYR c1862010yYR = c1862000yYQ.LIZJ;
            if (c1862010yYR != null && (list = c1862010yYR.LIZ) != null) {
                str = (String) C13LP.LJJJLL(list);
            }
            C1862000yYQ c1862000yYQ2 = this.LLILZIL;
            String str5 = c1862000yYQ2.LIZLLL;
            String str6 = c1862000yYQ2.LJ;
            C1863380yae c1863380yae = this.LLILLJJLI;
            String str7 = this.LLILZLL;
            this.LL = 1;
            if (c1863380yae.LJIIZILJ(str7, str3, str4, str, str5, str6, this) == objLJFF) {
                C1C7U.LIZIZ("MessageAbilityImpl@2b26.handleOnboarding$2");
                return objLJFF;
            }
        }
        this.LLILZ.LJI();
        MessageAbilityImpl messageAbilityImpl = this.LLILZ;
        C1862000yYQ c1862000yYQ3 = this.LLILZIL;
        String str8 = this.LLILZLL;
        Map<String, String> map = this.LLILLL;
        messageAbilityImpl.getClass();
        Pair[] pairArr = new Pair[12];
        pairArr[0] = new Pair("message_id", str8);
        String str9 = c1862000yYQ3.LIZ;
        if (str9 == null) {
            str9 = "";
        }
        pairArr[1] = new Pair("message_content", str9);
        pairArr[2] = new Pair("message_type", "text_video");
        String str10 = CardStruct.IStatusCode.DEFAULT;
        pairArr[3] = new Pair("is_resend", CardStruct.IStatusCode.DEFAULT);
        pairArr[4] = new Pair("interaction_type", "quick_reaction");
        pairArr[5] = new Pair("ratio", CardStruct.IStatusCode.DEFAULT);
        pairArr[6] = new Pair("is_memory", CardStruct.IStatusCode.DEFAULT);
        C201992141u.LIZ.getClass();
        TakoLanguageStyleSetting takoLanguageStyleSetting = C201992141u.LJFF;
        if (takoLanguageStyleSetting != null && (string = Integer.valueOf(takoLanguageStyleSetting.selectedLanguageStyle).toString()) != null) {
            str10 = string;
        }
        pairArr[7] = new Pair("language_style", str10);
        pairArr[8] = new Pair("session_source", "initiate_new_session");
        pairArr[9] = new Pair("mode_source", "user_onboarding");
        pairArr[10] = new Pair("word_page_source", "user_onboarding");
        pairArr[11] = new Pair("guide_type", c1862000yYQ3.LJII);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        String str11 = c1862000yYQ3.LJFF;
        if (str11 != null && (!a0.LJJJIL(str11))) {
            mapLJIIJ.put("word_id", str11);
        }
        String str12 = c1862000yYQ3.LJI;
        if (str12 != null && (!a0.LJJJIL(str12))) {
            mapLJIIJ.put("impr_id", str12);
        }
        C1862330yYx.LIZ.getClass();
        C1862330yYx.LJLLI(map, mapLJIIJ, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageAbilityImpl@2b26.handleOnboarding$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

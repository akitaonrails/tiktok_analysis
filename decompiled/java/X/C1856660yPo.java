package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yPo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.longpress.TakoLongPressUtil$buildVideoPostConfig$1$2$1", f = "TakoLongPressUtil.kt", l = {969}, m = "invokeSuspend")
public final class C1856660yPo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC665370Q7z LLILLL;
    public final /* synthetic */ List<BaseVideo> LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ View LLILZLL;
    public final /* synthetic */ TakoInteractionConfig LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;
    public final /* synthetic */ Message LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856660yPo(InterfaceC665370Q7z interfaceC665370Q7z, List<BaseVideo> list, View view, View view2, TakoInteractionConfig takoInteractionConfig, String str, Map<String, String> map, Message message, String str2, InterfaceC1364105Vn<? super C1856660yPo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC665370Q7z;
        this.LLILZ = list;
        this.LLILZIL = view;
        this.LLILZLL = view2;
        this.LLIZ = takoInteractionConfig;
        this.LLIZLLLIL = str;
        this.LLJ = map;
        this.LLJI = message;
        this.LLJIJIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1856660yPo c1856660yPo = new C1856660yPo(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c1856660yPo.LLILLJJLI = obj;
        return c1856660yPo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String str;
        String strValueOf;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str2;
        BaseVideo baseVideo;
        Object objLIZIZ = obj;
        C1C7U.LIZ("TakoLongPressUtil@966e.buildVideoPostConfig$1$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C07QI.LIZ.getClass();
            if (C07QI.LIZ()) {
                ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(this.LLILLL, ITakoChatPageAbility.class, null);
                if (iTakoChatPageAbility != null) {
                    iTakoChatPageAbility.t4(true);
                }
                C09AE c09ae = (C09AE) interfaceC497601wk.getCoroutineContext().get(C09AE.LJJLJ);
                if (c09ae != null) {
                    c09ae.LJII(new AwS606S0100000_27(this.LLILLL, 433));
                }
            }
            BaseVideo baseVideo2 = (BaseVideo) C13LP.LJJJLZIJ(0, this.LLILZ);
            if (baseVideo2 != null && (str = baseVideo2.videoUrl) != null && str.length() != 0) {
                BaseVideo baseVideo3 = (BaseVideo) C13LP.LJJJLZIJ(0, this.LLILZ);
                if (baseVideo3 == null || (str2 = baseVideo3.fileHash) == null || !C123100dR.LIZ(str2) || (baseVideo = (BaseVideo) C13LP.LJJJLZIJ(0, this.LLILZ)) == null || (strValueOf = baseVideo.fileHash) == null) {
                    strValueOf = String.valueOf(str.hashCode());
                }
                Context context = this.LLILZIL.getContext();
                View view = this.LLILZLL;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL;
                Message message = this.LLJI;
                String str3 = this.LLJIJIL;
                ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
                if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                    linkedHashMap.put("enter_from", c1863850ybP.LL);
                    linkedHashMap.put("enter_method", c1863850ybP.LLILLJJLI);
                    linkedHashMap.put("process_id", c1863850ybP.LLILZIL);
                    String str4 = c1863850ybP.LLILZLL;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    linkedHashMap.put("tako_session_id", str4);
                    String str6 = c1863850ybP.LLIZ;
                    if (str6 != null) {
                        str5 = str6;
                    }
                    linkedHashMap.put("tako_chat_id", str5);
                    linkedHashMap.put("message_id", message.uuid);
                    linkedHashMap.put("url", str);
                    linkedHashMap.put("media_type", "video");
                    linkedHashMap.put("source", str3);
                }
                this.LL = 1;
                objLIZIZ = C12FM.LIZIZ(context, view, strValueOf, str, linkedHashMap, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("TakoLongPressUtil@966e.buildVideoPostConfig$1$2$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TakoLongPressUtil@966e.buildVideoPostConfig$1$2$1");
                return unit;
            }
        }
        Pair pair = (Pair) objLIZIZ;
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        String str7 = (String) pair.getSecond();
        TakoInteractionConfig takoInteractionConfig = this.LLIZ;
        if (takoInteractionConfig != null) {
            C1858720yT8.LIZ(takoInteractionConfig, false, this.LLILLL);
        }
        if (zBooleanValue && C123100dR.LIZ(str7)) {
            C12FM.LIZ(this.LLILZIL.getContext(), str7, this.LLIZLLLIL, this.LLJ, C1855920yOc.LIZ(this.LLJI));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TakoLongPressUtil@966e.buildVideoPostConfig$1$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

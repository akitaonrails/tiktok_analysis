package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.tako.botpage.components.video.videogeneration.TakoVideoGenerationCoverAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.ITakoChatPageAbility;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS606S0100000_27;
import njp.a;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0yPj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.video.videogeneration.TakoVideoGenerationCoverAssem$postVideo$1", f = "TakoVideoGenerationCoverAssem.kt", l = {407}, m = "invokeSuspend")
public final class C1856610yPj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TakoVideoGenerationCoverAssem LLILLL;
    public final /* synthetic */ InterfaceC1856590yPh LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;
    public final /* synthetic */ Message LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856610yPj(TakoVideoGenerationCoverAssem takoVideoGenerationCoverAssem, InterfaceC1856590yPh interfaceC1856590yPh, View view, String str, Map<String, String> map, Message message, String str2, InterfaceC1364105Vn<? super C1856610yPj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = takoVideoGenerationCoverAssem;
        this.LLILZ = interfaceC1856590yPh;
        this.LLILZIL = view;
        this.LLILZLL = str;
        this.LLIZ = map;
        this.LLIZLLLIL = message;
        this.LLJ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1856610yPj c1856610yPj = new C1856610yPj(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c1856610yPj.LLILLJJLI = obj;
        return c1856610yPj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        BaseVideo baseVideo;
        String strValueOf;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Map map;
        Object objLIZIZ = obj;
        C1C7U.LIZ("TakoVideoGenerationCoverAssem@7865.postVideo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                Map map2 = (Map) this.LLILLJJLI;
                C155000ia.LIZIZ(objLIZIZ);
                map = map2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            CoroutineContext coroutineContext = interfaceC497601wk.getCoroutineContext();
            C2297108zJ c2297108zJ = C09AE.LJJLJ;
            C09AE c09ae = (C09AE) coroutineContext.get(c2297108zJ);
            if (c09ae != null) {
                c09ae.LJII(new AwS606S0100000_27(this.LLILLL, 590));
            }
            C07QI.LIZ.getClass();
            if (C07QI.LIZ()) {
                ITakoChatPageAbility iTakoChatPageAbility = (ITakoChatPageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LLILLL), ITakoChatPageAbility.class, null);
                if (iTakoChatPageAbility != null) {
                    iTakoChatPageAbility.t4(true);
                }
                C09AE c09ae2 = (C09AE) interfaceC497601wk.getCoroutineContext().get(c2297108zJ);
                if (c09ae2 != null) {
                    c09ae2.LJII(new AwS606S0100000_27(this.LLILLL, 591));
                }
            }
            List<BaseVideo> videoList = this.LLILZ.getVideoList();
            if (videoList != null && (baseVideo = (BaseVideo) C13LP.LJJJLZIJ(0, videoList)) != null) {
                String str = baseVideo.videoUrl;
                if (str != null && str.length() != 0) {
                    String str2 = baseVideo.fileHash;
                    if (str2 == null || !C123100dR.LIZ(str2) || (strValueOf = baseVideo.fileHash) == null) {
                        strValueOf = String.valueOf(str.hashCode());
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    TakoVideoGenerationCoverAssem takoVideoGenerationCoverAssem = this.LLILLL;
                    Message message = this.LLIZLLLIL;
                    String str3 = this.LLJ;
                    ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(takoVideoGenerationCoverAssem), ITakoContextAbility.class, null);
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
                        linkedHashMap.put("sub_process_id", c1863850ybP.LLJILJILJ);
                        linkedHashMap.put("bot_id", String.valueOf(c1863850ybP.LLJJ));
                        linkedHashMap.put("message_id", message.uuid);
                        linkedHashMap.put("source", str3);
                        linkedHashMap.put("situation", "video_generation");
                    }
                    Context context = this.LLILZIL.getContext();
                    View view = this.LLILZIL;
                    this.LLILLJJLI = linkedHashMap;
                    this.LL = 1;
                    objLIZIZ = C12FM.LIZIZ(context, view, strValueOf, str, linkedHashMap, this);
                    map = linkedHashMap;
                    if (objLIZIZ == objLJFF) {
                        C1C7U.LIZIZ("TakoVideoGenerationCoverAssem@7865.postVideo$1");
                        return objLJFF;
                    }
                } else {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoVideoGenerationCoverAssem@7865.postVideo$1");
                    return unit;
                }
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TakoVideoGenerationCoverAssem@7865.postVideo$1");
                return unit2;
            }
        }
        Pair pair = (Pair) objLIZIZ;
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        String str7 = (String) pair.getSecond();
        if (zBooleanValue && C123100dR.LIZ(str7)) {
            C12FM.LIZ(this.LLILZIL.getContext(), str7, this.LLILZLL, this.LLIZ, C1855920yOc.LIZ(this.LLIZLLLIL));
        }
        C1862330yYx.LJLJL(C1862330yYx.LIZ, map);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TakoVideoGenerationCoverAssem@7865.postVideo$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

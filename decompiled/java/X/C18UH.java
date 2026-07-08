package X;

import Y.AfS201S0100000_32;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.tools.chat.message.api.AiChatMessageFeatureApi;
import java.util.Map;

/* JADX INFO: renamed from: X.18UH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18UH extends AbstractC2255721DQs<C18UM> implements C18UM, InterfaceC379610EuV {
    public static final C18UL LLIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public final C18UJ LLILLJJLI = (C18UJ) getDiContainer().LJII(C18UJ.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), C18VO.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), AiChatMessageFeatureApi.class, null);
    public final C11NJ LLILZIL = new C11NJ();
    public final InterfaceC497601wk LLILZLL = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    /* JADX WARN: Type inference failed for: r0v5, types: [X.18UL] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C18UH.class, "inputComponent", "getInputComponent()Lcom/ss/android/ugc/tools/chat/input/api/AiChatInputFeatureApi;", 0);
        C13LE.LIZ.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C18UH.class, "sendMessageComponent", "getSendMessageComponent()Lcom/ss/android/ugc/tools/chat/message/api/AiChatMessageFeatureApi;", 0)};
        LLIZ = new Object() { // from class: X.18UL
        };
        LLJ = 8;
    }

    public C18UM X1() {
        return this;
    }

    public final C18VO Z1() {
        return (C18VO) this.LLILLL.getValue(this, LLIZLLLIL[0]);
    }

    public final AiChatMessageFeatureApi o2() {
        return (AiChatMessageFeatureApi) this.LLILZ.getValue(this, LLIZLLLIL[1]);
    }

    private final void Xi() {
        this.LLILZIL.LIZ(Z1().r21().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS201S0100000_32(this, 1)));
    }

    private final void w2() {
        C09IC.LJJI(this.LLILZLL, new C861640Xr8(new C18UA(this, null), C21163117rp.LIZIZ().LJI()));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
        w2();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLILZIL.dispose();
        C2296808zG.LIZJ(this.LLILZLL, null);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C18UH(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void W1(Map<String, String> map, Map<String, Integer> map2) {
        if (C291270BbJ.LIZ() && map2 != null) {
            try {
                C1227904rF.LIZ.getClass();
                String strLJIILL = C1227904rF.LIZLLL().LJIILL(map2);
                if (strLJIILL != null) {
                    map.put("image_input_log", strLJIILL);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}

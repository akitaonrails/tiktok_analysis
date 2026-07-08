package X;

import Y.AObjectS249S0100000_32;
import androidx.lifecycle.LiveData;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS44S0010000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.194L, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C194L extends i<InterfaceC1415210mvn, C436390H9h, C436470H9p, C194N> implements InterfaceC379610EuV, InterfaceC1415210mvn {
    public static final C194M LLJJJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public static final int LLJJJJJIL;
    public final C360770ECl LLJILJILJ;
    public final C1DRG LLJILLL;
    public final Function0<C436470H9p> LLJJ;
    public final Function0<C194N> LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final Function0<C436390H9h> LLJJJ;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.194M] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C194L.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C194L.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new C2217381BqS(C194L.class, "recommendEffectApi", "getRecommendEffectApi()Lcom/ss/android/ugc/gamora/editor/recommendeffect/RecommendEffectApi;", 0)};
        LLJJJIL = new Object() { // from class: X.194M
        };
        LLJJJJJIL = 8;
    }

    private final InterfaceC1455860nzM F4() {
        return (InterfaceC1455860nzM) this.LLJJIJI.getValue(this, LLJJJJ[1]);
    }

    @Override // X.InterfaceC1415210mvn
    public boolean GF2() {
        Keva repo = Keva.getRepo("recommend_effect_guide_keva");
        return (repo.contains("recommend_effect_guide_count") && repo.getBoolean("recommend_effect_guide_count", false)) ? false : true;
    }

    public final InterfaceC1459560o5K H4() {
        return (InterfaceC1459560o5K) this.LLJJIJIIJIL.getValue(this, LLJJJJ[2]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJIII.getValue(this, LLJJJJ[0]);
    }

    @Override // X.InterfaceC1415210mvn
    public void kP0() {
        Keva.getRepo("recommend_effect_guide_keva").storeBoolean("recommend_effect_guide_count", true);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<C1456890o11> liveDataYh;
        super.onCreate();
        C360770ECl c360770ECl = this.LLJILJILJ;
        if (c360770ECl != null) {
            c360770ECl.setInterceptListener(new AwS611S0100000_32(this, 179));
        }
        InterfaceC1455860nzM interfaceC1455860nzMF4 = F4();
        if (interfaceC1455860nzMF4 == null || (liveDataYh = interfaceC1455860nzMF4.Yh()) == null) {
            return;
        }
        liveDataYh.observe(this, new AObjectS249S0100000_32(this, 16));
    }

    @Override // ge.i
    public Function0<C436390H9h> E3() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C436470H9p> o2() {
        return this.LLJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C194N> w2() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1415210mvn
    public void Bv2(boolean z) {
        if (this.LLJJIJIL) {
            i3(new AwS44S0010000_32(z, 19));
        }
    }

    public C194L(C19A3 c19a3, C360770ECl c360770ECl, C1DRG c1drg, Function0<C436470H9p> function0, Function0<C194N> function02) {
        super(c19a3);
        this.LLJILJILJ = c360770ECl;
        this.LLJILLL = c1drg;
        this.LLJJ = function0;
        this.LLJJI = function02;
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1459560o5K.class, null);
        this.LLJJIJIL = true;
        this.LLJJJ = new AwS576S0100000_32(this, 349);
    }
}

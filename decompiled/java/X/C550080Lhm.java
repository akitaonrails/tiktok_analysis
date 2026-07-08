package X;

import android.view.View;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitGeneratingModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import ge.i;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS23S0001000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Lhm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550080Lhm extends i<InterfaceC550180Lhw, C550690Lil, C550090Lhn, C550680Lik> implements InterfaceC550180Lhw, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C550080Lhm.class, "exitApi", "getExitApi()Lcom/ss/android/ugc/aweme/portrait/generate/component/AIPortraitLoadingExitApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C550080Lhm.class, "creativeModel", "getCreativeModel()Lcom/ss/android/ugc/aweme/creative/model/CreativeModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C550080Lhm.class, "loadingSlotHolder", "getLoadingSlotHolder()Lcom/ss/android/ugc/aweme/aiuikit/api/pages/loading/AIGCLoadingScene$AIGCLoadingSlotHolder;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C550080Lhm.class, "generationApi", "getGenerationApi()Lcom/ss/android/ugc/aweme/portrait/generate/component/AIPortraitGenerationLogicApi;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJJIJIL = 8;
    }

    public InterfaceC550180Lhw F4() {
        return this;
    }

    @Override // X.InterfaceC548530LfH
    public void oG0(Pair<Long, String> pair) {
    }

    public final CreativeModel H4() {
        return (CreativeModel) this.LLJJI.getValue(this, LLJJIJIIJIL[1]);
    }

    public final InterfaceC548670LfV K4() {
        return (InterfaceC548670LfV) this.LLJJ.getValue(this, LLJJIJIIJIL[0]);
    }

    public final InterfaceC550070Lhl O4() {
        return (InterfaceC550070Lhl) this.LLJJIJI.getValue(this, LLJJIJIIJIL[3]);
    }

    public final C549550Lgv P4() {
        return (C549550Lgv) this.LLJJIII.getValue(this, LLJJIJIIJIL[2]);
    }

    @Override // X.InterfaceC550180Lhw
    public void R82() {
        i3(AFwS239S0000000_8.get$arr$(52));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C550090Lhn> o2() {
        return new AwS552S0100000_8(this, 152);
    }

    @Override // X.InterfaceC550180Lhw
    public void rR0() {
        i3(AFwS239S0000000_8.get$arr$(53));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C550680Lik> w2() {
        return new AwS552S0100000_8(this, 153);
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        AIPortraitModel aIPortraitModel;
        AIPortraitContextModel aIPortraitContextModel;
        AIPortraitGeneratingModel aIPortraitGeneratingModel;
        Integer num;
        super.onCreate();
        CreativeModel creativeModelH4 = H4();
        if (creativeModelH4 == null || (aIPortraitModel = creativeModelH4.aigcBusinessModel.aiPortraitModel) == null || (aIPortraitContextModel = aIPortraitModel.contextModel) == null || (aIPortraitGeneratingModel = aIPortraitContextModel.generatingModel) == null || (num = aIPortraitGeneratingModel.progress) == null) {
            return;
        }
        j3(num.intValue());
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        F4();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC550180Lhw
    public void db2(EnumC550140Lhs enumC550140Lhs) {
        i3(new AwS587S0100000_8(enumC550140Lhs, 82));
    }

    @Override // X.InterfaceC548530LfH
    public void j3(int i) {
        View view;
        InterfaceC549570Lgx<InterfaceC548550LfJ> interfaceC549570LgxLIZ;
        C549550Lgv c549550LgvP4 = P4();
        if (c549550LgvP4 != null && (interfaceC549570LgxLIZ = c549550LgvP4.LIZ()) != null) {
            view = interfaceC549570LgxLIZ.getView();
        } else {
            view = null;
        }
        C337180DJs.LIZJ(view);
        i3(new AwS23S0001000_8(i, 1));
    }

    public C550080Lhm(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC548670LfV.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), CreativeModel.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), C549550Lgv.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC550070Lhl.class, null);
    }
}

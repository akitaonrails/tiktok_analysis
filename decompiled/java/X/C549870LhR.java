package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitInputInfo;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitModel;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LhR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C549870LhR extends i<InterfaceC549900LhU, C549920LhW, C549910LhV, C07U8> implements InterfaceC549900LhU, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C549800LhK LLJJ;
    public final InterfaceC1731706qJ LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C549870LhR.class, "creativeModel", "getCreativeModel()Lcom/ss/android/ugc/aweme/creative/model/CreativeModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJI = 8;
    }

    public InterfaceC549900LhU F4() {
        return this;
    }

    private final CreativeModel K4() {
        return (CreativeModel) this.LLJJI.getValue(this, LLJJIII[0]);
    }

    @Override // ge.i
    public Function0<C549920LhW> E3() {
        return AFwS194S0000000_8.get$arr$(104);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C549910LhV> o2() {
        return new AwS552S0100000_8(this, 150);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C07U8> w2() {
        return AFwS194S0000000_8.get$arr$(103);
    }

    public final String H4() {
        AIPortraitModel aIPortraitModel;
        AIPortraitContextModel aIPortraitContextModel;
        AIPortraitInputInfo aIPortraitInputInfo;
        CreativeModel creativeModelK4 = K4();
        if (creativeModelK4 == null || (aIPortraitModel = creativeModelK4.aigcBusinessModel.aiPortraitModel) == null || (aIPortraitContextModel = aIPortraitModel.contextModel) == null || (aIPortraitInputInfo = aIPortraitContextModel.inputInfo) == null) {
            return null;
        }
        return aIPortraitInputInfo.coverPath;
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

    public C549870LhR(C19A3 c19a3, C1DRG c1drg, C549800LhK c549800LhK) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c549800LhK;
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), CreativeModel.class, null);
    }
}

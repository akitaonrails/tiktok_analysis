package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ogc.news.anchor.INewsAnchorProducer;
import com.ss.android.ugc.aweme.ogc.news.sticker.IArticleStickerService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import com.ss.android.ugc.gamora.editor.sticker.article.ArticleStickerManagerComponent$stickerModifyMonitor$2$1;
import kotlin.jvm.internal.AwS31S1400000_29;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11pu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19622411pu extends AbstractC2255721DQs<InterfaceC19639511sf> implements InterfaceC379610EuV, InterfaceC19639511sf {
    public static final C19623011q0 LLJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final EnumC1466150oFx LLJIJIL;
    public final EnumC1778590wNt LL;
    public final C1DRG LLILLJJLI;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 644));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 643));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 645));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 646));
    public final C0NJD<String> LLIZLLLIL = new C0NJD<>(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [X.11q0] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19622411pu.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJ = new Object() { // from class: X.11q0
        };
        LLJIJIL = EnumC1466150oFx.ARTICLE;
    }

    public InterfaceC19639511sf W1() {
        return this;
    }

    private final C19622311pt o2() {
        return (C19622311pt) this.LLILZLL.getValue();
    }

    private final ArticleStickerManagerComponent$stickerModifyMonitor$2$1 w2() {
        return (ArticleStickerManagerComponent$stickerModifyMonitor$2$1) this.LLIZ.getValue();
    }

    public final C19622911pz X1() {
        return (C19622911pz) this.LLILZIL.getValue();
    }

    public final InterfaceC19622611pw Z1() {
        return (InterfaceC19622611pw) this.LLILZ.getValue();
    }

    public final VideoPublishEditModel bb2() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJI[0]);
    }

    @Override // X.InterfaceC19639511sf
    public String ck2() {
        String strLIZ = this.LLIZLLLIL.LIZ();
        if (strLIZ == null) {
            strLIZ = "";
        }
        this.LLIZLLLIL.LIZIZ(null);
        return strLIZ;
    }

    @Override // X.InterfaceC19639511sf
    public ArticleStickerModel LJLI() {
        return Z1().LJLI();
    }

    @Override // X.InterfaceC19639511sf
    public String getCreationId() {
        return bb2().getCreationId();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC19622611pw interfaceC19622611pwZ1 = Z1();
        interfaceC19622611pwZ1.Wk(o2());
        interfaceC19622611pwZ1.Wk(w2());
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC19622611pw interfaceC19622611pwZ1 = Z1();
        interfaceC19622611pwZ1.Vk(o2());
        interfaceC19622611pwZ1.Vk(w2());
        super.onDestroy();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC19639511sf
    public void Tk(ArticleStickerModel articleStickerModel) {
        Z1().Tk(articleStickerModel);
    }

    public C19622411pu(EnumC1778590wNt enumC1778590wNt, C1DRG c1drg) {
        this.LL = enumC1778590wNt;
        this.LLILLJJLI = c1drg;
    }

    public static final void G2(C19622411pu c19622411pu, String str) {
        IArticleStickerService.Companion.getClass();
        InterfaceC19622811py interfaceC19622811pyLIZ = C19603211mo.LIZ();
        if (interfaceC19622811pyLIZ != null) {
            interfaceC19622811pyLIZ.LIZ();
        }
        c19622411pu.Z1().Xk(str);
        C858300Xlk.LIZ(EnumC1462160o9W.ARTICLE, c19622411pu.bb2());
    }

    @Override // X.InterfaceC19639511sf
    public void jm0(Context context, String str) {
        CreateAnchorInfo createAnchorInfoLIZJ;
        INewsAnchorProducer.LIZ.getClass();
        INewsAnchorProducer iNewsAnchorProducerLIZ = C11WZ.LIZ();
        if (iNewsAnchorProducerLIZ != null && (createAnchorInfoLIZJ = C19512911Vv.LIZJ(bb2())) != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJI(context.getResources().getString(2131826653));
            c1397580mTM.LIZIZ(context.getResources().getString(2131826650));
            c1397580mTM.LJIIIIZZ = true;
            C1238130iKB.LIZ(c1397580mTM, new AwS31S1400000_29(context, this, iNewsAnchorProducerLIZ, createAnchorInfoLIZJ, str, 0));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        G2(this, str);
    }
}

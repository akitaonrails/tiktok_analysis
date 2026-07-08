package X;

import X.C05YF;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.1925, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AnonymousClass1925<API extends C05YF> extends C193N<API, C1178304jF, Unit> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final C109Y LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final Function1<Lifecycle.Event, Unit> LLJILJILJ;
    public final Function0<C1178304jF> LLJILLL;
    public final Unit LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1925.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AnonymousClass1925.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AnonymousClass1925.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(AnonymousClass1925.class, "visibilityPanel", "getVisibilityPanel()Lcom/ss/android/ugc/aweme/shortvideo/component/privacy/v2/IVisibilityOptionPanelComponentApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(AnonymousClass1925.class, "editPanel", "getEditPanel()Lcom/ss/android/ugc/aweme/shortvideo/component/privacy/v2/IEditPrivacySettingsPanelComponentApi;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJJIII = 8;
    }

    @Override // X.C193N, X.C193O
    public abstract InterfaceC1738600vLO E3();

    @Override // X.C193N
    public abstract C10J3 H4();

    @Override // X.C193N, X.C193O
    public void Q3() {
    }

    public abstract InterfaceC192004109q T4();

    private final InterfaceC1445380niS C5() {
        return (InterfaceC1445380niS) this.LLJIJIL.getValue(this, LLJJI[3]);
    }

    private final InterfaceC214731191t k5() {
        return (InterfaceC214731191t) this.LLJILJIL.getValue(this, LLJJI[4]);
    }

    private final AbstractC214814194y x5() {
        return (AbstractC214814194y) this.LLJI.getValue(this, LLJJI[2]);
    }

    @Override // X.C193N
    /* JADX INFO: renamed from: K4, reason: merged with bridge method [inline-methods] */
    public C104O F4() {
        return new C104O();
    }

    public void P4() {
        this.LLIZ.LLILZLL = T4();
        this.LLIZ.LLILZIL = new InterfaceC192003109p(this) { // from class: X.1926
            public final /* synthetic */ AnonymousClass1925<API> LIZ;

            {
                this.LIZ = this;
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC192003109p
            public final void LIZIZ(List<? extends AbstractC191840103i> list) {
                this.LIZ.i3(new AwS611S0100000_32(list, (List<AIPlaygroundChipsModel>) 149));
            }
        };
    }

    public final C19EG n5() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJJI[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        C109Y c109y = this.LLIZ;
        c109y.LLILZIL = null;
        c109y.LLILZLL = null;
        super.onDestroy();
    }

    public final VideoPublishEditModel t5() {
        return (VideoPublishEditModel) this.LLJ.getValue(this, LLJJI[1]);
    }

    private final void O4() {
        InterfaceC1445380niS interfaceC1445380niSC5 = C5();
        if (interfaceC1445380niSC5 != null) {
            interfaceC1445380niSC5.LLLLZLLLI(x5(), this.LLJILJILJ);
            return;
        }
        InterfaceC214731191t interfaceC214731191tK5 = k5();
        if (interfaceC214731191tK5 != null) {
            interfaceC214731191tK5.LLLLZLLLI(x5(), this.LLJILJILJ);
        }
    }

    @Override // X.C193O
    public void O3() {
        super.O3();
        P4();
        O4();
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJJ;
    }

    public Unit Z4() {
        return this.LLJJ;
    }

    public final Function1<Lifecycle.Event, Unit> d5() {
        return this.LLJILJILJ;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C1178304jF> o2() {
        return this.LLJILLL;
    }

    public final C109Y v5() {
        return this.LLIZ;
    }

    public AnonymousClass1925(C1DRG c1drg, C109Y c109y) {
        super(c1drg);
        this.LLIZ = c109y;
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1445380niS.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC214731191t.class, null);
        this.LLJILJILJ = new AwS611S0100000_32(this, 150);
        this.LLJILLL = AFwS223S0000000_32.get$arr$(95);
        this.LLJJ = Unit.LIZ;
    }
}

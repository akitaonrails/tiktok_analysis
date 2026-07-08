package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1927, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AnonymousClass1927 extends C193N<C05YF, C192J, Unit> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final int LLJJIJIIJIL;
    public final C109Y LLIZ;
    public final boolean LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final Function1<Lifecycle.Event, Unit> LLJJ;
    public final Function0<C192J> LLJJI;
    public final Unit LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1927.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AnonymousClass1927.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(AnonymousClass1927.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(AnonymousClass1927.class, "privacyPanel", "getPrivacyPanel()Lcom/ss/android/ugc/aweme/shortvideo/component/privacy/PrivacyMoreOptionApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(AnonymousClass1927.class, "moreOptionPanel", "getMoreOptionPanel()Lcom/ss/android/ugc/aweme/shortvideo/component/option/more/BaseMoreOptionsPanelComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(AnonymousClass1927.class, "editPanel", "getEditPanel()Lcom/ss/android/ugc/aweme/shortvideo/component/privacy/v2/IEditPrivacySettingsPanelComponentApi;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJJIJIIJIL = 8;
    }

    @Override // X.C193N, X.C193O
    public abstract InterfaceC1738600vLO E3();

    @Override // X.C193N, X.C193O
    public void Q3() {
    }

    public abstract InterfaceC192004109q T4();

    private final AbstractC214814194y D5() {
        return (AbstractC214814194y) this.LLJIJIL.getValue(this, LLJJIJI[2]);
    }

    private final InterfaceC214731191t k5() {
        return (InterfaceC214731191t) this.LLJILLL.getValue(this, LLJJIJI[5]);
    }

    private final AbstractC214786193w v5() {
        return (AbstractC214786193w) this.LLJILJILJ.getValue(this, LLJJIJI[4]);
    }

    private final InterfaceC214733191v x5() {
        return (InterfaceC214733191v) this.LLJILJIL.getValue(this, LLJJIJI[3]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.192S] */
    @Override // X.C193N
    /* JADX INFO: renamed from: K4, reason: merged with bridge method [inline-methods] */
    public C192S F4() {
        return new AnonymousClass1931<C192T, C192J, Unit>() { // from class: X.192S
            @Override // X.AnonymousClass1931
            public final void LJI(AbstractC1738640vLS abstractC1738640vLS) {
                Function0<Unit> function0 = ((C192T) abstractC1738640vLS).LLILLJJLI;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            @Override // X.AnonymousClass1931
            public final AbstractC1738640vLS LJ(Context context, ViewGroup viewGroup) {
                return new C192T(C344790DfR.LIZ(context));
            }

            @Override // X.AnonymousClass1931
            public final void LIZLLL(AbstractC1738640vLS abstractC1738640vLS, C193X c193x, C1664690tQB c1664690tQB, Object obj) {
                C192T c192t = (C192T) abstractC1738640vLS;
                C786410Ut5.LLZLL(c192t.LL, 0);
                AwS433S0200000_32 awS433S0200000_32 = new AwS433S0200000_32(c192t, c193x, 21);
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192K
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((C192J) obj2).LJIIL);
                    }
                }), c192t, Lifecycle.State.STARTED, new AwS611S0100000_32(c192t, 146));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.10Ju
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((C192J) obj2).LJ);
                    }
                }), c192t, Lifecycle.State.STARTED, new AwS611S0100000_32(c192t, 148));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192L
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C192J) obj2).LIZ;
                    }
                }), c192t, Lifecycle.State.STARTED, new AwS611S0100000_32(c192t, 151));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192O
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C192J) obj2).LIZIZ;
                    }
                }), c192t, Lifecycle.State.STARTED, new AwS611S0100000_32(c192t, 153));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192P
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C192J) obj2).LIZJ;
                    }
                }), c192t, Lifecycle.State.STARTED, new AwS611S0100000_32(c192t, 133));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192B
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return Boolean.valueOf(((C192J) obj2).LIZLLL);
                    }
                }), c192t, Lifecycle.State.STARTED, new AwS611S0100000_32(c192t, 134));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192M
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C192J) obj2).LJIIJ;
                    }
                }), c192t, Lifecycle.State.STARTED, new AwS611S0100000_32(c192t, 139));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192N
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C192J) obj2).LJIIIIZZ;
                    }
                }), c192t, Lifecycle.State.STARTED, new AwS398S0200000_32(c192t, awS433S0200000_32, 23));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192Q
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C192J) obj2).LJIIIZ;
                    }
                }), c192t, Lifecycle.State.STARTED, new AwS398S0200000_32(c192t, awS433S0200000_32, 24));
                LIZ(c1664690tQB.LIZ(new C2217381BqS() { // from class: X.192R
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj2) {
                        return ((C192J) obj2).LJIIJJI;
                    }
                }), c192t, Lifecycle.State.STARTED, new AwS611S0100000_32(c192t, 145));
            }
        };
    }

    public void P4() {
        this.LLIZ.LLILZLL = T4();
        this.LLIZ.LLILZIL = new InterfaceC192003109p() { // from class: X.1928
            @Override // X.InterfaceC192003109p
            public final void LIZIZ(List<? extends AbstractC191840103i> list) {
                AnonymousClass1927 anonymousClass1927 = this.LIZ;
                anonymousClass1927.i3(new AwS398S0200000_32((List) list, (List<? extends AbstractC191840103i>) anonymousClass1927, (AnonymousClass1927) 25));
            }
        };
    }

    public final C19EG n5() {
        return (C19EG) this.LLJ.getValue(this, LLJJIJI[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        C109Y c109y = this.LLIZ;
        c109y.LLILZIL = null;
        c109y.LLILZLL = null;
        if (Intrinsics.LJFF(H4(), AnonymousClass1938.LIZ)) {
            this.LLIZ.LJIIIIZZ();
        }
        super.onDestroy();
    }

    public final VideoPublishEditModel t5() {
        return (VideoPublishEditModel) this.LLJI.getValue(this, LLJJIJI[1]);
    }

    private final void O4() {
        InterfaceC214733191v interfaceC214733191vX5 = x5();
        if (interfaceC214733191vX5 != null) {
            interfaceC214733191vX5.LLLLZLLLI(D5(), this.LLJJ);
            return;
        }
        AbstractC214786193w abstractC214786193wV5 = v5();
        if (abstractC214786193wV5 != null) {
            abstractC214786193wV5.LLLLZLLLI(D5(), this.LLJJ);
            return;
        }
        InterfaceC214731191t interfaceC214731191tK5 = k5();
        if (interfaceC214731191tK5 != null) {
            interfaceC214731191tK5.LLLLZLLLI(D5(), this.LLJJ);
        }
    }

    @Override // X.C193N
    public C10J3 H4() {
        return (C1428470nHB.LJJZZI(t5()) && C19224110It.LIZ()) ? AnonymousClass1938.LIZ : C193C.LIZ;
    }

    @Override // X.C193O
    public void O3() {
        super.O3();
        P4();
        if (Intrinsics.LJFF(H4(), AnonymousClass1938.LIZ)) {
            this.LLIZ.LJII();
        } else {
            O4();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (Intrinsics.LJFF(H4(), AnonymousClass1938.LIZ)) {
            this.LLIZ.getClass();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        if (Intrinsics.LJFF(H4(), AnonymousClass1938.LIZ)) {
            this.LLIZ.getClass();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        if (Intrinsics.LJFF(H4(), AnonymousClass1938.LIZ)) {
            this.LLIZ.getClass();
        }
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJJIII;
    }

    public final C109Y C5() {
        return this.LLIZ;
    }

    public final boolean E5() {
        return this.LLIZLLLIL;
    }

    public Unit Z4() {
        return this.LLJJIII;
    }

    public final Function1<Lifecycle.Event, Unit> d5() {
        return this.LLJJ;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C192J> o2() {
        return this.LLJJI;
    }

    public AnonymousClass1927(C1DRG c1drg, C109Y c109y, boolean z) {
        super(c1drg);
        this.LLIZ = c109y;
        this.LLIZLLLIL = z;
        this.LLJ = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
        this.LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC214733191v.class, null);
        this.LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), AbstractC214786193w.class, null);
        this.LLJILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC214731191t.class, null);
        this.LLJJ = new AwS611S0100000_32(this, 152);
        this.LLJJI = AFwS223S0000000_32.get$arr$(96);
        this.LLJJIII = Unit.LIZ;
    }
}

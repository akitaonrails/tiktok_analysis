package X;

import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.TimeEffectTabFragment;
import com.ss.android.ugc.aweme.ftc.components.effect.FTCEditEffectState;
import com.ss.android.ugc.aweme.ftc.components.effect.FTCEditEffectViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.11fM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19557011fM extends AbstractC1643610ssB<FTCEditEffectViewModel> implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final C1DRG LLIZ;
    public final C19A3 LLIZLLLIL;
    public final C1664750tQH LLJI;
    public C19557711fT LLJILJILJ;
    public final int LLJ = R.id.mhi;
    public final C01GW LLJIJIL = C1449630npJ.LIZ(this, InterfaceC1455860nzM.class);
    public final AFwS218S0000000_29 LLJILJIL = AFwS218S0000000_29.get$arr$(12);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19557011fM.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1643600ssA
    public final void Z1() {
        C19557711fT c19557711fT = this.LLJILJILJ;
        if (c19557711fT != null) {
            c19557711fT.LLLII().LJJJJI.zQ2().setValue(Boolean.FALSE);
        }
    }

    @Override // X.AbstractC1643600ssA
    public final void o2() {
        if (this.LLJILJILJ == null) {
            C19557711fT c19557711fT = new C19557711fT();
            C1455880nzO c1455880nzO = new C1455880nzO(this);
            C19557811fU c19557811fULLLII = c19557711fT.LLLII();
            c19557811fULLLII.LJJJJIZL = c1455880nzO;
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) C1659630tI1.LJFF(c1455880nzO.LJI()).get(EditEffectVideoModel.class);
            c19557811fULLLII.LJJJJI = editEffectVideoModel;
            editEffectVideoModel.LLIZ = c19557811fULLLII.LJJJJIZL;
            this.LLIZLLLIL.add(this.LLJ, c19557711fT, "FTCEditEffectScene");
            this.LLJILJILJ = c19557711fT;
        }
        C19557711fT c19557711fT2 = this.LLJILJILJ;
        if (c19557711fT2 != null) {
            C19557811fU c19557811fULLLII2 = c19557711fT2.LLLII();
            c19557811fULLLII2.LJJJJI.zQ2().setValue(Boolean.TRUE);
            if (c19557811fULLLII2.LIZ.isMultiVideoEdit() && (c19557811fULLLII2.LJJIJ.LLJIJIL instanceof TimeEffectTabFragment)) {
                c19557811fULLLII2.LIZIZ.prepare().LJ(new C19774512Yl(c19557811fULLLII2, 0), C15O7.LJIIIIZZ, null);
            }
        }
    }

    @Override // X.AbstractC1643600ssA, X.AbstractC2255721DQs
    public final void onCreate() {
        super.onCreate();
        C11EA.LJII(this, X1(), new C2217381BqS() { // from class: X.11fN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((FTCEditEffectState) obj).getRemoveTimeEffect();
            }
        }, new AwS643S0100000_29(this, 1));
    }

    @Override // X.AbstractC1643600ssA
    public final Function0<FTCEditEffectViewModel> W1() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1643600ssA
    public final C19A3 getParentScene() {
        return this.LLIZLLLIL;
    }

    public C19557011fM(C1DRG c1drg, C19A3 c19a3) {
        this.LLIZ = c1drg;
        this.LLIZLLLIL = c19a3;
        this.LLJI = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }
}

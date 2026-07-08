package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import uxk.a;

/* JADX INFO: renamed from: X.10Ix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19224510Ix extends C193N<InterfaceC855260Xgq, C190Z, C19224710Iz> implements InterfaceC855260Xgq {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public static final int LLJJ;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public boolean LLJ;
    public final Function0<C190Z> LLJI;
    public final C19224710Iz LLJIJIL;
    public final InterfaceC1738600vLO LLJILJIL;
    public final C10J3 LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19224510Ix.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19224510Ix.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJ = 8;
    }

    public final C19EG O4() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJILLL[1]);
    }

    public final VideoPublishEditModel P4() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJILLL[0]);
    }

    @Override // X.InterfaceC855260Xgq
    public void O1() {
        int i = P4().creativeModel.privacySettingModel.aigcInfo.AIGCLabelType;
        if (i == 1) {
            i3(AFwS271S0000000_28.get$arr$(215));
        } else if (i != 2) {
            i3(AFwS271S0000000_28.get$arr$(216));
        } else {
            i3(AFwS271S0000000_28.get$arr$(214));
        }
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        boolean z = false;
        if (!T2().LJII) {
            a.LIZ.getClass();
            if (!a.LJIIIIZZ.getBoolean(a.LJ(a.LJFF), false)) {
                z = true;
            }
        }
        this.LLJ = z;
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJIJIL;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJILJIL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJILJILJ;
    }

    public C19224710Iz K4() {
        return this.LLJIJIL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLJI;
    }

    public C19224510Ix(C1DRG c1drg, C10J3 c10j3) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJI = new AwS429S0200000_28(this, c10j3, 57);
        this.LLJIJIL = new C19224710Iz(new AwS572S0100000_28(this, 537), new AwS572S0100000_28(this, 538), new C19332510kF(this, 4), new AwS607S0100000_28(this, 140));
        this.LLJILJIL = EnumC214771193h.AIGC;
        this.LLJILJILJ = c10j3;
    }
}

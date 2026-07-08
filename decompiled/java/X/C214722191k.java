package X;

import com.bytedance.als.ui.state.LiveState;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.191k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214722191k extends C193N<InterfaceC856280XiU, C190Z, C19224710Iz> implements InterfaceC856280XiU {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final InterfaceC1731706qJ LLIZ;
    public final Function0<C190Z> LLIZLLLIL;
    public final C19224710Iz LLJ;
    public final InterfaceC1738600vLO LLJI;
    public final C10J3 LLJIJIL;
    public final LiveState<Boolean> LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C214722191k.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILLL = 8;
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
    }

    public final VideoPublishEditModel O4() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJILJILJ[0]);
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJ;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJI;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJIJIL;
    }

    public C19224710Iz K4() {
        return this.LLJ;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC856280XiU
    public LiveState<Boolean> x80() {
        return this.LLJILJIL;
    }

    public C214722191k(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = new AwS576S0100000_32(this, 273);
        this.LLJ = new C19224710Iz(null, null, new C19LY(this, 1), null, 11);
        this.LLJI = EnumC214771193h.HD_UPLOAD;
        this.LLJIJIL = AnonymousClass1937.LIZ;
        this.LLJILJIL = H2(new C2217381BqS() { // from class: X.191l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C190Z) obj).LJII);
            }
        });
    }

    public final void P4(boolean z) {
        String str;
        C0LAB c0labLIZ = C856120XiE.LIZ(O4());
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c0labLIZ.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        C20684815ws.LJIILLIIL("click_high_quality_upload_control", c0labLIZ.LIZ);
    }
}

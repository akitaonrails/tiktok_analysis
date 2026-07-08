package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.191i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214720191i extends C193N<C05YF, C190Z, C19224710Iz> {
    public static final C214721191j LLJJIII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final int LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public boolean LLJ;
    public InterfaceC420801kM LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public final Function0<C190Z> LLJILJILJ;
    public final C19224710Iz LLJILLL;
    public final InterfaceC1738600vLO LLJJ;
    public final C10J3 LLJJI;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.191j] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C214720191i.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C214720191i.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0)};
        LLJJIII = new Object() { // from class: X.191j
        };
        LLJJIJIIJIL = 8;
    }

    public final C19EG O4() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJJIJI[1]);
    }

    public final VideoPublishEditModel P4() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJJIJI[0]);
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("BulletinBoardAutoShareOptionComponent", "onOptionCreate");
    }

    @Override // X.C193O
    public void O3() {
        super.O3();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("BulletinBoardAutoShareOptionComponent", "onComponentCreate");
        this.LLJI = C1239300iM4.LJ(C214824195i.LIZIZ.LJIIJJI(), C1239300iM4.LIZIZ, C1239300iM4.LIZJ, new AwS611S0100000_32(this, 126));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("BulletinBoardAutoShareOptionComponent", "onDestroy");
        InterfaceC420801kM interfaceC420801kM = this.LLJI;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        if (this.LLJ) {
            P4().creativeModel.transientPostPageModel.LJJJZ = false;
            i3(AFwS278S0000000_32.get$arr$(84));
        }
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJILLL;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJJ;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJJI;
    }

    public C19224710Iz K4() {
        return this.LLJILLL;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLJILJILJ;
    }

    public C214720191i(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJILJILJ = new AwS576S0100000_32(this, 293);
        this.LLJILLL = new C19224710Iz(new AwS576S0100000_32(this, 292), null, new C19LY(this, 3), new AwS611S0100000_32(this, 125), 2);
        this.LLJJ = EnumC214771193h.BULLETIN_BOARD_AUTO_SHARE;
        this.LLJJI = AnonymousClass1937.LIZ;
    }

    public final boolean T4(VideoPublishEditModel videoPublishEditModel) {
        if (!C214824195i.LIZIZ.isPrivateAccount() && !videoPublishEditModel.creativeModel.privacySettingModel.isSubscribeOnly && videoPublishEditModel.isPrivate() == 0) {
            return false;
        }
        return true;
    }
}

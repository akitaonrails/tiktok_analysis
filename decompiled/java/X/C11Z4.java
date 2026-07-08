package X;

import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS378S0200000_12;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11Z4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11Z4 extends i<InterfaceC1451640nsY, C194425114t, C11Z2, C194427114v> implements InterfaceC1451640nsY, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final Function0<C11Z2> LLJJIII;
    public final Function0<C194427114v> LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C11Z4.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C11Z4.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/aweme/comment/image/bottombar/CommentImageEditBottomBarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C11Z4.class, "model", "getModel()Lcom/ss/android/ugc/aweme/comment/image/model/ImageEditModel;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJJIJIL = 8;
    }

    private final InterfaceC1451690nsd K4() {
        return (InterfaceC1451690nsd) this.LLJJ.getValue(this, LLJJIJIIJIL[1]);
    }

    private final C1450600nqs O4() {
        return (C1450600nqs) this.LLJJI.getValue(this, LLJJIJIIJIL[2]);
    }

    public final C19EG getActivity() {
        return (C19EG) this.LLJILLL.getValue(this, LLJJIJIIJIL[0]);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        i3(AFwS273S0000000_29.get$arr$(31));
    }

    public final void F4() {
        if (K4().dl1()) {
            C1347740lAy.LJ(getActivity(), new AwS573S0100000_29(this, 77), AFwS218S0000000_29.get$arr$(47));
            return;
        }
        C1451970nt5.LIZ.getClass();
        C1451970nt5.LIZIZ("back_button", "exit_discarded", false);
        getActivity().finish();
    }

    public final void H4() {
        if (!K4().dl1()) {
            C1451970nt5.LIZ.getClass();
            C1451970nt5.LIZIZ("delete_button", "exit_deleted", false);
            C19EG activity = getActivity();
            if (activity != null) {
                C2204961BRm.LLJJJ(activity, 103, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaK77FbTRyw+SqnG2X33fUHAuQHsLJiJ8a77NQ9FTDq3hVlEorcldUutKcQFQ=", null));
            }
            getActivity().finish();
            return;
        }
        C19EG activity2 = getActivity();
        AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(this, 78);
        AFwS218S0000000_29 aFwS218S0000000_29 = AFwS218S0000000_29.get$arr$(49);
        if (activity2 != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(activity2);
            c1397580mTM.LJI(activity2.getResources().getString(2131833296));
            c1397580mTM.LIZIZ(activity2.getResources().getString(2131833294));
            C985403tE.LIZ(c1397580mTM, new AwS378S0200000_12(activity2, awS573S0100000_29, 123));
            c1397580mTM.LIZLLL(new AwS608S0100000_29(aFwS218S0000000_29, 889));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        i3(AFwS273S0000000_29.get$arr$(32));
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C11Z2> o2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C194427114v> w2() {
        return this.LLJJIJI;
    }

    public C11Z4(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451690nsd.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), C1450600nqs.class, null);
        this.LLJJIII = AFwS218S0000000_29.get$arr$(48);
        this.LLJJIJI = new AwS573S0100000_29(this, 79);
    }
}

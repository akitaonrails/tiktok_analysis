package X;

import Y.AObserverS209S0100000_5;
import android.view.View;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.nle.editor_jni.NLEAudioFadeType;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS113S0101000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0EFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C361590EFp extends i<InterfaceC362640EJq, C361480EFe, C361520EFi, C361540EFk> implements InterfaceC362640EJq, InterfaceC379610EuV {
    public static final C361660EFw LLJJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final C01GW LLJJI;
    public final C361640EFu LLJJIII;
    public final Function0<C361520EFi> LLJJIJI;
    public final Function0<C361540EFk> LLJJIJIIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0EFw] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C361590EFp.class, "contextData", "getContextData()Lcom/ss/android/ugc/gamora/editorpro/capabilities/audio/fade/ui/AudioFadePanelContext;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJIL = new Object() { // from class: X.0EFw
        };
        LLJJJIL = 8;
    }

    private final C0E48 H4() {
        return (C0E48) this.LLJJI.getValue();
    }

    public final C0ECF F4() {
        return (C0ECF) this.LLJJ.getValue(this, LLJJJ[0]);
    }

    @Override // X.InterfaceC362640EJq
    public void LJLJI() {
        C0E48 c0e48;
        i3(AFwS234S0000000_5.get$arr$(175));
        VideoPublishEditModel videoPublishEditModelLJIIIIZZ = F4().LJIIIIZZ();
        if (videoPublishEditModelLJIIIIZZ == null || (c0e48 = F4().LLILLJJLI) == null) {
            return;
        }
        String strLIZIZ = C0ECD.LIZIZ(c0e48);
        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJIIIIZZ, c0e48, new Pair(-1, -1));
        c0labLJFF.LJ("is_editor_pro", "1");
        c0labLJFF.LJ("audio_type", strLIZIZ);
        C20684815ws.LJIILLIIL("fade_panel_show", c0labLJFF.LIZ);
    }

    public final void k5() {
        C362630EJp c362630EJp;
        View view;
        C19A3 c19a3 = this.LLJILJILJ;
        if (!(c19a3 instanceof C362630EJp) || (c362630EJp = (C362630EJp) c19a3) == null) {
            return;
        }
        View view2 = c362630EJp.mView;
        if (view2 != null && !view2.isLaidOut() && (view = c362630EJp.mView) != null) {
            C786410Ut5.T4(view, 0.0f);
        }
        View view3 = c362630EJp.mView;
        if (view3 != null) {
            if (!view3.isLaidOut() || view3.isLayoutRequested()) {
                view3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC391530FWt(c362630EJp, 1));
                return;
            }
            c362630EJp.LLLLLILLIL();
            C214799194j c214799194j = c362630EJp.LLJJ;
            if (c214799194j != null) {
                c214799194j.LLLLIL();
            }
        }
    }

    private final void n5() {
        C0E48 c0e48H4 = H4();
        if (c0e48H4 != null) {
            c0e48H4.Bo().LIZLLL(this.LLJJIII);
        }
        LiveData liveData = (LiveData) F4().LLJJIJIIJIL.getValue();
        if (liveData != null) {
            liveData.observe(this, new AObserverS209S0100000_5(this, 41));
        }
    }

    private final void x5() {
        C0E55 player;
        C0E48 c0e48H4 = H4();
        if (c0e48H4 != null && (player = c0e48H4.getPlayer()) != null) {
            player.pause(false);
        }
        C0E48 c0e48H42 = H4();
        if (c0e48H42 != null) {
            c0e48H42.Bo().LIZJ(this.LLJJIII);
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        n5();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        x5();
    }

    @Override // X.InterfaceC362640EJq
    public void LJZI() {
        k5();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C361520EFi> o2() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C361540EFk> w2() {
        return this.LLJJIJIIJIL;
    }

    public final void P4(int i) {
        O4(i, EnumC361610EFr.IN);
    }

    public final void T4(int i) {
        K4(i, EnumC361610EFr.IN);
    }

    public final void Z4(int i) {
        O4(i, EnumC361610EFr.OUT);
    }

    public final void d5(int i) {
        K4(i, EnumC361610EFr.OUT);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0EFu] */
    public C361590EFp(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), C0ECF.class, null);
        this.LLJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 395));
        this.LLJJIII = new C361650EFv() { // from class: X.0EFu
            @Override // X.C361650EFv, X.InterfaceC357170DzP
            public final void LIZJ(EnumC357140DzM enumC357140DzM) {
            }

            @Override // X.InterfaceC357170DzP
            public final void LIZIZ(EnumC357140DzM enumC357140DzM, boolean z) {
                if (z) {
                    this.LIZ.i3(AFwS234S0000000_5.get$arr$(176));
                }
            }
        };
        this.LLJJIJI = new AwS549S0100000_5(this, 394);
        this.LLJJIJIIJIL = new AwS549S0100000_5(this, 396);
    }

    private final void K4(int i, EnumC361610EFr enumC361610EFr) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C368000Ebm c368000Ebm;
        C368630Ecn subTrackGroupFromXml;
        C0E48 c0e48 = F4().LLILLJJLI;
        if (c0e48 != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
            t5(C419990GdR.LIZJ(i, 0L, nLETrackSlotLLLLLLIL.getDuration() / ((long) 2)), enumC361610EFr, EnumC356070Dxd.NONE, false);
            C0E5S c0e5sLJIIIZ = F4().LJIIIZ();
            View viewXg = null;
            if (c0e5sLJIIIZ != null) {
                viewXg = c0e5sLJIIIZ.xg();
            }
            if ((viewXg instanceof C368000Ebm) && (c368000Ebm = (C368000Ebm) viewXg) != null && (subTrackGroupFromXml = c368000Ebm.getSubTrackGroupFromXml()) != null) {
                subTrackGroupFromXml.invalidate();
            }
        }
    }

    private final void O4(int i, EnumC361610EFr enumC361610EFr) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48 = F4().LLILLJJLI;
        if (c0e48 != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
            long jLIZJ = C419990GdR.LIZJ(i, 0L, nLETrackSlotLLLLLLIL.getDuration() / ((long) 2));
            int i2 = (int) (jLIZJ / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            i3(new AwS113S0101000_5(i2, enumC361610EFr, 3));
            t5(jLIZJ, enumC361610EFr, EnumC356070Dxd.DONE, true);
            if (T2().LIZIZ <= 0 && T2().LIZJ <= 0) {
                nLETrackSlotLLLLLLIL.setExtra("is_ep_fade", CardStruct.IStatusCode.DEFAULT);
            } else {
                nLETrackSlotLLLLLLIL.setExtra("is_ep_fade", "1");
            }
            int i3 = C361600EFq.LIZ[enumC361610EFr.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    i41("slide", null, Integer.valueOf(i2));
                    return;
                }
                throw new C1954807lC();
            }
            i41("slide", Integer.valueOf(i2), null);
        }
    }

    @Override // X.InterfaceC362640EJq
    public void i41(String str, Integer num, Integer num2) {
        C0E48 c0e48;
        String string;
        String string2;
        VideoPublishEditModel videoPublishEditModelLJIIIIZZ = F4().LJIIIIZZ();
        if (videoPublishEditModelLJIIIIZZ != null && (c0e48 = F4().LLILLJJLI) != null) {
            String strLIZIZ = C0ECD.LIZIZ(c0e48);
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelLJIIIIZZ, c0e48, new Pair(-1, -1));
            c0labLJFF.LJ("is_editor_pro", "1");
            c0labLJFF.LJ("audio_type", strLIZIZ);
            c0labLJFF.LJ("option", str);
            String str2 = "";
            if (num == null || (string = num.toString()) == null) {
                string = "";
            }
            c0labLJFF.LJ("fade_in_value", string);
            if (num2 != null && (string2 = num2.toString()) != null) {
                str2 = string2;
            }
            c0labLJFF.LJ("fade_out_value", str2);
            C20684815ws.LJIILLIIL("fade_panel_click", c0labLJFF.LIZ);
        }
    }

    private final void t5(long j, EnumC361610EFr enumC361610EFr, EnumC356070Dxd enumC356070Dxd, boolean z) {
        C0E48 c0e48H4;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        Long lValueOf;
        C0E48 c0e48 = F4().LLILLJJLI;
        Long lValueOf2 = null;
        if (c0e48 != null && c0e48.LLLLLLIL() != null && (c0e48H4 = H4()) != null && (interfaceC351350Dq1LLFII = c0e48H4.LLFII()) != null) {
            if (Boolean.valueOf(enumC361610EFr.isFadeIn()).booleanValue()) {
                lValueOf = Long.valueOf(j);
            } else {
                lValueOf = null;
            }
            if (Boolean.valueOf(!enumC361610EFr.isFadeIn()).booleanValue()) {
                lValueOf2 = Long.valueOf(j);
            }
            interfaceC351350Dq1LLFII.LJIIZILJ(new C350350DoP(lValueOf, lValueOf2, NLEAudioFadeType.Sine), null, enumC356070Dxd, C0E1V.FADE.getNameId());
            if (z) {
                int i = C361600EFq.LIZ[enumC361610EFr.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (lValueOf2 != null) {
                            interfaceC351350Dq1LLFII.LJLJJL(lValueOf2.longValue());
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                if (lValueOf == null) {
                    return;
                }
                interfaceC351350Dq1LLFII.LJJIL(lValueOf.longValue());
            }
        }
    }
}

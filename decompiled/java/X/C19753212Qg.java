package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VEEditor;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19753212Qg extends i<C12PO, C12QX, C12RH, C19754312Qr> implements C12PO, InterfaceC379610EuV, C12PX {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final int LLJJL;
    public final C1DRG LLJILJILJ;
    public final InterfaceC1731706qJ LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public C19755412Rc LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public C12QX LLJJJJ;
    public final Function0<C12QX> LLJJJJJIL;

    @Override // X.C12PO
    public void LLILLJJLI() {
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19753212Qg.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19753212Qg.class, "aeRecordApiComponent", "getAeRecordApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/record/AERecordApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19753212Qg.class, "aePreviewApiComponent", "getAePreviewApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/preview/AEPreviewApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19753212Qg.class, "aeVolumeApiComponent", "getAeVolumeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/volume/AEVolumeApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19753212Qg.class, "audioEditingApiComponent", "getAudioEditingApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/AudioEditingApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C19753212Qg.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C19753212Qg.class, "voApiComponent", "getVoApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VOApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(C19753212Qg.class, "voiceChangeApiComponent", "getVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8};
        LLJJL = 8;
    }

    private final void C5() {
        C12QX c12qx = this.LLJJJJ;
        if (c12qx == null) {
            c12qx = null;
        }
        int iLLLZ = c12qx.LLLZ();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", LJJJLIIL().getCreationId());
        c0lab.LJ("shoot_way", LJJJLIIL().mShootWay);
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(LJJJLIIL()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(LJJJLIIL()));
        c0lab.LIZ(iLLLZ != 1 ? 0 : 1, "is_voice_effect");
        C20684815ws.LJIILLIIL("click_add_record", c0lab.LIZ);
    }

    private final void D5() {
        C12QX c12qx = this.LLJJJJ;
        if (c12qx == null) {
            c12qx = null;
        }
        int iLLLZ = c12qx.LLLZ();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", LJJJLIIL().getCreationId());
        c0lab.LJ("shoot_way", LJJJLIIL().mShootWay);
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(LJJJLIIL()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(LJJJLIIL()));
        c0lab.LIZ(iLLLZ != 1 ? 0 : 1, "is_voice_effect");
        C20684815ws.LJIILLIIL("enter_record_panel", c0lab.LIZ);
    }

    private final C12RU Z4() {
        return (C12RU) this.LLJJI.getValue(this, LLJJJJLIIL[2]);
    }

    private final C12PK d5() {
        return (C12PK) this.LLJJ.getValue(this, LLJJJJLIIL[1]);
    }

    private final InterfaceC19753012Qe x5() {
        return (InterfaceC19753012Qe) this.LLJJJIL.getValue(this, LLJJJJLIIL[7]);
    }

    @Override // X.C12PO
    public void D72() {
        i3(AFwS273S0000000_29.get$arr$(129));
    }

    public final void K4() {
        Effect effect;
        C12QX c12qx = this.LLJJJJ;
        if (c12qx == null) {
            c12qx = null;
        }
        C1664150tPJ c1664150tPJ = c12qx.LLLLIIIILLL;
        if (c1664150tPJ == null || (effect = c1664150tPJ.LIZ) == null) {
            return;
        }
        c12qx.c();
        C19546111db.LIZ.getClass();
        if (C19546111db.LJIIJJI(effect)) {
            c12qx.LLLZI().bl2();
        } else {
            c12qx.LLLLLLJ();
        }
    }

    @Override // X.C12PO
    public boolean LJJIZ() {
        C12QX c12qx = this.LLJJJJ;
        if (c12qx == null) {
            c12qx = null;
        }
        return c12qx.LLLLLZ().LJJIZ();
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJJIJIIJIL.getValue(this, LLJJJJLIIL[5]);
    }

    @Override // X.C12PO
    public boolean Pb2() {
        C12QX c12qx = this.LLJJJJ;
        if (c12qx == null) {
            c12qx = null;
        }
        return c12qx.LLLLLZ().LIZIZ() != -1;
    }

    public final C12PP k5() {
        return (C12PP) this.LLJJIII.getValue(this, LLJJJJLIIL[3]);
    }

    public final InterfaceC19753512Qj n5() {
        return (InterfaceC19753512Qj) this.LLJJIJI.getValue(this, LLJJJJLIIL[4]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C12RH> o2() {
        return AFwS218S0000000_29.get$arr$(173);
    }

    public final InterfaceC1455860nzM t5() {
        return (InterfaceC1455860nzM) this.LLJILLL.getValue(this, LLJJJJLIIL[0]);
    }

    public final C12SF v5() {
        return (C12SF) this.LLJJIJIL.getValue(this, LLJJJJLIIL[6]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19754312Qr> w2() {
        return new AwS573S0100000_29(this, 262);
    }

    @Override // X.C12PO
    public void AL2() {
        Effect effect;
        AbstractC1452680nuE abstractC1452680nuEGc;
        InterfaceC1452170ntP interfaceC1452170ntPLJIJ;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        NLEModel model;
        if (Pb2()) {
            C12QX c12qx = this.LLJJJJ;
            if (c12qx == null) {
                c12qx = null;
            }
            C1664150tPJ c1664150tPJLJIIJJI = c12qx.LLLLLZ().LJIIJJI();
            if (c1664150tPJLJIIJJI == null || (effect = c1664150tPJLJIIJJI.LIZ) == null || (abstractC1452680nuEGc = t5().gc()) == null || (interfaceC1452170ntPLJIJ = abstractC1452680nuEGc.LJIJ()) == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntPLJIJ)) == null || (nLEEditor = c348100DkmLIZIZ.LIZ) == null || (model = nLEEditor.getModel()) == null) {
                return;
            }
            List listLIZJ = C348930Dm7.LIZJ(model);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) listLIZJ).iterator();
            while (it2.hasNext()) {
                arrayList.add(new C19536311c1((NLETrackSlot) it2.next(), effect, null));
            }
            if (arrayList.size() > 0) {
                C19546111db c19546111db = C19546111db.LIZ;
                C19536311c1 c19536311c1 = (C19536311c1) ListProtector.get(arrayList, 0);
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
                c19546111db.getClass();
                if (C19546111db.LJIIL(c19536311c1, videoPublishEditModelLJJJLIIL)) {
                    return;
                }
            }
            x5().SY0(arrayList, new InterfaceC1219340hps() { // from class: X.12RV
                @Override // X.InterfaceC1219340hps
                public final void LIZ(int i, int i2) {
                }

                @Override // X.InterfaceC1219340hps
                public final void LIZIZ(int i, int i2) {
                }

                @Override // X.InterfaceC1219340hps
                public final void LIZJ(int i, List list) {
                }

                @Override // X.InterfaceC1219340hps
                public final void LIZLLL(int i, C19536611c4 c19536611c4) {
                }

                @Override // X.InterfaceC1219340hps
                public final void onCancel() {
                }

                @Override // X.InterfaceC1219340hps
                public final void onStart(int i) {
                }
            });
        }
    }

    public final void H5() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDurationChanged ");
        sbLIZ.append(this.LLJJJ.LJ);
        sbLIZ.append("  ");
        InterfaceC1452170ntP value = t5().g().getValue();
        sbLIZ.append(value != null ? Integer.valueOf(value.getDuration()) : null);
        C2188811AlT.LIZIZ(sbLIZ);
        C19755412Rc c19755412Rc = this.LLJJJ;
        c19755412Rc.LIZJ = true;
        c19755412Rc.LJIIJ();
        C19755412Rc c19755412Rc2 = this.LLJJJ;
        InterfaceC1452170ntP value2 = t5().g().getValue();
        c19755412Rc2.LJ = value2 != null ? value2.getDuration() : 0;
        this.LLJJJ.LJII();
    }

    public final void LLIZLLLIL() {
        Z4().LLIL(false);
        Z4().Hk2();
    }

    public final void P4() {
        Z4().LLIL(false);
        k5().show();
        this.LLJJJ.LJIIJ();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", LJJJLIIL().getCreationId());
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", LJJJLIIL().mShootWay);
        c0lab.LJ("content_source", C1428470nHB.LJIILIIL(LJJJLIIL()));
        c0lab.LJ("content_type", C1428470nHB.LJIILL(LJJJLIIL()));
        c0lab.LJ("enter_method", "click_audio_editing_panel");
        C20684815ws.LJIILLIIL("edit_volume", c0lab.LIZ);
    }

    public final void T4() {
        Z4().LLIL(false);
        d5().show();
        D5();
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void hide() {
        super.hide();
        n5().hR1("ae_voiceChange");
        n5().jz(this);
    }

    @Override // X.C12PO
    public boolean o5() {
        return x5().o5();
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
        n5().sM2("ae_voiceChange");
        n5().De2(new AwS608S0100000_29(this, 205));
        this.LLJJJ.LJIIIZ(AFwS273S0000000_29.get$arr$(130), new AwS573S0100000_29(this, 264), AFwS218S0000000_29.get$arr$(174), AFwS218S0000000_29.get$arr$(175));
        n5().PV0(this);
        x5().YB(new AwS643S0100000_29(this, 39));
        x5().eU1(new AwS608S0100000_29(this, 206));
    }

    @Override // X.C12PO
    public C19755412Rc Bi1() {
        return this.LLJJJ;
    }

    @Override // ge.i
    public Function0<C12QX> E3() {
        return this.LLJJJJJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.C12PO
    public void D8(AtomicBoolean atomicBoolean) {
        x5().D8(atomicBoolean);
    }

    public final void E5(boolean z) {
        Z4().LLIL(z);
    }

    @Override // X.C12PO
    public void LLIIL(Function0<Unit> function0) {
        C12QX c12qx = this.LLJJJJ;
        if (c12qx == null) {
            c12qx = null;
        }
        if (c12qx.LLJJLIIIJLLLLLLLZ != null) {
            c12qx.LLLZZIL();
        }
        function0.invoke();
    }

    @Override // X.C12PO
    public void LLIL(boolean z) {
        i3(new AwS41S0010000_29(z, 21));
    }

    @Override // X.C12PO
    public void LLJJJJJIL(Function0<Unit> function0) {
        C12QX c12qx = this.LLJJJJ;
        if (c12qx == null) {
            c12qx = null;
        }
        c12qx.LLLLLLIL();
        function0.invoke();
    }

    @Override // X.C12PX
    public void LLLILZJ(String str) {
        Intrinsics.LJFF("ae_volume", str);
    }

    public final void M5(int i) {
        AbstractC1452680nuE abstractC1452680nuEGc;
        InterfaceC1455860nzM interfaceC1455860nzMT5 = t5();
        if (interfaceC1455860nzMT5 != null && (abstractC1452680nuEGc = interfaceC1455860nzMT5.gc()) != null) {
            abstractC1452680nuEGc.LJJ().nf(i, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    public final void O4(Context context) {
        C5();
        C12QX c12qx = this.LLJJJJ;
        if (c12qx == null) {
            c12qx = null;
        }
        if (c12qx.LLLZ() == 3) {
            C0E3C c0e3c = C0E3C.LIZ;
            VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
            AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(this, 261);
            c0e3c.getClass();
            C0E3C.LIZ(context, videoPublishEditModelLJJJLIIL, awS573S0100000_29);
            return;
        }
        T4();
    }

    @Override // X.C12PO
    public void ho2(AudioRecorderParam audioRecorderParam) {
        i3(new AwS608S0100000_29(audioRecorderParam, 207));
    }

    @Override // X.C12PX
    public void p0(String str) {
        Intrinsics.LJFF("ae_volume", str);
    }

    public C19753212Qg(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), C12PK.class, null);
        this.LLJJI = C1664770tQJ.LIZ(getDiContainer(), C12RU.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), C12PP.class, null);
        this.LLJJIJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19753512Qj.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), C12SF.class, null);
        this.LLJJJ = new C19755412Rc(v5().JY0());
        this.LLJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC19753012Qe.class, null);
        this.LLJJJJJIL = new AwS573S0100000_29(this, 263);
    }
}

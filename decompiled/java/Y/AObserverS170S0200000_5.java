package Y;

import X.C013C;
import X.C01GW;
import X.C01TT;
import X.C051R;
import X.C0E0S;
import X.C0E1V;
import X.C0E1X;
import X.C0E2C;
import X.C0E2P;
import X.C0E48;
import X.C0E54;
import X.C0E55;
import X.C0E56;
import X.C0E5G;
import X.C0E5J;
import X.C0E5S;
import X.C0E6E;
import X.C0E6Y;
import X.C0E75;
import X.C0EBX;
import X.C0EBZ;
import X.C0EC5;
import X.C0EC6;
import X.C0EGB;
import X.C0EGJ;
import X.C0EGK;
import X.C0EHI;
import X.C0EI4;
import X.C0EI5;
import X.C0EJ3;
import X.C0EJA;
import X.C0ELA;
import X.C0ELJ;
import X.C0EOX;
import X.C0ETR;
import X.C0EVZ;
import X.C0FVT;
import X.C122Q;
import X.C1295960jpS;
import X.C12WG;
import X.C1397510mTF;
import X.C13LP;
import X.C1416310mxZ;
import X.C1428470nHB;
import X.C1459710o5Z;
import X.C1462070o9N;
import X.C15L2;
import X.C1664590tQ1;
import X.C196925122x;
import X.C19EG;
import X.C2188811AlT;
import X.C259800zU;
import X.C301680Bs6;
import X.C337180DJs;
import X.C346780Die;
import X.C347280DjS;
import X.C348100Dkm;
import X.C348850Dlz;
import X.C349550Dn7;
import X.C349560Dn8;
import X.C349680DnK;
import X.C350870DpF;
import X.C351010DpT;
import X.C351080Dpa;
import X.C351110Dpd;
import X.C351220Dpo;
import X.C351230Dpp;
import X.C352130DrH;
import X.C353700Dto;
import X.C354090DuR;
import X.C354150DuX;
import X.C354270Duj;
import X.C355090Dw3;
import X.C357110DzJ;
import X.C357540E0a;
import X.C358740E4q;
import X.C358750E4r;
import X.C358790E4v;
import X.C358810E4x;
import X.C360470EBh;
import X.C361980EHc;
import X.C362330EIl;
import X.C363500EMy;
import X.C363740ENw;
import X.C363780EOa;
import X.C365840EVy;
import X.C366800EZq;
import X.C372050EiJ;
import X.C372150EiT;
import X.C375260EnU;
import X.C375830EoP;
import X.C384190F4n;
import X.C419910GdJ;
import X.C559190LwT;
import X.C786410Ut5;
import X.C800330VaR;
import X.EnumC356070Dxd;
import X.EnumC357850E1f;
import X.EnumC358760E4s;
import X.EnumC373600Eko;
import X.InterfaceC1452170ntP;
import X.InterfaceC1455860nzM;
import X.InterfaceC20236714Gf;
import X.InterfaceC351350Dq1;
import X.InterfaceC351610DqR;
import X.InterfaceC354120DuU;
import X.InterfaceC355120Dw6;
import X.InterfaceC359850E8x;
import X.InterfaceC360800ECo;
import X.InterfaceC363820EOe;
import X.InterfaceC372160EiU;
import android.app.Activity;
import android.media.MediaPlayer;
import android.os.SystemClock;
import android.view.SurfaceView;
import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEKeyframeType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.api.ITemplateService;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService;
import com.ss.android.ugc.aweme.services.edit.VideoInfoData;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.EditRepeatMusicPlayer;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.logic.EditorProTTSHelper;
import com.ss.ugc.android.editor.track.PlayPositionState;
import com.ss.ugc.android.editor.track.TrackShowType;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS20S0001000_5;
import kotlin.jvm.internal.AwS20S0010000_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.AwS6S0120000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes6.dex */
public class AObserverS170S0200000_5 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onChanged$20(this, obj);
                break;
            case 21:
                onChanged$21(this, obj);
                break;
            case 22:
                onChanged$22(this, obj);
                break;
            case 23:
                onChanged$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onChanged$24(this, obj);
                break;
            case 25:
                onChanged$25(this, obj);
                break;
            case 26:
                onChanged$26(this, obj);
                break;
            case 27:
                onChanged$27(this, obj);
                break;
            case 28:
                onChanged$28(this, obj);
                break;
            case 29:
                onChanged$29(this, obj);
                break;
            case 30:
                onChanged$30(this, obj);
                break;
            case 31:
                onChanged$31(this, obj);
                break;
            case 32:
                onChanged$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onChanged$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onChanged$34(this, obj);
                break;
            case 35:
                onChanged$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onChanged$36(this, obj);
                break;
            case 37:
                onChanged$37(this, obj);
                break;
            case 38:
                onChanged$38(this, obj);
                break;
            case 39:
                onChanged$39(this, obj);
                break;
            case 40:
                onChanged$40(this, obj);
                break;
            case 41:
                onChanged$41(this, obj);
                break;
            case 42:
                onChanged$42(this, obj);
                break;
            case 43:
                onChanged$43(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        if (C384190F4n.LIZIZ((InterfaceC1455860nzM) aObserverS170S0200000_5.l0)) {
            ((FTCEditToolbarViewModel) aObserverS170S0200000_5.l1).tR2(1, false);
            C1459710o5Z.LIZLLL(-1, "music");
        }
    }

    public static final void onChanged$1(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        ((SafeHandler) aObserverS170S0200000_5.l0).removeCallbacksAndMessages(null);
        ((SafeHandler) aObserverS170S0200000_5.l0).post((Runnable) aObserverS170S0200000_5.l1);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$10(Y.AObserverS170S0200000_5 r4, java.lang.Object r5) {
        /*
            X.0Dpa r5 = (X.C351080Dpa) r5
            if (r5 == 0) goto L53
            java.lang.Object r3 = r4.l0
            X.0E2P r3 = (X.C0E2P) r3
            java.lang.Object r4 = r4.l1
            X.0Dw6 r4 = (X.InterfaceC355120Dw6) r4
            java.lang.String r1 = r3.L6()
            java.lang.String r0 = "music"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L3b
            java.lang.String r1 = r3.L6()
            java.lang.String r0 = "sound_effect"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L3b
            java.lang.String r1 = r3.L6()
            java.lang.String r0 = "audio_record"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L3b
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r5.LIZ
            r2 = 0
            if (r0 == 0) goto L3c
            boolean r0 = X.C351220Dpo.LLI(r0)
            if (r0 == 0) goto L3c
        L3b:
            r2 = 1
        L3c:
            float r1 = r4.getCurrentVolumeIntensity()
            r0 = 100
            float r0 = (float) r0
            float r1 = r1 * r0
            int r1 = (int) r1
            X.0E2S r0 = new X.0E2S
            r0.<init>(r1, r2)
            r3.i3(r0)
            r3.n7()
            r3.N5()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS170S0200000_5.onChanged$10(Y.AObserverS170S0200000_5, java.lang.Object):void");
    }

    public static final void onChanged$11(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        ((C0E2P) aObserverS170S0200000_5.l1).i3(new AwS20S0001000_5((int) (((InterfaceC355120Dw6) aObserverS170S0200000_5.l0).getSaveVolumeIntensity() * 100), 23));
    }

    public static final void onChanged$12(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        C0E48 c0e48F4;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48F42;
        InterfaceC351610DqR interfaceC351610DqROg;
        InterfaceC351610DqR interfaceC351610DqROg2;
        Long l = (Long) obj;
        C0E48 c0e48F43 = ((C0E2P) aObserverS170S0200000_5.l0).F4();
        if (c0e48F43 != null && (interfaceC351610DqROg2 = c0e48F43.og()) != null) {
            interfaceC351610DqROg2.LJIILIIL(l.longValue());
        }
        if (C351230Dpp.LIZLLL(null) && (c0e48F4 = ((C0E2P) aObserverS170S0200000_5.l0).F4()) != null && (nLETrackSlotLLLLLLIL = c0e48F4.LLLLLLIL()) != null && (c0e48F42 = ((C0E2P) aObserverS170S0200000_5.l0).F4()) != null && (interfaceC351610DqROg = c0e48F42.og()) != null) {
            interfaceC351610DqROg.LJJJIL(NLEKeyframeType.Volume, l.longValue(), nLETrackSlotLLLLLLIL);
        }
        ((C0E2P) aObserverS170S0200000_5.l0).i3(new AwS20S0001000_5((int) (((InterfaceC355120Dw6) aObserverS170S0200000_5.l1).getCurrentVolumeIntensity() * 100), 24));
    }

    public static final void onChanged$13(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        Boolean bool;
        long jJh;
        InterfaceC351610DqR interfaceC351610DqROg;
        C375830EoP c375830EoP = (C375830EoP) obj;
        if (c375830EoP != null && (bool = (Boolean) c375830EoP.LIZ()) != null) {
            C0E2P c0e2p = (C0E2P) aObserverS170S0200000_5.l0;
            InterfaceC355120Dw6 interfaceC355120Dw6 = (InterfaceC355120Dw6) aObserverS170S0200000_5.l1;
            bool.booleanValue();
            C0E48 c0e48F4 = c0e2p.F4();
            if (c0e48F4 != null) {
                jJh = c0e48F4.getPlayer().Jh();
            } else {
                jJh = 0;
            }
            long j = jJh * 1000;
            C0E48 c0e48F42 = c0e2p.F4();
            if (c0e48F42 != null && (interfaceC351610DqROg = c0e48F42.og()) != null) {
                interfaceC351610DqROg.LJIILIIL(j);
            }
            c0e2p.i3(new AwS20S0001000_5((int) (interfaceC355120Dw6.getCurrentVolumeIntensity() * 100), 25));
            c0e2p.E5();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$14(Y.AObserverS170S0200000_5 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS170S0200000_5.onChanged$14(Y.AObserverS170S0200000_5, java.lang.Object):void");
    }

    public static final void onChanged$15(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        C0EGJ c0egj = ((C372050EiJ) aObserverS170S0200000_5.l0).N5().LLJLILLLLZIIL;
        Long veFirstFrameTimeStamp = ((C372050EiJ) aObserverS170S0200000_5.l0).C5().getEditorProModel().getVeFirstFrameTimeStamp();
        c0egj.getClass();
        if (veFirstFrameTimeStamp != null) {
            veFirstFrameTimeStamp.longValue();
            c0egj.LJ = veFirstFrameTimeStamp;
            Long l = c0egj.LIZLLL;
            if (l != null) {
                c0egj.LJFF = Long.valueOf(veFirstFrameTimeStamp.longValue() - l.longValue());
            }
        }
        ((C372050EiJ) aObserverS170S0200000_5.l0).bx0((C0ELJ) aObserverS170S0200000_5.l1, false);
    }

    public static final void onChanged$16(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        C0EGJ c0egj = ((C372050EiJ) aObserverS170S0200000_5.l0).N5().LLJLILLLLZIIL;
        Long veFirstFrameTimeStamp = ((C372050EiJ) aObserverS170S0200000_5.l0).C5().getEditorProModel().getVeFirstFrameTimeStamp();
        c0egj.getClass();
        if (veFirstFrameTimeStamp != null) {
            veFirstFrameTimeStamp.longValue();
            c0egj.LJ = veFirstFrameTimeStamp;
            Long l = c0egj.LIZLLL;
            if (l != null) {
                c0egj.LJFF = Long.valueOf(veFirstFrameTimeStamp.longValue() - l.longValue());
            }
        }
        ((C372050EiJ) aObserverS170S0200000_5.l0).XL(false, false);
        ((C372050EiJ) aObserverS170S0200000_5.l0).bx0((C0ELJ) aObserverS170S0200000_5.l1, false);
        ((C372050EiJ) aObserverS170S0200000_5.l0).i3(AFwS234S0000000_5.get$arr$(358));
    }

    public static final void onChanged$17(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        C348100Dkm c348100DkmLIZIZ;
        InterfaceC372160EiU interfaceC372160EiUL6 = ((C372050EiJ) aObserverS170S0200000_5.l0).L6();
        if (interfaceC372160EiUL6 != null) {
            interfaceC372160EiUL6.cg1((C372150EiT) aObserverS170S0200000_5.l1);
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        InterfaceC1452170ntP value = ((C372050EiJ) aObserverS170S0200000_5.l0).JY0().g().getValue();
        if (value != null) {
            c348100DkmLIZIZ = C352130DrH.LIZIZ(value);
        } else {
            c348100DkmLIZIZ = null;
        }
        c363500EMy.getClass();
        C363500EMy.LIZJ = c348100DkmLIZIZ;
    }

    public static final void onChanged$18(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        INLEMediaSession iNLEMediaSession;
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        C348100Dkm c348100DkmLIZIZ2;
        InterfaceC1452170ntP value2 = ((C0ELA) aObserverS170S0200000_5.l0).JY0().g().getValue();
        NLEEditor nLEEditor = null;
        if (value2 != null && (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value2)) != null) {
            iNLEMediaSession = c348100DkmLIZIZ2.LIZIZ;
        } else {
            iNLEMediaSession = null;
        }
        SurfaceView value3 = ((C0ELA) aObserverS170S0200000_5.l0).JY0().ge().getValue();
        if (iNLEMediaSession != null && value3 != null) {
            if (C301680Bs6.LIZ() && (value = ((C0ELA) aObserverS170S0200000_5.l0).JY0().g().getValue()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null) {
                nLEEditor = c348100DkmLIZIZ.LIZ;
            }
            C0E48 c0e48W1 = ((C0ELA) aObserverS170S0200000_5.l0).W1();
            if (c0e48W1 != null) {
                C0EHI c0ehi = (C0EHI) aObserverS170S0200000_5.l1;
                C0ELA c0ela = (C0ELA) aObserverS170S0200000_5.l0;
                if (c0e48W1.Ie() == null) {
                    c0e48W1.ve(new C353700Dto(c0ehi.LIZ.LIZ));
                }
                c0e48W1.ok(c0ela.sg());
                c0e48W1.M6(nLEEditor, C375260EnU.LIZJ(((C0EHI) aObserverS170S0200000_5.l1).LIZ.LIZIZ), value3, iNLEMediaSession, null);
            }
            ((C0ELA) aObserverS170S0200000_5.l0).LLJILLL.setValue(Unit.LIZ);
            C0ELA c0ela2 = (C0ELA) aObserverS170S0200000_5.l0;
            c0ela2.LLJILJILJ = c0ela2.LLJILJIL.getValue();
        }
    }

    public static final void onChanged$19(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        C348100Dkm c348100DkmLIZIZ;
        INLEMediaSession iNLEMediaSession;
        INLEMediaRuntime mediaRuntimeApi;
        ((C559190LwT) aObserverS170S0200000_5.l0).D5();
        VEEditorAutoStartStopArbiter value = ((C559190LwT) aObserverS170S0200000_5.l0).JY0().b10().getValue();
        if (value != null) {
            value.LIZJ(true, true, true);
        }
        VEEditorAutoStartStopArbiter value2 = ((C559190LwT) aObserverS170S0200000_5.l0).JY0().b10().getValue();
        if (value2 != null) {
            value2.LIZIZ();
        }
        InterfaceC1452170ntP value3 = ((C559190LwT) aObserverS170S0200000_5.l0).JY0().g().getValue();
        if (value3 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value3)) != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) != null) {
            mediaRuntimeApi.setPreviewOffScreen(true);
        }
        ITemplateService iTemplateService = (ITemplateService) ServiceManager.get().getService(ITemplateService.class);
        if (iTemplateService != null) {
            iTemplateService.LJFF(((C559190LwT) aObserverS170S0200000_5.l0).LLJLILLLLZIIL, new AwS584S0100000_5((InterfaceC20236714Gf) aObserverS170S0200000_5.l1, 792), new AwS584S0100000_5((InterfaceC20236714Gf) aObserverS170S0200000_5.l1, 794), AFwS231S0000000_3.get$arr$(111));
        }
    }

    public static final void onChanged$2(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        List<C196925122x> listLLLLLLZZ;
        InfoStickerModel infoStickerModel;
        List<StickerItemModel> list;
        C0FVT c0fvtKR;
        Boolean bool = (Boolean) obj;
        if (!Intrinsics.LJFF(Boolean.valueOf(((C013C) aObserverS170S0200000_5.l0).element), bool)) {
            ((C013C) aObserverS170S0200000_5.l0).element = bool.booleanValue();
            C1462070o9N c1462070o9N = (C1462070o9N) aObserverS170S0200000_5.l1;
            int videoLength = c1462070o9N.LLLLLLL().getVideoLength();
            if ((!C1416310mxZ.LJJLIIIJJIZ(c1462070o9N.LLLLLLL()) || C1428470nHB.LJLIIL(c1462070o9N.LLLLLLL())) && !c1462070o9N.LLLLLLLLLL) {
                VideoPublishEditModel videoPublishEditModelLLLLLLL = c1462070o9N.LLLLLLL();
                if (videoPublishEditModelLLLLLLL != null && (infoStickerModel = videoPublishEditModelLLLLLLL.getInfoStickerModel()) != null && (list = infoStickerModel.stickers) != null) {
                    for (StickerItemModel stickerItemModel : list) {
                        int i = stickerItemModel.endTime;
                        if (i != 0) {
                            int i2 = stickerItemModel.startTime;
                            int i3 = videoLength - i;
                            stickerItemModel.startTime = i3;
                            int i4 = videoLength - i2;
                            stickerItemModel.endTime = i4;
                            stickerItemModel.uiStartTime = i3;
                            stickerItemModel.uiEndTime = i4;
                        }
                    }
                }
                C122Q c122q = c1462070o9N.LLLLLJLJLL;
                if (c122q != null && (listLLLLLLZZ = c122q.LLLLLLZZ()) != null) {
                    Iterator<C196925122x> it2 = listLLLLLLZZ.iterator();
                    while (it2.hasNext()) {
                        TextStickerData data = it2.next().getData();
                        if (data != null && data.getEndTime() != 0) {
                            int startTime = data.getStartTime();
                            data.setStartTime(videoLength - data.getEndTime());
                            data.setEndTime(videoLength - startTime);
                            data.setUiStartTime(data.getStartTime());
                            data.setUiEndTime(data.getEndTime());
                        }
                    }
                    return;
                }
                return;
            }
            for (TextStickerModel textStickerModel : c1462070o9N.LLLLLLL().creativeModel.stickerModel.textStickerModels) {
                float startTime2 = textStickerModel.getBaseStickerModel().getStartTime();
                float f = videoLength;
                textStickerModel.getBaseStickerModel().setStartTime(f - textStickerModel.getBaseStickerModel().getEndTime());
                textStickerModel.getBaseStickerModel().setEndTime(f - startTime2);
                textStickerModel.getBaseStickerModel().setUiStartTime(textStickerModel.getBaseStickerModel().getStartTime());
                textStickerModel.getBaseStickerModel().setUiEndTime(textStickerModel.getBaseStickerModel().getUiEndTime());
                if (c1462070o9N.LLLLLL != null && (c0fvtKR = c1462070o9N.LLLLLLLLL().kR()) != null) {
                    c0fvtKR.Qi(textStickerModel);
                }
            }
        }
    }

    public static final void onChanged$20(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            if (num.intValue() == 1) {
                C355090Dw3.LIZIZ("BaseEditorPlayground", "STATE_PLAY");
                ((C0E48) aObserverS170S0200000_5.l0).getPlayer().Wj(true);
                C0E54 c0e54 = (C0E54) aObserverS170S0200000_5.l1;
                EnumC373600Eko enumC373600Eko = EnumC373600Eko.PLAY;
                InterfaceC360800ECo interfaceC360800ECoLIZJ = c0e54.LIZJ();
                if (interfaceC360800ECoLIZJ != null) {
                    interfaceC360800ECoLIZJ.b5(enumC373600Eko);
                }
                C0E54.LJIIIIZZ((C0E54) aObserverS170S0200000_5.l1, null, null, 7);
                C0E54 c0e542 = (C0E54) aObserverS170S0200000_5.l1;
                System.currentTimeMillis();
                c0e542.getClass();
                if (Intrinsics.LJFF(C0E5G.LIZ(EnumC357850E1f.ENABLE_TRACK_PROGRESS), Boolean.TRUE)) {
                    C0E54 c0e543 = (C0E54) aObserverS170S0200000_5.l1;
                    C0E56 c0e56 = c0e543.LLJJ;
                    c0e543.LJI().zE2().getValue();
                    c0e56.getClass();
                    return;
                }
                ((C0E54) aObserverS170S0200000_5.l1).LLJILLL.getClass();
                SystemClock.elapsedRealtime();
                return;
            }
            if (num.intValue() == 0) {
                C355090Dw3.LIZIZ("BaseEditorPlayground", "STATE_PAUSE");
                C0E54 c0e544 = (C0E54) aObserverS170S0200000_5.l1;
                EnumC373600Eko enumC373600Eko2 = EnumC373600Eko.PAUSE;
                InterfaceC360800ECo interfaceC360800ECoLIZJ2 = c0e544.LIZJ();
                if (interfaceC360800ECoLIZJ2 != null) {
                    interfaceC360800ECoLIZJ2.b5(enumC373600Eko2);
                }
                Object objLIZ = C0E5G.LIZ(EnumC357850E1f.ENABLE_TRACK_PROGRESS);
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(objLIZ, bool)) {
                    C0E56 c0e562 = ((C0E54) aObserverS170S0200000_5.l1).LLJJ;
                    boolean zIsRunning = c0e562.LIZLLL.isRunning();
                    c0e562.LIZ();
                    if (zIsRunning) {
                        C786410Ut5.LJLIIL(16L, c0e562.LJIIIZ, new ARunnableS105S0100000_5(c0e562, 107));
                    }
                } else {
                    ((C0E54) aObserverS170S0200000_5.l1).LLJILLL.LIZ();
                    ((C0E54) aObserverS170S0200000_5.l1).LLJILLL.getClass();
                    SystemClock.elapsedRealtime();
                }
                ((C0E54) aObserverS170S0200000_5.l1).LJIILJJIL();
                C0E54.LJIIIIZZ((C0E54) aObserverS170S0200000_5.l1, null, null, 7);
                if (!Intrinsics.LJFF(((C0E48) aObserverS170S0200000_5.l0).S7().LIZJ("is_playing_in_full_screen", null), bool)) {
                    return;
                }
                C350870DpF.LJIIIZ((C0E48) aObserverS170S0200000_5.l0, "is_playing_in_full_screen", Boolean.FALSE);
                return;
            }
            if (num.intValue() != 3) {
                return;
            }
            C355090Dw3.LIZIZ("BaseEditorPlayground", "STATE_SEEK");
            ((C0E54) aObserverS170S0200000_5.l1).LJII(C350870DpF.LJ((C0E48) aObserverS170S0200000_5.l0));
            ((C0E54) aObserverS170S0200000_5.l1).LJI().zv(new PlayPositionState(TimeUnit.MILLISECONDS.toMicros(C350870DpF.LJ((C0E48) aObserverS170S0200000_5.l0)), false, false), false);
        }
    }

    public static final void onChanged$21(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        Long l = (Long) obj;
        if (l.longValue() >= 0 && ((C0E48) aObserverS170S0200000_5.l0).getPlayer().isPlaying()) {
            long millis = TimeUnit.MICROSECONDS.toMillis(l.longValue());
            if (Intrinsics.LJFF(C0E5G.LIZ(EnumC357850E1f.ENABLE_TRACK_PROGRESS), Boolean.TRUE)) {
                C0E56 c0e56 = ((C0E54) aObserverS170S0200000_5.l1).LLJJ;
                if (!c0e56.LIZLLL.isRunning()) {
                    c0e56.LIZJ = SystemClock.elapsedRealtime();
                    SystemClock.elapsedRealtime();
                    c0e56.LIZLLL.start();
                    c0e56.LIZIZ.LIZ(c0e56.LJFF);
                }
                if (c0e56.LIZLLL.isRunning()) {
                    c0e56.LIZIZ.LIZJ(millis);
                    if (millis <= c0e56.LJI) {
                        c0e56.LJFF = millis;
                    }
                    c0e56.LJI = millis;
                }
            } else {
                ((C0E54) aObserverS170S0200000_5.l1).LLJILLL.LIZIZ((int) millis);
            }
            InterfaceC360800ECo interfaceC360800ECoLIZJ = ((C0E54) aObserverS170S0200000_5.l1).LIZJ();
            if (interfaceC360800ECoLIZJ != null) {
                interfaceC360800ECoLIZJ.gm0(Long.valueOf(millis), null);
            }
            ((C0E54) aObserverS170S0200000_5.l1).LJIIZILJ(millis);
        }
    }

    public static final void onChanged$22(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        boolean zBooleanValue;
        Boolean bool = (Boolean) obj;
        C0E5S c0e5s = ((C358790E4v) aObserverS170S0200000_5.l0).LIZJ;
        boolean zBooleanValue2 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        c0e5s.QD2(zBooleanValue, true);
        C0E55 player = ((C0E48) aObserverS170S0200000_5.l1).getPlayer();
        if (player != null) {
            if (bool != null) {
                zBooleanValue2 = bool.booleanValue();
            }
            player.setActive(zBooleanValue2);
        }
    }

    public static final void onChanged$23(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        EnumC358760E4s enumC358760E4s;
        EnumC358760E4s enumC358760E4s2;
        C358740E4q c358740E4q = (C358740E4q) obj;
        if (c358740E4q != null && c358740E4q.LIZ != null) {
            C358790E4v c358790E4v = (C358790E4v) aObserverS170S0200000_5.l0;
            Integer numValueOf = Integer.valueOf(c358740E4q.LIZIZ);
            c358790E4v.getClass();
            C0E6E c0e6eLIZ = C358790E4v.LIZ(numValueOf);
            if (c0e6eLIZ != null) {
                Long l = c358740E4q.LIZJ;
                if (l != null) {
                    C0E5S c0e5s = ((C358790E4v) aObserverS170S0200000_5.l0).LIZJ;
                    NLETrackSlot nLETrackSlot = c358740E4q.LIZ;
                    if (nLETrackSlot != null) {
                        C358750E4r c358750E4r = EnumC358760E4s.Companion;
                        int i = c358740E4q.LJ;
                        c358750E4r.getClass();
                        EnumC358760E4s[] enumC358760E4sArrValues = EnumC358760E4s.values();
                        if (i >= 0 && i < enumC358760E4sArrValues.length) {
                            enumC358760E4s2 = enumC358760E4sArrValues[i];
                        } else {
                            enumC358760E4s2 = EnumC358760E4s.NORMAL;
                        }
                        c0e5s.G22(nLETrackSlot, c0e6eLIZ, enumC358760E4s2, false, false, true);
                        C350870DpF.LJIIIZ((C0E48) aObserverS170S0200000_5.l1, "move_track_to_position", l);
                        C0E55 player = ((C0E48) aObserverS170S0200000_5.l1).getPlayer();
                        if (player != null) {
                            player.LJIJI(l.longValue(), C351110Dpd.LIZ);
                            return;
                        }
                        return;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                C0E5S c0e5s2 = ((C358790E4v) aObserverS170S0200000_5.l0).LIZJ;
                NLETrackSlot nLETrackSlot2 = c358740E4q.LIZ;
                if (nLETrackSlot2 != null) {
                    boolean z = c358740E4q.LIZLLL;
                    C358750E4r c358750E4r2 = EnumC358760E4s.Companion;
                    int i2 = c358740E4q.LJ;
                    c358750E4r2.getClass();
                    EnumC358760E4s[] enumC358760E4sArrValues2 = EnumC358760E4s.values();
                    if (i2 >= 0 && i2 < enumC358760E4sArrValues2.length) {
                        enumC358760E4s = enumC358760E4sArrValues2[i2];
                    } else {
                        enumC358760E4s = EnumC358760E4s.NORMAL;
                    }
                    c0e5s2.G22(nLETrackSlot2, c0e6eLIZ, enumC358760E4s, z, false, c358740E4q.LJFF);
                    return;
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
            return;
        }
        ((C358790E4v) aObserverS170S0200000_5.l0).LIZJ.w6(null, false, false);
    }

    public static final void onChanged$24(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        C0E6E c0e6e;
        boolean z;
        C0E6E c0e6eRemoveLast;
        C358810E4x c358810E4x = (C358810E4x) obj;
        C358790E4v c358790E4v = (C358790E4v) aObserverS170S0200000_5.l0;
        Integer num = c358810E4x.LIZ;
        c358790E4v.getClass();
        C0E6E c0e6eLIZ = C358790E4v.LIZ(num);
        if (c0e6eLIZ == null) {
            ArrayDeque<C0E6E> arrayDeque = ((C358790E4v) aObserverS170S0200000_5.l0).LJIILL;
            if (!arrayDeque.isEmpty() && (c0e6eRemoveLast = arrayDeque.removeLast()) != null) {
                ((C358790E4v) aObserverS170S0200000_5.l0).LIZJ.q8(c0e6eRemoveLast);
            }
            boolean z2 = false;
            if (!((C358790E4v) aObserverS170S0200000_5.l0).LJIIIZ.invoke().booleanValue() && !((C358790E4v) aObserverS170S0200000_5.l0).LJIIJJI.invoke().booleanValue() && !((C358790E4v) aObserverS170S0200000_5.l0).LJIIJ.invoke().booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            NLEModel nLEModelLJI = C350870DpF.LJI((C0E48) aObserverS170S0200000_5.l1);
            if (((C358790E4v) aObserverS170S0200000_5.l0).LJIIJJI.invoke().booleanValue() && C346780Die.LIZ(nLEModelLJI) == null) {
                z2 = true;
            }
            C358790E4v c358790E4v2 = (C358790E4v) aObserverS170S0200000_5.l0;
            c358790E4v2.LIZJ.yV(new AwS6S0120000_5(z, z2, c358790E4v2, 3));
            return;
        }
        if (c358810E4x.LIZIZ) {
            C0E75 value = ((C358790E4v) aObserverS170S0200000_5.l0).LIZJ.dQ().getValue();
            if (value == null || (c0e6e = value.LJ) == null) {
                return;
            } else {
                ((C358790E4v) aObserverS170S0200000_5.l0).LJIILL.add(c0e6e);
            }
        }
        ((C358790E4v) aObserverS170S0200000_5.l0).LIZJ.q8(c0e6eLIZ);
        ((C358790E4v) aObserverS170S0200000_5.l0).LIZJ.yV(AFwS234S0000000_5.get$arr$(438));
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$25(Y.AObserverS170S0200000_5 r23, java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS170S0200000_5.onChanged$25(Y.AObserverS170S0200000_5, java.lang.Object):void");
    }

    public static final void onChanged$26(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        NLETrackType nLETrackTypeLJIIIIZZ;
        long jJh;
        int i;
        C357110DzJ c357110DzJ = (C357110DzJ) obj;
        if (c357110DzJ != null) {
            C0E48 c0e48 = (C0E48) aObserverS170S0200000_5.l0;
            C358790E4v c358790E4v = (C358790E4v) aObserverS170S0200000_5.l1;
            InterfaceC351350Dq1 interfaceC351350Dq1LLFII = c0e48.LLFII();
            if (interfaceC351350Dq1LLFII != null) {
                interfaceC351350Dq1LLFII.LLJ(c357110DzJ.LIZ, c357110DzJ.LIZIZ, c357110DzJ.LIZJ, EnumC356070Dxd.COMMIT);
            }
            NLETrack trackBySlot = C350870DpF.LJI(c0e48).getTrackBySlot(c357110DzJ.LIZ);
            if (trackBySlot != null) {
                nLETrackTypeLJIIIIZZ = C350870DpF.LJIIIIZZ(trackBySlot);
            } else {
                nLETrackTypeLJIIIIZZ = null;
            }
            if (nLETrackTypeLJIIIIZZ == NLETrackType.STICKER) {
                C0EVZ.LIZ.LIZIZ(c357110DzJ.LIZ, c0e48);
            }
            C350870DpF.LIZJ(c0e48, C051R.LIZIZ(new C0E1X(C0E1V.CLIP.getNameId(), null, null, null, null, 30)));
            C0E55 player = c0e48.getPlayer();
            if (player != null) {
                jJh = player.Jh();
            } else {
                jJh = 0;
            }
            long[] jArr = new long[2];
            c0e48.Bq(jArr);
            int i2 = 0;
            long jLLLLLLL = C351220Dpo.LLLLLLL(jArr[0]);
            long jLLLLLLL2 = C351220Dpo.LLLLLLL(jArr[1]);
            if (jLLLLLLL >= jJh) {
                C0E55 player2 = c0e48.getPlayer();
                if (player2 != null) {
                    if (jJh != 0) {
                        i2 = 1;
                    }
                    player2.LIZIZ(jLLLLLLL + ((long) i2));
                }
            } else if (jJh >= jLLLLLLL2) {
                C0E55 player3 = c0e48.getPlayer();
                if (player3 != null && jJh == player3.qq()) {
                    i2 = 1;
                }
                if (i2 != 0 && jJh - jLLLLLLL2 <= 1) {
                    C0E55 player4 = c0e48.getPlayer();
                    if (player4 != null) {
                        player4.LIZIZ(jJh);
                    }
                } else {
                    C0E55 player5 = c0e48.getPlayer();
                    if (player5 != null) {
                        player5.LIZIZ(jLLLLLLL2 - 1);
                    }
                }
            } else {
                C0E55 player6 = c0e48.getPlayer();
                if (player6 != null) {
                    player6.LIZIZ(jJh);
                }
            }
            if (nLETrackTypeLJIIIIZZ == null) {
                i = -1;
            } else {
                i = C347280DjS.LIZ[nLETrackTypeLJIIIIZZ.ordinal()];
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c357110DzJ.LIZ.setExtra("is_editorpro_trim_effect", "1");
                        c357110DzJ.LIZ.setExtra("is_edit_effect_duration", "true");
                        if (C351220Dpo.LLLLIL(c357110DzJ.LIZ)) {
                            c357110DzJ.LIZ.setExtra("is_editorpro_trim_video_animation", "1");
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (C351220Dpo.LLLJIL(c357110DzJ.LIZ)) {
                    c357110DzJ.LIZ.setExtra("is_editorpro_trim_text_length", "1");
                    C349680DnK.LIZ(c357110DzJ.LIZ);
                    C0EJ3 c0ej3Invoke = c358790E4v.LJII.invoke();
                    if (c0ej3Invoke != null) {
                        c0ej3Invoke.Rc();
                    }
                    C354270Duj.LIZ(300L, new AwS406S0200000_5(c358790E4v, c357110DzJ, 108));
                    return;
                }
                InterfaceC363820EOe interfaceC363820EOeInvoke = c358790E4v.LJIIIIZZ.invoke();
                if (interfaceC363820EOeInvoke != null) {
                    interfaceC363820EOeInvoke.L51(null);
                }
                C354270Duj.LIZ(300L, new AwS406S0200000_5(c358790E4v, c357110DzJ, 109));
                return;
            }
            VideoPublishEditModel videoPublishEditModelInvoke = c358790E4v.LJ.invoke();
            if (videoPublishEditModelInvoke != null) {
                C0EC5.LJII(videoPublishEditModelInvoke, c0e48, c357110DzJ.LIZ.getExtra("ep_audio_music_id"), C348850Dlz.LJFF(c357110DzJ.LIZ, c0e48));
            }
            c357110DzJ.LIZ.setExtra("is_editorpro_trim_music_length", "1");
        }
    }

    public static final void onChanged$27(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        long millis;
        C358740E4q c358740E4q = (C358740E4q) obj;
        NLETrackSlot nLETrackSlot = c358740E4q.LIZ;
        if (nLETrackSlot != null) {
            C358790E4v c358790E4v = (C358790E4v) aObserverS170S0200000_5.l0;
            Integer numValueOf = Integer.valueOf(c358740E4q.LIZIZ);
            c358790E4v.getClass();
            C0E6E c0e6eLIZ = C358790E4v.LIZ(numValueOf);
            if (c0e6eLIZ != null) {
                Long l = c358740E4q.LIZJ;
                if (l != null) {
                    millis = l.longValue();
                } else {
                    millis = TimeUnit.MICROSECONDS.toMillis(nLETrackSlot.getStartTime());
                }
                C0E55 player = ((C0E48) aObserverS170S0200000_5.l1).getPlayer();
                if (player != null) {
                    player.LIZIZ(millis);
                }
                ((C358790E4v) aObserverS170S0200000_5.l0).LIZJ.zv(new PlayPositionState(millis * ((long) LSPassThroughRecordSizeConfig.DEFAULT), false, false), false);
                ((C358790E4v) aObserverS170S0200000_5.l0).LIZJ.G22(nLETrackSlot, c0e6eLIZ, EnumC358760E4s.NORMAL, true, false, true);
            }
        }
    }

    public static final void onChanged$28(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) obj;
        if (nLETimeSpaceNode != null) {
            NLETrack nLETrackPt = ((C0E48) aObserverS170S0200000_5.l0).Pt();
            if (nLETrackPt != null && nLETrackPt.getMainTrack()) {
                ((C358790E4v) aObserverS170S0200000_5.l1).LIZJ.w6(null, false, false);
            }
            C0E55 player = ((C0E48) aObserverS170S0200000_5.l0).getPlayer();
            if (player != null) {
                player.LJIJI(nLETimeSpaceNode.getStartTime(), C351110Dpd.LIZ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$29(Y.AObserverS170S0200000_5 r4, java.lang.Object r5) {
        /*
            if (r5 == 0) goto L4d
            java.lang.Object r5 = r4.l0
            X.0E48 r5 = (X.C0E48) r5
            java.lang.Object r4 = r4.l1
            X.0E4v r4 = (X.C358790E4v) r4
            X.0DpP r1 = r5.S7()
            java.lang.String r0 = "panel_bounce_event"
            r2 = 0
            java.lang.Object r0 = r1.LIZJ(r0, r2)
            X.0E2C r0 = (X.C0E2C) r0
            if (r0 == 0) goto L1b
            java.lang.String r2 = r0.LIZJ
        L1b:
            java.lang.String r1 = "video_anim_panel"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 == 0) goto L4d
            X.0E5S r0 = r4.LIZJ
            android.view.View r3 = r0.xg()
            boolean r0 = r3 instanceof X.C368000Ebm
            if (r0 == 0) goto L4d
            X.0Ebm r3 = (X.C368000Ebm) r3
            if (r3 == 0) goto L4d
            kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> r0 = r4.LJIILIIL
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            com.bytedance.ies.nle.editor_jni.NLETrack r0 = r5.Pt()
            if (r0 == 0) goto L4e
            boolean r1 = r0.getMainTrack()
            r0 = 1
            if (r1 != r0) goto L4e
        L4a:
            r3.hideOrShowAnimMask(r2, r0)
        L4d:
            return
        L4e:
            r0 = 0
            goto L4a
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS170S0200000_5.onChanged$29(Y.AObserverS170S0200000_5, java.lang.Object):void");
    }

    public static final void onChanged$3(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        C01TT.LIZLLL(new AwS406S0200000_5((C259800zU) aObserverS170S0200000_5.l0, (C259800zU<C1397510mTF>) aObserverS170S0200000_5.l1, (C0ETR) 48));
    }

    public static final void onChanged$30(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        EditRepeatMusicPlayer editRepeatMusicPlayer;
        MediaPlayer mediaPlayer;
        if (((Number) obj).intValue() == 1 && (editRepeatMusicPlayer = ((EditorProTTSHelper) aObserverS170S0200000_5.l0).LLJ) != null && (mediaPlayer = editRepeatMusicPlayer.LL) != null && mediaPlayer.isPlaying()) {
            EditRepeatMusicPlayer editRepeatMusicPlayer2 = ((EditorProTTSHelper) aObserverS170S0200000_5.l0).LLJ;
            if (editRepeatMusicPlayer2 != null) {
                editRepeatMusicPlayer2.LIZIZ();
            }
            ((MutableLiveData) aObserverS170S0200000_5.l1).removeObserver(aObserverS170S0200000_5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$31(Y.AObserverS170S0200000_5 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS170S0200000_5.onChanged$31(Y.AObserverS170S0200000_5, java.lang.Object):void");
    }

    public static final void onChanged$32(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        String str = (String) obj;
        VideoPublishEditModel videoPublishEditModelB3 = ((C0EGB) aObserverS170S0200000_5.l0).B3();
        if (videoPublishEditModelB3 != null) {
            C0EC5.LIZIZ(videoPublishEditModelB3, (C0E48) aObserverS170S0200000_5.l1, str, "select");
        }
        C350870DpF.LJI((C0E48) aObserverS170S0200000_5.l1).setExtra("enter_select_music_time", String.valueOf(System.currentTimeMillis()));
        ((C0EGB) aObserverS170S0200000_5.l0).Bi0(new C0EC6(str, "select"), false);
    }

    public static final void onChanged$33(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        if (C1416310mxZ.LJIILL(((C0EGB) aObserverS170S0200000_5.l0).B3())) {
            C349550Dn7.LIZ(C350870DpF.LJI((C0E48) aObserverS170S0200000_5.l1));
        } else {
            NLETrack nLETrackLIZ = C349560Dn8.LIZ(C350870DpF.LJI((C0E48) aObserverS170S0200000_5.l1));
            if (nLETrackLIZ != null) {
                nLETrackLIZ.clearSlot();
            }
        }
        C350870DpF.LIZ((C0E48) aObserverS170S0200000_5.l1, false);
        if (C363740ENw.LJIIJJI(C350870DpF.LJI((C0E48) aObserverS170S0200000_5.l1)) && !C366800EZq.LIZ(((C0EGB) aObserverS170S0200000_5.l0).B3(), C350870DpF.LJI((C0E48) aObserverS170S0200000_5.l1))) {
            InterfaceC359850E8x interfaceC359850E8xK4 = ((C0EGB) aObserverS170S0200000_5.l0).K4();
            if (interfaceC359850E8xK4 != null) {
                interfaceC359850E8xK4.LJIIIZ("bottom_item_root_caption");
            }
            InterfaceC359850E8x interfaceC359850E8xK42 = ((C0EGB) aObserverS170S0200000_5.l0).K4();
            if (interfaceC359850E8xK42 != null) {
                interfaceC359850E8xK42.LJIIIZ("bottom_item_text_captions");
            }
        }
        C0E5S c0e5sR5 = ((C0EGB) aObserverS170S0200000_5.l0).R5();
        if (c0e5sR5 != null) {
            c0e5sR5.w6(null, false, false);
        }
        C0EJ3 c0ej3M5 = ((C0EGB) aObserverS170S0200000_5.l0).M5();
        if (c0ej3M5 != null) {
            c0ej3M5.Rc();
        }
    }

    public static final void onChanged$34(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        VideoPublishEditModel videoPublishEditModelB3 = ((C0EGB) aObserverS170S0200000_5.l0).B3();
        if (videoPublishEditModelB3 != null) {
            C0EC5.LIZIZ(videoPublishEditModelB3, (C0E48) aObserverS170S0200000_5.l1, "click_secondary_menu", "replace");
        }
        ((C0EGB) aObserverS170S0200000_5.l0).Bi0(new C0EC6("click_secondary_menu", "replace"), true);
    }

    public static final void onChanged$35(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        if (((C0EGB) aObserverS170S0200000_5.l0).o4().zu2().getValue() != null && C351220Dpo.LJJIJLIJ(C350870DpF.LJI((C0E48) aObserverS170S0200000_5.l1)).isEmpty()) {
            InterfaceC359850E8x interfaceC359850E8xK4 = ((C0EGB) aObserverS170S0200000_5.l0).K4();
            if (interfaceC359850E8xK4 != null) {
                interfaceC359850E8xK4.LJIIL("bottom_item_root_effects");
            }
            C0E5S c0e5sR5 = ((C0EGB) aObserverS170S0200000_5.l0).R5();
            if (c0e5sR5 != null) {
                c0e5sR5.da0(TrackShowType.VIDEOEFFECT);
            }
        }
    }

    public static final void onChanged$36(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        LiveState<TrackShowType> liveStateQ82;
        C0E5S c0e5sR5 = ((C0EGB) aObserverS170S0200000_5.l0).R5();
        if (c0e5sR5 != null && (liveStateQ82 = c0e5sR5.Q82()) != null) {
            liveStateQ82.LIZJ();
        }
        C351220Dpo.LJJIJLIJ(C350870DpF.LJI((C0E48) aObserverS170S0200000_5.l1)).isEmpty();
    }

    public static final void onChanged$37(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        TuxIconDrawable tuxIconDrawableLJJIJL;
        int iLIZ;
        int iLIZ2;
        Boolean bool = (Boolean) obj;
        InterfaceC359850E8x interfaceC359850E8xK4 = ((C0EGB) aObserverS170S0200000_5.l0).K4();
        if (interfaceC359850E8xK4 != null) {
            C0E48 c0e48 = (C0E48) aObserverS170S0200000_5.l1;
            C0EGB c0egb = (C0EGB) aObserverS170S0200000_5.l0;
            if (bool.booleanValue()) {
                C361980EHc c361980EHcLJ = interfaceC359850E8xK4.LJ("bottom_item_root_sound_sync");
                if (c361980EHcLJ != null && c361980EHcLJ.LJII) {
                    return;
                }
                interfaceC359850E8xK4.LJIILLIIL("bottom_item_root_sound_sync");
                MutableLiveData mutableLiveDataLIZ = c0e48.S7().LIZ("status_music_sync_on");
                if (mutableLiveDataLIZ == null || !Intrinsics.LJFF(mutableLiveDataLIZ.getValue(), Boolean.TRUE)) {
                    return;
                }
                if (C0EJA.LJI()) {
                    Activity activityLJII = C1664590tQ1.LJII(c0egb);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    Integer numLIZ = C0EJA.LIZ();
                    if (numLIZ != null) {
                        iLIZ = C0EGK.LIZ(numLIZ.intValue());
                    } else {
                        iLIZ = C0EGK.LIZ(28);
                    }
                    c419910GdJ.LIZIZ = iLIZ;
                    Integer numLIZ2 = C0EJA.LIZ();
                    if (numLIZ2 != null) {
                        iLIZ2 = C0EGK.LIZ(numLIZ2.intValue());
                    } else {
                        iLIZ2 = C0EGK.LIZ(28);
                    }
                    c419910GdJ.LIZJ = iLIZ2;
                    c419910GdJ.LIZ = R.raw.icon_color_right_bottom_checkbox;
                    interfaceC359850E8xK4.LIZ(c419910GdJ.LIZ(activityLJII), "bottom_item_root_sound_sync");
                    return;
                }
                interfaceC359850E8xK4.LJIJ(C800330VaR.LIZIZ(c0egb.L7(), R.drawable.boj));
                return;
            }
            if (C0EJA.LJI()) {
                tuxIconDrawableLJJIJL = C357540E0a.LJJIL(c0egb.L7(), R.raw.icon_color_sound_sync, true);
            } else {
                tuxIconDrawableLJJIJL = C357540E0a.LJJIJL(R.raw.icon_arrow_circle_fill, c0egb.L7());
            }
            interfaceC359850E8xK4.LIZ(null, "bottom_item_root_sound_sync");
            interfaceC359850E8xK4.LJIJ(tuxIconDrawableLJJIJL);
            interfaceC359850E8xK4.LJIIIZ("bottom_item_root_sound_sync");
        }
    }

    public static final void onChanged$38(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        boolean zContains;
        NLETrackSlot nLETrackSlotLLLLLLIL = ((C0E48) aObserverS170S0200000_5.l0).LLLLLLIL();
        if (nLETrackSlotLLLLLLIL != null) {
            boolean zLJIIJJI = C354090DuR.LJIIJJI();
            VecNLETrackSlotSPtr slots = ((C0E48) aObserverS170S0200000_5.l0).Rn().getSlots();
            if (slots != null) {
                zContains = slots.contains(nLETrackSlotLLLLLLIL);
            } else {
                zContains = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initAimattingView legacy effectReady = ");
            sbLIZ.append(zLJIIJJI);
            sbLIZ.append(" isInMainTrack=");
            sbLIZ.append(zContains);
            C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ));
            C0E0S c0e0s = C0E0S.LIZ;
            C19EG c19egLJ = C12WG.LJ(((C0EGB) aObserverS170S0200000_5.l1).LLILZ);
            InterfaceC359850E8x interfaceC359850E8xK4 = ((C0EGB) aObserverS170S0200000_5.l1).K4();
            c0e0s.getClass();
            C0E0S.LJFF(c19egLJ, interfaceC359850E8xK4, nLETrackSlotLLLLLLIL, zContains);
        }
    }

    public static final void onChanged$39(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        View view;
        View view2;
        NLEAIMatting aIMatting;
        VecNLETrackSlotSPtr slots;
        View view3;
        Float f;
        C0E6Y c0e6y;
        C1295960jpS c1295960jpS;
        C354150DuX c354150DuX = (C354150DuX) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EDITING_MATTING_STATUS ");
        sbLIZ.append(c354150DuX.LIZIZ);
        C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ));
        C350870DpF.LJIIJ((C0E48) aObserverS170S0200000_5.l0, "editing_matting_task_ready", Boolean.TRUE);
        boolean zContains = false;
        String extra = null;
        if (c354150DuX.LIZIZ == 1 && (f = c354150DuX.LIZLLL) != null && f.floatValue() > 0.0f) {
            CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
            if (!C354090DuR.LJIIIZ((C0E48) aObserverS170S0200000_5.l0).isEmpty()) {
                Float f2 = c354150DuX.LIZLLL;
                if (f2 != null) {
                    C0EGB c0egb = (C0EGB) aObserverS170S0200000_5.l1;
                    C0E48 c0e48 = (C0E48) aObserverS170S0200000_5.l0;
                    float fFloatValue = f2.floatValue();
                    C0E6Y c0e6y2 = c0egb.LLJ;
                    if (c0e6y2 != null) {
                        C337180DJs.LIZJ(c0e6y2.LIZLLL);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append((int) (fFloatValue * 100));
                        sbLIZ2.append('%');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        TuxTextView tuxTextView = c0e6y2.LIZIZ;
                        if (tuxTextView != null) {
                            C01GW<C365840EVy> c01gw = C365840EVy.LIZIZ;
                            tuxTextView.setText(C351010DpT.LIZ().LIZ().getString(2131830442, strLIZIZ));
                        }
                    }
                    String str = c354150DuX.LIZ;
                    NLETrackSlot nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
                    if (nLETrackSlotLLLLLLIL != null) {
                        extra = nLETrackSlotLLLLLLIL.getUUID();
                    }
                    if (Intrinsics.LJFF(str, extra) && (c0e6y = c0egb.LLJ) != null && (c1295960jpS = c0e6y.LJ) != null) {
                        C786410Ut5.LJLLLLLL(0, c1295960jpS);
                        if (!c1295960jpS.isAnimating()) {
                            c1295960jpS.playAnimation();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        int i = c354150DuX.LIZIZ;
        if (i == 3) {
            C0E6Y c0e6y3 = ((C0EGB) aObserverS170S0200000_5.l1).LLJ;
            if (c0e6y3 != null && (view3 = c0e6y3.LIZLLL) != null) {
                C337180DJs.LIZ(view3);
            }
            C0E6Y c0e6y4 = ((C0EGB) aObserverS170S0200000_5.l1).LLJ;
            if (c0e6y4 == null) {
                return;
            }
            c0e6y4.LIZ();
            return;
        }
        if (i == 2) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("current taskID = ");
            sbLIZ3.append(c354150DuX.LIZ);
            C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ3));
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("current tasks = ");
            CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet2 = C354090DuR.LIZ;
            sbLIZ4.append(C13LP.LJJLIIIJ(C354090DuR.LJIIIZ((C0E48) aObserverS170S0200000_5.l0), ":", null, null, 0, null, null, 62));
            C355090Dw3.LIZIZ("-----AIMattingManager", C2188811AlT.LIZIZ(sbLIZ4));
            if (c354150DuX.LIZJ) {
                C15L2.LIZ(((C0EGB) aObserverS170S0200000_5.l1).LLILZ.requireActivity(), ((C0EGB) aObserverS170S0200000_5.l1).LLILZ.getString(2131830440));
            }
            VideoPublishEditModel videoPublishEditModelB3 = ((C0EGB) aObserverS170S0200000_5.l1).B3();
            if (videoPublishEditModelB3 != null) {
                C0E48 c0e482 = (C0E48) aObserverS170S0200000_5.l0;
                NLEModel nLEModelLJI = C350870DpF.LJI(c0e482);
                String str2 = c354150DuX.LIZ;
                if (str2 == null) {
                    str2 = "";
                }
                NLETrackSlot nLETrackSlotLJL = C351220Dpo.LJL(nLEModelLJI, str2);
                if (nLETrackSlotLJL == null) {
                    nLETrackSlotLJL = c0e482.LLLLLLIL();
                }
                NLETrack nLETrackRn = c0e482.Rn();
                if (nLETrackRn != null && (slots = nLETrackRn.getSlots()) != null) {
                    zContains = slots.contains(nLETrackSlotLJL);
                }
                if (nLETrackSlotLJL != null && (aIMatting = nLETrackSlotLJL.getAIMatting()) != null && (extra = aIMatting.getExtra("ai_matting_from")) == null) {
                    extra = "click_button";
                }
                boolean zLJFF = Intrinsics.LJFF(extra, "long_press");
                if (nLETrackSlotLJL != null) {
                    C0EI4 c0ei4 = C0EI4.LIZ;
                    long jLJ = C354090DuR.LJ(c0e482, nLETrackSlotLJL.getUUID());
                    C0EI5 c0ei5 = C0EI5.AUTO_CUTOUT;
                    c0ei4.getClass();
                    C0EI4.LIZJ(videoPublishEditModelB3, zLJFF, zContains, jLJ, c0ei5, "");
                }
            }
            C0E6Y c0e6y5 = ((C0EGB) aObserverS170S0200000_5.l1).LLJ;
            if (c0e6y5 != null && (view2 = c0e6y5.LIZLLL) != null) {
                C337180DJs.LIZ(view2);
            }
            C0E6Y c0e6y6 = ((C0EGB) aObserverS170S0200000_5.l1).LLJ;
            if (c0e6y6 == null) {
                return;
            }
            c0e6y6.LIZ();
            return;
        }
        if (i != 10) {
            return;
        }
        C15L2.LIZ(((C0EGB) aObserverS170S0200000_5.l1).LLILZ.requireActivity(), ((C0EGB) aObserverS170S0200000_5.l1).LLILZ.getString(2131830441));
        C0E6Y c0e6y7 = ((C0EGB) aObserverS170S0200000_5.l1).LLJ;
        if (c0e6y7 != null && (view = c0e6y7.LIZLLL) != null) {
            C337180DJs.LIZ(view);
        }
        C0E6Y c0e6y8 = ((C0EGB) aObserverS170S0200000_5.l1).LLJ;
        if (c0e6y8 == null) {
            return;
        }
        c0e6y8.LIZ();
    }

    public static final void onChanged$4(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        MutableLiveData<Unit> mutableLiveDataNv2;
        ((C0EBX) aObserverS170S0200000_5.l0).LLLLLILLIL((String) obj);
        C0EBZ c0ebz = (C0EBZ) aObserverS170S0200000_5.l1;
        if (c0ebz != null && (mutableLiveDataNv2 = c0ebz.nv2()) != null) {
            mutableLiveDataNv2.setValue(Unit.LIZ);
        }
    }

    public static final void onChanged$40(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        float recordVolume;
        InterfaceC1452170ntP interfaceC1452170ntP = (InterfaceC1452170ntP) obj;
        VideoLengthChecker videoLengthChecker = (VideoLengthChecker) aObserverS170S0200000_5.l0;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aObserverS170S0200000_5.l1;
        videoLengthChecker.getClass();
        if (interfaceC1452170ntP != null) {
            ((IEditVideoInfoService) ServiceManager.get().getService(IEditVideoInfoService.class)).setVideoLength(videoPublishEditModel.getCreationId(), interfaceC1452170ntP.getDuration());
            IEditVideoInfoService iEditVideoInfoService = (IEditVideoInfoService) ServiceManager.get().getService(IEditVideoInfoService.class);
            String creationId = videoPublishEditModel.getCreationId();
            float voiceVolume = videoPublishEditModel.getVoiceVolume();
            float musicVolume = videoPublishEditModel.getMusicVolume();
            AudioRecorderParam veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
            if (veAudioRecorderParam != null) {
                recordVolume = veAudioRecorderParam.getRecordVolume();
            } else {
                recordVolume = 0.0f;
            }
            iEditVideoInfoService.setVideoInfoData(creationId, new VideoInfoData(voiceVolume, musicVolume, recordVolume));
        }
    }

    public static final void onChanged$41(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        if (obj != null) {
            ((Observer) aObserverS170S0200000_5.l0).onChanged(obj);
            ((LiveData) aObserverS170S0200000_5.l1).removeObserver(aObserverS170S0200000_5);
        }
    }

    public static final void onChanged$42(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        ((Observer) aObserverS170S0200000_5.l0).onChanged(obj);
        ((LiveData) aObserverS170S0200000_5.l1).removeObserver(aObserverS170S0200000_5);
    }

    public static final void onChanged$43(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        String str;
        EditorProSchemeModel editorProSchemeModel;
        EPAnchorData ePAnchorData;
        C0E2C c0e2c = (C0E2C) obj;
        if (c0e2c != null) {
            C362330EIl c362330EIl = (C362330EIl) aObserverS170S0200000_5.l0;
            Function0 function0 = (Function0) aObserverS170S0200000_5.l1;
            if (Intrinsics.LJFF("magic_panel", c0e2c.LIZJ) && !c0e2c.LIZ) {
                VideoPublishEditModel videoPublishEditModel = c362330EIl.LIZIZ;
                if (videoPublishEditModel != null && (editorProSchemeModel = videoPublishEditModel.creativeModel.editorProSchemeModel) != null && (ePAnchorData = editorProSchemeModel.anchorData) != null) {
                    str = ePAnchorData.editorProAnchorType;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, "magic")) {
                    C354270Duj.LIZ(200L, new AwS549S0100000_5(function0, (Function0<Unit>) 1690));
                }
            }
        }
    }

    public static final void onChanged$5(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        String strR5;
        String str = (String) obj;
        ((C360470EBh) aObserverS170S0200000_5.l0).W6(str);
        if (!a0.LJJJIL(str) && (strR5 = ((C360470EBh) aObserverS170S0200000_5.l0).R5(str)) != null && !a0.LJJJIL(strR5)) {
            ((C360470EBh) aObserverS170S0200000_5.l0).E5(strR5);
            ((C0EBZ) aObserverS170S0200000_5.l1).k8(strR5);
        }
    }

    public static final void onChanged$6(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        ((C360470EBh) aObserverS170S0200000_5.l0).n7(((C0EBZ) aObserverS170S0200000_5.l1).O60().getValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$7(Y.AObserverS170S0200000_5 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS170S0200000_5.onChanged$7(Y.AObserverS170S0200000_5, java.lang.Object):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x015b, code lost:
    
        r7.add(r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$8(Y.AObserverS170S0200000_5 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS170S0200000_5.onChanged$8(Y.AObserverS170S0200000_5, java.lang.Object):void");
    }

    public static final void onChanged$9(AObserverS170S0200000_5 aObserverS170S0200000_5, Object obj) {
        boolean z;
        String uuid;
        String uuid2;
        NLECommit head;
        String uuid3;
        NLECommit head2;
        NLECommit head3;
        NLETrackSlot nLETrackSlot = ((C351080Dpa) obj).LIZ;
        if (nLETrackSlot != null && !Intrinsics.LJFF(((C0EOX) aObserverS170S0200000_5.l0).m6().LLJI, nLETrackSlot)) {
            ((C0EOX) aObserverS170S0200000_5.l0).m6().LLJI = nLETrackSlot;
            ((C0EOX) aObserverS170S0200000_5.l0).i3(new AwS584S0100000_5(nLETrackSlot, 654));
            if (!C0E5J.LIZJ(nLETrackSlot) && !C0E5J.LIZLLL(nLETrackSlot)) {
                z = true;
            } else {
                z = false;
            }
            ((C0EOX) aObserverS170S0200000_5.l0).i3(new AwS20S0010000_5(z, 32));
            NLEEditor nLEEditorLJFF = C350870DpF.LJFF((C0E48) aObserverS170S0200000_5.l1);
            C0EOX c0eox = (C0EOX) aObserverS170S0200000_5.l0;
            String str = c0eox.m6().LLJIJIL;
            NLEBranch branch = nLEEditorLJFF.getBranch();
            if (branch != null && (head3 = branch.getHead()) != null) {
                uuid = head3.getUUID();
            } else {
                uuid = null;
            }
            nLEEditorLJFF.trimRange(str, uuid);
            C363780EOa c363780EOaM6 = c0eox.m6();
            NLEBranch branch2 = nLEEditorLJFF.getBranch();
            String str2 = "";
            if (branch2 == null || (head2 = branch2.getHead()) == null || (uuid2 = head2.getUUID()) == null) {
                uuid2 = "";
            }
            c363780EOaM6.LLJIJIL = uuid2;
            InterfaceC360800ECo interfaceC360800ECoN5 = c0eox.N5();
            if (interfaceC360800ECoN5 != null) {
                NLEBranch branch3 = nLEEditorLJFF.getBranch();
                if (branch3 != null && (head = branch3.getHead()) != null && (uuid3 = head.getUUID()) != null) {
                    str2 = uuid3;
                }
                interfaceC360800ECoN5.Wh1(str2, true);
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS170S0200000_5(X.C358790E4v r2, X.C0E48 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 22: goto Le;
                case 23: goto Le;
                case 24: goto Le;
                case 25: goto L5;
                case 26: goto L5;
                case 27: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS170S0200000_5.<init>(X.0E4v, X.0E48, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS170S0200000_5(X.C0EGB r2, X.C0E48 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 31: goto Le;
                case 38: goto Le;
                case 39: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS170S0200000_5.<init>(X.0EGB, X.0E48, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS170S0200000_5(X.C0E2P r2, X.InterfaceC355120Dw6 r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 10: goto Le;
                case 11: goto L5;
                case 12: goto Le;
                case 13: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS170S0200000_5.<init>(X.0E2P, X.0Dw6, int):void");
    }

    public AObserverS170S0200000_5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}

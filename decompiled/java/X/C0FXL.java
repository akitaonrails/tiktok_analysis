package X;

import android.graphics.PointF;
import android.text.Editable;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.editorpro.capabilities.effects.videoanim.ui.VideoAnimFragment;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.common.SpeedViewModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.curve.CurveSpeedEditFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0FXL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FXL extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FXL(C347660Dk4 c347660Dk4, int i) {
        super(4);
        this.$t = i;
        this.l0 = c347660Dk4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FXL(C0F6O c0f6o, int i) {
        super(4);
        this.$t = i;
        this.l0 = c0f6o;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FXL(C0FEY c0fey, int i) {
        super(4);
        this.$t = i;
        this.l0 = c0fey;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FXL(VideoAnimFragment videoAnimFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = videoAnimFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FXL(CurveSpeedEditFragment curveSpeedEditFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = curveSpeedEditFragment;
    }

    public static final Object invoke$0(C0FXL c0fxl, Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((Number) obj3).intValue();
        ((Number) obj4).intValue();
        ((C0FEY) c0fxl.l0).LJJJLZIJ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(C0FXL c0fxl, Object obj, Object obj2, Object obj3, Object obj4) throws Throwable {
        int iIntValue = ((Number) obj3).intValue();
        int iIntValue2 = ((Number) obj4).intValue();
        Editable editableK = C2204961BRm.K(((C0F6O) c0fxl.l0).LLIZLLLIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhj9fHnYUJBf+25L2uSsYY/FqqbA9yL9IG", null));
        if (editableK == null) {
            return null;
        }
        if (obj != null) {
            editableK.setSpan(obj, iIntValue, iIntValue2, 34);
        }
        if (obj2 != null) {
            editableK.setSpan(obj2, iIntValue, iIntValue2, 34);
        }
        return editableK;
    }

    public static final Object invoke$2(C0FXL c0fxl, Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        long jLongValue3 = ((Number) obj3).longValue();
        long jLongValue4 = ((Number) obj4).longValue();
        C347660Dk4 c347660Dk4 = (C347660Dk4) c0fxl.l0;
        c347660Dk4.LJFF = jLongValue;
        c347660Dk4.LJI = jLongValue2;
        c347660Dk4.LIZLLL = jLongValue3;
        c347660Dk4.LJ = jLongValue4;
        return Unit.LIZ;
    }

    public static final Object invoke$3(C0FXL c0fxl, Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj).longValue();
        long jLongValue2 = ((Number) obj2).longValue();
        long jLongValue3 = ((Number) obj3).longValue();
        long jLongValue4 = ((Number) obj4).longValue();
        C347660Dk4 c347660Dk4 = (C347660Dk4) c0fxl.l0;
        c347660Dk4.LJFF = jLongValue;
        c347660Dk4.LJI = jLongValue2;
        c347660Dk4.LIZLLL = jLongValue3;
        c347660Dk4.LJ = jLongValue4;
        return Unit.LIZ;
    }

    public static final Object invoke$4(C0FXL c0fxl, Object obj, Object obj2, Object obj3, Object obj4) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLETrack nLETrackPt;
        NLEVideoAnimation next;
        NLEEditor nLEEditorLJI;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEEditor nLEEditorLJI2;
        boolean zLLLIIII;
        float fFloatValue = ((Number) obj).floatValue();
        float fFloatValue2 = ((Number) obj2).floatValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        C0E48 c0e48 = ((VideoAnimFragment) c0fxl.l0).LL;
        if (c0e48 != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
            VideoAnimFragment videoAnimFragment = (VideoAnimFragment) c0fxl.l0;
            nLETrackSlotLLLLLLIL.setExtra("key_is_use_anim_new_ui", String.valueOf(true));
            VecNLEVideoAnimationSPtr videoAnims = nLETrackSlotLLLLLLIL.getVideoAnims();
            if (videoAnims != null) {
                Iterator<NLEVideoAnimation> it2 = videoAnims.iterator();
                while (true) {
                    nLETrackPt = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        NLEVideoAnimation nLEVideoAnimation = next;
                        if (obj4 == EnumC360750ECj.ENTER) {
                            zLLLIIII = C351220Dpo.LLJJJJLIIL(nLEVideoAnimation);
                        } else if (obj4 == EnumC360750ECj.COMBO) {
                            zLLLIIII = C351220Dpo.LLJIJIL(nLEVideoAnimation);
                        } else {
                            zLLLIIII = C351220Dpo.LLLIIII(nLEVideoAnimation);
                        }
                        if (zLLLIIII) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                NLEVideoAnimation nLEVideoAnimation2 = next;
                if (nLEVideoAnimation2 != null) {
                    videoAnimFragment.getClass();
                    C351510DqH c351510DqH = C351510DqH.LIZ;
                    C0E48 c0e482 = videoAnimFragment.LL;
                    if (c0e482 != null) {
                        nLETrackPt = c0e482.Pt();
                    }
                    c351510DqH.getClass();
                    long jLJJIJ = C351510DqH.LJJIJ(nLETrackPt, nLETrackSlotLLLLLLIL);
                    float f = jLJJIJ;
                    float fLJJIIZI = C351510DqH.LJJIIZI(nLETrackSlotLLLLLLIL) - jLJJIJ;
                    nLEVideoAnimation2.setStartTime((long) ((fFloatValue * fLJJIIZI) + f));
                    nLEVideoAnimation2.setEndTime((long) (f + (fLJJIIZI * fFloatValue2)));
                    String str = "";
                    if (!zBooleanValue) {
                        C0E1X c0e1x = new C0E1X(C0E1V.ADJUST_VIDEO_ANIM.getNameId(), null, null, null, null, 30);
                        String strLJIJ = C351220Dpo.LJIJ(nLEVideoAnimation2);
                        if (strLJIJ != null) {
                            str = strLJIJ;
                        }
                        C350800Dp8 c350800Dp8 = new C350800Dp8(nLETrackSlotLLLLLLIL, str);
                        C0E48 c0e483 = videoAnimFragment.LL;
                        if (c0e483 != null && (nLEEditorLJI2 = c0e483.LLFII().LJI()) != null) {
                            C350410DoV.LIZLLL(nLEEditorLJI2, true, C051R.LIZIZ(c0e1x), false, true);
                        }
                        C0E48 c0e484 = videoAnimFragment.LL;
                        if (c0e484 != null && (interfaceC351350Dq1LLFII = c0e484.LLFII()) != null) {
                            interfaceC351350Dq1LLFII.LIZ(c350800Dp8);
                        }
                    } else {
                        String strLJIJ2 = C351220Dpo.LJIJ(nLEVideoAnimation2);
                        if (strLJIJ2 != null) {
                            str = strLJIJ2;
                        }
                        videoAnimFragment.AT(str);
                        C0E48 c0e485 = videoAnimFragment.LL;
                        if (c0e485 != null && (nLEEditorLJI = c0e485.LLFII().LJI()) != null) {
                            nLEEditorLJI.commit();
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$5(C0FXL c0fxl, Object obj, Object obj2, Object obj3, Object obj4) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        boolean z;
        float f;
        C0E55 player;
        C0E55 player2;
        float fFloatValue = ((Number) obj).floatValue();
        List<? extends PointF> list = (List) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        if (zBooleanValue) {
            ((AbstractC370530Efr) ((CurveSpeedEditFragment) c0fxl.l0).LLLIIL.getValue()).LJJIIJ();
            ((SpeedViewModel) ((CurveSpeedEditFragment) c0fxl.l0).wS()).applyCurveSpeed(list);
            C0E48 c0e48 = ((CurveSpeedEditFragment) c0fxl.l0).LL;
            if (c0e48 != null && (player2 = c0e48.getPlayer()) != null) {
                player2.skipNextSeek(true);
            }
            C0E48 c0e482 = ((CurveSpeedEditFragment) c0fxl.l0).LL;
            if (c0e482 != null) {
                C350870DpF.LIZ(c0e482, false);
            }
            C0E48 c0e483 = ((CurveSpeedEditFragment) c0fxl.l0).LL;
            if (c0e483 != null && (player = c0e483.getPlayer()) != null) {
                player.skipNextSeek(false);
            }
            ((CurveSpeedEditFragment) c0fxl.l0).qT(true);
            CurveSpeedEditFragment curveSpeedEditFragment = (CurveSpeedEditFragment) c0fxl.l0;
            curveSpeedEditFragment.LLLIILIL = true;
            C0E48 c0e484 = curveSpeedEditFragment.LL;
            if (c0e484 != null && (nLETrackSlotLLLLLLIL = c0e484.LLLLLLIL()) != null) {
                CurveSpeedEditFragment curveSpeedEditFragment2 = (CurveSpeedEditFragment) c0fxl.l0;
                if (nLETrackSlotLLLLLLIL.getDuration() < 100000) {
                    z = true;
                } else {
                    z = false;
                }
                TuxIconView tuxIconViewKT = curveSpeedEditFragment2.kT();
                float f2 = 0.4f;
                if (tuxIconViewKT != null) {
                    if (z) {
                        f = 0.4f;
                    } else {
                        f = 1.0f;
                    }
                    C786410Ut5.x5(tuxIconViewKT, f);
                }
                TuxTextView tuxTextViewCS = curveSpeedEditFragment2.cS();
                if (tuxTextViewCS != null) {
                    if (!z) {
                        f2 = 1.0f;
                    }
                    C786410Ut5.B5(tuxTextViewCS, f2);
                }
                if (zBooleanValue2 && curveSpeedEditFragment2.LLLJ && !z) {
                    ((SpeedViewModel) curveSpeedEditFragment2.wS()).seekToFromSegDelta(0.0f, true);
                } else {
                    ((SpeedViewModel) curveSpeedEditFragment2.wS()).seekToFromSegDelta(fFloatValue, false);
                }
            }
        } else {
            C351510DqH.LIZ.getClass();
            ((SpeedViewModel) ((CurveSpeedEditFragment) c0fxl.l0).wS()).updateCurrentCurveSpeedInfoBySpeed(C351510DqH.LJJJIL(list));
        }
        return Unit.LIZ;
    }
}

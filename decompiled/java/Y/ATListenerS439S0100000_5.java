package Y;

import X.AbstractC388060FJk;
import X.C01TT;
import X.C0EHL;
import X.C0ETK;
import X.C0EUR;
import X.C0F28;
import X.C0FBI;
import X.C0FS1;
import X.C0FS2;
import X.C0FS5;
import X.C0FU0;
import X.C1390380mHk;
import X.C1619980sG4;
import X.C19EG;
import X.C293810BfP;
import X.C357280Dza;
import X.C370330EfX;
import X.C370390Efd;
import X.C374770Emh;
import X.C374780Emi;
import X.C385880FBa;
import X.C390250FRv;
import X.C786410Ut5;
import X.InterfaceC360570EBr;
import X.InterfaceC361710EGb;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.SpeedFragment;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.curve.CurveSpeedFragment;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public class ATListenerS439S0100000_5 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case BdTuring.TYPE_ECAF /* 9 */:
                return onTouch$9(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return onTouch$10(this, view, motionEvent);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return onTouch$11(this, view, motionEvent);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return onTouch$12(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS439S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS439S0100000_5 aTListenerS439S0100000_5, View view, MotionEvent motionEvent) {
        C370330EfX c370330EfX = (C370330EfX) aTListenerS439S0100000_5.l0;
        C370390Efd c370390Efd = c370330EfX.LLJJIII;
        SmartImageView smartImageView = c370330EfX.LLILZIL;
        c370390Efd.getClass();
        if (motionEvent != null) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1 && action != 3) {
                    return false;
                }
                smartImageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
                return false;
            }
            smartImageView.animate().scaleX(0.9f).scaleY(0.9f).setDuration(100L).start();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS439S0100000_5 aTListenerS439S0100000_5, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            C0FS2 c0fs2 = (C0FS2) aTListenerS439S0100000_5.l0;
            C390250FRv c390250FRv = c0fs2.LIZJ;
            if (c390250FRv.LJII) {
                boolean z = C0FS1.LLJJIJIIJIL;
                if (C0FS1.LLJJIJIIJIL) {
                    c390250FRv.LJII = false;
                    c0fs2.LJIIIIZZ.LIZLLL(AFwS234S0000000_5.get$arr$(100), true);
                    ((C0FS2) aTListenerS439S0100000_5.l0).LIZJ.LJIIJ = C0FS5.MANUAL;
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$10(ATListenerS439S0100000_5 aTListenerS439S0100000_5, View view, MotionEvent motionEvent) {
        if (!((AbstractC388060FJk) aTListenerS439S0100000_5.l0).L5().LJ) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return true;
            }
            view.performClick();
            view.animate().setDuration(200L).scaleX(1.0f).scaleY(1.0f).setInterpolator(C1619980sG4.LIZLLL()).start();
            return true;
        }
        view.animate().setDuration(200L).scaleX(1.2f).scaleY(1.2f).setInterpolator(C1619980sG4.LIZLLL()).start();
        return true;
    }

    public static final boolean onTouch$11(ATListenerS439S0100000_5 aTListenerS439S0100000_5, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                ((DTResourcePanelFragment) aTListenerS439S0100000_5.l0).LLJLL = motionEvent.getRawY();
            } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                float rawY = motionEvent.getRawY();
                DTResourcePanelFragment dTResourcePanelFragment = (DTResourcePanelFragment) aTListenerS439S0100000_5.l0;
                if (rawY - dTResourcePanelFragment.LLJLL > dTResourcePanelFragment.LLJLLIL) {
                    dTResourcePanelFragment.GS();
                    return true;
                }
            }
        }
        return true;
    }

    public static final boolean onTouch$12(ATListenerS439S0100000_5 aTListenerS439S0100000_5, View view, MotionEvent motionEvent) {
        IPreviewService iPreviewServiceLIZ;
        InterfaceC361710EGb previewPanelApi;
        float width;
        boolean z;
        if (((DTResourcePanelFragment) aTListenerS439S0100000_5.l0).iS() && (iPreviewServiceLIZ = C357280Dza.LIZ()) != null && (previewPanelApi = iPreviewServiceLIZ.getPreviewPanelApi()) != null) {
            DTResourcePanelFragment dTResourcePanelFragment = (DTResourcePanelFragment) aTListenerS439S0100000_5.l0;
            Size sizeLIZJ = previewPanelApi.getCanvasSize().LIZJ();
            if (sizeLIZJ != null) {
                width = sizeLIZJ.getWidth();
            } else {
                width = 0.0f;
            }
            float fLIZ = C0FU0.LIZ(previewPanelApi.W02());
            float fLIZJ = C0FU0.LIZJ(C0EHL.LIZ());
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f = (fLIZJ - width) / 2;
            C0F28 c0f28 = new C0F28(0.0f, f);
            C0F28 c0f282 = new C0F28(f + width, fLIZJ);
            C0F28 c0f283 = new C0F28(fLIZ, view.getMeasuredHeight() - dTResourcePanelFragment.sS());
            if (!c0f28.LIZJ(Float.valueOf(rawX)) && !c0f282.LIZJ(Float.valueOf(rawX))) {
                z = false;
            } else {
                z = true;
            }
            if ((0.0f <= rawY && rawY <= fLIZ) || (c0f283.LIZJ(Float.valueOf(rawY)) && z)) {
                if (motionEvent.getAction() == 1) {
                    dTResourcePanelFragment.GS();
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS439S0100000_5 aTListenerS439S0100000_5, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return true;
            }
            if (C293810BfP.LIZ()) {
                C786410Ut5.T4(view, 1.0f);
            }
            ((C0EUR) aTListenerS439S0100000_5.l0).LLLLIL().LJFF();
            return true;
        }
        if (C293810BfP.LIZ()) {
            C786410Ut5.T4(view, 0.55f);
        }
        ((C0EUR) aTListenerS439S0100000_5.l0).LLLLIL().LJII();
        return true;
    }

    public static final boolean onTouch$3(ATListenerS439S0100000_5 aTListenerS439S0100000_5, View view, MotionEvent motionEvent) {
        Function0<Unit> function0;
        if (!((C374770Emh) aTListenerS439S0100000_5.l0).getEnableTouchEvent()) {
            return false;
        }
        C374770Emh c374770Emh = (C374770Emh) aTListenerS439S0100000_5.l0;
        c374770Emh.getClass();
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                    c374770Emh.LLJILJILJ = false;
                    c374770Emh.LLJILJIL = new PointF();
                } else {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    float fAbs = Math.abs(x - c374770Emh.LLJILLL);
                    float fAbs2 = Math.abs(y - c374770Emh.LLJJ);
                    float fSqrt = (float) Math.sqrt((fAbs * fAbs) + (fAbs2 * fAbs2));
                    if (!c374770Emh.LLJILJILJ) {
                        if (fSqrt > c374770Emh.LLJJI) {
                            c374770Emh.LLJILJILJ = true;
                            Function1<? super Function0<Unit>, Unit> function1 = c374770Emh.LLIZLLLIL;
                            if (function1 != null) {
                                function1.invoke(new C374780Emi(c374770Emh, x, y));
                            }
                        }
                    } else {
                        c374770Emh.LIZIZ(x, y);
                        c374770Emh.LIZLLL();
                    }
                }
            } else {
                if (c374770Emh.LLJILJILJ && (function0 = c374770Emh.LLIZ) != null) {
                    function0.invoke();
                }
                c374770Emh.LLJILJILJ = false;
                c374770Emh.LLJILJIL = new PointF();
            }
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float left = c374770Emh.LLILLJJLI.getLeft() + c374770Emh.LLILLJJLI.getTranslationX();
            float top = c374770Emh.LLILLJJLI.getTop() + c374770Emh.LLILLJJLI.getTranslationY();
            float right = c374770Emh.LLILLJJLI.getRight() + c374770Emh.LLILLJJLI.getTranslationX();
            float bottom = c374770Emh.LLILLJJLI.getBottom() + c374770Emh.LLILLJJLI.getTranslationY();
            if (x2 < left || x2 > right || y2 < top || y2 > bottom) {
                return false;
            }
            c374770Emh.LLJILLL = motionEvent.getX();
            c374770Emh.LLJJ = motionEvent.getY();
            c374770Emh.LLJILJILJ = false;
            PointF pointF = c374770Emh.LLJIJIL;
            c374770Emh.LLJILJIL = new PointF(pointF.x - c374770Emh.LLJILLL, pointF.y - c374770Emh.LLJJ);
        }
        return true;
    }

    public static final boolean onTouch$4(ATListenerS439S0100000_5 aTListenerS439S0100000_5, View view, MotionEvent motionEvent) {
        C01TT.LIZJ(new AwS549S0100000_5((C385880FBa) aTListenerS439S0100000_5.l0, 669));
        return false;
    }

    public static final boolean onTouch$5(ATListenerS439S0100000_5 aTListenerS439S0100000_5, View view, MotionEvent motionEvent) {
        return !((CurveSpeedFragment) aTListenerS439S0100000_5.l0).LLJILJIL;
    }

    public static final boolean onTouch$6(ATListenerS439S0100000_5 aTListenerS439S0100000_5, View view, MotionEvent motionEvent) {
        Integer numValueOf;
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            if (numValueOf.intValue() == 0) {
                ((C0ETK) aTListenerS439S0100000_5.l0).LLJILJIL = motionEvent.getRawY();
            } else if (numValueOf.intValue() == 1 || numValueOf.intValue() == 3) {
                float rawY = motionEvent.getRawY();
                C0ETK c0etk = (C0ETK) aTListenerS439S0100000_5.l0;
                if (rawY - c0etk.LLJILJIL > c0etk.LLJILJILJ) {
                    c0etk.LLJJ.LJIIJ(Unit.LIZ);
                    return true;
                }
            }
        }
        return true;
    }

    public static final boolean onTouch$7(ATListenerS439S0100000_5 aTListenerS439S0100000_5, View view, MotionEvent motionEvent) {
        IPreviewService iPreviewServiceLIZ;
        InterfaceC361710EGb previewPanelApi;
        float width;
        int iNP;
        boolean z;
        Size sizeLIZJ;
        if (((C0ETK) aTListenerS439S0100000_5.l0).LLIZ.LIZIZ.invoke().booleanValue() && (iPreviewServiceLIZ = C357280Dza.LIZ()) != null && (previewPanelApi = iPreviewServiceLIZ.getPreviewPanelApi()) != null) {
            C0ETK c0etk = (C0ETK) aTListenerS439S0100000_5.l0;
            LiveState<Size> canvasSize = previewPanelApi.getCanvasSize();
            if (canvasSize != null && (sizeLIZJ = canvasSize.LIZJ()) != null) {
                width = sizeLIZJ.getWidth();
            } else {
                width = 0.0f;
            }
            float fLIZ = C0FU0.LIZ(previewPanelApi.W02());
            float fLIZJ = C0FU0.LIZJ(C0EHL.LIZ());
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f = (fLIZJ - width) / 2;
            C0F28 c0f28 = new C0F28(0.0f, f);
            C0F28 c0f282 = new C0F28(f + width, fLIZJ);
            InterfaceC360570EBr interfaceC360570EBrZ1 = c0etk.Z1();
            if (interfaceC360570EBrZ1 != null) {
                iNP = interfaceC360570EBrZ1.NP();
            } else {
                iNP = 0;
            }
            C0F28 c0f283 = new C0F28(fLIZ, view.getMeasuredHeight() - iNP);
            if (!c0f28.LIZJ(Float.valueOf(rawX)) && !c0f282.LIZJ(Float.valueOf(rawX))) {
                z = false;
            } else {
                z = true;
            }
            if ((0.0f <= rawY && rawY <= fLIZ) || (c0f283.LIZJ(Float.valueOf(rawY)) && z)) {
                if (motionEvent.getAction() == 1) {
                    c0etk.LLJJ.LJIIJ(Unit.LIZ);
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean onTouch$8(ATListenerS439S0100000_5 aTListenerS439S0100000_5, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        ((SpeedFragment) aTListenerS439S0100000_5.l0).lT().getHitRect(rect);
        ((SpeedFragment) aTListenerS439S0100000_5.l0).nT().getHitRect(rect2);
        ((SpeedFragment) aTListenerS439S0100000_5.l0).jT().getHitRect(rect3);
        if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && !rect2.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (rect3.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        } else {
            C19EG activity = ((SpeedFragment) aTListenerS439S0100000_5.l0).getActivity();
            if (activity != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131848682);
                C1390380mHk.LIZ(activity, 3018, creativeToastBuilder);
            }
        }
        return true;
    }

    public static final boolean onTouch$9(ATListenerS439S0100000_5 aTListenerS439S0100000_5, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 && action != 3) {
                return true;
            }
            ((C0FBI) aTListenerS439S0100000_5.l0).LLLLIL().LJIJJ.invoke(Boolean.FALSE);
            return true;
        }
        ((C0FBI) aTListenerS439S0100000_5.l0).LLLLIL().LJIJJ.invoke(Boolean.TRUE);
        return true;
    }
}

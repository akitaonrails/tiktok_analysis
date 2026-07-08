package X;

import Y.ACListenerS150S0100000_15;
import Y.AObserverS219S0100000_15;
import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.EditEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.NoticeBoardBoarderViewRotationEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.NoticeBoardBoarderViewScaleEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.ScrollEndEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.ShowDottedViewEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.MultiGuestBoardTemplateOfficialConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0bNf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class DialogC971210bNf extends AbstractDialogC962810bA7 {
    public static final float LLLIIII = C497740JfY.LIZIZ(24);
    public static final float LLLIIIIL = C497740JfY.LIZIZ(12);
    public final DataChannel LLJI;
    public final C953770avX LLJIJIL;
    public final Function0<Unit> LLJILJIL;
    public ViewGroup LLJILJILJ;
    public View LLJILLL;
    public C16FS LLJJ;
    public View LLJJI;
    public ViewGroup LLJJIII;
    public ViewGroup LLJJIJI;
    public View LLJJIJIIJIL;
    public TextView LLJJIJIL;
    public LiveDialog LLJJJ;
    public View LLJJJIL;
    public SurfaceView LLJJJJ;
    public C2260371Ddb LLJJJJJIL;
    public ViewGroup LLJJJJLIIL;
    public ViewGroup LLJJL;
    public ViewGroup LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public EditText LLJLIL;
    public View LLJLILLLLZIIL;
    public View LLJLL;
    public C1420790n4n LLJLLIL;
    public C1117360fBO LLJLLL;
    public final C971050bNP LLJZ;
    public final CopyOnWriteArrayList<C971330bNr> LLJZIJLIL;
    public C971330bNr LLL;
    public final MutableLiveData<EnumC953070auP> LLLF;
    public AObserverS219S0100000_15 LLLFF;
    public C415700GRs LLLFFI;
    public int LLLFZ;
    public int LLLI;
    public C971120bNW LLLII;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.gce;
    }

    public final boolean LJLIIIL() {
        return this.LLJZIJLIL.size() == 1 && a0.LJJJIL(this.LLJZIJLIL.get(0).LIZJ.LIZ);
    }

    public final void LJLIIL() {
        NLETrackSlot nLETrackSlot;
        if (this.LLJZIJLIL.size() == 1 && a0.LJJJIL(this.LLJZIJLIL.get(0).LIZJ.LIZ)) {
            this.LLLII = null;
        }
        C971120bNW c971120bNW = this.LLLII;
        if (c971120bNW != null) {
            for (C971330bNr c971330bNr : this.LLJZIJLIL) {
                String uuid = c971330bNr.LIZIZ.getUUID();
                C971330bNr c971330bNr2 = this.LLL;
                if (!Intrinsics.LJFF(uuid, (c971330bNr2 == null || (nLETrackSlot = c971330bNr2.LIZIZ) == null) ? null : nLETrackSlot.getUUID())) {
                    c971330bNr.LIZ.setState(EnumC971280bNm.INVISIBLE);
                    c971330bNr.LIZIZ.setEnable(true);
                }
            }
            c971120bNW.LJFF.LIZ.setState(EnumC971280bNm.INVISIBLE);
            this.LLJZ.LJIIJ(c971120bNW);
            ViewGroup viewGroup = this.LLJILJILJ;
            if (viewGroup != null) {
                HandlerHook.viewPostDelay(viewGroup, new ARunnableS115S0100000_15(c971120bNW, 18), 30L);
            }
        }
        this.LLLII = null;
    }

    public final void LJLIL() {
        NLETrackSlot nLETrackSlot;
        for (C971330bNr c971330bNr : this.LLJZIJLIL) {
            if (this.LLL != null) {
                String uuid = c971330bNr.LIZIZ.getUUID();
                C971330bNr c971330bNr2 = this.LLL;
                if (!Intrinsics.LJFF(uuid, (c971330bNr2 == null || (nLETrackSlot = c971330bNr2.LIZIZ) == null) ? null : nLETrackSlot.getUUID())) {
                    c971330bNr.LIZ.setState(EnumC971280bNm.INVISIBLE);
                }
            }
        }
    }

    @Override // X.C19GI, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (this.LLLF.getValue() == EnumC953070auP.INPUT) {
            this.LLLF.setValue(EnumC953070auP.TEXT_STYLE);
        }
        AObserverS219S0100000_15 aObserverS219S0100000_15 = this.LLLFF;
        if (aObserverS219S0100000_15 != null) {
            this.LLLF.removeObserver(aObserverS219S0100000_15);
        }
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLJZIJLIL.clear();
        C971050bNP c971050bNP = this.LLJZ;
        c971050bNP.getClass();
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C953890avj(c971050bNP, null), 3);
        NLEEditor nLEEditor = c971050bNP.LIZJ;
        if (nLEEditor != null) {
            nLEEditor.removeConsumer(c971050bNP.LJ);
        }
        c971050bNP.LJII.LJ();
        C19487111Lx c19487111Lx = c971050bNP.LJIIIIZZ;
        if (c19487111Lx != null) {
            c19487111Lx.dispose();
        }
        c971050bNP.LJIIIIZZ = null;
        super.dismiss();
    }

    @Override // X.C19GI, X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        C954080aw2 c954080aw2 = C954080aw2.LIZJ;
        if (!C954080aw2.LIZLLL) {
            C20441214yg.LJ("NoticeBoardDialog", "init sdk failed");
            return;
        }
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+mRsEIix6zmUcBwbyL0ej0znPyXhkjA4ffPpsTQ7PoQ4GWjdV0yrKhUusEuXq9fDWAeVB2D66SG+2sB8OJirK4=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/common/multicanvas/NoticeBoardBaseDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/common/multicanvas/NoticeBoardBaseDialog", "show", null, objArr, this, c0wzw, false);
            return;
        }
        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
        C19GI c19gi = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (C19GI) obj;
        super.show();
        c0wst.LIZ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/common/multicanvas/NoticeBoardBaseDialog", "show", null, objArr, c19gi, c0wzw, true);
    }

    public final C971330bNr LJLI(NLETrackSlot nLETrackSlot) {
        C971380bNw c971380bNw = new C971380bNw(getContext(), this.LLJI);
        LJL(nLETrackSlot, c971380bNw);
        this.LLJZ.getClass();
        int i = C953770avX.LJIILL;
        final C971330bNr c971330bNr = new C971330bNr(c971380bNw, nLETrackSlot, C971350bNt.LIZIZ(nLETrackSlot));
        c971380bNw.setAction(new InterfaceC971390bNx() { // from class: X.0bNi
            @Override // X.InterfaceC971390bNx
            public final void LIZ() {
                NLETrackSlot nLETrackSlotLIZ;
                this.LLJZ.LJIIIZ(EnumC971110bNV.DELETE, c971330bNr, null);
                C2260371Ddb c2260371Ddb = this.LLJJJJJIL;
                if (c2260371Ddb != null) {
                    C971380bNw c971380bNw2 = c971330bNr.LIZ;
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(c2260371Ddb, c971380bNw2);
                    c2260371Ddb.removeView(c971380bNw2);
                }
                this.LLJZIJLIL.remove(c971330bNr);
                this.LJLJJL(null);
                if (this.LLJZIJLIL.isEmpty() && (nLETrackSlotLIZ = this.LLJZ.LIZ()) != null) {
                    DialogC971210bNf dialogC971210bNf = this;
                    CopyOnWriteArrayList<C971330bNr> copyOnWriteArrayList = dialogC971210bNf.LLJZIJLIL;
                    C971330bNr c971330bNrLJLI = dialogC971210bNf.LJLI(nLETrackSlotLIZ);
                    dialogC971210bNf.LJLJJL(c971330bNrLJLI);
                    copyOnWriteArrayList.add(c971330bNrLJLI);
                    dialogC971210bNf.LLLII = null;
                    MultiCanvasUtils.LIZ.getClass();
                    InterfaceC971680bOQ interfaceC971680bOQLJIIJ = MultiCanvasUtils.LJIIJ();
                    if (interfaceC971680bOQLJIIJ != null) {
                        interfaceC971680bOQLJIIJ.LJ(dialogC971210bNf.LLJLL, "");
                    }
                    C1420790n4n c1420790n4n = dialogC971210bNf.LLJLLIL;
                    if (c1420790n4n != null) {
                        c1420790n4n.scrollToPosition(0);
                        HandlerHook.viewPost(c1420790n4n, new ARunnableS115S0100000_15(c1420790n4n, 17));
                    }
                }
                this.LLLF.setValue(EnumC953070auP.NORMAL);
            }

            @Override // X.InterfaceC971390bNx
            public final void LIZIZ() {
                Iterator<C971330bNr> it2 = this.LLJZIJLIL.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ.setState(EnumC971280bNm.INVISIBLE);
                }
                DialogC971210bNf dialogC971210bNf = this;
                dialogC971210bNf.LLJZ.LJIIIZ(EnumC971110bNV.COPY, c971330bNr, new AwS594S0100000_15(dialogC971210bNf, 39));
            }

            @Override // X.InterfaceC971390bNx
            public final void LIZJ() {
                this.LJLJJL(c971330bNr);
                this.LLLF.setValue(EnumC953070auP.INPUT);
            }
        });
        return c971330bNr;
    }

    public final void LJLJI(float f) {
        C971330bNr c971330bNr = this.LLL;
        if (c971330bNr != null) {
            float rotation = (c971330bNr.LIZ.getRotation() + f) % 360;
            this.LLJZ.LJIIJ(new C971120bNW(EnumC971100bNU.ROTATE, null, null, null, Float.valueOf(-rotation), c971330bNr, null, 78));
            C971380bNw c971380bNw = c971330bNr.LIZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c971380bNw);
            c971380bNw.setRotation(rotation);
        }
    }

    public final void LJLJJI(float f) {
        C971330bNr c971330bNr = this.LLL;
        if (c971330bNr != null) {
            float scale = c971330bNr.LIZIZ.getScale();
            RectF rectFLJII = this.LLJZ.LJII(c971330bNr.LIZIZ);
            if (f > 1.0f || rectFLJII.height() > 40.0f) {
                if (f > 1.0f && (rectFLJII.width() >= C497740JfY.LJIIZILJ() * 2 || f * scale >= 5.0f)) {
                    return;
                }
                this.LLJZ.LJIIJ(new C971120bNW(EnumC971100bNU.SCALE, null, null, Float.valueOf(scale * f), null, c971330bNr, null, 86));
                LJL(c971330bNr.LIZIZ, c971330bNr.LIZ);
            }
        }
    }

    public final void LJLJJL(C971330bNr c971330bNr) {
        float f;
        this.LLL = c971330bNr;
        if (c971330bNr != null) {
            String str = c971330bNr.LIZJ.LIZ;
            View view = this.LLJLILLLLZIIL;
            if (view != null) {
                view.setClickable(!a0.LJJJIL(str));
                if (a0.LJJJIL(str)) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                C786410Ut5.T4(view, f);
            }
        }
    }

    public final void LJLJJLL(EnumC971100bNU enumC971100bNU) {
        EnumC971280bNm enumC971280bNm;
        C971330bNr c971330bNr = this.LLL;
        if (c971330bNr != null) {
            this.LLJZ.LJIIJ(new C971120bNW(enumC971100bNU, null, null, null, null, c971330bNr, null, 94));
            LJL(c971330bNr.LIZIZ, c971330bNr.LIZ);
            if (this.LLLF.getValue() == EnumC953070auP.INPUT) {
                C971380bNw c971380bNw = c971330bNr.LIZ;
                if (c971330bNr.LIZJ.LIZ.length() == 0) {
                    enumC971280bNm = EnumC971280bNm.SHOW_DOTTED_DEFAULT;
                } else {
                    enumC971280bNm = EnumC971280bNm.SHOW_DOTTED;
                }
                c971380bNw.setState(enumC971280bNm);
                return;
            }
            if (this.LLLF.getValue() != EnumC953070auP.TEXT_STYLE) {
                return;
            }
            c971330bNr.LIZ.setState(EnumC971280bNm.SHOW_BTN_BORDER);
        }
    }

    @Override // X.AbstractDialogC962810bA7, X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        EditText editText;
        int i;
        ViewGroup.LayoutParams layoutParams;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        float fLJIILLIIL = (C497740JfY.LJIILLIIL() * 0.7f) - C497740JfY.LIZIZ(140);
        C196990125k c196990125kLIZLLL = null;
        if (fLJIILLIIL < C497740JfY.LJIIZILJ()) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ik6);
            if (frameLayout != null) {
                View viewFindViewById = findViewById(R.id.ik6);
                if (viewFindViewById != null && (layoutParams = viewFindViewById.getLayoutParams()) != null) {
                    layoutParams.width = (int) fLJIILLIIL;
                } else {
                    layoutParams = null;
                }
                C786410Ut5.a6(frameLayout, layoutParams);
            }
            int iLIZIZ = (int) (fLJIILLIIL - (C497740JfY.LIZIZ(16) * 2));
            this.LLLFZ = iLIZIZ;
            this.LLLI = iLIZIZ;
        } else {
            int iLJIIZILJ = (int) (C497740JfY.LJIIZILJ() - (C497740JfY.LIZIZ(16) * 2));
            this.LLLFZ = iLJIIZILJ;
            this.LLLI = iLJIIZILJ;
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.tsc);
        this.LLJILJILJ = viewGroup2;
        if (viewGroup2 != null) {
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.y_g);
            this.LLJJIJI = viewGroup3;
            if (viewGroup3 != null) {
                C12ES.LJIILL(0, viewGroup3);
            }
            this.LLJJIJIIJIL = viewGroup2.findViewById(R.id.hp2);
            this.LLJJIJIL = (TextView) viewGroup2.findViewById(R.id.y3l);
            this.LLJJJIL = viewGroup2.findViewById(R.id.e1w);
            ((C1251240ifK) findViewById(R.id.fdj)).setDataChannel(this.LLJI);
            TextView textView = this.LLJJIJIL;
            if (textView != null) {
                if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                    i = 2131854991;
                } else {
                    i = 2131854020;
                }
                textView.setText(i);
            }
            this.LLJILLL = findViewById(R.id.h3n);
            View view = this.LLJILLL;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.height = (int) (C497740JfY.LJIILLIIL() * 0.345f);
                C786410Ut5.W5(view, layoutParams2);
            }
            this.LLJJIII = (ViewGroup) viewGroup2.findViewById(R.id.evm);
            C2260371Ddb c2260371Ddb = (C2260371Ddb) viewGroup2.findViewById(R.id.wq2);
            c2260371Ddb.setOnGestureListener(new InterfaceC2260401Dde() { // from class: X.0bNh
                public boolean LIZ;

                @Override // X.InterfaceC2260401Dde
                public final void LIZ() {
                }

                @Override // X.InterfaceC2260401Dde
                public final void LIZJ() {
                    LJII(false);
                    DialogC971210bNf dialogC971210bNf = this.LIZIZ;
                    if (dialogC971210bNf.LLL == null) {
                        dialogC971210bNf.LLLF.setValue(EnumC953070auP.NORMAL);
                    } else if (dialogC971210bNf.LJLIIIL()) {
                        EnumC953070auP value = this.LIZIZ.LLLF.getValue();
                        EnumC953070auP enumC953070auP = EnumC953070auP.INPUT;
                        if (value != enumC953070auP) {
                            DialogC971210bNf dialogC971210bNf2 = this.LIZIZ;
                            dialogC971210bNf2.LJLJJL(dialogC971210bNf2.LLJZIJLIL.get(0));
                            this.LIZIZ.LLLF.setValue(enumC953070auP);
                        }
                    }
                    this.LIZIZ.LLJZ.LJIIIIZZ(false);
                }

                @Override // X.InterfaceC2260401Dde
                public final void LIZLLL() {
                }

                @Override // X.InterfaceC2260401Dde
                public final void LJ() {
                }

                @Override // X.InterfaceC2260401Dde
                public final void LJI() {
                }

                public final boolean LJIIIIZZ() {
                    C971360bNu c971360bNu;
                    String str;
                    if (this.LIZIZ.LLLF.getValue() == EnumC953070auP.INPUT) {
                        return true;
                    }
                    C971330bNr c971330bNr = this.LIZIZ.LLL;
                    return C500260Jjc.LJJJI((c971330bNr == null || (c971360bNu = c971330bNr.LIZJ) == null || (str = c971360bNu.LIZ) == null) ? null : Boolean.valueOf(a0.LJJJIL(str)));
                }

                @Override // X.InterfaceC2260401Dde
                public final boolean LIZIZ(MotionEvent motionEvent) {
                    if (motionEvent == null) {
                        return false;
                    }
                    DialogC971210bNf dialogC971210bNf = this.LIZIZ;
                    if (!dialogC971210bNf.LJLIIIL()) {
                        C971330bNr c971330bNrLJ = dialogC971210bNf.LLJZ.LJ(motionEvent);
                        if (c971330bNrLJ != null) {
                            if (!Intrinsics.LJFF(dialogC971210bNf.LLL, c971330bNrLJ)) {
                                C971330bNr c971330bNr = dialogC971210bNf.LLL;
                                if (c971330bNr != null) {
                                    c971330bNr.LIZ.setState(EnumC971280bNm.INVISIBLE);
                                }
                                dialogC971210bNf.LJLJJL(c971330bNrLJ);
                            }
                            dialogC971210bNf.LLLF.setValue(EnumC953070auP.INPUT);
                            return true;
                        }
                        dialogC971210bNf.LLLF.setValue(EnumC953070auP.NORMAL);
                        dialogC971210bNf.LJLJJL(null);
                        return true;
                    }
                    return true;
                }

                public final void LJII(boolean z) {
                    C971330bNr c971330bNr;
                    C971380bNw c971380bNw;
                    C971360bNu c971360bNu;
                    String str;
                    int i2;
                    C971330bNr c971330bNr2;
                    C971380bNw c971380bNw2;
                    C971360bNu c971360bNu2;
                    String str2;
                    Boolean boolValueOf = null;
                    if (!this.LIZ) {
                        if (z) {
                            C971330bNr c971330bNr3 = this.LIZIZ.LLL;
                            if (c971330bNr3 != null && (c971360bNu2 = c971330bNr3.LIZJ) != null && (str2 = c971360bNu2.LIZ) != null) {
                                boolValueOf = Boolean.valueOf(a0.LJJJIL(str2));
                            }
                            if (C500260Jjc.LJJIFFI(boolValueOf) && (c971330bNr2 = this.LIZIZ.LLL) != null && (c971380bNw2 = c971330bNr2.LIZ) != null) {
                                c971380bNw2.setState(EnumC971280bNm.SHOW_BORDER);
                            }
                        }
                    } else if (!z) {
                        C971330bNr c971330bNr4 = this.LIZIZ.LLL;
                        if (c971330bNr4 != null && (c971360bNu = c971330bNr4.LIZJ) != null && (str = c971360bNu.LIZ) != null) {
                            boolValueOf = Boolean.valueOf(a0.LJJJIL(str));
                        }
                        if (C500260Jjc.LJJIFFI(boolValueOf) && (c971330bNr = this.LIZIZ.LLL) != null && (c971380bNw = c971330bNr.LIZ) != null) {
                            c971380bNw.setState(EnumC971280bNm.SHOW_BTN_BORDER);
                        }
                    }
                    this.LIZ = z;
                    DialogC971210bNf dialogC971210bNf = this.LIZIZ;
                    C415700GRs c415700GRs = dialogC971210bNf.LLLFFI;
                    if (c415700GRs != null) {
                        if (z && dialogC971210bNf.LLL != null) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        int visibility = c415700GRs.getVisibility();
                        c415700GRs.setVisibility(i2);
                        C1602160rnK.LIZIZ(visibility, i2, c415700GRs);
                    }
                }

                @Override // X.InterfaceC2260401Dde
                public final void LJJLIIIJLJLI(float f) {
                    if (LJIIIIZZ()) {
                        return;
                    }
                    LJII(true);
                    this.LIZIZ.LJLIL();
                    this.LIZIZ.LJLJI(f);
                }

                @Override // X.InterfaceC2260401Dde
                public final void onDown(MotionEvent motionEvent) {
                    String str;
                    C971360bNu c971360bNu;
                    if (this.LIZ) {
                        return;
                    }
                    this.LIZIZ.LLJZ.LJIIIIZZ(true);
                    C971330bNr c971330bNrLJ = this.LIZIZ.LLJZ.LJ(motionEvent);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cur click: ");
                    if (c971330bNrLJ != null && (c971360bNu = c971330bNrLJ.LIZJ) != null) {
                        str = c971360bNu.LIZ;
                    } else {
                        str = null;
                    }
                    sbLIZ.append(str);
                    sbLIZ.append(", event: ");
                    sbLIZ.append(motionEvent);
                    C20441214yg.LIZIZ("NoticeBoardDialog", C2188811AlT.LIZIZ(sbLIZ));
                    if (c971330bNrLJ != null) {
                        C2260371Ddb c2260371Ddb2 = this.LIZIZ.LLJJJJJIL;
                        if (c2260371Ddb2 != null) {
                            c2260371Ddb2.setHasConsumed(true);
                        }
                        this.LIZIZ.LJLJJL(c971330bNrLJ);
                    } else if (this.LIZIZ.LJLIIIL() && this.LIZIZ.LLLF.getValue() != EnumC953070auP.INPUT) {
                        C2260371Ddb c2260371Ddb3 = this.LIZIZ.LLJJJJJIL;
                        if (c2260371Ddb3 != null) {
                            c2260371Ddb3.setHasConsumed(true);
                        }
                        DialogC971210bNf dialogC971210bNf = this.LIZIZ;
                        dialogC971210bNf.LJLJJL(dialogC971210bNf.LLJZIJLIL.get(0));
                    } else {
                        C2260371Ddb c2260371Ddb4 = this.LIZIZ.LLJJJJJIL;
                        if (c2260371Ddb4 != null) {
                            c2260371Ddb4.setHasConsumed(false);
                        }
                        this.LIZIZ.LJLJJL(null);
                    }
                    EnumC953070auP value = this.LIZIZ.LLLF.getValue();
                    EnumC953070auP enumC953070auP = EnumC953070auP.TEXT_STYLE;
                    if (value == enumC953070auP) {
                        this.LIZIZ.LLLF.setValue(enumC953070auP);
                    }
                }

                @Override // X.InterfaceC2260401Dde
                public final void onScale(float f) {
                    if (LJIIIIZZ()) {
                        return;
                    }
                    LJII(true);
                    this.LIZIZ.LJLIL();
                    this.LIZIZ.LJLJJI(f);
                }

                @Override // X.InterfaceC2260401Dde
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    EnumC953070auP enumC953070auP;
                    if (motionEvent == null) {
                        return false;
                    }
                    DialogC971210bNf dialogC971210bNf = this.LIZIZ;
                    C971330bNr c971330bNrLJ = dialogC971210bNf.LLJZ.LJ(motionEvent);
                    if (c971330bNrLJ != null) {
                        if (!Intrinsics.LJFF(dialogC971210bNf.LLL, c971330bNrLJ)) {
                            C971330bNr c971330bNr = dialogC971210bNf.LLL;
                            if (c971330bNr != null) {
                                c971330bNr.LIZ.setState(EnumC971280bNm.INVISIBLE);
                            }
                            dialogC971210bNf.LJLJJL(c971330bNrLJ);
                        }
                        MutableLiveData<EnumC953070auP> mutableLiveData = dialogC971210bNf.LLLF;
                        if (a0.LJJJIL(c971330bNrLJ.LIZJ.LIZ)) {
                            enumC953070auP = EnumC953070auP.INPUT;
                        } else {
                            enumC953070auP = EnumC953070auP.TEXT_STYLE;
                        }
                        mutableLiveData.setValue(enumC953070auP);
                        return true;
                    }
                    return true;
                }

                @Override // X.InterfaceC2260401Dde
                public final void LJFF(float f, float f2) {
                    SurfaceView surfaceView;
                    if (LJIIIIZZ()) {
                        return;
                    }
                    boolean z = true;
                    LJII(true);
                    this.LIZIZ.LJLIL();
                    DialogC971210bNf dialogC971210bNf = this.LIZIZ;
                    C971330bNr c971330bNr = dialogC971210bNf.LLL;
                    if (c971330bNr != null) {
                        C971380bNw c971380bNw = c971330bNr.LIZ;
                        float right = ((c971380bNw.getRight() + c971380bNw.getLeft()) * 0.5f) + c971380bNw.getTranslationX() + f;
                        float bottom = ((c971380bNw.getBottom() + c971380bNw.getTop()) * 0.5f) + c971380bNw.getTranslationY() + f2;
                        if (right > 0.0f && bottom > 0.0f && right < dialogC971210bNf.LLLFZ && bottom < dialogC971210bNf.LLLI && (surfaceView = dialogC971210bNf.LLJJJJ) != null) {
                            dialogC971210bNf.LLJZ.LJIIJ(new C971120bNW(EnumC971100bNU.TRANSFORM, Float.valueOf(C363400EMo.LIZJ(c971330bNr.LIZIZ.getTransformX()) + (f / surfaceView.getWidth())), Float.valueOf(C363400EMo.LIZLLL(c971330bNr.LIZIZ.getTransformY()) + (f2 / surfaceView.getHeight())), null, null, c971330bNr, null, 88));
                            C971380bNw c971380bNw2 = c971330bNr.LIZ;
                            float translationX = c971380bNw2.getTranslationX() + f;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c971380bNw2);
                            c971380bNw2.setTranslationX(translationX);
                            float translationY = c971380bNw2.getTranslationY() + f2;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c971380bNw2);
                            c971380bNw2.setTranslationY(translationY);
                        }
                    }
                    DialogC971210bNf dialogC971210bNf2 = this.LIZIZ;
                    C2260371Ddb c2260371Ddb2 = dialogC971210bNf2.LLJJJJJIL;
                    if (c2260371Ddb2 != null) {
                        if (dialogC971210bNf2.LLL == null) {
                            z = false;
                        }
                        c2260371Ddb2.setHasConsumed(z);
                    }
                }
            });
            this.LLJJJJJIL = c2260371Ddb;
            SurfaceView surfaceView = new SurfaceView(getContext());
            surfaceView.setClipToOutline(true);
            surfaceView.setOutlineProvider(new C521570Kct(surfaceView, 0));
            this.LLJJJJ = surfaceView;
            C2260371Ddb c2260371Ddb2 = this.LLJJJJJIL;
            if (c2260371Ddb2 != null) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(this.LLLFZ, this.LLLI);
                layoutParams3.gravity = 17;
                c2260371Ddb2.addView(surfaceView, layoutParams3);
            }
            C971050bNP c971050bNP = this.LLJZ;
            C953770avX c953770avX = this.LLJIJIL;
            c971050bNP.getClass();
            C20441214yg.LIZIZ("TemplateEditDialogPresenter_Noticeboard", "init");
            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
            AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(c971050bNP, c953770avX, 7);
            multiCanvasUtils.getClass();
            MultiCanvasUtils.LIZJ(awS416S0200000_15, null);
            this.LLJJI = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).VY0(getContext(), new AwS559S0100000_15(this, 52));
            ViewGroup viewGroup4 = (ViewGroup) findViewById(R.id.ik6);
            View view2 = this.LLJJI;
            float f = 32;
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(f), (int) C497740JfY.LIZIZ(f));
            float f2 = 16;
            layoutParams4.setMarginEnd((int) C497740JfY.LIZIZ(f2));
            layoutParams4.topMargin = (int) C497740JfY.LIZIZ(f2);
            layoutParams4.gravity = 8388661;
            viewGroup4.addView(view2, layoutParams4);
            C415700GRs c415700GRs = new C415700GRs(getContext());
            int visibility = c415700GRs.getVisibility();
            c415700GRs.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c415700GRs);
            this.LLLFFI = c415700GRs;
            C2260371Ddb c2260371Ddb3 = this.LLJJJJJIL;
            if (c2260371Ddb3 != null) {
                c2260371Ddb3.addView(c415700GRs, new FrameLayout.LayoutParams(this.LLLFZ, this.LLLI));
            }
            View view3 = this.LLJJIJIIJIL;
            if (view3 != null) {
                if (C426750GoL.LIZLLL(getContext())) {
                    C786410Ut5.Ob(view3, -1.0f);
                }
                C500260Jjc.LJLIIIL(500L, view3, new AwS594S0100000_15(this, 25));
            }
            View view4 = this.LLJJJIL;
            if (view4 != null) {
                C500260Jjc.LJLIIIL(500L, view4, new AwS594S0100000_15(this, 27));
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.tfz);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZLLL = Integer.valueOf(C497740JfY.LIZLLL(R.attr.exz, getContext()));
            c419910GdJ.LIZ = R.raw.icon_exclamation_mark_triangle_inline;
            float f3 = 12;
            c419910GdJ.LIZIZ = (int) C497740JfY.LIZIZ(f3);
            c419910GdJ.LIZJ = (int) C497740JfY.LIZIZ(f3);
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(c419910GdJ.LIZ(getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
            C16FS c16fs = (C16FS) viewGroup2.findViewById(R.id.f6f);
            if (c16fs != null) {
                C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 7));
            } else {
                c16fs = null;
            }
            this.LLJJ = c16fs;
            if (c16fs != null) {
                c16fs.setText(2131853960);
            }
            View viewTd = C786410Ut5.Td(C972080bP4.LIZ(C786410Ut5.ne(getContext())), R.layout.g_1, (ViewGroup) findViewById(R.id.ccd), false);
            if (viewTd instanceof ViewGroup) {
                viewGroup = (ViewGroup) viewTd;
            } else {
                viewGroup = null;
            }
            this.LLJJJJLIIL = viewGroup;
            if (viewGroup != null) {
                C500260Jjc.LJIILIIL(viewGroup);
                TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.xpu);
                if (tuxTextView != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C497740JfY.LJIJI(2131853954));
                    sbLIZ.append("...");
                    tuxTextView.setHint(C2188811AlT.LIZIZ(sbLIZ));
                    C786410Ut5.h9(tuxTextView, new ACListenerS150S0100000_15(this, 8));
                    C786410Ut5.x3(tuxTextView.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC346410Di3(tuxTextView, 0));
                } else {
                    tuxTextView = null;
                }
                this.LLJL = tuxTextView;
                this.LLJJLIIIJLLLLLLLZ = (ViewGroup) viewGroup.findViewById(R.id.xpt);
                View viewFindViewById2 = viewGroup.findViewById(R.id.dnz);
                C786410Ut5.I7(new ACListenerS150S0100000_15(this, 9), viewFindViewById2);
                this.LLJLILLLLZIIL = viewFindViewById2;
                this.LLJJL = (ViewGroup) viewGroup.findViewById(R.id.kqv);
                EditText editText2 = (EditText) viewGroup.findViewById(R.id.grz);
                editText2.setHint(2131853954);
                editText2.addTextChangedListener(new C987080bnG(this, 0));
                editText2.setOnEditorActionListener(new C986900bmy(this, 0));
                editText2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC986920bn0(this, 1));
                this.LLJLIL = editText2;
                C953230auf.LIZ.getClass();
                if (C953230auf.LJIIJJI() && (editText = this.LLJLIL) != null) {
                    editText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter((int) MultiGuestBoardTemplateOfficialConfigSetting.INSTANCE.getValue().maxEditText)});
                }
                TuxIconView tuxIconView = (TuxIconView) viewGroup.findViewById(R.id.gp5);
                C786410Ut5.a9(tuxIconView, new ACListenerS150S0100000_15(this, 11));
                tuxIconView.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: X.0bOH
                    @Override // android.view.View.AccessibilityDelegate
                    public final void onInitializeAccessibilityNodeInfo(View view5, AccessibilityNodeInfo accessibilityNodeInfo) {
                        super.onInitializeAccessibilityNodeInfo(view5, accessibilityNodeInfo);
                        accessibilityNodeInfo.setText(C497740JfY.LJIJI(2131851120));
                    }
                });
                ViewGroup viewGroup5 = (ViewGroup) viewGroup.findViewById(R.id.ih8);
                if (viewGroup5 != null) {
                    InterfaceC971680bOQ interfaceC971680bOQLJIIJ = MultiCanvasUtils.LJIIJ();
                    if (interfaceC971680bOQLJIIJ != null) {
                        Context context = getContext();
                        if (!C500260Jjc.LJJIL() && C931810aM7.LIZJ(PlayEntityUtilKt.LJIIIZ())) {
                            context = C1834150xpV.LJII(context);
                        }
                        c196990125kLIZLLL = interfaceC971680bOQLJIIJ.LIZLLL(context, AFwS250S0000000_15.get$arr$(100), EnumC2011407uK.NOTICE_BOARD, new AwS594S0100000_15(this, 40));
                    }
                    this.LLJLL = c196990125kLIZLLL;
                    viewGroup5.addView(c196990125kLIZLLL);
                }
                C1420790n4n c1420790n4n = (C1420790n4n) viewGroup.findViewById(R.id.e8q);
                C1117360fBO c1117360fBO = new C1117360fBO();
                c1117360fBO.LLLI(C971410bNz.class, new C971470bO5(new C971290bNn(this)));
                C410901il c410901il = new C410901il();
                List<Integer> list = C971490bO7.LIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C971410bNz(((Number) it2.next()).intValue()));
                }
                c410901il.addAll(arrayList);
                c1117360fBO.LL = c410901il;
                this.LLJLLL = c1117360fBO;
                c1420790n4n.setAdapter(c1117360fBO);
                c1420790n4n.setClipToPadding(false);
                this.LLJLLIL = c1420790n4n;
            }
            ViewGroup viewGroup6 = (ViewGroup) findViewById(R.id.ccd);
            if (viewGroup6 != null) {
                viewGroup6.addView(this.LLJJJJLIIL);
            }
        }
        if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
            TextView textView2 = (TextView) findViewById(R.id.tfz);
            if (textView2 != null) {
                textView2.setText(C497740JfY.LJIJI(2131853959));
            }
        } else {
            TextView textView3 = (TextView) findViewById(R.id.tfz);
            if (textView3 != null) {
                textView3.setText(C497740JfY.LJIJI(2131853958));
            }
        }
        AObserverS219S0100000_15 aObserverS219S0100000_15 = new AObserverS219S0100000_15(this, 5);
        this.LLLFF = aObserverS219S0100000_15;
        this.LLLF.observeForever(aObserverS219S0100000_15);
        DataChannel dataChannel = this.LLJI;
        if (dataChannel != null) {
            dataChannel.CQ2(NoticeBoardBoarderViewRotationEvent.class, this, new AwS594S0100000_15(this, 28));
            dataChannel.CQ2(NoticeBoardBoarderViewScaleEvent.class, this, new AwS594S0100000_15(this, 29));
            dataChannel.CQ2(ScrollEndEvent.class, this, new AwS594S0100000_15(this, 30));
            dataChannel.CQ2(EditEvent.class, this, new AwS594S0100000_15(this, 31));
            dataChannel.CQ2(ShowDottedViewEvent.class, this, new AwS594S0100000_15(this, 32));
        }
    }

    public final void LJL(NLETrackSlot nLETrackSlot, C971380bNw c971380bNw) {
        Boolean boolValueOf;
        float f;
        boolean z;
        RectF rectFLJII = this.LLJZ.LJII(nLETrackSlot);
        MultiCanvasUtils.LIZ.getClass();
        String strLJIILJJIL = MultiCanvasUtils.LJIILJJIL(nLETrackSlot);
        if (strLJIILJJIL != null) {
            if (strLJIILJJIL.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            Pair<Integer, Integer> defaultTextWidthAndHeight = c971380bNw.getDefaultTextWidthAndHeight();
            rectFLJII.left -= defaultTextWidthAndHeight.getFirst().intValue() / 2;
            rectFLJII.right += defaultTextWidthAndHeight.getFirst().intValue() / 2;
            rectFLJII.top -= defaultTextWidthAndHeight.getSecond().intValue() / 2;
            rectFLJII.bottom += defaultTextWidthAndHeight.getSecond().intValue() / 2;
        }
        float f2 = 2;
        float f3 = (LLLIIIIL * f2) + LLLIIII;
        int iAbs = (int) (Math.abs(rectFLJII.width()) + f3);
        int iHeight = (int) (rectFLJII.height() + f3);
        if (c971380bNw.getParent() == null) {
            C2260371Ddb c2260371Ddb = this.LLJJJJJIL;
            if (c2260371Ddb != null) {
                c2260371Ddb.addView(c971380bNw, new FrameLayout.LayoutParams(iAbs, iHeight));
            }
        } else if (c971380bNw.getLayoutParams().width != iAbs || c971380bNw.getLayoutParams().height != iHeight) {
            c971380bNw.getLayoutParams().width = iAbs;
            c971380bNw.getLayoutParams().height = iHeight;
            ViewGroup.LayoutParams layoutParams = c971380bNw.getLayoutParams();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c971380bNw);
            c971380bNw.setLayoutParams(layoutParams);
        }
        if (C426750GoL.LIZLLL(getContext())) {
            f = -(rectFLJII.left - (f3 / f2));
        } else {
            f = rectFLJII.left - (f3 / f2);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c971380bNw);
        c971380bNw.setTranslationX(f);
        float f4 = rectFLJII.top - (f3 / f2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c971380bNw);
        c971380bNw.setTranslationY(f4);
        float f5 = -nLETrackSlot.getRotation();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c971380bNw);
        c971380bNw.setRotation(f5);
    }

    public final void LJLILLLLZI(String str, String str2, boolean z) {
        C500260Jjc.LJJLIIIJILLIZJL(new C954030avx(z, this, str, str2));
    }

    public DialogC971210bNf(Context context, DataChannel dataChannel, C953770avX c953770avX, Function0<Unit> function0) {
        super(context);
        this.LLJI = dataChannel;
        this.LLJIJIL = c953770avX;
        this.LLJILJIL = function0;
        this.LLJZ = new C971050bNP(this, dataChannel);
        this.LLJZIJLIL = new CopyOnWriteArrayList<>();
        this.LLLF = new MutableLiveData<>(EnumC953070auP.NORMAL);
        this.LLLFZ = 800;
        this.LLLI = 500;
    }
}

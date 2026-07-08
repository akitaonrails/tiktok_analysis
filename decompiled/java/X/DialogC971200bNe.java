package X;

import Y.ACListenerS150S0100000_15;
import Y.AObserverS219S0100000_15;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS84S0200000_15;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.EditEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.HideNoticeBoardWhenUseTemplate;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.HidePreviewEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.NoticeBoardBoarderViewRotationEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.NoticeBoardBoarderViewScaleEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.ScrollEndEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.ShowDottedViewEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.ShowTemplateDialogWhenTemplateEditDialogDismiss;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.TemplateSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS250S0000000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0bNe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class DialogC971200bNe extends AbstractDialogC962810bA7 implements InterfaceC971000bNK {
    public final C953100auS LLJI;
    public ViewGroup LLJIJIL;
    public View LLJILJIL;
    public ConstraintLayout LLJILJILJ;
    public C1251240ifK LLJILLL;
    public C16FS LLJJ;
    public View LLJJI;
    public View LLJJIII;
    public TemplateSheetFragment LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public TuxIconView LLJJJ;
    public TuxIconView LLJJJIL;
    public TextView LLJJJJ;
    public TuxIconView LLJJJJJIL;
    public C952290at9 LLJJJJLIIL;
    public SurfaceView LLJJL;
    public C2260371Ddb LLJJLIIIJLLLLLLLZ;
    public ViewGroup LLJL;
    public ViewGroup LLJLIL;
    public ViewGroup LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public EditText LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public C1420790n4n LLJZIJLIL;
    public C1117360fBO LLL;
    public final C971040bNO LLLF;
    public RecyclerView LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public boolean LLLI;
    public final CopyOnWriteArrayList<C971330bNr> LLLII;
    public C971330bNr LLLIIII;
    public final MutableLiveData<EnumC953070auP> LLLIIIIL;
    public EnumC919100a1c LLLIIIL;
    public AObserverS219S0100000_15 LLLIIL;
    public C415700GRs LLLIILIL;
    public int LLLIL;
    public int LLLILZ;
    public C971120bNW LLLILZJ;
    public final C11NJ LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public C971150bNZ LLLJIL;

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g_4;
    }

    @Override // X.InterfaceC971000bNK
    public final Context LJIL() {
        return this.LLJI.LIZ;
    }

    @Override // X.InterfaceC971000bNK
    public final void LJJJJLI() {
        RecyclerView recyclerView = this.LLLFF;
        if (recyclerView == null || recyclerView.getVisibility() != 0) {
            return;
        }
        ((C971260bNk) this.LLLFFI.getValue()).LL = this.LLLF.LJIIIZ;
        ((AbstractC21673619ry) this.LLLFFI.getValue()).notifyDataSetChanged();
    }

    @Override // X.InterfaceC971000bNK
    public final void LJJLIIIIJ() {
        C500260Jjc.LJJLIIIJILLIZJL(new AwS559S0100000_15(this, 1223));
    }

    @Override // X.InterfaceC971000bNK
    public final void LJJLIIIJILLIZJL() {
        C20441214yg.LIZIZ("NoticeBoardDialog", "onNoticeBoardEdited");
        this.LLLI = true;
        RecyclerView recyclerView = this.LLLFF;
        if (recyclerView == null || !C500260Jjc.LJJJJIZL(recyclerView) || ((ValueAnimator) this.LLLFZ.getValue()).isRunning()) {
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS416S0200000_15(this, recyclerView, 128));
    }

    public final boolean LJLIIIL() {
        return this.LLLII.size() == 1 && a0.LJJJIL(this.LLLII.get(0).LIZJ.LIZ);
    }

    public final void LJLIIL() {
        NLETrackSlot nLETrackSlot;
        if (this.LLLII.size() == 1 && a0.LJJJIL(this.LLLII.get(0).LIZJ.LIZ)) {
            this.LLLILZJ = null;
        }
        C971120bNW c971120bNW = this.LLLILZJ;
        if (c971120bNW != null) {
            for (C971330bNr c971330bNr : this.LLLII) {
                String uuid = c971330bNr.LIZIZ.getUUID();
                C971330bNr c971330bNr2 = this.LLLIIII;
                if (!Intrinsics.LJFF(uuid, (c971330bNr2 == null || (nLETrackSlot = c971330bNr2.LIZIZ) == null) ? null : nLETrackSlot.getUUID())) {
                    c971330bNr.LIZ.setState(EnumC971280bNm.INVISIBLE);
                    c971330bNr.LIZIZ.setEnable(true);
                }
            }
            c971120bNW.LJFF.LIZ.setState(EnumC971280bNm.INVISIBLE);
            this.LLLF.LJIJ(c971120bNW);
            ViewGroup viewGroup = this.LLJIJIL;
            if (viewGroup != null) {
                HandlerHook.viewPostDelay(viewGroup, new ARunnableS115S0100000_15(c971120bNW, 217), 30L);
            }
        }
        this.LLLILZJ = null;
    }

    public final void LJLIL() {
        NLETrackSlot nLETrackSlot;
        for (C971330bNr c971330bNr : this.LLLII) {
            if (this.LLLIIII != null) {
                String uuid = c971330bNr.LIZIZ.getUUID();
                C971330bNr c971330bNr2 = this.LLLIIII;
                if (!Intrinsics.LJFF(uuid, (c971330bNr2 == null || (nLETrackSlot = c971330bNr2.LIZIZ) == null) ? null : nLETrackSlot.getUUID())) {
                    c971330bNr.LIZ.setState(EnumC971280bNm.INVISIBLE);
                }
            }
        }
    }

    public final void LJLJJL() {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.LLJI.LIZIZ;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return;
        }
        String str = TemplateSheetFragment._pnsPageId;
        Context context = getContext();
        C971150bNZ c971150bNZ = this.LLLJIL;
        C953100auS c953100auS = this.LLJI;
        C969920bLa c969920bLa = new C969920bLa(context, c971150bNZ, c953100auS.LIZIZ, c953100auS, new C969910bLZ(C056N.CLOSE_ONLY, EnumC124700dh.NONE, 4));
        AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(this, 1226);
        TemplateSheetFragment templateSheetFragment = new TemplateSheetFragment();
        templateSheetFragment.LLJLLL = c969920bLa;
        templateSheetFragment.LLJZ = awS559S0100000_15;
        this.LLJJIJI = templateSheetFragment;
        C19322110iZ.LJFF(fragmentManager, templateSheetFragment, "TemplateSheetFragment", null, 0);
    }

    @Override // X.C19GI, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        DataChannel dataChannel;
        if (this.LLLIIIIL.getValue() == EnumC953070auP.INPUT) {
            this.LLLIIIIL.setValue(EnumC953070auP.TEXT_STYLE);
        }
        AObserverS219S0100000_15 aObserverS219S0100000_15 = this.LLLIIL;
        if (aObserverS219S0100000_15 != null) {
            this.LLLIIIIL.removeObserver(aObserverS219S0100000_15);
        }
        DataChannel dataChannel2 = this.LLJI.LIZIZ;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        this.LLLII.clear();
        C971040bNO c971040bNO = this.LLLF;
        C953100auS c953100auS = c971040bNO.LJI;
        if (c953100auS != null && (dataChannel = c953100auS.LIZIZ) != null) {
            dataChannel.zQ2(c971040bNO);
        }
        NLEEditor nLEEditor = c971040bNO.LIZIZ;
        if (nLEEditor != null) {
            nLEEditor.removeConsumer(c971040bNO.LIZLLL);
        }
        for (InterfaceC915550Zvt interfaceC915550Zvt : (ArrayList) c971040bNO.LJIIJJI) {
            BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
            CloudDraftItemManager.LIZ(interfaceC915550Zvt);
        }
        this.LLLILZLLLI.LJ();
        EnumC919100a1c enumC919100a1c = this.LLLIIIL;
        ViewGroup viewGroup = this.LLJIJIL;
        if (viewGroup != null) {
            HandlerHook.viewPost(viewGroup, new ARunnableS84S0200000_15(enumC919100a1c, this, 84));
        }
        this.LLLIIIL = EnumC919100a1c.NORMAL;
        C953230auf c953230auf = C953230auf.LIZ;
        C970980bNI c970980bNI = (C970980bNI) this.LLLIZZ.getValue();
        c953230auf.getClass();
        C953230auf.LJIILL(c970980bNI);
        C953230auf.LJIILL((C970150bLx) this.LLLJ.getValue());
        C971260bNk c971260bNk = (C971260bNk) this.LLLFFI.getValue();
        c971260bNk.getClass();
        BPEAHandler bPEAHandler2 = CloudDraftItemManager.LIZ;
        CloudDraftItemManager.LIZ(c971260bNk.LLIZ);
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
        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+mRsEIix6zmUcBwbyL0ej0znPyXhkjA4ffPpsTQ7PoQ4GWjdV0oTLpkLPbFYK7l6ec6M/HT9MD6W3YvvnEGNK4vU5c=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/common/multicanvas/NoticeBoardBaseDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/common/multicanvas/NoticeBoardBaseDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            C19GI c19gi = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (C19GI) obj;
            super.show();
            c0wst.LIZ(300000, "com/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/common/multicanvas/NoticeBoardBaseDialog", "show", null, objArr, c19gi, c0wzw, true);
        }
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        EnumC952890au7 enumC952890au7 = this.LLJI.LIZJ;
        multiCanvasUtils.getClass();
        C946850akN.LJFF(MultiCanvasUtils.LJIIJJI(enumC952890au7), EnumC971610bOJ.CANVAS, "in_spots");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0bNZ] */
    @Override // X.AbstractDialogC972150bPB, X.DialogC19728412Gs, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLLJIL = new InterfaceC970140bLw() { // from class: X.0bNZ
            @Override // X.InterfaceC970140bLw
            public final void LIZ() {
                this.LIZ.LLLF.LJIIZILJ();
            }

            @Override // X.InterfaceC970140bLw
            public final void LIZIZ() {
                this.LIZ.LLLF.getClass();
            }
        };
    }

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLLJIL = null;
    }

    @Override // X.InterfaceC971000bNK
    public final SurfaceView LJJIIJZLJL() {
        return this.LLJJL;
    }

    @Override // X.InterfaceC971000bNK
    public final List<C971330bNr> LJJJJ() {
        return this.LLLII;
    }

    public DialogC971200bNe(C953100auS c953100auS) {
        super(c953100auS.LIZ);
        this.LLJI = c953100auS;
        this.LLLF = new C971040bNO(this);
        this.LLLFFI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1227));
        this.LLLFZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1228));
        this.LLLII = new CopyOnWriteArrayList<>();
        this.LLLIIIIL = new MutableLiveData<>(EnumC953070auP.NORMAL);
        this.LLLIIIL = EnumC919100a1c.NORMAL;
        this.LLLIL = 800;
        this.LLLILZ = 500;
        this.LLLILZLLLI = new C11NJ();
        this.LLLIZZ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1225));
        this.LLLJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1224));
    }

    @Override // X.InterfaceC971000bNK
    public final void LJJIII(EnumC919100a1c enumC919100a1c) {
        this.LLLIIIL = enumC919100a1c;
        dismiss();
        C785410UrT.LIZ(this);
    }

    public final C971330bNr LJLI(NLETrackSlot nLETrackSlot) {
        C971380bNw c971380bNw = new C971380bNw(getContext(), this.LLJI.LIZIZ);
        LJL(nLETrackSlot, c971380bNw);
        c971380bNw.setFocusable(true);
        c971380bNw.setFocusableInTouchMode(true);
        c971380bNw.setImportantForAccessibility(1);
        this.LLLF.getClass();
        int i = C953770avX.LJIILL;
        final C971330bNr c971330bNr = new C971330bNr(c971380bNw, nLETrackSlot, C971350bNt.LIZIZ(nLETrackSlot));
        c971380bNw.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: X.0bOC
            @Override // android.view.View.AccessibilityDelegate
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final void sendAccessibilityEvent(View view, int i2) {
                if (i2 == 256) {
                    view.announceForAccessibility(c971330bNr.LIZJ.LIZ);
                    view.performAccessibilityAction(64, null);
                }
                super.sendAccessibilityEvent(view, i2);
            }

            @Override // android.view.View.AccessibilityDelegate
            public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
                if (i2 == 16) {
                    this.LJLJJLL(c971330bNr);
                    return true;
                }
                return super.performAccessibilityAction(view, i2, bundle);
            }
        });
        c971380bNw.setAction(new InterfaceC971390bNx() { // from class: X.0bNj
            @Override // X.InterfaceC971390bNx
            public final void LIZ() {
                NLETrackSlot nLETrackSlotLIZIZ;
                this.LLLF.LJIILL(EnumC971110bNV.DELETE, c971330bNr, null);
                C2260371Ddb c2260371Ddb = this.LLJJLIIIJLLLLLLLZ;
                if (c2260371Ddb != null) {
                    C971380bNw c971380bNw2 = c971330bNr.LIZ;
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(c2260371Ddb, c971380bNw2);
                    c2260371Ddb.removeView(c971380bNw2);
                }
                this.LLLII.remove(c971330bNr);
                this.LJLJJI(null);
                if (this.LLLII.isEmpty() && (nLETrackSlotLIZIZ = this.LLLF.LIZIZ()) != null) {
                    DialogC971200bNe dialogC971200bNe = this;
                    CopyOnWriteArrayList<C971330bNr> copyOnWriteArrayList = dialogC971200bNe.LLLII;
                    C971330bNr c971330bNrLJLI = dialogC971200bNe.LJLI(nLETrackSlotLIZIZ);
                    dialogC971200bNe.LJLJJI(c971330bNrLJLI);
                    copyOnWriteArrayList.add(c971330bNrLJLI);
                    dialogC971200bNe.LLLILZJ = null;
                    MultiCanvasUtils.LIZ.getClass();
                    InterfaceC971680bOQ interfaceC971680bOQLJIIJ = MultiCanvasUtils.LJIIJ();
                    if (interfaceC971680bOQLJIIJ != null) {
                        interfaceC971680bOQLJIIJ.LJ(dialogC971200bNe.LLJZ, "");
                    }
                    C1420790n4n c1420790n4n = dialogC971200bNe.LLJZIJLIL;
                    if (c1420790n4n != null) {
                        c1420790n4n.scrollToPosition(0);
                        HandlerHook.viewPost(c1420790n4n, new ARunnableS115S0100000_15(c1420790n4n, 216));
                    }
                }
                this.LLLIIIIL.setValue(EnumC953070auP.NORMAL);
            }

            @Override // X.InterfaceC971390bNx
            public final void LIZIZ() {
                Iterator<C971330bNr> it2 = this.LLLII.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ.setState(EnumC971280bNm.INVISIBLE);
                }
                DialogC971200bNe dialogC971200bNe = this;
                dialogC971200bNe.LLLF.LJIILL(EnumC971110bNV.COPY, c971330bNr, new AwS594S0100000_15(dialogC971200bNe, 1204));
            }

            @Override // X.InterfaceC971390bNx
            public final void LIZJ() {
                this.LJLJJI(c971330bNr);
                this.LLLIIIIL.setValue(EnumC953070auP.INPUT);
            }
        });
        return c971330bNr;
    }

    public final void LJLILLLLZI(float f) {
        C971330bNr c971330bNr = this.LLLIIII;
        if (c971330bNr != null) {
            float rotation = (c971330bNr.LIZ.getRotation() + f) % 360;
            this.LLLF.LJIJ(new C971120bNW(EnumC971100bNU.ROTATE, null, null, null, Float.valueOf(-rotation), c971330bNr, null, 78));
            C971380bNw c971380bNw = c971330bNr.LIZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c971380bNw);
            c971380bNw.setRotation(rotation);
        }
    }

    public final void LJLJI(float f) {
        C971330bNr c971330bNr = this.LLLIIII;
        if (c971330bNr != null) {
            float scale = c971330bNr.LIZIZ.getScale();
            RectF rectFLJIIIIZZ = this.LLLF.LJIIIIZZ(c971330bNr.LIZIZ);
            if (f > 1.0f || rectFLJIIIIZZ.height() > 40.0f) {
                if (f > 1.0f && (rectFLJIIIIZZ.width() >= C497740JfY.LJIIZILJ() * 2 || f * scale >= 5.0f)) {
                    return;
                }
                this.LLLF.LJIJ(new C971120bNW(EnumC971100bNU.SCALE, null, null, Float.valueOf(scale * f), null, c971330bNr, null, 86));
                LJL(c971330bNr.LIZIZ, c971330bNr.LIZ);
            }
        }
    }

    public final void LJLJJI(C971330bNr c971330bNr) {
        float f;
        this.LLLIIII = c971330bNr;
        if (c971330bNr != null) {
            String str = c971330bNr.LIZJ.LIZ;
            View view = this.LLJLLL;
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

    public final void LJLJJLL(C971330bNr c971330bNr) {
        EnumC953070auP enumC953070auP;
        if (c971330bNr != null) {
            if (!Intrinsics.LJFF(this.LLLIIII, c971330bNr)) {
                C971330bNr c971330bNr2 = this.LLLIIII;
                if (c971330bNr2 != null) {
                    c971330bNr2.LIZ.setState(EnumC971280bNm.INVISIBLE);
                }
                LJLJJI(c971330bNr);
            }
            MutableLiveData<EnumC953070auP> mutableLiveData = this.LLLIIIIL;
            if (a0.LJJJIL(c971330bNr.LIZJ.LIZ)) {
                enumC953070auP = EnumC953070auP.INPUT;
            } else {
                enumC953070auP = EnumC953070auP.TEXT_STYLE;
            }
            mutableLiveData.setValue(enumC953070auP);
        }
    }

    public final void LJLJLJ(EnumC971100bNU enumC971100bNU) {
        EnumC971280bNm enumC971280bNm;
        C971330bNr c971330bNr = this.LLLIIII;
        if (c971330bNr != null) {
            this.LLLF.LJIJ(new C971120bNW(enumC971100bNU, null, null, null, null, c971330bNr, null, 94));
            LJL(c971330bNr.LIZIZ, c971330bNr.LIZ);
            if (this.LLLIIIIL.getValue() == EnumC953070auP.INPUT) {
                C971380bNw c971380bNw = c971330bNr.LIZ;
                if (c971330bNr.LIZJ.LIZ.length() == 0) {
                    enumC971280bNm = EnumC971280bNm.SHOW_DOTTED_DEFAULT;
                } else {
                    enumC971280bNm = EnumC971280bNm.SHOW_DOTTED;
                }
                c971380bNw.setState(enumC971280bNm);
                return;
            }
            if (this.LLLIIIIL.getValue() != EnumC953070auP.TEXT_STYLE) {
                return;
            }
            c971330bNr.LIZ.setState(EnumC971280bNm.SHOW_BTN_BORDER);
        }
    }

    @Override // X.AbstractDialogC962810bA7, X.AbstractDialogC972150bPB, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ViewGroup viewGroup;
        View view;
        int i2;
        ViewGroup.LayoutParams layoutParams;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        this.LLJI.LJII.invoke();
        float fLJIILLIIL = (C497740JfY.LJIILLIIL() * 0.7f) - C497740JfY.LIZIZ(140);
        C196990125k c196990125kLIZLLL = null;
        int i3 = 2;
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
            this.LLLIL = iLIZIZ;
            this.LLLILZ = iLIZIZ;
        } else {
            int iLJIIZILJ = (int) (C497740JfY.LJIIZILJ() - (C497740JfY.LIZIZ(16) * 2));
            this.LLLIL = iLJIIZILJ;
            this.LLLILZ = iLJIIZILJ;
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.tsc);
        this.LLJIJIL = viewGroup2;
        if (viewGroup2 != null) {
            this.LLJILJILJ = (ConstraintLayout) viewGroup2.findViewById(R.id.oo8);
            this.LLJILLL = (C1251240ifK) viewGroup2.findViewById(R.id.fdj);
            MultiguestNoticeboardV2Setting multiguestNoticeboardV2Setting = MultiguestNoticeboardV2Setting.INSTANCE;
            if (multiguestNoticeboardV2Setting.templateEnable()) {
                ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.y_g);
                this.LLJJIJIL = viewGroup3;
                if (viewGroup3 != null) {
                    C12ES.LJIILL(0, viewGroup3);
                }
                this.LLJJJ = (TuxIconView) viewGroup2.findViewById(R.id.jq9);
                this.LLJJJIL = (TuxIconView) viewGroup2.findViewById(R.id.hp2);
                this.LLJJJJ = (TextView) viewGroup2.findViewById(R.id.y3l);
                this.LLJJJJJIL = (TuxIconView) viewGroup2.findViewById(R.id.e1w);
            } else {
                ViewGroup viewGroup4 = (ViewGroup) viewGroup2.findViewById(R.id.y_f);
                this.LLJJIJIL = viewGroup4;
                if (viewGroup4 != null) {
                    C12ES.LJIILL(0, viewGroup4);
                }
                this.LLJJJ = (TuxIconView) viewGroup2.findViewById(R.id.jq7);
                this.LLJJJIL = (TuxIconView) viewGroup2.findViewById(R.id.hp1);
                this.LLJJJJ = (TextView) viewGroup2.findViewById(R.id.title);
                this.LLJJJJJIL = (TuxIconView) viewGroup2.findViewById(R.id.e1v);
            }
            TuxIconView tuxIconView = this.LLJJJ;
            if (tuxIconView != null) {
                tuxIconView.setLabel(C497740JfY.LJIJI(2131851135));
            }
            TuxIconView tuxIconView2 = this.LLJJJIL;
            if (tuxIconView2 != null) {
                tuxIconView2.setLabel(C497740JfY.LJIJI(2131840840));
            }
            TuxIconView tuxIconView3 = this.LLJJJJJIL;
            if (tuxIconView3 != null) {
                tuxIconView3.setLabel(C497740JfY.LJIJI(2131840885));
            }
            C1251240ifK c1251240ifK = this.LLJILLL;
            if (c1251240ifK != null) {
                c1251240ifK.setDataChannel(this.LLJI.LIZIZ);
            }
            TextView textView = this.LLJJJJ;
            if (textView != null) {
                if (multiguestNoticeboardV2Setting.isPreviewEnable()) {
                    i2 = 2131854991;
                } else {
                    i2 = 2131854020;
                }
                textView.setText(i2);
            }
            this.LLJILJIL = findViewById(R.id.h3n);
            View view2 = this.LLJILJIL;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                layoutParams2.height = (int) (C497740JfY.LJIILLIIL() * 0.345f);
                C786410Ut5.W5(view2, layoutParams2);
            }
            this.LLJJIJIIJIL = (ViewGroup) viewGroup2.findViewById(R.id.evm);
            C2260371Ddb c2260371Ddb = (C2260371Ddb) viewGroup2.findViewById(R.id.wq2);
            c2260371Ddb.setOnGestureListener(new InterfaceC2260401Dde() { // from class: X.0bNg
                public boolean LIZ;

                @Override // X.InterfaceC2260401Dde
                public final void LIZ() {
                }

                @Override // X.InterfaceC2260401Dde
                public final void LIZJ() {
                    LJII(false);
                    DialogC971200bNe dialogC971200bNe = this.LIZIZ;
                    if (dialogC971200bNe.LLLIIII == null) {
                        dialogC971200bNe.LLLIIIIL.setValue(EnumC953070auP.NORMAL);
                    } else if (dialogC971200bNe.LJLIIIL()) {
                        EnumC953070auP value = this.LIZIZ.LLLIIIIL.getValue();
                        EnumC953070auP enumC953070auP = EnumC953070auP.INPUT;
                        if (value != enumC953070auP) {
                            DialogC971200bNe dialogC971200bNe2 = this.LIZIZ;
                            dialogC971200bNe2.LJLJJI(dialogC971200bNe2.LLLII.get(0));
                            this.LIZIZ.LLLIIIIL.setValue(enumC953070auP);
                        }
                    }
                    this.LIZIZ.LLLF.LJIIL(false);
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
                    if (this.LIZIZ.LLLIIIIL.getValue() == EnumC953070auP.INPUT) {
                        return true;
                    }
                    C971330bNr c971330bNr = this.LIZIZ.LLLIIII;
                    return C500260Jjc.LJJJI((c971330bNr == null || (c971360bNu = c971330bNr.LIZJ) == null || (str = c971360bNu.LIZ) == null) ? null : Boolean.valueOf(a0.LJJJIL(str)));
                }

                @Override // X.InterfaceC2260401Dde
                public final boolean LIZIZ(MotionEvent motionEvent) {
                    if (motionEvent == null) {
                        return false;
                    }
                    DialogC971200bNe dialogC971200bNe = this.LIZIZ;
                    if (!dialogC971200bNe.LJLIIIL()) {
                        C971330bNr c971330bNrLJFF = dialogC971200bNe.LLLF.LJFF(motionEvent);
                        if (c971330bNrLJFF != null) {
                            if (!Intrinsics.LJFF(dialogC971200bNe.LLLIIII, c971330bNrLJFF)) {
                                C971330bNr c971330bNr = dialogC971200bNe.LLLIIII;
                                if (c971330bNr != null) {
                                    c971330bNr.LIZ.setState(EnumC971280bNm.INVISIBLE);
                                }
                                dialogC971200bNe.LJLJJI(c971330bNrLJFF);
                            }
                            dialogC971200bNe.LLLIIIIL.setValue(EnumC953070auP.INPUT);
                            return true;
                        }
                        dialogC971200bNe.LLLIIIIL.setValue(EnumC953070auP.NORMAL);
                        dialogC971200bNe.LJLJJI(null);
                        return true;
                    }
                    return true;
                }

                public final void LJII(boolean z) {
                    C971330bNr c971330bNr;
                    C971380bNw c971380bNw;
                    C971360bNu c971360bNu;
                    String str;
                    int i4;
                    C971330bNr c971330bNr2;
                    C971380bNw c971380bNw2;
                    C971360bNu c971360bNu2;
                    String str2;
                    Boolean boolValueOf = null;
                    if (!this.LIZ) {
                        if (z) {
                            C971330bNr c971330bNr3 = this.LIZIZ.LLLIIII;
                            if (c971330bNr3 != null && (c971360bNu2 = c971330bNr3.LIZJ) != null && (str2 = c971360bNu2.LIZ) != null) {
                                boolValueOf = Boolean.valueOf(a0.LJJJIL(str2));
                            }
                            if (C500260Jjc.LJJIFFI(boolValueOf) && (c971330bNr2 = this.LIZIZ.LLLIIII) != null && (c971380bNw2 = c971330bNr2.LIZ) != null) {
                                c971380bNw2.setState(EnumC971280bNm.SHOW_BORDER);
                            }
                        }
                    } else if (!z) {
                        C971330bNr c971330bNr4 = this.LIZIZ.LLLIIII;
                        if (c971330bNr4 != null && (c971360bNu = c971330bNr4.LIZJ) != null && (str = c971360bNu.LIZ) != null) {
                            boolValueOf = Boolean.valueOf(a0.LJJJIL(str));
                        }
                        if (C500260Jjc.LJJIFFI(boolValueOf) && (c971330bNr = this.LIZIZ.LLLIIII) != null && (c971380bNw = c971330bNr.LIZ) != null) {
                            c971380bNw.setState(EnumC971280bNm.SHOW_BTN_BORDER);
                        }
                    }
                    this.LIZ = z;
                    DialogC971200bNe dialogC971200bNe = this.LIZIZ;
                    C415700GRs c415700GRs = dialogC971200bNe.LLLIILIL;
                    if (c415700GRs != null) {
                        if (z && dialogC971200bNe.LLLIIII != null) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        int visibility = c415700GRs.getVisibility();
                        c415700GRs.setVisibility(i4);
                        C1602160rnK.LIZIZ(visibility, i4, c415700GRs);
                    }
                }

                @Override // X.InterfaceC2260401Dde
                public final void LJJLIIIJLJLI(float f) {
                    if (LJIIIIZZ()) {
                        return;
                    }
                    LJII(true);
                    this.LIZIZ.LJLIL();
                    this.LIZIZ.LJLILLLLZI(f);
                }

                @Override // X.InterfaceC2260401Dde
                public final void onDown(MotionEvent motionEvent) {
                    String str;
                    C971360bNu c971360bNu;
                    if (this.LIZ) {
                        return;
                    }
                    this.LIZIZ.LLLF.LJIIL(true);
                    C971330bNr c971330bNrLJFF = this.LIZIZ.LLLF.LJFF(motionEvent);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("cur click: ");
                    if (c971330bNrLJFF != null && (c971360bNu = c971330bNrLJFF.LIZJ) != null) {
                        str = c971360bNu.LIZ;
                    } else {
                        str = null;
                    }
                    sbLIZ.append(str);
                    sbLIZ.append(", event: ");
                    sbLIZ.append(motionEvent);
                    C20441214yg.LIZIZ("NoticeBoardDialog", C2188811AlT.LIZIZ(sbLIZ));
                    if (c971330bNrLJFF != null) {
                        C2260371Ddb c2260371Ddb2 = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
                        if (c2260371Ddb2 != null) {
                            c2260371Ddb2.setHasConsumed(true);
                        }
                        this.LIZIZ.LJLJJI(c971330bNrLJFF);
                    } else if (this.LIZIZ.LJLIIIL() && this.LIZIZ.LLLIIIIL.getValue() != EnumC953070auP.INPUT) {
                        C2260371Ddb c2260371Ddb3 = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
                        if (c2260371Ddb3 != null) {
                            c2260371Ddb3.setHasConsumed(true);
                        }
                        DialogC971200bNe dialogC971200bNe = this.LIZIZ;
                        dialogC971200bNe.LJLJJI(dialogC971200bNe.LLLII.get(0));
                    } else {
                        C2260371Ddb c2260371Ddb4 = this.LIZIZ.LLJJLIIIJLLLLLLLZ;
                        if (c2260371Ddb4 != null) {
                            c2260371Ddb4.setHasConsumed(false);
                        }
                        this.LIZIZ.LJLJJI(null);
                    }
                    EnumC953070auP value = this.LIZIZ.LLLIIIIL.getValue();
                    EnumC953070auP enumC953070auP = EnumC953070auP.TEXT_STYLE;
                    if (value == enumC953070auP) {
                        this.LIZIZ.LLLIIIIL.setValue(enumC953070auP);
                    }
                }

                @Override // X.InterfaceC2260401Dde
                public final void onScale(float f) {
                    if (LJIIIIZZ()) {
                        return;
                    }
                    LJII(true);
                    this.LIZIZ.LJLIL();
                    this.LIZIZ.LJLJI(f);
                }

                @Override // X.InterfaceC2260401Dde
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    if (motionEvent == null) {
                        return false;
                    }
                    DialogC971200bNe dialogC971200bNe = this.LIZIZ;
                    dialogC971200bNe.LJLJJLL(dialogC971200bNe.LLLF.LJFF(motionEvent));
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
                    DialogC971200bNe dialogC971200bNe = this.LIZIZ;
                    C971330bNr c971330bNr = dialogC971200bNe.LLLIIII;
                    if (c971330bNr != null) {
                        C971380bNw c971380bNw = c971330bNr.LIZ;
                        float right = ((c971380bNw.getRight() + c971380bNw.getLeft()) * 0.5f) + c971380bNw.getTranslationX() + f;
                        float bottom = ((c971380bNw.getBottom() + c971380bNw.getTop()) * 0.5f) + c971380bNw.getTranslationY() + f2;
                        if (right > 0.0f && bottom > 0.0f && right < dialogC971200bNe.LLLIL && bottom < dialogC971200bNe.LLLILZ && (surfaceView = dialogC971200bNe.LLJJL) != null) {
                            dialogC971200bNe.LLLF.LJIJ(new C971120bNW(EnumC971100bNU.TRANSFORM, Float.valueOf(C363400EMo.LIZJ(c971330bNr.LIZIZ.getTransformX()) + (f / surfaceView.getWidth())), Float.valueOf(C363400EMo.LIZLLL(c971330bNr.LIZIZ.getTransformY()) + (f2 / surfaceView.getHeight())), null, null, c971330bNr, null, 88));
                            C971380bNw c971380bNw2 = c971330bNr.LIZ;
                            float translationX = c971380bNw2.getTranslationX() + f;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c971380bNw2);
                            c971380bNw2.setTranslationX(translationX);
                            float translationY = c971380bNw2.getTranslationY() + f2;
                            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c971380bNw2);
                            c971380bNw2.setTranslationY(translationY);
                        }
                    }
                    DialogC971200bNe dialogC971200bNe2 = this.LIZIZ;
                    C2260371Ddb c2260371Ddb2 = dialogC971200bNe2.LLJJLIIIJLLLLLLLZ;
                    if (c2260371Ddb2 != null) {
                        if (dialogC971200bNe2.LLLIIII == null) {
                            z = false;
                        }
                        c2260371Ddb2.setHasConsumed(z);
                    }
                }
            });
            this.LLJJLIIIJLLLLLLLZ = c2260371Ddb;
            SurfaceView surfaceView = new SurfaceView(getContext());
            surfaceView.setClipToOutline(true);
            surfaceView.setOutlineProvider(new C521570Kct(surfaceView, 3));
            this.LLJJL = surfaceView;
            C2260371Ddb c2260371Ddb2 = this.LLJJLIIIJLLLLLLLZ;
            if (c2260371Ddb2 != null) {
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(this.LLLIL, this.LLLILZ);
                layoutParams3.gravity = 17;
                c2260371Ddb2.addView(surfaceView, layoutParams3);
            }
            C971040bNO c971040bNO = this.LLLF;
            C953100auS c953100auS = this.LLJI;
            c971040bNO.getClass();
            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
            AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(c971040bNO, c953100auS, 132);
            multiCanvasUtils.getClass();
            MultiCanvasUtils.LIZJ(awS416S0200000_15, null);
            this.LLJJI = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).VY0(getContext(), new AwS559S0100000_15(this, 1229));
            if (multiguestNoticeboardV2Setting.templateEnable()) {
                View view3 = this.LLJJI;
                if (view3 != null) {
                    view3.setId(View.generateViewId());
                }
                ConstraintLayout constraintLayout = this.LLJILJILJ;
                if (constraintLayout != null && (view = this.LLJJI) != null) {
                    float f = 32;
                    C786410Ut5.W5(view, new C19ME((int) C497740JfY.LIZIZ(f), (int) C497740JfY.LIZIZ(f)));
                    constraintLayout.addView(view);
                    C19MB c19mb = new C19MB();
                    c19mb.LJII(constraintLayout);
                    C1251240ifK c1251240ifK2 = this.LLJILLL;
                    if (c1251240ifK2 != null) {
                        c19mb.LJIIIZ(view.getId(), 3, c1251240ifK2.getId(), 3, (int) C497740JfY.LIZIZ(16));
                    }
                    c19mb.LJIIIZ(view.getId(), 7, constraintLayout.getId(), 7, (int) C497740JfY.LIZIZ(16));
                    c19mb.LIZIZ(constraintLayout);
                }
            } else {
                ViewGroup viewGroup5 = (ViewGroup) findViewById(R.id.ik6);
                if (viewGroup5 != null) {
                    View view4 = this.LLJJI;
                    float f2 = 24;
                    FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(f2), (int) C497740JfY.LIZIZ(f2));
                    float f3 = 12;
                    layoutParams4.setMarginEnd((int) C497740JfY.LIZIZ(f3));
                    layoutParams4.topMargin = (int) C497740JfY.LIZIZ(f3);
                    layoutParams4.gravity = 8388661;
                    viewGroup5.addView(view4, layoutParams4);
                }
            }
            if (multiguestNoticeboardV2Setting.isPreviewEnable() && (viewGroup = this.LLJIJIL) != null) {
                HandlerHook.viewPost(viewGroup, new ARunnableS113S0100000_13(this, 304));
            }
            if (multiguestNoticeboardV2Setting.templateEnable()) {
                View viewFindViewById2 = findViewById(R.id.pdc);
                C500260Jjc.LJLIIIL(500L, viewFindViewById2, new AwS594S0100000_15(this, 1212));
                this.LLJJIII = viewFindViewById2;
                C12ES.LJIILL(0, viewFindViewById2);
            }
            C415700GRs c415700GRs = new C415700GRs(getContext());
            int visibility = c415700GRs.getVisibility();
            c415700GRs.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c415700GRs);
            this.LLLIILIL = c415700GRs;
            C2260371Ddb c2260371Ddb3 = this.LLJJLIIIJLLLLLLLZ;
            if (c2260371Ddb3 != null) {
                c2260371Ddb3.addView(c415700GRs, new FrameLayout.LayoutParams(this.LLLIL, this.LLLILZ));
            }
            TuxIconView tuxIconView4 = this.LLJJJ;
            if (tuxIconView4 != null) {
                tuxIconView4.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0apH
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view5) {
                        if (C915980Zwa.LIZJ().isOffline()) {
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C949900apI(C953760avW.LIZIZ.LIZ(), null), 3);
                            C766270U4b.LJIIJJI("clear all notice board cache");
                            return true;
                        }
                        return true;
                    }
                });
            }
            TuxIconView tuxIconView5 = this.LLJJJ;
            if (tuxIconView5 != null) {
                if (C426750GoL.LIZLLL(getContext())) {
                    C786410Ut5.hc(tuxIconView5, -1.0f);
                }
                C500260Jjc.LJLIIIL(2000L, tuxIconView5, new AwS594S0100000_15(this, 1215));
            }
            TuxIconView tuxIconView6 = this.LLJJJIL;
            if (tuxIconView6 != null) {
                if (C426750GoL.LIZLLL(getContext())) {
                    C786410Ut5.hc(tuxIconView6, -1.0f);
                }
                C500260Jjc.LJLIIIL(2000L, tuxIconView6, new AwS594S0100000_15(this, 1217));
            }
            TuxIconView tuxIconView7 = this.LLJJJJJIL;
            if (tuxIconView7 != null) {
                C500260Jjc.LJLIIIL(500L, tuxIconView7, new AwS594S0100000_15(this, 1208));
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById(R.id.tfz);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZLLL = Integer.valueOf(C497740JfY.LIZLLL(R.attr.exz, getContext()));
            c419910GdJ.LIZ = R.raw.icon_exclamation_mark_triangle_inline;
            float f4 = 12;
            c419910GdJ.LIZIZ = (int) C497740JfY.LIZIZ(f4);
            c419910GdJ.LIZJ = (int) C497740JfY.LIZIZ(f4);
            appCompatTextView.setCompoundDrawablesWithIntrinsicBounds(c419910GdJ.LIZ(getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
            C16FS c16fs = (C16FS) viewGroup2.findViewById(R.id.f6f);
            if (c16fs != null) {
                C786410Ut5.h8(c16fs, new ACListenerS150S0100000_15(this, 318));
            } else {
                c16fs = null;
            }
            this.LLJJ = c16fs;
            EnumC952890au7 enumC952890au7 = this.LLJI.LIZJ;
            if (enumC952890au7 != EnumC952890au7.PREVIEW_SETTING && enumC952890au7 != EnumC952890au7.PREVIEW_BOARD_ICON && enumC952890au7 != EnumC952890au7.PREVIEW_PLAYBOOK && enumC952890au7 != EnumC952890au7.PREVIEW_TOOLBAR_PLAYBOOK && enumC952890au7 != EnumC952890au7.PLAYBOOK_EDIT) {
                i = 2131853946;
            } else {
                i = 2131853960;
            }
            if (c16fs != null) {
                c16fs.setText(i);
            }
            ViewGroup viewGroup6 = (ViewGroup) C786410Ut5.Td(C972080bP4.LIZ(C786410Ut5.ne(getContext())), R.layout.g_1, (ViewGroup) findViewById(R.id.ccd), false);
            this.LLJL = viewGroup6;
            if (viewGroup6 != null) {
                C500260Jjc.LJIILIIL(viewGroup6);
                TuxTextView tuxTextView = (TuxTextView) viewGroup6.findViewById(R.id.xpu);
                if (tuxTextView != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C497740JfY.LJIJI(2131853954));
                    sbLIZ.append("...");
                    tuxTextView.setHint(C2188811AlT.LIZIZ(sbLIZ));
                    C786410Ut5.h9(tuxTextView, new ACListenerS150S0100000_15(this, 319));
                    C786410Ut5.x3(tuxTextView.getViewTreeObserver(), new ViewTreeObserverOnGlobalLayoutListenerC346410Di3(tuxTextView, 4));
                } else {
                    tuxTextView = null;
                }
                this.LLJLL = tuxTextView;
                this.LLJLILLLLZIIL = (ViewGroup) viewGroup6.findViewById(R.id.xpt);
                View viewFindViewById3 = viewGroup6.findViewById(R.id.dnz);
                C786410Ut5.I7(new ACListenerS150S0100000_15(this, 320), viewFindViewById3);
                this.LLJLLL = viewFindViewById3;
                this.LLJLIL = (ViewGroup) viewGroup6.findViewById(R.id.kqv);
                EditText editText = (EditText) viewGroup6.findViewById(R.id.grz);
                editText.setHint(2131853954);
                editText.addTextChangedListener(new C987080bnG(this, 2));
                editText.setOnEditorActionListener(new C986900bmy(this, 2));
                editText.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC986920bn0(this, 13));
                this.LLJLLIL = editText;
                TuxIconView tuxIconView8 = (TuxIconView) viewGroup6.findViewById(R.id.gp5);
                C786410Ut5.a9(tuxIconView8, new ACListenerS150S0100000_15(this, 321));
                tuxIconView8.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: X.0bOI
                    @Override // android.view.View.AccessibilityDelegate
                    public final void onInitializeAccessibilityNodeInfo(View view5, AccessibilityNodeInfo accessibilityNodeInfo) {
                        super.onInitializeAccessibilityNodeInfo(view5, accessibilityNodeInfo);
                        accessibilityNodeInfo.setText(C497740JfY.LJIJI(2131851120));
                    }
                });
                ViewGroup viewGroup7 = (ViewGroup) viewGroup6.findViewById(R.id.ih8);
                if (viewGroup7 != null) {
                    InterfaceC971680bOQ interfaceC971680bOQLJIIJ = MultiCanvasUtils.LJIIJ();
                    if (interfaceC971680bOQLJIIJ != null) {
                        Context context = getContext();
                        if (!C500260Jjc.LJJIL() && C931810aM7.LIZJ(PlayEntityUtilKt.LJIIIZ())) {
                            context = C1834150xpV.LJII(context);
                        }
                        c196990125kLIZLLL = interfaceC971680bOQLJIIJ.LIZLLL(context, AFwS250S0000000_15.get$arr$(100), EnumC2011407uK.NOTICE_BOARD, new AwS594S0100000_15(this, 1209));
                    }
                    this.LLJZ = c196990125kLIZLLL;
                    viewGroup7.addView(c196990125kLIZLLL);
                }
                C1420790n4n c1420790n4n = (C1420790n4n) viewGroup6.findViewById(R.id.e8q);
                C1117360fBO c1117360fBO = new C1117360fBO();
                c1117360fBO.LLLI(C971410bNz.class, new C971470bO5(new C971300bNo(this)));
                C410901il c410901il = new C410901il();
                List<Integer> list = C971490bO7.LIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C971410bNz(((Number) it2.next()).intValue()));
                }
                c410901il.addAll(arrayList);
                c1117360fBO.LL = c410901il;
                this.LLL = c1117360fBO;
                c1420790n4n.setAdapter(c1117360fBO);
                c1420790n4n.setClipToPadding(false);
                this.LLJZIJLIL = c1420790n4n;
            }
            ViewGroup viewGroup8 = (ViewGroup) findViewById(R.id.ccd);
            if (viewGroup8 != null) {
                viewGroup8.addView(this.LLJL);
            }
            switch (C953060auO.LIZIZ[this.LLJI.LIZJ.ordinal()]) {
                case 7:
                case 8:
                case BdTuring.TYPE_ECAF /* 9 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                case BdTuring.TYPE_EMAIL /* 11 */:
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                case 14:
                    ViewGroup viewGroup9 = this.LLJJIJIIJIL;
                    if (viewGroup9 != null) {
                        this.LLLF.getClass();
                        C953770avX c953770avXLJIIIIZZ = C953760avW.LIZIZ.LIZ().LJIIIIZZ();
                        if (c953770avXLJIIIIZZ != null) {
                            C952290at9 c952290at9 = new C952290at9(getContext(), c953770avXLJIIIIZZ, new AwS416S0200000_15(c953770avXLJIIIIZZ, this, 131));
                            this.LLJJJJLIIL = c952290at9;
                            if (!MultiguestNoticeboardV2Setting.INSTANCE.templateEnable()) {
                                i3 = 1;
                            }
                            viewGroup9.addView(c952290at9, i3);
                        }
                        break;
                    }
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
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
                    break;
                default:
                    throw new C1954807lC();
            }
        }
        AObserverS219S0100000_15 aObserverS219S0100000_15 = new AObserverS219S0100000_15(this, 136);
        this.LLLIIL = aObserverS219S0100000_15;
        this.LLLIIIIL.observeForever(aObserverS219S0100000_15);
        DataChannel dataChannel = this.LLJI.LIZIZ;
        if (dataChannel != null) {
            dataChannel.CQ2(NoticeBoardBoarderViewRotationEvent.class, this, new AwS594S0100000_15(this, 1216));
            dataChannel.CQ2(NoticeBoardBoarderViewScaleEvent.class, this, new AwS594S0100000_15(this, 1218));
            dataChannel.CQ2(ScrollEndEvent.class, this, new AwS594S0100000_15(this, 1219));
            dataChannel.CQ2(EditEvent.class, this, new AwS594S0100000_15(this, 1220));
            dataChannel.CQ2(ShowDottedViewEvent.class, this, new AwS594S0100000_15(this, 1202));
            dataChannel.CQ2(HidePreviewEvent.class, this, new AwS594S0100000_15(this, 1203));
            dataChannel.CQ2(HideNoticeBoardWhenUseTemplate.class, this, new AwS594S0100000_15(this, 1205));
            dataChannel.CQ2(ShowTemplateDialogWhenTemplateEditDialogDismiss.class, this, new AwS594S0100000_15(this, 1214));
        }
        EnumC952890au7 enumC952890au72 = this.LLJI.LIZJ;
        if (enumC952890au72 == EnumC952890au7.PREVIEW_SETTING || enumC952890au72 == EnumC952890au7.PREVIEW_BOARD_ICON || enumC952890au72 == EnumC952890au7.PREVIEW_PLAYBOOK || enumC952890au72 == EnumC952890au7.PREVIEW_TOOLBAR_PLAYBOOK || enumC952890au72 == EnumC952890au7.PLAYBOOK_EDIT) {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).qR(this.LLJI.LIZIZ, this.LLLILZLLLI, "NoticeBoardDialog");
        }
        if (MultiguestNoticeboardV2Setting.INSTANCE.templateEnable()) {
            C953230auf c953230auf = C953230auf.LIZ;
            C970980bNI c970980bNI = (C970980bNI) this.LLLIZZ.getValue();
            c953230auf.getClass();
            C953230auf.LIZLLL(1, c970980bNI);
        }
    }

    @Override // X.InterfaceC971000bNK
    public final void LJJIIZ(List<C971360bNu> list, List<C971360bNu> list2) {
        for (C971330bNr c971330bNr : this.LLLII) {
            int i = 0;
            for (C971360bNu c971360bNu : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    if (Intrinsics.LJFF(c971330bNr.LIZJ.LIZ, c971360bNu.LIZ)) {
                        c971330bNr.LIZJ.LIZ = ((C971360bNu) ListProtector.get(list2, i)).LIZ;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        Iterator<C971330bNr> it2 = this.LLLII.iterator();
        while (it2.hasNext()) {
            this.LLLF.LJIJ(new C971120bNW(EnumC971100bNU.TEXT, null, null, null, null, it2.next(), null, 94));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTextByTranslatedTexts, starlingKetList: ");
        sbLIZ.append(list);
        sbLIZ.append(", translatedTextList: ");
        sbLIZ.append(list2);
        C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJL(NLETrackSlot nLETrackSlot, C971380bNw c971380bNw) {
        Boolean boolValueOf;
        float f;
        boolean z;
        RectF rectFLJIIIIZZ = this.LLLF.LJIIIIZZ(nLETrackSlot);
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
            rectFLJIIIIZZ.left -= defaultTextWidthAndHeight.getFirst().intValue() / 2;
            rectFLJIIIIZZ.right += defaultTextWidthAndHeight.getFirst().intValue() / 2;
            rectFLJIIIIZZ.top -= defaultTextWidthAndHeight.getSecond().intValue() / 2;
            rectFLJIIIIZZ.bottom += defaultTextWidthAndHeight.getSecond().intValue() / 2;
        }
        float f2 = 48;
        float fLIZIZ = C497740JfY.LIZIZ(f2);
        float fLIZIZ2 = C497740JfY.LIZIZ(f2);
        int iAbs = (int) (Math.abs(rectFLJIIIIZZ.width()) + fLIZIZ);
        int iHeight = (int) (rectFLJIIIIZZ.height() + fLIZIZ2);
        if (c971380bNw.getParent() == null) {
            C2260371Ddb c2260371Ddb = this.LLJJLIIIJLLLLLLLZ;
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
            f = -(rectFLJIIIIZZ.left - (fLIZIZ / 2));
        } else {
            f = rectFLJIIIIZZ.left - (fLIZIZ / 2);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c971380bNw);
        c971380bNw.setTranslationX(f);
        float f3 = rectFLJIIIIZZ.top - (fLIZIZ2 / 2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c971380bNw);
        c971380bNw.setTranslationY(f3);
        float f4 = -nLETrackSlot.getRotation();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c971380bNw);
        c971380bNw.setRotation(f4);
    }
}

package X;

import Y.ATListenerS465S0100000_33;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.ttm.player.s;
import fyo.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1AOg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178641AOg extends C2178631AOf implements C1AOP {
    public C1AON LLJLL;
    public RelativeLayout LLJLLIL;
    public RelativeLayout LLJLLL;
    public final C1AP3 LLJZ;
    public final C2178811AOx LLJZIJLIL;
    public C1AME LLL;
    public List<C2178631AOf> LLLF;
    public boolean LLLFF;
    public VideoContext LLLFFI;

    @Override // X.C2178631AOf, X.InterfaceC2178771AOt
    public final void LJJIIJZLJL(InterfaceC1471800oP4 interfaceC1471800oP4, C1474420oTI c1474420oTI, InterfaceC1474410oTH interfaceC1474410oTH, boolean z, int i, boolean z2, boolean z3) {
    }

    @Override // X.C2178631AOf
    public final void LJJLIIIJJI() {
        C1474420oTI c1474420oTI = this.LLILZLL;
        if (c1474420oTI == null) {
            return;
        }
        EnumC1471780oP2 enumC1471780oP2 = EnumC1471780oP2.INS;
        enumC1471780oP2.trace(c1474420oTI, EnumC1474270oT3.LAYER_HOST_PLAY, null, null, getVideoStateInquirer());
        this.LLJJJJJIL = true;
        if (!this.LLLFFI.LJJJJZ(this.LLILZLL)) {
            C1474460oTM.LIZIZ(this.LLLFFI.LJJJJLI(), "play_next");
            C2178641AOg c2178641AOg = this.LLLFFI.LLILLL;
            if (c2178641AOg != null) {
                c2178641AOg.LJJLIIIJL();
            }
        }
        LJJLIIIJLJLI();
        enumC1471780oP2.trace(this.LLILZLL, EnumC1474270oT3.LAYER_HOST_RELEASE_LAST, null, null, getVideoStateInquirer());
        if (!this.LLJI.LJJJJLI()) {
            setTextureLayout(this.LLIZ.LJI);
        }
        setRenderMode(this.LLIZ.LJII);
        this.LLLFFI.LJJLIIIJL(this);
        VideoContext videoContext = this.LLLFFI;
        C1AMG c1amg = this.LLILZLL.LJIIIIZZ;
        videoContext.LLJJI = c1amg;
        videoContext.LL.LLILLL = c1amg;
        C12ES.LJIILL(0, this);
        C12ES.LJIILL(0, this.LLJLLIL);
        C12ES.LJIILL(0, this.LLILLJJLI.getVideoContainer());
        LJJLIIIJJIZ();
        C12ES.LJIILL(0, this.LLJLLIL);
        C12ES.LJIILL(0, this.LLILLJJLI.getVideoContainer());
        VideoContext videoContext2 = this.LLLFFI;
        this.LLILZLL.getClass();
        videoContext2.LL.LLIZ = false;
        VideoContext videoContext3 = this.LLLFFI;
        this.LLILZLL.getClass();
        videoContext3.LJJLIIIJLJLI();
        C2178651AOh c2178651AOh = this.LLLFFI.LL;
        if (c2178651AOh.LLJJIJIIJIL) {
            int i = c2178651AOh.LLILZLL;
            if (i == 2) {
                int iLJI = c2178651AOh.LJI(true);
                int iLIZIZ = C1486280omQ.LIZIZ(c2178651AOh.LLJ);
                if (iLJI == -1 || iLJI == iLIZIZ) {
                    return;
                }
                c2178651AOh.LJII(iLJI);
                return;
            }
            if (i == 0) {
                int iLJI2 = c2178651AOh.LJI(false);
                int iLIZIZ2 = C1486280omQ.LIZIZ(c2178651AOh.LLJ);
                if (iLJI2 == -1 || iLJI2 == iLIZIZ2) {
                    return;
                }
                c2178651AOh.LJII(iLJI2);
            }
        }
    }

    @Override // X.C2178631AOf
    public final void LJJLIIIJL() {
        VideoContext videoContext;
        if (!this.LLJILJIL.LIZJ() && this.LLLFF) {
            C12ES.LJIILL(8, this.LLJLLIL);
            C12ES.LJIILL(8, this.LLILLJJLI.getVideoContainer());
            C12ES.LJIILL(0, this.LLJLLL);
        }
        if (LJJL() && (videoContext = this.LLLFFI) != null && !videoContext.LJJJLIIL()) {
            LJJJJLL();
            if (LJJL()) {
                setBackgroundColor(0);
            }
        }
        super.LJJLIIIJL();
    }

    @Override // X.C1AOP
    public C1474420oTI getBindPlayEntity() {
        C1AME c1ame = this.LLL;
        if (c1ame != null) {
            return c1ame.getPlayEntity();
        }
        return null;
    }

    public boolean getDeactiveLayerWhenRelease() {
        C1AON c1aon = this.LLJLL;
        return c1aon != null && c1aon.LJII;
    }

    public C1AMI getLayerEventListener() {
        C1AON c1aon = this.LLJLL;
        if (c1aon != null) {
            c1aon.getClass();
        }
        return null;
    }

    public C1AME getParentView() {
        C1AME c1ame = this.LLL;
        if (c1ame != null && c1ame == getParent()) {
            return this.LLL;
        }
        if (getParent() instanceof C1AME) {
            this.LLL = (C1AME) getParent();
        }
        return this.LLL;
    }

    public C2178631AOf getPlayingVideoPatch() {
        List<C2178631AOf> list = this.LLLF;
        if (list == null) {
            return null;
        }
        for (C2178631AOf c2178631AOf : list) {
            if (c2178631AOf.LJJJLZIJ()) {
                return c2178631AOf;
            }
        }
        return null;
    }

    public boolean getUseActiveLayers() {
        C1AON c1aon = this.LLJLL;
        return c1aon != null && c1aon.LJI;
    }

    public int getVideoHeight() {
        InterfaceC2178741AOq videoView = this.LLILLJJLI.getVideoView();
        if (videoView != null) {
            return videoView.getHeight();
        }
        return 0;
    }

    public int getVideoWidth() {
        InterfaceC2178741AOq videoView = this.LLILLJJLI.getVideoView();
        if (videoView != null) {
            return videoView.getWidth();
        }
        return 0;
    }

    private s getPlaybackParams() {
        s sVarLJII;
        InterfaceC1471800oP4 videoStateInquirer = getVideoStateInquirer();
        return (videoStateInquirer == null || (sVarLJII = videoStateInquirer.LJII()) == null) ? new s() : sVarLJII;
    }

    @Override // X.C2178631AOf
    public final void LJJLIIIJILLIZJL() {
        super.LJJLIIIJILLIZJL();
        this.LLLFFI.LJJLIIIJJIZ(hashCode(), false);
    }

    @Override // X.C2178631AOf
    public final void LJJLIIIJLJLI() {
        super.LJJLIIIJLJLI();
        VideoContext videoContext = this.LLLFFI;
        InterfaceC2178671AOj interfaceC2178671AOjLIZIZ = videoContext.LLJJJ.LIZIZ(this.LLILZLL);
        if (interfaceC2178671AOjLIZIZ != null) {
            this.LLJI = interfaceC2178671AOjLIZIZ;
            if (this.LLILZLL != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("1 retrieve prepared controller vid:");
                sbLIZ.append(this.LLILZLL.LIZ);
                sbLIZ.append(" title:");
                this.LLILZLL.getClass();
                sbLIZ.append((String) null);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            if (LJJL()) {
                LJJLIIJ(this.LLJI.LIZ());
            } else {
                VideoContext videoContext2 = this.LLLFFI;
                C1A79 c1a79LIZ = videoContext2.LLJJJ.LIZ(this.LLILZLL);
                InterfaceC2178711AOn interfaceC2178711AOn = this.LLILLJJLI;
                if ((interfaceC2178711AOn instanceof C1474470oTN) && c1a79LIZ != null) {
                    C1474470oTN c1474470oTN = (C1474470oTN) interfaceC2178711AOn;
                    c1474470oTN.getClass();
                    C12ES.LIZIZ(c1a79LIZ);
                    C12ES.LIZIZ(c1474470oTN.LL);
                    c1474470oTN.LL = c1a79LIZ;
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.gravity = 17;
                    c1474470oTN.addView(c1a79LIZ, 0, layoutParams);
                    c1474470oTN.LIZLLL();
                    c1a79LIZ.setSurfaceTextureListener(null);
                    c1474470oTN.LLILZIL = 0;
                    c1474470oTN.LLILZ = 0;
                    C1A79 textureVideoView = c1474470oTN.getTextureVideoView();
                    this.LLILLL = textureVideoView;
                    textureVideoView.setSurfaceCallback(this);
                    LJJLIIJ(this.LLJI.LIZ());
                }
            }
            EnumC1471750oOz.INS.addTrace(this.LLILZLL, C1471760oP0.LIZIZ("RetrieveVC", EnumC1474430oTJ.PLAY, 6));
            this.LLJI.setPlayEntity(this.LLILZLL);
        }
    }

    public ViewGroup getLayerForePlayContainer() {
        return this.LLJLLL;
    }

    public C1AON getLayerHost() {
        return this.LLJLL;
    }

    @Override // X.C1AOP
    public ViewGroup getLayerMainContainer() {
        return this.LLJLLIL;
    }

    public RelativeLayout getLayerRoot() {
        return this.LLJLLIL;
    }

    @Override // X.C1AOP
    public ViewGroup getLayerRootContainer() {
        return this.LLJLLIL;
    }

    public List<C2178631AOf> getVideoPatchLayouts() {
        return this.LLLF;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1AP3] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1AOx] */
    public C2178641AOg(Context context) {
        super(context);
        this.LLJZ = new C790900V0u() { // from class: X.1AP3
        };
        this.LLJZIJLIL = new C790900V0u() { // from class: X.1AOx
        };
        this.LLLFF = true;
    }

    @Override // X.C2178631AOf, X.InterfaceC1474330oT9
    public final boolean LJIIIZ(EnumC804620VhM enumC804620VhM) {
        boolean zLJIIIZ = super.LJIIIZ(enumC804620VhM);
        if (!this.LLJLL.LIZ(new C790900V0u() { // from class: X.1AP1
        }) && !zLJIIIZ) {
            return false;
        }
        return true;
    }

    @Override // X.C2178631AOf, X.InterfaceC1474330oT9
    public final boolean LJJJJJ(C1473400oRe c1473400oRe) {
        return this.LLJLL.LIZ(new C790900V0u() { // from class: X.1AP5
        });
    }

    @Override // X.C2178631AOf
    public final InterfaceC1474410oTH LJJJJZI(Context context) {
        return VideoContext.LJJJJLL(context);
    }

    @Override // X.C2178631AOf
    public final void LJJJLL(Context context) {
        super.LJJJLL(context);
        this.LLLFFI = VideoContext.LJJJJLL(context);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.LLJLLIL = relativeLayout;
        addView(relativeLayout, new FrameLayout.LayoutParams(-1, -1));
        RelativeLayout relativeLayout2 = new RelativeLayout(context);
        this.LLJLLL = relativeLayout2;
        addView(relativeLayout2, new FrameLayout.LayoutParams(-1, -1));
        C1AON c1aon = new C1AON();
        this.LLJLL = c1aon;
        c1aon.LJ = this;
        this.LLJLLIL.setOnTouchListener(new ATListenerS465S0100000_33(this, 5));
        C12ES.LJIILL(8, this.LLJLLIL);
        this.LLJLLIL.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: X.1AOe
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewAdded(View view, View view2) {
                C2178641AOg c2178641AOg = this.LL;
                if (view == c2178641AOg.LLJLLIL) {
                    if (c2178641AOg.LLLF == null) {
                        c2178641AOg.LLLF = new ArrayList();
                    }
                    this.LL.getClass();
                    ArrayList arrayList = new ArrayList();
                    C2178641AOg.LJJLIL(view2, arrayList);
                    for (Object obj : arrayList) {
                        if (!((ArrayList) this.LL.LLLF).contains(obj)) {
                            ((ArrayList) this.LL.LLLF).add(obj);
                        }
                    }
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewRemoved(View view, View view2) {
                C2178641AOg c2178641AOg = this.LL;
                if (view == c2178641AOg.LLJLLIL) {
                    if (c2178641AOg.LLLF == null) {
                        c2178641AOg.LLLF = new ArrayList();
                    }
                    this.LL.getClass();
                    ArrayList arrayList = new ArrayList();
                    C2178641AOg.LJJLIL(view2, arrayList);
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((ArrayList) this.LL.LLLF).remove(it2.next());
                    }
                }
            }
        });
    }

    public final boolean LJJLJ(C1AOU c1aou) {
        return this.LLJLL.LIZ(c1aou);
    }

    public void setCanPlayBackground(boolean z) {
        this.LLILZIL = z;
    }

    public void setDeactiveLayerWhenRelease(boolean z) {
        C1AON c1aon = this.LLJLL;
        if (c1aon != null) {
            c1aon.LJII = z;
        }
    }

    public void setHideHostWhenRelease(boolean z) {
        this.LLLFF = z;
    }

    public void setKeepPosition(boolean z) {
        this.LLIZ.LIZIZ = z;
    }

    public void setLayerEventListener(C1AMI c1ami) {
        C1AON c1aon = this.LLJLL;
        if (c1aon != null) {
            c1aon.getClass();
        }
    }

    public void setLayerRootOnTouchListener(View.OnTouchListener onTouchListener) {
        RelativeLayout relativeLayout = this.LLJLLIL;
        if (relativeLayout != null && onTouchListener != null) {
            relativeLayout.setOnTouchListener(onTouchListener);
        }
    }

    @Override // X.C2178631AOf
    public void setMute(boolean z) {
        VideoContext videoContext;
        C19353610ne c19353610ne;
        C2178641AOg c2178641AOg;
        InterfaceC2178671AOj interfaceC2178671AOj;
        super.setMute(z);
        int i = 1;
        if (z) {
            VideoContext videoContext2 = this.LLLFFI;
            C1AMG c1amg = videoContext2.LLJJI;
            if (c1amg != null && (c1amg.LJIIIIZZ & 2) != 0) {
                videoContext2.LJJLIIJ();
                return;
            }
            return;
        }
        VideoContext videoContext3 = this.LLLFFI;
        C1AMG c1amg2 = videoContext3.LLJJI;
        if (c1amg2 != null && (c1amg2.LJIIIIZZ & 4) != 0 && (c2178641AOg = videoContext3.LLILLL) != null && (interfaceC2178671AOj = c2178641AOg.LLJI) != null && interfaceC2178671AOj.LJJIIJZLJL()) {
            return;
        }
        VideoContext videoContext4 = this.LLLFFI;
        C1AMG c1amg3 = videoContext4.LLJJI;
        if ((c1amg3 != null && (c1amg3.LJIIIIZZ & 8) != 0 && videoContext4.isPaused()) || (c19353610ne = (videoContext = this.LLLFFI).LLJIJIL) == null) {
            return;
        }
        C1AMG c1amg4 = videoContext.LLJJI;
        if (c1amg4 != null) {
            i = c1amg4.LJIIIZ;
        }
        c19353610ne.LIZIZ(i);
    }

    public void setParentView(C1AME c1ame) {
        this.LLL = c1ame;
    }

    public void setUseActiveLayers(boolean z) {
        C1AON c1aon = this.LLJLL;
        if (c1aon != null) {
            c1aon.LJI = z;
        }
    }

    public static void LJJLIL(View view, List list) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() > 0) {
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof C2178631AOf) {
                        ArrayList arrayList = (ArrayList) list;
                        if (!arrayList.contains(childAt)) {
                            arrayList.add(childAt);
                        }
                    } else if (childAt instanceof ViewGroup) {
                        LJJLIL(childAt, list);
                    }
                }
            }
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LIZJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LIZJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LIZLLL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        if (this.LLLFF) {
            C12ES.LJIILL(8, this.LLJLLIL);
            C12ES.LJIILL(8, this.LLILLJJLI.getVideoContainer());
            C12ES.LJIILL(0, this.LLJLLL);
        }
        super.LIZLLL(c2178751AOr, c1474420oTI);
        this.LLLFFI.LJJLIIIJJIZ(hashCode(), false);
        this.LLJLL.LIZ(new C790900V0u() { // from class: X.1AP2
        });
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null) {
            videoContext.LIZLLL(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        this.LLJLL.LIZ(new C790900V0u(107));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJI(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJII(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        super.LJII(c2178751AOr, c1474420oTI);
        this.LLJLL.LIZ(new C790900V0u(112));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJII(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJIILJJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        super.LJIILJJIL(c2178751AOr, c1474420oTI);
        this.LLJLL.LIZ(new C790900V0u(122));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJIILJJIL(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJIIZILJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        this.LLJLL.LIZ(new C790900V0u(111));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJIIZILJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJIJJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        super.LJIJJ(c2178751AOr, c1474420oTI);
        this.LLJLL.LIZ(new C790900V0u(202));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJIJJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        super.LJJI(c2178751AOr, c1474420oTI);
        if (c2178751AOr == null || !c2178751AOr.LIZLLL()) {
            this.LLLFFI.LJJLIIIJJIZ(hashCode(), false);
        }
        this.LLJLL.LIZ(new C790900V0u(102));
        if (this.LLIZ.LJ) {
            this.LLJLL.LIZ(new C790900V0u(114));
        }
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJI(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJIII(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        super.LJJIII(c2178751AOr, c1474420oTI);
        this.LLJLL.LIZ(new C790900V0u(203));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJIII(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJIIZ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        this.LLJLL.LIZ(new C790900V0u(106));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJIIZ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJIIZI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        this.LLJLL.LIZ(new C790900V0u(109));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJIIZI(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJIJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        super.LJJIJ(c2178751AOr, c1474420oTI);
        this.LLJLL.LIZ(new C790900V0u(100));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJIJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJIJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        super.LJJIJIL(c2178751AOr, c1474420oTI);
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJIJIL(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJIJLIJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        super.LJJIJLIJ(c2178751AOr, c1474420oTI);
        this.LLJLL.LIZ(new C790900V0u(101));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null) {
            videoContext.LJJIJLIJ(c2178751AOr, c1474420oTI);
            ((ArrayList) this.LLLFFI.LLIZLLLIL).remove(this);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        this.LLJLL.LIZ(new C790900V0u(110));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJJI(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJJJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI) {
        this.LLJLL.LIZ(new C790900V0u(105));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJJJ(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LIZ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, boolean z) {
        this.LLJLL.LIZ(new C790900V0u() { // from class: X.1AOy
        });
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LIZ(c2178751AOr, c1474420oTI, z);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, C1467470oI5 c1467470oI5) {
        super.LJ(c2178751AOr, c1474420oTI, c1467470oI5);
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJ(c2178751AOr, c1474420oTI, c1467470oI5);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJFF(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, long j) {
        super.LJFF(c2178751AOr, c1474420oTI, j);
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJFF(c2178751AOr, c1474420oTI, j);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJIIIIZZ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        super.LJIIIIZZ(c2178751AOr, c1474420oTI, i);
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJIIIIZZ(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJIIJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, boolean z) {
        super.LJIIJ(c2178751AOr, c1474420oTI, z);
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJIIJ(c2178751AOr, c1474420oTI, z);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474360oTC
    public final C1474520oTS LJIIJJI(C2178751AOr c2178751AOr, C1470240oMY c1470240oMY, C1474420oTI c1474420oTI) {
        C1474520oTS c1474520oTSLJIIJJI = super.LJIIJJI(c2178751AOr, c1470240oMY, c1474420oTI);
        this.LLJLL.LIZ(new C790900V0u(311, c1474520oTSLJIIJJI));
        return c1474520oTSLJIIJJI;
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJIILL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        getClass();
        this.LLJLL.LIZ(this.LLJZIJLIL);
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJIILL(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJIJI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        super.LJIJI(c2178751AOr, c1474420oTI, i);
        if (i == 3) {
            this.LLJLL.LIZ(new C790900V0u(116));
        }
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJIJI(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        this.LLJLL.LIZ(new C790900V0u(117, Integer.valueOf(i)));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJIL(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, e eVar) {
        super.LJJ(c2178751AOr, c1474420oTI, eVar);
        this.LLLFFI.LJJLIIIJJIZ(hashCode(), false);
        this.LLJLL.LIZ(new C790900V0u(113, eVar));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJ(c2178751AOr, c1474420oTI, eVar);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJIIJ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJIIJ(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJIJIIJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        super.LJJIJIIJIL(c2178751AOr, c1474420oTI, i);
        this.LLLFFI.LJJLIIIJJIZ(hashCode(), true);
        this.LLJLL.LIZ(new C790900V0u(104, Integer.valueOf(i)));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJIJIIJIL(c2178751AOr, c1474420oTI, i);
        }
        if (i == 1 || i == 6 || i == 4 || i == 5) {
            LJIILJJIL(c2178751AOr, c1474420oTI);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474380oTE
    public final void LJJIJL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, String str) {
        super.LJJIJL(c2178751AOr, c1474420oTI, str);
        this.LLJLL.LIZ(new C790900V0u() { // from class: X.1AOz
        });
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJIJL(c2178751AOr, c1474420oTI, str);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, boolean z) {
        super.LJJIL(c2178751AOr, c1474420oTI, z);
        this.LLJLL.LIZ(new C790900V0u(118));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJIL(c2178751AOr, c1474420oTI, z);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJIZ(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, long j) {
        super.LJJIZ(c2178751AOr, c1474420oTI, j);
        this.LLJLL.LIZ(new C790900V0u(207, Long.valueOf(j)));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJIZ(c2178751AOr, c1474420oTI, j);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJJIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, boolean z) {
        C790900V0u c790900V0u = new C790900V0u() { // from class: X.1AP4
        };
        c2178751AOr.LIZIZ();
        c2178751AOr.LIZJ();
        this.LLJLL.LIZ(c790900V0u);
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJJIL(c2178751AOr, c1474420oTI, z);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJJJL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i) {
        this.LLJLL.LIZ(new C790900V0u(121, Integer.valueOf(i)));
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJJJL(c2178751AOr, c1474420oTI, i);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474380oTE
    public final void LJIIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i, String str) {
        super.LJIIL(c2178751AOr, c1474420oTI, i, str);
        this.LLJLL.LIZ(new C790900V0u() { // from class: X.1AOw
        });
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJIIL(c2178751AOr, c1474420oTI, i, str);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJIILIIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i, int i2) {
        super.LJIILIIL(c2178751AOr, this.LLILZLL, i, i2);
        getClass();
        getClass();
        this.LLJLL.LIZ(this.LLJZ);
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJIILIIL(c2178751AOr, c1474420oTI, i, i2);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJIILLIIL(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, EnumC2281151EQn enumC2281151EQn, int i) {
        super.LJIILLIIL(c2178751AOr, c1474420oTI, enumC2281151EQn, i);
        this.LLJLL.LIZ(new C790900V0u() { // from class: X.1AOv
        });
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJIILLIIL(c2178751AOr, c1474420oTI, enumC2281151EQn, i);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJIJJLI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, final EnumC2281151EQn enumC2281151EQn, boolean z) {
        this.LLJLL.LIZ(new C790900V0u(enumC2281151EQn) { // from class: X.1AOu
            {
                super(201);
                if (enumC2281151EQn != null) {
                    enumC2281151EQn.toString();
                }
            }
        });
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJIJJLI(c2178751AOr, c1474420oTI, enumC2281151EQn, z);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC1474240oT0
    public final void LJJIFFI(C2178751AOr c2178751AOr, C1474420oTI c1474420oTI, int i, int i2) {
        super.LJJIFFI(c2178751AOr, this.LLILZLL, i, i2);
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.LJJIFFI(c2178751AOr, c1474420oTI, i, i2);
        }
    }

    @Override // X.C2178631AOf, X.InterfaceC2178771AOt
    public final void LJJII(InterfaceC1471800oP4 interfaceC1471800oP4, C1474420oTI c1474420oTI, boolean z, int i, boolean z2, boolean z3) {
        VideoContext videoContext = this.LLLFFI;
        if (videoContext != null && videoContext.LJJJJZ(c1474420oTI)) {
            this.LLLFFI.getClass();
        }
    }
}

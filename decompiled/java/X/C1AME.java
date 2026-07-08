package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.RelativeLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.videoshop.context.VideoContext;
import com.ss.ttm.player.s;
import com.ss.ttvideoengine.TTVideoEngine;

/* JADX INFO: renamed from: X.1AME, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C1AME extends RelativeLayout {
    public C1474420oTI LL;
    public C1AMG LLILLJJLI;
    public C2178641AOg LLILLL;
    public boolean LLILZ;
    public VideoContext LLILZIL;
    public boolean LLILZLL;
    public C1AMD LLIZ;
    public boolean LLIZLLLIL;
    public Lifecycle LLJ;
    public InterfaceC1474330oT9 LLJI;
    public C1AMJ LLJIJIL;
    public AbstractC1468760oKA LLJILJIL;
    public InterfaceC1474390oTF LLJILJILJ;
    public ViewTreeObserver LLJILLL;
    public InterfaceC1395140mPQ LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final Rect LLJJIJIL;
    public boolean LLJJJ;
    public int LLJJJIL;
    public float LLJJJJ;
    public int LLJJJJJIL;
    public int LLJJJJLIIL;
    public C1905450zgV LLJJL;
    public s LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public float LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public final C1AMC LLJZIJLIL;

    public C1AMI getLayerEventListener() {
        return null;
    }

    public final void LIZIZ() {
        int i;
        VideoContext videoContext;
        C1AME c1ame;
        C2178641AOg c2178641AOg;
        if (!this.LLILZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(">>>>>>> detachView called hash:");
            sbLIZ.append(hashCode());
            sbLIZ.append(" vid:");
            C1474420oTI c1474420oTI = this.LL;
            sbLIZ.append(c1474420oTI != null ? c1474420oTI.LIZ : "null");
            C2188811AlT.LIZIZ(sbLIZ);
            VideoContext videoContext2 = this.LLILZIL;
            if (videoContext2 != null && this.LLILZLL && ((i = videoContext2.LL.LLILZLL) == 0 || i == 3)) {
                if (!(videoContext2.LJJJJZI(this) && videoContext2.LJJJJZ(getPlayEntity())) && LJ()) {
                    videoContext2.LLJILJILJ.sendMessage(videoContext2.LLJILJILJ.obtainMessage(102, this));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("send 200 MSG_DISPATCH_DETACH simpleMediaView:");
                    sbLIZ2.append(hashCode());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    videoContext2.LLJILJILJ.sendMessage(videoContext2.LLJILJILJ.obtainMessage(100, this));
                }
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("<<<<<<<< detachView end hash:");
            sbLIZ3.append(hashCode());
            C2188811AlT.LIZIZ(sbLIZ3);
            return;
        }
        if (this.LLILZLL && (videoContext = this.LLILZIL) != null && getObservedLifecycle() == videoContext.LJJJJJL() && ((c1ame = videoContext.LLILZ) == null || c1ame.LLILZLL)) {
            if (videoContext.LJJJJZ(getPlayEntity())) {
                if (videoContext.LLILZ != this && (c2178641AOg = videoContext.LLILLL) != null) {
                    ViewParent parent = c2178641AOg.getParent();
                    if (parent instanceof C1AME) {
                        ((C1AME) parent).LIZJ();
                        LIZ(videoContext.LLILLL);
                        if (!videoContext.LJJJLZIJ()) {
                            C12ES.LJIILL(0, this);
                        }
                    }
                }
                videoContext.LLILZ = this;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("updateSimpleMediaView hash:");
                sbLIZ4.append(Integer.valueOf(hashCode()));
                C2188811AlT.LIZIZ(sbLIZ4);
                videoContext.LLJILJILJ.removeCallbacksAndMessages(null);
                videoContext.LLJILJILJ.sendMessage(videoContext.LLJILJILJ.obtainMessage(101, this));
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("send MSG_DISPATCH_ATTACH simpleMediaView:");
                sbLIZ5.append(hashCode());
                C2188811AlT.LIZIZ(sbLIZ5);
            } else if (videoContext.LL.LLILZLL == 0 && videoContext.LJJJJZI(this)) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("send 0 MSG_DISPATCH_DETACH simpleMediaView:");
                sbLIZ6.append(hashCode());
                C2188811AlT.LIZIZ(sbLIZ6);
                videoContext.LLJILJILJ.sendMessage(videoContext.LLJILJILJ.obtainMessage(100, this));
            }
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("attachView simplemediaview hash:");
        sbLIZ7.append(hashCode());
        sbLIZ7.append(" scrollVisible:");
        sbLIZ7.append(this.LLIZLLLIL);
        C2188811AlT.LIZIZ(sbLIZ7);
    }

    public final void LIZJ() {
        if (this.LLILLL != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
            removeAllViews();
            this.LLILLL.setParentView(null);
            this.LLILLL = null;
        }
    }

    public final boolean LIZLLL() {
        C2178641AOg c2178641AOg;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            return c2178641AOg2.LJJJLZIJ();
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return false;
        }
        return c2178641AOg.LJJJLZIJ();
    }

    public final boolean LJ() {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            return c2178641AOg.LJJJZ();
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this)) {
            return true;
        }
        return this.LLILZIL.LJJJLZIJ();
    }

    public final void LJFF() {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            c2178641AOg.LJJLIIIJILLIZJL();
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this)) {
            return;
        }
        this.LLILZIL.pause();
    }

    public final void LJI() {
        if (this.LL == null) {
            return;
        }
        if (this.LLILLL != null) {
            LJII();
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext != null && videoContext.LJJJJZI(this)) {
            C2178641AOg c2178641AOg = this.LLILZIL.LLILLL;
            if (c2178641AOg != null) {
                c2178641AOg.setPlayEntity(this.LL);
                C2178641AOg c2178641AOg2 = this.LLILZIL.LLILLL;
                if (c2178641AOg2 != null) {
                    c2178641AOg2.LJJLIIIJJI();
                    return;
                }
                return;
            }
            return;
        }
        Context context = getContext();
        if (context != null && this.LLILLL == null) {
            if (!this.LLJJJ) {
                this.LLJJJIL = 0;
            } else if (Build.VERSION.SDK_INT < 24) {
                this.LLJJJIL = 2;
            } else {
                this.LLJJJIL = 1;
            }
            C2178641AOg c2178641AOg3 = new C2178641AOg(context);
            this.LLILLL = c2178641AOg3;
            c2178641AOg3.setVideoViewType(this.LLJJJIL);
            this.LLILLL.LJJJLIIL();
            this.LLILLL.setUseActiveLayers(this.LLJLLIL);
            this.LLILLL.setDeactiveLayerWhenRelease(this.LLJLLL);
            addView(this.LLILLL, new ViewGroup.LayoutParams(-1, -1));
            this.LLILLL.setUseActiveLayers(this.LLJLLIL);
            this.LLILLL.setDeactiveLayerWhenRelease(this.LLJLLL);
            this.LLILLL.setParentView(this);
            C2178641AOg c2178641AOg4 = this.LLILLL;
            Lifecycle lifecycle = this.LLJ;
            if (lifecycle != null) {
                c2178641AOg4.LLJJIJIIJIL = lifecycle;
            } else {
                c2178641AOg4.getClass();
            }
        }
        LJII();
    }

    public final void LJII() {
        VideoContext videoContext = this.LLILZIL;
        if (videoContext != null) {
            videoContext.LJJLIIIJLLLLLLLZ(this);
        }
        this.LLILLL.setPlayEntity(this.LL);
        C2178641AOg c2178641AOg = this.LLILLL;
        Lifecycle lifecycle = this.LLJ;
        if (lifecycle != null) {
            c2178641AOg.LLJJIJIIJIL = lifecycle;
        } else {
            c2178641AOg.getClass();
        }
        InterfaceC1474330oT9 interfaceC1474330oT9 = this.LLJI;
        if (interfaceC1474330oT9 != null) {
            this.LLILLL.setVideoPlayConfiger(interfaceC1474330oT9);
        }
        C1AMJ c1amj = this.LLJIJIL;
        if (c1amj != null) {
            this.LLILLL.setSurfaceViewConfiger(c1amj);
        }
        this.LLILLL.setUseActiveLayers(this.LLJLLIL);
        this.LLILLL.setDeactiveLayerWhenRelease(this.LLJLLL);
        this.LLILLL.setVideoMethodOpt(this.LLJZ);
        this.LLILLL.setUseBlackCover(this.LLJJI);
        this.LLILLL.setHideHostWhenRelease(this.LLJJIII);
        this.LLILLL.setVideoEngineFactory(this.LLJJ);
        this.LLILLL.setPlayUrlConstructor(this.LLJILJILJ);
        this.LLILLL.setTtvNetClient(this.LLJILJIL);
        this.LLILLL.setTryToInterceptPlay(this.LLJJIJI);
        this.LLILLL.setPlayBackParams(this.LLJJLIIIJLLLLLLLZ);
        this.LLILLL.setAsyncPosition(this.LLJL);
        this.LLILLL.setAsyncRelease(this.LLJLIL);
        this.LLILLL.setLayerEventListener(null);
        this.LLILLL.setCanPlayBackground(this.LLJJIJIIJIL);
        this.LLILLL.LJJLIIIJJI();
    }

    public final void LJIIIIZZ() {
        C2178641AOg c2178641AOg;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null && c2178641AOg2.getParent() == this) {
            this.LLILLL.LJJLIIIJL();
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        c2178641AOg.LJJLIIIJL();
    }

    public int getCurrentPosition() {
        C2178641AOg c2178641AOg;
        InterfaceC2178671AOj interfaceC2178671AOj;
        boolean z = this.LLJL;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            InterfaceC2178671AOj interfaceC2178671AOj2 = c2178641AOg2.LLJI;
            if (interfaceC2178671AOj2 != null) {
                return interfaceC2178671AOj2.LJJIJLIJ(z);
            }
            return 0;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null || (interfaceC2178671AOj = c2178641AOg.LLJI) == null) {
            return 0;
        }
        return interfaceC2178671AOj.LJJIJLIJ(z);
    }

    public int getDuration() {
        C2178641AOg c2178641AOg;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            return c2178641AOg2.getDuration();
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return 0;
        }
        return c2178641AOg.getDuration();
    }

    public C2178641AOg getLayerHostMediaLayout() {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            return c2178641AOg;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this)) {
            return null;
        }
        return this.LLILZIL.LLILLL;
    }

    public s getPlayBackParams() {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            return c2178641AOg.getPlayBackParams();
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this)) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        C2178641AOg c2178641AOg2 = this.LLILZIL.LLILLL;
        if (c2178641AOg2 != null) {
            return c2178641AOg2.getPlayBackParams();
        }
        return null;
    }

    public TTVideoEngine getVideoEngine() {
        C2178641AOg c2178641AOg;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            return c2178641AOg2.getVideoEngine();
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return null;
        }
        return c2178641AOg.getVideoEngine();
    }

    public Bitmap getVideoFrame() {
        C2178641AOg c2178641AOg;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            return c2178641AOg2.getVideoFrame();
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return null;
        }
        return c2178641AOg.getVideoFrame();
    }

    public InterfaceC1471800oP4 getVideoStateInquirer() {
        C2178641AOg c2178641AOg;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            return c2178641AOg2.getVideoStateInquirer();
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return null;
        }
        return c2178641AOg.getVideoStateInquirer();
    }

    public int getVideoViewMarginTop() {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            return c2178641AOg.getVideoViewMarginTop();
        }
        return -1;
    }

    public int getWatchedDuration() {
        C2178641AOg c2178641AOg;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            return c2178641AOg2.getWatchedDuration();
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return 0;
        }
        return c2178641AOg.getWatchedDuration();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        C1474420oTI c1474420oTI;
        super.onAttachedToWindow();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAttachedToWindow hash:");
        sbLIZ.append(hashCode());
        sbLIZ.append(" class:");
        sbLIZ.append(getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        ViewParent parent = getParent();
        while (true) {
            z = false;
            if (parent == null) {
                for (ViewParent parent2 = getParent(); parent2 != null; parent2 = parent2.getParent()) {
                    try {
                        if (!(parent2 instanceof RecyclerView)) {
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } else if (parent instanceof AbsListView) {
                break;
            } else {
                parent = parent.getParent();
            }
        }
        z = true;
        this.LLILZLL = z;
        this.LLILZ = true;
        LIZIZ();
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null && (c1474420oTI = this.LL) != null && c1474420oTI.equals(c2178641AOg.LLILZLL) && this.LLILLL.LLILZLL != this.LL && !LJ()) {
            this.LL = this.LLILLL.LLILZLL;
        }
        this.LLJILLL = getViewTreeObserver();
        C786410Ut5.z3(this.LLJILLL, this.LLJZIJLIL);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDetachedFromWindow hash:");
        sbLIZ.append(hashCode());
        sbLIZ.append(" class:");
        sbLIZ.append(getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZ = false;
        LIZIZ();
        ViewTreeObserver viewTreeObserver = this.LLJILLL;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            C786410Ut5.E3(this.LLJILLL, this.LLJZIJLIL);
            return;
        }
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2 != null) {
            C1AMC c1amc = this.LLJZIJLIL;
            viewTreeObserver2.removeOnScrollChangedListener(c1amc);
            C2187701Ajg.LIZIZ(viewTreeObserver2, c1amc, ViewTreeObserver.OnScrollChangedListener.class);
        }
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFinishTemporaryDetach hash:");
        sbLIZ.append(hashCode());
        sbLIZ.append(" class:");
        sbLIZ.append(getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZ = true;
        LIZIZ();
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStartTemporaryDetach hash:");
        sbLIZ.append(hashCode());
        sbLIZ.append(" class:");
        sbLIZ.append(getClass().getSimpleName());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZ = false;
        LIZIZ();
    }

    public C1AMD getAttachListener() {
        return this.LLIZ;
    }

    public Lifecycle getObservedLifecycle() {
        return this.LLJ;
    }

    public C1474420oTI getPlayEntity() {
        return this.LL;
    }

    public float getRadius() {
        return this.LLJJJJ;
    }

    public InterfaceC1474330oT9 getVideoPlayConfiger() {
        return this.LLJI;
    }

    public final void LIZ(C2178641AOg c2178641AOg) {
        if (c2178641AOg != null) {
            LIZJ();
            if (c2178641AOg.getParent() != null) {
                ViewParent parent = c2178641AOg.getParent();
                if (parent instanceof ViewGroup) {
                    try {
                        C786410Ut5.LJJJLZIJ(c2178641AOg, (ViewGroup) parent);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            try {
                c2178641AOg.getParent();
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            this.LLILLL = c2178641AOg;
            s sVar = c2178641AOg.LLJJJJLIIL;
            if (sVar != this.LLJJLIIIJLLLLLLLZ) {
                this.LLJJLIIIJLLLLLLLZ = sVar;
            }
            this.LLJLLIL = c2178641AOg.getUseActiveLayers();
            this.LLJLLL = c2178641AOg.getDeactiveLayerWhenRelease();
            c2178641AOg.getLayerEventListener();
            this.LLJ = c2178641AOg.getObservedLifecycle();
            try {
                addView(c2178641AOg, new ViewGroup.LayoutParams(-1, -1));
                this.LLILLL.setParentView(this);
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                StringBuilder sb = new StringBuilder("removeAgain:false\n");
                for (ViewParent parent2 = c2178641AOg.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                    sb.append(parent2.toString());
                    sb.append("\n");
                }
                throw new RuntimeException(sb.toString(), e3);
            }
        }
    }

    public final void LJIIIZ(long j) {
        C2178641AOg c2178641AOg;
        InterfaceC2178671AOj interfaceC2178671AOj;
        InterfaceC2178671AOj interfaceC2178671AOj2;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            if (j >= 0 && (interfaceC2178671AOj2 = c2178641AOg2.LLJI) != null) {
                interfaceC2178671AOj2.LJIIJ(j);
                return;
            }
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null || j < 0 || (interfaceC2178671AOj = c2178641AOg.LLJI) == null) {
            return;
        }
        interfaceC2178671AOj.LJIIJ(j);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public void setAsyncPosition(boolean z) {
        C2178641AOg c2178641AOg;
        this.LLJL = z;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            c2178641AOg2.setAsyncPosition(z);
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        c2178641AOg.setAsyncPosition(z);
    }

    public void setAsyncRelease(boolean z) {
        C2178641AOg c2178641AOg;
        this.LLJLIL = z;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            c2178641AOg2.setAsyncRelease(z);
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        c2178641AOg.setAsyncRelease(z);
    }

    public void setAttachListener(C1AMD c1amd) {
        this.LLIZ = c1amd;
    }

    public void setCanPlayBackground(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public void setDeactiveLayerWhenRelease(boolean z) {
        this.LLJLLL = z;
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            c2178641AOg.setDeactiveLayerWhenRelease(z);
        }
    }

    public void setEnablePortraitFullScreen(boolean z) {
        this.LLILZIL.LLJJIJIIJIL = z;
    }

    public void setHideHostWhenRelease(boolean z) {
        C2178641AOg c2178641AOg;
        this.LLJJIII = z;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            c2178641AOg2.setHideHostWhenRelease(z);
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        c2178641AOg.setHideHostWhenRelease(z);
    }

    public void setLayerEventListener(C1AMI c1ami) {
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            c2178641AOg.setLayerEventListener(c1ami);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setLayoutParams:");
        sbLIZ.append(layoutParams.width);
        sbLIZ.append("*");
        sbLIZ.append(layoutParams.height);
        C2188811AlT.LIZIZ(sbLIZ);
        C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("SMVSetLayoutParams", EnumC1474430oTJ.TEXTURE_SIZE, 3);
        if (c1471760oP0LIZIZ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("width:");
            sbLIZ2.append(layoutParams.width);
            sbLIZ2.append("  height:");
            sbLIZ2.append(layoutParams.height);
            c1471760oP0LIZIZ.LIZ("info", C2188811AlT.LIZIZ(sbLIZ2));
            EnumC1471750oOz.INS.addTrace(this.LLILZIL.LJJJJLI(), c1471760oP0LIZIZ);
        }
    }

    public void setLoop(boolean z) {
        C2178641AOg c2178641AOg;
        this.LLILLJJLI.LJ = z;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            c2178641AOg2.setLoop(z);
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        c2178641AOg.setLoop(z);
    }

    public void setMute(boolean z) {
        C2178641AOg c2178641AOg;
        this.LLILLJJLI.LIZLLL = z;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            c2178641AOg2.setMute(z);
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        c2178641AOg.setMute(z);
    }

    public void setPlayBackParams(s sVar) {
        C2178641AOg c2178641AOg;
        this.LLJJLIIIJLLLLLLLZ = sVar;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            c2178641AOg2.setPlayBackParams(sVar);
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        c2178641AOg.setPlayBackParams(sVar);
    }

    public void setPlayEntity(C1474420oTI c1474420oTI) {
        String str;
        this.LL = c1474420oTI;
        if (c1474420oTI != null) {
            this.LLILLJJLI = c1474420oTI.LJIIIIZZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setPlayEntity this.hash:");
        sbLIZ.append(hashCode());
        sbLIZ.append(" vid:");
        if (c1474420oTI != null) {
            str = c1474420oTI.LIZ;
        } else {
            str = "null";
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public void setPlayUrlConstructor(InterfaceC1474390oTF interfaceC1474390oTF) {
        this.LLJILJILJ = interfaceC1474390oTF;
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            c2178641AOg.setPlayUrlConstructor(interfaceC1474390oTF);
        }
    }

    public void setPortrait(boolean z) {
        VideoContext videoContext = this.LLILZIL;
        if (videoContext != null) {
            videoContext.LL.LLIZ = z;
        }
    }

    public void setRadius(float f) {
        if (f > 0.0f && this.LLJJJJ != f) {
            this.LLJJJJ = f;
            if (!getClipToOutline()) {
                setOutlineProvider(this.LLJJL);
                setClipToOutline(true);
            }
            this.LLJJL.LIZ = f;
            invalidate();
        }
    }

    public void setReleaseEngineEnabled(boolean z) {
        C2178641AOg c2178641AOg;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            c2178641AOg2.setReleaseEngineEnabled(z);
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        c2178641AOg.setReleaseEngineEnabled(z);
    }

    public void setRenderMode(int i) {
        C2178641AOg c2178641AOg;
        this.LLILLJJLI.LJII = i;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            c2178641AOg2.setRenderMode(i);
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        c2178641AOg.setRenderMode(i);
    }

    public void setStartTime(int i) {
        C2178641AOg c2178641AOg;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            c2178641AOg2.setStartTime(i);
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        c2178641AOg.setStartTime(i);
    }

    public void setSurfaceViewConfiger(C1AMJ c1amj) {
        this.LLJIJIL = c1amj;
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            c2178641AOg.setVideoPlayConfiger(this.LLJI);
        }
    }

    public void setTextureLayout(int i) {
        C2178641AOg c2178641AOg;
        this.LLILLJJLI.LJI = i;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            C1AMG c1amg = c2178641AOg2.LLIZ;
            if (c1amg != null) {
                c1amg.LJI = i;
            }
            InterfaceC2178711AOn interfaceC2178711AOn = c2178641AOg2.LLILLJJLI;
            if (interfaceC2178711AOn != null) {
                interfaceC2178711AOn.LIZ(i);
                return;
            }
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        C1AMG c1amg2 = c2178641AOg.LLIZ;
        if (c1amg2 != null) {
            c1amg2.LJI = i;
        }
        InterfaceC2178711AOn interfaceC2178711AOn2 = c2178641AOg.LLILLJJLI;
        if (interfaceC2178711AOn2 == null) {
            return;
        }
        interfaceC2178711AOn2.LIZ(i);
    }

    public void setTryToInterceptPlay(boolean z) {
        C2178641AOg c2178641AOg;
        this.LLJJIJI = z;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            c2178641AOg2.setTryToInterceptPlay(z);
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        c2178641AOg.setTryToInterceptPlay(z);
    }

    public void setTtvNetClient(AbstractC1468760oKA abstractC1468760oKA) {
        this.LLJILJIL = abstractC1468760oKA;
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            c2178641AOg.setTtvNetClient(abstractC1468760oKA);
        }
    }

    public void setUseActiveLayers(boolean z) {
        this.LLJLLIL = z;
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            c2178641AOg.setUseActiveLayers(z);
        }
    }

    public void setUseBlackCover(boolean z) {
        C2178641AOg c2178641AOg;
        this.LLJJI = z;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            c2178641AOg2.setUseBlackCover(z);
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        c2178641AOg.setUseBlackCover(z);
    }

    public void setUseSurfaceView(boolean z) {
        this.LLJJJ = z;
    }

    public void setVideoEngineFactory(InterfaceC1395140mPQ interfaceC1395140mPQ) {
        C2178641AOg c2178641AOg;
        this.LLJJ = interfaceC1395140mPQ;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            c2178641AOg2.setVideoEngineFactory(interfaceC1395140mPQ);
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        c2178641AOg.setVideoEngineFactory(interfaceC1395140mPQ);
    }

    public void setVideoMethodOpt(boolean z) {
        this.LLJZ = z;
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            c2178641AOg.setVideoMethodOpt(z);
        }
    }

    public void setVideoPlayConfiger(InterfaceC1474330oT9 interfaceC1474330oT9) {
        this.LLJI = interfaceC1474330oT9;
        C2178641AOg c2178641AOg = this.LLILLL;
        if (c2178641AOg != null) {
            c2178641AOg.setVideoPlayConfiger(interfaceC1474330oT9);
        }
    }

    public void setZoomingEnabled(boolean z) {
        C2178641AOg c2178641AOg;
        C2178641AOg c2178641AOg2 = this.LLILLL;
        if (c2178641AOg2 != null) {
            c2178641AOg2.setZoomingEnabled(z);
            return;
        }
        VideoContext videoContext = this.LLILZIL;
        if (videoContext == null || !videoContext.LJJJJZI(this) || (c2178641AOg = this.LLILZIL.LLILLL) == null) {
            return;
        }
        c2178641AOg.setZoomingEnabled(z);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1AMC] */
    public C1AME(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = C1AMG.LIZ();
        this.LLIZ = new C1AMD() { // from class: X.1AMF
            @Override // X.C1AMD
            public final void LIZIZ(C1AME c1ame) {
            }

            @Override // X.C1AMD
            public final void LIZJ(C1AME c1ame) {
                if (!c1ame.LJ()) {
                    C1474460oTM.LIZIZ(c1ame.getPlayEntity(), "scroll_out");
                    c1ame.LJIIIIZZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("detachCurrent release simpleMediaView:");
                    sbLIZ.append(hashCode());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }

            @Override // X.C1AMD
            public final void LIZ(C1AME c1ame, boolean z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onScrollVisibilityChange visible:");
                sbLIZ.append(z);
                sbLIZ.append(" simpleMediaView:");
                sbLIZ.append(hashCode());
                C2188811AlT.LIZIZ(sbLIZ);
                if (!z && !c1ame.LJ()) {
                    Rect rect = new Rect();
                    c1ame.getGlobalVisibleRect(rect);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onScrollVisibilityChange release simpleMediaView show:");
                    sbLIZ2.append(c1ame.isShown());
                    sbLIZ2.append(" globalrect:");
                    sbLIZ2.append(rect.toShortString());
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1474460oTM.LIZIZ(c1ame.getPlayEntity(), "scroll_out");
                    c1ame.LJIIIIZZ();
                }
            }
        };
        this.LLJJI = true;
        this.LLJJIII = true;
        this.LLJJIJIIJIL = false;
        this.LLJJIJIL = new Rect();
        this.LLJJJ = false;
        this.LLJLL = 0.0f;
        this.LLJLLIL = false;
        this.LLJLLL = false;
        this.LLJZ = false;
        this.LLJZIJLIL = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.1AMC
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                boolean globalVisibleRect;
                C1AME c1ame = this.LL;
                c1ame.getClass();
                if (c1ame.isShown()) {
                    c1ame.LLJJIJIL.setEmpty();
                    globalVisibleRect = c1ame.getGlobalVisibleRect(c1ame.LLJJIJIL);
                } else {
                    globalVisibleRect = false;
                }
                C1AME c1ame2 = this.LL;
                VideoContext videoContext = c1ame2.LLILZIL;
                if (videoContext != null && videoContext.LL.LLILZLL == 0 && c1ame2.LLIZ != null && videoContext.LJJJJZI(c1ame2) && videoContext.LJJJJZ(this.LL.LL)) {
                    C1AME c1ame3 = this.LL;
                    c1ame3.LLIZ.LIZ(c1ame3, globalVisibleRect);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onScrollVisibilityChange simpleMediaView hash:");
                    sbLIZ.append(this.LL.hashCode());
                    sbLIZ.append(" nowVisible:");
                    sbLIZ.append(globalVisibleRect);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
        };
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SimpleMediaView);
            this.LLJLL = typedArrayObtainStyledAttributes.getDimension(R$styleable.SimpleMediaView_radius, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        ComponentCallbacks2 componentCallbacks2LIZ = C1474460oTM.LIZ(context);
        long id = Looper.getMainLooper().getThread().getId();
        long id2 = C786410Ut5.u3().getId();
        if (componentCallbacks2LIZ != null && !this.LLJLILLLLZIIL && id == id2) {
            if (componentCallbacks2LIZ instanceof LifecycleOwner) {
                this.LLJ = ((LifecycleOwner) componentCallbacks2LIZ).getLifecycle();
            }
            if (this.LLILZIL == null) {
                this.LLILZIL = VideoContext.LJJJJLL(getContext());
            }
            this.LLJJL = new C1905450zgV();
            setRadius(this.LLJLL);
            this.LLJLILLLLZIIL = true;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        boolean globalVisibleRect;
        super.onVisibilityChanged(view, i);
        if (view == this) {
            if (!isShown()) {
                globalVisibleRect = false;
            } else {
                this.LLJJIJIL.setEmpty();
                globalVisibleRect = getGlobalVisibleRect(this.LLJJIJIL);
            }
            this.LLIZLLLIL = globalVisibleRect;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onVisibilityChanged:");
            sbLIZ.append(this.LLIZLLLIL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int width = getWidth();
        int height = getHeight();
        if (this.LLJJJJJIL != width || this.LLJJJJLIIL != height) {
            this.LLJJJJJIL = width;
            this.LLJJJJLIIL = height;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("smv_size_layout:");
            sbLIZ.append(width);
            sbLIZ.append("*");
            sbLIZ.append(height);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}

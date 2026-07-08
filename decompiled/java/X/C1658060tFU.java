package X;

import Y.ARunnableS116S0100000_16;
import Y.AfS152S0200000_16;
import Y.AkS486S0100000_25;
import android.animation.Animator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import iyl.i3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tFU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1658060tFU extends RelativeLayout {
    public static final C01GW<C11RO> LLJL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(510));
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public InterfaceC1657840tF8 LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public Animator LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public C11JF LLJJ;
    public InterfaceC1658080tFW LLJJI;
    public final List<InterfaceC1658080tFW> LLJJIII;
    public final CopyOnWriteArrayList<Object> LLJJIJI;
    public final List<Function0<Unit>> LLJJIJIIJIL;
    public volatile List<i3> LLJJIJIL;
    public volatile List<i3> LLJJJ;
    public volatile List<i3> LLJJJIL;
    public volatile List<i3> LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    private final LinearLayout getCollapseToolbarAndNextContainer() {
        return (LinearLayout) this.LLJILLL.getValue();
    }

    private final C06WT getCollapsedListUpdateCallback() {
        return (C06WT) this.LLJJJJLIIL.getValue();
    }

    private final C1658070tFV getFixedListUpdateCallback() {
        return (C1658070tFV) this.LLJJJJJIL.getValue();
    }

    private final C1658050tFT getSlideLeftRegionWithDividerUpdateCallback() {
        return (C1658050tFT) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final C1658040tFS getSlideListUpdateCallback() {
        return (C1658040tFS) this.LLJJL.getValue();
    }

    public final LinearLayout getCollapseViewContainer() {
        return (LinearLayout) this.LLJILJIL.getValue();
    }

    public final Map<String, InterfaceC1657880tFC> getCollapsedItemMap() {
        return (Map) this.LLILLJJLI.getValue();
    }

    public final LinearLayout getCollapsedToolbarViewContainer() {
        return (LinearLayout) this.LLJIJIL.getValue();
    }

    public final List<i3> getCurrentDisplayListData() {
        return C13LP.LJLIL(this.LLJJJIL, C13LP.LJLIL(this.LLJJJ, this.LLJJIJIL));
    }

    public final RelativeLayout getFixedRegion() {
        return (RelativeLayout) this.LLIZLLLIL.getValue();
    }

    public final HorizontalScrollView getFixedRegionScrollView() {
        return (HorizontalScrollView) this.LLIZ.getValue();
    }

    public final Map<String, InterfaceC1657880tFC> getItemMap() {
        return (Map) this.LL.getValue();
    }

    public final LinearLayout getNextButtonContainer() {
        return (LinearLayout) this.LLJILJILJ.getValue();
    }

    public final View getSlideGuideTextView() {
        return (View) this.LLILZIL.getValue();
    }

    public final View getSlideGuideTouchIcon() {
        return (View) this.LLILZ.getValue();
    }

    public final LinearLayout getSlideLeftRegion() {
        return (LinearLayout) this.LLJI.getValue();
    }

    public final LinearLayout getSlideRegion() {
        return (LinearLayout) this.LLJ.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11JF c11jf = this.LLJJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public C1658060tFU(Context context) {
        super(context, null, 0);
        this.LL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(514));
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(512));
        this.LLILZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 964));
        this.LLILZIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 963));
        this.LLIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 960));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 958));
        this.LLJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 948));
        this.LLJI = C452501pT.LIZIZ(new AwS569S0100000_25(this, 965));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 954));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 952));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 962));
        this.LLJILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 950));
        this.LLJJIII = new ArrayList();
        this.LLJJIJI = new CopyOnWriteArrayList<>();
        this.LLJJIJIIJIL = new ArrayList();
        C13BV c13bv = C13BV.INSTANCE;
        this.LLJJIJIL = c13bv;
        this.LLJJJ = c13bv;
        this.LLJJJIL = c13bv;
        this.LLJJJJ = c13bv;
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 956));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 953));
        this.LLJJL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 967));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 966));
        RelativeLayout.inflate(context, R.layout.d5o, this);
        getFixedRegion();
        getSlideRegion();
        getSlideLeftRegion();
        getCollapseToolbarAndNextContainer().getLayoutParams().height = ((Number) getCollapsedListUpdateCallback().LJI.getValue()).intValue();
    }

    public final void LIZ(C1657950tFJ c1657950tFJ) {
        int i;
        try {
            if (C444960Hcc.LIZJ(getContext()) && c1657950tFJ.LIZJ.isEmpty()) {
                C786410Ut5.LJLLLLLL(4, getFixedRegionScrollView());
            }
            C1450080nq2 c1450080nq2 = C1450080nq2.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dispatchListUpdateResult,");
            sbLIZ.append(c1657950tFJ);
            C201955140j.LIZLLL(c1450080nq2, "PhotoToolbarView", C2188811AlT.LIZIZ(sbLIZ));
            getFixedListUpdateCallback().LIZLLL = c1657950tFJ.LIZIZ;
            if (getFixedListUpdateCallback().LIZIZ()) {
                RelativeLayout fixedRegion = getFixedRegion();
                if (c1657950tFJ.LIZIZ.isEmpty()) {
                    i = 8;
                } else {
                    i = 0;
                }
                C786410Ut5.LLIIL(fixedRegion, i);
            }
            C1658040tFS slideListUpdateCallback = getSlideListUpdateCallback();
            List<i3> list = c1657950tFJ.LIZJ;
            List<i3> list2 = c1657950tFJ.LIZLLL;
            slideListUpdateCallback.getClass();
            ArrayList arrayList = new ArrayList(list);
            slideListUpdateCallback.LLJ = arrayList;
            slideListUpdateCallback.LLILZ = list2;
            slideListUpdateCallback.LLIZ = arrayList.isEmpty();
            slideListUpdateCallback.LLIZLLLIL = false;
            c1657950tFJ.LJIIIIZZ.LIZIZ(getSlideListUpdateCallback());
            getSlideListUpdateCallback().LIZIZ();
            getSlideLeftRegionWithDividerUpdateCallback().LIZIZ(c1657950tFJ.LJ, c1657950tFJ.LJFF);
            c1657950tFJ.LJIIIZ.LIZIZ(getSlideLeftRegionWithDividerUpdateCallback());
            getSlideLeftRegionWithDividerUpdateCallback().LIZ();
            if (C444960Hcc.LIZJ(getContext()) && c1657950tFJ.LIZJ.isEmpty() && c1657950tFJ.LJ.isEmpty()) {
                HandlerHook.viewPost(getFixedRegionScrollView(), new ARunnableS116S0100000_16(this, 192));
            }
            Iterator it2 = ((ArrayList) this.LLJJIJIIJIL).iterator();
            while (it2.hasNext()) {
                ((Function0) it2.next()).invoke();
            }
            ((ArrayList) this.LLJJIJIIJIL).clear();
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ(this, e);
        } catch (IllegalStateException e2) {
            TryCatchGuardChecker.doCheck(e2);
            LIZIZ(this, e2);
        } catch (RuntimeException e3) {
            TryCatchGuardChecker.doCheck(e3);
            LIZIZ(this, e3);
        }
    }

    public final boolean LIZJ(MotionEvent motionEvent) {
        Object next;
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        Iterator it2 = ((ArrayList) this.LLJJIII).iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (((InterfaceC1658080tFW) next).LJI() && action != 3) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1658080tFW interfaceC1658080tFW = (InterfaceC1658080tFW) next;
        this.LLJJI = interfaceC1658080tFW;
        if (interfaceC1658080tFW == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (LIZJ(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            InterfaceC1658080tFW interfaceC1658080tFW = this.LLJJI;
            if (interfaceC1658080tFW == null) {
                if (motionEvent.getAction() != 0 && LIZJ(motionEvent)) {
                    return true;
                }
            } else {
                interfaceC1658080tFW.LIZ();
                int action = motionEvent.getAction();
                if (action != 1 && action != 3) {
                    return true;
                }
                this.LLJJI = null;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public static final void LIZIZ(C1658060tFU c1658060tFU, Exception exc) {
        C1450080nq2 c1450080nq2 = C1450080nq2.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exception on update:\n");
        sbLIZ.append(C13SZ.LIZIZ(exc));
        C201955140j.LJIIIIZZ(c1450080nq2, "PhotoToolbarView", C2188811AlT.LIZIZ(sbLIZ));
        C13BV c13bv = C13BV.INSTANCE;
        c1658060tFU.LLJJJ = c13bv;
        c1658060tFU.LLJJIJIL = c13bv;
        c1658060tFU.LLJJJIL = c13bv;
        C1658070tFV fixedListUpdateCallback = c1658060tFU.getFixedListUpdateCallback();
        fixedListUpdateCallback.getClass();
        fixedListUpdateCallback.LIZLLL = c13bv;
        C436180H8m.LIZIZ(fixedListUpdateCallback.LIZ);
        C436180H8m.LIZIZ(fixedListUpdateCallback.LIZIZ);
        C1658040tFS slideListUpdateCallback = c1658060tFU.getSlideListUpdateCallback();
        List<i3> list = slideListUpdateCallback.LLJ;
        if (list != null) {
            list.clear();
        }
        slideListUpdateCallback.LLILZ = c13bv;
        slideListUpdateCallback.LLILZLL = 0;
        slideListUpdateCallback.LLIZ = false;
        C1658040tFS c1658040tFS = c1658060tFU.getSlideLeftRegionWithDividerUpdateCallback().LLILLJJLI;
        List<i3> list2 = c1658040tFS.LLJ;
        if (list2 != null) {
            list2.clear();
        }
        c1658040tFS.LLILZ = c13bv;
        c1658040tFS.LLILZLL = 0;
        c1658040tFS.LLIZ = false;
        RelativeLayout fixedRegion = c1658060tFU.getFixedRegion();
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(fixedRegion, null);
        fixedRegion.removeAllViews();
        C786410Ut5.LJJJJJL(c1658060tFU.getSlideRegion());
        C786410Ut5.LJJJJJL(c1658060tFU.getSlideLeftRegion());
        InterfaceC1657840tF8 interfaceC1657840tF8 = c1658060tFU.LLILLL;
        if (interfaceC1657840tF8 != null) {
            interfaceC1657840tF8.LJ();
        }
    }

    public static void LIZLLL(C1658060tFU c1658060tFU, C1657940tFI c1657940tFI) {
        C11JF c11jf = c1658060tFU.LLJJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        c1658060tFU.LLILLL = c1657940tFI;
        c1658060tFU.getFixedListUpdateCallback().LJ = c1657940tFI;
        c1658060tFU.getSlideListUpdateCallback().LLILZIL = c1657940tFI;
        c1658060tFU.getSlideLeftRegionWithDividerUpdateCallback().LLILLJJLI.LLILZIL = c1657940tFI;
        c1658060tFU.getCollapsedListUpdateCallback().getClass();
        c1658060tFU.LLJJ = (C11JF) c1657940tFI.LIZ().LJJJLZIJ(LLJL.getValue()).LJIL(10L, TimeUnit.MILLISECONDS).LJJJJZI(new AkS486S0100000_25(c1658060tFU, 26)).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS152S0200000_16(c1658060tFU, null, 8), C19487811Me.LIZLLL);
    }
}

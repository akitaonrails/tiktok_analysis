package X;

import Y.ARunnableS35S0300000_2;
import Y.ARunnableS39S0300000_6;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.BigSaleConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.powercells.ECBillboardAuctionNoteCell;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.powercells.ECBillboardProductCell;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.powercells.ECBillboardTextCell;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.powercells.ECBillboardUserRightCell;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import g1c.AjS44S0200000_26;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vCN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733010vCN extends FrameLayout implements InterfaceC435120H4k {
    public final int LL;
    public final InterfaceC1733000vCM LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public boolean LLILZIL;
    public final C01GW LLILZLL;
    public final ViewOnAttachStateChangeListenerC20631115oD LLIZ;
    public final ViewGroup LLIZLLLIL;
    public final ViewGroup LLJ;
    public final SmartImageView LLJI;
    public final C054G LLJIJIL;
    public C099G LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public List<ECBillboard> LLJJ;
    public Map<String, ? extends Object> LLJJI;
    public long LLJJIII;
    public Boolean LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public long LLJJIJIL;
    public final C1775700wJE LLJJJ;

    @Override // X.InterfaceC435120H4k
    public final void onStart() {
        this.LLJILJILJ = true;
    }

    @Override // X.InterfaceC435120H4k
    public final void onStop() {
        this.LLJILJILJ = false;
    }

    private final int getTouchSlop() {
        return ((Number) this.LLILZLL.getValue()).intValue();
    }

    public final boolean LIZLLL() {
        InterfaceC1733780vDc viewItemOperator;
        List<InterfaceC1891350zJl> listLIZ;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLIZ;
        if (viewOnAttachStateChangeListenerC20631115oD == null) {
            return false;
        }
        int currentItem = viewOnAttachStateChangeListenerC20631115oD.getCurrentItem();
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLIZ;
        InterfaceC1891350zJl interfaceC1891350zJl = null;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD2.getViewItemOperator()) != null && (listLIZ = viewItemOperator.LIZ()) != null) {
            interfaceC1891350zJl = (InterfaceC1891350zJl) C13LP.LJJJLZIJ(currentItem, listLIZ);
        }
        return (interfaceC1891350zJl instanceof C046200Eq) && interfaceC1891350zJl != null;
    }

    public final long getLoopInterval() {
        return ((Number) this.LLJJIJIIJIL.getValue()).longValue();
    }

    @Override // android.view.View
    public final boolean performClick() {
        InterfaceC046300Er interfaceC046300Er;
        InterfaceC1733780vDc viewItemOperator;
        List<InterfaceC1891350zJl> listLIZ;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("perform click isHandledByMove:");
        sbLIZ.append(this.LLILZIL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (System.currentTimeMillis() - this.LLJJIJIL < 500) {
            return false;
        }
        if (this.LLILZIL) {
            return super.performClick();
        }
        ViewGroup viewGroup = this.LLIZLLLIL;
        if (viewGroup != null && viewGroup.getVisibility() == 0) {
            try {
                ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLIZ;
                int currentItem = viewOnAttachStateChangeListenerC20631115oD != null ? viewOnAttachStateChangeListenerC20631115oD.getCurrentItem() : -1;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("perform click curItemIndex:");
                sbLIZ2.append(currentItem);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (currentItem >= 0) {
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLIZ;
                    InterfaceC1891350zJl interfaceC1891350zJl = null;
                    if (viewOnAttachStateChangeListenerC20631115oD2 != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD2.getViewItemOperator()) != null && (listLIZ = viewItemOperator.LIZ()) != null) {
                        interfaceC1891350zJl = (InterfaceC1891350zJl) C13LP.LJJJLZIJ(currentItem, listLIZ);
                    }
                    if (!(interfaceC1891350zJl instanceof InterfaceC046300Er) || (interfaceC046300Er = (InterfaceC046300Er) interfaceC1891350zJl) == null) {
                        C1729270v6L.LIZ("no_schema_when_click", "no curItem. ", null, null, null, null, "", 0, 0, 0, 956);
                    } else {
                        String strLJI = LJI(interfaceC046300Er);
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("perform click schema:");
                        sbLIZ3.append(strLJI);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        if (C703302op.LIZ(strLJI)) {
                            if (strLJI != null) {
                                LJIIJ(strLJI, interfaceC046300Er);
                            }
                            interfaceC046300Er.LIZIZ().invoke();
                            this.LLJJIJIL = System.currentTimeMillis();
                            return true;
                        }
                        String str = interfaceC046300Er.LIZ().billboardId;
                        if (str == null) {
                            str = "";
                        }
                        C1729270v6L.LIZ("no_schema_when_click", "no schema. ", null, null, null, null, str, 0, 0, 0, 956);
                    }
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        SmartImageView smartImageView = this.LLJI;
        if (smartImageView == null || smartImageView.getVisibility() != 0) {
            return super.performClick();
        }
        this.LLJJIJIL = System.currentTimeMillis();
        SmartImageView smartImageView2 = this.LLJI;
        if (smartImageView2 != null) {
            return smartImageView2.performClick();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC1733780vDc viewItemOperator;
        super.onAttachedToWindow();
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLIZ;
        if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null) {
            viewItemOperator.LIZJ(ECBillboardProductCell.class, ECBillboardTextCell.class, ECBillboardAuctionNoteCell.class, ECBillboardUserRightCell.class);
        }
        if (this.LL == 0) {
            ViewGroup viewGroup = this.LLJ;
            if (viewGroup != null) {
                C12ES.LJIILL(4, viewGroup);
            }
        } else {
            ViewGroup viewGroup2 = this.LLJ;
            if (viewGroup2 != null) {
                C03DZ.LIZ(viewGroup2);
            }
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLIZ;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null) {
            viewOnAttachStateChangeListenerC20631115oD2.addOnItemTouchListener(new InterfaceC21676019sM() { // from class: X.0vCQ
                @Override // X.InterfaceC21676019sM
                public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
                }

                @Override // X.InterfaceC21676019sM
                public final void LJIIZILJ(boolean z) {
                }

                @Override // X.InterfaceC21676019sM
                public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                    return !this.LL.LIZLLL();
                }
            });
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = this.LLIZ;
        if (viewOnAttachStateChangeListenerC20631115oD3 != null) {
            viewOnAttachStateChangeListenerC20631115oD3.registerOnPageChangeCallback(this.LLJJJ);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        super.onDetachedFromWindow();
        C2296808zG.LIZJ(this.LLJIJIL, null);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLIZ;
        if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
            state.LJFF(null);
        }
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLIZ;
        if (viewOnAttachStateChangeListenerC20631115oD2 != null) {
            viewOnAttachStateChangeListenerC20631115oD2.unregisterOnPageChangeCallback(this.LLJJJ);
        }
    }

    public final List<ECBillboard> getCurrentBillboards() {
        return this.LLJJ;
    }

    public final Map<String, Object> getCurrentDaInfo() {
        return this.LLJJI;
    }

    public final int getPageType() {
        return this.LL;
    }

    public final long getShowTime() {
        return this.LLJJIII;
    }

    public final View LIZIZ(int i) {
        View view;
        View view2;
        ViewGroup viewGroup;
        RecyclerView recyclerView;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view3;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLIZ;
        if (viewOnAttachStateChangeListenerC20631115oD != null) {
            view = (View) C13LP.LJJJLIIL(new C2500209qy(viewOnAttachStateChangeListenerC20631115oD, 27));
        } else {
            view = null;
        }
        if ((view instanceof ViewGroup) && (viewGroup3 = (ViewGroup) view) != null) {
            view2 = (View) C13LP.LJJJLIIL(new C2500209qy(viewGroup3, 28));
        } else {
            view2 = null;
        }
        if (view2 instanceof ViewGroup) {
            viewGroup = (ViewGroup) view2;
        } else {
            viewGroup = null;
        }
        if (!(viewGroup instanceof RecyclerView) || (recyclerView = (RecyclerView) viewGroup) == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) == null || (view3 = viewHolderFindViewHolderForAdapterPosition.itemView) == null || !(view3 instanceof ViewGroup) || (viewGroup2 = (ViewGroup) view3) == null) {
            return null;
        }
        return (View) C13LP.LJJJLIIL(new C2500209qy(viewGroup2, 29));
    }

    public final int LIZJ(View view) {
        int measuredHeight;
        C371740Eho c371740Eho;
        View view2;
        if (view == null) {
            return 0;
        }
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((view2.getWidth() - view2.getPaddingLeft()) - view2.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(view2.getHeight(), Integer.MIN_VALUE));
            measuredHeight = view.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("view: ");
        sbLIZ.append(view);
        sbLIZ.append(", height: ");
        sbLIZ.append(view.getHeight());
        sbLIZ.append(", measuredHeight: ");
        sbLIZ.append(view.getMeasuredHeight());
        sbLIZ.append(", measureWithParentConstraint: ");
        sbLIZ.append(measuredHeight);
        C2188811AlT.LIZIZ(sbLIZ);
        ViewGroup viewGroup = this.LLIZLLLIL;
        if ((viewGroup instanceof C371740Eho) && (c371740Eho = (C371740Eho) viewGroup) != null) {
            Integer numValueOf = Integer.valueOf(c371740Eho.getMaxHeightPx());
            if (numValueOf.intValue() > 0) {
                return Math.min(measuredHeight, numValueOf.intValue());
            }
            return measuredHeight;
        }
        return measuredHeight;
    }

    public final boolean LJ(MotionEvent motionEvent) {
        int currentItem;
        int i = this.LL;
        if (i == 0 || i == 1) {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLIZ;
            if (viewOnAttachStateChangeListenerC20631115oD != null) {
                currentItem = viewOnAttachStateChangeListenerC20631115oD.getCurrentItem();
            } else {
                currentItem = 0;
            }
            if (motionEvent != null) {
                View viewLIZIZ = LIZIZ(currentItem);
                if (viewLIZIZ == null || !LJFF(motionEvent, viewLIZIZ)) {
                    SmartImageView smartImageView = this.LLJI;
                    if (smartImageView != null && LJFF(motionEvent, smartImageView)) {
                        return true;
                    }
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public final String LJI(InterfaceC046300Er interfaceC046300Er) {
        String strInvoke;
        String strInvoke2;
        String strInvoke3;
        if (interfaceC046300Er instanceof C046000Eo) {
            return ((C046000Eo) interfaceC046300Er).LLILZIL.invoke();
        }
        if (interfaceC046300Er instanceof C046100Ep) {
            C046100Ep c046100Ep = (C046100Ep) interfaceC046300Er;
            Function0<String> function0 = c046100Ep.LLILZIL;
            if (function0 != null && (strInvoke3 = function0.invoke()) != null) {
                return strInvoke3;
            }
            return c046100Ep.LL.LIZJ(this.LL);
        }
        if (interfaceC046300Er instanceof C045900En) {
            C045900En c045900En = (C045900En) interfaceC046300Er;
            Function0<String> function02 = c045900En.LLILZ;
            if (function02 != null && (strInvoke2 = function02.invoke()) != null) {
                return strInvoke2;
            }
            return c045900En.LL.LIZJ(this.LL);
        }
        if (interfaceC046300Er instanceof C046200Eq) {
            C046200Eq c046200Eq = (C046200Eq) interfaceC046300Er;
            Function0<String> function03 = c046200Eq.LLILZIL;
            if (function03 != null && (strInvoke = function03.invoke()) != null) {
                return strInvoke;
            }
            return c046200Eq.LL.LIZJ(this.LL);
        }
        return interfaceC046300Er.LIZ().LIZJ(this.LL);
    }

    public final void LJII(ECBillboard eCBillboard) {
        final String str;
        SmartImageView smartImageView = this.LLJI;
        if (smartImageView != null) {
            C03DZ.LIZJ(smartImageView);
        }
        List<ECBillboard> list = this.LLJJ;
        if (list != null) {
            this.LLILLJJLI.LJI(list, this.LLJJI);
        }
        BigSaleConfig bigSaleConfig = eCBillboard.bigSaleConfig;
        if (bigSaleConfig != null && (str = bigSaleConfig.imageUrl) != null) {
            C1326790kdB.LIZ.getClass();
            C1326790kdB.LIZLLL(str).LJJII(new AbstractC468201s0() { // from class: X.0GcQ
                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    ViewGroup.LayoutParams layoutParams;
                    if (bitmap != null) {
                        int height = bitmap.getHeight();
                        int width = bitmap.getWidth();
                        if (width <= 0) {
                            return;
                        }
                        float f = height / width;
                        SmartImageView smartImageView2 = this.LL.LLJI;
                        Integer numValueOf = null;
                        if (smartImageView2 != null) {
                            layoutParams = smartImageView2.getLayoutParams();
                            if (layoutParams != null) {
                                layoutParams.height = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100)) * f);
                            }
                        } else {
                            layoutParams = null;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("height:");
                        sbLIZ.append(height);
                        sbLIZ.append(", width:");
                        sbLIZ.append(width);
                        sbLIZ.append(", ratio:");
                        sbLIZ.append(f);
                        sbLIZ.append(", layoutparamsheight:");
                        if (layoutParams != null) {
                            numValueOf = Integer.valueOf(layoutParams.height);
                        }
                        sbLIZ.append(numValueOf);
                        C2188811AlT.LIZIZ(sbLIZ);
                        C1733010vCN c1733010vCN = this.LL;
                        SmartImageView smartImageView3 = c1733010vCN.LLJI;
                        if (smartImageView3 != null) {
                            HandlerHook.viewPost(smartImageView3, new ARunnableS39S0300000_6(c1733010vCN, layoutParams, bitmap, 29));
                        }
                    }
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("imageUrl:");
                    sbLIZ.append(str);
                    sbLIZ.append(';');
                    C1729270v6L.LIZ("image_download_fail", C2188811AlT.LIZIZ(sbLIZ), null, null, null, null, "", 0, 0, 0, 956);
                }
            });
        }
        this.LLJILLL = eCBillboard.billboardId;
        SmartImageView smartImageView2 = this.LLJI;
        if (smartImageView2 != null) {
            C786410Ut5.I7(new AjS44S0200000_26(eCBillboard, this, 48), smartImageView2);
        }
    }

    public final void LJIIIIZZ(List<? extends InterfaceC1891350zJl> list) {
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        InterfaceC1733780vDc viewItemOperator2;
        ViewGroup viewGroup = this.LLIZLLLIL;
        if (viewGroup != null) {
            C03DZ.LIZ(viewGroup);
        }
        this.LLJJIJI = null;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLIZ;
        if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator2 = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null) {
            C1173220gdU c1173220gdU = new C1173220gdU();
            c1173220gdU.LIZ = -1;
            viewItemOperator2.LIZLLL(c1173220gdU);
        }
        if (list.isEmpty()) {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLIZ;
            if (viewOnAttachStateChangeListenerC20631115oD2 != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD2.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
                state.LJFF(null);
            }
            C1729270v6L.LIZ("billboard_empty", "empty list", null, null, null, null, "", 0, 0, 0, 956);
            return;
        }
        ViewGroup viewGroup2 = this.LLIZLLLIL;
        if (viewGroup2 != null) {
            C03DZ.LIZJ(viewGroup2);
        }
        List<ECBillboard> list2 = this.LLJJ;
        if (list2 != null) {
            this.LLILLJJLI.LJI(list2, this.LLJJI);
        }
        try {
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = this.LLIZ;
            if (viewOnAttachStateChangeListenerC20631115oD3 != null) {
                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD3, new ARunnableS75S0200000_6(this, list, 136));
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        SmartImageView smartImageView;
        Integer numValueOf;
        ViewGroup viewGroup = this.LLIZLLLIL;
        if ((viewGroup != null && viewGroup.getVisibility() == 0) || ((smartImageView = this.LLJI) != null && smartImageView.getVisibility() == 0)) {
            boolean zLJ = LJ(motionEvent);
            if (motionEvent != null && (numValueOf = Integer.valueOf(motionEvent.getAction())) != null) {
                if (numValueOf.intValue() == 0) {
                    if (!zLJ) {
                        return false;
                    }
                    this.LLILZ = motionEvent.getX();
                    this.LLILLL = motionEvent.getY();
                    this.LLILZIL = false;
                    return !LIZLLL();
                }
                if (numValueOf.intValue() == 2) {
                    if (!zLJ) {
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                    float fAbs = Math.abs(motionEvent.getX() - this.LLILZ);
                    float fAbs2 = Math.abs(motionEvent.getY() - this.LLILLL);
                    if (fAbs > getTouchSlop() && fAbs > fAbs2) {
                        return true;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Integer numValueOf;
        Float fValueOf;
        SmartImageView smartImageView;
        int currentItem;
        RecyclerView.LayoutManager layoutManager;
        RecyclerView.LayoutManager layoutManager2;
        InterfaceC1733780vDc viewItemOperator;
        List<InterfaceC1891350zJl> listLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("liveroomtouch onTouchEvent action: ");
        if (motionEvent != null) {
            numValueOf = Integer.valueOf(motionEvent.getAction());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", isHandledByMove: ");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", eventX ");
        if (motionEvent != null) {
            fValueOf = Float.valueOf(motionEvent.getX());
        } else {
            fValueOf = null;
        }
        sbLIZ.append(fValueOf);
        sbLIZ.append(", initialmotionx:");
        sbLIZ.append(this.LLILZ);
        C2188811AlT.LIZIZ(sbLIZ);
        boolean zLJ = LJ(motionEvent);
        ViewGroup viewGroup = this.LLIZLLLIL;
        int size = 0;
        if ((viewGroup != null && viewGroup.getVisibility() == 0) || ((smartImageView = this.LLJI) != null && smartImageView.getVisibility() == 0)) {
            if (motionEvent == null) {
                return super.onTouchEvent(motionEvent);
            }
            if (!zLJ) {
                int i = C2187451AjH.LIZ;
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.LLILZ = motionEvent.getX();
                this.LLILLL = motionEvent.getY();
                this.LLILZIL = false;
                return true;
            }
            if (action == 2) {
                float x = motionEvent.getX();
                motionEvent.getY();
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 2) {
                        float f = x - this.LLILZ;
                        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLIZ;
                        if (viewOnAttachStateChangeListenerC20631115oD != null) {
                            currentItem = viewOnAttachStateChangeListenerC20631115oD.getCurrentItem();
                        } else {
                            currentItem = 0;
                        }
                        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = this.LLIZ;
                        if (viewOnAttachStateChangeListenerC20631115oD2 != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD2.getViewItemOperator()) != null && (listLIZ = viewItemOperator.LIZ()) != null) {
                            size = listLIZ.size();
                        }
                        int i2 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("liveroomtouch interceptTouch action move: diffX: ");
                        sbLIZ2.append(f);
                        sbLIZ2.append(", currentItem : ");
                        sbLIZ2.append(currentItem);
                        sbLIZ2.append(", viewpagerSize: ");
                        sbLIZ2.append(size);
                        sbLIZ2.append(", isScrolling:");
                        sbLIZ2.append(this.LLJILJILJ);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (!this.LLJILJILJ && size > 0) {
                            try {
                                C435110H4j c435110H4j = new C435110H4j(getContext(), this);
                                if (f < -60.0f && currentItem < size - 1) {
                                    C099G c099g = this.LLJILJIL;
                                    if (c099g != null) {
                                        c099g.LIZIZ(null);
                                    }
                                    int i3 = currentItem + 1;
                                    c435110H4j.LIZ = i3;
                                    this.LLJJIJI = Boolean.TRUE;
                                    this.LLILZIL = true;
                                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = this.LLIZ;
                                    if (viewOnAttachStateChangeListenerC20631115oD3 != null && (layoutManager2 = viewOnAttachStateChangeListenerC20631115oD3.getLayoutManager()) != null) {
                                        layoutManager2.startSmoothScroll(c435110H4j);
                                    }
                                    LJIIIZ(currentItem, i3);
                                    return true;
                                }
                                if (f > 60.0f && currentItem > 0) {
                                    C099G c099g2 = this.LLJILJIL;
                                    if (c099g2 != null) {
                                        c099g2.LIZIZ(null);
                                    }
                                    int i4 = currentItem - 1;
                                    c435110H4j.LIZ = i4;
                                    this.LLJJIJI = Boolean.FALSE;
                                    this.LLILZIL = true;
                                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD4 = this.LLIZ;
                                    if (viewOnAttachStateChangeListenerC20631115oD4 != null && (layoutManager = viewOnAttachStateChangeListenerC20631115oD4.getLayoutManager()) != null) {
                                        layoutManager.startSmoothScroll(c435110H4j);
                                    }
                                    LJIIIZ(currentItem, i4);
                                    return true;
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                return true;
                            }
                        }
                    } else {
                        motionEvent.getAction();
                    }
                }
                return true;
            }
            if (action == 1) {
                if (Math.abs(motionEvent.getX() - this.LLILZ) < 60.0f) {
                    performClick();
                }
                return true;
            }
            if (action == 3) {
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCurrentBillboards(List<ECBillboard> list) {
        this.LLJJ = list;
    }

    public final void setCurrentDaInfo(Map<String, ? extends Object> map) {
        this.LLJJI = map;
    }

    public final void setShowTime(long j) {
        this.LLJJIII = j;
    }

    public static boolean LJFF(MotionEvent motionEvent, View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (rawX < i || rawX > i + width || rawY < i2 || rawY > i2 + height) {
            return false;
        }
        return true;
    }

    public final void LJIIIZ(int i, int i2) {
        View viewLIZIZ = LIZIZ(i2);
        View viewLIZIZ2 = LIZIZ(i);
        if (viewLIZIZ2 != null) {
            HandlerHook.viewPost(viewLIZIZ2, new ARunnableS35S0300000_2(viewLIZIZ, viewLIZIZ2, this, 9));
        }
    }

    public final void LJIIJ(String str, InterfaceC046300Er interfaceC046300Er) {
        String strLJIIIIZZ;
        if (this.LL == 2) {
            SmartRouter.buildRoute(getContext(), str).open();
            return;
        }
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = getContext();
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        try {
            Pair[] pairArr = new Pair[1];
            List<ECBillboard> list = this.LLJJ;
            if (list != null) {
                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(list);
            } else {
                strLJIIIIZZ = null;
            }
            pairArr[0] = new Pair("billboards", strLJIIIIZZ);
            C1547280qMo.LJFF(sparkContext, pairArr);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String str2 = interfaceC046300Er.LIZ().billboardId;
            if (str2 == null) {
                str2 = "";
            }
            C1729270v6L.LIZ("template_data_exception", "add template data fail", null, null, null, null, str2, 0, 0, 0, 956);
        }
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
    }

    public C1733010vCN(Context context, int i, InterfaceC1733000vCM interfaceC1733000vCM) {
        IHostCreativeTool iHostCreativeTool;
        AbstractC1387200mCc abstractC1387200mCcLIZLLL;
        LifecycleOwner lifecycleOwnerLJFF;
        InterfaceC1733780vDc viewItemOperator;
        super(context);
        this.LL = i;
        this.LLILLJJLI = interfaceC1733000vCM;
        this.LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(context, 1566));
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLJIJIL = C2296808zG.LIZ(C2107308Nj.LIZ);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(514));
        this.LLJJJ = new C1775700wJE(this, 3);
        C786410Ut5.Sd(R.layout.bx4, C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp)), this);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) findViewById(R.id.c1e);
        this.LLIZ = viewOnAttachStateChangeListenerC20631115oD;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && iLiveOuterService.M5() != null && (iHostCreativeTool = C520010KaN.LIZ) != null && iHostCreativeTool.UC0() && (abstractC1387200mCcLIZLLL = C520150Kab.LIZLLL()) != null && (lifecycleOwnerLJFF = abstractC1387200mCcLIZLLL.LJFF()) != null && viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null) {
            viewItemOperator.setLifecycleOwner(lifecycleOwnerLJFF);
        }
        this.LLJ = (ViewGroup) findViewById(R.id.rs6);
        this.LLIZLLLIL = (ViewGroup) findViewById(R.id.c1_);
        this.LLJI = (SmartImageView) findViewById(R.id.kby);
        setId(R.id.c0w);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.util.List<com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard> r18, X.InterfaceC1731950vAf r19, java.util.Map<java.lang.String, ? extends java.lang.Object> r20) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1733010vCN.LIZ(java.util.List, X.0vAf, java.util.Map):void");
    }
}

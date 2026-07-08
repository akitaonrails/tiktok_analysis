package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadFeatures;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w0Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1764130w0Z extends FrameLayout implements InterfaceC1146704e9 {
    public final C1764150w0b LL;
    public final C1764190w0f LLILLJJLI;
    public C1764140w0a LLILLL;
    public C1764510w1B LLILZ;
    public final Map<String, Integer> LLILZIL;
    public Function1<? super Integer, Unit> LLILZLL;
    public boolean LLIZ;
    public InterfaceC1764720w1W LLIZLLLIL;
    public int LLJ;
    public EnumC1764120w0Y LLJI;
    public final Map<Integer, String> LLJIJIL;
    public Boolean LLJILJIL;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SeaPdpFragmentScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SeaPdpFragmentScope.class);
        return arrayList;
    }

    public final void setFullScreen(Boolean bool) {
    }

    private final FrameLayout.LayoutParams getListLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.LL.getViewPager2().getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            return (FrameLayout.LayoutParams) layoutParams;
        }
        return null;
    }

    public final C04G1 getCurrentCardNode() {
        C1764140w0a c1764140w0a = this.LLILLL;
        if (c1764140w0a != null) {
            return (C04G1) C13LP.LJJJLZIJ(this.LL.getViewPager2().getCurrentItem(), c1764140w0a.LL.LJFF);
        }
        return null;
    }

    public final int getCurrentListIndex() {
        return this.LL.getViewPager2().getCurrentItem();
    }

    public final RecyclerView getRecyclerView() {
        C20632315oP viewPager2 = this.LL.getViewPager2();
        int childCount = viewPager2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewPager2.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                return (RecyclerView) childAt;
            }
        }
        return null;
    }

    public final void LIZ() {
        IECommerceHostService iECommerceHostService;
        FrameLayout.LayoutParams listLayoutParams;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isPad() && (listLayoutParams = getListLayoutParams()) != null) {
            listLayoutParams.height = C679280Qkg.LIZ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            setListLayoutParams(listLayoutParams);
        }
    }

    public final int getDefaultListIndex() {
        return this.LLJ;
    }

    public final Function1<Integer, Unit> getListSelectedListener() {
        return this.LLILZLL;
    }

    public final InterfaceC1764720w1W getListener() {
        return this.LLIZLLLIL;
    }

    public final C1764510w1B getRenderNodeInfo() {
        return this.LLILZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1764130w0Z(Context context) {
        super(context, null, 0);
        int i = 0;
        C1764150w0b c1764150w0b = new C1764150w0b(context, null, 0);
        this.LL = c1764150w0b;
        C1764190w0f c1764190w0f = new C1764190w0f(context, null, 14);
        this.LLILLJJLI = c1764190w0f;
        this.LLILZIL = new LinkedHashMap();
        this.LLJI = EnumC1764120w0Y.NONE;
        this.LLJIJIL = new LinkedHashMap();
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C1764150w0b c1764150w0b2 = this.LL;
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1764150w0b2);
        c1764150w0b2.setLayoutParams(layoutParams2);
        addView(c1764150w0b);
        C20632315oP viewPager2 = c1764150w0b.getViewPager2();
        int childCount = viewPager2.getChildCount();
        while (true) {
            if (i >= childCount) {
                break;
            }
            View childAt = viewPager2.getChildAt(i);
            if (childAt instanceof RecyclerView) {
                RecyclerView recyclerView = (RecyclerView) childAt;
                if (recyclerView != null) {
                    recyclerView.setItemAnimator(null);
                }
            } else {
                i++;
            }
        }
        int visibility = c1764190w0f.getVisibility();
        c1764190w0f.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1764190w0f);
        C1764190w0f c1764190w0f2 = this.LLILLJJLI;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1764190w0f2);
        c1764190w0f2.setLayoutParams(layoutParams3);
        addView(c1764190w0f);
    }

    private final void setListLayoutParams(FrameLayout.LayoutParams layoutParams) {
        C786410Ut5.r6(this.LL.getViewPager2(), layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(String str) {
        SeaPdpHeadFeatures seaPdpHeadFeatures;
        List<String> list;
        this.LLJIJIL.put(Integer.valueOf(this.LL.getViewPager2().getCurrentItem()), str);
        Iterator<T> it2 = this.LLILLJJLI.getCurrentPendantMap().values().iterator();
        while (it2.hasNext()) {
            AbstractC1764240w0k abstractC1764240w0k = (AbstractC1764240w0k) it2.next();
            C1068804Fy c1068804Fy = abstractC1764240w0k.LLILZ;
            if (c1068804Fy != null && (seaPdpHeadFeatures = c1068804Fy.LJIL) != null && (list = seaPdpHeadFeatures.tags) != null && list.contains(str)) {
                if (abstractC1764240w0k instanceof InterfaceC1764710w1V) {
                    ((InterfaceC1764710w1V) abstractC1764240w0k).LIZIZ();
                }
                abstractC1764240w0k.LLILLL = true;
                C786410Ut5.LJLLLLLL(8, abstractC1764240w0k.LL);
            }
        }
    }

    public final void setAdapter(C1764140w0a c1764140w0a) {
        if (Intrinsics.LJFF(this.LLILLL, c1764140w0a)) {
            return;
        }
        this.LLILLL = c1764140w0a;
        this.LL.getViewPager2().setOffscreenPageLimit(1);
        this.LL.setAdapter(c1764140w0a);
        C1764150w0b c1764150w0b = this.LL;
        c1764150w0b.LL.LIZIZ(new C1775700wJE(this, 4));
    }

    public final void setDefaultListIndex(int i) {
        this.LLJ = i;
    }

    public final void setFirstGlide(Boolean bool) {
        this.LLJILJIL = bool;
    }

    public final void setFullScreenMode(boolean z) {
        this.LL.setScreenState(z);
    }

    public final void setListSelectedListener(Function1<? super Integer, Unit> function1) {
        this.LLILZLL = function1;
    }

    public final void setListener(InterfaceC1764720w1W interfaceC1764720w1W) {
        this.LLIZLLLIL = interfaceC1764720w1W;
    }
}

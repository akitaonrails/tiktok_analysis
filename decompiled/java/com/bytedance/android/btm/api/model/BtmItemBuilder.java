package com.bytedance.android.btm.api.model;

import X.C1869050yjn;
import X.C18EK;
import X.C18EY;
import X.C18H2;
import X.C18H3;
import X.C18IK;
import X.EnumC20164613vA;
import X.InterfaceC1294060jmO;
import X.InterfaceC20337014hs;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.btm.api.BtmSDK;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes33.dex */
public final class BtmItemBuilder {
    public final C18EK item;

    public BtmItemBuilder() {
        this("", null);
    }

    public final C18EK build() {
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        boolean z = true;
        btmSDK.getService().getMonitor().LIZ(new C18H2(), this.item.LIZ.length() > 0);
        InterfaceC20337014hs monitor = btmSDK.getService().getMonitor();
        if (this.item.LJ.isEmpty()) {
            C18EK c18ek = this.item;
            if (c18ek.LJFF == null) {
                c18ek.getClass();
                z = false;
            }
        }
        monitor.LIZ(new C18H3(), z);
        return this.item;
    }

    public final BtmItemBuilder copy() {
        return copy(this.item.LIZ);
    }

    @InterfaceC1294060jmO
    public final String createBtmId() {
        return BtmSDK.INSTANCE.createBtmId(copy().build());
    }

    public final PageFinder getPageFinder() {
        return this.item.LJ;
    }

    public final String obtainEventBtmParams() {
        this.item.LIZIZ = Boolean.FALSE;
        return BtmSDK.INSTANCE.createBtmId(copy().build());
    }

    public final void willJumpToNextPage() {
        this.item.LIZIZ = Boolean.TRUE;
        BtmSDK.INSTANCE.createBtmId(copy().build());
    }

    public final BtmItemBuilder copy(String str) {
        BtmItemBuilder btmItemBuilder = new BtmItemBuilder(str, this.item.LIZIZ);
        btmItemBuilder.setEnterPageTimes(this.item.LIZJ);
        C18EK c18ek = this.item;
        ViewPager viewPager = c18ek.LJFF;
        if (viewPager != null) {
            btmItemBuilder.withViewPager(viewPager, c18ek.LJI);
        }
        this.item.getClass();
        C18EK c18ek2 = btmItemBuilder.item;
        C18EK c18ek3 = this.item;
        c18ek2.LJ = c18ek3.LJ;
        c18ek2.LJIIJ = c18ek3.LJIIJ;
        return btmItemBuilder;
    }

    public final BtmItemBuilder setAddBtmChain(boolean z) {
        this.item.LJII = z;
        return this;
    }

    public final BtmItemBuilder setBtmChainLength(int i) {
        this.item.LJIIIIZZ = i;
        return this;
    }

    @InterfaceC1294060jmO
    public final BtmItemBuilder setEnterPage(boolean z) {
        this.item.LIZIZ = Boolean.valueOf(z);
        return this;
    }

    public final BtmItemBuilder setEnterPageTimes(int i) {
        this.item.LIZJ = i;
        return this;
    }

    public final BtmItemBuilder setExtraParams(Set<? extends EnumC20164613vA> set) {
        this.item.LJIIIZ = set;
        return this;
    }

    public final BtmItemBuilder setTargetPagesBtm(String... strArr) {
        ((ArrayList) this.item.LIZLLL).clear();
        for (String str : strArr) {
            if (str != null && str.length() != 0) {
                ((ArrayList) this.item.LIZLLL).add(str);
            }
        }
        return this;
    }

    public final BtmItemBuilder withBtmPage(Object obj) {
        boolean z;
        InterfaceC20337014hs monitor = BtmSDK.INSTANCE.getService().getMonitor();
        if (C18EY.LIZ(obj) != null) {
            z = true;
        } else {
            z = false;
        }
        monitor.LIZ(new C1869050yjn(obj), z);
        this.item.LJ.page = obj;
        return this;
    }

    public final BtmItemBuilder withPageFinder(PageFinder pageFinder) {
        if (pageFinder != null) {
            this.item.LJ = pageFinder;
        }
        return this;
    }

    public final BtmItemBuilder withView(View view) {
        this.item.LJ.view = view;
        return this;
    }

    public final BtmItemBuilder setTargetPagesBtm(List<String> list) {
        ((ArrayList) this.item.LIZLLL).clear();
        ((ArrayList) this.item.LIZLLL).addAll(list);
        return this;
    }

    public BtmItemBuilder(String str, Boolean bool) {
        C18EK c18ek = new C18EK();
        this.item = c18ek;
        c18ek.LIZ = str;
        c18ek.LIZIZ = bool;
    }

    public final BtmItemBuilder internalSetUnitParams(String str, Object obj) {
        if (str != null && str.length() != 0 && obj != null) {
            this.item.LJIIJ.put(str, obj);
        }
        return this;
    }

    public final BtmItemBuilder withViewPager(ViewPager viewPager, int i) {
        C18EK c18ek = this.item;
        c18ek.LJFF = viewPager;
        c18ek.LJI = i;
        return this;
    }

    public final BtmItemBuilder withGetFragmentListener(C18IK c18ik, int i, FragmentManager fragmentManager) {
        this.item.getClass();
        this.item.LJI = i;
        return this;
    }
}

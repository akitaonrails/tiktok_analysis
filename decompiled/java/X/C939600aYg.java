package X;

import Y.AfS151S0200000_15;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.TopLiveSkylightTransYChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.Fix7322151019FeedPauseMaskSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveCardOverdrawOptSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdk.sei.SeiTextHeaderExtra;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939600aYg implements InterfaceC940380aZw {
    public static final /* synthetic */ int LLLII = 0;
    public final CopyOnWriteArrayList<AbstractC940410aZz> LL;
    public final ConcurrentHashMap<String, AbstractC940410aZz> LLILLJJLI;
    public final ConcurrentHashMap<Integer, AbstractC940410aZz> LLILLL;
    public final HashMap<String, Boolean> LLILZ;
    public final HashMap<String, Integer> LLILZIL;
    public final HashMap<String, Integer> LLILZLL;
    public final HashMap<String, Long> LLIZ;
    public InterfaceC937900aVw LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final Map<String, LinkPlayerInfo> LLJIJIL;
    public long LLJILJIL;
    public boolean LLJILJILJ;
    public final Map<Integer, C416040GTa> LLJILLL;
    public long LLJJ;
    public String LLJJI;
    public final List<PosIdentity> LLJJIII;
    public C940490aa7 LLJJIJI;
    public FrameLayout LLJJIJIIJIL;
    public C919770a2h LLJJIJIL;
    public final C01GW LLJJJ;
    public EnumC918990a1R LLJJJIL;
    public EnumC945310aht LLJJJJ;
    public ImageView LLJJJJJIL;
    public View LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public SeiAppData LLJLIL;
    public C15P4 LLJLILLLLZIIL;
    public SeiTextHeaderExtra LLJLL;
    public final HashMap<String, Boolean> LLJLLIL;
    public InterfaceC940230aZh LLJLLL;
    public boolean LLJZ;
    public final MutableLiveData<MultiGuestThemeViewModel> LLJZIJLIL;
    public MultiGuestSharedBgGuestViewModel LLL;
    public String LLLF;
    public boolean LLLFF;
    public final C939630aYj LLLFFI;
    public final C01GW LLLFZ;
    public boolean LLLI;

    public C939600aYg() {
        throw null;
    }

    @Override // X.InterfaceC958970b3v
    public final void LIZJ(int i, List list) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LJJIJL(C2180891AWx c2180891AWx) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LJJJI() {
    }

    @Override // X.InterfaceC958970b3v
    public final boolean LJJJIL() {
        return true;
    }

    @Override // X.InterfaceC958970b3v
    public final void LLIIIL(Map map) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJJJ() {
    }

    @Override // X.InterfaceC940380aZw
    public final void LLJJJIL() {
        this.LLLFF = true;
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLJLLL(List list, boolean z) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLJ(LinkUser linkUser) {
    }

    @Override // X.InterfaceC940380aZw
    public final void release() {
        this.LLLI = false;
        InterfaceC937900aVw interfaceC937900aVw = this.LLIZLLLIL;
        if (interfaceC937900aVw != null) {
            interfaceC937900aVw.V4(true);
        }
        InterfaceC937900aVw interfaceC937900aVw2 = this.LLIZLLLIL;
        if (interfaceC937900aVw2 != null) {
            interfaceC937900aVw2.LJLJLJ(this.LLLFFI);
        }
        this.LLIZLLLIL = null;
        LIZLLL();
        C500260Jjc.LJJLIIIJILLIZJL(new AwS559S0100000_15(this, 1085));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r4 = this;
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAppContext> r0 = com.bytedance.android.livesdkapi.host.IHostAppContext.class
            X.006A r3 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostAppContext r3 = (com.bytedance.android.livesdkapi.host.IHostAppContext) r3
            X.0aa7 r0 = r4.LLJJIJI
            r2 = 0
            if (r0 == 0) goto L53
            android.view.View r1 = r0.LJIIL
            android.content.Context r0 = r0.LIZJ
            if (r0 == 0) goto L54
            X.19EG r0 = X.C1388190mED.LIZIZ(r0)
        L17:
            X.0Q7z r1 = r3.getScope(r1, r0)
            if (r1 == 0) goto L47
            androidx.lifecycle.MutableLiveData<com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel> r0 = r4.LLJZIJLIL
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel r0 = (com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel) r0
            if (r0 == 0) goto L2a
            r0.eB1(r1)
        L2a:
            com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel r0 = r4.LLL
            if (r0 == 0) goto L31
            r0.eB1(r1)
        L31:
            java.lang.String r0 = ""
            r4.LJIIJJI(r0)
            androidx.lifecycle.MutableLiveData<com.bytedance.android.live.liveinteract.multiguestv3.main.theme.MultiGuestThemeViewModel> r0 = r4.LLJZIJLIL
            r0.postValue(r2)
            r4.LLL = r2
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility.class
            X.C1555540qa8.LJI(r1, r0)
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility.class
            X.C1555540qa8.LJI(r1, r0)
        L47:
            X.0aVw r1 = r4.LLIZLLLIL
            if (r1 == 0) goto L52
            X.0aXS r0 = X.EnumC938840aXS.DIVIDER_TYPE_NORMAL
            int r0 = r0.type
            r1.LJJLIIIJILLIZJL(r0)
        L52:
            return
        L53:
            r1 = r2
        L54:
            r0 = r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939600aYg.LIZLLL():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939600aYg.LJ():void");
    }

    public final String LJFF() {
        PosIdentity next;
        String strLJJIJIL;
        String str;
        Iterator<PosIdentity> it2 = this.LLJJIII.iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (next.type != 1);
        PosIdentity posIdentity = next;
        if (posIdentity != null && (str = posIdentity.value) != null) {
            return str;
        }
        C919770a2h c919770a2h = this.LLJJIJIL;
        return (c919770a2h == null || (strLJJIJIL = c919770a2h.LJJIJIL()) == null) ? "" : strLJJIJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJI() {
        /*
            r6 = this;
            java.util.List<tikcast.linkmic.common.PosIdentity> r0 = r6.LLJJIII
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L8:
            boolean r0 = r3.hasNext()
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L5b
            java.lang.Object r2 = r3.next()
            r1 = r2
            tikcast.linkmic.common.PosIdentity r1 = (tikcast.linkmic.common.PosIdentity) r1
            java.lang.String r0 = r6.LLJJI
            boolean r0 = r1.LIZJ(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L8
            if (r2 == 0) goto L5b
            r3 = 1
        L24:
            X.0a2h r0 = r6.LLJJIJIL
            if (r0 == 0) goto L59
            boolean r0 = r0.LJIIIZ()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L30:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L55
            X.0a2h r2 = r6.LLJJIJIL
            if (r2 == 0) goto L4e
            java.lang.String r1 = r2.LJJIJIL()
            if (r1 != 0) goto L42
            java.lang.String r1 = ""
        L42:
            X.0a2l r0 = X.AbstractC919790a2j.LJIIJJI
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r0 = r2.LJIIJJI(r0, r1)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L4e:
            boolean r0 = X.C500260Jjc.LJJIFFI(r4)
            if (r0 == 0) goto L55
        L54:
            return r5
        L55:
            if (r3 != 0) goto L54
            r5 = 0
            return r5
        L59:
            r0 = r4
            goto L30
        L5b:
            r3 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939600aYg.LJI():boolean");
    }

    public final void LJII() {
        LJIIIZ("hide empty view");
        View view = this.LLJJLIIIJLLLLLLLZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = this.LLJJJJLIIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLJL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        View view4 = this.LLJJL;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
    }

    public final void LJIJ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer numLIZ;
        C15P4 c15p4 = this.LLJLILLLLZIIL;
        ViewGroup.LayoutParams layoutParams = c15p4 != null ? c15p4.getLayoutParams() : null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null || (numLIZ = C931810aM7.LIZ(null)) == null) {
            return;
        }
        int iLIZ = C439101nJ.LIZ(numLIZ.intValue());
        marginLayoutParams.setMarginStart(iLIZ);
        marginLayoutParams.setMarginEnd(iLIZ);
        C15P4 c15p42 = this.LLJLILLLLZIIL;
        if (c15p42 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c15p42);
            c15p42.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0aYj] */
    public C939600aYg(int i) {
        CopyOnWriteArrayList<AbstractC940410aZz> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        ConcurrentHashMap<String, AbstractC940410aZz> concurrentHashMap = new ConcurrentHashMap<>();
        ConcurrentHashMap<Integer, AbstractC940410aZz> concurrentHashMap2 = new ConcurrentHashMap<>();
        HashMap<String, Boolean> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        HashMap<String, Integer> map3 = new HashMap<>();
        HashMap<String, Long> map4 = new HashMap<>();
        this.LL = copyOnWriteArrayList;
        this.LLILLJJLI = concurrentHashMap;
        this.LLILLL = concurrentHashMap2;
        this.LLILZ = map;
        this.LLILZIL = map2;
        this.LLILZLL = map3;
        this.LLIZ = map4;
        this.LLIZLLLIL = null;
        this.LLJ = 1;
        this.LLJI = -1;
        this.LLJIJIL = new LinkedHashMap();
        this.LLJILJIL = System.currentTimeMillis();
        this.LLJILLL = new LinkedHashMap();
        this.LLJJIII = new ArrayList();
        this.LLJJJ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(450));
        this.LLJJJIL = EnumC918990a1R.NORMAL;
        this.LLJJJJ = EnumC945310aht.COMMON_FEED;
        this.LLJLLIL = new HashMap<>();
        this.LLJZIJLIL = new MutableLiveData<>();
        this.LLLF = "";
        this.LLLFFI = new InterfaceC958970b3v() { // from class: X.0aYj
            @Override // X.InterfaceC958970b3v
            public final void LIZJ(int i2, List list) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJJI() {
            }

            @Override // X.InterfaceC958970b3v
            public final boolean LJJJIL() {
                return true;
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIIIL(Map map5) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i2) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJJJ() {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLLL(List list, boolean z) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLIIIIL(C2180891AWx c2180891AWx, int i2) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLJ(LinkUser linkUser) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJIJL(C2180891AWx c2180891AWx) {
                String str;
                C935650aSJ state;
                if (this.LL.LLJZ) {
                    C939600aYg c939600aYg = this.LL;
                    MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = c939600aYg.LLL;
                    if (multiGuestSharedBgGuestViewModel != null && (state = multiGuestSharedBgGuestViewModel.getState()) != null) {
                        str = state.LLILZ;
                    } else {
                        str = null;
                    }
                    c939600aYg.LJIIJJI(str);
                }
            }
        };
        this.LLLFZ = C930540aK4.LJJIJIL(AFwS203S0000000_15.get$arr$(451));
    }

    public static final void LJIIIZ(String str) {
        C20441214yg.LIZIZ("MultiGuestV3FeedMaskWindowHandler", str);
    }

    public final void LIZIZ(EnumC918830a1B enumC918830a1B) {
        int i = C917230Zyb.LIZJ[enumC918830a1B.ordinal()];
        if (i != 1) {
            if (i == 2) {
                CopyOnWriteArrayList<AbstractC940410aZz> copyOnWriteArrayList = this.LL;
                ArrayList arrayList = new ArrayList();
                for (AbstractC940410aZz abstractC940410aZz : copyOnWriteArrayList) {
                    if (abstractC940410aZz.getClass().isAssignableFrom(C939800aZ0.class)) {
                        arrayList.add(abstractC940410aZz);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof C939800aZ0) {
                        arrayList2.add(obj);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    LIZ((C939800aZ0) it2.next(), EnumC918830a1B.CANNOT_APPLY);
                }
                return;
            }
            throw new C1954807lC();
        }
        CopyOnWriteArrayList<AbstractC940410aZz> copyOnWriteArrayList2 = this.LL;
        ArrayList arrayList3 = new ArrayList();
        for (AbstractC940410aZz abstractC940410aZz2 : copyOnWriteArrayList2) {
            if (abstractC940410aZz2.getClass().isAssignableFrom(C939800aZ0.class)) {
                arrayList3.add(abstractC940410aZz2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (obj2 instanceof C939800aZ0) {
                arrayList4.add(obj2);
            }
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            LIZ((C939800aZ0) it3.next(), EnumC918830a1B.CAN_APPLY);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939600aYg.LJIIJJI(java.lang.String):void");
    }

    @Override // X.InterfaceC940380aZw
    public final void LJIIL(InterfaceC940230aZh interfaceC940230aZh) {
        this.LLJLLL = interfaceC940230aZh;
    }

    public final void LJIILIIL(InterfaceC937820aVo interfaceC937820aVo) {
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        View view;
        ViewGroup.LayoutParams layoutParams2;
        View view2;
        ViewGroup.LayoutParams layoutParams3;
        FrameLayout.LayoutParams layoutParams4;
        View view3;
        FrameLayout.LayoutParams layoutParams5;
        View view4;
        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel;
        C935650aSJ state;
        SeiAppData seiAppData = this.LLJLIL;
        if (seiAppData != null && seiAppData.LJIILLIIL()) {
            if ((this.LLJZ && (multiGuestSharedBgGuestViewModel = this.LLL) != null && (state = multiGuestSharedBgGuestViewModel.getState()) != null && state.LL) || (frameLayout = this.LLJJIJIIJIL) == null) {
                return;
            }
            Rect containerActualRange = interfaceC937820aVo.getContainerActualRange();
            if (frameLayout.getWidth() > containerActualRange.right - containerActualRange.left) {
                View view5 = this.LLJJLIIIJLLLLLLLZ;
                ViewGroup.LayoutParams layoutParams6 = null;
                if (view5 != null) {
                    layoutParams3 = view5.getLayoutParams();
                } else {
                    layoutParams3 = null;
                }
                if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams5 = (FrameLayout.LayoutParams) layoutParams3) != null) {
                    if (LiveCardOverdrawOptSetting.INSTANCE.enableOverdrawOptForMultiGuest() && (view4 = this.LLJJLIIIJLLLLLLLZ) != null && view4.getVisibility() == 0 && layoutParams5.topMargin == containerActualRange.top && layoutParams5.height == containerActualRange.height() && layoutParams5.width == containerActualRange.left) {
                        C20441214yg.LJIIIZ("live_overdraw_opt", "showEmptyView but mLeftEmptyView is not changed");
                    } else {
                        layoutParams5.topMargin = containerActualRange.top;
                        layoutParams5.height = containerActualRange.height();
                        layoutParams5.width = containerActualRange.left;
                        View view6 = this.LLJJLIIIJLLLLLLLZ;
                        if (view6 != null) {
                            C786410Ut5.W5(view6, layoutParams5);
                        }
                        View view7 = this.LLJJLIIIJLLLLLLLZ;
                        if (view7 != null) {
                            C786410Ut5.LJLLLLLL(0, view7);
                        }
                    }
                }
                View view8 = this.LLJL;
                if (view8 != null) {
                    layoutParams6 = view8.getLayoutParams();
                }
                if ((layoutParams6 instanceof FrameLayout.LayoutParams) && (layoutParams4 = (FrameLayout.LayoutParams) layoutParams6) != null) {
                    int width = frameLayout.getWidth() - containerActualRange.right;
                    if (LiveCardOverdrawOptSetting.INSTANCE.enableOverdrawOptForMultiGuest() && (view3 = this.LLJL) != null && view3.getVisibility() == 0 && layoutParams4.topMargin == containerActualRange.top && layoutParams4.height == containerActualRange.height() && layoutParams4.width == width) {
                        C20441214yg.LJIIIZ("live_overdraw_opt", "showEmptyView but mRightEmptyView is not changed");
                    } else {
                        layoutParams4.topMargin = containerActualRange.top;
                        layoutParams4.height = containerActualRange.height();
                        layoutParams4.width = width;
                        View view9 = this.LLJL;
                        if (view9 != null) {
                            C786410Ut5.W5(view9, layoutParams4);
                        }
                        View view10 = this.LLJL;
                        if (view10 != null) {
                            C786410Ut5.LJLLLLLL(0, view10);
                        }
                    }
                }
            }
            View view11 = this.LLJJJJLIIL;
            if (view11 != null && (layoutParams2 = view11.getLayoutParams()) != null) {
                if (LiveCardOverdrawOptSetting.INSTANCE.enableOverdrawOptForMultiGuest() && layoutParams2.height == containerActualRange.top && (view2 = this.LLJJJJLIIL) != null && view2.getVisibility() == 0) {
                    C20441214yg.LJIIIZ("live_overdraw_opt", "showEmptyView but mTopEmptyView is not changed");
                } else {
                    layoutParams2.height = containerActualRange.top;
                    View view12 = this.LLJJJJLIIL;
                    if (view12 != null) {
                        C786410Ut5.W5(view12, layoutParams2);
                    }
                    View view13 = this.LLJJJJLIIL;
                    if (view13 != null) {
                        C786410Ut5.LJLLLLLL(0, view13);
                    }
                }
            }
            View view14 = this.LLJJL;
            if (view14 != null && (layoutParams = view14.getLayoutParams()) != null) {
                int height = frameLayout.getHeight() - containerActualRange.bottom;
                if (LiveCardOverdrawOptSetting.INSTANCE.enableOverdrawOptForMultiGuest() && layoutParams.height == height && (view = this.LLJJL) != null && view.getVisibility() == 0) {
                    C20441214yg.LJIIIZ("live_overdraw_opt", "showEmptyView but mBtmEmptyView is not changed");
                } else {
                    layoutParams.height = height;
                    View view15 = this.LLJJL;
                    if (view15 != null) {
                        C786410Ut5.W5(view15, layoutParams);
                    }
                    View view16 = this.LLJJL;
                    if (view16 != null) {
                        C786410Ut5.LJLLLLLL(0, view16);
                    }
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("empty view show: params=");
            sbLIZ.append(containerActualRange);
            sbLIZ.append(' ');
            sbLIZ.append(frameLayout.getWidth());
            sbLIZ.append(' ');
            sbLIZ.append(frameLayout.getHeight());
            sbLIZ.append(' ');
            sbLIZ.append(C14KS.LJFF());
            sbLIZ.append(' ');
            sbLIZ.append(C14KS.LIZLLL());
            LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LJIIZILJ(SeiTextHeaderExtra seiTextHeaderExtra) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkIfInTextHeader playInfo:");
        sbLIZ.append(seiTextHeaderExtra);
        C20441214yg.LIZIZ("MultiGuestV3FeedMaskWindowHandler", C2188811AlT.LIZIZ(sbLIZ));
        if (seiTextHeaderExtra == null || (str = seiTextHeaderExtra.font) == null) {
            str = "";
        }
        this.LLJLL = seiTextHeaderExtra;
        if (seiTextHeaderExtra != null && str.length() != 0 && this.LLJJJJ == EnumC945310aht.COMMON_FEED) {
            C15P4 c15p4 = this.LLJLILLLLZIIL;
            if (c15p4 != null) {
                C500260Jjc.LJLJLJ(c15p4, true);
            }
            C15P4 c15p42 = this.LLJLILLLLZIIL;
            if (c15p42 != null) {
                c15p42.LJIIIIZZ(C972080bP4.LJII(seiTextHeaderExtra));
            }
            C19487311Lz.LIZJ(C20424314vx.LIZ(str), (C11NJ) this.LLJJJ.getValue(), new AfS151S0200000_15(this, seiTextHeaderExtra, 65), new C09JN() { // from class: X.00LG
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("MultiGuestV3FeedMaskWindowHandler@ca0c.updateTextHeader$2");
                    C1C7U.LIZIZ("MultiGuestV3FeedMaskWindowHandler@ca0c.updateTextHeader$2");
                }
            }, 24);
            return;
        }
        C15P4 c15p43 = this.LLJLILLLLZIIL;
        if (c15p43 == null) {
            return;
        }
        C439101nJ.LJI(c15p43);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    @Override // X.InterfaceC940380aZw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZZIII(com.bytedance.android.livesdk.sei.LinkMicSei r22) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939600aYg.LJJZZIII(com.bytedance.android.livesdk.sei.LinkMicSei):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0352  */
    @Override // X.InterfaceC940380aZw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJJJJIL(com.bytedance.android.livesdk.sei.SeiAppData r12) {
        /*
            Method dump skipped, instruction units count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939600aYg.LLJJJJJIL(com.bytedance.android.livesdk.sei.SeiAppData):void");
    }

    @Override // X.InterfaceC940380aZw
    public final void LLLLJI(InterfaceC940430aa1 interfaceC940430aa1) {
        SeiAppData seiAppData;
        C20441214yg.LIZIZ("MultiGuestV3FeedMaskWindowHandler", "MultiGuestV3FeedMaskWindowHandler, onSeiAppData");
        if ((interfaceC940430aa1 instanceof SeiAppData) && (seiAppData = (SeiAppData) interfaceC940430aa1) != null) {
            LLJJJJJIL(seiAppData);
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
        Boolean boolValueOf;
        if (interfaceC937820aVo.getLayoutName() == null) {
            return;
        }
        String layoutName = interfaceC937820aVo.getLayoutName();
        if (layoutName != null) {
            boolValueOf = Boolean.valueOf(C916560ZxW.LIZJ(layoutName));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            return;
        }
        String layoutName2 = interfaceC937820aVo.getLayoutName();
        if (layoutName2 == null) {
            layoutName2 = "NORMAL";
        }
        this.LLJJJIL = EnumC918990a1R.valueOf(layoutName2);
    }

    @Override // X.InterfaceC940380aZw
    public final void LLLLLJIL(C945320ahu c945320ahu) {
        InterfaceC938500aWu interfaceC938500aWu = (InterfaceC938500aWu) this.LLLFZ.getValue();
        if (interfaceC938500aWu != null) {
            interfaceC938500aWu.LIZ(c945320ahu, new C939620aYi(this, c945320ahu));
        }
    }

    public static void LIZ(C939800aZ0 c939800aZ0, EnumC918830a1B enumC918830a1B) {
        int i = C917230Zyb.LIZJ[enumC918830a1B.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c939800aZ0.LJIIIZ();
                return;
            }
            throw new C1954807lC();
        }
        c939800aZ0.LJIIIIZZ();
    }

    public final void LJIILLIIL(InterfaceC937840aVq interfaceC937840aVq, C939740aYu c939740aYu) {
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        Boolean boolValueOf;
        Context context;
        Rect containerActualRange;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ2;
        Context context2;
        String str = C939550aYb.LIZJ;
        if (str != null && CastIntegerProtector.parseInt(str) == 1) {
            InterfaceC937900aVw interfaceC937900aVw = this.LLIZLLLIL;
            Rect containerActualRange2 = null;
            if (interfaceC937900aVw != null) {
                interfaceC937820aVoLJJJJZ = interfaceC937900aVw.LJJJJZ();
            } else {
                interfaceC937820aVoLJJJJZ = null;
            }
            C416040GTa c416040GTa = (C416040GTa) ((LinkedHashMap) this.LLJILLL).get(Integer.valueOf(interfaceC937840aVq.LJIIIIZZ()));
            if (c416040GTa == null) {
                C940490aa7 c940490aa7 = this.LLJJIJI;
                if (c940490aa7 != null && (context2 = c940490aa7.LIZJ) != null) {
                    c416040GTa = new C416040GTa(context2);
                    this.LLJILLL.put(Integer.valueOf(interfaceC937840aVq.LJIIIIZZ()), c416040GTa);
                } else {
                    c416040GTa = null;
                }
            } else {
                this.LLJILLL.put(Integer.valueOf(interfaceC937840aVq.LJIIIIZZ()), c416040GTa);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) interfaceC937840aVq.LJJIIJ().getLayoutParams();
            Rect rect = new Rect();
            int i = marginLayoutParams.leftMargin;
            rect.left = i;
            int i2 = marginLayoutParams.topMargin;
            rect.top = i2;
            rect.right = i + marginLayoutParams.width;
            rect.bottom = i2 + marginLayoutParams.height;
            InterfaceC937900aVw interfaceC937900aVw2 = this.LLIZLLLIL;
            if (interfaceC937900aVw2 != null && (interfaceC937820aVoLJJJJZ2 = interfaceC937900aVw2.LJJJJZ()) != null) {
                boolValueOf = Boolean.valueOf(interfaceC937820aVoLJJJJZ2.LJZI());
            } else {
                boolValueOf = null;
            }
            boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
            if (c416040GTa != null) {
                C940490aa7 c940490aa72 = this.LLJJIJI;
                if (c940490aa72 != null) {
                    context = c940490aa72.LIZJ;
                } else {
                    context = null;
                }
                if (interfaceC937820aVoLJJJJZ != null) {
                    containerActualRange = interfaceC937820aVoLJJJJZ.getContainerActualRange();
                } else {
                    containerActualRange = null;
                }
                FrameLayout.LayoutParams layoutParamsLIZ = C939550aYb.LIZ(context, rect, containerActualRange, zLJJJI);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c416040GTa);
                c416040GTa.setLayoutParams(layoutParamsLIZ);
                c416040GTa.setCornerRadius(interfaceC937840aVq.getCornerRadius());
            }
            c939740aYu.LLLI = c416040GTa;
            if (interfaceC937820aVoLJJJJZ != null) {
                interfaceC937820aVoLJJJJZ.LJIILIIL(c416040GTa, false, true);
            }
            if (c416040GTa != null) {
                C439101nJ.LJI(c416040GTa);
            }
            C1AZW c1azw = C1AZW.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BorderViewV2 rect = ");
            sbLIZ.append(rect);
            sbLIZ.append(" window = ");
            sbLIZ.append(interfaceC937840aVq.LJIIIIZZ());
            sbLIZ.append(" containerRect = ");
            if (interfaceC937820aVoLJJJJZ != null) {
                containerActualRange2 = interfaceC937820aVoLJJJJZ.getContainerActualRange();
            }
            sbLIZ.append(containerActualRange2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1azw.getClass();
            C1AZW.LIZ("MultiGuestV3FeedMaskWindowHandler", strLIZIZ, null, null);
        }
    }

    @Override // X.InterfaceC940380aZw
    public final void LLIIJI(FrameLayout frameLayout, Pair<Integer, Integer> pair) {
        String str;
        String str2;
        Context context;
        boolean z;
        Context context2;
        ViewParent parent;
        int iIntValue;
        ViewParent parent2;
        float fFloatValue;
        C935650aSJ state;
        C935650aSJ state2;
        InterfaceC940230aZh interfaceC940230aZh;
        if (!Intrinsics.LJFF(this.LLJJIJIIJIL, frameLayout) && (interfaceC940230aZh = this.LLJLLL) != null) {
            interfaceC940230aZh.LIZIZ();
        }
        this.LLJJIJIIJIL = frameLayout;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLiveFeedContainerSet sharedBgGuestViewModel?.getState()?.imageFilePath:");
        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel = this.LLL;
        if (multiGuestSharedBgGuestViewModel != null && (state2 = multiGuestSharedBgGuestViewModel.getState()) != null) {
            str = state2.LLILZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("shared_bg", C2188811AlT.LIZIZ(sbLIZ));
        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel2 = this.LLL;
        if (multiGuestSharedBgGuestViewModel2 != null && (state = multiGuestSharedBgGuestViewModel2.getState()) != null) {
            str2 = state.LLILZ;
        } else {
            str2 = null;
        }
        LJIIJJI(str2);
        if (this.LLJJLIIIJLLLLLLLZ != null && this.LLJL != null && this.LLJJJJLIIL != null && this.LLJJL != null) {
            return;
        }
        InterfaceC937900aVw interfaceC937900aVw = this.LLIZLLLIL;
        if (interfaceC937900aVw != null) {
            Float f = (Float) DataChannelGlobal.LLILZ.gg0(TopLiveSkylightTransYChannel.class);
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            interfaceC937900aVw.LJJJJLI(frameLayout, null, pair, "multi_geust_feed", null, fFloatValue);
        }
        C940490aa7 c940490aa7 = this.LLJJIJI;
        if (c940490aa7 != null) {
            context = c940490aa7.LIZJ;
        } else {
            context = null;
        }
        FrameLayout frameLayout2 = this.LLJJIJIIJIL;
        SeiAppData seiAppData = this.LLJLIL;
        if (seiAppData != null && seiAppData.LJIILLIIL()) {
            z = true;
        } else {
            z = false;
        }
        if (z && ((context != null || (frameLayout2 != null && (context = frameLayout2.getContext()) != null)) && frameLayout2 != null)) {
            View view = this.LLJJLIIIJLLLLLLLZ;
            if (view != null) {
                parent2 = view.getParent();
            } else {
                parent2 = null;
            }
            if (!Intrinsics.LJFF(parent2, frameLayout2)) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
                layoutParams.gravity = 8388659;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, 0);
                layoutParams2.gravity = 48;
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(0, 0);
                layoutParams3.gravity = 8388661;
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, 0);
                layoutParams4.gravity = 80;
                View view2 = this.LLJJLIIIJLLLLLLLZ;
                if (view2 != null) {
                    C930540aK4.LJJIJL(view2);
                }
                View view3 = new View(context);
                view3.setId(R.id.mkd);
                C786410Ut5.LJLLLLLL(8, view3);
                view3.setBackgroundColor(-16777216);
                frameLayout2.addView(view3, layoutParams);
                this.LLJJLIIIJLLLLLLLZ = view3;
                View view4 = this.LLJJJJLIIL;
                if (view4 != null) {
                    C930540aK4.LJJIJL(view4);
                }
                View view5 = new View(context);
                view5.setId(R.id.ybk);
                C786410Ut5.LJLLLLLL(8, view5);
                view5.setBackgroundColor(-16777216);
                frameLayout2.addView(view5, layoutParams2);
                this.LLJJJJLIIL = view5;
                View view6 = this.LLJL;
                if (view6 != null) {
                    C930540aK4.LJJIJL(view6);
                }
                View view7 = new View(context);
                view7.setId(R.id.tln);
                C786410Ut5.LJLLLLLL(8, view7);
                view7.setBackgroundColor(-16777216);
                frameLayout2.addView(view7, layoutParams3);
                this.LLJL = view7;
                View view8 = this.LLJJL;
                if (view8 != null) {
                    C930540aK4.LJJIJL(view8);
                }
                View view9 = new View(context);
                view9.setId(R.id.cet);
                C786410Ut5.LJLLLLLL(8, view9);
                view9.setBackgroundColor(-16777216);
                frameLayout2.addView(view9, layoutParams4);
                this.LLJJL = view9;
            }
        }
        C940490aa7 c940490aa72 = this.LLJJIJI;
        if (c940490aa72 != null) {
            context2 = c940490aa72.LIZJ;
        } else {
            context2 = null;
        }
        FrameLayout frameLayout3 = this.LLJJIJIIJIL;
        if (C931810aM7.LIZIZ()) {
            SeiAppData seiAppData2 = this.LLJLIL;
            if (seiAppData2 != null && seiAppData2.LJIILLIIL()) {
                if ((context2 == null && (frameLayout3 == null || (context2 = frameLayout3.getContext()) == null)) || frameLayout3 == null) {
                    return;
                }
                C15P4 c15p4 = this.LLJLILLLLZIIL;
                if (c15p4 != null) {
                    parent = c15p4.getParent();
                } else {
                    parent = null;
                }
                if (Intrinsics.LJFF(parent, frameLayout3)) {
                    LJIJ();
                    LJIIIZ("initTextHeaderView return as parent is the same as container");
                    return;
                }
                LJIIIZ("initTextHeaderView");
                C15P4 c15p42 = this.LLJLILLLLZIIL;
                if (c15p42 != null) {
                    C930540aK4.LJJIJL(c15p42);
                }
                C15P4 c15p43 = (C15P4) frameLayout3.findViewById(R.id.xnm);
                this.LLJLILLLLZIIL = c15p43;
                if (c15p43 == null) {
                    C15P4 c15p44 = new C15P4(context2, null);
                    c15p44.LJIILIIL();
                    c15p44.setGravity(17);
                    Integer numLIZ = C931810aM7.LIZ(null);
                    if (numLIZ != null) {
                        iIntValue = numLIZ.intValue();
                    } else {
                        iIntValue = 60;
                    }
                    int iLIZ = C439101nJ.LIZ(iIntValue);
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams5.gravity = 49;
                    layoutParams5.topMargin = C439101nJ.LIZ(86);
                    layoutParams5.setMarginStart(iLIZ);
                    layoutParams5.setMarginEnd(iLIZ);
                    c15p44.setId(R.id.xnm);
                    int visibility = c15p44.getVisibility();
                    c15p44.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, c15p44);
                    frameLayout3.addView(c15p44, layoutParams5);
                    this.LLJLILLLLZIIL = c15p44;
                }
                LJIJ();
                C15P4 c15p45 = this.LLJLILLLLZIIL;
                if (c15p45 != null) {
                    c15p45.bringToFront();
                }
                LJIIZILJ(this.LLJLL);
                return;
            }
            LJIIIZ("initTextHeaderView isMultiGuestScene is false");
        }
    }

    @Override // X.InterfaceC958970b3v
    public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLayoutSwitch, layout ");
        sbLIZ.append(interfaceC937820aVo);
        LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (interfaceC937820aVo.getLayoutName() == null) {
        }
        String layoutName = interfaceC937820aVo.getLayoutName();
        if (layoutName != null) {
            boolValueOf = Boolean.valueOf(C916560ZxW.LIZJ(layoutName));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            return;
        }
        String layoutName2 = interfaceC937820aVo.getLayoutName();
        if (layoutName2 == null) {
            layoutName2 = "NORMAL";
        }
        EnumC918990a1R enumC918990a1RValueOf = EnumC918990a1R.valueOf(layoutName2);
        this.LLJJJIL = enumC918990a1RValueOf;
        switch (C917230Zyb.LIZ[enumC918990a1RValueOf.ordinal()]) {
            case 1:
                LJIILIIL(interfaceC937820aVo);
                break;
            case 2:
                LJIILIIL(interfaceC937820aVo);
                break;
            case 3:
            case 4:
                LJII();
                break;
            case 5:
            case 6:
            case 7:
                if (this.LLJJIJIIJIL != null) {
                    if (interfaceC937820aVo.getAllLayoutWindows().size() == 1) {
                        LJII();
                    } else {
                        LJIILIIL(interfaceC937820aVo);
                    }
                }
                break;
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJIILIIL(interfaceC937820aVo);
                break;
            default:
                this.LLJJJIL = EnumC918990a1R.NORMAL;
                break;
        }
    }

    public static EnumC918830a1B LJIIJ(C939600aYg c939600aYg, int i, Integer num, int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            i = c939600aYg.LLJ;
        }
        if ((i2 & 2) != 0) {
            num = Integer.valueOf(c939600aYg.LLJI);
        }
        c939600aYg.getClass();
        C940490aa7 c940490aa7 = c939600aYg.LLJJIJI;
        if (c940490aa7 != null) {
            i3 = c940490aa7.LJIIIIZZ;
        } else {
            i3 = 0;
        }
        return C917280Zyg.LIZ(i, i3, num);
    }

    public final void LJIIIIZZ(C940490aa7 c940490aa7, InterfaceC937900aVw interfaceC937900aVw, C919770a2h c919770a2h, InterfaceC958990b3x interfaceC958990b3x) {
        EnumC940090aZT enumC940090aZT;
        EnumC945310aht enumC945310aht;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init, ");
        sbLIZ.append(c940490aa7);
        LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (c940490aa7 != null) {
            enumC940090aZT = c940490aa7.LJFF;
        } else {
            enumC940090aZT = null;
        }
        if (enumC940090aZT == EnumC940090aZT.SEARCH) {
            enumC945310aht = EnumC945310aht.SEARCH;
        } else {
            enumC945310aht = EnumC945310aht.COMMON_FEED;
        }
        this.LLJJJJ = enumC945310aht;
        this.LLJJIJI = c940490aa7;
        this.LLIZLLLIL = interfaceC937900aVw;
        this.LLJJIJIL = c919770a2h;
        if (interfaceC937900aVw != null) {
            interfaceC937900aVw.LJJJJJL(this.LLLFFI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0164  */
    @Override // X.InterfaceC958970b3v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(X.InterfaceC937840aVq r12, X.EnumC918810a19 r13, X.EnumC918810a19 r14, X.C938510aWv r15) {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939600aYg.LJIILL(X.0aVq, X.0a19, X.0a19, X.0aWv):void");
    }

    public static final void LJIILJJIL(C939600aYg c939600aYg, boolean z, int i, InterfaceC937840aVq interfaceC937840aVq, boolean z2) {
        EnumC940090aZT enumC940090aZT;
        int size;
        long jLongValue;
        List<LinkUser> listLJIIIZ;
        List<LinkUser> listLJIIIZ2;
        String strLJ = interfaceC937840aVq.LJ();
        String str = "";
        if (strLJ == null) {
            strLJ = "";
        }
        InterfaceC937900aVw interfaceC937900aVw = c939600aYg.LLIZLLLIL;
        C923370a8V c923370a8V = new C923370a8V(c939600aYg);
        boolean zLJFF = Intrinsics.LJFF(interfaceC937840aVq.LJ(), c939600aYg.LLJJI);
        C940490aa7 c940490aa7 = c939600aYg.LLJJIJI;
        AbstractC940410aZz abstractC940410aZz = null;
        if (c940490aa7 != null) {
            enumC940090aZT = c940490aa7.LJFF;
        } else {
            enumC940090aZT = null;
        }
        C939740aYu c939740aYu = new C939740aYu(strLJ, interfaceC937900aVw, c923370a8V, zLJFF, enumC940090aZT);
        C786410Ut5.LJJJJIZL(interfaceC937840aVq.LJJIIJ());
        c939740aYu.LJII(interfaceC937840aVq.LJJIIJ());
        c939740aYu.LLJJIJI = (LinkPlayerInfo) ((LinkedHashMap) c939600aYg.LLJIJIL).get(interfaceC937840aVq.LJ());
        c939740aYu.LLJJIJIIJIL = c939600aYg.LLJJJIL;
        c939740aYu.LJIJJLI(interfaceC937840aVq.getCornerRadius());
        c939740aYu.LJIILLIIL(c939600aYg.LLJ, c939600aYg.LLJJJIL, z2);
        InterfaceC937900aVw interfaceC937900aVw2 = c939600aYg.LLIZLLLIL;
        int size2 = 0;
        if (interfaceC937900aVw2 != null && (listLJIIIZ2 = interfaceC937900aVw2.LJIIIZ()) != null) {
            size = listLJIIIZ2.size();
        } else {
            size = 0;
        }
        c939740aYu.LJJIJ(z, size, c939600aYg.LLIZLLLIL);
        InterfaceC937900aVw interfaceC937900aVw3 = c939600aYg.LLIZLLLIL;
        if (interfaceC937900aVw3 != null && (listLJIIIZ = interfaceC937900aVw3.LJIIIZ()) != null) {
            size2 = listLJIIIZ.size();
        }
        c939740aYu.LJJII(size2, z);
        HashMap<String, Long> map = c939600aYg.LLIZ;
        String strLJ2 = interfaceC937840aVq.LJ();
        if (strLJ2 == null) {
            strLJ2 = "";
        }
        Long l = map.get(strLJ2);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c939740aYu.LJIILL(jLongValue, true);
        if (Fix7322151019FeedPauseMaskSetting.INSTANCE.enable()) {
            HashMap<String, Integer> map2 = c939600aYg.LLILZLL;
            String strLJ3 = interfaceC937840aVq.LJ();
            if (strLJ3 != null) {
                str = strLJ3;
            }
            Integer num = map2.get(str);
            if (num != null) {
                i = num.intValue();
            }
        }
        c939740aYu.changeOnlineUserState(i);
        c939740aYu.LLLJL = null;
        Iterator<AbstractC940410aZz> it2 = c939600aYg.LL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            AbstractC940410aZz next = it2.next();
            if (Intrinsics.LJFF(next.LIZ(), interfaceC937840aVq.LJ())) {
                abstractC940410aZz = next;
                break;
            }
        }
        AbstractC940410aZz abstractC940410aZz2 = abstractC940410aZz;
        if (abstractC940410aZz2 != null) {
            c939600aYg.LL.remove(abstractC940410aZz2);
            c939600aYg.LLILLJJLI.remove(abstractC940410aZz2.LIZ());
        }
        c939600aYg.LL.add(c939740aYu);
        String strLJ4 = interfaceC937840aVq.LJ();
        if (strLJ4 != null) {
            c939600aYg.LLILLJJLI.put(strLJ4, c939740aYu);
        }
        c939600aYg.LJIILLIIL(interfaceC937840aVq, c939740aYu);
    }
}

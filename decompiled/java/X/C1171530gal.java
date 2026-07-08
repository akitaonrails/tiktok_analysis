package X;

import Y.AfS142S0200000_6;
import Y.AfS148S0200000_12;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.favorites.business.collection.ChooseCollectionSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageResponse;
import com.ss.android.ugc.aweme.favorites.experiment.CollaborativeCollectionConfig;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0gal, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171530gal implements C0O2O {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final C01GW LLIZ;
    public final C1171540gam LLIZLLLIL;
    public C1171550gan LLJ;
    public String LLJI;
    public AwS419S0200000_18 LLJIJIL;
    public String LLJILJIL;

    public final AbstractC1604130rqV LIZ() {
        return (AbstractC1604130rqV) this.LLIZ.getValue();
    }

    public final void LIZIZ() {
        if (EventBus.LIZLLL().LJIIJ(this)) {
            EventBus.LIZLLL().LJJI(this);
        }
        C1171550gan c1171550gan = this.LLJ;
        if (c1171550gan != null) {
            C1BWL.LIZ().unregisterActivityLifecycleCallbacks(c1171550gan);
            this.LLJ = null;
        }
    }

    public final void LJ(final C19EG c19eg) {
        int i;
        int i2;
        boolean z;
        View viewFindViewById = c19eg.getWindow().getDecorView().findViewById(R.id.viewpager);
        if (viewFindViewById != null) {
            LIZLLL(viewFindViewById, c19eg);
            return;
        }
        if (!Intrinsics.LJFF(this.LLILLJJLI, "profile_long_press")) {
            return;
        }
        C737190Svt.LIZ.getClass();
        if (!C737190Svt.LIZ()) {
            return;
        }
        final C013C c013c = new C013C();
        final C118300cf c118300cf = new C118300cf();
        C1389910mGz c1389910mGz = new C1389910mGz(c19eg);
        c1389910mGz.LJI(R.style.y0);
        boolean z2 = false;
        c1389910mGz.LIZ.LIZIZ = 0;
        c1389910mGz.LJ(3000L);
        c1389910mGz.LIZIZ(338);
        if (!new C1171340gaS().LLILLL.LLJLILLLLZIIL(Boolean.valueOf(this.LLILLL))) {
            C1171300gaO c1171300gaO = new C1171340gaS().LLILLL;
            boolean z3 = this.LLILLL;
            if (this.LL != null) {
                z = true;
            } else {
                z = false;
            }
            c1171300gaO.u0(0L, null, true, null, null, C1171750gb7.LIZ(), z3, z).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS142S0200000_6(c013c, c118300cf, 5), new C09JN() { // from class: X.00Nz
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.showToastWithoutContentView$2");
                    C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.showToastWithoutContentView$2");
                }
            });
            c1389910mGz.LIZ.LJIIIIZZ = new AbstractViewOnClickListenerC372950Ejl() { // from class: X.0gah
                @Override // X.AbstractViewOnClickListenerC372950Ejl
                public final void LIZ(View view) {
                    int i3;
                    this.LLILZ.LIZ().LJ("FeedAddToFavoritesPopToast doClick isCacheEmpty false");
                    C1206780hVc.LIZ("click favorite toast");
                    C1206780hVc.LIZ("popup favorite collections dialog");
                    C20684815ws.LJIJI("click_collection_banner", new Pair(this.LLILZ.LLILLJJLI, "enter_from"), new Pair("click_fav_button", "enter_method"), new Pair(this.LLILZ.LL, "group_id"));
                    if (c013c.element && (i3 = c118300cf.element) > 0) {
                        this.LLILZ.LJFF(c19eg, i3, null);
                    } else {
                        C1171530gal.LJI(this.LLILZ, c19eg, null, 6);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(500L);
                }
            };
        } else {
            c1389910mGz.LIZ.LJIIIIZZ = new C1208710hYj(c19eg, this, 0);
        }
        C1206780hVc.LIZ("popup favorite toast");
        C1171960gbS c1171960gbS = new C1171960gbS(this.LL);
        CollaborativeCollectionConfig collaborativeCollectionConfigLIZJ = C1171750gb7.LIZJ();
        if (collaborativeCollectionConfigLIZJ != null && collaborativeCollectionConfigLIZJ.writingType == 1) {
            z2 = true;
            i = 2131847954;
        } else if (C294850Bh5.LIZ()) {
            i = 2131825057;
        } else {
            i = 2131834462;
        }
        c1171960gbS.LIZLLL(c1389910mGz);
        c1389910mGz.LJIIIZ(i);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LIZ.LIZLLL = 2;
        if (z2) {
            i2 = 2131845458;
        } else {
            i2 = 2131834446;
        }
        c1389910mGz.LJFF(i2);
        c1389910mGz.LIZLLL(new AwS419S0200000_18(this, c1171960gbS, 29));
        C1391850mK7.LIZIZ(c1389910mGz, "add_to_favorites_bottomwindow");
        c1389910mGz.LJIIJJI();
        C1171550gan c1171550gan = new C1171550gan(c19eg, c1171960gbS, this);
        C1BWL.LIZ().registerActivityLifecycleCallbacks(c1171550gan);
        this.LLJ = c1171550gan;
    }

    @C14EU
    public final void onCollectActionRollbackDisableEvent(C2038707yj c2038707yj) {
        AbstractC1604130rqV abstractC1604130rqVLIZ = LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedAddToFavoritesPopToast CollectActionRollbackDisableEvent: id: ");
        sbLIZ.append(c2038707yj.LIZ);
        sbLIZ.append(", action: ");
        sbLIZ.append(c2038707yj.LIZIZ);
        abstractC1604130rqVLIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
        if (c2038707yj.LIZIZ && Intrinsics.LJFF(this.LL, c2038707yj.LIZ)) {
            this.LLJILJIL = this.LL;
        }
    }

    @C14EU
    public final void onCollectAwemeEvent(AnonymousClass0345 anonymousClass0345) {
        if (anonymousClass0345.LIZIZ == 1) {
            if (Intrinsics.LJFF(anonymousClass0345.LIZ, this.LL)) {
                AwS419S0200000_18 awS419S0200000_18 = this.LLJIJIL;
                if (awS419S0200000_18 != null) {
                    awS419S0200000_18.invoke();
                }
                this.LLJI = anonymousClass0345.LIZ;
            }
            this.LLJIJIL = null;
            if (EventBus.LIZLLL().LJIIJ(this)) {
                EventBus.LIZLLL().LJJI(this);
            }
        }
    }

    @C14EU
    public final void onMutationCollectAwemeEvent(C034R c034r) {
        String str = c034r.LIZ;
        if (Intrinsics.LJFF(str, this.LL)) {
            AwS419S0200000_18 awS419S0200000_18 = this.LLJIJIL;
            if (awS419S0200000_18 != null) {
                this.LLJIJIL = null;
                awS419S0200000_18.invoke();
            }
            this.LLJI = str;
        }
    }

    public final void LIZLLL(View view, final C19EG c19eg) {
        int iLIZIZ;
        int iLIZIZ2;
        int i;
        int i2;
        boolean z;
        View decorView = c19eg.getWindow().getDecorView();
        Rect rect = new Rect();
        decorView.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view.getGlobalVisibleRect(rect2);
        if (Intrinsics.LJFF(this.LLILLJJLI, "graphic_detail")) {
            iLIZIZ = rect.bottom - rect2.bottom;
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
        } else {
            iLIZIZ = (rect.bottom - rect2.bottom) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
            iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        }
        int iLIZIZ3 = iLIZIZ + iLIZIZ2;
        if (Build.VERSION.SDK_INT >= 35) {
            iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(C303810BvX.LIZ()))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
        }
        final C013C c013c = new C013C();
        final C118300cf c118300cf = new C118300cf();
        C1389910mGz c1389910mGz = new C1389910mGz(c19eg);
        c1389910mGz.LJI(R.style.y0);
        boolean z2 = false;
        c1389910mGz.LIZ.LIZIZ = 0;
        c1389910mGz.LJ(3000L);
        c1389910mGz.LIZIZ(iLIZIZ3);
        final C013C c013c2 = new C013C();
        IFavoriteService iFavoriteService = (IFavoriteService) PluggableExtentionKt.pluggableSpi$default(IFavoriteService.class, false, false, false, 14, null);
        if (iFavoriteService != null) {
            iFavoriteService.LIZLLL();
        }
        if (!new C1171340gaS().LLILLL.LLJLILLLLZIIL(Boolean.valueOf(this.LLILLL))) {
            C1171300gaO c1171300gaO = new C1171340gaS().LLILLL;
            boolean z3 = this.LLILLL;
            if (this.LL != null) {
                z = true;
            } else {
                z = false;
            }
            c1171300gaO.u0(0L, null, true, null, null, true, z3, z).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS142S0200000_6(c013c, c118300cf, 4), new C09JN() { // from class: X.00Ny
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.showAt$2");
                    C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.showAt$2");
                }
            });
            c1389910mGz.LIZ.LJIIIIZZ = new AbstractViewOnClickListenerC372950Ejl() { // from class: X.0gag
                @Override // X.AbstractViewOnClickListenerC372950Ejl
                public final void LIZ(View view2) {
                    this.LLILZ.LIZ().LJ("FeedAddToFavoritesPopToast doClick isCacheEmpty false");
                    c013c2.element = true;
                    C1206780hVc.LIZ("click favorite toast");
                    C1206780hVc.LIZ("popup favorite collections dialog");
                    C20684815ws.LJIJI("click_collection_banner", new Pair(this.LLILZ.LLILLJJLI, "enter_from"), new Pair("click_fav_button", "enter_method"), new Pair(this.LLILZ.LL, "group_id"));
                    if (c013c.element && c118300cf.element > 0) {
                        C1171470gaf c1171470gaf = new C1171470gaf();
                        c1171470gaf.LJIILLIIL = "banner";
                        C1171530gal c1171530gal = this.LLILZ;
                        c1171470gaf.LJIIZILJ = c1171530gal.LL;
                        c1171470gaf.LIZLLL = c1171530gal.LLILLJJLI;
                        c1171470gaf.LJIILJJIL();
                        this.LLILZ.LJFF(c19eg, c118300cf.element, null);
                        return;
                    }
                    C1171530gal.LJI(this.LLILZ, c19eg, null, 6);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(500L);
                }
            };
        } else {
            c1389910mGz.LIZ.LJIIIIZZ = new C1208700hYi(this, c013c2, c19eg, 3);
        }
        C1206780hVc.LIZ("popup favorite toast");
        C1171960gbS c1171960gbS = new C1171960gbS(this.LL);
        CollaborativeCollectionConfig collaborativeCollectionConfigLIZJ = C1171750gb7.LIZJ();
        if (collaborativeCollectionConfigLIZJ != null && collaborativeCollectionConfigLIZJ.writingType == 1) {
            z2 = true;
            i = 2131847954;
        } else if (C294850Bh5.LIZ()) {
            i = 2131825057;
        } else {
            i = 2131834462;
        }
        c1171960gbS.LIZLLL(c1389910mGz);
        c1389910mGz.LIZ.LIZLLL = 2;
        if (z2) {
            i2 = 2131845458;
        } else {
            i2 = 2131834446;
        }
        c1389910mGz.LJFF(i2);
        c1389910mGz.LJIIIZ(i);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LIZLLL(new AwS419S0200000_18(this, c1171960gbS, 32));
        C1391850mK7.LIZIZ(c1389910mGz, "add_to_favorites_bottomwindow");
        c1389910mGz.LJIIJJI();
        C1171560gao c1171560gao = new C1171560gao();
        c1171560gao.LIZLLL = this.LLILLJJLI;
        c1171560gao.LJIILLIIL = "click_fav_button";
        c1171560gao.LJIIZILJ = this.LL;
        c1171560gao.LJIILJJIL();
        C1171550gan c1171550gan = new C1171550gan(c19eg, c1171960gbS, this);
        C1BWL.LIZ().registerActivityLifecycleCallbacks(c1171550gan);
        this.LLJ = c1171550gan;
    }

    public final void LJFF(final C19EG c19eg, int i, final Function1<? super Boolean, Unit> function1) {
        String str;
        String str2;
        Aweme awemeLLILZ;
        Video video;
        UrlModel cover;
        List<String> urlList;
        LIZ().LJ("FeedAddToFavoritesPopToast showChooseCollectionDialog");
        if (function1 != null) {
            str = "click_bubble_more";
        } else {
            str = "click_fav_button";
        }
        C1171570gap c1171570gap = ChooseCollectionSheetFragment.LLILZLL;
        String str3 = this.LLILLJJLI;
        InterfaceC1170630gZJ interfaceC1170630gZJ = new InterfaceC1170630gZJ() { // from class: X.0gZq
            @Override // X.InterfaceC1170630gZJ, X.InterfaceC723730SaB
            public /* bridge */ /* synthetic */ String LIZ() {
                return null;
            }

            @Override // X.InterfaceC1170630gZJ
            public void ef(boolean z, CollectionDetail collectionDetail, List<String> list, boolean z2) {
                String str4;
                AbstractC1604130rqV abstractC1604130rqVLIZ = this.LL.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FeedAddToFavoritesPopToast onItemSelect isNewCreated: ");
                sbLIZ.append(z);
                sbLIZ.append(" , collection id: ");
                sbLIZ.append(collectionDetail.id);
                abstractC1604130rqVLIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
                Function1<Boolean, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(Boolean.valueOf(z));
                }
                if (function1 != null) {
                    str4 = "click_bubble_more_add";
                } else {
                    str4 = null;
                }
                if (z && Intrinsics.LJFF(str4, "click_bubble_more_add")) {
                    str4 = "click_bubble_more_create";
                }
                this.LL.LIZJ(c19eg, !z, collectionDetail, list, z2, str4);
            }
        };
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService != null && (awemeLLILZ = iAwemeService.LLILZ(this.LL)) != null && (video = awemeLLILZ.getVideo()) != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null) {
            str2 = (String) C13LP.LJJJLZIJ(0, urlList);
        } else {
            str2 = null;
        }
        String str4 = this.LL;
        boolean z = this.LLILLL;
        c1171570gap.getClass();
        C1171570gap.LIZ(c19eg, false, null, str3, i, str2, interfaceC1170630gZJ, true, str4, z, str);
    }

    @Override // X.C0O2O
    public final void Wz(String str, boolean z, EnumC612200Nzm enumC612200Nzm) {
        if (enumC612200Nzm == EnumC612200Nzm.MUTATION && z) {
            if (Intrinsics.LJFF(str, this.LL)) {
                AwS419S0200000_18 awS419S0200000_18 = this.LLJIJIL;
                if (awS419S0200000_18 != null) {
                    awS419S0200000_18.invoke();
                }
                this.LLJI = str;
            }
            this.LLJIJIL = null;
            ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).removeSubscriber(this);
        }
    }

    @Override // X.InterfaceC612260Nzs
    public final void xt(String str, Boolean bool, EnumC612200Nzm enumC612200Nzm) {
        Wz(str, bool.booleanValue(), enumC612200Nzm);
    }

    public static void LJI(final C1171530gal c1171530gal, final C19EG c19eg, AwS553S0100000_9 awS553S0100000_9, int i) {
        boolean z;
        final String str;
        String str2;
        int i2;
        Aweme awemeLLILZ;
        Video video;
        UrlModel cover;
        List<String> urlList;
        final AwS553S0100000_9 awS553S0100000_92 = awS553S0100000_9;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        String str3 = null;
        if ((i & 4) != 0) {
            awS553S0100000_92 = null;
        }
        c1171530gal.LIZ().LJ("FeedAddToFavoritesPopToast showCreateCollectionInputDialog");
        if (z) {
            str = "click_feed_banner";
        } else {
            str = "click_co_collection_intro";
        }
        if (awS553S0100000_92 != null) {
            str2 = "click_bubble";
        } else {
            str2 = "click_fav_button";
        }
        C1170900gZk c1170900gZk = new C1170900gZk();
        c1170900gZk.LIZLLL = c1171530gal.LLILLJJLI;
        c1170900gZk.LJIIZILJ = str;
        c1170900gZk.LJIJI = str2;
        c1170900gZk.LJIILJJIL();
        FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
        if (C1171750gb7.LIZ()) {
            i2 = 2131847937;
        } else {
            i2 = 2131834456;
        }
        String string = c19eg.getString(i2);
        String string2 = c19eg.getString(R.string.sg8);
        String str4 = c1171530gal.LL;
        Boolean boolValueOf = Boolean.valueOf(c1171530gal.LLILLL);
        InterfaceC1172550gcP interfaceC1172550gcP = new InterfaceC1172550gcP() { // from class: X.0gZn
            @Override // X.InterfaceC1172550gcP
            public final void LIZIZ() {
                String str5 = awS553S0100000_92 != null ? "bubble_return" : "fav_button_return";
                C1170920gZm c1170920gZm = new C1170920gZm();
                c1170920gZm.LJIIZILJ = str5;
                c1170920gZm.LJIILLIIL = this.LIZ.LL;
                c1170920gZm.LJIILJJIL();
            }

            @Override // X.InterfaceC1172550gcP
            public final void LIZ(final int i3, final String str5, final boolean z2, final boolean z3, final List list) {
                AbstractC1604130rqV abstractC1604130rqVLIZ = this.LIZ.LIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FeedAddToFavoritesPopToast onInputConfirm s: ");
                sbLIZ.append(str5);
                sbLIZ.append(" , status: ");
                sbLIZ.append(i3);
                abstractC1604130rqVLIZ.LJ(C2188811AlT.LIZIZ(sbLIZ));
                Function0<Unit> function0 = awS553S0100000_92;
                if (function0 != null) {
                    function0.invoke();
                }
                C11O8 c11o8LJJJLZIJ = new C1171340gaS().LLILLL.LLZLLIL(new CollectionManageRequest(1, null, str5, null, null, null, null, null, Integer.valueOf(i3), list, null, null), this.LIZ.LLILLL).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                final Function0<Unit> function02 = awS553S0100000_92;
                final C1171530gal c1171530gal2 = this.LIZ;
                final String str6 = str;
                final C19EG c19eg2 = c19eg;
                c11o8LJJJLZIJ.LJJLL(new C09JN() { // from class: X.0gaP
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        String str7;
                        String str8;
                        C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.showCreateCollectionInputDialog$1$onInputConfirm$ignore$1");
                        CollectionManageResponse collectionManageResponse = (CollectionManageResponse) obj;
                        C1609306Rv c1609306Rv = C1609306Rv.LIZ;
                        List<String> list2 = list;
                        c1609306Rv.getClass();
                        C1609306Rv.LIZIZ(list2);
                        if (function02 != null) {
                            str7 = "click_bubble";
                        } else {
                            str7 = "click_fav_button";
                        }
                        C1171330gaR c1171330gaR = new C1171330gaR();
                        c1171330gaR.LIZLLL = c1171530gal2.LLILLJJLI;
                        c1171330gaR.LJIIZILJ(0);
                        c1171330gaR.LJIJ(i3);
                        c1171330gaR.LJIIZILJ = str6;
                        c1171330gaR.LJIJI = collectionManageResponse.collectionId;
                        c1171330gaR.LJIJJLI = z2 ? 1 : 0;
                        c1171330gaR.LJIILLIIL(Integer.valueOf(i3));
                        c1171330gaR.LJIL = str7;
                        c1171330gaR.LJJI = c1171530gal2.LL;
                        c1171330gaR.LJJIFFI = str5;
                        c1171330gaR.LJJIII = z3;
                        c1171330gaR.LJIILJJIL();
                        if (function02 != null) {
                            str8 = "click_bubble_create";
                        } else {
                            str8 = null;
                        }
                        c1171530gal2.LIZJ(c19eg2, false, new CollectionDetail(collectionManageResponse.collectionId, str5, null, new CollectionDetail.Status(Integer.valueOf(i3)), null, null, null, null, null, null, null), list, true, str8);
                        C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.showCreateCollectionInputDialog$1$onInputConfirm$ignore$1");
                    }
                }, new AfS148S0200000_12(c19eg2, c1171530gal2, 44));
            }
        };
        IAwemeService iAwemeService = (IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null);
        if (iAwemeService != null && (awemeLLILZ = iAwemeService.LLILZ(c1171530gal.LL)) != null && (video = awemeLLILZ.getVideo()) != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null) {
            str3 = (String) C13LP.LJJJLZIJ(0, urlList);
        }
        C1172510gcL.LIZJ(supportFragmentManager, string, null, string2, str4, boolValueOf, interfaceC1172550gcP, str3, c1171530gal.LLILLJJLI, str, null, 4132);
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [T, com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest] */
    /* JADX WARN: Type inference failed for: r13v2, types: [T, com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest] */
    public final void LIZJ(C19EG c19eg, boolean z, CollectionDetail collectionDetail, List<String> list, boolean z2, String str) {
        String string;
        boolean zLJI = MethodIDManager.LJI(202247);
        C1206780hVc.LIZ("popup add video to collection toast");
        C259800zU c259800zU = new C259800zU();
        String string2 = null;
        c259800zU.element = new CollectionManageRequest(10, collectionDetail.id, null, null, null, Collections.singletonList(this.LL), null, null, null, null, null, Integer.valueOf(z2 ? 1 : 0));
        if (this.LLILZ) {
            c259800zU.element = new CollectionManageRequest(12, null, null, null, collectionDetail.id, null, null, Collections.singletonList(this.LL), null, null, 3, null);
        }
        if (C294850Bh5.LIZ()) {
            string = c19eg.getString(2131825058);
        } else {
            string = c19eg.getString(2131834461);
        }
        String string3 = null;
        if (this.LLILZIL && ((Number) C296230BjJ.LIZ.getValue()).intValue() != 0 && !C1246280iXK.LIZ()) {
            C737030Svd c737030Svd = new C737030Svd(105);
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("group_id", this.LL, bundle);
            c737030Svd.LIZJ = bundle;
            C1440005kM.LIZ(c737030Svd);
        } else if (list == null || list.isEmpty()) {
            if (C0BLB.LIZ() == 4 && !this.LLILZLL) {
                C737030Svd c737030Svd2 = new C737030Svd(107);
                ((HashMap) c737030Svd2.LJIJI).put("group_id", this.LL);
                ((HashMap) c737030Svd2.LJIJI).put("collection_detail", collectionDetail);
                C1440005kM.LIZ(c737030Svd2);
            } else {
                C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                Object[] objArr = new Object[1];
                String str2 = collectionDetail.name;
                if (str2 != null) {
                    string2 = a0.LJLIIIL(str2).toString();
                }
                objArr[0] = string2;
                c1389890mGx.LJIIJ(C786410Ut5.j4(string, Arrays.copyOf(objArr, 1)));
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJII(R.attr.a0i);
                c1389890mGx.LJIIJJI();
            }
        }
        C1367960lha.LIZ.getClass();
        IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
        Boolean boolValueOf = Boolean.valueOf(this.LLILLL);
        String str3 = collectionDetail.id;
        String str4 = collectionDetail.name;
        Integer num = collectionDetail.type;
        if (num != null) {
            string3 = num.toString();
        }
        iPoiServiceLIZ.onVideoAddToCollection(boolValueOf, str3, str4, string3, this.LL);
        AwS419S0200000_18 awS419S0200000_18 = new AwS419S0200000_18(this, new C1170780gZY(c259800zU, this, str, z2, collectionDetail, z, list, c19eg), 34);
        if (!Intrinsics.LJFF(this.LLJI, this.LL) && !this.LLILZ) {
            this.LLJIJIL = awS419S0200000_18;
        } else {
            awS419S0200000_18.invoke();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public C1171530gal(String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, int i) {
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 8) != 0 ? false : z2;
        z3 = (i & 16) != 0 ? false : z3;
        z4 = (i & 32) != 0 ? false : z4;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = z4;
        this.LLIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(138));
        this.LLIZLLLIL = new C1171540gam(this);
        if (C298410Bmp.LIZ()) {
            ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).addSubscriber(this);
        }
        EventBus.LIZLLL().LJIJJ(this);
    }
}

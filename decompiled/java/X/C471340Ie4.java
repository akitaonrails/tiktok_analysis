package X;

import Y.AfS171S0100000_2;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.feed.adapter.viewholder.DrawerFollowingViewHolder;
import com.bytedance.android.livesdk.livesetting.other.LiveSquareInboxRefreshIntervalSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerFollowSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ie4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C471340Ie4 {
    public static C0DUN LIZ;
    public static C471500IeK LIZIZ;
    public static ViewGroup LIZJ;
    public static ViewGroup LIZLLL;
    public static C472450Ifr LJ;
    public static View LJFF;
    public static C1324720kZq LJI;
    public static C1324720kZq LJII;
    public static C1324720kZq LJIIIIZZ;
    public static View LJIIIZ;
    public static View LJIIJ;
    public static View LJIIJJI;
    public static View LJIIL;
    public static C0GSX LJIILIIL;
    public static C0GSX LJIILJJIL;
    public static C0GSX LJIILL;
    public static C16F5 LJIILLIIL;
    public static LiveIconView LJIIZILJ;
    public static BaseListResponse<FeedItem, FeedExtra> LJIJ;
    public static boolean LJIJI;
    public static boolean LJIJJ;
    public static int LJIL;
    public static Context LJJ;
    public static boolean LJJI;
    public static long LJJIFFI;
    public static int LJJII;
    public static boolean LJJIIJ;
    public static boolean LJJIIJZLJL;
    public static boolean LJJIIZ;
    public static boolean LJJIIZI;
    public static long LJJIJ;
    public static int LJJIJIIJI;
    public static String LJIJJLI = "";
    public static String LJJIII = "click";

    public static void LIZ() {
        if (LJJIIJZLJL || !LJJIIZI || LJJI || LJJII <= 4 || LJIILLIIL == null) {
            return;
        }
        long j = LJJIJ;
        ViewGroup viewGroup = LIZJ;
        if (viewGroup != null) {
            HandlerHook.viewPostDelay(viewGroup, new Runnable() { // from class: X.0Ie7
                public static void LIZ() {
                    if (C471340Ie4.LJ(C471340Ie4.LJIILLIIL)) {
                        if (!C471340Ie4.LJJI && C471340Ie4.LJJII > 4) {
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_skylight_more_show");
                            c474500IjALIZ.LJJII(C471340Ie4.LJIJJLI, "tab_type");
                            c474500IjALIZ.LJJII(C471340Ie4.LJJIII, "action_type");
                            c474500IjALIZ.LJJII(Integer.valueOf(C471340Ie4.LJJII - 4), "more_following_number");
                            c474500IjALIZ.LJJII(C467800IWc.LJIJ.LJIIL, "landing_reason");
                            c474500IjALIZ.LJJII(C0IUA.LJIILLIIL, "enter_from_merge");
                            c474500IjALIZ.LJJII(C0IUA.LJIIZILJ, "enter_method");
                            c474500IjALIZ.LIZ();
                        }
                        C471340Ie4.LJJIIJZLJL = true;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("DrawerFollowingHelper@e8c2.checkBottomMoreShow$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("DrawerFollowingHelper@e8c2.checkBottomMoreShow$1");
                }
            }, j);
        }
    }

    public static void LIZIZ() {
        if (LJJIIZ || !LJJIIZI) {
            return;
        }
        if (LJJI || LJJII <= 4) {
            long j = LJJIJ;
            ViewGroup viewGroup = LIZJ;
            if (viewGroup != null) {
                HandlerHook.viewPostDelay(viewGroup, new Runnable() { // from class: X.0Ie6
                    public static void LIZ() {
                        if (C471340Ie4.LJ(C471340Ie4.LIZJ)) {
                            if (C471340Ie4.LJJI || C471340Ie4.LJJII <= 4) {
                                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_explore_skylight_show");
                                c474500IjALIZ.LJJII(C471340Ie4.LJIJJLI, "tab_type");
                                c474500IjALIZ.LJJII(C471340Ie4.LJJIII, "action_type");
                                c474500IjALIZ.LJJII(Integer.valueOf(C471340Ie4.LJJII), "following_number");
                                c474500IjALIZ.LJJII(C467800IWc.LJIJ.LJIIL, "landing_reason");
                                c474500IjALIZ.LJJII(C0IUA.LJIILLIIL, "enter_from_merge");
                                c474500IjALIZ.LJJII(C0IUA.LJIIZILJ, "enter_method");
                                c474500IjALIZ.LIZ();
                            }
                            C471340Ie4.LJJIIZ = true;
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("DrawerFollowingHelper@e8c2.checkExploreSkylightShow$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("DrawerFollowingHelper@e8c2.checkExploreSkylightShow$1");
                    }
                }, j);
            }
        }
    }

    public static void LJIIIIZZ() {
        C0DUN c0dun;
        DrawerFollowingViewHolder drawerFollowingViewHolder;
        ViewGroup viewGroup = LIZJ;
        if (viewGroup == null || viewGroup.getVisibility() != 0 || (c0dun = LIZ) == null) {
            return;
        }
        int childCount = c0dun.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0DUN c0dun2 = LIZ;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c0dun2 != null ? c0dun2.findViewHolderForAdapterPosition(i) : null;
            if (LJ != null && (viewHolderFindViewHolderForAdapterPosition instanceof DrawerFollowingViewHolder) && (drawerFollowingViewHolder = (DrawerFollowingViewHolder) viewHolderFindViewHolderForAdapterPosition) != null) {
                drawerFollowingViewHolder.L5();
            }
        }
    }

    public static void LJIIJJI() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup = LIZJ;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        if (LJJII <= 0) {
            return;
        }
        if (LJIL <= 0) {
            LJIL = LIZJ(90.0d);
        }
        int i = LJJII;
        int iMin = i <= 0 ? 0 : (i <= 4 || !LJJI) ? LJIL : Math.min(3, (int) Math.ceil((((double) i) * 1.0d) / ((double) 4))) * LJIL;
        ViewGroup viewGroup2 = LIZJ;
        if (viewGroup2 != null) {
            layoutParams = viewGroup2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = iMin;
                layoutParams.width = -1;
            }
        } else {
            layoutParams = null;
        }
        ViewGroup viewGroup3 = LIZJ;
        if (viewGroup3 != null) {
            C786410Ut5.X5(layoutParams, viewGroup3);
        }
        ViewGroup viewGroup4 = LIZJ;
        if (viewGroup4 != null) {
            C786410Ut5.LJLZ(0, viewGroup4);
        }
    }

    public static void LJIIL() {
        Context context;
        List<FeedItem> list;
        List<FeedItem> list2;
        View view = LJIIJ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view2 = LJIIJJI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = LJIIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        View view4 = LJIIIZ;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
        ViewGroup viewGroup = LIZLLL;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        if (LJJII <= 4) {
            return;
        }
        ViewGroup viewGroup2 = LIZLLL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(0, viewGroup2);
        }
        View view5 = LJIIIZ;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(0, view5);
        }
        if (LJJI) {
            C16F5 c16f5 = LJIILLIIL;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131841461));
            }
            LiveIconView liveIconView = LJIIZILJ;
            if (liveIconView != null) {
                C786410Ut5.Db(liveIconView, 180.0f);
            }
        } else {
            BaseListResponse<FeedItem, FeedExtra> baseListResponse = LJIJ;
            FeedItem feedItem = null;
            LJFF((baseListResponse == null || (list2 = baseListResponse.data) == null) ? null : (FeedItem) ListProtector.get(list2, 4), LJIIJ, LJI, LJIILIIL);
            if (LJJII > 5) {
                BaseListResponse<FeedItem, FeedExtra> baseListResponse2 = LJIJ;
                if (baseListResponse2 != null && (list = baseListResponse2.data) != null) {
                    feedItem = (FeedItem) ListProtector.get(list, 5);
                }
                LJFF(feedItem, LJIIJJI, LJII, LJIILJJIL);
            }
            if (LJJII > 6) {
                C1143680frq.LJJIFFI(LJIIIIZZ, C1143780fs0.LJIIJJI("tiktok_live_watch_resource_normal_1", "drawer_follow_more_icon.png"), false);
                View view6 = LJIIL;
                if (view6 != null) {
                    C786410Ut5.LJLLLLLL(0, view6);
                }
                if (LJJIJIIJI <= 0 && (context = LJJ) != null) {
                    LJJIJIIJI = C20736316Cj.LIZIZ(R.attr.euj, context);
                }
                C0GSX c0gsx = LJIILL;
                if (c0gsx != null) {
                    int i = LJJIJIIJI;
                    c0gsx.LIZ(i, i);
                }
                C1324720kZq c1324720kZq = LJIIIIZZ;
                if (c1324720kZq != null && c1324720kZq.getContext() != null) {
                    if (C497740JfY.LJJ()) {
                        C1324720kZq c1324720kZq2 = LJIIIIZZ;
                        if (c1324720kZq2 != null) {
                            C786410Ut5.Yb(c1324720kZq2, -1.0f);
                        }
                    } else {
                        C1324720kZq c1324720kZq3 = LJIIIIZZ;
                        if (c1324720kZq3 != null) {
                            C786410Ut5.Yb(c1324720kZq3, 1.0f);
                        }
                    }
                }
            }
            C16F5 c16f52 = LJIILLIIL;
            if (c16f52 != null) {
                c16f52.setText(String.valueOf(C497740JfY.LJIJI(2131841460)));
            }
            LiveIconView liveIconView2 = LJIIZILJ;
            if (liveIconView2 != null) {
                C786410Ut5.Db(liveIconView2, 0.0f);
            }
        }
        int iLIZJ = LIZJ(14.0d);
        int i2 = LJJII;
        if (i2 > 6) {
            C500260Jjc.LJJLJLI(iLIZJ, LJIIJ);
            C500260Jjc.LJJLJLI(iLIZJ, LJIIJJI);
        } else if (i2 == 6) {
            C500260Jjc.LJJLJLI(iLIZJ, LJIIJ);
            C500260Jjc.LJJLJLI(0, LJIIJJI);
        } else if (i2 == 5) {
            C500260Jjc.LJJLJLI(0, LJIIJ);
            C500260Jjc.LJJLJLI(0, LJIIJJI);
        }
    }

    public static int LIZJ(double d) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Context contextLIZ = C176600m4.LIZ();
        if (contextLIZ != null && (resources = contextLIZ.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            return (int) ((d * ((double) displayMetrics.density)) + ((double) 0.5f));
        }
        return 0;
    }

    public static String LIZLLL(String str) {
        if (LiveDrawerFollowSetting.INSTANCE.isShowFollowTab("following", str)) {
            return "tiktok_message_drawer_following";
        }
        return "";
    }

    public static boolean LJ(View view) {
        if (view == null || view.getResources() == null || view.getWidth() == 0 || view.getHeight() == 0) {
            return false;
        }
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return false;
        }
        rect.intersect(0, 0, view.getResources().getDisplayMetrics().widthPixels, view.getResources().getDisplayMetrics().heightPixels);
        if (rect.width() * rect.height() < view.getWidth() * view.getHeight()) {
            return false;
        }
        return true;
    }

    public static void LJI(String str) {
        ViewGroup viewGroup;
        C0DUN c0dun;
        DrawerFollowingViewHolder drawerFollowingViewHolder;
        if (Intrinsics.LJFF("foru", str) && (viewGroup = LIZJ) != null && viewGroup.getVisibility() == 0 && (c0dun = LIZ) != null) {
            int childCount = c0dun.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C0DUN c0dun2 = LIZ;
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = null;
                if (c0dun2 != null) {
                    viewHolderFindViewHolderForAdapterPosition = c0dun2.findViewHolderForAdapterPosition(i);
                }
                if (LJ != null && (viewHolderFindViewHolderForAdapterPosition instanceof DrawerFollowingViewHolder) && (drawerFollowingViewHolder = (DrawerFollowingViewHolder) viewHolderFindViewHolderForAdapterPosition) != null) {
                    drawerFollowingViewHolder.LLILLJJLI = false;
                }
            }
        }
    }

    public static void LJII(String str) {
        if (!Intrinsics.LJFF("foru", str)) {
            return;
        }
        LJJIIZI = true;
        LJJIII = C467820IWe.LJIIJJI;
        LJJIIJZLJL = false;
        LJJIIZ = false;
        LJJIJ = 240L;
        LIZ();
        LIZIZ();
        LJIIIIZZ();
        LJJIJ = 0L;
    }

    public static void LJIIIZ(String str, BPEAHandler bPEAHandler) {
        String str2;
        if (SystemClock.elapsedRealtime() - LJJIFFI > LiveSquareInboxRefreshIntervalSetting.INSTANCE.getValue() * LSPassThroughRecordSizeConfig.DEFAULT) {
            if (LiveDrawerFollowSetting.INSTANCE.isShowFollowWindow("foru", str)) {
                str2 = "tiktok_message_drawer_foryou";
            } else {
                str2 = "";
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            C480460Ism.LIZ().getClass();
            ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed("/webcast/feed/", 0L, "tiktok_message_drawer_foryou", new LinkedHashMap()).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS171S0100000_2(bPEAHandler, 70), new AfS171S0100000_2(bPEAHandler, 71));
            LJJIFFI = SystemClock.elapsedRealtime();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.0IeK, X.0rMx] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LJIIJ(String str, BaseListResponse baseListResponse) {
        int size;
        C472450Ifr c472450Ifr;
        Context context;
        C472450Ifr c472450Ifr2;
        List<T> list;
        LJIJJLI = str;
        LJIJ = baseListResponse;
        if (baseListResponse != null && (list = baseListResponse.data) != 0) {
            size = list.size();
        } else {
            size = 0;
        }
        LJJII = size;
        if (!LJIJI) {
            if (LJJ != null && LIZJ != null && Intrinsics.LJFF("foru", LJIJJLI) && (context = LJJ) != null) {
                LJIJI = true;
                LIZ = new C0DUN(context);
                ViewGroup viewGroup = LIZJ;
                if (viewGroup != null) {
                    C786410Ut5.LJJJJI(viewGroup);
                }
                ViewGroup viewGroup2 = LIZJ;
                if (viewGroup2 != null) {
                    viewGroup2.addView(LIZ);
                }
                ?? r1 = new AbstractC1585810rMx() { // from class: X.0IeK
                    @Override // X.AbstractC1585810rMx
                    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
                        if (Math.abs(i2) < C471340Ie4.LIZJ(10.0d)) {
                            return;
                        }
                        if (i2 != 0) {
                            C471340Ie4.LJJIII = "draw";
                        }
                        C0DUN c0dun = C471340Ie4.LIZ;
                        if (c0dun != null && !c0dun.canScrollVertically(1) && i2 != 0) {
                            C471340Ie4.LIZ();
                        }
                        C0DUN c0dun2 = C471340Ie4.LIZ;
                        if (c0dun2 != null && !c0dun2.canScrollVertically(-1) && i2 != 0) {
                            C471340Ie4.LIZIZ();
                        }
                    }
                };
                LIZIZ = r1;
                C0DUN c0dun = LIZ;
                if (c0dun != 0) {
                    c0dun.addOnScrollListener(r1);
                }
                GridLayoutManager gridLayoutManager = new GridLayoutManager(LJJ, 4);
                C0DUN c0dun2 = LIZ;
                if (c0dun2 != null) {
                    c0dun2.setLayoutManager(gridLayoutManager);
                }
                C472450Ifr c472450Ifr3 = new C472450Ifr(C472480Ifu.LIZIZ, null, null, null);
                LJ = c472450Ifr3;
                C0DUN c0dun3 = LIZ;
                if (c0dun3 != null) {
                    c0dun3.setAdapter(c472450Ifr3);
                }
                LJIIJJI();
                BaseListResponse<FeedItem, FeedExtra> baseListResponse2 = LJIJ;
                if (baseListResponse2 != null && (c472450Ifr2 = LJ) != null) {
                    List<FeedItem> list2 = baseListResponse2.data;
                    FeedExtra feedExtra = (FeedExtra) baseListResponse2.extra;
                    String str2 = LJIJJLI;
                    c472450Ifr2.LLILZIL = list2;
                    c472450Ifr2.LLILZLL = feedExtra;
                    c472450Ifr2.LLIZ = str2;
                    c472450Ifr2.notifyDataSetChanged();
                    c472450Ifr2.LLLFZ();
                }
            }
        } else {
            LJIIJJI();
            BaseListResponse<FeedItem, FeedExtra> baseListResponse3 = LJIJ;
            if (baseListResponse3 != null && (c472450Ifr = LJ) != null) {
                List<FeedItem> list3 = baseListResponse3.data;
                FeedExtra feedExtra2 = (FeedExtra) baseListResponse3.extra;
                String str3 = LJIJJLI;
                c472450Ifr.LLILZIL = list3;
                c472450Ifr.LLILZLL = feedExtra2;
                c472450Ifr.LLIZ = str3;
                c472450Ifr.notifyDataSetChanged();
                c472450Ifr.LLLFZ();
            }
        }
        if (!LJIJJ) {
            if (LJJ != null && LIZLLL != null && Intrinsics.LJFF("foru", LJIJJLI)) {
                LJIJJ = true;
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(LJJ), R.layout.gdf, LIZLLL, false);
                ViewGroup viewGroup3 = LIZLLL;
                if (viewGroup3 != null) {
                    C786410Ut5.LJJJJI(viewGroup3);
                }
                ViewGroup viewGroup4 = LIZLLL;
                if (viewGroup4 != null) {
                    viewGroup4.addView(viewTd);
                }
                LJFF = viewTd.findViewById(R.id.ccd);
                LJI = (C1324720kZq) viewTd.findViewById(R.id.ldg);
                LJII = (C1324720kZq) viewTd.findViewById(R.id.ldi);
                LJIIIIZZ = (C1324720kZq) viewTd.findViewById(R.id.ldk);
                LJIILLIIL = (C16F5) viewTd.findViewById(R.id.chi);
                LJIIIZ = viewTd.findViewById(R.id.cd_);
                LJIIJ = viewTd.findViewById(R.id.jhl);
                LJIIJJI = viewTd.findViewById(R.id.jhm);
                LJIIL = viewTd.findViewById(R.id.jhn);
                LJIILIIL = (C0GSX) viewTd.findViewById(R.id.ldh);
                LJIILJJIL = (C0GSX) viewTd.findViewById(R.id.ldj);
                LJIILL = (C0GSX) viewTd.findViewById(R.id.ldl);
                LJIIZILJ = (LiveIconView) viewTd.findViewById(R.id.ign);
                LJIIL();
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0IeG
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C471340Ie4.LJJI = !C471340Ie4.LJJI;
                        C471340Ie4.LJIIJJI();
                        C471340Ie4.LJIIL();
                        C471340Ie4.LJJIII = "click";
                        C0DUN c0dun4 = C471340Ie4.LIZ;
                        if (c0dun4 != null) {
                            c0dun4.setIsOpen(C471340Ie4.LJJI);
                        }
                        if (!C471340Ie4.LJJI) {
                            C0DUN c0dun5 = C471340Ie4.LIZ;
                            if (c0dun5 != null) {
                                c0dun5.scrollToPosition(0);
                            }
                            C471340Ie4.LJJIIZ = false;
                            View view2 = C471340Ie4.LJFF;
                            if (view2 != null) {
                                view2.setBackgroundResource(0);
                            }
                        } else {
                            C471340Ie4.LJJIIJZLJL = false;
                            View view3 = C471340Ie4.LJFF;
                            if (view3 != null) {
                                view3.setBackgroundResource(R.drawable.ds8);
                            }
                        }
                        C471340Ie4.LIZ();
                        C471340Ie4.LIZIZ();
                    }
                }, viewTd);
            }
        } else {
            LJIIL();
        }
        LIZ();
        LIZIZ();
    }

    public static void LJFF(FeedItem feedItem, View view, C1324720kZq c1324720kZq, C0GSX c0gsx) {
        InterfaceC468260IXw interfaceC468260IXw;
        InterfaceC468260IXw interfaceC468260IXw2;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        ImageModel avatarThumb;
        Context context;
        if (c1324720kZq != null) {
            if (feedItem != null) {
                interfaceC468260IXw = feedItem.item;
            } else {
                interfaceC468260IXw = null;
            }
            if ((interfaceC468260IXw instanceof Room) && (interfaceC468260IXw2 = feedItem.item) != null && (interfaceC2262081DgMAuthor = interfaceC468260IXw2.author()) != null && (avatarThumb = interfaceC2262081DgMAuthor.getAvatarThumb()) != null) {
                C1143680frq.LJJI(c1324720kZq, avatarThumb, false);
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                if (LJJIJIIJI <= 0 && (context = LJJ) != null) {
                    LJJIJIIJI = C20736316Cj.LIZIZ(R.attr.euj, context);
                }
                if (c0gsx != null) {
                    int i = LJJIJIIJI;
                    c0gsx.LIZ(i, i);
                }
            }
        }
    }
}

package X;

import Y.ACListenerS147S0100000_12;
import Y.ARunnableS0S0204000_1;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.util.LruCache;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import com.ss.android.ugc.aweme.commercialize.model.promote.PromoteModel;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteLogger;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.poi.PoiBoostData;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.experiment.viewlist.DisablePostViewerListExp;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iCR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233330iCR extends FrameLayout implements Observer<C0RD4>, LifecycleOwner, GenericLifecycleObserver {
    public static long LLJJIII;
    public static long LLJJIJI;
    public static long LLJJIJIIJIL;
    public static final /* synthetic */ int LLJJIJIL = 0;
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public TuxIconView LLILLL;
    public View LLILZ;
    public TuxIconView LLILZIL;
    public TuxTextView LLILZLL;
    public C197039127h LLIZ;
    public final C01GW LLIZLLLIL;
    public Aweme LLJ;
    public C2189821An6 LLJI;
    public final C01GW LLJIJIL;
    public ViewPropertyAnimator LLJILJIL;
    public ViewPropertyAnimator LLJILJILJ;
    public final AccelerateDecelerateInterpolator LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate(lifecycleOwner);
            return;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_RESUME) {
            onResume(lifecycleOwner);
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause(lifecycleOwner);
        }
    }

    private final View getPoiPublishBoostContainerFromXml() {
        View view = this.LLILZ;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.r8b);
        this.LLILZ = viewFindViewById;
        return viewFindViewById;
    }

    private final TuxIconView getPoiPublishBoostIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.r8c);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    private final TuxTextView getPoiPublishBoostTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.r8d);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final C197039127h getPromoteButton() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_view_promote_button);
            this.LLIZ = (C197039127h) callbackFindViewById;
        }
        return (C197039127h) callbackFindViewById;
    }

    private final VideoViewerListVM.BubbleVideoViewerViewModel getVm() {
        return (VideoViewerListVM.BubbleVideoViewerViewModel) this.LLIZLLLIL.getValue();
    }

    public final LruCache<String, ViewerListResponse> getAidViewerListCache() {
        return (LruCache) this.LLJIJIL.getValue();
    }

    public final TuxTextView getPrivacyBtnFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ru_);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxIconView getViewEntrancePlayVvIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.view_entrance_play_vv_icon);
            this.LLILLL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getViewEntranceTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.view_entrance_text);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final void refresh() {
        Aweme aweme = this.LLJ;
        if (aweme != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("entrance refresh fetchVideoViewerList ");
            sbLIZ.append(aweme.getAid());
            C1344030l4z.LIZJ("VideoViewerEntrance", C2188811AlT.LIZIZ(sbLIZ));
            VideoViewerListVM.BubbleVideoViewerViewModel vm = getVm();
            if (vm != null) {
                vm.CQ2(aweme.getAid(), new PaginationCursor(0L, 0L), EnumC1233370iCV.ENTRANCE.getValue());
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return C1388190mED.LIZIZ(getContext()).getLifecycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1233330iCR(Context context) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super(context, null, 0);
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS420S0200000_19(this, context, 132));
        this.LLJIJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(611));
        this.LLJILLL = new AccelerateDecelerateInterpolator();
        this.LLJJI = true;
        FrameLayout.inflate(context, R.layout.a5a, this);
        VideoViewerListVM.BubbleVideoViewerViewModel vm = getVm();
        if (vm != null) {
            vm.yQ2("REFRESH_ENTRANCE_VIDEO_VIEW_SUCCESS", this, false);
            vm.yQ2("REFRESH_ENTRANCE_VIDEO_VIEW_FAIL", this, false);
        }
        Fragment fragmentLIZJ = SAFExtensionKt.LIZJ(this);
        if ((fragmentLIZJ != null && (lifecycle = fragmentLIZJ.getLifecycle()) != null) || ((context instanceof LifecycleOwner) && (lifecycleOwner = (LifecycleOwner) context) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null)) {
            lifecycle.addObserver(this);
        }
    }

    public final boolean LIZJ(Aweme aweme) {
        PromoteModel promoteModel;
        String eventType;
        if (aweme == null || (promoteModel = aweme.getPromoteModel()) == null || Intrinsics.LJFF(promoteModel.getHasBottomBarButton(), Boolean.FALSE)) {
            return false;
        }
        ICommercePromoteService iCommercePromoteService = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null);
        if (iCommercePromoteService == null || iCommercePromoteService.LJIL(getContext())) {
            return true;
        }
        ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
        if (iCommercePromoteLogger != null) {
            C2189821An6 c2189821An6 = this.LLJI;
            if (c2189821An6 != null) {
                eventType = c2189821An6.getEventType();
            } else {
                eventType = null;
            }
            iCommercePromoteLogger.LJIJJ(aweme, null, "myself", "bottom_bar_button", eventType, null, "width_limit", "1");
        }
        return false;
    }

    public final void LIZLLL(ViewerListResponse viewerListResponse) {
        MutualStruct mutualStruct;
        Integer numValueOf;
        boolean z;
        Aweme aweme;
        ICommercePromoteService iCommercePromoteService;
        String eventType;
        PromoteModel promoteModel;
        String bottomBarButtonText;
        C197039127h promoteButton;
        String eventType2;
        String aid;
        String authorUid;
        Integer numValueOf2;
        String str;
        PoiDataStruct poiDataStruct;
        long jLongValue;
        PoiBoostData poiBoostData;
        String str2;
        Long lLJIILIIL;
        boolean z2;
        int iIntValue;
        View view;
        int iIntValue2;
        Aweme aweme2;
        final boolean z3;
        int i;
        float f;
        long jIntValue;
        PromoteModel promoteModel2;
        Integer videoViewCount;
        PromoteModel promoteModel3;
        List<MutualUser> list;
        List<User> viewerList;
        C786410Ut5.LLLLZLL(getViewEntranceTextFromXml(), 0);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(1.0f);
        final C013C c013c = new C013C();
        c013c.element = C0TNQ.LJFF();
        final boolean zLJIIIIZZ = C0TNQ.LJIIIIZZ(this.LLJ);
        final long jLIZLLL = C0TNQ.LIZLLL(this.LLJ);
        if (viewerListResponse != null && (viewerList = viewerListResponse.getViewerList()) != null && viewerList.size() > 0) {
            int size = viewerListResponse.getViewerList().size();
            List<User> viewerList2 = viewerListResponse.getViewerList();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(viewerList2, 10));
            for (User user : viewerList2) {
                arrayList.add(new MutualUser(user.getSecUid(), "", user.getAvatarMedium(), null, "", null));
            }
            mutualStruct = new MutualStruct(0, size, arrayList, 0);
        } else {
            mutualStruct = null;
        }
        StringBuilder sb = new StringBuilder("hasAuth:[");
        sb.append(c013c.element);
        sb.append("] isVideoWithin7days:[");
        sb.append(zLJIIIIZZ);
        sb.append("]  cacheTotalVV:[");
        sb.append(jLIZLLL);
        sb.append("]  avatars:[");
        if (mutualStruct != null && (list = mutualStruct.userList) != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sb.append(numValueOf);
        sb.append(']');
        C1344030l4z.LIZJ("VideoViewerEntrance", sb.toString());
        Aweme aweme3 = this.LLJ;
        if (aweme3 != null && (promoteModel3 = aweme3.getPromoteModel()) != null && promoteModel3.isShowVideoView()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_fire_4;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            TuxIconView poiPublishBoostIconFromXml = getPoiPublishBoostIconFromXml();
            if (poiPublishBoostIconFromXml != null) {
                poiPublishBoostIconFromXml.setTuxIcon(c419910GdJ);
            }
            C339190DRl.LIZLLL(getPoiPublishBoostContainerFromXml());
            C339190DRl.LIZLLL(getPoiPublishBoostIconFromXml());
            TuxTextView poiPublishBoostTextFromXml = getPoiPublishBoostTextFromXml();
            if (poiPublishBoostTextFromXml != null) {
                Aweme aweme4 = this.LLJ;
                if (aweme4 != null && (promoteModel2 = aweme4.getPromoteModel()) != null && (videoViewCount = promoteModel2.getVideoViewCount()) != null) {
                    jIntValue = videoViewCount.intValue();
                } else {
                    jIntValue = 0;
                }
                poiPublishBoostTextFromXml.setText(C1843500y4a.LIZIZ(jIntValue));
            }
            View poiPublishBoostContainerFromXml = getPoiPublishBoostContainerFromXml();
            if (poiPublishBoostContainerFromXml != null) {
                C786410Ut5.I7(new C1265800j2o(this, 1), poiPublishBoostContainerFromXml);
            }
            ICommercePromoteService iCommercePromoteService2 = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null);
            if (iCommercePromoteService2 != null && iCommercePromoteService2.LJIJI()) {
                String eventType3 = null;
                ICommercePromoteLogger iCommercePromoteLogger = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
                if (iCommercePromoteLogger != null) {
                    Aweme aweme5 = this.LLJ;
                    C2189821An6 c2189821An6 = this.LLJI;
                    if (c2189821An6 != null) {
                        eventType3 = c2189821An6.getEventType();
                    }
                    iCommercePromoteLogger.LJIIJJI("video", aweme5, "myself", "video_view", eventType3, null, null, null);
                }
            }
            getViewEntranceTextFromXml().setText(C1843500y4a.LIZIZ(jLIZLLL));
        } else {
            Aweme aweme6 = this.LLJ;
            if (aweme6 != null && aweme6.getPoiBoostData() != null) {
                C339190DRl.LIZLLL(getPoiPublishBoostContainerFromXml());
                TuxTextView poiPublishBoostTextFromXml2 = getPoiPublishBoostTextFromXml();
                if (poiPublishBoostTextFromXml2 != null) {
                    StringBuilder sb2 = new StringBuilder("+");
                    Aweme aweme7 = this.LLJ;
                    if (aweme7 != null && (poiBoostData = aweme7.getPoiBoostData()) != null && (str2 = poiBoostData.boostCount) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    sb2.append(C618720OOo.LIZ(jLongValue));
                    poiPublishBoostTextFromXml2.setText(sb2.toString());
                }
                View poiPublishBoostContainerFromXml2 = getPoiPublishBoostContainerFromXml();
                if (poiPublishBoostContainerFromXml2 != null) {
                    C786410Ut5.I7(new C1265800j2o(this, 2), poiPublishBoostContainerFromXml2);
                }
                getViewEntranceTextFromXml().setText(C1843500y4a.LIZIZ(jLIZLLL));
                if (System.currentTimeMillis() - LLJJIJIIJIL > 500) {
                    C2189821An6 c2189821An62 = this.LLJI;
                    if (c2189821An62 != null) {
                        eventType2 = c2189821An62.getEventType();
                    } else {
                        eventType2 = null;
                    }
                    Aweme aweme8 = this.LLJ;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", eventType2);
                    if (aweme8 != null) {
                        aid = aweme8.getAid();
                    } else {
                        aid = null;
                    }
                    c2344009Gk.LJIIIIZZ("group_id", aid);
                    if (aweme8 != null) {
                        authorUid = AwemeExtKt.getAuthorUid(aweme8);
                    } else {
                        authorUid = null;
                    }
                    c2344009Gk.LJIIIIZZ("author_id", authorUid);
                    if (aweme8 != null) {
                        numValueOf2 = Integer.valueOf(aweme8.getAwemeType());
                    } else {
                        numValueOf2 = null;
                    }
                    c2344009Gk.LJIIIIZZ("aweme_type", String.valueOf(numValueOf2));
                    if (aweme8 != null && (poiDataStruct = aweme8.getPoiDataStruct()) != null) {
                        str = poiDataStruct.poiId;
                    } else {
                        str = null;
                    }
                    c2344009Gk.LJIIIIZZ("poi_id", str);
                    C1350920lG6.LJJJ(c2344009Gk, "ttls_author_video_incentive_detail_show");
                    if (LIZJ(this.LLJ) && this.LLJ != null) {
                        String eventType4 = null;
                        ICommercePromoteLogger iCommercePromoteLogger2 = (ICommercePromoteLogger) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteLogger.class, false, false, false, 14, null);
                        if (iCommercePromoteLogger2 != null) {
                            Aweme aweme9 = this.LLJ;
                            C2189821An6 c2189821An63 = this.LLJI;
                            if (c2189821An63 != null) {
                                eventType4 = c2189821An63.getEventType();
                            }
                            iCommercePromoteLogger2.LJIJJ(aweme9, null, "myself", "bottom_bar_button", eventType4, null, "avoid_poi", "1");
                        }
                    }
                }
                LLJJIJIIJIL = System.currentTimeMillis();
            } else if (LIZJ(this.LLJ)) {
                if (getPromoteButton() == null) {
                    return;
                }
                C197039127h promoteButton2 = getPromoteButton();
                if (promoteButton2 != null) {
                    promoteButton2.LJJJJL(new AwS580S0100000_1(this, 432));
                }
                Aweme aweme10 = this.LLJ;
                if (aweme10 != null && (promoteModel = aweme10.getPromoteModel()) != null && (bottomBarButtonText = promoteModel.getBottomBarButtonText()) != null && (promoteButton = getPromoteButton()) != null) {
                    promoteButton.setText(bottomBarButtonText);
                }
                C197039127h promoteButton3 = getPromoteButton();
                if (promoteButton3 != null) {
                    C786410Ut5.LLLLLLJ(promoteButton3, 0);
                }
                C339190DRl.LIZIZ(getPoiPublishBoostContainerFromXml());
                getViewEntranceTextFromXml().setText(C1843500y4a.LIZIZ(jLIZLLL));
                C197039127h promoteButton4 = getPromoteButton();
                if (promoteButton4 != null) {
                    promoteButton4.LJJJJLI(true);
                }
                C197039127h promoteButton5 = getPromoteButton();
                if (promoteButton5 != null) {
                    C786410Ut5.U8(promoteButton5, new ACListenerS147S0100000_12((Object) this, 296));
                }
                ICommercePromoteService iCommercePromoteService3 = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null);
                if (iCommercePromoteService3 != null && iCommercePromoteService3.LJIJI() && (aweme = this.LLJ) != null && (iCommercePromoteService = (ICommercePromoteService) PluggableExtentionKt.pluggableSpi$default(ICommercePromoteService.class, false, false, false, 14, null)) != null) {
                    C2189821An6 c2189821An64 = this.LLJI;
                    if (c2189821An64 != null) {
                        eventType = c2189821An64.getEventType();
                    } else {
                        eventType = null;
                    }
                    iCommercePromoteService.LJIIIIZZ(aweme, eventType, "1");
                }
            } else {
                C339190DRl.LIZIZ(getPoiPublishBoostContainerFromXml());
                getViewEntranceTextFromXml().setText(getContext().getResources().getQuantityString(2131756060, (int) jLIZLLL, C1843500y4a.LIZIZ(jLIZLLL)));
            }
        }
        C2189821An6 c2189821An65 = this.LLJI;
        if (c2189821An65 == null || c2189821An65.getShouldHidePrivacySetting() || ((C729510SjV.LJJ(this.LLJ) && (!C0BNZ.LIZ() || C1601110rld.LIZ())) || C0OAD.LIZIZ(this.LLJ) || ((aweme2 = this.LLJ) != null && aweme2.isPaidContent))) {
            C786410Ut5.LLLLZLL(getPrivacyBtnFromXml(), 8);
        } else {
            getViewEntranceTextFromXml().setMaxWidth(((View) getViewEntranceTextFromXml().getParent()).getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(160)));
            final TuxTextView privacyBtnFromXml = getPrivacyBtnFromXml();
            Aweme aweme11 = this.LLJ;
            if (aweme11 != null && AwemeExtKt.isScheduleVideo(aweme11)) {
                z3 = true;
                i = R.attr.e9;
                f = 0.4f;
            } else {
                z3 = false;
                i = R.attr.dy;
                f = 1.0f;
            }
            C786410Ut5.B5(privacyBtnFromXml, f);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
            c384050F3z.LIZIZ = Integer.valueOf(i);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
            privacyBtnFromXml.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), 0);
            privacyBtnFromXml.setBackground(c384050F3z.LIZ(privacyBtnFromXml.getContext()));
            C786410Ut5.LLLLZLL(privacyBtnFromXml, 0);
            C1239420iMG.LIZ.getClass();
            if (System.currentTimeMillis() - C1239420iMG.LIZIZ > 500) {
                privacyBtnFromXml.setTextSize(C1239420iMG.LIZ(privacyBtnFromXml));
            }
            C1239420iMG.LIZIZ = System.currentTimeMillis();
            C1233350iCT.LIZ(new AwS563S0100000_19(this, 2788), true);
            C786410Ut5.I7(new AbstractViewOnClickListenerC372950Ejl() { // from class: X.0hba
                /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
                @Override // X.AbstractViewOnClickListenerC372950Ejl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(android.view.View r13) {
                    /*
                        Method dump skipped, instruction units count: 341
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1210480hba.LIZ(android.view.View):void");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1700L);
                }
            }, privacyBtnFromXml);
        }
        if (c013c.element) {
            C786410Ut5.LLLLLLZZ(getViewEntrancePlayVvIconFromXml(), 0);
        } else {
            C1351950lHl.LJIJJLI(getViewEntrancePlayVvIconFromXml());
            if (zLJIIIIZZ && C0TNQ.LJIIIZ() && jLIZLLL > 0) {
                getViewEntranceTextFromXml().setText(getResources().getString(2131858189));
                this.LLJJ = true;
                C0TNQ.LIZ.getClass();
                if (C0TNQ.LIZIZ(C0TSK.LIZLLL(C0TNQ.LJ("last_show_time")), System.currentTimeMillis()) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("increaseOnlyWhenTipsShowInDifferentDay isDifferentDay:[");
                sbLIZ.append(!z2);
                sbLIZ.append("}]");
                C1344030l4z.LIZJ("VideoViewerAuthControlHelper", C2188811AlT.LIZIZ(sbLIZ));
                if (!z2) {
                    C0TSK.LJFF(C0TNQ.LJ("local_tips_show_frequency"), Integer.valueOf(C0TSK.LIZJ(4, C0TNQ.LJ("local_tips_show_frequency"), 0) + 1));
                }
                C0TSK.LJFF(C0TNQ.LJ("last_show_time"), Long.valueOf(System.currentTimeMillis()));
            } else {
                this.LLJJ = false;
            }
        }
        int iIntValue3 = -1;
        if (jLIZLLL <= 0 || !zLJIIIIZZ || (!C729510SjV.LJJ(this.LLJ) && DisablePostViewerListExp.INSTANCE.disable())) {
            TuxTextView viewEntranceTextFromXml = getViewEntranceTextFromXml();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eh, getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -1;
            }
            viewEntranceTextFromXml.setTextColor(iIntValue);
            TuxIconView viewEntrancePlayVvIconFromXml = getViewEntrancePlayVvIconFromXml();
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.eh, getContext());
            if (numLIZJ2 != null) {
                iIntValue3 = numLIZJ2.intValue();
            }
            viewEntrancePlayVvIconFromXml.setTintColor(iIntValue3);
        } else {
            TuxTextView viewEntranceTextFromXml2 = getViewEntranceTextFromXml();
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ee, getContext());
            if (numLIZJ3 != null) {
                iIntValue2 = numLIZJ3.intValue();
            } else {
                iIntValue2 = -1;
            }
            viewEntranceTextFromXml2.setTextColor(iIntValue2);
            TuxIconView viewEntrancePlayVvIconFromXml2 = getViewEntrancePlayVvIconFromXml();
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ee, getContext());
            if (numLIZJ4 != null) {
                iIntValue3 = numLIZJ4.intValue();
            }
            viewEntrancePlayVvIconFromXml2.setTintColor(iIntValue3);
        }
        C1233350iCT.LIZ(new C0TNO(this, jLIZLLL, c013c, zLJIIIIZZ), false);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7));
        Object parent = getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            HandlerHook.viewPost(view, new ARunnableS0S0204000_1(iLIZIZ, iLIZIZ2, this, view, 0));
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC372950Ejl() { // from class: X.0TNM
            @Override // X.AbstractViewOnClickListenerC372950Ejl
            public final void LIZ(View view2) {
                String aid2;
                String eventType5;
                String aid3;
                if (view2 != null && !DisablePostViewerListExp.INSTANCE.disable()) {
                    c013c.element = C0TNQ.LJFF();
                    this.LIZIZ(jLIZLLL, "video_views_banner_click", c013c.element, zLJIIIIZZ);
                    if (this.LLJJ) {
                        C0TNQ.LIZ.getClass();
                        C0TSK.LJFF(C0TNQ.LJ("last_click_tips_time"), Long.valueOf(System.currentTimeMillis()));
                        this.LIZLLL(null);
                    }
                    if (!zLJIIIIZZ) {
                        C1389890mGx c1389890mGx = new C1389890mGx(this);
                        c1389890mGx.LJIIJ(this.getResources().getString(2131858198));
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                    if (jLIZLLL <= 0) {
                        return;
                    }
                    String str3 = "";
                    if (!c013c.element) {
                        Context context = this.getContext();
                        C2189821An6 c2189821An66 = this.LLJI;
                        if (c2189821An66 == null || (eventType5 = c2189821An66.getEventType()) == null) {
                            eventType5 = "";
                        }
                        Aweme aweme12 = this.LLJ;
                        if (aweme12 != null && (aid3 = aweme12.getAid()) != null) {
                            str3 = aid3;
                        }
                        C745610TMp.LIZ(context, eventType5, false, str3, new DialogInterface.OnDismissListener() { // from class: X.0TNN
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                            }
                        });
                        return;
                    }
                    Aweme aweme13 = this.LLJ;
                    if (aweme13 != null && (aid2 = aweme13.getAid()) != null) {
                        str3 = aid2;
                    }
                    C1440005kM.LIZ(new C2038607yi(str3, false));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(700L);
            }
        }, this);
        ViewPropertyAnimator viewPropertyAnimator = this.LLJILJILJ;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.LLJILJIL;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        ViewPropertyAnimator duration = animate().setInterpolator(this.LLJILLL).alpha(1.0f).setDuration(150L);
        this.LLJILJILJ = duration;
        if (duration != null) {
            duration.start();
        }
        C844470XAv.LIZ.getClass();
        if (TextUtils.equals(C844470XAv.LJIILL, "local_test")) {
            setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0TMu
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    C0TNQ.LIZ.getClass();
                    C0TSK.LJFF(C0TNQ.LJ("last_show_time"), 0L);
                    C0TSK.LJFF(C0TNQ.LJ("local_tips_show_frequency"), 0);
                    C0TSK.LJFF(C0TNQ.LJ("last_click_tips_time"), 0L);
                    C0TSK.LJFF(C0TNQ.LJ("local_pop_up_show_frequency"), 0);
                    return false;
                }
            });
        }
    }

    @C14EU
    public final void onAuthChangeEvent(C2036907yR c2036907yR) {
        if (c2036907yR != null && c2036907yR.LIZIZ) {
            refresh();
        }
    }

    @C14EU
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        String aid;
        String uid;
        if (c888460YtI == null) {
            return;
        }
        LruCache<String, ViewerListResponse> aidViewerListCache = getAidViewerListCache();
        Aweme aweme = this.LLJ;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        List<User> viewerList = aidViewerListCache.get(aid).getViewerList();
        if (viewerList != null) {
            Iterator<User> it2 = viewerList.iterator();
            while (it2.hasNext()) {
                String uid2 = it2.next().getUid();
                User user = c888460YtI.LIZ;
                if (user != null) {
                    uid = user.getUid();
                } else {
                    uid = null;
                }
                if (Intrinsics.LJFF(uid2, uid)) {
                    refresh();
                    return;
                }
            }
        }
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        String aid;
        C0RD4 c0rd42 = c0rd4;
        C1344030l4z.LIZJ("VideoViewerEntrance", String.valueOf(c0rd42.LIZ));
        if (this.LLJJI) {
            this.LLJJI = false;
        }
        String str = c0rd42.LIZ;
        String aid2 = null;
        if (str.hashCode() == 909926994 && str.equals("REFRESH_ENTRANCE_VIDEO_VIEW_SUCCESS")) {
            Object obj = c0rd42.LIZIZ;
            if (obj == null) {
                obj = null;
            }
            Pair pair = (Pair) obj;
            Object first = pair.getFirst();
            Aweme aweme = this.LLJ;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(first, aid)) {
                ViewerListResponse viewerListResponse = (ViewerListResponse) pair.getSecond();
                LruCache<String, ViewerListResponse> aidViewerListCache = getAidViewerListCache();
                Aweme aweme2 = this.LLJ;
                if (aweme2 != null) {
                    aid2 = aweme2.getAid();
                }
                aidViewerListCache.put(aid2, viewerListResponse);
                LIZLLL(viewerListResponse);
                return;
            }
            return;
        }
        LIZLLL(null);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate ");
        sbLIZ.append(lifecycleOwner);
        C1344030l4z.LIZJ("VideoViewerEntrance", C2188811AlT.LIZIZ(sbLIZ));
        C622680Oba.LIZJ(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy ");
        sbLIZ.append(lifecycleOwner);
        C1344030l4z.LIZJ("VideoViewerEntrance", C2188811AlT.LIZIZ(sbLIZ));
        C622680Oba.LIZLLL(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPause ");
        sbLIZ.append(lifecycleOwner);
        C1344030l4z.LIZJ("VideoViewerEntrance", C2188811AlT.LIZIZ(sbLIZ));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume(LifecycleOwner lifecycleOwner) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume ");
        sbLIZ.append(lifecycleOwner);
        C1344030l4z.LIZJ("VideoViewerEntrance", C2188811AlT.LIZIZ(sbLIZ));
    }

    @C14EU
    public final void onSavaAuthStatusWhenDialogIsClosed(C745620TMq c745620TMq) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSavaAuthStatusWhenDialogIsClosed ");
        sbLIZ.append((Object) null);
        C1344030l4z.LIZJ("VideoViewerEntrance", C2188811AlT.LIZIZ(sbLIZ));
    }

    @C14EU
    public final void onUpdatePrivacySettingEvent(C2037307yV c2037307yV) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUpdatePrivacySettingEvent by ");
        if (c2037307yV != null) {
            str = c2037307yV.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C1344030l4z.LIZJ("VideoViewerEntrance", C2188811AlT.LIZIZ(sbLIZ));
        refresh();
    }

    public final void setPrivacyBtnFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setViewEntrancePlayVvIconFromXml(TuxIconView tuxIconView) {
        this.LLILLL = tuxIconView;
    }

    public final void setViewEntranceTextFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[PHI: r0
      0x0040: PHI (r0v23 androidx.lifecycle.Lifecycle) = (r0v6 androidx.lifecycle.Lifecycle), (r0v24 androidx.lifecycle.Lifecycle) binds: [B:19:0x003e, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r7, X.C2189821An6 r8) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.LLJ
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.String r1 = r0.getAid()
        Lc:
            java.lang.String r0 = r7.getAid()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L17
            return
        L17:
            java.lang.String r1 = "VideoViewerEntrance"
            java.lang.String r0 = "bind entrance "
            X.C1344030l4z.LIZJ(r1, r0)
            r6.LLJ = r7
            r6.LLJI = r8
            androidx.fragment.app.Fragment r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LIZJ(r6)
            if (r0 == 0) goto L2e
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 != 0) goto L40
        L2e:
            android.content.Context r1 = r6.getContext()
            boolean r0 = r1 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L43
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            if (r1 == 0) goto L43
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            if (r0 == 0) goto L43
        L40:
            r0.addObserver(r6)
        L43:
            if (r8 == 0) goto L99
            boolean r1 = r8.getShowPlaylistViewerEntrance()
            r0 = 1
            if (r1 != r0) goto L99
        L4c:
            r4 = 0
            if (r0 != 0) goto L7e
            boolean r3 = r6.LLJJI
            android.view.ViewPropertyAnimator r0 = r6.LLJILJILJ
            if (r0 == 0) goto L59
            r0.cancel()
        L59:
            android.view.ViewPropertyAnimator r0 = r6.LLJILJIL
            if (r0 == 0) goto L60
            r0.cancel()
        L60:
            android.view.ViewPropertyAnimator r1 = r6.animate()
            android.view.animation.AccelerateDecelerateInterpolator r0 = r6.LLJILLL
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r0)
            r0 = 0
            android.view.ViewPropertyAnimator r2 = r1.alpha(r0)
            if (r3 == 0) goto L96
            r0 = 0
        L73:
            android.view.ViewPropertyAnimator r0 = r2.setDuration(r0)
            r6.LLJILJIL = r0
            if (r0 == 0) goto L7e
            r0.start()
        L7e:
            long r1 = X.C0TNQ.LIZLLL(r7)
            boolean r0 = X.C0TNQ.LJFF()
            if (r0 == 0) goto L9b
            boolean r0 = X.C0TNQ.LJIIIIZZ(r7)
            if (r0 == 0) goto L9b
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L9b
            r6.refresh()
            return
        L96:
            r0 = 150(0x96, double:7.4E-322)
            goto L73
        L99:
            r0 = 0
            goto L4c
        L9b:
            Y.ARunnableS81S0200000_12 r2 = new Y.ARunnableS81S0200000_12
            r0 = 45
            r2.<init>(r7, r6, r0)
            r0 = 400(0x190, double:1.976E-321)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r6, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1233330iCR.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, X.1An6):void");
    }

    public final void LIZIZ(long j, String str, boolean z, boolean z2) {
        String eventType;
        String str2;
        C2189821An6 c2189821An6 = this.LLJI;
        String groupId = null;
        if (c2189821An6 != null) {
            eventType = c2189821An6.getEventType();
        } else {
            eventType = null;
        }
        Aweme aweme = this.LLJ;
        if (aweme != null) {
            groupId = aweme.getGroupId();
        }
        if (C729510SjV.LJJ(this.LLJ)) {
            str2 = "story";
        } else {
            str2 = "post";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", eventType);
        c2344009Gk.LJIIIIZZ("group_id", groupId);
        c2344009Gk.LIZLLL(j, "views_cnt");
        c2344009Gk.LIZJ(z ? 1 : 0, "video_views_status");
        c2344009Gk.LIZJ(z2 ? 1 : 0, "is_seven_days");
        c2344009Gk.LJIIIIZZ("story_type", str2);
        C1350920lG6.LJJJ(c2344009Gk, str);
    }
}

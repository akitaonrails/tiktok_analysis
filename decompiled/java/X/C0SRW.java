package X;

import Y.AObserverS215S0100000_11;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.PhotoModeIngressEtData;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.service.ICLAPerfETService;
import com.ss.android.ugc.aweme.ui.activity.PostModeDetailActivity;
import com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailPageFragment;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailRootFragment;
import com.ss.android.ugc.aweme.viewmodel.PostModePageViewModel;
import com.ss.android.ugc.aweme.viewmodel.PostModeTimeLoggerViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SRW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SRW {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C0SRX c0srx) {
        FragmentManager fragmentManagerLJIIJJI;
        PostModeDetailPageFragment postModeDetailPageFragment;
        int i;
        Fragment fragment;
        if (c0srx instanceof PostModeDetailActivity) {
            fragmentManagerLJIIJJI = ((C19EG) c0srx).getSupportFragmentManager();
        } else if (c0srx instanceof PostModeDetailRootFragment) {
            fragmentManagerLJIIJJI = SAFExtensionKt.LJIIJJI((Fragment) c0srx);
        } else {
            return;
        }
        if (fragmentManagerLJIIJJI != null) {
            Fragment fragmentLJJJJZI = fragmentManagerLJIIJJI.LJJJJZI("POST_MODE_DETAIL_PAGE_FRAGMENT");
            if (!(fragmentLJJJJZI instanceof PostModeDetailPageFragment) || (postModeDetailPageFragment = (PostModeDetailPageFragment) fragmentLJJJJZI) == null) {
                String str = PostModeDetailPageFragment._pnsPageId;
                Bundle bundleLIZJ = LIZJ(c0srx);
                postModeDetailPageFragment = new PostModeDetailPageFragment();
                postModeDetailPageFragment.setArguments(bundleLIZJ);
            }
            c0srx.DP(postModeDetailPageFragment);
            if (c0srx instanceof PostModeDetailActivity) {
                i = R.id.rks;
            } else {
                i = R.id.rkz;
            }
            Object objN6 = c0srx.N6();
            if ((objN6 instanceof PostModeDetailPageFragment) && (fragment = (Fragment) objN6) != null) {
                C19EH c19ehLJIIJ = fragmentManagerLJIIJJI.LJIIJ();
                c19ehLJIIJ.LJIJ(i, fragment, "POST_MODE_DETAIL_PAGE_FRAGMENT");
                c19ehLJIIJ.LJIIJ();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Bundle LIZJ(C0SRX c0srx) {
        Bundle bundle;
        if (c0srx instanceof PostModeDetailActivity) {
            try {
                bundle = ((BaseActivity) c0srx).getIntent().getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                bundle = null;
            }
            if (bundle == null) {
                bundle = new Bundle();
            }
        } else if (!(c0srx instanceof PostModeDetailRootFragment) || (bundle = ((Fragment) c0srx).getArguments()) == null) {
            bundle = new Bundle();
        }
        PostModeDetailParams postModeDetailParamsH = c0srx.H();
        boolean z = false;
        if (postModeDetailParamsH != null && postModeDetailParamsH.enableFloat) {
            z = true;
        }
        bundle.putBoolean("is_float_opt", z);
        return bundle;
    }

    public static void LJ(C0SRX c0srx) {
        if ((c0srx instanceof PostModeDetailActivity) || (c0srx instanceof PostModeDetailRootFragment)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) c0srx;
            if (lifecycleOwner != null) {
                c0srx.getViewModel().LLJJJ.observe(lifecycleOwner, new AObserverS215S0100000_11(c0srx, 38));
                c0srx.getViewModel().LLJJJJLIIL.observe(lifecycleOwner, new AObserverS215S0100000_11(c0srx, 39));
                if (ComplianceServiceProvider.LJI().LJIIJ(false)) {
                    ComplianceServiceProvider.LJI().LJJIII().observe(lifecycleOwner, new AObserverS215S0100000_11(c0srx, 40));
                }
            }
        }
    }

    public static void LJFF(C0SRX c0srx) {
        C0SRZ c0srzN6 = c0srx.N6();
        if (c0srzN6 == null || !c0srzN6.LLLLIIL()) {
            PostModeDetailParams postModeDetailParamsH = c0srx.H();
            if (postModeDetailParamsH != null && postModeDetailParamsH.useSwipeEnterAnim) {
                c0srx.getViewModel().vQ2(EnumC721170SQp.BACK_USE_SWIPE_ANIM);
            } else {
                c0srx.getViewModel().vQ2(EnumC721170SQp.BACK);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static void LJI(C0SRX c0srx) {
        SAFFragmentRootScene sAFFragmentRootSceneIb;
        Context sceneContext;
        boolean z = c0srx instanceof PostModeDetailActivity;
        PhotoModeIngressEtData photoModeIngressEtData = null;
        if (z) {
            sceneContext = (Context) c0srx;
        } else if ((c0srx instanceof PostModeDetailRootFragment) && (sAFFragmentRootSceneIb = ((SAFTikTokFragment) c0srx).ib()) != null) {
            sceneContext = sAFFragmentRootSceneIb.getSceneContext();
        } else {
            return;
        }
        if (sceneContext != null) {
            if (z) {
                PhotoSharedViewModel photoSharedViewModelLA = ((PostModeDetailActivity) c0srx).LA();
                C19EG c19eg = (C19EG) c0srx;
                photoSharedViewModelLA.getClass();
                if (C281410B1f.LIZ() && photoSharedViewModelLA.LLJJIJI == null) {
                    photoSharedViewModelLA.LLJJIJIIJIL = C161N.LIZIZ.LJJZZIII(c19eg, photoSharedViewModelLA.LL);
                }
            } else if (c0srx instanceof PostModeDetailRootFragment) {
                PhotoSharedViewModel photoSharedViewModelLA2 = ((PostModeDetailRootFragment) c0srx).LA();
                Fragment fragment = (Fragment) c0srx;
                photoSharedViewModelLA2.getClass();
                if (C281410B1f.LIZ() && photoSharedViewModelLA2.LLJJIJI == null) {
                    photoSharedViewModelLA2.LLJJIJIIJIL = C161N.LIZIZ.LJI(fragment, photoSharedViewModelLA2.LL);
                }
            }
            c0srx.vy(sceneContext);
            c0srx.M9();
            PostModeTimeLoggerViewModel postModeTimeLoggerViewModelSJ = c0srx.SJ();
            PostModeDetailParams postModeDetailParams = c0srx.LA().LLILZIL;
            if (postModeDetailParams != null) {
                photoModeIngressEtData = postModeDetailParams.photoModeIngressEtData;
            }
            postModeTimeLoggerViewModelSJ.LLILLJJLI = photoModeIngressEtData;
            c0srx.LLLLLLIL();
            PhotoSharedViewModel photoSharedViewModelLA3 = c0srx.LA();
            photoSharedViewModelLA3.getClass();
            C1EE2 c1ee2 = C1EE2.LIZIZ;
            if (c1ee2.LIZLLL()) {
                photoSharedViewModelLA3.LLJJIII = true;
                boolean zLIZLLL = c1ee2.LIZLLL();
                VideoItemParams videoItemParams = photoSharedViewModelLA3.LL;
                if (videoItemParams != null) {
                    videoItemParams.setIsEnterGraphicDetail(zLIZLLL ? 1 : 0);
                }
            }
            if (c0srx instanceof PostModeDetailActivity) {
                C18JG.LJI((Activity) c0srx, "a2270.b1432", LIZJ(c0srx).getString("source_btm_token"));
            } else {
                if (!(c0srx instanceof PostModeDetailRootFragment)) {
                    return;
                }
                C18JG.LJII((Fragment) c0srx, "a2270.b1432", LIZJ(c0srx).getString("source_btm_token"));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJII(C0SRX c0srx) {
        SAFFragmentRootScene sAFFragmentRootSceneIb;
        Context sceneContext;
        boolean z;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF;
        if (c0srx instanceof PostModeDetailActivity) {
            sceneContext = (Context) c0srx;
        } else if ((c0srx instanceof PostModeDetailRootFragment) && (sAFFragmentRootSceneIb = ((SAFTikTokFragment) c0srx).ib()) != null) {
            sceneContext = sAFFragmentRootSceneIb.getSceneContext();
        } else {
            return;
        }
        if (sceneContext != null) {
            c0srx.LI(c0srx.LA().LLILZIL);
            PostModePageViewModel viewModel = c0srx.getViewModel();
            PostModeDetailParams postModeDetailParamsH = c0srx.H();
            viewModel.getClass();
            if (postModeDetailParamsH != null) {
                viewModel.LLLILZJ = new C0SSI(sceneContext, postModeDetailParamsH);
                InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(viewModel);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C464901rT(viewModel, null), 2);
            }
            PostModePageViewModel viewModel2 = c0srx.getViewModel();
            if (c0srx.cw() && ((Boolean) C0B1R.LIZ.getValue()).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            viewModel2.LLILZ = z;
            if (c0srx instanceof PostModeDetailActivity) {
                interfaceC665370Q7zLJFF = C1558360qeg.LJI((C19EG) c0srx, null);
            } else {
                if (c0srx instanceof PostModeDetailRootFragment) {
                    interfaceC665370Q7zLJFF = C1558360qeg.LJFF((Fragment) c0srx, null);
                }
                if (c0srx.H() != null || c0srx.LA().LLILLJJLI == null) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from", c0srx.getEnterFrom());
                    c2344009Gk.LIZJ(c0srx instanceof PostModeDetailRootFragment ? 1 : 0, "is_single_activity");
                    C20684815ws.LJIILLIIL("photo_mode_full_page_recycle", c2344009Gk.LIZ);
                    C2344809Gs.LJI(new Exception("Full page was launched without params"));
                    LJIIJJI(c0srx);
                }
                return;
            }
            if (interfaceC665370Q7zLJFF != null) {
                C1554960qZC.LIZ(interfaceC665370Q7zLJFF, c0srx.GL(), CommentContextSource.class, "source_default_key");
            }
            if (c0srx.H() != null) {
            }
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", c0srx.getEnterFrom());
            c2344009Gk2.LIZJ(c0srx instanceof PostModeDetailRootFragment ? 1 : 0, "is_single_activity");
            C20684815ws.LJIILLIIL("photo_mode_full_page_recycle", c2344009Gk2.LIZ);
            C2344809Gs.LJI(new Exception("Full page was launched without params"));
            LJIIJJI(c0srx);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIIIZZ(C0SRX c0srx) {
        PagerAdapter adapter;
        CommonPageFragment commonPageFragmentLJJIJLIJ;
        PostModeDetailFragment postModeDetailFragment;
        Aweme aweme;
        PostModeDetailParams postModeDetailParams;
        C1590400rUM c1590400rUM;
        C21599719g3 c21599719g3Mo34LLLIIIIL;
        C0SRZ c0srzN6 = c0srx.N6();
        PostModeEntranceMechanism postModeEntranceMechanism = null;
        if (c0srzN6 != null && (c21599719g3Mo34LLLIIIIL = c0srzN6.mo34LLLIIIIL()) != null) {
            adapter = c21599719g3Mo34LLLIIIIL.getAdapter();
        } else {
            adapter = null;
        }
        if ((adapter instanceof C1590400rUM) && (c1590400rUM = (C1590400rUM) adapter) != null) {
            commonPageFragmentLJJIJLIJ = c1590400rUM.LJJIJLIJ("PostModeDetailFragment");
        } else {
            commonPageFragmentLJJIJLIJ = null;
        }
        if ((commonPageFragmentLJJIJLIJ instanceof PostModeDetailFragment) && (postModeDetailFragment = (PostModeDetailFragment) commonPageFragmentLJJIJLIJ) != null) {
            C0SRL c0srl = postModeDetailFragment.LLJILJIL;
            if (c0srl != null && (postModeDetailParams = c0srl.LJII) != null) {
                postModeEntranceMechanism = postModeDetailParams.postModeEntranceMechanism;
            }
            if (postModeEntranceMechanism == PostModeEntranceMechanism.SEARCH_TAB_CARD_GENERAL && c0srl != null && (aweme = c0srl.LIZJ) != null) {
                C1ER1.LIZIZ.M0(aweme, postModeDetailFragment.getPlayerManager(), ((C0S9P) postModeDetailFragment.VR().getState()).LL);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIIZ(C0SRX c0srx) {
        Long l;
        String str;
        EnumC721170SQp enumC721170SQp = (EnumC721170SQp) c0srx.getViewModel().LLILZLL.getValue();
        PostModeTimeLoggerViewModel postModeTimeLoggerViewModelSJ = c0srx.SJ();
        Aweme aweme = c0srx.LA().LLILLJJLI;
        boolean zLIZ = C0SKE.LIZ(c0srx.H());
        HashMap<String, String> map = new HashMap<>();
        map.putAll(C2097608Jq.LJIIZILJ(c0srx.getViewModel().wQ2()));
        PostModeDetailParams postModeDetailParamsH = c0srx.H();
        String str2 = null;
        if (postModeDetailParamsH != null) {
            l = postModeDetailParamsH.exploreTabId;
        } else {
            l = null;
        }
        map.put("explore_topic_id", String.valueOf(l));
        PostModeDetailParams postModeDetailParamsH2 = c0srx.H();
        if (postModeDetailParamsH2 != null) {
            str = postModeDetailParamsH2.exploreTabName;
        } else {
            str = null;
        }
        map.put("explore_topic", String.valueOf(str));
        PostModeDetailParams postModeDetailParamsH3 = c0srx.H();
        if (postModeDetailParamsH3 != null) {
            str2 = postModeDetailParamsH3.fromExplorePage;
        }
        map.put("from_explore_page", String.valueOf(str2));
        postModeTimeLoggerViewModelSJ.wQ2(aweme, enumC721170SQp, zLIZ, map);
        c0srx.getViewModel().LLJJIJI.setValue(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIJJI(C0SRX c0srx) {
        if (c0srx instanceof PostModeDetailActivity) {
            ((PostModeDetailActivity) c0srx).finish();
        } else {
            if (!(c0srx instanceof PostModeDetailRootFragment)) {
                return;
            }
            ((SAFTikTokFragment) c0srx).finish();
        }
    }

    public static void LJIIL(C0SRX c0srx) {
        Integer numLIZJ;
        View viewNd = c0srx.Nd();
        if (viewNd == null) {
            return;
        }
        View viewFindViewById = viewNd.findViewById(R.id.rkz);
        Context context = viewNd.getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null && viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(numLIZJ.intValue());
        }
    }

    public static void LIZIZ(C0SRX c0srx, KeyEvent keyEvent) {
        boolean z;
        if (C255680A0g.LIZ() && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 4) {
            if ((keyEvent.getFlags() & 64) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((keyEvent.getFlags() & 8) != 0) {
                if (z) {
                    c0srx.getViewModel().LL = EnumC721170SQp.BACKPRESS_VIRTUAL_GESTURE;
                } else {
                    c0srx.getViewModel().LL = EnumC721170SQp.BACKPRESS_VIRTUAL_ICON;
                }
            }
        }
    }

    public static void LJIIJ(C0SRX c0srx, Context context) {
        String str;
        String str2;
        Aweme aweme = c0srx.LA().LLILLJJLI;
        if (aweme != null && C582980Mtk.LIZIZ(aweme) && C281410B1f.LIZ()) {
            VideoItemParams videoItemParams = c0srx.LA().LL;
            Aweme aweme2 = null;
            if (videoItemParams != null) {
                str = videoItemParams.mEventType;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "homepage_explore")) {
                C161N c161n = C161N.LIZIZ;
                if (c161n.LJJJJZ(c0srx.LA().LLILLJJLI) || c161n.LJJJ(c0srx.LA().LLILLJJLI)) {
                    ICLAPerfETService iCLAPerfETServiceLIZ = C1485670olR.LIZ();
                    WeakReference<Context> weakReference = new WeakReference<>(context);
                    VideoItemParams videoItemParams2 = c0srx.LA().LL;
                    if (videoItemParams2 != null) {
                        aweme2 = videoItemParams2.getAweme();
                    }
                    VideoItemParams videoItemParams3 = c0srx.LA().LL;
                    if (videoItemParams3 == null || (str2 = videoItemParams3.mEventType) == null) {
                        str2 = "";
                    }
                    iCLAPerfETServiceLIZ.LJIILJJIL(weakReference, aweme2, str2, true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Type inference failed for: r14v0, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.0SRI, android.view.View] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C0SRI LJIILIIL(X.C0SRX r12, android.content.Context r13, android.widget.FrameLayout r14, kotlin.jvm.functions.Function0<kotlin.Unit> r15) {
        /*
            X.0SRZ r0 = r12.N6()
            java.lang.String r2 = "PostModeCrash"
            r1 = 4
            r3 = 0
            if (r0 == 0) goto L96
            X.19g3 r0 = r0.mo34LLLIIIIL()
            if (r0 == 0) goto L91
            androidx.viewpager.widget.PagerAdapter r4 = r0.getAdapter()
        L14:
            boolean r0 = r4 instanceof X.C1590400rUM
            if (r0 == 0) goto L96
            X.0rUM r4 = (X.C1590400rUM) r4
            if (r4 == 0) goto L96
            java.lang.String r0 = "PostModeDetailFragment"
            com.ss.android.ugc.aweme.base.ui.CommonPageFragment r4 = r4.LJJIJLIJ(r0)
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment
            if (r0 == 0) goto L93
            com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment r4 = (com.ss.android.ugc.aweme.ui.fragment.PostModeDetailFragment) r4
            if (r4 == 0) goto L93
            X.0SRL r9 = r4.LLJILJIL
            if (r9 == 0) goto L8b
            boolean r0 = r4.WR()
            r10 = r15
            r6 = r13
            if (r0 == 0) goto L77
            X.0SOh r5 = new X.0SOh
            com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel r0 = r4.VR()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r7 = r0.LLILLL
            com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel r8 = r4.UR()
            com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel r11 = r4.RR()
            r5.<init>(r6, r7, r8, r9, r10, r11)
        L49:
            r14.addView(r5)
            r4.LLJJJ = r5
        L4e:
            X.0SRI r4 = r4.LLJJJ
        L50:
            X.0SRZ r0 = r12.N6()
            if (r0 != 0) goto L5b
            java.lang.String r0 = "postmodedetailpagefragment is null"
            X.C2344809Gs.LIZLLL(r1, r2, r0)
        L5b:
            X.0SRZ r0 = r12.N6()
            if (r0 == 0) goto L6b
            X.19g3 r0 = r0.mo34LLLIIIIL()
            if (r0 == 0) goto L6b
            androidx.viewpager.widget.PagerAdapter r3 = r0.getAdapter()
        L6b:
            boolean r0 = r3 instanceof X.C1590400rUM
            if (r0 == 0) goto L71
            if (r3 != 0) goto L76
        L71:
            java.lang.String r0 = "viewpager adapter is null"
            X.C2344809Gs.LIZLLL(r1, r2, r0)
        L76:
            return r4
        L77:
            X.0SOg r5 = new X.0SOg
            com.ss.android.ugc.aweme.ui.feed.photos.PostModeFullPageViewModel r0 = r4.VR()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r7 = r0.LLILLL
            com.ss.android.ugc.aweme.ui.common.PhotoSharedViewModel r8 = r4.UR()
            com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel r11 = r4.RR()
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L49
        L8b:
            java.lang.String r0 = "postmodemodel  is null"
            X.C2344809Gs.LIZLLL(r1, r2, r0)
            goto L4e
        L91:
            r4 = r3
            goto L14
        L93:
            LJIIJJI(r12)
        L96:
            r4 = r3
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SRW.LJIILIIL(X.0SRX, android.content.Context, android.widget.FrameLayout, kotlin.jvm.functions.Function0):X.0SRI");
    }

    public static boolean LJIILJJIL(String str, String str2, String str3, PostModeDetailParams postModeDetailParams) {
        String str4;
        boolean zLJFF = Intrinsics.LJFF(str, "others_homepage");
        String currentUserID = null;
        if (!zLJFF) {
            if (postModeDetailParams != null) {
                str4 = postModeDetailParams.previousPage;
            } else {
                str4 = null;
            }
            if (!Intrinsics.LJFF(str4, "personal_homepage")) {
                return true;
            }
        }
        if (!Intrinsics.LJFF(str2, "repost_history") && !Intrinsics.LJFF(str2, "like")) {
            return false;
        }
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null) {
            currentUserID = iUserService.getCurrentUserID();
        }
        if (Intrinsics.LJFF(str3, currentUserID)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(X.C0SRX r19, com.ss.android.ugc.aweme.feed.model.Aweme r20, com.ss.android.ugc.aweme.model.PostModeDetailParams r21, java.lang.String r22, java.lang.String r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SRW.LIZLLL(X.0SRX, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.model.PostModeDetailParams, java.lang.String, java.lang.String):void");
    }
}

package X;

import Y.ARunnableS50S0300000_17;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.browser.IHybridContainerManageService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicPlaybookRevertSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0fBJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1117310fBJ extends AbstractC2436909gl<C2436109gd> {
    public static boolean LIZLLL;
    public static WeakReference<DataChannel> LJ;
    public final C1117220fBA LIZIZ;
    public int LIZJ = 5;

    public abstract boolean LJFF(Context context, C2436109gd c2436109gd);

    public abstract void LJI(Context context, C2436109gd c2436109gd, Map map);

    public abstract boolean LJII(C2436109gd c2436109gd);

    public abstract boolean LJIIIZ(C2436109gd c2436109gd);

    public AbstractC1117310fBJ(C1117220fBA c1117220fBA) {
        this.LIZIZ = c1117220fBA;
    }

    public static Fragment LJ(FragmentManager fragmentManager) {
        List<Fragment> listLJJLIIIJL;
        int size;
        if (fragmentManager != null && (listLJJLIIIJL = fragmentManager.LJJLIIIJL()) != null && listLJJLIIIJL.size() - 1 >= 0) {
            while (true) {
                int i = size - 1;
                Fragment fragment = (Fragment) ListProtector.get(listLJJLIIIJL, size);
                if (fragment.isVisible()) {
                    return fragment;
                }
                if (i < 0) {
                    break;
                }
                size = i;
            }
        }
        return null;
    }

    public final Uri LJIIJ(Uri uri) {
        Long lValueOf;
        String str;
        boolean z;
        Uri.Builder builder = new Uri.Builder();
        Iterator<String> it2 = LIZLLL().iterator();
        while (it2.hasNext()) {
            builder.appendQueryParameter(it2.next(), "1");
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf = null;
        }
        String strLIZIZ = C1942307jB.LIZIZ(uri, "should_close_page");
        if (strLIZIZ == null) {
            strLIZIZ = CardStruct.IStatusCode.DEFAULT;
        }
        String str2 = "true";
        if (Intrinsics.LJFF(strLIZIZ, "1")) {
            str = "true";
        } else {
            str = "false";
        }
        Uri.Builder builderAppendQueryParameter = builder.scheme("sslocal").authority("one_tap_go_live").appendQueryParameter("check_linkmic_permission", "1").appendQueryParameter("multi_guest_enable", "1").appendQueryParameter("origin_schema", uri.getScheme()).appendQueryParameter("skip", "true");
        if (lValueOf != null && UserService.getInstance().user().getCurrentUserId() != lValueOf.longValue()) {
            z = true;
        } else {
            z = false;
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("should_close_room", String.valueOf(z)).appendQueryParameter("should_close_h5_page", str);
        String strLIZIZ2 = C1942307jB.LIZIZ(uri, "should_go_live_alert");
        if (strLIZIZ2 != null) {
            str2 = strLIZIZ2;
        }
        builderAppendQueryParameter2.appendQueryParameter("should_go_live_alert", str2);
        for (String str3 : UriProtector.getQueryParameterNames(uri)) {
            builder.appendQueryParameter(str3, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3));
        }
        return builder.build();
    }

    @Override // X.AbstractC2437009gm
    public final boolean LIZJ(final Context context, final C2436109gd c2436109gd, final Map<String, String> map) {
        final C19EG topFragmentActivity;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uri: ");
        sbLIZ.append(c2436109gd.LIZ);
        C20441214yg.LIZIZ("BasePlaybookSchemaHandler", C2188811AlT.LIZIZ(sbLIZ));
        if (LinkMicPlaybookRevertSetting.INSTANCE.getValue()) {
            C766270U4b.LIZLLL(2131855291);
            return false;
        }
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        String simpleName = null;
        if (iHostAction != null) {
            topFragmentActivity = iHostAction.getTopFragmentActivity();
            if (topFragmentActivity != null) {
                simpleName = topFragmentActivity.getClass().getSimpleName();
            }
        } else {
            topFragmentActivity = null;
        }
        if (Intrinsics.LJFF(simpleName, "ScanQRCodeActivityV2")) {
            Application application = topFragmentActivity.getApplication();
            if (application != null) {
                application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0fBI
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityCreated(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityPaused(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityResumed(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStarted(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityStopped(Activity activity) {
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public final void onActivityDestroyed(Activity activity) throws JSONException {
                        this.LL.LJIIIIZZ(context, c2436109gd, map);
                        topFragmentActivity.getApplication().unregisterActivityLifecycleCallbacks(this);
                    }
                });
                return true;
            }
            return true;
        }
        return LJIIIIZZ(context, c2436109gd, map);
    }

    public final boolean LJIIIIZZ(Context context, final C2436109gd c2436109gd, final Map<String, String> map) throws JSONException {
        SparkActivity sparkActivity;
        String strLIZIZ;
        boolean z;
        boolean z2;
        String strLIZIZ2;
        String strLIZIZ3;
        Application application;
        Uri uri;
        String strLIZIZ4;
        String strLLLLLZL;
        Activity topActivity = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopActivity();
        DataChannel dataChannel = null;
        if (topActivity instanceof SparkActivity) {
            sparkActivity = (SparkActivity) topActivity;
        } else {
            sparkActivity = null;
        }
        if (sparkActivity != null && (strLLLLLZL = sparkActivity.LLLLLZL()) != null) {
            try {
                strLIZIZ = C1942307jB.LIZIZ(UriProtector.parse(C1107580evc.LIZIZ(UriProtector.parse(strLLLLLZL))), "activityId");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("parse url error:");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("BasePlaybookSchemaHandler", C2188811AlT.LIZIZ(sbLIZ));
                strLIZIZ = null;
            }
        } else {
            strLIZIZ = null;
        }
        boolean z3 = true;
        if (strLIZIZ != null && (uri = c2436109gd.LIZ) != null && ((strLIZIZ4 = C1942307jB.LIZIZ(uri, "from")) == null || strLIZIZ4.length() == 0)) {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("activityId");
            sbLIZ2.append(strLIZIZ);
            builderBuildUpon.appendQueryParameter("from", C2188811AlT.LIZIZ(sbLIZ2));
            c2436109gd.LIZ = builderBuildUpon.build();
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId()) {
            z = true;
        } else {
            z = false;
        }
        LIZLLL = z;
        FragmentManager topFragmentManager = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopFragmentManager();
        boolean z4 = context instanceof SparkActivity;
        if (!z4 && !(LJ(topFragmentManager) instanceof SparkFragment)) {
            z2 = false;
        } else {
            z2 = true;
        }
        Uri uri2 = c2436109gd.LIZ;
        String str = CardStruct.IStatusCode.DEFAULT;
        String str2 = "1";
        if (uri2 != null) {
            String strLIZIZ5 = C1942307jB.LIZIZ(uri2, "should_close_page");
            if (strLIZIZ5 == null) {
                strLIZIZ5 = CardStruct.IStatusCode.DEFAULT;
            }
            if (Intrinsics.LJFF(strLIZIZ5, "1") && z2 && this.LIZJ > 0) {
                if (z4) {
                    final SparkActivity sparkActivity2 = (SparkActivity) context;
                    if (sparkActivity2 != null && (application = sparkActivity2.getApplication()) != null) {
                        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0fBH
                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityCreated(Activity activity, Bundle bundle) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityPaused(Activity activity) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityResumed(Activity activity) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityStarted(Activity activity) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityStopped(Activity activity) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityDestroyed(Activity activity) {
                                Context context2;
                                if (Intrinsics.LJFF(activity, sparkActivity2)) {
                                    FragmentManager topFragmentManager2 = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopFragmentManager();
                                    this.getClass();
                                    Fragment fragmentLJ = AbstractC1117310fBJ.LJ(topFragmentManager2);
                                    if (fragmentLJ != null && (context2 = fragmentLJ.getContext()) != null) {
                                        this.LIZJ(context2, c2436109gd, map);
                                    } else {
                                        this.LIZJ(((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopActivity(), c2436109gd, map);
                                    }
                                }
                                sparkActivity2.getApplication().unregisterActivityLifecycleCallbacks(this);
                            }
                        });
                    }
                    ((SparkActivity) context).finish();
                    this.LIZJ--;
                    return true;
                }
                ((IHybridContainerManageService) C1161920gLG.LIZJ(IHybridContainerManageService.class)).S82(true);
                this.LIZJ--;
                C786410Ut5.LJLIIL(30L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS50S0300000_17(this, c2436109gd, map, 26));
                return true;
            }
        }
        this.LIZJ = 5;
        Uri uri3 = c2436109gd.LIZ;
        if (uri3 != null) {
            String strLIZIZ6 = C1942307jB.LIZIZ(uri3, "should_go_guide_page");
            if (strLIZIZ6 == null) {
                strLIZIZ6 = CardStruct.IStatusCode.DEFAULT;
            }
            if (Intrinsics.LJFF(strLIZIZ6, "1") && !C500260Jjc.LJJIL()) {
                return LJFF(context, c2436109gd);
            }
            String strLIZIZ7 = C1942307jB.LIZIZ(uri3, "should_go_live");
            if (strLIZIZ7 == null) {
                strLIZIZ7 = "1";
            }
            if (Intrinsics.LJFF(strLIZIZ7, "1") && !LIZLLL) {
                LJI(context, c2436109gd, map);
                return true;
            }
        }
        if (!LIZLLL && !C500260Jjc.LJJIL()) {
            Uri uri4 = c2436109gd.LIZ;
            if (uri4 != null && (strLIZIZ3 = C1942307jB.LIZIZ(uri4, "panel_type")) != null) {
                str2 = strLIZIZ3;
            }
            Integer numLJJLIIJ = C500260Jjc.LJJLIIJ(str2);
            if (numLJJLIIJ == null || numLJJLIIJ.intValue() != 1) {
                z3 = false;
            }
            C0UTJ c0utjPl1 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Pl1(null);
            if (c0utjPl1 != null) {
                c0utjPl1.LJJIIJ(z3);
            }
            return LJIIIZ(c2436109gd);
        }
        Uri uri5 = c2436109gd.LIZ;
        if (uri5 != null && (strLIZIZ2 = C1942307jB.LIZIZ(uri5, "panel_type")) != null) {
            str = strLIZIZ2;
        }
        Integer numLJJLIIJ2 = C500260Jjc.LJJLIIJ(str);
        if (numLJJLIIJ2 == null || numLJJLIIJ2.intValue() != 1) {
            z3 = false;
        }
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        WeakReference<DataChannel> weakReference = LJ;
        if (weakReference != null) {
            dataChannel = weakReference.get();
        }
        C0UTJ c0utjPl12 = iInteractService.Pl1(dataChannel);
        if (c0utjPl12 != null) {
            c0utjPl12.LJJIIJ(z3);
        }
        return LJII(c2436109gd);
    }
}

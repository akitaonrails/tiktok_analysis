package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03pE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C960603pE {
    public static final C993503uX LIZIZ(Fragment fragment) {
        Fragment parentFragment;
        Intent intent;
        C993503uX c993503uXLIZIZ;
        Bundle arguments = fragment.getArguments();
        if ((arguments == null || (c993503uXLIZIZ = TrackNodeStore.LIZLLL(arguments.getString("lib_track_rtn_id", null), fragment)) == null) && ((parentFragment = fragment.getParentFragment()) == null || (c993503uXLIZIZ = LIZIZ(parentFragment)) == null)) {
            C19EG activity = fragment.getActivity();
            if (activity == null || (intent = activity.getIntent()) == null) {
                return null;
            }
            return LIZ(intent, activity);
        }
        return c993503uXLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC1748810vbr LIZJ(Object obj) {
        if (obj instanceof View) {
            return C1748730vbj.LIZ((View) obj);
        }
        InterfaceC1748810vbr interfaceC1748810vbr = null;
        if (obj instanceof RecyclerView.ViewHolder) {
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
            if (viewHolder instanceof InterfaceC1748810vbr) {
                return (InterfaceC1748810vbr) viewHolder;
            }
            Object tag = viewHolder.itemView.getTag(R.id.gib);
            if (!(tag instanceof InterfaceC1748810vbr) || (interfaceC1748810vbr = (InterfaceC1748810vbr) tag) == null) {
                return C1748730vbj.LIZ(viewHolder.itemView);
            }
        } else if (obj instanceof C19EG) {
            C19FO c19fo = (C19FO) obj;
            Intent intent = c19fo.getIntent();
            if (intent != null) {
                return LIZ(intent, c19fo);
            }
        } else if (obj instanceof Fragment) {
            return LIZIZ((Fragment) obj);
        }
        return interfaceC1748810vbr;
    }

    public static String LIZLLL(View view) {
        return TrackNodeStore.LJ(view, null).LL;
    }

    public static String LJ(InterfaceC1748810vbr interfaceC1748810vbr) {
        return TrackNodeStore.LJFF(interfaceC1748810vbr, null).LL;
    }

    public static final C993503uX LIZ(Intent intent, LifecycleOwner lifecycleOwner) {
        String stringExtra;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
        try {
            stringExtra = intent.getStringExtra("lib_track_rtn_id");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        C993503uX c993503uXLIZLLL = TrackNodeStore.LIZLLL(stringExtra, lifecycleOwner);
        if (c993503uXLIZLLL == null) {
            Uri data = intent.getData();
            if (data == null) {
                return null;
            }
            try {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(data, "lib_track_rtn_id");
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            return TrackNodeStore.LIZLLL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, lifecycleOwner);
        }
        return c993503uXLIZLLL;
    }

    public static void LJII(SmartRoute smartRoute, View view) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (view.getParent() == null) {
            C1AF0.LIZJ("slark, view.parent is null");
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                throw new IllegalStateException("view.parent is null");
            }
        }
        smartRoute.withParam("lib_track_rtn_id", TrackNodeStore.LJ(view, null).LL);
    }

    public static void LJIIIIZZ(SmartRoute smartRoute, InterfaceC1748810vbr interfaceC1748810vbr) {
        smartRoute.withParam("lib_track_rtn_id", TrackNodeStore.LJFF(interfaceC1748810vbr, null).LL);
    }

    public static final void LJIIIZ(Intent intent, String str) {
        intent.putExtra("lib_track_rtn_id", str);
    }

    public static final void LJIIJ(Bundle bundle, String str) {
        C786410Ut5.LJJJI("lib_track_rtn_id", str, bundle);
    }

    public static final void LJFF(Bundle bundle, View view, Function1<? super C1748770vbn, Unit> function1) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        if (view.getParent() == null) {
            C1AF0.LIZJ("slark, view.parent is null");
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).isDebug()) {
                throw new IllegalStateException("view.parent is null");
            }
        }
        C786410Ut5.LJJJI("lib_track_rtn_id", TrackNodeStore.LJ(view, function1).LL, bundle);
    }

    public static final void LJI(Bundle bundle, InterfaceC1748810vbr interfaceC1748810vbr, Function1<? super C1748770vbn, Unit> function1) {
        C786410Ut5.LJJJI("lib_track_rtn_id", TrackNodeStore.LJFF(interfaceC1748810vbr, function1).LL, bundle);
    }
}

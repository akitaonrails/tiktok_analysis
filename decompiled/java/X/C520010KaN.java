package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.RemoveAllScenesExceptLiveIdleOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostBridge;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFContextThemeConfig;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS11S1100100_7;
import kotlin.jvm.internal.AwS156S1100000_7;
import kotlin.jvm.internal.AwS15S1110000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C520010KaN {
    public static final IHostCreativeTool LIZ = (IHostCreativeTool) C1161920gLG.LIZJ(IHostCreativeTool.class);

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC20622815ms LIZ(Activity activity) {
        IHostCreativeTool iHostCreativeTool = LIZ;
        if (iHostCreativeTool != null && iHostCreativeTool.UC0()) {
            InterfaceC20622815ms interfaceC20622815msNc2 = iHostCreativeTool.nc2(activity);
            if (interfaceC20622815msNc2 == null) {
                if (!(activity instanceof InterfaceC214897198d)) {
                    return null;
                }
                return (InterfaceC20622815ms) activity;
            }
            return interfaceC20622815msNc2;
        }
        if (!(activity instanceof InterfaceC214897198d)) {
            return null;
        }
        return (InterfaceC20622815ms) activity;
    }

    public static final void LIZLLL(Fragment fragment) {
        AbstractC1387200mCc abstractC1387200mCcLJJIIJZLJL;
        C19EG activity;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (fragment != null && (activity = fragment.getActivity()) != null && (!activity.isFinishing())) {
                activity.finish();
                return;
            }
            return;
        }
        if (fragment == null || (abstractC1387200mCcLJJIIJZLJL = LJJIIJZLJL(fragment)) == null || !(!LJIIJ(abstractC1387200mCcLJJIIJZLJL))) {
            return;
        }
        abstractC1387200mCcLJJIIJZLJL.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC1294060jmO
    public static final AbstractC1387200mCc LJ(Context context) {
        Activity activityLIZ;
        AbstractC1387200mCc abstractC1387200mCc;
        AbstractC1387200mCc abstractC1387200mCc2;
        AbstractC1387200mCc abstractC1387200mCc3;
        AbstractC1387200mCc abstractC1387200mCc4;
        AbstractC1387200mCc abstractC1387200mCc5;
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == 0) {
            return null;
        }
        if (!C294780Bgy.LIZ() ? !(activityLIZ instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activityLIZ).getEnableSAF() : !(activityLIZ instanceof InterfaceC214897198d)) {
            if (!C294780Bgy.LIZ() ? !(!(activityLIZ instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activityLIZ).getEnableSAF()) : (activityLIZ instanceof InterfaceC214897198d)) {
                if (((InterfaceC214897198d) activityLIZ).getUseRootFragmentForPageCallbacks()) {
                    return new C1397950mTx(activityLIZ);
                }
            }
            C1397950mTx c1397950mTx = new C1397950mTx(activityLIZ);
            C520050KaR c520050KaR = new C520050KaR(c1397950mTx);
            C830530Wi3<C520050KaR, C520050KaR> c830530Wi3 = C2214211BlL.LIZ;
            C520050KaR c520050KaR2 = c830530Wi3.get(c520050KaR);
            if (c520050KaR2 != null && (abstractC1387200mCc5 = c520050KaR2.get()) != null) {
                return abstractC1387200mCc5;
            }
            synchronized (c830530Wi3) {
                try {
                    C520050KaR c520050KaR3 = c830530Wi3.get(c520050KaR);
                    if (c520050KaR3 != null && (abstractC1387200mCc4 = c520050KaR3.get()) != null) {
                        return abstractC1387200mCc4;
                    }
                    c830530Wi3.put(c520050KaR, c520050KaR);
                    return c1397950mTx;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        Object objLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context);
        if (objLJIIIIZZ != null) {
            if (objLJIIIIZZ instanceof Fragment) {
                C1844400y62 c1844400y62 = new C1844400y62((Fragment) objLJIIIIZZ);
                C520050KaR c520050KaR4 = new C520050KaR(c1844400y62);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi32 = C2214211BlL.LIZ;
                C520050KaR c520050KaR5 = c830530Wi32.get(c520050KaR4);
                if (c520050KaR5 != null && (abstractC1387200mCc3 = c520050KaR5.get()) != null) {
                    return abstractC1387200mCc3;
                }
                synchronized (c830530Wi32) {
                    try {
                        C520050KaR c520050KaR6 = c830530Wi32.get(c520050KaR4);
                        if (c520050KaR6 == null || (abstractC1387200mCc2 = c520050KaR6.get()) == null) {
                            c830530Wi32.put(c520050KaR4, c520050KaR4);
                            return c1844400y62;
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(objLJIIIIZZ);
                sbLIZ.append(" is not a Fragment!");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalStateException(strLIZIZ);
            }
        } else {
            AbstractC1387200mCc abstractC1387200mCcForceGetLiveTopPage = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).forceGetLiveTopPage();
            if (abstractC1387200mCcForceGetLiveTopPage == null) {
                if (!C294780Bgy.LIZ() ? !(!(activityLIZ instanceof InterfaceC214897198d) || !((InterfaceC214897198d) activityLIZ).getEnableSAF()) : (activityLIZ instanceof InterfaceC214897198d)) {
                    if (((InterfaceC214897198d) activityLIZ).getUseRootFragmentForPageCallbacks()) {
                        return new C1397950mTx(activityLIZ);
                    }
                }
                C1397950mTx c1397950mTx2 = new C1397950mTx(activityLIZ);
                C520050KaR c520050KaR7 = new C520050KaR(c1397950mTx2);
                C830530Wi3<C520050KaR, C520050KaR> c830530Wi33 = C2214211BlL.LIZ;
                C520050KaR c520050KaR8 = c830530Wi33.get(c520050KaR7);
                if (c520050KaR8 == null || (abstractC1387200mCc2 = c520050KaR8.get()) == null) {
                    synchronized (c830530Wi33) {
                        try {
                            C520050KaR c520050KaR9 = c830530Wi33.get(c520050KaR7);
                            if (c520050KaR9 != null && (abstractC1387200mCc = c520050KaR9.get()) != null) {
                                return abstractC1387200mCc;
                            }
                            c830530Wi33.put(c520050KaR7, c520050KaR7);
                            return c1397950mTx2;
                        } catch (Throwable th3) {
                            TryCatchGuardChecker.doCheck(th3);
                            throw th3;
                        }
                    }
                }
            } else {
                return abstractC1387200mCcForceGetLiveTopPage;
            }
        }
        return abstractC1387200mCc2;
    }

    public static final LayoutInflater LJI(Context context) {
        Object objJ2;
        if (context == null) {
            return null;
        }
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            C19EG c19egLJ = C500260Jjc.LJ(context);
            if (c19egLJ != null) {
                objJ2 = C786410Ut5.J2(c19egLJ, "layout_inflater");
            } else {
                objJ2 = null;
            }
            if (!(objJ2 instanceof LayoutInflater)) {
                return null;
            }
            return (LayoutInflater) objJ2;
        }
        return C786410Ut5.ne(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0029 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.fragment.app.Fragment LJII(androidx.fragment.app.Fragment r3) {
        /*
            android.content.Context r0 = r3.getContext()
            r2 = 0
            if (r0 == 0) goto L36
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        Lb:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L16
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L25
        L15:
            return r2
        L16:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L15
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L25
            return r2
        L23:
            if (r3 == 0) goto L15
        L25:
            boolean r0 = r3 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L31
            X.198i r3 = (X.InterfaceC214902198i) r3
            if (r3 == 0) goto L15
            r2 = r3
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            return r2
        L31:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L23
        L36:
            r1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C520010KaN.LJII(androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public static final Context LJIIIZ(Context context) {
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            return C500260Jjc.LJ(context);
        }
        return LJJIIZI(context, false);
    }

    public static final boolean LJIIJ(AbstractC1387200mCc abstractC1387200mCc) {
        if (abstractC1387200mCc instanceof C1397950mTx) {
            C1397950mTx c1397950mTx = (C1397950mTx) abstractC1387200mCc;
            if (!c1397950mTx.LIZLLL.isFinishing() && !c1397950mTx.LIZLLL.isDestroyed()) {
                return false;
            }
            return true;
        }
        if (abstractC1387200mCc instanceof C1844400y62) {
            return SAFExtensionKt.LJIIZILJ(((C1844400y62) abstractC1387200mCc).LIZLLL);
        }
        if (abstractC1387200mCc instanceof C198S) {
            return ((C198S) abstractC1387200mCc).LIZLLL.mViewDestroyed;
        }
        throw new C1954807lC();
    }

    public static final boolean LJIIJJI(Context context) {
        C19EG c19egLIZIZ;
        Boolean boolValueOf = null;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                boolValueOf = Boolean.valueOf(c19egLIZIZ.isFinishing());
            }
            return C500260Jjc.LJJIFFI(boolValueOf);
        }
        if (context != null) {
            if (SAFExtensionKt.LJIIIIZZ(context) != null) {
                return !SAFExtensionKt.LJIIZILJ(r0);
            }
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ2 != null) {
                boolValueOf = Boolean.valueOf(c19egLIZIZ2.isFinishing());
            }
        }
        return C500260Jjc.LJJIFFI(boolValueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIILIIL(android.view.View r5) {
        /*
            boolean r0 = X.C464660IKa.LIZ()
            r2 = 1
            java.lang.String r1 = "intent_exit_and_swipe_feed"
            if (r0 == 0) goto La7
            r4 = 0
            if (r5 == 0) goto L29
            android.content.Context r0 = r5.getContext()
            X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)
            if (r0 == 0) goto L2d
            X.198i r3 = r0.LIZLLL()
            if (r3 == 0) goto L2d
        L1c:
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            if (r3 == 0) goto L2a
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L2a
            r0.putBoolean(r1, r2)
        L29:
            return
        L2a:
            if (r5 == 0) goto L29
            goto L49
        L2d:
            android.content.Context r0 = r5.getContext()
            android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            if (r0 == 0) goto L6e
            android.content.Context r0 = r5.getContext()
            android.app.Activity r3 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L61
            boolean r0 = r3 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L6e
        L49:
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L29
            X.19EG r3 = X.C1388190mED.LIZIZ(r0)
            if (r3 == 0) goto L29
            X.0QpW r2 = X.EnumC682280QpW.GET_INTENT
            kotlin.jvm.internal.AwS15S1110000_7 r1 = new kotlin.jvm.internal.AwS15S1110000_7
            r0 = 2
            r1.<init>(r5, r0)
            X.C1563370qml.LIZ(r3, r2, r1)
            return
        L61:
            boolean r0 = r3 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L49
            X.198d r3 = (X.InterfaceC214897198d) r3
            boolean r0 = r3.getEnableSAF()
            if (r0 != 0) goto L6e
            goto L49
        L6e:
            androidx.fragment.app.Fragment r3 = X.C946803n0.LIZ(r5)
            if (r3 == 0) goto L49
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L7e
            android.app.Activity r4 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L7e:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L89
            boolean r0 = r4 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L98
            goto L49
        L89:
            boolean r0 = r4 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L49
            X.198d r4 = (X.InterfaceC214897198d) r4
            boolean r0 = r4.getEnableSAF()
            if (r0 != 0) goto L98
            goto L49
        L96:
            if (r3 == 0) goto L49
        L98:
            boolean r0 = r3 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto La2
            X.198i r3 = (X.InterfaceC214902198i) r3
            if (r3 == 0) goto L49
            goto L1c
        La2:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L96
        La7:
            if (r5 == 0) goto L29
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L29
            android.app.Activity r0 = X.C1388190mED.LIZ(r0)
            if (r0 == 0) goto L29
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L29
            r0.putExtra(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C520010KaN.LJIILIIL(android.view.View):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0KaO, android.os.MessageQueue$IdleHandler] */
    public static final void LJIILLIIL(final InterfaceC20622815ms interfaceC20622815ms) {
        if (!RemoveAllScenesExceptLiveIdleOptSetting.enable()) {
            LJIIZILJ(interfaceC20622815ms);
            return;
        }
        C20441214yg.LIZIZ("RemoveAllScenesExceptLive", "schedule idle cleanup");
        if (C520030KaP.LIZ == null) {
            ?? r1 = new MessageQueue.IdleHandler() { // from class: X.0KaO
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    C520030KaP.LIZ = null;
                    C520010KaN.LJIIZILJ(interfaceC20622815ms);
                    return false;
                }
            };
            C520030KaP.LIZ = r1;
            C786410Ut5.f3(r1, Looper.getMainLooper().getQueue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJIIZILJ(InterfaceC20622815ms interfaceC20622815ms) {
        NavigationScene navigationScene;
        List<Scene> sceneList;
        NavigationScene navigationScene2;
        List<Scene> sceneList2;
        List<Scene> listLLIIII;
        if (RemoveAllScenesExceptLiveIdleOptSetting.enable()) {
            if (interfaceC20622815ms != null && (navigationScene2 = interfaceC20622815ms.getNavigationScene()) != null && (sceneList2 = navigationScene2.getSceneList()) != null && (listLLIIII = C13LP.LLIIII(sceneList2)) != null) {
                for (Scene scene : listLLIIII) {
                    if (!(scene instanceof InterfaceC20630715o9) || ((IHostBridge) C1161920gLG.LIZJ(IHostBridge.class)).requireCanDestroySAFScene((InterfaceC20630715o9) scene)) {
                        C20441214yg.LIZIZ("RemoveAllScenesExceptLive", "removeAllScenesExceptLive real");
                        NavigationScene navigationScene3 = interfaceC20622815ms.getNavigationScene();
                        if (navigationScene3 != null) {
                            navigationScene3.remove(scene);
                        }
                    }
                }
                return;
            }
            return;
        }
        if (interfaceC20622815ms != null && (navigationScene = interfaceC20622815ms.getNavigationScene()) != null && (sceneList = navigationScene.getSceneList()) != null) {
            for (Scene scene2 : sceneList) {
                if (!(scene2 instanceof InterfaceC20630715o9) || ((IHostBridge) C1161920gLG.LIZJ(IHostBridge.class)).requireCanDestroySAFScene((InterfaceC20630715o9) scene2)) {
                    C20441214yg.LIZIZ("RemoveAllScenesExceptLive", "removeAllScenesExceptLive real");
                    NavigationScene navigationScene4 = interfaceC20622815ms.getNavigationScene();
                    if (navigationScene4 != null) {
                        navigationScene4.remove(scene2);
                    }
                }
            }
        }
    }

    public static final Fragment LJIJI(Context context) {
        Object objLJIIIIZZ;
        if (context != null && (objLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context)) != null) {
            return (Fragment) objLJIIIIZZ;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.fragment.app.Fragment LJIJJ(androidx.fragment.app.Fragment r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L17
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L38
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        Ld:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L18
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L27
        L17:
            return r2
        L18:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L17
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L27
            return r2
        L25:
            if (r3 == 0) goto L17
        L27:
            boolean r0 = r3 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L33
            X.198i r3 = (X.InterfaceC214902198i) r3
            if (r3 == 0) goto L17
            r2 = r3
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            return r2
        L33:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L25
        L38:
            r1 = r2
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C520010KaN.LJIJJ(androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    public static final LifecycleOwner LJJIII(Fragment fragment) {
        AbstractC1387200mCc abstractC1387200mCcLJJIIJZLJL;
        LifecycleOwner lifecycleOwnerLJFF;
        Context context;
        C19EG c19egLIZIZ;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (fragment == null || (context = fragment.getContext()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
                Activity activityLJJIJL = LJJIJL(false);
                if (activityLJJIJL != null) {
                    return C1388190mED.LIZIZ(activityLJJIJL);
                }
                return null;
            }
            return c19egLIZIZ;
        }
        if (fragment != null && (abstractC1387200mCcLJJIIJZLJL = LJJIIJZLJL(fragment)) != null && (lifecycleOwnerLJFF = abstractC1387200mCcLJJIIJZLJL.LJFF()) != null) {
            return lifecycleOwnerLJFF;
        }
        AbstractC1387200mCc abstractC1387200mCcLJJIL = LJJIL(false);
        if (abstractC1387200mCcLJJIL != null) {
            return abstractC1387200mCcLJJIL.LJFF();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
    
        r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIIIIZZ(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008a, code lost:
    
        if (r2 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008e, code lost:
    
        if ((r2 instanceof androidx.fragment.app.Fragment) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0090, code lost:
    
        r3 = new X.C1844400y62((androidx.fragment.app.Fragment) r2);
        r2 = new X.C520050KaR(r3);
        r1 = X.C2214211BlL.LIZ;
        r0 = r1.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a4, code lost:
    
        if (r0 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a6, code lost:
    
        r0 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ac, code lost:
    
        if (r0 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ae, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00af, code lost:
    
        r0 = r1.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b5, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b7, code lost:
    
        r0 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bd, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bf, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c0, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c1, code lost:
    
        r0 = r1.put(r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c7, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c8, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ca, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ce, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cf, code lost:
    
        r1 = X.C2188811AlT.LIZ();
        r1.append(r2);
        r1.append(" is not a Fragment!");
        r1 = X.C2188811AlT.LIZIZ(r1);
        r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e7, code lost:
    
        throw new java.lang.IllegalStateException(r1);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC1387200mCc LJJIIJ(android.content.Context r3) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C520010KaN.LJJIIJ(android.content.Context):X.0mCc");
    }

    public static final AbstractC1387200mCc LJJIIJZLJL(Fragment fragment) {
        if (fragment != null) {
            return C520040KaQ.LIZIZ(fragment);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LJJIIZ(GameBroadcastFragment gameBroadcastFragment) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        C19EG activity;
        Boolean boolValueOf = null;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (gameBroadcastFragment != null && (activity = gameBroadcastFragment.getActivity()) != null) {
                boolValueOf = Boolean.valueOf(activity.isDestroyed());
            }
            return C500260Jjc.LJJIJIL(boolValueOf);
        }
        if (gameBroadcastFragment != null) {
            Context context = gameBroadcastFragment.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                Fragment parentFragment = gameBroadcastFragment;
                while (true) {
                    if (parentFragment instanceof InterfaceC214902198i) {
                        InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                        if (interfaceC214902198i != null) {
                            return SAFExtensionKt.LJIIZILJ(interfaceC214902198i);
                        }
                    } else {
                        parentFragment = parentFragment.getParentFragment();
                        if (parentFragment == 0) {
                            break;
                        }
                    }
                }
            }
            C19EG activity2 = gameBroadcastFragment.getActivity();
            if (activity2 != null) {
                boolValueOf = Boolean.valueOf(activity2.isDestroyed());
            }
        }
        return C500260Jjc.LJJIJIL(boolValueOf);
    }

    @InterfaceC1294060jmO
    public static final void LJJIJIL(Context context) {
        Activity activityLIZ;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (!activityLIZ.isFinishing())) {
                activityLIZ.finish();
                return;
            }
            return;
        }
        if (context == null) {
            return;
        }
        InterfaceC214902198i interfaceC214902198iLJIIIIZZ = SAFExtensionKt.LJIIIIZZ(context);
        if (interfaceC214902198iLJIIIIZZ != null && (!SAFExtensionKt.LJIIZILJ(interfaceC214902198iLJIIIIZZ))) {
            interfaceC214902198iLJIIIIZZ.finish();
            if (Unit.LIZ != null) {
                return;
            }
        }
        Activity activityLIZ2 = C1388190mED.LIZ(context);
        if (activityLIZ2 == null || !(!activityLIZ2.isFinishing())) {
            return;
        }
        activityLIZ2.finish();
    }

    public static final Activity LJJIJL(boolean z) {
        if (!z) {
            return null;
        }
        return ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopActivity();
    }

    public static final Context LJJIJLIJ(boolean z) {
        AbstractC1387200mCc topRootPage;
        if (!z || (topRootPage = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopRootPage()) == null) {
            return null;
        }
        return topRootPage.LJIIIIZZ();
    }

    public static final AbstractC1387200mCc LJJIL(boolean z) {
        if (!z) {
            return null;
        }
        return ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).getTopRootPage();
    }

    @InterfaceC1294060jmO
    public static final View LIZIZ(int i, Context context) {
        View view;
        View viewFindViewById;
        Activity activityLIZ;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
                return null;
            }
            return activityLIZ.findViewById(i);
        }
        if (context == null) {
            return null;
        }
        Fragment fragmentLJIJI = LJIJI(context);
        if (fragmentLJIJI != null && (view = fragmentLJIJI.getView()) != null && (viewFindViewById = view.findViewById(i)) != null) {
            return viewFindViewById;
        }
        Activity activityLIZ2 = C1388190mED.LIZ(context);
        if (activityLIZ2 == null) {
            return null;
        }
        return activityLIZ2.findViewById(i);
    }

    public static final View LIZJ(int i, GameBroadcastFragment gameBroadcastFragment) {
        View view;
        View viewFindViewById;
        C19EG activity;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (gameBroadcastFragment != null && (activity = gameBroadcastFragment.getActivity()) != null) {
                return activity.findViewById(i);
            }
            return null;
        }
        if (gameBroadcastFragment != null) {
            Fragment fragmentLJIJJ = LJIJJ(gameBroadcastFragment);
            if (fragmentLJIJJ != null && (view = fragmentLJIJJ.getView()) != null && (viewFindViewById = view.findViewById(i)) != null) {
                return viewFindViewById;
            }
            C19EG activity2 = gameBroadcastFragment.getActivity();
            if (activity2 != null) {
                return activity2.findViewById(i);
            }
            return null;
        }
        return null;
    }

    public static final <T extends Parcelable> T LJIIIIZZ(Fragment fragment, String str) {
        C19EG activity;
        Bundle arguments;
        T t;
        C19EG activity2;
        Intent intent;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (fragment != null && (activity2 = fragment.getActivity()) != null && (intent = activity2.getIntent()) != null) {
                return (T) intent.getParcelableExtra(str);
            }
            return null;
        }
        Fragment fragmentLJIJJ = LJIJJ(fragment);
        if (fragmentLJIJJ != null && (arguments = fragmentLJIJJ.getArguments()) != null && (t = (T) arguments.getParcelable(str)) != null) {
            return t;
        }
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            return (T) C1563370qml.LIZ(activity, EnumC682280QpW.GET_INTENT, new AwS156S1100000_7(fragment, str, 1));
        }
        return null;
    }

    public static final void LJIILJJIL(Fragment fragment, String str) {
        C19EG activity;
        Intent intent;
        C19EG activity2;
        Bundle arguments;
        if (C464660IKa.LIZ()) {
            Fragment fragmentLJIJJ = LJIJJ(fragment);
            if (fragmentLJIJJ != null && (arguments = fragmentLJIJJ.getArguments()) != null) {
                arguments.putBoolean(str, true);
                return;
            } else {
                if (fragment == null || (activity2 = fragment.getActivity()) == null) {
                    return;
                }
                C1563370qml.LIZ(activity2, EnumC682280QpW.GET_INTENT, new AwS15S1110000_7(fragment, str, 1));
                return;
            }
        }
        if (fragment == null || (activity = fragment.getActivity()) == null || (intent = activity.getIntent()) == null) {
            return;
        }
        intent.putExtra(str, true);
    }

    public static final Activity LJIJ(Context context, boolean z) {
        Activity activityLIZ;
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return LJJIJL(z);
        }
        return activityLIZ;
    }

    public static final C19EG LJIJJLI(Context context, boolean z) {
        Activity activityLJIJ = LJIJ(context, z);
        if (activityLJIJ instanceof C19EG) {
            return (C19EG) activityLJIJ;
        }
        return null;
    }

    @InterfaceC1294060jmO
    public static final FragmentManager LJIL(Context context, boolean z) {
        FragmentManager supportFragmentManager;
        C19EG c19egLIZIZ;
        Fragment fragmentLJIJI;
        FragmentManager childFragmentManager;
        C19EG c19egLIZIZ2;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (context == null || (c19egLIZIZ2 = C1388190mED.LIZIZ(context)) == null) {
                Activity activityLJJIJL = LJJIJL(z);
                if (activityLJJIJL != null) {
                    c19egLIZIZ2 = C1388190mED.LIZIZ(activityLJJIJL);
                } else {
                    c19egLIZIZ2 = null;
                }
            }
            if (c19egLIZIZ2 == null) {
                return null;
            }
            return c19egLIZIZ2.getSupportFragmentManager();
        }
        if (context != null && (fragmentLJIJI = LJIJI(context)) != null) {
            try {
                childFragmentManager = fragmentLJIJI.getChildFragmentManager();
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Scene.SCENE_SERVICE, "KtUtil#securityGetChildFragmentManager");
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("trace", Log.getStackTraceString(e));
                C1CC2.LJI("ttlive_live_host_common_exception_collector", jSONObject, jSONObject2, jSONObject3);
                childFragmentManager = null;
            }
            if (childFragmentManager != null) {
                return childFragmentManager;
            }
        }
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
        } else {
            supportFragmentManager = null;
        }
        if (supportFragmentManager == null) {
            AbstractC1387200mCc abstractC1387200mCcLJJIL = LJJIL(z);
            if (abstractC1387200mCcLJJIL == null) {
                return null;
            }
            return abstractC1387200mCcLJJIL.LJ();
        }
        return supportFragmentManager;
    }

    public static final FragmentManager LJJ(View view, boolean z) {
        AbstractC1387200mCc abstractC1387200mCcLIZ;
        FragmentManager fragmentManagerLJ;
        Activity activityLJJIJL;
        C19EG c19egLIZIZ;
        Context context;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if ((view == null || (context = view.getContext()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) && ((activityLJJIJL = LJJIJL(z)) == null || (c19egLIZIZ = C1388190mED.LIZIZ(activityLJJIJL)) == null)) {
                return null;
            }
            return c19egLIZIZ.getSupportFragmentManager();
        }
        if (view != null && (abstractC1387200mCcLIZ = C520040KaQ.LIZ(view)) != null && (fragmentManagerLJ = abstractC1387200mCcLIZ.LJ()) != null) {
            return fragmentManagerLJ;
        }
        AbstractC1387200mCc abstractC1387200mCcLJJIL = LJJIL(z);
        if (abstractC1387200mCcLJJIL == null) {
            return null;
        }
        return abstractC1387200mCcLJJIL.LJ();
    }

    public static final FragmentManager LJJI(Fragment fragment, boolean z) {
        AbstractC1387200mCc abstractC1387200mCcLJJIIJZLJL;
        FragmentManager fragmentManagerLJ;
        Activity activityLJJIJL;
        C19EG c19egLIZIZ;
        Context context;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if ((fragment == null || (context = fragment.getContext()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) && ((activityLJJIJL = LJJIJL(z)) == null || (c19egLIZIZ = C1388190mED.LIZIZ(activityLJJIJL)) == null)) {
                return null;
            }
            return c19egLIZIZ.getSupportFragmentManager();
        }
        if (fragment != null && (abstractC1387200mCcLJJIIJZLJL = LJJIIJZLJL(fragment)) != null && (fragmentManagerLJ = abstractC1387200mCcLJJIIJZLJL.LJ()) != null) {
            return fragmentManagerLJ;
        }
        AbstractC1387200mCc abstractC1387200mCcLJJIL = LJJIL(z);
        if (abstractC1387200mCcLJJIL == null) {
            return null;
        }
        return abstractC1387200mCcLJJIL.LJ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r0 != null) goto L19;
     */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.lifecycle.LifecycleOwner LJJIFFI(android.content.Context r2, boolean r3) {
        /*
            boolean r0 = X.C497280Jeo.LIZ
            r1 = 0
            if (r0 != 0) goto L1e
            boolean r0 = X.C464660IKa.LIZ()
            if (r0 != 0) goto L1e
            if (r2 == 0) goto L13
            X.19EG r0 = X.C1388190mED.LIZIZ(r2)
            if (r0 != 0) goto L2d
        L13:
            android.app.Activity r0 = LJJIJL(r3)
            if (r0 == 0) goto L1d
            X.19EG r1 = X.C1388190mED.LIZIZ(r0)
        L1d:
            return r1
        L1e:
            if (r2 == 0) goto L2e
            androidx.fragment.app.Fragment r0 = LJIJI(r2)
            if (r0 == 0) goto L27
            return r0
        L27:
            X.19EG r0 = X.C1388190mED.LIZIZ(r2)
            if (r0 == 0) goto L2e
        L2d:
            return r0
        L2e:
            X.0mCc r0 = LJJIL(r3)
            if (r0 == 0) goto L1d
            androidx.lifecycle.LifecycleOwner r1 = r0.LJFF()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C520010KaN.LJJIFFI(android.content.Context, boolean):androidx.lifecycle.LifecycleOwner");
    }

    public static final LifecycleOwner LJJII(View view, boolean z) {
        AbstractC1387200mCc abstractC1387200mCcLIZ;
        LifecycleOwner lifecycleOwnerLJFF;
        Context context;
        C19EG c19egLIZIZ;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (view == null || (context = view.getContext()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
                Activity activityLJJIJL = LJJIJL(z);
                if (activityLJJIJL != null) {
                    return C1388190mED.LIZIZ(activityLJJIJL);
                }
                return null;
            }
            return c19egLIZIZ;
        }
        if (view != null && (abstractC1387200mCcLIZ = C520040KaQ.LIZ(view)) != null && (lifecycleOwnerLJFF = abstractC1387200mCcLIZ.LJFF()) != null) {
            return lifecycleOwnerLJFF;
        }
        AbstractC1387200mCc abstractC1387200mCcLJJIL = LJJIL(z);
        if (abstractC1387200mCcLJJIL != null) {
            return abstractC1387200mCcLJJIL.LJFF();
        }
        return null;
    }

    @InterfaceC1294060jmO
    public static final Context LJJIIZI(Context context, boolean z) {
        Context context2;
        Activity activityLIZ;
        Fragment fragmentLJIJI;
        Activity activityLIZ2;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (context == null || (activityLIZ2 = C1388190mED.LIZ(context)) == null) {
                return LJJIJL(z);
            }
            return activityLIZ2;
        }
        if (context == null || (fragmentLJIJI = LJIJI(context)) == null || (context2 = fragmentLJIJI.getContext()) == null) {
            context2 = null;
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                return activityLIZ;
            }
            AbstractC1387200mCc abstractC1387200mCcLJJIL = LJJIL(z);
            if (abstractC1387200mCcLJJIL != null) {
                return abstractC1387200mCcLJJIL.LJIIIIZZ();
            }
        }
        return context2;
    }

    public static final Context LJJIJ(View view, boolean z) {
        AbstractC1387200mCc abstractC1387200mCcLIZ;
        Context contextLJIIIIZZ;
        Context context;
        Activity activityLIZ;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (view == null || (context = view.getContext()) == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
                return LJJIJL(z);
            }
            return activityLIZ;
        }
        if (view != null && (abstractC1387200mCcLIZ = C520040KaQ.LIZ(view)) != null && (contextLJIIIIZZ = abstractC1387200mCcLIZ.LJIIIIZZ()) != null) {
            return contextLJIIIIZZ;
        }
        AbstractC1387200mCc abstractC1387200mCcLJJIL = LJJIL(z);
        if (abstractC1387200mCcLJJIL != null) {
            return abstractC1387200mCcLJJIL.LJIIIIZZ();
        }
        return null;
    }

    public static final Context LJJIJIIJI(Fragment fragment, boolean z) {
        AbstractC1387200mCc abstractC1387200mCcLJJIIJZLJL;
        Context contextLJIIIIZZ;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (fragment == null || (contextLJIIIIZZ = fragment.getActivity()) == null) {
                return LJJIJL(z);
            }
        } else if (fragment == null || (abstractC1387200mCcLJJIIJZLJL = LJJIIJZLJL(fragment)) == null || (contextLJIIIIZZ = abstractC1387200mCcLJJIIJZLJL.LJIIIIZZ()) == null) {
            AbstractC1387200mCc abstractC1387200mCcLJJIL = LJJIL(z);
            if (abstractC1387200mCcLJJIL != null) {
                return abstractC1387200mCcLJJIL.LJIIIIZZ();
            }
            return null;
        }
        return contextLJIIIIZZ;
    }

    public static final ViewModelStoreOwner LJJIZ(Context context, boolean z) {
        C19EG c19egLIZIZ;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
                Activity activityLJJIJL = LJJIJL(z);
                if (activityLJJIJL == null) {
                    return null;
                }
                return C1388190mED.LIZIZ(activityLJJIJL);
            }
        } else {
            Fragment fragmentLJIJI = LJIJI(context);
            if (fragmentLJIJI != null) {
                return fragmentLJIJI;
            }
            if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null) {
                AbstractC1387200mCc abstractC1387200mCcLJJIL = LJJIL(z);
                if (abstractC1387200mCcLJJIL == null) {
                    return null;
                }
                return abstractC1387200mCcLJJIL.LJIIJ();
            }
        }
        return c19egLIZIZ;
    }

    public static final Boolean LJFF(Fragment fragment, String str, boolean z) {
        C19EG activity;
        Bundle arguments;
        C19EG activity2;
        Intent intent;
        if (!C497280Jeo.LIZ && !C464660IKa.LIZ()) {
            if (fragment != null && (activity2 = fragment.getActivity()) != null && (intent = activity2.getIntent()) != null) {
                return Boolean.valueOf(intent.getBooleanExtra(str, z));
            }
            return null;
        }
        Fragment fragmentLJIJJ = LJIJJ(fragment);
        if (fragmentLJIJJ != null && (arguments = fragmentLJIJJ.getArguments()) != null) {
            return Boolean.valueOf(arguments.getBoolean(str, z));
        }
        if (fragment != null && (activity = fragment.getActivity()) != null) {
            return (Boolean) C1563370qml.LIZ(activity, EnumC682280QpW.GET_INTENT, new AwS15S1110000_7(fragment, str, z, 0));
        }
        return null;
    }

    public static final void LJIILL(Fragment fragment, String str, long j) {
        C19EG activity;
        Intent intent;
        C19EG activity2;
        Bundle arguments;
        if (C464660IKa.LIZ()) {
            Fragment fragmentLJIJJ = LJIJJ(fragment);
            if (fragmentLJIJJ != null && (arguments = fragmentLJIJJ.getArguments()) != null) {
                arguments.putLong(str, j);
                return;
            } else {
                if (fragment == null || (activity2 = fragment.getActivity()) == null) {
                    return;
                }
                C1563370qml.LIZ(activity2, EnumC682280QpW.GET_INTENT, new AwS11S1100100_7(fragment, str, j, 0));
                return;
            }
        }
        if (fragment == null || (activity = fragment.getActivity()) == null || (intent = activity.getIntent()) == null) {
            return;
        }
        intent.putExtra(str, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.lifecycle.ViewModel LJJJI(android.content.Context r3, java.lang.Class r4, X.C508930Jxb r5, int r6) {
        /*
            r0 = r6 & 2
            r2 = 0
            if (r0 == 0) goto L6
            r5 = r2
        L6:
            boolean r0 = X.C497280Jeo.LIZ
            r1 = 0
            if (r0 != 0) goto L36
            boolean r0 = X.C464660IKa.LIZ()
            if (r0 != 0) goto L36
            if (r3 == 0) goto L1f
            X.19EG r0 = X.C1388190mED.LIZIZ(r3)
            if (r0 == 0) goto L1f
            androidx.lifecycle.ViewModelProvider r0 = androidx.lifecycle.ViewModelProviders.of(r0, r5)
            if (r0 != 0) goto L31
        L1f:
            android.content.Context r0 = LJJIJLIJ(r1)
            if (r0 == 0) goto L35
            X.19EG r0 = X.C1388190mED.LIZIZ(r0)
            if (r0 == 0) goto L35
            androidx.lifecycle.ViewModelProvider r0 = androidx.lifecycle.ViewModelProviders.of(r0, r5)
        L2f:
            if (r0 == 0) goto L35
        L31:
            androidx.lifecycle.ViewModel r2 = r0.get(r4)
        L35:
            return r2
        L36:
            androidx.fragment.app.Fragment r0 = LJIJI(r3)
            if (r0 == 0) goto L42
            androidx.lifecycle.ViewModelProvider r0 = androidx.lifecycle.ViewModelProviders.of(r0, r5)
            if (r0 != 0) goto L31
        L42:
            if (r3 == 0) goto L50
            X.19EG r0 = X.C1388190mED.LIZIZ(r3)
            if (r0 == 0) goto L50
            androidx.lifecycle.ViewModelProvider r0 = androidx.lifecycle.ViewModelProviders.of(r0, r5)
            if (r0 != 0) goto L31
        L50:
            android.content.Context r0 = LJJIJLIJ(r1)
            if (r0 == 0) goto L35
            X.19EG r0 = X.C1388190mED.LIZIZ(r0)
            if (r0 == 0) goto L35
            androidx.lifecycle.ViewModelProvider r0 = androidx.lifecycle.ViewModelProviders.of(r0, r5)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C520010KaN.LJJJI(android.content.Context, java.lang.Class, X.0Jxb, int):androidx.lifecycle.ViewModel");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends androidx.lifecycle.ViewModel> T LJJJ(androidx.fragment.app.Fragment r6, java.lang.Class<T> r7, androidx.lifecycle.ViewModelProvider.Factory r8, java.lang.String r9, boolean r10) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C520010KaN.LJJJ(androidx.fragment.app.Fragment, java.lang.Class, androidx.lifecycle.ViewModelProvider$Factory, java.lang.String, boolean):androidx.lifecycle.ViewModel");
    }

    public static void LJIIL(InterfaceC20622815ms interfaceC20622815ms, InterfaceC214902198i interfaceC214902198i, int i, Bundle bundle, int i2, Boolean bool, int i3) {
        C199E c199e;
        int iRequireHostTheme = i2;
        Bundle bundle2 = bundle;
        int i4 = i;
        if ((i3 & 2) != 0) {
            i4 = -1;
        }
        if ((i3 & 4) != 0) {
            bundle2 = new Bundle();
        }
        if ((i3 & 8) != 0) {
            iRequireHostTheme = 0;
        }
        if ((i3 & 16) != 0) {
            bool = Boolean.FALSE;
        }
        NavigationScene navigationScene = interfaceC20622815ms.getNavigationScene();
        if (navigationScene != null) {
            if (C500260Jjc.LJJJI(bool)) {
                c199e = C199E.STANDARD;
            } else {
                c199e = C199E.SINGLE_TASK;
            }
            C199B c199b = new C199B(c199e, null, null, true, false, null, null, 118);
            Class<?> cls = interfaceC214902198i.getClass();
            AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(interfaceC214902198i, 104);
            if (iRequireHostTheme <= 0) {
                iRequireHostTheme = ((IHostBridge) C1161920gLG.LIZJ(IHostBridge.class)).requireHostTheme();
            }
            AnonymousClass1999.LIZJ(navigationScene, null, cls, awS551S0100000_7, i4, bundle2, c199b, null, new SAFContextThemeConfig(true, iRequireHostTheme), null, 320);
        }
    }
}

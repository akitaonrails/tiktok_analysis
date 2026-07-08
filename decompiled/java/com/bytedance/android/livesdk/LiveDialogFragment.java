package com.bytedance.android.livesdk;

import X.C01GW;
import X.C098200Yq;
import X.C0IJ7;
import X.C0TVI;
import X.C0U56;
import X.C0UZY;
import X.C1118470fDB;
import X.C1161920gLG;
import X.C1389600mGU;
import X.C14K9;
import X.C1685300txQ;
import X.C1766570w4V;
import X.C189200o6;
import X.C1896507bn;
import X.C1965507mv;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.C464800IKo;
import X.C473050Igp;
import X.C475510Ikn;
import X.C485950J3x;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C786410Ut5;
import X.InterfaceC1118490fDD;
import X.InterfaceC930060aJI;
import X.RunnableC1118500fDE;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ATListenerS450S0100000_17;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment;
import com.bytedance.android.livesdk.dataChannel.DialogMotionEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public abstract class LiveDialogFragment extends LiveThemeAwareDialogFragment {
    public static final C0UZY Companion = new Object() { // from class: X.0UZY
    };
    public static boolean disableAnim;
    public DataChannel dataChannel;
    public C500980Jkm dialogParams;
    public boolean isViewValid;
    public DialogInterface.OnCancelListener onCancelListener;
    public InterfaceC930060aJI onDialogGoneListener;
    public DialogInterface.OnDismissListener onDismissListener;
    public List<DialogInterface.OnDismissListener> onDismissListenerList = new ArrayList();
    public final C01GW liveDialogProxy$delegate = C452501pT.LIZIZ(new AwS561S0100000_17(this, 102));
    public long lastMotionActionTime = System.currentTimeMillis();

    public boolean adaptEdgeToEdge() {
        return false;
    }

    public abstract C500980Jkm createParams();

    public boolean enablePadAdapter() {
        return true;
    }

    public InterfaceC1118490fDD genLandscapeDialogProxy() {
        return null;
    }

    public FrameLayout.LayoutParams getCustomLayoutParams() {
        return null;
    }

    public Dialog newDialog(Bundle bundle) {
        return null;
    }

    public boolean onBackPressed() {
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        return com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_tux_business_base_DialogLancet_onCreateDialogHook(this, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        RunnableC1118500fDE runnableC1118500fDE;
        this.isViewValid = false;
        C464800IKo.LIZ.LJIIZILJ(this);
        View view = getView();
        if ((view instanceof RunnableC1118500fDE) && (runnableC1118500fDE = (RunnableC1118500fDE) view) != null) {
            ((ArrayList) runnableC1118500fDE.LLIZLLLIL).clear();
        }
        super.onDestroyView();
    }

    public void onDialogCreated(Dialog dialog) {
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyDialogOnStart(this);
    }

    public boolean requireE2EAdaption() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public int show(C19EH c19eh, String str) {
        return com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_tux_business_base_DialogLancet_showHookLiveDialogFragment(this, c19eh, str);
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_tux_business_base_DialogLancet_showHook2LiveDialogFragment(this, fragmentManager, str);
    }

    @Override // com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment, androidx.fragment.app.DialogFragment
    public void showNow(FragmentManager fragmentManager, String str) {
        com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_tux_business_base_DialogLancet_showNowHookLiveDialogFragment(this, fragmentManager, str);
    }

    private final InterfaceC1118490fDD getLiveDialogProxy() {
        return (InterfaceC1118490fDD) this.liveDialogProxy$delegate.getValue();
    }

    public void com_bytedance_android_livesdk_LiveDialogFragment__onStart$___twin___() {
        try {
            super.onStart();
            Dialog dialog = getDialog();
            if (dialog != null) {
                getLiveDialogProxy().LIZJ(dialog);
                getLiveDialogProxy().LIZLLL(dialog);
                String strLJ = C497740JfY.LJ();
                try {
                    onStart$setAttributesForDialog(this, dialog);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("device ");
                    sbLIZ.append(strLJ);
                    sbLIZ.append(" - onStart error: view not attach window!");
                    C20441214yg.LJ("LiveDialogFragment", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            C464800IKo.LIZ.LIZIZ(this);
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJ("LiveDialogFragment", "onStart error!");
        }
    }

    public final C500980Jkm getDialogParams() {
        C500980Jkm c500980Jkm = this.dialogParams;
        if (c500980Jkm != null) {
            return c500980Jkm;
        }
        return null;
    }

    private final void addDialog() {
        C473050Igp.LIZIZ().LIZ();
        C1965507mv.LJ(this, "mDismissed", Boolean.FALSE);
        C1965507mv.LJ(this, "mShownByMe", Boolean.TRUE);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (getFragmentManager() != null) {
            super.dismissAllowingStateLoss();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss:");
        sbLIZ.append(this);
        sbLIZ.append(" not associate with a fragment manager");
        C20441214yg.LIZIZ("LiveDialogFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (getFragmentManager() != null) {
            super.dismissAllowingStateLoss();
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismissAllowingStateLoss:");
        sbLIZ.append(this);
        sbLIZ.append(" not associate with a fragment manager");
        C20441214yg.LIZIZ("LiveDialogFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    public InterfaceC1118490fDD genDialogProxy() {
        InterfaceC1118490fDD interfaceC1118490fDDGenLandscapeDialogProxy;
        setDialogParams(createParams());
        Configuration configuration = getResources().getConfiguration();
        boolean z = false;
        if (configuration != null && configuration.orientation == 2) {
            z = true;
        }
        if (enablePadAdapter() && ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            final int i = getDialogParams().LIZ;
            return new InterfaceC1118490fDD(i) { // from class: X.0KZY
                public static final /* synthetic */ int LIZIZ = 0;
                public final int LIZ;

                @Override // X.InterfaceC1118490fDD
                public final void LIZLLL(Dialog dialog) {
                }

                @Override // X.InterfaceC1118490fDD
                public final int getLayoutId() {
                    return this.LIZ;
                }

                {
                    this.LIZ = i;
                }

                public static int LJFF(Context context) {
                    Activity topActivity;
                    Resources resources;
                    int iN3;
                    View viewFindViewById;
                    IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
                    if (iHostAction != null && (topActivity = iHostAction.getTopActivity()) != null && (iN3 = C786410Ut5.n3((resources = topActivity.getResources()), "config_navBarInteractionMode", "integer", "android")) > 0 && resources.getInteger(iN3) == 2) {
                        Resources resources2 = topActivity.getResources();
                        int iN32 = C786410Ut5.n3(resources2, "config_navBarInteractionMode", "integer", "android");
                        if (iN32 <= 0 || resources2.getInteger(iN32) != 2 || (viewFindViewById = topActivity.findViewById(R.id.navigationBarBackground)) == null) {
                            return 0;
                        }
                        return viewFindViewById.getHeight();
                    }
                    return C2084308En.LIZ(context);
                }

                @Override // X.InterfaceC1118490fDD
                public final void LIZ(DialogFragment dialogFragment) {
                    dialogFragment.setStyle(1, com.zhiliaoapp.musically.R.style.aim);
                }

                @Override // X.InterfaceC1118490fDD
                public final void LIZIZ(Dialog dialog) {
                    int iLIZIZ;
                    int iLJFF;
                    int i2;
                    Window window = dialog.getWindow();
                    if (window != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        float f = 0.0f;
                        attributes.dimAmount = 0.0f;
                        float fLIZJ = C465640INu.LIZJ(C14KS.LJ(dialog.getContext()), window.getContext());
                        if (fLIZJ <= 0.0f || fLIZJ > 375.0f) {
                            fLIZJ = 375.0f;
                        }
                        attributes.width = (int) C497740JfY.LIZIZ(fLIZJ);
                        attributes.height = C1057350dcb.LIZ(window.getContext());
                        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).St()) {
                            f = 375.0f;
                        }
                        attributes.x = (int) C497740JfY.LIZIZ(f + 24.0f);
                        if (C497740JfY.LJIL()) {
                            iLIZIZ = (int) C497740JfY.LIZIZ(72.0f);
                            iLJFF = LJFF(dialog.getContext());
                        } else {
                            iLIZIZ = (int) C497740JfY.LIZIZ(76.0f);
                            iLJFF = LJFF(dialog.getContext());
                        }
                        attributes.y = iLIZIZ + iLJFF;
                        if (C497740JfY.LJJ()) {
                            i2 = 3;
                        } else {
                            i2 = 5;
                        }
                        attributes.gravity = i2 | 80;
                        attributes.softInputMode = 0;
                        window.setAttributes(attributes);
                        window.setWindowAnimations(com.zhiliaoapp.musically.R.style.as);
                    }
                }

                @Override // X.InterfaceC1118490fDD
                public final void LIZJ(Dialog dialog) {
                    dialog.setCanceledOnTouchOutside(true);
                }

                @Override // X.InterfaceC1118490fDD
                public final void LJ(Dialog dialog) {
                    dialog.requestWindowFeature(1);
                }
            };
        }
        if (z && (interfaceC1118490fDDGenLandscapeDialogProxy = genLandscapeDialogProxy()) != null) {
            return interfaceC1118490fDDGenLandscapeDialogProxy;
        }
        final C500980Jkm dialogParams = getDialogParams();
        return new InterfaceC1118490fDD(dialogParams) { // from class: X.0Jkl
            public final C500980Jkm LIZ;

            @Override // X.InterfaceC1118490fDD
            public final int getLayoutId() {
                return this.LIZ.LIZ;
            }

            {
                this.LIZ = dialogParams;
            }

            @Override // X.InterfaceC1118490fDD
            public final void LIZ(DialogFragment dialogFragment) {
                int i2;
                C500980Jkm c500980Jkm = this.LIZ;
                if (c500980Jkm.LIZLLL) {
                    i2 = com.zhiliaoapp.musically.R.style.ahb;
                } else {
                    i2 = com.zhiliaoapp.musically.R.style.ahg;
                }
                int i3 = c500980Jkm.LIZIZ;
                int i4 = c500980Jkm.LIZJ;
                if (i4 != -1) {
                    i2 = i4;
                }
                dialogFragment.setStyle(i3, i2);
            }

            @Override // X.InterfaceC1118490fDD
            public final void LIZIZ(Dialog dialog) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(this.LIZ.LJIIL);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    C500980Jkm c500980Jkm = this.LIZ;
                    attributes.dimAmount = c500980Jkm.LJI;
                    attributes.width = c500980Jkm.LJIIIZ;
                    int iLJIILLIIL = c500980Jkm.LJIIJ;
                    if (iLJIILLIIL == Integer.MIN_VALUE) {
                        iLJIILLIIL = (C497740JfY.LJIILLIIL() * this.LIZ.LJIIJJI) / 100;
                    }
                    attributes.height = iLJIILLIIL;
                    C500980Jkm c500980Jkm2 = this.LIZ;
                    attributes.gravity = c500980Jkm2.LJII;
                    attributes.softInputMode = c500980Jkm2.LJIILIIL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("dialog fragment setAttributes , width = ");
                    sbLIZ.append(window.getAttributes().width);
                    sbLIZ.append(" height = ");
                    sbLIZ.append(attributes.height);
                    sbLIZ.append(", dialog paramsL W=");
                    sbLIZ.append(this.LIZ.LJIIIZ);
                    sbLIZ.append(" H=");
                    sbLIZ.append(this.LIZ.LJIIJ);
                    sbLIZ.append(' ');
                    C20441214yg.LIZIZ("LiveDialogFragment", C2188811AlT.LIZIZ(sbLIZ));
                    window.setAttributes(attributes);
                    int i2 = this.LIZ.LJIIIIZZ;
                    if (i2 != -1) {
                        window.addFlags(i2);
                    }
                }
            }

            @Override // X.InterfaceC1118490fDD
            public final void LIZJ(Dialog dialog) {
                dialog.setCanceledOnTouchOutside(this.LIZ.LJ);
            }

            @Override // X.InterfaceC1118490fDD
            public final void LIZLLL(Dialog dialog) {
                dialog.setCancelable(this.LIZ.LJFF);
            }

            @Override // X.InterfaceC1118490fDD
            public final void LJ(Dialog dialog) {
                this.LIZ.getClass();
                dialog.requestWindowFeature(1);
            }
        };
    }

    public boolean isShowing() {
        Dialog dialog = getDialog();
        return dialog != null && dialog.isShowing();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        DataChannelGlobal.LLILZ.zQ2(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public C0U56 getPanelType() {
        return C0U56.DEFAULT;
    }

    public final boolean isViewValid() {
        return this.isViewValid;
    }

    public static void com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyDialogOnStart(LiveDialogFragment liveDialogFragment) {
        Window window;
        View decorView;
        liveDialogFragment.com_bytedance_android_livesdk_LiveDialogFragment__onStart$___twin___();
        Dialog dialog = liveDialogFragment.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, liveDialogFragment);
            ViewTreeViewModelStoreOwner.set(decorView, liveDialogFragment);
            decorView.setTag(com.zhiliaoapp.musically.R.id.view_tree_saved_state_registry_owner, liveDialogFragment);
        }
    }

    private final void notifyMotionInTryMode(RunnableC1118500fDE runnableC1118500fDE) {
        if (C500260Jjc.LJJJIL(this.dataChannel)) {
            ((ArrayList) runnableC1118500fDE.LLIZLLLIL).add(new ATListenerS450S0100000_17(this, 1));
        }
    }

    public final void addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        if (onDismissListener != null) {
            this.onDismissListenerList.add(onDismissListener);
        }
    }

    public final Dialog com_bytedance_android_livesdk_LiveDialogFragment__onCreateDialog$___twin___(Bundle bundle) {
        Dialog dialogNewDialog = newDialog(bundle);
        if (dialogNewDialog == null) {
            dialogNewDialog = super.onCreateDialog(bundle);
        }
        getLiveDialogProxy().LJ(dialogNewDialog);
        onDialogCreated(dialogNewDialog);
        return dialogNewDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        if (this.isViewValid) {
            dismissAllowingStateLoss();
        }
        DialogInterface.OnCancelListener onCancelListener = this.onCancelListener;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        boolean zLJI = MethodIDManager.LJI(202267);
        super.onCreate(bundle);
        this.isViewValid = false;
        this.dataChannel = C475510Ikn.LJ(this);
        getLiveDialogProxy().LIZ(this);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        C473050Igp.LIZIZ().LJ();
        super.onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.onDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        InterfaceC930060aJI interfaceC930060aJI = this.onDialogGoneListener;
        if (interfaceC930060aJI != null) {
            interfaceC930060aJI.LIZ();
        }
        List<DialogInterface.OnDismissListener> list = this.onDismissListenerList;
        if (list != null) {
            Iterator<DialogInterface.OnDismissListener> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().onDismiss(dialogInterface);
            }
        }
        this.onDismissListenerList.clear();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (C0IJ7.LIZLLL(getContext())) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
            getContext();
            return layoutInflaterOnGetLayoutInflater;
        }
        return super.onGetLayoutInflater(bundle);
    }

    public final void processMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getAction() == 0 || motionEvent.getAction() == 2) && System.currentTimeMillis() - this.lastMotionActionTime >= 1000) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.FQ2(DialogMotionEvent.class);
            }
            this.lastMotionActionTime = System.currentTimeMillis();
        }
    }

    public final void removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        if (onDismissListener != null) {
            this.onDismissListenerList.remove(onDismissListener);
        }
    }

    public final void setDialogParams(C500980Jkm c500980Jkm) {
        this.dialogParams = c500980Jkm;
    }

    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.onCancelListener = onCancelListener;
    }

    public final void setOnDialogGoneListener(InterfaceC930060aJI interfaceC930060aJI) {
        this.onDialogGoneListener = interfaceC930060aJI;
    }

    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.onDismissListener = onDismissListener;
    }

    public final void setViewValid(boolean z) {
        this.isViewValid = z;
    }

    public static Dialog com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_tux_business_base_DialogLancet_onCreateDialogHook(LiveDialogFragment liveDialogFragment, Bundle bundle) {
        View decorView;
        Dialog dialogCom_bytedance_android_livesdk_LiveDialogFragment__onCreateDialog$___twin___ = liveDialogFragment.com_bytedance_android_livesdk_LiveDialogFragment__onCreateDialog$___twin___(bundle);
        Window window = dialogCom_bytedance_android_livesdk_LiveDialogFragment__onCreateDialog$___twin___.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(com.zhiliaoapp.musically.R.id.yzv, liveDialogFragment);
        }
        C1389600mGU.LIZJ(dialogCom_bytedance_android_livesdk_LiveDialogFragment__onCreateDialog$___twin___);
        return dialogCom_bytedance_android_livesdk_LiveDialogFragment__onCreateDialog$___twin___;
    }

    public static final void onStart$setAttributesForDialog(LiveDialogFragment liveDialogFragment, Dialog dialog) {
        Window window = dialog.getWindow();
        if (window != null) {
            liveDialogFragment.getLiveDialogProxy().LIZIZ(dialog);
            if (disableAnim) {
                window.setWindowAnimations(0);
            }
        }
    }

    public int com_bytedance_android_livesdk_LiveDialogFragment__show$___twin___(C19EH c19eh, String str) {
        if (!C464800IKo.LIZ.LJIIJJI()) {
            C1118470fDB.LIZ(getPanelType());
            addDialog();
            c19eh.LIZLLL(this, str);
            C1965507mv.LJ(this, "mViewDestroyed", Boolean.FALSE);
            int iLJIIJ = c19eh.LJIIJ();
            C1965507mv.LJ(this, "mBackStackId", Integer.valueOf(iLJIIJ));
            return iLJIIJ;
        }
        return -1;
    }

    public void com_bytedance_android_livesdk_LiveDialogFragment__showNow$___twin___(FragmentManager fragmentManager, String str) {
        if (!C464800IKo.LIZ.LJIIJJI()) {
            C1118470fDB.LIZ(getPanelType());
            addDialog();
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LIZLLL(this, str);
            c19ehLJIIJ.LJIIL();
        }
    }

    public void inflateView(LayoutInflater layoutInflater, RunnableC1118500fDE runnableC1118500fDE) {
        int layoutId = getLiveDialogProxy().getLayoutId();
        C01GW c01gw = C485950J3x.LIZ;
        if (C485950J3x.LIZ(layoutId) && LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            C485950J3x.LIZIZ(runnableC1118500fDE.getContext(), layoutId, runnableC1118500fDE, true);
        } else {
            C786410Ut5.Td(layoutInflater, layoutId, runnableC1118500fDE, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (requireE2EAdaption()) {
            view.setFitsSystemWindows(true);
        }
        this.isViewValid = true;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.0fDC
                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                    if (4 == i && 1 == keyEvent.getAction()) {
                        return this.LL.onBackPressed();
                    }
                    return false;
                }
            });
        }
        if (view instanceof RunnableC1118500fDE) {
            ((RunnableC1118500fDE) view).setTraversalCallBack(new AwS596S0100000_17(this, 84));
        }
        if (adaptEdgeToEdge() && Build.VERSION.SDK_INT >= 35) {
            final int paddingTop = view.getPaddingTop();
            final int paddingBottom = view.getPaddingBottom();
            final int paddingStart = view.getPaddingStart();
            final int paddingEnd = view.getPaddingEnd();
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0Iyr
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    view2.setPadding(paddingStart + c20244914JjLIZ.LIZ, paddingTop + c20244914JjLIZ.LIZIZ, paddingEnd + c20244914JjLIZ.LIZJ, paddingBottom + c20244914JjLIZ.LIZLLL);
                    return c20246014Ju;
                }
            });
        }
    }

    public void com_bytedance_android_livesdk_LiveDialogFragment__show$___twin___(FragmentManager fragmentManager, String str) {
        if (!C464800IKo.LIZ.LJIIJJI()) {
            C1118470fDB.LIZ(getPanelType());
            addDialog();
            C19EH c19ehLJIIJ = fragmentManager.LJIIJ();
            c19ehLJIIJ.LJIIZILJ(this);
            c19ehLJIIJ.LIZLLL(this, str);
            c19ehLJIIJ.LJIIJ();
        }
    }

    public static void com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_lancet_PopupMonitorDialogLancet_showDialogFragment(LiveDialogFragment liveDialogFragment, FragmentManager fragmentManager, String str) {
        liveDialogFragment.com_bytedance_android_livesdk_LiveDialogFragment__show$___twin___(fragmentManager, str);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(liveDialogFragment);
    }

    public static void com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_lancet_PopupMonitorDialogLancet_showNow(LiveDialogFragment liveDialogFragment, FragmentManager fragmentManager, String str) {
        liveDialogFragment.com_bytedance_android_livesdk_LiveDialogFragment__showNow$___twin___(fragmentManager, str);
        PopupMonitorServiceImpl.LIZ.getClass();
        PopupMonitorServiceImpl.LJJIZ(liveDialogFragment);
    }

    public static void com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_tux_business_base_DialogLancet_showHook2LiveDialogFragment(LiveDialogFragment liveDialogFragment, FragmentManager fragmentManager, String str) {
        com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_lancet_PopupMonitorDialogLancet_showDialogFragment(liveDialogFragment, fragmentManager, str);
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896507bn c1896507bn = new C1896507bn(liveDialogFragment);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896507bn);
    }

    public static int com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_tux_business_base_DialogLancet_showHookLiveDialogFragment(LiveDialogFragment liveDialogFragment, C19EH c19eh, String str) {
        int iIntValue = Integer.valueOf(liveDialogFragment.com_bytedance_android_livesdk_LiveDialogFragment__show$___twin___(c19eh, str)).intValue();
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896507bn c1896507bn = new C1896507bn(liveDialogFragment);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896507bn);
        return iIntValue;
    }

    public static void com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_tux_business_base_DialogLancet_showNowHookLiveDialogFragment(LiveDialogFragment liveDialogFragment, FragmentManager fragmentManager, String str) {
        com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_lancet_PopupMonitorDialogLancet_showNow(liveDialogFragment, fragmentManager, str);
        C1766570w4V c1766570w4V = C1766570w4V.LIZ;
        C1896507bn c1896507bn = new C1896507bn(liveDialogFragment);
        c1766570w4V.getClass();
        C1766570w4V.LIZ(c1896507bn);
    }

    public final View com_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RunnableC1118500fDE runnableC1118500fDE;
        if (!PanelOpenCostTimesSetting.INSTANCE.getValue().mSwitch) {
            return C786410Ut5.Td(layoutInflater, getLiveDialogProxy().getLayoutId(), viewGroup, false);
        }
        View viewTd = C786410Ut5.Td(layoutInflater, com.zhiliaoapp.musically.R.layout.i2y, viewGroup, false);
        if ((viewTd instanceof RunnableC1118500fDE) && (runnableC1118500fDE = (RunnableC1118500fDE) viewTd) != null) {
            inflateView(layoutInflater, runnableC1118500fDE);
            ViewGroup.LayoutParams layoutParams = runnableC1118500fDE.getChildAt(0).getLayoutParams();
            layoutParams.height = -1;
            layoutParams.width = -1;
            notifyMotionInTryMode(runnableC1118500fDE);
            FrameLayout.LayoutParams customLayoutParams = getCustomLayoutParams();
            if (customLayoutParams != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(runnableC1118500fDE);
                runnableC1118500fDE.setLayoutParams(customLayoutParams);
            }
        }
        return viewTd;
    }

    public static View com_bytedance_android_livesdk_LiveDialogFragment_com_ss_android_ugc_aweme_lancet_compose_ComposeLifecycleOwnerHook_proxyOnCreateView(LiveDialogFragment liveDialogFragment, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewCom_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___ = liveDialogFragment.com_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___(layoutInflater, viewGroup, bundle);
        C19GS c19gs = null;
        if (!(viewCom_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___ instanceof View)) {
            viewCom_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___ = null;
        }
        if (viewCom_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___ != null) {
            try {
                ViewTreeLifecycleOwner.set(viewCom_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___, liveDialogFragment.getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewCom_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___, liveDialogFragment);
                viewCom_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___.setTag(com.zhiliaoapp.musically.R.id.view_tree_saved_state_registry_owner, liveDialogFragment);
                C19EG activity = liveDialogFragment.getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewCom_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewCom_bytedance_android_livesdk_LiveDialogFragment__onCreateView$___twin___;
    }
}

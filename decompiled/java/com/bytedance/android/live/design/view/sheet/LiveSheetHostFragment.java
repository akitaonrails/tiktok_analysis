package com.bytedance.android.live.design.view.sheet;

import X.C011Z;
import X.C098200Yq;
import X.C1389600mGU;
import X.C14JX;
import X.C1685300txQ;
import X.C189200o6;
import X.C19322210ia;
import X.C19322510id;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C20484615Do;
import X.C20484715Dp;
import X.C2211631BhB;
import X.C464790IKn;
import X.InterfaceC20244014Ja;
import X.InterfaceC20484815Dq;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveControllableDialogFragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetHostFragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.host.commonhost.CommonMixPageFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes29.dex */
public class LiveSheetHostFragment extends LiveControllableDialogFragment {
    public static boolean LLIZLLLIL = false;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLSogISIiHELIOSZzk6LTJiOic2LTFiBSYlLRYkLConACo/PQkhKSIhLCEn";
    public C20484615Do LL;
    public long LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public InterfaceC20484815Dq LLILZIL;
    public C19322510id LLILZLL;
    public int LLIZ = 16;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public boolean isSheet() {
        return !(this instanceof CommonMixPageFragment);
    }

    public final void MR() {
        SheetStackOptions sheetStackOptions;
        C20484615Do c20484615Do = this.LL;
        if (c20484615Do == null || (sheetStackOptions = c20484615Do.LJIILJJIL) == null || !sheetStackOptions.vshotExposeDetectEnabled) {
            return;
        }
        try {
            Dialog dialog = getDialog();
            if (dialog != null) {
                C2211631BhB.LIZIZ(dialog);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final int getTheme() {
        return C011Z.LIZ.LJIL() ? R.style.t1 : R.style.t0;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        MR();
        super.dismiss();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C20484715Dp c20484715Dp = C464790IKn.LIZ;
        long j = this.LLILLJJLI;
        ((ArrayList) c20484715Dp.LIZIZ).remove(c20484715Dp.LIZ.get(j));
        c20484715Dp.LIZ.remove(j);
    }

    @Override // com.bytedance.android.live.design.app.LiveControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        View decorView;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && dialog.getWindow() != null) {
            dialog.getWindow().setDimAmount(this.LLILZ);
            if (LLIZLLLIL) {
                dialog.getWindow().setWindowAnimations(0);
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        MR();
        super.onCancel(dialogInterface);
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && getFragmentManager() != null) {
            C19EH c19ehLJIIJ = getFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(this);
            c19ehLJIIJ.LJIIJ();
        } else {
            if (getArguments() == null) {
                return;
            }
            this.LLILLJJLI = getArguments().getLong("com.bytedance.android.live.design.view.sheet.SHEET_TOKEN");
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        LiveSheetDialog liveSheetDialog = new LiveSheetDialog(getContext(), getTheme());
        liveSheetDialog.LLJJ = "live_sheet_host_dialog";
        if (getArguments() != null) {
            boolean z = false;
            if (getArguments().getInt("com.bytedance.android.live.design.view.sheet.SHEET_PAD_ADAPTER_TYPE", 0) != 0) {
                z = true;
            }
            liveSheetDialog.LLJILLL = z;
        }
        liveSheetDialog.LLJILJIL = new C19322210ia(this);
        liveSheetDialog.LLJILJILJ = this;
        Window window = liveSheetDialog.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(liveSheetDialog);
        return liveSheetDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.setTag(R.id.v4d, this.LL);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        SheetStackOptions sheetStackOptions;
        C19322510id c19322510id = new C19322510id(layoutInflater.getContext());
        this.LLILZLL = c19322510id;
        c19322510id.setClipChildren(false);
        C19322510id c19322510id2 = this.LLILZLL;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19322510id2);
        c19322510id2.setLayoutParams(layoutParams);
        this.LLILZLL.setId(R.id.mub);
        this.LLILZLL.setSystemUiVisibility(1792);
        C19322510id c19322510id3 = this.LLILZLL;
        C19GS c19gs = null;
        if (getArguments() != null) {
            i = getArguments().getInt("com.bytedance.android.live.design.view.sheet.SHEET_PAD_ADAPTER_TYPE", 0);
            sheetStackOptions = (SheetStackOptions) getArguments().getParcelable("com.bytedance.android.live.design.view.sheet.SHEET_STACK_OPTIONS");
        } else {
            i = 0;
            sheetStackOptions = null;
        }
        C20484615Do c20484615Do = new C20484615Do(getContext(), getActivity(), getFragmentManager(), getChildFragmentManager(), c19322510id3, this.LLILLJJLI, this, i);
        this.LL = c20484615Do;
        c20484615Do.LJIILJJIL = sheetStackOptions;
        C20484715Dp c20484715Dp = C464790IKn.LIZ;
        c20484715Dp.LIZ.put(this.LLILLJJLI, c20484615Do);
        ((ArrayList) c20484715Dp.LIZIZ).add(c20484615Do);
        if (getArguments() != null) {
            String string = getArguments().getString("com.bytedance.android.live.design.view.sheet.FRAGMENT_TAG");
            InterfaceC20484815Dq interfaceC20484815Dq = this.LLILZIL;
            if (interfaceC20484815Dq != null) {
                C20484615Do c20484615Do2 = this.LL;
                if (((ArrayList) c20484615Do2.LJ).isEmpty()) {
                    c20484615Do2.LJIIJ(interfaceC20484815Dq, string);
                }
            } else {
                String string2 = getArguments().getString("com.bytedance.android.live.design.view.sheet.FRAGMENT_CLASS");
                Bundle bundle2 = getArguments().getBundle("com.bytedance.android.live.design.view.sheet.SHEET_START_ARGS");
                SheetOptions sheetOptions = (SheetOptions) getArguments().getParcelable("com.bytedance.android.live.design.view.sheet.SHEET_OPTIONS");
                C20484615Do c20484615Do3 = this.LL;
                if (((ArrayList) c20484615Do3.LJ).isEmpty()) {
                    c20484615Do3.LJIIIIZZ(bundle2, sheetOptions, string2, string);
                }
            }
        }
        if ((this.LL.LJII() || this.LL.LJIILIIL != 0) && getContext() != null) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(android.R.attr.backgroundDimAmount, typedValue, true);
            this.LLILLL = typedValue.getFloat();
        } else {
            this.LLILLL = 0.0f;
        }
        this.LLILZ = this.LLILLL;
        C14JX.LIZIZ(this.LLILZLL, new InterfaceC20244014Ja() { // from class: X.10ic
            @Override // X.InterfaceC20244014Ja
            public final C20244614Jg LIZ(View view, C20244614Jg c20244614Jg) {
                int i2;
                LiveSheetHostFragment liveSheetHostFragment = this.LIZ;
                liveSheetHostFragment.getClass();
                C20244814Ji c20244814JiLIZ = c20244614Jg.LIZ(2);
                C20484615Do c20484615Do4 = liveSheetHostFragment.LL;
                if (c20484615Do4 != null && !c20484615Do4.LJII()) {
                    C464790IKn.LIZ.getClass();
                    i2 = 0;
                } else {
                    i2 = c20244814JiLIZ.LIZLLL;
                }
                C19322510id c19322510id4 = liveSheetHostFragment.LLILZLL;
                c19322510id4.setPadding(c20244814JiLIZ.LIZ, c19322510id4.getPaddingTop(), c20244814JiLIZ.LIZJ, i2);
                liveSheetHostFragment.LLILZLL.setNavigationInsets(c20244814JiLIZ);
                C464790IKn.LIZ.LJFF();
                return c20244614Jg;
            }
        });
        C19322510id c19322510id4 = this.LLILZLL;
        if (!(c19322510id4 instanceof View)) {
            c19322510id4 = null;
        }
        if (c19322510id4 != null) {
            try {
                ViewTreeLifecycleOwner.set(c19322510id4, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(c19322510id4, this);
                c19322510id4.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return c19322510id4;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return c19322510id4;
    }
}

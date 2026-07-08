package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common;

import X.C01HZ;
import X.C1161920gLG;
import X.C786410Ut5;
import X.C915900ZwS;
import X.EnumC20429914wr;
import X.EnumC499801x6;
import X.InterfaceC986020blY;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes16.dex */
public abstract class BasePlaybookSheetFragment extends LiveSheetFragment {
    public final String LLJLLL = "";
    public boolean LLJZ;

    public abstract int getLayoutId();

    public boolean wS() {
        return false;
    }

    public final void zS() {
        DialogFragment dialogFragment;
        Dialog dialog;
        Window window;
        this.LLJZ = false;
        Fragment parentFragment = getParentFragment();
        if (!(parentFragment instanceof DialogFragment) || (dialogFragment = (DialogFragment) parentFragment) == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, window.getDecorView());
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 1.0f;
        window.setAttributes(attributes);
        C786410Ut5.T4(window.getDecorView(), 1.0f);
        window.getDecorView().invalidate();
        window.getDecorView().requestLayout();
    }

    public final void uS() {
        DialogFragment dialogFragment;
        Dialog dialog;
        Window window;
        if (this.LLJZ) {
            Fragment parentFragment = getParentFragment();
            if (!(parentFragment instanceof DialogFragment) || (dialogFragment = (DialogFragment) parentFragment) == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null) {
                return;
            }
            C786410Ut5.LJLLLLLL(8, window.getDecorView());
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = 0.0f;
            window.setAttributes(attributes);
            C786410Ut5.T4(window.getDecorView(), 0.0f);
            window.getDecorView().invalidate();
            window.getDecorView().requestLayout();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C01HZ c01hzKi1;
        super.onDestroy();
        if (!(!a0.LJJJIL(yS())) || (c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1()) == null) {
            return;
        }
        c01hzKi1.LIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ(yS()));
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        uS();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        uS();
    }

    public String yS() {
        return this.LLJLLL;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.draggable = false;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        InterfaceC986020blY interfaceC986020blYMb0;
        C01HZ c01hzKi1;
        super.onCreate(bundle);
        if ((!a0.LJJJIL(yS())) && (c01hzKi1 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).ki1()) != null) {
            c01hzKi1.LIZIZ(EnumC499801x6.PLAYBOOK, C915900ZwS.LIZIZ(yS()), null);
        }
        if (wS() && (interfaceC986020blYMb0 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).mb0()) != null) {
            interfaceC986020blYMb0.LIZIZ(EnumC20429914wr.PAGE, EnumC499801x6.PLAYBOOK, yS());
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, getLayoutId(), viewGroup, false);
    }
}

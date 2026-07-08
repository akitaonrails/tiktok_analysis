package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template;

import X.C0JDJ;
import X.C19EH;
import X.C20736316Cj;
import X.C465220IMe;
import X.C497740JfY;
import X.C786410Ut5;
import X.C969920bLa;
import X.C972080bP4;
import X.EnumC971610bOJ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class TemplateSheetFragment extends LiveSheetFragment implements C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzs7LSgpHELIOSZyE8PCwvLC08KTcoZyw8JSgjJ2E+PSk4ICwyJjMtOmEnLSg8JS4nLWsYLCIjJCQ4LBw7LSA4Dz0yLygpJzs=";
    public C969920bLa LLJLLL;
    public Function0<Unit> LLJZ;
    public boolean LLJZIJLIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        return false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.c_u, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.draggable = false;
        sheetOptions.canceledOnTouchOutside = true;
        sheetOptions.LIZ(1, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(8.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        Function0<Unit> function0 = this.LLJZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TemplateFragment templateFragment;
        super.onViewCreated(view, bundle);
        C969920bLa c969920bLa = this.LLJLLL;
        if (c969920bLa != null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI("TemplateFragment");
            if (fragmentLJJJJZI instanceof TemplateFragment) {
                templateFragment = (TemplateFragment) fragmentLJJJJZI;
            } else {
                templateFragment = null;
            }
            if (templateFragment == null) {
                EnumC971610bOJ enumC971610bOJ = EnumC971610bOJ.TEMPLATES;
                templateFragment = new TemplateFragment();
                templateFragment.LL = c969920bLa;
                templateFragment.LLILLJJLI = false;
                templateFragment.LLILLL = enumC971610bOJ;
                templateFragment.LLJILJIL = new AwS559S0100000_15(this, 53);
                C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
                c19ehLJIIJ.LJIJ(R.id.iiv, templateFragment, "TemplateFragment");
                c19ehLJIIJ.LJIIJ();
            }
            if (this.LLJZIJLIL) {
                this.LLJZIJLIL = false;
                templateFragment.MR();
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(C972080bP4.LIZ(layoutInflater), R.layout.hm_, viewGroup, false);
    }
}

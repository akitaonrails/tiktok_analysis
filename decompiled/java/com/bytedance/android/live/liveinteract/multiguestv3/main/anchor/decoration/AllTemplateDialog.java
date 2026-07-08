package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.decoration;

import X.C056N;
import X.C0JDJ;
import X.C1119170fEJ;
import X.C19EH;
import X.C20736316Cj;
import X.C465220IMe;
import X.C497740JfY;
import X.C758170Tod;
import X.C786410Ut5;
import X.C916750Zxp;
import X.C953400auw;
import X.C953460av2;
import X.C953610avH;
import X.C969910bLZ;
import X.C969920bLa;
import X.C972080bP4;
import X.EnumC124700dh;
import X.EnumC971610bOJ;
import Y.ACListenerS150S0100000_15;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.TemplateFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class AllTemplateDialog extends LiveSheetFragment implements C0JDJ {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjHELIOSo2OzE6emE+KSwiZy49Ky0jO2E3LSYjOy4nISoiZw4/JBEpJD8/KTEpDSYyJCor";
    public C953400auw LLJLLL;
    public Function0<Unit> LLJZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        return false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131854237));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C758170Tod(R.attr.eny, new ACListenerS150S0100000_15(this, 56)));
        c1119170fEJ.LJFF = arrayList;
        return c1119170fEJ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
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
        C953400auw c953400auw;
        Context context;
        DataChannel dataChannel;
        super.onViewCreated(view, bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI("TemplateFragment");
        if ((!(fragmentLJJJJZI instanceof TemplateFragment) || fragmentLJJJJZI == null) && (c953400auw = this.LLJLLL) != null && (context = c953400auw.LIZ.getContext()) != null && (dataChannel = c953400auw.LIZ.getDataChannel()) != null) {
            C953610avH.LJJI.getClass();
            String str = C953610avH.LJJII;
            if (str == null) {
                str = "";
            }
            C969920bLa c969920bLa = new C969920bLa(context, (C953460av2) c953400auw.LJFF.getValue(), dataChannel, C953400auw.LJII(context, dataChannel, new C916750Zxp(2, 0L, str)), new C969910bLZ(C056N.REOPEN_NOTICEBOARD_DIALOG, EnumC124700dh.NONE, false));
            EnumC971610bOJ enumC971610bOJ = EnumC971610bOJ.BOARD;
            TemplateFragment templateFragment = new TemplateFragment();
            templateFragment.LL = c969920bLa;
            templateFragment.LLILLJJLI = true;
            templateFragment.LLILLL = enumC971610bOJ;
            templateFragment.LLJILJIL = new AwS559S0100000_15(this, 576);
            C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.iiv, templateFragment, "TemplateFragment");
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(C972080bP4.LIZ(layoutInflater), R.layout.hm_, viewGroup, false);
    }
}

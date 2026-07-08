package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.anchor;

import X.C1119170fEJ;
import X.C19EH;
import X.C497740JfY;
import X.C758170Tod;
import X.C953050auN;
import X.EnumC952890au7;
import X.EnumC971980bOu;
import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment.BaseTextHeaderSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.textheader.common.fragment.TextHeaderListFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class AnchorTextHeaderListSheetFragment extends BaseTextHeaderSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzHELIOSs7LSgpZzs2MDEkLC43LTdiKCEwICo+Zw49Ky0jOxs2MDEELC43LTcAIDwnGy0pLDsVOiQrJCo9PA==";
    public final EnumC952890au7 LLL;
    public final AnchorTextHeaderViewModel LLLF;
    public Function0<Unit> LLLFF;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment
    public final int layoutId() {
        return R.layout.hm_;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131854239));
        c1119170fEJ.LJI = false;
        if (C953050auN.LIZ[this.LLL.ordinal()] != 1) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C758170Tod(R.attr.ea_, new ACListenerS165S0100000_31(this, 30)));
            c1119170fEJ.LJFF = arrayList;
            return c1119170fEJ;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C758170Tod(R.attr.ea_, new ACListenerS165S0100000_31(this, 28)));
        c1119170fEJ.LJ = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C758170Tod(R.attr.eny, new ACListenerS165S0100000_31(this, 29)));
        c1119170fEJ.LJFF = arrayList3;
        return c1119170fEJ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Function0<Unit> function0 = this.LLLFF;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.draggable = false;
        sheetOptions.canceledOnTouchOutside = true;
        sheetOptions.LIZ(1, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Fragment fragmentLJJJJZI = childFragmentManager.LJJJJZI("AnchorTextHeaderListSheetFragment");
        if (!(fragmentLJJJJZI instanceof TextHeaderListFragment) || fragmentLJJJJZI == null) {
            TextHeaderListFragment textHeaderListFragment = new TextHeaderListFragment(this.LLLF, EnumC971980bOu.ONLY_TEXT_HEADER_AND_CREATE_TYPE, this.LLL, new AwS575S0100000_31(this, 168));
            C19EH c19ehLJIIJ = childFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.iiv, textHeaderListFragment, "AnchorTextHeaderListSheetFragment");
            c19ehLJIIJ.LJIIJ();
        }
    }

    public AnchorTextHeaderListSheetFragment(EnumC952890au7 enumC952890au7, DataChannel dataChannel, AnchorTextHeaderViewModel anchorTextHeaderViewModel) {
        super(dataChannel);
        this.LLL = enumC952890au7;
        this.LLLF = anchorTextHeaderViewModel;
    }
}

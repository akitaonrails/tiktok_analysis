package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.anchor.ui;

import X.C19322110iZ;
import X.C20441214yg;
import X.C20736316Cj;
import X.C497740JfY;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes16.dex */
public final class NoticeboardSwitchSpotFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzHELIOSs7LSgpZyE8PCwvLC08KTcoZy49Ky0jO2EmIWsCJjs6KyAuJi4hLBY7IDswIBY8JjsVOiQrJCo9PA==";
    public int LLJLLL = -1;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.c5r, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.LIZ(0, null);
        sheetOptions.canceledOnTouchOutside = true;
        sheetOptions.draggable = false;
        return sheetOptions;
    }

    public final Long uS(FragmentManager fragmentManager) {
        Long lValueOf = null;
        try {
            lValueOf = Long.valueOf(C19322110iZ.LJFF(fragmentManager, this, "multi_guest_noticeboard_switch_spot", null, 0));
            return lValueOf;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJ("NoticeboardSwitchSpotFragment", th.getMessage());
            return lValueOf;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.anchor.ui.NoticeboardSwitchSpotFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hdn, viewGroup, false);
    }
}

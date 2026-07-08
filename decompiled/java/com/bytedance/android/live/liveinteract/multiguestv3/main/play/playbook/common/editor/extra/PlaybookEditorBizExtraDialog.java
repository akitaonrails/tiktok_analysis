package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.extra;

import X.C1119170fEJ;
import X.C20378714ob;
import X.C20379114of;
import X.C497740JfY;
import X.C500060JjI;
import X.C510160Jza;
import X.C515101zZ;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.pgc.PGCPlaybookEditorViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;
import webcast.data.multi_guest_play.PlaybookContentExtra;
import webcast.data.multi_guest_play.PlaybookCoverInfo;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybookEditorBizExtraDialog extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/HELIOSKTxiOSMyMScjJiR9KyohJCA9ZiAoIDs8OmspMTshKWscJS4qKiojIgo3ITEjOw06MgA0PT0yDCwtJSA0";
    public PGCPlaybookEditorViewModel LLJZIJLIL;
    public Function1<? super Integer, Unit> LLL;
    public LiveEditText LLLF;
    public LiveEditText LLLFF;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.hak;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        c500060JjI.LIZJ = 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131843824), R.style.a82, new C515101zZ(this, 0)));
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131851935), R.style.a7b, new C515101zZ(this, 1)));
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ("Biz Extra");
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.canceledOnTouchOutside = false;
        sheetOptionsIS.LIZ(1, null);
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        Function1<? super Integer, Unit> function1 = this.LLL;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C20378714ob c20378714ob;
        MutableLiveData<C20379114of> mutableLiveData;
        C20379114of value;
        Playbook playbook;
        PlaybookContent playbookContent;
        PlaybookContentExtra playbookContentExtra;
        PlaybookCoverInfo playbookCoverInfo;
        LiveEditText liveEditText;
        LiveEditText liveEditText2;
        super.onViewCreated(view, bundle);
        this.LLLF = (LiveEditText) view.findViewById(R.id.guf);
        this.LLLFF = (LiveEditText) view.findViewById(R.id.gt9);
        LiveEditText liveEditText3 = this.LLLF;
        if (liveEditText3 != null) {
            liveEditText3.setHint("Tap to input cover tag starling text");
        }
        LiveEditText liveEditText4 = this.LLLFF;
        if (liveEditText4 != null) {
            liveEditText4.setHint("Tap to input cover tag icon url key");
        }
        PGCPlaybookEditorViewModel pGCPlaybookEditorViewModel = this.LLJZIJLIL;
        if (pGCPlaybookEditorViewModel != null && (c20378714ob = pGCPlaybookEditorViewModel.LLILLL) != null && (mutableLiveData = c20378714ob.LIZIZ) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.LIZ) != null && (playbookContent = playbook.content) != null && (playbookContentExtra = playbookContent.contentExtra) != null && (playbookCoverInfo = playbookContentExtra.coverInfo) != null) {
            if ((!a0.LJJJIL(playbookCoverInfo.starlingKey)) && (liveEditText2 = this.LLLF) != null) {
                liveEditText2.setText(playbookCoverInfo.starlingKey);
            }
            if ((!a0.LJJJIL(playbookCoverInfo.iconUrl)) && (liveEditText = this.LLLFF) != null) {
                liveEditText.setText(playbookCoverInfo.iconUrl);
            }
        }
    }
}

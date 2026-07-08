package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor;

import X.C01GW;
import X.C1119170fEJ;
import X.C16HT;
import X.C1868260yiW;
import X.C1868270yiX;
import X.C1868280yiY;
import X.C1954807lC;
import X.C20361114ll;
import X.C20368314mv;
import X.C20369414n6;
import X.C20369614n8;
import X.C20369714n9;
import X.C20369814nA;
import X.C20374514nv;
import X.C452501pT;
import X.C497740JfY;
import X.C500060JjI;
import X.C500260Jjc;
import X.C510160Jza;
import X.C915190ZvJ;
import X.C951190arN;
import X.C978360bZC;
import X.EnumC20429614wo;
import X.InterfaceC20368414mw;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.livesdk.condition.Condition;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS240S0300000_31;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookConditionSelectDialog extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZzHELIOS8/KTxiOSMyMScjJiR9KyohJCA9ZiAoIDs8OmscJS4qKiojIgw8JiElPSY8JhYpJSowPAElKCM8Lw==";
    public final String LLJZIJLIL;
    public final List<C20368314mv> LLL;
    public final Function1<Condition, Unit> LLLF;
    public final Function0<Long> LLLFF;
    public final Function0<String> LLLFFI;
    public final Function0<Boolean> LLLFZ;
    public C510160Jza LLLI;
    public final C20369414n6 LLLII = new InterfaceC20368414mw() { // from class: X.14n6
        @Override // X.InterfaceC20368414mw
        public final void LIZ(C20368314mv c20368314mv) {
            int i = -1;
            int i2 = 0;
            int i3 = -1;
            int i4 = 0;
            for (C20368314mv c20368314mv2 : this.LIZ.LLL) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C20368314mv c20368314mv3 = c20368314mv2;
                    if (c20368314mv3.LIZIZ) {
                        c20368314mv3.LIZIZ = false;
                        i3 = i4;
                    }
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            c20368314mv.LIZIZ = true;
            for (C20368314mv c20368314mv4 : this.LIZ.LLL) {
                int i6 = i2 + 1;
                if (i2 >= 0) {
                    if (c20368314mv4.LIZIZ) {
                        i = i2;
                    }
                    i2 = i6;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (i3 >= 0 && i3 < this.LIZ.BS().LL.size()) {
                this.LIZ.BS().notifyItemChanged(i3);
            }
            if (i >= 0 && i < this.LIZ.BS().LL.size()) {
                this.LIZ.BS().notifyItemChanged(i);
            }
            this.LIZ.FS();
        }
    };
    public final C01GW LLLIIII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1485));

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.dwf;
    }

    public final C951190arN BS() {
        return (C951190arN) this.LLLIIII.getValue();
    }

    public final String ES() {
        List<C20368314mv> list = this.LLL;
        ArrayList arrayList = new ArrayList();
        for (C20368314mv c20368314mv : list) {
            if (c20368314mv.LIZJ == EnumC20429614wo.TIME) {
                arrayList.add(c20368314mv);
            }
        }
        if (C500260Jjc.LJJIJIIJI(arrayList)) {
            return "next_step_duration";
        }
        List<C20368314mv> list2 = this.LLL;
        ArrayList arrayList2 = new ArrayList();
        for (C20368314mv c20368314mv2 : list2) {
            if (c20368314mv2.LIZJ == EnumC20429614wo.NUM) {
                arrayList2.add(c20368314mv2);
            }
        }
        return C500260Jjc.LJJIJIIJI(arrayList2) ? "next_step_edit" : "next_step_choice";
    }

    public final void FS() {
        C510160Jza c510160Jza = this.LLLI;
        if (c510160Jza != null) {
            List<C20368314mv> list = this.LLL;
            ArrayList arrayList = new ArrayList();
            for (C20368314mv c20368314mv : list) {
                if (c20368314mv.LIZIZ) {
                    arrayList.add(c20368314mv);
                }
            }
            C20374514nv.LJIIJJI(c510160Jza, C500260Jjc.LJJIJIIJI(arrayList));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        c500060JjI.LIZJ = 0;
        ArrayList arrayList = new ArrayList();
        C510160Jza c510160Jza = new C510160Jza(C497740JfY.LJIJI(2131855257), R.style.ajw, new C16HT(this, 0));
        this.LLLI = c510160Jza;
        arrayList.add(c510160Jza);
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131855258));
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.draggable = false;
        sheetOptions.LIZ(0, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.qp8);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        recyclerView.setAdapter(BS());
        recyclerView.setLayoutManager(linearLayoutManager);
        C951190arN c951190arNBS = BS();
        List<C20368314mv> list = this.LLL;
        ArrayList arrayList = new ArrayList();
        for (C20368314mv c20368314mv : list) {
            int i = C20361114ll.LIZ[c20368314mv.LIZJ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        arrayList.add(new C1868280yiY(c20368314mv));
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    arrayList.add(new C1868270yiX(c20368314mv));
                }
            } else {
                arrayList.add(new C1868260yiW(c20368314mv));
            }
        }
        c951190arNBS.LLLII(arrayList);
        FS();
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        String strES = ES();
        C978360bZC.LJIJJLI(this.LLLFF.invoke(), strES, this.LLLFFI.invoke(), this.LLJZIJLIL, this.LLLFZ.invoke().booleanValue());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.14n6] */
    public PlaybookConditionSelectDialog(DataChannel dataChannel, String str, List list, AwS240S0300000_31 awS240S0300000_31, C20369714n9 c20369714n9, C20369814nA c20369814nA, C20369614n8 c20369614n8) {
        this.LLJZIJLIL = str;
        this.LLL = list;
        this.LLLF = awS240S0300000_31;
        this.LLLFF = c20369714n9;
        this.LLLFFI = c20369814nA;
        this.LLLFZ = c20369614n8;
    }
}

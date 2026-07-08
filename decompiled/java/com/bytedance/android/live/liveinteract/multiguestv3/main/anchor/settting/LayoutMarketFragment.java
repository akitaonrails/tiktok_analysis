package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting;

import X.C01GW;
import X.C0H79;
import X.C1119170fEJ;
import X.C13LP;
import X.C15438062q;
import X.C20736316Cj;
import X.C2097908Jt;
import X.C452501pT;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C717610SCx;
import X.C717620SCy;
import X.C748880TZe;
import X.C786410Ut5;
import X.C927400aF0;
import X.C931740aM0;
import X.C931750aM1;
import X.C940770aaZ;
import X.C942210act;
import X.C942220acu;
import X.C942230acv;
import X.C942240acw;
import X.C948100amO;
import X.C948360amo;
import X.C948400ams;
import X.C950880aqs;
import X.C960203pA;
import X.InterfaceC920220a3Q;
import X.InterfaceC930220aJY;
import Y.ACListenerS150S0100000_15;
import Y.AComparatorS514S0100000_15;
import Y.AObjectS379S0100000_3;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.decoration.MultiGuestDecorationDialog;
import com.bytedance.android.livesdk.dataChannel.MultiGuestShowLayoutSettingDialogEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.LayoutState;

/* JADX INFO: loaded from: classes16.dex */
public final class LayoutMarketFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2HELIOSOzE6emE+KSwiZy49Ky0jO2EgLTE4PSY9L2sAKDY8PTEBKD04LTEKOy40JSAiPQ==";
    public View LLJLLL;
    public RecyclerView LLJZ;
    public C948360amo LLJZIJLIL;
    public LayoutItemClickHandler LLL;
    public Function0<Unit> LLLF;
    public DataChannel LLLFF;
    public String LLLFFI;
    public InterfaceC930220aJY LLLFZ;
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS559S0100000_15(this, 188));

    public interface LayoutItemClickHandler extends Parcelable {
        void Fz(Integer num, int i, Context context, LifecycleOwner lifecycleOwner, Function0<Unit> function0, Function1<? super LayoutState, Unit> function1, Function0<Unit> function02);

        void Mf(int i, View view);
    }

    static {
        new C942220acu();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(getString(2131842393));
        c1119170fEJ.LJ = Collections.singletonList(WR(new ACListenerS150S0100000_15(this, 60)));
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    public final List<C948400ams> uS() {
        Context context = C500260Jjc.LJIL() ? null : getContext();
        C942210act c942210act = C942210act.LIZ;
        boolean zLIZ = C942240acw.LIZ(this.LLLFFI);
        c942210act.getClass();
        ArrayList arrayList = new ArrayList();
        boolean zLIZIZ = context == null ? false : C960203pA.LIZIZ(context);
        c942210act.LIZ(arrayList, zLIZIZ, zLIZ);
        c942210act.LIZIZ(arrayList, zLIZIZ);
        C717620SCy c717620SCy = new C717620SCy(new AObjectS379S0100000_3(MultiGuestPanelLayoutTypeListConfigSetting.INSTANCE.getValue(), 4));
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCy, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        Iterator it2 = c717620SCy.iterator();
        while (true) {
            C717610SCx c717610SCx = (C717610SCx) it2;
            if (!c717610SCx.hasNext()) {
                return C13LP.LJLLLL(new AComparatorS514S0100000_15(linkedHashMap, 15), arrayList);
            }
            IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
            Pair pair = new Pair(indexedValue.LIZIZ, Integer.valueOf(indexedValue.LIZ));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezk, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        DataChannel dataChannelLJ;
        FragmentManager fragmentManager;
        Function0<Unit> function0 = this.LLLF;
        if (function0 != null) {
            function0.invoke();
        }
        if (Intrinsics.LJFF(this.LLLFFI, "live_take_detail")) {
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            if (dataChannelLJ2 != null) {
                dataChannelLJ2.LC0(MultiGuestShowLayoutSettingDialogEvent.class, new C927400aF0(true, false, 2));
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(this.LLLFFI, "design_page")) {
            String str = MultiGuestDecorationDialog._pnsPageId;
            DataChannel dataChannelLJ3 = this.LLLFF;
            if (dataChannelLJ3 == null) {
                dataChannelLJ3 = C475510Ikn.LJ(this);
            }
            C950880aqs.LIZ(dataChannelLJ3);
            return;
        }
        if (C942240acw.LIZ(this.LLLFFI) || (dataChannelLJ = C475510Ikn.LJ(this)) == null || (fragmentManager = (FragmentManager) dataChannelLJ.gg0(C748880TZe.class)) == null) {
            return;
        }
        C942230acv c942230acv = C942230acv.LIZ;
        String str2 = this.LLLFFI;
        if (str2 == null) {
            str2 = "unknown";
        }
        c942230acv.LIZ(fragmentManager, str2, C475510Ikn.LJ(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            super.onViewCreated(r5, r6)
            android.view.View r1 = r4.LLJLLL
            if (r1 == 0) goto L12
            r0 = 2131389178(0x7f0a6afa, float:1.8398892E38)
            android.view.View r0 = r1.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r4.LLJZ = r0
        L12:
            X.0amo r2 = new X.0amo
            X.0aJY r1 = r4.LLLFZ
            if (r1 != 0) goto L1a
            X.0aJW r1 = X.C930200aJW.LIZ
        L1a:
            java.lang.String r0 = "layout_market"
            r2.<init>(r0, r1)
            r4.LLJZIJLIL = r2
            androidx.recyclerview.widget.RecyclerView r3 = r4.LLJZ
            if (r3 == 0) goto L32
            androidx.recyclerview.widget.GridLayoutManager r2 = new androidx.recyclerview.widget.GridLayoutManager
            android.content.Context r1 = r4.getContext()
            r0 = 4
            r2.<init>(r1, r0)
            r3.setLayoutManager(r2)
        L32:
            androidx.recyclerview.widget.RecyclerView r1 = r4.LLJZ
            if (r1 == 0) goto L3b
            X.0amo r0 = r4.LLJZIJLIL
            r1.setAdapter(r0)
        L3b:
            boolean r0 = X.C500260Jjc.LJJIL()
            if (r0 == 0) goto L86
            com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L86
            java.lang.String r0 = r4.LLLFFI
            boolean r0 = X.C942240acw.LIZ(r0)
            if (r0 != 0) goto L86
            X.0amO r0 = X.C0H79.LIZ()
            if (r0 == 0) goto L8f
            java.lang.Integer r0 = r0.LIZIZ
            if (r0 == 0) goto L8f
            int r2 = r0.intValue()
        L5f:
            X.0amo r1 = r4.LLJZIJLIL
            if (r1 == 0) goto L6a
            java.util.List r0 = r4.uS()
            r1.LLLI(r0)
        L6a:
            X.0amo r0 = r4.LLJZIJLIL
            if (r0 == 0) goto L71
            r0.LLLJL(r2)
        L71:
            X.0amo r1 = r4.LLJZIJLIL
            if (r1 == 0) goto L7f
            X.01GW r0 = r4.LLLI
            java.lang.Object r0 = r0.getValue()
            X.0adX r0 = (X.C942610adX) r0
            r1.LLIZLLLIL = r0
        L7f:
            r1 = 0
            java.lang.String r0 = "show"
            r4.wS(r0, r1)
            return
        L86:
            X.0aJY r0 = r4.LLLFZ
            if (r0 == 0) goto L8f
            int r2 = r0.getPanelLayoutType()
            goto L5f
        L8f:
            r2 = 1
            goto L5f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.LayoutMarketFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void wS(String str, String str2) {
        boolean z;
        String strLJIL;
        String strLIZ;
        InterfaceC920220a3Q dataSource = C940770aaZ.LIZ().getDataSource();
        if (C500260Jjc.LJJIL() && !C942240acw.LIZ(this.LLLFFI)) {
            z = true;
            C948100amO c948100amOLIZ = C0H79.LIZ();
            if (c948100amOLIZ == null || (strLJIL = c948100amOLIZ.LIZLLL) == null) {
                strLJIL = "";
            }
        } else {
            z = false;
            strLJIL = dataSource.LJIL();
        }
        Integer numValueOf = null;
        if (z) {
            C948100amO c948100amOLIZ2 = C0H79.LIZ();
            if (c948100amOLIZ2 != null) {
                strLIZ = c948100amOLIZ2.LJ;
            } else {
                strLIZ = null;
            }
            C948100amO c948100amOLIZ3 = C0H79.LIZ();
            if (c948100amOLIZ3 != null) {
                numValueOf = c948100amOLIZ3.LIZIZ;
            }
        } else {
            strLIZ = dataSource.LIZ();
            numValueOf = Integer.valueOf(dataSource.getPanelLayoutType());
        }
        String strValueOf = String.valueOf(strLIZ);
        String strValueOf2 = String.valueOf(numValueOf);
        List<C948400ams> listUS = uS();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listUS, 10));
        Iterator<C948400ams> it2 = listUS.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(it2.next().LIZIZ));
        }
        String str3 = this.LLLFFI;
        if (str3 == null) {
            str3 = "unknown";
        }
        C931750aM1 c931750aM1 = new C931750aM1(str, strLJIL, strValueOf, strValueOf2, null, arrayList, "show_all_panel", str3, 240);
        if (Intrinsics.LJFF(str, "click") && str2 != null) {
            c931750aM1.LJII = str2;
        }
        C931740aM0.LJIIJJI(c931750aM1);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.d85, viewGroup, false);
        this.LLJLLL = viewTd;
        return viewTd;
    }
}

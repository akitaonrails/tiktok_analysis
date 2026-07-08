package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.sharerevenue;

import X.C1119170fEJ;
import X.C20736316Cj;
import X.C497740JfY;
import Y.ACListenerS150S0100000_15;
import android.content.Context;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiGuestSelectShareRevenueSheetFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZy49Ky0jO2HELIOSEgLTE4PSY9L2s/IS4hLTcpPyo9PSBiBDo/PCwLPCogPBYpJSowPBYkKD02GiA6LCEmLRYkLConDjctLiI2JjE=";
    public DataChannel LLJLLL;
    public int LLJZ;
    public Function1<? super Integer, Unit> LLJZIJLIL;
    public Function1<? super Integer, Unit> LLL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        ArrayList arrayList = new ArrayList();
        arrayList.add(WR(new ACListenerS150S0100000_15(this, 61)));
        c1119170fEJ.LJ = arrayList;
        c1119170fEJ.LJI = false;
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131854394));
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezn, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.draggable = false;
        sheetOptions.LIZ(3, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        Function1<? super Integer, Unit> function1 = this.LLL;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View dS(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            r12 = this;
            r0 = 2131567725(0x7f0d246d, float:1.8761028E38)
            r2 = 0
            android.view.View r4 = X.C786410Ut5.Td(r13, r0, r14, r2)
            r0 = 2131390755(0x7f0a7123, float:1.840209E38)
            android.view.View r6 = r4.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r0 = r12.getContext()
            r1.<init>(r0)
            r6.setLayoutManager(r1)
            r9 = 3
            java.lang.Integer[] r1 = new java.lang.Integer[r9]
            r8 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1[r2] = r0
            r7 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1[r8] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1[r7] = r0
            java.util.List r1 = X.C1697810uHb.LJIIJJI(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r1, r0)
            r5.<init>(r0)
            java.util.Iterator r11 = r1.iterator()
        L47:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r0 = r11.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.String r2 = X.C917750ZzR.LJ(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
            if (r10 == 0) goto L7b
            int r0 = r10.intValue()
            if (r0 != r8) goto L7b
            r0 = 2131854389(0x7f118435, float:1.9342452E38)
            java.lang.String r1 = X.C497740JfY.LJIJI(r0)
        L72:
            X.0aRc r0 = new X.0aRc
            r0.<init>(r2, r3, r1)
            r5.add(r0)
            goto L47
        L7b:
            r1 = 2131854391(0x7f118437, float:1.9342456E38)
            if (r10 == 0) goto L99
            int r0 = r10.intValue()
            if (r0 != r7) goto L8b
            java.lang.String r1 = X.C497740JfY.LJIJI(r1)
            goto L72
        L8b:
            int r0 = r10.intValue()
            if (r0 != r9) goto L99
            r0 = 2131854393(0x7f118439, float:1.934246E38)
            java.lang.String r1 = X.C497740JfY.LJIJI(r0)
            goto L72
        L99:
            java.lang.String r1 = X.C497740JfY.LJIJI(r1)
            goto L72
        L9e:
            X.0aRb r3 = new X.0aRb
            int r2 = r12.LLJZ
            kotlin.jvm.internal.AwS629S0100000_15 r1 = new kotlin.jvm.internal.AwS629S0100000_15
            r0 = 19
            r1.<init>(r12, r0)
            r3.<init>(r5, r2, r1)
            r6.setAdapter(r3)
            int r0 = r12.LLJZ
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            int r2 = X.C921180a4y.LJIIL(r0)
            r1 = 0
            java.lang.String r0 = "page_show"
            X.C917290Zyh.LIZLLL(r2, r3, r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.sharerevenue.MultiGuestSelectShareRevenueSheetFragment.dS(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}

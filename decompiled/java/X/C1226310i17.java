package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.saas.host.api.chatlist.IMChatListBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.notice.NoticeFeature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0i17, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226310i17 extends C1225700i08 {
    public final Context LLILZ;
    public final Function1<Integer, String> LLILZIL;

    @Override // X.C1225700i08, X.InterfaceC1224490hyB
    public final void LJIJ(C1224590hyL c1224590hyL) {
        C1224780hye c1224780hyeLJIILLIIL;
        List<C1224840hyk> list;
        String mobValue;
        C05RV c05rvLIZJ;
        super.LJIJ(c1224590hyL);
        InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
        if (interfaceC1226510i1R != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1224840hyk> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LLILZ);
            }
            if (!arrayList.isEmpty()) {
                IMChatListBridgeApi.LIZ.getClass();
                IMChatListBridgeApi value = C1566306Bh.LIZIZ.getValue();
                if (value != null) {
                    value.LIZJ(C1388190mED.LIZ(this.LLILZ), arrayList, true, new AwS420S0200000_19(this, (C1226310i17) arrayList, (List<String>) 209), new AwS563S0100000_19(this, 3355));
                }
                int size = arrayList.size();
                Pair[] pairArr = new Pair[2];
                NoticeFeature noticeFeatureLIZ = NoticeFeature.LIZ.LIZ();
                if (noticeFeatureLIZ == null || (c05rvLIZJ = noticeFeatureLIZ.LIZJ()) == null || (mobValue = c05rvLIZJ.getMobValue()) == null) {
                    mobValue = "";
                }
                pairArr[0] = new Pair("inbox_mode", mobValue);
                pairArr[1] = new Pair("num", String.valueOf(size));
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("im_add_to_starred_page_add_click", mapLJIIIIZZ);
            }
        }
    }

    @Override // X.C1225700i08, X.InterfaceC1224250hxn
    public final void LJJJ(C1224790hyf c1224790hyf) {
        List<C1224840hyk> list = c1224790hyf.LIZIZ;
        if (list == null) {
            return;
        }
        LJJJJJ(list.size(), false);
    }

    public C1226310i17(AbstractC1225770i0F abstractC1225770i0F, C1226220i0y c1226220i0y) {
        super(abstractC1225770i0F, c1226220i0y);
        this.LLILZ = c1226220i0y.LJIIIZ;
        this.LLILZIL = c1226220i0y.LJIIJ;
    }

    public final void LJJJJJ(int i, boolean z) {
        boolean z2;
        InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
        if (interfaceC1226510i1R != null) {
            EnumC1227730i3P enumC1227730i3P = EnumC1227730i3P.MAIN;
            if (i > 0 && !z) {
                z2 = true;
            } else {
                z2 = false;
            }
            interfaceC1226510i1R.LJIIJJI(new C1224600hyM(enumC1227730i3P, Boolean.valueOf(z2), this.LLILZIL.invoke(Integer.valueOf(i)), Boolean.TRUE, Boolean.valueOf(z)), false);
        }
    }
}

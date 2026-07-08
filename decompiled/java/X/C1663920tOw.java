package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.recorder.voicechange.slideslip.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0tOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1663920tOw extends C2217421BqW implements Function2<Integer, AbstractC1663570tON, Unit> {
    public C1663920tOw(Object obj) {
        super(2, obj, v.class, "onItemClickDebounceListener", "onItemClickDebounceListener(ILcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voicechange/state/SVCSlipEffect;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, AbstractC1663570tON abstractC1663570tON) {
        int iIntValue = num.intValue();
        AbstractC1663570tON abstractC1663570tON2 = abstractC1663570tON;
        v vVar = ((v) this.receiver).LLJJLIIIJLLLLLLLZ.LIZ;
        if (!vVar.LLJJL.LLILLJJLI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onItemViewClicked: pos = ");
            sbLIZ.append(iIntValue);
            sbLIZ.append(", item = ");
            sbLIZ.append(C1663610tOR.LIZIZ(abstractC1663570tON2));
            C2188811AlT.LIZIZ(sbLIZ);
            if (!C1663610tOR.LIZJ(abstractC1663570tON2, vVar.LLLIIII)) {
                RecyclerView recyclerView = vVar.LLJLL;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                recyclerView.smoothScrollToPosition(iIntValue);
            }
            if (abstractC1663570tON2 instanceof C1663580tOO) {
                vVar.LLLLIL().LJ.invoke();
            } else {
                vVar.LLLLIL().LJFF.invoke(Integer.valueOf(iIntValue), abstractC1663570tON2);
            }
        }
        return Unit.LIZ;
    }
}

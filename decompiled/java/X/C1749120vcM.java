package X;

import android.text.Editable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfCell;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vcM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749120vcM extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ CpfCell LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1749120vcM(long j, C259800zU<String> c259800zU, CpfCell cpfCell) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = cpfCell;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) throws Throwable {
        boolean z;
        Object obj;
        Object obj2;
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign("input_box_name", "CPF");
        laneParams2.plusAssign("stay_time", Long.valueOf(this.LL));
        laneParams2.plusAssign("input_method", this.LLILLJJLI.element);
        Editable editableLLLLJI = C2204961BRm.LLLLJI((C0I7D) this.LLILLL.itemView.findViewById(R.id.hcd), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnumb/RY5KwLk70x0q03LozzNkFmcbsUcvn1n6A=", null));
        if (editableLLLLJI != null && editableLLLLJI.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str = "1";
        if (!z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams2.plusAssign("has_normal_input", obj);
        laneParams2.plusAssign("has_auto_input", CardStruct.IStatusCode.DEFAULT);
        if (this.LLILLL.LLJJIJIL) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams2.plusAssign("has_sug_input", obj2);
        if (this.LLILLL.LLJJIJI != EnumC1749100vcK.SUCCESS) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams2.plusAssign("is_valid", str);
        return Unit.LIZ;
    }
}

package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SearchInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745100vVs extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ SearchInputItemViewHolder LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745100vVs(long j, C259800zU<String> c259800zU, String str, SearchInputItemViewHolder searchInputItemViewHolder) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = str;
        this.LLILZ = searchInputItemViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        boolean z;
        Object obj;
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign("stay_time", Long.valueOf(this.LL));
        laneParams2.plusAssign("input_method", this.LLILLJJLI.element);
        String str = this.LLILLL;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (!z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams2.plusAssign("has_normal_input", obj);
        laneParams2.plusAssign("has_auto_input", CardStruct.IStatusCode.DEFAULT);
        if (this.LLILZ.LLJJIJIIJIL) {
            str2 = "1";
        }
        laneParams2.plusAssign("has_sug_input", str2);
        laneParams2.plusAssign("is_valid", "1");
        return Unit.LIZ;
    }
}

package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.virtual.AudienceDecorationStateViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.virtual.AudienceDecorationVirtualMeasureAssem;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.BoardItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xNL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1816690xNL extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AudienceDecorationVirtualMeasureAssem LL;
    public final /* synthetic */ Board LLILLJJLI;
    public final /* synthetic */ BoardItem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816690xNL(AudienceDecorationVirtualMeasureAssem audienceDecorationVirtualMeasureAssem, Board board, BoardItem boardItem) {
        super(0);
        this.LL = audienceDecorationVirtualMeasureAssem;
        this.LLILLJJLI = board;
        this.LLILLL = boardItem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1145410fud.LIZJ(-53, this.LL.Lo().LL, this.LLILLJJLI.id, this.LLILLL.id, "item_render_error");
        AudienceDecorationStateViewModel audienceDecorationStateViewModelNo = this.LL.No();
        long j = this.LLILLL.id;
        InterfaceC390601fU interfaceC390601fU = (InterfaceC390601fU) audienceDecorationStateViewModelNo.LLILLL.getValue();
        if (interfaceC390601fU != null) {
            interfaceC390601fU.LIZIZ(j, false);
        }
        return Unit.LIZ;
    }
}

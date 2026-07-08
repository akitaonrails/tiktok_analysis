package X;

import com.bytedance.android.live.EditDecorationItemEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.DecorationEditAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1817510xOf extends C09AY implements Function1<AbstractC1556400qbW, Unit> {
    public final /* synthetic */ DecorationEditAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1817510xOf(DecorationEditAssem decorationEditAssem) {
        super(1);
        this.LL = decorationEditAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1556400qbW abstractC1556400qbW) {
        AbstractC1556400qbW abstractC1556400qbW2 = abstractC1556400qbW;
        if (!(abstractC1556400qbW2 instanceof C1556410qbX)) {
            if (abstractC1556400qbW2 instanceof C1556390qbV) {
                C1556390qbV c1556390qbV = (C1556390qbV) abstractC1556400qbW2;
                this.LL.ip().vQ2(c1556390qbV.LIZ, c1556390qbV.LIZIZ);
                DataChannel dataChannel = this.LL.hp().LLILLJJLI;
                if (dataChannel != null) {
                    dataChannel.LC0(EditDecorationItemEvent.class, new AbstractC1556400qbW() { // from class: X.0qbX
                    });
                }
            } else {
                throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }
}

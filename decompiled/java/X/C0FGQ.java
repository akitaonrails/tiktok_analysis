package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStyleModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0FGQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FGQ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0FGO LL;
    public final /* synthetic */ TextStyleModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C0FGT LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FGQ(C0FGO c0fgo, TextStyleModel textStyleModel, int i, C0FGT c0fgt, int i2) {
        super(0);
        this.LL = c0fgo;
        this.LLILLJJLI = textStyleModel;
        this.LLILLL = i;
        this.LLILZ = c0fgt;
        this.LLILZIL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0FGZ c0fgz;
        InterfaceC387190FGb interfaceC387190FGb = this.LL.LLJJIJI;
        if (interfaceC387190FGb != null) {
            interfaceC387190FGb.LIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ.LJFF, false);
        }
        List<C0FGZ> list = this.LL.T2().LIZJ;
        String str = (list == null || (c0fgz = (C0FGZ) C13LP.LJJJLZIJ(this.LLILZIL, list)) == null) ? null : c0fgz.LIZ;
        C0FGR c0fgrZ4 = this.LL.Z4();
        if (c0fgrZ4 != null) {
            TextStickerModel textStickerModel = this.LL.LLJJIJIIJIL;
            String value = C0FHF.CLICK.getValue();
            Effect effect = this.LLILZ.LIZ;
            c0fgrZ4.LJ(textStickerModel, value, str, effect != null ? effect.getResourceId() : null);
        }
        return Unit.LIZ;
    }
}

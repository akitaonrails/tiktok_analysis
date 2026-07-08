package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.DecorationDoneButtonAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JKo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C490280JKo extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ DecorationDoneButtonAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C490280JKo(DecorationDoneButtonAssem decorationDoneButtonAssem) {
        super(1);
        this.LL = decorationDoneButtonAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        this.LL.Ho(bool.booleanValue());
        return Unit.LIZ;
    }
}

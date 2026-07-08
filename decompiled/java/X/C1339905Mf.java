package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.PcsAudienceDecorationAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05Mf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1339905Mf extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PcsAudienceDecorationAssem LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1339905Mf(PcsAudienceDecorationAssem pcsAudienceDecorationAssem, View view) {
        super(1);
        this.LL = pcsAudienceDecorationAssem;
        this.LLILLJJLI = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.LL.LLJIJIL = this.LLILLJJLI.getVisibility();
            C786410Ut5.LJLLLLLL(8, this.LLILLJJLI);
        } else {
            C786410Ut5.LJLLLLLL(this.LL.LLJIJIL, this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}

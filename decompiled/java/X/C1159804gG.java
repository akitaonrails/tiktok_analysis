package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.PcsAudienceDecorationAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04gG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1159804gG extends C09AY implements Function1<C696590RUb, Unit> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1159804gG(View view) {
        super(1);
        this.LL = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C696590RUb c696590RUb2 = c696590RUb;
        c696590RUb2.LL = C13LE.LIZ(PcsAudienceDecorationAssem.class);
        c696590RUb2.LLJ = this.LL;
        return Unit.LIZ;
    }
}

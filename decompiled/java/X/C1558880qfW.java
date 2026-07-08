package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.DecorationDoneButtonAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.SaveAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558880qfW extends C09AY implements Function1<C696590RUb, Unit> {
    public final /* synthetic */ SaveAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558880qfW(SaveAssem saveAssem) {
        super(1);
        this.LL = saveAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C696590RUb c696590RUb) {
        C696590RUb c696590RUb2 = c696590RUb;
        c696590RUb2.LL = C13LE.LIZ(DecorationDoneButtonAssem.class);
        c696590RUb2.LLJ = this.LL.LJJIJL();
        return Unit.LIZ;
    }
}

package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1656950tDh extends C2217421BqW implements InterfaceC1631630sYr<Effect, Integer, Integer, Integer, Unit> {
    public C1656950tDh(C1656880tDa c1656880tDa) {
        super(4, c1656880tDa, C1656880tDa.class, "changeDuetLayoutInfo", "changeDuetLayoutInfo(Lcom/ss/android/ugc/effectmanager/effect/model/Effect;III)V", 0);
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(Effect effect, Integer num, Integer num2, Integer num3) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        int iIntValue3 = num3.intValue();
        ((C1656880tDa) this.receiver).K4(effect, iIntValue, iIntValue2, iIntValue3);
        return Unit.LIZ;
    }
}

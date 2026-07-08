package X;

import Y.ARunnableS39S0101000_28;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveContactsUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10Ek, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C19212810Ek extends C2217421BqW implements Function1<Integer, Unit> {
    public C19212810Ek(RemoveContactsUnit removeContactsUnit) {
        super(1, removeContactsUnit, RemoveContactsUnit.class, "setRemoveIVState", "setRemoveIVState(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        RemoveContactsUnit removeContactsUnit = (RemoveContactsUnit) this.receiver;
        removeContactsUnit.getClass();
        C2487409ou.LIZJ(new ARunnableS39S0101000_28(iIntValue, removeContactsUnit, 2));
        return Unit.LIZ;
    }
}

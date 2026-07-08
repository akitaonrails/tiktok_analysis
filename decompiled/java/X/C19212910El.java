package X;

import Y.ARunnableS39S0101000_28;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveFBFriendsUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10El, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C19212910El extends C2217421BqW implements Function1<Integer, Unit> {
    public C19212910El(RemoveFBFriendsUnit removeFBFriendsUnit) {
        super(1, removeFBFriendsUnit, RemoveFBFriendsUnit.class, "setRemoveIVState", "setRemoveIVState(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        RemoveFBFriendsUnit removeFBFriendsUnit = (RemoveFBFriendsUnit) this.receiver;
        removeFBFriendsUnit.getClass();
        C2487409ou.LIZJ(new ARunnableS39S0101000_28(iIntValue, removeFBFriendsUnit, 3));
        return Unit.LIZ;
    }
}

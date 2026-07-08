package X;

import Y.ARunnableS39S0101000_28;
import com.ss.android.ugc.aweme.setting.unit.privacy.RemoveMLBBFriendsUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10Em, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C19213010Em extends C2217421BqW implements Function1<Integer, Unit> {
    public C19213010Em(RemoveMLBBFriendsUnit removeMLBBFriendsUnit) {
        super(1, removeMLBBFriendsUnit, RemoveMLBBFriendsUnit.class, "setRemoveIVState", "setRemoveIVState(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        RemoveMLBBFriendsUnit removeMLBBFriendsUnit = (RemoveMLBBFriendsUnit) this.receiver;
        removeMLBBFriendsUnit.getClass();
        C2487409ou.LIZJ(new ARunnableS39S0101000_28(iIntValue, removeMLBBFriendsUnit, 4));
        return Unit.LIZ;
    }
}

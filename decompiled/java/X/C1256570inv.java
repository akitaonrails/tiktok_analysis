package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0inv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256570inv extends C09AY implements Function1<Integer, Integer> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Boolean LLILLJJLI;
    public final /* synthetic */ EnumC1256590inx LLILLL;
    public final /* synthetic */ User LLILZ;
    public final /* synthetic */ C118300cf LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1256570inv(boolean z, Boolean bool, EnumC1256590inx enumC1256590inx, User user, C118300cf c118300cf) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = bool;
        this.LLILLL = enumC1256590inx;
        this.LLILZ = user;
        this.LLILZIL = c118300cf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Integer num) {
        User user;
        User user2;
        int iIntValue = num.intValue();
        if (this.LL && Intrinsics.LJFF(this.LLILLJJLI, Boolean.TRUE) && this.LLILLL == EnumC1256590inx.PROFILE && (((user = this.LLILZ) != null && user.getStoryStatus() == 0) || ((user2 = this.LLILZ) != null && user2.getStoryStatus() == -1))) {
            iIntValue = 4;
        } else {
            this.LLILZIL.element = iIntValue;
        }
        return Integer.valueOf(iIntValue);
    }
}

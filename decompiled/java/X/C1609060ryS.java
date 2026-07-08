package X;

import android.os.Looper;
import com.ss.android.ugc.aweme.avatar.vm.AvatarControllerVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ryS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609060ryS extends C09AY implements Function2<C1608990ryL, Boolean, Unit> {
    public final /* synthetic */ AvatarControllerVM LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1609060ryS(AvatarControllerVM avatarControllerVM, String str, boolean z) {
        super(2);
        this.LL = avatarControllerVM;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(C1608990ryL c1608990ryL, Boolean bool) {
        String str;
        C1608990ryL c1608990ryL2 = c1608990ryL;
        boolean zBooleanValue = bool.booleanValue();
        AwS603S0100000_24 awS603S0100000_24 = this.LL.LLILZ;
        if (awS603S0100000_24 != null) {
            awS603S0100000_24.invoke(Boolean.FALSE);
        }
        if (Intrinsics.LJFF(this.LLILLJJLI, this.LL.LL) && zBooleanValue) {
            AvatarControllerVM avatarControllerVM = this.LL;
            if (avatarControllerVM.LLJILJIL) {
                str = avatarControllerVM.LL;
            } else {
                str = this.LLILLJJLI;
            }
            c1608990ryL2.LIZJ = str;
            if (this.LLILLL && Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
                this.LL.LLJI.setValue(c1608990ryL2);
            } else {
                this.LL.LLJI.postValue(c1608990ryL2);
            }
        }
        return Unit.LIZ;
    }
}

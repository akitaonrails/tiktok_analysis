package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.userservice.UserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TfE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752340TfE extends C750630TcT {
    public final C752350TfF LLILZIL;
    public final boolean LLILZLL;

    @Override // X.AbstractC752950TgD
    public final Function0<Unit> LJFF() {
        return new AwS556S0100000_12(this, 969);
    }

    public C752340TfE(C752350TfF c752350TfF) {
        Long lValueOf;
        Object objValueOf;
        super(c752350TfF);
        this.LLILZIL = c752350TfF;
        User user = c752350TfF.LIZ;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        if (interfaceC500940JkiUser != null) {
            objValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        } else {
            objValueOf = 0;
        }
        this.LLILZLL = Intrinsics.LJFF(lValueOf, objValueOf);
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJ(EnumC755280Tjy enumC755280Tjy) {
        return !this.LLILZLL;
    }
}

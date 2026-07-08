package X;

import com.bytedance.android.live.usermanage.IUserManageService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0Td0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750960Td0 extends C750630TcT {
    public final C750970Td1 LLILZIL;

    @Override // X.AbstractC752950TgD
    public final Function0<Unit> LJFF() {
        return new AwS556S0100000_12(this, 968);
    }

    public C750960Td0(C750970Td1 c750970Td1) {
        super(c750970Td1);
        this.LLILZIL = c750970Td1;
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJ(EnumC755280Tjy enumC755280Tjy) {
        if (!this.LLILZIL.LIZIZ && !((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).aQ0()) {
            return false;
        }
        return true;
    }
}

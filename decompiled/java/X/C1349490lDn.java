package X;

import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardIconGroupAssemAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349490lDn implements InterfaceC1348290lBr {
    public static final C1349490lDn LIZ = new C1349490lDn();
    public static final EnumC1347870lBB LIZIZ = EnumC1347870lBB.POLL;

    @Override // X.InterfaceC1348290lBr
    public final int LIZIZ() {
        return R.raw.icon_poll_fill_ltr;
    }

    @Override // X.InterfaceC1348290lBr
    public final int LIZLLL() {
        return 2131829053;
    }

    @Override // X.InterfaceC1348290lBr
    public final EnumC1347870lBB getId() {
        return LIZIZ;
    }

    @Override // X.InterfaceC1348290lBr
    public final boolean LIZ(C0T4M c0t4m) {
        IKeyboardIconGroupAssemAbility iKeyboardIconGroupAssemAbilityLIZ = C1349510lDp.LIZ(c0t4m);
        if (iKeyboardIconGroupAssemAbilityLIZ != null) {
            return iKeyboardIconGroupAssemAbilityLIZ.SE2(LIZIZ);
        }
        return false;
    }

    @Override // X.InterfaceC1348290lBr
    public final void LIZJ(C0T4M c0t4m) {
        IKeyboardIconGroupAssemAbility iKeyboardIconGroupAssemAbilityLIZ = C1349510lDp.LIZ(c0t4m);
        if (iKeyboardIconGroupAssemAbilityLIZ != null) {
            iKeyboardIconGroupAssemAbilityLIZ.ba2(LIZIZ);
        }
    }
}

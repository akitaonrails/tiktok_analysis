package X;

import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardIconGroupAssemAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lDo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349500lDo implements InterfaceC1348290lBr {
    public static final C1349500lDo LIZ = new C1349500lDo();
    public static final EnumC1347870lBB LIZIZ = EnumC1347870lBB.PRODUCT;

    @Override // X.InterfaceC1348290lBr
    public final int LIZIZ() {
        return R.raw.icon_link_fill;
    }

    @Override // X.InterfaceC1348290lBr
    public final int LIZLLL() {
        return 2131829054;
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

package X;

import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardIconGroupAssemAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349480lDm implements InterfaceC1348290lBr {
    public static final C1349480lDm LIZ = new C1349480lDm();
    public static final EnumC1347870lBB LIZIZ = EnumC1347870lBB.GROUP_CHAT;

    @Override // X.InterfaceC1348290lBr
    public final int LIZIZ() {
        return R.raw.icon_bubble_left_right_fill;
    }

    @Override // X.InterfaceC1348290lBr
    public final int LIZLLL() {
        return 2131829052;
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

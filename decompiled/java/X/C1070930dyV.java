package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.relation.fragment.ContactsInvitePanelFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0dyV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1070930dyV implements InterfaceC1234700iEe {
    public final Context LIZ;
    public final Bundle LIZIZ;
    public final String LIZJ;
    public final String LJ;
    public final Function0<Unit> LJFF;
    public final Function0<Unit> LJI;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public final ContactsInvitePanelFragment LJIILIIL;
    public final C01GW LJIILJJIL;
    public final String LIZLLL = "";
    public final C01GW LJII = C452501pT.LIZIZ(new AwS560S0100000_16(this, 635));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 637));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(340));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 633));

    public final void LIZ() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("Invite Panel", "popup");
        String str = (String) this.LJII.getValue();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        C20684815ws.LJIILLIIL("invite_friend_show", c2344009Gk.LIZ);
        FragmentManager fragmentManager = (FragmentManager) this.LJIIIIZZ.getValue();
        if (fragmentManager != null) {
            ((DialogFragment) this.LJIILJJIL.getValue()).show(fragmentManager, "Invite Panel");
        }
        ((C1074610e4R) ((AbstractC1071680dzi) this.LJIIJJI.getValue())).LJI();
    }

    @Override // X.InterfaceC1234700iEe
    public final void show() {
        LifecycleCoroutineScope lifecycleScope;
        if (C1072630e1F.LIZ.LIZJ()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("Invite Panel", "has permission");
            LIZ();
        } else {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
            if (c19egLIZIZ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) == null) {
                return;
            }
            C23250099c.LIZLLL(lifecycleScope, null, null, new C1070920dyU(this, null), 3);
        }
    }

    public C1070930dyV(Context context, Bundle bundle, String str, String str2, AwS422S0200000_21 awS422S0200000_21, AwS422S0200000_21 awS422S0200000_212) {
        this.LIZ = context;
        this.LIZIZ = bundle;
        this.LIZJ = str;
        this.LJ = str2;
        this.LJFF = awS422S0200000_21;
        this.LJI = awS422S0200000_212;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 634));
        this.LJIIJJI = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS560S0100000_16(this, 636));
        this.LJIIL = c01gwLIZIZ2;
        ContactsInvitePanelFragment contactsInvitePanelFragment = (ContactsInvitePanelFragment) Fragment.instantiate(context, ContactsInvitePanelFragment.class.getName(), (Bundle) c01gwLIZIZ2.getValue());
        contactsInvitePanelFragment.LLIZ = (AbstractC1071680dzi) c01gwLIZIZ.getValue();
        this.LJIILIIL = contactsInvitePanelFragment;
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 638));
    }
}

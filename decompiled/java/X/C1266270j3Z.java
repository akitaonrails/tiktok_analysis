package X;

import android.view.ViewGroup;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.account.org.permissions.ManageOrgPermissionsActivity;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0j3Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266270j3Z extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1266270j3Z(C19EG c19eg, AITheaterProfileService aITheaterProfileService, int i) {
        super(4);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = aITheaterProfileService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1266270j3Z(ManageOrgPermissionsActivity manageOrgPermissionsActivity, ManageOrgPermissionsActivity manageOrgPermissionsActivity2, C05P0<AbstractC1220800hsE> c05p0) {
        super(4);
        this.$t = c05p0;
        this.l0 = manageOrgPermissionsActivity;
        this.l1 = manageOrgPermissionsActivity2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(X.C1266270j3Z r9, java.lang.Object r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1266270j3Z.invoke$0(X.0j3Z, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(C1266270j3Z c1266270j3Z, Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC1257670iph interfaceC1257670iphT8;
        ViewGroup viewGroup = (ViewGroup) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Function0 function0 = (Function0) obj3;
        Function0 function02 = (Function0) obj4;
        C0TGX c0tgxLIZ = C0HZJ.LIZ((C19EG) c1266270j3Z.l0);
        if (c0tgxLIZ.Xu() && (interfaceC1257670iphT8 = ((AITheaterProfileService) c1266270j3Z.l1).T8()) != null) {
            PopupManager.LJIJI(interfaceC1257670iphT8.LIZLLL(c0tgxLIZ, viewGroup, zBooleanValue, function0, function02), true);
        }
        return Unit.LIZ;
    }
}

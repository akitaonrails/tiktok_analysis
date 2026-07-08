package X;

import com.ss.android.ugc.aweme.relation.auth.widget.cell.AuthMaFPowerCell;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchCell;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0j3c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266300j3c extends AbstractC2211791BhR {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC2211791BhR
    public final Function0<String> LIZLLL() {
        switch (this.$t) {
            case 0:
                return LIZLLL$0(this);
            case 1:
                return LIZLLL$1(this);
            case 2:
                return LIZLLL$2(this);
            default:
                return super.LIZLLL();
        }
    }

    @Override // X.AbstractC2211791BhR
    public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
        switch (this.$t) {
            case 0:
                return LJFF$0(this);
            case 1:
                return LJFF$1(this);
            case 2:
                return LJFF$2(this);
            default:
                return super.LJFF();
        }
    }

    @Override // X.AbstractC2211791BhR
    public final void LJIILL(Function0<String> function0) {
        switch (this.$t) {
            case 0:
                this.l0 = function0;
                break;
            case 1:
                this.l0 = function0;
                break;
            case 2:
                this.l0 = function0;
                break;
            default:
                super.LJIILL(function0);
                break;
        }
    }

    public static final Function0 LIZLLL$0(C1266300j3c c1266300j3c) {
        return (Function0) c1266300j3c.l0;
    }

    public static final Function0 LIZLLL$1(C1266300j3c c1266300j3c) {
        return (Function0) c1266300j3c.l0;
    }

    public static final Function0 LIZLLL$2(C1266300j3c c1266300j3c) {
        return (Function0) c1266300j3c.l0;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$0(C1266300j3c c1266300j3c) {
        return (C1266070j3F) c1266300j3c.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$1(C1266300j3c c1266300j3c) {
        return (C1266070j3F) c1266300j3c.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$2(C1266300j3c c1266300j3c) {
        return (C1266070j3F) c1266300j3c.l1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1266300j3c(AuthMaFPowerCell authMaFPowerCell, AuthMaFPowerCell<T> authMaFPowerCell2) {
        this.$t = authMaFPowerCell2;
        this.l0 = new AwS560S0100000_16(authMaFPowerCell, 479);
        this.l1 = new C1266070j3F(authMaFPowerCell, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1266300j3c(RelationSearchCell relationSearchCell, RelationSearchCell<ITEM> relationSearchCell2) {
        this.$t = relationSearchCell2;
        this.l0 = new AwS563S0100000_19(relationSearchCell, 2335);
        this.l1 = new C1266070j3F(relationSearchCell, 2);
    }

    public C1266300j3c(C1259680isw c1259680isw, int i) {
        this.$t = i;
        this.l0 = AFwS207S0000000_19.get$arr$(637);
        this.l1 = new C1266070j3F(c1259680isw, 3);
    }
}

package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.comment.likelist.adapter.LikeCell;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.cell.AbsSharePanelPowerCell;
import com.ss.android.ugc.aweme.share.improve.channel.RepostChannel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0mb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402380mb6 extends AbstractC2211791BhR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final int LIZJ$0(C1402380mb6 c1402380mb6) {
        return 0;
    }

    public static final int LIZJ$1(C1402380mb6 c1402380mb6) {
        return 0;
    }

    public static final int LIZJ$2(C1402380mb6 c1402380mb6) {
        return 0;
    }

    public static final int LIZJ$3(C1402380mb6 c1402380mb6) {
        return 0;
    }

    public static final boolean LJIIIIZZ$0(C1402380mb6 c1402380mb6) {
        return false;
    }

    @Override // X.AbstractC2211791BhR
    public final int LIZJ() {
        switch (this.$t) {
            case 1:
                return LIZJ$0(this);
            case 2:
                return LIZJ$1(this);
            case 3:
            default:
                return super.LIZJ();
            case 4:
                return LIZJ$2(this);
            case 5:
                return LIZJ$3(this);
        }
    }

    @Override // X.AbstractC2211791BhR
    public final Function0<String> LIZLLL() {
        switch (this.$t) {
            case 0:
                return LIZLLL$0(this);
            case 1:
                return LIZLLL$1(this);
            case 2:
                return LIZLLL$2(this);
            case 3:
                return LIZLLL$3(this);
            case 4:
                return LIZLLL$4(this);
            case 5:
                return LIZLLL$5(this);
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
            case 3:
                return LJFF$3(this);
            case 4:
                return LJFF$4(this);
            case 5:
                return LJFF$5(this);
            default:
                return super.LJFF();
        }
    }

    @Override // X.AbstractC2211791BhR
    public final boolean LJIIIIZZ() {
        return 1 - this.$t != 0 ? super.LJIIIIZZ() : LJIIIIZZ$0(this);
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
            case 3:
                this.l0 = function0;
                break;
            case 4:
                this.l0 = function0;
                break;
            case 5:
                this.l0 = function0;
                break;
            default:
                super.LJIILL(function0);
                break;
        }
    }

    public static final Function0 LIZLLL$0(C1402380mb6 c1402380mb6) {
        return (Function0) c1402380mb6.l0;
    }

    public static final Function0 LIZLLL$1(C1402380mb6 c1402380mb6) {
        return (Function0) c1402380mb6.l0;
    }

    public static final Function0 LIZLLL$2(C1402380mb6 c1402380mb6) {
        return (Function0) c1402380mb6.l0;
    }

    public static final Function0 LIZLLL$3(C1402380mb6 c1402380mb6) {
        return (Function0) c1402380mb6.l0;
    }

    public static final Function0 LIZLLL$4(C1402380mb6 c1402380mb6) {
        return (Function0) c1402380mb6.l0;
    }

    public static final Function0 LIZLLL$5(C1402380mb6 c1402380mb6) {
        return (Function0) c1402380mb6.l0;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$0(C1402380mb6 c1402380mb6) {
        return (C1402200mao) c1402380mb6.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$1(C1402380mb6 c1402380mb6) {
        return (C1402200mao) c1402380mb6.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$2(C1402380mb6 c1402380mb6) {
        return (C1402200mao) c1402380mb6.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$3(C1402380mb6 c1402380mb6) {
        return (C1402200mao) c1402380mb6.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$4(C1402380mb6 c1402380mb6) {
        return (C1402200mao) c1402380mb6.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$5(C1402380mb6 c1402380mb6) {
        return (C1402200mao) c1402380mb6.l1;
    }

    public C1402380mb6(C1369820lka c1369820lka, int i) {
        this.$t = i;
        this.l0 = new AwS565S0100000_21(c1369820lka, 1449);
        this.l1 = new C1402200mao(c1369820lka, 15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1402380mb6(AbsSharePanelPowerCell absSharePanelPowerCell, AbsSharePanelPowerCell<InterfaceC1361730lXX> absSharePanelPowerCell2) {
        this.$t = absSharePanelPowerCell2;
        this.l0 = new AwS565S0100000_21(absSharePanelPowerCell, (AbsSharePanelPowerCell<InterfaceC1361730lXX>) 1252);
        this.l1 = new C1402200mao(absSharePanelPowerCell, 10);
    }

    public C1402380mb6(LikeCell likeCell, int i) {
        this.$t = i;
        this.l0 = new AwS565S0100000_21(likeCell, 167);
        this.l1 = new C1402200mao(likeCell, 0);
    }

    public C1402380mb6(RepostChannel repostChannel, int i) {
        this.$t = i;
        this.l0 = new AwS565S0100000_21(repostChannel, 810);
        this.l1 = new C1402200mao(repostChannel, 3);
    }

    public C1402380mb6(RecyclerView.ViewHolder viewHolder, C1363390laD c1363390laD, int i) {
        this.$t = i;
        this.l0 = new AwS565S0100000_21(viewHolder, 1453);
        this.l1 = new C1402200mao(c1363390laD, 18);
    }

    public C1402380mb6(RecyclerView.ViewHolder viewHolder, C1363410laF c1363410laF, int i) {
        this.$t = i;
        this.l0 = new AwS565S0100000_21(viewHolder, 1454);
        this.l1 = new C1402200mao(c1363410laF, 19);
    }
}

package X;

import com.ss.android.ugc.aweme.tako.botpage.components.botcenter.BotCenterCell;
import com.ss.android.ugc.aweme.tako.botpage.components.botcenter.RecentlyAddCell;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.14dP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20309314dP extends AbstractC2211791BhR {
    public final int $t;
    public Object l0 = AFwS219S0000000_30.get$arr$(114);
    public Object l1;
    public Object l2;

    @Override // X.AbstractC2211791BhR
    public final Function0<String> LIZIZ() {
        switch (this.$t) {
            case 0:
                return LIZIZ$0(this);
            case 1:
                return LIZIZ$1(this);
            default:
                return super.LIZIZ();
        }
    }

    @Override // X.AbstractC2211791BhR
    public final Function0<String> LIZLLL() {
        switch (this.$t) {
            case 0:
                return LIZLLL$0(this);
            case 1:
                return LIZLLL$1(this);
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
            default:
                return super.LJFF();
        }
    }

    @Override // X.AbstractC2211791BhR
    public final void LJIILL(Function0<String> function0) {
        switch (this.$t) {
            case 0:
                this.l1 = function0;
                break;
            case 1:
                this.l1 = function0;
                break;
            default:
                super.LJIILL(function0);
                break;
        }
    }

    public static final Function0 LIZIZ$0(C20309314dP c20309314dP) {
        return (AFwS219S0000000_30) c20309314dP.l0;
    }

    public static final Function0 LIZIZ$1(C20309314dP c20309314dP) {
        return (AFwS219S0000000_30) c20309314dP.l0;
    }

    public static final Function0 LIZLLL$0(C20309314dP c20309314dP) {
        return (Function0) c20309314dP.l1;
    }

    public static final Function0 LIZLLL$1(C20309314dP c20309314dP) {
        return (Function0) c20309314dP.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$0(C20309314dP c20309314dP) {
        return (C20308214dE) c20309314dP.l2;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$1(C20309314dP c20309314dP) {
        return (C20308214dE) c20309314dP.l2;
    }

    public C20309314dP(BotCenterCell botCenterCell, int i) {
        this.$t = i;
        this.l1 = new AwS574S0100000_30(botCenterCell, 236);
        this.l2 = new C20308214dE(botCenterCell, 0);
    }

    public C20309314dP(RecentlyAddCell recentlyAddCell, int i) {
        this.$t = i;
        this.l1 = new AwS574S0100000_30(recentlyAddCell, 238);
        this.l2 = new C20308214dE(recentlyAddCell, 1);
    }
}

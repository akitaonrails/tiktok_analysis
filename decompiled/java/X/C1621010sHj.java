package X;

import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendCell;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS173S1100000_24;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS638S0100000_24;

/* JADX INFO: renamed from: X.0sHj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1621010sHj extends AbstractC2211791BhR {
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
            case 3:
                return LIZLLL$3(this);
            case 4:
                return LIZLLL$4(this);
            default:
                return super.LIZLLL();
        }
    }

    @Override // X.AbstractC2211791BhR
    public final InterfaceC2211931Bhf LJFF() {
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
            case 3:
                this.l0 = function0;
                break;
            case 4:
                this.l0 = function0;
                break;
            default:
                super.LJIILL(function0);
                break;
        }
    }

    public static final Function0 LIZLLL$0(C1621010sHj c1621010sHj) {
        return (Function0) c1621010sHj.l0;
    }

    public static final Function0 LIZLLL$1(C1621010sHj c1621010sHj) {
        return (Function0) c1621010sHj.l0;
    }

    public static final Function0 LIZLLL$2(C1621010sHj c1621010sHj) {
        return (Function0) c1621010sHj.l0;
    }

    public static final Function0 LIZLLL$3(C1621010sHj c1621010sHj) {
        return (Function0) c1621010sHj.l0;
    }

    public static final Function0 LIZLLL$4(C1621010sHj c1621010sHj) {
        return (Function0) c1621010sHj.l0;
    }

    public static final InterfaceC2211931Bhf LJFF$0(C1621010sHj c1621010sHj) {
        return (C1620890sHX) c1621010sHj.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$1(C1621010sHj c1621010sHj) {
        return (C1620890sHX) c1621010sHj.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$2(C1621010sHj c1621010sHj) {
        return (C1595150rc1) c1621010sHj.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$3(C1621010sHj c1621010sHj) {
        return (C1595160rc2) c1621010sHj.l1;
    }

    public static final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF$4(C1621010sHj c1621010sHj) {
        return (C1620890sHX) c1621010sHj.l1;
    }

    public C1621010sHj(SearchFriendCell searchFriendCell, int i) {
        this.$t = i;
        this.l0 = new AwS568S0100000_24(searchFriendCell, 859);
        this.l1 = new C1620890sHX(searchFriendCell, 1);
    }

    public C1621010sHj(ViewOnClickListenerC1605710rt3 viewOnClickListenerC1605710rt3, InterfaceC1605750rt7 interfaceC1605750rt7, int i) {
        this.$t = i;
        this.l0 = new AwS425S0200000_24(viewOnClickListenerC1605710rt3, interfaceC1605750rt7, 58);
        this.l1 = new C1620890sHX(viewOnClickListenerC1605710rt3, 5);
    }

    public C1621010sHj(AvatarComponentView avatarComponentView, AwS638S0100000_24 awS638S0100000_24, int i) {
        this.$t = i;
        this.l0 = new AwS425S0200000_24(avatarComponentView, 93);
        this.l1 = new C1620890sHX(awS638S0100000_24, 6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1621010sHj(final PowerCell powerCell, final PowerCell<?> powerCell2, String str) {
        this.$t = str;
        this.l0 = new AwS173S1100000_24(powerCell, powerCell2, (String) 15);
        this.l1 = new InterfaceC2211931Bhf() { // from class: X.0rc1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0051 A[PHI: r9
              0x0051: PHI (r9v3 java.lang.String) = (r9v0 java.lang.String), (r9v4 java.lang.String) binds: [B:29:0x004f, B:27:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0055 A[PHI: r9
              0x0055: PHI (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:29:0x004f, B:31:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:37:0x007a A[ORIG_RETURN, RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:65:0x00f4  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
            @Override // X.InterfaceC2211931Bhf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(android.view.View r15, java.lang.String r16) {
                /*
                    Method dump skipped, instruction units count: 267
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1595150rc1.LIZ(android.view.View, java.lang.String):void");
            }
        };
    }

    public C1621010sHj(final int i, final PowerCell powerCell, final String str, final Function1 function1, int i2) {
        this.$t = i2;
        this.l0 = new AwS173S1100000_24(powerCell, (PowerCell<?>) str, (String) 16);
        this.l1 = new InterfaceC2211931Bhf() { // from class: X.0rc2
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
            @Override // X.InterfaceC2211931Bhf
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(android.view.View r19, java.lang.String r20) {
                /*
                    Method dump skipped, instruction units count: 356
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1595160rc2.LIZ(android.view.View, java.lang.String):void");
            }
        };
    }
}

package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.feed.TTRecUserBigCardViewHolder;
import com.ss.android.ugc.aweme.relation.feed.performanceui.PerformanceUserCardViewModel;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2174581A8q implements InterfaceC1589370rSh {
    public static final C2174581A8q LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final C01GW LIZJ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C2174581A8q.class, "swipeVM", "<v#0>", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217401BqU c2217401BqU2 = new C2217401BqU(C2174581A8q.class, "performanceVM", "<v#1>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU3 = new C2217401BqU(C2174581A8q.class, "swipeVM", "<v#2>", 0);
        c09r3.getClass();
        C2217401BqU c2217401BqU4 = new C2217401BqU(C2174581A8q.class, "performanceVM", "<v#3>", 0);
        c09r3.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217401BqU, c2217401BqU2, c2217401BqU3, c2217401BqU4};
        LIZ = new C2174581A8q();
        LIZJ = C452501pT.LIZIZ(new C19232110Lv());
    }

    @Override // X.InterfaceC1589370rSh
    public final void LJIIIIZZ() {
    }

    public static C1910890zpH LJIIJ() {
        return (C1910890zpH) LIZJ.getValue();
    }

    @Override // X.InterfaceC1589370rSh
    public final boolean LIZIZ() {
        return C1A9E.LIZ().shouldDelayFetch;
    }

    @Override // X.InterfaceC1589370rSh
    public final boolean LJI() {
        return C1A9E.LIZJ();
    }

    @Override // X.InterfaceC1589370rSh
    public final boolean LIZJ(Aweme aweme) {
        User author;
        if (aweme == null || !C727520SgI.LJ(aweme) || (author = aweme.getAuthor()) == null || author.getFollowStatus() != 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0RAr] */
    @Override // X.InterfaceC1589370rSh
    public final TTRecUserBigCardViewHolder LJ(InterfaceC691450RAh interfaceC691450RAh) {
        if (interfaceC691450RAh instanceof C0RF0) {
            C0RF0 c0rf0 = (C0RF0) interfaceC691450RAh;
            return new TTRecUserBigCardViewHolder(c0rf0, new C0SZR<TTRecUserBigCardViewHolder, C691560RAs>(c0rf0) { // from class: X.0RAr
                {
                    super(((C0SZR) c0rf0.LJIILL).LIZ);
                }

                @Override // X.C0SZR
                public final String LIZLLL(C0OB8 c0ob8, C0RGF c0rgf, int i) {
                    C691560RAs c691560RAs = (C691560RAs) c0ob8;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c691560RAs);
                    sbLIZ.append(", position: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", aweme: ");
                    sbLIZ.append(c691560RAs.LL);
                    sbLIZ.append('.');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
            });
        }
        return null;
    }

    @Override // X.InterfaceC1589370rSh
    public final View LJIIIZ(final Context context) {
        if (C1A9E.LIZJ()) {
            return new FrameLayout(context) { // from class: X.038W
                {
                    super(context, null, 0);
                    C786410Ut5.Sd(R.layout.duc, C786410Ut5.ne(context), this);
                }
            };
        }
        return new FrameLayout(context) { // from class: X.038X
            {
                super(context, null, 0);
                C786410Ut5.Sd(R.layout.fiu, C786410Ut5.ne(context), this);
            }
        };
    }

    @Override // X.InterfaceC1589370rSh
    public final void LIZ(Aweme aweme, String str) {
        if (!LIZJ(aweme)) {
            return;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[RecUserServiceImpl] updateNextInsertTimeAfterMafFeedImpression eventType = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            C1952707kr.LIZ.getClass();
            C1952707kr.LIZ().storeLong("timestamp_of_maf_video_impression", System.currentTimeMillis());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    @Override // X.InterfaceC1589370rSh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LIZLLL(java.util.List r16, X.InterfaceC20550615bE r17) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2174581A8q.LIZLLL(java.util.List, X.15bE):java.util.List");
    }

    @Override // X.InterfaceC1589370rSh
    public final C2174611A8t LJFF(C19EG c19eg, String str) {
        InterfaceC19229810Ky interfaceC19229810Ky;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RecSwipeViewModel.class);
        C019S c019s = new C019S(c19719912DlLIZ);
        C2174591A8r c2174591A8r = new C2174591A8r();
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(c19eg, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, c019s, c452070Ho5, C724750Sbp.LJII(c19eg), C724750Sbp.LJIIIZ(c19eg), new C1A8Y(c19eg), c2174591A8r);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PerformanceUserCardViewModel.class);
        AssemVMLazy assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(c19eg, c19719912DlLIZ2), new C019T(c19719912DlLIZ2), c452070Ho5, C724750Sbp.LJII(c19eg), C724750Sbp.LJIIIZ(c19eg), new C1A8Z(c19eg), new C2174601A8s());
        if (C1A9E.LIZJ()) {
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZIZ;
            interfaceC19229810Ky = (PerformanceUserCardViewModel) assemVMLazy2.getValue();
        } else {
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LIZIZ;
            interfaceC19229810Ky = (RecSwipeViewModel) assemVMLazy.getValue();
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("RecSwipeViewModel", "[newInstance]");
        return new C2174611A8t(interfaceC19229810Ky);
    }

    @Override // X.InterfaceC1589370rSh
    public final C2174641A8w LJII(C19EG c19eg, String str) {
        InterfaceC19229810Ky interfaceC19229810Ky;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RecSwipeViewModel.class);
        C5182020e c5182020e = new C5182020e((C13IQ) c19719912DlLIZ, 438);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(384);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(c19eg, c19719912DlLIZ);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, c5182020e, c452070Ho5, C724750Sbp.LJII(c19eg), C724750Sbp.LJIIIZ(c19eg), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) c19eg, 4055), aFwS279S0000000_33);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PerformanceUserCardViewModel.class);
        AssemVMLazy assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(c19eg, c19719912DlLIZ2), new C5182020e((C13IQ) c19719912DlLIZ2, 439), c452070Ho5, C724750Sbp.LJII(c19eg), C724750Sbp.LJIIIZ(c19eg), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) c19eg, 4056), AFwS279S0000000_33.get$arr$(385));
        if (C1A9E.LIZJ()) {
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LIZIZ;
            interfaceC19229810Ky = (PerformanceUserCardViewModel) assemVMLazy2.getValue();
        } else {
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LIZIZ;
            interfaceC19229810Ky = (RecSwipeViewModel) assemVMLazy.getValue();
        }
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("TTRecUserFriendsTabController", "[newInstance]");
        return new C2174641A8w(interfaceC19229810Ky);
    }
}

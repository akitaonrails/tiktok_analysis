package Y;

import X.C1192870h9B;
import X.C1193630hAP;
import X.InterfaceC1054930dYh;
import android.util.Pair;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.common.ProfilePageFragment;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AObjectS391S0100000_16 implements Function0 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS391S0100000_16 aObjectS391S0100000_16) {
        C1193630hAP c1193630hAP = (C1193630hAP) aObjectS391S0100000_16.l0;
        String str = CrossPlatformActivity._pnsPageId;
        c1193630hAP.getClass();
        return C1192870h9B.LIZIZ;
    }

    public static final Object invoke$1(AObjectS391S0100000_16 aObjectS391S0100000_16) {
        ((ProfilePageFragment) aObjectS391S0100000_16.l0).rT();
        return null;
    }

    public static final Object invoke$2(AObjectS391S0100000_16 aObjectS391S0100000_16) {
        ProfilePageFragment profilePageFragment = (ProfilePageFragment) aObjectS391S0100000_16.l0;
        profilePageFragment.getClass();
        Object objCS = profilePageFragment.cS(InterfaceC1054930dYh.class, "page_fake_user_fragment");
        if (objCS != null) {
            InterfaceC1054930dYh interfaceC1054930dYh = (InterfaceC1054930dYh) objCS;
            interfaceC1054930dYh.setVisible(true);
            interfaceC1054930dYh.wC(new AObjectS391S0100000_16(profilePageFragment, 1));
            return null;
        }
        return null;
    }

    public static final Object invoke$3(AObjectS391S0100000_16 aObjectS391S0100000_16) {
        ProfilePageFragment profilePageFragment = (ProfilePageFragment) aObjectS391S0100000_16.l0;
        if (profilePageFragment.LLLIZZ) {
            profilePageFragment.LLJZIJLIL = profilePageFragment.xT(profilePageFragment.LLJZIJLIL, 0, true);
            return null;
        }
        List<Pair<Aweme, Integer>> list = profilePageFragment.LLJJJIL;
        profilePageFragment.zT(0, true, list);
        profilePageFragment.LLJJJIL = list;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(Y.AObjectS391S0100000_16 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.newselector.protocol.custom.cell.guidesearch.GuideToSearchAssem r4 = (com.ss.android.ugc.aweme.newselector.protocol.custom.cell.guidesearch.GuideToSearchAssem) r4
            X.0QSJ r1 = r4.LLJLILLLLZIIL
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJLIL
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJLIL = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope> r0 = com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJLILLLLZIIL = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.tiktok.im.contact.selector.api.protocol.custom.ContactSelectorCustomVM r0 = new com.ss.android.ugc.tiktok.im.contact.selector.api.protocol.custom.ContactSelectorCustomVM
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.0e7K> r0 = X.InterfaceC1076400e7K.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.0e7K r1 = (X.InterfaceC1076400e7K) r1
            java.lang.Class<X.0e7K> r0 = X.InterfaceC1076400e7K.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS391S0100000_16.invoke$4(Y.AObjectS391S0100000_16):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v6 X.0QSJ) binds: [B:3:0x0006, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(Y.AObjectS391S0100000_16 r4) throws java.lang.IllegalAccessException {
        /*
            java.lang.Object r4 = r4.l0
            com.ss.android.ugc.aweme.newselector.protocol.custom.cell.recomreason.RecomReasonAssem r4 = (com.ss.android.ugc.aweme.newselector.protocol.custom.cell.recomreason.RecomReasonAssem) r4
            X.0QSJ r1 = r4.LLJZIJLIL
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLJZ
            if (r3 != 0) goto L12
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)
            r4.LLJZ = r3
        L12:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope> r0 = com.ss.android.ugc.tiktok.im.contact.selector.api.scope.ContactSelectorFragmentScope.class
            r2[r1] = r0
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)
            r4.LLJZIJLIL = r1
            if (r1 != 0) goto L29
            r1 = 0
        L23:
            com.ss.android.ugc.tiktok.im.contact.selector.api.protocol.custom.ContactSelectorCustomVM r0 = new com.ss.android.ugc.tiktok.im.contact.selector.api.protocol.custom.ContactSelectorCustomVM
            r0.<init>(r1)
            return r0
        L29:
            java.lang.Class<X.0e7K> r0 = X.InterfaceC1076400e7K.class
            java.lang.Object r1 = r1.getAbility(r0)
            X.0e7K r1 = (X.InterfaceC1076400e7K) r1
            java.lang.Class<X.0e7K> r0 = X.InterfaceC1076400e7K.class
            X.C687700QyG.LJ(r1, r0)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObjectS391S0100000_16.invoke$5(Y.AObjectS391S0100000_16):java.lang.Object");
    }

    public AObjectS391S0100000_16(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}

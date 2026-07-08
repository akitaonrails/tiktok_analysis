package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0i2F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227010i2F extends AbstractC1225770i0F {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public final C1226950i29 LLJIJIL;
    public final C1227050i2J LLJILJIL;

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224490hyB LJJJJIZL() {
        return new C1227460i2y(this.LLJIJIL.LLJJIJI, this);
    }

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224480hyA LJJJJJ() {
        C913630Zsn.LJIIJJI.getClass();
        return C1227540i36.LIZIZ;
    }

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224330hxv LJJJJJL() {
        return new C1226120i0o(this, this.LLJIJIL.LLJJ);
    }

    @Override // X.AbstractC1225770i0F
    public final InterfaceC1224410hy3 LJJJJL() {
        return new C1225720i0A(this, this.LLJIJIL.LLJJIJIIJIL);
    }

    @Override // X.AbstractC1225770i0F
    public final C1224950hyv LJJJJLI() {
        return new C1227330i2l(this, (C1227080i2M) this.LLJIJIL.LLJJIII.LIZIZ);
    }

    @Override // X.AbstractC1225770i0F
    public final /* bridge */ /* synthetic */ AbstractC1225780i0G LJJJJLL() {
        return this.LLJIJIL;
    }

    public C1227010i2F(C1226950i29 c1226950i29) {
        super(c1226950i29);
        this.LLJIJIL = c1226950i29;
        this.LLJILJIL = new C1227050i2J(this);
    }

    @Override // X.AbstractC1225770i0F, X.InterfaceC1224300hxs
    public final void LJIJI(String str) {
        C1227050i2J c1227050i2J = this.LLJILJIL;
        c1227050i2J.getClass();
        IIMChatDetailAnalytics iIMChatDetailAnalytics = (IIMChatDetailAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatDetailAnalytics.class);
        if (iIMChatDetailAnalytics == null) {
            return;
        }
        iIMChatDetailAnalytics.LJFF("enter_add_member_tab", new Pair[]{new Pair("enter_from", c1227050i2J.LIZIZ.LJIIIZ().LIZJ()), new Pair("enter_method", c1227050i2J.LIZIZ.LJIIIZ().LIZLLL()), new Pair("tab_key", str)}, C0I0B.LJFF.LIZIZ());
    }

    @Override // X.AbstractC1225770i0F
    public final void LJJJJZ(AbstractC1225650i03 abstractC1225650i03) {
        Integer num;
        String str;
        super.LJJJJZ(abstractC1225650i03);
        if (abstractC1225650i03 instanceof C1225680i06) {
            C1224840hyk c1224840hyk = ((C1225680i06) abstractC1225650i03).LIZ;
            if (!c1224840hyk.LLJILJIL) {
                Object obj = c1224840hyk.LLJI.get("rank_num");
                String str2 = null;
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                Object obj2 = c1224840hyk.LLJI.get("member_label");
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                Object obj3 = c1224840hyk.LLJI.get("member_type");
                if (obj3 instanceof String) {
                    str2 = (String) obj3;
                }
                this.LLJILJIL.LIZ(num, c1224840hyk.LLILZ, str, str2);
            }
        }
    }

    @Override // X.AbstractC1225770i0F
    public final void LJJJJZI(C1224840hyk c1224840hyk) {
        Integer num;
        String str;
        Object obj = c1224840hyk.LLJI.get("rank_num");
        String str2 = null;
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        Object obj2 = c1224840hyk.LLJI.get("member_label");
        if (obj2 instanceof String) {
            str = (String) obj2;
        } else {
            str = null;
        }
        Object obj3 = c1224840hyk.LLJI.get("member_type");
        if (obj3 instanceof String) {
            str2 = (String) obj3;
        }
        this.LLJILJIL.LIZIZ(num, c1224840hyk.LLILZ, str, str2);
    }
}

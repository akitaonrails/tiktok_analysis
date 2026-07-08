package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.SeaHeadViewHolderScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track.ISeaTrackHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.goda.SeaGodaManagerV2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0w0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1764160w0c<VO> extends AbstractC1764630w1N<C04G1> implements InterfaceC1146704e9 {
    public final AbstractC1764180w0e LL;
    public final InterfaceC665370Q7z LLILLJJLI;
    public C04G1 LLILLL;
    public VO LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public String LLJILLL;
    public C1764600w1K LLJJ;
    public InterfaceC1066204Ey LLJJI;
    public boolean LLJJIII;

    public boolean I5() {
        return !(this instanceof C1764210w0h);
    }

    public InterfaceC1066204Ey L5() {
        return null;
    }

    public String N5() {
        return null;
    }

    public abstract void T5(VO vo);

    public void U5() {
    }

    public void V5() {
    }

    public void W5(EnumC1764120w0Y enumC1764120w0Y) {
    }

    public void X5(int i, EnumC1764120w0Y enumC1764120w0Y) {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SeaPdpFragmentScope.class, SeaHeadViewHolderScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SeaPdpFragmentScope.class);
        arrayList.add(SeaHeadViewHolderScope.class);
        return arrayList;
    }

    public void onCreate() {
    }

    public final ISeaHeadContainerHelper P5() {
        return (ISeaHeadContainerHelper) this.LLJILJILJ.getValue();
    }

    public final ISeaListHelper R5() {
        return (ISeaListHelper) this.LLJIJIL.getValue();
    }

    public final ISeaTrackHelper S5() {
        return (ISeaTrackHelper) this.LLJ.getValue();
    }

    public AbstractC1764160w0c(AbstractC1764180w0e abstractC1764180w0e, InterfaceC665370Q7z interfaceC665370Q7z) {
        super(abstractC1764180w0e);
        this.LL = abstractC1764180w0e;
        this.LLILLJJLI = interfaceC665370Q7z;
        this.LLILZIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1186));
        this.LLILZLL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1190));
        this.LLIZ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1182));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1187));
        this.LLJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1189));
        this.LLJI = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1183));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1185));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1188));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS570S0100000_26(this, 1184));
    }

    public final void LLJLL(int i, EnumC1764120w0Y enumC1764120w0Y) {
        SeaGodaManagerV2 seaGodaManagerV2;
        C04FH c04fh;
        InterfaceC1067904Fp interfaceC1067904Fp;
        if (!this.LLJJIII) {
            this.LLJJIII = true;
            if (getBindingAdapterPosition() == i) {
                if (this instanceof C1764210w0h) {
                    Boolean bool = Boolean.FALSE;
                    C04G1 c04g1 = this.LLILLL;
                    if (c04g1 != null && (seaGodaManagerV2 = (SeaGodaManagerV2) this.LLJI.getValue()) != null && (c04fh = seaGodaManagerV2.LLILLJJLI) != null && (interfaceC1067904Fp = c04fh.LJ) != null) {
                        interfaceC1067904Fp.LIZLLL("show", c04g1, null, null, bool);
                    }
                }
                X5(i, enumC1764120w0Y);
            }
        }
    }
}

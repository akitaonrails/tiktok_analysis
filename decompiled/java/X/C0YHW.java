package X;

import com.bytedance.im.core.client.configs.ConvKvCacheConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YHW, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YHW implements C0YHX {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIIIZZ;
    public final C0YM2 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C0YHY(this));
    public final C01GW LIZJ = C452501pT.LIZIZ(new C0YHZ(this));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C871570YHb(this));
    public final C01GW LJ = C452501pT.LIZIZ(new C871560YHa(this));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1623));
    public volatile C0YHV LJI;
    public volatile C0YM9 LJII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0YHW.class, "imClientProcessor", "getImClientProcessor()Lcom/bytedance/ies/im/core/api/client/IMClientProcessor;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0YHW.class, "sdkMessagePuller", "getSdkMessagePuller()Lcom/bytedance/ies/im/core/opt/SDKMessagePuller;", 0);
        c09r3.getClass();
        LJIIIIZZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.C0YHX
    public final InterfaceC881630YiH LJIIIIZZ() {
        return (InterfaceC881630YiH) this.LJ.getValue();
    }

    @Override // X.C0YHX
    public final C0YDW LJIILJJIL() {
        return (C0YDW) this.LJFF.getValue();
    }

    @Override // X.C0YHX
    public final C0YOJ LJIILLIIL() {
        return (C0YOJ) this.LIZLLL.getValue();
    }

    @Override // X.C0YHX
    public final C0YHS LJIJJ() {
        return (C0YHS) this.LIZJ.getValue();
    }

    @Override // X.C0YHX
    /* JADX INFO: renamed from: LJJIFFI, reason: merged with bridge method [inline-methods] */
    public final C0YH4 LJIIL() {
        return (C0YH4) this.LIZIZ.getValue();
    }

    @Override // X.C0YHX
    public final InterfaceC866720XzK LIZ() {
        return LJIIL().LIZIZ.LJ();
    }

    @Override // X.C0YHX
    public final InterfaceC866310Xyf LIZIZ() {
        return LJIIL().LIZIZ();
    }

    @Override // X.C0YHX
    public final C0YOZ LJFF() {
        return LJIIL().LJFF();
    }

    @Override // X.C0YHX
    public final InterfaceC868710Y6b LJI() {
        return LJIIL().LIZIZ.LJIILIIL();
    }

    @Override // X.C0YHX
    public final C0YDY LJII() {
        return LJIIL().LIZIZ.LJIIL();
    }

    @Override // X.C0YHX
    public final InterfaceC870590YDh LJIIJ() {
        return LJIIL().LIZIZ.LJIILJJIL();
    }

    @Override // X.C0YHX
    public final C0YE6 LJIILIIL() {
        return LJIIL().LIZIZ.LJIIJJI();
    }

    @Override // X.C0YHX
    public final InterfaceC871620YHg LJIILL() {
        return LJIIL().LIZIZ.LJIJ();
    }

    @Override // X.C0YHX
    public final InterfaceC865750Xxl LJIIZILJ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        ConvKvCacheConfig convKvCacheConfig = C871130YFj.LIZ;
        ConvKvCacheConfig convKvCacheConfig2 = (ConvKvCacheConfig) c0c64LJIILLIIL.LJJII(ConvKvCacheConfig.class, convKvCacheConfig, "tt_im_conv_kv_cache_config", true);
        if (convKvCacheConfig2 != null) {
            convKvCacheConfig = convKvCacheConfig2;
        }
        return convKvCacheConfig.enableConvKvCache ? LJIIL().LIZIZ.LIZLLL() : LJIIL().LIZIZ.LIZJ();
    }

    @Override // X.C0YHX
    public final C0YE8 LJIJ() {
        return LJIIL().LIZIZ.LJIIIIZZ();
    }

    @Override // X.C0YHX
    public final C0YJ5 LJIJI() {
        return LJIIL().LIZIZ.LJIILL();
    }

    @Override // X.C0YHX
    public final C0YDH LJIL() {
        return LJIIL().LIZIZ.LJII();
    }

    @Override // X.C0YHX
    public final InterfaceC866880Xza LJJ() {
        return LJIIL().LIZIZ.LJIJJ();
    }

    public C0YHW(C0YM2 c0ym2) {
        this.LIZ = c0ym2;
    }

    @Override // X.C0YDE
    public final InterfaceC870630YDl LIZLLL(EnumC871430YGn enumC871430YGn) {
        return LJIIL().LIZIZ.LJIIZILJ(enumC871430YGn);
    }

    @Override // X.C0YHX
    public final void LJIJJLI(C0YMO c0ymo) {
        if (!(c0ymo instanceof C0YMO)) {
            return;
        }
        C0YM9 c0ym9 = this.LJII;
        if (c0ym9 == null) {
            synchronized (this) {
                c0ym9 = this.LJII;
                if (c0ym9 == null) {
                    c0ym9 = (C0YM9) C1807670x8n.LJJIIZ(this.LIZ);
                    this.LJII = c0ym9;
                }
            }
        }
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pullMessage: ");
        sbLIZ.append(c0ymo);
        C882690Yjz.LJIIIZ("SDKMessagePuller", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(c0ym9.LIZIZ, null, null, new C0YMB(c0ym9, null), 3);
    }

    @Override // X.C0YDE
    public final InterfaceC866540Xz2 LJJI(String str) {
        return LJIIL().LIZIZ.LJFF(str);
    }

    @Override // X.C0YDE
    public final InterfaceC871600YHe LIZJ(String str, boolean z, boolean z2) {
        return LJIIL().LIZIZ.LJIIJ(str, true, z, z2);
    }

    @Override // X.C0YHX
    public final void LJIIJJI(int i, boolean z, Map map) {
        C0YM9 c0ym9 = this.LJII;
        if (c0ym9 == null) {
            synchronized (this) {
                c0ym9 = this.LJII;
                if (c0ym9 == null) {
                    c0ym9 = (C0YM9) C1807670x8n.LJJIIZ(this.LIZ);
                    this.LJII = c0ym9;
                }
            }
        }
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("manualPullMsg: ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(map);
        C882690Yjz.LJIIIZ("SDKMessagePuller", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(c0ym9.LIZIZ, null, null, new C0YMA(c0ym9, i, map, z, null), 3);
    }

    @Override // X.C0YHX
    public final Object LJIIIZ(List list, boolean z, Map map, C0YMP c0ymp) {
        return LJIIL().LIZIZ.LJIJI().LLFF(list, z, map, c0ymp);
    }

    @Override // X.C0YDE
    public final InterfaceC870610YDj LJ(String str, int[] iArr, int i, List<? extends C869590Y9l> list, boolean z) {
        return LJIIL().LIZIZ.LJIIIZ(str, iArr, i, list, z);
    }
}

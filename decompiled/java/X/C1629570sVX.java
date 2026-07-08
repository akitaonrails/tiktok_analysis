package X;

import Y.AfS115S0300000_25;
import Y.AfS194S0100000_25;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0sVX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1629570sVX {
    public final boolean LIZ;
    public final InterfaceC1627740sSa LIZIZ;
    public final C1625440sOs LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public final C11NJ LJFF = new C11NJ();
    public final C01GW LJI = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(400));

    public final boolean LIZ(Effect effect, InterfaceC1625550sP3 interfaceC1625550sP3) {
        if (this.LIZLLL && this.LJ) {
            interfaceC1625550sP3.onSuccess(effect);
            return true;
        }
        return false;
    }

    public final void LIZIZ(final Effect effect, final InterfaceC1625550sP3 interfaceC1625550sP3) {
        if (C1626170sQ3.LIZ(this.LIZIZ, effect, this.LIZ)) {
            this.LIZLLL = true;
        }
        if (LIZ(effect, interfaceC1625550sP3)) {
            return;
        }
        if (C2281551ESb.LIZIZ.LJIILLIIL() && this.LIZ && this.LJ && !C1624200sMs.LJIILIIL(effect)) {
            this.LJFF.LIZ(this.LIZIZ.LIZIZ(new C1629340sVA(effect, false, this.LIZJ), true).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS194S0100000_25(interfaceC1625550sP3, 126)));
            interfaceC1625550sP3.onSuccess(effect);
            return;
        }
        if (!this.LIZLLL) {
            C11PQ c11pqLIZIZ = this.LIZIZ.LIZIZ(new C1629340sVA(effect, false, this.LIZJ), true);
            if (((Boolean) this.LJI.getValue()).booleanValue()) {
                this.LJFF.LIZ(c11pqLIZIZ.LJJIL(new InterfaceC19483011Ki() { // from class: X.0sQU
                    @Override // X.InterfaceC19483011Ki
                    public final boolean test(Object obj) {
                        if (((C1632580saO) obj).LIZ != EnumC1641380soa.START) {
                            return true;
                        }
                        return false;
                    }
                }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS115S0300000_25(this, interfaceC1625550sP3, effect, 6), new AfS115S0300000_25(this, interfaceC1625550sP3, effect, 7)));
                this.LJFF.LIZ(c11pqLIZIZ.LJJIL(new InterfaceC19483011Ki() { // from class: X.0sQV
                    @Override // X.InterfaceC19483011Ki
                    public final boolean test(Object obj) {
                        if (((C1632580saO) obj).LIZ == EnumC1641380soa.START) {
                            return true;
                        }
                        return false;
                    }
                }).LJJLL(new AfS115S0300000_25(this, interfaceC1625550sP3, effect, 8), new C09JN() { // from class: X.00P3
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("DownloadStickerAndHintIconCombiner@4b5.observeStartOnly$3");
                        C1C7U.LIZIZ("DownloadStickerAndHintIconCombiner@4b5.observeStartOnly$3");
                    }
                }));
            } else {
                this.LJFF.LIZ(c11pqLIZIZ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS115S0300000_25(this, interfaceC1625550sP3, effect, 4), new AfS115S0300000_25(this, interfaceC1625550sP3, effect, 5)));
            }
        }
        if (!this.LJ) {
            UrlModel urlModelLIZ = C1441230nbl.LIZ(effect.getHintIcon());
            InterfaceC452050Ho3 interfaceC452050Ho3 = new InterfaceC452050Ho3() { // from class: X.0sVb
                @Override // X.InterfaceC452050Ho3
                public final void onFailure() {
                    C1629570sVX c1629570sVX = this.LIZ;
                    c1629570sVX.LJ = true;
                    c1629570sVX.LIZ(effect, interfaceC1625550sP3);
                }

                @Override // X.InterfaceC452050Ho3
                public final void LIZ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                    C1629570sVX c1629570sVX = this.LIZ;
                    c1629570sVX.LJ = true;
                    c1629570sVX.LIZ(effect, interfaceC1625550sP3);
                }
            };
            C1325710kbR[] c1325710kbRArrLJIILLIIL = C1324750kZt.LJIILLIIL(urlModelLIZ, null, EnumC1331380kka.MEDIUM, Bitmap.Config.RGB_565);
            C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
            C452060Ho4 c452060Ho4 = new C452060Ho4(interfaceC452050Ho3, c1325540kbALIZ, c1325710kbRArrLJIILLIIL);
            if (c1325710kbRArrLJIILLIIL.length > 0) {
                ((AbstractC1321260kUG) c1325540kbALIZ.LJI(c1325710kbRArrLJIILLIIL[0], null)).LIZJ(c452060Ho4, C822690WPb.LIZ());
            }
        }
    }

    public C1629570sVX(boolean z, InterfaceC1627740sSa interfaceC1627740sSa, C1625440sOs c1625440sOs) {
        this.LIZ = z;
        this.LIZIZ = interfaceC1627740sSa;
        this.LIZJ = c1625440sOs;
    }
}

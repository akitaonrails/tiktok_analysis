package X;

import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.ss.ugc.effectplatform.model.GifProviderEffectModel;
import com.ss.ugc.effectplatform.model.net.GifProviderEffectListResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13PL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13PL extends C13OD<GifProviderEffectModel, GifProviderEffectListResponse> {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final Map<String, String> LJ;
    public final boolean LJFF;

    @Override // X.C13OD
    public final C0XSU buildRequest() throws Throwable {
        HashMap mapLIZ = C13RE.LIZ(this.LIZ, true);
        mapLIZ.put("gif_id", this.LIZJ);
        String str = this.LIZLLL;
        if (str != null && !a0.LJJJIL(str)) {
            mapLIZ.put("giphy_type", this.LIZLLL);
        }
        Map<String, String> map = this.LJ;
        if (map != null) {
            mapLIZ.putAll(map);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZ.LJJIIJZLJL);
        this.LIZ.getClass();
        sbLIZ.append("/effect/api");
        sbLIZ.append("/stickers/list");
        return new C0XSU(C1535105zh.LIZ(mapLIZ, C2188811AlT.LIZIZ(sbLIZ)), null, null, null, null, false, null, null, 1022);
    }

    @Override // X.C13OD
    public final C13OE parseResponse(C13R7 c13r7, String str) {
        return (C13OE) c13r7.LIZ.convertJsonToObj(str, GifProviderEffectListResponse.class);
    }

    @Override // X.C13OD
    public final void onFailure(String str, String str2, C1662010tLr c1662010tLr) {
        c1662010tLr.LIZ(null, null, null);
        super.onFailure(str, str2, c1662010tLr);
    }

    @Override // X.C13OD
    public final void onSuccess(long j, long j2, long j3, C13OE c13oe) {
        final List<ProviderEffect> sticker_list;
        ProviderEffectModel gifs;
        final GifProviderEffectListResponse gifProviderEffectListResponse = (GifProviderEffectListResponse) c13oe;
        GifProviderEffectModel data = gifProviderEffectListResponse.getData();
        if (data != null && (gifs = data.getGifs()) != null) {
            sticker_list = gifs.getSticker_list();
        } else {
            sticker_list = null;
        }
        if (sticker_list != null && !sticker_list.isEmpty()) {
            for (ProviderEffect providerEffect : sticker_list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ.LJII);
                sbLIZ.append(C13SB.LIZ);
                sbLIZ.append(providerEffect.getId());
                sbLIZ.append(".gif");
                providerEffect.setPath(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (this.LJFF && sticker_list != null && !sticker_list.isEmpty()) {
            C13MA c13maLIZ = this.LIZ.LJJJIL.LIZ(this.LIZIZ);
            if (c13maLIZ instanceof InterfaceC1643780ssS) {
                runOnMainThread(new AwS431S0200000_30(c13maLIZ, (C13MA<GifProviderEffectListResponse>) gifProviderEffectListResponse, (GifProviderEffectListResponse) 98));
            }
            InterfaceC1634240sd4 interfaceC1634240sd4 = new InterfaceC1634240sd4(sticker_list, this, gifProviderEffectListResponse) { // from class: X.13PQ
                public final List<ProviderEffect> LIZ = new ArrayList();
                public final List<ProviderEffect> LIZIZ = new ArrayList();
                public final int LIZJ;
                public final /* synthetic */ List<ProviderEffect> LIZLLL;
                public final /* synthetic */ C13PL LJ;
                public final /* synthetic */ GifProviderEffectListResponse LJFF;

                @Override // X.InterfaceC1634240sd4
                public final void onProgress(ProviderEffect providerEffect2, int i, long j4) {
                }

                public final void LIZJ() {
                    if (((ArrayList) this.LIZIZ).size() > 0) {
                        C13PL c13pl = this.LJ;
                        GifProviderEffectListResponse gifProviderEffectListResponse2 = this.LJFF;
                        C1662010tLr c1662010tLr = new C1662010tLr(1);
                        C13MA c13maLIZ2 = c13pl.LIZ.LJJJIL.LIZ(c13pl.LIZIZ);
                        if (c13maLIZ2 instanceof InterfaceC1643780ssS) {
                            ((InterfaceC1643780ssS) c13maLIZ2).LIZIZ(c1662010tLr);
                        } else if (c13maLIZ2 != null) {
                            c13maLIZ2.onFail(gifProviderEffectListResponse2, c1662010tLr);
                        }
                        c13pl.LIZ.LJJJIL.LIZJ(c13pl.LIZIZ);
                        return;
                    }
                    C13PL c13pl2 = this.LJ;
                    GifProviderEffectListResponse gifProviderEffectListResponse3 = this.LJFF;
                    List<ProviderEffect> list = this.LIZLLL;
                    C13MA c13maLIZ3 = c13pl2.LIZ.LJJJIL.LIZ(c13pl2.LIZIZ);
                    if (c13maLIZ3 instanceof InterfaceC1643780ssS) {
                        ((InterfaceC1643780ssS) c13maLIZ3).LIZ(list);
                    } else if (c13maLIZ3 != null) {
                        c13maLIZ3.onSuccess(gifProviderEffectListResponse3);
                    }
                    c13pl2.LIZ.LJJJIL.LIZJ(c13pl2.LIZIZ);
                }

                @Override // X.C13MA
                public final void onSuccess(ProviderEffect providerEffect2) {
                    ((ArrayList) this.LIZ).add(providerEffect2);
                    if (((ArrayList) this.LIZ).size() + ((ArrayList) this.LIZIZ).size() == this.LIZJ) {
                        LIZJ();
                    }
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void preProcess(ProviderEffect providerEffect2) {
                }

                @Override // X.C13MA
                public final void onFail(ProviderEffect providerEffect2, C1662010tLr c1662010tLr) {
                    ((ArrayList) this.LIZIZ).add(providerEffect2);
                    if (((ArrayList) this.LIZ).size() + ((ArrayList) this.LIZIZ).size() == this.LIZJ) {
                        LIZJ();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LIZLLL = sticker_list;
                    this.LJ = this;
                    this.LJFF = gifProviderEffectListResponse;
                    this.LIZJ = sticker_list.size();
                }
            };
            for (ProviderEffect providerEffect2 : sticker_list) {
                String strLIZ = C1528550psb.LIZ();
                this.LIZ.LJJJIL.LIZIZ(strLIZ, interfaceC1634240sd4);
                C13RD c13rd = this.LIZ;
                C20001113Np c20001113Np = c13rd.LJJIIJ;
                if (c20001113Np != null) {
                    c20001113Np.LIZIZ(new C13PO(c13rd, providerEffect2, strLIZ));
                }
            }
            return;
        }
        super.onSuccess(j, j2, j3, gifProviderEffectListResponse);
    }

    public C13PL(C13RD c13rd, String str, String str2, String str3, Map<String, String> map, boolean z) {
        super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, str, null);
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = map;
        this.LJFF = z;
    }
}

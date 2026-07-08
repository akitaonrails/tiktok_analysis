package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.model.MinisMetaResp;
import com.ss.android.ugc.aweme.minis.model.iaa.MinisRewardedAdData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2196191AxN extends AbstractC2194781Av6 {
    public final boolean LLILLL;

    public C2196191AxN() {
        this(false);
    }

    public C2196191AxN(boolean z) {
        this.LLILLL = z;
    }

    public final void LIZJ(C09VK c09vk, final CompletionBlock completionBlock) {
        String str;
        String str2;
        int i;
        final String strLJIIJ;
        C2196101AxE c2196101AxE = C2196101AxE.LIZ;
        final String adUnitId = c09vk.getAdUnitId();
        boolean z = this.LLILLL;
        c2196101AxE.getClass();
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initRewardAds, start, adPlacementId:");
        sbLIZ.append(adUnitId);
        C2188811AlT.LIZIZ(sbLIZ);
        String enterFrom = "";
        if (z) {
            C1232850iBf c1232850iBf = C2196131AxH.LJIJJ;
            int i3 = c1232850iBf.LIZ;
            String str3 = c1232850iBf.LIZIZ;
            if (str3 == null) {
                str3 = "";
            }
            InterfaceC2194811Av9 interfaceC2194811Av9LIZ = C2196101AxE.LIZ(i3, c1232850iBf.LIZJ, str3);
            C2196701AyC c2196701AyC = C2196701AyC.LIZ;
            MinisRewardedAdData.Companion.getClass();
            MinisRewardedAdData minisRewardedAdDataLIZ = C1780920wRe.LIZ(adUnitId, null, null);
            c2196701AyC.getClass();
            C2196701AyC.LJIILIIL(minisRewardedAdDataLIZ, true, c1232850iBf);
            C2196201AxO.LIZJ(c1232850iBf);
            String str4 = c1232850iBf.LIZIZ;
            if (str4 != null) {
                enterFrom = str4;
            }
            completionBlock.onFailure(1, enterFrom, interfaceC2194811Av9LIZ);
        } else {
            IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
            if (iMinisApiService != null && iMinisApiService.LJJIIJZLJL()) {
                C1232850iBf c1232850iBf2 = C2196131AxH.LJIJI;
                int i4 = c1232850iBf2.LIZ;
                String str5 = c1232850iBf2.LIZIZ;
                if (str5 == null) {
                    str5 = "";
                }
                InterfaceC2194811Av9 interfaceC2194811Av9LIZ2 = C2196101AxE.LIZ(i4, c1232850iBf2.LIZJ, str5);
                String str6 = c1232850iBf2.LIZIZ;
                if (str6 != null) {
                    enterFrom = str6;
                }
                completionBlock.onFailure(1, enterFrom, interfaceC2194811Av9LIZ2);
                C2196701AyC c2196701AyC2 = C2196701AyC.LIZ;
                MinisRewardedAdData.Companion.getClass();
                MinisRewardedAdData minisRewardedAdDataLIZ2 = C1780920wRe.LIZ(adUnitId, null, null);
                c2196701AyC2.getClass();
                C2196701AyC.LJIILIIL(minisRewardedAdDataLIZ2, true, c1232850iBf2);
            } else if (adUnitId != null && adUnitId.length() != 0) {
                final String strLIZ = C2195221Avo.LIZ();
                MinisMetaResp minisMetaResp = C2195221Avo.LJIIJ;
                if (minisMetaResp != null) {
                    str = minisMetaResp.minisCategory;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, "mini_game")) {
                    i = 1;
                } else {
                    MinisMetaResp minisMetaResp2 = C2195221Avo.LJIIJ;
                    if (minisMetaResp2 != null) {
                        str2 = minisMetaResp2.minisCategory;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, "short_drama")) {
                        i = 2;
                    } else {
                        i = 0;
                    }
                }
                if (strLIZ != null && strLIZ.length() != 0) {
                    if (C2195221Avo.LIZLLL() == null) {
                        C1232850iBf c1232850iBf3 = C2196131AxH.LJIILJJIL;
                        int i5 = c1232850iBf3.LIZ;
                        String str7 = c1232850iBf3.LIZIZ;
                        if (str7 == null) {
                            str7 = "";
                        }
                        InterfaceC2194811Av9 interfaceC2194811Av9LIZ3 = C2196101AxE.LIZ(i5, c1232850iBf3.LIZJ, str7);
                        C2196701AyC c2196701AyC3 = C2196701AyC.LIZ;
                        MinisRewardedAdData.Companion.getClass();
                        MinisRewardedAdData minisRewardedAdDataLIZ3 = C1780920wRe.LIZ(adUnitId, strLIZ, null);
                        c2196701AyC3.getClass();
                        C2196701AyC.LJIILIIL(minisRewardedAdDataLIZ3, true, c1232850iBf3);
                        C2196201AxO.LIZJ(c1232850iBf3);
                        String str8 = c1232850iBf3.LIZIZ;
                        if (str8 != null) {
                            enterFrom = str8;
                        }
                        completionBlock.onFailure(1, enterFrom, interfaceC2194811Av9LIZ3);
                    } else {
                        SchemaParserData schemaParserData = C2195221Avo.LJII;
                        if (schemaParserData == null) {
                            strLJIIJ = "";
                        } else {
                            strLJIIJ = schemaParserData.LJIIJ();
                        }
                        SchemaParserData schemaParserData2 = C2195221Avo.LJII;
                        if (schemaParserData2 != null) {
                            enterFrom = schemaParserData2.getEnterFrom();
                        }
                        new C1236730iHv().LIZIZ(strLIZ, adUnitId, C0N6N.MINIS_AD_PLACEMENT_REWARD.ordinal(), i, enterFrom, new InterfaceC1236750iHx() { // from class: X.1AxK
                            /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[PHI: r3
                              0x006f: PHI (r3v6 int) = (r3v5 int), (r3v10 int), (r3v10 int), (r3v10 int) binds: [B:30:0x00b1, B:18:0x0057, B:20:0x005b, B:22:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
                            /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
                            @Override // X.InterfaceC1236750iHx
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LIZ(boolean r23, com.ss.android.ugc.aweme.minis.model.NetworkResponse<com.ss.android.ugc.aweme.minis.model.iaa.MinisAdPlacementValidateResponse> r24, java.lang.Throwable r25) {
                                /*
                                    Method dump skipped, instruction units count: 415
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C2196161AxK.LIZ(boolean, com.ss.android.ugc.aweme.minis.model.NetworkResponse, java.lang.Throwable):void");
                            }
                        });
                    }
                } else {
                    C1232850iBf c1232850iBf4 = C2196131AxH.LJIILIIL;
                    int i6 = c1232850iBf4.LIZ;
                    String str9 = c1232850iBf4.LIZIZ;
                    if (str9 == null) {
                        str9 = "";
                    }
                    InterfaceC2194811Av9 interfaceC2194811Av9LIZ4 = C2196101AxE.LIZ(i6, c1232850iBf4.LIZJ, str9);
                    C2196701AyC c2196701AyC4 = C2196701AyC.LIZ;
                    MinisRewardedAdData.Companion.getClass();
                    MinisRewardedAdData minisRewardedAdDataLIZ4 = C1780920wRe.LIZ(adUnitId, null, null);
                    c2196701AyC4.getClass();
                    C2196701AyC.LJIILIIL(minisRewardedAdDataLIZ4, true, c1232850iBf4);
                    C2196201AxO.LIZJ(c1232850iBf4);
                    String str10 = c1232850iBf4.LIZIZ;
                    if (str10 != null) {
                        enterFrom = str10;
                    }
                    completionBlock.onFailure(1, enterFrom, interfaceC2194811Av9LIZ4);
                }
            } else {
                C1232850iBf c1232850iBf5 = C2196131AxH.LJ;
                int i7 = c1232850iBf5.LIZ;
                String str11 = c1232850iBf5.LIZIZ;
                if (str11 == null) {
                    str11 = "";
                }
                InterfaceC2194811Av9 interfaceC2194811Av9LIZ5 = C2196101AxE.LIZ(i7, c1232850iBf5.LIZJ, str11);
                C2196701AyC.LIZ.getClass();
                C2196701AyC.LJIILIIL(null, true, c1232850iBf5);
                C2196201AxO.LIZJ(c1232850iBf5);
                String str12 = c1232850iBf5.LIZIZ;
                if (str12 != null) {
                    enterFrom = str12;
                }
                completionBlock.onFailure(1, enterFrom, interfaceC2194811Av9LIZ5);
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handle, params:");
        sbLIZ2.append(c09vk);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.AbstractC1549150qPp
    public final /* bridge */ /* synthetic */ void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        LIZJ((C09VK) xBaseParamModel, completionBlock);
    }
}

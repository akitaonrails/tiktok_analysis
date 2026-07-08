package X;

import Y.AfS110S0300000_17;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.gift.model.CreateMagicResultResponse;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionEnigmaParams;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionEnigmaResult;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionInput;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionMagicGiftParams;
import com.bytedance.android.livesdk.gift.model.LiveCoinConsumptionResult;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import tikcast.api.privilege.enigma.EnigmaPurchaseRequest;
import tikcast.api.privilege.enigma.EnigmaPurchaseResponse;
import webcast.data.RechargeCustomError;

/* JADX INFO: renamed from: X.0g2v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1150550g2v {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public final Room LIZJ;
    public final View LIZLLL;
    public final C1150390g2f LJ = new C1150390g2f(new InterfaceC1150370g2d() { // from class: X.0g2g
        @Override // X.InterfaceC1150370g2d
        public final Room LIZ() {
            return this.LIZ.LIZJ;
        }

        @Override // X.InterfaceC1150370g2d
        public final Context getContext() {
            return this.LIZ.LIZ;
        }

        @Override // X.InterfaceC1150370g2d
        public final DataChannel getDataChannel() {
            return this.LIZ.LIZIZ;
        }

        @Override // X.InterfaceC1150370g2d
        public final View getWidgetView() {
            return this.LIZ.LIZLLL;
        }

        @Override // X.InterfaceC1150370g2d
        public final void LIZIZ(LiveCoinConsumptionInput liveCoinConsumptionInput) {
            this.LIZ.getClass();
            C1150550g2v.LIZIZ(liveCoinConsumptionInput, 19999, "coins_insufficient_show_recharge");
        }

        @Override // X.InterfaceC1150370g2d
        public final void LIZLLL(LiveCoinConsumptionInput liveCoinConsumptionInput) {
            this.LIZ.LIZ(liveCoinConsumptionInput, null);
        }

        @Override // X.InterfaceC1150370g2d
        public final void LIZJ(LiveCoinConsumptionInput liveCoinConsumptionInput, C1150700g3A c1150700g3A) {
            this.LIZ.LIZ(liveCoinConsumptionInput, c1150700g3A);
        }
    });

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.0g2w] */
    public final void LIZ(final LiveCoinConsumptionInput liveCoinConsumptionInput, C1150700g3A c1150700g3A) {
        long id;
        String str;
        long j;
        int i = C1150570g2x.LIZ[liveCoinConsumptionInput.sceneType.ordinal()];
        long id2 = 0;
        int i2 = 0;
        if (i != 1) {
            if (i != 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("cannot handle sceneType: ");
                sbLIZ.append(liveCoinConsumptionInput.sceneType.getType());
                LIZIZ(liveCoinConsumptionInput, 19998, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            final C1150390g2f c1150390g2f = this.LJ;
            C158B.LIZ();
            IEnigmaService iEnigmaService = (IEnigmaService) C1161920gLG.LIZJ(IEnigmaService.class);
            if (iEnigmaService == 0) {
                return;
            }
            EnigmaPurchaseRequest enigmaPurchaseRequest = new EnigmaPurchaseRequest();
            LiveCoinConsumptionEnigmaParams liveCoinConsumptionEnigmaParams = liveCoinConsumptionInput.enigmaParams;
            if (liveCoinConsumptionEnigmaParams != null) {
                j = liveCoinConsumptionEnigmaParams.productId;
            } else {
                j = 1;
            }
            enigmaPurchaseRequest.productId = j;
            Room roomLIZ = c1150390g2f.LIZ.LIZ();
            if (roomLIZ != null) {
                id2 = roomLIZ.getId();
            }
            enigmaPurchaseRequest.roomId = id2;
            LiveCoinConsumptionEnigmaParams liveCoinConsumptionEnigmaParams2 = liveCoinConsumptionInput.enigmaParams;
            if (liveCoinConsumptionEnigmaParams2 != null) {
                i2 = liveCoinConsumptionEnigmaParams2.exchangeType;
            }
            enigmaPurchaseRequest.ugExchange = i2;
            iEnigmaService.fG(enigmaPurchaseRequest, new C0KZR() { // from class: X.0g2w
                @Override // X.C0KZR
                public final void LIZ(Throwable th) {
                    Activity activityLIZ;
                    C1133180fau c1133180fauLIZ = C1133170fat.LIZ(th);
                    C1150590g2z c1150590g2z = liveCoinConsumptionInput.LIZ;
                    if (c1150590g2z != null) {
                        LiveCoinConsumptionResult liveCoinConsumptionResult = new LiveCoinConsumptionResult();
                        LiveCoinConsumptionInput liveCoinConsumptionInput2 = liveCoinConsumptionInput;
                        liveCoinConsumptionResult.sceneType = liveCoinConsumptionInput2.sceneType;
                        liveCoinConsumptionResult.isFromJSB = liveCoinConsumptionInput2.isFromJSB;
                        liveCoinConsumptionResult.statusCode = c1133180fauLIZ.LIZ;
                        liveCoinConsumptionResult.magicGiftResult = null;
                        c1150590g2z.LIZ(liveCoinConsumptionResult, th);
                    }
                    Context context = c1150390g2f.LIZ.getContext();
                    if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                        String strLJIJI = C497740JfY.LJIJI(2131852224);
                        if (th instanceof C501470JlZ) {
                            strLJIJI = ((C501470JlZ) th).getPrompt();
                        }
                        if (strLJIJI != null && strLJIJI.length() > 0) {
                            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                            c1389890mGx.LJIIJ(strLJIJI);
                            c1389890mGx.LJIIJJI();
                        }
                    }
                }

                @Override // X.C0KZR
                public final void LIZIZ(BaseResponse<EnigmaPurchaseResponse.Data, EnigmaPurchaseResponse.Extra> baseResponse) {
                    Activity activityLIZ;
                    RequestError requestError;
                    String str2;
                    RechargeCustomError rechargeCustomError;
                    RechargeCustomError rechargeCustomError2;
                    RechargeCustomError rechargeCustomError3;
                    String str3 = null;
                    if (baseResponse == null) {
                        C1150590g2z c1150590g2z = liveCoinConsumptionInput.LIZ;
                        if (c1150590g2z != null) {
                            LiveCoinConsumptionResult liveCoinConsumptionResult = new LiveCoinConsumptionResult();
                            LiveCoinConsumptionInput liveCoinConsumptionInput2 = liveCoinConsumptionInput;
                            liveCoinConsumptionResult.sceneType = liveCoinConsumptionInput2.sceneType;
                            liveCoinConsumptionResult.isFromJSB = liveCoinConsumptionInput2.isFromJSB;
                            liveCoinConsumptionResult.statusCode = -10;
                            liveCoinConsumptionResult.magicGiftResult = null;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("coin consume fail, apiResponse.data == null, isFromJSB=");
                            sbLIZ2.append(liveCoinConsumptionInput.isFromJSB);
                            sbLIZ2.append(", sceneType: ");
                            sbLIZ2.append(liveCoinConsumptionInput.sceneType.getType());
                            sbLIZ2.append(", statusCode=");
                            sbLIZ2.append(-10);
                            c1150590g2z.LIZ(liveCoinConsumptionResult, new Exception(C2188811AlT.LIZIZ(sbLIZ2)));
                            return;
                        }
                        return;
                    }
                    if (baseResponse.statusCode == 0) {
                        EnigmaPurchaseResponse.Extra extra = (EnigmaPurchaseResponse.Extra) baseResponse.extra;
                        if (extra != null && (rechargeCustomError3 = extra.customError) != null) {
                            LiveCoinConsumptionInput liveCoinConsumptionInput3 = liveCoinConsumptionInput;
                            C1150590g2z c1150590g2z2 = liveCoinConsumptionInput3.LIZ;
                            if (c1150590g2z2 != null) {
                                LiveCoinConsumptionResult liveCoinConsumptionResult2 = new LiveCoinConsumptionResult();
                                liveCoinConsumptionResult2.sceneType = liveCoinConsumptionInput3.sceneType;
                                liveCoinConsumptionResult2.isFromJSB = liveCoinConsumptionInput3.isFromJSB;
                                liveCoinConsumptionResult2.statusCode = baseResponse.statusCode;
                                LiveCoinConsumptionEnigmaResult liveCoinConsumptionEnigmaResult = new LiveCoinConsumptionEnigmaResult();
                                liveCoinConsumptionEnigmaResult.customError = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, rechargeCustomError3);
                                liveCoinConsumptionResult2.enigmaResult = liveCoinConsumptionEnigmaResult;
                                c1150590g2z2.LIZ(liveCoinConsumptionResult2, null);
                                return;
                            }
                            return;
                        }
                        C1150590g2z c1150590g2z3 = liveCoinConsumptionInput.LIZ;
                        if (c1150590g2z3 != null) {
                            LiveCoinConsumptionResult liveCoinConsumptionResult3 = new LiveCoinConsumptionResult();
                            LiveCoinConsumptionInput liveCoinConsumptionInput4 = liveCoinConsumptionInput;
                            liveCoinConsumptionResult3.sceneType = liveCoinConsumptionInput4.sceneType;
                            liveCoinConsumptionResult3.isFromJSB = liveCoinConsumptionInput4.isFromJSB;
                            liveCoinConsumptionResult3.statusCode = 0;
                            EnigmaPurchaseResponse.Extra extra2 = (EnigmaPurchaseResponse.Extra) baseResponse.extra;
                            if (extra2 != null && (rechargeCustomError2 = extra2.customError) != null) {
                                LiveCoinConsumptionEnigmaResult liveCoinConsumptionEnigmaResult2 = new LiveCoinConsumptionEnigmaResult();
                                liveCoinConsumptionEnigmaResult2.customError = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, rechargeCustomError2);
                                liveCoinConsumptionResult3.enigmaResult = liveCoinConsumptionEnigmaResult2;
                            }
                            c1150590g2z3.LIZIZ(liveCoinConsumptionResult3);
                            return;
                        }
                        return;
                    }
                    C1150590g2z c1150590g2z4 = liveCoinConsumptionInput.LIZ;
                    if (c1150590g2z4 != null) {
                        LiveCoinConsumptionResult liveCoinConsumptionResult4 = new LiveCoinConsumptionResult();
                        LiveCoinConsumptionInput liveCoinConsumptionInput5 = liveCoinConsumptionInput;
                        liveCoinConsumptionResult4.sceneType = liveCoinConsumptionInput5.sceneType;
                        liveCoinConsumptionResult4.isFromJSB = liveCoinConsumptionInput5.isFromJSB;
                        liveCoinConsumptionResult4.statusCode = baseResponse.statusCode;
                        EnigmaPurchaseResponse.Extra extra3 = (EnigmaPurchaseResponse.Extra) baseResponse.extra;
                        if (extra3 != null && (rechargeCustomError = extra3.customError) != null) {
                            LiveCoinConsumptionEnigmaResult liveCoinConsumptionEnigmaResult3 = new LiveCoinConsumptionEnigmaResult();
                            liveCoinConsumptionEnigmaResult3.customError = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, rechargeCustomError);
                            liveCoinConsumptionResult4.enigmaResult = liveCoinConsumptionEnigmaResult3;
                        }
                        c1150590g2z4.LIZ(liveCoinConsumptionResult4, null);
                    }
                    Context context = c1150390g2f.LIZ.getContext();
                    if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (requestError = baseResponse.LJ) != null && (str2 = requestError.message) != null && str2.length() > 0) {
                        C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                        RequestError requestError2 = baseResponse.LJ;
                        if (requestError2 != null) {
                            str3 = requestError2.message;
                        }
                        c1389890mGx.LJIIJ(str3);
                        c1389890mGx.LJIIJJI();
                    }
                }
            });
            return;
        }
        LiveCoinConsumptionMagicGiftParams liveCoinConsumptionMagicGiftParams = liveCoinConsumptionInput.magicGiftParams;
        if (liveCoinConsumptionMagicGiftParams != null) {
            C1150390g2f c1150390g2f2 = this.LJ;
            if (liveCoinConsumptionMagicGiftParams == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("handle error, magicGiftParams is null, params = ");
                sbLIZ2.append(liveCoinConsumptionInput.magicGiftParams);
                C20441214yg.LJ("LiveGiftMagicHelper", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            String string = UUID.randomUUID().toString();
            AfS110S0300000_17 afS110S0300000_17 = new AfS110S0300000_17(C158B.LIZ(), c1150390g2f2, c1150700g3A, liveCoinConsumptionInput, string, 2);
            C09JN<? super Throwable> afS110S0300000_172 = new AfS110S0300000_17(C158B.LIZ(), c1150390g2f2, c1150700g3A, liveCoinConsumptionInput, string, 1);
            C480460Ism.LIZ().getClass();
            GiftRetrofitApi giftRetrofitApi = (GiftRetrofitApi) C480460Ism.LIZLLL(GiftRetrofitApi.class);
            Room roomLIZ2 = c1150390g2f2.LIZ.LIZ();
            if (roomLIZ2 != null) {
                id = roomLIZ2.getId();
            } else {
                id = 0;
            }
            LiveCoinConsumptionMagicGiftParams liveCoinConsumptionMagicGiftParams2 = liveCoinConsumptionInput.magicGiftParams;
            if (liveCoinConsumptionMagicGiftParams2 != null) {
                id2 = liveCoinConsumptionMagicGiftParams2.magicGiftId;
            }
            if (c1150700g3A != null) {
                i2 = c1150700g3A.LIZ;
            }
            String str2 = null;
            if (liveCoinConsumptionMagicGiftParams2 != null) {
                str2 = liveCoinConsumptionMagicGiftParams2.specificMagicResultId;
                str = liveCoinConsumptionMagicGiftParams2.requestExtra;
            } else {
                str = null;
            }
            C11NZ<BaseResponse<CreateMagicResultResponse.Data, CreateMagicResultResponse.Extra>> c11nzMagicGiftCreate = giftRetrofitApi.magicGiftCreate(id, id2, string, i2, str2, str);
            final int i3 = liveCoinConsumptionInput.retryTimes;
            c11nzMagicGiftCreate.LJJLIIIJLJLI(new InterfaceC1487280oo2() { // from class: X.01l5
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    final C118300cf c118300cf = new C118300cf();
                    final int i4 = i3;
                    return ((C11NZ) obj).LJJJ(new InterfaceC1487280oo2() { // from class: X.01l4
                        @Override // X.InterfaceC1487280oo2
                        public final Object apply(Object obj2) {
                            Throwable th = (Throwable) obj2;
                            C118300cf c118300cf2 = c118300cf;
                            int i5 = c118300cf2.element;
                            if (i5 < i4 && ((th instanceof C1811850xFX) || (th instanceof C1494450ozb) || (th instanceof C1494690ozz))) {
                                c118300cf2.element = i5 + 1;
                                return C11NZ.LJLJJLL(1L, TimeUnit.SECONDS);
                            }
                            return C11NZ.LJJIJLIJ(th);
                        }
                    }, false);
                }
            }).LJIILIIL(new C0UO0()).LJJLL(afS110S0300000_17, afS110S0300000_172);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("handle sceneType: ");
        sbLIZ3.append(liveCoinConsumptionInput.sceneType.getType());
        sbLIZ3.append(" error, magicGiftParams is null");
        LIZIZ(liveCoinConsumptionInput, 19998, C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static void LIZIZ(LiveCoinConsumptionInput liveCoinConsumptionInput, int i, String str) {
        C1150590g2z c1150590g2z = liveCoinConsumptionInput.LIZ;
        if (c1150590g2z != null) {
            LiveCoinConsumptionResult liveCoinConsumptionResult = new LiveCoinConsumptionResult();
            liveCoinConsumptionResult.isFromJSB = liveCoinConsumptionInput.isFromJSB;
            liveCoinConsumptionResult.sceneType = liveCoinConsumptionInput.sceneType;
            liveCoinConsumptionResult.statusCode = i;
            liveCoinConsumptionResult.magicGiftResult = null;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("coin consume fail, isFromJSB=");
            sbLIZ.append(liveCoinConsumptionInput.isFromJSB);
            sbLIZ.append(", sceneType: ");
            sbLIZ.append(liveCoinConsumptionInput.sceneType.getType());
            sbLIZ.append(", statusCode=");
            sbLIZ.append(i);
            sbLIZ.append(", response=");
            sbLIZ.append((Object) null);
            sbLIZ.append(", errorMsg=");
            sbLIZ.append(str);
            c1150590g2z.LIZ(liveCoinConsumptionResult, new Exception(C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0g2g] */
    public C1150550g2v(Context context, DataChannel dataChannel, Room room, View view) {
        this.LIZ = context;
        this.LIZIZ = dataChannel;
        this.LIZJ = room;
        this.LIZLLL = view;
    }
}

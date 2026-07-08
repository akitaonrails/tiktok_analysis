package X;

import com.bytedance.android.live.liveinteract.api.quickcohost.PreferenceTagsChangedChannel;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.interact.model.SetMatchPreferenceResp;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import org.json.JSONException;
import vj0.d;

/* JADX INFO: renamed from: X.0bCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C964500bCq extends C2217421BqW implements InterfaceC1631620sYq<Integer, List<? extends Integer>, EnumC964540bCu, Unit> {
    public C964500bCq(Object obj) {
        super(3, obj, d.class, "onConfirmClicked", "onConfirmClicked(ILjava/util/List;Lcom/bytedance/android/live/liveinteract/api/preference/PanelEntrance;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, List<? extends Integer> list, EnumC964540bCu enumC964540bCu) throws JSONException {
        EnumC964530bCt enumC964530bCt;
        int iIntValue = num.intValue();
        List<? extends Integer> list2 = list;
        EnumC964540bCu enumC964540bCu2 = enumC964540bCu;
        d dVar = (d) this.receiver;
        dVar.getClass();
        C20441214yg.LIZIZ("PreferencePanelServiceImpl", "HELLO onConfirmedCLICKED HAS BEEN DONEOFDENENENFEANFESNDADSNFasd");
        C915980Zwa.LJI().LIZ().LLJJIJI(list2);
        DataChannelGlobal.LLILZ.HQ2(PreferenceTagsChangedChannel.class, list2);
        C964590bCz c964590bCz = EnumC964530bCt.Companion;
        Integer numValueOf = Integer.valueOf(iIntValue);
        c964590bCz.getClass();
        EnumC964530bCt[] enumC964530bCtArrValues = EnumC964530bCt.values();
        int length = enumC964530bCtArrValues.length;
        final int iIntValue2 = 0;
        int i = 0;
        while (true) {
            if (i < length) {
                enumC964530bCt = enumC964530bCtArrValues[i];
                int rawValue = enumC964530bCt.getRawValue();
                if (numValueOf != null && rawValue == numValueOf.intValue()) {
                    break;
                }
                i++;
            } else {
                enumC964530bCt = EnumC964530bCt.APPLY_PREFERENCE_ONLY;
                break;
            }
        }
        EnumC958900b3o enumC958900b3oK0 = C915980Zwa.LJIIIZ().k0();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onConfirmClicked action=");
        sbLIZ.append(enumC964530bCt);
        sbLIZ.append(" ids=");
        sbLIZ.append(list2);
        sbLIZ.append(" entrance=");
        sbLIZ.append(enumC964540bCu2.getWireValue());
        sbLIZ.append(" status=");
        sbLIZ.append(enumC958900b3oK0);
        C20441214yg.LJIIIZ("PreferencePanelServiceImpl", C2188811AlT.LIZIZ(sbLIZ));
        if (C959980b5Y.LIZ[enumC958900b3oK0.ordinal()] == 1) {
            C20441214yg.LJIIIZ("PreferencePanelServiceImpl", "state == NONE — startQuickCoHost from panel confirm");
            C915980Zwa.LJIIIZ().LIZIZ(EnumC959750b5B.TYPE_INVITEE_LIST_DIALOG, new C950840aqo(1, new InterfaceC914930Zut<C960260b60>() { // from class: X.0bCv
                @Override // X.InterfaceC914930Zut
                public final void onSuccess(C960260b60 c960260b60) {
                    C20441214yg.LJIIIZ("PreferencePanelServiceImpl", "panel-confirm auto_match success");
                }

                @Override // X.InterfaceC914930Zut
                public final void LIZ(int i2, String str, Throwable th) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("panel-confirm auto_match fail code=");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(" msg=");
                    sbLIZ2.append(str);
                    C20441214yg.LJFF("PreferencePanelServiceImpl", C2188811AlT.LIZIZ(sbLIZ2), th);
                }
            }, null, 28));
        } else {
            Integer num2 = (Integer) C13LP.LJJJLL(list2);
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            }
            if (list2.size() > 1) {
                C964620bD2.LIZ(list2.size(), "set_preference");
            }
            C480460Ism.LIZ().getClass();
            d.LIZLLL.LIZ(((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).setMatchPreference(iIntValue2).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.00Rl
                @Override // X.C09JN
                public final void accept(Object obj) {
                    int i2;
                    List<Integer> listSingletonList;
                    SetMatchPreferenceResp.ResponseData responseData;
                    C1C7U.LIZ("PreferencePanelServiceImpl@2900.callSetMatchPreference$sub$1");
                    BaseResponse baseResponse = (BaseResponse) obj;
                    if (baseResponse != null && (responseData = (SetMatchPreferenceResp.ResponseData) baseResponse.data) != null) {
                        i2 = responseData.preferenceTag;
                    } else {
                        i2 = iIntValue2;
                    }
                    Integer numValueOf2 = Integer.valueOf(i2);
                    if (numValueOf2.intValue() == 0 || (listSingletonList = Collections.singletonList(Integer.valueOf(numValueOf2.intValue()))) == null) {
                        listSingletonList = C13BV.INSTANCE;
                    }
                    C915980Zwa.LJI().LIZ().LLJJIJI(listSingletonList);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setMatchPreference success tag=");
                    sbLIZ2.append(i2);
                    sbLIZ2.append(" cache=");
                    sbLIZ2.append(listSingletonList);
                    C20441214yg.LJIIIZ("PreferencePanelServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
                    C1C7U.LIZIZ("PreferencePanelServiceImpl@2900.callSetMatchPreference$sub$1");
                }
            }, new C09JN() { // from class: X.00R7
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PreferencePanelServiceImpl@2900.callSetMatchPreference$sub$2");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("setMatchPreference error tag=");
                    sbLIZ2.append(iIntValue2);
                    C20441214yg.LJFF("PreferencePanelServiceImpl", C2188811AlT.LIZIZ(sbLIZ2), (Throwable) obj);
                    C1C7U.LIZIZ("PreferencePanelServiceImpl@2900.callSetMatchPreference$sub$2");
                }
            }));
        }
        dVar.LIZIZ();
        return Unit.LIZ;
    }
}

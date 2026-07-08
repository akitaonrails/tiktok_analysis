package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0c8S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1000220c8S implements InterfaceC1000240c8U {
    public static final List<InterfaceC1000240c8U> LIZ = C1697810uHb.LJIIJJI(new InterfaceC1000240c8U() { // from class: X.0c8T
        public static final Map<String, Function1<AwemePlayFunModel, C996840c30>> LIZ = C2097908Jt.LIZJ(new Pair("tips", AFwS252S0000000_16.get$arr$(540)));

        @Override // X.InterfaceC1000240c8U
        public final IAdTranslatableData LIZ(AwemeRawAd awemeRawAd) {
            List<String> list;
            Function1<AwemePlayFunModel, C996840c30> function1;
            AwemePlayFunModel playFunModel = awemeRawAd.getPlayFunModel();
            C996840c30 c996840c30Invoke = null;
            if (playFunModel == null || (list = playFunModel.translationFields) == null || !(!list.isEmpty())) {
                return null;
            }
            if (C13LP.LLIIJI(list).contains("tips") && (function1 = LIZ.get("tips")) != null) {
                c996840c30Invoke = function1.invoke(playFunModel);
            }
            return new C996860c32(Collections.unmodifiableList(list), c996840c30Invoke);
        }
    }, new AbstractC1012170cRj() { // from class: X.0cCF
        @Override // X.InterfaceC1000240c8U
        public final IAdTranslatableData LIZ(AwemeRawAd awemeRawAd) {
            Map<String, AnoleComponentModel> map;
            InterfaceC1002590cCH c1002610cCJ;
            AnoleModel anoleModel = awemeRawAd.getAnoleModel();
            if (anoleModel == null || (map = anoleModel.components) == null || !(!map.isEmpty())) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, AnoleComponentModel>> it2 = map.entrySet().iterator();
            final int i = 0;
            while (it2.hasNext()) {
                AnoleComponentModel value = it2.next().getValue();
                final String str = value.type;
                Map<String, ? extends Object> map2 = value.data;
                if (map2 != null) {
                    C1227904rF.LIZ.getClass();
                    String strLJI = C1227904rF.LJI(map2);
                    if (strLJI != null) {
                        JSONObject jSONObject = new JSONObject(strLJI);
                        List listLIZLLL = AbstractC1012170cRj.LIZLLL(jSONObject);
                        if (listLIZLLL == null) {
                            final C1002650cCN c1002650cCNLIZ = C1002630cCL.LIZ(jSONObject);
                            c1002610cCJ = new InterfaceC1002590cCH(i, str, c1002650cCNLIZ) { // from class: X.0cCG
                                public final int LIZ;

                                {
                                    this.LIZ = i;
                                }
                            };
                        } else {
                            List listLIZIZ = AbstractC1012170cRj.LIZIZ(listLIZLLL);
                            c1002610cCJ = new C1002610cCJ(i, str, C1002630cCL.LIZ(jSONObject), listLIZLLL, listLIZIZ, AbstractC1012170cRj.LIZJ(listLIZIZ, jSONObject));
                        }
                        arrayList.add(c1002610cCJ);
                    }
                }
                i++;
            }
            return new C1002620cCK(Collections.unmodifiableList(arrayList));
        }
    }, new AbstractC1012170cRj() { // from class: X.0c8M
        @Override // X.InterfaceC1000240c8U
        public final IAdTranslatableData LIZ(AwemeRawAd awemeRawAd) {
            InterfaceC997630c4H c997660c4K;
            Map<String, CardStruct> cardInfos = awemeRawAd.getCardInfos();
            if (cardInfos == null || !(!cardInfos.isEmpty())) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, CardStruct> entry : cardInfos.entrySet()) {
                String key = entry.getKey();
                JSONObject cardData = entry.getValue().getCardData();
                if (cardData != null) {
                    List listLIZLLL = AbstractC1012170cRj.LIZLLL(cardData);
                    if (listLIZLLL == null) {
                        c997660c4K = new C997640c4I(key, cardData);
                    } else {
                        List listLIZIZ = AbstractC1012170cRj.LIZIZ(listLIZLLL);
                        c997660c4K = new C997660c4K(key, cardData, listLIZLLL, listLIZIZ, AbstractC1012170cRj.LIZJ(listLIZIZ, cardData));
                    }
                    arrayList.add(c997660c4K);
                }
            }
            return new C997620c4G(Collections.unmodifiableList(arrayList));
        }
    }, new AbstractC1012170cRj() { // from class: X.0c8N
        @Override // X.InterfaceC1000240c8U
        public final IAdTranslatableData LIZ(AwemeRawAd awemeRawAd) {
            List listLIZLLL;
            JSONObject frontendData = awemeRawAd.getFrontendData();
            if (frontendData == null || (listLIZLLL = AbstractC1012170cRj.LIZLLL(frontendData)) == null) {
                return null;
            }
            List listLIZIZ = AbstractC1012170cRj.LIZIZ(listLIZLLL);
            return new C997700c4O(frontendData, listLIZLLL, listLIZIZ, AbstractC1012170cRj.LIZJ(listLIZIZ, frontendData));
        }
    });

    @Override // X.InterfaceC1000240c8U
    public final IAdTranslatableData LIZ(AwemeRawAd awemeRawAd) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC1000240c8U> it2 = LIZ.iterator();
        while (it2.hasNext()) {
            IAdTranslatableData iAdTranslatableDataLIZ = it2.next().LIZ(awemeRawAd);
            if (iAdTranslatableDataLIZ != null) {
                arrayList.add(iAdTranslatableDataLIZ);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        return new C997740c4S(arrayList);
    }
}

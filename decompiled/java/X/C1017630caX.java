package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0caX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017630caX {
    public static final List<InterfaceC1017100cZg> LIZ = C1697810uHb.LJIIJJI(new AbstractC1017610caV() { // from class: X.0caW
        @Override // X.InterfaceC1017100cZg
        public final boolean LIZ(AwemeRawAd awemeRawAd) {
            Map<String, AnoleComponentModel> map;
            Collection<AnoleComponentModel> collectionValues;
            AnoleModel anoleModel = awemeRawAd.getAnoleModel();
            if (anoleModel != null && (map = anoleModel.components) != null && (collectionValues = map.values()) != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    Map<String, ? extends Object> map2 = ((AnoleComponentModel) it2.next()).data;
                    if (map2 != null) {
                        arrayList.add(map2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (AbstractC1017610caV.LIZIZ(it3.next())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }, new AbstractC1017610caV() { // from class: X.0caY
        @Override // X.InterfaceC1017100cZg
        public final boolean LIZ(AwemeRawAd awemeRawAd) {
            List<String> list;
            AwemePlayFunModel playFunModel = awemeRawAd.getPlayFunModel();
            if (playFunModel != null) {
                list = playFunModel.translationFields;
            } else {
                list = null;
            }
            return AbstractC1017610caV.LIZJ(list);
        }
    }, new AbstractC1017610caV() { // from class: X.0caU
        @Override // X.InterfaceC1017100cZg
        public final boolean LIZ(AwemeRawAd awemeRawAd) {
            Map<String, CardStruct> cardInfos = awemeRawAd.getCardInfos();
            if (cardInfos != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<Map.Entry<String, CardStruct>> it2 = cardInfos.entrySet().iterator();
                while (it2.hasNext()) {
                    Object rawCardData = it2.next().getValue().getRawCardData();
                    if (rawCardData != null) {
                        arrayList.add(rawCardData);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (AbstractC1017610caV.LIZIZ(it3.next())) {
                            return true;
                        }
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }, new AbstractC1017610caV() { // from class: X.0caZ
        @Override // X.InterfaceC1017100cZg
        public final boolean LIZ(AwemeRawAd awemeRawAd) {
            Object rawFrontendData = awemeRawAd.getRawFrontendData();
            if (rawFrontendData == null) {
                return false;
            }
            return AbstractC1017610caV.LIZIZ(rawFrontendData);
        }
    });
}

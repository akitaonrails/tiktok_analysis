package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C711080Rus extends C09AY implements Function1<C711340RvI, Boolean> {
    public C711080Rus() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C711340RvI c711340RvI) {
        CardInsertInfo cardInsertInfo;
        Aweme aweme;
        CardInsertInfo cardInsertInfo2;
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        C711340RvI c711340RvI2 = c711340RvI;
        C0S0L.LIZ.getClass();
        CardInsertInfo cardInsertInfo3 = c711340RvI2.LIZ.getCardInsertInfo();
        boolean z = true;
        if ((cardInsertInfo3 == null || cardInsertInfo3.getCardType() != 10) && (((cardInsertInfo = c711340RvI2.LIZ.getCardInsertInfo()) == null || cardInsertInfo.getCardType() != 13) && (((aweme = c711340RvI2.LIZ) == null || (cardInsertInfo2 = aweme.getCardInsertInfo()) == null || cardInsertInfo2.getCardType() != 55 || (awemeRawAd = aweme.getAwemeRawAd()) == null || (anoleModel = awemeRawAd.getAnoleModel()) == null || (map = anoleModel.components) == null || !map.containsKey(EnumC1008920cMU.INFEED_PLAYABLE.getType())) && !C1017180cZo.LJIJI(c711340RvI2.LIZ.getAwemeRawAd()) && !C0S0L.LJ(c711340RvI2.LIZ) && !C1017180cZo.LJIL(c711340RvI2.LIZ.getAwemeRawAd())))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}

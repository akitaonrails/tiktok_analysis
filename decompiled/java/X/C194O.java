package X;

import Y.AObjectS249S0100000_32;
import android.app.Activity;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.experiment.PostPageClickPostPredictionFriendsTabDataConfig;
import com.ss.android.ugc.aweme.shortvideo.model.PublishPageResourceLoadedEvent;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.194O, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C194O extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV {
    public static final C194R LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final C05YF LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), PublishPageResourceLoadedEvent.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final Function1<Integer, Unit> LLILZIL = new AwS611S0100000_32(this, 120);

    /* JADX WARN: Type inference failed for: r0v5, types: [X.194R] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C194O.class, "publishPageResourceLoadedEvent", "getPublishPageResourceLoadedEvent()Lcom/ss/android/ugc/aweme/shortvideo/model/PublishPageResourceLoadedEvent;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C194O.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
        LLILZLL = new Object() { // from class: X.194R
        };
        LLIZLLLIL = 8;
    }

    private final PublishPageResourceLoadedEvent Z1() {
        return (PublishPageResourceLoadedEvent) this.LLILLL.getValue(this, LLIZ[0]);
    }

    public final VideoPublishEditModel bb2() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLIZ[1]);
    }

    public final double[] o2() {
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer = C1510050pOl.LIZ().getProducer("f_creation", 0);
        if (producer == null) {
            return null;
        }
        C01GW c01gw = C194P.LIZIZ;
        int i = ((PostPageClickPostPredictionFriendsTabDataConfig) c01gw.getValue()).postPageParamRange;
        Object feature = producer.getFeature("post_page_params", C1509400pNi.LIZ(i, null, false, false, false), "publish_container_prediction", (ReturnCode) null);
        int i2 = ((PostPageClickPostPredictionFriendsTabDataConfig) c01gw.getValue()).postPageClickPostRange;
        Object feature2 = producer.getFeature("post_page_click_post", C1509400pNi.LIZ(i2, null, false, false, false), "publish_container_prediction", (ReturnCode) null);
        ArrayList arrayList = new ArrayList();
        int length = C1514250pVX.LIZ.length * i;
        if (C19719512Dh.LJII(feature)) {
            Map mapLIZJ = C19719512Dh.LIZJ(feature);
            int size = length - mapLIZJ.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(Double.valueOf(0.5d));
            }
            Iterator it2 = mapLIZJ.entrySet().iterator();
            while (it2.hasNext()) {
                Double d = (Double) ((Map.Entry) it2.next()).getValue();
                if (d != null) {
                    arrayList.add(Double.valueOf(d.doubleValue()));
                }
            }
        }
        int length2 = C1514250pVX.LIZIZ.length * i2;
        if (C19719512Dh.LJII(feature2)) {
            Map mapLIZJ2 = C19719512Dh.LIZJ(feature2);
            int size2 = length2 - mapLIZJ2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList.add(Double.valueOf(0.5d));
            }
            Iterator it3 = mapLIZJ2.entrySet().iterator();
            while (it3.hasNext()) {
                Double d2 = (Double) ((Map.Entry) it3.next()).getValue();
                if (d2 != null) {
                    arrayList.add(Double.valueOf(d2.doubleValue()));
                }
            }
        }
        String[] strArr = C1514250pVX.LIZ;
        int length3 = strArr.length * i;
        String[] strArr2 = C1514250pVX.LIZIZ;
        int length4 = length3 + (strArr2.length * i2);
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("requireSize(");
        sbLIZ.append(length4);
        sbLIZ.append(") = postPageRequireKeys(");
        sbLIZ.append(strArr.length);
        sbLIZ.append(") + postPageRange:");
        sbLIZ.append(i);
        sbLIZ.append(" clickPostRequireKeys(");
        sbLIZ.append(strArr2.length);
        sbLIZ.append(") + postPageClickPostRange(");
        sbLIZ.append(i2);
        sbLIZ.append(')');
        C201955140j.LJIILL(c830690WiJ, "FriendsPreload", C2188811AlT.LIZIZ(sbLIZ));
        if (arrayList.size() >= length4) {
            return C13LP.LLFZ(arrayList);
        }
        return null;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Z1().onChange.LIZ(this, new AObjectS249S0100000_32(this.LLILZIL, 6));
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C194O(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void G2(EnumC1405070mfR enumC1405070mfR) {
        bb2().creativeModel.publishMobParams.postPagePreloadFriendsType = enumC1405070mfR.getValue();
    }

    public final boolean W1(boolean z) {
        String uid;
        if (z) {
            C1599640rjG c1599640rjG = C1599640rjG.LIZIZ;
            C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
            if (currentUser == null || (uid = currentUser.getUid()) == null) {
                uid = "";
            }
            return c1599640rjG.Nu(uid);
        }
        return C1589640rT8.LIZIZ.w2();
    }

    public final boolean X1(boolean z) {
        C19EG c19egLIZIZ;
        if (z) {
            if (C1599640rjG.LIZIZ.Vu() == null) {
                return false;
            }
        } else {
            for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
                if (abstractC1387200mCc.LIZ instanceof InterfaceC1603190roz) {
                    Activity activityLIZIZ = abstractC1387200mCc.LIZIZ();
                    if (activityLIZIZ == null || (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) == null || Hox.LLJILJIL.LIZ(c19egLIZIZ).Ki("FRIENDS_FEED") == null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void w2(boolean z) {
        C201955140j.LJIILL(C830690WiJ.LIZIZ, "FriendsPreload", "try preload friends data success.");
        G2(EnumC1405070mfR.SUCCESS);
        if (z) {
            C1599640rjG.LIZIZ.dv(null, EnumC1587000rOs.POST_PAGE, null);
        } else {
            C1589640rT8.LIZIZ.i3(EnumC1587000rOs.POST_PAGE.getScene(), "", "unknown");
        }
    }
}

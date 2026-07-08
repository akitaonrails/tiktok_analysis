package X;

import Y.ARunnableS113S0100000_13;
import android.os.Looper;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.PersonalizedFeedTabConfig;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.PersonalizedFeedTabFeatureConfig;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583140rIe {
    public static PersonalizedFeedTabFeatureConfig LIZJ;
    public static final String LIZLLL;
    public static final C1583140rIe LIZ = new C1583140rIe();
    public static final PersonalizedFeedTabFeatureConfig LIZIZ = new PersonalizedFeedTabFeatureConfig(null, null, 3, null);
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(170));
    public static final List<WeakReference<InterfaceC1583190rIj>> LJFF = new ArrayList();

    static {
        String uid;
        C0C5P.LIZJ().LJIIJJI("tab_recommended_topics", new InterfaceC304970BxP() { // from class: X.0rIg
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                C1583140rIe c1583140rIe = C1583140rIe.LIZ;
                AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(362);
                c1583140rIe.getClass();
                if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    aFwS213S0000000_24.invoke();
                } else {
                    C2487409ou.LIZJ(new ARunnableS113S0100000_13(aFwS213S0000000_24, (Function0<Unit>) 122));
                }
            }
        });
        User curUser = C0XQ7.LJFF().getCurUser();
        if (curUser == null || (uid = curUser.getUid()) == null) {
            uid = "";
        }
        LIZLLL = uid;
    }

    public static Set LIZ() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = ((ArrayList) LJFF).iterator();
        while (it2.hasNext()) {
            Object obj = ((Reference) it2.next()).get();
            if (obj != null) {
                linkedHashSet.add(obj);
            }
        }
        int size = linkedHashSet.size();
        ArrayList arrayList = (ArrayList) LJFF;
        if (size != arrayList.size()) {
            arrayList.clear();
            for (Object obj2 : linkedHashSet) {
                ((ArrayList) LJFF).add(new WeakReference(obj2));
            }
        }
        return linkedHashSet;
    }

    public static PersonalizedFeedTabFeatureConfig LIZIZ() {
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (!Intrinsics.LJFF(curUser != null ? curUser.getUid() : null, LIZLLL)) {
            return LIZIZ;
        }
        PersonalizedFeedTabFeatureConfig personalizedFeedTabFeatureConfig = LIZJ;
        if (personalizedFeedTabFeatureConfig != null) {
            return personalizedFeedTabFeatureConfig;
        }
        PersonalizedFeedTabFeatureConfig personalizedFeedTabFeatureConfigLIZJ = LIZJ(true);
        LIZJ = personalizedFeedTabFeatureConfigLIZJ;
        return personalizedFeedTabFeatureConfigLIZJ;
    }

    public static PersonalizedFeedTabFeatureConfig LIZJ(boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PersonalizedFeedTabFeatureConfig personalizedFeedTabFeatureConfig = LIZIZ;
        PersonalizedFeedTabFeatureConfig personalizedFeedTabFeatureConfig2 = (PersonalizedFeedTabFeatureConfig) c0c64LJIILLIIL.LJJII(PersonalizedFeedTabFeatureConfig.class, personalizedFeedTabFeatureConfig, "tab_recommended_topics", false);
        if (personalizedFeedTabFeatureConfig2 != null) {
            String str = personalizedFeedTabFeatureConfig2.dataSource;
            if (str != null) {
                int length = str.length();
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (str.charAt(i) == '/') {
                        i++;
                    } else {
                        str.substring(i);
                        break;
                    }
                }
            }
            for (PersonalizedFeedTabConfig personalizedFeedTabConfig : personalizedFeedTabFeatureConfig2.tabs) {
                LIZ.getClass();
                personalizedFeedTabConfig.enableRedDot = ((Keva) LJ.getValue()).getBoolean("pad_personalized_enable_red_dot_topic_id_" + personalizedFeedTabConfig.topicFeedId, true);
                linkedHashMap.put(Integer.valueOf(personalizedFeedTabConfig.topicFeedId), Boolean.valueOf(personalizedFeedTabConfig.enableRedDot));
            }
            personalizedFeedTabFeatureConfig = personalizedFeedTabFeatureConfig2;
        }
        if (z) {
            ((Keva) LJ.getValue()).clear();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                ((Keva) LJ.getValue()).storeBoolean("pad_personalized_enable_red_dot_topic_id_" + ((Number) entry.getKey()).intValue(), ((Boolean) entry.getValue()).booleanValue());
            }
        }
        return personalizedFeedTabFeatureConfig;
    }
}

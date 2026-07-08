package X;

import android.os.Looper;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.experiment.TopicFeedTabConfig;
import com.ss.android.ugc.aweme.experiment.TopicFeedTabFeatureConfig;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583100rIa {
    public static final C1583100rIa LIZ = new C1583100rIa();
    public static final TopicFeedTabFeatureConfig LIZIZ;
    public static final TopicFeedTabConfig LIZJ;
    public static TopicFeedTabFeatureConfig LIZLLL;
    public static final List<WeakReference<InterfaceC1583090rIZ>> LJ;
    public static final boolean LJFF;
    public static final int LJI;

    static {
        TopicFeedTabFeatureConfig topicFeedTabFeatureConfig = new TopicFeedTabFeatureConfig(null, 1, null);
        LIZIZ = topicFeedTabFeatureConfig;
        LIZJ = new TopicFeedTabConfig(false, 0, "", "", "");
        LJ = new ArrayList();
        TopicFeedTabFeatureConfig topicFeedTabFeatureConfig2 = LIZLLL;
        if (topicFeedTabFeatureConfig2 == null) {
            topicFeedTabFeatureConfig2 = (TopicFeedTabFeatureConfig) SettingsManager.LIZLLL().LJIIIIZZ("topic_tab_config", TopicFeedTabFeatureConfig.class, topicFeedTabFeatureConfig);
            if (topicFeedTabFeatureConfig2 == null) {
                topicFeedTabFeatureConfig2 = topicFeedTabFeatureConfig;
            }
            LIZLLL = topicFeedTabFeatureConfig2;
        }
        LJFF = !topicFeedTabFeatureConfig2.tabs.isEmpty();
        TopicFeedTabFeatureConfig topicFeedTabFeatureConfig3 = LIZLLL;
        if (topicFeedTabFeatureConfig3 == null) {
            TopicFeedTabFeatureConfig topicFeedTabFeatureConfig4 = (TopicFeedTabFeatureConfig) SettingsManager.LIZLLL().LJIIIIZZ("topic_tab_config", TopicFeedTabFeatureConfig.class, topicFeedTabFeatureConfig);
            if (topicFeedTabFeatureConfig4 != null) {
                topicFeedTabFeatureConfig = topicFeedTabFeatureConfig4;
            }
            LIZLLL = topicFeedTabFeatureConfig;
            topicFeedTabFeatureConfig3 = topicFeedTabFeatureConfig;
        }
        LJI = topicFeedTabFeatureConfig3.tabs.size();
        C0C5P.LIZJ().LJIIJJI("topic_tab_config", new InterfaceC304970BxP() { // from class: X.0rIb
            @Override // X.InterfaceC304970BxP
            public final void LIZ() {
                C1583100rIa c1583100rIa = C1583100rIa.LIZ;
                AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(133);
                c1583100rIa.getClass();
                if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                    aFwS213S0000000_24.invoke();
                } else {
                    C2487409ou.LIZJ(new RunnableC990910btR(aFwS213S0000000_24));
                }
            }
        });
    }

    public static Set LIZ() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = ((ArrayList) LJ).iterator();
        while (it2.hasNext()) {
            Object obj = ((Reference) it2.next()).get();
            if (obj != null) {
                linkedHashSet.add(obj);
            }
        }
        int size = linkedHashSet.size();
        ArrayList arrayList = (ArrayList) LJ;
        if (size != arrayList.size()) {
            arrayList.clear();
            for (Object obj2 : linkedHashSet) {
                ((ArrayList) LJ).add(new WeakReference(obj2));
            }
        }
        return linkedHashSet;
    }

    public static TopicFeedTabConfig LIZIZ(int i) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(i);
        TopicFeedTabFeatureConfig topicFeedTabFeatureConfig = LIZLLL;
        if (topicFeedTabFeatureConfig == null) {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            TopicFeedTabFeatureConfig topicFeedTabFeatureConfig2 = LIZIZ;
            topicFeedTabFeatureConfig = (TopicFeedTabFeatureConfig) settingsManagerLIZLLL.LJIIIIZZ("topic_tab_config", TopicFeedTabFeatureConfig.class, topicFeedTabFeatureConfig2);
            if (topicFeedTabFeatureConfig == null) {
                topicFeedTabFeatureConfig = topicFeedTabFeatureConfig2;
            }
            LIZLLL = topicFeedTabFeatureConfig;
        }
        TopicFeedTabConfig topicFeedTabConfig = (TopicFeedTabConfig) C13LP.LJJJLZIJ(i, topicFeedTabFeatureConfig.tabs);
        if (topicFeedTabConfig != null) {
            boolValueOf = Boolean.valueOf(topicFeedTabConfig.LIZ);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        TopicFeedTabFeatureConfig topicFeedTabFeatureConfig3 = LIZLLL;
        if (topicFeedTabFeatureConfig3 == null) {
            SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
            TopicFeedTabFeatureConfig topicFeedTabFeatureConfig4 = LIZIZ;
            topicFeedTabFeatureConfig3 = (TopicFeedTabFeatureConfig) settingsManagerLIZLLL2.LJIIIIZZ("topic_tab_config", TopicFeedTabFeatureConfig.class, topicFeedTabFeatureConfig4);
            if (topicFeedTabFeatureConfig3 == null) {
                topicFeedTabFeatureConfig3 = topicFeedTabFeatureConfig4;
            }
            LIZLLL = topicFeedTabFeatureConfig3;
        }
        TopicFeedTabConfig topicFeedTabConfig2 = (TopicFeedTabConfig) C13LP.LJJJLZIJ(i, topicFeedTabFeatureConfig3.tabs);
        if (topicFeedTabConfig2 == null) {
            return LIZJ;
        }
        return topicFeedTabConfig2;
    }
}

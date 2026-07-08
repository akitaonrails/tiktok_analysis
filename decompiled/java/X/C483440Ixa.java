package X;

import com.bytedance.android.livesdk.livesetting.other.LiveSurveyFeaturesSetting;
import com.bytedance.keva.Keva;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.0Ixa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C483440Ixa implements InterfaceC483400IxW {
    public static long LIZLLL;
    public static long LJFF;
    public static final C483440Ixa LIZ = new C483440Ixa();
    public static final Set<String> LIZIZ = new LinkedHashSet();
    public static final Set<String> LIZJ = new LinkedHashSet();
    public static final Set<String> LJ = new LinkedHashSet();

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC483400IxW
    public final void LIZ() {
        C483390IxV c483390IxV = C483390IxV.LIZ;
        Keva keva = C483390IxV.LIZIZ;
        if (keva == null) {
            return;
        }
        Set<String> stringSet = keva.getStringSet("fyp_aweme_set_since_last_survey", new LinkedHashSet());
        int size = stringSet.size();
        LiveSurveyFeaturesSetting liveSurveyFeaturesSetting = LiveSurveyFeaturesSetting.INSTANCE;
        if (size <= liveSurveyFeaturesSetting.maxFypAwemeCount()) {
            Set<String> set = LIZIZ;
            stringSet.addAll(set);
            keva.storeStringSet("fyp_aweme_set_since_last_survey", stringSet);
            set.clear();
        }
        Set<String> stringSet2 = keva.getStringSet("fyp_live_card_set_since_last_survey", new LinkedHashSet());
        if (stringSet2.size() <= liveSurveyFeaturesSetting.maxFypLiveCardCount()) {
            Set<String> set2 = LIZJ;
            stringSet2.addAll(set2);
            keva.storeStringSet("fyp_live_card_set_since_last_survey", stringSet2);
            set2.clear();
        }
        long j = keva.getLong("fyp_live_card_duration_since_last_survey", 0L);
        if (j <= liveSurveyFeaturesSetting.maxFypLiveCardDuration()) {
            keva.storeLong("fyp_live_card_duration_since_last_survey", j + LIZLLL);
            LIZLLL = 0L;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC483400IxW
    public final void LJI() {
        C483390IxV c483390IxV = C483390IxV.LIZ;
        Keva keva = C483390IxV.LIZIZ;
        if (keva == null) {
            return;
        }
        Set<String> stringSet = keva.getStringSet("live_room_set_since_last_survey", new LinkedHashSet());
        int size = stringSet.size();
        LiveSurveyFeaturesSetting liveSurveyFeaturesSetting = LiveSurveyFeaturesSetting.INSTANCE;
        if (size <= liveSurveyFeaturesSetting.maxLiveRoomCount()) {
            Set<String> set = LJ;
            stringSet.addAll(set);
            keva.storeStringSet("live_room_set_since_last_survey", stringSet);
            set.clear();
        }
        long j = keva.getLong("live_room_watch_duration_since_last_survey", 0L);
        if (j <= liveSurveyFeaturesSetting.maxLiveRoomDuration()) {
            keva.storeLong("live_room_watch_duration_since_last_survey", j + LJFF);
            LJFF = 0L;
        }
    }

    @Override // X.InterfaceC483400IxW
    public final void LIZIZ(String str) {
        LIZIZ.add(str);
    }

    @Override // X.InterfaceC483400IxW
    public final void LIZLLL(String str) {
        LIZJ.add(str);
    }

    @Override // X.InterfaceC483400IxW
    public final void LJ(long j) {
        LJFF += j;
    }

    @Override // X.InterfaceC483400IxW
    public final void LJFF(long j) {
        LJ.add(String.valueOf(j));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC483400IxW
    public final Object getFeature(String str) {
        Set<String> linkedHashSet;
        Set<String> linkedHashSet2;
        Set<String> linkedHashSet3;
        long j = 0;
        switch (str.hashCode()) {
            case -2146742958:
                if (!str.equals("app_fyp_live_card_count_since_last_survey")) {
                    return null;
                }
                C483390IxV c483390IxV = C483390IxV.LIZ;
                Keva keva = C483390IxV.LIZIZ;
                if (keva == null || (linkedHashSet3 = keva.getStringSet("fyp_live_card_set_since_last_survey", new LinkedHashSet())) == null) {
                    linkedHashSet3 = new LinkedHashSet<>();
                }
                linkedHashSet3.addAll(LIZJ);
                return Integer.valueOf(linkedHashSet3.size());
            case -1440859745:
                if (!str.equals("app_fyp_card_count_since_last_survey")) {
                    return null;
                }
                C483390IxV c483390IxV2 = C483390IxV.LIZ;
                Keva keva2 = C483390IxV.LIZIZ;
                if (keva2 == null || (linkedHashSet2 = keva2.getStringSet("fyp_aweme_set_since_last_survey", new LinkedHashSet())) == null) {
                    linkedHashSet2 = new LinkedHashSet<>();
                }
                linkedHashSet2.addAll(LIZIZ);
                return Integer.valueOf(linkedHashSet2.size());
            case -267651126:
                if (!str.equals("app_inner_watch_duration_since_last_survey")) {
                    return null;
                }
                C483390IxV c483390IxV3 = C483390IxV.LIZ;
                Keva keva3 = C483390IxV.LIZIZ;
                if (keva3 != null) {
                    j = keva3.getLong("live_room_watch_duration_since_last_survey", 0L);
                }
                return Long.valueOf(j + LJFF);
            case 1004901815:
                if (!str.equals("app_inner_watch_count_since_last_survey")) {
                    return null;
                }
                C483390IxV c483390IxV4 = C483390IxV.LIZ;
                Keva keva4 = C483390IxV.LIZIZ;
                if (keva4 == null || (linkedHashSet = keva4.getStringSet("live_room_set_since_last_survey", new LinkedHashSet())) == null) {
                    linkedHashSet = new LinkedHashSet<>();
                }
                linkedHashSet.addAll(LJ);
                return Integer.valueOf(linkedHashSet.size());
            case 1242687619:
                if (!str.equals("app_fyp_watch_duration_since_last_survey")) {
                    return null;
                }
                C483390IxV c483390IxV5 = C483390IxV.LIZ;
                Keva keva5 = C483390IxV.LIZIZ;
                if (keva5 != null) {
                    j = keva5.getLong("fyp_live_card_duration_since_last_survey", 0L);
                }
                return Long.valueOf(j + LIZLLL);
            default:
                return null;
        }
    }

    @Override // X.InterfaceC483400IxW
    public final void LIZJ(long j, boolean z) {
        LIZLLL += j;
        Keva keva = C483390IxV.LIZIZ;
        if (keva != null && z) {
            keva.storeLong("fyp_live_card_duration_since_last_survey", keva.getLong("fyp_live_card_duration_since_last_survey", 0L) + LIZLLL);
            LIZLLL = 0L;
        }
    }
}

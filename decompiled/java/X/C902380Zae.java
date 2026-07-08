package X;

import Y.AfS183S0100000_14;
import Y.AfS47S1100000_14;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget;
import com.ss.android.ugc.aweme.social.service.ICelebrationDataService;
import com.ss.android.ugc.aweme.social.sticker.api.service.IStorySocialEventStickerService;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventStickerData;
import com.ss.android.ugc.aweme.story.friendanniversary.StoryFriendAnniversaryService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS130S1200000_14;
import kotlin.jvm.internal.AwS223S0300000_14;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902380Zae implements InterfaceC902370Zad {
    public static final Map<String, C902410Zah> LJII = Collections.synchronizedMap(new LinkedHashMap());
    public static final Set<String> LJIIIIZZ = Collections.synchronizedSet(new LinkedHashSet());
    public static final Map<String, InterfaceC332260D0u<List<String>>> LJIIIZ = Collections.synchronizedMap(new LinkedHashMap());
    public final String LIZ;
    public volatile boolean LIZJ;
    public Function0<Unit> LIZLLL;
    public Function0<Unit> LJ;
    public final List<InterfaceC902360Zac> LIZIZ = Collections.synchronizedList(new ArrayList());
    public final Map<String, Function0<Unit>> LJFF = Collections.synchronizedMap(new LinkedHashMap());
    public final Map<String, Boolean> LJI = Collections.synchronizedMap(new LinkedHashMap());

    public final InterfaceC332260D0u LJFF() {
        List<String> listLIZIZ;
        String str = this.LIZ;
        Map<String, InterfaceC332260D0u<List<String>>> map = LJIIIZ;
        InterfaceC332260D0u<List<String>> interfaceC332260D0u = map.get(str);
        if (interfaceC332260D0u != null) {
            return interfaceC332260D0u;
        }
        C902410Zah c902410Zah = LJII.get(str);
        if (c902410Zah == null || (listLIZIZ = c902410Zah.LIZIZ()) == null) {
            listLIZIZ = C13BV.INSTANCE;
        }
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(listLIZIZ);
        map.put(str, c2252321DDqLIZ);
        return c2252321DDqLIZ;
    }

    public C902380Zae(String str) {
        this.LIZ = str;
    }

    public static final long LIZIZ(RelationshipCelebrationTarget relationshipCelebrationTarget) {
        C902390Zaf.LIZ.getClass();
        return C902390Zaf.LIZIZ(relationshipCelebrationTarget);
    }

    public static final StorySocialEventStickerData LJ(String str) {
        C902390Zaf.LIZ.getClass();
        return C902390Zaf.LIZLLL(str);
    }

    public static final void LJIIJ(String str) {
        if (str == null) {
            return;
        }
        C902390Zaf.LIZ.getClass();
        C902390Zaf.LJFF.remove(str);
    }

    public final RelationshipCelebrationTarget LIZJ(String str) {
        if (str == null) {
            return null;
        }
        C902410Zah c902410Zah = LJII.get(this.LIZ);
        if (c902410Zah == null) {
            return null;
        }
        return c902410Zah.LIZ(str);
    }

    public final RelationshipCelebrationTarget LIZLLL(String str) {
        boolean zContains;
        Long lValueOf;
        C0Y8T c0y8tLJ;
        new C902320ZaY();
        if (!C902320ZaY.LIZ(1, str)) {
            return null;
        }
        C902410Zah c902410Zah = LJII.get(this.LIZ);
        if (c902410Zah == null) {
            return null;
        }
        synchronized (c902410Zah.LIZIZ) {
            try {
                zContains = ((List) c902410Zah.LJ.getValue()).contains(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hint check: ");
        sbLIZ.append(zContains);
        sbLIZ.append("; unread count: ");
        C0Y8T c0y8tLJ2 = C0YNP.LIZIZ(str).LJ();
        if (c0y8tLJ2 != null) {
            lValueOf = Long.valueOf(c0y8tLJ2.getUnreadCount());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!zContains || (c0y8tLJ = C0YNP.LIZIZ(str).LJ()) == null || c0y8tLJ.getUnreadCount() != 0) {
            return null;
        }
        return c902410Zah.LIZ(str);
    }

    public final void LJIIIZ(String str) {
        C902410Zah c902410Zah = LJII.get(this.LIZ);
        if (c902410Zah != null) {
            long jLJII = C0YNP.LJII(str);
            synchronized (c902410Zah.LIZIZ) {
                try {
                    ((List) c902410Zah.LJ.getValue()).remove(str);
                    if (jLJII != -1) {
                        ((Map) c902410Zah.LIZJ.getValue()).remove(String.valueOf(jLJII));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public final void LJIIJJI(List<RelationshipCelebrationTarget> list) {
        String str = this.LIZ;
        if (str == null) {
            return;
        }
        Map<String, C902410Zah> map = LJII;
        C902410Zah c902410Zah = map.get(str);
        if (c902410Zah == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(list);
            c902410Zah = new C902410Zah(arrayList);
            map.put(this.LIZ, c902410Zah);
        }
        synchronized (c902410Zah.LIZIZ) {
            try {
                for (RelationshipCelebrationTarget relationshipCelebrationTarget : list) {
                    if (!c902410Zah.LIZ.contains(relationshipCelebrationTarget)) {
                        c902410Zah.LIZ.add(relationshipCelebrationTarget);
                        String str2 = relationshipCelebrationTarget.celebratingUserId;
                        if (str2 != null) {
                            ((Map) c902410Zah.LIZJ.getValue()).put(str2, relationshipCelebrationTarget);
                            ((List) c902410Zah.LJ.getValue()).add(C0YNP.LJ(str2));
                        }
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        for (RelationshipCelebrationTarget relationshipCelebrationTarget2 : list) {
            InterfaceC876950Yaj interfaceC876950YajLIZIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ);
            String str3 = relationshipCelebrationTarget2.celebratingUserId;
            if (str3 == null) {
                str3 = "";
            }
            interfaceC876950YajLIZIZ.LJJIIJ(str3, new C914090ZtX(0));
        }
        List<String> listLIZIZ = c902410Zah.LIZIZ();
        InterfaceC332260D0u<List<String>> interfaceC332260D0uRemove = LJIIIZ.remove(this.LIZ);
        if (interfaceC332260D0uRemove != null) {
            interfaceC332260D0uRemove.setValue(listLIZIZ);
        }
        Iterator<InterfaceC902360Zac> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().U();
        }
        if (C0BWZ.LIZ()) {
            for (String str4 : listLIZIZ) {
                LJII(str4, c902410Zah);
                this.LJI.put(str4, Boolean.TRUE);
                Function0<Unit> function0Remove = this.LJFF.remove(str4);
                if (function0Remove != null) {
                    function0Remove.invoke();
                }
            }
            return;
        }
        for (RelationshipCelebrationTarget relationshipCelebrationTarget3 : list) {
            IStorySocialEventStickerService iStorySocialEventStickerService = (IStorySocialEventStickerService) PluggableExtentionKt.pluggableSpi$default(IStorySocialEventStickerService.class, false, false, false, 14, null);
            if (iStorySocialEventStickerService != null) {
                String str5 = relationshipCelebrationTarget3.celebratingUserId;
                C844470XAv.LIZ.getClass();
                Context contextLIZ = C844470XAv.LIZ();
                C902390Zaf.LIZ.getClass();
                Pair pairLIZIZ = iStorySocialEventStickerService.LIZIZ(contextLIZ, Long.valueOf(C902390Zaf.LIZIZ(relationshipCelebrationTarget3)), str5, null);
                if (pairLIZIZ != null) {
                    InterfaceC1728106pj interfaceC1728106pj = (InterfaceC1728106pj) pairLIZIZ.getSecond();
                    if (pairLIZIZ != null && ((Boolean) pairLIZIZ.getFirst()).booleanValue() && interfaceC1728106pj != null) {
                        interfaceC1728106pj.LIZJ(new AwS388S0200000_22(this, relationshipCelebrationTarget3, 53));
                        interfaceC1728106pj.LIZIZ(null, new AwS223S0300000_14(relationshipCelebrationTarget3, c902410Zah, this, 11));
                    }
                }
            }
        }
    }

    public final void LJIIL(String str) {
        this.LJFF.remove(str);
    }

    public static void LJII(String str, C902410Zah c902410Zah) {
        StoryFriendAnniversaryService.LIZ.getClass();
        StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ = C902340Zaa.LIZ();
        if (storyFriendAnniversaryServiceLIZ != null && storyFriendAnniversaryServiceLIZ.LIZ(C461720I8s.LIZIZ()) != null) {
            new C902320ZaY();
            if (C902320ZaY.LIZ(2, str)) {
                C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
                RelationshipCelebrationTarget relationshipCelebrationTargetLIZ = c902410Zah.LIZ(str);
                if (relationshipCelebrationTargetLIZ == null) {
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                C902390Zaf.LIZ.getClass();
                if (C902390Zaf.LIZ("conversation_pop_up_", str, relationshipCelebrationTargetLIZ)) {
                    C0YNP.LIZIZ(str).LJIJI().LLJLLL(str);
                    return;
                }
                C0YNP.LJIIIIZZ(str, "story_anniversary_refresh", String.valueOf(jCurrentTimeMillis));
                StoryFriendAnniversaryService storyFriendAnniversaryServiceLIZ2 = C902340Zaa.LIZ();
                if (storyFriendAnniversaryServiceLIZ2 != null && storyFriendAnniversaryServiceLIZ2.LIZIZ() != null) {
                    C902600Zb0.LIZIZ(str, new AwS130S1200000_14(c0y8tLIZ, str, c902410Zah, 1));
                }
            }
        }
    }

    public final void LIZ(String str, AwS558S0100000_14 awS558S0100000_14) {
        if (str == null) {
            return;
        }
        if (LJ(str) != null) {
            awS558S0100000_14.invoke();
        } else {
            C902390Zaf.LIZ.getClass();
            C902390Zaf.LJFF.put(str, awS558S0100000_14);
        }
    }

    public final void LJI(Function0<Unit> function0, Function0<Unit> function02) {
        C11NZ c11nzLIZIZ;
        this.LIZLLL = function0;
        this.LJ = function02;
        if (!this.LIZJ) {
            this.LIZJ = true;
            C902390Zaf c902390Zaf = C902390Zaf.LIZ;
            String strLIZIZ = C461720I8s.LIZIZ();
            AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 1123);
            AwS558S0100000_14 awS558S0100000_142 = new AwS558S0100000_14(this, 1124);
            c902390Zaf.getClass();
            InterfaceC420801kM interfaceC420801kMLJJLL = null;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C902400Zag(strLIZIZ, awS558S0100000_14, null), 3);
            ICelebrationDataService iCelebrationDataService = (ICelebrationDataService) PluggableExtentionKt.pluggableSpi$default(ICelebrationDataService.class, false, false, false, 14, null);
            if (iCelebrationDataService != null && (c11nzLIZIZ = iCelebrationDataService.LIZIZ()) != null) {
                interfaceC420801kMLJJLL = c11nzLIZIZ.LJJJLZIJ(C11S5.LIZ()).LJL(C11S5.LIZ()).LJJLL(new AfS47S1100000_14(awS558S0100000_142, strLIZIZ, 3), new AfS183S0100000_14(awS558S0100000_142, 0));
            }
            ((ArrayList) C902390Zaf.LJIIIIZZ).add(interfaceC420801kMLJJLL);
        }
    }

    public final void LJIIIIZZ(String str, Function0<Unit> function0) {
        if (Intrinsics.LJFF(this.LJI.get(str), Boolean.TRUE)) {
            function0.invoke();
        } else {
            this.LJFF.put(str, function0);
        }
    }
}

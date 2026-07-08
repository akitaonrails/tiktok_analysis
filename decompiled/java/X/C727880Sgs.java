package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.story.userstory.mine.MineUserStoryFetcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sgs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727880Sgs extends C0O4P<Aweme> implements InterfaceC728200ShO {
    public final MineUserStoryFetcher LJ;
    public final C01GW LJFF;

    public final boolean LJIIIZ() {
        return ((Boolean) this.LJFF.getValue()).booleanValue();
    }

    @Override // X.InterfaceC728200ShO
    public final MineUserStoryFetcher LIZJ() {
        return this.LJ;
    }

    public C727880Sgs(MineUserStoryFetcher mineUserStoryFetcher) {
        super(0, 3);
        this.LJ = mineUserStoryFetcher;
        this.LJFF = C452501pT.LIZIZ(new C727900Sgu());
    }

    @Override // X.C0O72, X.C0O71
    public final List<Aweme> LIZIZ(List<? extends String> list) {
        if (!LJIIIZ()) {
            return null;
        }
        return super.LIZIZ(list);
    }

    @Override // X.C0O72, X.C0O71
    /* JADX INFO: renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final Aweme get(String str) {
        if (!LJIIIZ()) {
            return null;
        }
        if (C729510SjV.LJIILJJIL(str)) {
            this.LJ.getClass();
            return MineUserStoryFetcher.LIZ();
        }
        return LIZLLL(str);
    }

    public final void LJIIIIZZ(String str, UserStory userStory) {
        UserStory userStory2;
        List<Aweme> stories;
        Story story;
        Aweme aweme = get(str);
        List<String> unReadStoryAids = null;
        if (aweme != null) {
            userStory2 = aweme.getUserStory();
        } else {
            userStory2 = null;
        }
        ArrayList arrayList = new ArrayList();
        if (userStory != null) {
            List<String> unReadStoryAids2 = userStory.getUnReadStoryAids();
            if (unReadStoryAids2 != null) {
                int i = 0;
                for (String str2 : unReadStoryAids2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        if (userStory2 != null && (stories = userStory2.getStories()) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            for (Aweme aweme2 : stories) {
                                if (Intrinsics.LJFF(aweme2.getAid(), str2)) {
                                    arrayList2.add(aweme2);
                                }
                            }
                            if (arrayList2 != null && !arrayList2.isEmpty() && (story = ((Aweme) ListProtector.get(arrayList2, 0)).getStory()) != null && story.viewed) {
                                arrayList.add(str2);
                            }
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            List<String> unReadStoryAids3 = userStory.getUnReadStoryAids();
            if (unReadStoryAids3 != null) {
                unReadStoryAids3.removeAll(arrayList);
            }
            if (userStory.getUnReadStoryAids() == null && userStory != null) {
                if (userStory2 != null) {
                    unReadStoryAids = userStory2.getUnReadStoryAids();
                }
                userStory.setUnReadStoryAids(unReadStoryAids);
            }
        }
    }

    @Override // X.C0O72, X.C0O71
    public final C0O4U<Aweme> replace(String str, Aweme aweme) {
        if (!LJIIIZ()) {
            return null;
        }
        return super.replace(str, aweme);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x00ef A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.ss.android.ugc.aweme.feed.model.Aweme r20, java.lang.String r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C727880Sgs.LJIIJ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, boolean):void");
    }

    @Override // X.InterfaceC728200ShO
    public final void LIZ(List list, String str, List list2, boolean z) {
        if (!LJIIIZ()) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            LJIIJ((Aweme) it2.next(), str, z);
        }
        C727890Sgt c727890Sgt = C727890Sgt.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tried update ");
        sbLIZ.append(list.size());
        sbLIZ.append(" in cache");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c727890Sgt.getClass();
        C727890Sgt.LJ("UserStoryCache", strLIZIZ);
    }
}

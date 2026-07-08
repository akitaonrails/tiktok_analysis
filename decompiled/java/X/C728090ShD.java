package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ShD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728090ShD implements InterfaceC728100ShE {
    public static final C728090ShD LIZ = new C728090ShD();

    public static InterfaceC728100ShE LJIIJ() {
        return C1601110rld.LIZ() ? C728130ShH.LIZ : new InterfaceC728100ShE() { // from class: X.0OoV
            @Override // X.InterfaceC728100ShE
            public final void LIZ(List list, String str, List list2, boolean z) {
            }

            @Override // X.InterfaceC728100ShE
            public final void LIZIZ(Aweme aweme, String str, boolean z) {
            }

            @Override // X.InterfaceC728100ShE
            public final void LIZJ(String str, String str2) {
            }

            @Override // X.InterfaceC728100ShE
            public final void LJ(String str, UserStory userStory) {
            }

            @Override // X.InterfaceC728100ShE
            public final void LJFF(FollowStatus followStatus) {
            }

            @Override // X.InterfaceC728100ShE
            public final void LJI(String str) {
            }

            @Override // X.InterfaceC728100ShE
            public final Aweme LJIIIZ(String str) {
                return null;
            }

            @Override // X.InterfaceC728100ShE
            public final void clear() {
            }

            @Override // X.InterfaceC728100ShE
            public final Aweme LJIIIIZZ() {
                Aweme aweme = new Aweme();
                C0XQ7.LJ();
                aweme.setAid(C0XQ7.LIZ.LJIIJ().getCurUserId());
                aweme.setUserStory(new UserStory(new ArrayList(), 1L, 0L, false, 0L, 0L, false, false, 0L, true, null, null, false, null, 0L, new UserStoryCurrentInfo(null, null, 0), false, false, new UserStoryCurrentInfo(-1, null, 0), (int) 0, false, 0L, null, false));
                return aweme;
            }

            @Override // X.InterfaceC728100ShE
            public final C11NZ<Pair<Aweme, Integer>> LJII(String str) {
                return C11NZ.LJJJJZ(new Pair(new Aweme(), 20000));
            }

            @Override // X.InterfaceC728100ShE
            public final C11NZ<Aweme> LIZLLL(String str, boolean z) {
                return C11NZ.LJJJJZ(new Aweme());
            }
        };
    }

    @Override // X.InterfaceC728100ShE
    public final Aweme LJIIIIZZ() {
        return LJIIJ().LJIIIIZZ();
    }

    @Override // X.InterfaceC728100ShE
    public final void clear() {
        LJIIJ().clear();
    }

    @Override // X.InterfaceC728100ShE
    public final void LJFF(FollowStatus followStatus) {
        LJIIJ().LJFF(followStatus);
    }

    @Override // X.InterfaceC728100ShE
    public final void LJI(String str) {
        LJIIJ().LJI(str);
    }

    @Override // X.InterfaceC728100ShE
    public final C11NZ<Pair<Aweme, Integer>> LJII(String str) {
        return LJIIJ().LJII(str);
    }

    @Override // X.InterfaceC728100ShE
    public final Aweme LJIIIZ(String str) {
        return LJIIJ().LJIIIZ(str);
    }

    @Override // X.InterfaceC728100ShE
    public final void LIZJ(String str, String str2) {
        LJIIJ().LIZJ(str, str2);
    }

    @Override // X.InterfaceC728100ShE
    public final C11NZ<Aweme> LIZLLL(String str, boolean z) {
        return LJIIJ().LIZLLL(str, z);
    }

    @Override // X.InterfaceC728100ShE
    public final void LJ(String str, UserStory userStory) {
        LJIIJ().LJ(str, userStory);
    }

    @Override // X.InterfaceC728100ShE
    public final void LIZIZ(Aweme aweme, String str, boolean z) {
        LJIIJ().LIZIZ(aweme, str, z);
    }

    @Override // X.InterfaceC728100ShE
    public final void LIZ(List list, String str, List list2, boolean z) {
        LJIIJ().LIZ(list, str, list2, z);
    }
}

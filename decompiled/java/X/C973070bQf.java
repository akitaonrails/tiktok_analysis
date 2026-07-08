package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973070bQf extends ConstraintLayout {
    public List<C973090bQh> LL;
    public final ConstraintLayout LLILLJJLI;
    public final C973090bQh LLILLL;
    public final C973090bQh LLILZ;
    public final C973090bQh LLILZIL;
    public final C973090bQh LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public final View LLJ;
    public final View LLJI;

    public final void e0() {
        for (C973090bQh c973090bQh : this.LL) {
            if (c973090bQh != null) {
                View viewFindViewById = c973090bQh.findViewById(R.id.user_info_layout_container);
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundResource(0);
                }
                c973090bQh.invalidate();
            }
        }
    }

    private final void setLeft2Right1(boolean z) {
        C19MB c19mb = new C19MB();
        c19mb.LJII(this.LLILLJJLI);
        c19mb.LJJIJ(R.id.user_info_rival_two, 0);
        int i = 8;
        c19mb.LJJIJ(R.id.user_info_rival_three, 8);
        if (z) {
            i = 0;
        }
        c19mb.LJJIJ(R.id.o2_, i);
        c19mb.LJI(R.id.user_info_rival_one, 3);
        c19mb.LJI(R.id.user_info_rival_one, 4);
        c19mb.LJI(R.id.user_info_self, 3);
        c19mb.LJI(R.id.user_info_self, 4);
        c19mb.LJIIIIZZ(R.id.user_info_self, 3, 0, 3);
        c19mb.LJIIIIZZ(R.id.user_info_self, 4, R.id.o2_, 3);
        c19mb.LJIIIIZZ(R.id.user_info_rival_one, 3, 0, 3);
        c19mb.LJIIIIZZ(R.id.user_info_rival_one, 4, 0, 4);
        e0();
        C500260Jjc.LLFFF(this.LLJ);
        C500260Jjc.LLFFF(this.LLJI);
        c19mb.LIZIZ(this.LLILLJJLI);
    }

    private final void setSplitEqual(boolean z) {
        int i;
        C19MB c19mb = new C19MB();
        c19mb.LJII(this.LLILLJJLI);
        c19mb.LJI(R.id.user_info_rival_two, 3);
        c19mb.LJI(R.id.user_info_rival_two, 4);
        c19mb.LJI(R.id.user_info_rival_two, 1);
        c19mb.LJI(R.id.user_info_rival_two, 2);
        c19mb.LJI(R.id.user_info_rival_one, 3);
        c19mb.LJI(R.id.user_info_rival_one, 4);
        c19mb.LJI(R.id.user_info_rival_one, 1);
        c19mb.LJI(R.id.user_info_rival_one, 2);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        c19mb.LJJIJ(R.id.o2_, i);
        c19mb.LJIIIIZZ(R.id.user_info_self, 3, 0, 3);
        c19mb.LJIIIIZZ(R.id.user_info_self, 4, R.id.o2_, 3);
        c19mb.LJIIIIZZ(R.id.user_info_rival_two, 3, R.id.o2_, 4);
        c19mb.LJIIIIZZ(R.id.user_info_rival_two, 4, 0, 4);
        c19mb.LJIIIIZZ(R.id.user_info_rival_two, 1, 0, 1);
        c19mb.LJIIIIZZ(R.id.user_info_rival_two, 2, R.id.o2a, 1);
        c19mb.LJIIIIZZ(R.id.user_info_rival_one, 3, 0, 3);
        c19mb.LJIIIIZZ(R.id.user_info_rival_one, 4, R.id.o2_, 3);
        c19mb.LJIIIIZZ(R.id.user_info_rival_one, 1, R.id.o2a, 2);
        c19mb.LJIIIIZZ(R.id.user_info_rival_one, 2, 0, 2);
        c19mb.LJIIIIZZ(R.id.user_info_rival_three, 3, R.id.o2_, 4);
        c19mb.LJIIIIZZ(R.id.user_info_rival_three, 4, 0, 4);
        e0();
        C500260Jjc.LLFFF(this.LLJ);
        C500260Jjc.LLFFF(this.LLJI);
        c19mb.LIZIZ(this.LLILLJJLI);
    }

    public final void setCountdown(long j) {
        for (C973090bQh c973090bQh : this.LL) {
            if (c973090bQh != null) {
                C16F5 c16f5 = c973090bQh.LLJ;
                if (c16f5 != null) {
                    c16f5.setText(C497740JfY.LJIJJ(2131841124, Long.valueOf(j)));
                }
                C16F5 c16f52 = c973090bQh.LLJI;
                if (c16f52 != null) {
                    c16f52.setText(C497740JfY.LJIJJ(2131841124, Long.valueOf(j)));
                }
            }
        }
    }

    public final void setLeft1Right2(boolean z) {
        C19MB c19mb = new C19MB();
        c19mb.LJII(this.LLILLJJLI);
        int i = 8;
        c19mb.LJJIJ(R.id.user_info_rival_two, 8);
        c19mb.LJJIJ(R.id.user_info_rival_three, 0);
        if (z) {
            i = 0;
        }
        c19mb.LJJIJ(R.id.o2_, i);
        c19mb.LJI(R.id.user_info_rival_one, 3);
        c19mb.LJI(R.id.user_info_rival_one, 4);
        c19mb.LJI(R.id.user_info_self, 3);
        c19mb.LJI(R.id.user_info_self, 4);
        c19mb.LJIIIIZZ(R.id.user_info_self, 3, 0, 3);
        c19mb.LJIIIIZZ(R.id.user_info_self, 4, 0, 4);
        c19mb.LJIIIIZZ(R.id.user_info_rival_one, 3, 0, 3);
        c19mb.LJIIIIZZ(R.id.user_info_rival_one, 4, R.id.o2_, 3);
        c19mb.LJIIIIZZ(R.id.user_info_rival_three, 3, R.id.o2_, 4);
        c19mb.LJIIIIZZ(R.id.user_info_rival_three, 4, 0, 4);
        e0();
        C500260Jjc.LLFFF(this.LLJ);
        C500260Jjc.LLFFF(this.LLJI);
        c19mb.LIZIZ(this.LLILLJJLI);
    }

    public C973070bQf(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C13BV.INSTANCE;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h88, this, true);
        this.LLILLJJLI = (ConstraintLayout) findViewById(R.id.mcj);
        C973090bQh c973090bQh = (C973090bQh) findViewById(R.id.user_info_self);
        this.LLILLL = c973090bQh;
        C973090bQh c973090bQh2 = (C973090bQh) findViewById(R.id.user_info_rival_one);
        this.LLILZ = c973090bQh2;
        C973090bQh c973090bQh3 = (C973090bQh) findViewById(R.id.user_info_rival_two);
        this.LLILZIL = c973090bQh3;
        C973090bQh c973090bQh4 = (C973090bQh) findViewById(R.id.user_info_rival_three);
        this.LLILZLL = c973090bQh4;
        this.LLIZ = findViewById(R.id.o2_);
        this.LLIZLLLIL = findViewById(R.id.o2a);
        this.LLJ = findViewById(R.id.o2b);
        this.LLJI = findViewById(R.id.o2c);
        this.LL = C1697810uHb.LJIIJJI(c973090bQh, c973090bQh2, c973090bQh3, c973090bQh4);
    }

    public final void j0(int i, int i2) {
        int i3 = i + i2;
        if (i3 <= 2) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateHostView Size,self = ");
        sbLIZ.append(i);
        sbLIZ.append(" rivalSize = ");
        sbLIZ.append(i2);
        C20441214yg.LIZIZ("MatchUserInfoViewGroup", C2188811AlT.LIZIZ(sbLIZ));
        if (i == 1) {
            if (i2 == 2) {
                this.LL = C1697810uHb.LJIIJJI(this.LLILLL, this.LLILZ, this.LLILZLL);
                setLeft1Right2(false);
                C20441214yg.LJ("MatchUserInfoViewGroup", "show Left1,Right2");
            }
        } else if (i == 2 && i2 == 1) {
            this.LL = C1697810uHb.LJIIJJI(this.LLILLL, this.LLILZIL, this.LLILZ);
            setLeft2Right1(false);
            C20441214yg.LJ("MatchUserInfoViewGroup", "show Left2,Right1");
        }
        if (i3 == 4) {
            this.LL = C1697810uHb.LJIIJJI(this.LLILLL, this.LLILZIL, this.LLILZ, this.LLILZLL);
        }
        if (i == 2) {
            if (i2 == 2) {
                setSplitEqual(false);
                return;
            }
            return;
        }
        if (i == 1) {
            if (i2 != 3) {
                return;
            }
            C19MB c19mb = new C19MB();
            c19mb.LJII(this.LLILLJJLI);
            c19mb.LJIIIIZZ(R.id.user_info_self, 3, 0, 3);
            c19mb.LJIIIIZZ(R.id.user_info_self, 4, 0, 4);
            c19mb.LJJIJ(R.id.o2_, 8);
            c19mb.LJI(R.id.user_info_rival_two, 3);
            c19mb.LJI(R.id.user_info_rival_two, 4);
            c19mb.LJI(R.id.user_info_rival_two, 1);
            c19mb.LJI(R.id.user_info_rival_two, 2);
            c19mb.LJIIIIZZ(R.id.user_info_rival_one, 3, 0, 3);
            c19mb.LJIIIIZZ(R.id.user_info_rival_one, 4, R.id.user_info_rival_two, 3);
            c19mb.LJIIIIZZ(R.id.user_info_rival_two, 3, R.id.user_info_rival_one, 4);
            c19mb.LJIIIIZZ(R.id.user_info_rival_two, 4, R.id.user_info_rival_three, 3);
            c19mb.LJIIIIZZ(R.id.user_info_rival_two, 1, R.id.o2a, 2);
            c19mb.LJIIIIZZ(R.id.user_info_rival_two, 2, 0, 2);
            c19mb.LJIIIIZZ(R.id.user_info_rival_two, 4, R.id.user_info_rival_three, 3);
            c19mb.LJIIIIZZ(R.id.user_info_rival_three, 3, R.id.user_info_rival_two, 4);
            c19mb.LJIIIIZZ(R.id.user_info_rival_three, 4, 0, 4);
            e0();
            C500260Jjc.LLFFF(this.LLJ);
            C500260Jjc.LLFFF(this.LLJI);
            c19mb.LIZIZ(this.LLILLJJLI);
            return;
        }
        if (i != 3 || i2 != 1) {
            return;
        }
        C19MB c19mb2 = new C19MB();
        c19mb2.LJII(this.LLILLJJLI);
        View view = this.LLIZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        c19mb2.LJI(R.id.user_info_rival_two, 3);
        c19mb2.LJI(R.id.user_info_rival_two, 4);
        c19mb2.LJI(R.id.user_info_rival_two, 1);
        c19mb2.LJI(R.id.user_info_rival_two, 2);
        c19mb2.LJI(R.id.user_info_rival_one, 3);
        c19mb2.LJI(R.id.user_info_rival_one, 4);
        c19mb2.LJI(R.id.user_info_rival_one, 1);
        c19mb2.LJI(R.id.user_info_rival_one, 2);
        c19mb2.LJJIJ(R.id.o2_, 8);
        c19mb2.LJIIIIZZ(R.id.user_info_self, 3, 0, 3);
        c19mb2.LJIIIIZZ(R.id.user_info_self, 4, R.id.user_info_rival_one, 3);
        c19mb2.LJIIIIZZ(R.id.user_info_rival_one, 3, R.id.user_info_self, 4);
        c19mb2.LJIIIIZZ(R.id.user_info_rival_one, 4, R.id.user_info_rival_two, 3);
        c19mb2.LJIIIIZZ(R.id.user_info_rival_one, 1, 0, 1);
        c19mb2.LJIIIIZZ(R.id.user_info_rival_one, 2, R.id.o2a, 1);
        c19mb2.LJIIIIZZ(R.id.user_info_rival_two, 3, R.id.user_info_rival_one, 4);
        c19mb2.LJIIIIZZ(R.id.user_info_rival_two, 4, 0, 4);
        c19mb2.LJIIIIZZ(R.id.user_info_rival_two, 1, 0, 1);
        c19mb2.LJIIIIZZ(R.id.user_info_rival_two, 2, R.id.o2a, 1);
        c19mb2.LJIIIIZZ(R.id.user_info_rival_three, 3, 0, 3);
        c19mb2.LJIIIIZZ(R.id.user_info_rival_three, 4, 0, 4);
        e0();
        C500260Jjc.LLFFF(this.LLJ);
        C500260Jjc.LLFFF(this.LLJI);
        c19mb2.LIZIZ(this.LLILLJJLI);
    }

    public final void n0(boolean z, List list, List list2, Map map) {
        String str;
        String str2;
        ImageModel imageModel;
        String str3;
        String str4;
        if (list == null || list2 == null) {
            return;
        }
        j0(list.size(), list2.size());
        if (list.size() + list2.size() != this.LL.size()) {
            return;
        }
        Iterator it2 = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            ImageModel imageModel2 = null;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C954460awe c954460awe = (C954460awe) next;
                    C973090bQh c973090bQh = (C973090bQh) ListProtector.get(this.LL, i2);
                    if (c973090bQh == null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("SelfTeamList No UserInfoView defined for host ");
                        sbLIZ.append(i2);
                        C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        C754570Tip c754570Tip = c954460awe.LJIJJ;
                        if (c754570Tip != null) {
                            str3 = c754570Tip.LIZ;
                            str4 = c754570Tip.LIZIZ;
                            imageModel2 = c754570Tip.LIZJ;
                        } else {
                            str3 = null;
                            str4 = null;
                        }
                        GiftGalleryBadgeInfo giftGalleryBadgeInfo = c954460awe.LJJIII;
                        LeagueScoreInfo leagueScoreInfo = c954460awe.LJJIIJ;
                        Long lValueOf = Long.valueOf(c954460awe.LJ);
                        getClass();
                        h0(str3, str4, imageModel2, 36, giftGalleryBadgeInfo, leagueScoreInfo, lValueOf, c973090bQh, map, z, null);
                        i = i2;
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    C954460awe c954460awe2 = (C954460awe) it3.next();
                    int i4 = i + 1;
                    if (i4 < this.LL.size()) {
                        C973090bQh c973090bQh2 = (C973090bQh) ListProtector.get(this.LL, i4);
                        if (c973090bQh2 == null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("RivalTeamList No UserInfoView defined for host ");
                            sbLIZ2.append(i4);
                            C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                        } else {
                            C754570Tip c754570Tip2 = c954460awe2.LJIJJ;
                            if (c754570Tip2 != null) {
                                str = c754570Tip2.LIZ;
                                str2 = c754570Tip2.LIZIZ;
                                imageModel = c754570Tip2.LIZJ;
                            } else {
                                str = null;
                                str2 = null;
                                imageModel = null;
                            }
                            GiftGalleryBadgeInfo giftGalleryBadgeInfo2 = c954460awe2.LJJIII;
                            LeagueScoreInfo leagueScoreInfo2 = c954460awe2.LJJIIJ;
                            Long lValueOf2 = Long.valueOf(c954460awe2.LJ);
                            getClass();
                            h0(str, str2, imageModel, 36, giftGalleryBadgeInfo2, leagueScoreInfo2, lValueOf2, c973090bQh2, map, z, null);
                            i = i4;
                        }
                    }
                }
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[PHI: r13
      0x00af: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v4 java.lang.String) binds: [B:36:0x00ac, B:29:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0141 A[PHI: r3
      0x0141: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v7 java.lang.String) binds: [B:70:0x013e, B:63:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145 A[PHI: r2 r3
      0x0145: PHI (r2v5 java.lang.String) = (r2v4 java.lang.String), (r2v7 java.lang.String) binds: [B:73:0x0142, B:66:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x0145: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v6 java.lang.String) binds: [B:73:0x0142, B:66:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(java.util.List r34, java.util.List r35, java.util.Map r36, java.util.Map r37, java.util.Map r38) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973070bQf.l0(java.util.List, java.util.List, java.util.Map, java.util.Map, java.util.Map):void");
    }

    public static void h0(String str, String str2, ImageModel imageModel, int i, GiftGalleryBadgeInfo giftGalleryBadgeInfo, LeagueScoreInfo leagueScoreInfo, Long l, C973090bQh c973090bQh, Map map, boolean z, String str3) {
        boolean zLJFF = false;
        if (str3 != null && str3.length() > 0) {
            c973090bQh.LIZ(i, str3, imageModel, null, leagueScoreInfo);
        } else {
            c973090bQh.LIZ(i, C0KVU.LIZIZ(str, str2), imageModel, giftGalleryBadgeInfo, leagueScoreInfo);
        }
        if (z) {
            if (map != null) {
                zLJFF = Intrinsics.LJFF(map.get(l), Boolean.TRUE);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setUserInfo,hostUid = ");
            sbLIZ.append(l);
            sbLIZ.append(" isReady = ");
            sbLIZ.append(zLJFF);
            C20441214yg.LIZIZ("MatchUserInfoViewGroup", C2188811AlT.LIZIZ(sbLIZ));
            c973090bQh.setUpUserCountdown(!zLJFF);
            c973090bQh.setReadyStateSingleMode(zLJFF);
            return;
        }
        c973090bQh.setUpUserCountdown(false);
        c973090bQh.setReadyStateSingleMode(false);
    }
}

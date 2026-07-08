package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bQi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973100bQi extends ConstraintLayout {
    public List<C973090bQh> LL;
    public final ConstraintLayout LLILLJJLI;
    public final C973090bQh LLILLL;
    public final C973090bQh LLILZ;
    public final C973090bQh LLILZIL;
    public final C973090bQh LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;

    public final void e0() {
        C973090bQh c973090bQh = this.LLILZIL;
        if (c973090bQh != null) {
            int visibility = c973090bQh.getVisibility();
            c973090bQh.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c973090bQh);
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(this.LLILLJJLI);
        c19mb.LJIIIIZZ(R.id.user_info_self, 4, 0, 4);
        c19mb.LIZIZ(this.LLILLJJLI);
        this.LL = C1697810uHb.LJIIJJI(this.LLILLL, this.LLILZ, this.LLILZLL);
    }

    public final void h0() {
        C973090bQh c973090bQh = this.LLILZIL;
        if (c973090bQh != null) {
            int visibility = c973090bQh.getVisibility();
            c973090bQh.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c973090bQh);
        }
        C973090bQh c973090bQh2 = this.LLILZ;
        if (c973090bQh2 != null) {
            int visibility2 = c973090bQh2.getVisibility();
            c973090bQh2.setVisibility(8);
            C1602160rnK.LIZIZ(visibility2, 8, c973090bQh2);
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(this.LLILLJJLI);
        c19mb.LJIIIIZZ(R.id.user_info_self, 4, 0, 4);
        c19mb.LJIIIIZZ(R.id.user_info_rival_three, 3, 0, 3);
        c19mb.LIZIZ(this.LLILLJJLI);
        this.LL = C1697810uHb.LJIIJJI(this.LLILLL, this.LLILZLL);
    }

    public final void i0() {
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

    public final void p0() {
        for (C973090bQh c973090bQh : this.LL) {
            if (c973090bQh != null) {
                View viewFindViewById = c973090bQh.findViewById(R.id.user_info_layout_container);
                if (viewFindViewById != null) {
                    viewFindViewById.setBackgroundResource(R.drawable.dzg);
                }
                c973090bQh.invalidate();
            }
        }
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

    public C973100bQi(Context context, AttributeSet attributeSet) {
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
        View viewFindViewById = findViewById(R.id.o2b);
        this.LLIZ = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.o2c);
        this.LLIZLLLIL = viewFindViewById2;
        this.LL = C1697810uHb.LJIIJJI(c973090bQh, c973090bQh2, c973090bQh3, c973090bQh4);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j0(X.C973100bQi r8, java.util.List r9, java.util.Map r10) {
        /*
            if (r9 == 0) goto L58
            java.util.Iterator r7 = r9.iterator()
            r6 = 0
        L7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L58
            java.lang.Object r5 = r7.next()
            int r4 = r6 + 1
            r2 = 0
            if (r6 < 0) goto L54
            X.0awe r5 = (X.C954460awe) r5
            java.util.List<X.0bQh> r0 = r8.LL
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            X.0bQh r3 = (X.C973090bQh) r3
            if (r3 != 0) goto L37
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "No UserInfoView defined for host "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZLLL(r0)
        L35:
            r6 = r4
            goto L7
        L37:
            if (r10 == 0) goto L45
            long r0 = r5.LJ
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r2 = r10.get(r0)
            com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo r2 = (com.bytedance.android.livesdk.chatroom.model.interact.GiftGalleryBadgeInfo) r2
        L45:
            com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo r0 = r5.LJJIIJ
            if (r0 == 0) goto L52
            boolean r1 = r0.classOptOut
            r0 = 1
            if (r1 != r0) goto L52
        L4e:
            r3.LIZIZ(r2, r0)
            goto L35
        L52:
            r0 = 0
            goto L4e
        L54:
            X.C1697810uHb.LJIJI()
            throw r2
        L58:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "updateLeagueInfo "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MatchRankBadgeView"
            X.C20441214yg.LIZIZ(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C973100bQi.j0(X.0bQi, java.util.List, java.util.Map):void");
    }

    public final void l0(Map map, Map map2, List list, boolean z, boolean z2) {
        GiftGalleryBadgeInfo giftGalleryBadgeInfo;
        String str;
        boolean zLJFF;
        if (list == null) {
            return;
        }
        if (list.size() != this.LL.size()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("HostsList size ");
            sbLIZ.append(list.size());
            sbLIZ.append(" does not match UserInfoViews size ");
            sbLIZ.append(this.LL.size());
            C20441214yg.LJ("MatchUserInfoViewGroup", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            ImageModel imageModel = null;
            if (i >= 0) {
                C954460awe c954460awe = (C954460awe) obj;
                C973090bQh c973090bQh = (C973090bQh) ListProtector.get(this.LL, i);
                if (c973090bQh == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("No UserInfoView defined for host ");
                    sbLIZ2.append(i);
                    C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    if (z2) {
                        giftGalleryBadgeInfo = null;
                    } else if (map2 == null || (giftGalleryBadgeInfo = (GiftGalleryBadgeInfo) map2.get(Long.valueOf(c954460awe.LJ))) == null) {
                        giftGalleryBadgeInfo = c954460awe.LJJIII;
                    }
                    C754570Tip c754570Tip = c954460awe.LJIJJ;
                    if (c754570Tip != null) {
                        str = c754570Tip.LIZIZ;
                        imageModel = c754570Tip.LIZJ;
                    } else {
                        str = null;
                    }
                    c973090bQh.LIZ(48, str, imageModel, giftGalleryBadgeInfo, c954460awe.LJJIIJ);
                    if (z) {
                        if (map != null) {
                            zLJFF = Intrinsics.LJFF(map.get(Long.valueOf(c954460awe.LJ)), Boolean.TRUE);
                        } else {
                            zLJFF = false;
                        }
                        c973090bQh.setUpUserCountdown(!zLJFF);
                        c973090bQh.setReadyStateSingleMode(zLJFF);
                    } else {
                        c973090bQh.setUpUserCountdown(false);
                        c973090bQh.setReadyStateSingleMode(false);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}

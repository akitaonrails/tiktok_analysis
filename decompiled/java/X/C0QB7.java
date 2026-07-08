package X;

import Y.ARunnableS4S2100000_10;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.api.ICommonLogger;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0QB7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QB7 extends LinearLayout {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final View LL;
    public TuxTextView LLILLJJLI;
    public C443640HaU LLILLL;
    public C443640HaU LLILZ;
    public C443640HaU LLILZIL;
    public final TuxTextView LLILZLL;
    public String LLIZ;

    public C0QB7(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setNickNameBold(String str) {
    }

    public final C443640HaU getLeftRelativeAvatar() {
        return this.LLILZIL;
    }

    public final C443640HaU getRelativeAvatar() {
        return this.LLILLL;
    }

    public final TuxTextView getTvDesc() {
        return this.LLILLJJLI;
    }

    public final TuxTextView getTvDescTextOnly() {
        return this.LLILZLL;
    }

    public final C443640HaU getVerticalRelativeAvatar() {
        return this.LLILZ;
    }

    private final void setAvatarView(MutualStruct mutualStruct) {
        C786410Ut5.v1(this.LLILLL, 0);
        C786410Ut5.v1(this.LLILZIL, 8);
        C786410Ut5.v1(this.LLILZ, 8);
        this.LLILLL.LIZ(mutualStruct);
    }

    private final void setLeftAvatarView(MutualStruct mutualStruct) {
        List<MutualUser> list;
        C786410Ut5.v1(this.LLILLL, 8);
        C443640HaU c443640HaU = this.LLILZIL;
        C786410Ut5.u1(this, 0);
        c443640HaU.setAvatarSizeModel(32);
        C786410Ut5.v1(c443640HaU, 8);
        if (mutualStruct.userList != null && (!r0.isEmpty()) && (list = mutualStruct.userList) != null) {
            C786410Ut5.v1(c443640HaU, 0);
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c443640HaU, null);
            c443640HaU.removeAllViews();
            int size = list.size();
            for (int i = 0; i < size && ListProtector.get(list, i) != null && i <= 2; i++) {
                c443640HaU.addView(c443640HaU.LIZIZ((MutualUser) ListProtector.get(list, i), i, false));
            }
        }
        C786410Ut5.v1(this.LLILZ, 8);
    }

    private final void setTextSuggestStr(MutualStruct mutualStruct) {
        C786410Ut5.LLLLZLL(this.LLILLJJLI, 0);
        List<MutualUser> list = mutualStruct.userList;
        if (list != null && !list.isEmpty()) {
            this.LLILLJJLI.setText(C0QB9.LIZ(getContext(), Integer.valueOf(mutualStruct.mutualType)));
        } else {
            this.LLILLJJLI.setText(LIZIZ(mutualStruct.total));
        }
    }

    private final void setTextWithoutNum(MutualStruct mutualStruct) {
        String nickname;
        String nickname2;
        List<MutualUser> list = mutualStruct.userList;
        if (list != null && !list.isEmpty()) {
            C786410Ut5.LLLLZLL(this.LLILLJJLI, 0);
            List list2 = mutualStruct.userList;
            if (list2 == null) {
                list2 = C13BV.INSTANCE;
            }
            MutualUser mutualUser = (MutualUser) ListProtector.get(list2, 0);
            String strLIZIZ = "";
            if (mutualUser == null || (nickname = mutualUser.getNickname()) == null) {
                nickname = "";
            }
            String strLIZ = C0QB9.LIZ(getContext(), Integer.valueOf(mutualStruct.mutualType));
            if (list2.size() > 1) {
                MutualUser mutualUser2 = (MutualUser) ListProtector.get(list2, 1);
                if (mutualUser2 != null && (nickname2 = mutualUser2.getNickname()) != null) {
                    strLIZIZ = nickname2;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZ);
                sbLIZ.append(' ');
                sbLIZ.append(nickname);
                sbLIZ.append(',');
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(' ');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else if (list2.size() == 1) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZ);
                sbLIZ2.append(' ');
                sbLIZ2.append(nickname);
                sbLIZ2.append(' ');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            this.LLILLJJLI.setText(strLIZIZ);
            setNickNameBold(strLIZ);
            return;
        }
        this.LLILLJJLI.setText(LIZIZ(mutualStruct.total));
    }

    public final String LIZIZ(int i) {
        return getResources().getQuantityString(2131755430, i, Integer.valueOf(i));
    }

    public final void setCollabInFeedLabel(boolean z) {
        this.LLILLL.setCollabInFeedLabel(z);
    }

    public final void setDarkMode(boolean z) {
        this.LLILLL.setDarkMode(z);
    }

    public final void setLeftRelativeAvatar(C443640HaU c443640HaU) {
        this.LLILZIL = c443640HaU;
    }

    public final void setRelativeAvatar(C443640HaU c443640HaU) {
        this.LLILLL = c443640HaU;
    }

    public final void setRootBackground(Drawable drawable) {
        this.LL.setBackground(drawable);
    }

    public final void setSocialVideoTag(boolean z) {
        this.LLILLL.setSocialVideoTag(z);
    }

    public final void setTextColor(int i) {
        this.LLILLJJLI.setTextColor(i);
    }

    public final void setTuxTextSize(int i) {
        this.LLILLJJLI.setTuxFont(i);
        this.LLILZLL.setTuxFont(i);
    }

    public final void setTvDesc(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setTvMaxWidth(int i) {
        this.LLILLJJLI.setMaxWidth(i);
    }

    public final void setVerticalRelativeAvatar(C443640HaU c443640HaU) {
        this.LLILZ = c443640HaU;
    }

    public final void LIZ(MutualStruct mutualStruct, int i) {
        if (mutualStruct != null && mutualStruct.total > 0) {
            if (i != -4) {
                switch (i) {
                    case 1:
                        LJFF(mutualStruct, 1, 1);
                        break;
                    case 2:
                        LJFF(mutualStruct, 1, 2);
                        break;
                    case 3:
                        LJFF(mutualStruct, 2, 2);
                        break;
                    case 4:
                        setTextSuggestStr(mutualStruct);
                        setAvatarView(mutualStruct);
                        break;
                    case 5:
                        setTextWithoutNum(mutualStruct);
                        setAvatarView(mutualStruct);
                        break;
                    case 6:
                        setTextSuggestStr(mutualStruct);
                        this.LLILLL.LIZ(mutualStruct);
                        C786410Ut5.v1(this.LLILLL, 8);
                        break;
                    case 7:
                        setTextSuggestStr(mutualStruct);
                        this.LLILLL.setAvatarSizeModel(22);
                        setAvatarView(mutualStruct);
                        break;
                    case 8:
                        LIZLLL(mutualStruct, 17);
                        C786410Ut5.v1(this.LLILLL, 8);
                        C786410Ut5.v1(this.LLILZIL, 8);
                        C443640HaU c443640HaU = this.LLILZ;
                        C786410Ut5.u1(this, 0);
                        c443640HaU.setAvatarSizeModel(36);
                        c443640HaU.LIZ(mutualStruct);
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        LIZLLL(mutualStruct, 17);
                        break;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        LIZLLL(mutualStruct, 8388611);
                        setLeftAvatarView(mutualStruct);
                        break;
                    default:
                        C786410Ut5.LLLLZLL(this.LLILLJJLI, 8);
                        C786410Ut5.v1(this.LLILLL, 8);
                        break;
                }
                return;
            }
            setTuxTextSize(71);
            this.LLILLL.setAvatarSizeModel(14);
            setAvatarView(mutualStruct);
            setTextSuggestStr(mutualStruct);
        }
    }

    public final void LIZJ(int i, int i2) {
        C443640HaU c443640HaU = this.LLILLL;
        if ((i != c443640HaU.LLILLJJLI || i2 != c443640HaU.LL) && c443640HaU.getChildCount() > 0) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c443640HaU, null);
            c443640HaU.removeAllViews();
        }
        c443640HaU.LLILLJJLI = i;
        c443640HaU.LL = i2;
    }

    public final void LIZLLL(MutualStruct mutualStruct, int i) {
        int size;
        MutualUser mutualUser;
        String nickname;
        String nickname2;
        MutualUser mutualUser2;
        String nickname3;
        MutualUser mutualUser3;
        this.LLILLJJLI.setTextColorRes(R.attr.a1j);
        if (this.LLIZ.length() == 0) {
            setTextSuggestStr(mutualStruct);
            return;
        }
        List<MutualUser> list = mutualStruct.userList;
        if (list != null && !list.isEmpty()) {
            this.LLILLJJLI.setMaxLines(2);
            this.LLILLJJLI.setGravity(i);
            C786410Ut5.LLLLZLL(this.LLILLJJLI, 0);
            List<MutualUser> list2 = mutualStruct.userList;
            if (list2 != null) {
                size = list2.size();
            } else {
                size = 0;
            }
            String str = "";
            if (size >= 2) {
                if (a0.LJJIIZI(this.LLIZ, "{0}", false) && a0.LJJIIZI(this.LLIZ, "{1}", false)) {
                    List<MutualUser> list3 = mutualStruct.userList;
                    if (list3 == null || (mutualUser3 = (MutualUser) ListProtector.get(list3, 0)) == null || (nickname2 = mutualUser3.getNickname()) == null) {
                        nickname2 = "";
                    }
                    List<MutualUser> list4 = mutualStruct.userList;
                    if (list4 != null && (mutualUser2 = (MutualUser) ListProtector.get(list4, 1)) != null && (nickname3 = mutualUser2.getNickname()) != null) {
                        str = nickname3;
                    }
                    String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(this.LLIZ, "{0}", nickname2, false), "{1}", str, false);
                    ICommonLogger iCommonLoggerLIZ = C1110304Vx.LIZ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("firsName = ");
                    sbLIZ.append(nickname2);
                    sbLIZ.append(", secondName = ");
                    sbLIZ.append(str);
                    sbLIZ.append("\n recReasonWithPlaceHolder = ");
                    sbLIZ.append(this.LLIZ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    iCommonLoggerLIZ.d();
                    this.LLILLJJLI.setText(strLJJIFFI);
                    HandlerHook.viewPost(this.LLILLJJLI, new ARunnableS4S2100000_10(this, nickname2, str, 1));
                    return;
                }
                return;
            }
            if (size != 1 || !a0.LJJIIZI(this.LLIZ, "{0}", false)) {
                return;
            }
            List<MutualUser> list5 = mutualStruct.userList;
            if (list5 != null && (mutualUser = (MutualUser) ListProtector.get(list5, 0)) != null && (nickname = mutualUser.getNickname()) != null) {
                str = nickname;
            }
            this.LLIZ = u.LJJIFFI(this.LLIZ, "{0}", str, false);
            ICommonLogger iCommonLoggerLIZ2 = C1110304Vx.LIZ();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("firsName = ");
            sbLIZ2.append(str);
            sbLIZ2.append("\n recReasonWithPlaceHolder = ");
            sbLIZ2.append(this.LLIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
            iCommonLoggerLIZ2.d();
            this.LLILLJJLI.setText(this.LLIZ);
            return;
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        String strLIZIZ = this.LLIZ;
        if (strLIZIZ.length() == 0) {
            strLIZIZ = LIZIZ(mutualStruct.total);
        }
        tuxTextView.setText(strLIZIZ);
    }

    public C0QB7(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        if (((Boolean) C274910Aq1.LIZIZ.getValue()).booleanValue() && (context instanceof Activity)) {
            C20673215v0.LIZLLL(R.layout.d6v, (Activity) context, this, true);
        } else {
            LinearLayout.inflate(context, R.layout.d6v, this);
        }
        this.LL = findViewById(R.id.oyn);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.zhs);
        this.LLILLL = (C443640HaU) findViewById(R.id.t55);
        this.LLILZ = (C443640HaU) findViewById(R.id.t57);
        this.LLILZIL = (C443640HaU) findViewById(R.id.t56);
        this.LLILZLL = (TuxTextView) findViewById(R.id.zhy);
        this.LLIZ = "";
    }

    public final void LJFF(final MutualStruct mutualStruct, int i, int i2) {
        String nickname;
        int size;
        String nickname2;
        C786410Ut5.LLLLZLL(this.LLILLJJLI, 0);
        List list = mutualStruct.userList;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        int i3 = mutualStruct.total;
        this.LLILLJJLI.setMaxLines(i);
        final StringBuilder sb = new StringBuilder();
        final String strLIZ = C0QB9.LIZ(getContext(), Integer.valueOf(mutualStruct.mutualType));
        sb.append(strLIZ);
        sb.append(" ");
        String str = "";
        if (i2 > 1 && i3 > 1) {
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    MutualUser mutualUser = (MutualUser) obj;
                    if (mutualUser == null || (nickname2 = mutualUser.getNickname()) == null) {
                        nickname2 = "";
                    }
                    sb.append(nickname2);
                    if (i4 != list.size() - 1) {
                        sb.append(", ");
                    } else {
                        sb.append(" ");
                    }
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            MutualUser mutualUser2 = (MutualUser) ListProtector.get(list, 0);
            if (mutualUser2 != null && (nickname = mutualUser2.getNickname()) != null) {
                str = nickname;
            }
            sb.append(str);
            sb.append(" ");
        }
        sb.length();
        final C118300cf c118300cf = new C118300cf();
        if (i2 == 1) {
            size = i3 - 1;
        } else {
            size = i3 - list.size();
        }
        c118300cf.element = size;
        if (size > 99) {
            c118300cf.element = 99;
        }
        if (c118300cf.element > 0) {
            TuxTextView tuxTextView = this.LLILLJJLI;
            sb.append(getContext().getString(2131845802, Integer.valueOf(c118300cf.element)));
            tuxTextView.setText(sb);
        } else {
            this.LLILLJJLI.setText(sb);
        }
        HandlerHook.viewPost(this.LLILLJJLI, new Runnable() { // from class: X.0QB8
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
            
                r2 = r2 + 1;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() {
                /*
                    Method dump skipped, instruction units count: 241
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0QB8.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MutualRelationView@df00.setTextWithNum$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MutualRelationView@df00.setTextWithNum$2");
            }
        });
    }

    public static void LJ(C0QB7 c0qb7, Integer num, Integer num2, Integer num3, Integer num4) {
        C426750GoL.LJIIJJI(c0qb7.LL, num, num2, num3, num4, true);
    }
}

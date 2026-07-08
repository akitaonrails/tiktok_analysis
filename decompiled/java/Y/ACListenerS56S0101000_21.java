package Y;

import X.C0WZX;
import X.C1341920l1a;
import X.C1350960lGA;
import X.C1352460lIa;
import X.C1352480lIc;
import X.C1353510lKH;
import X.C1377080lwI;
import X.C15438062q;
import X.C2204961BRm;
import X.C591970NJr;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.PollCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.ss.android.ugc.now.interaction.assem.NowFakeCommentInputAssem;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes22.dex */
public class ACListenerS56S0101000_21 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS56S0101000_21 aCListenerS56S0101000_21, View view) {
        ((C1377080lwI) aCListenerS56S0101000_21.l0).LLILLJJLI.yQ2(aCListenerS56S0101000_21.i1);
    }

    public static final void onClick$1(ACListenerS56S0101000_21 aCListenerS56S0101000_21, View view) {
        C1341920l1a item = ((PollCell) aCListenerS56S0101000_21.l0).getItem();
        if (item == null) {
            return;
        }
        ((PollCell) aCListenerS56S0101000_21.l0).d6(item, aCListenerS56S0101000_21.i1);
    }

    public static final void onClick$2(ACListenerS56S0101000_21 aCListenerS56S0101000_21, View view) {
        C1341920l1a item = ((PollCell) aCListenerS56S0101000_21.l0).getItem();
        if (item == null) {
            return;
        }
        ((PollCell) aCListenerS56S0101000_21.l0).d6(item, aCListenerS56S0101000_21.i1);
    }

    public static final void onClick$3(ACListenerS56S0101000_21 aCListenerS56S0101000_21, View view) {
        C1341920l1a item = ((PollCell) aCListenerS56S0101000_21.l0).getItem();
        if (item == null) {
            return;
        }
        ((PollCell) aCListenerS56S0101000_21.l0).d6(item, aCListenerS56S0101000_21.i1);
    }

    public static final void onClick$4(ACListenerS56S0101000_21 aCListenerS56S0101000_21, View view) {
        Aweme aweme;
        String enterFrom;
        Integer numValueOf;
        ArrayList arrayList;
        Integer numValueOf2;
        int iIsBlueVUser;
        String enterPosition;
        Integer numIsNowClear;
        int iLIZ;
        int iIsNewPage;
        String previousPage;
        String nowTabEnterMethod;
        NowFeedMobHierarchyData nowFeedMobHierarchyData;
        NowFeedMobHierarchyData nowFeedMobHierarchyData2;
        NowFeedMobHierarchyData nowFeedMobHierarchyData3;
        Aweme aweme2;
        NowFeedMobHierarchyData nowFeedMobHierarchyData4;
        NowFeedMobHierarchyData nowFeedMobHierarchyData5;
        String str = null;
        String string = C2204961BRm.M(((NowFakeCommentInputAssem) aCListenerS56S0101000_21.l0).hp(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3Y2ayk6aP6tcZ7NyDus9jTyrBoGO/cwE6YTV5n/OmDjrvAAoCjN3YtMHsVnRMY=", null)).toString();
        NowKeyboardVM nowKeyboardVMKp = ((NowFakeCommentInputAssem) aCListenerS56S0101000_21.l0).kp();
        NowFakeCommentInputAssem nowFakeCommentInputAssem = (NowFakeCommentInputAssem) aCListenerS56S0101000_21.l0;
        nowKeyboardVMKp.vQ2(nowFakeCommentInputAssem.LLJL, string, nowFakeCommentInputAssem.hp().getTextExtraStructList(), ((NowFakeCommentInputAssem) aCListenerS56S0101000_21.l0).LLJLIL);
        C1352460lIa c1352460lIaIp = ((NowFakeCommentInputAssem) aCListenerS56S0101000_21.l0).ip();
        if (c1352460lIaIp != null && (aweme = c1352460lIaIp.LL) != null) {
            NowFakeCommentInputAssem nowFakeCommentInputAssem2 = (NowFakeCommentInputAssem) aCListenerS56S0101000_21.l0;
            int i = aCListenerS56S0101000_21.i1;
            C1352460lIa c1352460lIaIp2 = nowFakeCommentInputAssem2.ip();
            if (c1352460lIaIp2 != null && (nowFeedMobHierarchyData5 = c1352460lIaIp2.LLILZIL) != null) {
                enterFrom = nowFeedMobHierarchyData5.getEnterFrom();
            } else {
                enterFrom = null;
            }
            String aid = aweme.getAid();
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            User author = aweme.getAuthor();
            if (author != null) {
                numValueOf = Integer.valueOf(author.getFollowStatus());
            } else {
                numValueOf = null;
            }
            NowPostInfo nowPostInfo = aweme.nowPostInfo;
            if (nowPostInfo != null) {
                str = nowPostInfo.nowMediaType;
            }
            Comment comment = nowFakeCommentInputAssem2.LLJLIL;
            String str2 = nowFakeCommentInputAssem2.ip().LLILZLL;
            ArrayList<TextExtraStruct> textExtraStructList = nowFakeCommentInputAssem2.hp().getTextExtraStructList();
            if (textExtraStructList != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(textExtraStructList, 10));
                Iterator<TextExtraStruct> it2 = textExtraStructList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getUserId());
                }
            } else {
                arrayList = null;
            }
            ArrayList<TextExtraStruct> textExtraStructList2 = nowFakeCommentInputAssem2.hp().getTextExtraStructList();
            if (textExtraStructList2 != null) {
                numValueOf2 = Integer.valueOf(textExtraStructList2.size());
            } else {
                numValueOf2 = null;
            }
            NowFeedMobHierarchyData nowFeedMobHierarchyData6 = nowFakeCommentInputAssem2.ip().LLILZIL;
            if (nowFeedMobHierarchyData6 != null) {
                iIsBlueVUser = nowFeedMobHierarchyData6.isBlueVUser();
            } else {
                iIsBlueVUser = 0;
            }
            String strLIZJ = C591970NJr.LIZIZ().LIZJ(nowFakeCommentInputAssem2.ip().LL);
            NowFeedMobHierarchyData nowFeedMobHierarchyData7 = nowFakeCommentInputAssem2.ip().LLILZIL;
            if (nowFeedMobHierarchyData7 != null) {
                enterPosition = nowFeedMobHierarchyData7.getEnterPosition();
            } else {
                enterPosition = null;
            }
            C1352460lIa c1352460lIaIp3 = nowFakeCommentInputAssem2.ip();
            if (c1352460lIaIp3 != null && (nowFeedMobHierarchyData4 = c1352460lIaIp3.LLILZIL) != null) {
                numIsNowClear = nowFeedMobHierarchyData4.isNowClear();
            } else {
                numIsNowClear = null;
            }
            C1352460lIa c1352460lIaIp4 = nowFakeCommentInputAssem2.ip();
            if (c1352460lIaIp4 != null && (aweme2 = c1352460lIaIp4.LL) != null) {
                iLIZ = C1352480lIc.LIZ(aweme2);
            } else {
                iLIZ = 1;
            }
            int iLIZJ = C1352480lIc.LIZJ(nowFakeCommentInputAssem2.ip().LL);
            C1352460lIa c1352460lIaIp5 = nowFakeCommentInputAssem2.ip();
            if (c1352460lIaIp5 != null && (nowFeedMobHierarchyData3 = c1352460lIaIp5.LLILZIL) != null) {
                iIsNewPage = nowFeedMobHierarchyData3.isNewPage();
            } else {
                iIsNewPage = 0;
            }
            C1352460lIa c1352460lIaIp6 = nowFakeCommentInputAssem2.ip();
            if (c1352460lIaIp6 != null && (nowFeedMobHierarchyData2 = c1352460lIaIp6.LLILZIL) != null) {
                previousPage = nowFeedMobHierarchyData2.getPreviousPage();
            } else {
                previousPage = null;
            }
            C1352460lIa c1352460lIaIp7 = nowFakeCommentInputAssem2.ip();
            if (c1352460lIaIp7 != null && (nowFeedMobHierarchyData = c1352460lIaIp7.LLILZIL) != null) {
                nowTabEnterMethod = nowFeedMobHierarchyData.getNowTabEnterMethod();
            } else {
                nowTabEnterMethod = null;
            }
            C1350960lGA.LJ(enterFrom, aid, authorUid, numValueOf, str, comment, string, str2, arrayList, numValueOf2, iIsBlueVUser, strLIZJ, enterPosition, i, numIsNowClear, iLIZ, iLIZJ, iIsNewPage, previousPage, nowTabEnterMethod, aweme);
        }
        String string2 = null;
        C2204961BRm.M(((NowFakeCommentInputAssem) aCListenerS56S0101000_21.l0).hp(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3Y2ayk6aP6tcZ7NyDus9jTyrBoGO/cwE6YTV5n/OmDjrvAAoCjN3YtMHsVnRMY=", null)).clear();
        C1353510lKH c1353510lKHHp = ((NowFakeCommentInputAssem) aCListenerS56S0101000_21.l0).hp();
        Context context = ((NowFakeCommentInputAssem) aCListenerS56S0101000_21.l0).getContext();
        if (context != null) {
            string2 = context.getString(2131838349);
        }
        c1353510lKHHp.setHint(string2);
    }

    public ACListenerS56S0101000_21(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}

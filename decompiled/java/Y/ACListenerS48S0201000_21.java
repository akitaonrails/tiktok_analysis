package Y;

import X.C036E;
import X.C0R90;
import X.C0RSR;
import X.C0RYF;
import X.C109100bB;
import X.C1234290iDz;
import X.C1348730lCZ;
import X.C1348830lCj;
import X.C1351190lGX;
import X.C1351210lGZ;
import X.C1353500lKG;
import X.C1369580lkC;
import X.C1369780lkW;
import X.C1369800lkY;
import X.C1369810lkZ;
import X.C1369820lka;
import X.C1369870lkf;
import X.C1370210llD;
import X.C1370230llF;
import X.C1370250llH;
import X.C1371590lnR;
import X.C1377080lwI;
import X.C1377090lwJ;
import X.C1387960mDq;
import X.C1387990mDt;
import X.C1388640mEw;
import X.C1388670mEz;
import X.C1389300mG0;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C13LP;
import X.C1440005kM;
import X.C1558520qew;
import X.C2097608Jq;
import X.C2176211AEx;
import X.C523420Kfs;
import X.C724240Sb0;
import X.C724270Sb3;
import X.InterfaceC1351180lGW;
import X.InterfaceC1368050lhj;
import X.InterfaceC1369790lkX;
import X.InterfaceC1370310llN;
import android.content.Context;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.assem.quickcomment.VideoQuickCommentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeControl;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.text.assem.FriendsV3TextCommentInputAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.comment.FriendsV3CommentInputAssem;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public class ACListenerS48S0201000_21 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS48S0201000_21 aCListenerS48S0201000_21, View view) {
        int i;
        C1348730lCZ c1348730lCZLJLL;
        String aid;
        AwemeControl awemeControl;
        FriendsV3CommentInputAssem friendsV3CommentInputAssem = (FriendsV3CommentInputAssem) aCListenerS48S0201000_21.l0;
        String str = (String) ListProtector.get((List) aCListenerS48S0201000_21.l1, aCListenerS48S0201000_21.i2);
        Aweme commentInputAweme = friendsV3CommentInputAssem.getCommentInputAweme();
        if ((commentInputAweme != null && (awemeControl = commentInputAweme.getAwemeControl()) != null && !awemeControl.canComment()) || str == null || str.length() == 0) {
            return;
        }
        CommentService.LIZ.getClass();
        if (C523420Kfs.LIZ().LJJ()) {
            CommentContextSource commentContextSource = new CommentContextSource();
            commentContextSource.setCommonModel(new CommentCommonModel(friendsV3CommentInputAssem.getCommentInputAweme(), null, "homepage_friends", null, "click_friends_quick_panel", null, null, false, null, null, null, null, 0, null, false, false, true, false, 0, -1, -1, -1, false, false, false, false, false, false, false, null, null, 1, true, false, null, null, "", false, false, "", null, null, null, null, null, false, false, false, false, false, null, null, -1, null, null, null, "", false, true, false, "friends_v3_feeds", null, null, Boolean.FALSE, 0, true, false, false, null, null, null, null, null, false));
            i = 1;
            C523420Kfs.LIZ().LJJLIIIJ(commentContextSource, C724240Sb0.LJI(friendsV3CommentInputAssem), str, C1558520qew.LJIIL(friendsV3CommentInputAssem), "click_friends_quick_panel", "click_friends_quick_panel", null, 3, null, new AwS635S0100000_21(friendsV3CommentInputAssem, 1), new AwS600S0100000_21(friendsV3CommentInputAssem, 10));
        } else {
            i = 1;
            if (friendsV3CommentInputAssem.LLJLIL == null) {
                Fragment fragmentLJI = C724240Sb0.LJI(friendsV3CommentInputAssem);
                if (fragmentLJI != null) {
                    c1348730lCZLJLL = C523420Kfs.LIZ().LJLL(fragmentLJI, friendsV3CommentInputAssem.hashCode(), friendsV3CommentInputAssem);
                } else {
                    c1348730lCZLJLL = null;
                }
                friendsV3CommentInputAssem.LLJLIL = c1348730lCZLJLL;
            }
            InterfaceC1351180lGW interfaceC1351180lGW = friendsV3CommentInputAssem.LLJLIL;
            if (interfaceC1351180lGW != null) {
                interfaceC1351180lGW.LIZIZ(str, "click_friends_quick_panel", "", new LinkedHashMap());
            }
        }
        C0RSR c0rsr = new C0RSR(i, null);
        Aweme commentInputAweme2 = friendsV3CommentInputAssem.getCommentInputAweme();
        if (commentInputAweme2 == null || (aid = commentInputAweme2.getAid()) == null) {
            aid = "";
        }
        c0rsr.LIZJ = aid;
        c0rsr.LIZLLL = str;
        C1440005kM.LIZ(c0rsr);
        C109100bB c109100bB = C109100bB.LIZ;
        Map<String, Object> mapTp = friendsV3CommentInputAssem.tp();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("action_type", "emoji");
        pairArr[i] = new Pair("emoji_id", str);
        Map mapLJIIL = C2097608Jq.LJIIL(mapTp, C2097608Jq.LJIIIIZZ(pairArr));
        c109100bB.getClass();
        C109100bB.LIZ("ttsocial_quick_comment_panel_click", mapLJIIL);
    }

    public static final void onClick$1(ACListenerS48S0201000_21 aCListenerS48S0201000_21, View view) {
        ((C1377080lwI) aCListenerS48S0201000_21.l0).LLILLJJLI.yQ2(aCListenerS48S0201000_21.i2);
        ((C1377090lwJ) aCListenerS48S0201000_21.l1).LLILLJJLI.setChecked(!r1.isChecked());
    }

    public static final void onClick$10(ACListenerS48S0201000_21 aCListenerS48S0201000_21, View view) {
        ((C1387960mDq) aCListenerS48S0201000_21.l0).LLILLJJLI.invoke(Integer.valueOf(aCListenerS48S0201000_21.i2), (C1387990mDt) aCListenerS48S0201000_21.l1);
    }

    public static final void onClick$2(ACListenerS48S0201000_21 aCListenerS48S0201000_21, View view) {
        BaseSharePackage baseSharePackage;
        if (C0R90.LIZ(1200L, view)) {
            return;
        }
        view.setTag(R.id.e12, Integer.valueOf(aCListenerS48S0201000_21.i2));
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        view.getContext();
        C1371590lnR c1371590lnR = ((C1369580lkC) aCListenerS48S0201000_21.l0).LLJJIII;
        if (c1371590lnR != null) {
            baseSharePackage = c1371590lnR.LJIJJ;
        } else {
            baseSharePackage = null;
        }
        C1369870lkf.LJIIJ(baseSharePackage, (InterfaceC1369790lkX) ListProtector.get((List) aCListenerS48S0201000_21.l1, aCListenerS48S0201000_21.i2), aCListenerS48S0201000_21.i2, C1369870lkf.LJIL);
        InterfaceC1368050lhj interfaceC1368050lhj = ((C1369580lkC) aCListenerS48S0201000_21.l0).LLJJ;
        if (interfaceC1368050lhj != null) {
            interfaceC1368050lhj.LJIIIIZZ((InterfaceC1369790lkX) ListProtector.get((List) aCListenerS48S0201000_21.l1, aCListenerS48S0201000_21.i2), view);
        }
    }

    public static final void onClick$3(ACListenerS48S0201000_21 aCListenerS48S0201000_21, View view) {
        if (C0R90.LIZ(1200L, view)) {
            return;
        }
        view.setTag(R.id.e12, Integer.valueOf(aCListenerS48S0201000_21.i2));
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        view.getContext();
        C1369870lkf.LJIIJ(((C1369780lkW) aCListenerS48S0201000_21.l0).LLIZ, ((C1369800lkY) aCListenerS48S0201000_21.l1).LLILZ, aCListenerS48S0201000_21.i2, C1369870lkf.LJIL);
        C1369780lkW c1369780lkW = (C1369780lkW) aCListenerS48S0201000_21.l0;
        c1369780lkW.LLILLJJLI.LJIIIIZZ((InterfaceC1369790lkX) ListProtector.get(c1369780lkW.LLJILJIL, aCListenerS48S0201000_21.i2), view);
        Context context = view.getContext();
        InterfaceC1369790lkX interfaceC1369790lkX = (InterfaceC1369790lkX) ListProtector.get(((C1369780lkW) aCListenerS48S0201000_21.l0).LLJILJIL, aCListenerS48S0201000_21.i2);
        C1369870lkf.LJI(((C1369780lkW) aCListenerS48S0201000_21.l0).LLIZ);
        C1440005kM.LIZ(new C1234290iDz(context, interfaceC1369790lkX));
    }

    public static final void onClick$4(ACListenerS48S0201000_21 aCListenerS48S0201000_21, View view) {
        if (C0R90.LIZ(1200L, view)) {
            return;
        }
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJIIZILJ(((C1370250llH) aCListenerS48S0201000_21.l0).LLILZLL);
        C1369870lkf.LJIIIIZZ(aCListenerS48S0201000_21.i2);
        C1370210llD c1370210llD = (C1370210llD) aCListenerS48S0201000_21.l1;
        c1370210llD.LL.LIZIZ((InterfaceC1370310llN) ListProtector.get(c1370210llD.LLJILJILJ, aCListenerS48S0201000_21.i2), aCListenerS48S0201000_21.i2);
    }

    public static final void onClick$5(ACListenerS48S0201000_21 aCListenerS48S0201000_21, View view) {
        if (C0R90.LIZ(1200L, view)) {
            return;
        }
        view.setTag(R.id.e12, Integer.valueOf(aCListenerS48S0201000_21.i2));
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        view.getContext();
        C1369870lkf.LJIIJ(((C1369810lkZ) aCListenerS48S0201000_21.l0).LLILZLL, ((C1369820lka) aCListenerS48S0201000_21.l1).LLILLL, aCListenerS48S0201000_21.i2, C1369870lkf.LJIL);
        C1369810lkZ c1369810lkZ = (C1369810lkZ) aCListenerS48S0201000_21.l0;
        c1369810lkZ.LLILLJJLI.LJIIIIZZ((InterfaceC1369790lkX) ListProtector.get(c1369810lkZ.LLIZLLLIL, aCListenerS48S0201000_21.i2), view);
        Context context = view.getContext();
        InterfaceC1369790lkX interfaceC1369790lkX = (InterfaceC1369790lkX) ListProtector.get(((C1369810lkZ) aCListenerS48S0201000_21.l0).LLIZLLLIL, aCListenerS48S0201000_21.i2);
        C1369870lkf.LJI(((C1369810lkZ) aCListenerS48S0201000_21.l0).LLILZLL);
        C1440005kM.LIZ(new C1234290iDz(context, interfaceC1369790lkX));
    }

    public static final void onClick$6(ACListenerS48S0201000_21 aCListenerS48S0201000_21, View view) {
        if (C0R90.LIZ(1200L, view)) {
            return;
        }
        ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
        C1369870lkf.LJIIZILJ((InterfaceC1370310llN) aCListenerS48S0201000_21.l0);
        C1369870lkf.LJIIIIZZ(aCListenerS48S0201000_21.i2);
        ((C1370230llF) aCListenerS48S0201000_21.l1).LL.LIZIZ((InterfaceC1370310llN) aCListenerS48S0201000_21.l0, aCListenerS48S0201000_21.i2);
    }

    public static final void onClick$7(ACListenerS48S0201000_21 aCListenerS48S0201000_21, View view) {
        String aid;
        C1353500lKG c1353500lKG;
        Object obj;
        String aid2;
        Object obj2;
        Object obj3;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!C036E.LIZ.LIZIZ()) {
            if (((VideoQuickCommentAssem) aCListenerS48S0201000_21.l0).LLLIIIIL) {
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIIZ(2131841046);
                c1389890mGx.LJIIJJI();
                ((VideoQuickCommentAssem) aCListenerS48S0201000_21.l0).LLLIIIIL = false;
                return;
            }
        }
        VideoQuickCommentAssem videoQuickCommentAssem = (VideoQuickCommentAssem) aCListenerS48S0201000_21.l0;
        videoQuickCommentAssem.LLLIIIIL = true;
        videoQuickCommentAssem.LLLILZJ = System.currentTimeMillis();
        ((VideoQuickCommentAssem) aCListenerS48S0201000_21.l0).LLLILZLLLI = "quick_emoji";
        VideoQuickCommentAssem videoQuickCommentAssem2 = (VideoQuickCommentAssem) aCListenerS48S0201000_21.l0;
        String str = (String) ListProtector.get((List) aCListenerS48S0201000_21.l1, aCListenerS48S0201000_21.i2);
        if (Build.VERSION.SDK_INT >= 29) {
            C1351210lGZ c1351210lGZ = (C1351210lGZ) videoQuickCommentAssem2.LLLJL.getValue();
            if (c1351210lGZ != null) {
                c1351210lGZ.LIZ();
            }
        } else {
            C1351210lGZ c1351210lGZ2 = (C1351210lGZ) videoQuickCommentAssem2.LLLJL.getValue();
            if (c1351210lGZ2 != null) {
                c1351210lGZ2.LIZIZ(85, 61);
            }
        }
        CommentService.LIZ.getClass();
        C523420Kfs.LIZ().LLIIJI(str);
        Aweme commentInputAweme = videoQuickCommentAssem2.getCommentInputAweme();
        if (commentInputAweme == null || (aid = commentInputAweme.getAid()) == null) {
            aid = "";
        }
        C1351190lGX c1351190lGX = videoQuickCommentAssem2.Gp().get(aid);
        if (!c1351190lGX.LIZIZ) {
            Fragment fragmentLIZ = C0RYF.LIZ(videoQuickCommentAssem2.getHostLifecycleOwner());
            String authorUid = null;
            if (fragmentLIZ != null && fragmentLIZ.isAdded() && fragmentLIZ.getContext() != null) {
                if (videoQuickCommentAssem2.LLLLII == null && !C523420Kfs.LIZ().LJJ()) {
                    videoQuickCommentAssem2.LLLLII = C523420Kfs.LIZ().LJLL(fragmentLIZ, videoQuickCommentAssem2.hashCode(), videoQuickCommentAssem2);
                }
                if (videoQuickCommentAssem2.LLLLIIL && (c1353500lKG = videoQuickCommentAssem2.LLLFF) != null) {
                    TuxTextView tuxTextView = new TuxTextView(fragmentLIZ.requireContext(), null, 6, 0);
                    C724270Sb3 c724270Sb3 = videoQuickCommentAssem2.LLJI;
                    if (c724270Sb3 != null) {
                        obj = c724270Sb3.LL;
                    } else {
                        obj = null;
                    }
                    Aweme aweme = ((VideoItemParams) obj).getAweme();
                    if (aweme != null) {
                        aid2 = aweme.getAid();
                    } else {
                        aid2 = null;
                    }
                    C724270Sb3 c724270Sb32 = videoQuickCommentAssem2.LLJI;
                    if (c724270Sb32 != null) {
                        obj2 = c724270Sb32.LL;
                    } else {
                        obj2 = null;
                    }
                    String str2 = ((VideoItemParams) obj2).mEventType;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C724270Sb3 c724270Sb33 = videoQuickCommentAssem2.LLJI;
                    if (c724270Sb33 != null) {
                        obj3 = c724270Sb33.LL;
                    } else {
                        obj3 = null;
                    }
                    Aweme aweme2 = ((VideoItemParams) obj3).getAweme();
                    if (aweme2 != null) {
                        authorUid = AwemeExtKt.getAuthorUid(aweme2);
                    }
                    C1348830lCj c1348830lCj = new C1348830lCj(c1353500lKG, c1353500lKG, tuxTextView, aid2, str2, null, authorUid, 0, 2816);
                    InterfaceC1351180lGW interfaceC1351180lGW = videoQuickCommentAssem2.LLLLII;
                    if (interfaceC1351180lGW != null) {
                        interfaceC1351180lGW.LJFF(c1348830lCj);
                    }
                    videoQuickCommentAssem2.LLLLIIL = false;
                }
            }
            InterfaceC1351180lGW interfaceC1351180lGW2 = videoQuickCommentAssem2.LLLLII;
            if (interfaceC1351180lGW2 != null) {
                interfaceC1351180lGW2.LIZ();
            }
            videoQuickCommentAssem2.LLLLIIIILLL = "emoji";
            Set setLLIIIZ = C13LP.LLIIIZ(c1351190lGX.LIZJ);
            setLLIIIZ.add(str);
            videoQuickCommentAssem2.Gp().LIZ(aid, C1351190lGX.LIZ(c1351190lGX, false, false, setLLIIIZ, 3));
            if (C523420Kfs.LIZ().LJJ()) {
                CommentContextSource commentContextSource = new CommentContextSource();
                commentContextSource.setCommonModel(new CommentCommonModel(videoQuickCommentAssem2.getCommentInputAweme(), null, videoQuickCommentAssem2.getEventType(), null, "", null, null, false, null, null, null, null, 0, null, false, false, true, false, 0, -1, -1, -1, false, false, false, false, false, false, false, null, null, 1, true, false, null, null, "", false, false, "", null, null, null, null, null, false, false, false, false, false, null, null, -1, null, null, null, "", false, false, false, "", null, null, Boolean.FALSE, 0, true, false, false, null, null, null, null, null, false));
                commentContextSource.getKeyboardModel().setQuickCommentActionType("emoji");
                C523420Kfs.LIZ().LJJLIIIJ(commentContextSource, C0RYF.LIZ(videoQuickCommentAssem2.getHostLifecycleOwner()), str, C1558520qew.LJIIL(videoQuickCommentAssem2), null, "quick_panel", "", 3, videoQuickCommentAssem2.Ip(), new AwS635S0100000_21(videoQuickCommentAssem2, 135), null);
            } else {
                InterfaceC1351180lGW interfaceC1351180lGW3 = videoQuickCommentAssem2.LLLLII;
                if (interfaceC1351180lGW3 != null) {
                    interfaceC1351180lGW3.LIZIZ(str, "quick_panel", "", videoQuickCommentAssem2.Ip());
                }
            }
            if (!C523420Kfs.LIZ().LJJ() && C2176211AEx.LIZJ()) {
                C1389880mGw c1389880mGw = new C1389880mGw(videoQuickCommentAssem2.LJJIJL());
                c1389880mGw.LJIIIIZZ(2131829227);
                c1389880mGw.LJIIJ();
            } else {
                C0RSR c0rsr = new C0RSR(1, null);
                c0rsr.LIZJ = aid;
                c0rsr.LIZLLL = str;
                C1440005kM.LIZ(c0rsr);
            }
        }
    }

    public static final void onClick$8(ACListenerS48S0201000_21 aCListenerS48S0201000_21, View view) {
        Function2<IMUser, Integer, Unit> function2 = ((C1388640mEw) aCListenerS48S0201000_21.l0).LLILZIL;
        if (function2 != null) {
            function2.invoke(((C1388670mEz) aCListenerS48S0201000_21.l1).LIZ, Integer.valueOf(aCListenerS48S0201000_21.i2));
        }
    }

    public static final void onClick$9(ACListenerS48S0201000_21 aCListenerS48S0201000_21, View view) {
        int i;
        C1348730lCZ c1348730lCZLJLL;
        String aid;
        AwemeControl awemeControl;
        FriendsV3TextCommentInputAssem friendsV3TextCommentInputAssem = (FriendsV3TextCommentInputAssem) aCListenerS48S0201000_21.l0;
        String str = (String) ListProtector.get((List) aCListenerS48S0201000_21.l1, aCListenerS48S0201000_21.i2);
        Aweme commentInputAweme = friendsV3TextCommentInputAssem.getCommentInputAweme();
        if ((commentInputAweme != null && (awemeControl = commentInputAweme.getAwemeControl()) != null && !awemeControl.canComment()) || str == null || str.length() == 0) {
            return;
        }
        CommentService.LIZ.getClass();
        if (C523420Kfs.LIZ().LJJ()) {
            CommentContextSource commentContextSource = new CommentContextSource();
            commentContextSource.setCommonModel(new CommentCommonModel(friendsV3TextCommentInputAssem.getCommentInputAweme(), null, C1389300mG0.LIZ(friendsV3TextCommentInputAssem.getPanelContext()), null, "click_friends_quick_panel", null, null, false, null, null, null, null, 0, null, false, false, true, false, 0, -1, -1, -1, false, false, false, false, false, false, false, null, null, 1, true, false, null, null, "", false, false, "", null, null, null, null, null, false, false, false, false, false, null, null, -1, null, null, null, "", false, true, false, "friends_v3_text_post_detail", null, null, Boolean.FALSE, 0, true, false, false, null, null, null, null, null, false));
            i = 1;
            C523420Kfs.LIZ().LJJLIIIJ(commentContextSource, C724240Sb0.LJI(friendsV3TextCommentInputAssem), str, C1558520qew.LJIIL(friendsV3TextCommentInputAssem), "click_friends_quick_panel", "click_friends_quick_panel", null, 3, null, new AwS635S0100000_21(friendsV3TextCommentInputAssem, 178), new AwS600S0100000_21(friendsV3TextCommentInputAssem, 377));
        } else {
            i = 1;
            if (friendsV3TextCommentInputAssem.LLJJJ == null) {
                Fragment fragmentLJI = C724240Sb0.LJI(friendsV3TextCommentInputAssem);
                if (fragmentLJI != null) {
                    c1348730lCZLJLL = C523420Kfs.LIZ().LJLL(fragmentLJI, friendsV3TextCommentInputAssem.hashCode(), friendsV3TextCommentInputAssem);
                } else {
                    c1348730lCZLJLL = null;
                }
                friendsV3TextCommentInputAssem.LLJJJ = c1348730lCZLJLL;
            }
            InterfaceC1351180lGW interfaceC1351180lGW = friendsV3TextCommentInputAssem.LLJJJ;
            if (interfaceC1351180lGW != null) {
                interfaceC1351180lGW.LIZIZ(str, "click_friends_quick_panel", "", new LinkedHashMap());
            }
        }
        C0RSR c0rsr = new C0RSR(i, null);
        Aweme commentInputAweme2 = friendsV3TextCommentInputAssem.getCommentInputAweme();
        if (commentInputAweme2 == null || (aid = commentInputAweme2.getAid()) == null) {
            aid = "";
        }
        c0rsr.LIZJ = aid;
        c0rsr.LIZLLL = str;
        C1440005kM.LIZ(c0rsr);
        C109100bB c109100bB = C109100bB.LIZ;
        Map<String, Object> mapIp = friendsV3TextCommentInputAssem.ip();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("action_type", "emoji");
        pairArr[i] = new Pair("emoji_id", str);
        Map mapLJIIL = C2097608Jq.LJIIL(mapIp, C2097608Jq.LJIIIIZZ(pairArr));
        c109100bB.getClass();
        C109100bB.LIZ("ttsocial_quick_comment_panel_click", mapLJIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS48S0201000_21(int i, int i2, C1369580lkC c1369580lkC, List<? extends InterfaceC1369790lkX> list) {
        this.$t = list;
        this.i2 = i;
        this.l0 = i2;
        this.l1 = c1369580lkC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS48S0201000_21(Context context, Context context2, VideoQuickCommentAssem videoQuickCommentAssem, List<String> list, int i) {
        this.$t = i;
        this.l0 = context2;
        this.l1 = videoQuickCommentAssem;
        this.i2 = list;
    }
}

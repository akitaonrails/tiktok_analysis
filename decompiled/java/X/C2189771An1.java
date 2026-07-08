package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.repost.card.FriendsV3RepostCardVideoContentAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.cell.component.video.FriendsV3VideoAssem;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerAbility;
import com.ss.android.ugc.aweme.lemon.postmode.model.ImageLoadMonitorParams;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS277S0300000_33;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1An1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189771An1 implements InterfaceC427850Gq7 {
    public final int $t;
    public Object l0;

    public static final void A3$0(C2189771An1 c2189771An1, Uri uri, C428600GrK c428600GrK) {
    }

    public static final void A3$1(C2189771An1 c2189771An1, Uri uri, C428600GrK c428600GrK) {
    }

    public static final void A3$2(C2189771An1 c2189771An1, Uri uri, C428600GrK c428600GrK) {
    }

    public static final void Bh$0(C2189771An1 c2189771An1, Uri uri, View view) {
    }

    public static final void Bh$1(C2189771An1 c2189771An1, Uri uri, View view) {
    }

    public static final void Bh$2(C2189771An1 c2189771An1, Uri uri, View view) {
    }

    public static final void Bh$3(C2189771An1 c2189771An1, Uri uri, View view) {
    }

    public static final void e1$0(C2189771An1 c2189771An1, Uri uri) {
    }

    public static final void e1$1(C2189771An1 c2189771An1, Uri uri) {
    }

    public static final void e1$2(C2189771An1 c2189771An1, Uri uri) {
    }

    public static final void e1$3(C2189771An1 c2189771An1, Uri uri) {
    }

    public static final void lg$0(C2189771An1 c2189771An1, Uri uri, Throwable th) {
    }

    public static final void lg$1(C2189771An1 c2189771An1, Uri uri, Throwable th) {
    }

    public static final void lg$2(C2189771An1 c2189771An1, Uri uri, Throwable th) {
    }

    public static final void lg$3(C2189771An1 c2189771An1, Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void A3(Uri uri, C428600GrK c428600GrK) {
        switch (this.$t) {
            case 0:
                A3$0(this, uri, c428600GrK);
                break;
            case 1:
                A3$1(this, uri, c428600GrK);
                break;
            case 2:
                A3$2(this, uri, c428600GrK);
                break;
            case 3:
                A3$3(this, uri, c428600GrK);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
            case 2:
                Ad$2(this, uri, view, c428600GrK, animatable);
                break;
            case 3:
                Ad$3(this, uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        switch (this.$t) {
            case 0:
                Bh$0(this, uri, view);
                break;
            case 1:
                Bh$1(this, uri, view);
                break;
            case 2:
                Bh$2(this, uri, view);
                break;
            case 3:
                Bh$3(this, uri, view);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
            case 2:
                cm$2(this, uri, view, th);
                break;
            case 3:
                cm$3(this, uri, view, th);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
        switch (this.$t) {
            case 0:
                e1$0(this, uri);
                break;
            case 1:
                e1$1(this, uri);
                break;
            case 2:
                e1$2(this, uri);
                break;
            case 3:
                e1$3(this, uri);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
        switch (this.$t) {
            case 0:
                lg$0(this, uri, th);
                break;
            case 1:
                lg$1(this, uri, th);
                break;
            case 2:
                lg$2(this, uri, th);
                break;
            case 3:
                lg$3(this, uri, th);
                break;
        }
    }

    public C2189771An1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void A3$3(C2189771An1 c2189771An1, Uri uri, C428600GrK c428600GrK) {
        C21693219v8 c21693219v8 = (C21693219v8) c2189771An1.l0;
        UrlModel urlModel = c21693219v8.LJII;
        if (urlModel != null) {
            int width = urlModel.getWidth();
            int height = urlModel.getHeight();
            if (!c21693219v8.LIZLLL) {
                c21693219v8.LIZLLL = true;
                c21693219v8.LJIIJJI.LIZ(width, height);
                c21693219v8.LJIIIZ.LIZ();
            }
        }
    }

    public static final void cm$0(C2189771An1 c2189771An1, Uri uri, View view, Throwable th) {
        String strLJJJLIIL;
        String message;
        C1483410ohn c1483410ohnXc;
        C1483410ohn c1483410ohnXc2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailed for cover, uri=");
        sbLIZ.append(uri);
        sbLIZ.append(", curSourceId=");
        FriendsV3PlayerAbility friendsV3PlayerAbilityZp = ((FriendsV3RepostCardVideoContentAssem) c2189771An1.l0).zp();
        String strLJJJLIIL2 = null;
        if (friendsV3PlayerAbilityZp != null && (c1483410ohnXc2 = friendsV3PlayerAbilityZp.xc()) != null) {
            strLJJJLIIL = c1483410ohnXc2.LJJJLIIL();
        } else {
            strLJJJLIIL = null;
        }
        sbLIZ.append(strLJJJLIIL);
        sbLIZ.append(", throwableMsg=");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C0W17.LIZ("FriendsV3RepostVideoContentAssem", C2188811AlT.LIZIZ(sbLIZ));
        FriendsV3PlayerAbility friendsV3PlayerAbilityZp2 = ((FriendsV3RepostCardVideoContentAssem) c2189771An1.l0).zp();
        if (friendsV3PlayerAbilityZp2 != null && friendsV3PlayerAbilityZp2.isPlaying()) {
            FriendsV3RepostCardVideoContentAssem friendsV3RepostCardVideoContentAssem = (FriendsV3RepostCardVideoContentAssem) c2189771An1.l0;
            FriendsV3PlayerAbility friendsV3PlayerAbilityZp3 = friendsV3RepostCardVideoContentAssem.zp();
            if (friendsV3PlayerAbilityZp3 != null && (c1483410ohnXc = friendsV3PlayerAbilityZp3.xc()) != null) {
                strLJJJLIIL2 = c1483410ohnXc.LJJJLIIL();
            }
            friendsV3RepostCardVideoContentAssem.Ap(strLJJJLIIL2);
            return;
        }
        FriendsV3RepostCardVideoContentAssem friendsV3RepostCardVideoContentAssem2 = (FriendsV3RepostCardVideoContentAssem) c2189771An1.l0;
        friendsV3RepostCardVideoContentAssem2.tp(new AwS577S0100000_33(friendsV3RepostCardVideoContentAssem2, 2255));
    }

    public static final void cm$1(C2189771An1 c2189771An1, Uri uri, View view, Throwable th) {
        String strLJJJLIIL;
        String message;
        C1483410ohn c1483410ohnXc;
        C1483410ohn c1483410ohnXc2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFailed for cover, uri=");
        sbLIZ.append(uri);
        sbLIZ.append(", curSourceId=");
        FriendsV3PlayerAbility friendsV3PlayerAbilityAp = ((FriendsV3VideoAssem) c2189771An1.l0).Ap();
        String strLJJJLIIL2 = null;
        if (friendsV3PlayerAbilityAp != null && (c1483410ohnXc2 = friendsV3PlayerAbilityAp.xc()) != null) {
            strLJJJLIIL = c1483410ohnXc2.LJJJLIIL();
        } else {
            strLJJJLIIL = null;
        }
        sbLIZ.append(strLJJJLIIL);
        sbLIZ.append(", throwableMsg=");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C0W17.LIZ("FriendsV3VideoAssem", C2188811AlT.LIZIZ(sbLIZ));
        FriendsV3PlayerAbility friendsV3PlayerAbilityAp2 = ((FriendsV3VideoAssem) c2189771An1.l0).Ap();
        if (friendsV3PlayerAbilityAp2 != null && friendsV3PlayerAbilityAp2.isPlaying()) {
            FriendsV3VideoAssem friendsV3VideoAssem = (FriendsV3VideoAssem) c2189771An1.l0;
            FriendsV3PlayerAbility friendsV3PlayerAbilityAp3 = friendsV3VideoAssem.Ap();
            if (friendsV3PlayerAbilityAp3 != null && (c1483410ohnXc = friendsV3PlayerAbilityAp3.xc()) != null) {
                strLJJJLIIL2 = c1483410ohnXc.LJJJLIIL();
            }
            friendsV3VideoAssem.Fp(strLJJJLIIL2);
            return;
        }
        FriendsV3VideoAssem friendsV3VideoAssem2 = (FriendsV3VideoAssem) c2189771An1.l0;
        friendsV3VideoAssem2.tp(new AwS577S0100000_33(friendsV3VideoAssem2, 2274));
    }

    public static final void cm$2(C2189771An1 c2189771An1, Uri uri, View view, Throwable th) {
        C16FR c16fr;
        int i;
        int iLIZ;
        int iLJ;
        String strLJFF;
        String string;
        String aid;
        C1494600ozq requestInfo;
        View viewLJLLLL;
        Pair<Integer, Integer> pair;
        boolean z;
        C16FP c16fp;
        int iIntValue;
        int iIntValue2;
        C1494690ozz c1494690ozz = null;
        if (((C21696019va) c2189771An1.l0).LLILLJJLI && C142800gc.LIZ()) {
            C21696019va c21696019va = (C21696019va) c2189771An1.l0;
            if (c21696019va.LLILZLL == null) {
                try {
                    ViewStub viewStub = c21696019va.LLILZIL;
                    if (viewStub != null) {
                        viewStub.setLayoutResource(R.layout.cb9);
                        viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                    } else {
                        viewLJLLLL = null;
                    }
                    c21696019va.LLILZLL = (C16FP) viewLJLLLL;
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("inflate photoStatusView failed by error ");
                    sbLIZ.append(e);
                    C0W17.LIZ("SinglePhotoView", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            C21696019va c21696019va2 = (C21696019va) c2189771An1.l0;
            C21696319vd c21696319vd = c21696019va2.LLJJIII;
            if (c21696319vd != null) {
                pair = c21696319vd.LIZIZ;
            } else {
                pair = null;
            }
            C16FP c16fp2 = c21696019va2.LLILZLL;
            if (c16fp2 != null) {
                C786410Ut5.LJLLLLLL(0, c16fp2);
            }
            C16FP c16fp3 = c21696019va2.LLILZLL;
            if (c16fp3 != null) {
                c16fp3.LIZIZ(C16FR.RETRY);
            }
            C16FP c16fp4 = c21696019va2.LLILZLL;
            if (c16fp4 != null) {
                if (pair != null) {
                    iIntValue = pair.getFirst().intValue();
                    iIntValue2 = pair.getSecond().intValue();
                } else {
                    iIntValue = 0;
                    iIntValue2 = 0;
                }
                ViewGroup.LayoutParams layoutParams = c16fp4.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = iIntValue;
                    layoutParams.height = iIntValue2;
                    C786410Ut5.W5(c16fp4, layoutParams);
                }
            }
            C21696319vd c21696319vd2 = c21696019va2.LLJJIII;
            if (c21696319vd2 != null) {
                z = c21696319vd2.LIZLLL;
            } else {
                z = false;
            }
            c21696019va2.LIZ(z);
            Aweme aweme = c21696019va2.LLJJ;
            if (aweme != null && (c16fp = c21696019va2.LLILZLL) != null) {
                c16fp.LIZ(new AwS277S0300000_33(c21696019va2, (C21696019va) pair, (Pair<Integer, Integer>) aweme, (Aweme) 6));
            }
        } else {
            C21696019va c21696019va3 = (C21696019va) c2189771An1.l0;
            C16FP c16fp5 = c21696019va3.LLILZLL;
            if (c16fp5 != null) {
                if (c21696019va3.LLILLJJLI) {
                    c16fr = C16FR.RETRY;
                } else {
                    c16fr = C16FR.LOADING_FAIL;
                }
                c16fp5.LIZIZ(c16fr);
            }
        }
        C21696519vf c21696519vf = C21696519vf.LIZ;
        C21696019va c21696019va4 = (C21696019va) c2189771An1.l0;
        C21696319vd c21696319vd3 = c21696019va4.LLJJIII;
        if (c21696319vd3 != null) {
            i = c21696319vd3.LIZJ;
        } else {
            i = 0;
        }
        Aweme aweme2 = c21696019va4.LLJJ;
        if (aweme2 != null) {
            iLIZ = C0S7E.LIZ(aweme2);
        } else {
            iLIZ = 0;
        }
        if (th != null) {
            iLJ = C2252408s6.LJ(th);
            strLJFF = C2252408s6.LJFF(th);
        } else {
            iLJ = -1;
            strLJFF = "null";
        }
        if (th instanceof C1494690ozz) {
            c1494690ozz = (C1494690ozz) th;
        }
        String str = "";
        if (c1494690ozz == null || (requestInfo = c1494690ozz.getRequestInfo()) == null || (string = requestInfo.toString()) == null) {
            string = "";
        }
        Aweme aweme3 = ((C21696019va) c2189771An1.l0).LLJJ;
        if (aweme3 != null && (aid = aweme3.getAid()) != null) {
            str = aid;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - ((C21696019va) c2189771An1.l0).LLJJI;
        c21696519vf.getClass();
        C109100bB c109100bB = C109100bB.LIZ;
        C13DA c13da = new C13DA();
        c13da.putAll(C2097608Jq.LJIIIIZZ(new Pair("image_index", Integer.valueOf(i)), new Pair("total_count", Integer.valueOf(iLIZ)), new Pair("error_type", Integer.valueOf(iLJ)), new Pair("error_msg", strLJFF.substring(0, Math.min(strLJFF.length(), 100))), new Pair("request_info", string), new Pair("group_id", str), new Pair("duration", Long.valueOf(jCurrentTimeMillis)), new Pair("friends_tab_version", "v3.0")));
        Map mapBuild = c13da.build();
        c109100bB.getClass();
        C109100bB.LIZ("image_play_fail", mapBuild);
    }

    public static final void cm$3(C2189771An1 c2189771An1, Uri uri, View view, Throwable th) {
        int iLIZ;
        C21693219v8 c21693219v8 = (C21693219v8) c2189771An1.l0;
        if (th != null) {
            iLIZ = C2177208fy.LIZ(th);
        } else {
            iLIZ = -1;
        }
        c21693219v8.LIZ(iLIZ);
    }

    public static final void Ad$0(C2189771An1 c2189771An1, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        String strLJJJLIIL;
        C1483410ohn c1483410ohnXc;
        C1483410ohn c1483410ohnXc2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onComplete for cover, uri=");
        sbLIZ.append(uri);
        sbLIZ.append(", curSourceId=");
        FriendsV3PlayerAbility friendsV3PlayerAbilityZp = ((FriendsV3RepostCardVideoContentAssem) c2189771An1.l0).zp();
        String strLJJJLIIL2 = null;
        if (friendsV3PlayerAbilityZp != null && (c1483410ohnXc2 = friendsV3PlayerAbilityZp.xc()) != null) {
            strLJJJLIIL = c1483410ohnXc2.LJJJLIIL();
        } else {
            strLJJJLIIL = null;
        }
        sbLIZ.append(strLJJJLIIL);
        C0W17.LIZJ("FriendsV3RepostVideoContentAssem", C2188811AlT.LIZIZ(sbLIZ));
        FriendsV3PlayerAbility friendsV3PlayerAbilityZp2 = ((FriendsV3RepostCardVideoContentAssem) c2189771An1.l0).zp();
        if (friendsV3PlayerAbilityZp2 != null && friendsV3PlayerAbilityZp2.isPlaying()) {
            FriendsV3RepostCardVideoContentAssem friendsV3RepostCardVideoContentAssem = (FriendsV3RepostCardVideoContentAssem) c2189771An1.l0;
            FriendsV3PlayerAbility friendsV3PlayerAbilityZp3 = friendsV3RepostCardVideoContentAssem.zp();
            if (friendsV3PlayerAbilityZp3 != null && (c1483410ohnXc = friendsV3PlayerAbilityZp3.xc()) != null) {
                strLJJJLIIL2 = c1483410ohnXc.LJJJLIIL();
            }
            friendsV3RepostCardVideoContentAssem.Ap(strLJJJLIIL2);
        }
    }

    public static final void Ad$1(C2189771An1 c2189771An1, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        String strLJJJLIIL;
        C1483410ohn c1483410ohnXc;
        C1483410ohn c1483410ohnXc2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onComplete for cover, uri=");
        sbLIZ.append(uri);
        sbLIZ.append(", curSourceId=");
        FriendsV3PlayerAbility friendsV3PlayerAbilityAp = ((FriendsV3VideoAssem) c2189771An1.l0).Ap();
        String strLJJJLIIL2 = null;
        if (friendsV3PlayerAbilityAp != null && (c1483410ohnXc2 = friendsV3PlayerAbilityAp.xc()) != null) {
            strLJJJLIIL = c1483410ohnXc2.LJJJLIIL();
        } else {
            strLJJJLIIL = null;
        }
        sbLIZ.append(strLJJJLIIL);
        C0W17.LIZJ("FriendsV3VideoAssem", C2188811AlT.LIZIZ(sbLIZ));
        FriendsV3PlayerAbility friendsV3PlayerAbilityAp2 = ((FriendsV3VideoAssem) c2189771An1.l0).Ap();
        if (friendsV3PlayerAbilityAp2 != null && friendsV3PlayerAbilityAp2.isPlaying()) {
            FriendsV3VideoAssem friendsV3VideoAssem = (FriendsV3VideoAssem) c2189771An1.l0;
            FriendsV3PlayerAbility friendsV3PlayerAbilityAp3 = friendsV3VideoAssem.Ap();
            if (friendsV3PlayerAbilityAp3 != null && (c1483410ohnXc = friendsV3PlayerAbilityAp3.xc()) != null) {
                strLJJJLIIL2 = c1483410ohnXc.LJJJLIIL();
            }
            friendsV3VideoAssem.Fp(strLJJJLIIL2);
        }
    }

    public static final void Ad$2(C2189771An1 c2189771An1, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        C16FR c16fr;
        if (c428600GrK != null) {
            C21696019va c21696019va = (C21696019va) c2189771An1.l0;
            c21696019va.LLJILJIL = false;
            c21696019va.LLJJI = System.currentTimeMillis();
            C16FP c16fp = ((C21696019va) c2189771An1.l0).LLILZLL;
            if (c16fp != null) {
                c16fp.LIZIZ(C16FR.LOADING_SUCCESS);
                return;
            }
            return;
        }
        C21696019va c21696019va2 = (C21696019va) c2189771An1.l0;
        C16FP c16fp2 = c21696019va2.LLILZLL;
        if (c16fp2 == null) {
            return;
        }
        if (c21696019va2.LLILLJJLI) {
            c16fr = C16FR.RETRY;
        } else {
            c16fr = C16FR.LOADING_FAIL;
        }
        c16fp2.LIZIZ(c16fr);
    }

    public static final void Ad$3(C2189771An1 c2189771An1, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        String aid;
        Aweme aweme;
        if (c428600GrK != null) {
            C21693219v8 c21693219v8 = (C21693219v8) c2189771An1.l0;
            int i = c428600GrK.LIZ;
            int i2 = c428600GrK.LIZIZ;
            if (!c21693219v8.LIZLLL) {
                c21693219v8.LIZLLL = true;
                c21693219v8.LJIIJJI.LIZ(i, i2);
                c21693219v8.LJIIIZ.LIZ();
            }
            C21693219v8 c21693219v82 = (C21693219v8) c2189771An1.l0;
            c21693219v82.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - c21693219v82.LJIIIIZZ;
            int code = EnumC995390c0f.SUCCESS.getCode();
            String str = c21693219v82.LJ;
            VideoItemParams videoItemParams = c21693219v82.LJFF;
            if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            ImageLoadMonitorParams imageLoadMonitorParams = new ImageLoadMonitorParams(c21693219v82.LJI, code, jElapsedRealtime, aid, str, 32);
            InterfaceC21693419vA interfaceC21693419vA = c21693219v82.LIZIZ;
            if (interfaceC21693419vA != null) {
                interfaceC21693419vA.LIZ(imageLoadMonitorParams);
                return;
            }
            return;
        }
        ((C21693219v8) c2189771An1.l0).LIZ(-2);
    }
}

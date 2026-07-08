package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.IMInfo;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734030Sqn extends AbstractC737180Svs implements InterfaceC734510SrZ {
    public final C735210Ssh LL;
    public final C734060Sqq LLILLJJLI;
    public final WeakReference<C0HTT<C737030Svd>> LLILLL;
    public final C734550Srd LLILZ;
    public Function2<? super Boolean, ? super Exception, Unit> LLILZIL;

    @Override // X.AbstractC737180Svs
    public final void LJJ() {
        LJJIIZ(true);
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "long_press_like_video_action";
    }

    @Override // X.AbstractC737180Svs
    public final View LIZ() {
        int i;
        int i2;
        if (this.LL.LIZ.getUserDigg() == 0) {
            i = 2131836883;
            i2 = R.raw.icon_like;
        } else {
            i = 2131836882;
            i2 = R.raw.icon_like_slash;
        }
        View viewLJLLJ = C786410Ut5.LJLLJ(this.LL.LIZIZ, R.layout.efk, null);
        if (viewLJLLJ == null) {
            return null;
        }
        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.k1_);
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            tuxIconView.setIconRes(i2);
            tuxIconView.setTintColorRes(R.attr.a1h);
        }
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.xom);
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(i);
        }
        C427760Gpy c427760Gpy = (C427760Gpy) viewLJLLJ.findViewById(R.id.bkc);
        if (c427760Gpy != null) {
            C786410Ut5.LLLLLL(c427760Gpy, 8);
        }
        C427690Gpr.LJ(viewLJLLJ, 0.0f);
        C1378990lzN.LIZIZ(viewLJLLJ, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        return viewLJLLJ;
    }

    @Override // X.AbstractC737180Svs
    public final boolean LIZIZ() {
        if (C1017070cZd.LJII(this.LL.LIZ) || AwemeExtKt.isScheduleVideo(this.LL.LIZ) || ((C0OAD.LIZIZ(this.LL.LIZ) && this.LL.LIZ.getUserDigg() == 0) || C1017070cZd.LJLJLLL(this.LL.LIZ) || !this.LL.LIZ.isCanPlay() || AwemeExtKt.isProhibited(this.LL.LIZ))) {
            return false;
        }
        if (AwemeExtKt.isDelete(this.LL.LIZ) && this.LL.LIZ.getUserDigg() == 0) {
            return false;
        }
        if (this.LL.LIZ.getVideoControl() != null && this.LL.LIZ.getVideoControl().timerStatus == 0) {
            return false;
        }
        if (C729980SkG.LJIIIIZZ(this.LL.LIZ)) {
            C735280Sso c735280Sso = C735280Sso.LIZ;
            Aweme aweme = this.LL.LIZ;
            c735280Sso.getClass();
            if (C735280Sso.LJFF(aweme)) {
                return false;
            }
        }
        if (this.LL.LIZ.getUserDigg() != 1) {
            C735280Sso c735280Sso2 = C735280Sso.LIZ;
            Aweme aweme2 = this.LL.LIZ;
            c735280Sso2.getClass();
            if (C735280Sso.LIZJ(aweme2) && C735280Sso.LJ(this.LL.LIZ)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return this.LL.LIZ.getUserDigg() == 0 ? R.raw.icon_like_fill : R.raw.icon_like_fill_slash;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return this.LL.LIZ.getUserDigg() == 0 ? 2131836883 : 2131836882;
    }

    @Override // X.InterfaceC734510SrZ
    public final void KE(Exception exc) {
        if (this.LL.LJIIIIZZ) {
            Function2<? super Boolean, ? super Exception, Unit> function2 = this.LLILZIL;
            if (function2 != null) {
                function2.invoke(Boolean.FALSE, exc);
                return;
            }
            return;
        }
        C0HTT<C737030Svd> c0htt = this.LLILLL.get();
        if (c0htt == null) {
            return;
        }
        c0htt.LLIIL(new C737030Svd(100, new C734050Sqp(this.LL.LIZ.getUserDigg(), false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(boolean r11) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C734030Sqn.LJJIIZ(boolean):void");
    }

    @Override // X.InterfaceC734510SrZ
    public final void oP1(C0WIY<String, Integer> c0wiy) {
        String str;
        int iIntValue;
        String str2;
        Integer num;
        if (c0wiy != null) {
            str = c0wiy.LIZ;
        } else {
            str = null;
        }
        C737030Svd c737030Svd = new C737030Svd(13, str);
        Bundle bundle = new Bundle();
        if (c0wiy != null && (num = c0wiy.LIZIZ) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        String aid = this.LL.LIZ.getAid();
        if (c0wiy != null) {
            str2 = c0wiy.LIZ;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(aid, str2)) {
            this.LL.LIZ.setUserDigg(iIntValue);
        }
        bundle.putInt("user_digged", iIntValue);
        c737030Svd.LIZJ = bundle;
        C1440005kM.LIZ(c737030Svd);
        C1440005kM.LIZ(new C734240Sr8(iIntValue));
        if (this.LL.LJIIIIZZ) {
            Function2<? super Boolean, ? super Exception, Unit> function2 = this.LLILZIL;
            if (function2 != null) {
                function2.invoke(Boolean.TRUE, null);
                return;
            }
            return;
        }
        C0HTT<C737030Svd> c0htt = this.LLILLL.get();
        if (c0htt == null) {
            return;
        }
        c0htt.LLIIL(new C737030Svd(100, new C734050Sqp(iIntValue, true)));
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        LJJIIZ(false);
    }

    public C734030Sqn(C735210Ssh c735210Ssh, C734060Sqq c734060Sqq, C0HTT<C737030Svd> c0htt) {
        this.LL = c735210Ssh;
        this.LLILLJJLI = c734060Sqq;
        this.LLILLL = new WeakReference<>(c0htt);
        C734550Srd c734550Srd = new C734550Srd();
        this.LLILZ = c734550Srd;
        c734550Srd.LJIIJ(new C737390SwD());
        c734550Srd.LLILLJJLI = this;
    }

    public final void LJJIJLIJ(Aweme aweme, int i, boolean z) {
        C0WIY c0wiy;
        StandardBusinessModel standardBusinessModel;
        IMInfo imInfo;
        User user;
        StandardBusinessModel standardBusinessModel2;
        IMInfo imInfo2;
        User user2;
        String logExtra;
        String string;
        String string2;
        Long creativeId;
        Long adId;
        if (!C740470T2v.LIZIZ()) {
            C740470T2v.LIZJ();
        }
        if (!TextUtils.isEmpty(this.LLILLJJLI.LIZ) && i == 1) {
            C328640CuU.LIZ(new C328650CuV(1, aweme.getAid(), System.currentTimeMillis(), this.LLILLJJLI.LIZ));
        }
        HashMap map = new HashMap();
        map.put("aweme_id", aweme.getAid());
        map.put("type", String.valueOf(i));
        map.put("channel_id", String.valueOf(C737370SwB.LIZ(this.LLILLJJLI.LIZ)));
        map.put("friends_upvote", String.valueOf(z));
        String uid = null;
        if (AwemeExtKt.isMonetizationTraffic(aweme)) {
            Context context = this.LL.LIZIZ;
            AwemeRawAd monetizationData = AwemeExtKt.getMonetizationData(aweme);
            if (monetizationData != null) {
                logExtra = monetizationData.getLogExtra();
            } else {
                logExtra = null;
            }
            AwemeRawAd monetizationData2 = AwemeExtKt.getMonetizationData(aweme);
            if (monetizationData2 != null && (adId = monetizationData2.getAdId()) != null) {
                string = adId.toString();
            } else {
                string = null;
            }
            AwemeRawAd monetizationData3 = AwemeExtKt.getMonetizationData(aweme);
            if (monetizationData3 != null && (creativeId = monetizationData3.getCreativeId()) != null) {
                string2 = creativeId.toString();
            } else {
                string2 = null;
            }
            C735080SsU.LIZ(context, logExtra, string, string2, map);
        } else {
            C735080SsU.LIZJ(this.LLILLJJLI.LIZ, null, map);
        }
        ContentModel contentModel = aweme.getContentModel();
        if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (imInfo = standardBusinessModel.getImInfo()) != null && (user = imInfo.user) != null && user.getUid() != null) {
            ContentModel contentModel2 = aweme.getContentModel();
            if (contentModel2 != null && (standardBusinessModel2 = contentModel2.standardBusinessModel) != null && (imInfo2 = standardBusinessModel2.getImInfo()) != null && (user2 = imInfo2.user) != null) {
                uid = user2.getUid();
            }
            c0wiy = new C0WIY(uid, EnumC733850SqV.FYP.getValue());
        } else if (AwemeBizExtKt.getDmSenderUid(aweme) != null) {
            c0wiy = new C0WIY(AwemeBizExtKt.getDmSenderUid(aweme), EnumC733850SqV.DM_PAGE.getValue());
        } else {
            c0wiy = new C0WIY(null, null);
        }
        F f = c0wiy.LIZ;
        S s = c0wiy.LIZIZ;
        if (f != 0) {
            map.put("dm_share_uid", f);
        }
        if (s != 0) {
            map.put("dm_share_scene", s);
        }
        this.LLILZ.LIZJ(map);
        if (i == 1) {
            C1440005kM.LIZ(new C737030Svd(1301, aweme.getAid()));
        }
    }
}

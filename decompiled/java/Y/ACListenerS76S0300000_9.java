package Y;

import X.AbstractC848400XPy;
import X.C06W7;
import X.C0OL3;
import X.C0OOP;
import X.C0OPQ;
import X.C0P08;
import X.C0P4Z;
import X.C0PEM;
import X.C0XQ7;
import X.C11S5;
import X.C127K;
import X.C1389890mGx;
import X.C1701940uOG;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19EG;
import X.C20145813s8;
import X.C20684815ws;
import X.C23250099c;
import X.C2344009Gk;
import X.C259800zU;
import X.C418440Gaw;
import X.C596430NaL;
import X.C616200OEw;
import X.C617270OIz;
import X.C631370Opb;
import X.C724240Sb0;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.C946803n0;
import X.EnumC617170OIp;
import X.EnumC623450Ocp;
import X.InterfaceC596410NaJ;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageInteractionAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.poll.PollCreateContentAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinPhotoItem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.setting.BulletinSettingParentCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollCreateViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.music.model.AddSongEntranceViewModel;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeSwitchComponent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.tag.FeedMusicFanSpotlightAssem;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS253S0300000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class ACListenerS76S0300000_9 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$0(ACListenerS76S0300000_9 aCListenerS76S0300000_9, View view) {
        String string;
        String str;
        String string2;
        String string3;
        String str2 = "";
        if (!((BulletinPageInteractionAssem) aCListenerS76S0300000_9.l0).Vo().To() && ((BulletinPageInteractionAssem) aCListenerS76S0300000_9.l0).Vo().Nl()) {
            BulletinPageInteractionAssem bulletinPageInteractionAssem = (BulletinPageInteractionAssem) aCListenerS76S0300000_9.l0;
            Long lLJJJ = ((BulletinBaseItem) aCListenerS76S0300000_9.l1).LJJJ();
            if (lLJJJ != null && (string3 = lLJJJ.toString()) != null) {
                str2 = string3;
            }
            bulletinPageInteractionAssem.rE1(str2, "click_longpress_download", null);
            return;
        }
        C0OPQ c0opq = C0OPQ.LIZ;
        Long l = ((BulletinPageInteractionAssem) aCListenerS76S0300000_9.l0).Vo().LLILLJJLI;
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        Long lLJJJ2 = ((BulletinBaseItem) aCListenerS76S0300000_9.l1).LJJJ();
        if (lLJJJ2 != null && (string2 = lLJJJ2.toString()) != null) {
            str2 = string2;
        }
        if (((BulletinBaseItem) aCListenerS76S0300000_9.l1) instanceof BulletinPhotoItem) {
            str = "photo";
        } else {
            str = "video";
        }
        c0opq.getClass();
        C0OPQ.LJIJJ("button_click_after_longpress_message", string, str2, str);
        ((BulletinPageInteractionAssem) aCListenerS76S0300000_9.l0).BM1();
        BulletinProfileViewModel bulletinProfileViewModelVo = ((BulletinPageInteractionAssem) aCListenerS76S0300000_9.l0).Vo();
        boolean z = ((BulletinBaseItem) aCListenerS76S0300000_9.l1) instanceof BulletinPhotoItem;
        String str3 = (String) ((C259800zU) aCListenerS76S0300000_9.l2).element;
        Long l2 = bulletinProfileViewModelVo.LLILLJJLI;
        if (l2 != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bulletinProfileViewModelVo), C0PEM.LIZJ, null, new C0OL3(bulletinProfileViewModelVo, l2.longValue(), z, str3, null), 2);
        }
    }

    public static final void onClick$1(ACListenerS76S0300000_9 aCListenerS76S0300000_9, View view) {
        C0OOP c0oop;
        String str;
        ((BulletinPageInteractionAssem) aCListenerS76S0300000_9.l0).BM1();
        BulletinBaseItem bulletinBaseItem = (BulletinBaseItem) aCListenerS76S0300000_9.l1;
        if ((bulletinBaseItem instanceof C0OOP) && (c0oop = (C0OOP) bulletinBaseItem) != null && (str = c0oop.LLJILJIL) != null) {
            BulletinPageInteractionAssem bulletinPageInteractionAssem = (BulletinPageInteractionAssem) aCListenerS76S0300000_9.l0;
            View view2 = (View) aCListenerS76S0300000_9.l2;
            Context context = bulletinPageInteractionAssem.getContext();
            if (context != null) {
                Cert certFindCert = CertProviderManagerKt.findCert("bpea-inbox_bulletin_copy_text", 1476399130);
                try {
                    if (C06W7.LIZIZ(context)) {
                        C20145813s8.LIZ("copy_im_label", str, context, certFindCert);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                C1389890mGx c1389890mGx = new C1389890mGx(view2);
                c1389890mGx.LJIIIZ(2131828056);
                c1389890mGx.LJIIJJI();
            }
        }
    }

    public static final void onClick$2(ACListenerS76S0300000_9 aCListenerS76S0300000_9, View view) {
        String strInvoke;
        Integer num;
        Long l;
        Function0<String> function0 = ((C617270OIz) aCListenerS76S0300000_9.l0).LLILZIL;
        if (function0 != null && (strInvoke = function0.invoke()) != null) {
            BulletinSettingParentCell bulletinSettingParentCell = (BulletinSettingParentCell) aCListenerS76S0300000_9.l1;
            C127K c127k = (C127K) aCListenerS76S0300000_9.l2;
            C617270OIz c617270OIz = bulletinSettingParentCell.LLILLJJLI;
            if (c617270OIz != null) {
                num = c617270OIz.LLILLL;
            } else {
                num = null;
            }
            int type = EnumC617170OIp.LIVE_TOOLS_PARENT.getType();
            if (num != null && num.intValue() == type && (l = bulletinSettingParentCell.I5().LLILLJJLI) != null) {
                C0OPQ.LJIIIIZZ(C0OPQ.LIZ, String.valueOf(l.longValue()), "auto_share", bulletinSettingParentCell.I5().IE(), 0, null, 24);
            }
            SmartRouter.buildRoute(c127k.getContext(), strInvoke).open(10001, new C0P4Z(bulletinSettingParentCell, 0));
        }
    }

    public static final void onClick$3(ACListenerS76S0300000_9 aCListenerS76S0300000_9, View view) {
        String mid;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((FeedMusicFanSpotlightAssem) aCListenerS76S0300000_9.l0).getContext(), "//user/profile");
        smartRouteBuildRoute.withParam("uid", ((User) aCListenerS76S0300000_9.l1).getUid());
        smartRouteBuildRoute.withParam("sec_user_id", ((User) aCListenerS76S0300000_9.l1).getSecUid());
        smartRouteBuildRoute.withParam("profile_from_scene", "1026");
        smartRouteBuildRoute.withParam("enter_from", ((VideoItemParams) C631370Opb.LIZ((FeedMusicFanSpotlightAssem) aCListenerS76S0300000_9.l0)).mEventType);
        smartRouteBuildRoute.open();
        HashMap map = new HashMap();
        map.put("button_name", "homepage_hot_anchor");
        Music music = ((Aweme) aCListenerS76S0300000_9.l2).getMusic();
        String str = "";
        if (music == null || (mid = music.getMid()) == null) {
            mid = "";
        }
        map.put("music_id", mid);
        String aid = ((Aweme) aCListenerS76S0300000_9.l2).getAid();
        if (aid != null) {
            str = aid;
        }
        map.put("group_id", str);
        C20684815ws.LJIILLIIL("music_fan_spotlight_button_click", map);
    }

    public static final void onClick$4(ACListenerS76S0300000_9 aCListenerS76S0300000_9, View view) {
        Fragment fragmentLIZ;
        Activity activityLIZIZ = C737910Sx3.LIZIZ((Context) aCListenerS76S0300000_9.l0);
        if (activityLIZIZ == null || (fragmentLIZ = C946803n0.LIZ((C0P08) aCListenerS76S0300000_9.l1)) == null) {
            return;
        }
        ((AddSongEntranceViewModel) aCListenerS76S0300000_9.l2).onClick(fragmentLIZ, activityLIZIZ);
    }

    public static final void onClick$5(ACListenerS76S0300000_9 aCListenerS76S0300000_9, View view) {
        String string;
        OfflineModeSwitchComponent.LLJLLIL.LIZIZ(AFwS195S0000000_9.get$arr$(294));
        ((OfflineModeSwitchComponent) aCListenerS76S0300000_9.l0).fo(EnumC623450Ocp.LOAD_EMPTY);
        C19EG c19egLIZ = C724240Sb0.LIZ((OfflineModeSwitchComponent) aCListenerS76S0300000_9.l0);
        if (c19egLIZ == null || (string = c19egLIZ.getString(2131838570)) == null) {
            string = "";
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        Drawable drawable = (Drawable) aCListenerS76S0300000_9.l2;
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZ = drawable;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
        c1722300uv6.LIZLLL = iLIZIZ;
        c1722300uv6.LJ = iLIZIZ2;
        c1722300uv6.LJI = string;
        c1722300uv6.LJIIIZ = null;
        ((C1749280vcc) aCListenerS76S0300000_9.l1).setStatus(c1722300uv6);
    }

    public static final void onClick$6(ACListenerS76S0300000_9 aCListenerS76S0300000_9, View view) {
        Integer num;
        int iIntValue;
        Object tag = ((View) aCListenerS76S0300000_9.l0).getTag(R.id.d2y);
        if ((tag instanceof Integer) && (num = (Integer) tag) != null && (iIntValue = num.intValue()) != -1) {
            int childCount = ((ViewGroup) aCListenerS76S0300000_9.l1).getChildCount();
            for (int i = iIntValue + 1; i < childCount; i++) {
                View childAt = ((ViewGroup) aCListenerS76S0300000_9.l1).getChildAt(i);
                childAt.setTag(R.id.d2y, Integer.valueOf(i - 1));
                TextView textView = (TextView) childAt.findViewById(R.id.pq0);
                Context context = ((PollCreateContentAssem) aCListenerS76S0300000_9.l2).getContext();
                if (context != null) {
                    textView.setHint(C786410Ut5.j4(context.getString(2131827963), Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            ((PollCreateContentAssem) aCListenerS76S0300000_9.l2).LLJJIJI.addLast(((ViewGroup) aCListenerS76S0300000_9.l1).getChildAt(iIntValue));
            C786410Ut5.LJJLIL(iIntValue, (ViewGroup) aCListenerS76S0300000_9.l1);
            BulletinPollCreateViewModel bulletinPollCreateViewModelKp = ((PollCreateContentAssem) aCListenerS76S0300000_9.l2).kp();
            bulletinPollCreateViewModelKp.LLILLJJLI--;
            ListProtector.remove(bulletinPollCreateViewModelKp.LLILLL, iIntValue);
            bulletinPollCreateViewModelKp.vQ2();
            if (bulletinPollCreateViewModelKp.LLILLJJLI < BulletinPollCreateViewModel.LLILZLL) {
                bulletinPollCreateViewModelKp.setState(AFwS240S0000000_9.get$arr$(860));
            }
        }
    }

    public static final void onClick$7(ACListenerS76S0300000_9 aCListenerS76S0300000_9, View view) {
        String str;
        ((C616200OEw) aCListenerS76S0300000_9.l0).getSubmitFromXml().setLoading(true);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("group_id", ((C616200OEw) aCListenerS76S0300000_9.l0).getMAweme().getAid());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid(((C616200OEw) aCListenerS76S0300000_9.l0).getMAweme()));
        c2344009Gk.LIZJ(((C616200OEw) aCListenerS76S0300000_9.l0).getMAweme().getAuthor().getFollowStatus(), "follow_status");
        c2344009Gk.LJ(((C616200OEw) aCListenerS76S0300000_9.l0).getMAdapter().LLLFZ(), "keyword_word");
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("login_type", str);
        C20684815ws.LJIILLIIL("filter_hashtag_click_submit", c2344009Gk.LIZ);
        C596430NaL mPresenter = ((C616200OEw) aCListenerS76S0300000_9.l0).getMPresenter();
        List<String> listLLLFZ = ((C616200OEw) aCListenerS76S0300000_9.l0).getMAdapter().LLLFZ();
        AwS253S0300000_9 awS253S0300000_9 = new AwS253S0300000_9((C616200OEw) aCListenerS76S0300000_9.l0, (C616200OEw) aCListenerS76S0300000_9.l1, (Context) aCListenerS76S0300000_9.l2, (Function1<? super View, Unit>) 7);
        AwS375S0200000_9 awS375S0200000_9 = new AwS375S0200000_9((C616200OEw) aCListenerS76S0300000_9.l0, (Context) aCListenerS76S0300000_9.l1, 147);
        mPresenter.getClass();
        ((InterfaceC596410NaJ) mPresenter.LIZ.getValue()).LIZ(GsonProtectorUtils.toJson((Gson) mPresenter.LIZIZ.getValue(), listLLLFZ), GsonProtectorUtils.toJson((Gson) mPresenter.LIZIZ.getValue(), Collections.singletonList(0))).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS105S0300000_9(listLLLFZ, awS253S0300000_9, awS375S0200000_9, 0), new AfS171S0100000_2(awS375S0200000_9, 39));
        if (((C616200OEw) aCListenerS76S0300000_9.l0).getShouldDislike()) {
            C616200OEw c616200OEw = (C616200OEw) aCListenerS76S0300000_9.l0;
            if (!c616200OEw.LLJI) {
                C596430NaL mPresenter2 = c616200OEw.getMPresenter();
                String aid = ((C616200OEw) aCListenerS76S0300000_9.l0).getMAweme().getAid();
                String requestId = ((C616200OEw) aCListenerS76S0300000_9.l0).getMAweme().getRequestId();
                AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9((C616200OEw) aCListenerS76S0300000_9.l0, 1746);
                AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(477);
                ((InterfaceC596410NaJ) mPresenter2.LIZ.getValue()).LIZIZ(aid, requestId).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS145S0200000_9(awS553S0100000_9, aFwS195S0000000_9, 8), new AfS178S0100000_9(aFwS195S0000000_9, 57));
            }
        }
    }

    public ACListenerS76S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

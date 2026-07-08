package Y;

import X.C0EIE;
import X.C0PEM;
import X.C12HN;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1450990nrV;
import X.C1451080nre;
import X.C1884507Zr;
import X.C1889407ae;
import X.C197039127h;
import X.C19EG;
import X.C201955140j;
import X.C2113008Po;
import X.C2160008dC;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C2445009i4;
import X.C2446309iH;
import X.C2449809iq;
import X.C2450009is;
import X.C356720Dyg;
import X.C563650M8t;
import X.C704830Rkn;
import X.C705340Rlc;
import X.C786410Ut5;
import X.DialogC1738430vL7;
import X.EnumC1338240kve;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.suggestfollowing.FYPFollowingSuggestViewModel;
import com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelAuthorFragment;
import com.ss.android.ugc.aweme.story.note.panel.StoryNotePanelUserFragment;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.curve.CurveSpeedEditFragment;
import com.ss.android.ugc.profile.business.message.HeaderCTAMessageComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public class AObserverS207S0100000_3 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
        }
    }

    public AObserverS207S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        C19EG c19egLIZIZ;
        String string;
        StoryNotePanelUserFragment storyNotePanelUserFragment = (StoryNotePanelUserFragment) aObserverS207S0100000_3.l0;
        Context context = storyNotePanelUserFragment.getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
            Context context2 = storyNotePanelUserFragment.getContext();
            if (context2 != null) {
                string = context2.getString(2131849047);
            } else {
                string = null;
            }
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJII(R.attr.a0i);
            c1389890mGx.LIZLLL(2000L);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void onChanged$1(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        C19EG c19egLIZIZ;
        String string;
        Context context = ((StoryNotePanelAuthorFragment) aObserverS207S0100000_3.l0).getContext();
        if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            StoryNotePanelAuthorFragment storyNotePanelAuthorFragment = (StoryNotePanelAuthorFragment) aObserverS207S0100000_3.l0;
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
            Context context2 = storyNotePanelAuthorFragment.getContext();
            if (context2 != null) {
                string = context2.getString(2131849047);
            } else {
                string = null;
            }
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJII(R.attr.a0i);
            c1389890mGx.LIZLLL(2000L);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void onChanged$10(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        C2450009is c2450009is = (C2450009is) obj;
        boolean z = c2450009is.LIZ;
        String str = c2450009is.LIZIZ;
        C2449809iq c2449809iq = (C2449809iq) aObserverS207S0100000_3.l0;
        Aweme aweme = c2449809iq.LLJI;
        if (aweme != null && !z) {
            String authorUid = AwemeExtKt.getAuthorUid(aweme);
            if (!TextUtils.isEmpty(authorUid) && TextUtils.equals(authorUid, str)) {
                c2449809iq.LJI().wQ2(aweme, "from_profile_exit");
            }
        }
    }

    public static final void onChanged$11(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        boolean z;
        Integer num = (Integer) obj;
        C197039127h c197039127h = (C197039127h) aObserverS207S0100000_3.l0;
        if (num != null && num.intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        c197039127h.setEnabled(z);
    }

    public static final void onChanged$12(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        boolean z;
        Integer num = (Integer) obj;
        C197039127h c197039127h = (C197039127h) aObserverS207S0100000_3.l0;
        if (num != null && num.intValue() == 0) {
            z = false;
        } else {
            z = true;
        }
        c197039127h.setEnabled(z);
    }

    public static final void onChanged$13(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        C1884507Zr c1884507Zr = (C1884507Zr) obj;
        if (c1884507Zr.LIZ == C0EIE.AI_CREATE && c1884507Zr.LIZIZ) {
            ((Function0) aObserverS207S0100000_3.l0).invoke();
        }
    }

    public static final void onChanged$14(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        Uri uri = (Uri) obj;
        int i = C2160008dC.LIZ[((DialogC1738430vL7) aObserverS207S0100000_3.l0).LLJILJIL.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                DialogC1738430vL7 dialogC1738430vL7 = (DialogC1738430vL7) aObserverS207S0100000_3.l0;
                if (dialogC1738430vL7.LLJILJIL.LIZLLL != null) {
                    dialogC1738430vL7.LLJJIJI = uri.getPath();
                    C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(uri);
                    c1331670kl3LJI.LJJ = EnumC1338240kve.FIT_CENTER;
                    c1331670kl3LJI.LJJ(dialogC1738430vL7.LLJJ);
                    C786410Ut5.h3(c1331670kl3LJI);
                    return;
                }
                return;
            }
            return;
        }
        DialogC1738430vL7 dialogC1738430vL72 = (DialogC1738430vL7) aObserverS207S0100000_3.l0;
        if (dialogC1738430vL72.LLJILJIL.LIZJ == null) {
            return;
        }
        dialogC1738430vL72.LLJJIJI = uri.getPath();
        C1331670kl3 c1331670kl3LJI2 = C1331660kl2.LJI(uri);
        c1331670kl3LJI2.LJJ = EnumC1338240kve.FIT_CENTER;
        c1331670kl3LJI2.LJJ(dialogC1738430vL72.LLJJ);
        C786410Ut5.h3(c1331670kl3LJI2);
    }

    public static final void onChanged$2(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1451080nre((C1450990nrV) aObserverS207S0100000_3.l0, null), 3);
    }

    public static final void onChanged$3(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((MvChoosePhotoScene) aObserverS207S0100000_3.l0).finishScene(true);
            MutableLiveData<Boolean> mutableLiveData = ((MvChoosePhotoScene) aObserverS207S0100000_3.l0).directlyCloseAlbumAction;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(Boolean.FALSE);
            }
        }
    }

    public static final void onChanged$4(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            C786410Ut5.LJLLLLLL(num.intValue(), (View) aObserverS207S0100000_3.l0);
        }
    }

    public static final void onChanged$5(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        Boolean bool = (Boolean) obj;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("observeVideoDrag: ");
        sbLIZ.append(bool);
        C201955140j.LIZLLL(c563650M8t, "MagicDataLogicComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (bool.booleanValue()) {
            ((C356720Dyg) aObserverS207S0100000_3.l0).W1();
        } else {
            ((C356720Dyg) aObserverS207S0100000_3.l0).B3();
        }
    }

    public static final void onChanged$6(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        float fFloatValue;
        C1889407ae c1889407ae = (C1889407ae) obj;
        if (c1889407ae != null) {
            CurveSpeedEditFragment curveSpeedEditFragment = (CurveSpeedEditFragment) aObserverS207S0100000_3.l0;
            View viewFindViewById = curveSpeedEditFragment.LLLI;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View view = curveSpeedEditFragment.getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.tv_src_duration);
                } else {
                    viewFindViewById = null;
                }
                curveSpeedEditFragment.LLLI = (TuxTextView) viewFindViewById;
            }
            TextView textView = (TextView) viewFindViewById;
            float fFloatValue2 = 0.0f;
            if (textView != null) {
                Object[] objArr = new Object[1];
                Float f = c1889407ae.LIZJ;
                if (f != null) {
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = 0.0f;
                }
                objArr[0] = C2113008Po.LIZJ((int) (fFloatValue * LSPassThroughRecordSizeConfig.DEFAULT));
                textView.setText(curveSpeedEditFragment.getString(2131848677, objArr));
            }
            View view2 = curveSpeedEditFragment.LLLII;
            if (view2 == null) {
                View view3 = curveSpeedEditFragment.getView();
                if (view3 != null) {
                    viewFindViewById2 = view3.findViewById(R.id.zjd);
                }
                curveSpeedEditFragment.LLLII = (TuxTextView) viewFindViewById2;
                view2 = viewFindViewById2;
            }
            TextView textView2 = (TextView) view2;
            if (textView2 != null) {
                Object[] objArr2 = new Object[1];
                Float f2 = c1889407ae.LIZIZ;
                if (f2 != null) {
                    fFloatValue2 = f2.floatValue();
                }
                objArr2[0] = C2113008Po.LIZJ((int) (fFloatValue2 * LSPassThroughRecordSizeConfig.DEFAULT));
                textView2.setText(curveSpeedEditFragment.getString(2131848678, objArr2));
            }
        }
    }

    public static final void onChanged$7(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        String uid;
        User userAq;
        FollowStatus followStatus = (FollowStatus) obj;
        HeaderCTAMessageComponent headerCTAMessageComponent = (HeaderCTAMessageComponent) aObserverS207S0100000_3.l0;
        headerCTAMessageComponent.getClass();
        String userId = followStatus.getUserId();
        User userAq2 = headerCTAMessageComponent.aq();
        if (userAq2 != null) {
            uid = userAq2.getUid();
        } else {
            uid = null;
        }
        if (TextUtils.equals(userId, uid) && (userAq = headerCTAMessageComponent.aq()) != null) {
            headerCTAMessageComponent.Xp(followStatus.getFollowStatus(), userAq);
        }
    }

    public static final void onChanged$8(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            C786410Ut5.LJLLLLLL(num.intValue(), (View) aObserverS207S0100000_3.l0);
        }
    }

    public static final void onChanged$9(AObserverS207S0100000_3 aObserverS207S0100000_3, Object obj) {
        Aweme aweme;
        String aid;
        C705340Rlc c705340Rlc;
        FollowStatus followStatus = (FollowStatus) obj;
        C2449809iq c2449809iq = (C2449809iq) aObserverS207S0100000_3.l0;
        C704830Rkn c704830Rkn = c2449809iq.LLILLL;
        if (c704830Rkn != null) {
            String userId = followStatus.getUserId();
            Integer followerStatus = followStatus.getFollowerStatus();
            boolean z = false;
            if (userId != null && userId.length() != 0 && followerStatus != null && (aweme = c2449809iq.LLJI) != null && Intrinsics.LJFF(userId, AwemeExtKt.getAuthorUid(aweme))) {
                Aweme aweme2 = ((C2449809iq) aObserverS207S0100000_3.l0).LLJI;
                if (aweme2 == null || (aid = aweme2.getAid()) == null) {
                    aid = "";
                }
                if (Intrinsics.LJFF(((C2449809iq) aObserverS207S0100000_3.l0).LLJIJIL, "homepage_hot")) {
                    FYPFollowingSuggestViewModel fYPFollowingSuggestViewModelLJI = ((C2449809iq) aObserverS207S0100000_3.l0).LJI();
                    if (((C2445009i4) fYPFollowingSuggestViewModelLJI.LLILLJJLI.getValue()).LIZ.contains(aid)) {
                        ((C2445009i4) fYPFollowingSuggestViewModelLJI.LLILLJJLI.getValue()).LIZ.remove(aid);
                        z = true;
                    }
                } else if (Intrinsics.LJFF(((C2449809iq) aObserverS207S0100000_3.l0).LLJIJIL, "others_homepage")) {
                    ProfileFollowingSuggestViewModel profileFollowingSuggestViewModelLJII = ((C2449809iq) aObserverS207S0100000_3.l0).LJII();
                    C2446309iH c2446309iHXQ2 = profileFollowingSuggestViewModelLJII.xQ2();
                    if (c2446309iHXQ2.LLILZIL > 0 && !c2446309iHXQ2.LLILZLL) {
                        C2446309iH c2446309iHXQ22 = profileFollowingSuggestViewModelLJII.xQ2();
                        if (!c2446309iHXQ22.LLILZLL) {
                            c2446309iHXQ22.LLIZ.removeMessages(101);
                            c2446309iHXQ22.LLILZLL = true;
                        }
                        z = true;
                    }
                }
                if (followStatus.getFollowFrom() != 50 && z) {
                    c704830Rkn.LJFF.put("follow_status_changed_from_other", Boolean.TRUE);
                    if (Intrinsics.LJFF(((C2449809iq) aObserverS207S0100000_3.l0).LLJIJIL, "homepage_hot")) {
                        C705340Rlc c705340Rlc2 = c704830Rkn.LJI;
                        if (c705340Rlc2 != null) {
                            c705340Rlc2.LIZIZ("click_follow_button");
                            return;
                        }
                        return;
                    }
                    if (!Intrinsics.LJFF(((C2449809iq) aObserverS207S0100000_3.l0).LLJIJIL, "others_homepage") || (c705340Rlc = c704830Rkn.LJI) == null) {
                        return;
                    }
                    c705340Rlc.LIZIZ("click_button");
                }
            }
        }
    }

    public AObserverS207S0100000_3(C12HN c12hn, View view, int i) {
        this.$t = i;
        this.l0 = view;
    }

    public AObserverS207S0100000_3(C12HN c12hn, TuxIconView tuxIconView, int i) {
        this.$t = i;
        this.l0 = tuxIconView;
    }
}

package Y;

import X.C09JN;
import X.C0GSX;
import X.C0IJT;
import X.C0R60;
import X.C0X4A;
import X.C110M;
import X.C1143680frq;
import X.C1143920fsE;
import X.C117C;
import X.C117G;
import X.C11TK;
import X.C11TL;
import X.C11TN;
import X.C11YC;
import X.C11YJ;
import X.C11YV;
import X.C1308910kAL;
import X.C1324720kZq;
import X.C13SZ;
import X.C1567000qsc;
import X.C1641660sp2;
import X.C1848410yCV;
import X.C19212410Eg;
import X.C19426510zP;
import X.C19591211ks;
import X.C19603211mo;
import X.C19622411pu;
import X.C19624911qJ;
import X.C197039127h;
import X.C1C7U;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217061Bpw;
import X.C337180DJs;
import X.C474500IjA;
import X.C705930RmZ;
import X.C786410Ut5;
import X.InterfaceC1232320iAo;
import X.InterfaceC19622811py;
import X.InterfaceC420801kM;
import android.app.Activity;
import android.view.View;
import avg.f;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.response.ProfileNaviListResponse;
import com.ss.android.ugc.aweme.ogc.news.sticker.IArticleStickerService;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviHubViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS395S0200000_29;
import mf.a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes30.dex */
public class AfS163S0200000_29 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        C1C7U.LIZ("NewRecognizeCaptionPresenter@6e2f.preprocess$2");
        ((C2217061Bpw) afS163S0200000_29.l0).LJIJI((NLEModel) afS163S0200000_29.l1);
        C1C7U.LIZIZ("NewRecognizeCaptionPresenter@6e2f.preprocess$2");
    }

    public static final void accept$1(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        C1C7U.LIZ("NewRecognizeCaptionPresenter@6e2f.preprocess$3");
        ((C2217061Bpw) afS163S0200000_29.l0).LJIJI((NLEModel) afS163S0200000_29.l1);
        C1C7U.LIZIZ("NewRecognizeCaptionPresenter@6e2f.preprocess$3");
    }

    public static final void accept$10(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        Activity activity;
        C1C7U.LIZ("AccurateLifecycleManager@a792.register$1");
        C0X4A c0x4a = (C0X4A) obj;
        if (c0x4a != null) {
            activity = c0x4a.LIZ;
        } else {
            activity = null;
        }
        if (activity == ((WeakReference) afS163S0200000_29.l0).get()) {
            ((C117C) afS163S0200000_29.l1).LIZIZ(0);
        }
        C1C7U.LIZIZ("AccurateLifecycleManager@a792.register$1");
    }

    public static final void accept$11(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        C1C7U.LIZ("AccurateLifecycleManager@a792.register$3");
        if (obj == ((WeakReference) afS163S0200000_29.l0).get()) {
            C117C c117c = (C117C) afS163S0200000_29.l1;
            c117c.LIZJ = false;
            if (c117c.LIZIZ) {
                c117c.LIZIZ = false;
            } else {
                c117c.LIZIZ(2);
            }
        }
        C1C7U.LIZIZ("AccurateLifecycleManager@a792.register$3");
    }

    public static final void accept$12(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        C1C7U.LIZ("AccurateLifecycleManager@a792.register$5");
        if (obj == ((WeakReference) afS163S0200000_29.l0).get()) {
            ((C117C) afS163S0200000_29.l1).LIZIZ(3);
        }
        C1C7U.LIZIZ("AccurateLifecycleManager@a792.register$5");
    }

    public static final void accept$13(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        C1C7U.LIZ("AccurateLifecycleManager@a792.register$7");
        if (obj == ((WeakReference) afS163S0200000_29.l0).get()) {
            ((C117C) afS163S0200000_29.l1).LIZIZ(4);
        }
        C1C7U.LIZIZ("AccurateLifecycleManager@a792.register$7");
    }

    public static final void accept$14(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        C1C7U.LIZ("AccurateLifecycleManager@a792.register$9");
        if (obj == ((WeakReference) afS163S0200000_29.l0).get()) {
            C117C c117c = (C117C) afS163S0200000_29.l1;
            c117c.LIZJ = true;
            if (!c117c.LIZIZ) {
                c117c.LIZIZ(6);
            }
        }
        C1C7U.LIZIZ("AccurateLifecycleManager@a792.register$9");
    }

    public static final void accept$15(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        String str;
        String uid;
        String strOptString;
        C705930RmZ c705930RmZ;
        C0R60 c0r60;
        int iIntValue;
        C1C7U.LIZ("LiveEventStoryStickerView@c76b.setupButtonAtConsumeScene$2");
        NewLiveRoomStruct newLiveRoomStruct = (NewLiveRoomStruct) obj;
        if (newLiveRoomStruct.id != 0) {
            C0GSX c0gsx = ((C19624911qJ) afS163S0200000_29.l0).LLJI;
            String strOptString2 = null;
            if (c0gsx != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.nn, c0gsx.getContext());
                int iIntValue2 = -16777216;
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = -16777216;
                }
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.nm, c0gsx.getContext());
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                }
                c0gsx.LIZ(iIntValue, iIntValue2);
            } else {
                c0gsx = null;
            }
            C337180DJs.LIZJ(c0gsx);
            C1324720kZq c1324720kZq = ((C19624911qJ) afS163S0200000_29.l0).LLJIJIL;
            if (c1324720kZq != null) {
                C1143920fsE c1143920fsE = new C1143920fsE();
                c1143920fsE.LJFF = true;
                c1143920fsE.LIZIZ = "tiktok_live_watch_resource_normal_1";
                c1143920fsE.LIZJ = "live_skylight_icon_anim_small_size.webp";
                c1143920fsE.LIZ = c1324720kZq;
                c1143920fsE.LJI = Integer.MAX_VALUE;
                C1143680frq.LJIIIIZZ(c1143920fsE);
            } else {
                c1324720kZq = null;
            }
            C337180DJs.LIZJ(c1324720kZq);
            C337180DJs.LIZJ(((C19624911qJ) afS163S0200000_29.l0).LLJILJIL);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_show");
            c474500IjALIZ.LJIL();
            C19591211ks interactStickerContainerCommonParam = ((C19624911qJ) afS163S0200000_29.l0).getInteractStickerContainerCommonParam();
            if (interactStickerContainerCommonParam != null && (c705930RmZ = interactStickerContainerCommonParam.LJFF) != null && (c0r60 = c705930RmZ.LJIIZILJ) != null) {
                str = c0r60.LIZ;
            } else {
                str = null;
            }
            c474500IjALIZ.LJJII(str, "enter_from_merge");
            c474500IjALIZ.LJJII("story_liveevent", "enter_method");
            c474500IjALIZ.LJJII("click", "action_type");
            User user = (User) afS163S0200000_29.l1;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            c474500IjALIZ.LJJII(String.valueOf(uid), "anchor_id");
            c474500IjALIZ.LJJII(String.valueOf(newLiveRoomStruct.id), "room_id");
            JSONObject storyParams = ((C19624911qJ) afS163S0200000_29.l0).getStoryParams();
            if (storyParams != null) {
                strOptString = storyParams.optString("enter_from");
            } else {
                strOptString = null;
            }
            c474500IjALIZ.LJJII(strOptString, "enter_from");
            JSONObject storyParams2 = ((C19624911qJ) afS163S0200000_29.l0).getStoryParams();
            if (storyParams2 != null) {
                strOptString2 = storyParams2.optString("enter_position");
            }
            c474500IjALIZ.LJJII(strOptString2, "enter_position");
            c474500IjALIZ.LIZ();
            C19624911qJ c19624911qJ = (C19624911qJ) afS163S0200000_29.l0;
            C197039127h c197039127h = c19624911qJ.LLJ;
            if (c197039127h != null) {
                c197039127h.setText(c19624911qJ.getContext().getString(2131851155));
            }
            C197039127h c197039127h2 = ((C19624911qJ) afS163S0200000_29.l0).LLJ;
            if (c197039127h2 != null) {
                c197039127h2.setButtonVariant(0);
            }
            C19624911qJ c19624911qJ2 = (C19624911qJ) afS163S0200000_29.l0;
            C197039127h c197039127h3 = c19624911qJ2.LLJ;
            if (c197039127h3 != null) {
                C786410Ut5.U8(c197039127h3, new ACListenerS93S0300000_29(c19624911qJ2, newLiveRoomStruct, (User) afS163S0200000_29.l1, 11));
            }
            C19624911qJ c19624911qJ3 = (C19624911qJ) afS163S0200000_29.l0;
            C0GSX c0gsx2 = c19624911qJ3.LLJI;
            if (c0gsx2 != null) {
                View.OnClickListener aCListenerS93S0300000_29 = new ACListenerS93S0300000_29(c19624911qJ3, newLiveRoomStruct, (User) afS163S0200000_29.l1, 12);
                if (C1848410yCV.LIZ) {
                    aCListenerS93S0300000_29 = new f(aCListenerS93S0300000_29);
                }
                a aVar = new a(aCListenerS93S0300000_29);
                if (C2213981Bky.LIZIZ.isOffline()) {
                    C2211941Bhg.LIZ.injectViewListener(c0gsx2);
                }
                c0gsx2.setOnClickListener(aVar);
            }
        }
        C1C7U.LIZIZ("LiveEventStoryStickerView@c76b.setupButtonAtConsumeScene$2");
    }

    public static final void accept$16(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        User userM307clone;
        C1C7U.LIZ("JediUserBridge@36cc.followObserver$1$1$1$1");
        User user = (User) ((C1641660sp2) obj).LIZ();
        if (user != null && (userM307clone = user.m307clone()) != null) {
            FollowStatus followStatus = (FollowStatus) afS163S0200000_29.l0;
            C11TL c11tl = (C11TL) afS163S0200000_29.l1;
            if (userM307clone.getFollowStatus() != followStatus.getFollowStatus()) {
                userM307clone.setFollowStatus(followStatus.getFollowStatus());
                c11tl.LIZ.put(userM307clone.getUid(), userM307clone);
                if (userM307clone.getFollowStatus() == 0) {
                    userM307clone.setLivePushNotificationStatus(2);
                }
                C11TN.LIZ.getClass();
                C11TN.LIZIZ.put(userM307clone.getUid(), userM307clone);
            }
        }
        C1C7U.LIZIZ("JediUserBridge@36cc.followObserver$1$1$1$1");
    }

    public static final void accept$17(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        C1C7U.LIZ("UserRepository@69b9.follow$1");
        ((C11TK) afS163S0200000_29.l0).LJFF.onNext(new Pair<>((C19212410Eg) afS163S0200000_29.l1, obj));
        C1C7U.LIZIZ("UserRepository@69b9.follow$1");
    }

    public static final void accept$2(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        ArrayList arrayList;
        C1C7U.LIZ("ProfileNaviSwitcherViewModel@e6d.getNaviList$1$1");
        ProfileNaviListResponse profileNaviListResponse = (ProfileNaviListResponse) obj;
        if (profileNaviListResponse != null && profileNaviListResponse.error_code == 0) {
            List<ProfileNaviDataModel> naviList = ((ProfileNaviSwitcherState) afS163S0200000_29.l0).getNaviList();
            if (naviList != null) {
                arrayList = new ArrayList(naviList);
            } else {
                arrayList = new ArrayList();
            }
            List<ProfileNaviDataModel> list = profileNaviListResponse.naviList;
            if (list != null) {
                arrayList.addAll(list);
            }
            ((ProfileNaviSwitcherViewModel) afS163S0200000_29.l1).setState(new AwS395S0200000_29((List) arrayList, (List<ProfileNaviDataModel>) profileNaviListResponse, (ProfileNaviListResponse) 42));
        }
        C1C7U.LIZIZ("ProfileNaviSwitcherViewModel@e6d.getNaviList$1$1");
    }

    public static final void accept$3(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        C1C7U.LIZ("TextToSpeechComponent@c530.requestAudio$1$requestObservable$3");
        Throwable th = (Throwable) obj;
        ((C11YC) afS163S0200000_29.l0).LIZ(99999);
        ((C11YC) afS163S0200000_29.l0).LIZJ(C11YJ.CLIENT.getValue());
        C11YC c11yc = (C11YC) afS163S0200000_29.l0;
        String message = th.getMessage();
        if (message == null) {
            message = C13SZ.LIZIZ(th);
        }
        c11yc.LIZIZ(message);
        ((C11YC) afS163S0200000_29.l0).LIZLLL();
        ((C11YV) afS163S0200000_29.l1).LIZ(null);
        C1C7U.LIZIZ("TextToSpeechComponent@c530.requestAudio$1$requestObservable$3");
    }

    public static final void accept$4(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        C1C7U.LIZ("ArticleStickerManagerComponent@844f.stickerGuideMonitor$2$1$onStickerEditDoneDelegate$2");
        if (((Boolean) obj).booleanValue()) {
            ((C19622411pu) afS163S0200000_29.l0).Z1().Uk((ArticleStickerModel) afS163S0200000_29.l1);
            IArticleStickerService.Companion.getClass();
            InterfaceC19622811py interfaceC19622811pyLIZ = C19603211mo.LIZ();
            if (interfaceC19622811pyLIZ != null) {
                interfaceC19622811pyLIZ.LIZJ();
            }
        }
        C1C7U.LIZIZ("ArticleStickerManagerComponent@844f.stickerGuideMonitor$2$1$onStickerEditDoneDelegate$2");
    }

    public static final void accept$5(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        C1C7U.LIZ("ProfileNaviHubViewModel@9273.deleteNavi$1$1");
        final BaseResponse baseResponse = (BaseResponse) obj;
        InterfaceC1232320iAo interfaceC1232320iAo = ((ProfileNaviHubViewModel) afS163S0200000_29.l0).LLILZIL;
        final Function1 function1 = (Function1) afS163S0200000_29.l1;
        interfaceC1232320iAo.LIZ(new C110M() { // from class: X.110H
            @Override // X.C110M, X.InterfaceC1232420iAy
            public final void JE2(int i, Exception exc) {
                function1.invoke(Boolean.FALSE);
            }

            @Override // X.InterfaceC1232420iAy
            public final void Ud0(int i, User user) {
                Function1<Boolean, Unit> function12 = function1;
                BaseResponse baseResponse2 = baseResponse;
                boolean z = true;
                if (baseResponse2 == null || baseResponse2.error_code != 0 || user == null) {
                    z = false;
                }
                function12.invoke(Boolean.valueOf(z));
            }
        });
        ((ProfileNaviHubViewModel) afS163S0200000_29.l0).LLILZIL.LJI();
        C1C7U.LIZIZ("ProfileNaviHubViewModel@9273.deleteNavi$1$1");
    }

    public static final void accept$6(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        C1C7U.LIZ("NaviAvatarRequest@9a41.downloadEffects$1");
        Pair pair = (Pair) obj;
        Function0<Unit> function0 = ((C19426510zP) afS163S0200000_29.l0).LJIIIIZZ;
        if (function0 != null) {
            function0.invoke();
        }
        ((C19426510zP) afS163S0200000_29.l0).LIZ((Effect) pair.getSecond(), (List) afS163S0200000_29.l1, (List) pair.getFirst());
        C1C7U.LIZIZ("NaviAvatarRequest@9a41.downloadEffects$1");
    }

    public static final void accept$7(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        C1C7U.LIZ("NaviAvatarRequest@9a41.downloadEffects$3");
        List list = (List) obj;
        Function0<Unit> function0 = ((C19426510zP) afS163S0200000_29.l0).LJIIIIZZ;
        if (function0 != null) {
            function0.invoke();
        }
        ((C19426510zP) afS163S0200000_29.l0).LIZ(null, (List) afS163S0200000_29.l1, list);
        C1C7U.LIZIZ("NaviAvatarRequest@9a41.downloadEffects$3");
    }

    public static final void accept$8(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        C1C7U.LIZ("AccurateLifecycleManager@a792.register$11");
        if (obj == ((WeakReference) afS163S0200000_29.l0).get()) {
            ((C117C) afS163S0200000_29.l1).LIZIZ(7);
            C117C c117c = (C117C) afS163S0200000_29.l1;
            for (InterfaceC420801kM interfaceC420801kM : (ArrayList) c117c.LIZLLL) {
                if (interfaceC420801kM.isDisposed()) {
                    interfaceC420801kM.dispose();
                }
            }
            ((List) C117G.LIZ.getValue()).remove(c117c);
            ((ArrayList) c117c.LIZ).clear();
        }
        C1C7U.LIZIZ("AccurateLifecycleManager@a792.register$11");
    }

    public static final void accept$9(AfS163S0200000_29 afS163S0200000_29, Object obj) {
        Activity activity;
        C1C7U.LIZ("AccurateLifecycleManager@a792.register$13");
        C1567000qsc c1567000qsc = (C1567000qsc) obj;
        if (c1567000qsc != null) {
            if (c1567000qsc.LIZIZ) {
                C117C c117c = (C117C) afS163S0200000_29.l0;
                if (!c117c.LIZJ) {
                    c117c.LIZIZ = true;
                }
                if (c1567000qsc.LIZ == ((WeakReference) afS163S0200000_29.l1).get()) {
                    ((C117C) afS163S0200000_29.l0).LIZIZ(5);
                }
                C1C7U.LIZIZ("AccurateLifecycleManager@a792.register$13");
            }
            activity = c1567000qsc.LIZ;
        } else {
            activity = null;
        }
        if (activity == ((WeakReference) afS163S0200000_29.l1).get()) {
            ((C117C) afS163S0200000_29.l0).LIZIZ(1);
        }
        C1C7U.LIZIZ("AccurateLifecycleManager@a792.register$13");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS163S0200000_29(X.C117C r2, java.lang.ref.WeakReference r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 8: goto Le;
                case 9: goto L5;
                case 10: goto Le;
                case 11: goto Le;
                case 12: goto Le;
                case 13: goto Le;
                case 14: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS163S0200000_29.<init>(X.117C, java.lang.ref.WeakReference, int):void");
    }

    public AfS163S0200000_29(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}

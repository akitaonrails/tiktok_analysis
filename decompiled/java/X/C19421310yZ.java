package X;

import Y.ACListenerS131S0200000_29;
import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import avg.f;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.commercialize.mission.ICommerceMissionService;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.discover.model.CommerceChallengeBanner;
import com.ss.android.ugc.aweme.discover.model.InquiryStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.text.Bidi;
import java.util.List;
import mf.a;

/* JADX INFO: renamed from: X.10yZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19421310yZ implements InterfaceC19418110y3 {
    public static final /* synthetic */ int LJIJJLI = 0;
    public View LIZ;
    public C11FU LIZIZ;
    public TextView LIZJ;
    public ViewStub LIZLLL;
    public TextView LJ;
    public View LJFF;
    public C11FN LJI;
    public ViewStub LJII;
    public View LJIIIIZZ;
    public TextView LJIIIZ;
    public View LJIIJ;
    public TextView LJIIJJI;
    public ViewStub LJIIL;
    public View LJIILIIL;
    public ViewStub LJIILJJIL;
    public View LJIILL;
    public TextView LJIILLIIL;
    public Context LJIIZILJ;
    public C19418210y4 LJIJ;
    public Challenge LJIJI;
    public List<? extends Aweme> LJIJJ;

    @Override // X.InterfaceC19418110y3
    public final void LIZ(float f) {
        boolean z;
        TextView textView = this.LJIIIZ;
        if (textView != null) {
            if (f <= 0.9d) {
                z = true;
            } else {
                z = false;
            }
            textView.setClickable(z);
        }
    }

    @Override // X.InterfaceC19418110y3
    public final void LIZIZ(ViewStub viewStub) {
        this.LJIILJJIL = viewStub;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.aeo);
        }
    }

    @Override // X.InterfaceC19418110y3
    public final void LIZJ(View view) {
        this.LIZ = view;
    }

    @Override // X.InterfaceC19418110y3
    public final void LIZLLL(ViewStub viewStub) {
        this.LIZLLL = viewStub;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.aeu);
        }
    }

    @Override // X.InterfaceC19418110y3
    public final void LJ(TextView textView) {
        this.LIZJ = textView;
    }

    @Override // X.InterfaceC19418110y3
    public final void LJFF(C11FU c11fu) {
        this.LIZIZ = c11fu;
    }

    @Override // X.InterfaceC19418110y3
    public final void LJIIIZ(ViewStub viewStub) {
        this.LJII = viewStub;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.aen);
        }
    }

    public final void LJIIJ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        Challenge challenge = this.LJIJI;
        if (challenge == null) {
            challenge = null;
        }
        c2344009Gk.LJIIIIZZ("tag_id", challenge.getCid());
        c2344009Gk.LJIIIIZZ("enter_from", "challenge");
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    public final void LJIIJJI(String str) {
        String uid;
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName(str);
        mobClickObtain.setLabelName("challenge");
        Challenge challenge = this.LJIJI;
        Challenge challenge2 = null;
        if (challenge == null) {
            challenge = null;
        }
        mobClickObtain.setValue(challenge.getCid());
        C2241008qG c2241008qG = new C2241008qG();
        c2241008qG.LIZ.put("link_type", "web_link");
        mobClickObtain.setJsonObject(c2241008qG.LJ());
        C20684815ws.onEvent(mobClickObtain);
        Challenge challenge3 = this.LJIJI;
        if (challenge3 == null) {
            challenge3 = null;
        }
        User author = challenge3.getAuthor();
        if (author != null) {
            uid = author.getUid();
        } else {
            uid = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("author_id", uid);
        Challenge challenge4 = this.LJIJI;
        if (challenge4 != null) {
            challenge2 = challenge4;
        }
        c2344009Gk.LJIIIIZZ("tag_id", challenge2.getCid());
        c2344009Gk.LJIIIIZZ("link_type", "web_link");
        c2344009Gk.LJIIIIZZ("enter_from", "challenge");
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC19418110y3
    public final void LJI(FrameLayout frameLayout, C19418210y4 c19418210y4) {
        this.LJIIZILJ = frameLayout.getContext();
        this.LJIJ = c19418210y4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC19418110y3
    public final void LJII(Challenge challenge, List list) {
        boolean z;
        String content;
        int i;
        boolean zBaseIsLeftToRight;
        int i2;
        String title;
        Context context;
        int i3;
        View view;
        ViewGroup.LayoutParams layoutParams;
        C11FN c11fn;
        InquiryStruct inquiryStruct;
        String openUrl;
        String webUrl;
        String desc;
        this.LJIJI = challenge;
        this.LJIJJ = list;
        Challenge challenge2 = null;
        if (challenge == null) {
            challenge = null;
        }
        if (challenge == null || (inquiryStruct = challenge.inquiryStruct) == null || ((((openUrl = inquiryStruct.getOpenUrl()) == null || openUrl.length() == 0) && ((webUrl = inquiryStruct.getWebUrl()) == null || webUrl.length() == 0)) || (desc = inquiryStruct.getDesc()) == null || desc.length() == 0)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View view2 = this.LIZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            Challenge challenge3 = this.LJIJI;
            if (challenge3 == null) {
                challenge3 = null;
            }
            InquiryStruct inquiryStruct2 = challenge3.inquiryStruct;
            if (inquiryStruct2 != null) {
                String desc2 = inquiryStruct2.getDesc();
                final String openUrl2 = inquiryStruct2.getOpenUrl();
                final String webUrl2 = inquiryStruct2.getWebUrl();
                if (inquiryStruct2.getIcon() == null) {
                    C11FU c11fu = this.LIZIZ;
                    if (c11fu != null) {
                        int visibility = c11fu.getVisibility();
                        c11fu.setVisibility(8);
                        C1602160rnK.LIZIZ(visibility, 8, c11fu);
                    }
                } else {
                    C1324840ka2.LJFF(this.LIZIZ, inquiryStruct2.getIcon());
                }
                TextView textView = this.LIZJ;
                if (textView != null) {
                    textView.setText(desc2);
                }
                View view3 = this.LIZ;
                if (view3 != null) {
                    C786410Ut5.I7(new View.OnClickListener() { // from class: X.10ya
                        /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
                        /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
                        @Override // android.view.View.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onClick(android.view.View r8) {
                            /*
                                r7 = this;
                                X.10yc r2 = X.C04PR.LIZ()
                                r6 = 0
                                r5 = 1
                                if (r2 == 0) goto L5b
                                X.10yZ r0 = r7.LL
                                android.content.Context r1 = r0.LJIIZILJ
                                if (r1 != 0) goto Lf
                                r1 = r6
                            Lf:
                                java.lang.String r0 = r2
                                boolean r0 = r2.LIZLLL(r1, r0)
                                if (r0 != r5) goto L5b
                            L17:
                                X.10yZ r3 = r7.LL
                                r3.getClass()
                                X.09Gk r2 = new X.09Gk
                                r2.<init>()
                                com.ss.android.ugc.aweme.discover.model.Challenge r0 = r3.LJIJI
                                if (r0 != 0) goto L26
                                r0 = r6
                            L26:
                                java.lang.String r1 = r0.getCid()
                                java.lang.String r0 = "tag_id"
                                r2.LJIIIIZZ(r0, r1)
                                X.10y4 r0 = r3.LJIJ
                                if (r0 != 0) goto L34
                                r0 = r6
                            L34:
                                java.lang.String r1 = r0.LIZ
                                java.lang.String r0 = "enter_from"
                                r2.LJIIIIZZ(r0, r1)
                                java.lang.String r1 = "page_type"
                                java.lang.String r0 = "challenge"
                                r2.LJIIIIZZ(r1, r0)
                                java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
                                java.lang.String r0 = "click_variable_button"
                                X.C20684815ws.LJIILLIIL(r0, r1)
                                X.10yc r1 = X.C04PR.LIZ()
                                if (r1 == 0) goto L5a
                                com.ss.android.ugc.aweme.discover.model.Challenge r0 = r3.LJIJI
                                if (r0 == 0) goto L54
                                r6 = r0
                            L54:
                                r6.getCid()
                                r1.LIZJ()
                            L5a:
                                return
                            L5b:
                                X.10yc r2 = X.C04PR.LIZ()
                                if (r2 == 0) goto L71
                                X.10yZ r0 = r7.LL
                                android.content.Context r1 = r0.LJIIZILJ
                                if (r1 != 0) goto L68
                                r1 = r6
                            L68:
                                java.lang.String r0 = r2
                                boolean r0 = r2.openAdOpenUrl(r1, r0, r5)
                                if (r0 != r5) goto L71
                                goto L17
                            L71:
                                X.10yc r4 = X.C04PR.LIZ()
                                if (r4 == 0) goto L5a
                                X.10yZ r0 = r7.LL
                                android.content.Context r3 = r0.LJIIZILJ
                                if (r3 != 0) goto L7e
                                r3 = r6
                            L7e:
                                java.lang.String r0 = r3
                                java.lang.String r2 = X.C19421210yY.LIZ(r0)
                                X.10yZ r0 = r7.LL
                                com.ss.android.ugc.aweme.discover.model.Challenge r0 = r0.LJIJI
                                if (r0 != 0) goto L8b
                                r0 = r6
                            L8b:
                                java.lang.String r1 = r0.getCid()
                                java.lang.String r0 = "challenge_transform_button"
                                java.lang.String r1 = X.C19421210yY.LIZIZ(r2, r0, r1)
                                java.lang.String r0 = ""
                                boolean r0 = r4.openAdWebUrl(r3, r1, r0)
                                if (r0 != r5) goto L5a
                                goto L17
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC19421410ya.onClick(android.view.View):void");
                        }
                    }, view3);
                }
                View view4 = this.LIZ;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(0, view4);
                }
            }
        }
        Challenge challenge4 = this.LJIJI;
        if (challenge4 == null) {
            challenge4 = null;
        }
        if (challenge4.getHtcMissionModule() == null) {
            View view5 = this.LJIILIIL;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
        } else {
            View view6 = this.LJIILIIL;
            if (view6 != null) {
                C786410Ut5.LJLLLLLL(0, view6);
            }
            ViewStub viewStub = this.LJIIL;
            if (this.LJIILIIL == null && viewStub != null) {
                View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
                ICommerceMissionService iCommerceMissionService = (ICommerceMissionService) ServiceManager.get().getService(ICommerceMissionService.class);
                Challenge challenge5 = this.LJIJI;
                if (challenge5 == null) {
                    challenge5 = null;
                }
                iCommerceMissionService.LIZJ(viewLJLLLL, challenge5.getHtcMissionModule(), EnumC1157650gEN.HTC, new C11BX() { // from class: X.10yb
                    @Override // X.C11BX
                    public final void LIZ(String str) {
                        InterfaceC19421610yc interfaceC19421610ycLIZ = C04PR.LIZ();
                        if (interfaceC19421610ycLIZ != null) {
                            Context context2 = this.LIZ.LJIIZILJ;
                            if (context2 == null) {
                                context2 = null;
                            }
                            interfaceC19421610ycLIZ.openAdOpenUrl(context2, str, false);
                        }
                    }
                });
                this.LJIILIIL = viewLJLLLL;
            }
        }
        Challenge challenge6 = this.LJIJI;
        if (challenge6 == null) {
            challenge6 = null;
        }
        int i4 = 3;
        if (!C19421210yY.LJ(challenge6)) {
            View view7 = this.LJIILL;
            if (view7 != null) {
                C786410Ut5.LJLLLLLL(8, view7);
            }
        } else {
            ViewStub viewStub2 = this.LJIILJJIL;
            if (this.LJIILL == null && viewStub2 != null) {
                View viewLJLLLL2 = C786410Ut5.LJLLLL(viewStub2);
                this.LJIILLIIL = (TextView) viewLJLLLL2.findViewById(R.id.egi);
                this.LJ = (TextView) viewLJLLLL2.findViewById(R.id.egh);
                this.LJIILL = viewLJLLLL2;
            }
            TextView textView2 = this.LJIILLIIL;
            String content2 = "";
            if (textView2 != null) {
                Challenge challenge7 = this.LJIJI;
                if (challenge7 == null) {
                    challenge7 = null;
                }
                if (!C19421210yY.LJ(challenge7)) {
                    title = "";
                } else {
                    title = challenge7.getChallengeDisclaimer().getTitle();
                }
                textView2.setText(title);
            }
            Challenge challenge8 = this.LJIJI;
            if (challenge8 == null) {
                challenge8 = null;
            }
            if (!C19421210yY.LJ(challenge8)) {
                content = "";
            } else {
                content = challenge8.getChallengeDisclaimer().getContent();
            }
            TextView textView3 = this.LJ;
            if (textView3 == null) {
                zBaseIsLeftToRight = 0;
            } else {
                if (C444960Hcc.LIZJ(textView3.getContext())) {
                    i = -1;
                } else {
                    i = -2;
                }
                zBaseIsLeftToRight = new Bidi(content, i).baseIsLeftToRight();
            }
            TextView textView4 = this.LJ;
            if (textView4 != null) {
                if (zBaseIsLeftToRight != 0) {
                    i2 = 3;
                } else {
                    i2 = 5;
                }
                textView4.setGravity(i2);
            }
            TextView textView5 = this.LJ;
            if (textView5 != null) {
                textView5.setTextDirection(!zBaseIsLeftToRight);
            }
            TextView textView6 = this.LJ;
            if (textView6 != null) {
                Challenge challenge9 = this.LJIJI;
                if (challenge9 == null) {
                    challenge9 = null;
                }
                if (C19421210yY.LJ(challenge9)) {
                    content2 = challenge9.getChallengeDisclaimer().getContent();
                }
                textView6.setText(content2);
            }
            View view8 = this.LJIILL;
            if (view8 != null) {
                C786410Ut5.LJLLLLLL(0, view8);
            }
        }
        View view9 = this.LJFF;
        if (view9 != null) {
            C786410Ut5.LJLLLLLL(8, view9);
        }
        Challenge challenge10 = this.LJIJI;
        if (challenge10 == null) {
            challenge10 = null;
        }
        List<CommerceChallengeBanner> list2 = challenge10.commerceChallengeBannerList;
        if (list2 != null && (!list2.isEmpty())) {
            ViewStub viewStub3 = this.LIZLLL;
            if (this.LJFF == null && viewStub3 != null) {
                View viewLJLLLL3 = C786410Ut5.LJLLLL(viewStub3);
                this.LJI = (C11FN) viewLJLLLL3.findViewById(R.id.eg2);
                this.LJFF = viewLJLLLL3;
            }
            CommerceChallengeBanner commerceChallengeBanner = (CommerceChallengeBanner) ListProtector.get(list2, 0);
            Context context2 = this.LJIIZILJ;
            if (context2 == null) {
                context2 = null;
            }
            int iLJIIIIZZ = C14KQ.LJIIIIZZ(context2) - C341940Daq.LIZ(32.0d);
            C11FN c11fn2 = this.LJI;
            if (c11fn2 != null) {
                layoutParams = c11fn2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = iLJIIIIZZ;
                }
            } else {
                layoutParams = null;
            }
            C11FN c11fn3 = this.LJI;
            if (c11fn3 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c11fn3);
                c11fn3.setLayoutParams(layoutParams);
            }
            if (!C086I.LIZIZ(commerceChallengeBanner.icon.getUrlList()) && (c11fn = this.LJI) != null) {
                c11fn.setImageURI((String) ListProtector.get(commerceChallengeBanner.icon.getUrlList(), 0), new C12Z2(this, 3));
            }
            C11FN c11fn4 = this.LJI;
            if (c11fn4 != null) {
                View.OnClickListener aCListenerS131S0200000_29 = new ACListenerS131S0200000_29(this, commerceChallengeBanner, 23);
                if (C1848410yCV.LIZ) {
                    aCListenerS131S0200000_29 = new f(aCListenerS131S0200000_29);
                }
                a aVar = new a(aCListenerS131S0200000_29);
                if (C2213981Bky.LIZIZ.isOffline()) {
                    C2211941Bhg.LIZ.injectViewListener(c11fn4);
                }
                c11fn4.setOnClickListener(aVar);
            }
            View view10 = this.LJFF;
            if (view10 != null) {
                C786410Ut5.LJLLLLLL(0, view10);
            }
            LJIIJ("banner_show");
        }
        Challenge challenge11 = this.LJIJI;
        if (challenge11 == null) {
            challenge11 = null;
        }
        if (!C19421210yY.LIZJ(challenge11)) {
            Challenge challenge12 = this.LJIJI;
            if (challenge12 == null) {
                challenge12 = null;
            }
            if (!C19421210yY.LIZLLL(challenge12)) {
                View view11 = this.LJIIIIZZ;
                if (view11 != null) {
                    C786410Ut5.LJLLLLLL(8, view11);
                    return;
                }
                return;
            }
        }
        ViewStub viewStub4 = this.LJII;
        if (this.LJIIIIZZ == null && viewStub4 != null) {
            View viewLJLLLL4 = C786410Ut5.LJLLLL(viewStub4);
            this.LJIIIZ = (TextView) viewLJLLLL4.findViewById(R.id.mrz);
            this.LJIIJ = viewLJLLLL4.findViewById(R.id.vr6);
            this.LJIIJJI = (TextView) viewLJLLLL4.findViewById(R.id.tu8);
            this.LJIIIIZZ = viewLJLLLL4;
        }
        Challenge challenge13 = this.LJIJI;
        if (challenge13 == null) {
            challenge13 = null;
        }
        if (C19421210yY.LIZJ(challenge13)) {
            Challenge challenge14 = this.LJIJI;
            if (challenge14 == null) {
                challenge14 = null;
            }
            if (C19421210yY.LIZLLL(challenge14) && (view = this.LJIIJ) != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
        TextView textView7 = this.LJIIIZ;
        if (textView7 != null) {
            context = textView7.getContext();
        } else {
            context = null;
        }
        boolean zLIZJ = C444960Hcc.LIZJ(context);
        Challenge challenge15 = this.LJIJI;
        if (challenge15 == null) {
            challenge15 = null;
        }
        if (C19421210yY.LIZLLL(challenge15)) {
            TextView textView8 = this.LJIIJJI;
            if (textView8 != null) {
                Challenge challenge16 = this.LJIJI;
                if (challenge16 == null) {
                    challenge16 = null;
                }
                textView8.setText(challenge16.getRuleDetailDesc());
            }
            TextView textView9 = this.LJIIJJI;
            if (textView9 != null) {
                if (zLIZJ) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                textView9.setGravity(i3);
            }
            TextView textView10 = this.LJIIJJI;
            if (textView10 != null) {
                textView10.setTextDirection(zLIZJ ? 1 : 0);
            }
            Challenge challenge17 = this.LJIJI;
            if (challenge17 == null) {
                challenge17 = null;
            }
            String ruleDetailUrl = challenge17.getRuleDetailUrl();
            InterfaceC19421610yc interfaceC19421610ycLIZ = C04PR.LIZ();
            if (interfaceC19421610ycLIZ != null) {
                Context context3 = this.LJIIZILJ;
                if (context3 == null) {
                    context3 = null;
                }
                interfaceC19421610ycLIZ.LJFF(C1388190mED.LIZIZ(context3), ruleDetailUrl);
            }
            TextView textView11 = this.LJIIJJI;
            if (textView11 != null) {
                C786410Ut5.T7(textView11, new ACListenerS163S0100000_29(this, 200));
            }
            TextView textView12 = this.LJIIJJI;
            if (textView12 != null) {
                C786410Ut5.LLIL(textView12, 0);
            }
        }
        Challenge challenge18 = this.LJIJI;
        if (challenge18 == null) {
            challenge18 = null;
        }
        if (C19421210yY.LIZJ(challenge18)) {
            TextView textView13 = this.LJIIIZ;
            if (textView13 != null) {
                Challenge challenge19 = this.LJIJI;
                if (challenge19 != null) {
                    challenge2 = challenge19;
                }
                textView13.setText(challenge2.getLinkText());
            }
            TextView textView14 = this.LJIIIZ;
            if (textView14 != null) {
                if (zLIZJ) {
                    i4 = 5;
                }
                textView14.setGravity(i4);
            }
            TextView textView15 = this.LJIIIZ;
            if (textView15 != null) {
                textView15.setTextDirection(zLIZJ ? 1 : 0);
            }
            TextView textView16 = this.LJIIIZ;
            if (textView16 != null) {
                C786410Ut5.T7(textView16, new ACListenerS163S0100000_29(this, 201));
            }
            TextView textView17 = this.LJIIIZ;
            if (textView17 != null) {
                C786410Ut5.LLIL(textView17, 0);
            }
            LJIIJJI("show_link");
        }
        View view12 = this.LJIIIIZZ;
        if (view12 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view12);
    }

    @Override // X.InterfaceC19418110y3
    public final void LJIIIIZZ(ViewStub viewStub, int i) {
        this.LJIIL = viewStub;
        if (viewStub != null) {
            viewStub.setLayoutResource(i);
        }
    }
}

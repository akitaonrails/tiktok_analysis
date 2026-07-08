package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExplorePostItem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.FriendVideoMoreOperator;
import com.ss.android.ugc.aweme.feed.model.explore.ExploreClientExtra;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.06wF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1768506wF implements InterfaceC1255404vg {
    public final int $t;

    @Override // X.InterfaceC1255404vg
    public final InterfaceC1603360rpG LIZ(C2189821An6 c2189821An6, AbstractC1255880imo<?, ?> abstractC1255880imo, JediViewModel<?> jediViewModel) {
        switch (this.$t) {
            case 0:
                return LIZ$0(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 1:
                return LIZ$1(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 2:
                return LIZ$2(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 3:
                return LIZ$3(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 4:
                return LIZ$4(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 5:
                return LIZ$5(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 6:
                return LIZ$6(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 7:
                return LIZ$7(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 8:
                return LIZ$8(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case BdTuring.TYPE_ECAF /* 9 */:
                return LIZ$9(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return LIZ$10(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return LIZ$11(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return LIZ$12(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return LIZ$13(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 14:
                return LIZ$14(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 15:
                return LIZ$15(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 16:
                return LIZ$16(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return LIZ$17(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return LIZ$18(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 19:
                return LIZ$19(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return LIZ$20(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 21:
                return LIZ$21(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 22:
                return LIZ$22(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 23:
                return LIZ$23(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return LIZ$24(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 25:
                return LIZ$25(this, c2189821An6, abstractC1255880imo, jediViewModel);
            default:
                return null;
        }
    }

    public C1768506wF(int i) {
        this.$t = i;
    }

    public static final InterfaceC1603360rpG LIZ$0(C1768506wF c1768506wF, C2189821An6 c2189821An6, final AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<C615590OCn, C1255920ims<C615590OCn>>(abstractC1255880imo) { // from class: X.0Ok8
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return i + 25000;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mModel = (!(abstractC1255880imo instanceof C615590OCn) || abstractC1255880imo == null) ? new C615590OCn() : abstractC1255880imo;
                this.mPresenter = new C1255920ims();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An62.getAimeStyleId(), Integer.valueOf(c2189821An62.getVideoType()), 0);
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$1(C1768506wF c1768506wF, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C1216480hlG(abstractC1255880imo, "from_discovery_challenge");
    }

    public static final InterfaceC1603360rpG LIZ$10(C1768506wF c1768506wF, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C1219040hpO(c2189821An6);
    }

    public static final InterfaceC1603360rpG LIZ$11(C1768506wF c1768506wF, C2189821An6 c2189821An6, final AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        final String uid = c2189821An6.getUid();
        return new AbstractC1216410hl9<AbstractC1255880imo<?, ?>, C1255920ims<AbstractC1255880imo<?, ?>>>(abstractC1255880imo, uid) { // from class: X.0OrL
            public final boolean LL;
            public final String LLILLJJLI;

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                int i2;
                if (this.LL) {
                    i2 = LSPassThroughRecordSizeConfig.DEFAULT;
                } else {
                    i2 = 2000;
                }
                return i2 + i;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mModel = abstractC1255880imo == null ? C2277881EDy.LIZIZ.createAwemeModel() : abstractC1255880imo;
                this.mPresenter = new C1255920ims();
                this.LL = true;
                this.LLILLJJLI = uid;
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                boolean zLIZ = C2105908Mv.LIZ(c2189821An62.getSecUid());
                int i3 = LSPassThroughRecordSizeConfig.DEFAULT;
                if (zLIZ) {
                    PRESENTER presenter = this.mPresenter;
                    Object[] objArr = new Object[5];
                    objArr[0] = Integer.valueOf(i);
                    objArr[1] = Boolean.TRUE;
                    objArr[2] = this.LLILLJJLI;
                    objArr[3] = Integer.valueOf(c2189821An62.getVideoType());
                    if (!this.LL) {
                        i3 = 2000;
                    }
                    objArr[4] = Integer.valueOf(i3);
                    presenter.LIZJ(objArr);
                    return;
                }
                PRESENTER presenter2 = this.mPresenter;
                Object[] objArr2 = new Object[6];
                objArr2[0] = Integer.valueOf(i);
                objArr2[1] = Boolean.TRUE;
                objArr2[2] = this.LLILLJJLI;
                objArr2[3] = Integer.valueOf(c2189821An62.getVideoType());
                if (!this.LL) {
                    i3 = 2000;
                }
                objArr2[4] = Integer.valueOf(i3);
                objArr2[5] = c2189821An62.getSecUid();
                presenter2.LIZJ(objArr2);
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$12(C1768506wF c1768506wF, C2189821An6 c2189821An6, final AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<C1401320mZO, C1255920ims<C1401320mZO>>(abstractC1255880imo) { // from class: X.0hlE
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return i + 4000;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                if ((abstractC1255880imo instanceof C1255910imr) || (abstractC1255880imo instanceof C1401320mZO)) {
                    this.mModel = abstractC1255880imo;
                } else {
                    this.mModel = new C1401320mZO();
                }
                this.mPresenter = new C1255920ims();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An62.getMusicId(), Integer.valueOf(c2189821An62.getVideoType()));
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$13(C1768506wF c1768506wF, C2189821An6 c2189821An6, final AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<C1243280iSU, C1255920ims<C1243280iSU>>(abstractC1255880imo) { // from class: X.0hlD
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return i + 29000;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mModel = abstractC1255880imo instanceof C1243280iSU ? abstractC1255880imo : null;
                this.mPresenter = new C1255920ims();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                PRESENTER presenter = this.mPresenter;
                if (presenter != 0) {
                    presenter.LIZJ(Integer.valueOf(i), c2189821An62.getMusicId(), Integer.valueOf(c2189821An62.getVideoType()));
                }
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$14(C1768506wF c1768506wF, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<C628040OkE, C1255920ims<C628040OkE>>() { // from class: X.0OkD
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final boolean isDataEmpty() {
                return this.mModel.isDataEmpty();
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mModel = new AbstractC1255880imo<Aweme, CollectionDetailModel>() { // from class: X.0OkE
                    public final List<Aweme> LL = new ArrayList();

                    @Override // X.AbstractC666100QAu
                    public final boolean checkParams(Object... objArr) {
                        return true;
                    }

                    @Override // X.AbstractC1255880imo
                    public final boolean isHasMore() {
                        return false;
                    }

                    @Override // X.AbstractC1255880imo
                    public final void loadMoreList(Object... objArr) {
                    }

                    @Override // X.AbstractC1255880imo
                    public final void refreshList(Object... objArr) {
                    }

                    @Override // X.AbstractC1255880imo
                    public final List<Aweme> getItems() {
                        return this.LL;
                    }
                };
                this.mPresenter = new C1255920ims();
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$15(C1768506wF c1768506wF, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        if (abstractC1255880imo instanceof C329440Cvm) {
            final C329440Cvm c329440Cvm = (C329440Cvm) abstractC1255880imo;
            return new AbstractC1216410hl9<C329440Cvm, C643680PMo>(c329440Cvm) { // from class: X.0PMp
                public final C329440Cvm LL;

                @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
                public final int getPageType(int i) {
                    return 38;
                }

                @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
                public final Object getViewModel() {
                    return this.LL;
                }

                {
                    this.LL = c329440Cvm;
                    this.mModel = c329440Cvm;
                    this.mPresenter = new AbstractC666280QBm<C329440Cvm, Aweme>() { // from class: X.0PMo
                        @Override // X.AbstractC666280QBm, X.C1255920ims, X.C1260870iur
                        public final void LIZ() {
                            C329440Cvm c329440Cvm2 = (C329440Cvm) this.LL;
                            if (c329440Cvm2 != null) {
                                ((ArrayList) c329440Cvm2.LLILZLL).clear();
                                ((ArrayList) c329440Cvm2.LLIZ).clear();
                            }
                            super.LIZ();
                        }

                        @Override // X.AbstractC666280QBm
                        public final List<Aweme> LJIJJ() {
                            C329440Cvm c329440Cvm2 = (C329440Cvm) this.LL;
                            if (c329440Cvm2 != null) {
                                return c329440Cvm2.LLIZ;
                            }
                            return null;
                        }

                        @Override // X.AbstractC666280QBm
                        public final List<Aweme> LJIJJLI() {
                            C329440Cvm c329440Cvm2 = (C329440Cvm) this.LL;
                            if (c329440Cvm2 != null) {
                                return c329440Cvm2.LLIZ;
                            }
                            return null;
                        }

                        @Override // X.AbstractC666280QBm
                        public final String LJIJI(Aweme aweme) {
                            Aweme aweme2 = aweme;
                            if (aweme2 != null) {
                                return aweme2.getAid();
                            }
                            return null;
                        }
                    };
                }
            };
        }
        return null;
    }

    public static final InterfaceC1603360rpG LIZ$16(C1768506wF c1768506wF, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C643760PMw();
    }

    public static final InterfaceC1603360rpG LIZ$17(C1768506wF c1768506wF, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        if (abstractC1255880imo instanceof C0PN5) {
            final C0PN5 c0pn5 = (C0PN5) abstractC1255880imo;
            return new AbstractC1216410hl9<C0PN5, C0PN6>(c0pn5) { // from class: X.0PN7
                public final C0PN5 LL;

                @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
                public final int getPageType(int i) {
                    return 38;
                }

                @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
                public final Object getViewModel() {
                    return this.LL;
                }

                {
                    this.LL = c0pn5;
                    this.mModel = c0pn5;
                    this.mPresenter = new AbstractC666280QBm<C0PN5, Aweme>() { // from class: X.0PN6
                        @Override // X.AbstractC666280QBm
                        public final List<Aweme> LJIJJ() {
                            C0PN5 c0pn52 = (C0PN5) this.LL;
                            if (c0pn52 != null) {
                                return c0pn52.LL;
                            }
                            return null;
                        }

                        @Override // X.AbstractC666280QBm
                        public final List<Aweme> LJIJJLI() {
                            C0PN5 c0pn52 = (C0PN5) this.LL;
                            if (c0pn52 != null) {
                                return c0pn52.LL;
                            }
                            return null;
                        }

                        @Override // X.AbstractC666280QBm
                        public final String LJIJI(Aweme aweme) {
                            Aweme aweme2 = aweme;
                            if (aweme2 != null) {
                                return aweme2.getAid();
                            }
                            return null;
                        }
                    };
                }
            };
        }
        return null;
    }

    public static final InterfaceC1603360rpG LIZ$18(C1768506wF c1768506wF, C2189821An6 c2189821An6, final AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<C628180OkS, C1255920ims<C628180OkS>>(abstractC1255880imo) { // from class: X.0OkT
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return i + 24000;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mModel = (!(abstractC1255880imo instanceof C628180OkS) || abstractC1255880imo == null) ? new C628180OkS() : abstractC1255880imo;
                this.mPresenter = new C1255920ims();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An62.getTemplateId(), Integer.valueOf(c2189821An62.getVideoType()), Integer.valueOf(c2189821An62.getTemplateType()));
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$19(C1768506wF c1768506wF, C2189821An6 c2189821An6, final AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<AnonymousClass1120, C1255920ims<AnonymousClass1120>>(abstractC1255880imo) { // from class: X.0hl5
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return i + 21000;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mModel = (!(abstractC1255880imo instanceof AnonymousClass1120) || abstractC1255880imo == null) ? new AnonymousClass1120() : abstractC1255880imo;
                this.mPresenter = new C1255920ims();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An62.getVoiceId(), Integer.valueOf(c2189821An62.getVideoType()));
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$2(C1768506wF c1768506wF, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C1216480hlG(abstractC1255880imo, "from_challenge");
    }

    public static final InterfaceC1603360rpG LIZ$20(C1768506wF c1768506wF, C2189821An6 c2189821An6, final AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<C1401670mZx, C1255920ims<C1401670mZx>>(abstractC1255880imo) { // from class: X.0hl6
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return i + 22000;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mModel = (!(abstractC1255880imo instanceof C1401670mZx) || abstractC1255880imo == null) ? new C1401670mZx() : abstractC1255880imo;
                this.mPresenter = new C1255920ims();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An62.getVoiceId(), Integer.valueOf(c2189821An62.getVideoType()));
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$21(C1768506wF c1768506wF, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C1EBU((EffectProfileListViewModel) jediViewModel);
    }

    public static final InterfaceC1603360rpG LIZ$22(C1768506wF c1768506wF, C2189821An6 c2189821An6, final AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<AbstractC1255880imo<?, ?>, C1255920ims<AbstractC1255880imo<?, ?>>>(abstractC1255880imo) { // from class: X.0OkB
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return i;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mModel = abstractC1255880imo;
                this.mPresenter = new C1255920ims();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final boolean init(Fragment fragment) {
                if (this.mModel != 0) {
                    return true;
                }
                return false;
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$23(C1768506wF c1768506wF, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C1216350hl3(abstractC1255880imo, true, c2189821An6.getUid(), c2189821An6.getAid());
    }

    public static final InterfaceC1603360rpG LIZ$24(C1768506wF c1768506wF, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C1216350hl3(abstractC1255880imo, false, c2189821An6.getUid(), c2189821An6.getAid());
    }

    public static final InterfaceC1603360rpG LIZ$25(C1768506wF c1768506wF, C2189821An6 c2189821An6, final AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<C0OCM, C1255920ims<C0OCM>>(abstractC1255880imo) { // from class: X.0OkC
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return i + 22000;
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0P3e] */
            {
                this.mModel = abstractC1255880imo instanceof C0OCM ? abstractC1255880imo : null;
                this.mPresenter = new C1255920ims<C0OCM>() { // from class: X.0P3e
                    @Override // X.C1255920ims, X.C1260870iur, X.InterfaceC1526205yG
                    public final void onSuccess() {
                        K k;
                        C0OCM c0ocm = (C0OCM) this.LL;
                        if (c0ocm == null || (k = this.LLILLJJLI) == 0) {
                            return;
                        }
                        int i = c0ocm.mListQueryType;
                        if (i == 1) {
                            if (c0ocm.isDataEmpty()) {
                                ((InterfaceC1212360hec) this.LLILLJJLI).Ng1();
                                return;
                            } else {
                                ((InterfaceC1212360hec) this.LLILLJJLI).LLJJJIL(c0ocm.LLILZIL, c0ocm.isHasMore());
                                return;
                            }
                        }
                        if (i == 2) {
                            ((InterfaceC1212360hec) k).mE(c0ocm.LLILZIL, !c0ocm.isNewDataEmpty());
                        } else if (i == 4 || i == 16) {
                            ((InterfaceC1212360hec) k).Pj(c0ocm.LLILZIL, c0ocm.isHasMore() && !c0ocm.isNewDataEmpty());
                        }
                    }
                };
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                PRESENTER presenter = this.mPresenter;
                if (presenter != 0) {
                    presenter.LIZJ(Integer.valueOf(i), c2189821An62.getAddyoursTopicId(), Integer.valueOf(c2189821An62.getVideoType()), Boolean.valueOf(z), c2189821An62.getIds(), Boolean.FALSE);
                }
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$3(C1768506wF c1768506wF, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<C194457115z, C1255920ims<C194457115z>>() { // from class: X.0hlF
        };
    }

    public static final InterfaceC1603360rpG LIZ$4(C1768506wF c1768506wF, C2189821An6 c2189821An6, final AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<C12B3, C1255920ims<C12B3>>(abstractC1255880imo) { // from class: X.0hlH
            /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mModel = abstractC1255880imo instanceof C12B3 ? abstractC1255880imo : new C12B3(null);
                this.mPresenter = new C1255920ims();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An62, Integer.valueOf(i2), Boolean.valueOf(z));
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$5(C1768506wF c1768506wF, C2189821An6 c2189821An6, final AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<C1525405y8, C1255920ims<C1525405y8>>(abstractC1255880imo) { // from class: X.0Ok9
            /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mModel = abstractC1255880imo instanceof C1525405y8 ? abstractC1255880imo : new C1525405y8(0L, null);
                this.mPresenter = new C1255920ims();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                this.mPresenter.LIZJ(Integer.valueOf(i), c2189821An62, Integer.valueOf(i2), Boolean.valueOf(z));
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$6(C1768506wF c1768506wF, C2189821An6 c2189821An6, final AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<C1617670sCL, C1617660sCK>(abstractC1255880imo) { // from class: X.0sCJ
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return 35;
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final boolean init(Fragment fragment) {
                return true;
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final Object getViewModel() {
                MODEL model = this.mModel;
                return model == 0 ? new C1617670sCL() : model;
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final boolean isDataEmpty() {
                return this.mModel.isDataEmpty();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final boolean isLoading() {
                return this.mModel.isLoading();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void unInit() {
                List<ExplorePostItem> list;
                ExploreClientExtra exploreClientExtra;
                C1617670sCL c1617670sCL = this.mModel;
                List<C1617730sCR> list2 = c1617670sCL.LLILLJJLI;
                if (list2 == null || C13LP.LJJJLZIJ(0, list2) == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ExploreAwemeList exploreAwemeList = (ExploreAwemeList) c1617670sCL.mData;
                if (exploreAwemeList == null || (list = exploreAwemeList.items) == null) {
                    return;
                }
                for (ExplorePostItem explorePostItem : list) {
                    Aweme aweme = explorePostItem.aweme;
                    if (aweme != null && (exploreClientExtra = AwemeBizExtKt.getExploreClientExtra(aweme)) != null && exploreClientExtra.cacheType == 1) {
                        arrayList.add(explorePostItem);
                    }
                }
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [PRESENTER extends X.0ims<MODEL>, X.0sCK] */
            {
                this.mModel = (!(abstractC1255880imo instanceof C1617670sCL) || abstractC1255880imo == null) ? new C1617670sCL() : abstractC1255880imo;
                this.mPresenter = new C1255920ims<C1617670sCL>() { // from class: X.0sCK
                };
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$7(C1768506wF c1768506wF, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new FriendVideoMoreOperator(abstractC1255880imo);
    }

    public static final InterfaceC1603360rpG LIZ$8(C1768506wF c1768506wF, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C666310QBp(c2189821An6.getUidList(), c2189821An6.getBlueDotList());
    }

    public static final InterfaceC1603360rpG LIZ$9(C1768506wF c1768506wF, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C1588410rR9(abstractC1255880imo);
    }
}

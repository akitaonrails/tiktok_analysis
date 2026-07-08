package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0R4K, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4K implements InterfaceC1255404vg {
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
            default:
                return null;
        }
    }

    public C0R4K(int i) {
        this.$t = i;
    }

    public static final InterfaceC1603360rpG LIZ$0(C0R4K c0r4k, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C1588440rRC(abstractC1255880imo);
    }

    public static final InterfaceC1603360rpG LIZ$1(C0R4K c0r4k, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        final String ids = c2189821An6.getIds();
        return new C666130QAx(ids) { // from class: X.0QB0
            @Override // X.C666130QAx, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return i + 4000;
            }

            @Override // X.C666130QAx, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                this.LLILLJJLI.LLILLJJLI = c2189821An62.getPageType();
                super.request(i, c2189821An62, i2, z);
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$10(C0R4K c0r4k, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        InterfaceC1010140cOS interfaceC1010140cOSLJIIIIZZ;
        if (abstractC1255880imo instanceof C0PI3) {
            ISearchAdMainService iSearchAdMainService = (ISearchAdMainService) PluggableExtentionKt.pluggableSpi$default(ISearchAdMainService.class, false, false, false, 14, null);
            if (iSearchAdMainService != null && (interfaceC1010140cOSLJIIIIZZ = iSearchAdMainService.LJIIIIZZ()) != null) {
                interfaceC1010140cOSLJIIIIZZ.LJIIL();
            }
            return new C0PMS((C0PI3) abstractC1255880imo);
        }
        if (abstractC1255880imo instanceof C0DY9) {
            final C0DY9 c0dy9 = (C0DY9) abstractC1255880imo;
            return new AbstractC1216410hl9<C0DY9, C643610PMh>(c0dy9) { // from class: X.0PMW
                public final C0DY9 LL;

                @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
                public final int getPageType(int i) {
                    return 9;
                }

                {
                    this.LL = c0dy9;
                    this.mModel = c0dy9;
                    this.mPresenter = new AbstractC666280QBm<C0DY9, Aweme>() { // from class: X.0PMh
                        @Override // X.AbstractC666280QBm
                        public final List<Aweme> LJIJJ() {
                            AbstractC1255880imo abstractC1255880imo2 = (AbstractC1255880imo) this.LL;
                            if (abstractC1255880imo2 != null) {
                                return abstractC1255880imo2.getItems();
                            }
                            return null;
                        }

                        @Override // X.AbstractC666280QBm
                        public final List<Aweme> LJIJJLI() {
                            AbstractC1255880imo abstractC1255880imo2 = (AbstractC1255880imo) this.LL;
                            if (abstractC1255880imo2 != null) {
                                return abstractC1255880imo2.getItems();
                            }
                            return null;
                        }

                        @Override // X.AbstractC666280QBm
                        public final String LJIJI(Aweme aweme) {
                            Aweme aweme2 = aweme;
                            if (aweme2 == null) {
                                return "";
                            }
                            return C735370Ssx.LIZJ(aweme2);
                        }
                    };
                }
            };
        }
        if (abstractC1255880imo instanceof C329550Cvx) {
            final C329550Cvx c329550Cvx = (C329550Cvx) abstractC1255880imo;
            return new AbstractC1216410hl9<C329550Cvx, C643620PMi>(c329550Cvx) { // from class: X.0PMj
                public final C329550Cvx LL;

                @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
                public final int getPageType(int i) {
                    return 9;
                }

                {
                    this.LL = c329550Cvx;
                    this.mModel = c329550Cvx;
                    this.mPresenter = new AbstractC666280QBm<C329550Cvx, Aweme>() { // from class: X.0PMi
                        @Override // X.AbstractC666280QBm
                        public final List<Aweme> LJIJJ() {
                            C329550Cvx c329550Cvx2 = (C329550Cvx) this.LL;
                            if (c329550Cvx2 != null) {
                                return c329550Cvx2.LLILZ;
                            }
                            return null;
                        }

                        @Override // X.AbstractC666280QBm
                        public final List<Aweme> LJIJJLI() {
                            C329550Cvx c329550Cvx2 = (C329550Cvx) this.LL;
                            if (c329550Cvx2 != null) {
                                return c329550Cvx2.LLILZ;
                            }
                            return null;
                        }

                        @Override // X.AbstractC666280QBm
                        public final String LJIJI(Aweme aweme) {
                            Aweme aweme2 = aweme;
                            if (aweme2 == null) {
                                return "";
                            }
                            return C735370Ssx.LIZJ(aweme2);
                        }
                    };
                }

                @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
                public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
                    super.bindView(interfaceC1209780haS);
                    C443030HYv.LIZJ(interfaceC1209780haS);
                }
            };
        }
        if (abstractC1255880imo instanceof C0DRV) {
            final C0DRV c0drv = (C0DRV) abstractC1255880imo;
            return new AbstractC1216410hl9<C0DRV, C643660PMm>(c0drv) { // from class: X.0PMl
                public final C0DRV LL;

                @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
                public final int getPageType(int i) {
                    return 9;
                }

                {
                    this.LL = c0drv;
                    this.mModel = c0drv;
                    this.mPresenter = new AbstractC666280QBm<C0DRV, Aweme>() { // from class: X.0PMm
                        @Override // X.AbstractC666280QBm
                        public final List<Aweme> LJIJJ() {
                            AbstractC1255880imo abstractC1255880imo2 = (AbstractC1255880imo) this.LL;
                            if (abstractC1255880imo2 != null) {
                                return abstractC1255880imo2.getItems();
                            }
                            return null;
                        }

                        @Override // X.AbstractC666280QBm
                        public final List<Aweme> LJIJJLI() {
                            AbstractC1255880imo abstractC1255880imo2 = (AbstractC1255880imo) this.LL;
                            if (abstractC1255880imo2 != null) {
                                return abstractC1255880imo2.getItems();
                            }
                            return null;
                        }

                        @Override // X.AbstractC666280QBm
                        public final String LJIJI(Aweme aweme) {
                            Aweme aweme2 = aweme;
                            if (aweme2 == null) {
                                return "";
                            }
                            return C735370Ssx.LIZJ(aweme2);
                        }
                    };
                }

                @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
                public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
                    super.bindView(interfaceC1209780haS);
                    C443030HYv.LIZJ(interfaceC1209780haS);
                }
            };
        }
        return new C0PMT(abstractC1255880imo);
    }

    public static final InterfaceC1603360rpG LIZ$11(C0R4K c0r4k, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C643700PMq(abstractC1255880imo);
    }

    public static final InterfaceC1603360rpG LIZ$12(C0R4K c0r4k, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C643700PMq(abstractC1255880imo);
    }

    public static final InterfaceC1603360rpG LIZ$2(C0R4K c0r4k, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        final String ids = c2189821An6.getIds();
        return new C666130QAx(ids) { // from class: X.0QAz
            @Override // X.C666130QAx, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return i + LivePreCreateNextRoomPlayer.ENABLE;
            }

            @Override // X.C666130QAx, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                this.LLILLJJLI.LLILLJJLI = c2189821An62.getPageType();
                super.request(i, c2189821An62, i2, z);
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$3(C0R4K c0r4k, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C643750PMv(abstractC1255880imo);
    }

    public static final InterfaceC1603360rpG LIZ$4(C0R4K c0r4k, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C1210250hbD();
    }

    public static final InterfaceC1603360rpG LIZ$5(C0R4K c0r4k, C2189821An6 c2189821An6, final AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new AbstractC1216410hl9<C1360750lVx, C1255920ims<C1360750lVx>>(abstractC1255880imo) { // from class: X.0hlA
            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                return i;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [PRESENTER extends X.0ims<MODEL>, X.0ims] */
            {
                this.mPresenter = new C1255920ims();
                this.mModel = abstractC1255880imo instanceof C1360750lVx ? abstractC1255880imo : new C1360750lVx();
            }

            @Override // X.AbstractC1216410hl9, X.InterfaceC1603360rpG
            public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("queryType: ");
                sbLIZ.append(i);
                sbLIZ.append(", top up1: ");
                sbLIZ.append(c2189821An62.getExtra().get("upvoter1_uid"));
                sbLIZ.append(", top2 up2: ");
                sbLIZ.append(c2189821An62.getExtra().get("upvoter2_uid"));
                sbLIZ.append(", videoType: ");
                sbLIZ.append(c2189821An62.getVideoType());
                c2276471E8n.LIZIZ("detail_feed", "InboxRepostList", C2188811AlT.LIZIZ(sbLIZ));
                PRESENTER presenter = this.mPresenter;
                Object[] objArr = new Object[4];
                objArr[0] = Integer.valueOf(i);
                Object obj = c2189821An62.getExtra().get("upvoter1_uid");
                Object obj2 = "";
                if (obj == null) {
                    obj = "";
                }
                objArr[1] = obj;
                Object obj3 = c2189821An62.getExtra().get("upvoter2_uid");
                if (obj3 != null) {
                    obj2 = obj3;
                }
                objArr[2] = obj2;
                objArr[3] = Integer.valueOf(c2189821An62.getVideoType());
                presenter.LIZJ(objArr);
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$6(C0R4K c0r4k, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        C645680PUg.LIZIZ = false;
        C645680PUg.LIZJ = false;
        if (C078I.LIZ()) {
            final Aweme aweme = C666390QBx.LIZ;
            C666390QBx.LIZ = null;
            return new InterfaceC1603360rpG(aweme) { // from class: X.0Pke
                public final C653800Pkg LL;
                public final C653810Pkh LLILLJJLI = new C1260870iur<C653800Pkg, InterfaceC653820Pki>() { // from class: X.0Pkh
                    @Override // X.C1260870iur, X.InterfaceC1526205yG
                    public final void onSuccess() {
                        T t;
                        if (this.LLILLJJLI == 0 || (t = this.LL) == 0 || t.getData() == null) {
                            return;
                        }
                        ((InterfaceC653820Pki) this.LLILLJJLI).Pc2(((C653790Pkf) this.LL.getData()).LIZ);
                    }

                    @Override // X.C1260870iur, X.InterfaceC1526205yG
                    public final void onFailed(Exception exc) {
                        InterfaceC653820Pki interfaceC653820Pki = (InterfaceC653820Pki) this.LLILLJJLI;
                        if (interfaceC653820Pki != null) {
                            interfaceC653820Pki.YB1(exc);
                        }
                    }
                };

                @Override // X.InterfaceC1603360rpG
                public final /* synthetic */ boolean cannotLoadLatest() {
                    return false;
                }

                @Override // X.InterfaceC1603360rpG
                public final /* synthetic */ boolean cannotLoadMore() {
                    return false;
                }

                @Override // X.InterfaceC1603360rpG
                public final boolean deleteItem(String str) {
                    return true;
                }

                @Override // X.InterfaceC1603360rpG
                public final int getPageType(int i) {
                    return -1;
                }

                @Override // X.InterfaceC1603360rpG
                public final boolean init(Fragment fragment) {
                    return true;
                }

                @Override // X.InterfaceC1603360rpG
                public final boolean isLoading() {
                    return false;
                }

                @Override // X.InterfaceC1603360rpG
                public final boolean isDataEmpty() {
                    return getData() == null || C086I.LIZIZ(getData().LIZ);
                }

                @Override // X.InterfaceC1603360rpG
                public final void unInit() {
                    LIZ();
                    LJIILJJIL();
                }

                @Override // X.InterfaceC1603360rpG
                public final Object getViewModel() {
                    return this.LL;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [X.0Pkg] */
                /* JADX WARN: Type inference failed for: r0v1, types: [X.0Pkh] */
                {
                    this.LL = new AbstractC666100QAu<C653790Pkf>(aweme) { // from class: X.0Pkg
                        public final Aweme LL;

                        @Override // X.AbstractC666100QAu
                        public final boolean checkParams(Object... objArr) {
                            return true;
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [T, X.0Pkf] */
                        {
                            this.LL = aweme;
                            this.mData = new C653790Pkf();
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // X.AbstractC666100QAu
                        public final boolean sendRequest(Object... objArr) {
                            ((ArrayList) ((C653790Pkf) this.mData).LIZ).add(this.LL);
                            List<InterfaceC1526205yG> list = this.mNotifyListeners;
                            if (list != null) {
                                Iterator<InterfaceC1526205yG> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    it2.next().onSuccess();
                                }
                                return false;
                            }
                            return false;
                        }
                    };
                }

                @Override // X.InterfaceC1603360rpG
                public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
                    C653810Pkh c653810Pkh = this.LLILLJJLI;
                    c653810Pkh.LLILLJJLI = interfaceC1209780haS;
                    c653810Pkh.LJIIJ(this.LL);
                }

                @Override // X.InterfaceC1603360rpG
                public final void request(int i, C2189821An6 c2189821An62, int i2, boolean z) {
                    LIZJ(Integer.valueOf(i));
                }
            };
        }
        if (TextUtils.isEmpty(c2189821An6.getIds()) && TextUtils.isEmpty(c2189821An6.getPushParams())) {
            return new C1210250hbD();
        }
        return new C666130QAx(c2189821An6.getIds());
    }

    public static final InterfaceC1603360rpG LIZ$7(C0R4K c0r4k, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C643730PMt(abstractC1255880imo);
    }

    public static final InterfaceC1603360rpG LIZ$8(C0R4K c0r4k, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C643730PMt(abstractC1255880imo);
    }

    public static final InterfaceC1603360rpG LIZ$9(C0R4K c0r4k, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C643640PMk(abstractC1255880imo);
    }
}

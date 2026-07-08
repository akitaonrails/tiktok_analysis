package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.tns.banner.VideoReviewStatusVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.poi.commonalbum.model.AlbumTrackParams;
import com.ss.android.ugc.aweme.poi.commonalbum.ui.LocalServiceAlbumStatusAssem;
import com.ss.android.ugc.aweme.poi.commonalbum.ui.LocalServiceRequestMediaAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.text.ui.SearchTop1CardMarkdownAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.text.ui.SearchTop1CardTextAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers.SchoolUsersListFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS407S0200000_6;

/* JADX INFO: renamed from: X.0IE5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IE5 extends C09AY implements InterfaceC1631630sYr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4);
            case 7:
                return invoke$7(this, obj, obj2, obj3, obj4);
            case 8:
                return invoke$8(this, obj, obj2, obj3, obj4);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IE5(C441190HRt c441190HRt, int i) {
        super(4);
        this.$t = i;
        this.l0 = c441190HRt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IE5(C443970Hb1 c443970Hb1, int i) {
        super(4);
        this.$t = i;
        this.l0 = c443970Hb1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IE5(VideoReviewStatusVM videoReviewStatusVM, int i) {
        super(4);
        this.$t = i;
        this.l0 = videoReviewStatusVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IE5(LocalServiceAlbumStatusAssem localServiceAlbumStatusAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = localServiceAlbumStatusAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IE5(LocalServiceRequestMediaAssem localServiceRequestMediaAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = localServiceRequestMediaAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IE5(SearchTop1CardMarkdownAssem searchTop1CardMarkdownAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = searchTop1CardMarkdownAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IE5(SearchTop1CardTextAssem searchTop1CardTextAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = searchTop1CardTextAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IE5(MixStudioHomePageAssem mixStudioHomePageAssem, int i) {
        super(4);
        this.$t = i;
        this.l0 = mixStudioHomePageAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IE5(SchoolUsersListFragment schoolUsersListFragment, int i) {
        super(4);
        this.$t = i;
        this.l0 = schoolUsersListFragment;
    }

    public static final Object invoke$0(C0IE5 c0ie5, Object obj, Object obj2, Object obj3, Object obj4) {
        String fromGroupId;
        View view = (View) obj2;
        String str = (String) obj3;
        ((Boolean) obj4).booleanValue();
        VideoItemParams item = ((VideoReviewStatusVM) c0ie5.l0).getItem();
        if (item != null) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "personal_homepage");
            Aweme aweme = item.getAweme();
            if (aweme == null || (fromGroupId = AwemeExtKt.getFromGroupId(aweme)) == null) {
                fromGroupId = "";
            }
            c2344009Gk.LJIIIIZZ("group_id", fromGroupId);
            C20684815ws.LJIILLIIL("enter_appeal", c2344009Gk.LIZ);
            if (!TextUtils.isEmpty(str)) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://webview/");
                smartRouteBuildRoute.withParam(UriProtector.parse(str));
                smartRouteBuildRoute.open();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C0IE5 c0ie5, Object obj, Object obj2, Object obj3, Object obj4) {
        Map<String, String> map;
        Map<String, String> map2;
        AlbumTrackParams albumTrackParams;
        AlbumTrackParams albumTrackParams2;
        UIAssem uIAssem = (UIAssem) obj;
        if (obj2 == C0HVI.ALBUM_NO_PERMISSION && obj3 == C0HVW.NO_TAKE_PHOTO_PERMISSION && obj4 == C0HVQ.ALBUM_PERMISSION_CHECK) {
            if (uIAssem.LJJIJL().getVisibility() != 0) {
                int iZQ2 = ((LocalServiceAlbumStatusAssem) c0ie5.l0).Go().zQ2();
                boolean zYQ2 = ((LocalServiceAlbumStatusAssem) c0ie5.l0).Go().yQ2();
                String strXQ2 = ((LocalServiceAlbumStatusAssem) c0ie5.l0).Go().xQ2();
                PageFinder pageFinderVia = PageFinder.via(uIAssem.LJJIJL());
                C442110HVh c442110HVh = ((LocalServiceAlbumStatusAssem) c0ie5.l0).Go().LLJI;
                if (c442110HVh != null && (albumTrackParams2 = c442110HVh.LJFF) != null) {
                    map = albumTrackParams2.generalMobParams;
                } else {
                    map = null;
                }
                C442090HVf.LIZIZ(iZQ2, zYQ2, strXQ2, pageFinderVia, map);
                PageFinder pageFinderVia2 = PageFinder.via(uIAssem.LJJIJL());
                C442110HVh c442110HVh2 = ((LocalServiceAlbumStatusAssem) c0ie5.l0).Go().LLJI;
                if (c442110HVh2 != null && (albumTrackParams = c442110HVh2.LJFF) != null) {
                    map2 = albumTrackParams.generalMobParams;
                } else {
                    map2 = null;
                }
                C442090HVf.LIZLLL(pageFinderVia2, "permission_page_show", "", map2);
            }
            C337180DJs.LIZJ(uIAssem.LJJIJL());
            C337180DJs.LIZJ(((C436070H8b) ((LocalServiceAlbumStatusAssem) c0ie5.l0).LLIZLLLIL.getValue()).LLILLJJLI);
            C1749280vcc c1749280vcc = ((C436070H8b) ((LocalServiceAlbumStatusAssem) c0ie5.l0).LLIZLLLIL.getValue()).LLILLJJLI;
            LocalServiceAlbumStatusAssem localServiceAlbumStatusAssem = (LocalServiceAlbumStatusAssem) c0ie5.l0;
            c1749280vcc.setLayoutVariant(1);
            c1749280vcc.setStatus(C444600Hc2.LIZ(c1749280vcc.getContext(), c1749280vcc, C444540Hbw.LIZ(EnumC444680HcA.UNAVAILABLE, new C444640Hc6(EnumC444620Hc4.HUG, (Float) null, 6), new C444550Hbx(Boolean.TRUE, Integer.valueOf(R.drawable.n5), 4), null, 2131846611, new C444560Hby(EnumC444580Hc0.PILL_BUTTON, 2, 2131846613, 1, new AwS407S0200000_6(uIAssem, localServiceAlbumStatusAssem, 25)), new C444590Hc1(2))));
        } else {
            C337180DJs.LIZ(uIAssem.LJJIJL());
            C337180DJs.LIZ(((C436070H8b) ((LocalServiceAlbumStatusAssem) c0ie5.l0).LLIZLLLIL.getValue()).LLILLJJLI);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C0IE5 c0ie5, Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC1631630sYr<? super Integer, ? super CharSequence, ? super Map<String, ? extends Object>, ? super Boolean, Unit> interfaceC1631630sYr;
        int iIntValue = ((Number) obj).intValue();
        C435410H5n c435410H5nOp = ((SearchTop1CardMarkdownAssem) c0ie5.l0).op();
        if (c435410H5nOp != null && (interfaceC1631630sYr = c435410H5nOp.LLILZIL) != null) {
            interfaceC1631630sYr.invoke(Integer.valueOf(iIntValue), obj2, obj3, Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C0IE5 c0ie5, Object obj, Object obj2, Object obj3, Object obj4) {
        InterfaceC1631630sYr<? super Integer, ? super CharSequence, ? super Map<String, ? extends Object>, ? super Boolean, Unit> interfaceC1631630sYr;
        int iIntValue = ((Number) obj).intValue();
        C435410H5n c435410H5nOp = ((SearchTop1CardTextAssem) c0ie5.l0).op();
        if (c435410H5nOp != null && (interfaceC1631630sYr = c435410H5nOp.LLILZIL) != null) {
            interfaceC1631630sYr.invoke(Integer.valueOf(iIntValue), obj2, obj3, Boolean.TRUE);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C0IE5 c0ie5, Object obj, Object obj2, Object obj3, Object obj4) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        InterfaceC440230HOb interfaceC440230HOb = (InterfaceC440230HOb) obj2;
        InterfaceC440230HOb interfaceC440230HOb2 = (InterfaceC440230HOb) obj3;
        InterfaceC440230HOb interfaceC440230HOb3 = (InterfaceC440230HOb) obj4;
        AnonymousClass0956 anonymousClass0956 = ((MixStudioHomePageAssem) c0ie5.l0).LLLIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        ((MixStudioHomePageAssem) c0ie5.l0).LLLIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(abstractC738140SxQ), null, null, new C0HP1(interfaceC440230HOb3, (MixStudioHomePageAssem) c0ie5.l0, interfaceC440230HOb2, interfaceC440230HOb, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$5(C0IE5 c0ie5, Object obj, Object obj2, Object obj3, Object obj4) {
        ((C443970Hb1) c0ie5.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$6(C0IE5 c0ie5, Object obj, Object obj2, Object obj3, Object obj4) {
        LinearLayoutManager linearLayoutManager;
        int iIntValue = ((Number) obj2).intValue();
        C1910890zpH c1910890zpH = (C1910890zpH) ((C441190HRt) c0ie5.l0).LLJI.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[dropdownContainer] selected: ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", ");
        sbLIZ.append(obj3);
        c1910890zpH.LIZ("MixStudioIdDropdownView", C2188811AlT.LIZIZ(sbLIZ));
        if (((List) obj4).size() > 1) {
            ((C441190HRt) c0ie5.l0).LLJILLL.setSelectedAt(iIntValue);
        }
        C441190HRt c441190HRt = (C441190HRt) c0ie5.l0;
        RecyclerView.LayoutManager layoutManager = c441190HRt.LLJJ.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null && linearLayoutManager.findFirstCompletelyVisibleItemPosition() != iIntValue) {
            AnonymousClass0956 anonymousClass0956 = c441190HRt.LLJIJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c441190HRt.LLJIJIL = C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(c441190HRt.LLIZLLLIL), null, null, new C441210HRv(c441190HRt, linearLayoutManager, iIntValue, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(C0IE5 c0ie5, Object obj, Object obj2, Object obj3, Object obj4) {
        C460150I2r c460150I2rPR;
        Pair pair = (Pair) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        SchoolUsersListFragment schoolUsersListFragment = (SchoolUsersListFragment) c0ie5.l0;
        if (schoolUsersListFragment.LLJIJIL) {
            c460150I2rPR = schoolUsersListFragment.PR(pair, zBooleanValue, zBooleanValue2);
        } else {
            c460150I2rPR = schoolUsersListFragment.PR(pair, zBooleanValue, false);
        }
        SchoolUsersListFragment schoolUsersListFragment2 = (SchoolUsersListFragment) c0ie5.l0;
        C460140I2q c460140I2q = schoolUsersListFragment2.LLILLL;
        if (c460140I2q != null) {
            c460140I2q.setOnReselectedListener(null);
            c460140I2q.setOnSelectedChangeListener(null);
            List<C460110I2n> list = c460150I2rPR.LIZIZ;
            if (list.size() != schoolUsersListFragment2.LLJLIL) {
                c460140I2q.setChips(C13BV.INSTANCE);
                c460140I2q.setChips(c460150I2rPR.LIZIZ);
            } else {
                int i = 0;
                for (C460110I2n c460110I2n : list) {
                    C460100I2m c460100I2m = c460140I2q.LL;
                    c460100I2m.LLLFZ(i);
                    ListProtector.set(c460100I2m.LLILLJJLI, i, c460110I2n);
                    c460100I2m.notifyItemChanged(i);
                    C460140I2q.LIZ(c460140I2q, i, false);
                    i++;
                }
            }
            schoolUsersListFragment2.LLJLIL = list.size();
            int i2 = c460150I2rPR.LIZ;
            if (i2 != -1) {
                C460140I2q.LIZ(c460140I2q, i2, true);
            }
            final Map<Integer, Function2<Boolean, Boolean, Unit>> map = c460150I2rPR.LIZJ;
            c460140I2q.setOnReselectedListener(new InterfaceC460130I2p() { // from class: X.00Qz
                @Override // X.InterfaceC460130I2p
                public final void LIZ(int i3) {
                    Function2<Boolean, Boolean, Unit> function2 = map.get(Integer.valueOf(i3));
                    if (function2 != null) {
                        function2.invoke(Boolean.FALSE, Boolean.TRUE);
                    }
                }
            });
            c460140I2q.setOnSelectedChangeListener(new InterfaceC460160I2s() { // from class: X.00QY
                @Override // X.InterfaceC460160I2s
                public final void LIZ(int i3, boolean z) {
                    Function2<Boolean, Boolean, Unit> function2 = map.get(Integer.valueOf(i3));
                    if (function2 != null) {
                        function2.invoke(Boolean.valueOf(z), Boolean.FALSE);
                    }
                }
            });
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(C0IE5 c0ie5, Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        C0HVI c0hvi = (C0HVI) obj2;
        C0HVW c0hvw = (C0HVW) obj3;
        if (!C442060HVc.LIZ && obj4 == C0HVQ.PHOTO_SHOW) {
            if (c0hvw != null) {
                int i = C0HVX.LIZIZ[c0hvw.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3 && c0hvi != null) {
                            int i2 = C0HVX.LIZ[c0hvi.ordinal()];
                            if (i2 != 1) {
                                if (i2 == 2 || i2 == 3) {
                                    ((LocalServiceRequestMediaAssem) c0ie5.l0).Jo();
                                    ((LocalServiceRequestMediaAssem) c0ie5.l0).No();
                                    ((LocalServiceRequestMediaAssem) c0ie5.l0).Lo();
                                }
                            } else {
                                ((LocalServiceRequestMediaAssem) c0ie5.l0).MO2();
                            }
                        }
                    } else if (c0hvi != null) {
                        ((LocalServiceRequestMediaAssem) c0ie5.l0).Jo();
                        TuxIconView tuxIconView = ((LocalServiceRequestMediaAssem) c0ie5.l0).Go().LLILZ;
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_camera;
                        Context context = tuxIconView.getContext();
                        Integer numLIZJ = null;
                        if (context != null) {
                            numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                        }
                        c419910GdJ.LIZLLL = numLIZJ;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                        tuxIconView.setTuxIcon(c419910GdJ);
                        LocalServiceRequestMediaAssem localServiceRequestMediaAssem = (LocalServiceRequestMediaAssem) c0ie5.l0;
                        TuxTextView tuxTextView = localServiceRequestMediaAssem.Go().LLILZLL;
                        Context context2 = localServiceRequestMediaAssem.getContext();
                        if (context2 == null || (string = context2.getString(2131846615)) == null) {
                            string = "";
                        }
                        tuxTextView.setText(string);
                    }
                } else if (c0hvi != null) {
                    int i3 = C0HVX.LIZ[c0hvi.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2 && i3 != 3) {
                            if (i3 == 4) {
                                ((LocalServiceRequestMediaAssem) c0ie5.l0).MO2();
                            }
                        } else {
                            ((LocalServiceRequestMediaAssem) c0ie5.l0).Jo();
                            ((LocalServiceRequestMediaAssem) c0ie5.l0).No();
                            ((LocalServiceRequestMediaAssem) c0ie5.l0).Lo();
                        }
                    } else {
                        ((LocalServiceRequestMediaAssem) c0ie5.l0).MO2();
                    }
                }
            }
        } else {
            ((LocalServiceRequestMediaAssem) c0ie5.l0).MO2();
        }
        return Unit.LIZ;
    }
}

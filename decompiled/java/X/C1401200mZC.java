package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CCTemplateInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0mZC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1401200mZC implements InterfaceC1212360hec<Aweme> {
    public final int LL;
    public final /* synthetic */ DetailAwemeListFragment LLILLJJLI;

    @Override // X.InterfaceC1212360hec
    public final void Jm() {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void SY() {
    }

    @Override // X.InterfaceC1212360hec
    public final void bD1(Exception exc) {
    }

    @Override // X.InterfaceC1212360hec
    public final /* synthetic */ void zK() {
        throw null;
    }

    @Override // X.InterfaceC1212360hec
    public final void LJ() {
        C1235870iGX c1235870iGXCS = this.LLILLJJLI.cS(this.LL);
        if (c1235870iGXCS == null || c1235870iGXCS.getVisibility() != 0 || TextUtils.equals("question", this.LLILLJJLI.aS())) {
            return;
        }
        c1235870iGXCS.LJIIIIZZ();
    }

    @Override // X.InterfaceC1212360hec
    public final void Ng1() {
        if (this.LLILLJJLI.isViewValid()) {
            this.LLILLJJLI.oS();
            C1235870iGX c1235870iGXCS = this.LLILLJJLI.cS(this.LL);
            DetailAwemeListFragment detailAwemeListFragment = this.LLILLJJLI;
            InterfaceC627640Oja interfaceC627640Oja = detailAwemeListFragment.LLJJJJLIIL;
            if (interfaceC627640Oja != null) {
                interfaceC627640Oja.LIZ(detailAwemeListFragment.LL);
            } else {
                if (c1235870iGXCS != null) {
                    c1235870iGXCS.LJII();
                }
                DetailAwemeListFragment detailAwemeListFragment2 = this.LLILLJJLI;
                InterfaceC1401310mZN interfaceC1401310mZN = detailAwemeListFragment2.LLJJLIIIJLLLLLLLZ;
                if (interfaceC1401310mZN != null && detailAwemeListFragment2.LL == this.LL) {
                    interfaceC1401310mZN.LIZ(detailAwemeListFragment2.bo());
                }
            }
            this.LLILLJJLI.LLLIIII.get(this.LL);
            if (this.LLILLJJLI.PR()) {
                LLJJJIL(new ArrayList(), false);
            }
            if (this.LLILLJJLI.LLJL != null) {
                C818480W8w.LIZJ("single_song", C0W93.FAIL, null, C2097608Jq.LJ());
            }
            this.LLILLJJLI.LLLIIIIL.put(this.LL, false);
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void showLoadMoreLoading() {
        C1261230ivR c1261230ivR = this.LLILLJJLI.LLLIIII.get(this.LL);
        if (c1261230ivR != null) {
            if (((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).isStandardUIEnable()) {
                try {
                    c1261230ivR.showFooter();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            c1261230ivR.showLoadMoreLoading();
        }
    }

    public C1401200mZC(DetailAwemeListFragment detailAwemeListFragment) {
        this.LLILLJJLI = detailAwemeListFragment;
        this.LL = detailAwemeListFragment.LL;
    }

    @Override // X.InterfaceC1212360hec
    public final void Uq2(Exception exc) {
        if (!this.LLILLJJLI.isViewValid()) {
            return;
        }
        this.LLILLJJLI.oS();
        C1235870iGX c1235870iGXCS = this.LLILLJJLI.cS(this.LL);
        if (c1235870iGXCS != null) {
            T t = this.LLILLJJLI.LLILZ.LL;
            if (!(t instanceof AbstractC1255880imo) || C086I.LIZIZ(((AbstractC1255880imo) t).getItems())) {
                C786410Ut5.LLLLIILL(c1235870iGXCS, 0);
                c1235870iGXCS.setStatus(2);
            }
        }
        this.LLILLJJLI.LLLIIII.get(this.LL);
        if (this.LLILLJJLI.PR()) {
            LLJJJIL(new ArrayList(), false);
        }
        DetailAwemeListFragment detailAwemeListFragment = this.LLILLJJLI;
        InterfaceC1401310mZN interfaceC1401310mZN = detailAwemeListFragment.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1401310mZN != null && detailAwemeListFragment.LL == this.LL) {
            interfaceC1401310mZN.LIZ(detailAwemeListFragment.bo());
        }
        C1400650mYJ c1400650mYJ = this.LLILLJJLI.LLJL;
        if (c1400650mYJ != null && exc != null) {
            c1400650mYJ.LIZ();
        }
        this.LLILLJJLI.LLLIIIIL.put(this.LL, false);
    }

    @Override // X.InterfaceC1212360hec
    public final void Wi(Exception exc) {
        C1261230ivR c1261230ivR = this.LLILLJJLI.LLLIIII.get(this.LL);
        if (c1261230ivR != null) {
            if (((INetworkStandardUIService) ServiceManager.get().getService(INetworkStandardUIService.class)).isStandardUIEnable()) {
                C1257170iot.LIZIZ(this.LLILLJJLI.getActivity(), "", exc, null);
                C19341510lh c19341510lh = this.LLILLJJLI.LLJJIJI;
                if (c19341510lh != null) {
                    c19341510lh.LIZ(exc);
                }
            } else {
                c1261230ivR.showLoadMoreError();
            }
        }
        C1400650mYJ c1400650mYJ = this.LLILLJJLI.LLJL;
        if (c1400650mYJ != null && exc != null) {
            c1400650mYJ.LIZ();
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void LLJJJIL(List<Aweme> list, boolean z) {
        C1259890itH c1259890itH;
        CCTemplateInfo ccTemplateInfo;
        String str;
        String str2;
        String template_id;
        Integer numValueOf;
        String match_type;
        String template_music_id;
        String idStr;
        if (!this.LLILLJJLI.isViewValid()) {
            return;
        }
        this.LLILLJJLI.oS();
        C1261230ivR c1261230ivR = this.LLILLJJLI.LLLIIII.get(this.LL);
        C1235870iGX c1235870iGXCS = this.LLILLJJLI.cS(this.LL);
        if (c1261230ivR != null) {
            c1261230ivR.resetLoadMoreState();
            List<Aweme> listWR = this.LLILLJJLI.WR(list);
            c1261230ivR.setData(this.LLILLJJLI.hS(listWR));
            C1387620mDI c1387620mDI = C1387620mDI.LIZ;
            DetailAwemeListFragment detailAwemeListFragment = this.LLILLJJLI;
            String str3 = detailAwemeListFragment.LLILZIL;
            Context context = detailAwemeListFragment.getContext();
            String str4 = this.LLILLJJLI.LLILZLL;
            c1387620mDI.getClass();
            if (context != null) {
                ArrayList arrayList = (ArrayList) listWR;
                if (!arrayList.isEmpty()) {
                    int i = 0;
                    for (Object obj : arrayList) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            Aweme aweme = (Aweme) obj;
                            C1387620mDI.LIZ.getClass();
                            if ((C1387620mDI.LJI(aweme) || C1387620mDI.LJFF(aweme)) && (ccTemplateInfo = aweme.getCcTemplateInfo()) != null) {
                                ccTemplateInfo.setTemplateOrder(i2);
                                String str5 = "";
                                if (str4 == null) {
                                    str = "";
                                } else {
                                    str = str4;
                                }
                                if (str3 == null) {
                                    str2 = "";
                                } else {
                                    str2 = str3;
                                }
                                C2344009Gk c2344009Gk = new C2344009Gk();
                                c2344009Gk.LJIIIIZZ("group_id", str);
                                CCTemplateInfo ccTemplateInfo2 = aweme.getCcTemplateInfo();
                                if (ccTemplateInfo2 == null || (template_id = ccTemplateInfo2.getTemplate_id()) == null) {
                                    template_id = "";
                                }
                                c2344009Gk.LJIIIIZZ("template_id", template_id);
                                c2344009Gk.LIZJ(C1387620mDI.LIZIZ(context), "is_install_lv");
                                c2344009Gk.LJIIIIZZ("enter_from", str2);
                                CCTemplateInfo ccTemplateInfo3 = aweme.getCcTemplateInfo();
                                if (ccTemplateInfo3 != null) {
                                    numValueOf = Integer.valueOf(ccTemplateInfo3.getTemplateOrder());
                                } else {
                                    numValueOf = null;
                                }
                                c2344009Gk.LJ(numValueOf, "order");
                                CCTemplateInfo ccTemplateInfo4 = aweme.getCcTemplateInfo();
                                if (ccTemplateInfo4 != null) {
                                    match_type = ccTemplateInfo4.getMatch_type();
                                } else {
                                    match_type = null;
                                }
                                c2344009Gk.LJIIIIZZ("match_type", match_type);
                                if (C1387620mDI.LJFF(aweme)) {
                                    Music music = aweme.getMusic();
                                    if (music != null && (idStr = music.getIdStr()) != null) {
                                        str5 = idStr;
                                    }
                                    c2344009Gk.LJFF("music_id", str5);
                                } else {
                                    CCTemplateInfo ccTemplateInfo5 = aweme.getCcTemplateInfo();
                                    if (ccTemplateInfo5 != null && (template_music_id = ccTemplateInfo5.getTemplate_music_id()) != null) {
                                        str5 = template_music_id;
                                    }
                                    c2344009Gk.LJFF("music_id", str5);
                                }
                                C20684815ws.LJIILLIIL("cc_music_template_show", c2344009Gk.LIZ);
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
            if (c1235870iGXCS != null) {
                C786410Ut5.LLLLIILL(c1235870iGXCS, 8);
            }
            if (!z) {
                c1261230ivR.setShowFooter(false);
                c1261230ivR.setLoadMoreListener((C0P6P) null);
            }
            if ("single_song".equals(this.LLILLJJLI.LLILLJJLI)) {
                C19371010qS.LIZJ("md_start_activity_to_show_list_duration");
                DetailAwemeListFragment detailAwemeListFragment2 = this.LLILLJJLI;
                if (!detailAwemeListFragment2.LLJLL && list != null) {
                    detailAwemeListFragment2.LLJLL = true;
                }
            } else if ("challenge".equals(this.LLILLJJLI.LLILLJJLI)) {
                C19371010qS.LIZJ("cd_start_activity_to_show_list_duration");
                DetailAwemeListFragment detailAwemeListFragment3 = this.LLILLJJLI;
                if (!detailAwemeListFragment3.LLJLL && list != null) {
                    detailAwemeListFragment3.LLJLL = true;
                }
            } else if ("sticker_prop_detail".equals(this.LLILLJJLI.LLILLJJLI)) {
                C19371010qS.LIZJ("sd_start_activity_to_show_list_duration");
            }
        }
        this.LLILLJJLI.LLLIIIL.put(this.LL, z);
        DetailAwemeListFragment detailAwemeListFragment4 = this.LLILLJJLI;
        InterfaceC1401310mZN interfaceC1401310mZN = detailAwemeListFragment4.LLJJLIIIJLLLLLLLZ;
        if (interfaceC1401310mZN != null && detailAwemeListFragment4.LL == this.LL) {
            interfaceC1401310mZN.LIZ(detailAwemeListFragment4.bo());
        }
        C1400650mYJ c1400650mYJ = this.LLILLJJLI.LLJL;
        if (c1400650mYJ != null) {
            c1400650mYJ.LIZIZ();
        }
        this.LLILLJJLI.LLLIIIIL.put(this.LL, false);
        if (this.LLILLJJLI.getUserVisibleHint()) {
            DetailAwemeListFragment detailAwemeListFragment5 = this.LLILLJJLI;
            if (detailAwemeListFragment5.LL == this.LL && (c1259890itH = detailAwemeListFragment5.LLJJJJJIL) != null) {
                c1259890itH.LIZ(false, false);
            }
        }
        if (list != null) {
            try {
                if (!list.isEmpty() && list.get(0) != null && !AwemeBizExtKt.isForMusicDetailLoading(list.get(0))) {
                    C818480W8w.LIZIZ("single_song");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "music_detail_page_monitor");
            }
        }
    }

    @Override // X.InterfaceC1212360hec
    public final void Pj(List<Aweme> list, boolean z) {
        this.LLILLJJLI.mS(this.LL, z, list);
    }

    @Override // X.InterfaceC1212360hec
    public final void mE(List<Aweme> list, boolean z) {
        this.LLILLJJLI.kS(this.LL, z, list);
    }
}

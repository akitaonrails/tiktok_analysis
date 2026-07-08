package Y;

import X.AbstractC1585810rMx;
import X.C00DE;
import X.C0I0B;
import X.C0THJ;
import X.C13BV;
import X.C13LP;
import X.C1557630qdV;
import X.C1807180x80;
import X.C1833770xot;
import X.C1847380yAq;
import X.C1850820yGO;
import X.C1850830yGP;
import X.C1853460yKe;
import X.C1853600yKs;
import X.C1853610yKt;
import X.C1861230yXB;
import X.C1861240yXC;
import X.C1861600yXm;
import X.C19563611gQ;
import X.C20600815jK;
import X.C904430Zdx;
import X.EnumC1242510iRF;
import X.EnumC1381750m3p;
import X.EnumC1381770m3r;
import X.InterfaceC1859950yV7;
import X.InterfaceC1860040yVG;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.livesdk.replay.proto.VideoMetaInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.DetailMediaGridContentAssem;
import com.ss.android.ugc.aweme.im.service.analytics.IIMMediaGridAnalytics;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.LiveReplayListActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.HorizontalTemplateListAssem;
import com.ss.android.ugc.aweme.tako.multipletemplate.templatelist.TemplateListViewModel;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS393S0200000_27;
import tikcast.api.anchor.HighlightCollectionElement;
import tikcast.api.anchor.LiveFragmentDetail;

/* JADX INFO: loaded from: classes28.dex */
public class AsS53S0100000_27 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
            case 6:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 2:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 3:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 4:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 5:
                LJJIIJ$4(this, recyclerView, i);
                break;
            case 7:
                LJJIIJ$5(this, recyclerView, i);
                break;
            case 8:
                LJJIIJ$6(this, recyclerView, i);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIJ$7(this, recyclerView, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIJ$8(this, recyclerView, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJIIJ$9(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 1:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 6:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 8:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS53S0100000_27(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i) {
        if (i != 0) {
            ((RankListFragment) asS53S0100000_27.l0).LLJJIJIIJIL.LIZJ = true;
        }
    }

    public static final void LJJIIJ$1(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i) {
        RecyclerView.LayoutManager layoutManager;
        String str;
        List list;
        List list2;
        String str2;
        VideoMetaInfo videoMetaInfo;
        String str3;
        String str4;
        String str5;
        VideoMetaInfo videoMetaInfo2;
        String str6;
        String str7;
        if (i == 0 && !((LiveReplayListActivity) asS53S0100000_27.l0).LLJILLL && (layoutManager = recyclerView.getLayoutManager()) != null && (layoutManager instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition >= 0 && iFindLastVisibleItemPosition >= iFindFirstVisibleItemPosition) {
                C0THJ c0thj = C0THJ.LIZ;
                List<ITEM> listListGetAll = ((LiveReplayListActivity) asS53S0100000_27.l0).LLLLZLL().listGetAll();
                c0thj.getClass();
                int i2 = C0THJ.LIZJ;
                if (C0THJ.LIZIZ() && listListGetAll != 0 && i2 > 0) {
                    int size = listListGetAll.size() - 1;
                    if (iFindLastVisibleItemPosition > size) {
                        iFindLastVisibleItemPosition = size;
                    }
                    if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                        return;
                    }
                    while (true) {
                        C1833770xot c1833770xot = (C1833770xot) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, listListGetAll);
                        if (c1833770xot != null) {
                            try {
                                str = c1833770xot.LL.id;
                                str.toString();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                str = "";
                            }
                            if (!C0THJ.LIZLLL.contains(str)) {
                                try {
                                    list = c1833770xot.LLILLJJLI;
                                    if (!(!list.isEmpty())) {
                                        list = C13BV.INSTANCE;
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    list = C13BV.INSTANCE;
                                }
                                try {
                                    list2 = c1833770xot.LLILLL.elementList;
                                    if (!(!list2.isEmpty())) {
                                        list2 = C13BV.INSTANCE;
                                    }
                                } catch (Throwable th3) {
                                    TryCatchGuardChecker.doCheck(th3);
                                    list2 = C13BV.INSTANCE;
                                }
                                for (LiveFragmentDetail liveFragmentDetail : C13LP.LL(list, i2)) {
                                    VideoMetaInfo videoMetaInfo3 = liveFragmentDetail.mp4VideoMetaInfo;
                                    if (videoMetaInfo3 != null && (str5 = videoMetaInfo3.url) != null && str5.length() != 0 && (videoMetaInfo2 = liveFragmentDetail.mp4VideoMetaInfo) != null && (str6 = videoMetaInfo2.fileId) != null && str6.length() > 0) {
                                        C0THJ c0thj2 = C0THJ.LIZ;
                                        VideoMetaInfo videoMetaInfo4 = liveFragmentDetail.mp4VideoMetaInfo;
                                        if (videoMetaInfo4 == null || (str7 = videoMetaInfo4.fileId) == null) {
                                            str7 = "";
                                        }
                                        c0thj2.getClass();
                                        C0THJ.LIZ(str5, str7);
                                    }
                                }
                                boolean z = false;
                                for (HighlightCollectionElement highlightCollectionElement : C13LP.LL(list2, i2)) {
                                    VideoMetaInfo videoMetaInfo5 = highlightCollectionElement.mp4VideoMetaInfo;
                                    if (videoMetaInfo5 != null && (str2 = videoMetaInfo5.url) != null && str2.length() != 0 && (videoMetaInfo = highlightCollectionElement.mp4VideoMetaInfo) != null && (str3 = videoMetaInfo.fileId) != null && str3.length() > 0) {
                                        C0THJ c0thj3 = C0THJ.LIZ;
                                        VideoMetaInfo videoMetaInfo6 = highlightCollectionElement.mp4VideoMetaInfo;
                                        if (videoMetaInfo6 == null || (str4 = videoMetaInfo6.fileId) == null) {
                                            str4 = "";
                                        }
                                        c0thj3.getClass();
                                        C0THJ.LIZ(str2, str4);
                                        z = true;
                                    }
                                }
                                if (z && str.length() > 0) {
                                    C0THJ.LIZLLL.add(str);
                                }
                            }
                        }
                        if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                            iFindFirstVisibleItemPosition++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public static final void LJJIIJ$2(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((C1850830yGP) asS53S0100000_27.l0).LIZJ(-1, "slide");
            C19563611gQ c19563611gQ = ((C1850830yGP) asS53S0100000_27.l0).LLILLJJLI;
            if (c19563611gQ != null) {
                c19563611gQ.removeOnScrollListener(asS53S0100000_27);
            }
        }
    }

    public static final void LJJIIJ$3(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i) {
        if (i == 1) {
            ((C1850820yGO) asS53S0100000_27.l0).LIZ(-1, "slide");
            C19563611gQ c19563611gQ = ((C1850820yGO) asS53S0100000_27.l0).LLILLJJLI;
            if (c19563611gQ != null) {
                c19563611gQ.removeOnScrollListener(asS53S0100000_27);
            }
        }
    }

    public static final void LJJIIJ$4(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i) {
        InterfaceC1859950yV7 textSelector = ((InterfaceC1860040yVG) asS53S0100000_27.l0).getTextSelector();
        if (textSelector != null) {
            textSelector.LIZLLL(i);
        }
    }

    public static final void LJJIIJ$5(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i) {
        if (i == 0) {
            C1847380yAq c1847380yAq = (C1847380yAq) asS53S0100000_27.l0;
            if (c1847380yAq.LJ) {
                c1847380yAq.LJ = false;
                c1847380yAq.LIZIZ.removeOnScrollListener(c1847380yAq.LJII);
                c1847380yAq.LIZ.LJIIIIZZ(Unit.LIZ);
            }
        }
    }

    public static final void LJJIIJ$6(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i) {
        if (i == 0) {
            ((C1861230yXB) asS53S0100000_27.l0).LIZ();
        }
    }

    public static final void LJJIIJ$7(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i == 1) {
                C1861240yXC c1861240yXC = (C1861240yXC) asS53S0100000_27.l0;
                c1861240yXC.LIZLLL = true;
                if (c1861240yXC.LJII) {
                    c1861240yXC.LJII = false;
                }
                c1861240yXC.LJIILJJIL = true;
                return;
            }
            return;
        }
        C1861240yXC c1861240yXC2 = (C1861240yXC) asS53S0100000_27.l0;
        c1861240yXC2.LIZLLL = false;
        c1861240yXC2.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x026d  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIJ$8(Y.AsS53S0100000_27 r30, androidx.recyclerview.widget.RecyclerView r31, int r32) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AsS53S0100000_27.LJJIIJ$8(Y.AsS53S0100000_27, androidx.recyclerview.widget.RecyclerView, int):void");
    }

    public static final void LJJIIJ$9(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i) {
        RecyclerView.LayoutManager layoutManager;
        View viewLJFF;
        int position;
        InterfaceC1891350zJl interfaceC1891350zJl;
        C1853460yKe c1853460yKe;
        C20600815jK<InterfaceC1891350zJl> state;
        boolean z;
        if (i == 0) {
            HorizontalTemplateListAssem horizontalTemplateListAssem = (HorizontalTemplateListAssem) asS53S0100000_27.l0;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = horizontalTemplateListAssem.LLJJJIL;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if ((layoutManager instanceof LinearLayoutManager) && layoutManager != null && (viewLJFF = horizontalTemplateListAssem.LLJLLL.LJFF(layoutManager)) != null && (position = layoutManager.getPosition(viewLJFF)) >= 0 && position != horizontalTemplateListAssem.LLJLILLLLZIIL) {
                horizontalTemplateListAssem.LLJLILLLLZIIL = position;
                LinearLayout linearLayout = horizontalTemplateListAssem.LLJJL;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = linearLayout.getChildAt(i2);
                        if (i2 == horizontalTemplateListAssem.LLJLILLLLZIIL) {
                            z = true;
                        } else {
                            z = false;
                        }
                        childAt.setSelected(z);
                    }
                }
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = horizontalTemplateListAssem.LLJJJIL;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                    interfaceC1891350zJl = (InterfaceC1891350zJl) C13LP.LJJJLZIJ(position, state.LJII());
                } else {
                    interfaceC1891350zJl = null;
                }
                if ((interfaceC1891350zJl instanceof C1853460yKe) && (c1853460yKe = (C1853460yKe) interfaceC1891350zJl) != null) {
                    TemplateListViewModel templateListViewModelIp = horizontalTemplateListAssem.ip();
                    templateListViewModelIp.withState(new AwS393S0200000_27(templateListViewModelIp, c1853460yKe, 170));
                    horizontalTemplateListAssem.lp(c1853460yKe);
                    C1853610yKt c1853610yKt = horizontalTemplateListAssem.LLLFFI;
                    if (c1853610yKt != null) {
                        C1853600yKs c1853600yKs = c1853610yKt.LIZ;
                        c1853600yKs.getClass();
                        c1853600yKs.LIZ.LIZJ(new C1557630qdV(new C00DE(null)));
                    }
                }
            }
        }
    }

    public static final void LJJIIZI$0(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i, int i2) {
        ((TakoAnswerBaseAssem) asS53S0100000_27.l0).hr("onScrolled");
    }

    public static final void LJJIIZI$1(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i, int i2) {
        EnumC1381770m3r enumC1381770m3r;
        EnumC1381750m3p enumC1381750m3p;
        EnumC1242510iRF enumC1242510iRF;
        EnumC1381770m3r enumC1381770m3r2;
        EnumC1381750m3p enumC1381750m3p2;
        EnumC1242510iRF enumC1242510iRF2;
        if (i2 == 0) {
            return;
        }
        if (!recyclerView.canScrollVertically(1)) {
            DetailMediaGridContentAssem detailMediaGridContentAssem = (DetailMediaGridContentAssem) asS53S0100000_27.l0;
            if (!detailMediaGridContentAssem.LLJJJ) {
                MediaGridViewModel mediaGridViewModelIp = detailMediaGridContentAssem.ip();
                if (!mediaGridViewModelIp.BQ2().LIZIZ(mediaGridViewModelIp.xQ2(), ((DetailMediaGridContentAssem) asS53S0100000_27.l0).hp())) {
                    DetailMediaGridContentAssem detailMediaGridContentAssem2 = (DetailMediaGridContentAssem) asS53S0100000_27.l0;
                    IIMMediaGridAnalytics iIMMediaGridAnalytics = detailMediaGridContentAssem2.LLJJJJ;
                    if (iIMMediaGridAnalytics != null) {
                        if (detailMediaGridContentAssem2.ip().FQ2()) {
                            enumC1381770m3r2 = EnumC1381770m3r.GROUP;
                        } else {
                            enumC1381770m3r2 = EnumC1381770m3r.PRIVATE;
                        }
                        if (C904430Zdx.LIZ[detailMediaGridContentAssem2.hp().ordinal()] == 1) {
                            enumC1381750m3p2 = EnumC1381750m3p.SHARED_VIDEO;
                        } else {
                            enumC1381750m3p2 = EnumC1381750m3p.PRIVATE_MEDIA;
                        }
                        if (detailMediaGridContentAssem2.ip().DQ2(detailMediaGridContentAssem2.hp())) {
                            enumC1242510iRF2 = EnumC1242510iRF.EMPTY;
                        } else {
                            enumC1242510iRF2 = EnumC1242510iRF.NOT_EMPTY;
                        }
                        iIMMediaGridAnalytics.LIZ("ttsocial_chat_setting_media_module_end_show", iIMMediaGridAnalytics.LIZJ(detailMediaGridContentAssem2.ip().xQ2(), null, enumC1381770m3r2, enumC1381750m3p2, enumC1242510iRF2), C0I0B.LJFF.LIZIZ());
                    }
                    ((DetailMediaGridContentAssem) asS53S0100000_27.l0).LLJJJ = true;
                }
            }
        }
        DetailMediaGridContentAssem detailMediaGridContentAssem3 = (DetailMediaGridContentAssem) asS53S0100000_27.l0;
        if (detailMediaGridContentAssem3.LLJJIJIL) {
            return;
        }
        IIMMediaGridAnalytics iIMMediaGridAnalytics2 = detailMediaGridContentAssem3.LLJJJJ;
        if (iIMMediaGridAnalytics2 != null) {
            if (detailMediaGridContentAssem3.ip().FQ2()) {
                enumC1381770m3r = EnumC1381770m3r.GROUP;
            } else {
                enumC1381770m3r = EnumC1381770m3r.PRIVATE;
            }
            if (C904430Zdx.LIZ[detailMediaGridContentAssem3.hp().ordinal()] == 1) {
                enumC1381750m3p = EnumC1381750m3p.SHARED_VIDEO;
            } else {
                enumC1381750m3p = EnumC1381750m3p.PRIVATE_MEDIA;
            }
            if (detailMediaGridContentAssem3.ip().DQ2(detailMediaGridContentAssem3.hp())) {
                enumC1242510iRF = EnumC1242510iRF.EMPTY;
            } else {
                enumC1242510iRF = EnumC1242510iRF.NOT_EMPTY;
            }
            iIMMediaGridAnalytics2.LIZ("ttsocial_chat_setting_media_module_slide", iIMMediaGridAnalytics2.LIZJ(detailMediaGridContentAssem3.ip().xQ2(), null, enumC1381770m3r, enumC1381750m3p, enumC1242510iRF), C0I0B.LJFF.LIZIZ());
        }
        ((DetailMediaGridContentAssem) asS53S0100000_27.l0).LLJJIJIL = true;
    }

    public static final void LJJIIZI$2(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i, int i2) {
        recyclerView.postOnAnimation(new ARunnableS127S0100000_27((C1861230yXB) asS53S0100000_27.l0, 65));
    }

    public static final void LJJIIZI$3(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i, int i2) {
        if (Math.abs(i2) > 5) {
            ((C1861240yXC) asS53S0100000_27.l0).LJIIIIZZ = i2;
        }
        C1861240yXC c1861240yXC = (C1861240yXC) asS53S0100000_27.l0;
        if (c1861240yXC.LIZLLL) {
            c1861240yXC.LIZ();
        }
    }

    public static final void LJJIIZI$4(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i, int i2) {
        C1861600yXm c1861600yXm = (C1861600yXm) asS53S0100000_27.l0;
        int i3 = c1861600yXm.LJ + i2;
        c1861600yXm.LJ = i3;
        if (c1861600yXm.LJFF) {
            int i4 = (-c1861600yXm.LJIIIZ) * 2;
            if (i2 < i4 || i3 < i4) {
                c1861600yXm.LIZLLL.invoke();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIZI$5(Y.AsS53S0100000_27 r12, androidx.recyclerview.widget.RecyclerView r13, int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AsS53S0100000_27.LJJIIZI$5(Y.AsS53S0100000_27, androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public static final void LJJIIZI$6(AsS53S0100000_27 asS53S0100000_27, RecyclerView recyclerView, int i, int i2) {
        ((C1807180x80) asS53S0100000_27.l0).LIZ();
    }
}

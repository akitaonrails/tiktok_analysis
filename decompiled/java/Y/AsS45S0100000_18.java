package Y;

import X.AbstractC1585810rMx;
import X.AbstractC21673619ry;
import X.C0J34;
import X.C1043010dFT;
import X.C1153380g7U;
import X.C1156740gCu;
import X.C1161980gLM;
import X.C1164060gOi;
import X.C1172210gbr;
import X.C1173210gdT;
import X.C1173300gdc;
import X.C1174820gg4;
import X.C1174850gg7;
import X.C1182410gsJ;
import X.C1185040gwY;
import X.C1185050gwZ;
import X.C1185410gx9;
import X.C1185600gxS;
import X.C1187470h0T;
import X.C1189060h32;
import X.C1197200hGA;
import X.C1203650hQZ;
import X.C1204820hSS;
import X.C1204870hSX;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C13LZ;
import X.C1558520qew;
import X.C18Z8;
import X.C18Z9;
import X.C20515215Pi;
import X.C20600815jK;
import X.C2188811AlT;
import X.C426750GoL;
import X.C724240Sb0;
import X.EnumC1160730gJL;
import X.EnumC1204660hSC;
import X.EnumC586410MzH;
import X.InterfaceC1361890lXn;
import X.InterfaceC1891350zJl;
import X.InterfaceC636340Oxc;
import X.InterfaceC665370Q7z;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.bytedance.ies.powerlist.layout.core.PowerLayoutManager;
import com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimSearchAssemAbility;
import com.ss.android.ugc.aweme.poi.claim.view.PoiClaimPoiListAssem;
import com.ss.android.ugc.aweme.poi.creation.PoiCreatedEntranceAssem;
import com.ss.android.ugc.aweme.poi.detail.nearby.PoiNearbyModel;
import com.ss.android.ugc.aweme.poi.detail.nearby.cards.PoiNearbyCardsAssem;
import com.ss.android.ugc.aweme.poi.detail.post.assem.PoiPostPageNewTagAssem;
import com.ss.android.ugc.aweme.poi.detail.videolist.autoplay.provider.PoiSlashVideoListPostsTriggerLineProvider;
import com.ss.android.ugc.aweme.poi.detail.ymal.horizontal.PoiHorizontalYmalAssem;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiDiscoveryCard;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import com.ss.android.ugc.aweme.story.archive2.calendar.StoryArchiveV2CalendarAssem;
import com.ss.android.ugc.aweme.story.archive2.list.StoryArchiveV2ListAssem;
import com.ss.android.ugc.aweme.story.archive2.list.StoryArchiveV2ListViewModel;
import com.ss.android.ugc.nearby.container.NearbyContentAssem;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS142S0201000_18;
import kotlin.jvm.internal.AwS32S0010000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class AsS45S0100000_18 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    public static final void LJJIIZI$0(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
            case 4:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
            case 14:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 3:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 5:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 6:
                LJJIIJ$4(this, recyclerView, i);
                break;
            case 7:
                LJJIIJ$5(this, recyclerView, i);
                break;
            case 8:
                LJJIIJ$6(this, recyclerView, i);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LJJIIJ$7(this, recyclerView, i);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJIIJ$8(this, recyclerView, i);
                break;
            case 15:
                LJJIIJ$9(this, recyclerView, i);
                break;
            case 16:
                LJJIIJ$10(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 3:
            case 6:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case 15:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 4:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case 5:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case 7:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case 8:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LJJIIZI$7(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJJIIZI$8(this, recyclerView, i, i2);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LJJIIZI$9(this, recyclerView, i, i2);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LJJIIZI$10(this, recyclerView, i, i2);
                break;
            case 14:
                LJJIIZI$11(this, recyclerView, i, i2);
                break;
            case 16:
                LJJIIZI$12(this, recyclerView, i, i2);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LJJIIZI$13(this, recyclerView, i, i2);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LJJIIZI$14(this, recyclerView, i, i2);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsS45S0100000_18(Object obj, RavenFragment<CONTEXT> ravenFragment) {
        this.$t = ravenFragment;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i) {
        ((C18Z9) asS45S0100000_18.l0).LJJIFFI(i, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJJIIJ$1(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i) {
        C1185600gxS c1185600gxS;
        String str;
        String str2;
        if (i == 0) {
            PoiHorizontalYmalAssem poiHorizontalYmalAssem = (PoiHorizontalYmalAssem) asS45S0100000_18.l0;
            poiHorizontalYmalAssem.getClass();
            C1173300gdc c1173300gdcLJ = C1174850gg7.LJ(poiHorizontalYmalAssem);
            if (c1173300gdcLJ != null && (c1185600gxS = (C1185600gxS) c1173300gdcLJ.LIZ) != null && (str = c1185600gxS.LIZ) != null) {
                int i2 = poiHorizontalYmalAssem.LLJLIL;
                if (i2 > 0) {
                    str2 = "left";
                } else if (i2 >= 0) {
                    return;
                } else {
                    str2 = "right";
                }
                C1173210gdT c1173210gdT = C1173210gdT.LIZ;
                PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(poiHorizontalYmalAssem));
                c1173210gdT.getClass();
                C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", "poi_detail");
                linkedHashMap.put("enter_method", str2);
                linkedHashMap.put("poi_id", str);
                C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
                c1185040gwY.getClass();
                C1185040gwY.LJFF("swipe_ymal_item", linkedHashMap, c1185050gwZ);
            }
        }
    }

    public static final void LJJIIJ$10(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i) {
        PoiNearbyCardsAssem poiNearbyCardsAssem;
        C1185600gxS c1185600gxSHp;
        String str;
        String fromGroupId;
        String str2;
        String initialPoiFromGroupId;
        String initialEnterFrom;
        List<PoiDiscoveryCard> poiList;
        PoiDiscoveryCard poiDiscoveryCard;
        C1185410gx9 c1185410gx9;
        if (i == 0 && (c1185600gxSHp = (poiNearbyCardsAssem = (PoiNearbyCardsAssem) asS45S0100000_18.l0).hp()) != null && c1185600gxSHp.LIZ != null) {
            int i2 = poiNearbyCardsAssem.LLJJIJI;
            if (i2 > 0) {
                str = "left";
            } else if (i2 >= 0) {
                return;
            } else {
                str = "right";
            }
            C1174820gg4 c1174820gg4 = C1174820gg4.LIZ;
            C1185600gxS c1185600gxSHp2 = poiNearbyCardsAssem.hp();
            String initialEnterMethod = null;
            if (c1185600gxSHp2 != null && (c1185410gx9 = c1185600gxSHp2.LJFF) != null) {
                fromGroupId = c1185410gx9.getFromGroupId();
            } else {
                fromGroupId = null;
            }
            PoiNearbyModel poiNearbyModel = poiNearbyCardsAssem.LLJJIII;
            if (poiNearbyModel != null && (poiList = poiNearbyModel.getPoiList()) != null && (poiDiscoveryCard = (PoiDiscoveryCard) C13LP.LJJJLL(poiList)) != null) {
                str2 = poiDiscoveryCard.collectInfo;
            } else {
                str2 = null;
            }
            C1185410gx9 c1185410gx92 = c1185600gxSHp.LJFF;
            if (c1185410gx92 != null) {
                initialPoiFromGroupId = c1185410gx92.getInitialPoiFromGroupId();
            } else {
                initialPoiFromGroupId = null;
            }
            C1185410gx9 c1185410gx93 = c1185600gxSHp.LJFF;
            if (c1185410gx93 != null) {
                initialEnterFrom = c1185410gx93.getInitialEnterFrom();
            } else {
                initialEnterFrom = null;
            }
            C1185410gx9 c1185410gx94 = c1185600gxSHp.LJFF;
            if (c1185410gx94 != null) {
                initialEnterMethod = c1185410gx94.getInitialEnterMethod();
            }
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(poiNearbyCardsAssem);
            PageFinder pageFinderVia = PageFinder.via(C724240Sb0.LJI(poiNearbyCardsAssem));
            c1174820gg4.getClass();
            C1185040gwY c1185040gwY = C1185040gwY.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1182410gsJ.LIZ(linkedHashMap, interfaceC665370Q7zLJIIL);
            linkedHashMap.put("enter_from", "poi_detail");
            linkedHashMap.put("enter_method", str);
            if (fromGroupId == null) {
                fromGroupId = "";
            }
            linkedHashMap.put("from_group_id", fromGroupId);
            if (initialEnterFrom == null) {
                initialEnterFrom = "";
            }
            linkedHashMap.put("initial_poi_enter_from", initialEnterFrom);
            if (initialEnterMethod == null) {
                initialEnterMethod = "";
            }
            linkedHashMap.put("initial_poi_enter_method", initialEnterMethod);
            if (initialPoiFromGroupId == null) {
                initialPoiFromGroupId = "";
            }
            linkedHashMap.put("initial_poi_from_group_id", initialPoiFromGroupId);
            C1189060h32.LIZ(str2, linkedHashMap);
            C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinderVia);
            c1185040gwY.getClass();
            C1185040gwY.LJFF("swipe_nearby_poi_card", linkedHashMap, c1185050gwZ);
        }
    }

    public static final void LJJIIJ$2(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i) {
        int iIntValue;
        Integer numLJJJJLL;
        if (i != 0) {
            return;
        }
        ((RavenFragment) asS45S0100000_18.l0).getClass();
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if ((layoutManager instanceof PowerLayoutManager) || (layoutManager instanceof GridLayoutManager) || (layoutManager instanceof LinearLayoutManager)) {
                iIntValue = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
            } else {
                if ((layoutManager instanceof StaggeredGridLayoutManager) && (numLJJJJLL = C13LQ.LJJJJLL(((StaggeredGridLayoutManager) layoutManager).LJIJ(null))) != null) {
                    iIntValue = numLJJJJLL.intValue();
                }
                iIntValue = -1;
            }
            if (iIntValue > 1) {
                return;
            }
        } else {
            iIntValue = -1;
        }
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenFragment", new AwS142S0201000_18(iIntValue, (int) asS45S0100000_18.l0, recyclerView, (RecyclerView) 0));
    }

    public static final void LJJIIJ$3(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i) {
        PoiSlashVideoListPostsTriggerLineProvider poiSlashVideoListPostsTriggerLineProvider = (PoiSlashVideoListPostsTriggerLineProvider) asS45S0100000_18.l0;
        poiSlashVideoListPostsTriggerLineProvider.LJIIJ = i;
        if (i == 0) {
            poiSlashVideoListPostsTriggerLineProvider.LIZJ(poiSlashVideoListPostsTriggerLineProvider.LJI);
        }
    }

    public static final void LJJIIJ$4(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i) {
        int i2;
        if (i == 1) {
            if (C426750GoL.LIZLLL(((C1197200hGA) asS45S0100000_18.l0).getContext())) {
                i2 = -1;
            } else {
                i2 = 1;
            }
            if (!recyclerView.canScrollHorizontally(i2)) {
                C1197200hGA c1197200hGA = (C1197200hGA) asS45S0100000_18.l0;
                if (c1197200hGA.LLILZIL) {
                    c1197200hGA.LLIZ = true;
                }
            }
        }
    }

    public static final void LJJIIJ$5(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i) {
        StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModelLo = ((StoryArchiveV2CalendarAssem) asS45S0100000_18.l0).Lo();
        boolean z = true;
        if (i == 1) {
            z = false;
        }
        storyArchiveV2ArchiveViewModelLo.getClass();
        storyArchiveV2ArchiveViewModelLo.setState(new AwS32S0010000_18(z, 11));
    }

    public static final void LJJIIJ$6(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i) {
        StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModelLo = ((StoryArchiveV2ListAssem) asS45S0100000_18.l0).Lo();
        boolean z = true;
        if (i == 1) {
            z = false;
        }
        storyArchiveV2ArchiveViewModelLo.getClass();
        storyArchiveV2ArchiveViewModelLo.setState(new AwS32S0010000_18(z, 11));
    }

    public static final void LJJIIJ$7(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ((C1187470h0T) asS45S0100000_18.l0).LIZIZ(false);
                    return;
                }
                return;
            }
            ((C1187470h0T) asS45S0100000_18.l0).LIZIZ(true);
            return;
        }
        ((C1187470h0T) asS45S0100000_18.l0).LIZIZ(true);
    }

    public static final void LJJIIJ$8(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NearbyContent newState=");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LJJIIJ$9(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i) {
        IPoiClaimSearchAssemAbility iPoiClaimSearchAssemAbility;
        if (i == 1 && (iPoiClaimSearchAssemAbility = (IPoiClaimSearchAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL((PoiClaimPoiListAssem) asS45S0100000_18.l0), IPoiClaimSearchAssemAbility.class, null)) != null) {
            iPoiClaimSearchAssemAbility.LJLZ();
        }
    }

    public static final void LJJIIZI$1(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
        ((PoiHorizontalYmalAssem) asS45S0100000_18.l0).LLJLIL = i;
    }

    public static final void LJJIIZI$10(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
        if (i2 > 0) {
            C1204870hSX c1204870hSX = (C1204870hSX) asS45S0100000_18.l0;
            EnumC1204660hSC enumC1204660hSC = EnumC1204660hSC.GPS;
            if (c1204870hSX.LIZJ) {
                C20515215Pi c20515215Pi = c1204870hSX.LIZIZ;
                if (c20515215Pi != null) {
                    c20515215Pi.LIZIZ();
                }
                C1204820hSS.LIZ(enumC1204660hSC, EnumC586410MzH.DEFAULTTYPE, false);
                c1204870hSX.LIZJ = false;
            }
        }
    }

    public static final void LJJIIZI$11(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
        ((PoiCreatedEntranceAssem) asS45S0100000_18.l0).ip(i2);
    }

    public static final void LJJIIZI$12(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
        ((PoiNearbyCardsAssem) asS45S0100000_18.l0).LLJJIJI = i;
    }

    public static final void LJJIIZI$13(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
        C1203650hQZ c1203650hQZ = (C1203650hQZ) asS45S0100000_18.l0;
        if (!c1203650hQZ.LIZLLL) {
            c1203650hQZ.LIZIZ(null);
        }
        ((C1203650hQZ) asS45S0100000_18.l0).LIZLLL = true;
    }

    public static final void LJJIIZI$14(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
        if (i2 > 0 && !recyclerView.canScrollVertically(1)) {
            C1172210gbr c1172210gbr = (C1172210gbr) asS45S0100000_18.l0;
            if (c1172210gbr.LLILZIL && !c1172210gbr.LLILZLL) {
                c1172210gbr.LLILZLL = true;
                ((ArrayList) c1172210gbr.LLILZ).add(new C1153380g7U(1, C13BV.INSTANCE));
                HandlerHook.viewPost(recyclerView, new ARunnableS87S0200000_18((C1172210gbr) asS45S0100000_18.l0, recyclerView, 32));
            }
        }
    }

    public static final void LJJIIZI$2(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
        int itemCount;
        C20600815jK<InterfaceC1891350zJl> state;
        Integer num = ((RavenFragment) asS45S0100000_18.l0).LLJJL;
        if (num != null) {
            int iIntValue = num.intValue();
            if (i2 <= 0) {
                return;
            }
            if (((RavenFragment) asS45S0100000_18.l0).eT()) {
                new C1043010dFT();
                C1043010dFT.LIZIZ("RavenFragment", new AwS562S0100000_18((RavenFragment) asS45S0100000_18.l0, 66));
                return;
            }
            ((RavenFragment) asS45S0100000_18.l0).getClass();
            int iNS = RavenFragment.nS(recyclerView);
            AbstractC21673619ry adapter = recyclerView.getAdapter();
            int iLJIIIIZZ = 0;
            if (adapter != null && (itemCount = adapter.getItemCount()) > 0) {
                int i3 = (itemCount - 1) - iIntValue;
                if (i3 < 0) {
                    i3 = 0;
                }
                if (iNS >= i3) {
                    RavenFragment ravenFragment = (RavenFragment) asS45S0100000_18.l0;
                    if (!ravenFragment.LLJJLIIIJLLLLLLLZ && ravenFragment.LJIIJJI()) {
                        RavenFragment ravenFragment2 = (RavenFragment) asS45S0100000_18.l0;
                        ravenFragment2.LLJJLIIIJLLLLLLLZ = true;
                        ravenFragment2.LLJL = true;
                        ravenFragment2.LLJLIL = false;
                        ravenFragment2.LLJLILLLLZIIL = true;
                        ravenFragment2.YT(EnumC1160730gJL.LLILLJJLI, "preLoadMoreScrollListener");
                        InterfaceC1361890lXn<Integer> operator = ((RavenFragment) asS45S0100000_18.l0).JS().getOperator();
                        C18Z8 c18z8 = ((RavenFragment) asS45S0100000_18.l0).LLJILJIL;
                        if (c18z8 != null && (state = c18z8.getState()) != null) {
                            iLJIIIIZZ = state.LJIIIIZZ();
                        }
                        operator.LIZ(Integer.valueOf(iLJIIIIZZ));
                        ((RavenFragment) asS45S0100000_18.l0).nT(iIntValue);
                        return;
                    }
                    return;
                }
                RavenFragment ravenFragment3 = (RavenFragment) asS45S0100000_18.l0;
                ravenFragment3.LLJJLIIIJLLLLLLLZ = false;
                ravenFragment3.LLJL = false;
                ravenFragment3.LLJLIL = false;
            }
        }
    }

    public static final void LJJIIZI$3(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
        ((PoiPostPageNewTagAssem) asS45S0100000_18.l0).No();
    }

    public static final void LJJIIZI$4(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
        ((PoiSlashVideoListPostsTriggerLineProvider) asS45S0100000_18.l0).LJ.LIZ(Integer.valueOf(i2), new AwS597S0100000_18((PoiSlashVideoListPostsTriggerLineProvider) asS45S0100000_18.l0, 365));
    }

    public static final void LJJIIZI$5(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
        ((StoryArchiveV2CalendarAssem) asS45S0100000_18.l0).No();
    }

    public static final void LJJIIZI$6(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
        Integer numValueOf;
        View viewFindViewByPosition;
        ((StoryArchiveV2ListAssem) asS45S0100000_18.l0).ap();
        StoryArchiveV2ListViewModel storyArchiveV2ListViewModelJo = ((StoryArchiveV2ListAssem) asS45S0100000_18.l0).Jo();
        storyArchiveV2ListViewModelJo.getClass();
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            if ((C13LP.LJJJLL(storyArchiveV2ListViewModelJo.zQ2((InterfaceC636340Oxc) storyArchiveV2ListViewModelJo.getState())) instanceof C1164060gOi) && (viewFindViewByPosition = layoutManager.findViewByPosition(0)) != null) {
                int height = viewFindViewByPosition.getHeight();
                numValueOf = Integer.valueOf(C13LZ.LJ((height - recyclerView.getHeight()) + viewFindViewByPosition.getTop(), 0, height));
            } else {
                numValueOf = null;
            }
            storyArchiveV2ListViewModelJo.setState(new AwS597S0100000_18(numValueOf, 758));
        }
    }

    public static final void LJJIIZI$7(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
        C1156740gCu c1156740gCu = ((C1161980gLM) asS45S0100000_18.l0).LJFF;
        if (c1156740gCu != null && c1156740gCu.LIZJ == null && C1161980gLM.LIZ(recyclerView)) {
            c1156740gCu.LIZJ = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    public static final void LJJIIZI$8(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
        NearbyContentAssem nearbyContentAssem = (NearbyContentAssem) asS45S0100000_18.l0;
        C0J34 c0j34 = nearbyContentAssem.LLJI;
        if (c0j34 != null && true == c0j34.LLLFF && i2 > 0) {
            nearbyContentAssem.Oo().wQ2();
        }
    }

    public static final void LJJIIZI$9(AsS45S0100000_18 asS45S0100000_18, RecyclerView recyclerView, int i, int i2) {
        if (i2 > 0) {
            C1204870hSX c1204870hSX = (C1204870hSX) asS45S0100000_18.l0;
            EnumC1204660hSC enumC1204660hSC = EnumC1204660hSC.GPS;
            if (c1204870hSX.LIZJ) {
                C20515215Pi c20515215Pi = c1204870hSX.LIZIZ;
                if (c20515215Pi != null) {
                    c20515215Pi.LIZIZ();
                }
                C1204820hSS.LIZ(enumC1204660hSC, EnumC586410MzH.DEFAULTTYPE, false);
                c1204870hSX.LIZJ = false;
            }
        }
    }
}

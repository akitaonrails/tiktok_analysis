package X;

import android.content.Context;
import android.graphics.PointF;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.IToolsBusinessService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ogc.news.INewsService;
import com.ss.android.ugc.aweme.ogc.news.sticker.IArticleStickerService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerManagerComponent;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.11mm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19603011mm extends C09AY implements Function0<Map<Integer, ? extends InterfaceC19578611iq>> {
    public final /* synthetic */ CellStickerManagerComponent LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C0RFT LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19603011mm(CellStickerManagerComponent cellStickerManagerComponent, C19EG c19eg, boolean z, C0RFT c0rft) {
        super(0);
        this.LL = cellStickerManagerComponent;
        this.LLILLJJLI = c19eg;
        this.LLILLL = z;
        this.LLILZ = c0rft;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Integer, ? extends InterfaceC19578611iq> invoke() {
        InterfaceC19578611iq interfaceC19578611iqProducePollStickerClickListener;
        C19640311sn c19640311snLIZJ;
        InterfaceC19603111mn consumer;
        C0RF0 c0rf0;
        Fragment fragment;
        final CellStickerManagerComponent cellStickerManagerComponent = this.LL;
        Aweme aweme = ((VideoItemParams) C631370Opb.LIZ(cellStickerManagerComponent)).getAweme();
        C19EG c19eg = this.LLILLJJLI;
        boolean z = this.LLILLL;
        C11NJ c11njLIZIZ = this.LLILZ.LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<InteractStickerStruct> list = cellStickerManagerComponent.LLL;
        ArrayList<InteractStickerStruct> arrayList = new ArrayList();
        for (Object obj : (ArrayList) list) {
            if (!C19595311lX.LIZ((InteractStickerStruct) obj, aweme, "tap")) {
                arrayList.add(obj);
            }
        }
        for (InteractStickerStruct interactStickerStruct : arrayList) {
            int type = interactStickerStruct.getType();
            if (type == 3) {
                interfaceC19578611iqProducePollStickerClickListener = cellStickerManagerComponent.mp().producePollStickerClickListener(z, cellStickerManagerComponent.getContext(), cellStickerManagerComponent.LLLF, c19eg, (InterfaceC19632811ra) cellStickerManagerComponent.LLLFFI.getValue(), c11njLIZIZ);
            } else if (type == 4) {
                interfaceC19578611iqProducePollStickerClickListener = cellStickerManagerComponent.mp().produceCommentStickerClickListener(cellStickerManagerComponent.getContext(), cellStickerManagerComponent.LLLF, c19eg);
            } else if (type != 6) {
                if (type != 25) {
                    if (type == 42) {
                        interfaceC19578611iqProducePollStickerClickListener = cellStickerManagerComponent.mp().produceMusicStickerClickListener(cellStickerManagerComponent.getContext(), cellStickerManagerComponent.LLLF, aweme, c19eg);
                    } else if (type == 88) {
                        C0OD3 c0od3 = C0OD3.LIZ;
                        Context context = cellStickerManagerComponent.getContext();
                        C705930RmZ c705930RmZ = cellStickerManagerComponent.LLLF;
                        c0od3.getClass();
                        c19eg = c19eg;
                        aweme = aweme;
                        interfaceC19578611iqProducePollStickerClickListener = new C0OD7(context, c19eg, aweme, c705930RmZ, z);
                    } else if (type == 103) {
                        interfaceC19578611iqProducePollStickerClickListener = cellStickerManagerComponent.mp().produceAttributionLinkStickerClickListener(cellStickerManagerComponent.getContext(), cellStickerManagerComponent.LLLF, aweme, c19eg);
                    } else if (type == 106) {
                        interfaceC19578611iqProducePollStickerClickListener = cellStickerManagerComponent.kp(c19eg, aweme);
                    } else if (type != 107) {
                        switch (type) {
                            case 8:
                                interfaceC19578611iqProducePollStickerClickListener = cellStickerManagerComponent.kp(c19eg, aweme);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                interfaceC19578611iqProducePollStickerClickListener = cellStickerManagerComponent.kp(c19eg, aweme);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                interfaceC19578611iqProducePollStickerClickListener = cellStickerManagerComponent.mp().produceLiveCountDownStickerClickListener(cellStickerManagerComponent.getContext(), cellStickerManagerComponent.LLLF, aweme, c19eg);
                                break;
                            default:
                                FragmentManager childFragmentManager = null;
                                switch (type) {
                                    case 111:
                                        interfaceC19578611iqProducePollStickerClickListener = cellStickerManagerComponent.mp().produceSharedCommentStickerListener(c19eg, aweme);
                                        break;
                                    case 112:
                                        IToolsBusinessService iToolsBusinessServiceMp = cellStickerManagerComponent.mp();
                                        C705930RmZ c705930RmZ2 = cellStickerManagerComponent.LLLF;
                                        FrameLayout frameLayout = cellStickerManagerComponent.LLJZIJLIL;
                                        InterfaceC706770Rnv interfaceC706770RnvLJJIIJ = C1618440sDa.LIZIZ.LJJIIJ();
                                        C0RF0 c0rf02 = cellStickerManagerComponent.jm().LIZLLL;
                                        boolean zLJJIIJZLJL = interfaceC706770RnvLJJIIJ.LJJIIJZLJL(c0rf02 != null ? c0rf02.LIZJ : null);
                                        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
                                        if (iDetailFeedSafService != null) {
                                            C0RF0 c0rf03 = cellStickerManagerComponent.jm().LIZLLL;
                                            if (iDetailFeedSafService.LIZLLL(c0rf03 != null ? c0rf03.LIZJ : null) != null && (c0rf0 = cellStickerManagerComponent.jm().LIZLLL) != null && (fragment = c0rf0.LIZJ) != null) {
                                                childFragmentManager = fragment.getChildFragmentManager();
                                            }
                                        }
                                        interfaceC19578611iqProducePollStickerClickListener = iToolsBusinessServiceMp.produceSocialAvatarClickListener(c705930RmZ2, c19eg, aweme, frameLayout, zLJJIIJZLJL, childFragmentManager);
                                        break;
                                    case 114:
                                        C19603211mo c19603211mo = IArticleStickerService.Companion;
                                        C705930RmZ c705930RmZ3 = cellStickerManagerComponent.LLLF;
                                        c19603211mo.getClass();
                                        INewsService.LIZ.getClass();
                                        INewsService value = C0N2J.LIZIZ.getValue();
                                        if (value == null || (c19640311snLIZJ = value.LIZJ()) == null || (consumer = c19640311snLIZJ.getConsumer()) == null || (interfaceC19578611iqProducePollStickerClickListener = consumer.LIZIZ(c19eg, c705930RmZ3)) == null) {
                                            interfaceC19578611iqProducePollStickerClickListener = C19603211mo.LIZIZ.getValue();
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        interfaceC19578611iqProducePollStickerClickListener = new InterfaceC19578611iq() { // from class: X.0RFJ
                            @Override // X.InterfaceC19578611iq
                            public final boolean onClick(InteractStickerStruct interactStickerStruct2, PointF pointF) {
                                return false;
                            }

                            @Override // X.InterfaceC19578611iq
                            public final boolean onClick(InteractStickerStruct interactStickerStruct2) {
                                C0N0Y c0n0y = cellStickerManagerComponent.lp().LJFF;
                                if (c0n0y != null) {
                                    if (c0n0y.isPlaying()) {
                                        c0n0y.LIZ();
                                        return true;
                                    }
                                    c0n0y.LJIILLIIL();
                                    return false;
                                }
                                return false;
                            }
                        };
                    }
                }
                interfaceC19578611iqProducePollStickerClickListener = cellStickerManagerComponent.mp().produceLiveEventCountDownStickerListener(cellStickerManagerComponent.getContext(), cellStickerManagerComponent.LLLF, aweme, c19eg, z, null);
            } else {
                interfaceC19578611iqProducePollStickerClickListener = cellStickerManagerComponent.mp().produceDonationStickerClickListener(cellStickerManagerComponent.getContext(), cellStickerManagerComponent.LLLF);
            }
            if (interfaceC19578611iqProducePollStickerClickListener != null) {
                linkedHashMap.put(Integer.valueOf(interactStickerStruct.getType()), interfaceC19578611iqProducePollStickerClickListener);
            }
        }
        return linkedHashMap;
    }
}

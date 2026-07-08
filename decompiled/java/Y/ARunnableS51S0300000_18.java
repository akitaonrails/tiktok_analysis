package Y;

import X.AbstractC21673719rz;
import X.C09AJ;
import X.C1167470gUD;
import X.C1174710gft;
import X.C1176600giw;
import X.C1177790gkr;
import X.C1177960gl8;
import X.C1178140glQ;
import X.C1178480gly;
import X.C1188890h2l;
import X.C1193560hAI;
import X.C1205490hTX;
import X.C1697810uHb;
import X.C1C7U;
import X.C1EMR;
import X.C2188811AlT;
import X.C291001Au;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC1177250gjz;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.graphics.Bitmap;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent.RavenEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment;
import com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixTabFragment;
import com.ss.android.ugc.aweme.ecommerce.mix.view.MixUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistFragmentAssem;
import com.ss.android.ugc.aweme.poi.PoiData;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.map.positionselection.PositionSelectionMapAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.assem.PoiMapDetailSheetAssem;
import com.ss.android.ugc.aweme.poi.mapdetail.viewmodel.PoiMapDetailMapVM;
import com.ss.android.ugc.aweme.poi.mapmode.assem.PoiMapModeSheetAssem;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitSheetAssem;
import com.ss.android.ugc.aweme.poi.search.item.PoiSearchCreatorCell;
import com.ss.android.ugc.aweme.search.detail.bottombar.ui.SearchDetailPoiBottomAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public class ARunnableS51S0300000_18 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        try {
            if (((PoiSearchCreatorCell) this.l0).getParent() == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("renderTagList post ");
            sbLIZ.append(((PoiData) this.l1).name);
            C2188811AlT.LIZIZ(sbLIZ);
            ((PoiSearchCreatorCell) this.l0).I5((List) this.l2, (PoiData) this.l1);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_CREATOR_STRENGTH_FEAT;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "poi_creator_cell", null, e);
        }
    }

    public final void LIZ$1() {
        InterfaceC1177250gjz interfaceC1177250gjz;
        C1176600giw c1176600giw = (C1176600giw) this.l0;
        C1177960gl8 c1177960gl8 = (C1177960gl8) this.l1;
        C1177960gl8 c1177960gl82 = (C1177960gl8) this.l2;
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c1176600giw, 2501);
        PoiMapDetailMapVM poiMapDetailMapVM = c1176600giw.LIZJ;
        if (poiMapDetailMapVM == null || (interfaceC1177250gjz = poiMapDetailMapVM.LL) == null) {
            return;
        }
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50));
        C1178480gly c1178480gly = new C1178480gly();
        c1178480gly.LIZ = true;
        c1178480gly.LIZIZ = 300L;
        c1178480gly.LIZJ = new AwS562S0100000_18(awS562S0100000_18, 2504);
        c1178480gly.LIZLLL = new AwS562S0100000_18(awS562S0100000_18, 2505);
        C1177960gl8[] c1177960gl8Arr = (C1177960gl8[]) C1697810uHb.LJIIJJI(c1177960gl8, c1177960gl82).toArray(new C1177960gl8[0]);
        interfaceC1177250gjz.LJIIIIZZ(iLIZIZ, c1178480gly, (C1177960gl8[]) Arrays.copyOf(c1177960gl8Arr, c1177960gl8Arr.length));
    }

    public final void LIZ$2() {
        String str;
        String str2;
        String str3;
        String str4;
        PoiDataStruct poiDataStruct;
        String str5;
        ((SearchDetailPoiBottomAssem) this.l0).LLJJIJIL = null;
        String str6 = "";
        if ((((C1188890h2l) this.l1).LJI.length() > 0) && ((C1188890h2l) this.l1).LJII.length() > 0) {
            SearchDetailPoiBottomAssem searchDetailPoiBottomAssem = (SearchDetailPoiBottomAssem) this.l0;
            C1188890h2l c1188890h2l = (C1188890h2l) this.l1;
            searchDetailPoiBottomAssem.Go(c1188890h2l.LJI, c1188890h2l.LJII);
            TuxTextView tuxTextView = ((SearchDetailPoiBottomAssem) this.l0).LLJJ;
            if (tuxTextView != null) {
                PoiDataStruct poiDataStruct2 = (PoiDataStruct) this.l2;
                if ((poiDataStruct2 != null && (str5 = poiDataStruct2.poiName) != null) || ((poiDataStruct = ((C1188890h2l) this.l1).LIZLLL) != null && (str5 = poiDataStruct.poiName) != null)) {
                    str6 = str5;
                }
                tuxTextView.setText(str6);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateNewPoiBarUi poiName: ");
            PoiDataStruct poiDataStruct3 = (PoiDataStruct) this.l2;
            sbLIZ.append(poiDataStruct3 != null ? poiDataStruct3.poiName : null);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        Map<String, String> identifier = AwemeBizExtKt.getIdentifier(((C1188890h2l) this.l1).LIZ);
        if (identifier == null || (str = identifier.get("tabShowName")) == null) {
            str = "";
        }
        Map<String, String> identifier2 = AwemeBizExtKt.getIdentifier(((C1188890h2l) this.l1).LIZ);
        if (identifier2 == null || (str2 = identifier2.get("tabCount")) == null) {
            str2 = "";
        }
        ((SearchDetailPoiBottomAssem) this.l0).Go(str, str2);
        TuxTextView tuxTextView2 = ((SearchDetailPoiBottomAssem) this.l0).LLJJ;
        if (tuxTextView2 != null) {
            PoiDataStruct poiDataStruct4 = (PoiDataStruct) this.l2;
            if (poiDataStruct4 == null || (str4 = poiDataStruct4.poiName) == null) {
                PoiDataStruct poiDataStruct5 = ((C1188890h2l) this.l1).LIZLLL;
                if (poiDataStruct5 != null && (str3 = poiDataStruct5.poiName) != null) {
                    str6 = str3;
                }
            } else {
                str6 = str4;
            }
            tuxTextView2.setText(str6);
        }
    }

    public final void LIZ$3() {
        LinearLayoutManager linearLayoutManager;
        List<Aweme> list;
        EditPlaylistFragmentAssem editPlaylistFragmentAssem = (EditPlaylistFragmentAssem) this.l0;
        int iLJIIIIZZ = editPlaylistFragmentAssem.Go().getState().LJIIIIZZ();
        C291001Au<List<Aweme>> c291001Au = ((C1167470gUD) this.l1).LLJILLL;
        int size = iLJIIIIZZ - ((c291001Au == null || (list = c291001Au.LIZ) == null) ? 1 : list.size());
        RecyclerView.LayoutManager layoutManager = editPlaylistFragmentAssem.Go().getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            linearLayoutManager.scrollToPositionWithOffset(size, (editPlaylistFragmentAssem.Go().getHeight() - editPlaylistFragmentAssem.LLJZ) / 2);
        }
        HandlerHook.viewPost(((EditPlaylistFragmentAssem) this.l0).Go(), new ARunnableS87S0200000_18((EditPlaylistFragmentAssem) this.l0, (AbstractC21673719rz) this.l2, 33));
    }

    public static final void run$0(ARunnableS51S0300000_18 aRunnableS51S0300000_18) {
        boolean zLIZ;
        C1C7U.LIZ("ECBaseMixContainerFragment@e0ba.ravenSubscriber$1$onReceiveEvent$1");
        try {
            ((ECBaseMixContainerFragment) aRunnableS51S0300000_18.l0).wS(aRunnableS51S0300000_18.l2, ((RavenEvent) aRunnableS51S0300000_18.l1).eventName);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECBaseMixContainerFragment@e0ba.ravenSubscriber$1$onReceiveEvent$1");
    }

    public static final void run$1(ARunnableS51S0300000_18 aRunnableS51S0300000_18) {
        boolean zLIZ;
        C1C7U.LIZ("ECBaseMixTabFragment@7fdb.defaultSubscriber$1$onReceiveEvent$3");
        try {
            ((ECBaseMixTabFragment) aRunnableS51S0300000_18.l0).jU(aRunnableS51S0300000_18.l2, ((RavenEvent) aRunnableS51S0300000_18.l1).eventName);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ECBaseMixTabFragment@7fdb.defaultSubscriber$1$onReceiveEvent$3");
    }

    public static final void run$10(ARunnableS51S0300000_18 aRunnableS51S0300000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PositionSelectionMapAssem@24e9.drawPrecisePoint$1$1");
        try {
            InterfaceC1177250gjz interfaceC1177250gjz = ((PositionSelectionMapAssem) aRunnableS51S0300000_18.l0).LLJILJILJ;
            if (interfaceC1177250gjz != null) {
                C1177960gl8 c1177960gl8 = (C1177960gl8) aRunnableS51S0300000_18.l1;
                C1178140glQ c1178140glQ = new C1178140glQ();
                c1178140glQ.LJ = 0.5f;
                c1178140glQ.LIZLLL = 0.5f;
                Bitmap bitmap = (Bitmap) aRunnableS51S0300000_18.l2;
                if (c1178140glQ.LIZ == null) {
                    c1178140glQ.LIZ = bitmap;
                }
                interfaceC1177250gjz.LJIIL(c1177960gl8, c1178140glQ);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PositionSelectionMapAssem@24e9.drawPrecisePoint$1$1");
    }

    public static final void run$11(ARunnableS51S0300000_18 aRunnableS51S0300000_18) {
        boolean zLIZ;
        C1C7U.LIZ("EditPlaylistFragmentAssem@a9aa.initSubscription$20$1$1$1");
        try {
            aRunnableS51S0300000_18.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditPlaylistFragmentAssem@a9aa.initSubscription$20$1$1$1");
    }

    public static final void run$2(ARunnableS51S0300000_18 aRunnableS51S0300000_18) {
        boolean zLIZ;
        C1C7U.LIZ("MixUIContentAssem@6068.ravenSubscriber$1$onReceiveEvent$2");
        try {
            ((MixUIContentAssem) aRunnableS51S0300000_18.l0).No(aRunnableS51S0300000_18.l2, ((RavenEvent) aRunnableS51S0300000_18.l1).eventName);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixUIContentAssem@6068.ravenSubscriber$1$onReceiveEvent$2");
    }

    public static final void run$3(ARunnableS51S0300000_18 aRunnableS51S0300000_18) {
        boolean zLIZ;
        int iLIZJ;
        C1C7U.LIZ("PoiMapDetailSheetAssem@6cc3.loadAbility$1$onSheetPeekHeightChanged$1$subscribe$$inlined$doOnPreDraw$1");
        try {
            C1177790gkr c1177790gkr = ((PoiMapDetailSheetAssem) aRunnableS51S0300000_18.l1).LLJILJIL;
            if (c1177790gkr != null) {
                iLIZJ = c1177790gkr.LIZJ();
            } else {
                iLIZJ = 0;
            }
            ((C09AJ) aRunnableS51S0300000_18.l2).onNext(Integer.valueOf(iLIZJ + C1174710gft.LIZ()));
            ((C09AJ) aRunnableS51S0300000_18.l2).onComplete();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiMapDetailSheetAssem@6cc3.loadAbility$1$onSheetPeekHeightChanged$1$subscribe$$inlined$doOnPreDraw$1");
    }

    public static final void run$4(ARunnableS51S0300000_18 aRunnableS51S0300000_18) {
        boolean zLIZ;
        int iLIZJ;
        C1C7U.LIZ("PoiMapModeSheetAssem@fac7.loadAbility$1$onSheetPeekHeightChanged$1$subscribe$$inlined$doOnPreDraw$1");
        try {
            C1177790gkr c1177790gkr = ((PoiMapModeSheetAssem) aRunnableS51S0300000_18.l1).LLJIJIL;
            if (c1177790gkr != null) {
                iLIZJ = c1177790gkr.LIZJ();
            } else {
                iLIZJ = 0;
            }
            ((C09AJ) aRunnableS51S0300000_18.l2).onNext(Integer.valueOf(iLIZJ + C1174710gft.LIZ()));
            ((C09AJ) aRunnableS51S0300000_18.l2).onComplete();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiMapModeSheetAssem@fac7.loadAbility$1$onSheetPeekHeightChanged$1$subscribe$$inlined$doOnPreDraw$1");
    }

    public static final void run$5(ARunnableS51S0300000_18 aRunnableS51S0300000_18) {
        boolean zLIZ;
        int iLIZJ;
        C1C7U.LIZ("PoiRevisitSheetAssem@58b1.loadAbility$1$onSheetPeekHeightChanged$1$subscribe$$inlined$doOnPreDraw$1");
        try {
            C1177790gkr c1177790gkr = ((PoiRevisitSheetAssem) aRunnableS51S0300000_18.l1).LLJIJIL;
            if (c1177790gkr != null) {
                iLIZJ = c1177790gkr.LIZJ();
            } else {
                iLIZJ = 0;
            }
            ((C09AJ) aRunnableS51S0300000_18.l2).onNext(Integer.valueOf(iLIZJ + C1174710gft.LIZ()));
            ((C09AJ) aRunnableS51S0300000_18.l2).onComplete();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiRevisitSheetAssem@58b1.loadAbility$1$onSheetPeekHeightChanged$1$subscribe$$inlined$doOnPreDraw$1");
    }

    public static final void run$6(ARunnableS51S0300000_18 aRunnableS51S0300000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiSearchCreatorCell@15c.renderTagList$2");
        try {
            aRunnableS51S0300000_18.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiSearchCreatorCell@15c.renderTagList$2");
    }

    public static final void run$7(ARunnableS51S0300000_18 aRunnableS51S0300000_18) {
        boolean zLIZ;
        C1C7U.LIZ("MapDetailPermissionStateContext@4f50.showACCAndLocation$1$2");
        try {
            aRunnableS51S0300000_18.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MapDetailPermissionStateContext@4f50.showACCAndLocation$1$2");
    }

    public static final void run$8(ARunnableS51S0300000_18 aRunnableS51S0300000_18) {
        boolean zLIZ;
        C1C7U.LIZ("PoiVideoAutoPlayPlugin@898.checkVideoListAlready$1$1");
        try {
            ((C1193560hAI) aRunnableS51S0300000_18.l0).LJJIFFI((ViewOnAttachStateChangeListenerC20604515jv) aRunnableS51S0300000_18.l1, (Function0) aRunnableS51S0300000_18.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiVideoAutoPlayPlugin@898.checkVideoListAlready$1$1");
    }

    public static final void run$9(ARunnableS51S0300000_18 aRunnableS51S0300000_18) {
        boolean zLIZ;
        C1C7U.LIZ("SearchDetailPoiBottomAssem@4696.updateNewPoiBarUi$updateRunnable$1");
        try {
            aRunnableS51S0300000_18.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchDetailPoiBottomAssem@4696.updateNewPoiBarUi$updateRunnable$1");
    }

    public ARunnableS51S0300000_18(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

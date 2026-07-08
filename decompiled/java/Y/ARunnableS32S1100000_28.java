package Y;

import X.C09C2;
import X.C1893210zMl;
import X.C1893220zMm;
import X.C1906370zhz;
import X.C1906530ziF;
import X.C1C7U;
import X.InterfaceC1870490ym7;
import X.InterfaceC1870510ym9;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.ui.p007default.UniversalPopupBlocksUI;
import com.ss.android.ugc.aweme.poi.thirdparty.provider.viewmodel.PoiThirdPartyViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class ARunnableS32S1100000_28 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public static final void run$0(ARunnableS32S1100000_28 aRunnableS32S1100000_28) {
        boolean zLIZ;
        C1C7U.LIZ("BubbleStayTimeCache@3af3.saveBubbleInfo$1");
        try {
            C1906530ziF.LIZ().storeString(aRunnableS32S1100000_28.s0, GsonProtectorUtils.toJson(C09C2.LIZ(), (C1906370zhz) aRunnableS32S1100000_28.l1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BubbleStayTimeCache@3af3.saveBubbleInfo$1");
    }

    public static final void run$1(ARunnableS32S1100000_28 aRunnableS32S1100000_28) {
        boolean zLIZ;
        C1C7U.LIZ("PoiThirdPartySccHandler@7008.addCustomClient$1$shouldInterceptRequest$1");
        try {
            PoiThirdPartyViewModel poiThirdPartyViewModelLJJIJL = ((C1893210zMl) aRunnableS32S1100000_28.l1).LJJIJL();
            if (poiThirdPartyViewModelLJJIJL != null) {
                String str = aRunnableS32S1100000_28.s0;
                if (str == null) {
                    str = "";
                }
                poiThirdPartyViewModelLJJIJL.LLILLL.setValue(str);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiThirdPartySccHandler@7008.addCustomClient$1$shouldInterceptRequest$1");
    }

    public static final void run$2(ARunnableS32S1100000_28 aRunnableS32S1100000_28) {
        boolean zLIZ;
        PoiThirdPartyViewModel poiThirdPartyViewModel;
        C1C7U.LIZ("PoiThirdPartySccHandlerV2@666e.addCustomClient$1$shouldInterceptRequest$1");
        try {
            if (!Intrinsics.LJFF(aRunnableS32S1100000_28.s0, "aweme://webview") && !Intrinsics.LJFF(aRunnableS32S1100000_28.s0, "about:blank") && (poiThirdPartyViewModel = ((C1893220zMm) aRunnableS32S1100000_28.l1).LLILLJJLI) != null) {
                String str = aRunnableS32S1100000_28.s0;
                if (str == null) {
                    str = "";
                }
                poiThirdPartyViewModel.LLILLL.setValue(str);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PoiThirdPartySccHandlerV2@666e.addCustomClient$1$shouldInterceptRequest$1");
    }

    public static final void run$3(ARunnableS32S1100000_28 aRunnableS32S1100000_28) {
        boolean zLIZ;
        C1C7U.LIZ("UniversalPopupBlocksUI@db40.onDismissBottomSheetWithEventTracking$1");
        try {
            ((UniversalPopupBlocksUI) aRunnableS32S1100000_28.l1).pl(new UniversalPopupAction(aRunnableS32S1100000_28.s0, null, null, null, 0, Boolean.TRUE, null, null, false, null, null, false, false, 8158, null), null, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UniversalPopupBlocksUI@db40.onDismissBottomSheetWithEventTracking$1");
    }

    public static final void run$4(ARunnableS32S1100000_28 aRunnableS32S1100000_28) {
        boolean zLIZ;
        C1C7U.LIZ("XDownloadFileMethod@53bf.handleDownloadFile$2$responseCallback$1$handleConnection$2");
        try {
            InterfaceC1870510ym9 interfaceC1870510ym9 = (InterfaceC1870510ym9) aRunnableS32S1100000_28.l1;
            String str = aRunnableS32S1100000_28.s0;
            if (str == null) {
                str = "body is null";
            }
            interfaceC1870510ym9.onFailure(0, str);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XDownloadFileMethod@53bf.handleDownloadFile$2$responseCallback$1$handleConnection$2");
    }

    public static final void run$5(ARunnableS32S1100000_28 aRunnableS32S1100000_28) {
        boolean zLIZ;
        C1C7U.LIZ("XRequestMethod@868e.realHandle$streamResponseCallback$1$handleConnection$2");
        try {
            InterfaceC1870490ym7 interfaceC1870490ym7 = (InterfaceC1870490ym7) aRunnableS32S1100000_28.l1;
            String str = aRunnableS32S1100000_28.s0;
            if (str == null) {
                str = "body is null";
            }
            interfaceC1870490ym7.LIZ(0, str, null);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XRequestMethod@868e.realHandle$streamResponseCallback$1$handleConnection$2");
    }

    public ARunnableS32S1100000_28(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}

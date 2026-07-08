package Y;

import X.C09JN;
import X.C0UT9;
import X.C142V;
import X.C1836420xtA;
import X.C1839850xyh;
import X.C1C7U;
import X.C2188811AlT;
import X.C500260Jjc;
import X.C520010KaN;
import X.InterfaceC634840OvC;
import android.content.Context;
import android.os.Build;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.browser.dialog.DownloadProgressDialog;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.LiveRepostVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import webcast.api.room.WebcastRoomRepostRepostersResponse;

/* JADX INFO: loaded from: classes28.dex */
public class AfS48S1200000_27 implements C09JN {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS48S1200000_27 afS48S1200000_27, Object obj) {
        List<WebcastRoomRepostRepostersResponse.Reposter> list;
        C1C7U.LIZ("LiveRepostVM@a28.queryReposters$1$1");
        WebcastRoomRepostRepostersResponse.Data data = ((WebcastRoomRepostRepostersResponse) obj).data;
        if (data != null && (list = data.reposters) != null) {
            LiveRepostVM liveRepostVM = (LiveRepostVM) afS48S1200000_27.l1;
            LiveRoomStruct liveRoomStruct = (LiveRoomStruct) afS48S1200000_27.l2;
            String str = afS48S1200000_27.s0;
            liveRepostVM.LLILZ = new CopyOnWriteArrayList(list);
            LiveRepostVM.LLJILJILJ.getClass();
            HashMap<String, List<WebcastRoomRepostRepostersResponse.Reposter>> map = LiveRepostVM.LLJILLL;
            long j = liveRoomStruct.id;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(j);
            sbLIZ.append('_');
            sbLIZ.append(str);
            map.put(C2188811AlT.LIZIZ(sbLIZ), new CopyOnWriteArrayList(list));
        }
        LiveRepostVM.HQ2((LiveRepostVM) afS48S1200000_27.l1, null, Boolean.TRUE, 1);
        C1C7U.LIZIZ("LiveRepostVM@a28.queryReposters$1$1");
    }

    public static final void accept$1(AfS48S1200000_27 afS48S1200000_27, Object obj) {
        Context context;
        DownloadProgressDialog downloadProgressDialog;
        C1C7U.LIZ("DownloadFileWithLoadingViewMethod@ea00.downloadInvoice$3");
        Context context2 = null;
        if (Build.VERSION.SDK_INT >= 33) {
            C1836420xtA c1836420xtALJFF = C1836420xtA.LJFF();
            C1839850xyh c1839850xyh = (C1839850xyh) afS48S1200000_27.l1;
            c1836420xtALJFF.LIZIZ(0, c1839850xyh.LLILZLL, c1839850xyh.LLILZIL, afS48S1200000_27.s0);
        } else {
            InterfaceC634840OvC interfaceC634840OvC = ((C1839850xyh) afS48S1200000_27.l1).IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                context = interfaceC634840OvC.getContext();
            } else {
                context = null;
            }
            C0UT9 c0ut9 = new C0UT9(C500260Jjc.LJ(context), TokenCert.Companion.with("bpea-live_recharge_invoice_delete"));
            final C1839850xyh c1839850xyh2 = (C1839850xyh) afS48S1200000_27.l1;
            final String str = afS48S1200000_27.s0;
            final CompletionBlock completionBlock = (CompletionBlock) afS48S1200000_27.l2;
            c0ut9.LIZ(new C142V() { // from class: X.0xyj
                @Override // X.C142V
                public final /* synthetic */ void LIZIZ(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LIZLLL(String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LJ(String str2, String... strArr) {
                }

                @Override // X.C142V
                public final /* synthetic */ void LJFF(String... strArr) {
                }

                @Override // X.C142V
                public final void LIZ(String... strArr) {
                    DownloadProgressDialog downloadProgressDialog2 = c1839850xyh2.LLILLL;
                    if (downloadProgressDialog2 != null) {
                        downloadProgressDialog2.dismiss();
                    }
                    CompletionBlock<InterfaceC1839920xyo> completionBlock2 = completionBlock;
                    c1839850xyh2.getClass();
                    XBaseModel xBaseModelLIZ = C1549500qQO.LIZ(InterfaceC1839920xyo.class);
                    ((InterfaceC1839920xyo) xBaseModelLIZ).setPath(c1839850xyh2.LLILZ);
                    completionBlock2.onFailure(0, "", (XBaseResultModel) xBaseModelLIZ);
                }

                @Override // X.C142V
                public final void LIZJ(String... strArr) {
                    C1836420xtA c1836420xtALJFF2 = C1836420xtA.LJFF();
                    C1839850xyh c1839850xyh3 = c1839850xyh2;
                    c1836420xtALJFF2.LIZIZ(0, c1839850xyh3.LLILZLL, c1839850xyh3.LLILZIL, str);
                }
            }, false, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        InterfaceC634840OvC interfaceC634840OvC2 = ((C1839850xyh) afS48S1200000_27.l1).IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            context2 = interfaceC634840OvC2.getContext();
        }
        FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(context2, false);
        if (fragmentManagerLJIL != null && (downloadProgressDialog = ((C1839850xyh) afS48S1200000_27.l1).LLILLL) != null) {
            downloadProgressDialog.show(fragmentManagerLJIL, "progress dialog");
        }
        C1C7U.LIZIZ("DownloadFileWithLoadingViewMethod@ea00.downloadInvoice$3");
    }

    public AfS48S1200000_27(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}

package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AwS106S1000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0nj0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445720nj0 {
    public final C054G LIZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(new C1466920oHC(CoroutineExceptionHandler.LJJLIL, 4)));
    public final C01GW LIZIZ;

    public final String LIZJ() {
        return (String) this.LIZIZ.getValue();
    }

    public C1445720nj0(String str) {
        this.LIZIZ = C452501pT.LIZIZ(new AwS106S1000000_22(str, 5));
    }

    public static void LIZIZ(List list, String str, String str2, final InterfaceC1445800nj8 interfaceC1445800nj8) {
        String strLJJJLL;
        List<String> listSubList;
        if (list.isEmpty()) {
            interfaceC1445800nj8.LIZ(1148, "urls is empty");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        if (C2354709Kn.LIZIZ(C2188811AlT.LIZIZ(sbLIZ))) {
            interfaceC1445800nj8.onSuccess();
            return;
        }
        if (str2 != null) {
            strLJJJLL = a0.LJJJLL(".temp", str2);
        } else {
            strLJJJLL = null;
        }
        if (!Intrinsics.LJFF(strLJJJLL, str2)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(strLJJJLL);
            if (C2354709Kn.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2))) {
                interfaceC1445800nj8.onSuccess();
                return;
            }
        }
        if (list.size() > 1) {
            listSubList = list.subList(1, list.size());
        } else {
            listSubList = C13BV.INSTANCE;
        }
        AbsDownloadListener absDownloadListener = new AbsDownloadListener() { // from class: X.0nj6
            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onSuccessed(DownloadInfo downloadInfo) {
                interfaceC1445800nj8.onSuccess();
            }

            @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
            public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
                int errorCode;
                String errorMessage;
                InterfaceC1445800nj8 interfaceC1445800nj82 = interfaceC1445800nj8;
                C1445750nj3 c1445750nj3 = C1445750nj3.LIZ;
                if (baseException == null) {
                    errorCode = 1149;
                } else {
                    if (baseException.getErrorCode() != 0) {
                        errorCode = baseException.getErrorCode();
                    } else {
                        errorCode = 1148;
                    }
                    errorMessage = baseException.getErrorMessage();
                    if (errorMessage == null) {
                    }
                    interfaceC1445800nj82.LIZ(errorCode, errorMessage);
                }
                errorMessage = "";
                interfaceC1445800nj82.LIZ(errorCode, errorMessage);
            }
        };
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with((String) ListProtector.get(list, 0));
        abstractC2199801B7qWith.LJIIIIZZ = listSubList;
        abstractC2199801B7qWith.LIZJ = str2;
        abstractC2199801B7qWith.LJ = str;
        abstractC2199801B7qWith.LJFF(Collections.singletonList(new HttpHeader("edit_post", "photo")));
        abstractC2199801B7qWith.LJII = 3;
        abstractC2199801B7qWith.LJIJJ = 3;
        abstractC2199801B7qWith.LJIIJ = "edit_post";
        abstractC2199801B7qWith.LJJ = true;
        abstractC2199801B7qWith.LJIIJJI = absDownloadListener;
        abstractC2199801B7qWith.LIZJ();
    }

    public static void LIZLLL(List list, int i, long j, AtomicInteger atomicInteger, AtomicReference atomicReference, InterfaceC1445690nix interfaceC1445690nix) {
        List listLJJJJLI = C13LP.LJJJJLI(list);
        int size = ((ArrayList) listLJJJJLI).size();
        C01TT.LIZLLL(new C1445700niy(size, i, interfaceC1445690nix, listLJJJJLI, atomicInteger, atomicReference));
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i, "total_count");
        c0lab.LIZ(size, "success_count");
        c0lab.LIZIZ(System.currentTimeMillis() - j, "time_cost");
        c0lab.LIZ(atomicInteger.get(), "error_code");
        String str = (String) atomicReference.get();
        if (str == null) {
            str = "";
        }
        c0lab.LJ("error_msg", str);
        C20684815ws.LJIILLIIL("edit_post_image_download_result", c0lab.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(final com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel r20, final X.InterfaceC1445690nix r21, final java.util.concurrent.atomic.AtomicInteger r22, final java.util.concurrent.atomic.AtomicInteger r23, final java.util.concurrent.atomic.AtomicInteger r24, final java.util.concurrent.atomic.AtomicReference<java.lang.String> r25, final int r26, X.InterfaceC1364105Vn<? super com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo> r27) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1445720nj0.LIZ(com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel, X.0nix, java.util.concurrent.atomic.AtomicInteger, java.util.concurrent.atomic.AtomicInteger, java.util.concurrent.atomic.AtomicInteger, java.util.concurrent.atomic.AtomicReference, int, X.05Vn):java.lang.Object");
    }
}

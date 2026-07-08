package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.unifiedauth.push.tracking.api.UploadPopupEventsResponse;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.10kX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19334310kX implements InterfaceC19474811He {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC19474811He
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                break;
            case 1:
                onError$1(this, th);
                break;
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
        switch (this.$t) {
            case 0:
                C211000rc.LIZ("[Push]");
                break;
            case 1:
                C211000rc.LIZ("[Push]");
                break;
        }
    }

    @Override // X.InterfaceC19474811He
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
        }
    }

    public C19334310kX(C013C c013c, int i) {
        this.$t = i;
        this.l0 = c013c;
    }

    public static final void onError$0(C19334310kX c19334310kX, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadPopupEventsApi() - error! throw ");
        sbLIZ.append(th.getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push]");
        ((C013C) c19334310kX.l0).element = false;
    }

    public static final void onError$1(C19334310kX c19334310kX, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UploadPopupEventsApi() - error! throw ");
        sbLIZ.append(th.getMessage());
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("[Push]");
        ((C013C) c19334310kX.l0).element = false;
    }

    public static final void onSuccess$0(C19334310kX c19334310kX, Object obj) {
        for (Pair pair : (List) obj) {
            if (((BaseResponse) pair.getSecond()).status_code != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UploadPopupEventsApi.onSuccess() - error! status_code = ");
                sbLIZ.append(((BaseResponse) pair.getSecond()).status_code);
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("[Push]");
                c19334310kX.onError(new Throwable("request error"));
            } else if (((UploadPopupEventsResponse) pair.getSecond()).code != 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("UploadPopupEventsApi.onSuccess() - error! code = ");
                sbLIZ2.append(((UploadPopupEventsResponse) pair.getSecond()).code);
                C2188811AlT.LIZIZ(sbLIZ2);
                C211000rc.LIZ("[Push]");
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("request code error: ");
                sbLIZ3.append(((UploadPopupEventsResponse) pair.getSecond()).code);
                sbLIZ3.append(", ");
                sbLIZ3.append(((UploadPopupEventsResponse) pair.getSecond()).result);
                c19334310kX.onError(new Throwable(C2188811AlT.LIZIZ(sbLIZ3)));
            } else {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("UploadPopupEventsApi.onSuccess(");
                sbLIZ4.append(((UploadPopupEventsResponse) pair.getSecond()).result);
                sbLIZ4.append(')');
                C2188811AlT.LIZIZ(sbLIZ4);
                C211000rc.LIZ("[Push]");
                ((Keva) C19217510Gf.LIZ.getValue()).storeLong("last_reported_ts", ((Number) pair.getFirst()).longValue());
            }
        }
    }

    public static final void onSuccess$1(C19334310kX c19334310kX, Object obj) {
        for (Pair pair : (List) obj) {
            if (((BaseResponse) pair.getSecond()).status_code != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("UploadPopupEventsApi.onSuccess() - error! status_code = ");
                sbLIZ.append(((BaseResponse) pair.getSecond()).status_code);
                C2188811AlT.LIZIZ(sbLIZ);
                C211000rc.LIZ("[Push]");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("request status_code error: ");
                sbLIZ2.append(((BaseResponse) pair.getSecond()).status_code);
                c19334310kX.onError(new Throwable(C2188811AlT.LIZIZ(sbLIZ2)));
            } else if (((UploadPopupEventsResponse) pair.getSecond()).code != 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("UploadPopupEventsApi.onSuccess() - error! code = ");
                sbLIZ3.append(((UploadPopupEventsResponse) pair.getSecond()).code);
                C2188811AlT.LIZIZ(sbLIZ3);
                C211000rc.LIZ("[Push]");
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("request code error: ");
                sbLIZ4.append(((UploadPopupEventsResponse) pair.getSecond()).code);
                sbLIZ4.append(", ");
                sbLIZ4.append(((UploadPopupEventsResponse) pair.getSecond()).result);
                c19334310kX.onError(new Throwable(C2188811AlT.LIZIZ(sbLIZ4)));
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("UploadPopupEventsApi.onSuccess(");
                sbLIZ5.append(((UploadPopupEventsResponse) pair.getSecond()).result);
                sbLIZ5.append(')');
                C2188811AlT.LIZIZ(sbLIZ5);
                C211000rc.LIZ("[Push]");
                ((Keva) C19217510Gf.LIZ.getValue()).storeLong("last_reported_ts", ((Number) pair.getFirst()).longValue());
            }
        }
    }
}

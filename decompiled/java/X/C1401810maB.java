package X;

import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0maB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1401810maB extends SimpleServiceLoadCallback {
    public final int $t;
    public Object l0;

    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
    public final void onLoad(AsyncAVService asyncAVService, long j) {
        switch (this.$t) {
            case 0:
                onLoad$0(this, asyncAVService, j);
                break;
            case 1:
                onLoad$1(this, asyncAVService, j);
                break;
            default:
                super.onLoad(asyncAVService, j);
                break;
        }
    }

    public C1401810maB(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLoad$0(C1401810maB c1401810maB, AsyncAVService asyncAVService, long j) {
        IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
        C0XQC c0xqc = (C0XQC) c1401810maB.l0;
        iRecordServiceRecordService.startRecord(c0xqc.LJII, c0xqc.LJI);
    }

    public static final void onLoad$1(C1401810maB c1401810maB, AsyncAVService asyncAVService, long j) {
        ((Function1) c1401810maB.l0).invoke(asyncAVService);
    }
}

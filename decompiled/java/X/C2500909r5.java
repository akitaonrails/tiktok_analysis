package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.bytedance.android.live.kyc.KYCCameraActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.DetailFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.09r5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2500909r5 implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<List<Aweme>> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
        }
    }

    public static final void subscribe$0(C2500909r5 c2500909r5, InterfaceC2329309At interfaceC2329309At) {
        List arrayList;
        C1908390zlF c1908390zlF = (C1908390zlF) c2500909r5.l0;
        List listLLIIII = C13LP.LLIIII((CopyOnWriteArraySet) c2500909r5.l1);
        c1908390zlF.getClass();
        try {
            String string = listLLIIII.toString();
            C23053091n.LIZ.getClass();
            arrayList = ((DetailFeedService) C23053091n.LIZJ.getValue()).LJIILIIL(4, string).items;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("InnerPushPreloadManager", "requestAwemeListReal error", th);
            arrayList = new ArrayList();
        }
        interfaceC2329309At.onSuccess(arrayList);
    }

    public static final void subscribe$1(C2500909r5 c2500909r5, InterfaceC2329309At interfaceC2329309At) {
        ArrayList arrayList = new ArrayList();
        List<Uri> list = (List) c2500909r5.l0;
        KYCCameraActivity kYCCameraActivity = (KYCCameraActivity) c2500909r5.l1;
        for (Uri uri : list) {
            if (kYCCameraActivity != null && uri != null) {
                try {
                    byte[] bArrLIZJ = C08P1.LIZJ(C09NT.LJ(kYCCameraActivity.getContentResolver(), uri));
                    if (bArrLIZJ != null) {
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrLIZJ, 0, bArrLIZJ.length);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 15, byteArrayOutputStream);
                        arrayList.add(byteArrayOutputStream.toByteArray());
                    }
                } catch (FileNotFoundException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        interfaceC2329309At.onSuccess(arrayList);
    }

    public C2500909r5(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}

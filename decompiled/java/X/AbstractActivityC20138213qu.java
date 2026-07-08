package X;

import X.C1387670mDN;
import android.os.Bundle;
import android.os.Parcel;
import com.bytedance.ies.foundation.activity.BaseActivity;
import java.util.Iterator;

/* JADX INFO: renamed from: X.13qu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractActivityC20138213qu<P extends C1387670mDN> extends BaseActivity {
    public final C20138113qt<P> LL;

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public final void onDestroy() {
        C20138113qt<P> c20138113qt = this.LL;
        P p = c20138113qt.LIZIZ;
        if (p != null && c20138113qt.LIZLLL) {
            p.LIZ = null;
            c20138113qt.LIZLLL = false;
        }
        super.onDestroy();
        C20138113qt<P> c20138113qt2 = this.LL;
        boolean z = !isChangingConfigurations();
        P p3 = c20138113qt2.LIZIZ;
        if (p3 == null || !z) {
            return;
        }
        Iterator<InterfaceC1387680mDO> it2 = p3.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onDestroy();
        }
        c20138113qt2.LIZIZ = null;
    }

    public AbstractActivityC20138213qu() {
        Class<? extends C1387670mDN> clsValue;
        InterfaceC20138413qw interfaceC20138413qw = (InterfaceC20138413qw) getClass().getAnnotation(InterfaceC20138413qw.class);
        C20138313qv c20138313qv = null;
        if (interfaceC20138413qw != null && (clsValue = interfaceC20138413qw.value()) != null) {
            c20138313qv = new C20138313qv(clsValue);
        }
        this.LL = new C20138113qt<>(c20138313qv);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        super.onResume();
        C20138113qt<P> c20138113qt = this.LL;
        c20138113qt.LIZ();
        P p = c20138113qt.LIZIZ;
        if (p == null || c20138113qt.LIZLLL) {
            return;
        }
        p.LIZ = this;
        c20138113qt.LIZLLL = true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            C20138113qt<P> c20138113qt = this.LL;
            Bundle bundle2 = bundle.getBundle("presenter_state");
            if (c20138113qt.LIZIZ == null) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeValue(bundle2);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.unmarshall(bArrMarshall, 0, bArrMarshall.length);
                parcelObtain2.setDataPosition(0);
                Object value = parcelObtain2.readValue(C20138513qx.LIZ);
                parcelObtain2.recycle();
                c20138113qt.LIZJ = (Bundle) value;
                return;
            }
            throw new IllegalArgumentException("onRestoreInstanceState() should be called before onResume()");
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C20138113qt<P> c20138113qt = this.LL;
        c20138113qt.getClass();
        Bundle bundle2 = new Bundle();
        c20138113qt.LIZ();
        if (c20138113qt.LIZIZ != null) {
            Bundle bundle3 = new Bundle();
            c20138113qt.LIZIZ.getClass();
            C786410Ut5.LJJIIZI(bundle2, bundle3, "presenter");
            C786410Ut5.LJJJI("presenter_id", EnumC20137813qq.INSTANCE.getId(c20138113qt.LIZIZ), bundle2);
        }
        C786410Ut5.LJJIIZI(bundle, bundle2, "presenter_state");
    }
}

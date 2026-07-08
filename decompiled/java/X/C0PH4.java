package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.discover.eventcenter.EventCenter;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PH4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PH4 extends AbstractC648060PbQ implements Observer<C0RD4> {
    public final EventCenter LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0PH4(X.C647830Pb3 r7) {
        /*
            r6 = this;
            r6.<init>(r7)
            X.19EG r3 = r7.LIZJ
            if (r3 == 0) goto L62
            boolean r0 = X.C07H6.LIZ()
            if (r0 == 0) goto L80
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r5 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            androidx.fragment.app.Fragment r4 = r7.LIZ
            r0 = 0
            if (r4 == 0) goto L28
            android.content.Context r1 = r4.getContext()
            if (r1 == 0) goto L7e
            android.app.Activity r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r1)
        L1e:
            boolean r1 = X.C294780Bgy.LIZ()
            if (r1 == 0) goto L63
            boolean r1 = r2 instanceof X.InterfaceC214897198d
            if (r1 != 0) goto L72
        L28:
            r4 = r0
        L29:
            r5.getClass()
            boolean r1 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJJJJLL(r4, r3)
            if (r1 == 0) goto L80
            androidx.fragment.app.Fragment r1 = r7.LIZ
            if (r1 == 0) goto L80
            X.19EG r1 = r1.getActivity()
            if (r1 != 0) goto L80
        L3c:
            r6.LLILLJJLI = r0
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            boolean r1 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r1)
            if (r1 == 0) goto L8f
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r2 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            X.0Pb3 r1 = r6.LL
            androidx.fragment.app.Fragment r1 = r1.LIZ
            r2.getClass()
            androidx.lifecycle.LifecycleOwner r2 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJIJJ(r1, r3)
            if (r2 == 0) goto L62
            if (r0 == 0) goto L62
            java.lang.String r1 = "mix_feed_fragment_status"
            r0.xQ2(r1, r6, r2)
        L62:
            return
        L63:
            boolean r1 = r2 instanceof X.InterfaceC214897198d
            if (r1 == 0) goto L28
            X.198d r2 = (X.InterfaceC214897198d) r2
            boolean r1 = r2.getEnableSAF()
            if (r1 != 0) goto L72
            goto L28
        L70:
            if (r4 == 0) goto L28
        L72:
            boolean r1 = r4 instanceof X.InterfaceC214902198i
            if (r1 == 0) goto L79
            X.198i r4 = (X.InterfaceC214902198i) r4
            goto L29
        L79:
            androidx.fragment.app.Fragment r4 = r4.getParentFragment()
            goto L70
        L7e:
            r2 = r0
            goto L1e
        L80:
            androidx.fragment.app.Fragment r0 = r7.LIZ
            androidx.lifecycle.ViewModelProvider r1 = X.C679340Qkm.LIZIZ(r0, r3)
            java.lang.Class<com.ss.android.ugc.aweme.discover.eventcenter.EventCenter> r0 = com.ss.android.ugc.aweme.discover.eventcenter.EventCenter.class
            androidx.lifecycle.ViewModel r0 = r1.get(r0)
            com.ss.android.ugc.aweme.discover.eventcenter.EventCenter r0 = (com.ss.android.ugc.aweme.discover.eventcenter.EventCenter) r0
            goto L3c
        L8f:
            Y.ARunnableS79S0200000_10 r1 = new Y.ARunnableS79S0200000_10
            r0 = 70
            r1.<init>(r6, r3, r0)
            r3.runOnUiThread(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0PH4.<init>(X.0Pb3):void");
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) throws JSONException {
        String str;
        C0RD4 c0rd42 = c0rd4;
        if (Intrinsics.LJFF(c0rd42.LIZ, "mix_feed_fragment_status")) {
            Object obj = c0rd42.LIZIZ;
            if (obj == null) {
                obj = null;
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                if (bool.booleanValue()) {
                    str = "viewAppear";
                } else {
                    str = "viewDisappear";
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", "mix");
                this.LL.LIZ(str, jSONObject);
            }
        }
    }
}

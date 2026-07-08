package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0VOb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C796950VOb {
    public final C1469160oKo LIZ;
    public final ArrayList<String> LIZIZ = new ArrayList<>();
    public InterfaceC796970VOd LIZJ = null;
    public final Context LIZLLL;
    public final WeakReference<C1469160oKo> LJ;

    public final boolean LIZ() {
        if (this.LIZJ == null) {
            InterfaceC796980VOe interfaceC796980VOe = this.LIZ.LJIL;
            if (interfaceC796980VOe == null) {
                this.LIZJ = new C0VOH(this.LIZLLL, "TTVideoEngine_vod_strategy_database_v01");
                int i = C2187451AjH.LIZ;
                TTVideoEngineLog.d("VCStrategy", "use KVDBManager");
                return ((C0VOH) this.LIZJ).LIZLLL;
            }
            interfaceC796980VOe.getClass();
            this.LIZJ = new InterfaceC796970VOd() { // from class: X.0VOc
                @Override // X.InterfaceC796970VOd
                public final boolean LIZ(String str) {
                    return true;
                }

                @Override // X.InterfaceC796970VOd
                public final boolean clear() {
                    return true;
                }

                @Override // X.InterfaceC796970VOd
                public final String getString(String str) {
                    return "";
                }

                @Override // X.InterfaceC796970VOd
                public final boolean putString(String str, String str2) {
                    return true;
                }
            };
            int i2 = C2187451AjH.LIZ;
            TTVideoEngineLog.d("VCStrategy", "use kv storage provider");
        }
        return this.LIZJ != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r7 = this;
            java.lang.ref.WeakReference<X.0oKo> r0 = r7.LJ
            java.lang.Object r4 = r0.get()
            X.0oKo r4 = (X.C1469160oKo) r4
            if (r4 != 0) goto Lb
            return
        Lb:
            X.0VOd r1 = r7.LIZJ
            java.lang.String r0 = "data_index"
            java.lang.String r1 = r1.getString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            r2 = 0
            if (r0 != 0) goto L7d
            java.lang.String r0 = ","
            java.lang.String[] r6 = r1.split(r0)     // Catch: java.lang.Throwable -> L3f
            if (r6 == 0) goto L7d
            int r0 = r6.length     // Catch: java.lang.Throwable -> L3f
            if (r0 <= 0) goto L7d
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3f
            r5.<init>()     // Catch: java.lang.Throwable -> L3f
            int r3 = r6.length     // Catch: java.lang.Throwable -> L3c
            r2 = 0
        L2c:
            if (r2 >= r3) goto L4b
            r1 = r6[r2]     // Catch: java.lang.Throwable -> L3c
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L39
            r5.add(r1)     // Catch: java.lang.Throwable -> L3c
        L39:
            int r2 = r2 + 1
            goto L2c
        L3c:
            r1 = move-exception
            r2 = r5
            goto L40
        L3f:
            r1 = move-exception
        L40:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            int r0 = X.C2187451AjH.LIZ
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r1)
            if (r2 == 0) goto L7d
            goto L4c
        L4b:
            r2 = r5
        L4c:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L7d
            java.util.ArrayList<java.lang.String> r0 = r7.LIZIZ
            r0.addAll(r2)
            java.util.Iterator r3 = r2.iterator()
        L5b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            X.0VOd r0 = r7.LIZJ
            java.lang.String r2 = r0.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L5b
            com.bytedance.vcloud.strategy.StrategyCenter r1 = r4.LIZJ()
            r0 = 31210(0x79ea, float:4.3735E-41)
            r1.businessEvent(r0, r2)
            goto L5b
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C796950VOb.LIZIZ():void");
    }

    public final void LIZJ() {
        String string;
        ArrayList<String> arrayList = this.LIZIZ;
        if (arrayList != null) {
            StringBuilder sb = new StringBuilder(arrayList.size());
            for (int i = 0; i < arrayList.size(); i++) {
                sb.append((String) ListProtector.get(arrayList, i));
                if (i < arrayList.size() - 1) {
                    sb.append(",");
                }
            }
            string = sb.toString();
        } else {
            string = null;
        }
        this.LIZJ.putString("data_index", string);
    }

    public C796950VOb(C1469160oKo c1469160oKo, Context context, C1469160oKo c1469160oKo2) {
        this.LIZLLL = null;
        this.LJ = null;
        this.LIZ = c1469160oKo;
        this.LIZLLL = context;
        this.LJ = new WeakReference<>(c1469160oKo2);
    }
}

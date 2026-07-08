package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Vap, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C800570Vap extends BPEAThread implements Handler.Callback {
    public static final C800610Vat LLILZIL = new C08UT<C800570Vap>() { // from class: X.0Vat
        @Override // X.C08UT
        public final Object LIZ() {
            return new C800570Vap();
        }
    };
    public final Map<String, List<InterfaceC800600Vas>> LL = new ConcurrentHashMap();
    public final int LLILLJJLI = LSPassThroughRecordSizeConfig.DEFAULT;
    public final LinkedList<C800580Vaq> LLILLL = new LinkedList<>();
    public BPEAHandler LLILZ;

    @Override // com.bytedance.bpea.transmit.delegate.BPEAThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("EventBus@f18b.run");
        boolean zLJ = C0W9U.LJ(getBpeaTraceContext());
        try {
            super.run();
            Looper.prepare();
            this.LLILZ = new BPEAHandler(this);
            Looper.loop();
        } finally {
        }
        if (zLJ) {
            C0W9U.LJFF();
        }
        C1C7U.LIZIZ("EventBus@f18b.run");
    }

    public C800570Vap() {
        start();
    }

    public final void LIZJ(C800580Vaq c800580Vaq) {
        synchronized (this.LLILLL) {
            try {
                if (this.LLILLL.size() >= this.LLILLJJLI) {
                    this.LLILLL.poll();
                }
                this.LLILLL.add(c800580Vaq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:6:0x0014, B:9:0x0022, B:11:0x0028, B:13:0x0030, B:15:0x003c, B:25:0x006e, B:26:0x0072, B:28:0x0078, B:30:0x0084, B:32:0x0095, B:34:0x009a, B:35:0x009d, B:38:0x00a9, B:37:0x00a2, B:16:0x0042, B:18:0x004c, B:20:0x0052, B:22:0x005a, B:24:0x0066), top: B:45:0x0014, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C800580Vaq r9) {
        /*
            r8 = this;
            java.util.Map<java.lang.String, java.util.List<X.0Vas>> r1 = r8.LL
            java.lang.String r0 = r9.LIZ
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Object r2 = r1.get(r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto Lf
            return
        Lf:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.lang.String r1 = "applog_event_upload_eid"
            java.lang.String r0 = r9.LIZ     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r6 = "responseByte"
            java.lang.String r5 = "$$EVENT_LOCAL_IDS"
            if (r0 == 0) goto L42
            java.lang.Object r1 = r9.LIZIZ     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto L42
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r1.has(r5)     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto L42
            java.lang.Object r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> Laf
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r1 = r0.opt(r5)     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lad
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> Laf
            r7.addAll(r1)     // Catch: java.lang.Throwable -> Laf
            goto Lad
        L42:
            java.lang.String r1 = "applog_do_request_end"
            java.lang.String r0 = r9.LIZ     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lad
            java.lang.Object r1 = r9.LIZIZ     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r1 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lad
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r1.has(r6)     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> Laf
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r1 = r0.opt(r6)     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r1 instanceof byte[]     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lad
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r4 = r1.clone()     // Catch: java.lang.Throwable -> Laf
            byte[] r4 = (byte[]) r4     // Catch: java.lang.Throwable -> Laf
        L6e:
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> Laf
        L72:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lb3
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> Laf
            X.0Vas r2 = (X.InterfaceC800600Vas) r2     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r0 = r9.LIZIZ     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r0 instanceof org.json.JSONObject     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto La9
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Laf
            java.lang.Object r0 = r9.LIZIZ     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Laf
            java.lang.String r0 = r0.toString()     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Laf
            r1.<init>(r0)     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Laf
            boolean r0 = r7.isEmpty()     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Laf
            if (r0 != 0) goto L98
            r1.put(r5, r7)     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Laf
        L98:
            if (r4 == 0) goto L9d
            r1.put(r6, r4)     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Laf
        L9d:
            r2.LIZ()     // Catch: org.json.JSONException -> La1 java.lang.Throwable -> Laf
            goto L72
        La1:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Laf
            r2.LIZ()     // Catch: java.lang.Throwable -> Laf
            goto L72
        La9:
            r2.LIZ()     // Catch: java.lang.Throwable -> Laf
            goto L72
        Lad:
            r4 = 0
            goto L6e
        Laf:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C800570Vap.LJFF(X.0Vaq):void");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            LJFF((C800580Vaq) HandlerHook.getMessageObj(message.obj));
        }
        return true;
    }

    public final void LIZLLL(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C800580Vaq c800580Vaq = new C800580Vaq(str, obj);
        if (!((ConcurrentHashMap) this.LL).containsKey(str)) {
            LIZJ(c800580Vaq);
            return;
        }
        BPEAHandler bPEAHandler = this.LLILZ;
        if (bPEAHandler != null) {
            C786410Ut5.LJLJJL(bPEAHandler, bPEAHandler.obtainMessage(1, c800580Vaq));
        } else {
            LJFF(c800580Vaq);
        }
    }

    public final void LJ(String str, InterfaceC800590Var interfaceC800590Var) {
        if (!TextUtils.isEmpty(str)) {
            C800580Vaq c800580Vaq = new C800580Vaq(str, interfaceC800590Var.LIZ());
            if (!((ConcurrentHashMap) this.LL).containsKey(str)) {
                LIZJ(c800580Vaq);
                return;
            }
            BPEAHandler bPEAHandler = this.LLILZ;
            if (bPEAHandler != null) {
                C786410Ut5.LJLJJL(bPEAHandler, bPEAHandler.obtainMessage(1, c800580Vaq));
            } else {
                LJFF(c800580Vaq);
            }
        }
    }
}

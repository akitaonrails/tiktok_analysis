package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import ci3.a;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AdS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183841AdS {
    public static final /* synthetic */ int LJI = 0;
    public Handler LIZLLL;
    public final Set<InterfaceC591550NIb> LIZ = new LinkedHashSet();
    public final HandlerThreadC795810VJr LIZIZ = new a() { // from class: X.0VJr
        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
            try {
                super.onLooperPrepared();
                C2183841AdS c2183841AdS = this.LL;
                Looper looper = getLooper();
                final C2183841AdS c2183841AdS2 = this.LL;
                c2183841AdS.LIZLLL = new Handler(looper, new Handler.Callback() { // from class: X.0NIa
                    @Override // android.os.Handler.Callback
                    public final boolean handleMessage(Message message) {
                        try {
                            if (message.what == 1 && (HandlerHook.getMessageObj(message.obj) instanceof InterfaceC582850MtX)) {
                                InterfaceC582850MtX interfaceC582850MtX = (InterfaceC582850MtX) HandlerHook.getMessageObj(message.obj);
                                Iterator<InterfaceC591550NIb> it2 = c2183841AdS2.LIZ.iterator();
                                while (it2.hasNext()) {
                                    it2.next().LIZ(interfaceC582850MtX);
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                        return true;
                    }
                });
                if (zLJ) {
                    C0W9U.LJFF();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                throw th;
            }
        }

        {
            super("EVENT_CENTER");
        }
    };
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue<InterfaceC582850MtX> LJ = new ConcurrentLinkedQueue<>();
    public final C603440Nle LJFF = new InterfaceC20685415wy() { // from class: X.0Nle
        @Override // X.InterfaceC20685415wy
        public void onEvent(String str) {
        }

        @Override // X.InterfaceC20685415wy
        public final void LIZ(String str, Map<String, String> map) {
            C2183841AdS c2183841AdS = this.LIZ;
            c2183841AdS.getClass();
            if (str != null && map != null && C1DCQ.LIZ.contains(str)) {
                c2183841AdS.LIZJ(new C603460Nlg(str, new InterfaceC603400Nla(map) { // from class: X.0Nld
                    public final Map<String, String> LIZ;

                    @Override // X.InterfaceC603400Nla
                    public final JSONObject LIZ() {
                        return new JSONObject(this.LIZ);
                    }

                    @Override // X.InterfaceC603400Nla
                    public final boolean LIZIZ() {
                        return this.LIZ.containsKey("enter_from");
                    }

                    {
                        this.LIZ = map;
                    }

                    @Override // X.InterfaceC603400Nla
                    public final String getValue(String str2) {
                        return this.LIZ.get(str2);
                    }
                }));
            }
        }

        @Override // X.InterfaceC20685415wy
        public final void onEvent(String str, final JSONObject jSONObject) {
            C2183841AdS c2183841AdS = this.LIZ;
            c2183841AdS.getClass();
            if (str != null && jSONObject != null && C1DCQ.LIZ.contains(str)) {
                c2183841AdS.LIZJ(new C603460Nlg(str, new InterfaceC603400Nla(jSONObject) { // from class: X.0Nlf
                    public final JSONObject LIZ;

                    @Override // X.InterfaceC603400Nla
                    public final JSONObject LIZ() throws JSONException {
                        JSONObject jSONObject2 = new JSONObject();
                        Iterator<String> itKeys = this.LIZ.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            jSONObject2.putOpt(next, this.LIZ.opt(next));
                        }
                        return jSONObject2;
                    }

                    @Override // X.InterfaceC603400Nla
                    public final boolean LIZIZ() {
                        return this.LIZ.has("enter_from");
                    }

                    {
                        this.LIZ = jSONObject;
                    }

                    @Override // X.InterfaceC603400Nla
                    public final String getValue(String str2) {
                        return this.LIZ.optString(str2);
                    }
                }));
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0VJr] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Nle] */
    public C2183841AdS() {
        int i = C1DCM.LJ;
        LIZ(C2183851AdT.LIZ);
        LIZ(C2183861AdU.LIZ);
        if (C300580BqK.LIZ()) {
            LIZ(C2183801AdO.LIZ);
        }
    }

    public final void LIZ(InterfaceC591550NIb interfaceC591550NIb) {
        if (!this.LIZ.contains(interfaceC591550NIb)) {
            this.LIZ.add(interfaceC591550NIb);
        }
    }

    public final void LIZJ(InterfaceC582850MtX interfaceC582850MtX) {
        Handler handler = this.LIZLLL;
        if (handler == null) {
            if (!this.LIZJ.get() && this.LIZJ.compareAndSet(false, true)) {
                start();
            }
            if (this.LJ.size() >= 1024) {
                return;
            }
            this.LJ.add(interfaceC582850MtX);
            return;
        }
        C786410Ut5.LJLJJL(handler, handler.obtainMessage(1, interfaceC582850MtX));
    }

    public final void LIZIZ(Aweme aweme, String str, boolean z) {
        String aid = aweme.getAid();
        if (aid == null) {
            aid = "";
        }
        LIZJ(new C2183911AdZ(aweme, aid, str, z));
    }
}

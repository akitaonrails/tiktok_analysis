package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS17S0200100_20;
import Y.ARunnableS26S0201000_20;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdui.event.SDUIEventManager;
import com.bytedance.sdui.network.impl.HeartBeatManager;
import com.bytedance.sdui.serializedData.AbsSerializedData;
import com.bytedance.sdui.serializedData.common.ACKRequest;
import com.bytedance.sdui.serializedData.common.ACKResponse;
import com.bytedance.sdui.serializedData.common.CommonResponse;
import com.bytedance.sdui.serializedData.common.EventRequest;
import com.bytedance.sdui.serializedData.common.Frame;
import com.bytedance.sdui.serializedData.common.PollingResponse;
import com.bytedance.sdui.serializedData.common.event.ClientEvent;
import com.bytedance.sdui.serializedData.register.FontCacheItem;
import com.bytedance.sdui.serializedData.register.FontsToken;
import com.bytedance.sdui.serializedData.register.RegisterRequest;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hybridkit.sdui.SDUIWsServiceImpl;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.spark.SparkHostApiImpl;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kOc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1317760kOc implements InterfaceC1314950kK5, InterfaceC1317950kOv {
    public AbstractC1317090kNX LIZ;
    public final InterfaceC1317880kOo LIZIZ;
    public long LIZLLL;
    public volatile boolean LJ;
    public boolean LJII;
    public final HeartBeatManager LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public long LJIIL;
    public String LIZJ = "";
    public final String LJFF = UUID.randomUUID().toString();
    public String LJI = "";
    public final Map<Long, C1317900kOq> LJIIJJI = new LinkedHashMap();
    public final List<EventRequest> LJIILIIL = new ArrayList();
    public final ARunnableS120S0100000_20 LJIILJJIL = new ARunnableS120S0100000_20(this, 150);
    public final ARunnableS120S0100000_20 LJIILL = new ARunnableS120S0100000_20(this, 151);
    public final ARunnableS120S0100000_20 LJIILLIIL = new ARunnableS120S0100000_20(this, 152);

    static {
        new Object() { // from class: X.0kJn
        };
    }

    @Override // X.InterfaceC1314950kK5
    public void LIZ() {
        Object c098200Yq;
        SDUIWsServiceImpl sDUIWsServiceImpl;
        ISparkHostApi iSparkHostApi;
        SparkHostApiImpl sparkHostApiImplLLIZ;
        try {
            sDUIWsServiceImpl = C1317350kNx.LIZIZ.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C1317810kOh.LJ && ((iSparkHostApi = sDUIWsServiceImpl.LIZIZ.LIZIZ) == null || (sparkHostApiImplLLIZ = iSparkHostApi.LLIZ()) == null || !sparkHostApiImplLLIZ.LLLIIL())) {
            this.LIZ.LLIZLLLIL.LJII(new C1291190jhl(-3, "connection not available"));
            return;
        }
        long j = C1317810kOh.LIZIZ;
        if (j > 0) {
            C1290750jh3.LIZJ(j, this.LJIILJJIL);
        }
        this.LIZIZ.LIZIZ();
        this.LIZJ = this.LIZ.LLJILJILJ;
        this.LIZLLL = System.currentTimeMillis();
        C1317100kNY c1317100kNY = this.LIZ.LLJJJJ;
        if (!c1317100kNY.LIZLLL) {
            c1317100kNY.LIZLLL = true;
            c1317100kNY.LIZIZ(-1, -1, "request_server");
        }
        LJIIIZ(3, LIZLLL(this.LIZ));
        this.LJ = true;
        sendEmptyMessageDelayed(1001, C1317810kOh.LJI);
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            LJI(thM5exceptionOrNullimpl);
        }
    }

    public final void LIZJ() {
        SDUIEventManager sDUIEventManager = this.LIZ.LLJJJ;
        sDUIEventManager.getClass();
        ClientEvent clientEvent = new ClientEvent();
        clientEvent.LIZJ = new AbsSerializedData();
        sDUIEventManager.LIZIZ.add(clientEvent);
        sDUIEventManager.LIZ.removeMessages(10001);
        C786410Ut5.LJLILLLLZI(sDUIEventManager.LIZ, 10002);
        removeMessages(1001);
        if (C1317810kOh.LIZIZ > 0) {
            C1290750jh3.LIZIZ(this.LJIILJJIL);
        }
        if (C1317810kOh.LIZJ > 0) {
            C1290750jh3.LIZIZ(this.LJIILL);
        }
        if (C1317810kOh.LIZLLL > 0) {
            C1290750jh3.LIZIZ(this.LJIILLIIL);
        }
        this.LJIIIZ = true;
        this.LIZIZ.onDestroy();
    }

    public final String LJ() throws JSONException {
        boolean z = C1317810kOh.LIZ;
        if (!C1317810kOh.LJII) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("reqUuid", this.LJFF);
        jSONObject.put("sessionStartTime", System.currentTimeMillis() - this.LIZLLL);
        jSONObject.put("isDestroyed", this.LJIIIZ);
        jSONObject.put("isServerDestroyed", this.LJII);
        jSONObject.put("isMsgReceived", this.LJIIJ);
        jSONObject.put("logId", this.LJI);
        jSONObject.put("isRuntimeReady", this.LJ);
        return C786410Ut5.J3(jSONObject);
    }

    public final String toString() {
        return Intrinsics.LJIIJJI(this.LJFF, "SDUINetworkHandler$");
    }

    @Override // X.InterfaceC1317950kOv
    public final void LIZIZ(C1317860kOm c1317860kOm) throws JSONException {
        byte[] bArr;
        Long l;
        Integer numValueOf = Integer.valueOf(c1317860kOm.LJ);
        Long lValueOf = null;
        if (numValueOf != null) {
            if (numValueOf.intValue() == 3) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1317440kO6 c1317440kO6 = C1317440kO6.LIZLLL;
                ARunnableS17S0200100_20 aRunnableS17S0200100_20 = new ARunnableS17S0200100_20(jCurrentTimeMillis, this, c1317860kOm, 3);
                c1317440kO6.getClass();
                if (Looper.myLooper() == c1317440kO6.LIZIZ.getLooper()) {
                    aRunnableS17S0200100_20.run();
                } else {
                    C786410Ut5.LJJZZIII(c1317440kO6.LIZIZ, aRunnableS17S0200100_20);
                }
                Map<String, String> map = c1317860kOm.LIZLLL;
                if (map != null && Intrinsics.LJFF(this.LJFF, ((LinkedHashMap) map).get("session_id"))) {
                    ACKRequest aCKRequest = new ACKRequest();
                    String str = (String) ((LinkedHashMap) c1317860kOm.LIZLLL).get("seq_id");
                    if (str != null) {
                        lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
                    }
                    aCKRequest.LIZIZ = lValueOf;
                    aCKRequest.LIZ = this.LJFF;
                    LJIIIZ(4, aCKRequest);
                    return;
                }
                return;
            }
            if (numValueOf.intValue() != 5 || (bArr = c1317860kOm.LIZ) == null) {
                return;
            }
            ACKResponse aCKResponseLIZ = C1317750kOb.LIZ(LJII(c1317860kOm.LIZJ, bArr));
            if (!Intrinsics.LJFF(aCKResponseLIZ.LIZ, this.LJFF) || (l = aCKResponseLIZ.LIZIZ) == null) {
                return;
            }
            long jLongValue = l.longValue();
            C1317900kOq c1317900kOq = (C1317900kOq) ((LinkedHashMap) this.LJIIJJI).get(Long.valueOf(jLongValue));
            if (c1317900kOq == null) {
                return;
            }
            C1317130kNb c1317130kNb = this.LIZ.LLIZLLLIL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("session_id", this.LJFF);
            jSONObject.put("seq_id", jLongValue);
            jSONObject.put("origin_size", c1317900kOq.LIZIZ);
            jSONObject.put("gzip_size", c1317900kOq.LIZJ);
            jSONObject.put("from", "client");
            jSONObject.put("ack_dur", System.currentTimeMillis() - c1317900kOq.LIZ);
            c1317130kNb.LIZ("sdui_ack_response", jSONObject);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(this.LJFF);
            sbLIZ.append("] onReceivedACKMsg, seqId: ");
            sbLIZ.append(jLongValue);
            sbLIZ.append(", originSize: ");
            sbLIZ.append(c1317900kOq.LIZIZ);
            sbLIZ.append(", cost: ");
            sbLIZ.append(System.currentTimeMillis() - c1317900kOq.LIZ);
            Integer numValueOf2 = Integer.valueOf(Log.i("SDUINetworkHandler", C2188811AlT.LIZIZ(sbLIZ)));
            if (numValueOf2 == null) {
                return;
            }
            numValueOf2.intValue();
        }
    }

    public final RegisterRequest LIZLLL(AbstractC1317090kNX abstractC1317090kNX) {
        String str;
        DisplayMetrics displayMetrics = abstractC1317090kNX.LLJ;
        RegisterRequest registerRequest = new RegisterRequest();
        registerRequest.LIZJ = "1.0";
        registerRequest.LIZ = 1;
        registerRequest.LJ = displayMetrics.widthPixels;
        registerRequest.LJFF = displayMetrics.heightPixels;
        registerRequest.LJI = displayMetrics.density;
        registerRequest.LIZIZ = "android";
        C1315530kL1 c1315530kL1LJ = C1315530kL1.LJ();
        synchronized (c1315530kL1LJ) {
            str = c1315530kL1LJ.LJII;
        }
        registerRequest.LIZLLL = str;
        C1317780kOe c1317780kOeLIZIZ = C1315530kL1.LJ().LIZIZ();
        c1317780kOeLIZIZ.LIZIZ();
        ArrayList arrayList = new ArrayList();
        CRC32 crc32 = new CRC32();
        for (C1317800kOg c1317800kOg : c1317780kOeLIZIZ.LIZJ.values()) {
            FontCacheItem fontCacheItem = new FontCacheItem();
            fontCacheItem.LIZ = c1317800kOg.LIZJ;
            fontCacheItem.LIZIZ = c1317800kOg.LIZLLL.size();
            arrayList.add(fontCacheItem);
            int size = c1317800kOg.LIZLLL.size();
            char[] cArr = new char[size];
            for (int i = 0; i < size; i++) {
                cArr[i] = (char) c1317800kOg.LIZLLL.keyAt(i);
            }
            Arrays.sort(cArr);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(size * 2);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.asCharBuffer().put(cArr);
            crc32.update(byteBufferAllocate.array());
        }
        FontsToken fontsToken = new FontsToken();
        fontsToken.LIZ = arrayList;
        fontsToken.LIZIZ = (int) crc32.getValue();
        registerRequest.LJII = fontsToken;
        registerRequest.LJIIIIZZ = this.LIZJ;
        registerRequest.LJIIJ = abstractC1317090kNX.LLJJI;
        registerRequest.LJIIJJI = abstractC1317090kNX.LLJJIII;
        registerRequest.LJIIL = abstractC1317090kNX.LLJJIJI;
        registerRequest.LJIILIIL = System.nanoTime();
        registerRequest.LJIIIZ = abstractC1317090kNX.LLJJIJIL;
        registerRequest.LJIILJJIL = this.LJFF;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((ArrayList) this.LJIILIIL).iterator();
        while (it2.hasNext()) {
            List<ClientEvent> list = ((EventRequest) it2.next()).LIZJ;
            if (list != null) {
                arrayList2.addAll(list);
            }
        }
        registerRequest.LJIILL = arrayList2;
        return registerRequest;
    }

    public final void LJI(Throwable th) {
        Intrinsics.LJIIJJI(th, "onRequestError ");
        int i = C1317360kNy.LIZ;
        this.LIZIZ.LIZJ(new C1291190jhl(-4, th.getMessage()));
    }

    public final void LJIIIIZZ(EventRequest eventRequest) {
        Object c098200Yq;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!this.LJ) {
            ((ArrayList) this.LJIILIIL).add(eventRequest);
            return;
        }
        if (C1317810kOh.LIZJ > 0) {
            C1290750jh3.LIZIZ(this.LJIILL);
            C1290750jh3.LIZIZ(this.LJIILLIIL);
            C1290750jh3.LIZJ(C1317810kOh.LIZJ, this.LJIILL);
            C1290750jh3.LIZJ(C1317810kOh.LIZLLL, this.LJIILLIIL);
        }
        eventRequest.LIZ = this.LJFF;
        LJIIIZ(1, eventRequest);
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            LJI(thM5exceptionOrNullimpl);
        }
    }

    public C1317760kOc(AbstractC1317090kNX abstractC1317090kNX, C1317110kNZ c1317110kNZ) {
        this.LIZ = abstractC1317090kNX;
        this.LIZIZ = c1317110kNZ;
        this.LJIIIIZZ = new HeartBeatManager(this.LIZ);
        C1317350kNx.LIZIZ.LIZ.LIZJ(this);
    }

    public static AbstractC1317820kOi LJII(String str, byte[] bArr) {
        if (Intrinsics.LJFF(str, "gzip")) {
            return new C1322710kWb(new GZIPInputStream(new ByteArrayInputStream(bArr)));
        }
        return AbstractC1317820kOi.LIZ(bArr, 0, bArr.length, false);
    }

    public final void LJFF(PollingResponse pollingResponse, long j) {
        int i;
        Intrinsics.LJIIJJI(pollingResponse, "handleResponse: ");
        int i2 = C1317360kNy.LIZ;
        if (pollingResponse.LJFF.length() > 0 && !Intrinsics.LJFF(this.LJFF, pollingResponse.LJFF)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("expected req uuid: ");
            sbLIZ.append(this.LJFF);
            sbLIZ.append(", real: ");
            sbLIZ.append(pollingResponse.LJFF);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        this.LJI = pollingResponse.LJI;
        Frame frame = pollingResponse.LIZIZ;
        if (frame != null) {
            this.LIZIZ.LIZ(this.LIZJ, frame, j, System.currentTimeMillis());
        }
        CommonResponse commonResponse = pollingResponse.LJ;
        if (commonResponse != null && (i = commonResponse.LIZ) != 0) {
            this.LIZIZ.LIZJ(new C1291190jhl(i, Intrinsics.LJIIJJI(LJ(), commonResponse.LIZIZ)));
        }
    }

    public final void LJIIIZ(int i, AbsSerializedData absSerializedData) {
        if (!this.LJII) {
            C1317440kO6 c1317440kO6 = C1317440kO6.LIZLLL;
            ARunnableS26S0201000_20 aRunnableS26S0201000_20 = new ARunnableS26S0201000_20(this, i, absSerializedData, 4);
            c1317440kO6.getClass();
            if (Looper.myLooper() == c1317440kO6.LIZIZ.getLooper()) {
                aRunnableS26S0201000_20.run();
                return;
            } else {
                C786410Ut5.LJJZZIII(c1317440kO6.LIZIZ, aRunnableS26S0201000_20);
                return;
            }
        }
        throw new RuntimeException("Remote Server is Destroy!");
    }
}

package X;

import com.bytedance.common.utility.Logger;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.ttnet.throttle.TTNetThrottle;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0osf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490150osf extends AbstractC1489970osN {
    public final C1489950osL LJ = new C1489950osL();
    public final C1490180osi LJFF = new C1490180osi();
    public final C1490160osg LJI = new C1490160osg();
    public final Set<String> LJII = new CopyOnWriteArraySet();
    public final Set<String> LJIIIIZZ = new CopyOnWriteArraySet();
    public int LJIIIZ = C538540LAe.LLJJJIL;

    @Override // X.AbstractC1489970osN
    public final void LJFF() {
        super.LJFF();
        C1490160osg c1490160osg = this.LJI;
        c1490160osg.getClass();
        Logger.debug();
        int size = ((CopyOnWriteArraySet) c1490160osg.LIZIZ).size();
        String[] strArr = C1490160osg.LJIIIZ;
        if (size > 0 && c1490160osg.LJFF > 0) {
            TTNetThrottle.start((String[]) ((CopyOnWriteArraySet) c1490160osg.LIZIZ).toArray(strArr), 1, c1490160osg.LJFF);
        }
        if (((CopyOnWriteArraySet) c1490160osg.LIZJ).size() > 0 && c1490160osg.LJI > 0) {
            TTNetThrottle.start((String[]) ((CopyOnWriteArraySet) c1490160osg.LIZJ).toArray(strArr), 2, c1490160osg.LJI);
        }
        if (((CopyOnWriteArraySet) c1490160osg.LIZLLL).size() > 0 && c1490160osg.LJII > 0) {
            TTNetThrottle.start((String[]) ((CopyOnWriteArraySet) c1490160osg.LIZLLL).toArray(strArr), 4, c1490160osg.LJII);
        }
        if (((CopyOnWriteArraySet) c1490160osg.LJ).size() <= 0 || c1490160osg.LJIIIIZZ <= 0) {
            return;
        }
        TTNetThrottle.start((String[]) ((CopyOnWriteArraySet) c1490160osg.LJ).toArray(strArr), 8, c1490160osg.LJIIIIZZ);
    }

    @Override // X.AbstractC1489970osN
    public final void LJI() {
        super.LJI();
        this.LJI.LIZ();
        this.LIZ.LIZJ();
    }

    @Override // X.AbstractC1489970osN
    public final EnumC1489930osJ LJII() {
        return EnumC1489930osJ.PRIORITY;
    }

    @Override // X.AbstractC1489970osN, X.InterfaceC1489890osF
    public final Request LIZ(Request request) {
        Request requestLIZ;
        C1490180osi c1490180osi = this.LJFF;
        c1490180osi.getClass();
        C0XMB c0xmbNewBuilder = request.newBuilder();
        if (C1489880osE.LJII(request.getPath(), c1490180osi.LIZ)) {
            c0xmbNewBuilder.LJFF = 3;
            c0xmbNewBuilder.LJI = 4;
            requestLIZ = c0xmbNewBuilder.LIZ();
        } else {
            if (C1489880osE.LJII(request.getPath(), c1490180osi.LIZJ)) {
                c0xmbNewBuilder.LJFF = -1;
                c0xmbNewBuilder.LJI = 1;
                requestLIZ = c0xmbNewBuilder.LIZ();
            } else {
                int priorityLevel = request.getPriorityLevel();
                if (priorityLevel >= 3) {
                    priorityLevel = 1;
                } else if (priorityLevel <= -1) {
                    priorityLevel = 0;
                }
                int requestPriorityLevel = request.getRequestPriorityLevel();
                if (requestPriorityLevel >= 4 || requestPriorityLevel >= 1) {
                    requestPriorityLevel = 2;
                }
                if (C1489880osE.LJII(request.getPath(), c1490180osi.LIZIZ)) {
                    c0xmbNewBuilder.LJFF = priorityLevel;
                    c0xmbNewBuilder.LJI = requestPriorityLevel;
                    requestLIZ = c0xmbNewBuilder.LIZ();
                } else {
                    c0xmbNewBuilder.LJFF = 1;
                    c0xmbNewBuilder.LJI = 3;
                    requestLIZ = c0xmbNewBuilder.LIZ();
                }
            }
        }
        Integer numLJFF = C1489880osE.LJFF(requestLIZ.getPath(), this.LJI.LIZ);
        if (numLJFF != null) {
            C0XMB c0xmbNewBuilder2 = requestLIZ.newBuilder();
            Object extraInfo = requestLIZ.getExtraInfo();
            if (extraInfo == null) {
                extraInfo = new C1493620oyG();
                c0xmbNewBuilder2.LJIIJJI = extraInfo;
            }
            if (extraInfo instanceof C1494160oz8) {
                ((C1494160oz8) extraInfo).LJIILL = numLJFF.longValue();
            }
            c0xmbNewBuilder2.LJIIJJI = extraInfo;
            return c0xmbNewBuilder2.LIZ();
        }
        return requestLIZ;
    }

    @Override // X.InterfaceC1489890osF
    public final void LIZJ(Request request) {
        if (LJIIIIZZ(request)) {
            this.LIZ.LJ(request, false, true, this.LJIIIZ);
        }
    }

    @Override // X.AbstractC1489970osN
    public final boolean LJ(JSONObject jSONObject) {
        super.LJ(jSONObject);
        this.LJ.LIZ(jSONObject);
        this.LIZ.LIZIZ(this.LIZIZ, jSONObject);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("priority");
        if (((CopyOnWriteArraySet) this.LJ.LIZ).size() <= 0 && jSONObjectOptJSONObject == null) {
            return false;
        }
        C1490180osi c1490180osi = this.LJFF;
        c1490180osi.getClass();
        c1490180osi.LIZ = C1489880osE.LJI("high", jSONObjectOptJSONObject);
        c1490180osi.LIZIZ = C1489880osE.LJI("normal", jSONObjectOptJSONObject);
        c1490180osi.LIZJ = C1489880osE.LJI("low", jSONObjectOptJSONObject);
        C1490160osg c1490160osg = this.LJI;
        c1490160osg.LIZ();
        ((ConcurrentHashMap) c1490160osg.LIZ).clear();
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("throttle");
        if (jSONObjectOptJSONObject2 != null) {
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("request_throttle");
            if (jSONObjectOptJSONObject3 != null) {
                Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    ((ConcurrentHashMap) c1490160osg.LIZ).put(next, Integer.valueOf(jSONObjectOptJSONObject3.optInt(next)));
                }
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject2.optJSONObject("connection_throttle");
            if (jSONObjectOptJSONObject4 != null) {
                JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject("normal_up");
                if (jSONObjectOptJSONObject5 != null) {
                    c1490160osg.LIZIZ = C1489880osE.LJI("hosts", jSONObjectOptJSONObject5);
                    c1490160osg.LJFF = jSONObjectOptJSONObject5.optInt("speed", -1);
                }
                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject4.optJSONObject("normal_down");
                if (jSONObjectOptJSONObject6 != null) {
                    c1490160osg.LIZJ = C1489880osE.LJI("hosts", jSONObjectOptJSONObject6);
                    c1490160osg.LJI = jSONObjectOptJSONObject6.optInt("speed", -1);
                }
                JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject4.optJSONObject("ws_up");
                if (jSONObjectOptJSONObject7 != null) {
                    c1490160osg.LIZLLL = C1489880osE.LJI("hosts", jSONObjectOptJSONObject7);
                    c1490160osg.LJII = jSONObjectOptJSONObject7.optInt("speed", -1);
                }
                JSONObject jSONObjectOptJSONObject8 = jSONObjectOptJSONObject4.optJSONObject("ws_down");
                if (jSONObjectOptJSONObject8 != null) {
                    c1490160osg.LJ = C1489880osE.LJI("hosts", jSONObjectOptJSONObject8);
                    c1490160osg.LJIIIIZZ = jSONObjectOptJSONObject8.optInt("speed", -1);
                }
            }
        }
        JSONObject jSONObjectOptJSONObject9 = jSONObject.optJSONObject("delay");
        if (jSONObjectOptJSONObject9 != null) {
            ((CopyOnWriteArraySet) this.LJII).addAll(C1489880osE.LJI("bl_with_priority", jSONObjectOptJSONObject9));
            ((CopyOnWriteArraySet) this.LJIIIIZZ).addAll(C1489880osE.LJI("wl_with_priority", jSONObjectOptJSONObject9));
        }
        return true;
    }

    public final boolean LJIIIIZZ(Request request) {
        this.LJ.LIZIZ(request);
        if (!((CopyOnWriteArraySet) this.LJII).isEmpty()) {
            return C1489880osE.LJII(request.getPath(), this.LJII);
        }
        if (!((CopyOnWriteArraySet) this.LJIIIIZZ).isEmpty()) {
            return !C1489880osE.LJII(request.getPath(), this.LJIIIIZZ);
        }
        return false;
    }

    @Override // X.InterfaceC1489890osF
    public final boolean LIZIZ(Request request, Executor executor, C1494560ozm c1494560ozm) {
        if (LJIIIIZZ(request)) {
            return this.LIZ.LIZLLL(request, false, this.LJIIIZ, c1494560ozm, executor);
        }
        return false;
    }
}

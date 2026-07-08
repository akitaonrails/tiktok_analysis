package X;

import Y.ARunnableS53S0300000_20;
import Y.ARunnableS89S0200000_20;
import com.bytedance.sdui.event.SDUIEventManager;
import com.bytedance.sdui.serializedData.common.Frame;
import com.bytedance.sdui.serializedData.common.operations.HostOperation;
import com.bytedance.sdui.serializedData.common.operations.NodeOperation;
import com.bytedance.sdui.serializedData.common.operations.Properties;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kNZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1317110kNZ implements InterfaceC1317880kOo {
    public final AbstractC1317090kNX LIZ;
    public final InterfaceC1317830kOj LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final ConcurrentHashMap<Integer, Runnable> LJ = new ConcurrentHashMap<>();
    public final CopyOnWriteArrayList<Frame> LJFF = new CopyOnWriteArrayList<>();
    public String LJI = "";

    @Override // X.InterfaceC1317880kOo
    public final void LIZIZ() {
        this.LIZJ = false;
        this.LIZLLL = false;
    }

    static {
        new Object() { // from class: X.0kJm
        };
    }

    @Override // X.InterfaceC1317880kOo
    public final void onDestroy() throws JSONException {
        if (C1317810kOh.LJIIL) {
            if (!this.LIZ.LLJJJJ.LJFF || (!a0.LJJJIL(this.LJI))) {
                SDUIEventManager sDUIEventManager = this.LIZ.LLJJJ;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("extraMsg", this.LJI);
                jSONObject.put("info", Collections.singletonList(this.LJFF));
                sDUIEventManager.LIZIZ("frame_info", jSONObject);
            }
            this.LJFF.clear();
        }
    }

    @Override // X.InterfaceC1317880kOo
    public final void LIZJ(C1291190jhl c1291190jhl) {
        C1290750jh3.LIZLLL(new ARunnableS89S0200000_20(this, c1291190jhl, 87));
    }

    public final void LIZLLL(int i) {
        Runnable runnable = this.LJ.get(Integer.valueOf(i));
        if (runnable != null) {
            runnable.run();
            this.LJ.remove(Integer.valueOf(i));
        }
    }

    public C1317110kNZ(AbstractC1317090kNX abstractC1317090kNX, C1313480kHi c1313480kHi) {
        this.LIZ = abstractC1317090kNX;
        this.LIZIZ = c1313480kHi;
    }

    @Override // X.InterfaceC1317880kOo
    public final void LIZ(String str, Frame frame, long j, long j2) {
        Integer numValueOf;
        C1297860jsW c1297860jsWLIZIZ;
        C1297910jsb c1297910jsbFrom;
        if (C1317810kOh.LJIIL) {
            this.LJFF.add(frame);
        }
        System.currentTimeMillis();
        List<HostOperation> list = frame.LIZIZ;
        if (list == null) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.size());
        }
        Intrinsics.LJIIJJI(numValueOf, "onMessageSuccess, response: ");
        int i = C1317360kNy.LIZ;
        if (!this.LIZLLL) {
            this.LIZLLL = true;
            this.LIZ.LLIZLLLIL.LJFF(str);
            this.LIZ.LLIZLLLIL.LJ();
        }
        this.LIZ.LLIZLLLIL.LIZIZ();
        C013C c013c = new C013C();
        List<HostOperation> list2 = frame.LIZIZ;
        if (list2 != null) {
            Iterator<HostOperation> it2 = list2.iterator();
            while (it2.hasNext()) {
                NodeOperation nodeOperation = it2.next().LIZJ;
                if (nodeOperation != null) {
                    Properties properties = nodeOperation.LIZJ;
                    if (properties != null && properties.LIZ != null) {
                        C1298130jsx c1298130jsx = C1298130jsx.LIZ;
                        JSONObject jSONObject = new JSONObject(nodeOperation.LIZJ.LIZ);
                        c1298130jsx.getClass();
                        c1297860jsWLIZIZ = C1298130jsx.LIZIZ(jSONObject);
                    } else {
                        c1297860jsWLIZIZ = null;
                    }
                    if (c1297860jsWLIZIZ != null && c1297860jsWLIZIZ.containsKey("item-key")) {
                        C1317100kNY c1317100kNY = this.LIZ.LLJJJJ;
                        int iLongValue = (int) nodeOperation.LIZ.longValue();
                        c1297860jsWLIZIZ.getString("item-key");
                        c1317100kNY.LJIIJ = c1317100kNY.LIZ.LLJJ.LJI;
                        C1317180kNg c1317180kNg = new C1317180kNg();
                        c1317100kNY.LJIJJ.put(Integer.valueOf(iLongValue), c1317180kNg);
                        c1317180kNg.LIZ = iLongValue;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        long j3 = c1317100kNY.LIZJ;
                        c1317180kNg.LIZLLL = jCurrentTimeMillis - j3;
                        c1317180kNg.LIZJ = j - j3;
                        c1317180kNg.LJI = j2 - j3;
                        if (!c1317100kNY.LJI) {
                            c1317100kNY.LJI = true;
                            c1317100kNY.LJIILLIIL = iLongValue;
                            c1317100kNY.LIZIZ(-1, -1, "receive_first_item");
                        }
                    }
                    List<String> list3 = nodeOperation.LIZLLL;
                    if (list3 == null) {
                        c1297910jsbFrom = null;
                    } else {
                        c1297910jsbFrom = C1297910jsb.from(list3);
                    }
                    Runnable runnableLJ = this.LIZIZ.LJ((int) nodeOperation.LIZ.longValue(), nodeOperation.LIZIZ, c1297860jsWLIZIZ, c1297910jsbFrom);
                    if (runnableLJ != null) {
                        this.LJ.put(Integer.valueOf((int) nodeOperation.LIZ.longValue()), runnableLJ);
                    }
                }
            }
        }
        C1290750jh3.LIZLLL(new ARunnableS53S0300000_20(frame, this, c013c, 25));
        if (!this.LIZJ && c013c.element) {
            Objects.toString(this.LIZ.LLIZLLLIL);
            this.LIZJ = true;
            this.LIZ.LLIZLLLIL.LIZLLL();
        } else {
            this.LIZ.LLIZLLLIL.LJI();
        }
        List<HostOperation> list4 = frame.LIZIZ;
        if (list4 != null) {
            C1317100kNY c1317100kNY2 = this.LIZ.LLJJJJ;
            list4.size();
            System.currentTimeMillis();
            c1317100kNY2.getClass();
        }
    }
}

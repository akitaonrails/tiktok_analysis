package X;

import android.os.Process;
import com.bytedance.common.jato.JatoXL;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.169n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C207289169n extends C2217421BqW implements Function1<Map<String, ? extends Object>, Unit> {
    public C207289169n(C207284169i c207284169i) {
        super(1, c207284169i, C207284169i.class, "startScrollTask", "startScrollTask(Ljava/util/Map;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Map<String, ? extends Object> map) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        boolean zBooleanValue3;
        boolean zBooleanValue4;
        boolean zBooleanValue5;
        boolean zBooleanValue6;
        boolean zBooleanValue7;
        boolean z;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        Boolean bool7;
        Map<String, ? extends Object> map2 = map;
        C207284169i c207284169i = (C207284169i) this.receiver;
        c207284169i.getClass();
        if (C207292169q.LIZ() > 0) {
            Object obj = map2.get("isOptJit");
            if ((obj instanceof Boolean) && (bool7 = (Boolean) obj) != null) {
                zBooleanValue = bool7.booleanValue();
            } else {
                zBooleanValue = false;
            }
            Object obj2 = map2.get("isOptLog");
            if ((obj2 instanceof Boolean) && (bool6 = (Boolean) obj2) != null) {
                zBooleanValue2 = bool6.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            Object obj3 = map2.get("isOptGC");
            if ((obj3 instanceof Boolean) && (bool5 = (Boolean) obj3) != null) {
                zBooleanValue3 = bool5.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            Object obj4 = map2.get("isOptDoFrame");
            if ((obj4 instanceof Boolean) && (bool4 = (Boolean) obj4) != null) {
                zBooleanValue4 = bool4.booleanValue();
            } else {
                zBooleanValue4 = false;
            }
            Object obj5 = map2.get("isOptMainThread");
            if ((obj5 instanceof Boolean) && (bool3 = (Boolean) obj5) != null) {
                zBooleanValue5 = bool3.booleanValue();
            } else {
                zBooleanValue5 = false;
            }
            Object obj6 = map2.get("isOptCPU");
            if ((obj6 instanceof Boolean) && (bool2 = (Boolean) obj6) != null) {
                zBooleanValue6 = bool2.booleanValue();
            } else {
                zBooleanValue6 = false;
            }
            Object obj7 = map2.get("isOptGPU");
            if ((obj7 instanceof Boolean) && (bool = (Boolean) obj7) != null) {
                zBooleanValue7 = bool.booleanValue();
            } else {
                zBooleanValue7 = false;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if ((((Boolean) C207292169q.LIZ.getValue()).booleanValue() || zBooleanValue) && jCurrentTimeMillis - c207284169i.LIZ.LIZ() > 1000) {
                c207284169i.LIZ.LIZIZ(jCurrentTimeMillis);
                int i = C2187451AjH.LIZ;
            }
            if ((((Boolean) C207292169q.LIZIZ.getValue()).booleanValue() || zBooleanValue2) && jCurrentTimeMillis - c207284169i.LIZIZ.LIZ() > 3000) {
                c207284169i.LIZIZ.LIZIZ(jCurrentTimeMillis);
                C2187451AjH.LJII(3000L, true);
            }
            if ((((Boolean) C207292169q.LIZJ.getValue()).booleanValue() || zBooleanValue3) && jCurrentTimeMillis - c207284169i.LIZJ.LIZ() > 3000) {
                c207284169i.LIZJ.LIZIZ(jCurrentTimeMillis);
                C2187451AjH.LJFF(3000L);
            }
            if ((((Boolean) C207292169q.LIZLLL.getValue()).booleanValue() || zBooleanValue4) && c207284169i.LIZLLL.LIZ() == 0) {
                c207284169i.LIZLLL.LIZIZ(jCurrentTimeMillis);
                C0N5P.LIZ.LIZLLL("dm_resource_common_list", new C0N5R(16L, 30L));
            }
            if ((((Boolean) C207292169q.LJ.getValue()).booleanValue() || zBooleanValue5) && c207284169i.LJ.LIZ() == 0) {
                c207284169i.LJ.LIZIZ(jCurrentTimeMillis);
                JatoXL.setPriority(Process.myTid(), -20);
                JatoXL.boostRenderThread(C1BWL.LIZ(), -20);
            }
            if (((Boolean) C207292169q.LJFF.getValue()).booleanValue() && !c207284169i.LJII.get()) {
                z = true;
            } else {
                z = false;
            }
            if ((z || zBooleanValue6) && jCurrentTimeMillis - c207284169i.LJFF.LIZ() > 2000) {
                c207284169i.LJFF.LIZIZ(jCurrentTimeMillis);
                JatoXL.tryCpuBoost(2000L);
            }
            if (((((Boolean) C207292169q.LJI.getValue()).booleanValue() && !c207284169i.LJII.get()) || zBooleanValue7) && jCurrentTimeMillis - c207284169i.LJI.LIZ() > 2000) {
                c207284169i.LJI.LIZIZ(jCurrentTimeMillis);
                JatoXL.tryGpuBoost(2000L);
            }
        }
        return Unit.LIZ;
    }
}

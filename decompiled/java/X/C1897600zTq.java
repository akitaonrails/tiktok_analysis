package X;

import com.bytedance.touchpoint.api.interfaces.INetworkApi;
import com.bytedance.touchpoint.api.model.TaskDoneReponse;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.api.model.TouchPointsResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AwS572S0100000_28;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0zTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1897600zTq {
    public static final C01GW<C1897600zTq> LJII = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, new C1897680zTy());
    public List<TouchPoint> LIZ;
    public List<TaskEvent> LIZIZ;
    public InterfaceC420801kM LIZJ;
    public TaskDoneReponse LIZLLL;
    public int LJ;
    public Integer LJFF = 1;
    public C1900160zXy LJI = new C1900160zXy(2, Mp4ScreenVideoLoadTimeout.CONTROL);

    public final void LIZ(final Integer num, final List<Integer> list, final List<String> list2, InterfaceC1897660zTw interfaceC1897660zTw) {
        int iIntValue = 1;
        this.LJ++;
        this.LJFF = num;
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        }
        int i = this.LJ;
        c1894320zOY.getClass();
        C01U6.LIZJ(new C1619740sFg(iIntValue, i));
        InterfaceC420801kM interfaceC420801kM = this.LIZJ;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        this.LJI = new C1900160zXy(((Number) C274760Apm.LIZ.getValue()).intValue(), Mp4ScreenVideoLoadTimeout.CONTROL);
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0zRK
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<Integer> c09aj) {
                String strLJJLIIIJ;
                String strLIZJ;
                INetworkApi iNetworkApiLIZJ;
                TouchPointsResponse touchPointsResponse;
                C1896070zRN c1896070zRNLIZIZ;
                INetworkApi iNetworkApiLIZJ2;
                String str;
                C1C7U.LIZ("TouchPointsAPI@1ef4.requestTouchPointsAPIByIds$1");
                String str2 = null;
                try {
                    List<Integer> list3 = list;
                    if (list3 != null && (!list3.isEmpty())) {
                        strLJJLIIIJ = C13LP.LJJLIIIJ(list3, ",", e3.e, e3.f, 0, null, null, 56);
                    } else {
                        strLJJLIIIJ = null;
                    }
                    List<String> list4 = list2;
                    if (list4 != null && (!list4.isEmpty())) {
                        strLIZJ = C20484080s.LIZJ(list4);
                    } else {
                        strLIZJ = null;
                    }
                } catch (InterruptedException e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (ExecutionException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                if (((Boolean) C0BIS.LIZ.getValue()).booleanValue()) {
                    C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                    C1896050zRL c1896050zRL = (C1896050zRL) c1619720sFe.LIZ(1005);
                    if (c1896050zRL != null) {
                        c1896070zRNLIZIZ = c1896050zRL.LIZIZ(num);
                    } else {
                        c1896070zRNLIZIZ = null;
                    }
                    InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
                    if (interfaceC1897260zTILIZIZ != null && (iNetworkApiLIZJ2 = interfaceC1897260zTILIZIZ.LIZJ()) != null) {
                        if (c1896070zRNLIZIZ == null) {
                            str = null;
                        } else {
                            str2 = c1896070zRNLIZIZ.LIZIZ;
                            str = c1896070zRNLIZIZ.LIZ;
                        }
                        ListenableFuture<TouchPointsResponse> touchPointWithTriggerCondition = iNetworkApiLIZJ2.getTouchPointWithTriggerCondition(num, C0BT0.LIZ(), str2, str, strLJJLIIIJ, strLIZJ, (String) C01U6.LJFF(new C20542082y()));
                        if (touchPointWithTriggerCondition != null) {
                            touchPointsResponse = touchPointWithTriggerCondition.get();
                            if (touchPointsResponse == null && touchPointsResponse.statusCode == 0) {
                                this.LIZ = touchPointsResponse.touchPoints;
                                C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
                                C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
                                List<TouchPoint> list5 = touchPointsResponse.touchPoints;
                                Iterator<Integer> it2 = c1894700zPALIZ.LJIIJJI.iterator();
                                while (it2.hasNext()) {
                                    int iIntValue2 = it2.next().intValue();
                                    if (c1894700zPALIZ.LIZJ.containsKey(Integer.valueOf(iIntValue2))) {
                                        c1894700zPALIZ.LIZJ.remove(Integer.valueOf(iIntValue2));
                                    }
                                    if (c1894700zPALIZ.LJIIIIZZ.containsKey(Integer.valueOf(iIntValue2))) {
                                        c1894700zPALIZ.LJIIIIZZ.remove(Integer.valueOf(iIntValue2));
                                    }
                                    if (c1894700zPALIZ.LJIIIZ.containsKey(Integer.valueOf(iIntValue2))) {
                                        c1894700zPALIZ.LJIIIZ.remove(Integer.valueOf(iIntValue2));
                                    }
                                    if (iIntValue2 != 6) {
                                        if (iIntValue2 == 7) {
                                            ((ArrayList) c1894700zPALIZ.LJ).clear();
                                        }
                                    } else {
                                        ((ArrayList) c1894700zPALIZ.LJFF).clear();
                                    }
                                }
                                c1894700zPALIZ.LJIIJJI.clear();
                                HashMap<Integer, TouchPoint> map = new HashMap<>();
                                if (list5 != null) {
                                    for (TouchPoint touchPoint : list5) {
                                        map.put(Integer.valueOf(touchPoint.touchPointId), touchPoint);
                                        c1894700zPALIZ.LJIIJJI.add(Integer.valueOf(touchPoint.touchPointId));
                                        C1894320zOY.LIZ.getClass();
                                        C1894320zOY.LJIJI(touchPoint);
                                    }
                                    Iterator<InterfaceC1894420zOi> it3 = c1894700zPALIZ.LJIILIIL.iterator();
                                    while (it3.hasNext()) {
                                        it3.next().LIZ(map, list5, false);
                                    }
                                }
                                for (Map.Entry<Integer, TouchPoint> entry : map.entrySet()) {
                                    if (entry.getValue() != null) {
                                        c1894700zPALIZ.LIZJ.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                c09aj.onNext(1);
                            }
                        }
                    }
                    C01U6.LIZIZ(new AwS572S0100000_28((C19482611Ke) c09aj, 863));
                } else {
                    InterfaceC1897260zTI interfaceC1897260zTILIZIZ2 = C1619720sFe.LIZ.LIZIZ();
                    if (interfaceC1897260zTILIZIZ2 != null && (iNetworkApiLIZJ = interfaceC1897260zTILIZIZ2.LIZJ()) != null) {
                        ListenableFuture<TouchPointsResponse> touchPointWithNewPath = iNetworkApiLIZJ.getTouchPointWithNewPath(num, C0BT0.LIZ(), strLJJLIIIJ, strLIZJ, (String) C01U6.LJFF(new C20542082y()));
                        if (touchPointWithNewPath != null) {
                            touchPointsResponse = touchPointWithNewPath.get();
                            if (touchPointsResponse == null) {
                            }
                        }
                    }
                    C01U6.LIZIZ(new AwS572S0100000_28((C19482611Ke) c09aj, 863));
                }
                C1C7U.LIZIZ("TouchPointsAPI@1ef4.requestTouchPointsAPIByIds$1");
            }
        }).LJJLIIIJLJLI(new C1900160zXy(2, 3000L)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336410ks(this, interfaceC1897660zTw, 4));
    }
}

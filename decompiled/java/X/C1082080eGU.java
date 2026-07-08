package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveWidgetSlardarReportFixSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.SubWidgetManagerListener;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0eGU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082080eGU {
    public static final Map<Integer, C1082110eGX> LIZ = new LinkedHashMap();
    public static final Map<C0ULM, Long> LIZIZ = new LinkedHashMap();
    public static final Map<C0ULM, Long> LIZJ = new LinkedHashMap();
    public static final Map<C0ULM, Integer> LIZLLL = new LinkedHashMap();

    public static void LIZIZ(RecyclableWidgetManager recyclableWidgetManager) {
        if (recyclableWidgetManager != null) {
            LIZLLL.remove(recyclableWidgetManager);
            LIZIZ.remove(recyclableWidgetManager);
            LIZJ.remove(recyclableWidgetManager);
        }
    }

    public static long LIZJ(C0ULM c0ulm) {
        Long l = (Long) ((LinkedHashMap) LIZIZ).get(c0ulm);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public static long LIZLLL(RecyclableWidgetManager recyclableWidgetManager) {
        long jLIZJ;
        long jUptimeMillis;
        if (LJ(recyclableWidgetManager) == 0) {
            jLIZJ = LIZJ(recyclableWidgetManager);
            if (jLIZJ <= 0) {
                return 0L;
            }
            jUptimeMillis = System.currentTimeMillis();
        } else {
            jLIZJ = LIZJ(recyclableWidgetManager);
            if (jLIZJ <= 0) {
                return 0L;
            }
            jUptimeMillis = SystemClock.uptimeMillis();
        }
        return jUptimeMillis - jLIZJ;
    }

    public static int LJ(C0ULM c0ulm) {
        Integer num = (Integer) ((LinkedHashMap) LIZLLL).get(c0ulm);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public static void LJFF(int i) {
        boolean z;
        C1082110eGX c1082110eGX = (C1082110eGX) ((LinkedHashMap) LIZ).get(Integer.valueOf(i));
        if (c1082110eGX != null) {
            boolean enable = LiveWidgetSlardarReportFixSetting.INSTANCE.getEnable();
            for (Map.Entry entry : ((HashMap) c1082110eGX.LIZ).entrySet()) {
                if (enable) {
                    ((C1082100eGW) entry.getValue()).LIZ();
                }
                c1082110eGX.LIZJ.LIZ(entry.getValue());
            }
            ((HashMap) c1082110eGX.LIZ).clear();
            for (Map.Entry entry2 : ((HashMap) c1082110eGX.LIZIZ).entrySet()) {
                if (enable) {
                    ((C1082100eGW) entry2.getValue()).LIZ();
                }
                c1082110eGX.LIZJ.LIZ(entry2.getValue());
            }
            ((HashMap) c1082110eGX.LIZIZ).clear();
            for (Map.Entry entry3 : ((HashMap) c1082110eGX.LIZLLL).entrySet()) {
                C1082120eGY c1082120eGY = (C1082120eGY) entry3.getValue();
                if (c1082120eGY.LJIILL <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                c1082110eGX.LIZLLL(i, (String) entry3.getKey(), c1082120eGY, z);
                if (enable) {
                    c1082120eGY.LIZ();
                }
                c1082110eGX.LJ.LIZ(c1082120eGY);
            }
            ((HashMap) c1082110eGX.LIZLLL).clear();
        }
        LIZ.remove(Integer.valueOf(i));
        ((LinkedHashMap) LIZIZ).clear();
        ((LinkedHashMap) LIZJ).clear();
    }

    public static void LIZ(final int i, RecyclableWidgetManager recyclableWidgetManager) {
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.addSubWidgetManagerListener(new SubWidgetManagerListener() { // from class: X.0e9d
                @Override // com.bytedance.ies.sdk.widgets.SubWidgetManagerListener
                public final void onDestroySubWidgetManager(RecyclableWidgetManager recyclableWidgetManager2, RecyclableWidgetManager recyclableWidgetManager3, LiveWidget liveWidget) {
                    C1082080eGU.LIZIZ(recyclableWidgetManager3);
                }

                @Override // com.bytedance.ies.sdk.widgets.SubWidgetManagerListener
                public final void onSubWidgetManagerCreated(RecyclableWidgetManager recyclableWidgetManager2, RecyclableWidgetManager recyclableWidgetManager3, LiveWidget liveWidget) {
                    C1082080eGU.LJI(i, recyclableWidgetManager3);
                }
            });
        }
    }

    public static void LJI(int i, RecyclableWidgetManager recyclableWidgetManager) {
        long jCurrentTimeMillis;
        if (recyclableWidgetManager != null) {
            LIZLLL.put(recyclableWidgetManager, Integer.valueOf(i));
            if (i == 0) {
                Map<C0ULM, Long> map = LIZIZ;
                EnterRoomConfig.TimeStamp timeStamp = C0IL2.LIZ.LIZ().mEnterRoomConfig.mRoomsData.timeStamps;
                if (timeStamp != null) {
                    jCurrentTimeMillis = timeStamp.enterRoomStarTime;
                } else {
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
                map.put(recyclableWidgetManager, Long.valueOf(jCurrentTimeMillis));
            } else {
                LIZIZ.put(recyclableWidgetManager, Long.valueOf(SystemClock.uptimeMillis()));
            }
            LIZJ.put(recyclableWidgetManager, Long.valueOf(SystemClock.uptimeMillis()));
            if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                recyclableWidgetManager.addRecyclableWidgetEventListener(new RecyclableWidgetEventListener() { // from class: X.0eGV
                    public final Map<Widget, C1082100eGW> LIZ = new LinkedHashMap();
                    public final C1085650eMF<C1082100eGW> LIZIZ = new C1085650eMF<>(10);

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
                    public final void onPostCreateView(C0ULM c0ulm, Widget widget) {
                        C1082100eGW c1082100eGW = (C1082100eGW) ((LinkedHashMap) this.LIZ).get(widget);
                        if (c1082100eGW != null) {
                            c1082100eGW.LJ = SystemClock.uptimeMillis();
                        }
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
                    public final void onPostInit(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                        C1078300eAO.LJ(this, c0ulm, liveRecyclableWidget);
                        C1082100eGW c1082100eGW = (C1082100eGW) ((LinkedHashMap) this.LIZ).get(liveRecyclableWidget);
                        if (c1082100eGW != null) {
                            c1082100eGW.LJI = SystemClock.uptimeMillis();
                        }
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
                    public final void onPostLoad(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                        C1078300eAO.LJFF(this, c0ulm, liveRecyclableWidget);
                        C1082100eGW c1082100eGW = (C1082100eGW) ((LinkedHashMap) this.LIZ).get(liveRecyclableWidget);
                        if (c1082100eGW != null) {
                            c1082100eGW.LJIIIIZZ = SystemClock.uptimeMillis();
                        }
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
                    public final void onPostUnload(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                        C1078300eAO.LJI(this, c0ulm, liveRecyclableWidget);
                        C1082100eGW c1082100eGW = (C1082100eGW) ((LinkedHashMap) this.LIZ).get(liveRecyclableWidget);
                        if (c1082100eGW == null) {
                            return;
                        }
                        this.LIZ.remove(liveRecyclableWidget);
                        c1082100eGW.LJIIJ = SystemClock.uptimeMillis();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(C497740JfY.LJII().getResources().getResourceEntryName(liveRecyclableWidget.getId()));
                        sbLIZ.append(" createDuration ");
                        sbLIZ.append(c1082100eGW.LJ - c1082100eGW.LIZLLL);
                        sbLIZ.append(" initDuration ");
                        sbLIZ.append(c1082100eGW.LJI - c1082100eGW.LJFF);
                        sbLIZ.append(" loadDuration ");
                        sbLIZ.append(c1082100eGW.LJIIIIZZ - c1082100eGW.LJII);
                        sbLIZ.append(" unloadDuration ");
                        sbLIZ.append(c1082100eGW.LJIIJ - c1082100eGW.LJIIIZ);
                        C20441214yg.LJ("SlardarRecyclableWidgetEventListener", C2188811AlT.LIZIZ(sbLIZ));
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
                    public final void onPreCreateView(C0ULM c0ulm, Widget widget) {
                        String simpleName = widget.getClass().getSimpleName();
                        Map<Widget, C1082100eGW> map2 = this.LIZ;
                        C1082100eGW c1082100eGWLIZIZ = this.LIZIZ.LIZIZ();
                        if (c1082100eGWLIZIZ != null) {
                            c1082100eGWLIZIZ.LIZ();
                        } else {
                            c1082100eGWLIZIZ = new C1082100eGW();
                        }
                        c1082100eGWLIZIZ.LIZ = simpleName;
                        c1082100eGWLIZIZ.LIZLLL = SystemClock.uptimeMillis();
                        map2.put(widget, c1082100eGWLIZIZ);
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
                    public final void onPreInit(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                        C1078300eAO.LJIIJ(this, c0ulm, liveRecyclableWidget);
                        C1082100eGW c1082100eGW = (C1082100eGW) ((LinkedHashMap) this.LIZ).get(liveRecyclableWidget);
                        if (c1082100eGW != null) {
                            c1082100eGW.LJFF = SystemClock.uptimeMillis();
                        }
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
                    public final void onPreLoad(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                        C1078300eAO.LJIIJJI(this, c0ulm, liveRecyclableWidget);
                        C1082100eGW c1082100eGW = (C1082100eGW) ((LinkedHashMap) this.LIZ).get(liveRecyclableWidget);
                        if (c1082100eGW != null) {
                            c1082100eGW.LJII = SystemClock.uptimeMillis();
                        }
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
                    public final void onPreUnload(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
                        C1078300eAO.LJIIL(this, c0ulm, liveRecyclableWidget);
                        C1082100eGW c1082100eGW = (C1082100eGW) ((LinkedHashMap) this.LIZ).get(liveRecyclableWidget);
                        if (c1082100eGW != null) {
                            c1082100eGW.LJIIIZ = SystemClock.uptimeMillis();
                        }
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
                    public final /* bridge */ /* synthetic */ void onHide(C0ULM c0ulm, Widget widget) {
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
                    public final /* bridge */ /* synthetic */ void onPostCreate(C0ULM c0ulm, Widget widget) {
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
                    public final /* bridge */ /* synthetic */ void onPostDestroy(C0ULM c0ulm, Widget widget) {
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
                    public final /* bridge */ /* synthetic */ void onPreCreate(C0ULM c0ulm, Widget widget) {
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
                    public final /* bridge */ /* synthetic */ void onPreDestroy(C0ULM c0ulm, Widget widget) {
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
                    public final /* bridge */ /* synthetic */ void onShow(C0ULM c0ulm, Widget widget) {
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
                    public final /* bridge */ /* synthetic */ void onWidgetPreRequestLoading(C0ULM c0ulm, Widget widget, boolean z) {
                    }

                    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
                    public final /* bridge */ /* synthetic */ void onWidgetRequestLoading(C0ULM c0ulm, Widget widget, boolean z) {
                    }
                });
            }
            Map<Integer, C1082110eGX> map2 = LIZ;
            C1082110eGX c1082110eGX = (C1082110eGX) ((LinkedHashMap) map2).get(Integer.valueOf(i));
            if (c1082110eGX == null) {
                c1082110eGX = new C1082110eGX();
                map2.put(Integer.valueOf(i), c1082110eGX);
            }
            recyclableWidgetManager.addRecyclableWidgetEventListener(c1082110eGX);
        }
    }
}

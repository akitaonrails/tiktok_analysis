package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveWidgetSlardarReportFixSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveWidgetSlardarThresholdSetting;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eGX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082110eGX extends C1082140eGa implements RecyclableWidgetEventListener {
    public final Map<Widget, C1082100eGW> LIZ = new HashMap();
    public final Map<String, C1082100eGW> LIZIZ = new HashMap();
    public final C1085650eMF LIZJ = new C1085650eMF(10);
    public final Map<String, C1082120eGY> LIZLLL = new HashMap();
    public final C1085650eMF LJ = new C1085650eMF(10);
    public final Random LJFF = new Random();
    public final ThreadLocal<JSONObject> LJI;
    public final int LJII;

    public C1082110eGX() {
        new JSONObject();
        this.LJI = new ThreadLocal<>();
        this.LJII = LiveWidgetSlardarThresholdSetting.INSTANCE.getValue();
    }

    public final C1082100eGW LIZIZ(Widget widget) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(widget.getClass().getName());
        sbLIZ.append("_");
        sbLIZ.append(widget.hashCode());
        return (C1082100eGW) ((HashMap) this.LIZIZ).get(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZJ(Widget widget) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(widget.getClass().getName());
        sbLIZ.append("_");
        sbLIZ.append(widget.hashCode());
        ((HashMap) this.LIZIZ).remove(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZ(C1082100eGW c1082100eGW, C1082120eGY c1082120eGY) {
        if (c1082100eGW.LIZJ != 0) {
            c1082120eGY.LJIILIIL += Math.max(0L, SystemClock.uptimeMillis() - c1082100eGW.LIZJ);
            c1082100eGW.LIZJ = 0L;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
    public final void onHide(C0ULM c0ulm, Widget widget) {
        C1082100eGW c1082100eGWLIZIZ = LIZIZ(widget);
        if (c1082100eGWLIZIZ != null) {
            C1082120eGY c1082120eGY = (C1082120eGY) ((HashMap) this.LIZLLL).get(c1082100eGWLIZIZ.LIZ);
            if (c1082120eGY != null) {
                LIZ(c1082100eGWLIZIZ, c1082120eGY);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
    public final void onPostCreate(C0ULM c0ulm, Widget widget) {
        C1082100eGW c1082100eGWLIZIZ = LIZIZ(widget);
        if (c1082100eGWLIZIZ != null) {
            c1082100eGWLIZIZ.LJIIL = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
    public final void onPostCreateView(C0ULM c0ulm, Widget widget) {
        C1082100eGW c1082100eGWLIZIZ = LIZIZ(widget);
        if (c1082100eGWLIZIZ != null) {
            c1082100eGWLIZIZ.LJ = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
    public final void onPostDestroy(C0ULM c0ulm, Widget widget) {
        C1082100eGW c1082100eGWLIZIZ = LIZIZ(widget);
        if (c1082100eGWLIZIZ != null) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            c1082100eGWLIZIZ.LJIILJJIL = jUptimeMillis;
            if (c1082100eGWLIZIZ.LJ - c1082100eGWLIZIZ.LIZLLL >= 0 && c1082100eGWLIZIZ.LJIIL - c1082100eGWLIZIZ.LJIIJJI >= 0 && jUptimeMillis - c1082100eGWLIZIZ.LJIILIIL >= 0 && c1082100eGWLIZIZ.LJIIIIZZ - c1082100eGWLIZIZ.LJII <= 0) {
                C1082120eGY c1082120eGY = (C1082120eGY) ((HashMap) this.LIZLLL).get(c1082100eGWLIZIZ.LIZ);
                if (c1082120eGY != null) {
                    LIZ(c1082100eGWLIZIZ, c1082120eGY);
                    long j = c1082120eGY.LJIIIIZZ;
                    long j2 = c1082100eGWLIZIZ.LJ;
                    c1082120eGY.LJIIIIZZ = j + (j2 - c1082100eGWLIZIZ.LIZLLL);
                    c1082120eGY.LJIILLIIL += c1082100eGWLIZIZ.LJIIL - c1082100eGWLIZIZ.LJIIJJI;
                    c1082120eGY.LJIIZILJ += c1082100eGWLIZIZ.LJIILJJIL - c1082100eGWLIZIZ.LJIILIIL;
                    if (j2 > 0) {
                        c1082120eGY.LJFF++;
                        View view = widget.getView();
                        if (view != null && (view.getTag(R.id.n9a) instanceof Long)) {
                            c1082120eGY.LJIILJJIL += ((Long) view.getTag(R.id.n9a)).longValue();
                        }
                    }
                    if (c1082100eGWLIZIZ.LIZLLL > 0 && c1082100eGWLIZIZ.LJIIJJI > 0 && c1082100eGWLIZIZ.LJIILIIL > 0) {
                        c1082120eGY.LJIILL++;
                    }
                    c1082120eGY.LJIIL += c1082100eGWLIZIZ.LJIILJJIL - c1082100eGWLIZIZ.LIZIZ;
                    if (c1082120eGY.LJIILL == c1082120eGY.LIZ) {
                        LIZLLL(C1082080eGU.LJ(c0ulm), c1082100eGWLIZIZ.LIZ, c1082120eGY, false);
                        ((HashMap) this.LIZLLL).remove(c1082100eGWLIZIZ.LIZ);
                        if (LiveWidgetSlardarReportFixSetting.INSTANCE.getEnable()) {
                            c1082120eGY.LIZ();
                        }
                        this.LJ.LIZ(c1082120eGY);
                    }
                }
                LIZJ(widget);
                if (LiveWidgetSlardarReportFixSetting.INSTANCE.getEnable()) {
                    c1082100eGWLIZIZ.LIZ();
                }
                this.LIZJ.LIZ(c1082100eGWLIZIZ);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPostInit(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
        C1082100eGW c1082100eGWLIZIZ = LIZIZ(liveRecyclableWidget);
        if (c1082100eGWLIZIZ != null) {
            c1082100eGWLIZIZ.LJI = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPostLoad(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
        C1082100eGW c1082100eGWLIZIZ = LIZIZ(liveRecyclableWidget);
        if (c1082100eGWLIZIZ != null) {
            c1082100eGWLIZIZ.LJIIIIZZ = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPostUnload(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
        C1082100eGW c1082100eGWLIZIZ = LIZIZ(liveRecyclableWidget);
        if (c1082100eGWLIZIZ != null) {
            c1082100eGWLIZIZ.LJIIJ = SystemClock.uptimeMillis();
            C1082120eGY c1082120eGY = (C1082120eGY) ((HashMap) this.LIZLLL).get(c1082100eGWLIZIZ.LIZ);
            if (c1082120eGY != null) {
                LIZ(c1082100eGWLIZIZ, c1082120eGY);
                long j = c1082120eGY.LJIIIIZZ;
                long j2 = c1082100eGWLIZIZ.LJ;
                c1082120eGY.LJIIIIZZ = j + (j2 - c1082100eGWLIZIZ.LIZLLL);
                if (j2 > 0) {
                    c1082120eGY.LJFF++;
                    View view = liveRecyclableWidget.getView();
                    if (view != null && (view.getTag(R.id.n9a) instanceof Long)) {
                        c1082120eGY.LJIILJJIL += ((Long) view.getTag(R.id.n9a)).longValue();
                    }
                }
                long j3 = c1082120eGY.LJIIIZ;
                long j4 = c1082100eGWLIZIZ.LJI;
                long j5 = c1082100eGWLIZIZ.LJFF;
                c1082120eGY.LJIIIZ = j3 + (j4 - j5);
                if (j5 > 0) {
                    c1082120eGY.LJI++;
                }
                long j6 = c1082120eGY.LJIIJ;
                long j7 = c1082100eGWLIZIZ.LJIIIIZZ;
                long j8 = c1082100eGWLIZIZ.LJII;
                c1082120eGY.LJIIJ = j6 + (j7 - j8);
                long j9 = c1082120eGY.LJIIJJI;
                long j10 = c1082100eGWLIZIZ.LJIIJ;
                long j11 = c1082100eGWLIZIZ.LJIIIZ;
                c1082120eGY.LJIIJJI = j9 + (j10 - j11);
                if (j8 > 0 && j11 > 0) {
                    c1082120eGY.LJII++;
                }
                c1082120eGY.LJIIL += j10 - c1082100eGWLIZIZ.LIZIZ;
                if (c1082120eGY.LJII == c1082120eGY.LIZ) {
                    LIZLLL(C1082080eGU.LJ(c0ulm), c1082100eGWLIZIZ.LIZ, c1082120eGY, true);
                    ((HashMap) this.LIZLLL).remove(c1082100eGWLIZIZ.LIZ);
                    if (LiveWidgetSlardarReportFixSetting.INSTANCE.getEnable()) {
                        c1082120eGY.LIZ();
                    }
                    this.LJ.LIZ(c1082120eGY);
                }
            }
            LIZJ(liveRecyclableWidget);
            if (LiveWidgetSlardarReportFixSetting.INSTANCE.getEnable()) {
                c1082100eGWLIZIZ.LIZ();
            }
            this.LIZJ.LIZ(c1082100eGWLIZIZ);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
    public final void onPreCreate(C0ULM c0ulm, Widget widget) {
        C1082100eGW c1082100eGWLIZIZ = LIZIZ(widget);
        if (c1082100eGWLIZIZ != null) {
            c1082100eGWLIZIZ.LJIIJJI = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
    public final void onPreCreateView(C0ULM c0ulm, Widget widget) {
        C1082100eGW c1082100eGWLIZIZ = LIZIZ(widget);
        if (c1082100eGWLIZIZ != null) {
            c1082100eGWLIZIZ.LIZLLL = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
    public final void onPreDestroy(C0ULM c0ulm, Widget widget) {
        C1082100eGW c1082100eGWLIZIZ = LIZIZ(widget);
        if (c1082100eGWLIZIZ != null) {
            c1082100eGWLIZIZ.LJIILIIL = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPreInit(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
        C1082100eGW c1082100eGWLIZIZ = LIZIZ(liveRecyclableWidget);
        if (c1082100eGWLIZIZ != null) {
            c1082100eGWLIZIZ.LJFF = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPreLoad(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
        C1082100eGW c1082100eGWLIZIZ = LIZIZ(liveRecyclableWidget);
        if (c1082100eGWLIZIZ != null) {
            c1082100eGWLIZIZ.LJII = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
    public final void onPreUnload(C0ULM c0ulm, LiveRecyclableWidget liveRecyclableWidget) {
        C1082100eGW c1082100eGWLIZIZ = LIZIZ(liveRecyclableWidget);
        if (c1082100eGWLIZIZ != null) {
            c1082100eGWLIZIZ.LJIIIZ = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
    public final void onShow(C0ULM c0ulm, Widget widget) {
        C1082100eGW c1082100eGWLIZIZ = LIZIZ(widget);
        if (c1082100eGWLIZIZ != null && c1082100eGWLIZIZ.LIZJ == 0) {
            c1082100eGWLIZIZ.LIZJ = SystemClock.uptimeMillis();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
    public final void onWidgetRequestLoading(C0ULM c0ulm, Widget widget, boolean z) {
        long jLIZJ;
        long jUptimeMillis;
        long j;
        String simpleName = widget.getClass().getSimpleName();
        if (!TextUtils.isEmpty(simpleName)) {
            C1082100eGW c1082100eGW = (C1082100eGW) this.LIZJ.LIZIZ();
            if (c1082100eGW != null) {
                c1082100eGW.LIZ();
            } else {
                c1082100eGW = new C1082100eGW();
            }
            c1082100eGW.LIZ = simpleName;
            c1082100eGW.LIZIZ = SystemClock.uptimeMillis();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(widget.getClass().getName());
            sbLIZ.append("_");
            sbLIZ.append(widget.hashCode());
            ((HashMap) this.LIZIZ).put(C2188811AlT.LIZIZ(sbLIZ), c1082100eGW);
            C1082120eGY c1082120eGY = (C1082120eGY) ((HashMap) this.LIZLLL).get(simpleName);
            if (c1082120eGY == null) {
                c1082120eGY = (C1082120eGY) this.LJ.LIZIZ();
                if (c1082120eGY != null) {
                    c1082120eGY.LIZ();
                } else {
                    c1082120eGY = new C1082120eGY();
                }
                c1082120eGY.LIZ = this.LJFF.nextInt(this.LJII) + 1;
                ((HashMap) this.LIZLLL).put(simpleName, c1082120eGY);
            }
            c1082120eGY.LIZIZ++;
            if (C1082080eGU.LJ(c0ulm) == 0) {
                jLIZJ = C1082080eGU.LIZJ(c0ulm);
                if (jLIZJ > 0) {
                    jUptimeMillis = System.currentTimeMillis();
                    j = jUptimeMillis - jLIZJ;
                }
                j = 0;
            } else {
                jLIZJ = C1082080eGU.LIZJ(c0ulm);
                if (jLIZJ > 0) {
                    jUptimeMillis = SystemClock.uptimeMillis();
                    j = jUptimeMillis - jLIZJ;
                }
                j = 0;
            }
            c1082120eGY.LIZLLL += j;
            Long l = (Long) ((LinkedHashMap) C1082080eGU.LIZJ).get(c0ulm);
            if (l != null) {
                long jLongValue = l.longValue();
                if (jLongValue > 0) {
                    c1082120eGY.LJ += SystemClock.uptimeMillis() - jLongValue;
                }
            }
            if (z) {
                c1082120eGY.LIZJ++;
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC2262151DgT
    public final /* bridge */ /* synthetic */ void onWidgetPreRequestLoading(C0ULM c0ulm, Widget widget, boolean z) {
    }

    public final void LIZLLL(final int i, final String str, C1082120eGY c1082120eGY, final boolean z) {
        final int i2 = c1082120eGY.LJIILL;
        final int i3 = c1082120eGY.LIZIZ;
        final int i4 = c1082120eGY.LIZJ;
        final long j = c1082120eGY.LIZLLL;
        final long j2 = c1082120eGY.LJ;
        final int i5 = c1082120eGY.LJFF;
        final long j3 = c1082120eGY.LJIIIIZZ;
        final long j4 = c1082120eGY.LJIIL;
        final long j5 = c1082120eGY.LJIILIIL;
        final long j6 = c1082120eGY.LJIILJJIL;
        final long j7 = c1082120eGY.LJIILLIIL;
        final long j8 = c1082120eGY.LJIIZILJ;
        final long j9 = c1082120eGY.LJIIIZ;
        final long j10 = c1082120eGY.LJIIJ;
        final long j11 = c1082120eGY.LJIIJJI;
        final int i6 = c1082120eGY.LJI;
        final int i7 = c1082120eGY.LJII;
        JSONObject jSONObject = this.LJI.get();
        if (jSONObject == null && !LiveWidgetSlardarReportFixSetting.INSTANCE.getEnable()) {
            jSONObject = new JSONObject();
            this.LJI.set(jSONObject);
        }
        final JSONObject jSONObject2 = jSONObject;
        C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0eGZ
            @Override // java.lang.Runnable
            public final void run() {
                C1082110eGX c1082110eGX = this.LL;
                JSONObject jSONObject3 = jSONObject2;
                int i8 = i;
                String str2 = str;
                int i9 = i3;
                int i10 = i4;
                long j12 = j;
                long j13 = j2;
                int i11 = i5;
                long j14 = j3;
                long j15 = j4;
                long j16 = j5;
                long j17 = j6;
                int i12 = i2;
                long j18 = j7;
                long j19 = j8;
                long j20 = j9;
                long j21 = j10;
                long j22 = j11;
                int i13 = i6;
                int i14 = i7;
                boolean z2 = z;
                c1082110eGX.getClass();
                C1C7U.LIZ("SlardarRecyclableWidgetEventListener@1571.send$1L");
                boolean enable = LiveWidgetSlardarReportFixSetting.INSTANCE.getEnable();
                if (enable) {
                    jSONObject3 = new JSONObject();
                }
                if (LiveMonitorSampleSetting.INSTANCE.isReportSlardar("ttlive_widget_metrics") && jSONObject3 != null) {
                    try {
                        jSONObject3.put("widgetName", str2);
                        jSONObject3.put("widgetSceneType", i8);
                        jSONObject3.put("loadCount", i9);
                        jSONObject3.put("asyncLoadCount", i10);
                        jSONObject3.put("loadTotalDelay", j12);
                        jSONObject3.put("interactionTotalDelay", j13);
                        jSONObject3.put("createViewCount", i11);
                        jSONObject3.put("createViewTotalDuration", j14);
                        jSONObject3.put("loadedTotalDuration", j15);
                        jSONObject3.put("showTotalDuration", j16);
                        jSONObject3.put("inflationTotalDuration", j17);
                        if (z2) {
                            jSONObject3.put("initCount", i13);
                            jSONObject3.put("reuseCount", i14);
                            jSONObject3.put("initTotalDuration", j20);
                            jSONObject3.put("loadTotalDuration", j21);
                            jSONObject3.put("unloadTotalDuration", j22);
                            if (!enable) {
                                jSONObject3.remove("widgetCount");
                                jSONObject3.remove("createTotalDuration");
                                jSONObject3.remove("destroyTotalDuration");
                            }
                        } else {
                            jSONObject3.put("widgetCount", i12);
                            jSONObject3.put("createTotalDuration", j18);
                            jSONObject3.put("destroyTotalDuration", j19);
                            if (!enable) {
                                jSONObject3.remove("initCount");
                                jSONObject3.remove("reuseCount");
                                jSONObject3.remove("initTotalDuration");
                                jSONObject3.remove("loadTotalDuration");
                                jSONObject3.remove("unloadTotalDuration");
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C1CC2.LJFF("ttlive_widget_metrics", new JSONObject(), null, jSONObject3);
                }
                C1C7U.LIZIZ("SlardarRecyclableWidgetEventListener@1571.send$1L");
            }
        });
    }
}

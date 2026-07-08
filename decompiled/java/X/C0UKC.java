package X;

import android.view.View;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0UKC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UKC {
    public static final Map<C13IQ<? extends PreviewWidget>, PreviewWidget> LIZ = new HashMap();
    public static WidgetManager LIZIZ;
    public static DataChannel LIZJ;
    public static Function2<? super C20516015Pq, ? super PreviewWidget, Boolean> LIZLLL;

    public static void LJ() {
        Iterator it2 = ((HashMap) LIZ).keySet().iterator();
        while (it2.hasNext()) {
            LIZLLL((C13IQ) it2.next());
        }
    }

    public static void LIZLLL(C13IQ c13iq) {
        PreviewWidget previewWidgetLJFF = LJFF(c13iq);
        if (previewWidgetLJFF != null && previewWidgetLJFF.LLILLL && previewWidgetLJFF.x1()) {
            C20516015Pq c20516015Pq = previewWidgetLJFF.widgetContainer;
            if (c20516015Pq != null) {
                c20516015Pq.LIZ(previewWidgetLJFF.contentView);
            }
            previewWidgetLJFF.D1();
        }
    }

    public static PreviewWidget LJFF(C13IQ c13iq) {
        Object obj = ((HashMap) LIZ).get(c13iq);
        if (obj instanceof PreviewWidget) {
            return (PreviewWidget) obj;
        }
        return null;
    }

    public static void LJI(C19719912Dl c19719912Dl) {
        HashMap map = (HashMap) LIZ;
        if (map.containsKey(c19719912Dl)) {
            map.remove(c19719912Dl);
        }
    }

    public static void LIZJ(C19719912Dl c19719912Dl, C20516015Pq c20516015Pq, Set set) {
        LiveMode liveMode;
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL.put(c19719912Dl, set);
        C770220UJg.LIZIZ(c19719912Dl);
        try {
            PreviewWidget previewWidgetLJFF = LJFF(c19719912Dl);
            if (previewWidgetLJFF == null) {
                Object objNewInstance = C09R7.LIZ(c19719912Dl).newInstance();
                ((HashMap) LIZ).put(c19719912Dl, (PreviewWidget) objNewInstance);
                previewWidgetLJFF = (PreviewWidget) objNewInstance;
            }
            View view = previewWidgetLJFF.contentView;
            if (view == null) {
                WidgetManager widgetManager = LIZIZ;
                if (widgetManager != null) {
                    DataChannel dataChannel = LIZJ;
                    if (dataChannel != null) {
                        liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class);
                    } else {
                        liveMode = null;
                    }
                    widgetManager.loadPreviewWidget(c20516015Pq, previewWidgetLJFF, true, liveMode, new InterfaceC770590UKr() { // from class: X.0UKE
                        @Override // X.InterfaceC770590UKr
                        public final boolean LIZ(Object obj) {
                            Object objGg0;
                            DataChannel dataChannel2 = C0UKC.LIZJ;
                            if (dataChannel2 != null) {
                                objGg0 = dataChannel2.gg0(LiveModeChannel.class);
                            } else {
                                objGg0 = null;
                            }
                            if (obj == objGg0) {
                                return true;
                            }
                            return false;
                        }
                    });
                }
            } else {
                previewWidgetLJFF.widgetContainer = c20516015Pq;
                if (c20516015Pq != null) {
                    c20516015Pq.LIZIZ(view);
                }
                previewWidgetLJFF.C1();
            }
            Function2<? super C20516015Pq, ? super PreviewWidget, Boolean> function2 = LIZLLL;
            if (function2 != null && !function2.invoke(c20516015Pq, previewWidgetLJFF).booleanValue()) {
                throw new IllegalStateException("You must implement IFoldableWidget, when using widget in foldable area.");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static PreviewWidget LIZ(C13IQ c13iq, C20516015Pq c20516015Pq, C13IQ[] c13iqArr, boolean z) {
        Object objGg0;
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL.put(c13iq, C13LQ.LJLIIIL(c13iqArr));
        C770220UJg.LIZIZ(c13iq);
        PreviewWidget previewWidgetLJFF = LJFF(c13iq);
        if (previewWidgetLJFF == null) {
            previewWidgetLJFF = (PreviewWidget) C09R7.LIZ(c13iq).newInstance();
            ((HashMap) LIZ).put(c13iq, previewWidgetLJFF);
        }
        View view = previewWidgetLJFF.contentView;
        if (view == null) {
            WidgetManager widgetManager = LIZIZ;
            if (widgetManager != null) {
                DataChannel dataChannel = LIZJ;
                if (dataChannel != null) {
                    objGg0 = dataChannel.gg0(LiveModeChannel.class);
                } else {
                    objGg0 = null;
                }
                widgetManager.loadPreviewWidget(c20516015Pq, previewWidgetLJFF, z, objGg0, new InterfaceC770590UKr() { // from class: X.0UKD
                    @Override // X.InterfaceC770590UKr
                    public final boolean LIZ(Object obj) {
                        Object objGg02;
                        DataChannel dataChannel2 = C0UKC.LIZJ;
                        if (dataChannel2 != null) {
                            objGg02 = dataChannel2.gg0(LiveModeChannel.class);
                        } else {
                            objGg02 = null;
                        }
                        if (obj == objGg02) {
                            return true;
                        }
                        return false;
                    }
                });
            }
        } else {
            previewWidgetLJFF.widgetContainer = c20516015Pq;
            if (c20516015Pq != null) {
                c20516015Pq.LIZIZ(view);
            }
            previewWidgetLJFF.C1();
        }
        Function2<? super C20516015Pq, ? super PreviewWidget, Boolean> function2 = LIZLLL;
        if (function2 != null && !function2.invoke(c20516015Pq, previewWidgetLJFF).booleanValue()) {
            throw new IllegalStateException("You must implement IFoldableWidget, when using widget in foldable area.");
        }
        return previewWidgetLJFF;
    }
}

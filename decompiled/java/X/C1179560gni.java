package X;

import Y.ARunnableS19S0210000_18;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.zhiliaoapp.musically.R;
import j27.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS115S0400000_18;
import kotlin.jvm.internal.AwS262S0300000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0gni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179560gni extends FrameLayout {
    public final ViewGroup LL;
    public Function0<Unit> LLILLJJLI;
    public C1179540gng LLILLL;
    public final C1DFK LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public InterfaceC1177250gjz LLIZ;

    public C1179560gni(Context context) {
        super(context, null);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e4p, this, true);
        this.LL = (ViewGroup) findViewById(R.id.nzn);
        this.LLILZ = C23118094a.LIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                this.LLILZLL--;
                            }
                        } else {
                            this.LLILZLL++;
                        }
                    } else {
                        this.LLILZLL = 0;
                    }
                } else if (this.LLILZIL && this.LLILZLL == 1) {
                    return false;
                }
            } else {
                this.LLILZLL = 0;
            }
        } else {
            this.LLILZLL = 1;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setCameraMoveListener$poi_release(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            this.LLILZ.LIZIZ(null);
        }
    }

    public final void LIZ(InterfaceC1177250gjz interfaceC1177250gjz, C1179580gnk c1179580gnk, Function0<Unit> function0, Function0<Unit> function02) {
        C1178520gm2 c1178520gm2 = new C1178520gm2();
        Context context = getContext();
        C1177960gl8 c1177960gl8 = new C1177960gl8(c1179580gnk.poiLat, c1179580gnk.poiLng);
        double d = c1179580gnk.maxLat;
        double d2 = c1179580gnk.minLat;
        double d3 = c1179580gnk.maxLng;
        double d4 = c1179580gnk.minLng;
        List<C1177960gl8> list = c1179580gnk.poiMarkers;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C1177960gl8> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1178530gm3(it2.next()));
        }
        C1178520gm2.LIZ(c1178520gm2, context, interfaceC1177250gjz, c1177960gl8, Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(c1179580gnk.defaultZoomLevel), null, null, arrayList, new AwS115S0400000_18((Function0) function0, (Function0<Unit>) this, (C1179560gni) interfaceC1177250gjz, (InterfaceC1177250gjz) c1179580gnk, (C1179580gnk) 21), new AwS562S0100000_18(function02, (Function0<Unit>) 2727), 1792);
    }

    public final void LIZIZ(boolean z, C1179580gnk c1179580gnk, s sVar, AwS597S0100000_18 awS597S0100000_18) {
        LynxView lynxViewLJIILJJIL;
        Object obj;
        C19EG c19egLIZIZ;
        C19EH c19ehLJIIJ;
        C1537710q7N c1537710q7N;
        C1537480q70 hybridContext;
        this.LLILZIL = c1179580gnk.disableSingleFingerMove;
        boolean zLIZIZ = false;
        if (z) {
            AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(awS597S0100000_18, 2729);
            AwS262S0300000_18 awS262S0300000_18 = new AwS262S0300000_18(awS597S0100000_18, this, c1179580gnk, 23);
            InterfaceC1177250gjz interfaceC1177250gjz = this.LLIZ;
            if (interfaceC1177250gjz != null) {
                LIZ(interfaceC1177250gjz, c1179580gnk, awS562S0100000_18, awS262S0300000_18);
                return;
            }
            FragmentManager supportFragmentManager = null;
            if (sVar != null) {
                lynxViewLJIILJJIL = sVar.LJIILJJIL();
            } else {
                lynxViewLJIILJJIL = null;
            }
            if ((lynxViewLJIILJJIL instanceof C1537710q7N) && (c1537710q7N = (C1537710q7N) lynxViewLJIILJJIL) != null && (hybridContext = c1537710q7N.getHybridContext()) != null) {
                obj = (InterfaceC1059280dfi) hybridContext.LJFF(InterfaceC1059280dfi.class);
            } else {
                obj = null;
            }
            if ((obj instanceof SparkPopup) || (obj instanceof SparkFragment)) {
                supportFragmentManager = ((Fragment) obj).getChildFragmentManager();
            } else {
                Context context = getContext();
                if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                    supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
                }
            }
            C1180740gpc.LIZ.getClass();
            IPoiMapService iPoiMapServiceLIZ = C1180740gpc.LIZ();
            C1179470gnZ c1179470gnZ = new C1179470gnZ();
            if (c1179580gnk.disableInteraction) {
                c1179470gnZ.LIZLLL = false;
                c1179470gnZ.LIZIZ = false;
                c1179470gnZ.LIZJ = false;
            }
            c1179470gnZ.LJFF = EnumC1203090hPf.MAP_TYPE_NORMAL;
            Context context2 = getContext();
            if (context2 != null) {
                c1179470gnZ.LJI = C1178280gle.LIZIZ(context2);
                InterfaceC1176690gj5 iMapManager = iPoiMapServiceLIZ.getIMapManager(new C1203050hPb(c1179470gnZ));
                Fragment fragmentLIZIZ = iMapManager.LIZIZ();
                if (fragmentLIZIZ != null && supportFragmentManager != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
                    c19ehLJIIJ.LIZIZ(R.id.nzn, fragmentLIZIZ);
                    c19ehLJIIJ.LJIIIZ();
                }
                iMapManager.X(new AwS115S0400000_18(this, c1179580gnk, awS562S0100000_18, awS262S0300000_18, 22));
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Context context3 = getContext();
        if (context3 != null) {
            zLIZIZ = C960203pA.LIZIZ(context3);
        }
        HandlerHook.viewPost(this.LL, new ARunnableS19S0210000_18(this, c1179580gnk, zLIZIZ, 2));
        awS597S0100000_18.invoke(Boolean.FALSE);
    }
}

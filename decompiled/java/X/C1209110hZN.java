package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.WhiteNoiseAssem;
import com.ss.android.ugc.aweme.poi.map.assem.PoiStaticMapAssem;
import java.util.List;
import kotlin.jvm.internal.AwS158S0101000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0hZN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1209110hZN extends C21648719nx {
    public final int $t;
    public Object l0;

    public static final boolean onDown$0(C1209110hZN c1209110hZN, MotionEvent motionEvent) {
        return true;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onDown$0(this, motionEvent);
            case 1:
            default:
                return super.onDown(motionEvent);
            case 2:
                return onDown$1(this, motionEvent);
            case 3:
                return onDown$2(this, motionEvent);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.$t != 0 ? super.onFling(motionEvent, motionEvent2, f, f2) : onFling$0(this, motionEvent, motionEvent2, f, f2);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.$t) {
            case 1:
                return onScroll$0(this, motionEvent, motionEvent2, f, f2);
            case 2:
                return onScroll$1(this, motionEvent, motionEvent2, f, f2);
            case 3:
                return onScroll$2(this, motionEvent, motionEvent2, f, f2);
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    public C1209110hZN(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onDown$1(C1209110hZN c1209110hZN, MotionEvent motionEvent) {
        ((C1196900hFg) c1209110hZN.l0).LLJ = false;
        return super.onDown(motionEvent);
    }

    public static final boolean onDown$2(C1209110hZN c1209110hZN, MotionEvent motionEvent) {
        ((C1196960hFm) c1209110hZN.l0).LLJLL = false;
        return super.onDown(motionEvent);
    }

    public static final boolean onFling$0(C1209110hZN c1209110hZN, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        int i2;
        if (motionEvent != null && motionEvent2 != null) {
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) > ((Number) ((WhiteNoiseAssem) c1209110hZN.l0).LLJLIL.getValue()).intValue() && Math.abs(f) > ((Number) ((WhiteNoiseAssem) c1209110hZN.l0).LLJLILLLLZIIL.getValue()).intValue()) {
                if (x > 0.0f) {
                    WhiteNoiseAssem whiteNoiseAssem = (WhiteNoiseAssem) c1209110hZN.l0;
                    List<EnumC1163260gNQ> list = WhiteNoiseAssem.LLLFZ;
                    int iIndexOf = list.indexOf(whiteNoiseAssem.LLJJLIIIJLLLLLLLZ);
                    if (iIndexOf >= 0 && iIndexOf - 1 >= 0) {
                        whiteNoiseAssem.LLJJLIIIJLLLLLLLZ = (EnumC1163260gNQ) ListProtector.get(list, i2);
                        new AwS158S0101000_18(i2, whiteNoiseAssem, 6);
                        whiteNoiseAssem.Lo("onSwipeRight");
                        whiteNoiseAssem.Jo();
                    }
                } else {
                    WhiteNoiseAssem whiteNoiseAssem2 = (WhiteNoiseAssem) c1209110hZN.l0;
                    List<EnumC1163260gNQ> list2 = WhiteNoiseAssem.LLLFZ;
                    int iIndexOf2 = list2.indexOf(whiteNoiseAssem2.LLJJLIIIJLLLLLLLZ);
                    if (iIndexOf2 >= 0 && (i = iIndexOf2 + 1) < list2.size()) {
                        whiteNoiseAssem2.LLJJLIIIJLLLLLLLZ = (EnumC1163260gNQ) ListProtector.get(list2, i);
                        new AwS158S0101000_18(i, whiteNoiseAssem2, 7);
                        whiteNoiseAssem2.Lo("onSwipeLeft");
                        whiteNoiseAssem2.Jo();
                        return true;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean onScroll$0(C1209110hZN c1209110hZN, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        PoiStaticMapAssem poiStaticMapAssem = (PoiStaticMapAssem) c1209110hZN.l0;
        C1179690gnv c1179690gnv = poiStaticMapAssem.LLJI;
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(poiStaticMapAssem, 1360);
        c1179690gnv.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - c1179690gnv.LIZ > 2000) {
            c1179690gnv.LIZ = jElapsedRealtime;
            awS562S0100000_18.invoke();
            return true;
        }
        return true;
    }

    public static final boolean onScroll$1(C1209110hZN c1209110hZN, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ((C1196900hFg) c1209110hZN.l0).LLJ = true;
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    public static final boolean onScroll$2(C1209110hZN c1209110hZN, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ((C1196960hFm) c1209110hZN.l0).LLJLL = true;
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }
}

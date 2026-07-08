package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.skydoves.balloon.Balloon;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS631S0100000_17;

/* JADX INFO: renamed from: X.1CyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247871CyX {
    public static final C2247871CyX LIZ = new C2247871CyX();
    public static final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
    public static final int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
    public static final int LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));

    public static Balloon LIZ(C2247871CyX c2247871CyX, Context context, View view, boolean z, int i, Function0 function0, boolean z2, Function0 function02, Integer num, C0HJB c0hjb, int i2) {
        int iIntValue;
        if ((i2 & 64) != 0) {
            C1919007fQ.LIZ.getClass();
            if (C1919007fQ.LIZLLL()) {
                i = R.attr.a1a;
            } else {
                i = R.attr.za;
            }
        }
        LifecycleOwner lifecycleOwnerLJFF = null;
        if ((i2 & 256) != 0) {
            function0 = null;
        }
        if ((i2 & 512) != 0) {
            z2 = true;
        }
        if ((i2 & 1024) != 0) {
            function02 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            num = null;
        }
        C0HJE c0hje = c0hjb;
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c0hje = C0HJD.LIZ;
        }
        c2247871CyX.getClass();
        C2247921Cyc c2247921Cyc = new C2247921Cyc(context);
        c2247921Cyc.LIZIZ(Integer.MIN_VALUE);
        c2247921Cyc.LIZ(Integer.MIN_VALUE);
        c2247921Cyc.LJIILL = 16.0f;
        c2247921Cyc.LJII = EnumC1152950g6n.ALIGN_BALLOON;
        c2247921Cyc.LJFF = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 0, Resources.getSystem().getDisplayMetrics()));
        c2247921Cyc.LJI = 0.5f;
        c2247921Cyc.LJIIJJI = 0;
        c2247921Cyc.LJJIFFI = z;
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c2247921Cyc.LJJII = iIntValue;
        c2247921Cyc.LJJIII = c0hje;
        c2247921Cyc.LJJJJIZL = false;
        c2247921Cyc.LJJIIZI = z2;
        if (!z2) {
            c2247921Cyc.LJJJJIZL = z2;
        }
        c2247921Cyc.LJJIJ = true;
        c2247921Cyc.LJJIIJZLJL = new C11HK(new AwS578S0100000_34(function0, (Function0<Unit>) 159));
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null) {
            lifecycleOwnerLJFF = abstractC1387200mCcLIZIZ.LJFF();
        }
        c2247921Cyc.LJJIJIL = lifecycleOwnerLJFF;
        c2247921Cyc.LJJI = view;
        if (num != null) {
            num.intValue();
            c2247921Cyc.LJJIJL = num.intValue();
        }
        if (function02 != null) {
            c2247921Cyc.LJJIIZ = new C11HH(new AwS631S0100000_17(function02, (Function0<Unit>) 36));
            c2247921Cyc.LJJIIZI = false;
            c2247921Cyc.LJJJJIZL = false;
        }
        return new Balloon(context, c2247921Cyc);
    }
}

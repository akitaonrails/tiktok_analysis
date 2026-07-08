package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0rul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606770rul {
    public final WeakReference<Activity> LIZ;
    public final Function2<SmartRoute, String, Unit> LIZIZ;
    public final Function1<EnumC1605470rsf, Unit> LIZJ;
    public final Function2<String, HashMap<String, String>, Boolean> LIZLLL;
    public final Function0<Boolean> LJ;
    public final Function0<Boolean> LJFF;
    public final Function1<InterfaceC1398730mVD, Unit> LJI;
    public final Function0<Boolean> LJII;
    public final Boolean LJIIIIZZ;

    public C1606770rul(WeakReference weakReference, Function2 function2, Function1 function1, Function2 function22, Function0 function0, Function0 function02, Function1 function12, AwS563S0100000_19 awS563S0100000_19, Boolean bool, int i) {
        weakReference = (i & 1) != 0 ? null : weakReference;
        function2 = (i & 2) != 0 ? null : function2;
        function1 = (i & 4) != 0 ? null : function1;
        function22 = (i & 8) != 0 ? null : function22;
        function0 = (i & 16) != 0 ? null : function0;
        function02 = (i & 32) != 0 ? null : function02;
        function12 = (i & 64) != 0 ? null : function12;
        awS563S0100000_19 = (i & 128) != 0 ? null : awS563S0100000_19;
        bool = (i & 256) != 0 ? null : bool;
        this.LIZ = weakReference;
        this.LIZIZ = function2;
        this.LIZJ = function1;
        this.LIZLLL = function22;
        this.LJ = function0;
        this.LJFF = function02;
        this.LJI = function12;
        this.LJII = awS563S0100000_19;
        this.LJIIIIZZ = bool;
    }
}

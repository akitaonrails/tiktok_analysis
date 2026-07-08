package X;

import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0auS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953100auS {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public final EnumC952890au7 LIZJ;
    public final C916750Zxp LIZLLL;
    public final Function1<C916750Zxp, Unit> LJ;
    public final InterfaceC2280191EMv<String, String, EnumC937290aUx, EnumC953330aup, String, C917840Zza, EnumC952890au7, String, C916750Zxp, Unit> LJFF;
    public final Function1<EnumC919100a1c, Unit> LJI;
    public final Function0<Unit> LJII;
    public final WeakReference<InterfaceC917550Zz7> LJIIIIZZ;

    public C953100auS(Context context, DataChannel dataChannel, EnumC952890au7 enumC952890au7, C916750Zxp c916750Zxp, Function1 function1, InterfaceC2280191EMv interfaceC2280191EMv, Function1 function12, Function0 function0, WeakReference weakReference, int i) {
        weakReference = (i & 256) != 0 ? null : weakReference;
        this.LIZ = context;
        this.LIZIZ = dataChannel;
        this.LIZJ = enumC952890au7;
        this.LIZLLL = c916750Zxp;
        this.LJ = function1;
        this.LJFF = interfaceC2280191EMv;
        this.LJI = function12;
        this.LJII = function0;
        this.LJIIIIZZ = weakReference;
    }
}

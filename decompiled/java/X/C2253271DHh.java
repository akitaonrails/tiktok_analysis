package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.vesdk.VERecorder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253271DHh {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;
    public final C2253301DHk LIZJ;
    public final C1DKV LIZLLL;
    public final InterfaceC2253451DHz LJ;
    public final Function0<Boolean> LJFF;
    public final Function0<VERecorder> LJI;
    public final Effect LJII;
    public final InterfaceC1631630sYr<Integer, Integer, String, VERecorder, Unit> LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C2253271DHh(Context context, LifecycleOwner lifecycleOwner, C2253301DHk c2253301DHk, C1DKV c1dkv, InterfaceC2253451DHz interfaceC2253451DHz, Function0<Boolean> function0, Function0<? extends VERecorder> function02, Effect effect, InterfaceC1631630sYr<? super Integer, ? super Integer, ? super String, ? super VERecorder, Unit> interfaceC1631630sYr) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = c2253301DHk;
        this.LIZLLL = c1dkv;
        this.LJ = interfaceC2253451DHz;
        this.LJFF = function0;
        this.LJI = function02;
        this.LJII = effect;
        this.LJIIIIZZ = interfaceC1631630sYr;
    }
}

package X;

import Y.ARunnableS4S1101000_20;
import com.lynx.jsbridge.LynxResourceModule;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.core.JSProxy;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jy0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301260jy0 implements InterfaceC1301190jxt {
    public final /* synthetic */ WeakReference LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ boolean[] LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ JavaOnlyArray LJ;
    public final /* synthetic */ int[] LJFF;
    public final /* synthetic */ int LJI;
    public final /* synthetic */ Callback LJII;
    public final /* synthetic */ JavaOnlyMap LJIIIIZZ;
    public final /* synthetic */ LynxResourceModule LJIIIZ;

    public final void LIZ(int i, String str) {
        LynxResourceModule lynxResourceModule = (LynxResourceModule) this.LIZ.get();
        if (lynxResourceModule != null && lynxResourceModule.mLynxContext != null) {
            if (i != 0) {
                lynxResourceModule.reportError(i, str, "If it is a parameter error, please check the parameters passed in. If the Resource service does not exist, it may be due to an error that occurred while creating the resource service through reflection. Please contact the client RD for help.", this.LIZIZ, "request");
            }
            s sVar = lynxResourceModule.mLynxContext;
            ARunnableS4S1101000_20 aRunnableS4S1101000_20 = new ARunnableS4S1101000_20(i, str, this, 2);
            JSProxy jSProxy = sVar.LLJI.get();
            if (jSProxy != null) {
                jSProxy.LJII(aRunnableS4S1101000_20);
            }
        }
    }

    public C1301260jy0(LynxResourceModule lynxResourceModule, WeakReference weakReference, String str, boolean[] zArr, String str2, JavaOnlyArray javaOnlyArray, int[] iArr, int i, Callback callback, JavaOnlyMap javaOnlyMap) {
        this.LJIIIZ = lynxResourceModule;
        this.LIZ = weakReference;
        this.LIZIZ = str;
        this.LIZJ = zArr;
        this.LIZLLL = str2;
        this.LJ = javaOnlyArray;
        this.LJFF = iArr;
        this.LJI = i;
        this.LJII = callback;
        this.LJIIIIZZ = javaOnlyMap;
    }
}

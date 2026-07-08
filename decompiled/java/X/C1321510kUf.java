package X;

import android.content.Context;
import android.view.View;
import java.util.Map;
import kotlin.jvm.internal.AwS26S1101000_20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kUf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321510kUf extends AbstractC21333318eB<C1292290jjX> {
    public Object LLZZJLIL;
    public Object LLZZLLIL;
    public Object LLZZZIL;
    public Object LLZZZZ;
    public Object a;
    public int b;
    public final ViewOnAttachStateChangeListenerC1339240kxG c;

    public C1321510kUf(C21325918cz c21325918cz) {
        super(c21325918cz);
        this.c = new ViewOnAttachStateChangeListenerC1339240kxG(this, 0);
    }

    @Override // X.AbstractC21333318eB
    public final View LJJJLZIJ(Context context) {
        C1292290jjX c1292290jjX = new C1292290jjX(context);
        Boolean bool = Boolean.TRUE;
        this.LLZZLLIL = bool;
        this.LLZZZIL = bool;
        this.a = Float.valueOf(1.0f);
        this.LLZZZZ = null;
        c1292290jjX.setAutoPlay(true);
        c1292290jjX.setLoop(true);
        c1292290jjX.setSpeed(1.0f);
        c1292290jjX.addOnAttachStateChangeListener(this.c);
        return c1292290jjX;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC21333318eB
    public final void LJJLIIIJILLIZJL(Map<String, ? extends Object> map) {
        Integer numValueOf = null;
        boolean z = false;
        boolean zLIZ = false;
        boolean z2 = false;
        boolean z3 = false;
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            switch (key.hashCode()) {
                case -629825370:
                    if (key.equals("loop-count") && (!Intrinsics.LJFF(this.LLZZZZ, value))) {
                        this.LLZZZZ = value;
                        numValueOf = Integer.valueOf(C1337850kv1.LJ(0, value));
                        z2 = true;
                    }
                    break;
                case 114148:
                    if (key.equals("src") && (!Intrinsics.LJFF(this.LLZZJLIL, value))) {
                        this.LLZZJLIL = value;
                        z3 = true;
                    }
                    break;
                case 3327652:
                    if (key.equals("loop") && (!Intrinsics.LJFF(this.LLZZZIL, value))) {
                        this.LLZZZIL = value;
                        zLIZ = C1337850kv1.LIZ(value);
                        z = true;
                    }
                    break;
                case 109641799:
                    if (key.equals("speed") && (true ^ Intrinsics.LJFF(this.a, value))) {
                        this.a = value;
                        getView().setSpeed(C1337850kv1.LIZIZ(1.0f, value));
                    }
                    break;
                case 1439562083:
                    if (key.equals("autoplay") && (true ^ Intrinsics.LJFF(this.LLZZLLIL, value))) {
                        this.LLZZLLIL = value;
                        getView().setAutoPlay(C1337850kv1.LIZ(value));
                    }
                    break;
            }
        }
        if (z) {
            getView().setLoop(zLIZ);
        }
        if (z2) {
            getView().setLoopCount(numValueOf);
        }
        if (z3) {
            String strLJIIJ = C1337850kv1.LJIIJ(this.LLZZJLIL);
            if (strLJIIJ != null && strLJIIJ.length() != 0) {
                InterfaceC1321540kUi interfaceC1321540kUiLJ = this.LL.LIZ.LJ();
                if (interfaceC1321540kUiLJ == null) {
                    getView().setSource(strLJIIJ);
                    return;
                }
                int i = this.b + 1;
                this.b = i;
                getView().getContext();
                if (interfaceC1321540kUiLJ.LIZ(strLJIIJ, new AwS26S1101000_20(i, this, strLJIIJ, 1))) {
                    return;
                }
                getView().setSource(strLJIIJ);
                return;
            }
            getView().setSource(strLJIIJ);
        }
    }
}

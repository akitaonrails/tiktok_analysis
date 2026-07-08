package X;

import com.bytedance.android.livesdk.livesetting.broadcast.FixCameraCaptureLeakABSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0UH4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0UH4 implements InterfaceC770050UIp {
    public List<InterfaceC1272550jDh> LL;
    public final ConcurrentHashSet<C0UHE> LLILLJJLI = new ConcurrentHashSet<>();
    public InterfaceC769170UFf LLILLL;
    public C0UHD LLILZ;

    public abstract EffectImageInfo LJ();

    public abstract int LJFF(int i, int i2, int i3, String str);

    public synchronized void LJI(InterfaceC769170UFf interfaceC769170UFf) {
        this.LLILLL = interfaceC769170UFf;
    }

    @Override // X.InterfaceC770050UIp
    public final void LJIIIZ(C0UHE c0uhe) {
        if (c0uhe == null) {
            return;
        }
        this.LLILLJJLI.add(c0uhe);
    }

    @Override // X.InterfaceC770050UIp
    public final void LJIIL(C0UHE c0uhe) {
        if (c0uhe == null) {
            return;
        }
        this.LLILLJJLI.remove(c0uhe);
    }

    @Override // X.InterfaceC770050UIp
    public final synchronized void LJIILJJIL(InterfaceC1272550jDh interfaceC1272550jDh) {
        if (this.LL == null) {
            this.LL = new ArrayList();
        }
        ((ArrayList) this.LL).add(interfaceC1272550jDh);
    }

    @Override // X.InterfaceC770050UIp
    public final synchronized void LJIILL(InterfaceC1272550jDh interfaceC1272550jDh) {
        if (this.LL == null) {
            return;
        }
        if (FixCameraCaptureLeakABSetting.INSTANCE.enable()) {
            int size = ((ArrayList) this.LL).size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (ListProtector.get(this.LL, size) == interfaceC1272550jDh) {
                    ListProtector.remove(this.LL, size);
                }
            }
        } else {
            int size2 = ((ArrayList) this.LL).size();
            while (true) {
                size2--;
                if (size2 <= 0) {
                    break;
                } else if (ListProtector.get(this.LL, size2) == interfaceC1272550jDh) {
                    ListProtector.remove(this.LL, size2);
                }
            }
        }
    }
}

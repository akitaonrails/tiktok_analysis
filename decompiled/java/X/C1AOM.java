package X;

import com.ss.android.videoshop.layer.stub.BaseVideoLayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1AOM, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public abstract class C1AOM extends BaseVideoLayer implements C1AOS {
    public final boolean LL;
    public boolean LLILLJJLI;
    public final List<Integer> LLILLL = new ArrayList();
    public final List<C1AOU> LLILZ = new ArrayList();

    public C1AOM() {
        this.LL = true;
        this.LL = true;
    }

    @Override // X.C1AOS
    public final boolean LIZJ(C1AOU c1aou) {
        if (!this.LLILLJJLI && this.LL) {
            if (c1aou == null) {
                return false;
            }
            if (((ArrayList) this.LLILLL).contains(Integer.valueOf(c1aou.getType()))) {
                if (!this.LLILLJJLI && this.LL) {
                    addViews();
                    this.LLILLJJLI = true;
                }
                Iterator it2 = ((ArrayList) this.LLILZ).iterator();
                while (it2.hasNext()) {
                    handleVideoEvent((C1AOU) it2.next());
                }
                return handleVideoEvent(c1aou);
            }
            if (getSupportEvents().contains(Integer.valueOf(c1aou.getType()))) {
                ((ArrayList) this.LLILZ).add(c1aou);
            }
            return false;
        }
        return handleVideoEvent(c1aou);
    }

    @Override // com.ss.android.videoshop.layer.stub.BaseVideoLayer
    public final void onRegister(InterfaceC2178591AOb interfaceC2178591AOb) {
        if (!this.LL) {
            super.onRegister(interfaceC2178591AOb);
        } else {
            setHost(interfaceC2178591AOb);
            this.mLayerStateInquirer = createLayerStateInquirer();
        }
    }
}

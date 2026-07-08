package X;

import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0nr4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1450720nr4 implements InterfaceC1450810nrD {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final Lifecycle LL;
    public final List<InterfaceC1450750nr7> LLILLJJLI = new ArrayList();
    public boolean LLILLL = true;
    public final C1450740nr6 LLILZ = new C0NTU<InterfaceC1449880npi>() { // from class: X.0nr6
        {
            super(null);
        }

        @Override // X.C0NTU
        public final void LIZ(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa, Object obj2) {
            C1450720nr4 c1450720nr4 = this.LLILLJJLI;
            if (c1450720nr4.LLILLL && obj2 != null) {
                c1450720nr4.LLILLL = false;
                Iterator<InterfaceC1450750nr7> it2 = c1450720nr4.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LJFF();
                }
            }
        }
    };

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(C1450720nr4.class, "renderContext", "getRenderContext()Lcom/ss/android/ugc/aweme/editSticker/gesture/group/IVETextStickerRenderContext;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    @Override // X.InterfaceC1450810nrD
    public final InterfaceC1449880npi LIZ() {
        C1450740nr6 c1450740nr6 = this.LLILZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (InterfaceC1449880npi) c1450740nr6.LL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0nr6] */
    public C1450720nr4(Lifecycle lifecycle) {
        this.LL = lifecycle;
    }
}

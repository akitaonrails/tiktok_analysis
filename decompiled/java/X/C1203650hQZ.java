package X;

import com.ss.android.ugc.aweme.poi.detail.discovery.ability.IDiscoverySectionVisibleAbility;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0hQZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203650hQZ extends AbstractC1203660hQa {
    public final ViewOnAttachStateChangeListenerC20604515jv LIZIZ;
    public final InterfaceC665370Q7z LIZJ;
    public boolean LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117 A[LOOP:2: B:71:0x0111->B:73:0x0117, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1203650hQZ.LIZJ():void");
    }

    @Override // X.InterfaceC1193590hAL
    public final void init() {
        IDiscoverySectionVisibleAbility iDiscoverySectionVisibleAbility;
        if (this.LIZIZ == null) {
            return;
        }
        InterfaceC665370Q7z interfaceC665370Q7z = this.LIZJ;
        if (interfaceC665370Q7z == null || (iDiscoverySectionVisibleAbility = (IDiscoverySectionVisibleAbility) C1558520qew.LIZ(interfaceC665370Q7z, IDiscoverySectionVisibleAbility.class, null)) == null || !iDiscoverySectionVisibleAbility.sK2()) {
            if (this.LIZIZ.getHeight() <= 0) {
                C430110Gtl.LIZIZ(this.LIZIZ, new AwS562S0100000_18(this, 2649));
            } else {
                LIZJ();
            }
        }
    }

    public C1203650hQZ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZIZ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZJ = interfaceC665370Q7z;
    }
}

package X;

import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.182Y, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C182Y extends C212238183w {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.10mS] */
    @Override // X.InterfaceC212223183h
    public final C19346210mS LIZ() {
        return new C19345510mL() { // from class: X.10mS
            public final EnumC1990507qx LJJI;
            public final int LJJIFFI;
            public C186Y LJJII;
            public final boolean LJJIII;

            {
                EnumC1990507qx enumC1990507qx = EnumC1990507qx.V3;
                C19346110mR c19346110mR = new C19346110mR();
                this.LJJI = enumC1990507qx;
                this.LJJIFFI = R.attr.a04;
                this.LJJII = c19346110mR;
                this.LJJIII = true;
            }

            @Override // X.C19345910mP, X.C186W
            public final EnumC1990507qx LIZIZ() {
                return this.LJJI;
            }

            @Override // X.C19345910mP, X.C186W
            public final int LIZLLL() {
                return this.LJJIFFI;
            }

            @Override // X.C19345910mP, X.C186W
            public final boolean LJFF() {
                return this.LJJIII;
            }

            @Override // X.C19345910mP, X.C186W
            public final C186Y LJIILL() {
                return this.LJJII;
            }

            @Override // X.C19345910mP, X.C186W
            public final void LJIIZILJ(C186Y c186y) {
                this.LJJII = c186y;
            }
        };
    }

    @Override // X.InterfaceC212223183h
    public final Map<EnumC1981207pS, InterfaceC212247184f> LIZJ() {
        Map<EnumC1981207pS, InterfaceC212247184f> mapLIZ = C1917107f7.LIZ();
        mapLIZ.put(EnumC1981207pS.DEFAULT, new C212195182f());
        mapLIZ.put(EnumC1981207pS.FLASH_SALE, new C1916707f3());
        mapLIZ.put(EnumC1981207pS.FIRST_ORDER, new C212194182e());
        return mapLIZ;
    }
}

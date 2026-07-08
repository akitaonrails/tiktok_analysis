package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0b4S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C959300b4S extends AbstractC959270b4P implements InterfaceC959940b5U {
    @Override // X.InterfaceC959940b5U
    public final void LIZJ(AwS559S0100000_15 awS559S0100000_15) {
    }

    @Override // X.InterfaceC959940b5U
    public final void LIZLLL(List list, AwS559S0100000_15 awS559S0100000_15) {
    }

    @Override // X.InterfaceC959940b5U
    public final void LJI(AwS559S0100000_15 awS559S0100000_15) {
    }

    @Override // X.InterfaceC960070b5h
    public final Set LJIIIZ() {
        return C13LQ.LJLIIL(new EnumC958900b3o[]{EnumC958900b3o.PREPARED, EnumC958900b3o.NONE});
    }

    public C959300b4S(InterfaceC959730b59 interfaceC959730b59) {
        super(interfaceC959730b59);
    }

    @Override // X.InterfaceC959940b5U
    public final void LIZIZ(C954630awv c954630awv, Function0<Unit> function0, Function0<Unit> function02) {
        String strLIZ;
        if (c954630awv.LIZIZ == 1) {
            this.LIZ.c0().LJIILLIIL = c954630awv.LIZJ;
            C955400ayA c955400ayA = C955400ayA.LIZ;
            Room room = new Room();
            String value = EnumC920540a3w.QUICK_LINKMIC.getValue();
            Map<String, String> mapLLLFZ = C915980Zwa.LJI().LIZ().LLLFZ();
            C950840aqo c950840aqo = this.LIZ.c0().LJIJJ;
            if (c950840aqo != null) {
                strLIZ = c950840aqo.LIZ();
            } else {
                strLIZ = null;
            }
            C955400ayA.LLF(room, value, null, null, null, null, mapLLLFZ, false, strLIZ, 188);
            InterfaceC955420ayC interfaceC955420ayCLIZ = C915980Zwa.LJI().LIZ();
            EnumC955660aya enumC955660aya = EnumC955660aya.INVITER;
            interfaceC955420ayCLIZ.LLIILZL(enumC955660aya);
            C915980Zwa.LJI().LIZ().LJLJL(enumC955660aya, false);
            function0.invoke();
            return;
        }
        if (function02 == null) {
            return;
        }
        function02.invoke();
    }
}

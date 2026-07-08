package X;

import com.bytedance.keva.Keva;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1Bd0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.model.CaptionKevaCache$1", f = "CaptionKevaCache.kt", l = {}, m = "invokeSuspend")
public final class C2209041Bd0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2209041Bd0(InterfaceC1364105Vn<? super C2209041Bd0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2209041Bd0(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zIsOn;
        EnumC2209071Bd3 enumC2209071Bd3;
        boolean zIsOn2;
        boolean zIsOn3;
        boolean zIsOn4;
        C1C7U.LIZ("CaptionKevaCache@2521.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Keva keva = C2209051Bd1.LIZIZ;
        C2209051Bd1.LJ = keva.getStringSet("tap_to_edit_encountered_aweme_ids", new LinkedHashSet());
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LJI.setValue(new C708250RqJ(C2209051Bd1.LJII().isOn(), C2209051Bd1.LJJ));
        C2209051Bd1.LJIIL.setValue(Boolean.valueOf(C2209051Bd1.LJFF().isOn()));
        C2252321DDq c2252321DDq = C2209051Bd1.LJIILJJIL;
        Boolean bool = (Boolean) c2252321DDq.getValue();
        if (bool != null) {
            zIsOn = bool.booleanValue();
        } else {
            zIsOn = C2209051Bd1.LJIIIIZZ().isOn();
        }
        c2252321DDq.setValue(Boolean.valueOf(zIsOn));
        C2209051Bd1.LJIJI.setValue("");
        C2209051Bd1.LJIIJJI();
        C2252321DDq c2252321DDq2 = C2209051Bd1.LJIIJJI;
        if (keva.contains("key_is_dm_translation_toggle_on")) {
            if (keva.getBoolean("key_is_dm_translation_toggle_on", false)) {
                enumC2209071Bd3 = EnumC2209071Bd3.MANUALLY_ON;
            } else {
                enumC2209071Bd3 = EnumC2209071Bd3.MANUALLY_OFF;
            }
        } else {
            enumC2209071Bd3 = EnumC2209071Bd3.DEFAULT_OFF;
        }
        c2252321DDq2.setValue(new C708900RrM(enumC2209071Bd3.isOn(), null));
        C2252321DDq c2252321DDq3 = C2209051Bd1.LJII;
        Boolean bool2 = (Boolean) c2252321DDq3.getValue();
        if (bool2 != null) {
            zIsOn2 = bool2.booleanValue();
        } else {
            zIsOn2 = C2209051Bd1.LJIIIZ().isOn();
        }
        c2252321DDq3.setValue(Boolean.valueOf(zIsOn2));
        C2252321DDq c2252321DDq4 = C2209051Bd1.LJIIIIZZ;
        Boolean bool3 = (Boolean) c2252321DDq4.getValue();
        if (bool3 != null) {
            zIsOn3 = bool3.booleanValue();
        } else {
            zIsOn3 = C2209051Bd1.LIZJ().isOn();
        }
        c2252321DDq4.setValue(Boolean.valueOf(zIsOn3));
        C2252321DDq c2252321DDq5 = C2209051Bd1.LJIIIZ;
        Boolean bool4 = (Boolean) c2252321DDq5.getValue();
        if (bool4 != null) {
            zIsOn4 = bool4.booleanValue();
        } else {
            zIsOn4 = C2209051Bd1.LIZIZ().isOn();
        }
        c2252321DDq5.setValue(Boolean.valueOf(zIsOn4));
        C2209051Bd1.LJIILL.setValue(Boolean.valueOf(C2209051Bd1.LJIIJ()));
        C2209051Bd1.LJIILLIIL.setValue(Boolean.valueOf(keva.getBoolean("hide_caption", true)));
        C2209051Bd1.LJIIZILJ.setValue(null);
        C2209051Bd1.LJIJ.setValue(keva.getString("key_selected_cec_edit_language", ""));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CaptionKevaCache@2521.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2209041Bd0(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}

package X;

import android.widget.EditText;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.im.assem.IMInputAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.misc.IMHorizontalLinearLayoutViewAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordBtnAssem;
import com.ss.android.ugc.aweme.im.chatroom.input.components.record.RecordTipAssem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS0S0700000_6;
import kotlin.jvm.internal.AwS104S0400000_6;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: renamed from: X.0HV7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HV7 {
    public static final AwS0S0700000_6 LIZJ(IMInputAssem iMInputAssem, C0HV6 c0hv6) {
        return new AwS0S0700000_6(C13LE.LIZ(IMHorizontalLinearLayoutViewAssem.class), iMInputAssem, C1163440gNi.LIZ, C1BNE.LIZ(C0HV8.LIZ), C442000HUw.LIZ, (C0HV9) null, new AwS620S0100000_6(c0hv6, 164), 23);
    }

    public static final AwS0S0700000_6 LIZLLL(UIAssem uIAssem, C05YD c05yd) {
        return new AwS0S0700000_6(C13LE.LIZ(RecordTipAssem.class), uIAssem, C1163440gNi.LIZ, c05yd, C442000HUw.LIZ, (C0HV9) null, (Function2) null, 21);
    }

    public static final void LIZ(UIAssem uIAssem, EditText editText, C05YD<? extends EnumC430090Gtj> c05yd) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem), null, null, new C0HVC(editText, c05yd, null), 3);
    }

    public static final AwS0S0700000_6 LIZIZ(IMInputAssem iMInputAssem, C0HV6 c0hv6, Function1 function1, Function1 function12, Function2 function2) {
        return new AwS0S0700000_6(C13LE.LIZ(RecordBtnAssem.class), iMInputAssem, C1163440gNi.LIZ, c0hv6.LJIILLIIL(), new C434390H1p(new AwS104S0400000_6(iMInputAssem, c0hv6, function12, function1, 10), new AwS104S0400000_6(iMInputAssem, c0hv6, function12, function1, 11), new AwS585S0100000_6(c0hv6, 402), new AwS620S0100000_6(c0hv6, 165), new AwS372S0200000_6(iMInputAssem, c0hv6, 98), new AwS585S0100000_6(c0hv6, 403)), C0HV9.VOICE_RECORD_BTN, function2, 22);
    }
}

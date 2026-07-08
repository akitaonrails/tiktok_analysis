package X;

import android.content.Context;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.18rg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21417018rg extends AbstractC21434518uV {
    public final Context LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Message LIZLLL;

    @Override // X.AbstractC21434218uS
    public final Collection<String> LIZJ() {
        return C1697810uHb.LJIILJJIL("retry");
    }

    @Override // X.AbstractC21434518uV
    public final Object LJ(C21432118u7 c21432118u7, C14S7 c14s7, InterfaceC21435018ua interfaceC21435018ua) {
        int iIntValue;
        int iIntValue2;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1s, this.LIZ);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, this.LIZ);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        return new C21416218rY(iIntValue, iIntValue2, new AwS576S0100000_32(this, 515), new AwS611S0100000_32(this, 284), this.LIZLLL);
    }

    public C21417018rg(Context context, Function0<Unit> function0, Function0<Unit> function02, Message message) {
        this.LIZ = context;
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZLLL = message;
    }
}

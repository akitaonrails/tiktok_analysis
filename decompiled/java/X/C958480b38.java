package X;

import com.bytedance.android.livesdk.model.message.LinkMessage;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0b38, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958480b38 extends AbstractC959270b4P implements InterfaceC959960b5W {
    @Override // X.InterfaceC959960b5W
    public final void LIZ(LinkMessage linkMessage) {
    }

    @Override // X.InterfaceC960070b5h
    public final Set LJIIIZ() {
        return C13LQ.LJLIIL(new EnumC958900b3o[]{EnumC958900b3o.NONE, EnumC958900b3o.WAITED, EnumC958900b3o.PREPARED});
    }

    public C958480b38(InterfaceC959730b59 interfaceC959730b59) {
        super(interfaceC959730b59);
    }

    @Override // X.InterfaceC959960b5W
    public final void LIZIZ(C954630awv c954630awv, Function0<Unit> function0, Function0<Unit> function02) {
        if (c954630awv.LIZIZ == 1) {
            this.LIZ.c0().LJIILLIIL = c954630awv.LIZJ;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (function02 == null) {
            return;
        }
        function02.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0152  */
    @Override // X.InterfaceC959960b5W
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.bytedance.android.livesdk.model.message.LinkMessage r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C958480b38.LJII(com.bytedance.android.livesdk.model.message.LinkMessage, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0):void");
    }
}

package X;

import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.core.resource.LynxResourceLoader;
import com.lynx.tasm.service.security.ILynxSecurityService;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: X.0jvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299730jvX extends AbstractC1299750jvZ {
    public final long LIZJ;
    public final C1289810jfX LIZLLL;
    public final EnumC1299880jvm LJ;

    public C1299730jvX(String str, long j, C1289810jfX c1289810jfX, EnumC1299880jvm enumC1299880jvm) {
        super(str);
        this.LIZJ = j;
        this.LIZLLL = c1289810jfX;
        this.LJ = enumC1299880jvm;
    }

    public final void LIZIZ(boolean z, byte[] bArr, TemplateBundle templateBundle, ByteBuffer byteBuffer, String str) {
        boolean z2;
        long j;
        ILynxSecurityService iLynxSecurityService;
        C0X87 c0x87;
        String strLIZIZ = str;
        if (!LIZ()) {
            return;
        }
        boolean z3 = true;
        int i = 0;
        if (bArr != null && bArr.length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (templateBundle == null || !templateBundle.LJFF()) {
            z3 = false;
        }
        if (z && (z2 || z3)) {
            C1289810jfX c1289810jfX = this.LIZLLL;
            if (c1289810jfX != null) {
                c1289810jfX.LIZ("last_lynx_async_component_url", this.LIZIZ);
            }
            if (!z3 && z2 && (iLynxSecurityService = (ILynxSecurityService) C1285920jZG.LIZJ().LIZ(ILynxSecurityService.class)) != null) {
                if (this.LJ == EnumC1299880jvm.LynxResourceTypeTemplate) {
                    c0x87 = C0X87.TYPE_TEMPLATE;
                } else {
                    c0x87 = C0X87.TYPE_DYNAMIC_COMPONENT;
                }
                if (!iLynxSecurityService.verifyTASM(null, bArr, byteBuffer, this.LIZIZ, c0x87).LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("tasm verify failed, url: ");
                    sbLIZ.append(this.LIZIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    z = false;
                }
            }
        }
        long j2 = this.LIZJ;
        if (z3) {
            j = templateBundle.LLILLJJLI;
        } else {
            j = 0;
        }
        if (!z) {
            i = -1;
        }
        LynxResourceLoader.nativeInvokeCallback(j2, bArr, j, byteBuffer, i, strLIZIZ);
    }
}

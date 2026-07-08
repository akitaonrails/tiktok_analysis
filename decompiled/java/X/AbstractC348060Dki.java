package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Dki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC348060Dki {
    public InterfaceC347430Djh LIZ;

    public void LIZ(INLEMediaSession iNLEMediaSession) {
    }

    public void LIZIZ(INLEMediaSession iNLEMediaSession) {
    }

    public abstract void LIZJ(NLEEditor nLEEditor);

    public final InterfaceC347430Djh LIZLLL() {
        InterfaceC347430Djh interfaceC347430Djh = this.LIZ;
        if (interfaceC347430Djh != null) {
            return interfaceC347430Djh;
        }
        return null;
    }

    public final void LJ(InterfaceC347430Djh interfaceC347430Djh) {
        this.LIZ = interfaceC347430Djh;
        synchronized (C348070Dkj.LIZ) {
            int i = 0;
            for (Object obj : (ArrayList) C348070Dkj.LIZIZ) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str = (String) obj;
                    if (((Number) ListProtector.get(C348070Dkj.LIZJ, i)).intValue() == 1) {
                        interfaceC347430Djh.getLogger().p(str);
                    } else {
                        interfaceC347430Djh.getLogger().LIZ(str);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            ((ArrayList) C348070Dkj.LIZIZ).clear();
            ((ArrayList) C348070Dkj.LIZJ).clear();
        }
    }

    public final void LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(": ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZ != null) {
            LIZLLL().getLogger().LIZ(strLIZIZ);
            return;
        }
        synchronized (C348070Dkj.LIZ) {
            ((ArrayList) C348070Dkj.LIZIZ).add(strLIZIZ);
            ((ArrayList) C348070Dkj.LIZJ).add(0);
        }
    }

    public final void LJI(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(": ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (this.LIZ != null) {
            LIZLLL().getLogger().p(strLIZIZ);
            return;
        }
        synchronized (C348070Dkj.LIZ) {
            ((ArrayList) C348070Dkj.LIZIZ).add(strLIZIZ);
            ((ArrayList) C348070Dkj.LIZJ).add(1);
        }
    }
}

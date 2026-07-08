package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.19FH, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19FH extends C19F0<Object> {
    public final /* synthetic */ C19FF LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ AnonymousClass1433<Object, Object> LIZJ;

    @Override // X.C19F0
    public final void LIZIZ() {
        this.LIZ.LJFF(this.LIZIZ);
    }

    @Override // X.C19F0
    public final void LIZ(Object obj) throws Exception {
        Object obj2 = ((LinkedHashMap) this.LIZ.LIZIZ).get(this.LIZIZ);
        AnonymousClass1433<Object, Object> anonymousClass1433 = this.LIZJ;
        if (obj2 != null) {
            int iIntValue = ((Number) obj2).intValue();
            ((ArrayList) this.LIZ.LIZLLL).add(this.LIZIZ);
            try {
                this.LIZ.LIZIZ(iIntValue, this.LIZJ, obj);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                ((ArrayList) this.LIZ.LIZLLL).remove(this.LIZIZ);
                throw e;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Attempting to launch an unregistered ActivityResultLauncher with contract ");
        sbLIZ.append(anonymousClass1433);
        sbLIZ.append(" and input ");
        sbLIZ.append(obj);
        sbLIZ.append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public C19FH(C19FF c19ff, String str, AnonymousClass1433<Object, Object> anonymousClass1433) {
        this.LIZ = c19ff;
        this.LIZIZ = str;
        this.LIZJ = anonymousClass1433;
    }
}

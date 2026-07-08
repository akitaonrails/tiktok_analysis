package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import net.bytedance.zdplib.DeltaSignerVerifier;
import org.json.JSONException;

/* JADX INFO: renamed from: X.08RB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08RB extends C09AY implements Function0<C08R8> {
    public final /* synthetic */ C08RA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08RB(C08RA c08ra) {
        super(0);
        this.LL = c08ra;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.08R8] */
    @Override // kotlin.jvm.functions.Function0
    public final C08R8 invoke() {
        final Context applicationContext = this.LL.LIZIZ().getApplicationContext();
        return new C08R9<C08R6, String>(applicationContext) { // from class: X.08R8
            @Override // X.C08R9
            public final C08R6 LIZ(String str) throws JSONException {
                try {
                    String strLIZ = DeltaSignerVerifier.LIZ();
                    DeltaSignerVerifier deltaSignerVerifier = new DeltaSignerVerifier(strLIZ);
                    String strLIZJ = deltaSignerVerifier.LIZJ();
                    SharedPreferences.Editor editorEdit = this.LIZJ.edit();
                    editorEdit.putString(LIZJ(), strLIZJ);
                    editorEdit.putString(LIZIZ(), strLIZ);
                    editorEdit.apply();
                    C0XNL.LIZLLL(0, null, str, true);
                    return new C08R6(true, strLIZJ, deltaSignerVerifier);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C0XNL.LIZLLL(-1, Log.getStackTraceString(th), str, true);
                    return null;
                }
            }

            @Override // X.C08R9
            public final C08R6 LIZLLL(String str) throws JSONException {
                boolean z;
                try {
                    String string = this.LIZJ.getString(LIZJ(), null);
                    String string2 = this.LIZJ.getString(LIZIZ(), null);
                    boolean z2 = true;
                    if (string2 != null && string2.length() != 0 && string != null && string.length() != 0) {
                        DeltaSignerVerifier deltaSignerVerifier = new DeltaSignerVerifier(string2);
                        if (Intrinsics.LJFF(string, deltaSignerVerifier.LIZJ())) {
                            C0XNL.LIZLLL(0, null, str, false);
                            return new C08R6(false, string, deltaSignerVerifier);
                        }
                        C0XNL.LIZLLL(-1, "the public key from sp doesn't match the one from the deltaSignerVerifier", str, false);
                        return null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("shared preferences is empty, priKey null? ");
                    if (string2 != null && string2.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    sbLIZ.append(z);
                    sbLIZ.append(", pubKey null? ");
                    if (string != null && string.length() != 0) {
                        z2 = false;
                    }
                    sbLIZ.append(z2);
                    C0XNL.LIZLLL(-1, C2188811AlT.LIZIZ(sbLIZ), str, false);
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("exception=");
                    sbLIZ2.append(th.getMessage());
                    C0XNL.LIZLLL(-1, C2188811AlT.LIZIZ(sbLIZ2), str, false);
                    return null;
                }
            }
        };
    }
}

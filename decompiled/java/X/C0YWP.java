package X;

import com.bytedance.tts.pigeon.GECPigeon;
import java.util.Map;
import kotlin.jvm.internal.AwS39S2100000_14;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YWP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YWP implements C0YJ8, InterfaceC868790Y6j {
    public final GECPigeon LIZ;

    @Override // X.InterfaceC868790Y6j
    public final InterfaceC870760YDy LIZ() {
        return null;
    }

    @Override // X.InterfaceC868790Y6j
    public final void LIZJ(String str, String str2, Throwable th) {
    }

    @Override // X.InterfaceC868790Y6j
    public final void LJI(String str, String str2, Throwable th) {
    }

    @Override // X.C0YJ8
    public final Map<String, String> LJIIIIZZ(String str) {
        return null;
    }

    public C0YWP(GECPigeon gECPigeon) {
        this.LIZ = gECPigeon;
    }

    @Override // X.C0YJ8
    public final void LIZIZ(String str, JSONObject jSONObject) {
        GECPigeon.Companion.getClass();
        C872060YIy.LIZ().LIZ().LIZ(str, new C5183020f(jSONObject, 219));
    }

    @Override // X.C0YJ8
    public final void LIZLLL(String str, Throwable th) {
        this.LIZ.getPigeonDepend().LIZIZ();
    }

    @Override // X.InterfaceC868790Y6j
    public final void LJ(String str, String str2, Throwable th) {
        C0YXD.LIZJ(this.LIZ, new AwS39S2100000_14(str, str2, th, 5));
    }

    @Override // X.InterfaceC868790Y6j
    public final void LJFF(String str, String str2, Throwable th) {
        C0YXD.LIZJ(this.LIZ, new AwS39S2100000_14(str, str2, th, 4));
    }

    @Override // X.C0YJ8
    public final void LJII(String str, Throwable th, Map<String, String> map) {
        this.LIZ.getPigeonDepend().LIZIZ();
    }

    @Override // X.C0YJ8
    public final void LJIIIZ(JSONObject jSONObject, String str, float f) {
        LIZIZ(str, jSONObject);
    }
}

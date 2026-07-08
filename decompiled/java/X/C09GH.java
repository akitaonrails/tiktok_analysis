package X;

import com.bytedance.android.livesdk.livesetting.subscription.LivePcsHighIntentUserIdentificationSetting;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09GH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09GH implements InterfaceC1123070fKb {
    public final String LIZ;
    public final Function1<AbstractC1122140fJ6, Unit> LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final Map<String, Object> LJ;
    public final Function1<AbstractC1122140fJ6, Unit> LJFF;
    public final String LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C09GH)) {
            return false;
        }
        C09GH c09gh = (C09GH) obj;
        return Intrinsics.LJFF(this.LIZ, c09gh.LIZ) && Intrinsics.LJFF(this.LIZIZ, c09gh.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighIntentClientAiInferenceRequest(comment=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inferenceResult=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1123070fKb
    public final Map<String, Object> LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1123070fKb
    public final String LIZIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1123070fKb
    public final Function1<AbstractC1122140fJ6, Unit> LIZJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1123070fKb
    public final String getScene() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1123070fKb
    public final boolean isActive() {
        return this.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C09GH(String str, Function1<? super AbstractC1122140fJ6, Unit> function1) {
        this.LIZ = str;
        this.LIZIZ = function1;
        LivePcsHighIntentUserIdentificationSetting livePcsHighIntentUserIdentificationSetting = LivePcsHighIntentUserIdentificationSetting.INSTANCE;
        this.LIZJ = livePcsHighIntentUserIdentificationSetting.getAndroidScene();
        this.LIZLLL = livePcsHighIntentUserIdentificationSetting.isEnabled();
        this.LJ = C2097908Jt.LIZJ(new Pair("text", str));
        this.LJFF = function1;
        this.LJI = "pitaya_output";
    }
}

package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS561S0100000_17;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fnc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141060fnc implements InterfaceC1140400fmY {
    public final C1139800fla LL;
    public final InterfaceC1141000fnW LLILLJJLI;
    public C1141170fnn LLILLL;
    public final InterfaceC1141570foR LLILZ;
    public final Map<String, InterfaceC1138440fjO> LLILZIL;

    @Override // X.InterfaceC1140400fmY
    public final void LIZJ() {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    @Override // X.InterfaceC1140400fmY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void start() {
        /*
            Method dump skipped, instruction units count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1141060fnc.start():void");
    }

    @Override // X.InterfaceC1140400fmY
    public final void stop() {
        C1141290fnz.LJFF(new AwS561S0100000_17(this, 615));
    }

    @Override // X.InterfaceC1140400fmY
    public final EnumC1138990fkH LIZ() {
        return EnumC1138990fkH.LYNX;
    }

    @Override // X.InterfaceC1140400fmY
    public final void LIZIZ(JSONObject jSONObject) {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        C1141170fnn c1141170fnn = this.LLILLL;
        if (c1141170fnn != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c1141170fnn.LLIZLLLIL) != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LIZ("live_stream_self_side_layout_update", jSONObject);
        }
    }

    public C1141060fnc(C1139800fla c1139800fla, InterfaceC1141000fnW interfaceC1141000fnW) {
        this.LL = c1139800fla;
        this.LLILLJJLI = interfaceC1141000fnW;
        Object obj = ((LinkedHashMap) c1139800fla.LJFF).get(InterfaceC1141570foR.class);
        this.LLILZ = (InterfaceC1141570foR) (obj == null ? null : obj);
        this.LLILZIL = c1139800fla.LJIJ;
    }
}

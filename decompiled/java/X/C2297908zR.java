package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08zR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2297908zR extends C09AY implements Function0<C2260408tO> {
    public C2297908zR() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.08tO] */
    @Override // kotlin.jvm.functions.Function0
    public final C2260408tO invoke() {
        return new InterfaceC1637880siw() { // from class: X.08tO
            @Override // X.InterfaceC1637880siw
            public final boolean LJIIJ() {
                return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LJFF(0.0d, "ttlive_load_sticker_list_all");
            }

            @Override // X.InterfaceC1637880siw
            public final void LJI(String str) {
                C1AF0.LIZJ(str);
            }

            @Override // X.InterfaceC1637880siw
            public final void LJ(String str, Throwable th) {
                C1AF0.LJFF(th, str);
            }

            @Override // X.InterfaceC1637880siw
            public final void LJII(String str, JSONObject jSONObject) {
                C794240VDq.LIZJ(str, jSONObject);
            }

            @Override // X.InterfaceC1637880siw
            public final void LJIIIIZZ(String str, Map<String, String> map) {
                C20684915wt.LJFF(str, map);
            }

            @Override // X.InterfaceC1637880siw
            public final void LJIIL(String str, JSONObject jSONObject) {
                C20684815ws.LJIJ(str, jSONObject);
            }

            @Override // X.InterfaceC1637880siw
            public final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                C793770VBv.LJII(str, jSONObject, jSONObject2, null);
            }

            @Override // X.InterfaceC1637880siw
            public final void LIZIZ(float f, String str, String str2) {
                C794240VDq.LJFF(str, str2, f);
            }

            @Override // X.InterfaceC1637880siw
            public final void LJFF(String str, JSONObject jSONObject, JSONObject jSONObject2) {
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJFF(str, jSONObject, jSONObject2);
                C2081808Do.LIZIZ(C2081808Do.LIZ, str, null, jSONObject, jSONObject2, null, 50);
            }

            @Override // X.InterfaceC1637880siw
            public final void LJIIJJI(int i, String str, JSONObject jSONObject) {
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI(str, i, jSONObject);
                C2081808Do.LIZIZ(C2081808Do.LIZ, str, Integer.valueOf(i), null, jSONObject, null, 52);
            }

            @Override // X.InterfaceC1637880siw
            public final void LJIILIIL(String str, String str2, JSONObject jSONObject) {
                C794240VDq.LIZIZ(str, str2, jSONObject);
                C2081808Do.LIZIZ(C2081808Do.LIZ, str2, null, null, jSONObject, str, 38);
            }

            @Override // X.InterfaceC1637880siw
            public final void LIZJ(String str, int i, JSONObject jSONObject, Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI(str, i, jSONObject);
                if (zBooleanValue) {
                    C2081808Do.LIZIZ(C2081808Do.LIZ, str, Integer.valueOf(i), null, jSONObject, null, 52);
                }
            }

            @Override // X.InterfaceC1637880siw
            public final void LIZLLL(String str, int i, JSONObject jSONObject, Boolean bool) {
                boolean zBooleanValue = bool.booleanValue();
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIJJI(str, i, jSONObject);
                if (zBooleanValue) {
                    C2081808Do.LIZIZ(C2081808Do.LIZ, str, Integer.valueOf(i), null, jSONObject, null, 20);
                }
            }

            @Override // X.InterfaceC1637880siw
            public final void LJIIIZ(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
                CopyOnWriteArrayList<Runnable> copyOnWriteArrayList = C794240VDq.LIZ;
                C793770VBv.LJIIIZ(str, i, jSONObject, jSONObject2);
                C2081808Do.LIZIZ(C2081808Do.LIZ, str, Integer.valueOf(i), jSONObject, jSONObject2, null, 48);
            }
        };
    }
}

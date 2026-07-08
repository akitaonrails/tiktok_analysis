package X;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0C9f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C308970C9f extends C09AY implements Function2<String, Boolean, C0VWP> {
    public C308970C9f() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0VWP] */
    @Override // kotlin.jvm.functions.Function2
    public final C0VWP invoke(String str, Boolean bool) {
        final String str2 = str;
        final C0V2A c0v2a = new C0V2A(str2, bool.booleanValue());
        return new InterfaceC1563050qmF() { // from class: X.0VWP
            @Override // X.InterfaceC1563050qmF
            public final void start() {
                C314640CVa.LIZ(str2);
                c0v2a.LJFF();
            }

            @Override // X.InterfaceC1563050qmF
            public final void stop() {
                C314640CVa.LIZLLL(str2);
                c0v2a.LJI();
            }

            @Override // X.InterfaceC1563050qmF
            public final void LIZ(final C1563030qmD c1563030qmD) {
                c0v2a.LIZLLL(new C0V22() { // from class: X.0VWR
                    @Override // X.C0V22
                    public final void LIZIZ(double d) {
                        c1563030qmD.LIZIZ(d);
                    }
                });
            }

            @Override // X.InterfaceC1563050qmF
            public final void LIZIZ(final C1563030qmD c1563030qmD) {
                c0v2a.LIZJ(new InterfaceC791210V1z() { // from class: X.0VWQ
                    @Override // X.InterfaceC791210V1z
                    public final void LIZLLL(JSONObject jSONObject) {
                        c1563030qmD.LIZLLL(jSONObject);
                    }
                });
            }
        };
    }
}

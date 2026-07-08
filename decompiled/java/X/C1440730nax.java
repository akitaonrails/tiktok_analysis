package X;

import com.ss.android.ugc.aweme.creative.compileconfig.strategies.CompileStrategyJsonStruct;
import com.ss.android.ugc.aweme.creative.compileconfig.strategies.source.CanvasCompileConfigParams;
import kotlin.jvm.internal.AwS388S0200000_22;

/* JADX INFO: renamed from: X.0nax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440730nax {
    public final C1440830nb7 LIZ;

    public final CanvasCompileConfigParams LIZ() {
        C1437640nVy c1437640nVy = new C1437640nVy();
        C1440760nb0<CanvasCompileConfigParams> c1440760nb0LIZ = C1440630nan.LIZ();
        c1440760nb0LIZ.LIZ(C1440310naH.LIZ, new AwS388S0200000_22(this, c1437640nVy, 267));
        if (this.LIZ.LIZIZ || !C0BUE.LIZLLL) {
            c1440760nb0LIZ.LIZ(new CompileStrategyJsonStruct() { // from class: X.0nb8
            }, new AwS388S0200000_22(this, c1437640nVy, 269));
        } else {
            c1440760nb0LIZ.LIZ(new CompileStrategyJsonStruct() { // from class: X.0nb8
            }, new AwS388S0200000_22(this, c1437640nVy, 268));
        }
        return (CanvasCompileConfigParams) c1440760nb0LIZ.execute();
    }

    public C1440730nax(C1440830nb7 c1440830nb7) {
        this.LIZ = c1440830nb7;
    }
}

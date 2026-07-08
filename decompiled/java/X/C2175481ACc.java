package X;

import android.graphics.Rect;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1ACc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2175481ACc {
    public C940490aa7 LIZ;
    public C945320ahu LIZIZ;
    public Pair<Integer, Integer> LIZJ;
    public C1777090wLT LIZLLL;
    public C1777100wLU LJ;
    public Integer LJFF;
    public Function1<? super Rect, Unit> LJI;
    public Integer LJII;
    public boolean LJIIIIZZ;
    public InterfaceC958990b3x LJIIIZ;
    public InterfaceC940230aZh LJIIJ;
    public LiveWidget LJIIJJI;
    public InterfaceC940300aZo LJIIL;

    public final void LIZ(InterfaceC2175461ACa interfaceC2175461ACa) {
        C940490aa7 c940490aa7 = this.LIZ;
        if (c940490aa7 != null) {
            interfaceC2175461ACa.LJIJJ(c940490aa7);
        }
        interfaceC2175461ACa.LJJI(this.LJIIIZ);
        interfaceC2175461ACa.LJIIL(this.LJIIJ);
        interfaceC2175461ACa.LJIIZILJ(this.LJIIJJI);
        interfaceC2175461ACa.LJIL(this.LJIIL);
        Function1<? super Rect, Unit> function1 = this.LJI;
        if (function1 != null) {
            interfaceC2175461ACa.LJJIIZI(function1);
        }
        Integer num = this.LJFF;
        if (num != null) {
            interfaceC2175461ACa.LJJIIZ(num.intValue());
        }
        Pair<Integer, Integer> pair = this.LIZJ;
        if (pair != null) {
            interfaceC2175461ACa.LJJIFFI(pair.getFirst().intValue(), pair.getSecond().intValue());
        }
        C1777090wLT c1777090wLT = this.LIZLLL;
        if (c1777090wLT != null) {
            interfaceC2175461ACa.LJIILIIL(c1777090wLT.LIZIZ, c1777090wLT.LIZJ, c1777090wLT.LIZ);
        }
        C1777100wLU c1777100wLU = this.LJ;
        if (c1777100wLU != null) {
            interfaceC2175461ACa.LJIIIIZZ(c1777100wLU.LIZ, c1777100wLU.LIZIZ, c1777100wLU.LIZJ, c1777100wLU.LIZLLL);
        }
        Integer num2 = this.LJII;
        if (num2 != null) {
            interfaceC2175461ACa.LJJ(num2.intValue());
        }
        if (this.LJIIIIZZ) {
            interfaceC2175461ACa.LJII();
        }
    }
}

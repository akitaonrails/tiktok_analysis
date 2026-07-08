package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1696680uFm extends C2217421BqW implements InterfaceC1631620sYq<C1696700uFo, C1680770tq7, Function1<? super InterfaceC1675870tiD, ? extends Unit>, Boolean> {
    public C1696680uFm(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [X.0uFl, android.view.View$DragShadowBuilder] */
    @Override // X.InterfaceC1631620sYq
    public final Boolean invoke(C1696700uFo c1696700uFo, C1680770tq7 c1680770tq7, Function1<? super InterfaceC1675870tiD, ? extends Unit> function1) {
        boolean zStartDrag;
        C1696700uFo c1696700uFo2 = c1696700uFo;
        final long j = c1680770tq7.LIZ;
        final Function1<? super InterfaceC1675870tiD, ? extends Unit> function12 = function1;
        View view = (View) this.receiver;
        Resources resources = view.getContext().getResources();
        final C1516420pZ2 c1516420pZ2 = new C1516420pZ2(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale);
        ?? r2 = new View.DragShadowBuilder(c1516420pZ2, j, function12) { // from class: X.0uFl
            public final InterfaceC1690500u5o LIZ;
            public final long LIZIZ;
            public final Function1<InterfaceC1675870tiD, Unit> LIZJ;

            @Override // android.view.View.DragShadowBuilder
            public final void onDrawShadow(Canvas canvas) {
                C1695140uDI c1695140uDI = new C1695140uDI();
                InterfaceC1690500u5o interfaceC1690500u5o = this.LIZ;
                long j2 = this.LIZIZ;
                EnumC1671200tag enumC1671200tag = EnumC1671200tag.Ltr;
                Canvas canvas2 = C1296530jqN.LIZ;
                C1696880uG6 c1696880uG6 = new C1696880uG6();
                c1696880uG6.LIZ = canvas;
                Function1<InterfaceC1675870tiD, Unit> function13 = this.LIZJ;
                C1680390tpV c1680390tpV = c1695140uDI.LL;
                InterfaceC1690500u5o interfaceC1690500u5o2 = c1680390tpV.LIZ;
                EnumC1671200tag enumC1671200tag2 = c1680390tpV.LIZIZ;
                InterfaceC1686290tz1 interfaceC1686290tz1 = c1680390tpV.LIZJ;
                long j3 = c1680390tpV.LIZLLL;
                c1680390tpV.LIZ = interfaceC1690500u5o;
                c1680390tpV.LIZIZ = enumC1671200tag;
                c1680390tpV.LIZJ = c1696880uG6;
                c1680390tpV.LIZLLL = j2;
                c1696880uG6.save();
                function13.invoke(c1695140uDI);
                c1696880uG6.LJIIJ();
                C1680390tpV c1680390tpV2 = c1695140uDI.LL;
                c1680390tpV2.LIZ = interfaceC1690500u5o2;
                c1680390tpV2.LIZIZ = enumC1671200tag2;
                c1680390tpV2.LIZJ = interfaceC1686290tz1;
                c1680390tpV2.LIZLLL = j3;
            }

            @Override // android.view.View.DragShadowBuilder
            public final void onProvideShadowMetrics(Point point, Point point2) {
                InterfaceC1690500u5o interfaceC1690500u5o = this.LIZ;
                point.set(interfaceC1690500u5o.LJLLJ(interfaceC1690500u5o.LLIIIJ(Float.intBitsToFloat((int) (this.LIZIZ >> 32)))), interfaceC1690500u5o.LJLLJ(interfaceC1690500u5o.LLIIIJ(Float.intBitsToFloat((int) (this.LIZIZ & 4294967295L)))));
                point2.set(point.x / 2, point.y / 2);
            }

            {
                this.LIZ = c1516420pZ2;
                this.LIZIZ = j;
                this.LIZJ = function12;
            }
        };
        if (Build.VERSION.SDK_INT >= 24) {
            zStartDrag = C1696690uFn.LIZ(view, c1696700uFo2, r2);
        } else {
            c1696700uFo2.getClass();
            zStartDrag = view.startDrag(null, r2, null, 0);
        }
        return Boolean.valueOf(zStartDrag);
    }
}

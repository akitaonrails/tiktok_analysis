package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.billboard.IBillboardService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eX8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092400eX8 extends C09AY implements Function1<Function1<? super Bitmap, ? extends Unit>, Unit> {
    public final /* synthetic */ C1092090eWd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1092400eX8(C1092090eWd c1092090eWd) {
        super(1);
        this.LL = c1092090eWd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function1<? super Bitmap, ? extends Unit> function1) {
        boolean z;
        View view;
        View view2;
        C486401uw c486401uw;
        Function1<? super Bitmap, ? extends Unit> function12 = function1;
        DataChannel dataChannel = this.LL.getDataChannel();
        Object first = 0;
        first = 0;
        if (dataChannel != null && (c486401uw = (C486401uw) dataChannel.gg0(C1083460eIi.class)) != null && c486401uw.LIZIZ != null) {
            z = true;
        } else {
            z = false;
        }
        C1092090eWd c1092090eWd = this.LL;
        ArrayList<InterfaceC1092420eXA> arrayList = new ArrayList();
        arrayList.addAll(C09RB.LJJII(C09RB.LJIIIZ(C09RB.LJIJI(new C09RD(c1092090eWd), new C1092300eWy()), new C1092290eWx())));
        if (z) {
            final C1103880epe c1103880epeW01 = ((IBillboardService) C1161920gLG.LIZJ(IBillboardService.class)).W01();
            if ((c1103880epeW01 instanceof ViewGroup) && c1103880epeW01 != null) {
                arrayList.add(new InterfaceC1092420eXA(c1103880epeW01) { // from class: X.0eX0
                    public final ViewGroup LL;

                    @Override // X.InterfaceC1092420eXA
                    public final C1092430eXB getPositionAndDimensions() {
                        this.LL.getGlobalVisibleRect(new Rect());
                        return new C1092430eXB(r1.left, r1.top, this.LL.getWidth(), this.LL.getHeight());
                    }

                    @Override // X.InterfaceC1092420eXA
                    public final float getRadiusPx() {
                        return C418440Gaw.LIZIZ(8);
                    }

                    @Override // X.InterfaceC1092420eXA
                    public final ViewGroup getCaptureView() {
                        return this.LL;
                    }

                    {
                        this.LL = c1103880epeW01;
                    }
                });
            }
        }
        if (!arrayList.isEmpty()) {
            for (InterfaceC1092420eXA interfaceC1092420eXA : arrayList) {
                if ((interfaceC1092420eXA instanceof C1092220eWq) && (view2 = (View) interfaceC1092420eXA) != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view2);
                    view2.setAlpha(1.0f);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C1092430eXB positionAndDimensions = ((InterfaceC1092420eXA) it2.next()).getPositionAndDimensions();
                if (positionAndDimensions != null) {
                    arrayList2.add(positionAndDimensions);
                }
            }
            C1092410eX9 c1092410eX9LIZIZ = C1092440eXC.LIZIZ(arrayList2);
            Pair pairLIZJ = C1092440eXC.LIZJ((int) (c1092410eX9LIZIZ.LIZJ + (c1092410eX9LIZIZ.LIZLLL * 2)));
            if (pairLIZJ != null) {
                first = pairLIZJ.getFirst();
                Canvas canvas = (Canvas) pairLIZJ.getSecond();
                for (InterfaceC1092420eXA interfaceC1092420eXA2 : arrayList) {
                    C1092430eXB positionAndDimensions2 = interfaceC1092420eXA2.getPositionAndDimensions();
                    if (positionAndDimensions2 != null) {
                        float f = positionAndDimensions2.LIZ;
                        float f2 = positionAndDimensions2.LIZIZ;
                        float f3 = f - c1092410eX9LIZIZ.LIZ;
                        float f4 = c1092410eX9LIZIZ.LIZLLL;
                        float f5 = f3 + f4 + c1092410eX9LIZIZ.LJ;
                        float f6 = (f2 - c1092410eX9LIZIZ.LIZIZ) + f4 + c1092410eX9LIZIZ.LJFF;
                        int iSave = canvas.save();
                        canvas.translate(f5, f6);
                        try {
                            try {
                                ViewGroup captureView = interfaceC1092420eXA2.getCaptureView();
                                int iLIZ = C1092440eXC.LIZ(canvas, captureView, interfaceC1092420eXA2.getRadiusPx());
                                C842150X1x.LIZIZ(canvas, captureView);
                                if (iLIZ >= 0) {
                                    canvas.restoreToCount(iLIZ);
                                }
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                            canvas.restoreToCount(iSave);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            canvas.restoreToCount(iSave);
                            throw th;
                        }
                    }
                }
                for (InterfaceC1092420eXA interfaceC1092420eXA3 : arrayList) {
                    if ((interfaceC1092420eXA3 instanceof C1092220eWq) && (view = (View) interfaceC1092420eXA3) != null) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
                        view.setAlpha(0.0f);
                    }
                }
            }
        }
        function12.invoke(first);
        return Unit.LIZ;
    }
}

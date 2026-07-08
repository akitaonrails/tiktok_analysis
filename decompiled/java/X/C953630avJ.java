package X;

import android.graphics.Bitmap;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0avJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C953630avJ extends C2217421BqW implements Function1<Bitmap, Unit> {
    public final /* synthetic */ C953610avH LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C953630avJ(C953610avH c953610avH) {
        super(1, C1449605lu.class, "doPush", "updateStub$doPush(Lcom/bytedance/android/live/liveinteract/multiguestv3/main/theme/noticeboard/anchor/NoticeboardController;Landroid/graphics/Bitmap;)V", 0);
        this.LL = c953610avH;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        C953610avH c953610avH = this.LL;
        C953670avN c953670avN = C953610avH.LJJI;
        MultiCanvasUtils.LIZ.getClass();
        if (MultiCanvasUtils.LJIIZILJ(bitmap2)) {
            Integer numValueOf = null;
            int value = c953610avH.LJIILJJIL(null).getValue();
            if (value == 4 || value == 5) {
                C20441214yg.LJIIIZ("NoticeboardController", "updateStub");
                String str = c953610avH.LJIILL;
                boolean z = true;
                if (str != null && bitmap2 != null) {
                    InterfaceC954180awC interfaceC954180awCUU1 = C915980Zwa.LJIIIIZZ().UU1();
                    if (interfaceC954180awCUU1 != null) {
                        interfaceC954180awCUU1.LJJZZI(str, C953620avI.LIZIZ(bitmap2));
                    }
                    InterfaceC954180awC interfaceC954180awCUU12 = C915980Zwa.LJIIIIZZ().UU1();
                    if (interfaceC954180awCUU12 != null) {
                        interfaceC954180awCUU12.LJIJJ(str, C953620avI.LIZJ(bitmap2, true));
                    }
                }
                c953610avH.LJIIZILJ();
                String str2 = c953610avH.LJIILL;
                if (str2 != null) {
                    C20441214yg.LJIIIZ("NoticeboardController", "startedAuxStream begin");
                    InterfaceC954180awC interfaceC954180awCUU13 = C915980Zwa.LJIIIIZZ().UU1();
                    if (interfaceC954180awCUU13 != null) {
                        numValueOf = Integer.valueOf(interfaceC954180awCUU13.startAuxStream(str2));
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("startedAuxStream startResult=");
                    sbLIZ.append(numValueOf);
                    C20441214yg.LJIIIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ));
                    if (numValueOf == null || numValueOf.intValue() != 0) {
                        z = false;
                    }
                    c953610avH.LJIJ(z);
                }
                C953620avI.LJIILIIL(value, c953610avH.LJIILL);
            }
        }
        return Unit.LIZ;
    }
}

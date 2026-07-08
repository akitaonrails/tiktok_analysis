package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AX0, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AX0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2180901AWy LL;
    public final /* synthetic */ Function1<String, C1AYF> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1AX0(C2180901AWy c2180901AWy, Function1<? super String, C1AYF> function1) {
        super(0);
        this.LL = c2180901AWy;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final Layout layoutLIZ = this.LL.LLJLIL.LIZ(true);
        if (layoutLIZ != null) {
            final C2180901AWy c2180901AWy = this.LL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(layoutLIZ.layoutId);
            sbLIZ.append(' ');
            sbLIZ.append(c2180901AWy.getCurrentDrawLayoutId());
            C20441214yg.LIZIZ("LayoutViewV2SwitchLayout", C2188811AlT.LIZIZ(sbLIZ));
            if (Intrinsics.LJFF(layoutLIZ.layoutId, c2180901AWy.getCurrentDrawLayoutId())) {
                c2180901AWy.LJJ();
            } else {
                c2180901AWy.LLJLL.LLLLL(c2180901AWy);
                c2180901AWy.getWindowList().clear();
                C786410Ut5.LJJJLL(c2180901AWy.getInteractLayer());
                int iLIZIZ = c2180901AWy.LLJLIL.LIZIZ(layoutLIZ);
                if (iLIZIZ > 0) {
                    HandlerHook.viewPost(c2180901AWy, new Runnable() { // from class: X.1AEy
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("LayoutViewV2@2f4f.switchLayout$1");
                            try {
                                c2180901AWy.LJFF(layoutLIZ);
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("LayoutViewV2@2f4f.switchLayout$1");
                        }
                    });
                    for (int i = 0; i < iLIZIZ; i++) {
                        c2180901AWy.LJIJJLI(i, c2180901AWy.LLJLILLLLZIIL.LJIILIIL(i), layoutLIZ, C13BV.INSTANCE);
                    }
                } else {
                    c2180901AWy.getPath().reset();
                }
                final ArrayList arrayList = new ArrayList();
                arrayList.addAll(c2180901AWy.getWindowList());
                c2180901AWy.setCurrentDrawLayoutId(layoutLIZ.layoutId);
                HandlerHook.viewPost(c2180901AWy, new Runnable() { // from class: X.1AX5
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LayoutViewV2@2f4f.switchLayout$2");
                        try {
                            c2180901AWy.LLJLL.LJJLIIIJLLLLLLLZ(arrayList);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LayoutViewV2@2f4f.switchLayout$2");
                    }
                });
                HandlerHook.viewPost(c2180901AWy, new Runnable() { // from class: X.1AX8
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("LayoutViewV2@2f4f.invoke$3$1$1");
                        try {
                            C2180901AWy c2180901AWy2 = c2180901AWy;
                            c2180901AWy2.LLJLL.LLIILII(c2180901AWy2, 1);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("LayoutViewV2@2f4f.invoke$3$1$1");
                    }
                });
            }
        }
        return Unit.LIZ;
    }
}

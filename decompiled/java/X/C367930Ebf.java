package X;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ebf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367930Ebf extends AbstractC367990Ebl {
    public final C19EG LJIILLIIL;
    public final String LJIIZILJ;
    public final FrameCacheViewModel LJIJ;
    public final C368030Ebp LJIJI;
    public InterfaceC368720Ecw LJIJJ;
    public final EnumC367680EbG LJIJJLI;
    public int LJIL;
    public int LJJ;

    @Override // X.AbstractC367990Ebl
    public final int LJII() {
        return 6;
    }

    @Override // X.AbstractC367990Ebl
    public final long LJ() {
        int i = C368220Ec8.LLLLLILLIL;
        return C368220Ec8.LLLLLJIL;
    }

    @Override // X.AbstractC367990Ebl
    public final int LJI() {
        int i = C367760EbO.LLILZIL;
        return C367760EbO.LLILZIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC367990Ebl
    public final void LJIILJJIL() {
        if (this.LJFF) {
            return;
        }
        float f = C367760EbO.LLILZLL / 2.0f;
        float f2 = C367760EbO.LLILZIL / 2.0f;
        Integer num = (Integer) LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).getValue();
        boolean z = true;
        if (num != null && num.intValue() == 1) {
            z = false;
        }
        if (Math.abs(this.LJIL - this.LIZ.getScrollX()) >= f) {
            this.LJIL = this.LIZ.getScrollX();
            this.LJIJ.wQ2().LJFF(z);
        } else if (Math.abs(this.LJJ - this.LIZ.getScrollY()) >= f2) {
            this.LJJ = this.LIZ.getScrollY();
            this.LJIJ.wQ2().LJFF(z);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Ebe] */
    @Override // X.InterfaceC369090EdX
    public final InterfaceC368720Ecw LIZ(int i, C368630Ecn c368630Ecn) {
        return new C367760EbO(this.LJIILLIIL, new InterfaceC367910Ebd() { // from class: X.0Ebe
            @Override // X.InterfaceC367910Ebd
            public final void j() {
                FrameCacheViewModel.yQ2(this.LIZ.LJIJ);
            }

            @Override // X.InterfaceC367910Ebd
            public final Bitmap LIZIZ(int i2, String str) {
                return this.LIZ.LJIJ.vQ2(i2, str);
            }
        }, this.LIZ.getTrackViewModelCompat());
    }

    @Override // X.AbstractC367990Ebl
    public final void LJIILLIIL(Pair<? extends NLETrackSlot, C369110EdZ> pair, boolean z) {
        C367760EbO c367760EbO;
        C367620EbA c367620EbA;
        C367760EbO c367760EbO2;
        C367620EbA c367620EbA2;
        C369110EdZ second;
        super.LJIILLIIL(pair, z);
        if (!z) {
            LJIILL(pair);
        }
        InterfaceC368720Ecw interfaceC368720Ecw = null;
        if (pair != null && (second = pair.getSecond()) != null) {
            interfaceC368720Ecw = second.LIZIZ;
        }
        if (!Intrinsics.LJFF(this.LJIJJ, interfaceC368720Ecw)) {
            InterfaceC368720Ecw interfaceC368720Ecw2 = this.LJIJJ;
            if ((interfaceC368720Ecw2 instanceof C367760EbO) && (c367760EbO2 = (C367760EbO) interfaceC368720Ecw2) != null && (c367620EbA2 = c367760EbO2.LLILZ) != null) {
                c367620EbA2.LLJJJJJIL = EnumC367680EbG.NONE;
                if (c367620EbA2.LLJILJILJ) {
                    ViewGroup parentView = c367620EbA2.getParentView();
                    if (parentView != null) {
                        parentView.invalidate();
                    }
                } else {
                    c367620EbA2.invalidate();
                }
            }
            if ((interfaceC368720Ecw instanceof C367760EbO) && (c367760EbO = (C367760EbO) interfaceC368720Ecw) != null && (c367620EbA = c367760EbO.LLILZ) != null) {
                c367620EbA.LLJJJJJIL = this.LJIJJLI;
                if (c367620EbA.LLJILJILJ) {
                    ViewGroup parentView2 = c367620EbA.getParentView();
                    if (parentView2 != null) {
                        parentView2.invalidate();
                    }
                } else {
                    c367620EbA.invalidate();
                }
            }
        }
        this.LJIJJ = interfaceC368720Ecw;
    }

    public C367930Ebf(C19EG c19eg, C368630Ecn c368630Ecn, C368680Ecs c368680Ecs, C369220Edk c369220Edk, C368450EcV c368450EcV) {
        super(c368630Ecn, c368680Ecs, c369220Edk, c368450EcV);
        this.LJIILLIIL = c19eg;
        this.LJIIZILJ = "MuxerTrackAdapter";
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        FrameCacheViewModel frameCacheViewModel = (FrameCacheViewModel) C364210EPr.LIZIZ(FrameCacheViewModel.class);
        this.LJIJ = frameCacheViewModel;
        C368030Ebp c368030Ebp = new C368030Ebp(c368630Ecn, C367760EbO.LLILZIL, AbstractC367990Ebl.LJIILL);
        C370920EgU c370920EgUWQ2 = frameCacheViewModel.wQ2();
        C23250099c.LIZLLL(c370920EgUWQ2, c370920EgUWQ2.LLJILJIL, null, new C358360E3e(c370920EgUWQ2, c368030Ebp, null), 2);
        this.LJIJI = c368030Ebp;
        this.LJIJJLI = EnumC367680EbG.NONE;
    }

    @Override // X.InterfaceC369090EdX
    public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
        C355090Dw3.LIZIZ(this.LJIIZILJ, "onMove ");
    }
}

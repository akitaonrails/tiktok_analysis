package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Ec7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368210Ec7 extends View implements InterfaceC369200Edi {
    public final C01GW LL;
    public C0E6E LLILLJJLI;
    public NLETrackSlot LLILLL;
    public final int LLILZ;
    public InterfaceC369560EeI LLILZIL;

    private final C368260EcC getDrawer() {
        return (C368260EcC) this.LL.getValue();
    }

    @Override // X.InterfaceC369200Edi
    public final boolean LJ() {
        InterfaceC369560EeI interfaceC369560EeI = this.LLILZIL;
        return interfaceC369560EeI != null && interfaceC369560EeI.LIZ();
    }

    @Override // X.InterfaceC369200Edi
    public final void refresh() {
        InterfaceC369560EeI interfaceC369560EeI = this.LLILZIL;
        if (interfaceC369560EeI != null && interfaceC369560EeI.LIZ()) {
            C368610Ecl.LIZJ(this);
        }
        InterfaceC369560EeI interfaceC369560EeI2 = this.LLILZIL;
        if (interfaceC369560EeI2 == null || !interfaceC369560EeI2.LIZ() || this.LLILLJJLI == C0E6E.NONE) {
            return;
        }
        invalidate();
    }

    public final void LIZ() {
        getDrawer().getClass();
        invalidate();
    }

    @Override // X.InterfaceC369200Edi
    public int getItemHeight() {
        return getMeasuredHeight();
    }

    @Override // X.InterfaceC369200Edi
    public int getItemWidth() {
        return getMeasuredWidth();
    }

    public final InterfaceC369560EeI getCallback() {
        return this.LLILZIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        VecNLEVideoAnimationSPtr videoAnims;
        super.onDraw(canvas);
        NLETrackSlot nLETrackSlot = this.LLILLL;
        boolean z = true;
        boolean z2 = false;
        if (nLETrackSlot != null && C351220Dpo.LLIIJI(nLETrackSlot)) {
            NLETrackSlot nLETrackSlot2 = this.LLILLL;
            if (nLETrackSlot2 != null && (videoAnims = nLETrackSlot2.getVideoAnims()) != null) {
                if (!videoAnims.isEmpty()) {
                    Iterator<NLEVideoAnimation> it2 = videoAnims.iterator();
                    while (it2.hasNext()) {
                        if (it2.next().getDuration() > 0) {
                            break;
                        }
                    }
                    z = false;
                    z2 = z;
                } else {
                    z = false;
                    z2 = z;
                }
            }
            if (this.LLILLJJLI != C0E6E.NONE && z2) {
                getDrawer().LIZJ(canvas);
            }
        }
    }

    public final void setCallback(InterfaceC369560EeI interfaceC369560EeI) {
        this.LLILZIL = interfaceC369560EeI;
    }

    public final void setViewAnimCallback(InterfaceC369560EeI interfaceC369560EeI) {
        this.LLILZIL = interfaceC369560EeI;
    }

    public C368210Ec7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1174));
        this.LLILLJJLI = C0E6E.NONE;
        this.LLILZ = getId();
    }

    public final void LIZIZ(C0E6E c0e6e, boolean z) {
        InterfaceC369560EeI interfaceC369560EeI;
        this.LLILLJJLI = c0e6e;
        InterfaceC369560EeI interfaceC369560EeI2 = this.LLILZIL;
        if (interfaceC369560EeI2 != null && interfaceC369560EeI2.LIZ()) {
            C368610Ecl.LIZJ(this);
        }
        int i = C0E6H.LIZ[c0e6e.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new C1954807lC();
            }
            int visibility = getVisibility();
            setVisibility(4);
            C1602160rnK.LIZIZ(visibility, 4, this);
            return;
        }
        if (z && (interfaceC369560EeI = this.LLILZIL) != null && interfaceC369560EeI.LIZ()) {
            invalidate();
        }
    }

    public final void LIZJ(NLETrackSlot nLETrackSlot, C0E6E c0e6e) {
        LIZIZ(c0e6e, false);
        this.LLILLL = nLETrackSlot;
        C368260EcC drawer = getDrawer();
        drawer.LJIIIIZZ = nLETrackSlot;
        drawer.LIZ(nLETrackSlot);
        if (drawer.LIZ.LJ()) {
            drawer.LIZ.refresh();
        }
    }
}

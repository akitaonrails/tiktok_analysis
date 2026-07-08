package X;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.18oS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21397018oS extends C21410318qb implements InterfaceC1311940kFE {
    public boolean LLIZ;
    public C21397118oT LLIZLLLIL;
    public InterfaceC21397218oU LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public C1311970kFH LLJILJIL;
    public InterfaceC1321880kVG LLJILJILJ;

    @Override // X.InterfaceC1311940kFE
    public View getView() {
        return this;
    }

    public final C21397118oT LJIIIIZZ() {
        if (this.LLJI) {
            return this.LLIZLLLIL;
        }
        LynxLog.w("LynxEditText", "InputConnection has not been initialized yet ");
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC1321880kVG interfaceC1321880kVG;
        super.onAttachedToWindow();
        setCursorVisible(true);
        int i = this.LLJIJIL;
        if (i == -1 || (interfaceC1321880kVG = this.LLJILJILJ) == null) {
            return;
        }
        interfaceC1321880kVG.LIZ(i);
    }

    public final boolean getMPasting() {
        return this.LLIZ;
    }

    public final InterfaceC1321880kVG getOnAttachedToWindowListener() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1311940kFE
    public C1311970kFH getRenderer() {
        return this.LLJILJIL;
    }

    public C21397018oS(Context context) {
        new LinkedHashMap();
        super(context, null);
        this.LLJIJIL = -1;
        this.LLIZLLLIL = new C21397118oT();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C1311970kFH c1311970kFH = this.LLJILJIL;
        if (c1311970kFH != null) {
            c1311970kFH.LIZ(canvas);
        }
    }

    @Override // X.C21410318qb, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection == null) {
            return null;
        }
        try {
            C21397118oT c21397118oT = this.LLIZLLLIL;
            if (c21397118oT != null) {
                c21397118oT.setTarget(inputConnectionOnCreateInputConnection);
            }
            this.LLJI = true;
            return this.LLIZLLLIL;
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        C1311970kFH c1311970kFH = this.LLJILJIL;
        if (c1311970kFH != null) {
            c1311970kFH.LJ(canvas);
            c1311970kFH.LJ.LIZIZ(canvas);
        }
        super.onDraw(canvas);
    }

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        switch (i) {
            case R.id.copy:
                InterfaceC21397218oU interfaceC21397218oU = this.LLJ;
                if (interfaceC21397218oU != null) {
                    interfaceC21397218oU.LIZ();
                    return true;
                }
                return super.onTextContextMenuItem(i);
            case R.id.paste:
                this.LLIZ = true;
                return super.onTextContextMenuItem(i);
            default:
                return super.onTextContextMenuItem(i);
        }
    }

    public final void setBackSpaceListener(InterfaceC21397318oV interfaceC21397318oV) {
        C21397118oT c21397118oT = this.LLIZLLLIL;
        if (c21397118oT != null) {
            c21397118oT.LIZ = interfaceC21397318oV;
        }
    }

    public final void setCopyListener(InterfaceC21397218oU interfaceC21397218oU) {
        this.LLJ = interfaceC21397218oU;
    }

    public final void setMPasting(boolean z) {
        this.LLIZ = z;
    }

    public final void setOnAttachedToWindowListener(InterfaceC1321880kVG interfaceC1321880kVG) {
        this.LLJILJILJ = interfaceC1321880kVG;
    }

    @Override // X.InterfaceC1311940kFE
    public void setRenderer(C1311970kFH c1311970kFH) {
        this.LLJILJIL = c1311970kFH;
    }

    @Override // X.InterfaceC1311940kFE
    public final C1311970kFH createRenderer(PlatformRendererContext platformRendererContext, int i) {
        return new C1311970kFH(platformRendererContext, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LynxUI<ViewGroup> lynxUI;
        C1311970kFH c1311970kFH = this.LLJILJIL;
        if (c1311970kFH != null && (lynxUI = c1311970kFH.LJII) != null) {
            lynxUI.measure();
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}

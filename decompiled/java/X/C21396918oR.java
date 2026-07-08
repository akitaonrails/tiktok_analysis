package X;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.behavior.render.PlatformRendererContext;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.18oR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21396918oR extends C21410318qb implements InterfaceC1311940kFE {
    public boolean LLIZ;
    public C20586415h0 LLIZLLLIL;
    public boolean LLJ;
    public int LLJI;
    public C1311970kFH LLJIJIL;
    public boolean LLJILJIL;
    public InterfaceC21393418ns LLJILJILJ;

    @Override // X.InterfaceC1311940kFE
    public View getView() {
        return this;
    }

    public final void setBackSpaceListener(InterfaceC20586515h1 interfaceC20586515h1) {
    }

    public final void setCopyListener(InterfaceC21360218iW interfaceC21360218iW) {
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC21393418ns interfaceC21393418ns;
        super.onAttachedToWindow();
        setCursorVisible(true);
        int i = this.LLJI;
        if (i == -1 || (interfaceC21393418ns = this.LLJILJILJ) == null) {
            return;
        }
        interfaceC21393418ns.LIZ(i);
    }

    public final boolean getMHasDrawn() {
        return this.LLJILJIL;
    }

    public final boolean getMPasting() {
        return this.LLIZ;
    }

    public final InterfaceC21393418ns getOnAttachedToWindowListener() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1311940kFE
    public C1311970kFH getRenderer() {
        return this.LLJIJIL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.15h0] */
    public C21396918oR(Context context) {
        new LinkedHashMap();
        super(context, null);
        this.LLJI = -1;
        this.LLIZLLLIL = new InputConnectionWrapper() { // from class: X.15h0
            public static final /* synthetic */ int LIZ = 0;

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean sendKeyEvent(KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 67) {
                    keyEvent.getAction();
                }
                return super.sendKeyEvent(keyEvent);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean commitText(CharSequence charSequence, int i) {
                return super.commitText(charSequence, i);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean deleteSurroundingText(int i, int i2) {
                return super.deleteSurroundingText(i, i2);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean setComposingRegion(int i, int i2) {
                return super.setComposingRegion(i, i2);
            }

            @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
            public final boolean setComposingText(CharSequence charSequence, int i) {
                return super.setComposingText(charSequence, i);
            }
        };
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C1311970kFH c1311970kFH = this.LLJIJIL;
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
            C20586415h0 c20586415h0 = this.LLIZLLLIL;
            if (c20586415h0 != null) {
                c20586415h0.setTarget(inputConnectionOnCreateInputConnection);
            }
            this.LLJ = true;
            return this.LLIZLLLIL;
        } catch (SecurityException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        C1311970kFH c1311970kFH = this.LLJIJIL;
        if (c1311970kFH != null) {
            c1311970kFH.LJ(canvas);
            c1311970kFH.LJ.LIZIZ(canvas);
        }
        super.onDraw(canvas);
        this.LLJILJIL = true;
    }

    @Override // X.C21410318qb, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        switch (i) {
            case R.id.paste:
                this.LLIZ = true;
                break;
        }
        return super.onTextContextMenuItem(i);
    }

    public final void setMHasDrawn(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setMPasting(boolean z) {
        this.LLIZ = z;
    }

    public final void setOnAttachedToWindowListener(InterfaceC21393418ns interfaceC21393418ns) {
        this.LLJILJILJ = interfaceC21393418ns;
    }

    @Override // X.InterfaceC1311940kFE
    public void setRenderer(C1311970kFH c1311970kFH) {
        this.LLJIJIL = c1311970kFH;
    }

    @Override // X.InterfaceC1311940kFE
    public final C1311970kFH createRenderer(PlatformRendererContext platformRendererContext, int i) {
        return new C1311970kFH(platformRendererContext, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LynxUI<ViewGroup> lynxUI;
        C1311970kFH c1311970kFH = this.LLJIJIL;
        if (c1311970kFH != null && (lynxUI = c1311970kFH.LJII) != null) {
            lynxUI.measure();
        }
        super.onLayout(z, i, i2, i3, i4);
    }
}

package X;

import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0uqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719460uqW extends FrameLayout {
    public static final /* synthetic */ int LLILZIL = 0;
    public C1748330vb5 LL;
    public C1754650vlH LLILLJJLI;
    public EditText LLILLL;
    public InterfaceC1719490uqZ LLILZ;

    private final EditText getTuxEditTextIfNeeded() {
        EditText editText = this.LLILLL;
        if (editText != null) {
            return editText;
        }
        EditText editTextLIZJ = LIZJ(getTuxPinFromXml());
        this.LLILLL = editTextLIZJ;
        if (editTextLIZJ != null) {
            editTextLIZJ.addTextChangedListener(new TextWatcher() { // from class: X.0uqX
                public int LL;

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    int length;
                    C1748330vb5 pipoPinErrorMessageFromXml;
                    InterfaceC1719490uqZ callback;
                    if (editable != null) {
                        length = editable.length();
                    } else {
                        length = 0;
                    }
                    if (length < this.LL && (callback = this.LLILLJJLI.getCallback()) != null) {
                        callback.LIZJ();
                    }
                    if (length > this.LL && this.LLILLJJLI.getPipoPinErrorMessageFromXml().getVisibility() == 0 && (pipoPinErrorMessageFromXml = this.LLILLJJLI.getPipoPinErrorMessageFromXml()) != null) {
                        pipoPinErrorMessageFromXml.setMessage("");
                    }
                    InterfaceC1719490uqZ callback2 = this.LLILLJJLI.getCallback();
                    if (callback2 != null) {
                        callback2.LIZIZ(length);
                    }
                }

                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    int length;
                    if (charSequence != null) {
                        length = charSequence.length();
                    } else {
                        length = 0;
                    }
                    this.LL = length;
                }
            });
        }
        return this.LLILLL;
    }

    public final C1748330vb5 getPipoPinErrorMessageFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qi6);
            this.LL = (C1748330vb5) callbackFindViewById;
        }
        return (C1748330vb5) callbackFindViewById;
    }

    public final C1754650vlH getTuxPinFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z10);
            this.LLILLJJLI = (C1754650vlH) callbackFindViewById;
        }
        return (C1754650vlH) callbackFindViewById;
    }

    public final void LIZIZ() {
        EditText tuxEditTextIfNeeded = getTuxEditTextIfNeeded();
        if (tuxEditTextIfNeeded != null) {
            C443180HZk.LIZ(tuxEditTextIfNeeded);
        }
    }

    public final InterfaceC1719490uqZ getCallback() {
        return this.LLILZ;
    }

    public final EditText getTuxEditText() {
        return this.LLILLL;
    }

    public static EditText LIZJ(View view) {
        EditText editTextLIZJ;
        if (view instanceof EditText) {
            return (EditText) view;
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it2 = new C09RD((ViewGroup) view).iterator();
            do {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    editTextLIZJ = LIZJ((View) c09re.next());
                } else {
                    return null;
                }
            } while (editTextLIZJ == null);
            return editTextLIZJ;
        }
        return null;
    }

    public final void LIZ(long j) {
        C786410Ut5.LJLIIL(j, new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(this, 58));
    }

    public final void LIZLLL(String str) {
        C1754650vlH tuxPinFromXml = getTuxPinFromXml();
        if (tuxPinFromXml != null) {
            tuxPinFromXml.setEnabled(true);
        }
        C1748330vb5 pipoPinErrorMessageFromXml = getPipoPinErrorMessageFromXml();
        if (pipoPinErrorMessageFromXml != null) {
            pipoPinErrorMessageFromXml.setMessage(str);
        }
        C1754650vlH tuxPinFromXml2 = getTuxPinFromXml();
        if (!tuxPinFromXml2.LLLILZJ) {
            tuxPinFromXml2.LLJJIJIL = null;
            tuxPinFromXml2.LLJJIII.start();
            tuxPinFromXml2.setEnabled(true);
            tuxPinFromXml2.LLLILZJ = true;
            tuxPinFromXml2.LIZ();
            tuxPinFromXml2.invalidate();
        }
    }

    public final void setCallback(InterfaceC1719490uqZ interfaceC1719490uqZ) {
        this.LLILZ = interfaceC1719490uqZ;
    }

    public final void setDimOnComplete(boolean z) {
        getTuxPinFromXml().setDimOnComplete(z);
    }

    public final void setInputCallback(final InterfaceC1719490uqZ interfaceC1719490uqZ) {
        this.LLILZ = interfaceC1719490uqZ;
        C1754650vlH tuxPinFromXml = getTuxPinFromXml();
        if (tuxPinFromXml != null) {
            tuxPinFromXml.setListener(new InterfaceC1754720vlO() { // from class: X.0uqY
                @Override // X.InterfaceC1754720vlO
                public final void LJJZZI() {
                }

                @Override // X.InterfaceC1754720vlO
                public final void LJJLL() {
                    interfaceC1719490uqZ.LIZLLL();
                }

                @Override // X.InterfaceC1754720vlO
                public final void LJJZ(CharSequence charSequence) {
                    String string;
                    InterfaceC1719490uqZ interfaceC1719490uqZ2 = interfaceC1719490uqZ;
                    if (charSequence == null || (string = charSequence.toString()) == null) {
                        string = "";
                    }
                    interfaceC1719490uqZ2.LIZ(string);
                }
            });
        }
    }

    public final void setPinMasked(boolean z) {
        getTuxPinFromXml().setMasked(z);
    }

    public final void setPipoPinErrorMessageFromXml(C1748330vb5 c1748330vb5) {
        this.LL = c1748330vb5;
    }

    public final void setTuxEditText(EditText editText) {
        this.LLILLL = editText;
    }

    public final void setTuxPinFromXml(C1754650vlH c1754650vlH) {
        this.LLILLJJLI = c1754650vlH;
    }

    public C1719460uqW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i7m, this, true);
        C1754650vlH tuxPinFromXml = getTuxPinFromXml();
        int visibility = tuxPinFromXml.getVisibility();
        tuxPinFromXml.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, tuxPinFromXml);
        getTuxPinFromXml().setAutoWidth(true);
        getTuxPinFromXml().setPinType(EnumC1723110uwP.NUMERIC);
        getTuxPinFromXml().setMasked(true);
        getTuxPinFromXml().setDimOnComplete(true);
        getTuxPinFromXml().setDeleteAllAfterError(true);
        getTuxPinFromXml().setShowCursor(EnumC1723140uwS.NEVER);
        getTuxPinFromXml().setDirection(EnumC1719500uqa.LAYOUT);
        getTuxPinFromXml().setPattern(new C989340bqu(C1697810uHb.LJ(6)));
        C1748330vb5 pipoPinErrorMessageFromXml = getPipoPinErrorMessageFromXml();
        if (pipoPinErrorMessageFromXml != null) {
            pipoPinErrorMessageFromXml.setMessageIcon(C958703ov.LIZ);
        }
        C1748330vb5 pipoPinErrorMessageFromXml2 = getPipoPinErrorMessageFromXml();
        if (pipoPinErrorMessageFromXml2 != null) {
            pipoPinErrorMessageFromXml2.setFadeInMessage(true);
        }
    }
}

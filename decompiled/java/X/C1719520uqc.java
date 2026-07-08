package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0uqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1719520uqc extends FrameLayout {
    public C1754640vlG LL;
    public InterfaceC1719540uqe LLILLJJLI;

    public final C1754640vlG getTuxVerifyCenterOtpInputFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.z1o);
            this.LL = (C1754640vlG) callbackFindViewById;
        }
        return (C1754640vlG) callbackFindViewById;
    }

    private final EditText getTuxEditTextIfNeeded() {
        return LIZ(getTuxVerifyCenterOtpInputFromXml());
    }

    public final EditText getEditText() {
        return getTuxEditTextIfNeeded();
    }

    public static EditText LIZ(View view) {
        EditText editTextLIZ;
        if (view instanceof EditText) {
            return (EditText) view;
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it2 = new C09RD((ViewGroup) view).iterator();
            do {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    editTextLIZ = LIZ((View) c09re.next());
                } else {
                    return null;
                }
            } while (editTextLIZ == null);
            return editTextLIZ;
        }
        return null;
    }

    public final void setCallback(InterfaceC1719540uqe interfaceC1719540uqe) {
        this.LLILLJJLI = interfaceC1719540uqe;
        getTuxVerifyCenterOtpInputFromXml().setListener(new InterfaceC1754730vlP() { // from class: X.0uqd
            public int LIZ;
            public volatile boolean LIZIZ;

            @Override // X.InterfaceC1754730vlP
            public final void LJJLL() {
                if (this.LIZIZ) {
                    return;
                }
                InterfaceC1719540uqe interfaceC1719540uqe2 = this.LIZJ.LLILLJJLI;
                if (interfaceC1719540uqe2 != null) {
                    interfaceC1719540uqe2.LJJLL();
                }
                this.LIZIZ = true;
            }

            @Override // X.InterfaceC1754730vlP
            public final void LJJZ(CharSequence charSequence) {
                String string;
                InterfaceC1719540uqe interfaceC1719540uqe2 = this.LIZJ.LLILLJJLI;
                if (interfaceC1719540uqe2 != null) {
                    if (charSequence == null || (string = charSequence.toString()) == null) {
                        string = "";
                    }
                    interfaceC1719540uqe2.ty(string);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x0026, code lost:
            
                if (r5 == null) goto L15;
             */
            @Override // X.InterfaceC1754730vlP
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(int r4, java.lang.CharSequence r5) {
                /*
                    r3 = this;
                    int r0 = r3.LIZ
                    r2 = 1
                    r1 = 0
                    if (r0 != 0) goto L26
                    if (r5 == 0) goto L23
                    int r0 = r5.length()
                    if (r0 != r2) goto L28
                    boolean r0 = r3.LIZIZ
                    if (r0 != 0) goto L26
                    X.0uqc r0 = r3.LIZJ
                    X.0uqe r0 = r0.LLILLJJLI
                    if (r0 == 0) goto L1b
                    r0.LJJLL()
                L1b:
                    r3.LIZIZ = r2
                L1d:
                    if (r5 == 0) goto L23
                L1f:
                    int r1 = r5.length()
                L23:
                    r3.LIZ = r1
                    return
                L26:
                    if (r5 == 0) goto L23
                L28:
                    int r0 = r5.length()
                    if (r0 != 0) goto L1f
                    r3.LIZIZ = r1
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1719530uqd.LIZ(int, java.lang.CharSequence):void");
            }
        });
    }

    public final void setInputLength(int i) {
        getTuxVerifyCenterOtpInputFromXml().setPattern(new C339010DQt(C1697810uHb.LJ(Integer.valueOf(i))));
        if (i == 6) {
            getTuxVerifyCenterOtpInputFromXml().setAutoWidth(true);
        } else {
            getTuxVerifyCenterOtpInputFromXml().setAutoWidth(false);
        }
    }

    public final void setText(String str) {
        getTuxVerifyCenterOtpInputFromXml().LJ(str, true);
    }

    public final void setTuxVerifyCenterOtpInputFromXml(C1754640vlG c1754640vlG) {
        this.LL = c1754640vlG;
    }

    public C1719520uqc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.i7l, this, true);
        C1754640vlG tuxVerifyCenterOtpInputFromXml = getTuxVerifyCenterOtpInputFromXml();
        int visibility = tuxVerifyCenterOtpInputFromXml.getVisibility();
        tuxVerifyCenterOtpInputFromXml.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, tuxVerifyCenterOtpInputFromXml);
        getTuxVerifyCenterOtpInputFromXml().setAutoWidth(false);
        getTuxVerifyCenterOtpInputFromXml().setPinType(EnumC1723120uwQ.NUMERIC);
        getTuxVerifyCenterOtpInputFromXml().setMasked(false);
        getTuxVerifyCenterOtpInputFromXml().setDirection(EnumC1719510uqb.LAYOUT);
    }
}

package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardEditAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.poll.PollCreateContentAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPollCreateViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollOption;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0P4W, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4W implements TextWatcher {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void afterTextChanged$0(C0P4W c0p4w, Editable editable) {
    }

    public static final void afterTextChanged$2(C0P4W c0p4w, Editable editable) {
    }

    public static final void beforeTextChanged$0(C0P4W c0p4w, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C0P4W c0p4w, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C0P4W c0p4w, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
        }
    }

    public static final void afterTextChanged$1(C0P4W c0p4w, Editable editable) {
        String strValueOf = String.valueOf(editable);
        if (a0.LJJIIZI(strValueOf, "\n", false)) {
            String strLJJIFFI = u.LJJIFFI(strValueOf, "\n", " ", false);
            EditText editText = (EditText) ((View) c0p4w.l1).findViewById(R.id.d33);
            editText.setText(strLJJIFFI);
            editText.setSelection(strLJJIFFI.length());
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C0P4W(android.view.View r2, com.ss.android.ugc.aweme.inbox.bulletin.assem.poll.PollCreateContentAssem r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 1 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0P4W.<init>(android.view.View, com.ss.android.ugc.aweme.inbox.bulletin.assem.poll.PollCreateContentAssem, int):void");
    }

    public C0P4W(BulletinBoardEditAssem bulletinBoardEditAssem, C1748470vbJ c1748470vbJ, int i) {
        this.$t = i;
        this.l0 = bulletinBoardEditAssem;
        this.l1 = c1748470vbJ;
    }

    public static final void onTextChanged$0(C0P4W c0p4w, CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        if (charSequence != null) {
            int length = charSequence.length();
            if (length == 0) {
                ((BulletinBoardEditAssem) c0p4w.l0).So(false);
            }
            if (i3 > 0) {
                C0OP5 c0op5 = C0OP5.LJI;
                if (!Intrinsics.LJFF(charSequence.toString(), ((BulletinBoardEditAssem) c0p4w.l0).LLJJIJIIJIL)) {
                    i4 = 1;
                } else {
                    i4 = 2;
                }
                c0op5.LJIIL(i4, "has_input_title");
            }
            BulletinBoardEditAssem bulletinBoardEditAssem = (BulletinBoardEditAssem) c0p4w.l0;
            String string = charSequence.toString();
            C618340ONc c618340ONc = bulletinBoardEditAssem.LLJILJIL;
            if (c618340ONc != null) {
                c618340ONc.LIZ = string;
            }
            bulletinBoardEditAssem.Lo().yQ2(string);
            C1748470vbJ c1748470vbJ = ((BulletinBoardEditAssem) c0p4w.l0).LLJILJILJ;
            if (c1748470vbJ != null) {
                c1748470vbJ.setBackground(BulletinBoardEditAssem.No(((C1748470vbJ) c0p4w.l1).getContext()));
            }
            ((C1749190vcT) ((BulletinBoardEditAssem) c0p4w.l0).LJJIJL().findViewById(R.id.cz9)).LJFF(false);
            if (((BulletinBoardEditAssem) c0p4w.l0).Ho() - length <= 5) {
                TuxTextView tuxTextView = ((BulletinBoardEditAssem) c0p4w.l0).LLJILLL;
                if (tuxTextView != null) {
                    tuxTextView.setText(C786410Ut5.j4("%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(length), Integer.valueOf(((BulletinBoardEditAssem) c0p4w.l0).Ho())}, 2)));
                }
                TuxTextView tuxTextView2 = ((BulletinBoardEditAssem) c0p4w.l0).LLJILLL;
                if (tuxTextView2 != null) {
                    C12ES.LJIILL(0, tuxTextView2);
                    return;
                }
                return;
            }
            TuxTextView tuxTextView3 = ((BulletinBoardEditAssem) c0p4w.l0).LLJILLL;
            if (tuxTextView3 == null) {
                return;
            }
            C0DTR.LIZIZ(tuxTextView3);
        }
    }

    public static final void onTextChanged$1(C0P4W c0p4w, CharSequence charSequence, int i, int i2, int i3) {
        int length;
        BulletinPollCreateViewModel bulletinPollCreateViewModelKp = ((PollCreateContentAssem) c0p4w.l0).kp();
        String strValueOf = String.valueOf(charSequence);
        bulletinPollCreateViewModelKp.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setTitle() = ");
        sbLIZ.append(strValueOf);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        bulletinPollCreateViewModelKp.LL = strValueOf;
        bulletinPollCreateViewModelKp.vQ2();
        PollCreateContentAssem pollCreateContentAssem = (PollCreateContentAssem) c0p4w.l0;
        TextView textView = (TextView) ((View) c0p4w.l1).findViewById(R.id.d32);
        if (charSequence != null) {
            length = charSequence.length();
        } else {
            length = 0;
        }
        pollCreateContentAssem.lp(textView, length, PollCreateContentAssem.LLJJIJIIJIL);
    }

    public static final void onTextChanged$2(C0P4W c0p4w, CharSequence charSequence, int i, int i2, int i3) {
        int iIntValue = ((Integer) ((View) c0p4w.l0).getTag(R.id.d2y)).intValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("index = ");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", text = ");
        sbLIZ.append((Object) charSequence);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        BulletinPollCreateViewModel bulletinPollCreateViewModelKp = ((PollCreateContentAssem) c0p4w.l1).kp();
        int length = 0;
        ListProtector.set(bulletinPollCreateViewModelKp.LLILLL, iIntValue, new BulletinPollOption(0L, u.LJJIFFI(String.valueOf(charSequence), "\n", " ", false), 0L, Boolean.FALSE, null));
        bulletinPollCreateViewModelKp.vQ2();
        PollCreateContentAssem pollCreateContentAssem = (PollCreateContentAssem) c0p4w.l1;
        TextView textView = (TextView) ((View) c0p4w.l0).findViewById(R.id.ppy);
        if (charSequence != null) {
            length = charSequence.length();
        }
        pollCreateContentAssem.lp(textView, length, PollCreateContentAssem.LLJJJ);
    }
}

package X;

import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.AcS495S0100000_12;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.android.live.broadcast.api.blockword.model.BlockWord;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;
import wh6.AbS694S0100000_12;

/* JADX INFO: renamed from: X.0TZ0, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TZ0 extends FrameLayout implements InterfaceC748810TYx {
    public LiveEditText LL;
    public LiveIconView LLILLJJLI;
    public LiveIconView LLILLL;
    public C16F5 LLILZ;
    public C20743716Ff LLILZIL;
    public boolean LLILZLL;
    public final C748800TYw LLIZ;
    public InputFilter.LengthFilter LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public InterfaceC748700TYm LLJIJIL;

    @Override // X.InterfaceC748810TYx
    public final void LIZIZ(BlockWord blockWord) {
    }

    @Override // X.InterfaceC748810TYx
    public final void LIZJ() {
    }

    @Override // X.InterfaceC748810TYx
    public final void LIZLLL(List<BlockWord> list, long j, long j2) {
    }

    @Override // X.InterfaceC748810TYx
    public final void LJ() {
    }

    public final LiveIconView getAddKeywordTipIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.ady);
            this.LLILLL = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    public final C16F5 getBlockSimilarDescFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c3n);
            this.LLILZ = (C16F5) callbackFindViewById;
        }
        return (C16F5) callbackFindViewById;
    }

    public final C20743716Ff getBlockSimilarVersionsSwitchFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c3q);
            this.LLILZIL = (C20743716Ff) callbackFindViewById;
        }
        return (C20743716Ff) callbackFindViewById;
    }

    public final LiveEditText getBlockWordEditEtFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c44);
            this.LL = (LiveEditText) callbackFindViewById;
        }
        return (LiveEditText) callbackFindViewById;
    }

    public final LiveIconView getEditIvCancelFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.gq3);
            this.LLILLJJLI = (LiveIconView) callbackFindViewById;
        }
        return (LiveIconView) callbackFindViewById;
    }

    @Override // X.InterfaceC748810TYx
    public final void LIZ(BlockWord blockWord) {
        String str;
        if (this.LLILZLL) {
            C500260Jjc.LJIILJJIL(getBlockWordEditEtFromXml());
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stopword_set_success");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(blockWord.content, "context");
        if (this.LLJI) {
            str = "host";
        } else {
            str = "moderator";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LIZ();
        InterfaceC748700TYm interfaceC748700TYm = this.LLJIJIL;
        if (interfaceC748700TYm != null) {
            interfaceC748700TYm.LIZ(blockWord);
        }
    }

    @Override // X.InterfaceC748810TYx
    public final void LJFF(Throwable th) {
        String str;
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            int errorCode = c501470JlZ.getErrorCode();
            if (errorCode == 4003180) {
                str = "similar";
            } else {
                switch (errorCode) {
                    case 80070:
                        str = "limited";
                        break;
                    case 80071:
                        str = "illegal";
                        break;
                    case 80072:
                        str = "lengthy";
                        break;
                    case 80073:
                        str = "existed";
                        break;
                    default:
                        C766270U4b.LIZLLL(2131854909);
                        return;
                }
            }
            if (c501470JlZ.getErrorCode() == 4003180) {
                C782110Um9 c782110Um9 = new C782110Um9(getContext());
                c782110Um9.LJFF(C20736316Cj.LJ(R.attr.dn2, c782110Um9.LIZ));
                c782110Um9.LJI = ColorStateList.valueOf(C20736316Cj.LIZIZ(R.attr.a1h, getContext()));
                c782110Um9.LJIIIIZZ = (int) C497740JfY.LIZIZ(40.0f);
                c782110Um9.LJIIIZ = (int) C497740JfY.LIZIZ(40.0f);
                Context context = getContext();
                String strValueOf = String.valueOf(C2204961BRm.LLLFZ(getBlockWordEditEtFromXml(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYHolk6i4pACa1t8DwyJN/jPIU8grk3wujESinS2PnVg+ZF4OhQYHW+FCvlw==", null)));
                String strLJIJJ = C497740JfY.LJIJJ(2131835599, strValueOf);
                SpannableString spannableString = new SpannableString(strLJIJJ);
                int iLJJJ = a0.LJJJ(strLJIJJ, strValueOf, 0, false, 6);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                if (numLIZJ != null) {
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ.intValue()), 0, spannableString.length(), 17);
                }
                if (iLJJJ >= 0) {
                    C1119920fFW.LJ(context, spannableString, iLJJJ, strValueOf.length() + iLJJJ, 33, 3, 500);
                }
                c782110Um9.LJIIIZ(spannableString);
                C494720Jag c494720Jag = new C494720Jag();
                C755620TkW c755620TkW = new C755620TkW();
                c755620TkW.LIZ = C497740JfY.LJIJI(2131835598);
                c755620TkW.LIZJ = new AcS495S0100000_12(this, 60);
                c494720Jag.LIZ(new C0TZ2(c755620TkW));
                C755630TkX c755630TkX = new C755630TkX();
                c755630TkX.LIZ = C497740JfY.LJIJI(2131835603);
                c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0TZ4
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        liveDialog.dismiss();
                    }
                };
                c494720Jag.LIZ(new C0TZ3(c755630TkX));
                c494720Jag.LIZIZ = 2;
                c782110Um9.LIZJ(new C494730Jah(c494720Jag));
                c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.0TYq
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        C0TZ7 c0tz7 = C0TZ7.LIZ;
                        boolean z = this.LL.LLJI;
                        c0tz7.getClass();
                        C0TZ7.LIZLLL(null, "keyword_duplicate_popup_show", null, z);
                    }
                };
                C786410Ut5.E4(c782110Um9.LIZ());
            } else {
                C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_stopword_set_toast");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(str, "toast_type");
            c474500IjALIZ.LIZ();
        }
    }

    public final void LJII(boolean z) {
        int i;
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                String strValueOf = String.valueOf(C2204961BRm.LLLFZ(getBlockWordEditEtFromXml(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYHolk6i4pACa1t8DwyJN/jPIU8grk3wujESinS2PnVg+ZF4OhQYHW+FCvlw==", null)));
                if (a0.LJJJIL(strValueOf)) {
                    C766270U4b.LIZLLL(2131842767);
                    return;
                }
                C748800TYw c748800TYw = this.LLIZ;
                String string = a0.LJLIIIL(strValueOf).toString();
                if (getBlockSimilarVersionsSwitchFromXml().isChecked()) {
                    i = 1;
                } else {
                    i = 2;
                }
                c748800TYw.LIZ(new BlockWord(-1, string, i, ""), z);
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C766270U4b.LIZLLL(2131843092);
    }

    public final void setAddKeywordTipIconFromXml(LiveIconView liveIconView) {
        this.LLILLL = liveIconView;
    }

    public final void setBlockSimilarDescFromXml(C16F5 c16f5) {
        this.LLILZ = c16f5;
    }

    public final void setBlockSimilarVersionsSwitchFromXml(C20743716Ff c20743716Ff) {
        this.LLILZIL = c20743716Ff;
    }

    public final void setBlockWordEditEtFromXml(LiveEditText liveEditText) {
        this.LL = liveEditText;
    }

    public final void setEditIvCancelFromXml(LiveIconView liveIconView) {
        this.LLILLJJLI = liveIconView;
    }

    public C0TZ0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLIZ = new C748800TYw(this);
        this.LLJ = 30;
        C786120Usc c786120Usc = new C786120Usc(this, 3);
        FrameLayout.inflate(getContext(), R.layout.g0h, this);
        getBlockWordEditEtFromXml().removeTextChangedListener(c786120Usc);
        getBlockWordEditEtFromXml().addTextChangedListener(c786120Usc);
        HandlerHook.viewPostDelay(getBlockWordEditEtFromXml(), new ARunnableS112S0100000_12(this, 381), 200L);
        getBlockWordEditEtFromXml().setOnFocusChangeListener(new ViewOnFocusChangeListenerC786030UsT(this, 2));
        C786410Ut5.I7(new AbS694S0100000_12(this, 27), getAddKeywordTipIconFromXml());
        C786410Ut5.g8(getEditIvCancelFromXml(), new ACListenerS147S0100000_12((Object) this, 389));
    }

    public final void LJI(int i, boolean z, String str, long j, String str2, InterfaceC748700TYm interfaceC748700TYm) {
        this.LLJ = i;
        this.LLJI = z;
        this.LLJIJIL = interfaceC748700TYm;
        C748800TYw c748800TYw = this.LLIZ;
        c748800TYw.LIZLLL = z;
        c748800TYw.LJ = str;
        c748800TYw.LJFF = j;
        c748800TYw.LJI = true;
        c748800TYw.LIZJ = str2;
        C16F5 blockSimilarDescFromXml = getBlockSimilarDescFromXml();
        C0TZ7 c0tz7 = C0TZ7.LIZ;
        Context context = getContext();
        c0tz7.getClass();
        blockSimilarDescFromXml.setText(C0TZ7.LIZJ(context, 2131835588, 2131835591, 2131835589, 2131835590));
    }
}

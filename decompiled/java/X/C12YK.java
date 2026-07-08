package X;

import android.content.DialogInterface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12YK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YK implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
            case 3:
                onClick$3(this, dialogInterface, i);
                break;
            case 4:
                onClick$4(this, dialogInterface, i);
                break;
            case 5:
                onClick$5(this, dialogInterface, i);
                break;
            case 6:
                onClick$6(this, dialogInterface, i);
                break;
            case 7:
                onClick$7(this, dialogInterface, i);
                break;
        }
    }

    public C12YK(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C12YK c12yk, DialogInterface dialogInterface, int i) {
        C19557811fU c19557811fU = (C19557811fU) c12yk.l0;
        c19557811fU.getClass();
        dialogInterface.dismiss();
        c19557811fU.LJJJIL = 1;
        c19557811fU.LJIIJJI();
        c19557811fU.LJIJ();
    }

    public static final void onClick$1(C12YK c12yk, DialogInterface dialogInterface, int i) {
        C19762612Tw c19762612Tw = (C19762612Tw) c12yk.l0;
        AudioRecorderParam veAudioRecorderParam = c19762612Tw.LLLIZZ().getVeAudioRecorderParam();
        if (c19762612Tw.LLLJIL.getAudioRecordIndex() >= 0 && c19762612Tw.LLLJIL.hasRecord()) {
            c19762612Tw.LLLJIL.setNeedDel(true);
            C1453010nul.LIZ(c19762612Tw.LLLIL(), c19762612Tw.LLLJIL);
        }
        if (veAudioRecorderParam != null && veAudioRecorderParam.getAudioRecordIndex() < 0 && veAudioRecorderParam.hasRecord()) {
            C1453010nul.LIZ(c19762612Tw.LLLIL(), veAudioRecorderParam);
        }
        InterfaceC1418580n1E interfaceC1418580n1ELLLILZ = c19762612Tw.LLLILZ();
        if (interfaceC1418580n1ELLLILZ != null) {
            interfaceC1418580n1ELLLILZ.wM1(true);
        }
        c19762612Tw.LLLIILIL(true);
        c19762612Tw.LLLII(c19762612Tw.LLLJIL.getAudioUrl());
    }

    public static final void onClick$2(C12YK c12yk, DialogInterface dialogInterface, int i) {
        ((C19562211gC) c12yk.l0).getClass();
        try {
            dialogInterface.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        DialogInterface.OnClickListener onClickListener = ((C19562211gC) c12yk.l0).LJFF;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }

    public static final void onClick$3(C12YK c12yk, DialogInterface dialogInterface, int i) {
        ((C19562211gC) c12yk.l0).getClass();
        try {
            dialogInterface.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        DialogInterface.OnClickListener onClickListener = ((C19562211gC) c12yk.l0).LJI;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }

    public static final void onClick$4(C12YK c12yk, DialogInterface dialogInterface, int i) {
        ((Function0) c12yk.l0).invoke();
    }

    public static final void onClick$5(C12YK c12yk, DialogInterface dialogInterface, int i) {
        ((Function0) c12yk.l0).invoke();
    }

    public static final void onClick$6(C12YK c12yk, DialogInterface dialogInterface, int i) {
        C12U9 c12u9 = (C12U9) c12yk.l0;
        AudioRecorderParam veAudioRecorderParam = c12u9.LLLIL().getVeAudioRecorderParam();
        if (c12u9.LLLIL.getAudioRecordIndex() >= 0 && c12u9.LLLIL.hasRecord()) {
            c12u9.LLLIL.setNeedDel(true);
            C1453010nul.LIZ(c12u9.LLLIILIL(), c12u9.LLLIL);
        }
        if (veAudioRecorderParam != null) {
            if (veAudioRecorderParam.getAudioRecordIndex() < 0 && veAudioRecorderParam.hasRecord()) {
                C1453010nul.LIZ(c12u9.LLLIILIL(), veAudioRecorderParam);
            }
            if (veAudioRecorderParam.getNeedOriginalSound()) {
                c12u9.LLLIL().setVoiceVolume(veAudioRecorderParam.getVoiceVolume());
            } else {
                c12u9.LLLIL().setVoiceVolume(0.0f);
            }
        } else {
            c12u9.LLLIL().setVoiceVolume(c12u9.LLLIL.getVoiceVolume());
        }
        c12u9.LLLIIIIL().jR2(c12u9.LLLIL().getMusicVolume(), c12u9.LLLIL().getVoiceVolume());
        c12u9.LLLII(c12u9.LLLIL.getAudioUrl());
    }

    public static final void onClick$7(C12YK c12yk, DialogInterface dialogInterface, int i) {
        ((InterfaceC784910Uqf) c12yk.l0).execute();
    }
}

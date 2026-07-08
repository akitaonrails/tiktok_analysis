package X;

import Y.ACListenerS130S0200000_28;
import Y.ACListenerS27S0500000_28;
import Y.AObserverS188S0200000_28;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.music.model.Music;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS213S0300000_4;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS394S0200000_28;

/* JADX INFO: renamed from: X.10I5, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("copyright_violation_snack_bar_task")
public final class C10I5 extends AbstractC20660815t0 {
    public final ViewGroup LL;
    public final Aweme LLILLJJLI;
    public final MutableLiveData<Boolean> LLILLL;
    public final boolean LLILZ;
    public C20515215Pi LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;
    public String LLIZLLLIL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 109;
    }

    public static int LJIIL(int i) {
        if (C10I4.LIZ()) {
            return 2131857887;
        }
        if (!C10I4.LIZIZ()) {
            return i;
        }
        return 2131857890;
    }

    public static int LJIILIIL(int i) {
        if (C10I4.LIZIZ() || C10I4.LIZ()) {
            return R.raw.icon_speaker_x_mark_ltr;
        }
        return i;
    }

    public static int LJIILJJIL(int i) {
        if (C10I4.LIZIZ() || C10I4.LIZ()) {
            return 2131857889;
        }
        return i;
    }

    public static boolean LJIILL(Aweme aweme) {
        AwemeStatus statusSafety;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        AwemeStatus statusSafety2;
        AwemeStatus.VideoMuteInfo videoMuteInfo2;
        if (aweme == null || (statusSafety = AwemeExtKt.getStatusSafety(aweme)) == null || (videoMuteInfo = statusSafety.getVideoMuteInfo()) == null || !videoMuteInfo.getIsCopyrightViolation()) {
            return false;
        }
        if (aweme != null && (statusSafety2 = AwemeExtKt.getStatusSafety(aweme)) != null && (videoMuteInfo2 = statusSafety2.getVideoMuteInfo()) != null && videoMuteInfo2.getAudioChangeStatus() != 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        AwemeStatus.MappedMuteStripStatus mappedMuteStripStatus;
        int iLJIILIIL;
        int iLJIILJJIL;
        int iLJIIL;
        String idStr;
        String str;
        String strLIZIZ;
        String string;
        C20515215Pi c20515215Pi = null;
        if (!this.LLILZ) {
            C19EG c19egLIZIZ = c688120Qyw.LIZIZ();
            if (c19egLIZIZ != null) {
                C20515215Pi c20515215Pi2 = new C1257230ioz(this.LL, true).LIZ;
                c20515215Pi2.LJI(new AwS375S0200000_9(c688120Qyw, this, 116));
                c20515215Pi2.LIZ.LIZJ = false;
                Context context = c688120Qyw.LIZ;
                if (C1453970nwJ.LIZJ() > 0) {
                    strLIZIZ = context.getString(2131857889);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(context.getString(2131857889));
                    sbLIZ.append((char) 160);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                if (C1453970nwJ.LIZJ() > 0) {
                    string = "";
                } else {
                    string = context.getString(2131829773);
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLIZIZ);
                SpannableString spannableString = new SpannableString(string);
                C786410Ut5.p2(spannableString, new C19331610k6(context, this, 3), 0, spannableString.length(), 17);
                if (!C735280Sso.LIZ(this.LLILLJJLI)) {
                    spannableStringBuilder = spannableStringBuilder.append((CharSequence) spannableString);
                }
                C1057450dcl c1057450dcl = c20515215Pi2.LIZ;
                c1057450dcl.LJFF = spannableStringBuilder;
                c1057450dcl.LJIILLIIL = true;
                c1057450dcl.LJIILIIL = new ACListenerS130S0200000_28(c688120Qyw, this, 35);
                c1057450dcl.LJIIJ = 0;
                c20515215Pi2.LIZ.LJIILJJIL = new AwS394S0200000_28(c20656615sK, this, 45);
                this.LLILZIL = c20515215Pi2;
                if (C1453970nwJ.LIZJ() > 0 && C10I4.LIZ()) {
                    C20515215Pi c20515215Pi3 = this.LLILZIL;
                    if (c20515215Pi3 == null) {
                        c20515215Pi3 = null;
                    }
                    c20515215Pi3.LIZ(2131857887);
                } else if (C1453970nwJ.LIZJ() > 0) {
                    C20515215Pi c20515215Pi4 = this.LLILZIL;
                    if (c20515215Pi4 == null) {
                        c20515215Pi4 = null;
                    }
                    c20515215Pi4.LIZ(2131857890);
                }
                C20515215Pi c20515215Pi5 = this.LLILZIL;
                if (c20515215Pi5 != null) {
                    c20515215Pi = c20515215Pi5;
                }
                c20515215Pi.LJ();
                C20514915Pf c20514915Pf = c20515215Pi.LJ;
                MutableLiveData<Boolean> mutableLiveData = this.LLILLL;
                if (mutableLiveData != null) {
                    mutableLiveData.observe(c19egLIZIZ, new AObserverS188S0200000_28((Object) c20514915Pf, (View) this, (ViewPagerBottomSheetBehavior<View>) 14));
                    return;
                }
                return;
            }
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C593450NPj(this, null), 3);
        Aweme aweme = this.LLILLJJLI;
        ViewGroup viewGroup = this.LL;
        AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
        if (statusSafety == null || (mappedMuteStripStatus = statusSafety.getMappedMuteStripStatus()) == null) {
            return;
        }
        C20515215Pi c20515215Pi6 = new C1257230ioz(viewGroup, true).LIZ;
        C419910GdJ c419910GdJ = new C419910GdJ();
        int[] iArr = C10IP.LIZ;
        int i = iArr[mappedMuteStripStatus.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    iLJIILIIL = R.raw.icon_exclamation_mark_circle;
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Illegal Mute Strip Status, mappedMuteStripStatus=");
                    sbLIZ2.append(mappedMuteStripStatus);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else {
                iLJIILIIL = LJIILIIL(R.raw.icon_music_note_s_alt_slash);
            }
        } else {
            iLJIILIIL = LJIILIIL(R.raw.icon_speaker_x_mark_ltr);
        }
        c419910GdJ.LIZ = iLJIILIIL;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
        c20515215Pi6.LJFF(c419910GdJ);
        c20515215Pi6.LJI(new AwS213S0300000_4(viewGroup, c688120Qyw, aweme, 5));
        c20515215Pi6.LIZ.LJIILLIIL = true;
        int i2 = iArr[mappedMuteStripStatus.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        iLJIILJJIL = 2131826865;
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("Illegal Mute Strip Status, mappedMuteStripStatus=");
                        sbLIZ3.append(mappedMuteStripStatus);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                } else {
                    iLJIILJJIL = LJIILJJIL(2131826874);
                }
            } else {
                iLJIILJJIL = LJIILJJIL(2131826870);
            }
        } else {
            iLJIILJJIL = LJIILJJIL(2131826861);
        }
        c20515215Pi6.LIZJ(iLJIILJJIL);
        int i3 = iArr[mappedMuteStripStatus.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 == 4) {
                        iLJIIL = 2131826866;
                    } else {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("Illegal Mute Strip Status, mappedMuteStripStatus=");
                        sbLIZ4.append(mappedMuteStripStatus);
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                } else {
                    iLJIIL = LJIIL(2131826875);
                }
            } else {
                iLJIIL = LJIIL(2131826871);
            }
        } else {
            iLJIIL = LJIIL(2131826862);
        }
        c20515215Pi6.LIZ(iLJIIL);
        c20515215Pi6.LIZ.LJIILIIL = new ACListenerS27S0500000_28(c688120Qyw, mappedMuteStripStatus, this, c20515215Pi6, aweme, 1);
        c20515215Pi6.LIZ.LIZJ = false;
        c20515215Pi6.LIZ.LJIILJJIL = new AwS394S0200000_28(c20656615sK, this, 46);
        this.LLILZIL = c20515215Pi6;
        c20515215Pi6.LIZLLL();
        C1458310o3J c1458310o3J = C1458310o3J.LIZ;
        String aid = this.LLILLJJLI.getAid();
        Music music = this.LLILLJJLI.getMusic();
        if (music != null) {
            idStr = music.getIdStr();
        } else {
            idStr = null;
        }
        if (LJIILL(this.LLILLJJLI)) {
            str = "copyright";
        } else {
            str = "other";
        }
        C10IT.LJ(this.LLILLJJLI);
        c1458310o3J.getClass();
        C1458310o3J.LJI(aid, idStr, str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10I5(ViewGroup viewGroup, InterfaceC20658015sY interfaceC20658015sY, Aweme aweme, MutableLiveData mutableLiveData, boolean z, int i) {
        super(interfaceC20658015sY);
        mutableLiveData = (i & 8) != 0 ? null : mutableLiveData;
        z = (i & 16) != 0 ? false : z;
        this.LL = viewGroup;
        this.LLILLJJLI = aweme;
        this.LLILLL = mutableLiveData;
        this.LLILZ = z;
        this.LLIZLLLIL = "close";
    }
}

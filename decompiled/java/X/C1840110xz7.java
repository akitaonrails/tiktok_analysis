package X;

import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.cla.et.newet.DubbingAuthorizationOperationEvent;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.translation.model.AutoDubbingStatusResponse;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS314S0000000_27;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0xz7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1840110xz7 {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static AutoDubbingStatusResponse LIZLLL;
    public static C11JF LJ;

    public static void LIZIZ(SpannableString spannableString, Integer num) {
        if (num != null) {
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
        }
    }

    public static void LIZJ(SpannableString spannableString, Integer num) {
        if (num != null) {
            num.intValue();
            C786410Ut5.p2(spannableString, new C444920HcY(num.intValue(), true), 0, spannableString.length(), 33);
        }
    }

    public static void LIZLLL(final C19EG c19eg, final Aweme aweme) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        String aid;
        if (c19eg != null && !c19eg.isFinishing() && !c19eg.isDestroyed()) {
            if (!LIZIZ.compareAndSet(false, true)) {
                return;
            }
            FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
            final C013C c013c = new C013C();
            c013c.element = true;
            C1391960mKI c1391960mKI = new C1391960mKI();
            String string = c19eg.getString(2131828766);
            String string2 = c19eg.getString(2131828768);
            String string3 = c19eg.getString(2131828767);
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.x6;
            c1391960mKI.LIZLLL = c0hti.LIZ(c19eg);
            c1391960mKI.LJI = 1;
            c1391960mKI.LJII = string;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, c19eg);
            String string4 = c19eg.getString(2131828764);
            SpannableString spannableString = new SpannableString(c19eg.getString(2131828765));
            LIZJ(spannableString, 42);
            LIZIZ(spannableString, numLIZJ);
            C786410Ut5.p2(spannableString, new C785780Us4(numLIZJ, new AwS567S0100000_23(c19eg, 126), 3), 0, spannableString.length(), 33);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string4, new String[]{"{placeholder_settings}"}, 2, 2);
            if ((!listLJJLIIIJILLIZJL.isEmpty()) && ((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 0)).length() > 0) {
                SpannableString spannableString2 = new SpannableString((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 0));
                LIZJ(spannableString2, 41);
                LIZIZ(spannableString2, numLIZJ);
                spannableStringBuilder.append((CharSequence) spannableString2);
            }
            spannableStringBuilder.append((CharSequence) spannableString);
            if (listLJJLIIIJILLIZJL.size() > 1 && ((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 1)).length() > 0) {
                SpannableString spannableString3 = new SpannableString((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 1));
                LIZJ(spannableString3, 41);
                LIZIZ(spannableString3, numLIZJ);
                spannableStringBuilder.append((CharSequence) spannableString3);
            }
            c1391960mKI.LJIIIIZZ = spannableStringBuilder;
            c1391960mKI.LJIIJ = C13LQ.LJJLL(new AbstractC1391920mKE[]{new C1391900mKC(string2, null, "", true, new C1864680yck(c013c, 2))});
            c1391960mKI.LIZIZ(string3, AFwS314S0000000_27.get$arr$(19));
            C746760TRa.LIZ().LJIJJ();
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            LIZ("turn_on", "show", aid);
            C439850HMp c439850HMpLIZ = c1391960mKI.LIZ();
            DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.0xz8
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    String str;
                    String aid2 = null;
                    C746760TRa.LIZ().LJII(null, c013c.element);
                    if (c013c.element) {
                        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                        c1389890mGx.LJIIIZ(2131828769);
                        c1389890mGx.LJIIJJI();
                    } else {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(c19eg);
                        c1389890mGx2.LJIIIZ(2131828770);
                        c1389890mGx2.LJIIJJI();
                    }
                    if (c013c.element) {
                        str = "turn_on";
                    } else {
                        str = "turn_off";
                    }
                    Aweme aweme2 = aweme;
                    if (aweme2 != null) {
                        aid2 = aweme2.getAid();
                    }
                    C1840110xz7.LIZ(str, "click", aid2);
                }
            };
            TuxPanel tuxPanel = c439850HMpLIZ.LIZ;
            tuxPanel.LLILZIL = onDismissListener;
            tuxPanel.show(supportFragmentManager, "authorization auto-dubbing pop-up");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPanel() activity:(");
        if (c19eg != null) {
            boolValueOf = Boolean.valueOf(c19eg.isFinishing());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", ");
        if (c19eg != null) {
            boolValueOf2 = Boolean.valueOf(c19eg.isDestroyed());
        } else {
            boolValueOf2 = null;
        }
        sbLIZ.append(boolValueOf2);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(String str, String str2, String str3) {
        C207069161b.LJ(DubbingAuthorizationOperationEvent.class, new C017D() { // from class: X.017L
            @Override // X.C017D
            public final List<InterfaceC1282004zy> LIZ(List<? extends Class<? extends InterfaceC0241006d>> list) {
                return C13BV.INSTANCE;
            }
        }, new AnonymousClass0175(), Collections.singletonList(new C0258006u(str, str2, str3, "video_detail_page")), 16);
    }
}

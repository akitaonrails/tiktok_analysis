package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.tako.common.ui.markdown.style.LinkUnderLineSpan;
import com.ss.android.ugc.aweme.tako.common.ui.markdown.style.TakoMarkDownBulletSpan;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;

/* JADX INFO: renamed from: X.0Gnr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426450Gnr implements InterfaceC2273521Dyo {
    public final TextView LIZ;
    public final InterfaceC418240Gac LIZIZ;
    public final InterfaceC426480Gnu LIZJ;
    public final Map<String, Object> LIZLLL;
    public final boolean LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;

    @Override // X.InterfaceC2273521Dyo
    public final SpannableStringBuilder LIZ(CharSequence charSequence) {
        return SpannableStringBuilder.valueOf(charSequence);
    }

    @Override // X.InterfaceC2273521Dyo
    public final SpannableStringBuilder LIZJ(CharSequence charSequence) {
        return SpannableStringBuilder.valueOf(charSequence);
    }

    @Override // X.InterfaceC2273521Dyo
    public final SpannableStringBuilder LIZLLL(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        C418210GaZ c418210GaZ = new C418210GaZ(this.LJIIIIZZ, charSequence, this.LIZLLL, this.LIZIZ);
        C444920HcY c444920HcY = new C444920HcY(42, true);
        C786410Ut5.q2(spannableStringBuilderValueOf, c418210GaZ, 0, charSequence.length(), 33);
        C786410Ut5.q2(spannableStringBuilderValueOf, c444920HcY, 0, charSequence.length(), 33);
        return spannableStringBuilderValueOf;
    }

    @Override // X.InterfaceC2273521Dyo
    public final void LJ(SpannableStringBuilder spannableStringBuilder) {
        SpannableString spannableString = new SpannableString("\n");
        C786410Ut5.p2(spannableString, new C416680GVm(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), spannableString.length() - 1, spannableString.length(), 17);
        spannableStringBuilder.append((CharSequence) spannableString);
    }

    @Override // X.InterfaceC2273521Dyo
    public final SpannableStringBuilder LJII(CharSequence charSequence) {
        Object obj;
        TextView textView;
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        if (this.LJ && (textView = this.LIZ) != null && textView.getContext() != null) {
            C418170GaV c418170GaV = new C418170GaV(this.LJI, this.LJII, C1859900yV2.LIZIZ.LJI(this.LIZ.getContext()));
            c418170GaV.LLJI = this.LIZIZ;
            obj = c418170GaV;
        } else {
            C418140GaS c418140GaS = new C418140GaS(this.LJI, this.LJII, charSequence);
            c418140GaS.LLJIJIL = this.LIZIZ;
            obj = c418140GaS;
        }
        C786410Ut5.q2(spannableStringBuilderValueOf, obj, 0, charSequence.length(), 33);
        return spannableStringBuilderValueOf;
    }

    @Override // X.InterfaceC2273521Dyo
    public final SpannableStringBuilder LJIIIIZZ(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        C786410Ut5.q2(spannableStringBuilderValueOf, new C444920HcY(113, true), 0, spannableStringBuilderValueOf.length(), 33);
        return spannableStringBuilderValueOf;
    }

    @Override // X.InterfaceC2273521Dyo
    public final SpannableStringBuilder LJFF(CharSequence charSequence, CharSequence charSequence2) {
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        LinkUnderLineSpan linkUnderLineSpan = new LinkUnderLineSpan(charSequence, charSequence2, this.LIZIZ, this.LIZLLL);
        C786410Ut5.q2(spannableStringBuilderValueOf, linkUnderLineSpan, 0, ((String) charSequence).length(), 33);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> map = this.LIZLLL;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("origin_url", charSequence2);
        InterfaceC426480Gnu interfaceC426480Gnu = this.LIZJ;
        if (interfaceC426480Gnu != null) {
            interfaceC426480Gnu.LIZ(linkUnderLineSpan, charSequence, linkedHashMap);
        }
        return spannableStringBuilderValueOf;
    }

    @Override // X.InterfaceC2273521Dyo
    public final SpannableStringBuilder LJI(int i, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        C786410Ut5.q2(spannableStringBuilderValueOf, new TakoMarkDownBulletSpan(i, this.LJFF, 0), 0, spannableStringBuilderValueOf.length(), 33);
        return spannableStringBuilderValueOf;
    }

    public C426450Gnr(TextView textView, InterfaceC418240Gac interfaceC418240Gac, InterfaceC426480Gnu interfaceC426480Gnu, Map<String, ? extends Object> map, boolean z) {
        Context context;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        this.LIZ = textView;
        this.LIZIZ = interfaceC418240Gac;
        this.LIZJ = interfaceC426480Gnu;
        this.LIZLLL = map;
        this.LJ = z;
        new WeakReference(this.LIZ);
        if (textView != null && (context = textView.getContext()) != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            this.LJFF = iIntValue;
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context);
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            this.LJI = iIntValue2;
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.br, context);
            if (numLIZJ3 != null) {
                iIntValue3 = numLIZJ3.intValue();
            } else {
                iIntValue3 = 0;
            }
            this.LJII = iIntValue3;
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.d5, context);
            this.LJIIIIZZ = numLIZJ4 != null ? numLIZJ4.intValue() : 0;
            Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.bb, context);
            if (numLIZJ5 != null) {
                numLIZJ5.intValue();
            }
        }
    }

    @Override // X.InterfaceC2273521Dyo
    public final SpannableStringBuilder LIZIZ(int i, int i2, int i3, CharSequence charSequence, String str) {
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(charSequence);
        if (str != null) {
            Matcher matcher = PatternProtector.compile("\\d+").matcher(str);
            if (matcher.find()) {
                i2 = CastIntegerProtector.parseInt(matcher.group());
            }
        }
        TakoMarkDownBulletSpan takoMarkDownBulletSpan = new TakoMarkDownBulletSpan(i, this.LJFF, i2);
        takoMarkDownBulletSpan.LIZ(i3);
        C786410Ut5.q2(spannableStringBuilderValueOf, takoMarkDownBulletSpan, 0, spannableStringBuilderValueOf.length(), 33);
        return spannableStringBuilderValueOf;
    }
}

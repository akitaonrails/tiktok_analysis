package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0M1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$tryUpdateStorageNotice$1$1", f = "DraftBoxFragment.kt", l = {}, m = "invokeSuspend")
public final class C561640M1a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DraftBoxFragment LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C0M1Z LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561640M1a(DraftBoxFragment draftBoxFragment, String str, long j, long j2, int i, C0M1Z c0m1z, InterfaceC1364105Vn<? super C561640M1a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = draftBoxFragment;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = i;
        this.LLILZLL = c0m1z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561640M1a(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TuxTextView tuxTextView;
        boolean z;
        int i;
        CharSequence charSequence;
        Integer numValueOf;
        C1C7U.LIZ("DraftBoxFragment@80e.tryUpdateStorageNotice$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isAdded()) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftBoxFragment@80e.tryUpdateStorageNotice$1$1");
            return unit;
        }
        DraftBoxFragment draftBoxFragment = this.LL;
        String str = this.LLILLJJLI;
        long j = this.LLILLL;
        long j2 = this.LLILZ;
        int i2 = this.LLILZIL;
        C0M1Z c0m1z = this.LLILZLL;
        draftBoxFragment.LLLIILIL = c0m1z;
        Context context = draftBoxFragment.getContext();
        if (context != null) {
            View view = draftBoxFragment.LL;
            if (view != null) {
                tuxTextView = (TuxTextView) view.findViewById(R.id.g72);
            } else {
                tuxTextView = null;
            }
            TuxTextView tuxTextView2 = (TuxTextView) draftBoxFragment.LLIZLLLIL.getValue();
            if (draftBoxFragment.LLLIIIL == null) {
                if (tuxTextView != null) {
                    numValueOf = Integer.valueOf(tuxTextView.getCurrentTextColor());
                } else {
                    numValueOf = null;
                }
                draftBoxFragment.LLLIIIL = numValueOf;
            }
            if (str != null && !a0.LJJJIL(str)) {
                z = false;
            } else {
                z = true;
            }
            boolean z2 = !z;
            if (z2 && !draftBoxFragment.LLLIIL) {
                C0M16 c0m16 = C0M16.LIZ;
                String enterFrom = draftBoxFragment.getEnterFrom();
                c0m16.getClass();
                i = 1;
                C0M16.LIZLLL(j2, j, enterFrom, i2, "show");
                draftBoxFragment.LLLIIL = true;
            } else {
                i = 1;
                if (!z2) {
                    if (draftBoxFragment.LLLIIL) {
                        C0M16 c0m162 = C0M16.LIZ;
                        String enterFrom2 = draftBoxFragment.getEnterFrom();
                        c0m162.getClass();
                        C0M16.LIZLLL(j2, j, enterFrom2, i2, "resolve");
                        draftBoxFragment.LLLIIL = false;
                    }
                    Integer num = draftBoxFragment.LLLIIIL;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        if (tuxTextView != null) {
                            tuxTextView.setTextColor(iIntValue);
                        }
                    }
                    if (tuxTextView2 != null) {
                        tuxTextView2.setMovementMethod(null);
                        C786410Ut5.LLLLZLL(tuxTextView2, 8);
                    }
                }
            }
            if (Intrinsics.LJFF(c0m1z, C561740M1k.LIZ)) {
                if (tuxTextView != null) {
                    tuxTextView.setTextColorRes(R.attr.a1l);
                }
            } else if (Intrinsics.LJFF(c0m1z, C561730M1j.LIZ)) {
                Integer num2 = draftBoxFragment.LLLIIIL;
                if (num2 != null) {
                    int iIntValue2 = num2.intValue();
                    if (tuxTextView != null) {
                        tuxTextView.setTextColor(iIntValue2);
                    }
                }
            } else if (!Intrinsics.LJFF(c0m1z, C561720M1i.LIZ)) {
                throw new C1954807lC();
            }
            if (tuxTextView2 != null) {
                if (str == null) {
                    charSequence = "";
                } else {
                    String string = context.getString(2131829740);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.append(' ');
                    int length = spannableStringBuilder.length();
                    int i3 = 0;
                    int i4 = 0;
                    while (i4 < string.length()) {
                        char cCharAt = string.charAt(i4);
                        int i5 = i3 + 1;
                        if (i3 > 0) {
                            spannableStringBuilder.append((char) 8288);
                        }
                        spannableStringBuilder.append(cCharAt);
                        i4++;
                        i3 = i5;
                    }
                    int length2 = spannableStringBuilder.length();
                    spannableStringBuilder.append((char) 8288);
                    int length3 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) " ");
                    int length4 = spannableStringBuilder.length();
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, context);
                    if (numLIZJ != null) {
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), length, length2, 33);
                    }
                    C786410Ut5.q2(spannableStringBuilder, new StyleSpan(i), length, length2, 33);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_chevron_right_ltr;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1n);
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                    C786410Ut5.q2(spannableStringBuilder, c419910GdJ.LIZIZ(2, context), length3, length4, 33);
                    C786410Ut5.q2(spannableStringBuilder, new C580750Mq9(draftBoxFragment, 2), length, length4, 33);
                    charSequence = spannableStringBuilder;
                }
                tuxTextView2.setText(charSequence);
                tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                if (tuxTextView2 != null) {
                    tuxTextView2.setHighlightColor(0);
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.tryUpdateStorageNotice$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

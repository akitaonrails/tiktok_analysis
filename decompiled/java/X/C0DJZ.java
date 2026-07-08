package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS283S0000000_35;
import njp.a;

/* JADX INFO: renamed from: X.0DJZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.searchcomponent.agent.StreamingTypewriter$startTypewriter$1", f = "StreamingTypewriter.kt", l = {60, 80}, m = "invokeSuspend")
public final class C0DJZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C337000DJa LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DJZ(C337000DJa c337000DJa, InterfaceC1364105Vn<? super C0DJZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c337000DJa;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DJZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        C1C7U.LIZ("StreamingTypewriter@86c9.startTypewriter$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI.LIZ.getMeasuredWidth() == 0) {
                final TuxTextView tuxTextView = this.LLILLJJLI.LIZ;
                this.LL = 1;
                final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                tuxTextView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.1DFo
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        tuxTextView.removeOnLayoutChangeListener(this);
                        c2252611DEt.LJJIFFI(AFwS283S0000000_35.get$arr$(264), Unit.LIZ);
                    }
                });
                Object objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ != C099R.LJFF()) {
                    objLJIJ = Unit.LIZ;
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("StreamingTypewriter@86c9.startTypewriter$1");
                    return objLJFF;
                }
            }
        }
        do {
            C337000DJa c337000DJa = this.LLILLJJLI;
            if (c337000DJa.LJFF < c337000DJa.LJ.length()) {
                C337000DJa c337000DJa2 = this.LLILLJJLI;
                if (!c337000DJa2.LJI) {
                    int iIntValue = 0;
                    String strSubstring = c337000DJa2.LJ.substring(0, c337000DJa2.LJFF + 1);
                    C337000DJa c337000DJa3 = this.LLILLJJLI;
                    int measuredWidth = (c337000DJa3.LIZ.getMeasuredWidth() - c337000DJa3.LIZ.getPaddingLeft()) - c337000DJa3.LIZ.getPaddingRight();
                    if (measuredWidth > 0 && StaticLayout.Builder.obtain(strSubstring, 0, strSubstring.length(), c337000DJa3.LIZ.getPaint(), measuredWidth).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(c337000DJa3.LIZ.getLineSpacingExtra(), c337000DJa3.LIZ.getLineSpacingMultiplier()).setIncludePad(c337000DJa3.LIZ.getIncludeFontPadding()).setMaxLines(c337000DJa3.LIZIZ + 1).build().getLineCount() > c337000DJa3.LIZIZ) {
                        C337000DJa c337000DJa4 = this.LLILLJJLI;
                        c337000DJa4.LJI = true;
                        AnonymousClass0956 anonymousClass0956 = c337000DJa4.LJII;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        int lineEnd = StaticLayout.Builder.obtain(strSubstring, 0, strSubstring.length(), c337000DJa4.LIZ.getPaint(), (c337000DJa4.LIZ.getMeasuredWidth() - c337000DJa4.LIZ.getPaddingLeft()) - c337000DJa4.LIZ.getPaddingRight()).build().getLineEnd(c337000DJa4.LIZIZ - 1) - ((String) c337000DJa4.LJIIIZ.getValue()).length();
                        if (lineEnd < 0) {
                            lineEnd = 0;
                        }
                        String strSubstring2 = strSubstring.substring(0, lineEnd);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) strSubstring2);
                        spannableStringBuilder.append((CharSequence) "...");
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) c337000DJa4.LJIIIIZZ.getValue());
                        int length = spannableStringBuilder.length() - ((String) c337000DJa4.LJIIIIZZ.getValue()).length();
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.uh, c337000DJa4.LIZ.getContext());
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        }
                        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(iIntValue), length, spannableStringBuilder.length(), 33);
                        c337000DJa4.LIZ.setText(spannableStringBuilder);
                    } else {
                        this.LLILLJJLI.LIZ.setText(strSubstring);
                        C337000DJa c337000DJa5 = this.LLILLJJLI;
                        c337000DJa5.LJFF++;
                        j = c337000DJa5.LIZJ;
                        this.LL = 2;
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("StreamingTypewriter@86c9.startTypewriter$1");
            return unit;
        } while (AnonymousClass0958.LIZIZ(j, this) != objLJFF);
        C1C7U.LIZIZ("StreamingTypewriter@86c9.startTypewriter$1");
        return objLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}

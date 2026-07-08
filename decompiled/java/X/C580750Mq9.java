package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mq9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C580750Mq9 extends ClickableSpan {
    public final int $t;
    public Object l0;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                textPaint.setUnderlineText(false);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            case 2:
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public C580750Mq9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(C580750Mq9 c580750Mq9, View view) {
        ((Function0) c580750Mq9.l0).invoke();
    }

    public static final void onClick$1(C580750Mq9 c580750Mq9, View view) {
        Function0<Unit> function0 = ((C572530Mct) c580750Mq9.l0).LIZLLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onClick$2(C580750Mq9 c580750Mq9, View view) {
        Object c098200Yq;
        int iIntValue;
        int iIntValue2;
        EnumC561670M1d enumC561670M1d;
        try {
            c098200Yq = Long.valueOf(C0WYJ.LJFF(view.getContext()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = -1L;
        }
        long jLongValue = ((Number) c098200Yq).longValue();
        Integer value = ((DraftBoxFragment) c580750Mq9.l0).dS().LL.getValue();
        if (value != null) {
            iIntValue = value.intValue();
        } else {
            iIntValue = ((DraftBoxFragment) c580750Mq9.l0).LLJLILLLLZIIL;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        if (numValueOf.intValue() > 0) {
            iIntValue2 = numValueOf.intValue();
        } else {
            iIntValue2 = ((DraftBoxFragment) c580750Mq9.l0).LLJLILLLLZIIL;
        }
        C0M16 c0m16 = C0M16.LIZ;
        String enterFrom = ((DraftBoxFragment) c580750Mq9.l0).getEnterFrom();
        long j = ((DraftBoxFragment) c580750Mq9.l0).LLJLL;
        c0m16.getClass();
        C0M16.LIZLLL(j, jLongValue, enterFrom, iIntValue2, "click");
        DraftBoxFragment draftBoxFragment = (DraftBoxFragment) c580750Mq9.l0;
        C0M26 c0m26 = draftBoxFragment.LLLII;
        if (c0m26 != null) {
            if (Intrinsics.LJFF(draftBoxFragment.LLLIILIL, C561730M1j.LIZ)) {
                enumC561670M1d = EnumC561670M1d.BY_AGE;
            } else {
                enumC561670M1d = EnumC561670M1d.BY_SIZE;
            }
            c0m26.LJIIJJI(false, "storage_alert", enumC561670M1d);
        }
    }

    public static final void updateDrawState$1(C580750Mq9 c580750Mq9, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer num = ((C572530Mct) c580750Mq9.l0).LIZIZ;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        textPaint.setUnderlineText(false);
    }
}

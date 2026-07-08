package X;

import android.graphics.Typeface;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wJA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1775660wJA extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            case 2:
                updateDrawState$2(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C1775660wJA c1775660wJA, View view) {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        AddressEditFragment addressEditFragment;
        String name;
        String link = ((LinkText) c1775660wJA.l0).getLink();
        if (link == null) {
            link = "";
        }
        Uri.Builder builderLIZJ = C919503ib.LIZJ(link, C2097608Jq.LJ());
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IBusinessDependencyService.class.getName();
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
        }
        ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).bulletStart(view.getContext(), builderLIZJ.build().toString(), null, null);
        if (Intrinsics.LJFF(((C1745680vWo) c1775660wJA.l1).LIZ.key, "notice") && (addressEditFragment = AddressEditFragment.LLLII) != null) {
            C1748720vbi.LIZIZ(addressEditFragment, new C049Y(), AFwS268S0000000_26.get$arr$(156));
        }
    }

    public static final void onClick$1(C1775660wJA c1775660wJA, View view) {
        Boolean boolLIZ = C1857750yRZ.LIZ(view);
        if (boolLIZ != null) {
            boolLIZ.booleanValue();
            Function1 function1 = (Function1) c1775660wJA.l0;
            if (function1 != null) {
                function1.invoke(view.getContext());
            }
        }
    }

    public static final void onClick$2(C1775660wJA c1775660wJA, View view) {
        Boolean boolLIZ = C1857750yRZ.LIZ(view);
        if (boolLIZ != null) {
            boolLIZ.booleanValue();
            Function0 function0 = (Function0) c1775660wJA.l0;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public static final void updateDrawState$0(C1775660wJA c1775660wJA, TextPaint textPaint) {
        textPaint.setColor(C960203pA.LIZ(R.attr.a1h, ((TuxTextView) c1775660wJA.l2).getContext()));
        textPaint.setAlpha(191);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C1775660wJA c1775660wJA, TextPaint textPaint) {
        Integer num = (Integer) c1775660wJA.l1;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        Typeface typeface = (Typeface) c1775660wJA.l2;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$2(C1775660wJA c1775660wJA, TextPaint textPaint) {
        Integer num = (Integer) c1775660wJA.l1;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        Typeface typeface = (Typeface) c1775660wJA.l2;
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        textPaint.setUnderlineText(false);
    }

    public C1775660wJA(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}

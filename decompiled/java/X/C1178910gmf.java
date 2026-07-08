package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.skeleton.TuxSkeletonLayout;
import com.ss.android.ugc.aweme.poi.revisit.model.PoiRevisitCardItem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gmf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1178910gmf extends FrameLayout {
    public final ConstraintLayout LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final C19M4 LLIZ;
    public final C430000Gta LLIZLLLIL;
    public final TuxTextView LLJ;
    public final TuxTextView LLJI;
    public final TuxTextView LLJIJIL;
    public final TuxTextView LLJILJIL;
    public final TuxTextView LLJILJILJ;
    public final View LLJILLL;
    public final TuxIconView LLJJ;
    public final TuxSkeletonLayout LLJJI;
    public String LLJJIII;
    public InterfaceC665370Q7z LLJJIJI;

    public C1178910gmf(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final boolean LIZIZ() {
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView == null || tuxTextView.getVisibility() != 0) {
            return false;
        }
        TuxTextView tuxTextView2 = this.LLILZ;
        return C041J.LIZ(tuxTextView2 != null ? tuxTextView2.getText() : null);
    }

    public static boolean LIZJ(PoiRevisitCardItem poiRevisitCardItem) {
        String str;
        String str2 = null;
        if (poiRevisitCardItem != null) {
            str = poiRevisitCardItem.reviewScore;
        } else {
            str = null;
        }
        if (!C123100dR.LIZ(str)) {
            return false;
        }
        if (poiRevisitCardItem != null) {
            str2 = poiRevisitCardItem.reviewMaxScore;
        }
        if (!C123100dR.LIZ(str2) || poiRevisitCardItem == null || poiRevisitCardItem.reviewCount <= 0) {
            return false;
        }
        if (poiRevisitCardItem != null && Intrinsics.LJFF(poiRevisitCardItem.noRating, Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public final void LIZLLL(boolean z) {
        if (z) {
            TuxSkeletonLayout tuxSkeletonLayout = this.LLJJI;
            if (tuxSkeletonLayout != null) {
                C786410Ut5.LLLZL(tuxSkeletonLayout, 0);
            }
            TuxSkeletonLayout tuxSkeletonLayout2 = this.LLJJI;
            if (tuxSkeletonLayout2 != null) {
                tuxSkeletonLayout2.setLoading(true);
                return;
            }
            return;
        }
        TuxSkeletonLayout tuxSkeletonLayout3 = this.LLJJI;
        if (tuxSkeletonLayout3 != null) {
            C786410Ut5.LLLZL(tuxSkeletonLayout3, 8);
        }
        TuxSkeletonLayout tuxSkeletonLayout4 = this.LLJJI;
        if (tuxSkeletonLayout4 == null) {
            return;
        }
        tuxSkeletonLayout4.setLoading(false);
    }

    public C1178910gmf(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.e8c, this, true);
        if (getLayoutParams() == null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(layoutParams);
        }
        this.LL = (ConstraintLayout) findViewById(R.id.eux);
        this.LLILLJJLI = (SmartImageView) findViewById(R.id.f58);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.r4z);
        this.LLILLL = tuxTextView;
        this.LLILZ = (TuxTextView) findViewById(R.id.raq);
        this.LLILZIL = (TuxTextView) findViewById(R.id.qw2);
        this.LLILZLL = (TuxTextView) findViewById(R.id.r1w);
        this.LLIZ = (C19M4) findViewById(R.id.re8);
        this.LLIZLLLIL = (C430000Gta) findViewById(R.id.x2s);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.r8a);
        this.LLJ = tuxTextView2;
        this.LLJI = (TuxTextView) findViewById(R.id.r8_);
        this.LLJIJIL = (TuxTextView) findViewById(R.id.qy5);
        this.LLJILJIL = (TuxTextView) findViewById(R.id.zhm);
        this.LLJILJILJ = (TuxTextView) findViewById(R.id.zhn);
        this.LLJILLL = findViewById(R.id.fkf);
        this.LLJJ = (TuxIconView) findViewById(R.id.rc0);
        this.LLJJI = (TuxSkeletonLayout) findViewById(R.id.rc1);
        if (C426750GoL.LIZLLL(context)) {
            if (tuxTextView != null) {
                tuxTextView.setTextDirection(4);
            }
            if (tuxTextView2 != null) {
                tuxTextView2.setTextDirection(4);
                return;
            }
            return;
        }
        if (tuxTextView != null) {
            tuxTextView.setTextDirection(3);
        }
        if (tuxTextView2 == null) {
            return;
        }
        tuxTextView2.setTextDirection(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05ea  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final com.ss.android.ugc.aweme.poi.revisit.model.PoiRevisitCardItem r24, final X.InterfaceC665370Q7z r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 1526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1178910gmf.LIZ(com.ss.android.ugc.aweme.poi.revisit.model.PoiRevisitCardItem, X.0Q7z, java.lang.String):void");
    }
}

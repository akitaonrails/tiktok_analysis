package X;

import Y.ACListenerS122S0200000_19;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import avg.f;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.model.Organization;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0hzH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225170hzH extends LinearLayout {
    public InterfaceC1225130hzD LL;
    public Organization LLILLJJLI;

    private final Drawable getBackgroundDrawable() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1b);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        return c384050F3z.LIZ(getContext());
    }

    public final Organization getOrganization() {
        return this.LLILLJJLI;
    }

    public C1225170hzH(C19EG c19eg) {
        int i;
        int i2;
        int i3;
        super(c19eg, null, 0);
        setOrientation(1);
        setBackground(getBackgroundDrawable());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        setPaddingRelative(getPaddingStart(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), getPaddingEnd(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        String string = getResources().getString(2131824874);
        Resources resources = getResources();
        if (C0FWJ.LIZ()) {
            i = 2131824872;
        } else {
            i = 2131824873;
        }
        String string2 = resources.getString(i);
        EnumC1225150hzF enumC1225150hzF = EnumC1225150hzF.ADD_TO_PROFILE;
        addView(LIZIZ(string, string2, LIZ(c19eg, enumC1225150hzF), enumC1225150hzF));
        if (C0FWJ.LIZ()) {
            i2 = 2131824867;
        } else {
            i2 = 2131824868;
        }
        if (C0FWJ.LIZ()) {
            i3 = 2131824875;
        } else {
            i3 = 2131824876;
        }
        String string3 = getResources().getString(2131824869);
        String string4 = getResources().getString(i2);
        EnumC1225150hzF enumC1225150hzF2 = EnumC1225150hzF.ADD_TO_POST;
        addView(LIZIZ(string3, string4, LIZ(c19eg, enumC1225150hzF2), enumC1225150hzF2));
        String string5 = getResources().getString(2131824877);
        String string6 = getResources().getString(i3);
        EnumC1225150hzF enumC1225150hzF3 = EnumC1225150hzF.ADD_TO_STORY;
        addView(LIZIZ(string5, string6, LIZ(c19eg, enumC1225150hzF3), enumC1225150hzF3));
    }

    public final void setActionListener(InterfaceC1225130hzD interfaceC1225130hzD) {
        this.LL = interfaceC1225130hzD;
    }

    public final void setHasFundraiser(boolean z) {
        int i;
        View childAt = getChildAt(0);
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, childAt);
        removeView(childAt);
        String string = getResources().getString(2131824874);
        Resources resources = getResources();
        if (C0FWJ.LIZ()) {
            if (z) {
                i = 2131824870;
            } else {
                i = 2131824872;
            }
        } else if (z) {
            i = 2131824871;
        } else {
            i = 2131824873;
        }
        String string2 = resources.getString(i);
        Context context = getContext();
        EnumC1225150hzF enumC1225150hzF = EnumC1225150hzF.ADD_TO_PROFILE;
        addView(LIZIZ(string, string2, LIZ(context, enumC1225150hzF), enumC1225150hzF), 0);
    }

    public final void setOrganization(Organization organization) {
        this.LLILLJJLI = organization;
    }

    public static Drawable LIZ(Context context, EnumC1225150hzF enumC1225150hzF) {
        int i;
        int i2;
        int i3;
        Fragment fragmentLIZLLL;
        C19EG activity;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ != null && (fragmentLIZLLL = abstractC1387200mCcLIZIZ.LIZLLL()) != null && (activity = fragmentLIZLLL.getActivity()) != null) {
            context = activity;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        int[] iArr = C1225160hzG.LIZ;
        int i4 = iArr[enumC1225150hzF.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    i = R.raw.icon_story_star;
                } else {
                    throw new C1954807lC();
                }
            } else {
                i = R.raw.icon_video_fill;
            }
        } else {
            i = R.raw.icon_person_fill;
        }
        c419910GdJ.LIZ = i;
        int i5 = iArr[enumC1225150hzF.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    i2 = R.attr.a09;
                } else {
                    throw new C1954807lC();
                }
            } else {
                i2 = R.attr.a1r;
            }
        } else {
            i2 = R.attr.a1n;
        }
        c419910GdJ.LJ = Integer.valueOf(i2);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        int i6 = iArr[enumC1225150hzF.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    i3 = R.attr.a0b;
                } else {
                    throw new C1954807lC();
                }
            } else {
                i3 = R.attr.a07;
            }
        } else {
            i3 = R.attr.zz;
        }
        c384050F3z.LIZIZ = Integer.valueOf(i3);
        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44));
        c384050F3z.LJIIIIZZ = Float.valueOf(Float.MAX_VALUE);
        c384050F3z.LJIIIZ = Float.valueOf(Float.MAX_VALUE);
        c384050F3z.LJIIJ = Float.valueOf(Float.MAX_VALUE);
        c384050F3z.LJIIJJI = Float.valueOf(Float.MAX_VALUE);
        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.038j, android.view.View] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final C7943038j LIZIZ(String str, String str2, Drawable drawable, EnumC1225150hzF enumC1225150hzF) {
        final Context context = getContext();
        final int i = 0;
        final AttributeSet attributeSet = null;
        ?? r3 = new ConstraintLayout(context, attributeSet, i) { // from class: X.038j
            public final View LL;
            public final TuxTextView LLILLJJLI;
            public final TuxTextView LLILLL;
            public final ImageView LLILZ;

            public final void setIcon(Drawable drawable2) {
                ImageView imageView = this.LLILZ;
                if (imageView != null) {
                    imageView.setBackground(drawable2);
                }
            }

            public final void setSubtitle(String str3) {
                TuxTextView tuxTextView = this.LLILLL;
                if (tuxTextView != null) {
                    tuxTextView.setText(str3);
                }
            }

            public final void setTitle(String str3) {
                TuxTextView tuxTextView = this.LLILLJJLI;
                if (tuxTextView != null) {
                    tuxTextView.setText(str3);
                }
            }

            {
                int iIntValue;
                TuxTextView tuxTextView;
                TuxTextView tuxTextView2;
                super(context, attributeSet, i);
                View viewSd = C786410Ut5.Sd(R.layout.ccj, C786410Ut5.ne(context), this);
                this.LL = viewSd;
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                setBackgroundColor(iIntValue);
                if (viewSd != null) {
                    tuxTextView = (TuxTextView) viewSd.findViewById(R.id.title);
                } else {
                    tuxTextView = null;
                }
                this.LLILLJJLI = tuxTextView;
                if (viewSd != null) {
                    tuxTextView2 = (TuxTextView) viewSd.findViewById(R.id.wlq);
                } else {
                    tuxTextView2 = null;
                }
                this.LLILLL = tuxTextView2;
                this.LLILZ = viewSd != null ? (ImageView) viewSd.findViewById(R.id.jxe) : null;
            }
        };
        r3.setIcon(drawable);
        r3.setTitle(str);
        r3.setSubtitle(str2);
        View.OnClickListener aCListenerS122S0200000_19 = new ACListenerS122S0200000_19(this, enumC1225150hzF, 23);
        if (C1848410yCV.LIZ) {
            aCListenerS122S0200000_19 = new f(aCListenerS122S0200000_19);
        }
        a aVar = new a(aCListenerS122S0200000_19);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(r3);
        }
        r3.setOnClickListener(aVar);
        return r3;
    }
}

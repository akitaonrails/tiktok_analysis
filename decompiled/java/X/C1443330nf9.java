package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import tbk.c;

/* JADX INFO: renamed from: X.0nf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443330nf9 extends LinearLayout implements InterfaceC1445880njG {
    public static final /* synthetic */ int LLJJIJI = 0;
    public final C417340GYa LL;
    public final View LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final FrameLayout LLILZIL;
    public final View LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public C1443340nfA LLJ;
    public InterfaceC1631620sYq<? super Boolean, ? super String, ? super Boolean, Unit> LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public boolean LLJJI;
    public Function0<Unit> LLJJIII;

    public final int getDurationTime() {
        return this.LLIZ;
    }

    public final boolean getOptimizePostErrorMsg() {
        return this.LLJJI;
    }

    public final Function0<Unit> getRetryClickListener() {
        return this.LLJJIII;
    }

    public final boolean getShouldOptimizePostFailedPush() {
        return this.LLJILJILJ;
    }

    public final String getTipsContent() {
        return this.LLJJ;
    }

    public final String getTipsTitle() {
        return this.LLJILLL;
    }

    public C1443330nf9(Context context) {
        super(context, null, 0);
        this.LLIZ = 5;
        this.LLJILLL = context.getResources().getString(2131829608);
        this.LLJJ = context.getResources().getString(2131829607);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d_8, this, true);
        this.LL = (C417340GYa) findViewById(R.id.ld7);
        this.LLILLJJLI = findViewById(R.id.e26);
        this.LLILZ = (TuxTextView) findViewById(R.id.tv_tips);
        this.LLILLL = (TuxTextView) findViewById(R.id.xdq);
        this.LLILZIL = (FrameLayout) findViewById(R.id.jou);
        this.LLILZLL = findViewById(R.id.i4w);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC1445880njG
    public final void LIZ(Bitmap bitmap) {
        C1443340nfA c1443340nfA;
        C19323510in c19323510in;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        C1908480zlO c1908480zlO = C1908480zlO.LIZIZ;
        if (c1908480zlO.LJIJ(1002) == null) {
            C1443340nfA c1443340nfA2 = new C1443340nfA();
            c1908480zlO.LJ(c1443340nfA2);
            c1908480zlO.LJIILL(c1443340nfA2, c1443340nfA2.LIZJ());
            this.LLJ = c1443340nfA2;
        } else {
            InterfaceC19330810jy interfaceC19330810jyLJIJ = c1908480zlO.LJIJ(1002);
            if (interfaceC19330810jyLJIJ instanceof C1443340nfA) {
                c1443340nfA = (C1443340nfA) interfaceC19330810jyLJIJ;
            } else {
                c1443340nfA = null;
            }
            this.LLJ = c1443340nfA;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(getContext());
        if (this.LLJILJILJ && !this.LLJJI && bitmap != null && c19egLIZIZ != null) {
            c cVar = c.LIZ;
            AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(bitmap, 337);
            cVar.getClass();
            c19323510in = new C19323510in(1002, "click_push_publish_fail", c.LIZJ(C0C64.LJIILLIIL().LJIJ(31744, 10, "tool_enable_upload_recover_panel_to_push_duration", true)), new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, c.LIZIZ(awS566S0100000_22, c19egLIZIZ, "PostFailed"), null, 36, 48, 4, 0.5f, null, 20, 20, null, false, -3, 3, null, 0, 0, 0, Boolean.FALSE, 0, 0, 0, 0, 0, this.LLJILLL, null, this.LLJJ, null, 2, null, 3, c19egLIZIZ.getResources().getString(2131857938), null, 36, 48, 4, 0, null, null, 0.5f, null, true, 0, null, null, null, 12, null, null, null, null, null, 0), null, null, 460);
        } else {
            c19323510in = new C19323510in(1002, "click_push_publish_fail", new InnerPushConfig(0L, null, 10000, C1697810uHb.LJIIJJI(1, 2, 3, 4, 5, 6), this.LLIZ), new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, 48, 48, 0.0f, 0.5f, null, 20, 20, null, false, -3, 3, null, 0, 0, 0, Boolean.FALSE, 0, 0, 0, 0, 0, null, null, null, null, 2, null, 0, null, null, 36, 48, 4, 0, null, null, 0.5f, null, true, 0, null, null, null, 12, null, null, null, null, null, 0), null, null, 460);
        }
        C1443340nfA c1443340nfA3 = this.LLJ;
        if (c1443340nfA3 != null) {
            c1443340nfA3.LLILLL.put(Long.valueOf(c19323510in.LJ), new WeakReference<>(this));
        }
        c1908480zlO.LIZLLL(c19323510in);
    }

    public final void setDismissListener(InterfaceC1631620sYq<? super Boolean, ? super String, ? super Boolean, Unit> interfaceC1631620sYq) {
        this.LLJI = interfaceC1631620sYq;
    }

    public final void setDurationTime(int i) {
        this.LLIZ = i;
    }

    public final void setOptimizePostErrorMsg(boolean z) {
        this.LLJJI = z;
    }

    public final void setRetryClickListener(Function0<Unit> function0) {
        this.LLJJIII = function0;
    }

    public final void setRetryVisibility(int i) {
        C786410Ut5.LLLLZLL(this.LLILLL, i);
    }

    public final void setShouldOptimizePostFailedPush(boolean z) {
        this.LLJILJILJ = z;
    }

    public final void setTipsContent(String str) {
        this.LLJJ = str;
    }

    public final void setTipsTitle(String str) {
        this.LLJILLL = str;
    }

    @Override // X.InterfaceC1445880njG
    public final void LIZIZ(boolean z, boolean z2) {
        String str;
        InterfaceC539120LCk interfaceC539120LCk;
        if (z) {
            str = "has_new_upload";
        } else if (z2) {
            str = "is_retry_dismiss_from_external";
        } else {
            str = "";
        }
        C1443340nfA c1443340nfA = this.LLJ;
        if (c1443340nfA != null && (interfaceC539120LCk = c1443340nfA.LL) != null) {
            interfaceC539120LCk.LIZIZ(str, null, false);
        }
    }

    @Override // X.InterfaceC1445880njG
    public final void setText(String str, String str2) {
        this.LLILZ.setText(str);
        if (!Intrinsics.LJFF(str2, "")) {
            this.LLILLL.setText(str2);
        }
    }

    public final void LIZJ(Bitmap bitmap, int i, int i2, float f, boolean z) {
        View view = this.LLILZLL;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        C786410Ut5.W5(view, layoutParams);
        if (z) {
            View view2 = this.LLILZLL;
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view2.getLayoutParams();
            layoutParams2.addRule(15);
            C786410Ut5.W5(view2, layoutParams2);
        }
        this.LL.setScaleType(ImageView.ScaleType.CENTER_CROP);
        C417340GYa c417340GYa = this.LL;
        c417340GYa.LL = f;
        c417340GYa.setImageBitmap(bitmap);
        c417340GYa.invalidate();
    }
}

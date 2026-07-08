package X;

import Y.ACListenerS131S0200000_29;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS254S0300000_10;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS430S0200000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.12Dy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19721212Dy extends RecyclerView.ViewHolder implements InterfaceC1259590isn {
    public static final /* synthetic */ int LLJJ = 0;
    public final InterfaceC2193211AsZ LL;
    public final View LLILLJJLI;
    public final SmartImageView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final C197039127h LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public C19720512Dr LLJ;
    public boolean LLJI;
    public RunnableC19720712Dt LLJIJIL;
    public final BPEAHandler LLJILJIL;
    public boolean LLJILJILJ;
    public final C01GW LLJILLL;

    public final GradientDrawable I5() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(8));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        return gradientDrawable;
    }

    public final int R5(float f) {
        int iLIZIZ;
        float f2 = this.itemView.getResources().getDisplayMetrics().scaledDensity;
        if (f2 <= 0.0f || (iLIZIZ = C814420VxA.LIZIZ(f / f2)) < 0) {
            return 0;
        }
        return iLIZIZ;
    }

    public C19721212Dy(ViewGroup viewGroup, InterfaceC2193211AsZ interfaceC2193211AsZ) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.evz, viewGroup, false));
        this.LL = interfaceC2193211AsZ;
        View viewFindViewById = this.itemView.findViewById(R.id.eqx);
        this.LLILLJJLI = viewFindViewById;
        this.LLILLL = (SmartImageView) this.itemView.findViewById(R.id.lkw);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.tv_title);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.tv_subtitle);
        C197039127h c197039127h = (C197039127h) this.itemView.findViewById(R.id.cp8);
        this.LLILZLL = c197039127h;
        this.LLIZ = this.itemView.findViewById(R.id.e1g);
        this.LLIZLLLIL = this.itemView.findViewById(R.id.fz3);
        this.LLJILJIL = new BPEAHandler(Looper.getMainLooper());
        this.LLJILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 951));
        c197039127h.LJJJJL(new AwS580S0100000_1(this, 630));
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        viewFindViewById.addOnLayoutChangeListener(new C12YD(this, 12));
    }

    public static int N5(TuxTextView tuxTextView, int i) {
        Layout layout;
        int lineCount;
        if (i == 0 || (layout = tuxTextView.getLayout()) == null || (lineCount = layout.getLineCount()) == 0) {
            return 0;
        }
        for (int i2 = 0; i2 < lineCount; i2++) {
            int ellipsisStart = layout.getEllipsisStart(i2);
            if (ellipsisStart > 0) {
                return layout.getLineStart(i2) + ellipsisStart;
            }
        }
        int lineEnd = layout.getLineEnd(lineCount - 1);
        if (lineEnd <= i) {
            return lineEnd;
        }
        return i;
    }

    public static int P5(TuxTextView tuxTextView, int i) {
        int maxLines = tuxTextView.getMaxLines();
        if (maxLines > 0 && i > maxLines) {
            return 1;
        }
        Layout layout = tuxTextView.getLayout();
        if (layout == null) {
            return 0;
        }
        int lineCount = layout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (layout.getEllipsisCount(i2) > 0) {
                return 1;
            }
        }
        return 0;
    }

    @Override // X.InterfaceC1259590isn
    public final void LLIIZ(final C19720512Dr c19720512Dr, boolean z) {
        int i;
        String str;
        int i2;
        C12E4 next;
        String simpleName;
        int measuredWidth;
        C443120HZe c443120HZe;
        C443120HZe c443120HZe2;
        boolean z2;
        int i3;
        View view;
        View view2 = this.LLIZLLLIL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view2);
        if (c19720512Dr != null) {
            C19720512Dr c19720512Dr2 = this.LLJ;
            if (c19720512Dr2 != null) {
                str = c19720512Dr2.LJ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, c19720512Dr.LJ) && this.LLJI) {
                return;
            }
            this.LLJ = c19720512Dr;
            this.LLJI = false;
            C786410Ut5.LJLLLLLL(8, this.LLILLJJLI);
            View view3 = this.LLILLJJLI;
            ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = 0;
                C786410Ut5.W5(view3, layoutParams);
                this.LLILZ.setTextSize(2, 14.0f);
                this.LLILZIL.setTextSize(2, 13.0f);
                C786410Ut5.LJLLLLLL(0, this.LLILZIL);
                this.LLJI = false;
                this.LLJILJILJ = false;
                this.LLILLL.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                this.LLILLL.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                String str2 = c19720512Dr.LJIIL;
                if (str2 != null && str2.length() != 0) {
                    this.LLILLL.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    this.LLILLL.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                    ImageUrlModel imageUrlModelLIZJ = C438710HIf.LIZJ(c19720512Dr.LJIIL);
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZJ);
                    if (C07BJ.LIZ()) {
                        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
                        c1331670kl3LJIIIIZZ.LJIIIIZZ = iLIZIZ;
                        c1331670kl3LJIIIIZZ.LJIIIZ = iLIZIZ2;
                    }
                    c1331670kl3LJIIIIZZ.LJJI(this.LLILLL);
                    c1331670kl3LJIIIIZZ.LJJIIZI(I5());
                    c1331670kl3LJIIIIZZ.LJIL(I5());
                    c1331670kl3LJIIIIZZ.LJJJIL = new InterfaceC658750Psf() { // from class: X.12E2
                        @Override // X.InterfaceC658750Psf
                        public final void onImageLoaded(boolean z3, String str3, JSONObject jSONObject) {
                        }

                        /* JADX WARN: Type inference failed for: r3v0, types: [X.12Dt, java.lang.Runnable] */
                        @Override // X.InterfaceC658750Psf
                        public final void Ck(JSONObject jSONObject) {
                            final boolean z3;
                            final String str3;
                            if (jSONObject.optBoolean("isSuccess")) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            int i4 = C19721212Dy.LLJJ;
                            int iOptInt = jSONObject.optInt("from", -1);
                            if (iOptInt != 0) {
                                if (iOptInt != 1) {
                                    if (iOptInt != 2) {
                                        str3 = "unknown";
                                    } else {
                                        str3 = "disk";
                                    }
                                } else {
                                    str3 = "memory";
                                }
                            } else {
                                str3 = "network";
                            }
                            C19721212Dy c19721212Dy = this.LL;
                            RunnableC19720712Dt runnableC19720712Dt = c19721212Dy.LLJIJIL;
                            if (runnableC19720712Dt != null) {
                                c19721212Dy.LLJILJIL.removeCallbacks(runnableC19720712Dt);
                            }
                            final C19721212Dy c19721212Dy2 = this.LL;
                            final C19720512Dr c19720512Dr3 = c19720512Dr;
                            final long j = jCurrentTimeMillis;
                            ?? r3 = new Runnable() { // from class: X.12Dt
                                public final void LIZ() {
                                    C19720512Dr c19720512Dr4 = c19720512Dr3;
                                    c19720512Dr4.LJIILIIL = z3 ? "success" : "failure";
                                    c19720512Dr4.LJIILJJIL = Long.valueOf(System.currentTimeMillis() - j);
                                    c19720512Dr3.LJIJJLI = str3;
                                    if (!z3) {
                                        c19721212Dy2.LLILLL.setBackground(null);
                                    }
                                    C19720112Dn c19720112Dn = C19720112Dn.LIZ;
                                    C19720512Dr c19720512Dr5 = c19720512Dr3;
                                    EnumC19720912Dv enumC19720912Dv = EnumC19720912Dv.IMAGE_SHOW;
                                    c19720112Dn.getClass();
                                    C19720112Dn.LIZJ(c19720512Dr5, enumC19720912Dv, null);
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("SearchCSIProfileBannerViewHolderV3@6b6b.bindImage$2$onImageSensibleLoaded$2");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("SearchCSIProfileBannerViewHolderV3@6b6b.bindImage$2$onImageSensibleLoaded$2");
                                }
                            };
                            C786410Ut5.LJLIIL(200L, c19721212Dy2.LLJILJIL, r3);
                            c19721212Dy2.LLJIJIL = r3;
                        }
                    };
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LJ = C418440Gaw.LIZIZ(8);
                    c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                } else {
                    Context context = this.itemView.getContext();
                    Integer num = c19720512Dr.LJIJI;
                    if (num != null && num.intValue() == 2) {
                        i2 = R.raw.icon_camera_hash_fill;
                    } else if (((Number) C18110077k.LIZ.getValue()).intValue() == 1) {
                        i2 = R.raw.icon_camera_plus_fill;
                    } else {
                        i2 = R.raw.icon_camera_fill;
                    }
                    TuxIconDrawable tuxIconDrawable = new TuxIconDrawable(context, i2);
                    tuxIconDrawable.LJII(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    tuxIconDrawable.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
                    tuxIconDrawable.LJI(R.attr.a04, this.itemView.getContext());
                    C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c19720512Dr.LJI));
                    c1331670kl3LJIIIIZZ2.LJJIIZI(tuxIconDrawable);
                    c1331670kl3LJIIIIZZ2.LJJI(this.LLILLL);
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
                }
                this.LLILZ.setText(c19720512Dr.LIZ);
                this.LLILZIL.setText(c19720512Dr.LIZIZ);
                C197039127h c197039127h = this.LLILZLL;
                String str3 = c19720512Dr.LJII;
                if (str3 == null) {
                    str3 = "Create";
                }
                c197039127h.setText(str3);
                Iterator<C12E4> it2 = C12E5.LIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.LJFF(), c19720512Dr.LJIIZILJ)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                final C12E4 c12e4 = next;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("bindButton: handler=");
                if (c12e4 != null) {
                    simpleName = c12e4.getClass().getSimpleName();
                } else {
                    simpleName = null;
                }
                sbLIZ.append(simpleName);
                sbLIZ.append(", primaryScene=");
                sbLIZ.append(c19720512Dr.LJIIZILJ);
                C2188811AlT.LIZIZ(sbLIZ);
                AwS395S0200000_29 awS395S0200000_29 = new AwS395S0200000_29(c19720512Dr, this, 94);
                final AwS430S0200000_29 awS430S0200000_29 = new AwS430S0200000_29(awS395S0200000_29, c19720512Dr, 104);
                final AwS254S0300000_10 awS254S0300000_10 = new AwS254S0300000_10(c19720512Dr, this, awS395S0200000_29, 19);
                C786410Ut5.I7(new C19IN() { // from class: X.12E1
                    @Override // X.C19IN
                    public final void LIZ(View view4) {
                        this.S5(c19720512Dr, EnumC2193181AsW.CLICK, C2097908Jt.LIZJ(new Pair("click_area", "button")));
                        try {
                            C12E4 c12e42 = c12e4;
                            if (c12e42 != null) {
                                c12e42.LIZIZ(this.itemView.getContext(), c19720512Dr, awS430S0200000_29);
                            } else {
                                awS430S0200000_29.invoke();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            awS430S0200000_29.invoke();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(LSPassThroughRecordSizeConfig.DEFAULT, true);
                    }
                }, this.LLILZLL);
                this.LLILLL.setClickable(true);
                C786410Ut5.I7(new C19IN() { // from class: X.12Dz
                    @Override // X.C19IN
                    public final void LIZ(View view4) {
                        boolean z3;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onClick: image area clicked, handler=");
                        if (c12e4 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        sbLIZ2.append(z3);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        this.S5(c19720512Dr, EnumC2193181AsW.CLICK, C2097908Jt.LIZJ(new Pair("click_area", "image")));
                        try {
                            C12E4 c12e42 = c12e4;
                            if (c12e42 != null) {
                                c12e42.LIZIZ(this.itemView.getContext(), c19720512Dr, awS254S0300000_10);
                            } else {
                                awS254S0300000_10.invoke();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            awS254S0300000_10.invoke();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(LSPassThroughRecordSizeConfig.DEFAULT, true);
                    }
                }, this.LLILLL);
                C786410Ut5.I7(new C19IN() { // from class: X.12E0
                    @Override // X.C19IN
                    public final void LIZ(View view4) {
                        boolean z3;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onClick: text area clicked, handler=");
                        if (c12e4 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        sbLIZ2.append(z3);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        this.S5(c19720512Dr, EnumC2193181AsW.CLICK, C2097908Jt.LIZJ(new Pair("click_area", "text")));
                        try {
                            C12E4 c12e42 = c12e4;
                            if (c12e42 != null) {
                                c12e42.LIZIZ(this.itemView.getContext(), c19720512Dr, awS254S0300000_10);
                            } else {
                                awS254S0300000_10.invoke();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            awS254S0300000_10.invoke();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(LSPassThroughRecordSizeConfig.DEFAULT, true);
                    }
                }, this.itemView);
                C786410Ut5.I7(new ACListenerS131S0200000_29(this, c19720512Dr, 51), this.LLIZ);
                String str4 = c19720512Dr.LIZ;
                String str5 = "";
                if (str4 == null) {
                    str4 = "";
                }
                String str6 = c19720512Dr.LIZIZ;
                if (str6 != null) {
                    str5 = str6;
                }
                C430700Gui c430700Gui = (C430700Gui) this.LLJILLL.getValue();
                Object parent = c430700Gui.LIZIZ.getParent();
                if ((parent instanceof LinearLayout) && (view = (View) parent) != null && view.getMeasuredWidth() > 0) {
                    measuredWidth = view.getMeasuredWidth();
                } else {
                    int measuredWidth2 = c430700Gui.LIZ.getMeasuredWidth();
                    if (measuredWidth2 <= 0 ? (measuredWidth = c430700Gui.LIZ.getResources().getDisplayMetrics().widthPixels - C430700Gui.LJ) < 100 : (measuredWidth = measuredWidth2 - C430700Gui.LJ) < 100) {
                        measuredWidth = 100;
                    }
                }
                int iLIZ = c430700Gui.LIZ(14.0f, str4, measuredWidth);
                if (iLIZ <= 1) {
                    c443120HZe = new C443120HZe(Float.valueOf(14.0f), Boolean.TRUE, Integer.valueOf(iLIZ));
                } else {
                    int iLIZ2 = c430700Gui.LIZ(12.0f, str4, measuredWidth);
                    if (iLIZ2 <= 1) {
                        c443120HZe = new C443120HZe(Float.valueOf(12.0f), Boolean.TRUE, Integer.valueOf(iLIZ2));
                    } else {
                        c443120HZe = new C443120HZe(Float.valueOf(14.0f), Boolean.FALSE, Integer.valueOf(iLIZ));
                    }
                }
                float fFloatValue = ((Number) c443120HZe.getFirst()).floatValue();
                boolean zBooleanValue = ((Boolean) c443120HZe.getSecond()).booleanValue();
                ((Number) c443120HZe.getThird()).intValue();
                if (zBooleanValue && str5.length() > 0) {
                    int iLIZ3 = c430700Gui.LIZ(13.0f, str5, measuredWidth);
                    if (iLIZ3 <= 1) {
                        c443120HZe2 = new C443120HZe(Float.valueOf(13.0f), Integer.valueOf(C430700Gui.LIZJ), Integer.valueOf(iLIZ3));
                    } else {
                        int iLIZ4 = c430700Gui.LIZ(12.0f, str5, measuredWidth);
                        if (iLIZ4 <= 1) {
                            c443120HZe2 = new C443120HZe(Float.valueOf(12.0f), Integer.valueOf(C430700Gui.LIZJ), Integer.valueOf(iLIZ4));
                        } else {
                            c443120HZe2 = new C443120HZe(Float.valueOf(13.0f), Integer.valueOf(C430700Gui.LIZLLL), Integer.valueOf(iLIZ4));
                        }
                    }
                } else {
                    c443120HZe2 = new C443120HZe(Float.valueOf(13.0f), Integer.valueOf(C430700Gui.LIZJ), 0);
                }
                float fFloatValue2 = ((Number) c443120HZe2.getFirst()).floatValue();
                int iIntValue = ((Number) c443120HZe2.getSecond()).intValue();
                ((Number) c443120HZe2.getThird()).intValue();
                if (zBooleanValue && str5.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.LLJI = true;
                this.LLILZ.setTextSize(2, fFloatValue);
                TuxTextView tuxTextView = this.LLILZIL;
                if (z2) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                C786410Ut5.LJLLLLLL(i3, tuxTextView);
                if (z2) {
                    this.LLILZIL.setTextSize(2, fFloatValue2);
                }
                View view4 = this.LLILLJJLI;
                ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = iIntValue;
                    C786410Ut5.W5(view4, layoutParams2);
                    this.LLILLJJLI.requestLayout();
                    C786410Ut5.LJLLLLLL(0, this.LLILLJJLI);
                    View view5 = this.itemView;
                    if (view5.isAttachedToWindow()) {
                        if (!Intrinsics.LJFF(this.LLJ, c19720512Dr) || this.LLILLJJLI.getVisibility() != 0) {
                            return;
                        }
                        S5(c19720512Dr, EnumC2193181AsW.SHOW, null);
                        return;
                    }
                    view5.addOnAttachStateChangeListener(new C12YI(view5, this, c19720512Dr, 1));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        C786410Ut5.LJLLLLLL(8, this.LLILLJJLI);
        this.LLJ = null;
        this.LLJI = false;
    }

    public static int L5(int i, TuxTextView tuxTextView, CharSequence charSequence) {
        String str = (String) charSequence;
        int i2 = 1;
        int lineCount = 0;
        if (str.length() == 0) {
            return 0;
        }
        int paddingLeft = (i - tuxTextView.getPaddingLeft()) - tuxTextView.getPaddingRight();
        if (paddingLeft >= 1) {
            i2 = paddingLeft;
        }
        try {
            lineCount = StaticLayout.Builder.obtain(charSequence, 0, str.length(), new TextPaint(tuxTextView.getPaint()), i2).build().getLineCount();
            return lineCount;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return lineCount;
        }
    }

    public final void S5(C19720512Dr c19720512Dr, EnumC2193181AsW enumC2193181AsW, Map<String, ? extends Object> map) {
        this.LL.LJ(c19720512Dr, enumC2193181AsW, map);
    }
}

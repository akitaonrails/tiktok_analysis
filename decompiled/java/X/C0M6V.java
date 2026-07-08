package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.airemix.api.IAIRemixService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M6V, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M6V extends AbstractC562050M2p<C561950M2f> {
    public final View LL;
    public final InterfaceC497601wk LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final AtomicBoolean LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final InterfaceC562980M6e LLJJ;
    public boolean LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C1DW6 LLJJJ;
    public InterfaceC866830XzV LLJJJIL;
    public Drawable LLJJJJ;
    public final List<String> LLJJJJJIL;
    public C0M6S LLJJJJLIIL;

    public final void N5() {
        boolean z;
        P5("cancelAnimation");
        ViewGroup viewGroup = (ViewGroup) this.LLJILLL.getValue();
        if (viewGroup != null) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        if (this.LLJJI) {
            InterfaceC562980M6e interfaceC562980M6e = this.LLJJ;
            if (interfaceC562980M6e != null) {
                z = true;
                interfaceC562980M6e.stop();
            } else {
                z = false;
            }
            this.LLJJI = false;
            C0M6Y c0m6y = C0M6Y.LIZ;
            boolean z2 = this.LLJILLL.getValue() != null;
            String str = z ? "success" : "failed";
            c0m6y.getClass();
            C0M6Y.LIZLLL("stop", str, z2, z);
        }
    }

    public final ViewGroup R5() {
        return (ViewGroup) this.LLJILJILJ.getValue();
    }

    public final ViewGroup S5() {
        return (ViewGroup) this.LLJILJIL.getValue();
    }

    public final void onViewDetachedFromWindow() {
        P5("onViewDetachedFromWindow: ");
        this.LLIZ = false;
        N5();
        C0M6O c0m6o = (C0M6O) this.LLJJIII.getValue();
        if (c0m6o == null || !this.LLJJIJIL) {
            return;
        }
        P5("unregisterObserver");
        C1DW6 c1dw6 = this.LLJJJ;
        if (c1dw6 != null) {
            c0m6o.LJ(c1dw6);
        }
        this.LLJJJ = null;
        InterfaceC866830XzV interfaceC866830XzV = this.LLJJJIL;
        if (interfaceC866830XzV != null) {
            c0m6o.LJFF(interfaceC866830XzV);
        }
        this.LLJJJIL = null;
        this.LLJJIJIL = false;
    }

    public static void U5(Context context) {
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(2131846097);
        creativeToastBuilder.acrossActivities(false);
        C1390380mHk.LIZJ(context, 8013, creativeToastBuilder);
        C0M6Y.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("referpage_name", "draft_page");
        C20684815ws.LJIILLIIL("ttcrt_cannot_delete_airemix_draft_toast_show", c0lab.LIZ);
        C0M6Y.LIZ("reportRemixEntranceCannotManageToastShow: ");
    }

    public final void P5(String str) {
        InterfaceC562800M5m interfaceC562800M5m = (InterfaceC562800M5m) this.LLJJIJI.getValue();
        if (interfaceC562800M5m != null) {
            interfaceC562800M5m.LJ("AIRemixDraftBoxEntranceViewHolder", str);
        }
    }

    public final void T5(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC497601wk interfaceC497601wk = this.LLILLJJLI;
        if (interfaceC497601wk != null) {
            C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C0M6Q(this, str, jCurrentTimeMillis, null), 2);
        }
    }

    public C0M6V(View view, C054G c054g) {
        boolean z;
        String str;
        InterfaceC562980M6e interfaceC562980M6eLIZ;
        super(view);
        this.LL = view;
        this.LLILLJJLI = c054g;
        boolean z2 = false;
        this.LLILZLL = new AtomicBoolean(false);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 841));
        this.LLIZLLLIL = c01gwLIZIZ;
        this.LLJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 867));
        this.LLJI = C452501pT.LIZIZ(new AwS552S0100000_8(this, 846));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 848));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 865));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 844));
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS552S0100000_8(this, 851));
        this.LLJILLL = c01gwLIZIZ2;
        this.LLJJIII = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(352));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(350));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(361));
        this.LLJJJJJIL = new ArrayList();
        this.LLJJJJLIIL = C0M6S.NONE;
        ((C424560Gko) c01gwLIZIZ.getValue()).setCornerRadius(C418440Gaw.LIZIZ(8));
        ViewGroup viewGroup = (ViewGroup) c01gwLIZIZ2.getValue();
        if (viewGroup != null) {
            IAIRemixService.LIZ.getClass();
            InterfaceC562970M6d interfaceC562970M6dLJIIIIZZ = C563030M6j.LIZ().LJIIIIZZ();
            if (interfaceC562970M6dLJIIIIZZ != null) {
                interfaceC562980M6eLIZ = interfaceC562970M6dLJIIIIZZ.LIZ(viewGroup);
            } else {
                interfaceC562980M6eLIZ = null;
            }
            this.LLJJ = interfaceC562980M6eLIZ;
        }
        C0M6Y c0m6y = C0M6Y.LIZ;
        if (viewGroup != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLJJ != null) {
            z2 = true;
            str = "success";
        } else {
            str = "failed";
        }
        c0m6y.getClass();
        C0M6Y.LIZLLL("setup", str, z, z2);
    }

    @Override // X.AbstractC562050M2p
    public final void I5(C561950M2f c561950M2f, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bind: isEditing=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", refreshCover=");
        sbLIZ.append(this.LLILZIL);
        P5(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILLL) {
            C786410Ut5.T4(this.LL, 0.4f);
            C0M31.LIZ(this.LL, new AwS552S0100000_8(this, 854));
        } else {
            C786410Ut5.T4(this.LL, 1.0f);
            C0M31.LIZ(this.LL, new AwS552S0100000_8(this, 857));
        }
        C0CHQ.LIZ().LJIIJJI();
        this.LL.setOnLongClickListener(new ViewOnLongClickListenerC580930MqR(this, 3));
    }

    public final void L5(C0M6S c0m6s, int i) {
        Context context = this.LL.getContext();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cva, R5(), false);
        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.jxe);
        C426770GoN c426770GoN = (C426770GoN) viewTd.findViewById(R.id.eyr);
        TuxSpinner tuxSpinner = (TuxSpinner) viewTd.findViewById(R.id.nl1);
        TextView textView = (TextView) viewTd.findViewById(R.id.text);
        int i2 = C0M6U.LIZ[c0m6s.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return;
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                    C786410Ut5.LLLLLLIL(c426770GoN, 8);
                    C786410Ut5.LLZILL(tuxSpinner, 8);
                    textView.setText(context.getResources().getQuantityString(2131755658, i, Integer.valueOf(i)));
                } else {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    tuxIconView.setIconRes(R.raw.icon_color_warning_red);
                    tuxIconView.LIZ();
                    C786410Ut5.LLLLLLIL(c426770GoN, 8);
                    C786410Ut5.LLZILL(tuxSpinner, 8);
                    textView.setText(context.getResources().getString(2131846117));
                }
            } else {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                C786410Ut5.LLLLLLIL(c426770GoN, 8);
                C786410Ut5.LLZILL(tuxSpinner, 0);
                textView.setText(context.getResources().getString(2131846118));
            }
        } else {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
            C786410Ut5.LLLLLLIL(c426770GoN, 0);
            c426770GoN.setCount(i);
            C786410Ut5.LLZILL(tuxSpinner, 8);
            textView.setText(context.getResources().getString(2131846116));
        }
        C786410Ut5.LJJJJI(R5());
        R5().addView(viewTd);
    }

    public final void W5(C0M6S c0m6s, List<C0M6P> list) {
        boolean z;
        View viewTd;
        FrameLayout.LayoutParams layoutParams;
        boolean z2;
        boolean z3;
        String str;
        if (C562950M6b.LIZ[c0m6s.ordinal()] == 1) {
            P5("startAnimation");
            ViewGroup viewGroup = (ViewGroup) this.LLJILLL.getValue();
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            if (!this.LLJJI) {
                InterfaceC562980M6e interfaceC562980M6e = this.LLJJ;
                if (interfaceC562980M6e != null) {
                    z2 = true;
                    interfaceC562980M6e.start();
                } else {
                    z2 = false;
                }
                this.LLJJI = z2;
                C0M6Y c0m6y = C0M6Y.LIZ;
                if (this.LLJILLL.getValue() != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z2) {
                    str = "success";
                } else {
                    str = "failed";
                }
                c0m6y.getClass();
                C0M6Y.LIZLLL("start", str, z3, z2);
            }
            C786410Ut5.LJLZ(0, S5());
        } else {
            N5();
            C786410Ut5.LJLZ(8, S5());
        }
        ArrayList arrayList = (ArrayList) list;
        L5(c0m6s, arrayList.size());
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((C0M6P) obj).LIZ)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C0M6P) it2.next()).LIZIZ);
        }
        List<String> list2 = this.LLJJJJJIL;
        if (c0m6s == this.LLJJJJLIIL) {
            ArrayList arrayList4 = (ArrayList) list2;
            if (arrayList4.size() == arrayList3.size() && Intrinsics.LJFF(arrayList4, arrayList3)) {
                return;
            }
        }
        ((ArrayList) this.LLJJJJJIL).clear();
        ((ArrayList) this.LLJJJJJIL).addAll(arrayList3);
        if (c0m6s == C0M6S.GENERATING) {
            z = true;
            if (!arrayList3.isEmpty()) {
                Context context = this.LL.getContext();
                ViewGroup viewGroupS5 = S5();
                if (!arrayList3.isEmpty()) {
                    if (arrayList3.size() == 1) {
                        String str2 = (String) C13LP.LJJJJZI(arrayList3);
                        viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cvb, viewGroupS5, false);
                        ViewGroup.LayoutParams layoutParams2 = viewTd.getLayoutParams();
                        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
                            layoutParams.gravity = 17;
                        }
                        if (str2.length() > 0) {
                            ((C1322110kVd) viewTd.findViewById(R.id.f58)).setImageURI(str2);
                        }
                    } else {
                        viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cvd, viewGroupS5, false);
                        C1322110kVd c1322110kVd = (C1322110kVd) viewTd.findViewById(R.id.f5c).findViewById(R.id.f58);
                        C1322110kVd c1322110kVd2 = (C1322110kVd) viewTd.findViewById(R.id.f5k).findViewById(R.id.f58);
                        if (!arrayList3.isEmpty()) {
                            String str3 = (String) C13LP.LJJJLL(arrayList3);
                            if (str3 == null) {
                                str3 = "";
                            }
                            if (str3.length() > 0) {
                                c1322110kVd.setImageURI(str3);
                            }
                        }
                        if (arrayList3.size() > 1) {
                            String str4 = (String) ListProtector.get(arrayList3, 1);
                            if (str4.length() > 0) {
                                c1322110kVd2.setImageURI(str4);
                            }
                        }
                    }
                    C786410Ut5.LJJJJI(S5());
                    S5().addView(viewTd);
                }
            }
        } else {
            z = false;
        }
        V5(c0m6s, (String) C13LP.LJJJJZI(arrayList3), z);
        C0M6Y c0m6y2 = C0M6Y.LIZ;
        C0M6S c0m6s2 = this.LLJJJJLIIL;
        int size = arrayList.size();
        c0m6y2.getClass();
        C0M6Y.LJFF(c0m6s2, c0m6s, size);
        this.LLJJJJLIIL = c0m6s;
    }

    public final void V5(final C0M6S c0m6s, String str, final boolean z) {
        final Float fValueOf;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        if (str.length() == 0) {
            C0M6Y.LIZ.getClass();
            C0M6Y.LIZJ(c0m6s, false, z, "failed", 0L, "empty_url");
            return;
        }
        if (z) {
            fValueOf = Float.valueOf(C418440Gaw.LIZIZ(12));
        } else {
            fValueOf = null;
        }
        final Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zb, this.LL.getContext());
        final Context context = this.LL.getContext();
        final AwS587S0100000_8 awS587S0100000_8 = new AwS587S0100000_8(this, 575);
        C1324750kZt.LJIIL((C1322110kVd) this.LLIZLLLIL.getValue(), str, -1, -1, Bitmap.Config.ARGB_8888, new AbstractC1291220jho(context, fValueOf, numLIZJ, awS587S0100000_8) { // from class: X.0ein
            public final Context LIZ;
            public final Float LIZIZ;
            public final Integer LIZJ;
            public final Function1<Bitmap, Unit> LIZLLL;

            @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
            public final String getName() {
                return "BlurAndMaskPostprocessor";
            }

            @Override // X.AbstractC1291220jho
            public final void process(Bitmap bitmap, Bitmap bitmap2) {
                Float f = this.LIZIZ;
                if (f != null) {
                    float fFloatValue = f.floatValue();
                    RenderScript renderScriptCreate = RenderScript.create(this.LIZ);
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap2);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmap);
                    scriptIntrinsicBlurCreate.setRadius(C13LZ.LIZLLL(fFloatValue, 0.0f, 25.0f));
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmap);
                    allocationCreateFromBitmap.destroy();
                    allocationCreateFromBitmap2.destroy();
                    scriptIntrinsicBlurCreate.destroy();
                    renderScriptCreate.destroy();
                } else {
                    new Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
                }
                Integer num = this.LIZJ;
                if (num != null) {
                    int iIntValue = num.intValue();
                    Canvas canvas = new Canvas(bitmap);
                    Paint paint = new Paint();
                    paint.setColor(iIntValue);
                    paint.setAntiAlias(true);
                    canvas.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), paint);
                }
                Function1<Bitmap, Unit> function1 = this.LIZLLL;
                if (function1 != null) {
                    Bitmap.Config config = bitmap.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    function1.invoke(bitmap.copy(config, false));
                }
            }

            {
                this.LIZ = context;
                this.LIZIZ = fValueOf;
                this.LIZJ = numLIZJ;
                this.LIZLLL = awS587S0100000_8;
            }
        }, null, new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0M6Z
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJFF(Object obj, String str2) {
            }

            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LIZLLL(String str2, Throwable th) {
                this.LIZIZ.LLJJJJ = null;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                C0M6Y c0m6y = C0M6Y.LIZ;
                C0M6S c0m6s2 = c0m6s;
                boolean z2 = z;
                c0m6y.getClass();
                C0M6Y.LIZJ(c0m6s2, false, z2, "failed", jCurrentTimeMillis2, "fresco_failure");
            }

            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJ(String str2, Object obj, Animatable animatable) {
                String str3;
                String str4;
                boolean z2;
                InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
                if (interfaceC1330440kj4 == null) {
                    str3 = "missing_image_info";
                } else {
                    C0M6V c0m6v = this.LIZIZ;
                    Drawable drawable = c0m6v.LLJJJJ;
                    if (drawable != null) {
                        c0m6v.LLJJJJ = new BitmapDrawable(c0m6v.LL.getContext().getResources(), C0GZ2.LIZ(drawable, interfaceC1330440kj4.getWidth(), interfaceC1330440kj4.getHeight(), null));
                        ((SmartImageView) c0m6v.LLIZLLLIL.getValue()).setPlaceholderImage(c0m6v.LLJJJJ);
                    }
                    if (this.LIZIZ.LLJJJJ != null) {
                        str3 = "none";
                    } else {
                        str3 = "postprocess_cache_missing";
                    }
                }
                if (Intrinsics.LJFF(str3, "none")) {
                    str4 = "success";
                } else {
                    str4 = "failed";
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                C0M6Y c0m6y = C0M6Y.LIZ;
                C0M6S c0m6s2 = c0m6s;
                if (interfaceC1330440kj4 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z3 = z;
                c0m6y.getClass();
                C0M6Y.LIZJ(c0m6s2, z2, z3, str4, jCurrentTimeMillis2, str3);
            }
        }, null);
    }
}

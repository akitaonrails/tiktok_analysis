package X;

import Y.ACListenerS130S0200000_28;
import Y.ACListenerS92S0300000_28;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import com.ss.android.ugc.tiktok.pns.privacy.setting.tpsc.account.container.PrivacySettingSheetV2;
import com.ss.android.ugc.tiktok.tns.commentsafety.creator.commentfilter.toolkit.ICommentFilterToolService;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS109S0201000_28;
import kotlin.jvm.internal.AwS134S0101000_28;
import kotlin.jvm.internal.AwS272S0300000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.106V, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C106V {
    public static final C106V LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static boolean LIZLLL;

    /* JADX WARN: Type inference failed for: r0v12, types: [X.107W] */
    /* JADX WARN: Type inference failed for: r1v10, types: [X.107v] */
    public final synchronized void LIZ() {
        if (LIZLLL) {
            return;
        }
        TPSCRenderManager tPSCRenderManager = TPSCRenderManager.LIZ;
        InterfaceC1913460ztQ interfaceC1913460ztQ = new InterfaceC1913460ztQ() { // from class: X.0ztO
            @Override // X.InterfaceC1913460ztQ
            public final void LIZ(Context context, String str, C103L c103l, Bundle bundle) {
                Bundle bundle2;
                String str2;
                String string;
                if (bundle == null) {
                    bundle2 = new Bundle();
                } else {
                    bundle2 = bundle;
                }
                C786410Ut5.LJJJI("page_tag", str, bundle2);
                if (Intrinsics.LJFF(str, "main")) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//privacy/setting/v2/main");
                    smartRouteBuildRoute.withParam(bundle2);
                    smartRouteBuildRoute.open();
                    return;
                }
                Object obj = null;
                if (c103l != null) {
                    str2 = c103l.LIZLLL;
                } else {
                    str2 = null;
                }
                if (!Intrinsics.LJFF(str2, "sheet")) {
                    if (bundle != null) {
                        string = bundle.getString("page_type");
                    } else {
                        string = null;
                    }
                    if (!Intrinsics.LJFF(string, "sheet")) {
                        SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(context, "//privacy/setting/default");
                        smartRouteBuildRoute2.withParam(bundle2);
                        smartRouteBuildRoute2.open();
                        return;
                    }
                }
                if (c103l != null) {
                    c103l.LIZLLL = "sheet";
                }
                C786410Ut5.LJJJI("page_type", "sheet", bundle2);
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null) {
                    PrivacySettingSheetV2 privacySettingSheetV2 = new PrivacySettingSheetV2();
                    Bundle arguments = privacySettingSheetV2.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                    }
                    C786410Ut5.LJJIIJZLJL(arguments, bundle2);
                    privacySettingSheetV2.setArguments(arguments);
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    c1390920mIc.LIZ.LLJJIJI = privacySettingSheetV2;
                    c1390920mIc.LIZ.LLJI = C1308910kAL.LIZJ(R.attr.a1e, context);
                    try {
                        obj = bundle2.get("fixed_height_sheet");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    if (Intrinsics.LJFF(obj, Boolean.TRUE)) {
                        c1390920mIc.LJIIIIZZ(1);
                        c1390920mIc.LIZ.LLJJL = (int) (C12ES.LJIIIIZZ(context) * 0.55f);
                    }
                    DialogInterfaceOnDismissListenerC1913450ztP dialogInterfaceOnDismissListenerC1913450ztP = new DialogInterface.OnDismissListener() { // from class: X.0ztP
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                        }
                    };
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLILLJJLI = dialogInterfaceOnDismissListenerC1913450ztP;
                    tuxSheet.show(c19egLIZIZ.getSupportFragmentManager(), "PrivacySettingSheet");
                }
            }
        };
        tPSCRenderManager.getClass();
        TPSCRenderManager.LIZIZ = interfaceC1913460ztQ;
        TPSCRenderManager.LJI(C191943107h.class, new AnonymousClass1031() { // from class: X.107R
            @Override // X.AnonymousClass1031
            public final AbstractC191843103l LIZ(C191848103q c191848103q, C104A c104a) {
                final C191943107h c191943107h;
                if (!(c104a instanceof C191943107h) || (c191943107h = (C191943107h) c104a) == null) {
                    return null;
                }
                return new AbstractC191843103l(c191943107h) { // from class: X.107S
                    public final C191943107h LLILLJJLI;

                    {
                        this.LLILLJJLI = c191943107h;
                    }

                    @Override // X.AbstractC191843103l
                    public final List<AbstractC191840103i> LJ(Context context) {
                        new ArrayList();
                        this.LLILLJJLI.getClass();
                        LJI(null, context);
                        this.LLILLJJLI.getClass();
                        throw null;
                    }
                };
            }
        });
        TPSCRenderManager.LJII(C109B.class, new C191839103h() { // from class: X.109A
            @Override // X.C191839103h, X.InterfaceC191837103f
            public final void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
                C109B c109b;
                C419910GdJ c419910GdJ = null;
                if ((abstractC191840103i instanceof C109B) && (c109b = (C109B) abstractC191840103i) != null) {
                    AnonymousClass1099 anonymousClass1099 = (AnonymousClass1099) c191838103g.itemView.findViewById(R.id.v4p);
                    Integer num = c109b.LIZJ;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = iIntValue;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                    }
                    anonymousClass1099.setIcon(c419910GdJ);
                    anonymousClass1099.setUiConfig(c109b.LJIIJJI);
                    anonymousClass1099.setTitle(c109b.LIZLLL);
                    anonymousClass1099.setSubtitle(c109b.LJ);
                    anonymousClass1099.getRadioView().setChecked(c109b.LJIIIIZZ);
                    anonymousClass1099.setDisableClickListener(new AwS429S0200000_28(c109b, anonymousClass1099, 123));
                    C013C c013c = new C013C();
                    anonymousClass1099.getRadioView().setInterceptToggleListener(new AwS272S0300000_28(c013c, c109b, anonymousClass1099, 14));
                    C786410Ut5.e9(anonymousClass1099.getRadioView(), new ACListenerS92S0300000_28(c013c, c109b, anonymousClass1099, 10));
                    anonymousClass1099.setLoading(c109b.LJIIIZ);
                    anonymousClass1099.setCellEnabled(c109b.LJIIJ);
                    C10CO.LIZ(anonymousClass1099, c109b.LJIIL, c109b.LJIILIIL);
                }
            }
        });
        TPSCRenderManager.LJII(C191857103z.class, new C191839103h() { // from class: X.1040
            @Override // X.C191839103h, X.InterfaceC191837103f
            public final void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
                C191857103z c191857103z;
                if ((abstractC191840103i instanceof C191857103z) && (c191857103z = (C191857103z) abstractC191840103i) != null) {
                    ((TextView) c191838103g.itemView.findViewById(R.id.title)).setText(c191857103z.LIZJ);
                }
            }
        });
        TPSCRenderManager.LJII(C191856103y.class, new C191839103h() { // from class: X.103x
            @Override // X.C191839103h, X.InterfaceC191837103f
            public final void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
                C191856103y c191856103y;
                if ((abstractC191840103i instanceof C191856103y) && (c191856103y = (C191856103y) abstractC191840103i) != null) {
                    TextView textView = (TextView) c191838103g.itemView.findViewById(R.id.jow);
                    textView.setText(c191856103y.LIZJ);
                    if (!(c191856103y.LIZJ instanceof String)) {
                        textView.setMovementMethod(C431260Gvc.LIZ);
                        textView.setClickable(false);
                        textView.setLongClickable(false);
                        return;
                    }
                    textView.setMovementMethod(null);
                }
            }
        });
        TPSCRenderManager.LJII(AnonymousClass1042.class, new C191839103h() { // from class: X.1043
            @Override // X.C191839103h, X.InterfaceC191837103f
            public final void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
                AnonymousClass1042 anonymousClass1042;
                if ((abstractC191840103i instanceof AnonymousClass1042) && (anonymousClass1042 = (AnonymousClass1042) abstractC191840103i) != null) {
                    c191838103g.itemView.findViewById(R.id.q8f).getLayoutParams().height = anonymousClass1042.LIZJ;
                }
            }
        });
        TPSCRenderManager.LJII(C10FD.class, new C191839103h() { // from class: X.10FE
            @Override // X.C191839103h, X.InterfaceC191837103f
            public final void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
                C10FD c10fd;
                Integer numLIZJ;
                LayerDrawable layerDrawable;
                Drawable drawable;
                C127A c127a;
                Integer numValueOf;
                C419910GdJ c419910GdJ = null;
                if ((abstractC191840103i instanceof C10FD) && (c10fd = (C10FD) abstractC191840103i) != null) {
                    C192009109v c192009109v = c10fd.LJIIL;
                    C127K c127k = (C127K) c191838103g.itemView.findViewById(R.id.l1c);
                    Integer num = c10fd.LIZJ;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = iIntValue;
                        if (c192009109v == null || (numValueOf = c192009109v.LIZ) == null) {
                            numValueOf = Integer.valueOf(R.attr.a1p);
                        }
                        c419910GdJ.LJ = numValueOf;
                    }
                    c127k.setIcon(c419910GdJ);
                    c127k.setTitle(c10fd.LIZLLL);
                    c127k.setSubtitle(c10fd.LJ);
                    if (!(c127k.getAccessory() instanceof C127A)) {
                        c127k.setAccessory(new C127A(c127k.getContext()));
                    }
                    C10FD c10fd2 = (C10FD) abstractC191840103i;
                    c127k.setLoading(c10fd2.LJIIIZ);
                    C127M accessory = c127k.getAccessory();
                    if ((accessory instanceof C127A) && (c127a = (C127A) accessory) != null) {
                        c127a.LJIILJJIL(c10fd.LJIIIIZZ);
                        c127a.LJI(new AwS429S0200000_28(c10fd, c127k, 124));
                        c127a.LJIILL(new AwS272S0300000_28(c10fd, c127k, c127a, 15));
                        c127a.LJIILLIIL(new C19332510kF(c10fd, 21));
                    }
                    c127k.setLoading(c10fd.LJIIIZ);
                    c127k.setCellEnabled(c10fd.LJIIJ);
                    c127k.LJ(c10fd.LJIILIIL, c10fd.LJIILJJIL);
                    if (c10fd2.LJIIJJI && (numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, c127k.getContext())) != null) {
                        int iIntValue2 = numLIZJ.intValue();
                        Drawable background = c127k.getBackground();
                        if ((background instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) background) != null && (drawable = layerDrawable.getDrawable(0)) != null) {
                            C16GF.LJI(drawable, iIntValue2);
                        }
                    }
                }
            }
        });
        TPSCRenderManager.LJII(C10FB.class, new C191839103h() { // from class: X.10FA
            @Override // X.C191839103h, X.InterfaceC191837103f
            public final void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
                C10FB c10fb;
                C419910GdJ c419910GdJ;
                C11G4 c11g4;
                if ((abstractC191840103i instanceof C10FB) && (c10fb = (C10FB) abstractC191840103i) != null) {
                    C127K c127k = (C127K) c191838103g.itemView.findViewById(R.id.l1c);
                    Integer num = c10fb.LIZJ;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = iIntValue;
                        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
                    } else {
                        c419910GdJ = null;
                    }
                    c127k.setIcon(c419910GdJ);
                    c127k.setTitle(c10fb.LIZLLL);
                    c127k.setSubtitle(c10fb.LJ);
                    if (!(c127k.getAccessory() instanceof C11G4)) {
                        c127k.setAccessory(new C11G4(c127k.getContext(), null));
                    }
                    C127M accessory = c127k.getAccessory();
                    if ((accessory instanceof C11G4) && (c11g4 = (C11G4) accessory) != null) {
                        c11g4.LJIILJJIL(c10fb.LJFF);
                        if (c10fb.LJIIJ) {
                            c127k.setVariant(EnumC1216700hlc.DESTRUCTIVE);
                        }
                        if (c10fb.LJIIJJI) {
                            TuxSpinner tuxSpinner = new TuxSpinner(c127k.getContext(), null, 6, 0);
                            tuxSpinner.LIZ(R.raw.icon_spinner_thin, R.attr.a1k);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
                            layoutParams.gravity = 17;
                            C786410Ut5.X6(tuxSpinner, layoutParams);
                            c11g4.LJIILIIL(tuxSpinner);
                            c11g4.LJIILLIIL(false);
                        } else {
                            c11g4.LJIILIIL(null);
                            c11g4.LJIILLIIL(c10fb.LJIIIZ);
                        }
                        c11g4.LJI(new AwS429S0200000_28(c127k, c10fb, 122));
                        c11g4.LJIILL(new ACListenerS130S0200000_28(c127k, c10fb, 47));
                    }
                    c127k.setCellEnabled(c10fb.LJIIIIZZ);
                    c127k.LJ(c10fb.LJIIL, c10fb.LJIILIIL);
                }
            }
        });
        TPSCRenderManager.LJII(AnonymousClass1088.class, new C191839103h() { // from class: X.1089
            @Override // X.C191839103h, X.InterfaceC191837103f
            public final void LIZIZ(AbstractC191840103i abstractC191840103i, C191838103g c191838103g) {
                AnonymousClass1088 anonymousClass1088;
                float f;
                if ((abstractC191840103i instanceof AnonymousClass1088) && (anonymousClass1088 = (AnonymousClass1088) abstractC191840103i) != null) {
                    View view = c191838103g.itemView;
                    TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.j8d);
                    if (tuxTextView != null) {
                        tuxTextView.setText(anonymousClass1088.LIZJ);
                        TypedArray typedArrayObtainStyledAttributes = tuxTextView.getContext().obtainStyledAttributes((AttributeSet) null, R$styleable.RadioGroupTitleView);
                        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.RadioGroupTitleView_group_title_margin_horizontal, -1);
                        typedArrayObtainStyledAttributes.recycle();
                        if (dimensionPixelSize > 0) {
                            C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(dimensionPixelSize), null, Integer.valueOf(dimensionPixelSize), null, false, 26);
                        }
                        if (anonymousClass1088.LJ) {
                            f = 1.0f;
                        } else {
                            f = 0.34f;
                        }
                        C786410Ut5.B5(tuxTextView, f);
                    }
                    C10CO.LIZ(view, anonymousClass1088.LJFF, anonymousClass1088.LJI);
                }
            }
        });
        TPSCRenderManager.LJII(C106E.class, new C191839103h() { // from class: X.106D
            /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
            @Override // X.C191839103h, X.InterfaceC191837103f
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(X.AbstractC191840103i r14, X.C191838103g r15) {
                /*
                    r13 = this;
                    boolean r0 = r14 instanceof X.C106E
                    r6 = 0
                    if (r0 == 0) goto Lb3
                    r2 = r14
                    X.106E r2 = (X.C106E) r2
                    if (r2 == 0) goto Lb3
                    android.view.View r1 = r15.itemView
                    r0 = 2131394193(0x7f0a7e91, float:1.8409063E38)
                    android.view.View r7 = r1.findViewById(r0)
                    com.bytedance.tux.input.TuxTextView r7 = (com.bytedance.tux.input.TuxTextView) r7
                    if (r7 == 0) goto La6
                    java.util.List<X.1Fj3> r1 = r2.LJIIIZ
                    if (r1 == 0) goto L6a
                    java.util.ArrayList r5 = new java.util.ArrayList
                    r0 = 10
                    int r0 = X.C15438062q.LJIJJ(r1, r0)
                    r5.<init>(r0)
                    java.util.Iterator r4 = r1.iterator()
                L2a:
                    boolean r0 = r4.hasNext()
                    r3 = 0
                    if (r0 == 0) goto L4f
                    java.lang.Object r0 = r4.next()
                    X.0Hca r1 = new X.0Hca
                    r1.<init>()
                    r0.getClass()
                    r1.LIZJ = r6
                    r1.LJIIIIZZ = r6
                    r1.LJI = r3
                    android.content.Context r0 = r7.getContext()
                    java.lang.CharSequence r0 = r1.LIZ(r0)
                    r5.add(r0)
                    goto L2a
                L4f:
                    android.text.SpannableStringBuilder[] r0 = new android.text.SpannableStringBuilder[r3]
                    java.lang.Object[] r3 = r5.toArray(r0)
                    android.text.SpannableStringBuilder[] r3 = (android.text.SpannableStringBuilder[]) r3
                    java.lang.CharSequence r0 = r2.LIZJ
                    java.lang.String r1 = r0.toString()
                    int r0 = r3.length
                    java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
                    android.text.Spannable[] r0 = (android.text.Spannable[]) r0
                    android.text.Spanned r0 = X.C10KE.LIZIZ(r1, r0)
                    if (r0 != 0) goto L8e
                L6a:
                    X.106E r14 = (X.C106E) r14
                    java.lang.CharSequence r0 = r14.LIZJ
                    r7.setText(r0)
                    java.lang.Integer r1 = r2.LIZLLL
                    if (r1 == 0) goto La7
                    int r0 = r1.intValue()
                    r7.setTextColor(r0)
                    r1.intValue()
                L7f:
                    X.105b r1 = r2.LJFF
                    boolean r0 = r1 instanceof X.C191884105a
                    if (r0 == 0) goto L8e
                    X.105a r1 = (X.C191884105a) r1
                    if (r1 == 0) goto L8e
                    int r0 = r1.LIZ
                    r7.setTuxFont(r0)
                L8e:
                    int r0 = r2.LJI
                    r7.setTextAlignment(r0)
                    int r0 = r2.LJII
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
                    r9 = 0
                    int r0 = r2.LJIIIIZZ
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
                    r12 = 26
                    r11 = r9
                    X.C426750GoL.LJIIL(r7, r8, r9, r10, r11, r12)
                La6:
                    return
                La7:
                    java.lang.Integer r0 = r2.LJ
                    if (r0 == 0) goto L7f
                    int r0 = r0.intValue()
                    r7.setTextColorRes(r0)
                    goto L7f
                Lb3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C106D.LIZIZ(X.103i, X.103g):void");
            }
        });
        C191958107w.LIZIZ(new AnonymousClass1081() { // from class: X.107v
            @Override // X.AnonymousClass1081
            public final void LIZ(C191848103q c191848103q, String str) {
                Object obj = c191848103q.LIZJ;
                if (obj instanceof Fragment) {
                    C1389890mGx c1389890mGx = new C1389890mGx((Fragment) obj);
                    c1389890mGx.LJIIJ(str);
                    c1389890mGx.LJIIJJI();
                } else {
                    if (!(obj instanceof Activity)) {
                        return;
                    }
                    C1389890mGx c1389890mGx2 = new C1389890mGx((Activity) obj);
                    c1389890mGx2.LJIIJ(str);
                    c1389890mGx2.LJIIJJI();
                }
            }

            @Override // X.AnonymousClass1081
            public final void LIZIZ(View view, String str) {
                if (str.length() > 0) {
                    SmartRouter.buildRoute(view.getContext(), str).open();
                }
            }

            @Override // X.AnonymousClass1081
            public final void LIZJ(C191848103q c191848103q, String str) {
                Fragment fragment;
                LifecycleOwner lifecycleOwner = c191848103q.LIZJ;
                if (lifecycleOwner instanceof Fragment) {
                    fragment = (Fragment) lifecycleOwner;
                } else {
                    fragment = null;
                }
                if (fragment != null) {
                    C1389880mGw c1389880mGw = new C1389880mGw(fragment);
                    c1389880mGw.LJ(R.raw.icon_tick);
                    c1389880mGw.LJI(R.attr.a1h);
                    c1389880mGw.LJIIIZ(str);
                    c1389880mGw.LJIIJ();
                    return;
                }
                Activity activityLIZIZ = C737910Sx3.LIZIZ(c191848103q.LIZ);
                if (activityLIZIZ == null) {
                    return;
                }
                C1389880mGw c1389880mGw2 = new C1389880mGw(activityLIZIZ);
                c1389880mGw2.LJ(R.raw.icon_tick);
                c1389880mGw2.LJI(R.attr.a1h);
                c1389880mGw2.LJIIIZ(str);
                c1389880mGw2.LJIIJ();
            }

            @Override // X.AnonymousClass1081
            public final void LIZLLL(View view, String str) {
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
            }
        }, new Object() { // from class: X.107W
        });
        LIZLLL();
        C1867580yhQ.LIZ("comment", AFwS217S0000000_28.get$arr$(810));
        C1867580yhQ.LIZ("comment_permission", AFwS217S0000000_28.get$arr$(811));
        C1867580yhQ.LIZ("download", AFwS217S0000000_28.get$arr$(812));
        C1867580yhQ.LIZ("viewer_history", AFwS217S0000000_28.get$arr$(813));
        C1867580yhQ.LIZ("dm_potential_connection", AFwS217S0000000_28.get$arr$(814));
        C1867580yhQ.LIZ("dm_others", AFwS217S0000000_28.get$arr$(815));
        C1867580yhQ.LIZ("main", AFwS217S0000000_28.get$arr$(816));
        C1867580yhQ.LIZ("private_account_permission", AFwS217S0000000_28.get$arr$(809));
        C108Z c108z = new C108Z() { // from class: X.107U
            public final AFwS315S0000000_28 LIZ = AFwS315S0000000_28.get$arr$(57);

            @Override // X.C108Z
            public final AFwS315S0000000_28 LIZ() {
                return this.LIZ;
            }
        };
        C103H c103h = new C103H() { // from class: X.104K
            public final AFwS315S0000000_28 LIZ = AFwS315S0000000_28.get$arr$(58);

            @Override // X.C103H
            public final AFwS315S0000000_28 LIZ() {
                return this.LIZ;
            }
        };
        AFwS315S0000000_28 aFwS315S0000000_28 = AFwS315S0000000_28.get$arr$(59);
        C103G.LIZIZ = c108z;
        C103G.LIZJ = c103h;
        C103G.LIZLLL = aFwS315S0000000_28;
        TPSCRenderManager.LIZ("video_view_history", AFwS217S0000000_28.get$arr$(819));
        TPSCRenderManager.LIZ("profile_view_history", AFwS217S0000000_28.get$arr$(820));
        TPSCRenderManager.LIZ("liked_videos_permission", AFwS217S0000000_28.get$arr$(821));
        C103A.LIZ();
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null) {
            iPrivacySettingsDepService.LJJIJIIJIL();
        }
        LIZLLL = true;
    }

    static {
        C106V c106v = new C106V();
        LIZ = c106v;
        c106v.LIZ();
        LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(818));
        LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(817));
    }

    public static C191880104w LIZIZ() {
        return (C191880104w) LIZJ.getValue();
    }

    public static TPSCRenderManager LIZJ() {
        return (TPSCRenderManager) LIZIZ.getValue();
    }

    public static void LIZLLL() {
        C106W c106w = new AnonymousClass1031() { // from class: X.106W
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            @Override // X.AnonymousClass1031
            public final AbstractC191843103l LIZ(final C191848103q c191848103q, C104A c104a) {
                if (c104a instanceof C107O) {
                    String str = c104a.LIZ;
                    switch (str.hashCode()) {
                        case -894857439:
                            if (str.equals("private_account_item")) {
                                return new C191981108t(c191848103q, (C107O) c104a) { // from class: X.106L
                                    /* JADX WARN: Removed duplicated region for block: B:101:0x0274  */
                                    /* JADX WARN: Removed duplicated region for block: B:104:0x02c8  */
                                    /* JADX WARN: Removed duplicated region for block: B:105:0x02cb  */
                                    /* JADX WARN: Removed duplicated region for block: B:117:0x0352  */
                                    /* JADX WARN: Removed duplicated region for block: B:130:0x040e  */
                                    /* JADX WARN: Removed duplicated region for block: B:138:0x045c  */
                                    /* JADX WARN: Removed duplicated region for block: B:150:0x049e  */
                                    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
                                    /* JADX WARN: Removed duplicated region for block: B:63:0x0168  */
                                    /* JADX WARN: Removed duplicated region for block: B:66:0x0177  */
                                    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
                                    /* JADX WARN: Removed duplicated region for block: B:82:0x01c9  */
                                    /* JADX WARN: Removed duplicated region for block: B:84:0x01d1  */
                                    /* JADX WARN: Removed duplicated region for block: B:86:0x01d8  */
                                    /* JADX WARN: Removed duplicated region for block: B:89:0x01fa  */
                                    /* JADX WARN: Removed duplicated region for block: B:92:0x020e  */
                                    /* JADX WARN: Removed duplicated region for block: B:94:0x0214  */
                                    @Override // X.AbstractC191963108b
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final boolean LJIL(int r36, android.view.View r37) {
                                        /*
                                            Method dump skipped, instruction units count: 1294
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C106L.LJIL(int, android.view.View):boolean");
                                    }

                                    @Override // X.C191981108t
                                    public final void LJJIFFI(int i, View view) {
                                        String string;
                                        super.LJJIFFI(i, view);
                                        Bundle bundle = this.LLJ.LJ;
                                        if (bundle == null || (string = bundle.getString("enter_method")) == null) {
                                            string = "";
                                        }
                                        if (i != 1) {
                                            if (i == 2) {
                                                C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                                C191969108h c191969108h = new C191969108h();
                                                c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
                                                c191969108h.LIZLLL("enter_method", string);
                                                c1163504gr.onEventV3("private_account_off", c191969108h.LIZ);
                                                return;
                                            }
                                            return;
                                        }
                                        C1163504gr c1163504gr2 = C1163504gr.LIZIZ;
                                        C191969108h c191969108h2 = new C191969108h();
                                        c191969108h2.LIZLLL("enter_from", "privacy_and_safety_settings");
                                        c191969108h2.LIZLLL("enter_method", string);
                                        c1163504gr2.onEventV3("private_account_on", c191969108h2.LIZ);
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // X.C191981108t
                                    public final void LJJII(int i, int i2, Throwable th) {
                                        C632200Oqw c632200Oqw;
                                        Integer numValueOf;
                                        int i3;
                                        Context context = this.LLJ.LIZ;
                                        if ((th instanceof C632200Oqw) && (c632200Oqw = (C632200Oqw) th) != null && (numValueOf = Integer.valueOf(c632200Oqw.getErrorCode())) != null) {
                                            if (numValueOf.intValue() == -5002) {
                                                C1397580mTM c1397580mTM = new C1397580mTM(context);
                                                c1397580mTM.LJFF(2131824516);
                                                c1397580mTM.LIZ(2131824528);
                                                C985403tE.LIZ(c1397580mTM, new AwS134S0101000_28(i2, this, 16));
                                                c1397580mTM.LJII = false;
                                                new C1397510mTF(c1397580mTM).LIZLLL();
                                                return;
                                            }
                                            if (numValueOf.intValue() == -5007) {
                                                C1397580mTM c1397580mTM2 = new C1397580mTM(context);
                                                c1397580mTM2.LIZIZ(((C632200Oqw) th).getErrorMsg());
                                                C985403tE.LIZ(c1397580mTM2, AFwS271S0000000_28.get$arr$(256));
                                                c1397580mTM2.LJII = false;
                                                new C1397510mTF(c1397580mTM2).LIZLLL();
                                                return;
                                            }
                                            if (numValueOf != null) {
                                                if (numValueOf.intValue() == 3026002) {
                                                    C1397580mTM c1397580mTM3 = new C1397580mTM(context);
                                                    c1397580mTM3.LJFF(2131827269);
                                                    C444940Hca c444940Hca = new C444940Hca();
                                                    c444940Hca.LIZJ(2131827268);
                                                    c444940Hca.LIZLLL(2);
                                                    c444940Hca.LIZIZ = false;
                                                    c444940Hca.LIZIZ(42);
                                                    c444940Hca.LJIIIIZZ = new AwS572S0100000_28(context, 699);
                                                    c1397580mTM3.LIZIZ(C20588115hH.LIZJ(context, 2131827267, c444940Hca.LIZ(context)));
                                                    C985403tE.LIZ(c1397580mTM3, AFwS271S0000000_28.get$arr$(257));
                                                    new C1397510mTF(c1397580mTM3).LIZLLL();
                                                    return;
                                                }
                                                if (numValueOf.intValue() == 3026006) {
                                                    if (i2 == 1) {
                                                        i3 = 2131830673;
                                                    } else {
                                                        i3 = 2131830674;
                                                    }
                                                    String string = context.getString(i3);
                                                    C1397580mTM c1397580mTM4 = new C1397580mTM(context);
                                                    c1397580mTM4.LJI(context.getString(2131830675, string));
                                                    c1397580mTM4.LIZIZ(context.getString(2131830672, string));
                                                    C985403tE.LIZ(c1397580mTM4, new AwS134S0101000_28(i2, this, 17));
                                                    c1397580mTM4.LJII = false;
                                                    new C1397510mTF(c1397580mTM4).LIZLLL();
                                                    C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                                    C191969108h c191969108h = new C191969108h();
                                                    c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
                                                    c1163504gr.onEventV3("show_live_change_privacy_account_popup", c191969108h.LIZ);
                                                    return;
                                                }
                                            }
                                        }
                                        super.LJJII(i, i2, th);
                                    }

                                    @Override // X.C191981108t
                                    public final void LJJIII(int i, int i2, BaseResponse baseResponse) {
                                        if (i2 == 1) {
                                            C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                            C191969108h c191969108h = new C191969108h();
                                            c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
                                            c1163504gr.onEventV3("confirm_private_account_on", c191969108h.LIZ);
                                        } else {
                                            C1163504gr c1163504gr2 = C1163504gr.LIZIZ;
                                            C191969108h c191969108h2 = new C191969108h();
                                            c191969108h2.LIZLLL("enter_from", "privacy_and_safety_settings");
                                            c1163504gr2.onEventV3("confirm_private_account_off", c191969108h2.LIZ);
                                        }
                                        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
                                        if (iPrivacySettingsDepService != null) {
                                            iPrivacySettingsDepService.LJIJJLI(i2);
                                        }
                                    }
                                };
                            }
                            return null;
                        case -737872387:
                            if (str.equals("safe_mode_item")) {
                                return new C191981108t(c191848103q, (C107O) c104a) { // from class: X.106I
                                    @Override // X.C191981108t
                                    public final boolean LJJI() {
                                        Bundle bundle = this.LLJ.LJ;
                                        boolean z = bundle != null ? bundle.getBoolean("highlight_restrict_sharing", false) : false;
                                        Bundle bundle2 = this.LLJ.LJ;
                                        return TextUtils.equals("system_notifications", bundle2 != null ? bundle2.getString("enter_from") : null) && !z;
                                    }

                                    @Override // X.AbstractC191963108b
                                    public final CharSequence LJIIZILJ(Context context, CharSequence charSequence) {
                                        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
                                        if (iPrivacySettingsDepService != null && iPrivacySettingsDepService.LJJIIZ()) {
                                            return context.getString(2131846706);
                                        }
                                        IPrivacySettingsDepService iPrivacySettingsDepService2 = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
                                        if (iPrivacySettingsDepService2 == null || !iPrivacySettingsDepService2.LJ()) {
                                            return charSequence;
                                        }
                                        return context.getString(2131832024);
                                    }

                                    @Override // X.C191981108t
                                    public final void LJJIII(int i, int i2, BaseResponse baseResponse) {
                                        C106P.LIZ(i2, "filtered_request", "user");
                                        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
                                        if (iPrivacySettingsDepService != null) {
                                            iPrivacySettingsDepService.LIZ();
                                        }
                                    }
                                };
                            }
                            return null;
                        case -131765693:
                            if (str.equals("nude_filter_item")) {
                                return new C191981108t(c191848103q, (C107O) c104a) { // from class: X.106K
                                    @Override // X.AbstractC191963108b
                                    public final boolean LJIJI(boolean z) {
                                        IPrivacySettingsDepService iPrivacySettingsDepService;
                                        if (!z || ((iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null)) != null && iPrivacySettingsDepService.LJJIIZ())) {
                                            return false;
                                        }
                                        return true;
                                    }

                                    @Override // X.C191981108t
                                    public final void LJJIII(int i, int i2, BaseResponse baseResponse) {
                                        C106P.LIZ(i2, "nude_filter", "user");
                                    }
                                };
                            }
                            return null;
                        case -26400222:
                            if (str.equals("profile_view_history_item")) {
                                final C107O c107o = (C107O) c104a;
                                return new C191981108t(c191848103q, c107o) { // from class: X.1075
                                    @Override // X.C191981108t
                                    public final void LJJIII(int i, int i2, BaseResponse baseResponse) {
                                        String str2;
                                        if (i2 != 1) {
                                            if (i2 != 2) {
                                                str2 = "";
                                            } else {
                                                str2 = "off";
                                            }
                                        } else {
                                            str2 = "on";
                                        }
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
                                        c191969108h.LIZLLL("to_status", str2);
                                        c191969108h.LIZLLL("action_type", "toggle");
                                        c1163504gr.onEventV3("change_profile_visitor_status", c191969108h.LIZ);
                                    }
                                };
                            }
                            return null;
                        case -3906444:
                            if (str.equals("video_view_history_item")) {
                                final C107O c107o2 = (C107O) c104a;
                                return new C191981108t(c191848103q, c107o2) { // from class: X.1076
                                    @Override // X.C191981108t
                                    public final void LJJIII(int i, int i2, BaseResponse baseResponse) {
                                        String str2;
                                        if (i2 != 1) {
                                            if (i2 != 2) {
                                                str2 = "";
                                            } else {
                                                str2 = "off";
                                            }
                                        } else {
                                            str2 = "on";
                                        }
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
                                        c191969108h.LIZLLL("to_status", str2);
                                        c191969108h.LIZLLL("action_type", "toggle");
                                        c1163504gr.onEventV3("change_video_views_status", c191969108h.LIZ);
                                    }
                                };
                            }
                            return null;
                        case 31555690:
                            if (str.equals("download_item")) {
                                final C107O c107o3 = (C107O) c104a;
                                return new C191981108t(c191848103q, c107o3) { // from class: X.106a
                                    @Override // X.AbstractC191963108b, X.AbstractC191843103l
                                    public final void LJII() {
                                        String string;
                                        super.LJII();
                                        Bundle bundle = this.LLJ.LJ;
                                        if (bundle == null || (string = bundle.getString("enter_from")) == null) {
                                            string = "privacy_and_safety_settings";
                                        }
                                        AnonymousClass1078 anonymousClass1078 = AnonymousClass1078.LIZ;
                                        C191880104w.LIZ.getClass();
                                        int iLIZ = C105F.LIZ(C191880104w.LJIIL(), "download", 0);
                                        anonymousClass1078.getClass();
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
                                        c191969108h.LIZLLL("user_id", iPrivacySettingsDepService != null ? iPrivacySettingsDepService.getUserId() : null);
                                        c191969108h.LIZLLL("enter_from", string);
                                        c191969108h.LIZ(iLIZ == 3 ? 1 : 0, "enter_status");
                                        c1163504gr.onEventV3("tns_video_download_use_show", c191969108h.LIZ);
                                    }

                                    @Override // X.AbstractC191963108b, X.AbstractC191843103l
                                    public final void LJIIIIZZ() {
                                        super.LJIIIIZZ();
                                        AnonymousClass1078 anonymousClass1078 = AnonymousClass1078.LIZ;
                                        C191880104w.LIZ.getClass();
                                        int iLIZ = C105F.LIZ(C191880104w.LJIIL(), "download", 0);
                                        anonymousClass1078.getClass();
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
                                        c191969108h.LIZLLL("user_id", iPrivacySettingsDepService != null ? iPrivacySettingsDepService.getUserId() : null);
                                        c191969108h.LIZLLL("enter_from", "account_download_setting");
                                        c191969108h.LIZ(iLIZ == 3 ? 1 : 0, "enter_status");
                                        c1163504gr.onEventV3("tns_video_download_use_leave", c191969108h.LIZ);
                                    }

                                    @Override // X.AbstractC191963108b, X.InterfaceC191831102z
                                    public final CharSequence LIZJ(Context context, CharSequence charSequence) {
                                        CharSequence charSequenceLIZJ = super.LIZJ(context, null);
                                        if (charSequenceLIZJ == null) {
                                            if (!C104L.LIZJ()) {
                                                return null;
                                            }
                                            return context.getString(2131835506);
                                        }
                                        return charSequenceLIZJ;
                                    }

                                    @Override // X.AbstractC191963108b
                                    public final boolean LJIL(int i, View view) {
                                        if (i != 3) {
                                            C191880104w.LIZ.getClass();
                                            if (C191880104w.LJIILIIL("download_setting_change_young")) {
                                                C1397580mTM c1397580mTM = new C1397580mTM(this.LLJ.LIZ);
                                                c1397580mTM.LJFF(2131832385);
                                                c1397580mTM.LIZ(2131832384);
                                                C985403tE.LIZ(c1397580mTM, new AwS109S0201000_28(this, view, i, 3));
                                                new C1397510mTF(c1397580mTM).LIZLLL();
                                                C191879104v c191879104vLIZIZ = C191871104n.LIZIZ();
                                                C191879104v c191879104v = C191879104v.LIZ;
                                                c191879104vLIZIZ.getClass();
                                                C191879104v.LIZJ(null, "download_setting_change_young");
                                                C191880104w.LJIILL(2, "download_setting_change_young");
                                                return true;
                                            }
                                        }
                                        return super.LJIL(i, view);
                                    }

                                    @Override // X.C191981108t
                                    public final void LJJIFFI(int i, View view) {
                                        if (C104L.LIZJ()) {
                                            AnonymousClass1078.LIZ.getClass();
                                            AnonymousClass1078.LIZ(3);
                                        }
                                        super.LJJIFFI(i, view);
                                    }

                                    @Override // X.C191981108t
                                    public final void LJJIII(int i, int i2, BaseResponse baseResponse) {
                                        AnonymousClass1078.LIZ.getClass();
                                        AnonymousClass1078.LIZ(i2);
                                    }
                                };
                            }
                            return null;
                        case 57523728:
                            if (str.equals("activity_status_item")) {
                                return new C191981108t(c191848103q, (C107O) c104a) { // from class: X.106H
                                    @Override // X.AbstractC191963108b
                                    public final boolean LJIJI(boolean z) {
                                        IPrivacySettingsDepService iPrivacySettingsDepService;
                                        if (!z || (iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null)) == null || !iPrivacySettingsDepService.LJJIIJ()) {
                                            return false;
                                        }
                                        return true;
                                    }

                                    @Override // X.C191981108t
                                    public final void LJJIII(int i, int i2, BaseResponse baseResponse) {
                                        IPrivacySettingsDepService iPrivacySettingsDepService;
                                        C106M.LIZ.getClass();
                                        C106M.LIZIZ(i, i2, "privacy_and_safety_settings", false);
                                        if (i2 == 1 && (iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null)) != null) {
                                            iPrivacySettingsDepService.LJIJJ();
                                        }
                                    }
                                };
                            }
                            return null;
                        case 327707961:
                            if (str.equals("restrict_sharing_item")) {
                                return new C191981108t(c191848103q, (C107O) c104a) { // from class: X.106J
                                    @Override // X.C191981108t
                                    public final boolean LJJI() {
                                        Bundle bundle = this.LLJ.LJ;
                                        return bundle != null && bundle.getBoolean("highlight_restrict_sharing", false);
                                    }

                                    @Override // X.C191981108t
                                    public final void LJJIII(int i, int i2, BaseResponse baseResponse) {
                                        C106P.LIZ(i2, "restrict_sharing", "user");
                                    }
                                };
                            }
                            return null;
                        case 808300779:
                            if (str.equals("viewer_history_item")) {
                                final C107O c107o4 = (C107O) c104a;
                                return new C191981108t(c191848103q, c107o4) { // from class: X.1071
                                    @Override // X.AbstractC191963108b, X.AbstractC191843103l
                                    public final void LJII() {
                                        super.LJII();
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
                                        c1163504gr.onEventV3("load_viewers_permission", c191969108h.LIZ);
                                    }

                                    @Override // X.AbstractC191963108b
                                    public final void LJJ(int i, View view) {
                                        super.LJJ(i, view);
                                        Integer numLJIJJ = LJIJJ();
                                        int i2 = 1;
                                        if (numLJIJJ != null && numLJIJJ.intValue() == 1) {
                                            i2 = 2;
                                        }
                                        C107B.LIZ(i2);
                                    }

                                    @Override // X.C191981108t
                                    public final void LJJIFFI(int i, View view) {
                                        C107B.LIZ(i);
                                        super.LJJIFFI(i, view);
                                    }
                                };
                            }
                            return null;
                        case 1077086064:
                            if (str.equals("favorite_music_item")) {
                                final C107O c107o5 = (C107O) c104a;
                                return new C191981108t(c191848103q, c107o5) { // from class: X.106m
                                    public final String LLJILJIL;

                                    {
                                        String string;
                                        super(c191848103q, c107o5);
                                        Bundle bundle = c191848103q.LJ;
                                        this.LLJILJIL = (bundle == null || (string = bundle.getString("enter_from")) == null) ? "privacy_and_safety_settings" : string;
                                    }

                                    @Override // X.C191981108t
                                    public final void LJJIFFI(int i, View view) {
                                        String str2;
                                        String str3 = this.LLJILJIL;
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZLLL("enter_from", str3);
                                        if (i == 1) {
                                            str2 = "on";
                                        } else {
                                            str2 = "off";
                                        }
                                        c191969108h.LIZLLL("to_status", str2);
                                        c1163504gr.onEventV3("change_favorite_sound_status", c191969108h.LIZ);
                                        super.LJJIFFI(i, view);
                                    }

                                    @Override // X.C191981108t
                                    public final void LJJIII(int i, int i2, BaseResponse baseResponse) {
                                        if (i2 == 1 && !Intrinsics.LJFF(this.LLJILJIL, "privacy_and_safety_settings")) {
                                            C191848103q c191848103q2 = this.LLJ;
                                            C191960107y.LJ(c191848103q2, c191848103q2.LIZ.getString(2131828421));
                                        }
                                    }
                                };
                            }
                            return null;
                        case 1465123596:
                            if (str.equals("tcm_message_item")) {
                                return new C191981108t(c191848103q, (C107O) c104a) { // from class: X.106Q
                                    @Override // X.C191981108t
                                    public final void LJJIII(int i, int i2, BaseResponse baseResponse) {
                                        C106P.LIZ(i2, "business_allowance", null);
                                    }
                                };
                            }
                            return null;
                        case 1530349614:
                            if (str.equals("display_profile_when_sharing_links_item")) {
                                final C107O c107o6 = (C107O) c104a;
                                return new C191981108t(c191848103q, c107o6) { // from class: X.106d
                                    public final String LLJILJIL;

                                    @Override // X.AbstractC191963108b, X.AbstractC191843103l
                                    public final void LJII() {
                                        super.LJII();
                                        C191880104w.LIZ.getClass();
                                        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
                                        Integer numLIZ = privacyUserSettingsV2LJIIL != null ? privacyUserSettingsV2LJIIL.LIZ("display_profile_when_sharing_links") : null;
                                        String str2 = this.LLJILJIL;
                                        String str3 = (numLIZ == null || numLIZ.intValue() != 1) ? "off" : "on";
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZLLL("enter_from", str2);
                                        c191969108h.LIZLLL("page_tag", "share_link");
                                        c191969108h.LIZLLL("privacy_status", str3);
                                        c1163504gr.onEventV3("show_privacy_permission_sheet", c191969108h.LIZ);
                                    }

                                    @Override // X.AbstractC191963108b, X.AbstractC191843103l
                                    public final void LJIIIIZZ() {
                                        super.LJIIIIZZ();
                                        C191880104w.LIZ.getClass();
                                        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
                                        Integer numLIZ = privacyUserSettingsV2LJIIL != null ? privacyUserSettingsV2LJIIL.LIZ("display_profile_when_sharing_links") : null;
                                        String str2 = this.LLJILJIL;
                                        String str3 = (numLIZ == null || numLIZ.intValue() != 1) ? "off" : "on";
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZLLL("enter_from", str2);
                                        c191969108h.LIZLLL("page_tag", "share_link");
                                        c191969108h.LIZLLL("privacy_status", str3);
                                        c1163504gr.onEventV3("dismiss_privacy_permission_sheet", c191969108h.LIZ);
                                    }

                                    {
                                        String string;
                                        super(c191848103q, c107o6);
                                        Bundle bundle = c191848103q.LJ;
                                        this.LLJILJIL = (bundle == null || (string = bundle.getString("enter_from")) == null) ? "privacy_and_safety_settings" : string;
                                    }

                                    @Override // X.C191981108t
                                    public final void LJJIFFI(int i, View view) {
                                        String str2;
                                        String str3 = this.LLJILJIL;
                                        if (i == 1) {
                                            str2 = "on";
                                        } else {
                                            str2 = "off";
                                        }
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZLLL("account_type", "link");
                                        c191969108h.LIZLLL("enter_from", str3);
                                        c191969108h.LIZLLL("to_status", str2);
                                        c1163504gr.onEventV3("account_auth_switch", c191969108h.LIZ);
                                        super.LJJIFFI(i, view);
                                    }
                                };
                            }
                            return null;
                        default:
                            return null;
                    }
                }
                if (c104a instanceof C107P) {
                    String str2 = c104a.LIZ;
                    switch (str2.hashCode()) {
                        case -2025928316:
                            if (str2.equals("direct_message_entrance")) {
                                final C107P c107p = (C107P) c104a;
                                return new C191962108a(c191848103q, c107p) { // from class: X.106c
                                    @Override // X.C191962108a
                                    public final String LJJIFFI() {
                                        C191880104w.LIZ.getClass();
                                        return !C191985108x.LIZLLL(C191880104w.LJIIJJI(0, "chatsets")).LIZIZ ? "" : super.LJJIFFI();
                                    }

                                    @Override // X.AbstractC191963108b
                                    public final Integer LJIILLIIL() {
                                        return Integer.valueOf(R.raw.icon_paperplane_fill);
                                    }

                                    @Override // X.AbstractC191963108b
                                    public final boolean LJIILL(boolean z) {
                                        boolean z2;
                                        boolean z3;
                                        C106T.LIZ.getClass();
                                        loop0: while (true) {
                                            z2 = false;
                                            for (PrivacySettingsRestrictionItem privacySettingsRestrictionItem : (ArrayList) C106T.LIZLLL()) {
                                                if (z2 || C191985108x.LIZLLL(privacySettingsRestrictionItem).LIZ) {
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (!z2) {
                                            C106T.LIZ.getClass();
                                            loop2: while (true) {
                                                z3 = false;
                                                for (PrivacySettingsRestrictionItem privacySettingsRestrictionItem2 : (ArrayList) C106T.LIZJ()) {
                                                    if (z3 || C191985108x.LIZLLL(privacySettingsRestrictionItem2).LIZ) {
                                                        z3 = true;
                                                    }
                                                }
                                            }
                                            if (!z3) {
                                                return false;
                                            }
                                        }
                                        return true;
                                    }

                                    @Override // X.AbstractC191963108b
                                    public final boolean LJIJI(boolean z) {
                                        C106T.LIZ.getClass();
                                        return C106T.LIZ();
                                    }

                                    @Override // X.C191962108a
                                    public final void LJJII(int i, View view) {
                                        boolean z;
                                        String str3;
                                        super.LJJII(0, view);
                                        C106T.LIZ.getClass();
                                        loop0: while (true) {
                                            z = false;
                                            for (PrivacySettingsRestrictionItem privacySettingsRestrictionItem : (ArrayList) C106T.LIZJ()) {
                                                if (z || C191985108x.LIZLLL(privacySettingsRestrictionItem).LIZIZ) {
                                                    z = true;
                                                }
                                            }
                                        }
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
                                        if (z) {
                                            str3 = "new";
                                        } else {
                                            str3 = "old";
                                        }
                                        c191969108h.LIZLLL("page_type", str3);
                                        c1163504gr.onEventV3("enter_message_permission", c191969108h.LIZ);
                                        C191969108h c191969108h2 = new C191969108h();
                                        c191969108h2.LIZLLL("enter_from", "privacy_and_safety_settings");
                                        c191969108h2.LIZ(C104L.LIZJ() ? 1 : 0, "is_private");
                                        c1163504gr.onEventV3("enter_group_chat_permission", c191969108h2.LIZ);
                                    }
                                };
                            }
                            return null;
                        case -1899357627:
                            if (str2.equals("profile_view_history_entrance")) {
                                final C107P c107p2 = (C107P) c104a;
                                return new C191962108a(c191848103q, c107p2) { // from class: X.106t
                                    @Override // X.AbstractC191963108b
                                    public final Integer LJIILLIIL() {
                                        return Integer.valueOf(R.raw.icon_footprint_fill);
                                    }

                                    @Override // X.AbstractC191963108b
                                    public final boolean LJIJI(boolean z) {
                                        IPrivacySettingsDepService iPrivacySettingsDepService;
                                        if (!z || (iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null)) == null || !iPrivacySettingsDepService.isProfileViewersEnable()) {
                                            return false;
                                        }
                                        return true;
                                    }

                                    @Override // X.C191962108a
                                    public final void LJJII(int i, View view) {
                                        String str3;
                                        boolean z = false;
                                        super.LJJII(0, view);
                                        Integer numLJIJJ = LJIJJ();
                                        if (numLJIJJ != null && 1 == numLJIJJ.intValue()) {
                                            z = true;
                                        }
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
                                        if (z) {
                                            str3 = "1";
                                        } else {
                                            str3 = CardStruct.IStatusCode.DEFAULT;
                                        }
                                        c191969108h.LIZLLL("profile_visitor_status", str3);
                                        c1163504gr.onEventV3("enter_profile_viewers_permission", c191969108h.LIZ);
                                    }
                                };
                            }
                            return null;
                        case -1811436708:
                            if (str2.equals("blocked_accounts_entrance")) {
                                final C107P c107p3 = (C107P) c104a;
                                return new C191962108a(c191848103q, c107p3) { // from class: X.1079
                                    @Override // X.AbstractC191963108b
                                    public final Integer LJIILLIIL() {
                                        return Integer.valueOf(R.raw.icon_block_fill);
                                    }

                                    @Override // X.C191962108a
                                    public final void LJJII(int i, View view) {
                                        super.LJJII(0, view);
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
                                        c1163504gr.onEventV3("enter_blocked_accounts", c191969108h.LIZ);
                                    }
                                };
                            }
                            return null;
                        case -1801150317:
                            if (str2.equals("favorite_music_entrance")) {
                                final C107P c107p4 = (C107P) c104a;
                                return new C191962108a(c191848103q, c107p4) { // from class: X.107A
                                    @Override // X.AbstractC191963108b
                                    public final Integer LJIILLIIL() {
                                        return Integer.valueOf(R.raw.icon_bookmark_fill);
                                    }

                                    @Override // X.C191962108a
                                    public final void LJJII(int i, View view) {
                                        super.LJJII(0, view);
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
                                        c1163504gr.onEventV3("enter_favorite_sound_permission", c191969108h.LIZ);
                                    }
                                };
                            }
                            return null;
                        case -1196355716:
                            if (str2.equals("activity_status_v2_entrance")) {
                                return new C191962108a(c191848103q, (C107P) c104a) { // from class: X.104x
                                    @Override // X.C191962108a
                                    public final String LJJIFFI() {
                                        Integer numLIZ;
                                        C191871104n.LJ().getClass();
                                        PrivacyUserSettingsV2 privacyUserSettingsV2LIZJ = C191859104b.LIZJ();
                                        return (privacyUserSettingsV2LIZJ == null || (numLIZ = privacyUserSettingsV2LIZJ.LIZ("activity_status_v2")) == null) ? "" : numLIZ.intValue() == 1 ? this.LLJ.LIZ.getString(2131827446) : numLIZ.intValue() == 4 ? this.LLJ.LIZ.getString(2131827442) : numLIZ.intValue() == 5 ? this.LLJ.LIZ.getString(2131827444) : "";
                                    }

                                    @Override // X.AbstractC191963108b
                                    public final boolean LJIJI(boolean z) {
                                        C191871104n.LIZIZ().getClass();
                                        return C191985108x.LIZLLL(C191879104v.LIZIZ(0, "activity_status_v2")).LIZIZ;
                                    }

                                    @Override // X.AbstractC191963108b
                                    public final CharSequence LJIJ(Context context, CharSequence charSequence) {
                                        if (TextUtils.isEmpty(charSequence)) {
                                            return context.getString(2131824687);
                                        }
                                        return charSequence;
                                    }

                                    @Override // X.C191962108a
                                    public final void LJJII(int i, View view) {
                                        SmartRouter.buildRoute(view.getContext(), "aweme://privacy/setting/page?page_tag=activity_status_v2_permission").open();
                                    }
                                };
                            }
                            return null;
                        case -1118479674:
                            if (!str2.equals("dm_friends_permission_entrance")) {
                                return null;
                            }
                            final C107P c107p5 = (C107P) c104a;
                            return new C191962108a(c191848103q, c107p5) { // from class: X.106Z
                                public final C107P LLJILJILJ;
                                public final MutableLiveData<Integer> LLJILLL;

                                @Override // X.C191962108a
                                public final String LJJIFFI() {
                                    Integer value;
                                    MutableLiveData<Integer> mutableLiveData = this.LLJILLL;
                                    if (mutableLiveData != null && (value = mutableLiveData.getValue()) != null) {
                                        if (value.intValue() == 1) {
                                            return this.LLJ.LIZ.getString(2131830787);
                                        }
                                        if (value.intValue() == 2) {
                                            return this.LLJ.LIZ.getString(2131830788);
                                        }
                                        if (value.intValue() == 3) {
                                            return this.LLJ.LIZ.getString(2131830786);
                                        }
                                    }
                                    return super.LJJIFFI();
                                }

                                /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
                                {
                                    /*
                                        r4 = this;
                                        r4.<init>(r5, r6)
                                        r4.LLJILJILJ = r6
                                        java.lang.String r1 = r5.LIZLLL
                                        java.lang.String r0 = "direct_message_permission_inbox"
                                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                                        if (r0 == 0) goto L58
                                        X.108A r2 = new X.108A
                                        androidx.lifecycle.ViewModelStoreOwner r1 = r5.LIZIZ
                                        java.lang.String r0 = r6.LJIIIZ
                                        r2.<init>(r1, r0)
                                    L18:
                                        java.lang.String r3 = r6.LJIIIZ
                                        int r1 = r3.hashCode()
                                        r0 = -2099038552(0xffffffff82e336a8, float:-3.3386023E-37)
                                        if (r1 == r0) goto L49
                                        r0 = -1124815836(0xffffffffbcf4ac24, float:-0.02986724)
                                        if (r1 == r0) goto L3c
                                        r0 = -99623184(0xfffffffffa0fdef0, float:-1.8675504E35)
                                        if (r1 != r0) goto L56
                                        java.lang.String r0 = "dm_setting_friends"
                                        boolean r0 = r3.equals(r0)
                                        if (r0 == 0) goto L56
                                        androidx.lifecycle.MutableLiveData r0 = r2.LIZLLL()
                                    L39:
                                        r4.LLJILLL = r0
                                        return
                                    L3c:
                                        java.lang.String r0 = "dm_setting_potential_connection"
                                        boolean r0 = r3.equals(r0)
                                        if (r0 == 0) goto L56
                                        androidx.lifecycle.MutableLiveData r0 = r2.LIZJ()
                                        goto L39
                                    L49:
                                        java.lang.String r0 = "dm_setting_others"
                                        boolean r0 = r3.equals(r0)
                                        if (r0 == 0) goto L56
                                        androidx.lifecycle.MutableLiveData r0 = r2.LIZ()
                                        goto L39
                                    L56:
                                        r0 = 0
                                        goto L39
                                    L58:
                                        java.lang.String r0 = "dm_guide_modify_inbox_permission_popup"
                                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                                        if (r0 == 0) goto L6a
                                        X.107C r2 = new X.107C
                                        androidx.lifecycle.ViewModelStoreOwner r1 = r5.LIZIZ
                                        java.lang.String r0 = r6.LJIIIZ
                                        r2.<init>(r1, r0)
                                        goto L18
                                    L6a:
                                        X.108B r2 = new X.108B
                                        androidx.lifecycle.ViewModelStoreOwner r0 = r5.LIZIZ
                                        r2.<init>(r0)
                                        goto L18
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C106Z.<init>(X.103q, X.107P):void");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[PHI: r1 r6
                                  0x0039: PHI (r1v9 com.ss.android.ugc.tiktok.pns.model.DMPrivacySettingTextInfo) = 
                                  (r1v2 com.ss.android.ugc.tiktok.pns.model.DMPrivacySettingTextInfo)
                                  (r1v10 com.ss.android.ugc.tiktok.pns.model.DMPrivacySettingTextInfo)
                                 binds: [B:12:0x0037, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]
                                  0x0039: PHI (r6v6 java.lang.String) = (r6v1 java.lang.String), (r6v7 java.lang.String) binds: [B:12:0x0037, B:10:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[PHI: r1 r6
                                  0x003d: PHI (r1v8 com.ss.android.ugc.tiktok.pns.model.DMPrivacySettingTextInfo) = 
                                  (r1v2 com.ss.android.ugc.tiktok.pns.model.DMPrivacySettingTextInfo)
                                  (r1v9 com.ss.android.ugc.tiktok.pns.model.DMPrivacySettingTextInfo)
                                 binds: [B:12:0x0037, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]
                                  0x003d: PHI (r6v5 java.lang.String) = (r6v1 java.lang.String), (r6v6 java.lang.String) binds: [B:12:0x0037, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[PHI: r1 r3 r6
                                  0x0049: PHI (r1v3 com.ss.android.ugc.tiktok.pns.model.DMPrivacySettingTextInfo) = 
                                  (r1v8 com.ss.android.ugc.tiktok.pns.model.DMPrivacySettingTextInfo)
                                  (r1v9 com.ss.android.ugc.tiktok.pns.model.DMPrivacySettingTextInfo)
                                 binds: [B:19:0x0047, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]
                                  0x0049: PHI (r3v0 java.lang.String) = (r3v5 java.lang.String), (r3v6 java.lang.String) binds: [B:19:0x0047, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]
                                  0x0049: PHI (r6v2 java.lang.String) = (r6v5 java.lang.String), (r6v6 java.lang.String) binds: [B:19:0x0047, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:22:0x004d A[PHI: r3 r6
                                  0x004d: PHI (r3v4 java.lang.String) = (r3v0 java.lang.String), (r3v5 java.lang.String) binds: [B:21:0x004b, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]
                                  0x004d: PHI (r6v4 java.lang.String) = (r6v2 java.lang.String), (r6v5 java.lang.String) binds: [B:21:0x004b, B:19:0x0047] A[DONT_GENERATE, DONT_INLINE]] */
                                /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
                                @Override // X.C191962108a, X.AbstractC191963108b, X.InterfaceC191831102z
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final java.lang.CharSequence LIZJ(android.content.Context r13, java.lang.CharSequence r14) {
                                    /*
                                        r12 = this;
                                        X.106T r1 = X.C106T.LIZ
                                        X.104v r0 = X.C191871104n.LIZIZ()
                                        r0.getClass()
                                        r7 = 0
                                        java.lang.String r0 = "dm_setting_others"
                                        com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem r0 = X.C191879104v.LIZIZ(r7, r0)
                                        if (r0 == 0) goto L9b
                                        int r2 = r0.tipsType
                                    L14:
                                        r1.getClass()
                                        java.lang.Class<com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService> r6 = com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService.class
                                        r10 = 14
                                        r11 = 0
                                        r8 = r7
                                        r9 = r7
                                        java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
                                        com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService r0 = (com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService) r0
                                        if (r0 == 0) goto L99
                                        com.ss.android.ugc.tiktok.pns.model.DMPrivacySettingTextInfo r1 = r0.LJJIJIIJI()
                                        if (r1 == 0) goto L30
                                        java.lang.String r6 = r1.linkText
                                        if (r6 != 0) goto L39
                                    L30:
                                        r0 = 2131830789(0x7f112805, float:1.9294585E38)
                                        java.lang.String r6 = r13.getString(r0)
                                        if (r1 == 0) goto L3d
                                    L39:
                                        java.lang.String r3 = r1.rawText
                                        if (r3 != 0) goto L49
                                    L3d:
                                        r0 = 4
                                        if (r2 != r0) goto L95
                                        r0 = 2131830784(0x7f112800, float:1.9294575E38)
                                    L43:
                                        java.lang.String r3 = r13.getString(r0)
                                        if (r1 == 0) goto L4d
                                    L49:
                                        java.lang.String r2 = r1.jumpUrl
                                        if (r2 != 0) goto L4f
                                    L4d:
                                        java.lang.String r2 = "https://support.tiktok.com/en/using-tiktok/messaging-and-notifications/direct-message-settings"
                                    L4f:
                                        r1 = 1
                                        java.lang.Object[] r0 = new java.lang.Object[r1]
                                        r0[r7] = r6
                                        java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
                                        java.lang.String r1 = X.C786410Ut5.j4(r3, r0)
                                        android.text.SpannableString r5 = new android.text.SpannableString
                                        r5.<init>(r1)
                                        r0 = 6
                                        int r4 = kotlin.text.a0.LJJJ(r1, r6, r7, r7, r0)
                                        int r3 = r6.length()
                                        int r3 = r3 + r4
                                        X.038o r0 = new X.038o
                                        r0.<init>()
                                        r2 = 33
                                        X.C786410Ut5.p2(r5, r0, r4, r3, r2)
                                        X.0HcY r1 = new X.0HcY
                                        r0 = 72
                                        r1.<init>(r0, r7)
                                        X.C786410Ut5.p2(r5, r1, r4, r3, r2)
                                        android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
                                        r0 = 2131100622(0x7f0603ce, float:1.781363E38)
                                        java.lang.Integer r0 = X.C1308910kAL.LIZJ(r0, r13)
                                        if (r0 == 0) goto L8e
                                        int r7 = r0.intValue()
                                    L8e:
                                        r1.<init>(r7)
                                        X.C786410Ut5.p2(r5, r1, r4, r3, r2)
                                        return r5
                                    L95:
                                        r0 = 2131830785(0x7f112801, float:1.9294577E38)
                                        goto L43
                                    L99:
                                        r1 = 0
                                        goto L30
                                    L9b:
                                        r2 = 0
                                        goto L14
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C106Z.LIZJ(android.content.Context, java.lang.CharSequence):java.lang.CharSequence");
                                }

                                /* JADX WARN: Removed duplicated region for block: B:45:0x00da  */
                                /* JADX WARN: Removed duplicated region for block: B:66:0x0138  */
                                /* JADX WARN: Removed duplicated region for block: B:85:0x018a  */
                                @Override // X.C191962108a
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void LJJII(int r20, android.view.View r21) {
                                    /*
                                        Method dump skipped, instruction units count: 397
                                        To view this dump add '--comments-level debug' option
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: X.C106Z.LJJII(int, android.view.View):void");
                                }
                            };
                        case -696474261:
                            if (str2.equals("mention_entrance")) {
                                final C107P c107p6 = (C107P) c104a;
                                return new C191962108a(c191848103q, c107p6) { // from class: X.1077
                                    @Override // X.AbstractC191963108b
                                    public final Integer LJIILLIIL() {
                                        return Integer.valueOf(R.raw.icon_at_fill);
                                    }

                                    @Override // X.C191962108a
                                    public final void LJJII(int i, View view) {
                                        super.LJJII(0, view);
                                        C107K.LIZ.getClass();
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
                                        c1163504gr.onEventV3("enter_tag_mention_permission", c191969108h.LIZ);
                                    }
                                };
                            }
                            return null;
                        case -643429487:
                            if (str2.equals("liked_videos_permission_entrance")) {
                                final C107P c107p7 = (C107P) c104a;
                                return new C191962108a(c191848103q, c107p7) { // from class: X.1074
                                    @Override // X.AbstractC191963108b
                                    public final Integer LJIILLIIL() {
                                        return Integer.valueOf(R.raw.icon_heart_fill);
                                    }

                                    {
                                        if (C107T.LIZ()) {
                                            c107p7.LJIIJ = "aweme://privacy/setting/page?target=liked_videos_permission";
                                        }
                                    }

                                    @Override // X.C191962108a
                                    public final void LJJII(int i, View view) {
                                        super.LJJII(0, view);
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZLLL("enter_from", "privacy_and_safety_settings");
                                        c1163504gr.onEventV3("enter_liked_permission", c191969108h.LIZ);
                                    }
                                };
                            }
                            return null;
                        case -628382103:
                            if (str2.equals("display_profile_entrance")) {
                                final C107P c107p8 = (C107P) c104a;
                                return new C191962108a(c191848103q, c107p8) { // from class: X.1073
                                    @Override // X.AbstractC191963108b
                                    public final Integer LJIILLIIL() {
                                        return Integer.valueOf(R.raw.icon_link_fill);
                                    }

                                    {
                                        if (C107T.LIZ()) {
                                            c107p8.LJIIJ = "aweme://privacy/setting/page?page_tag=display_profile_when_sharing_links&enter_from=privacy_and_safety_settings";
                                        }
                                    }

                                    @Override // X.C191962108a
                                    public final void LJJII(int i, View view) {
                                        super.LJJII(0, view);
                                        C1163504gr.LIZIZ.onEventV3("click_display_profile_share_link", C2097908Jt.LIZJ(new Pair("enter_from", "privacy_and_safety_settings")));
                                    }
                                };
                            }
                            return null;
                        case -409155597:
                            if (str2.equals("following_list_permission_entrance")) {
                                final C107P c107p9 = (C107P) c104a;
                                return new C191962108a(c191848103q, c107p9) { // from class: X.106s
                                    @Override // X.AbstractC191963108b
                                    public final Integer LJIILLIIL() {
                                        return Integer.valueOf(R.raw.icon_two_person_large_fill);
                                    }

                                    {
                                        if (C107T.LIZ()) {
                                            c107p9.LJIIJ = "aweme://privacy/setting/page?target=following_list_permission";
                                        }
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
                                    @Override // X.C191962108a
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void LJJII(int r6, android.view.View r7) {
                                        /*
                                            r5 = this;
                                            r0 = 0
                                            super.LJJII(r0, r7)
                                            java.lang.Integer r0 = r5.LJIJJ()
                                            if (r0 == 0) goto L46
                                            int r1 = r0.intValue()
                                            r0 = 1
                                            if (r1 == r0) goto L3a
                                            r0 = 2
                                            if (r1 != r0) goto L46
                                            java.lang.String r4 = "me"
                                        L16:
                                            X.04gr r3 = X.C1163504gr.LIZIZ
                                            X.108h r2 = new X.108h
                                            r2.<init>()
                                            java.lang.String r1 = "enter_from"
                                            java.lang.String r0 = "privacy_setting"
                                            r2.LIZLLL(r1, r0)
                                            java.lang.String r0 = "status"
                                            r2.LIZLLL(r0, r4)
                                            boolean r1 = X.C104L.LIZJ()
                                            java.lang.String r0 = "is_private"
                                            r2.LIZ(r1, r0)
                                            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
                                            java.lang.String r0 = "click_following_list_setting"
                                            r3.onEventV3(r0, r1)
                                            return
                                        L3a:
                                            boolean r0 = X.C104L.LIZJ()
                                            if (r0 == 0) goto L43
                                            java.lang.String r4 = "Followers"
                                            goto L16
                                        L43:
                                            java.lang.String r4 = "Everyone"
                                            goto L16
                                        L46:
                                            java.lang.String r4 = ""
                                            goto L16
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C191928106s.LJJII(int, android.view.View):void");
                                    }
                                };
                            }
                            return null;
                        case -381176433:
                            if (str2.equals("manage_associated_videos_content_reuse_entrance")) {
                                final C107P c107p10 = (C107P) c104a;
                                return new C191962108a(c191848103q, c107p10) { // from class: X.107E
                                    @Override // X.C191962108a
                                    public final void LJJII(int i, View view) {
                                        super.LJJII(0, view);
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZJ("enter_from", "reuse_content_settings");
                                        c1163504gr.onEventV3("enter_remove_page", c191969108h.LIZ);
                                    }
                                };
                            }
                            return null;
                        case -307538165:
                            if (str2.equals("pause_interactions_entrance")) {
                                final C107P c107p11 = (C107P) c104a;
                                return new C191962108a(c191848103q, c107p11) { // from class: X.107D
                                    @Override // X.AbstractC191963108b
                                    public final Integer LJIILLIIL() {
                                        return Integer.valueOf(R.raw.icon_chat_xmark_fill);
                                    }

                                    @Override // X.C191962108a
                                    public final String LJJIFFI() {
                                        Integer numLJIJJ = LJIJJ();
                                        return numLJIJJ != null ? (numLJIJJ.intValue() == 1 || numLJIJJ.intValue() == 2) ? this.LLJ.LIZ.getString(2131838683) : "" : "";
                                    }
                                };
                            }
                            return null;
                        case -121360217:
                            if (str2.equals("content_reuse_entrance")) {
                                final C107P c107p12 = (C107P) c104a;
                                return new C191962108a(c191848103q, c107p12) { // from class: X.106b
                                    @Override // X.AbstractC191963108b, X.AbstractC191843103l
                                    public final void LJIIIIZZ() {
                                        Integer numLIZ;
                                        super.LJIIIIZZ();
                                        C191880104w.LIZ.getClass();
                                        PrivacyUserSettingsV2 privacyUserSettingsV2LJIIL = C191880104w.LJIIL();
                                        int iIntValue = (privacyUserSettingsV2LJIIL == null || (numLIZ = privacyUserSettingsV2LJIIL.LIZ("content_reuse_permission")) == null) ? 5 : numLIZ.intValue();
                                        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                                        new C1061730djf();
                                        C1548820qPI.LIZIZ(new C397901gf(jCurrentThreadTimeMillis, C1061730djf.LIZLLL(C2097608Jq.LJIIIIZZ(new Pair("permission_key", "content_reuse_permission"), new Pair("permission_value", Integer.valueOf(iIntValue)))), "privacy_permission_change"));
                                    }

                                    @Override // X.AbstractC191963108b
                                    public final Integer LJIILLIIL() {
                                        return Integer.valueOf(R.raw.icon_playlist_2_fill);
                                    }

                                    @Override // X.C191962108a
                                    public final void LJJII(int i, View view) {
                                        super.LJJII(0, view);
                                        C1163504gr c1163504gr = C1163504gr.LIZIZ;
                                        C191969108h c191969108h = new C191969108h();
                                        c191969108h.LIZLLL("enter_from", "account_settings");
                                        c1163504gr.onEventV3("click_reuse_content_setting_activity_center", c191969108h.LIZ);
                                    }
                                };
                            }
                            return null;
                        case -60289600:
                            if (!str2.equals("dm_others_permission_entrance")) {
                                return null;
                            }
                            final C107P c107p52 = (C107P) c104a;
                            return new C191962108a
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x026f: RETURN 
                                  (wrap:X.108a:0x026c: CONSTRUCTOR (r4v0 'c191848103q' X.103q A[DONT_INLINE]), (r5v10 'c107p52' X.107P A[DONT_INLINE]) A[MD:(X.103q, X.107P):void (m), WRAPPED] (LINE:33555052) call: X.106Z.<init>(X.103q, X.107P):void type: CONSTRUCTOR)
                                 (LINE:33555052) in method: X.106W.LIZ(X.103q, X.104A):X.103l, file: classes29.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:88)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.setCodeVar(jadx.core.dex.instructions.args.CodeVar)" because the return value of "jadx.core.dex.instructions.args.RegisterArg.getSVar()" is null
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:836)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 33 more
                                */
                            /*
                                Method dump skipped, instruction units count: 1004
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C106W.LIZ(X.103q, X.104A):X.103l");
                        }
                    };
                    C103G.LIZ("private_account_item", c106w);
                    C103G.LIZ("activity_status_item", c106w);
                    C103G.LIZ("activity_status_v2_entrance", c106w);
                    C103G.LIZ("activity_status_v2_options", c106w);
                    C103G.LIZ("activity_status_v2_popup_options", c106w);
                    C103G.LIZ("comment_entrance", c106w);
                    C103G.LIZ("mention_entrance", c106w);
                    C103G.LIZ("direct_message_entrance", c106w);
                    C103G.LIZ("content_reuse_entrance", c106w);
                    C103G.LIZ("ai_remix_reuse_entrance", c106w);
                    C103G.LIZ("display_profile_entrance", c106w);
                    C103G.LIZ("download_entrance", c106w);
                    C103G.LIZ("following_list_permission_entrance", c106w);
                    C103G.LIZ("liked_videos_permission_entrance", c106w);
                    C103G.LIZ("favorite_music_entrance", c106w);
                    C103G.LIZ("viewer_history_entrance", c106w);
                    C103G.LIZ("video_view_history_entrance", c106w);
                    C103G.LIZ("profile_view_history_entrance", c106w);
                    C103G.LIZ("privacy_checkup_entrance", c106w);
                    C103G.LIZ("blocked_accounts_entrance", c106w);
                    C103G.LIZ("comment_permission_entrance", c106w);
                    C103G.LIZ("comment_batch", c106w);
                    ICommentFilterToolService iCommentFilterToolService = (ICommentFilterToolService) PluggableExtentionKt.pluggableSpi$default(ICommentFilterToolService.class, false, false, false, 14, null);
                    if (iCommentFilterToolService != null) {
                        iCommentFilterToolService.LIZ();
                    }
                    C103G.LIZ("comment_options", c106w);
                    C103G.LIZ("mention_permission_entrance", c106w);
                    C103G.LIZ("mention_options", c106w);
                    C103G.LIZ("direct_message_permission_entrance", c106w);
                    C103G.LIZ("dm_permission_entrance", c106w);
                    C103G.LIZ("tcm_message_item", c106w);
                    C103G.LIZ("safe_mode_item", c106w);
                    C103G.LIZ("nude_filter_item", c106w);
                    C103G.LIZ("restrict_sharing_item", c106w);
                    C103G.LIZ("direct_message_options", c106w);
                    C103G.LIZ("dm_friends_permission_entrance", c106w);
                    C103G.LIZ("dm_potential_connection_permission_entrance", c106w);
                    C103G.LIZ("dm_others_permission_entrance", c106w);
                    C103G.LIZ("dm_friends_options", c106w);
                    C103G.LIZ("dm_potential_connection_options", c106w);
                    C103G.LIZ("dm_others_options", c106w);
                    C103G.LIZ("pause_interactions_entrance", c106w);
                    C103G.LIZ("content_reuse_permission_entrance", c106w);
                    C103G.LIZ("remix_reuse_permission_entrance", c106w);
                    C103G.LIZ("content_reuse_permission_batch_entrance", c106w);
                    C103G.LIZ("manage_associated_videos_content_reuse_entrance", c106w);
                    C103G.LIZ("content_reuse_options", c106w);
                    C103G.LIZ("ai_remix_reuse_options", c106w);
                    C103G.LIZ("display_profile_when_sharing_links_item", c106w);
                    C103G.LIZ("download_item", c106w);
                    C103G.LIZ("following_list_options", c106w);
                    C103G.LIZ("like_videos_options", c106w);
                    C103G.LIZ("favorite_music_item", c106w);
                    C103G.LIZ("viewer_history_item", c106w);
                    C103G.LIZ("video_view_history_item", c106w);
                    C103G.LIZ("profile_view_history_item", c106w);
                }
            }

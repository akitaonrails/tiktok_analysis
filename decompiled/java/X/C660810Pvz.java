package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import avg.f;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.PoiAnchorCard;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0Pvz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C660810Pvz {
    public final Context LIZ;
    public final View LIZIZ;
    public final ISearchContextAbility LIZJ;
    public C660840Pw2 LIZLLL;
    public TuxTextView LJ;

    public static void LIZJ(final C660810Pvz c660810Pvz, final Aweme aweme) {
        View.OnClickListener fVar;
        c660810Pvz.getClass();
        final boolean z = true;
        final String str = "search_video_anchor_outflow";
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: X.0Pvo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                C0PCY<C646370PWx> c0pcyWO2;
                C646370PWx c646370PWx;
                ISearchContextAbility iSearchContextAbility;
                if (z && (iSearchContextAbility = c660810Pvz.LIZJ) != null) {
                    C654710Pm9 c654710Pm9 = C654710Pm9.LIZ;
                    Aweme aweme2 = aweme;
                    c654710Pm9.getClass();
                    C654710Pm9.LIZ(aweme2, iSearchContextAbility);
                }
                C660810Pvz c660810Pvz2 = c660810Pvz;
                Aweme aweme3 = aweme;
                String str3 = str;
                ISearchContextAbility iSearchContextAbility2 = c660810Pvz2.LIZJ;
                if (iSearchContextAbility2 == null || (c0pcyWO2 = iSearchContextAbility2.wO2()) == null || (c646370PWx = (C646370PWx) c0pcyWO2.LIZJ()) == null || (str2 = c646370PWx.LLILLL) == null) {
                    str2 = "";
                }
                C660380PvI c660380PvI = C660380PvI.LIZ;
                Context context = c660810Pvz2.LIZ;
                View view2 = c660810Pvz2.LIZIZ;
                c660380PvI.getClass();
                C660380PvI.LIZIZ(context, view2, aweme3, str2, str3);
            }
        };
        C660840Pw2 c660840Pw2 = c660810Pvz.LIZLLL;
        if (c660840Pw2 != null) {
            if (C1848410yCV.LIZ) {
                fVar = new f(onClickListener);
            } else {
                fVar = onClickListener;
            }
            a aVar = new a(fVar);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c660840Pw2);
            }
            c660840Pw2.setOnClickListener(aVar);
        }
        TuxTextView tuxTextView = c660810Pvz.LJ;
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, onClickListener);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r6, android.view.View r7) {
        /*
            r5 = this;
            android.view.View r0 = r7.findViewById(r6)
            X.0Pw2 r0 = (X.C660840Pw2) r0
            r5.LIZLLL = r0
            r0 = 2131389584(0x7f0a6c90, float:1.8399715E38)
            android.view.View r0 = r7.findViewById(r0)
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0
            r5.LJ = r0
            android.content.Context r0 = r5.LIZ
            if (r0 == 0) goto L74
            boolean r0 = X.C426750GoL.LIZLLL(r0)
            r2 = 1
            if (r0 != r2) goto L74
        L1e:
            X.0Pw2 r0 = r5.LIZLLL
            r1 = 0
            if (r0 == 0) goto L27
            android.view.ViewParent r1 = r0.getParent()
        L27:
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L32
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L32
            r1.setLayoutDirection(r2)
        L32:
            X.0Pw2 r0 = r5.LIZLLL
            if (r0 == 0) goto L39
            r0.setLayoutDirection(r2)
        L39:
            com.bytedance.tux.input.TuxTextView r0 = r5.LJ
            if (r0 == 0) goto L40
            r0.setLayoutDirection(r2)
        L40:
            X.0Pw2 r4 = r5.LIZLLL
            if (r4 == 0) goto L73
            r1 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r3 = X.C814420VxA.LIZIZ(r0)
            int r2 = r4.getPaddingTop()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r1 = X.C814420VxA.LIZIZ(r0)
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            r4.setPaddingRelative(r3, r2, r1, r0)
        L73:
            return
        L74:
            r2 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C660810Pvz.LIZIZ(int, android.view.View):void");
    }

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
    public final void LIZLLL(Aweme aweme, boolean z) {
        PoiAnchorInfo poiAnchorInfo;
        PoiAnchorCard poiAnchorCard;
        String str;
        String str2;
        String str3;
        int width;
        List<PoiSubTag> list;
        PoiSubTag poiSubTag;
        int iIntValue;
        boolean z2;
        if (z) {
            C660380PvI c660380PvI = C660380PvI.LIZ;
            C660840Pw2 c660840Pw2 = this.LIZLLL;
            c660380PvI.getClass();
            C660800Pvy.LIZ.getClass();
            PoiDataStruct poiDataStructLIZ = C660800Pvy.LIZ(aweme);
            if (poiDataStructLIZ != null) {
                if (c660840Pw2 != null) {
                    PoiAnchorInfo poiAnchorInfo2 = poiDataStructLIZ.videoAnchor;
                    if (poiAnchorInfo2 != null) {
                        str2 = poiAnchorInfo2.suffix;
                    } else {
                        str2 = null;
                    }
                    String str4 = poiDataStructLIZ.poiName;
                    if (str4 == null) {
                        str4 = "";
                    }
                    StringBuilder sb = new StringBuilder(str4);
                    if (str2 != null && str2.length() != 0) {
                        sb.append(" · ");
                        sb.append(str2);
                    }
                    String string = sb.toString();
                    CharSequence charSequence = string;
                    if (((Number) C07EW.LIZ.getValue()).intValue() == 2) {
                        PoiAnchorInfo poiAnchorInfo3 = poiDataStructLIZ.videoAnchor;
                        charSequence = string;
                        if (poiAnchorInfo3 != null) {
                            PoiAnchorCard poiAnchorCard2 = poiAnchorInfo3.poiAnchorCard;
                            charSequence = string;
                            if (poiAnchorCard2 != null) {
                                String str5 = poiAnchorCard2.distance;
                                charSequence = string;
                                if (str5 != null) {
                                    charSequence = string;
                                    if (str5.length() > 0) {
                                        charSequence = string;
                                        if (str5.length() != 0) {
                                            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1));
                                            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                                            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
                                            GradientDrawable gradientDrawable = new GradientDrawable();
                                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zk, c660840Pw2.getContext());
                                            if (numLIZJ != null) {
                                                iIntValue = numLIZJ.intValue();
                                            } else {
                                                iIntValue = -1;
                                            }
                                            gradientDrawable.setColor(iIntValue);
                                            gradientDrawable.setCornerRadius(iLIZIZ / 2.0f);
                                            InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, 0, iLIZIZ3, 0, iLIZIZ3);
                                            insetDrawable.setBounds(0, 0, iLIZIZ, iLIZIZ2 + (iLIZIZ3 * 2));
                                            C419890GdH c419890GdH = new C419890GdH(insetDrawable, 0);
                                            if (c660840Pw2.getLayoutDirection() == 1) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            c419890GdH.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), z2);
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                            spannableStringBuilder.append((CharSequence) str5);
                                            int length = spannableStringBuilder.length();
                                            spannableStringBuilder.append((CharSequence) "x");
                                            C786410Ut5.q2(spannableStringBuilder, c419890GdH, length, length + 1, 33);
                                            spannableStringBuilder.append((CharSequence) string);
                                            charSequence = spannableStringBuilder;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    PoiAnchorInfo poiAnchorInfo4 = poiDataStructLIZ.videoAnchor;
                    if (poiAnchorInfo4 != null && (list = poiAnchorInfo4.subTags) != null && (poiSubTag = (PoiSubTag) C13LP.LJJJLL(list)) != null) {
                        str3 = poiSubTag.name;
                    } else {
                        str3 = null;
                    }
                    c660840Pw2.clearAnimation();
                    c660840Pw2.LLJ.end();
                    if (!Intrinsics.LJFF(charSequence, c660840Pw2.LLILLJJLI.getText()) || !Intrinsics.LJFF(str3, c660840Pw2.LLIZLLLIL.getText())) {
                        if (charSequence != null && charSequence.length() != 0) {
                            C786410Ut5.LJLLLLLL(0, c660840Pw2);
                        } else {
                            C786410Ut5.LJLLLLLL(8, c660840Pw2);
                        }
                        c660840Pw2.LLILLJJLI.setText(charSequence);
                        c660840Pw2.LLIZLLLIL.setText(str3);
                        if (c660840Pw2.getWidth() > 0 && (width = ((((c660840Pw2.getWidth() - c660840Pw2.getPaddingStart()) - c660840Pw2.getPaddingEnd()) - c660840Pw2.LLILZIL) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))) - c660840Pw2.LLILZIL) >= 0 && width > 0 && c660840Pw2.LLIZLLLIL.getMaxWidth() != width) {
                            c660840Pw2.LLIZLLLIL.setMaxWidth(width);
                        }
                        if (c660840Pw2.e0()) {
                            C786410Ut5.LJLLLLLL(0, c660840Pw2.LLIZLLLIL);
                        } else {
                            C436180H8m.LIZIZ(c660840Pw2.LLIZLLLIL);
                        }
                    }
                    int visibility = c660840Pw2.getVisibility();
                    c660840Pw2.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c660840Pw2);
                }
            } else if (c660840Pw2 != null) {
                int visibility2 = c660840Pw2.getVisibility();
                c660840Pw2.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c660840Pw2);
            }
            TuxTextView tuxTextView = this.LJ;
            if (tuxTextView != null) {
                if (!C07EW.LIZ()) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                    return;
                }
                PoiDataStruct poiDataStructLIZ2 = C660800Pvy.LIZ(aweme);
                if (poiDataStructLIZ2 != null && (poiAnchorInfo = poiDataStructLIZ2.videoAnchor) != null && (poiAnchorCard = poiAnchorInfo.poiAnchorCard) != null && ((((str = poiAnchorCard.distance) != null && str.length() > 0) || (str = poiAnchorCard.cityOrDistrictName) != null) && str.length() != 0)) {
                    tuxTextView.setText(str);
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                    return;
                } else {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                    return;
                }
            }
            return;
        }
        C660840Pw2 c660840Pw22 = this.LIZLLL;
        if (c660840Pw22 != null) {
            int visibility3 = c660840Pw22.getVisibility();
            c660840Pw22.setVisibility(8);
            C1602160rnK.LIZIZ(visibility3, 8, c660840Pw22);
        }
        TuxTextView tuxTextView2 = this.LJ;
        if (tuxTextView2 == null) {
            return;
        }
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
    }

    public C660810Pvz(Context context, View view, ISearchContextAbility iSearchContextAbility) {
        this.LIZ = context;
        this.LIZIZ = view;
        this.LIZJ = iSearchContextAbility;
    }

    public final void LIZ(int i, int i2, boolean z) {
        if (z) {
            C660840Pw2 c660840Pw2 = this.LIZLLL;
            if (c660840Pw2 != null && c660840Pw2.getVisibility() == 0) {
                c660840Pw2.clearAnimation();
                c660840Pw2.LLJ.end();
                C0Q0P c0q0p = c660840Pw2.LLILLJJLI;
                if (!c0q0p.LLJJIII) {
                    c0q0p.LLJILJIL = true;
                    C786410Ut5.v2().postFrameCallback(c0q0p.LLJJI);
                }
                if (c660840Pw2.e0()) {
                    c660840Pw2.LLJ.reverse();
                }
            }
        } else {
            C660840Pw2 c660840Pw22 = this.LIZLLL;
            if (c660840Pw22 != null && c660840Pw22.getVisibility() == 0) {
                c660840Pw22.clearAnimation();
                c660840Pw22.LLJ.end();
                if (c660840Pw22.LLILLJJLI.LLJILJIL) {
                    c660840Pw22.startAnimation(c660840Pw22.LL);
                    c660840Pw22.LLILLJJLI.LIZJ();
                }
                if (c660840Pw22.e0()) {
                    c660840Pw22.LLJ.start();
                }
            }
        }
        TuxTextView tuxTextView = this.LJ;
        if (tuxTextView != null) {
            tuxTextView.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0, 0, i);
        }
        TuxTextView tuxTextView2 = this.LJ;
        if (tuxTextView2 != null) {
            tuxTextView2.setMaxWidth(i2);
        }
    }
}

package X;

import Y.ACListenerS155S0100000_21;
import Y.ATListenerS454S0100000_21;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.performanceopt.api.PerfMonitorService;
import com.ss.android.ugc.aweme.share.LongPressShareListDialogForLiveHost;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import mf.a;

/* JADX INFO: renamed from: X.0lqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1373630lqj {
    public final Context LIZ;
    public final C1372830lpR LIZIZ;
    public final InterfaceC1373720lqs LIZJ;
    public final float LIZLLL;
    public final Dialog LJ;
    public final LongPressShareListDialogForLiveHost LJFF;
    public View LJI;
    public LinearLayout LJII;
    public LinearLayout LJIIIIZZ;
    public ViewGroup LJIIIZ;
    public C21578619ce LJIIJ;
    public LinearLayout LJIIJJI;
    public ViewGroup LJIIL;
    public BottomSheetBehavior<View> LJIILIIL;
    public boolean LJIILL;
    public InterfaceC1371520lnK LJIIZILJ;
    public DialogInterface.OnDismissListener LJIJ;
    public C788580Uwa LJIJI;
    public final C1372840lpS LJIILJJIL = new InterfaceC1809520xBm() { // from class: X.0lpS
        @Override // X.InterfaceC1809520xBm
        public final void LIZ(C21578619ce c21578619ce, int i, int i2, int i3, int i4) {
            C1373630lqj c1373630lqj = this.LIZ;
            if (c1373630lqj.LJFF != null) {
                return;
            }
            C788580Uwa c788580Uwa = c1373630lqj.LJIJI;
            if (c788580Uwa != null && c788580Uwa.LIZ) {
                return;
            }
            int[] iArr = new int[2];
            c1373630lqj.LIZ(R.id.uzy).getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            C21578619ce c21578619ce2 = this.LIZ.LJIIJ;
            if (c21578619ce2 != null) {
                c21578619ce2.getLocationOnScreen(iArr2);
            }
            if (iArr[1] - iArr2[1] < 0.0f) {
                ViewGroup viewGroup = this.LIZ.LJIIL;
                if (viewGroup != null) {
                    C786410Ut5.LJLZ(0, viewGroup);
                }
                float fLIZJ = (-r2) / C12ES.LIZJ(40.0f, this.LIZ.LIZ);
                ViewGroup viewGroup2 = this.LIZ.LJIIL;
                if (viewGroup2 != null) {
                    if (fLIZJ > 1.0f) {
                        fLIZJ = 1.0f;
                    }
                    C786410Ut5.R4(fLIZJ, viewGroup2);
                    return;
                }
                return;
            }
            ViewGroup viewGroup3 = this.LIZ.LJIIL;
            if (viewGroup3 == null) {
                return;
            }
            C786410Ut5.LJLZ(8, viewGroup3);
        }
    };
    public final boolean LJIILLIIL = C1336205Ku.LIZJ().LIZJ();

    public final boolean LIZJ() {
        Activity activityLIZ;
        return (this.LIZJ instanceof C1374200lre) && (activityLIZ = C317500CcW.LIZ(this.LIZ)) != null && C339190DRl.LIZJ(activityLIZ.getRequestedOrientation());
    }

    public final void LJ() {
        Window window;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        final int iLIZIZ = C814420VxA.LIZIZ(C12ES.LJIIIIZZ(this.LIZ) * this.LIZLLL);
        final C013C c013c = new C013C();
        final View viewLIZ = LIZ(R.id.fpl);
        if (viewLIZ != null) {
            viewLIZ.setBackground(null);
        }
        if (!LIZJ()) {
            if (!this.LIZIZ.LIZ || this.LJIILLIIL) {
                if (viewLIZ != null && (layoutParams = viewLIZ.getLayoutParams()) != null) {
                    layoutParams.height = -2;
                }
            } else if (viewLIZ != null && (layoutParams2 = viewLIZ.getLayoutParams()) != null) {
                layoutParams2.height = iLIZIZ;
            }
        }
        Dialog dialog = this.LJ;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setDimAmount(0.0f);
        }
        Dialog dialog2 = this.LJ;
        if (dialog2 != null) {
            dialog2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: X.0lnI
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    BottomSheetBehavior<View> bottomSheetBehaviorFrom;
                    int i;
                    InterfaceC1371520lnK interfaceC1371520lnK = this.LL.LJIIZILJ;
                    if (interfaceC1371520lnK != null) {
                        interfaceC1371520lnK.LIZ();
                    }
                    C1373630lqj c1373630lqj = this.LL;
                    View view = viewLIZ;
                    if (view != null) {
                        bottomSheetBehaviorFrom = BottomSheetBehavior.from(view);
                    } else {
                        bottomSheetBehaviorFrom = null;
                    }
                    c1373630lqj.LJIILIIL = bottomSheetBehaviorFrom;
                    final C1373630lqj c1373630lqj2 = this.LL;
                    final BottomSheetBehavior<View> bottomSheetBehavior = c1373630lqj2.LJIILIIL;
                    if (bottomSheetBehavior != null) {
                        int i2 = iLIZIZ;
                        C013C c013c2 = c013c;
                        bottomSheetBehavior.setFitToContents(true);
                        bottomSheetBehavior.setSkipCollapsed(false);
                        bottomSheetBehavior.setHideable(true);
                        bottomSheetBehavior.setPeekHeight(i2);
                        if (c013c2.element) {
                            i = 4;
                        } else {
                            i = 3;
                        }
                        bottomSheetBehavior.setState(i);
                        if (c013c2.element) {
                            bottomSheetBehavior.setBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0lnJ
                                @Override // X.AbstractC1177930gl5
                                public final void LIZJ(View view2, float f) {
                                }

                                @Override // X.AbstractC1177930gl5
                                public final void LIZLLL(int i3, View view2) {
                                    if (c1373630lqj2.LJIILL && i3 == 4) {
                                        bottomSheetBehavior.setState(3);
                                    }
                                }
                            });
                        }
                    }
                    C1440005kM.LIZ(new C739550Szh(true));
                    Object service = ServiceManager.get().getService(PerfMonitorService.class);
                    C1373630lqj c1373630lqj3 = this.LL;
                    PerfMonitorService perfMonitorService = (PerfMonitorService) service;
                    perfMonitorService.LIZLLL("share_panel");
                    perfMonitorService.LIZ(null, null);
                    perfMonitorService.LIZJ("share_panel_im", EnumC1618420sDY.RECYCLER_VIEW, c1373630lqj3.LIZ(R.id.t0e), null, null);
                }
            });
        }
    }

    public final <T extends View> T LIZ(int i) {
        T t;
        Dialog dialog = this.LJ;
        if (dialog == null || (t = (T) dialog.findViewById(i)) == null) {
            View view = this.LJI;
            if (view != null) {
                return (T) view.findViewById(i);
            }
            return null;
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r5v40, types: [X.0lc1] */
    /* JADX WARN: Type inference failed for: r8v12, types: [X.0lpP] */
    public final void LIZIZ(View view) {
        InterfaceC1374230lrh interfaceC1374230lrh;
        Context context;
        Aweme aweme;
        String aid;
        String str;
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        Activity activityLJII;
        this.LJI = view;
        this.LJII = (LinearLayout) LIZ(R.id.fxt);
        this.LJIIIIZZ = (LinearLayout) LIZ(R.id.uz_);
        this.LJIIIZ = (ViewGroup) LIZ(R.id.fxt);
        this.LJIIJ = (C21578619ce) LIZ(R.id.u2m);
        this.LJIIJJI = (LinearLayout) LIZ(R.id.v01);
        this.LJIIL = (ViewGroup) LIZ(R.id.uq0);
        InterfaceC1373720lqs interfaceC1373720lqs = this.LIZJ;
        int i = 1;
        ?? r12 = 0;
        if (interfaceC1373720lqs instanceof C1374200lre) {
            this.LJIJI = new C788580Uwa(interfaceC1373720lqs.LIZ().extras.getBoolean("live_optimized_style"));
            LIZLLL(false);
        } else {
            KeyEvent.Callback callback = this.LJ;
            if ((callback instanceof InterfaceC1374230lrh) && (interfaceC1374230lrh = (InterfaceC1374230lrh) callback) != null && (context = this.LIZ) != null) {
                List<AbstractC1373870lr7> listLJ = interfaceC1373720lqs.LJ(interfaceC1374230lrh);
                LinearLayout linearLayout = this.LJIIIIZZ;
                if (linearLayout != null) {
                    C786410Ut5.LJJJJJL(linearLayout);
                }
                if (listLJ.isEmpty()) {
                    C786410Ut5.LJLLLLLL(8, LIZ(R.id.ci5));
                }
                int size = listLJ.size();
                int i2 = 0;
                while (i2 < size) {
                    AbstractC1373870lr7 abstractC1373870lr7 = (AbstractC1373870lr7) ListProtector.get(listLJ, i2);
                    if (i2 == listLJ.size() - i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (abstractC1373870lr7 instanceof C1373880lr8) {
                        C1373890lr9 c1373890lr9 = new C1373890lr9(context);
                        c1373890lr9.LIZ((C1373910lrB) abstractC1373870lr7, z, r12);
                        TuxIconView tuxIconView = c1373890lr9.LLILLJJLI.LLILLL;
                        if (tuxIconView != null) {
                            C786410Ut5.LLLLLLZZ(tuxIconView, r12);
                        }
                        LinearLayout linearLayout2 = this.LJIIIIZZ;
                        if (linearLayout2 != null) {
                            linearLayout2.addView(c1373890lr9);
                        }
                    } else if (abstractC1373870lr7 instanceof C1373910lrB) {
                        C1373890lr9 c1373890lr92 = new C1373890lr9(context);
                        c1373890lr92.LIZ((C1373910lrB) abstractC1373870lr7, z, r12);
                        LinearLayout linearLayout3 = this.LJIIIIZZ;
                        if (linearLayout3 != null) {
                            linearLayout3.addView(c1373890lr92);
                        }
                    } else if (abstractC1373870lr7 instanceof C1373790lqz) {
                        C1373640lqk c1373640lqk = new C1373640lqk(context);
                        C1373790lqz c1373790lqz = (C1373790lqz) abstractC1373870lr7;
                        c1373640lqk.setEnabled(c1373790lqz.LIZJ);
                        c1373640lqk.setClickable(c1373790lqz.LIZJ);
                        c1373640lqk.LLILLL = c1373790lqz.LIZIZ;
                        C0SZ3 c0sz3 = c1373640lqk.LLILLJJLI;
                        C1373780lqy c1373780lqy = c1373790lqz.LIZ;
                        TuxIconView tuxIconView2 = c0sz3.LLILLJJLI;
                        if (tuxIconView2 != null) {
                            tuxIconView2.setTuxIcon(c1373780lqy.LIZ);
                        }
                        TuxTextView tuxTextView = c0sz3.LL;
                        if (tuxTextView != null) {
                            tuxTextView.setText(c0sz3.getContext().getResources().getText(c1373780lqy.LIZIZ));
                        }
                        if (c1373780lqy.LIZJ) {
                            TuxIconView tuxIconView3 = c0sz3.LLILLJJLI;
                            if (tuxIconView3 != null) {
                                tuxIconView3.setTintColorRes(R.attr.a1h);
                            }
                            TuxTextView tuxTextView2 = c0sz3.LL;
                            if (tuxTextView2 != null) {
                                tuxTextView2.setTextColorRes(R.attr.a1h);
                            }
                        } else {
                            TuxIconView tuxIconView4 = c0sz3.LLILLJJLI;
                            if (tuxIconView4 != null) {
                                tuxIconView4.setTintColorRes(R.attr.a1p);
                            }
                            TuxTextView tuxTextView3 = c0sz3.LL;
                            if (tuxTextView3 != null) {
                                tuxTextView3.setTextColorRes(R.attr.a1p);
                            }
                        }
                        if (z) {
                            C786410Ut5.LJLLLLLL(4, c1373640lqk.getBoundaryFromXml());
                        } else {
                            C786410Ut5.LJLLLLLL(0, c1373640lqk.getBoundaryFromXml());
                        }
                        LinearLayout linearLayout4 = this.LJIIIIZZ;
                        if (linearLayout4 != null) {
                            linearLayout4.addView(c1373640lqk);
                        }
                    } else if (abstractC1373870lr7 instanceof C1376720lvi) {
                        C1373920lrC c1373920lrC = new C1373920lrC(context);
                        c1373920lrC.LIZ((C1376720lvi) abstractC1373870lr7, z, r12);
                        LinearLayout linearLayout5 = this.LJIIIIZZ;
                        if (linearLayout5 != null) {
                            linearLayout5.addView(c1373920lrC);
                        }
                    } else if (abstractC1373870lr7 instanceof C1373800lr0) {
                        C1373650lql c1373650lql = new C1373650lql(context);
                        C1373800lr0 c1373800lr0 = (C1373800lr0) abstractC1373870lr7;
                        c1373650lql.LLILZ = c1373800lr0.LIZIZ;
                        c1373650lql.LLIZ.setIconRes(c1373800lr0.LIZ.LIZ);
                        c1373650lql.LLIZ.setTintColorRes(R.attr.a1h);
                        c1373650lql.LLILZLL.setText(c1373650lql.getContext().getResources().getText(c1373800lr0.LIZ.LIZIZ));
                        C589960NBy c589960NBy = C589960NBy.LIZ;
                        AbstractC736370SuZ abstractC736370SuZ = c1373650lql.LLILZ;
                        if (abstractC736370SuZ == null) {
                            abstractC736370SuZ = null;
                        }
                        Aweme aweme2 = abstractC736370SuZ.LLILLJJLI;
                        c589960NBy.getClass();
                        float fLIZIZ = C589960NBy.LIZIZ(aweme2);
                        if (C0BYV.LIZ() == 2) {
                            Iterator<View> it2 = new C09RD(c1373650lql.LLILLJJLI).iterator();
                            while (true) {
                                C09RE c09re = (C09RE) it2;
                                if (!c09re.hasNext()) {
                                    break;
                                }
                                TuxTextView tuxTextView4 = (TuxTextView) ((View) c09re.next());
                                if (CastFloatProtector.parseFloat(tuxTextView4.getText().subSequence(0, tuxTextView4.getText().length() - 1).toString()) == fLIZIZ) {
                                    tuxTextView4.setTextColor(c1373650lql.getContext().getResources().getColor(R.color.da));
                                    c1373650lql.LLILLL = tuxTextView4;
                                }
                            }
                            c1373650lql.LLILLJJLI.setOnTouchListener(new ATListenerS454S0100000_21(c1373650lql, 12));
                            C786410Ut5.LLLLZLL(c1373650lql.LLILZIL, 8);
                        } else {
                            C786410Ut5.LJZL(8, c1373650lql.LLILLJJLI);
                            AbstractC736370SuZ abstractC736370SuZ2 = c1373650lql.LLILZ;
                            if (abstractC736370SuZ2 == null) {
                                abstractC736370SuZ2 = null;
                            }
                            float fLIZIZ2 = C589960NBy.LIZIZ(abstractC736370SuZ2.LLILLJJLI);
                            if (fLIZIZ2 != 1.0f) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(fLIZIZ2);
                                sbLIZ.append('x');
                                c1373650lql.LLILZIL.setText(C2188811AlT.LIZIZ(sbLIZ));
                                C786410Ut5.LLLLZLL(c1373650lql.LLILZIL, r12);
                            }
                            View.OnClickListener aCListenerS155S0100000_21 = new ACListenerS155S0100000_21(c1373650lql, 132);
                            if (C1848410yCV.LIZ) {
                                aCListenerS155S0100000_21 = new f(aCListenerS155S0100000_21);
                            }
                            a aVar = new a(aCListenerS155S0100000_21);
                            if (C2213981Bky.LIZIZ.isOffline()) {
                                C2211941Bhg.LIZ.injectViewListener(c1373650lql);
                            }
                            c1373650lql.setOnClickListener(aVar);
                        }
                        if (z) {
                            C786410Ut5.LJLLLLLL(4, c1373650lql.getBoundaryFromXml());
                        } else {
                            C786410Ut5.LJLLLLLL(0, c1373650lql.getBoundaryFromXml());
                        }
                        LinearLayout linearLayout6 = this.LJIIIIZZ;
                        if (linearLayout6 != null) {
                            linearLayout6.addView(c1373650lql);
                        }
                    }
                    i2++;
                    i = 1;
                    r12 = 0;
                }
                SharePackage sharePackageLIZ = this.LIZJ.LIZ();
                String string = "chat_settings";
                if (!Intrinsics.LJFF(sharePackageLIZ.extras.getString("previous_page"), "chat_settings")) {
                    string = sharePackageLIZ.extras.getString("enter_from");
                }
                String string2 = sharePackageLIZ.extras.getString("enter_method");
                if (string2 == null) {
                    string2 = "long_press";
                }
                String string3 = sharePackageLIZ.extras.getString("aid");
                ArrayList arrayList = new ArrayList();
                for (AbstractC1373870lr7 abstractC1373870lr72 : listLJ) {
                    if (abstractC1373870lr72 instanceof C1373880lr8) {
                        str = ((C1373910lrB) abstractC1373870lr72).LIZ.LIZJ;
                    } else if (abstractC1373870lr72 instanceof C1373910lrB) {
                        str = ((C1373910lrB) abstractC1373870lr72).LIZ.LIZJ;
                    } else if (abstractC1373870lr72 instanceof C1373790lqz) {
                        str = ((C1373790lqz) abstractC1373870lr72).LIZ.LIZLLL;
                    } else if (abstractC1373870lr72 instanceof C1376720lvi) {
                        str = ((C1376720lvi) abstractC1373870lr72).LIZ.LIZJ;
                    } else if (abstractC1373870lr72 instanceof C1373800lr0) {
                        str = ((C1373800lr0) abstractC1373870lr72).LIZ.LIZJ;
                    }
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, null, null, null, 0, null, null, 63);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('[');
                sbLIZ2.append(strLJJLIIIJ);
                sbLIZ2.append(']');
                C20684815ws.LJIILLIIL("show_panel_function", C2097608Jq.LJIIIIZZ(new Pair("enter_from", string), new Pair("panel_source", string2), new Pair("group_id", string3), new Pair("function_show", C2188811AlT.LIZIZ(sbLIZ2))));
                boolean zLJJIIZI = a0.LJJIIZI(strLJJLIIIJ, "favorite", false);
                InterfaceC1373720lqs interfaceC1373720lqs2 = this.LIZJ;
                if (interfaceC1373720lqs2 instanceof C1379170lzf) {
                    aweme = ((C1379170lzf) interfaceC1373720lqs2).LL;
                } else {
                    aweme = null;
                }
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                C1440005kM.LIZ(new C0O9N(aid, zLJJIIZI));
                LinearLayout linearLayout7 = this.LJIIIIZZ;
                if (linearLayout7 != null) {
                    linearLayout7.requestLayout();
                }
            }
        }
        C21578619ce c21578619ce = this.LJIIJ;
        if (c21578619ce != null) {
            c21578619ce.setOnScrollChangeListener(this.LJIILJJIL);
        }
        if (this.LIZIZ.LIZ && !this.LJIILLIIL) {
            Context context2 = this.LIZ;
            if (context2 != null && (activityLJII = C1375500ltk.LJII(context2)) != null) {
                ?? r8 = new InterfaceC1363120lZm() { // from class: X.0lpP
                    @Override // X.InterfaceC1363120lZm
                    public final Window LIZ() {
                        C19EG activity;
                        Window window;
                        Dialog dialog = this.LIZ.LJ;
                        if (dialog != null && (window = dialog.getWindow()) != null) {
                            return window;
                        }
                        LongPressShareListDialogForLiveHost longPressShareListDialogForLiveHost = this.LIZ.LJFF;
                        if (longPressShareListDialogForLiveHost == null || (activity = longPressShareListDialogForLiveHost.getActivity()) == null) {
                            return null;
                        }
                        return activity.getWindow();
                    }

                    @Override // X.InterfaceC1363120lZm
                    public final Object LIZIZ() {
                        C1373630lqj c1373630lqj = this.LIZ;
                        Dialog dialog = c1373630lqj.LJ;
                        return dialog == null ? c1373630lqj.LJFF : dialog;
                    }

                    @Override // X.InterfaceC1363120lZm
                    public final void dismiss() {
                        Dialog dialog = this.LIZ.LJ;
                        if (dialog != null) {
                            dialog.dismiss();
                            C785410UrT.LIZ(dialog);
                        }
                        LongPressShareListDialogForLiveHost longPressShareListDialogForLiveHost = this.LIZ.LJFF;
                        if (longPressShareListDialogForLiveHost != null) {
                            longPressShareListDialogForLiveHost.LL.invoke();
                        }
                    }
                };
                FrameLayout frameLayout = (FrameLayout) LIZ(R.id.xyr);
                RecyclerView recyclerView = (RecyclerView) LIZ(R.id.t0e);
                LinearLayout linearLayout8 = (LinearLayout) LIZ(R.id.v05);
                SharePackage sharePackageLIZ2 = this.LIZJ.LIZ();
                TextView textView = (TextView) LIZ(R.id.uzy);
                C1372830lpR c1372830lpR = this.LIZIZ;
                final C1363070lZh c1363070lZh = new C1363070lZh(activityLJII, r8, sharePackageLIZ2, frameLayout, recyclerView, linearLayout8, textView, c1372830lpR.LIZIZ, c1372830lpR.LJ, this.LJIILJJIL, this.LJIJI);
                ?? r5 = new InterfaceC1362600lYw(c1363070lZh) { // from class: X.0lc1
                    public final C1363070lZh LIZ;

                    @Override // X.InterfaceC1362600lYw
                    public final void LIZ(SharePackage sharePackage) {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJFF(SharePackage sharePackage) {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJIIJ(SharePackage sharePackage, String str2) {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJIIJJI(SharePackage sharePackage) {
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJIILIIL() {
                    }

                    {
                        this.LIZ = c1363070lZh;
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LIZIZ(HashMap<String, String> map) {
                        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
                        if (interfaceC1364520lc2 != null) {
                            interfaceC1364520lc2.LIZIZ(map);
                        }
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LIZLLL(HashMap<String, String> map) {
                        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
                        if (interfaceC1364520lc2 != null) {
                            interfaceC1364520lc2.LIZLLL(map);
                        }
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJ(HashMap<String, String> map) {
                        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
                        if (interfaceC1364520lc2 != null) {
                            interfaceC1364520lc2.LJ(map);
                        }
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJI(SharePackage sharePackage) {
                        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
                        if (interfaceC1364520lc2 != null) {
                            interfaceC1364520lc2.LJII(sharePackage);
                        }
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final boolean LJIIIIZZ(SharePackage sharePackage) {
                        String str2 = "";
                        String string4 = sharePackage.extras.getString("aid", "");
                        if (string4 != null) {
                            str2 = string4;
                        }
                        Aweme awemeEr = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).Er(str2);
                        if (awemeEr == null || !C1017070cZd.LJJLIL(awemeEr)) {
                            return true;
                        }
                        C1233040iBy c1233040iBy = new C1233040iBy(this.LIZ.LIZ);
                        c1233040iBy.LIZIZ(2131824739);
                        c1233040iBy.LIZLLL();
                        return false;
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJIIL(SharePackage sharePackage) {
                        Bundle bundle = sharePackage.extras;
                        if (Intrinsics.LJFF(bundle.getString("is_star"), "1")) {
                            C0OC0 c0oc0 = C0OC0.LIZ;
                            String string4 = bundle.getString("author_id", "");
                            String string5 = bundle.getString("sec_author_id", "");
                            c0oc0.getClass();
                            C0OC0.LIZ(3, string4, string5, null);
                        }
                        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
                        if (interfaceC1364520lc2 != null) {
                            interfaceC1364520lc2.LJIIIIZZ(sharePackage);
                        }
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LIZJ(Dialog dialog, SharePackage sharePackage) {
                        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
                        if (interfaceC1364520lc2 != null) {
                            interfaceC1364520lc2.LJFF(dialog);
                        }
                    }

                    @Override // X.InterfaceC1362600lYw
                    public final void LJII(Dialog dialog, SharePackage sharePackage) {
                        InterfaceC1364520lc2 interfaceC1364520lc2 = this.LIZ.LJI;
                        if (interfaceC1364520lc2 != null) {
                            interfaceC1364520lc2.LJI(dialog);
                        }
                    }
                };
                IInternalShareApi.LIZ.getClass();
                this.LJIIZILJ = C1370970lmR.LIZ().LIZIZ().LJJIJ(c1363070lZh, r5);
            }
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) LIZ(R.id.uzy), 8);
            C786410Ut5.LLIZLLLIL((RecyclerView) LIZ(R.id.t0e), 8);
            C786410Ut5.LJLLLLLL(8, LIZ(R.id.ci5));
            LinearLayout linearLayout9 = this.LJIIJJI;
            if (linearLayout9 != null) {
                ViewGroup.LayoutParams layoutParams3 = linearLayout9.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.height = -2;
                } else {
                    layoutParams3 = null;
                }
                C786410Ut5.d6(linearLayout9, layoutParams3);
            }
            LinearLayout linearLayout10 = this.LJII;
            if (linearLayout10 != null) {
                ViewGroup.LayoutParams layoutParams4 = linearLayout10.getLayoutParams();
                if (layoutParams4 != null) {
                    layoutParams4.height = -2;
                } else {
                    layoutParams4 = null;
                }
                C786410Ut5.d6(linearLayout10, layoutParams4);
            }
            C21578619ce c21578619ce2 = this.LJIIJ;
            if (c21578619ce2 != null) {
                ViewGroup.LayoutParams layoutParams5 = c21578619ce2.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = -2;
                } else {
                    layoutParams5 = null;
                }
                C786410Ut5.o6(c21578619ce2, layoutParams5);
            }
            if (view != null) {
                ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
                if (layoutParams6 != null) {
                    layoutParams6.height = -2;
                } else {
                    layoutParams6 = null;
                }
                C786410Ut5.W5(view, layoutParams6);
                view.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
            }
        }
        FypAutoScrollService fypAutoScrollServiceLIZJ = C1386360mBG.LIZJ();
        if (fypAutoScrollServiceLIZJ != null) {
            fypAutoScrollServiceLIZJ.LJIJI(true);
        }
        Context context3 = this.LIZ;
        if (context3 != null && LIZJ()) {
            FrameLayout frameLayout2 = (FrameLayout) LIZ(R.id.eqx);
            View viewLIZ = LIZ(R.id.fpl);
            View view2 = this.LJI;
            if (view2 != null) {
                C426750GoL.LJIIL(view2, 0, Integer.valueOf((int) C12ES.LIZJ(12.0f, context3)), 0, Integer.valueOf((int) C12ES.LIZJ(12.0f, context3)), 16);
            }
            int iLIZJ = C497820Jfg.LIZJ(context3);
            if (viewLIZ != null) {
                ViewGroup.LayoutParams layoutParams7 = viewLIZ.getLayoutParams();
                if (layoutParams7 != null) {
                    layoutParams7.width = -2;
                }
                ViewGroup.LayoutParams layoutParams8 = viewLIZ.getLayoutParams();
                if (layoutParams8 != null) {
                    layoutParams8.height = -1;
                }
                C426750GoL.LJIIL(viewLIZ, 0, Integer.valueOf(((int) C12ES.LIZJ(8.0f, context3)) + iLIZJ), 0, Integer.valueOf((int) C12ES.LIZJ(8.0f, context3)), 16);
            }
            View view3 = this.LJI;
            if (view3 != null) {
                layoutParams = view3.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                View view4 = this.LJI;
                if (view4 != null) {
                    layoutParams2 = view4.getLayoutParams();
                } else {
                    layoutParams2 = null;
                }
                FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) layoutParams2;
                layoutParams9.gravity = 17;
                int iLIZIZ = C497820Jfg.LIZIZ(context3);
                int iLIZ = C497820Jfg.LIZ(context3);
                if (iLIZIZ > iLIZ) {
                    iLIZIZ = iLIZ;
                }
                layoutParams9.width = iLIZIZ;
                Drawable drawable = context3.getDrawable(R.drawable.cib);
                View view5 = this.LJI;
                if (view5 != null) {
                    view5.setBackground(drawable);
                }
            }
            C502760Jne.LIZIZ(this.LJ, frameLayout2);
        }
        C788580Uwa c788580Uwa = this.LJIJI;
        if (c788580Uwa != null && c788580Uwa.LIZ) {
            View view6 = this.LJI;
            if (view6 != null) {
                view6.setPadding(C341940Daq.LIZ(16.0d), C341940Daq.LIZ(20.0d), C341940Daq.LIZ(16.0d), C341940Daq.LIZ(20.0d));
                view6.setBackground(C800330VaR.LIZIZ(view6.getContext(), R.drawable.b_q));
            }
            LinearLayout linearLayout11 = this.LJIIIIZZ;
            if (linearLayout11 != null) {
                linearLayout11.setBackground(C800330VaR.LIZIZ(linearLayout11.getContext(), R.drawable.b_r));
            }
            RecyclerView recyclerView2 = (RecyclerView) LIZ(R.id.t0e);
            recyclerView2.setBackground(C800330VaR.LIZIZ(recyclerView2.getContext(), R.drawable.b_r));
            recyclerView2.setClipToOutline(true);
            recyclerView2.setClipToPadding(false);
            C786410Ut5.LLLLZLL((TuxTextView) LIZ(R.id.uzy), 8);
            View viewLIZ2 = LIZ(R.id.ci5);
            viewLIZ2.setBackgroundColor(C960203pA.LIZ(R.attr.a1e, viewLIZ2.getContext()));
            C786410Ut5.W5(viewLIZ2, new LinearLayout.LayoutParams(-1, C341940Daq.LIZ(10.0d)));
        }
    }

    public final void LIZLLL(boolean z) {
        boolean z2;
        List<AbstractC1373870lr7> listLJ;
        C788580Uwa c788580Uwa;
        C788580Uwa c788580Uwa2 = this.LJIJI;
        if (c788580Uwa2 != null && c788580Uwa2.LIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            C786410Ut5.LLLLZLL((TuxTextView) LIZ(R.id.uzy), 8);
            LIZ(R.id.ci5).setBackgroundColor(C960203pA.LIZ(R.attr.ng, this.LIZ));
            C786410Ut5.W5(LIZ(R.id.ci5), new LinearLayout.LayoutParams(-1, C341940Daq.LIZ(0.5d)));
        }
        InterfaceC1374230lrh interfaceC1374230lrh = null;
        if (z) {
            InterfaceC1373720lqs interfaceC1373720lqs = this.LIZJ;
            KeyEvent.Callback callback = this.LJ;
            if (callback instanceof InterfaceC1374230lrh) {
                interfaceC1374230lrh = (InterfaceC1374230lrh) callback;
            }
            listLJ = interfaceC1373720lqs.LIZJ(interfaceC1374230lrh);
        } else {
            InterfaceC1373720lqs interfaceC1373720lqs2 = this.LIZJ;
            KeyEvent.Callback callback2 = this.LJ;
            if (callback2 instanceof InterfaceC1374230lrh) {
                interfaceC1374230lrh = (InterfaceC1374230lrh) callback2;
            }
            listLJ = interfaceC1373720lqs2.LJ(interfaceC1374230lrh);
        }
        LinearLayout linearLayout = this.LJIIIIZZ;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        if (listLJ.isEmpty()) {
            C786410Ut5.LJLLLLLL(8, LIZ(R.id.ci5));
        }
        int i = 0;
        boolean z3 = true;
        for (AbstractC1373870lr7 abstractC1373870lr7 : listLJ) {
            View view = new View(this.LIZ);
            if (z3 || ((c788580Uwa = this.LJIJI) != null && c788580Uwa.LIZ)) {
                z3 = false;
            } else if (abstractC1373870lr7 instanceof C1374240lri) {
                int i2 = i + 1;
                if (i == 0) {
                    view.setBackgroundColor(C960203pA.LIZ(R.attr.ng, this.LIZ));
                    C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, C341940Daq.LIZ(0.5d)));
                    LinearLayout linearLayout2 = this.LJIIIIZZ;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(view);
                    }
                }
                i = i2;
            }
            if (abstractC1373870lr7 instanceof C1374240lri) {
                C1373890lr9 c1373890lr9 = new C1373890lr9(this.LIZ);
                c1373890lr9.LIZ((C1373910lrB) abstractC1373870lr7, true, true);
                LinearLayout linearLayout3 = this.LJIIIIZZ;
                if (linearLayout3 != null) {
                    linearLayout3.addView(c1373890lr9);
                }
            } else if (abstractC1373870lr7 instanceof C1373910lrB) {
                C1373890lr9 c1373890lr92 = new C1373890lr9(this.LIZ);
                c1373890lr92.LIZ((C1373910lrB) abstractC1373870lr7, true, true);
                LinearLayout linearLayout4 = this.LJIIIIZZ;
                if (linearLayout4 != null) {
                    linearLayout4.addView(c1373890lr92);
                }
            } else if (abstractC1373870lr7 instanceof C1376720lvi) {
                C1373920lrC c1373920lrC = new C1373920lrC(this.LIZ);
                c1373920lrC.LIZ((C1376720lvi) abstractC1373870lr7, true, true);
                LinearLayout linearLayout5 = this.LJIIIIZZ;
                if (linearLayout5 != null) {
                    linearLayout5.addView(c1373920lrC);
                }
            }
        }
        LinearLayout linearLayout6 = this.LJIIIIZZ;
        if (linearLayout6 != null) {
            linearLayout6.requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0lpS] */
    public C1373630lqj(Context context, C1372830lpR c1372830lpR, InterfaceC1373720lqs interfaceC1373720lqs, float f, Dialog dialog, LongPressShareListDialogForLiveHost longPressShareListDialogForLiveHost) {
        this.LIZ = context;
        this.LIZIZ = c1372830lpR;
        this.LIZJ = interfaceC1373720lqs;
        this.LIZLLL = f;
        this.LJ = dialog;
        this.LJFF = longPressShareListDialogForLiveHost;
    }
}

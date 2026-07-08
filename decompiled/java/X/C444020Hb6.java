package X;

import Y.ACListenerS50S0101000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.AFwS331S0000000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import u4.q0;

/* JADX INFO: renamed from: X.0Hb6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C444020Hb6 extends AbstractC21673619ry<C444090HbD<InterfaceC444050Hb9>> {
    public final C449650HkB LL;
    public final Function1<Integer, Unit> LLILLJJLI;
    public List<? extends InterfaceC444050Hb9> LLILLL = C13BV.INSTANCE;
    public int LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        InterfaceC444050Hb9 interfaceC444050Hb9 = (InterfaceC444050Hb9) C13LP.LJJJLZIJ(i, this.LLILLL);
        if (interfaceC444050Hb9 != null) {
            return interfaceC444050Hb9.LIZJ();
        }
        return 5;
    }

    public C444020Hb6(C449650HkB c449650HkB, AwS585S0100000_6 awS585S0100000_6) {
        this.LL = c449650HkB;
        this.LLILLJJLI = awS585S0100000_6;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C444090HbD c444090HbD = (C444090HbD) viewHolder;
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i, this.LLILLL);
        if (objLJJJLZIJ != null) {
            c444090HbD.I5(i, objLJJJLZIJ);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c3s, viewGroup, false);
        C444090HbD<InterfaceC444050Hb9> c444090HbD = new C444090HbD<InterfaceC444050Hb9>(viewTd) { // from class: X.0Hb5
            public View LL;
            public RemoteImageView LLILLJJLI;
            public View LLILLL;
            public TuxIconView LLILZ;

            @Override // X.C444090HbD
            public final void N5() {
                ViewGroup.MarginLayoutParams marginLayoutParams;
                Drawable drawableNewDrawable;
                View viewFindViewById = this.itemView.findViewById(R.id.wx9);
                this.LL = viewFindViewById;
                Drawable drawable = this.LLILZIL.LL.LLILZIL;
                View view = null;
                if (drawable != null && viewFindViewById != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    viewFindViewById.setBackground((constantState == null || (drawableNewDrawable = constantState.newDrawable()) == null) ? null : drawableNewDrawable.mutate());
                }
                Integer num = this.LLILZIL.LL.LLJJJJLIIL;
                if (num != null) {
                    int iIntValue = num.intValue();
                    View view2 = this.LL;
                    ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMarginStart((int) (iIntValue / 2));
                            marginLayoutParams.setMarginEnd((int) (iIntValue / 2));
                            marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
                        }
                    } else {
                        marginLayoutParams = null;
                    }
                    View view3 = this.LL;
                    if (view3 != null) {
                        C786410Ut5.W5(view3, marginLayoutParams);
                    }
                }
                this.LLILLJJLI = (RemoteImageView) this.itemView.findViewById(R.id.wy_);
                this.LLILZ = (TuxIconView) this.itemView.findViewById(R.id.wxw);
                View viewFindViewById2 = this.itemView.findViewById(R.id.wys);
                if (viewFindViewById2 != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
                    c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
                    viewFindViewById2.setBackground(c384050F3z.LIZ(viewFindViewById2.getContext()));
                    view = viewFindViewById2;
                }
                this.LLILLL = view;
            }

            @Override // X.C444090HbD
            public final void I5(int i2, Object obj) {
                C443900Hau c443900Hau;
                StickerSetInfo stickerSetInfo;
                RemoteImageView remoteImageView;
                C1331730kl9 c1331730kl9;
                RemoteImageView remoteImageView2;
                int i3;
                InterfaceC444050Hb9 interfaceC444050Hb9 = (InterfaceC444050Hb9) obj;
                RemoteImageView remoteImageView3 = this.LLILLJJLI;
                boolean z = false;
                if (remoteImageView3 != null) {
                    remoteImageView3.setPadding(0, 0, 0, 0);
                }
                View view = this.LLILLL;
                if (view != null) {
                    if (interfaceC444050Hb9.LJIIJ()) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    C786410Ut5.LJLLLLLL(i3, view);
                }
                int iLIZJ = interfaceC444050Hb9.LIZJ();
                final String name = null;
                if (iLIZJ != 5) {
                    if (iLIZJ != 7) {
                        if (iLIZJ != 9) {
                            TuxIconView tuxIconView = this.LLILZ;
                            if (tuxIconView != null) {
                                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                            }
                            RemoteImageView remoteImageView4 = this.LLILLJJLI;
                            if (remoteImageView4 != null) {
                                C786410Ut5.l(remoteImageView4, 0);
                            }
                            int iLIZLLL = interfaceC444050Hb9.LIZLLL();
                            if (iLIZLLL > 0) {
                                RemoteImageView remoteImageView5 = this.LLILLJJLI;
                                if (remoteImageView5 != null) {
                                    remoteImageView5.setImageResource(iLIZLLL);
                                }
                            } else {
                                Drawable drawableLJFF = interfaceC444050Hb9.LJFF(this.itemView.getContext());
                                if (drawableLJFF != null && (remoteImageView2 = this.LLILLJJLI) != null) {
                                    remoteImageView2.setImageDrawable(drawableLJFF);
                                }
                            }
                        } else {
                            TuxIconView tuxIconView2 = this.LLILZ;
                            if (tuxIconView2 != null) {
                                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
                            }
                            RemoteImageView remoteImageView6 = this.LLILLJJLI;
                            if (remoteImageView6 != null) {
                                C786410Ut5.l(remoteImageView6, 0);
                            }
                            int iLIZJ2 = (int) C12ES.LIZJ(6.0f, this.itemView.getContext());
                            RemoteImageView remoteImageView7 = this.LLILLJJLI;
                            if (remoteImageView7 != null) {
                                remoteImageView7.setPadding(iLIZJ2, iLIZJ2, iLIZJ2, iLIZJ2);
                            }
                            Context context = this.itemView.getContext();
                            IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LJIILL();
                            Drawable drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.cc2);
                            if (interfaceC444050Hb9.LJI() <= 0) {
                                c1331730kl9 = null;
                            } else {
                                C1331750klB c1331750klB = new C1331750klB();
                                c1331750klB.LJ = C418440Gaw.LIZIZ(Integer.valueOf(interfaceC444050Hb9.LJI()));
                                c1331730kl9 = new C1331730kl9(c1331750klB);
                            }
                            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(interfaceC444050Hb9.getIconUrl());
                            c1331670kl3LJIIIZ.LJJI(this.LLILLJJLI);
                            c1331670kl3LJIIIZ.LJJIIZI(drawableLIZIZ);
                            c1331670kl3LJIIIZ.LJIL(drawableLIZIZ);
                            c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
                            c1331670kl3LJIIIZ.LJJI = c1331730kl9;
                            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
                            c1331670kl3LJIIIZ.LJIIIIZZ = iLIZIZ;
                            c1331670kl3LJIIIZ.LJIIIZ = iLIZIZ2;
                            C1332130kln.LIZJ(c1331670kl3LJIIIZ, C06TB.STABLE_STICKER);
                            C1332130kln.LJFF(c1331670kl3LJIIIZ, "BasicTabIndicatorAdapter", new C444040Hb8(AFwS289S0000000_6.get$arr$(57), C0IE4.get$arr$(2), AFwS331S0000000_6.get$arr$(0)), false, null, null, null, 60);
                        }
                    } else {
                        TuxIconView tuxIconView3 = this.LLILZ;
                        if (tuxIconView3 != null) {
                            C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                        }
                        RemoteImageView remoteImageView8 = this.LLILLJJLI;
                        if (remoteImageView8 != null) {
                            C786410Ut5.l(remoteImageView8, 8);
                        }
                        TuxIconView tuxIconView4 = this.LLILZ;
                        if (tuxIconView4 != null) {
                            tuxIconView4.setIconRes(R.raw.icon_star);
                        }
                        TuxIconView tuxIconView5 = this.LLILZ;
                        if (tuxIconView5 != null) {
                            tuxIconView5.setTintColorRes(R.attr.a1h);
                        }
                    }
                } else {
                    TuxIconView tuxIconView6 = this.LLILZ;
                    if (tuxIconView6 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView6, 0);
                    }
                    RemoteImageView remoteImageView9 = this.LLILLJJLI;
                    if (remoteImageView9 != null) {
                        C786410Ut5.l(remoteImageView9, 8);
                    }
                    TuxIconView tuxIconView7 = this.LLILZ;
                    if (tuxIconView7 != null) {
                        tuxIconView7.setIconRes(R.raw.icon_emoji);
                    }
                    TuxIconView tuxIconView8 = this.LLILZ;
                    if (tuxIconView8 != null) {
                        tuxIconView8.setTintColorRes(R.attr.a1h);
                    }
                }
                String name2 = interfaceC444050Hb9.getName();
                if (name2 != null && name2.length() != 0) {
                    name = interfaceC444050Hb9.getName();
                } else if ((interfaceC444050Hb9 instanceof C443900Hau) && (c443900Hau = (C443900Hau) interfaceC444050Hb9) != null && (stickerSetInfo = c443900Hau.LIZIZ) != null) {
                    name = stickerSetInfo.name;
                }
                if (!TextUtils.isEmpty(name) && (remoteImageView = this.LLILLJJLI) != null) {
                    q0.LJIJ(remoteImageView, new C20094213jo() { // from class: X.0Hb7
                        @Override // X.C20094213jo
                        public final void onInitializeAccessibilityNodeInfo(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                            super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                            String str = name;
                            if (str != null && str.length() != 0) {
                                view2.setContentDescription(name);
                            }
                            accessibilityNodeInfoCompat.setClassName(TextView.class.getName());
                        }
                    });
                }
                View view2 = this.itemView;
                if (i2 == this.LLILZIL.LLILZ) {
                    z = true;
                }
                view2.setSelected(z);
                C786410Ut5.I7(new ACListenerS50S0101000_6(this.LLILZIL, i2, 3), this.itemView);
            }
        };
        try {
            View view = c444090HbD.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c444090HbD.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c444090HbD.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C444010Hb5.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c444090HbD.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c444090HbD.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C444010Hb5.class.getName();
        return c444090HbD;
    }
}

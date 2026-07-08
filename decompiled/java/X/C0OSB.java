package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxTextStruct;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0OSB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OSB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJI(TuxTextView tuxTextView, InboxTextStruct inboxTextStruct) {
        if (inboxTextStruct == null || tuxTextView == null) {
            return;
        }
        tuxTextView.setText(inboxTextStruct.text);
        if (!a0.LJJJIL(inboxTextStruct.color)) {
            C01GW c01gw = C2248361CzK.LIZ;
            Integer numLJ = C2248361CzK.LJ(tuxTextView.getContext(), inboxTextStruct.color);
            if (numLJ != null) {
                tuxTextView.setTextColor(numLJ.intValue());
            }
        }
        if (!a0.LJJJIL(inboxTextStruct.font)) {
            C01GW c01gw2 = C2248361CzK.LIZ;
            Integer numLIZIZ = C2248361CzK.LIZIZ(inboxTextStruct.font);
            if (numLIZIZ != null) {
                tuxTextView.setTuxFont(numLIZIZ.intValue());
            }
        }
    }

    public static C698190Ra5 LJII(Context context, TuxImageModel tuxImageModel) {
        String uri;
        ImageUrlModel imageUrlModel = tuxImageModel.imageUrlLocal;
        if (imageUrlModel == null || !C0OSD.LIZ(imageUrlModel)) {
            return null;
        }
        C844470XAv.LIZ.getClass();
        if (C0OSD.LIZJ(C844470XAv.LJFF()) < tuxImageModel.minLocalVersion) {
            return null;
        }
        C01GW c01gw = C2248361CzK.LIZ;
        if (imageUrlModel.getUrls() != null && (!imageUrlModel.getUrls().isEmpty())) {
            uri = (String) ListProtector.get(imageUrlModel.getUrls(), 0);
        } else {
            uri = imageUrlModel.getUri();
            if (uri == null) {
                uri = "";
            }
        }
        return C2248361CzK.LJFF(context, uri);
    }

    public static C419890GdH LJIIIIZZ(TuxImageModel tuxImageModel, Context context) {
        C698190Ra5 c698190Ra5LJII = LJII(context, tuxImageModel);
        if (c698190Ra5LJII == null) {
            return null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = c698190Ra5LJII.LIZ;
        Integer num = c698190Ra5LJII.LIZIZ;
        if (num != null) {
            c419910GdJ.LIZLLL = Integer.valueOf(num.intValue());
        }
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        return c419910GdJ.LIZIZ(2, context);
    }

    public static void LJFF(TuxIconView tuxIconView, TuxImageModel tuxImageModel, InterfaceC427850Gq7 interfaceC427850Gq7) {
        ImageUrlModel imageUrlModelLIZIZ;
        if (tuxIconView == null) {
            return;
        }
        if (tuxImageModel != null) {
            imageUrlModelLIZIZ = C0OSD.LIZIZ(tuxIconView.getContext(), tuxImageModel);
        } else {
            imageUrlModelLIZIZ = null;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZIZ);
        c1331670kl3LJIIIIZZ.LJJI(tuxIconView);
        c1331670kl3LJIIIIZZ.LJIIJ(interfaceC427850Gq7);
    }

    public static void LIZJ(final View view, final int i, final int i2, final int i3, final int i4) {
        final View view2;
        if (view == null) {
            return;
        }
        Object parent = view.getParent();
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            HandlerHook.viewPost(view2, new Runnable() { // from class: X.0OSQ
                public final void LIZ() {
                    Rect rect = new Rect();
                    view.setEnabled(true);
                    view.getHitRect(rect);
                    rect.top -= i;
                    rect.bottom += i2;
                    rect.left -= i3;
                    rect.right += i4;
                    view2.setTouchDelegate(new TouchDelegate(rect, view));
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("InboxTuxHelper@61b0.expandViewTouchArea$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("InboxTuxHelper@61b0.expandViewTouchArea$1$1");
                }
            });
        }
    }

    public static void LIZLLL(View view, int i, int i2, int i3, int i4) {
        Drawable drawableLIZ;
        StateListDrawable stateListDrawable = new StateListDrawable();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.o_, view.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            if (i <= 0 && i2 <= 0 && i3 <= 0 && i4 <= 0) {
                drawableLIZ = new ColorDrawable(iIntValue);
            } else {
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = Integer.valueOf(iIntValue);
                c384050F3z.LJIIIIZZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i)));
                c384050F3z.LJIIIZ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
                c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i3)));
                c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(Integer.valueOf(i4)));
                drawableLIZ = c384050F3z.LIZ(view.getContext());
            }
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, drawableLIZ);
            stateListDrawable.addState(new int[0], new ColorDrawable(0));
            view.setForeground(stateListDrawable);
        }
    }

    public static void LIZ(ViewGroup viewGroup, final Integer num, final Integer num2, final Integer num3, final Integer num4, final boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(viewGroup.getRootView(), new C0TVI() { // from class: X.0OSE
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                    int iIntValue;
                    int iIntValue2;
                    int iIntValue3;
                    int iIntValue4;
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    Integer num5 = num;
                    if (num5 != null) {
                        iIntValue = num5.intValue();
                    } else {
                        iIntValue = c20244914JjLIZ.LIZ;
                    }
                    Integer num6 = num2;
                    if (num6 != null) {
                        iIntValue2 = num6.intValue();
                    } else {
                        iIntValue2 = c20244914JjLIZ.LIZIZ;
                    }
                    Integer num7 = num3;
                    if (num7 != null) {
                        iIntValue3 = num7.intValue();
                    } else {
                        iIntValue3 = c20244914JjLIZ.LIZJ;
                    }
                    Integer num8 = num4;
                    if (num8 != null) {
                        iIntValue4 = num8.intValue();
                    } else {
                        iIntValue4 = c20244914JjLIZ.LIZLLL;
                    }
                    view.setPadding(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                    if (z) {
                        return C20246014Ju.LIZIZ;
                    }
                    return c20246014Ju;
                }
            });
        }
    }
}

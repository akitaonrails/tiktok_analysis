package X;

import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0n1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419030n1x extends RecyclerView.ViewHolder {
    public static final int LLJILJIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
    public final SmartImageView LL;
    public final SmartImageView LLILLJJLI;
    public final SmartImageView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxIconView LLILZIL;
    public final View LLILZLL;
    public final TuxIconView LLIZ;
    public C1412800mru LLIZLLLIL;
    public long LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    public final C1332100klk I5() {
        return (C1332100klk) this.LLJIJIL.getValue();
    }

    public static int L5() {
        return (!C861960Xre.LIZ() || C862000Xri.LIZ()) ? R.drawable.a8l : R.drawable.a8k;
    }

    public C1419030n1x(View view) {
        FrameLayout.LayoutParams layoutParams;
        super(view);
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.o3j);
        this.LL = smartImageView;
        SmartImageView smartImageView2 = (SmartImageView) view.findViewById(R.id.o3k);
        this.LLILLJJLI = smartImageView2;
        SmartImageView smartImageView3 = (SmartImageView) view.findViewById(R.id.o3l);
        this.LLILLL = smartImageView3;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tyx);
        this.LLILZ = tuxTextView;
        this.LLILZIL = (TuxIconView) view.findViewById(R.id.db6);
        View viewFindViewById = view.findViewById(R.id.amy);
        float dimension = view.getResources().getDimension(R.dimen.b6);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, -16777216});
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, dimension, dimension, dimension, dimension});
        viewFindViewById.setBackground(gradientDrawable);
        this.LLILZLL = viewFindViewById;
        this.LLIZ = (TuxIconView) view.findViewById(R.id.aok);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS566S0100000_22(view, 1097));
        this.LLJI = c01gwLIZIZ;
        this.LLJIJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(495));
        if (tuxTextView.isLaidOut() && !tuxTextView.isLayoutRequested()) {
            Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, 900, 16.0f, 0.0f, null, 0.0f, 0, null, 249);
            if (typefaceLIZIZ != null) {
                tuxTextView.setTypeface(typefaceLIZIZ);
            }
            tuxTextView.LJJJJI(16.0f);
        } else {
            tuxTextView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0n1y
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    TuxTextView tuxTextView2;
                    view2.removeOnLayoutChangeListener(this);
                    Typeface typefaceLIZIZ2 = C1697580uHE.LIZIZ(0.0f, 900, 16.0f, 0.0f, null, 0.0f, 0, null, 249);
                    if ((view2 instanceof TuxTextView) && (tuxTextView2 = (TuxTextView) view2) != null) {
                        if (typefaceLIZIZ2 != null) {
                            tuxTextView2.setTypeface(typefaceLIZIZ2);
                        }
                        tuxTextView2.LJJJJI(16.0f);
                    }
                }
            });
        }
        if (C295860Bii.LIZ()) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("studio_mix_editing_reuse_music_cover_layout_fix", true)) {
                ViewGroup viewGroup = (ViewGroup) c01gwLIZIZ.getValue();
                ViewGroup.LayoutParams layoutParams2 = ((View) c01gwLIZIZ.getValue()).getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = C0EGK.LIZ(55);
                    layoutParams2.height = C0EGK.LIZ(72);
                } else {
                    layoutParams2 = null;
                }
                C786410Ut5.X5(layoutParams2, viewGroup);
                ((ViewGroup) c01gwLIZIZ.getValue()).setClipChildren(false);
                ((ViewGroup) c01gwLIZIZ.getValue()).setClipToPadding(false);
                ViewGroup.LayoutParams layoutParams3 = smartImageView3.getLayoutParams();
                if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams3) != null) {
                    layoutParams.gravity = 17;
                    C786410Ut5.G6(this.LLILLL, layoutParams);
                }
            }
        }
        if (C295860Bii.LIZ()) {
            smartImageView2.setBackgroundResource(L5());
            C337180DJs.LIZJ(smartImageView2);
            C337180DJs.LIZ(smartImageView);
            ViewGroup.LayoutParams layoutParams4 = smartImageView.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.width = C0EGK.LIZ(55);
                layoutParams4.height = C0EGK.LIZ(55);
            }
            ViewGroup.LayoutParams layoutParams5 = viewFindViewById.getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.width = C0EGK.LIZ(55);
                layoutParams5.height = C0EGK.LIZ(36);
                return;
            }
            return;
        }
        smartImageView.setBackgroundResource(L5());
        C337180DJs.LIZJ(smartImageView);
        C337180DJs.LIZ(smartImageView2);
    }

    public final void R5(C1412800mru c1412800mru) {
        boolean z;
        int i;
        Integer num;
        Asset asset = c1412800mru.LIZLLL;
        int i2 = 0;
        if (asset != null && asset.getAsset_type() == AssetType.AUTO_PICK_TEMPLATE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        View view = this.LLILZLL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
        TuxIconView tuxIconView = this.LLIZ;
        if (!z && ((num = c1412800mru.LJIIJ) == null || num.intValue() != 1)) {
            i2 = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i2);
    }

    public final void S5(final String str) {
        boolean z;
        float fLIZIZ;
        int i;
        int i2;
        View viewFindViewById = this.itemView.findViewById(R.id.num);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.nun);
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            if (smartImageView != null) {
                C786410Ut5.LLFF(8, smartImageView);
                return;
            }
            return;
        }
        if (C295860Bii.LIZ()) {
            fLIZIZ = C418440Gaw.LIZIZ(8);
            i = 54;
            i2 = 72;
        } else {
            fLIZIZ = LLJILJIL;
            i = 52;
            i2 = 52;
        }
        ViewGroup.LayoutParams layoutParams = null;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.width = C0EGK.LIZ(i);
                layoutParams2.height = C0EGK.LIZ(i2);
            } else {
                layoutParams2 = null;
            }
            C786410Ut5.W5(viewFindViewById, layoutParams2);
        }
        if (smartImageView != null) {
            C786410Ut5.LLFF(0, smartImageView);
            ViewGroup.LayoutParams layoutParams3 = smartImageView.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = C0EGK.LIZ(i);
                layoutParams3.height = C0EGK.LIZ(i);
                layoutParams = layoutParams3;
            }
            C786410Ut5.G6(smartImageView, layoutParams);
            smartImageView.getHierarchy().LJIIZILJ(InterfaceC1320380kSq.LJI);
            C1447470nlp.LIZIZ(smartImageView, fLIZIZ);
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        c1331670kl3LJIIIZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0n20
            @Override // X.InterfaceC427850Gq7
            public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
            }

            @Override // X.InterfaceC427850Gq7
            public final void cm(Uri uri, View view, Throwable th) {
                String message;
                C0MJ8 c0mj8 = C0MJ8.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FAIL url=");
                sbLIZ.append(str);
                sbLIZ.append(" err=");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C1426005i6.LIZJ(c0mj8, "UI.MixEditing.OverlayCover", C2188811AlT.LIZIZ(sbLIZ));
            }
        });
    }

    public static void P5(C1419030n1x c1419030n1x, String str) {
        boolean z;
        SmartImageView smartImageView = c1419030n1x.LLILLL;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && new C0VSJ(str).exists()) {
            C786410Ut5.LLFF(0, smartImageView);
            C786410Ut5.u5(smartImageView, C13LZ.LIZLLL(0.6f, 0.0f, 1.0f));
            C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(Uri.fromFile(new C0VSJ(str)));
            c1331670kl3LJI.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJI);
            return;
        }
        if (smartImageView.getVisibility() != 8) {
            C786410Ut5.LLFF(8, smartImageView);
        }
        if (smartImageView.getAlpha() == 1.0f) {
            return;
        }
        C786410Ut5.u5(smartImageView, 1.0f);
    }

    public final void N5(C1412800mru c1412800mru, C1419080n22 c1419080n22) {
        String str;
        List<String> urlList;
        if (c1412800mru == null) {
            return;
        }
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixEditingItemCover -> reportMixMaterialCoverShow: item: ");
        sbLIZ.append(c1412800mru.LIZIZ());
        sbLIZ.append("; width = ");
        sbLIZ.append(I5().LIZ);
        sbLIZ.append(", height = ");
        sbLIZ.append(I5().LIZIZ);
        C201955140j.LIZJ(c0mj8, C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(System.currentTimeMillis() - c1419080n22.LIZ, "duration");
        c0lab.LIZ(c1419080n22.LIZIZ, "status_code");
        c0lab.LJ("status_msg", "");
        c0lab.LJ("auto_edit_type", c1412800mru.LIZ.getDescription());
        c0lab.LJ("auto_edit_id", c1412800mru.LIZIZ());
        c0lab.LIZ(c1412800mru.LJFF ? 1 : 0, "is_from_recommend");
        c0lab.LIZ(I5().LIZ, "width");
        c0lab.LIZ(I5().LIZIZ, "height");
        UrlModel urlModel = c1412800mru.LIZJ;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
            str = (String) C13LP.LJJJLZIJ(0, urlList);
        } else {
            str = null;
        }
        c0lab.LJ("url", str);
        C20684815ws.LJIILLIIL("tools_mix_material_item_cover_download", c0lab.LIZ);
    }
}

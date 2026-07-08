package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.zhiliaoapp.musically.R;
import g1c.AjS65S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;

/* JADX INFO: renamed from: X.0QhI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C677180QhI {
    public static final C677180QhI LIZ = new C677180QhI();

    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public static boolean LIZ(Fragment fragment, final PhotoSearchBaseVM photoSearchBaseVM) {
        final PhotoSearchEnterParams photoSearchEnterParams;
        String str;
        C1517140paC c1517140paC = C1517140paC.LIZ;
        c1517140paC.getClass();
        if (!C1517140paC.LIZ()) {
            return false;
        }
        if (photoSearchBaseVM != null) {
            photoSearchEnterParams = photoSearchBaseVM.LLILLL;
        } else {
            photoSearchEnterParams = null;
        }
        View viewSd = C786410Ut5.Sd(R.layout.brs, C786410Ut5.ne(fragment.getContext()), null);
        final C013C c013c = new C013C();
        boolean zLIZJ = C444960Hcc.LIZJ(fragment.getContext());
        final C259800zU c259800zU = new C259800zU();
        if (viewSd != null) {
            C786410Ut5.I7(new AjS65S0100000_10(c259800zU, 13), viewSd.findViewById(R.id.t6f));
            ImageView imageView = (ImageView) viewSd.findViewById(R.id.t6h);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(163));
                C786410Ut5.c6(imageView, layoutParams);
            }
            Context context = viewSd.getContext();
            if (context != null && C960203pA.LIZIZ(context)) {
                if (zLIZJ) {
                    str = "image/photo_search_repeat_guide_rtl_night.png";
                } else {
                    str = "image/photo_search_repeat_guide_night.png";
                }
            } else if (zLIZJ) {
                str = "image/photo_search_repeat_guide_rtl.png";
            } else {
                str = "image/photo_search_repeat_guide.png";
            }
            C1517140paC.LIZIZ(c1517140paC, imageView, str);
            ((TuxTextView) viewSd.findViewById(R.id.t6j)).LJJJJI(26.0f);
            C786410Ut5.I7(new AbstractViewOnClickListenerC420730Ged() { // from class: X.0QhH
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractViewOnClickListenerC420730Ged
                public final void LIZ(View view) {
                    if (view != null) {
                        PhotoSearchBaseVM photoSearchBaseVM2 = photoSearchBaseVM;
                        if (photoSearchBaseVM2 != null) {
                            photoSearchBaseVM2.CQ2("photo_search_guideto_visual_click", new AwS589S0100000_10(photoSearchEnterParams, 488));
                        }
                        c013c.element = true;
                        DialogFragment dialogFragment = (DialogFragment) c259800zU.element;
                        if (dialogFragment != null) {
                            dialogFragment.dismiss();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(700L);
                }
            }, viewSd.findViewById(R.id.t6g));
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(0);
        ?? r2 = c1390920mIc.LIZ;
        r2.LLJJIII = viewSd;
        r2.LLILLJJLI = new C0R4B(photoSearchBaseVM, photoSearchEnterParams, c013c, 1);
        c259800zU.element = r2;
        r2.show(fragment.getChildFragmentManager(), "repeat_search_guide");
        if (photoSearchBaseVM != null) {
            photoSearchBaseVM.CQ2("photo_search_guideto_visual_show", new AwS589S0100000_10(photoSearchEnterParams, 490));
            return true;
        }
        return true;
    }
}

package X;

import Y.ACListenerS114S0200000_10;
import Y.ARunnableS73S0200000_4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.search.vision.PhotoSearchBaseVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.background.CropImageWindowViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.vision.result.CropImageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS19S2200000_10;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676190Qfh extends HorizontalScrollView {
    public final LinearLayout LL;
    public final CropImageViewModel LLILLJJLI;
    public final CropImageWindowViewModel LLILLL;
    public final PhotoSearchBaseVM LLILZ;
    public final List<C676240Qfm> LLILZIL;
    public C676240Qfm LLILZLL;
    public Function2<? super Integer, ? super Boolean, Unit> LLIZ;

    public final int getItemCount() {
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null) {
            return linearLayout.getChildCount();
        }
        return 0;
    }

    public final C676240Qfm getSelectedEntityModel() {
        List<C676240Qfm> list = this.LLILZIL;
        ArrayList arrayList = new ArrayList();
        for (C676240Qfm c676240Qfm : list) {
            if (c676240Qfm.LIZLLL) {
                arrayList.add(c676240Qfm);
            }
        }
        return (C676240Qfm) C13LP.LJJJLZIJ(0, arrayList);
    }

    public C676190Qfh(Context context) {
        super(context, null, 0);
        this.LLILZIL = new ArrayList();
        C786410Ut5.Sd(R.layout.f2e, C786410Ut5.ne(context), this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.eqx);
        this.LL = linearLayout;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            this.LLILLJJLI = (CropImageViewModel) ViewModelProviders.of(c19egLIZIZ).get(CropImageViewModel.class);
            this.LLILLL = (CropImageWindowViewModel) ViewModelProviders.of(c19egLIZIZ).get(CropImageWindowViewModel.class);
            this.LLILZ = C676160Qfe.LIZIZ(c19egLIZIZ);
        }
        CropImageViewModel cropImageViewModel = this.LLILLJJLI;
        if (cropImageViewModel != null) {
            cropImageViewModel.LL = this;
        }
        if (linearLayout != null) {
            linearLayout.setPadding(0, 0, 0, 0);
        }
    }

    public final void setCropImageCountChange(Function2<? super Integer, ? super Boolean, Unit> function2) {
        this.LLIZ = function2;
    }

    public final void setData(List<String> list) {
        int childCount;
        boolean z = true;
        if (list != null && !list.isEmpty()) {
            LinearLayout linearLayout = this.LL;
            if (linearLayout != null) {
                C786410Ut5.LJJJJJL(linearLayout);
            }
            ((ArrayList) this.LLILZIL).clear();
            int i = 0;
            for (String str : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    LIZ(this, i, i, str);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            LIZJ(0, null);
            Function2<? super Integer, ? super Boolean, Unit> function2 = this.LLIZ;
            if (function2 != null) {
                LinearLayout linearLayout2 = this.LL;
                if (linearLayout2 != null) {
                    childCount = linearLayout2.getChildCount();
                } else {
                    childCount = 0;
                }
                Integer numValueOf = Integer.valueOf(childCount);
                if (this.LLILZLL == null) {
                    z = false;
                }
                function2.invoke(numValueOf, Boolean.valueOf(z));
            }
        }
    }

    public final void LIZJ(int i, View view) {
        boolean z;
        LinearLayout linearLayout = this.LL;
        if (linearLayout != null && i != 0) {
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS73S0200000_4(view, this, 32));
            } else if (i >= 0 && i < linearLayout.getChildCount()) {
                View childAt = linearLayout.getChildAt(i);
                smoothScrollTo(childAt.getLeft() - childAt.getPaddingLeft(), 0);
            }
        }
        int i2 = 0;
        for (Object obj : (ArrayList) this.LLILZIL) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C676240Qfm c676240Qfm = (C676240Qfm) obj;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                c676240Qfm.LIZLLL = z;
                ((C385360F9a) c676240Qfm.LJIIJ.getValue()).setSeleted(z);
                ((View) c676240Qfm.LJIIJ.getValue()).invalidate();
                i2 = i3;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final void LIZIZ(Integer num, String str, String str2) {
        String strXQ2;
        JSONObject jSONObject;
        if (num != null) {
            num.intValue();
            C676240Qfm c676240Qfm = (C676240Qfm) C13LP.LJJJLZIJ(num.intValue(), this.LLILZIL);
            if (c676240Qfm == null || c676240Qfm.LIZLLL) {
                return;
            }
            PhotoSearchBaseVM photoSearchBaseVM = this.LLILZ;
            if (photoSearchBaseVM != null) {
                photoSearchBaseVM.CQ2("pic_search_entity_click", new AwS19S2200000_10(num, str, this, str2, 2));
            }
            PhotoSearchBaseVM photoSearchBaseVM2 = this.LLILZ;
            if (photoSearchBaseVM2 != null && (jSONObject = photoSearchBaseVM2.LLIZLLLIL) != null) {
                jSONObject.put("search_time", System.currentTimeMillis());
            }
            PhotoSearchBaseVM photoSearchBaseVM3 = this.LLILZ;
            if (photoSearchBaseVM3 != null) {
                getContext();
                C676050QfT c676050QfT = new C676050QfT(null, null, null, null, null, null, null);
                c676050QfT.setDetection(str);
                c676050QfT.setDetectionIdx(String.valueOf(c676240Qfm.LJFF));
                PhotoSearchBaseVM photoSearchBaseVM4 = this.LLILZ;
                if (photoSearchBaseVM4 != null) {
                    strXQ2 = photoSearchBaseVM4.xQ2(null);
                } else {
                    strXQ2 = null;
                }
                c676050QfT.setImageTosUri(strXQ2);
                photoSearchBaseVM3.DQ2(new C674850QdX(null, "switch_entity", null, null, null, null, null, null, null, null, null, null, null, null, null, c676050QfT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null));
            }
            LIZJ(c676240Qfm.LJ, null);
        }
    }

    public static C676240Qfm LIZ(C676190Qfh c676190Qfh, int i, int i2, String str) {
        c676190Qfh.getClass();
        CropImageWindowViewModel cropImageWindowViewModel = c676190Qfh.LLILLL;
        PhotoSearchBaseVM photoSearchBaseVM = c676190Qfh.LLILZ;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(c676190Qfh.getContext()), R.layout.f2d, c676190Qfh, false);
        C676240Qfm c676240Qfm = new C676240Qfm(viewTd, cropImageWindowViewModel, photoSearchBaseVM);
        c676240Qfm.LJ = i;
        c676240Qfm.LJFF = i2;
        c676240Qfm.LIZ(str);
        LinearLayout linearLayout = c676190Qfh.LL;
        if (linearLayout != null) {
            linearLayout.addView(viewTd);
        }
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && layoutParams != null) {
            C786410Ut5.W5(c676240Qfm.LIZ, layoutParams);
        }
        viewTd.setOutlineProvider(new C689710R3p(c676190Qfh, 0));
        c676240Qfm.LIZIZ().setOutlineProvider(new C689710R3p(c676190Qfh, 1));
        c676240Qfm.LIZIZ().setClipToOutline(true);
        viewTd.setClipToOutline(true);
        C786410Ut5.I7(new ACListenerS114S0200000_10(c676190Qfh, c676240Qfm, 15), viewTd);
        ((ArrayList) c676190Qfh.LLILZIL).add(c676240Qfm);
        return c676240Qfm;
    }
}

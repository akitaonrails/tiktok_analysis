package X;

import Y.AComparatorS43S0000000_24;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.ab.ChangeImagePickerUIExperiment;
import com.ss.android.ugc.aweme.sticker.ab.EffectUploadPickerFolderUIExperiment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import irm.AkS69S0200000_32;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.18hn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21355718hn extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Context LL;
    public final boolean LLILLJJLI;
    public final Function1<C1621190sI1, Unit> LLILLL;
    public final InterfaceC1631630sYr<Boolean, C21356918hz, List<C1621190sI1>, Map<C21356918hz, Integer>, Unit> LLILZ;
    public C1624230sMv LLILZLL;
    public C21356918hz LLIZ;
    public boolean LLJI;
    public InterfaceC212356188k LLJIJIL;
    public InterfaceC21358718iH LLJILJIL;
    public C421050Gf9 LLJILLL;
    public Effect LLJJ;
    public int LLILZIL = -1;
    public final List<C21356918hz> LLIZLLLIL = new ArrayList();
    public final Map<C21356918hz, Integer> LLJ = new LinkedHashMap();
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1390));

    public final void LLLI() {
        Iterator<C21356918hz> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ = -1;
        }
        ((LinkedHashMap) this.LLJ).clear();
    }

    public final int LLLII() {
        return this.LLJ.size();
    }

    public final List<C1621190sI1> LLLIIIIL() {
        List listLJLLLL = C13LP.LJLLLL(new AComparatorS43S0000000_24(20), ((LinkedHashMap) this.LLJ).entrySet());
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listLJLLLL.iterator();
        while (it2.hasNext()) {
            C21356918hz c21356918hz = (C21356918hz) ((Map.Entry) it2.next()).getKey();
            String str = c21356918hz.LIZIZ;
            if (str != null) {
                int i = c21356918hz.LJI;
                String str2 = c21356918hz.LIZ;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = c21356918hz.LJII;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new C1621190sI1(i, str, str2, str3, "media_tray"));
            }
        }
        return arrayList;
    }

    public final void LLLIILIL() {
        C421050Gf9 c421050Gf9 = this.LLJILLL;
        if (c421050Gf9 != null) {
            ObjectAnimator objectAnimator = c421050Gf9.LL;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            ViewGroup.LayoutParams layoutParams = c421050Gf9.itemView.getLayoutParams();
            layoutParams.height = 0;
            layoutParams.width = 0;
            C786410Ut5.W5(c421050Gf9.itemView, layoutParams);
            C786410Ut5.LJLLLLLL(8, c421050Gf9.itemView);
        }
        notifyDataSetChanged();
    }

    public final void LLLILZLLLI() {
        C421050Gf9 c421050Gf9 = this.LLJILLL;
        if (c421050Gf9 != null) {
            ObjectAnimator objectAnimator = c421050Gf9.LL;
            if (objectAnimator != null) {
                C786410Ut5.Pd(objectAnimator);
            }
            ViewGroup.LayoutParams layoutParams = c421050Gf9.itemView.getLayoutParams();
            layoutParams.height = (int) C11VU.LIZIZ(50.0f, c421050Gf9.itemView.getContext());
            layoutParams.width = (int) C11VU.LIZIZ(50.0f, c421050Gf9.itemView.getContext());
            C786410Ut5.W5(c421050Gf9.itemView, layoutParams);
            C786410Ut5.LJLLLLLL(0, c421050Gf9.itemView);
        }
        notifyDataSetChanged();
    }

    public final void clearData() {
        Iterator<C21356918hz> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ = -1;
        }
        ((ArrayList) this.LLIZLLLIL).clear();
        ((LinkedHashMap) this.LLJ).clear();
        this.LLIZ = null;
        this.LLILZIL = -1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLIZLLLIL).size() + 1;
    }

    public final void LLLFZ(List<C1621190sI1> list) {
        Object next;
        for (C1621190sI1 c1621190sI1 : list) {
            Iterator it2 = ((ArrayList) this.LLIZLLLIL).iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(((C21356918hz) next).LIZIZ, c1621190sI1.LIZ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C21356918hz c21356918hz = (C21356918hz) next;
            if (c21356918hz == null) {
                c21356918hz = new C21356918hz(c1621190sI1.LIZ);
                ListProtector.add(this.LLIZLLLIL, 0, c21356918hz);
            }
            int size = this.LLJ.size() + 1;
            this.LLJ.put(c21356918hz, Integer.valueOf(size));
            c21356918hz.LJIIIZ = size;
        }
    }

    public final boolean LLLIL(C21356918hz c21356918hz) {
        String str;
        String str2;
        C21356918hz c21356918hz2 = this.LLIZ;
        if (c21356918hz2 == null || (str = c21356918hz2.LIZIZ) == null || str.length() == 0) {
            return false;
        }
        String str3 = c21356918hz2.LIZIZ;
        if (c21356918hz != null) {
            str2 = c21356918hz.LIZIZ;
        } else {
            str2 = null;
        }
        return Intrinsics.LJFF(str3, str2);
    }

    public final int LLLILZ(String str) {
        if (!TextUtils.isEmpty(str) && !((ArrayList) this.LLIZLLLIL).isEmpty()) {
            int size = ((ArrayList) this.LLIZLLLIL).size();
            for (int i = 0; i < size; i++) {
                if (u.LJIJI(str, ((C21356918hz) ListProtector.get(this.LLIZLLLIL, i)).LIZIZ, false)) {
                    this.LLIZ = (C21356918hz) ListProtector.get(this.LLIZLLLIL, i);
                    int i2 = this.LLILZIL;
                    if (i2 >= 0) {
                        notifyItemChanged(i2);
                    }
                    notifyItemChanged(i);
                    this.LLILZIL = i;
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    public final void LLLJ(C115Y c115y) {
        int adapterPosition = c115y.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < ((ArrayList) this.LLIZLLLIL).size()) {
            int i = this.LLILZIL;
            if (adapterPosition == i) {
                this.LLIZ = null;
                notifyItemChanged(i);
                InterfaceC212356188k interfaceC212356188k = this.LLJIJIL;
                if (interfaceC212356188k != null) {
                    interfaceC212356188k.LJIIL();
                }
                this.LLILZIL = -1;
                return;
            }
            InterfaceC21358718iH interfaceC21358718iH = this.LLJILJIL;
            if (interfaceC21358718iH != null) {
                interfaceC21358718iH.LIZ(this.LLJJ, adapterPosition, (C21356918hz) ListProtector.get(this.LLIZLLLIL, adapterPosition));
            }
            if (this.LLJIJIL != null) {
                C21356918hz c21356918hz = (C21356918hz) ListProtector.get(this.LLIZLLLIL, adapterPosition);
                if (C522610KeZ.LIZ()) {
                    c21356918hz.LJIIJ = adapterPosition;
                    C528500Ko4.LIZIZ = adapterPosition;
                }
                InterfaceC212356188k interfaceC212356188k2 = this.LLJIJIL;
                if (interfaceC212356188k2 == null) {
                    return;
                }
                interfaceC212356188k2.LIZJ(c21356918hz, new C21355818ho(this, adapterPosition));
                return;
            }
            LLLJIL(this, adapterPosition);
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i == getItemCount() - 1) {
            return 1;
        }
        return 2;
    }

    public static final void LLLJIL(C21355718hn c21355718hn, int i) {
        C21356918hz c21356918hz;
        String str;
        c21355718hn.LLIZ = (C21356918hz) ListProtector.get(c21355718hn.LLIZLLLIL, i);
        c21355718hn.notifyItemChanged(c21355718hn.LLILZIL);
        c21355718hn.notifyItemChanged(i);
        c21355718hn.LLILZIL = i;
        if ((ChangeImagePickerUIExperiment.isEnabled() || EffectUploadPickerFolderUIExperiment.isEnabled()) && (c21356918hz = c21355718hn.LLIZ) != null && (str = c21356918hz.LIZIZ) != null) {
            int i2 = c21356918hz.LJI;
            String str2 = c21356918hz.LIZ;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = c21356918hz.LJII;
            if (str3 == null) {
                str3 = "";
            }
            c21355718hn.LLILLL.invoke(new C1621190sI1(i2, str, str2, str3, "media_tray"));
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float f;
        float f2;
        C1624230sMv c1624230sMv;
        if (viewHolder instanceof C421050Gf9) {
            viewHolder.getClass();
            return;
        }
        if (!(viewHolder instanceof C115Y)) {
            return;
        }
        C115Y c115y = (C115Y) viewHolder;
        C21356918hz c21356918hz = (C21356918hz) ListProtector.get(this.LLIZLLLIL, i);
        ImageView imageView = c115y.LL;
        if (!LLLIL(c21356918hz) || this.LLILLJJLI || ((c1624230sMv = this.LLILZLL) != null && true == c1624230sMv.LIZIZ)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        C786410Ut5.LJZI(i2, imageView);
        float f3 = 48.0f;
        if (this.LLILLJJLI && !ChangeImagePickerUIExperiment.isEnabled()) {
            FrameLayout frameLayout = c115y.LLILZLL;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.width = (int) C11VU.LIZIZ(50.0f, frameLayout.getContext());
                    marginLayoutParams.height = (int) C11VU.LIZIZ(50.0f, frameLayout.getContext());
                    marginLayoutParams.leftMargin = 0;
                    marginLayoutParams.rightMargin = 0;
                }
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.a6(frameLayout, marginLayoutParams);
            C1324800kZy c1324800kZy = c115y.LLILLJJLI;
            ViewGroup.LayoutParams layoutParams2 = c1324800kZy.getLayoutParams();
            Context context = c1324800kZy.getContext();
            if (!LLLIL(c21356918hz) && !this.LLJ.containsKey(c21356918hz)) {
                f = 44.0f;
            } else {
                f = 48.0f;
            }
            layoutParams2.width = (int) C11VU.LIZIZ(f, context);
            Context context2 = c1324800kZy.getContext();
            if (!LLLIL(c21356918hz) && !this.LLJ.containsKey(c21356918hz)) {
                f2 = 44.0f;
            } else {
                f2 = 48.0f;
            }
            layoutParams2.height = (int) C11VU.LIZIZ(f2, context2);
            C786410Ut5.o7(c1324800kZy, layoutParams2);
            c1324800kZy.setRectFRadius(C11VU.LIZ(12.0f));
            if (LLLIL(c21356918hz)) {
                View view = c115y.LLIZ;
                view.setBackground(C800330VaR.LIZIZ(view.getContext(), R.drawable.au7));
                C786410Ut5.LJLLLLLL(0, view);
            } else {
                C786410Ut5.LJLLLLLL(8, c115y.LLIZ);
            }
        }
        if (ChangeImagePickerUIExperiment.isEnabled()) {
            FrameLayout frameLayout2 = c115y.LLILZLL;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
            marginLayoutParams2.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            C786410Ut5.a6(frameLayout2, marginLayoutParams2);
        }
        if (C1623480sLi.LIZ()) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(c115y.LLILLL.getLayoutParams());
            layoutParams3.gravity = 81;
            C786410Ut5.g6(c115y.LLILLL, layoutParams3);
        }
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(c115y.LLILZ.getLayoutParams());
        if (this.LLILLJJLI) {
            layoutParams4.gravity = 17;
        } else {
            layoutParams4.gravity = 8388661;
            if (this.LLJI) {
                layoutParams4.topMargin = (int) C11VU.LIZIZ(4.0f, c115y.LLILZ.getContext());
                layoutParams4.rightMargin = (int) C11VU.LIZIZ(4.0f, c115y.LLILZ.getContext());
            } else {
                layoutParams4.topMargin = (int) C11VU.LIZIZ(3.0f, c115y.LLILZ.getContext());
                layoutParams4.rightMargin = (int) C11VU.LIZIZ(3.0f, c115y.LLILZ.getContext());
            }
        }
        TextView textView = c115y.LLILZ;
        C786410Ut5.g6(textView, layoutParams4);
        if (this.LLILLJJLI) {
            textView.setTextColor(textView.getContext().getResources().getColor(R.color.ac4));
            textView.setBackground(null);
        }
        if (c21356918hz.LJIIIZ != -1) {
            C786410Ut5.LLIL(c115y.LLILZ, 0);
            c115y.LLILZ.setText(String.valueOf(c21356918hz.LJIIIZ));
            C786410Ut5.LJZI(8, c115y.LLILZIL);
        } else {
            C786410Ut5.LLIL(c115y.LLILZ, 8);
            if (this.LLJI) {
                int iLLLII = LLLII();
                C1624230sMv c1624230sMv2 = this.LLILZLL;
                if (c1624230sMv2 != null) {
                    i3 = c1624230sMv2.LIZLLL;
                } else {
                    i3 = 0;
                }
                if (iLLLII >= i3) {
                    C786410Ut5.LJZI(0, c115y.LLILZIL);
                } else {
                    C786410Ut5.LJZI(8, c115y.LLILZIL);
                }
            }
        }
        Uri uriLJIILIIL = C2471909mP.LJIILIIL(c21356918hz.LIZIZ);
        if (!this.LLILLJJLI || (!LLLIL(c21356918hz) && !this.LLJ.containsKey(c21356918hz))) {
            f3 = this.LLILLJJLI ? 44.0f : 50.0f;
        }
        int iLIZIZ = (int) C11VU.LIZIZ(f3, c115y.LLILLJJLI.getContext());
        if (c21356918hz.LJI == 3) {
            C1324750kZt.LIZJ(c115y.LLILLJJLI, uriLJIILIIL.toString(), iLIZIZ, iLIZIZ);
        } else {
            C1324750kZt.LIZLLL(c115y.LLILLJJLI, uriLJIILIIL, iLIZIZ, iLIZIZ);
        }
        if (c21356918hz.LJI == 2) {
            TextView textView2 = c115y.LLILLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.k4(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf((c21356918hz.LJFF * 1.0f) / LSPassThroughRecordSizeConfig.DEFAULT)}, 1)));
            sbLIZ.append('s');
            textView2.setText(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.LLIL(textView2, 0);
        } else {
            C786410Ut5.LLIL(c115y.LLILLL, 8);
        }
        if (c21356918hz.LJI == 4) {
            C786410Ut5.LJLLLLLL(0, c115y.LLIZLLLIL);
        } else {
            C436180H8m.LIZIZ(c115y.LLIZLLLIL);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder viewHolder;
        if (i == 1) {
            C421050Gf9 c421050Gf9 = new C421050Gf9((View) this.LLJILJILJ.getValue());
            this.LLJILLL = c421050Gf9;
            viewHolder = c421050Gf9;
        } else {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cut, viewGroup, false);
            C115Y c115y = new C115Y(viewTd);
            C786410Ut5.I7(new AkS69S0200000_32(this, c115y, 3), viewTd);
            viewHolder = c115y;
        }
        try {
            View view = viewHolder.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        viewHolder.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(viewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(viewHolder.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = viewHolder.getClass().getName();
        return viewHolder;
    }

    public C21355718hn(C19EG c19eg, boolean z, Function1 function1, InterfaceC1631630sYr interfaceC1631630sYr) {
        this.LL = c19eg;
        this.LLILLJJLI = z;
        this.LLILLL = function1;
        this.LLILZ = interfaceC1631630sYr;
    }
}

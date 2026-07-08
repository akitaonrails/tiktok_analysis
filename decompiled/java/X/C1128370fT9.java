package X;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS666S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1128370fT9 extends AbstractC2172971A2l<C1128350fT7, C1128390fTB> {
    public final InterfaceC1631620sYq<C1128350fT7, Boolean, Integer, Unit> LLILLJJLI;
    public C1128350fT7 LLILLL;

    public C1128370fT9(AwS666S0100000_17 awS666S0100000_17) {
        super(new AbstractC339510DSr<C1128350fT7>() { // from class: X.0fTC
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(C1128350fT7 c1128350fT7, C1128350fT7 c1128350fT72) {
                return Intrinsics.LJFF(c1128350fT7, c1128350fT72);
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(C1128350fT7 c1128350fT7, C1128350fT7 c1128350fT72) {
                return Intrinsics.LJFF(c1128350fT7.LIZJ.colorId, c1128350fT72.LIZJ.colorId);
            }
        });
        this.LLILLJJLI = awS666S0100000_17;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        final C1128390fTB c1128390fTB = (C1128390fTB) viewHolder;
        final C1128350fT7 c1128350fT7LLLFZ = LLLFZ(i);
        c1128390fTB.getClass();
        if (c1128350fT7LLLFZ.LIZLLL) {
            c1128390fTB.LLILLJJLI.setBackground(c1128390fTB.LLILZIL);
            C786410Ut5.LJLLLLLL(0, c1128390fTB.LLILLL);
        } else {
            c1128390fTB.LLILLJJLI.setBackground(c1128390fTB.LLILZLL);
            C786410Ut5.LJLLLLLL(8, c1128390fTB.LLILLL);
        }
        String str = c1128350fT7LLLFZ.LIZJ.colorName;
        if ((str == null || str.length() == 0) && c1128350fT7LLLFZ.LIZLLL) {
            C786410Ut5.LJLLLLLL(8, c1128390fTB.LLILLL);
        }
        c1128390fTB.LLILLL.setText(c1128350fT7LLLFZ.LIZJ.colorName);
        if (C1125810fP1.LIZJ()) {
            TextView textView = c1128390fTB.LLILLL;
            textView.setTypeface(C1119920fFW.LIZJ(c1128390fTB.LLILLL.getTextSize(), 500, textView.getContext()));
        }
        C1324720kZq c1324720kZq = c1128390fTB.LLILZ;
        ImageModel imageModel = c1128350fT7LLLFZ.LIZJ.colorImage;
        C0IYA c0iya = new C0IYA() { // from class: X.0fTA
            @Override // X.C0IYA, X.InterfaceC1142670fqD
            public final void LIZLLL(String str2, Exception exc) {
                String strJ4;
                List<String> list = c1128350fT7LLLFZ.LIZJ.colorValues;
                if (list != null && list.size() > 0) {
                    ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                    if (list == null || (strJ4 = (String) ListProtector.get(list, 0)) == null) {
                        strJ4 = C786410Ut5.j4("#%08X", Arrays.copyOf(new Object[]{Integer.valueOf(C497740JfY.LIZLLL(R.attr.c1, c1128390fTB.LL.getContext()))}, 1));
                    }
                    shapeDrawable.getPaint().setColor(ColorProtector.parseColor(strJ4));
                    c1128390fTB.LLILZ.setBackground(shapeDrawable);
                }
            }
        };
        c1324720kZq.getMeasuredWidth();
        c1128390fTB.LLILZ.getMeasuredHeight();
        C1324570kZb.LIZJ(c1324720kZq, imageModel, null, null, c0iya, false);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0fT8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2;
                boolean z;
                Long l;
                GiftColorInfo giftColorInfo;
                C1128350fT7 c1128350fT7LIZ;
                C1128370fT9 c1128370fT9 = this.LL;
                C1128350fT7 c1128350fT7LLLFZ2 = c1128370fT9.LLLFZ(i);
                C1128350fT7 c1128350fT7 = c1128370fT9.LLILLL;
                if (c1128350fT7 != null) {
                    i2 = c1128350fT7.LIZ;
                } else {
                    i2 = -1;
                }
                int i3 = c1128350fT7LLLFZ2.LIZ;
                List<T> list = c1128370fT9.LL.LJFF;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (true) {
                    z = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    C1128350fT7 c1128350fT72 = (C1128350fT7) it2.next();
                    if (Intrinsics.LJFF(c1128350fT72.LIZJ.colorId, c1128350fT7LLLFZ2.LIZJ.colorId)) {
                        c1128350fT7LIZ = C1128350fT7.LIZ(c1128350fT72, true);
                    } else {
                        c1128350fT7LIZ = C1128350fT7.LIZ(c1128350fT72, false);
                    }
                    arrayList.add(c1128350fT7LIZ);
                }
                c1128370fT9.LLLI(arrayList);
                C1128350fT7 c1128350fT73 = c1128370fT9.LLILLL;
                if (c1128350fT73 != null && (giftColorInfo = c1128350fT73.LIZJ) != null) {
                    l = giftColorInfo.colorId;
                } else {
                    l = null;
                }
                if (!Intrinsics.LJFF(l, c1128350fT7LLLFZ2.LIZJ.colorId)) {
                    InterfaceC1631620sYq<C1128350fT7, Boolean, Integer, Unit> interfaceC1631620sYq = c1128370fT9.LLILLJJLI;
                    if (i3 > i2) {
                        z = true;
                    }
                    interfaceC1631620sYq.invoke(c1128350fT7LLLFZ2, Boolean.valueOf(z), Integer.valueOf(c1128350fT7LLLFZ2.LIZ + 1));
                }
                c1128370fT9.LLILLL = c1128350fT7LLLFZ2;
            }
        }, c1128390fTB.LL);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        GiftColorInfo giftColorInfo;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h0e, viewGroup, false);
        C1128350fT7 c1128350fT7 = (C1128350fT7) C13LP.LJJJLL(this.LL.LJFF);
        if (c1128350fT7 != null && (giftColorInfo = c1128350fT7.LIZJ) != null) {
            long j = giftColorInfo.colorImageSize;
            if (j != 0) {
                C1324720kZq c1324720kZq = (C1324720kZq) viewTd.findViewById(R.id.res);
                ViewGroup.LayoutParams layoutParams = c1324720kZq.getLayoutParams();
                float f = j;
                layoutParams.width = (int) C497740JfY.LIZIZ(f);
                layoutParams.height = (int) C497740JfY.LIZIZ(f);
                C786410Ut5.u6(c1324720kZq, layoutParams);
            }
        }
        C1128390fTB c1128390fTB = new C1128390fTB(viewTd);
        try {
            View view = c1128390fTB.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1128390fTB.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1128390fTB.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1128390fTB.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1128390fTB.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1128390fTB.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1128390fTB.class.getName();
        return c1128390fTB;
    }
}

package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlotKt;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS690S0100000_8;

/* JADX INFO: renamed from: X.0KxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C534190KxF extends AbstractC21673619ry<C534200KxG> implements Function1<View, Unit> {
    public final C580710Mq5 LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public Function2<? super Integer, ? super TemplateSlot, Unit> LLILZ;
    public final boolean LLILZIL = C580700Mq4.LIZIZ();
    public Boolean LLILZLL;
    public final List<TemplateSlot> LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLIZ.size();
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        Integer num;
        Object tag = view.getTag();
        if ((tag instanceof Integer) && (num = (Integer) tag) != null) {
            int iIntValue = num.intValue();
            Function2<? super Integer, ? super TemplateSlot, Unit> function2 = this.LLILZ;
            if (function2 != null) {
                function2.invoke(Integer.valueOf(iIntValue), ListProtector.get(this.LLIZ, iIntValue));
            }
        }
        return Unit.LIZ;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C534200KxG c534200KxG = (C534200KxG) viewHolder;
        TemplateSlot templateSlot = (TemplateSlot) ListProtector.get(this.LLIZ, i);
        c534200KxG.itemView.setTag(Integer.valueOf(i));
        boolean z = true;
        ((TextView) c534200KxG.itemView.findViewById(R.id.time)).setText(String.valueOf(Math.max(0.1d, new BigDecimal(templateSlot.getDuration()).setScale(1, 1).doubleValue())));
        if (TemplateSlotKt.getHasMaterialTypeConstraints(templateSlot) && Intrinsics.LJFF(TemplateSlotKt.getMaterialType(templateSlot), "video")) {
            ((TuxIconView) c534200KxG.itemView.findViewById(R.id.loe)).setIconRes(R.raw.icon_video_fill);
            C337180DJs.LIZJ(c534200KxG.itemView.findViewById(R.id.loe));
        } else if (TemplateSlotKt.getHasMaterialTypeConstraints(templateSlot) && Intrinsics.LJFF(TemplateSlotKt.getMaterialType(templateSlot), "image")) {
            ((TuxIconView) c534200KxG.itemView.findViewById(R.id.loe)).setIconRes(R.raw.icon_image_alt_1_fill);
            C337180DJs.LIZJ(c534200KxG.itemView.findViewById(R.id.loe));
        } else {
            C337180DJs.LIZ(c534200KxG.itemView.findViewById(R.id.loe));
        }
        View viewFindViewById = c534200KxG.itemView.findViewById(R.id.pw9);
        C534190KxF c534190KxF = c534200KxG.LL;
        if (!c534190KxF.LLILZIL || Intrinsics.LJFF(c534190KxF.LLILZLL, Boolean.FALSE) || !c534200KxG.LL.LL.LJIILJJIL.contains(templateSlot)) {
            z = false;
        }
        C375780EoK.LIZIZ(viewFindViewById, z);
        c534200KxG.itemView.findViewById(R.id.pw9).setTag(templateSlot);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C534200KxG c534200KxG = new C534200KxG(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cyw, viewGroup, false));
        C786410Ut5.I7(new AbS690S0100000_8(this, 7, 42), c534200KxG.itemView);
        ViewGroup.LayoutParams layoutParams = c534200KxG.itemView.getLayoutParams();
        layoutParams.width = this.LLILLJJLI;
        layoutParams.height = this.LLILLL;
        C786410Ut5.W5(c534200KxG.itemView, layoutParams);
        try {
            View view = c534200KxG.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c534200KxG.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c534200KxG.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C534200KxG.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c534200KxG.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c534200KxG.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C534200KxG.class.getName();
        return c534200KxG;
    }

    public C534190KxF(C580710Mq5 c580710Mq5, int i, int i2) {
        this.LL = c580710Mq5;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLIZ = new ArrayList();
        List<TemplateSlot> arrayList = c580710Mq5.LJIIIZ;
        Pair<Boolean, List<TemplateSlot>> pairLIZ = C531610Kt5.LIZ(arrayList);
        arrayList = pairLIZ.getFirst().booleanValue() ? new ArrayList<>(pairLIZ.getSecond()) : arrayList;
        Pair<Boolean, List<TemplateSlot>> pairLIZIZ = C531620Kt6.LIZIZ(arrayList, c580710Mq5.LIZJ);
        this.LLIZ = pairLIZIZ.getFirst().booleanValue() ? new ArrayList<>(pairLIZIZ.getSecond()) : arrayList;
    }
}

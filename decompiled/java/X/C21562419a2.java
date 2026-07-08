package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.Month;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19a2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21562419a2 extends AbstractC21673619ry<C21563419aC> {
    public final Context LL;
    public final CalendarConstraints LLILLJJLI;
    public final DateSelector<?> LLILLL;
    public final InterfaceC21563919aH LLILZ;
    public final int LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.monthSpan;
    }

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return this.LLILLJJLI.start.LJIILJJIL(i).LJIIL();
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C21563419aC c21563419aC = (C21563419aC) viewHolder;
        Month monthLJIILJJIL = this.LLILLJJLI.start.LJIILJJIL(i);
        c21563419aC.LL.setText(monthLJIILJJIL.LJIIJJI(c21563419aC.itemView.getContext()));
        final C21562219a0 c21562219a0 = (C21562219a0) c21563419aC.LLILLJJLI.findViewById(R.id.okc);
        if (c21562219a0.getAdapter() != null && monthLJIILJJIL.equals(c21562219a0.getAdapter().LL)) {
            c21562219a0.invalidate();
            C21562319a1 adapter = c21562219a0.getAdapter();
            Iterator<Long> it2 = adapter.LLILLL.iterator();
            while (it2.hasNext()) {
                adapter.LJFF(c21562219a0, it2.next().longValue());
            }
            DateSelector<?> dateSelector = adapter.LLILLJJLI;
            if (dateSelector != null) {
                Iterator<Long> it3 = dateSelector.Vy().iterator();
                while (it3.hasNext()) {
                    adapter.LJFF(c21562219a0, it3.next().longValue());
                }
                adapter.LLILLL = adapter.LLILLJJLI.Vy();
            }
        } else {
            C21562319a1 c21562319a1 = new C21562319a1(monthLJIILJJIL, this.LLILLL, this.LLILLJJLI);
            c21562219a0.setNumColumns(monthLJIILJJIL.LLILLL);
            c21562219a0.setAdapter((ListAdapter) c21562319a1);
        }
        AdapterView.OnItemClickListener c1847850yBb = new AdapterView.OnItemClickListener() { // from class: X.19a3
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                C21562319a1 adapter2 = c21562219a0.getAdapter();
                if (i2 >= adapter2.LIZIZ() && i2 <= adapter2.LIZLLL()) {
                    InterfaceC21563919aH interfaceC21563919aH = this.LLILLJJLI.LLILZ;
                    long jLongValue = c21562219a0.getAdapter().getItem(i2).longValue();
                    C21563719aF c21563719aF = (C21563719aF) interfaceC21563919aH;
                    if (c21563719aF.LIZ.LLILZ.validator.ZH(jLongValue)) {
                        c21563719aF.LIZ.LLILLL.Tl(jLongValue);
                        Iterator it4 = c21563719aF.LIZ.LL.iterator();
                        while (it4.hasNext()) {
                            ((AbstractC21562119Zz) it4.next()).LIZIZ(c21563719aF.LIZ.LLILLL.cL());
                        }
                        c21563719aF.LIZ.LLJ.getAdapter().notifyDataSetChanged();
                        RecyclerView recyclerView = c21563719aF.LIZ.LLIZLLLIL;
                        if (recyclerView != null) {
                            recyclerView.getAdapter().notifyDataSetChanged();
                        }
                    }
                }
            }
        };
        if (C1848410yCV.LIZ) {
            c1847850yBb = new C1847850yBb(c1847850yBb);
        }
        c21562219a0.setOnItemClickListener(c1847850yBb);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C21563419aC c21563419aC;
        LinearLayout linearLayout = (LinearLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dox, viewGroup, false);
        if (MaterialDatePicker.NR(viewGroup.getContext())) {
            C786410Ut5.d6(linearLayout, new RecyclerView.LayoutParams(-1, this.LLILZIL));
            c21563419aC = new C21563419aC(linearLayout, true);
        } else {
            c21563419aC = new C21563419aC(linearLayout, false);
        }
        try {
            View view = c21563419aC.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c21563419aC.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c21563419aC.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C21563419aC.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c21563419aC.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c21563419aC.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C21563419aC.class.getName();
        return c21563419aC;
    }

    public C21562419a2(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, C21563719aF c21563719aF) {
        int dimensionPixelSize;
        Month month = calendarConstraints.start;
        Month month2 = calendarConstraints.end;
        Month month3 = calendarConstraints.openAt;
        if (month.compareTo(month3) <= 0) {
            if (month3.compareTo(month2) <= 0) {
                int dimensionPixelSize2 = C21562319a1.LLILZLL * context.getResources().getDimensionPixelSize(R.dimen.a8p);
                if (MaterialDatePicker.NR(context)) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.a8p);
                } else {
                    dimensionPixelSize = 0;
                }
                this.LL = context;
                this.LLILZIL = dimensionPixelSize2 + dimensionPixelSize;
                this.LLILLJJLI = calendarConstraints;
                this.LLILLL = dateSelector;
                this.LLILZ = c21563719aF;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }
}

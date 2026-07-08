package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.xelement.picker.LynxPickerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.19lQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class ViewOnClickListenerC21633019lQ extends AbstractC21634219lc implements View.OnClickListener {
    public C21633319lT LLJI;
    public final C21633919lZ LLJIJIL;

    @Override // X.AbstractC21634219lc
    public final void LJ() {
        this.LLJIJIL.getClass();
    }

    @Override // X.AbstractC21634219lc
    public final C21633719lX LJFF() {
        return this.LLJIJIL;
    }

    public ViewOnClickListenerC21633019lQ(C21633919lZ c21633919lZ) {
        String str;
        String str2;
        String str3;
        super(c21633919lZ.LIZJ);
        this.LLJIJIL = c21633919lZ;
        Context context = c21633919lZ.LIZJ;
        Dialog dialog = this.LLILZIL;
        if (dialog != null) {
            LJFF().getClass();
            dialog.setCancelable(true);
        }
        LIZLLL();
        LIZJ();
        C786410Ut5.Sd(c21633919lZ.LIZIZ, C786410Ut5.ne(context), this.LLILLJJLI);
        TextView textView = (TextView) LIZIZ(R.id.z7j);
        View viewLIZIZ = LIZIZ(R.id.txk);
        Button button = (Button) LIZIZ(R.id.cmg);
        Button button2 = (Button) LIZIZ(R.id.clv);
        button.setTag("submit");
        button2.setTag("cancel");
        C786410Ut5.L7(button, this);
        C786410Ut5.L7(button2, this);
        Map<String, String> mapLIZ = c21633919lZ.LJIILL.LIZ();
        if (TextUtils.isEmpty(null)) {
            str = mapLIZ.get("confirm");
        } else {
            str = null;
        }
        button.setText(str);
        if (TextUtils.isEmpty(null)) {
            str2 = mapLIZ.get("cancel");
        } else {
            str2 = null;
        }
        button2.setText(str2);
        if (TextUtils.isEmpty(c21633919lZ.LIZLLL)) {
            str3 = "";
        } else {
            str3 = c21633919lZ.LIZLLL;
        }
        textView.setText(str3);
        button.setTextColor(c21633919lZ.LJ);
        button2.setTextColor(c21633919lZ.LJFF);
        textView.setTextColor(c21633919lZ.LJI);
        viewLIZIZ.setBackgroundColor(-657931);
        float f = 17;
        button.setTextSize(f);
        button2.setTextSize(f);
        textView.setTextSize(c21633919lZ.LJII);
        View viewLIZIZ2 = LIZIZ(R.id.pqm);
        viewLIZIZ2.setBackgroundColor(-1);
        final C21633319lT c21633319lT = new C21633319lT(viewLIZIZ2);
        this.LLJI = c21633319lT;
        c21633319lT.LJFF = c21633919lZ;
        InterfaceC21635619lq interfaceC21635619lq = c21633919lZ.LJIIJJI;
        if (interfaceC21635619lq != null) {
            c21633319lT.LJ = interfaceC21635619lq;
        }
        List<List<String>> list = c21633919lZ.LJIILIIL;
        if (list == null) {
            c21633319lT.LIZJ = null;
            ((ArrayList) c21633319lT.LIZIZ).clear();
            View view = c21633319lT.LIZ;
            if (view instanceof ViewGroup) {
                C786410Ut5.LJJJJI((ViewGroup) view);
            }
        } else {
            List<List<String>> list2 = c21633319lT.LIZJ;
            if (list2 == null) {
                c21633319lT.LIZJ = new ArrayList();
            } else {
                ((ArrayList) list2).clear();
            }
            ((ArrayList) c21633319lT.LIZJ).addAll(list);
            for (final int i = 0; i < ((ArrayList) list).size(); i++) {
                final List list3 = (List) ListProtector.get(list, i);
                if (list3 == null) {
                    throw new IllegalArgumentException("items can not be null");
                }
                while (((ArrayList) c21633319lT.LIZIZ).size() <= i) {
                    C21631219l8 c21631219l8 = new C21631219l8(c21633319lT.LIZ.getContext(), null);
                    c21631219l8.setLocalizeAdapter(c21633319lT.LJFF.LJIILL);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
                    layoutParams.weight = 1.0f;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21631219l8);
                    c21631219l8.setLayoutParams(layoutParams);
                    c21631219l8.setOnItemSelectedListener(new InterfaceC21631819lE() { // from class: X.19lU
                        @Override // X.InterfaceC21631819lE
                        public final void LJLJJI(int i2) {
                            ListProtector.set(c21633319lT.LIZLLL, i, Integer.valueOf(i2));
                            new ArrayList(c21633319lT.LIZLLL);
                            InterfaceC21635619lq interfaceC21635619lq2 = c21633319lT.LJ;
                            if (interfaceC21635619lq2 != null) {
                                int i3 = i;
                                Integer numValueOf = Integer.valueOf(i2);
                                LynxPickerView lynxPickerView = ((C21634119lb) interfaceC21635619lq2).LIZ;
                                if (lynxPickerView.LLJJIJIIJIL) {
                                    C1298720jtu c1298720jtu = lynxPickerView.mContext.LLIZ;
                                    C1289960jfm c1289960jfm = new C1289960jfm(lynxPickerView.getSign(), "columnchange");
                                    c1289960jfm.LIZIZ(Integer.valueOf(i3), "column");
                                    c1289960jfm.LIZIZ(numValueOf, "value");
                                    c1298720jtu.LIZIZ(c1289960jfm);
                                }
                            }
                        }
                    });
                    View view2 = c21633319lT.LIZ;
                    if (view2 instanceof ViewGroup) {
                        ((ViewGroup) view2).addView(c21631219l8);
                    }
                    ((ArrayList) c21633319lT.LIZIZ).add(c21631219l8);
                }
                ((C21631219l8) ListProtector.get(c21633319lT.LIZIZ, i)).setAdapter(new InterfaceC21631619lC<String>(list3) { // from class: X.19lI
                    public final List<String> LIZ;

                    @Override // X.InterfaceC21631619lC
                    public final int Q0() {
                        return this.LIZ.size();
                    }

                    {
                        this.LIZ = list3;
                    }

                    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
                    @Override // X.InterfaceC21631619lC
                    public final String getItem(int i2) {
                        if (i2 >= 0 && i2 < this.LIZ.size()) {
                            return ListProtector.get(this.LIZ, i2);
                        }
                        return "";
                    }
                });
            }
            if (((ArrayList) c21633319lT.LIZLLL).size() != ((ArrayList) c21633319lT.LIZJ).size()) {
                c21633319lT.LIZ(null);
            }
        }
        C21633319lT c21633319lT2 = this.LLJI;
        this.LLJIJIL.getClass();
        Iterator it2 = ((ArrayList) c21633319lT2.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((C21631219l8) it2.next()).setTextSize(18);
        }
        C21633319lT c21633319lT3 = this.LLJI;
        int i2 = this.LLJIJIL.LJIIJ;
        Iterator it3 = ((ArrayList) c21633319lT3.LIZIZ).iterator();
        while (it3.hasNext()) {
            ((C21631219l8) it3.next()).setItemsVisibleCount(i2);
        }
        C21633319lT c21633319lT4 = this.LLJI;
        this.LLJIJIL.getClass();
        Iterator it4 = ((ArrayList) c21633319lT4.LIZIZ).iterator();
        while (it4.hasNext()) {
            ((C21631219l8) it4.next()).setAlphaGradient(false);
        }
        C21633319lT c21633319lT5 = this.LLJI;
        this.LLJIJIL.getClass();
        Iterator it5 = ((ArrayList) c21633319lT5.LIZIZ).iterator();
        while (it5.hasNext()) {
            ((C21631219l8) it5.next()).setLabel(null);
        }
        C21633319lT c21633319lT6 = this.LLJI;
        this.LLJIJIL.getClass();
        Iterator it6 = ((ArrayList) c21633319lT6.LIZIZ).iterator();
        while (it6.hasNext()) {
            it6.next();
        }
        this.LLJIJIL.getClass();
        this.LLJIJIL.getClass();
        C21633319lT c21633319lT7 = this.LLJI;
        this.LLJIJIL.getClass();
        Iterator it7 = ((ArrayList) c21633319lT7.LIZIZ).iterator();
        while (it7.hasNext()) {
            ((C21631219l8) it7.next()).setCyclic(false);
        }
        C21633319lT c21633319lT8 = this.LLJI;
        Typeface typeface = this.LLJIJIL.LJIIIIZZ;
        Iterator it8 = ((ArrayList) c21633319lT8.LIZIZ).iterator();
        while (it8.hasNext()) {
            ((C21631219l8) it8.next()).setTypeface(typeface);
        }
        this.LLJIJIL.getClass();
        AbstractC21634219lc.LJI();
        C21633319lT c21633319lT9 = this.LLJI;
        this.LLJIJIL.getClass();
        Iterator it9 = ((ArrayList) c21633319lT9.LIZIZ).iterator();
        while (it9.hasNext()) {
            ((C21631219l8) it9.next()).setDividerColor(-2763307);
        }
        C21633319lT c21633319lT10 = this.LLJI;
        EnumC21631519lB enumC21631519lB = this.LLJIJIL.LJIIIZ;
        Iterator it10 = ((ArrayList) c21633319lT10.LIZIZ).iterator();
        while (it10.hasNext()) {
            ((C21631219l8) it10.next()).setDividerType(enumC21631519lB);
        }
        C21633319lT c21633319lT11 = this.LLJI;
        this.LLJIJIL.getClass();
        Iterator it11 = ((ArrayList) c21633319lT11.LIZIZ).iterator();
        while (it11.hasNext()) {
            ((C21631219l8) it11.next()).setLineSpacingMultiplier(1.6f);
        }
        C21633319lT c21633319lT12 = this.LLJI;
        this.LLJIJIL.getClass();
        Iterator it12 = ((ArrayList) c21633319lT12.LIZIZ).iterator();
        while (it12.hasNext()) {
            ((C21631219l8) it12.next()).setTextColorOut(-5723992);
        }
        C21633319lT c21633319lT13 = this.LLJI;
        this.LLJIJIL.getClass();
        Iterator it13 = ((ArrayList) c21633319lT13.LIZIZ).iterator();
        while (it13.hasNext()) {
            ((C21631219l8) it13.next()).setTextColorCenter(-14013910);
        }
        C21633319lT c21633319lT14 = this.LLJI;
        this.LLJIJIL.getClass();
        Iterator it14 = ((ArrayList) c21633319lT14.LIZIZ).iterator();
        while (it14.hasNext()) {
            ((C21631219l8) it14.next()).LLIZ = false;
        }
        List<Integer> list4 = this.LLJIJIL.LJIILJJIL;
        C21633319lT c21633319lT15 = this.LLJI;
        if (c21633319lT15 != null) {
            c21633319lT15.LIZ(list4);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = (String) view.getTag();
        if (str.equals("submit")) {
            if (this.LLJIJIL.LJIIL != null) {
                C21633319lT c21633319lT = this.LLJI;
                c21633319lT.getClass();
                this.LLJIJIL.LJIIL.LIZ(new ArrayList(c21633319lT.LIZLLL));
            }
            this.LLIZ = true;
        } else if (str.equals("cancel")) {
            InterfaceC21635319ln interfaceC21635319ln = this.LLJIJIL.LIZ;
            if (interfaceC21635319ln != null) {
                interfaceC21635319ln.onCancel();
            }
            this.LLIZ = true;
        }
        LIZ();
    }
}

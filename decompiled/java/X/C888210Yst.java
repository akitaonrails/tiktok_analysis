package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS223S0300000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yst, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C888210Yst extends LinearLayout {
    public final Context LL;
    public final String LLILLJJLI;
    public final List<C888120Ysk> LLILLL;
    public final boolean LLILZ;
    public final Function1<InterfaceC877650Ybr, Unit> LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final List<C06YW> LLIZLLLIL;

    private final C21532619Oq getOptionListLayout() {
        return (C21532619Oq) this.LLIZ.getValue();
    }

    private final TuxTextView getTitleTV() {
        return (TuxTextView) this.LLILZLL.getValue();
    }

    public final List<C888120Ysk> getSelectedOptionList() {
        List<C06YW> list = this.LLIZLLLIL;
        ArrayList arrayList = new ArrayList();
        for (C06YW c06yw : list) {
            if (c06yw.getOptionSelected()) {
                arrayList.add(c06yw);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C06YW) it2.next()).getOption());
        }
        return arrayList2;
    }

    public C888210Yst(Context context, String str, List list, boolean z, AwS223S0300000_14 awS223S0300000_14) {
        int i;
        super(context);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = z;
        this.LLILZIL = awS223S0300000_14;
        this.LLILZLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 8));
        this.LLIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 7));
        this.LLIZLLLIL = new ArrayList();
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        boolean z2 = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C888120Ysk) it2.next()).LIZIZ instanceof EnumC877640Ybq) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2) {
            i = 16;
        } else {
            i = 8;
        }
        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(i))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), 16);
        TuxTextView titleTV = getTitleTV();
        titleTV.setText(this.LLILLJJLI);
        C786410Ut5.R6(titleTV, new LinearLayout.LayoutParams(-2, -2));
        titleTV.setTuxFont(52);
        titleTV.setTextColorRes(R.attr.a1h);
        addView(getTitleTV());
        C21532619Oq optionListLayout = getOptionListLayout();
        C786410Ut5.d7(optionListLayout, new LinearLayout.LayoutParams(-1, -2));
        C426750GoL.LJIIIZ(optionListLayout, 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))), 0, 0, false, 16);
        optionListLayout.setFlexWrap(1);
        for (final C888120Ysk c888120Ysk : this.LLILLL) {
            final C06YW c06yw = new C06YW(optionListLayout.getContext(), c888120Ysk);
            C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0Yss
                @Override // X.AbstractViewOnClickListenerC1173120gdK
                public final void LIZ(View view) {
                    C888120Ysk c888120Ysk2;
                    InterfaceC877650Ybr interfaceC877650Ybr;
                    C888210Yst c888210Yst = this.LLILZ;
                    if (c888210Yst.LLILZ && (interfaceC877650Ybr = (c888120Ysk2 = c888120Ysk).LIZIZ) != EnumC880570YgZ.ALL_OTHER && interfaceC877650Ybr != EnumC880570YgZ.ALL_FOLLOWER && interfaceC877650Ybr != EnumC880570YgZ.ALL_BUSINESS && interfaceC877650Ybr != EnumC880570YgZ.ALL_CREATORS) {
                        List<C888120Ysk> selectedOptionList = c888210Yst.getSelectedOptionList();
                        if (selectedOptionList.size() != 1 || !Intrinsics.LJFF(C13LP.LJJJJZI(selectedOptionList), c888120Ysk2)) {
                            c06yw.setOptionSelected(!r1.getOptionSelected());
                            for (C06YW c06yw2 : (ArrayList) this.LLILZ.LLIZLLLIL) {
                                InterfaceC877650Ybr interfaceC877650Ybr2 = c06yw2.getOption().LIZIZ;
                                if (interfaceC877650Ybr2 == EnumC880570YgZ.ALL_OTHER || interfaceC877650Ybr2 == EnumC880570YgZ.ALL_FOLLOWER || interfaceC877650Ybr2 == EnumC880570YgZ.ALL_BUSINESS || interfaceC877650Ybr2 == EnumC880570YgZ.ALL_CREATORS) {
                                    c06yw2.setOptionSelected(false);
                                }
                            }
                        }
                    } else {
                        for (C06YW c06yw3 : (ArrayList) c888210Yst.LLIZLLLIL) {
                            c06yw3.setOptionSelected(Intrinsics.LJFF(c06yw3.getOption(), c06yw.getOption()));
                        }
                    }
                    this.LLILZ.LLILZIL.invoke(c888120Ysk.LIZIZ);
                }
            }, c06yw);
            ((ArrayList) this.LLIZLLLIL).add(c06yw);
            optionListLayout.addView(c06yw);
        }
        addView(getOptionListLayout());
    }
}

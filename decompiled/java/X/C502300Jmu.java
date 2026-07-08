package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.bytedance.android.livesdk.livesetting.other.subscribe.LiveSubscribePollViewActionNextSettings;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jmu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502300Jmu extends C502700JnY {
    public final View LL;
    public final SubSpaceNewPostVM LLILLJJLI;
    public final LiveEditText LLILLL;
    public final LiveIconView LLILZ;
    public final TextView LLILZIL;
    public C502450Jn9 LLILZLL;
    public final C502290Jmt LLIZ;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Jmt] */
    public C502300Jmu(View view, SubSpaceNewPostVM subSpaceNewPostVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceNewPostVM;
        this.LLILLL = (LiveEditText) view.findViewById(R.id.rfs);
        this.LLILZ = (LiveIconView) view.findViewById(R.id.fkv);
        this.LLILZIL = (TextView) view.findViewById(R.id.kkx);
        this.LLIZ = new TextWatcher() { // from class: X.0Jmt
            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                C502280Jms c502280Jms;
                String strValueOf = String.valueOf(editable);
                C502300Jmu c502300Jmu = this.LL;
                C502450Jn9 c502450Jn9 = c502300Jmu.LLILZLL;
                if (c502450Jn9 != null && (c502280Jms = c502450Jn9.LIZ) != null) {
                    c502280Jms.LIZIZ = strValueOf;
                }
                SubSpaceNewPostVM subSpaceNewPostVM2 = c502300Jmu.LLILLJJLI;
                subSpaceNewPostVM2.getClass();
                subSpaceNewPostVM2.setState(new C502210Jml());
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence != null && charSequence.length() > 26) {
                    C766270U4b.LJIIJJI(this.LL.LL.getContext().getString(2131841268));
                    this.LL.LLILLL.setText(charSequence.subSequence(0, 26));
                    this.LL.LLILLL.setSelection(26);
                }
            }
        };
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        final C502450Jn9 c502450Jn9;
        final C501810Jm7 c501810Jm7;
        String strValueOf;
        int i;
        if ((abstractC503810JpL instanceof C502450Jn9) && (c502450Jn9 = (C502450Jn9) abstractC503810JpL) != null && (interfaceC2753014t instanceof C501810Jm7) && (c501810Jm7 = (C501810Jm7) interfaceC2753014t) != null) {
            LiveEditText liveEditText = this.LLILLL;
            if (LiveSubscribePollViewActionNextSettings.INSTANCE.getValue() && liveEditText != null) {
                liveEditText.setImeOptions(268435461);
            }
            this.LLILZLL = c502450Jn9;
            TextView textView = this.LLILZIL;
            int i2 = c502450Jn9.LIZ.LIZ;
            if (1 <= i2 && i2 < 27) {
                strValueOf = String.valueOf((char) (i2 + 64));
            } else {
                strValueOf = "?";
            }
            textView.setText(strValueOf);
            LiveIconView liveIconView = this.LLILZ;
            if (c502450Jn9.LIZ.LIZJ) {
                i = 8;
            } else {
                i = 0;
            }
            C786410Ut5.LLJJIJIL(liveIconView, i);
            C786410Ut5.g8(this.LLILZ, new View.OnClickListener() { // from class: X.0Jmp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ArrayList<AbstractC503810JpL> arrayList;
                    int iNextIndex;
                    AbstractC503810JpL abstractC503810JpLPrevious;
                    SubSpaceNewPostVM subSpaceNewPostVM = this.LL.LLILLJJLI;
                    C502450Jn9 c502450Jn92 = c502450Jn9;
                    C502390Jn3 c502390Jn3 = subSpaceNewPostVM.LLILLL;
                    if (c502390Jn3 != null && (arrayList = c502390Jn3.LL) != null) {
                        Iterator<AbstractC503810JpL> it2 = arrayList.iterator();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            iNextIndex = -1;
                            if (!it2.hasNext()) {
                                break;
                            }
                            if (Intrinsics.LJFF(it2.next(), c502450Jn92)) {
                                if (i4 >= 0) {
                                    ListProtector.remove(arrayList, i4);
                                    C502390Jn3 c502390Jn32 = subSpaceNewPostVM.LLILLL;
                                    if (c502390Jn32 != null) {
                                        c502390Jn32.notifyItemRemoved(i4);
                                    }
                                }
                            } else {
                                i4++;
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (AbstractC503810JpL abstractC503810JpL2 : arrayList) {
                            if (abstractC503810JpL2 instanceof C502450Jn9) {
                                arrayList2.add(abstractC503810JpL2);
                            }
                        }
                        for (Object obj : arrayList2) {
                            int i5 = i3 + 1;
                            if (i3 >= 0) {
                                C502450Jn9 c502450Jn93 = (C502450Jn9) obj;
                                c502450Jn93.LIZ.LIZ = i5;
                                C502390Jn3 c502390Jn33 = subSpaceNewPostVM.LLILLL;
                                if (c502390Jn33 != null) {
                                    c502390Jn33.notifyItemChanged(arrayList.indexOf(c502450Jn93));
                                }
                                i3 = i5;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        ListIterator<AbstractC503810JpL> listIterator = arrayList.listIterator(arrayList.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                abstractC503810JpLPrevious = listIterator.previous();
                                if (abstractC503810JpLPrevious instanceof C502490JnD) {
                                    break;
                                }
                            } else {
                                abstractC503810JpLPrevious = null;
                                break;
                            }
                        }
                        if (!(abstractC503810JpLPrevious instanceof C502490JnD) || abstractC503810JpLPrevious == null) {
                            ListIterator<AbstractC503810JpL> listIterator2 = arrayList.listIterator(arrayList.size());
                            while (true) {
                                if (listIterator2.hasPrevious()) {
                                    if (listIterator2.previous() instanceof C502450Jn9) {
                                        iNextIndex = listIterator2.nextIndex();
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            int i6 = iNextIndex + 1;
                            ListProtector.add(arrayList, i6, new C502490JnD());
                            C502390Jn3 c502390Jn34 = subSpaceNewPostVM.LLILLL;
                            if (c502390Jn34 != null) {
                                c502390Jn34.notifyItemInserted(i6);
                            }
                        }
                        subSpaceNewPostVM.setState(new C502210Jml());
                    }
                }
            });
            this.LLILLL.setHint(C786410Ut5.j4(C497740JfY.LJIJI(2131856527), Arrays.copyOf(new Object[]{26}, 1)));
            this.LLILLL.setText(c502450Jn9.LIZ.LIZIZ);
            this.LLILLL.removeTextChangedListener(this.LLIZ);
            this.LLILLL.addTextChangedListener(this.LLIZ);
            this.LLILLL.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.0Jmx
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z) {
                    if (z) {
                        C502520JnG.LIZJ("edit", "poll", c501810Jm7.LLILLJJLI);
                    }
                }
            });
        }
    }
}

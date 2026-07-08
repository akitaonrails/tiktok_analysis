package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextConfig;
import com.ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.123X, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C123X extends LinearLayout {
    public List<C196949123v> LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public InnerEffectTextLayoutConfig LLIZLLLIL;
    public final C12YL LLJ;
    public final Drawable LLJI;
    public float LLJIJIL;

    public final C21410318qb getFocusableEditText() {
        C196949123v next;
        Iterator<C196949123v> it2 = this.LL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.LIZ.hasFocus()) {
                break;
            }
        }
        C196949123v c196949123v = next;
        if (c196949123v != null) {
            return c196949123v.LIZ;
        }
        return null;
    }

    public final List<C196949123v> getEditTextList() {
        return this.LL;
    }

    public final boolean getEditable() {
        return this.LLILLJJLI;
    }

    public final String getHintString() {
        return this.LLILZIL;
    }

    public final InnerEffectTextLayoutConfig getInnerLayoutConfig() {
        return this.LLIZLLLIL;
    }

    public final int getMaxTextWidth() {
        return this.LLILLL;
    }

    public final int getMaxViewWidth() {
        return this.LLILZ;
    }

    public final boolean getShowHint() {
        return this.LLILZLL;
    }

    public C123X(Context context) {
        super(context);
        this.LL = new ArrayList();
        this.LLILLJJLI = true;
        this.LLILLL = -1;
        this.LLILZ = -1;
        this.LLILZIL = " ";
        this.LLJ = new C12YL(this, 2);
        this.LLJI = C800330VaR.LIZIZ(getContext(), R.drawable.bqw);
    }

    public final void setEditTextList(List<C196949123v> list) {
        this.LL = list;
    }

    public final void setEditable(boolean z) {
        if (this.LLILLJJLI != z) {
            this.LLILLJJLI = z;
            Iterator<C196949123v> it2 = this.LL.iterator();
            while (it2.hasNext()) {
                C1360870lW9.LIZLLL(it2.next().LIZ, this.LLILLJJLI);
            }
        }
    }

    public final void setHintString(String str) {
        this.LLILZIL = str;
    }

    public final void setInnerLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        if (!Intrinsics.LJFF(this.LLIZLLLIL, innerEffectTextLayoutConfig)) {
            this.LLIZLLLIL = innerEffectTextLayoutConfig;
            setOrientation(1);
            this.LLJIJIL = 0.0f;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setRotation(0.0f);
            setPadding(0, 0, 0, 0);
            InnerEffectTextLayoutConfig innerEffectTextLayoutConfig2 = this.LLIZLLLIL;
            if (innerEffectTextLayoutConfig2 != null) {
                setOrientation(innerEffectTextLayoutConfig2.getOrientation());
                this.LLJIJIL = innerEffectTextLayoutConfig2.getRotation();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setRotation(0.0f);
                setPadding(innerEffectTextLayoutConfig2.getPaddingStart(), innerEffectTextLayoutConfig2.getPaddingTop(), innerEffectTextLayoutConfig2.getPaddingEnd(), innerEffectTextLayoutConfig2.getPaddingBottom());
                List<InnerEffectTextConfig> textConfigs = innerEffectTextLayoutConfig2.getTextConfigs();
                if (textConfigs.size() < this.LL.size()) {
                    int size = this.LL.size() - 1;
                    int size2 = textConfigs.size();
                    if (size2 <= size) {
                        while (true) {
                            View view = ((C196949123v) ListProtector.get(this.LL, size)).LIZ;
                            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
                            removeView(view);
                            ListProtector.remove(this.LL, size);
                            if (size == size2) {
                                break;
                            } else {
                                size--;
                            }
                        }
                    }
                } else if (textConfigs.size() > this.LL.size()) {
                    int size3 = textConfigs.size();
                    for (int size4 = this.LL.size(); size4 < size3; size4++) {
                        C12K3 c12k3 = new C12K3(getContext(), null);
                        c12k3.setMaxWidth(this.LLILLL);
                        c12k3.setMaxViewWidth(this.LLILZ);
                        addView(c12k3);
                        c12k3.setOnFocusChangeListener(this.LLJ);
                        this.LL.add(new C196949123v(c12k3));
                    }
                }
                int size5 = textConfigs.size();
                for (int i = 0; i < size5; i++) {
                    InnerEffectTextConfig innerEffectTextConfig = (InnerEffectTextConfig) ListProtector.get(textConfigs, i);
                    ListProtector.get(this.LL, i).getClass();
                    C12K3 c12k32 = ((C196949123v) ListProtector.get(this.LL, i)).LIZ;
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.leftMargin = innerEffectTextConfig.getMarginStart();
                    layoutParams.rightMargin = innerEffectTextConfig.getMarginEnd();
                    layoutParams.topMargin = innerEffectTextConfig.getMarginTop();
                    layoutParams.bottomMargin = innerEffectTextConfig.getMarginBottom();
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c12k32);
                    c12k32.setLayoutParams(layoutParams);
                    c12k32.setInnerTextConfig(innerEffectTextConfig);
                    c12k32.setBackground(null);
                    C1360870lW9.LIZLLL(c12k32, this.LLILLJJLI);
                }
                return;
            }
            return;
        }
        invalidate();
    }

    public final void setMaxTextWidth(int i) {
        if (this.LLILLL != i) {
            this.LLILLL = i;
            Iterator<C196949123v> it2 = this.LL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ.setMaxWidth(this.LLILLL);
            }
        }
    }

    public final void setMaxViewWidth(int i) {
        if (this.LLILZ != i) {
            this.LLILZ = i;
            Iterator<C196949123v> it2 = this.LL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ.setMaxViewWidth(this.LLILZ);
            }
        }
    }

    @Override // android.view.View
    public void setRotation(float f) {
        if (this.LLIZLLLIL != null) {
            super.setRotation(f + this.LLJIJIL);
        } else {
            super.setRotation(f);
        }
    }

    public final void setShowHint(boolean z) {
        this.LLILZLL = z;
    }

    public final void setText(List<C123Z> list) {
        C123Z next;
        int length;
        boolean z;
        C123Z c123z;
        Iterator<C123Z> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZLLL) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        z = false;
        boolean z2 = false;
        if (next != null) {
            this.LLIZ = list.indexOf(next);
        } else if (!list.isEmpty()) {
            int size = list.size();
            int i = this.LLIZ;
            if (size > i) {
                ((C123Z) ListProtector.get(list, i)).LIZLLL = true;
            } else {
                ((C123Z) ListProtector.get(list, 0)).LIZLLL = true;
            }
        }
        if (list.size() > this.LL.size()) {
            int size2 = this.LL.size() - 1;
            for (int i2 = 0; i2 < size2; i2++) {
                LIZ(((C196949123v) ListProtector.get(this.LL, i2)).LIZ, this, (C123Z) ListProtector.get(list, i2));
            }
            ArrayList arrayList = new ArrayList();
            int size3 = list.size();
            for (int size4 = this.LL.size() - 1; size4 < size3; size4++) {
                arrayList.add(ListProtector.get(list, size4));
            }
            if (arrayList.isEmpty()) {
                c123z = new C123Z((String) null, 0, false, 15);
            } else {
                StringBuilder sb = new StringBuilder("");
                if (arrayList.size() == 1) {
                    sb.append(((C123Z) ListProtector.get(arrayList, 0)).LIZ);
                    length = ((C123Z) ListProtector.get(arrayList, 0)).LIZIZ;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        C123Z c123z2 = (C123Z) next2;
                        if (!c123z2.LIZJ && a0.LJLIIIL(c123z2.LIZ).toString().length() > 0) {
                            if (next2 != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj : arrayList) {
                                    C123Z c123z3 = (C123Z) obj;
                                    if (!c123z3.LIZJ && a0.LJLIIIL(c123z3.LIZ).toString().length() > 0) {
                                        arrayList2.add(obj);
                                    }
                                }
                                if (arrayList2.size() == 1) {
                                    sb.append(((C123Z) ListProtector.get(arrayList2, 0)).LIZ);
                                    length = ((C123Z) ListProtector.get(arrayList2, 0)).LIZIZ;
                                } else {
                                    int size5 = arrayList2.size() - 1;
                                    length = 0;
                                    for (int i3 = 0; i3 < size5; i3++) {
                                        if (((C123Z) ListProtector.get(arrayList2, i3)).LIZLLL) {
                                            length = sb.toString().length() + ((C123Z) ListProtector.get(arrayList2, i3)).LIZIZ;
                                        }
                                        sb.append(((C123Z) ListProtector.get(arrayList2, i3)).LIZ);
                                        sb.append("\n");
                                    }
                                    if (((C123Z) ListProtector.get(arrayList2, arrayList2.size() - 1)).LIZLLL) {
                                        length = sb.toString().length() + ((C123Z) ListProtector.get(arrayList2, arrayList2.size() - 1)).LIZIZ;
                                    }
                                    sb.append(((C123Z) ListProtector.get(arrayList2, arrayList2.size() - 1)).LIZ);
                                }
                            }
                        }
                    }
                    sb.append(((C123Z) ListProtector.get(arrayList, 0)).LIZ);
                    length = ((C123Z) ListProtector.get(arrayList, 0)).LIZIZ;
                }
                String string = sb.toString();
                Iterator it4 = arrayList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next3 = it4.next();
                    if (!((C123Z) next3).LIZJ) {
                        if (next3 != null) {
                            z = false;
                        }
                    }
                }
                z = true;
                Iterator it5 = arrayList.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next4 = it5.next();
                    if (((C123Z) next4).LIZLLL) {
                        if (next4 != null) {
                            z2 = true;
                        }
                    }
                }
                c123z = new C123Z(string, length, z, z2);
            }
            List<C196949123v> list2 = this.LL;
            LIZ(((C196949123v) ListProtector.get(list2, list2.size() - 1)).LIZ, this, c123z);
            return;
        }
        if (list.size() < this.LL.size()) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(list);
            int size6 = this.LL.size();
            for (int size7 = list.size(); size7 < size6; size7++) {
                arrayList3.add(new C123Z((String) null, 0, false, 15));
            }
            int size8 = arrayList3.size();
            for (int i4 = 0; i4 < size8; i4++) {
                LIZ(((C196949123v) ListProtector.get(this.LL, i4)).LIZ, this, (C123Z) ListProtector.get(arrayList3, i4));
            }
            return;
        }
        int size9 = list.size();
        for (int i5 = 0; i5 < size9; i5++) {
            LIZ(((C196949123v) ListProtector.get(this.LL, i5)).LIZ, this, (C123Z) ListProtector.get(list, i5));
        }
    }

    public static final void LIZ(C12K3 c12k3, C123X c123x, C123Z c123z) {
        Editable editableLLZIL;
        c12k3.setText(c123z.LIZ);
        if (c123z.LIZLLL) {
            c12k3.setSelection(Math.min(String.valueOf(C2204961BRm.LLZIL(c12k3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLuyhLN6DI8+OhRovjHXyJt1YxLpvbQw3nHcpHEOGA=", null))).length(), c123z.LIZIZ));
            C1360870lW9.LIZJ(c12k3);
        } else {
            String str = " ";
            if (c123x.LLILZLL && ((editableLLZIL = C2204961BRm.LLZIL(c12k3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+saov9yDsjZ/V3VE/TkVLuyhLN6DI8+OhRovjHXyJt1YxLpvbQw3nHcpHEOGA=", null))) == null || editableLLZIL.length() == 0)) {
                str = c123x.LLILZIL;
            }
            c12k3.setHint(str);
        }
        c12k3.setTextColor(c123z.LIZJ);
    }
}

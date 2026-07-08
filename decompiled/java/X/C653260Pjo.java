package X;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.ui.ISearchList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Pjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653260Pjo extends C653210Pjj implements InterfaceC653310Pjt {
    public C653270Pjp LIZJ;
    public ISearchList.ActiveArea LIZLLL = new ISearchList.ActiveArea(0.0f, 0.0f, 0.0f, 0.0f);

    @Override // X.InterfaceC653310Pjt
    public final void LIZLLL(ISearchList.ActiveArea activeArea) {
        if (activeArea != null) {
            C653270Pjp c653270Pjp = this.LIZJ;
            if (c653270Pjp != null) {
                c653270Pjp.LIZ(activeArea.getX(), activeArea.getY(), activeArea.getWidth(), activeArea.getHeight());
            }
            this.LIZLLL = activeArea;
        }
    }

    @Override // X.C653210Pjj, X.C1DWH
    public final InterfaceC652740Piy LIZIZ(RecyclerView recyclerView, int i, Collection<? extends InterfaceC652740Piy> collection) {
        Object next;
        InterfaceC652740Piy interfaceC652740PiyLIZ;
        boolean z;
        boolean z2;
        float f;
        float f2;
        InterfaceC653170Pjf c653200Pji;
        C653270Pjp c653270Pjp = this.LIZJ;
        if (c653270Pjp == null) {
            c653270Pjp = new C653270Pjp(recyclerView);
            if (C0PNW.LIZIZ()) {
                c653200Pji = new C653280Pjq(recyclerView);
            } else {
                c653200Pji = new C653200Pji(recyclerView);
            }
            c653270Pjp.LIZJ = c653200Pji;
            c653270Pjp.LIZ(this.LIZLLL.getX(), this.LIZLLL.getY(), this.LIZLLL.getWidth(), this.LIZLLL.getHeight());
            this.LIZJ = c653270Pjp;
        }
        Iterator<? extends InterfaceC652740Piy> it2 = collection.iterator();
        while (it2.hasNext()) {
            it2.next();
            if (C641510PEf.LIZIZ(recyclerView, false)) {
                Iterator<T> it3 = collection.iterator();
                if (!it3.hasNext()) {
                    next = null;
                } else {
                    next = it3.next();
                    if (it3.hasNext()) {
                        int position = ((InterfaceC652740Piy) next).getPosition();
                        do {
                            Object next2 = it3.next();
                            int position2 = ((InterfaceC652740Piy) next2).getPosition();
                            if (position > position2) {
                                next = next2;
                                position = position2;
                            }
                        } while (it3.hasNext());
                    }
                }
                interfaceC652740PiyLIZ = (InterfaceC652740Piy) next;
            } else {
                InterfaceC653170Pjf interfaceC653170Pjf = c653270Pjp.LIZJ;
                if (interfaceC653170Pjf != null && interfaceC653170Pjf.LIZIZ()) {
                    InterfaceC653170Pjf interfaceC653170Pjf2 = c653270Pjp.LIZJ;
                    if (interfaceC653170Pjf2 != null) {
                        interfaceC652740PiyLIZ = interfaceC653170Pjf2.LIZ(collection);
                    } else {
                        continue;
                    }
                } else {
                    c653270Pjp.LJFF.set(0, 0, 0, 0);
                    c653270Pjp.LJ.set(0, 0, 0, 0);
                    c653270Pjp.LIZ.getLocationOnScreen((int[]) c653270Pjp.LIZLLL.getValue());
                    c653270Pjp.LJFF.left = ((int[]) c653270Pjp.LIZLLL.getValue())[0];
                    c653270Pjp.LJFF.top = ((int[]) c653270Pjp.LIZLLL.getValue())[1];
                    c653270Pjp.LJFF.right = ((int[]) c653270Pjp.LIZLLL.getValue())[0] + c653270Pjp.LIZ.getWidth();
                    c653270Pjp.LJFF.bottom = ((int[]) c653270Pjp.LIZLLL.getValue())[1] + c653270Pjp.LIZ.getHeight();
                    c653270Pjp.LJ.set(c653270Pjp.LJFF.left + ((Rect) c653270Pjp.LIZIZ.getValue()).left, c653270Pjp.LJFF.top + ((Rect) c653270Pjp.LIZIZ.getValue()).top, c653270Pjp.LJFF.left + ((Rect) c653270Pjp.LIZIZ.getValue()).right, c653270Pjp.LJFF.top + ((Rect) c653270Pjp.LIZIZ.getValue()).bottom);
                    ArrayList<Pair> arrayList = new ArrayList();
                    for (InterfaceC652740Piy interfaceC652740Piy : collection) {
                        Rect rectLIZ = C652800Pj4.LIZ(interfaceC652740Piy);
                        int i2 = rectLIZ.right;
                        int i3 = rectLIZ.left;
                        if (i2 > i3 && rectLIZ.bottom > rectLIZ.top) {
                            int i4 = (i2 - i3) * (rectLIZ.bottom - rectLIZ.top);
                            int iMax = Math.max(i3, c653270Pjp.LJ.left);
                            int iMax2 = Math.max(rectLIZ.top, c653270Pjp.LJ.top);
                            int iMin = Math.min(rectLIZ.right, c653270Pjp.LJ.right);
                            int iMin2 = Math.min(rectLIZ.bottom, c653270Pjp.LJ.bottom);
                            float f3 = (iMin - iMax) * (iMin2 - iMax2);
                            if (iMax < iMin && iMax2 < iMin2) {
                                float f4 = f3 / i4;
                                if (f4 > 0.0f) {
                                    arrayList.add(new Pair(Float.valueOf(f4), interfaceC652740Piy));
                                }
                            }
                        }
                    }
                    float fFloatValue = 0.0f;
                    interfaceC652740PiyLIZ = null;
                    for (Pair pair : arrayList) {
                        if ((interfaceC652740PiyLIZ != null || ((Number) pair.getFirst()).floatValue() <= 0.0f) && ((Number) pair.getFirst()).floatValue() <= fFloatValue) {
                            if (((Number) pair.getFirst()).floatValue() == fFloatValue && interfaceC652740PiyLIZ != null) {
                                Rect rectLIZ2 = C652800Pj4.LIZ(interfaceC652740PiyLIZ);
                                Rect rectLIZ3 = C652800Pj4.LIZ((InterfaceC652740Piy) pair.getSecond());
                                if (rectLIZ2.right > rectLIZ2.left && rectLIZ2.bottom > rectLIZ2.top) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                boolean z3 = !z;
                                if (rectLIZ3.right > rectLIZ3.left && rectLIZ3.bottom > rectLIZ3.top) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                boolean z4 = !z2;
                                if (!z3) {
                                    if (!z4) {
                                        float f5 = c653270Pjp.LJ.top + ((r0.bottom - r1) / 3.0f);
                                        int i5 = rectLIZ2.top;
                                        int i6 = rectLIZ2.bottom;
                                        float f6 = i5;
                                        if (f6 <= f5 && i6 >= f5) {
                                            f = 0.0f;
                                        } else if (f6 > f5) {
                                            f = f6 - f5;
                                        } else {
                                            f = f5 - i6;
                                        }
                                        int i7 = rectLIZ3.top;
                                        int i8 = rectLIZ3.bottom;
                                        float f7 = i7;
                                        if (f7 <= f5 && i8 >= f5) {
                                            f2 = 0.0f;
                                        } else if (f7 > f5) {
                                            f2 = f7 - f5;
                                        } else {
                                            f2 = f5 - i8;
                                        }
                                        if (f >= f2 && f != f2) {
                                            fFloatValue = ((Number) pair.getFirst()).floatValue();
                                            interfaceC652740PiyLIZ = (InterfaceC652740Piy) pair.getSecond();
                                        }
                                    }
                                } else if (!z4) {
                                    fFloatValue = ((Number) pair.getFirst()).floatValue();
                                    interfaceC652740PiyLIZ = (InterfaceC652740Piy) pair.getSecond();
                                }
                            }
                        } else {
                            fFloatValue = ((Number) pair.getFirst()).floatValue();
                            interfaceC652740PiyLIZ = (InterfaceC652740Piy) pair.getSecond();
                        }
                    }
                }
            }
            if (interfaceC652740PiyLIZ != null) {
                return interfaceC652740PiyLIZ;
            }
        }
        return super.LIZIZ(recyclerView, i, collection);
    }
}

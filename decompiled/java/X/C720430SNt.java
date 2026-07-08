package X;

import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: X.0SNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C720430SNt {
    public static final C720060SMi LIZ(int i, List list) {
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float fFloatValue4;
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (true) {
            float fFloatValue5 = 1.0f;
            if (it2.hasNext()) {
                Object next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    Float fValueOf = Float.valueOf(((SingleImageData) next).getImageRatio());
                    int i4 = 1;
                    if (fValueOf.floatValue() > 0.0f) {
                        fFloatValue5 = fValueOf.floatValue();
                    }
                    int i5 = (int) (i / fFloatValue5);
                    if (i5 >= 1) {
                        i4 = i5;
                    }
                    arrayList.add(new PhotoModeImage(null, i, i4, Float.valueOf(fFloatValue5), null, i2));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            } else {
                if (arrayList.isEmpty()) {
                    return null;
                }
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    Object next2 = it3.next();
                    if (it3.hasNext()) {
                        Float f = ((PhotoModeImage) next2).aspectRatio;
                        if (f != null) {
                            fFloatValue3 = f.floatValue();
                        } else {
                            fFloatValue3 = 1.0f;
                        }
                        do {
                            Object next3 = it3.next();
                            Float f2 = ((PhotoModeImage) next3).aspectRatio;
                            if (f2 != null) {
                                fFloatValue4 = f2.floatValue();
                            } else {
                                fFloatValue4 = 1.0f;
                            }
                            if (Float.compare(fFloatValue3, fFloatValue4) > 0) {
                                next2 = next3;
                                fFloatValue3 = fFloatValue4;
                            }
                        } while (it3.hasNext());
                    }
                    PhotoModeImage photoModeImage = (PhotoModeImage) next2;
                    Iterator it4 = arrayList.iterator();
                    if (it4.hasNext()) {
                        Object next4 = it4.next();
                        if (it4.hasNext()) {
                            Float f3 = ((PhotoModeImage) next4).aspectRatio;
                            if (f3 != null) {
                                fFloatValue = f3.floatValue();
                            } else {
                                fFloatValue = 1.0f;
                            }
                            do {
                                Object next5 = it4.next();
                                Float f4 = ((PhotoModeImage) next5).aspectRatio;
                                if (f4 != null) {
                                    fFloatValue2 = f4.floatValue();
                                } else {
                                    fFloatValue2 = 1.0f;
                                }
                                if (Float.compare(fFloatValue, fFloatValue2) < 0) {
                                    next4 = next5;
                                    fFloatValue = fFloatValue2;
                                }
                            } while (it4.hasNext());
                        }
                        return new C720060SMi(arrayList, photoModeImage, (PhotoModeImage) next4);
                    }
                    throw new NoSuchElementException();
                }
                throw new NoSuchElementException();
            }
        }
    }
}

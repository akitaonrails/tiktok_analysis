package X;

import android.text.InputFilter;
import android.text.Spanned;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115140f7o {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C20586215gy c20586215gy) {
        for (InputFilter inputFilter : c20586215gy.getFilters()) {
            if (inputFilter instanceof C1975107oT) {
                return;
            }
        }
        ArrayList arrayList = (ArrayList) C13LQ.LJLI(c20586215gy.getFilters());
        arrayList.add(new InputFilter() { // from class: X.07oT
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (Intrinsics.LJFF(String.valueOf(charSequence), "\n")) {
                    return "";
                }
                return null;
            }
        });
        c20586215gy.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
    }

    public static void LIZIZ(C20586215gy c20586215gy, InputFilter inputFilter) {
        if (inputFilter != null) {
            ArrayList arrayList = (ArrayList) C13LQ.LJLI(c20586215gy.getFilters());
            arrayList.remove(inputFilter);
            c20586215gy.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[0]));
        }
    }
}

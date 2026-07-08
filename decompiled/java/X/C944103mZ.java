package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03mZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C944103mZ {
    public final List<InterfaceC944503md> LIZ;
    public final C944003mY LIZIZ;

    public C944103mZ(C945303ml c945303ml, List<? extends InterfaceC944503md> list) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        arrayList.addAll(list);
        arrayList.add(new InterfaceC944503md() { // from class: X.03ku
            public String LIZ = "";
            public final boolean LIZIZ = C897103ez.LIZ();
            public TuxIconView LIZJ;
            public boolean LIZLLL;

            @Override // X.InterfaceC944503md
            public final void LIZIZ(boolean z) {
            }

            @Override // X.InterfaceC944503md
            public final void LJ(boolean z) {
            }

            @Override // X.InterfaceC944303mb
            public final void LIZ(View view) {
                C933503kr.LIZ.getClass();
                if (C933503kr.LIZIZ() && C864803Zm.LJII.contains(this.LIZ) && this.LIZIZ) {
                    if (this.LIZJ == null) {
                        this.LIZJ = (TuxIconView) view.findViewById(R.id.pw2);
                        C890103dr.LIZ.getClass();
                        C890103dr.LJI("card_number_ocr", null);
                    }
                    TuxIconView tuxIconView = this.LIZJ;
                    if (tuxIconView != null) {
                        C946503mx.LIZIZ(tuxIconView, new C946403mw(0, R.raw.icon_camera_fill, 0, 118));
                    }
                }
            }

            @Override // X.InterfaceC944503md
            public final void LIZJ(InterfaceC896803ew interfaceC896803ew) {
                String str = interfaceC896803ew.getElementDTO().id;
                if (str == null) {
                    str = "";
                }
                this.LIZ = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC944303mb
            public final C944403mc LIZLLL(C944003mY c944003mY) {
                int length;
                boolean z;
                CharSequence charSequenceLIZIZ;
                C944403mc c944403mcLIZ = c944003mY.LIZ(c944003mY.LIZIZ);
                C933503kr.LIZ.getClass();
                int i = 0;
                if (C933503kr.LIZIZ() && C864803Zm.LJII.contains(this.LIZ)) {
                    InterfaceC944203ma interfaceC944203ma = ((C945303ml) c944403mcLIZ.LIZ).LJIIJ;
                    if (interfaceC944203ma != null && (charSequenceLIZIZ = interfaceC944203ma.LIZIZ()) != null) {
                        length = charSequenceLIZIZ.length();
                    } else {
                        length = 0;
                    }
                    if (!this.LIZIZ && length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C946403mw c946403mw = ((C945303ml) c944403mcLIZ.LIZ).LIZLLL;
                    if (!Intrinsics.LJFF(Boolean.valueOf(z), Boolean.TRUE)) {
                        i = 8;
                    }
                    C946403mw c946403mwLIZ = C946403mw.LIZ(c946403mw, i, null, 126);
                    if (!this.LIZLLL && z) {
                        this.LIZLLL = true;
                        C890103dr.LIZ.getClass();
                        C890103dr.LJI("card_number_ocr", null);
                    }
                    return new C944403mc(C945303ml.LIZ((C945303ml) c944403mcLIZ.LIZ, null, c946403mwLIZ, null, null, null, null, 16375));
                }
                return new C944403mc(C945303ml.LIZ((C945303ml) c944403mcLIZ.LIZ, null, new C946403mw(0, 0, 0, 127), null, null, null, null, 16375));
            }
        });
        this.LIZIZ = new C944003mY(arrayList, c945303ml, 0);
    }
}

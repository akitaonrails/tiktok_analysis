package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS372S0200000_6;

/* JADX INFO: renamed from: X.0HsF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454650HsF {
    public static final C1562980qm8<C0ZL0> LIZJ(Function1<? super View, Unit> function1) {
        return C1558650qf9.LIZIZ("Save", C0ZL0.FAV_STICKER, Integer.valueOf(R.raw.icon_star), 2131848861, false, function1, 48);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<X.C1562980qm8<X.C0ZL0>> LIZ(X.C869590Y9l r10, X.C0ZQI r11) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C454650HsF.LIZ(X.0Y9l, X.0ZQI):java.util.List");
    }

    public static final List<C1562980qm8<C0ZL0>> LIZIZ(C869590Y9l c869590Y9l, StickerTemplate stickerTemplate, C0ZQI c0zqi) {
        boolean z;
        boolean z2 = true;
        if (stickerTemplate.LIZJ() && !C2243571Crb.LJII(stickerTemplate)) {
            z = true;
        } else {
            z = false;
        }
        if (!stickerTemplate.LIZJ() || C2243571Crb.LJFF(stickerTemplate)) {
            z2 = false;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c0zqi.LIZIZ(c869590Y9l, z));
        if (z2) {
            arrayList.add(LIZJ(new AwS372S0200000_6(c869590Y9l, c0zqi, 89)));
        }
        return arrayList;
    }
}

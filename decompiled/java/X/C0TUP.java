package X;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.experiment.PoiCoreConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS413S0200000_12;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0TUP, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TUP extends FrameLayout {
    public final View LL;
    public final C0HZQ LLILLJJLI;
    public final TuxTextView LLILLL;

    public final void setCheckboxClickCallback(Function1<? super Boolean, Unit> function1) {
        C786410Ut5.D7(this.LLILLJJLI, new C785990UsP(function1, 25));
    }

    public C0TUP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View viewInflate = FrameLayout.inflate(context, R.layout.dz5, this);
        this.LL = viewInflate;
        this.LLILLJJLI = (C0HZQ) viewInflate.findViewById(R.id.fvi);
        TuxTextView tuxTextView = (TuxTextView) viewInflate.findViewById(R.id.zio);
        this.LLILLL = tuxTextView;
        String string = getContext().getString(2131836916);
        String string2 = getContext().getString(2131836914);
        String string3 = getContext().getString(2131836915);
        ArrayList arrayList = new ArrayList();
        List listLJIIJJI = C1697810uHb.LJIIJJI(new Pair(string2, PoiCoreConfig.LIZIZ), new Pair(string3, PoiCoreConfig.LIZJ));
        int i = 0;
        for (Object obj : a0.LJJLIIIJILLIZJL(string, new String[]{"%1$s", "%2$s"}, 0, 6)) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(obj);
                Pair pair = (Pair) C13LP.LJJJLZIJ(i, listLJIIJJI);
                if (pair != null) {
                    C444940Hca c444940Hca = new C444940Hca();
                    c444940Hca.LIZJ = (String) pair.getFirst();
                    c444940Hca.LIZIZ(52);
                    c444940Hca.LIZIZ = false;
                    c444940Hca.LIZLLL(1);
                    c444940Hca.LJI = true;
                    c444940Hca.LJIIIIZZ = new AwS413S0200000_12(pair, (Pair<String, String>) this, (C0TUP) 55);
                    arrayList.add(c444940Hca.LIZ(getContext()));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        tuxTextView.setText(TextUtils.concat((CharSequence[]) Arrays.copyOf(charSequenceArr, charSequenceArr.length)));
        this.LLILLL.setMovementMethod(LinkMovementMethod.getInstance());
        this.LLILLL.setHighlightColor(C446980Hfs.LIZ(context, android.R.color.transparent));
    }
}

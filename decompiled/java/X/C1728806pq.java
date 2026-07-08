package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.tako.botpage.cards.novel.choice.TakoNovelChoiceAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06pq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1728806pq extends C2217421BqW implements Function2<Context, List<? extends Integer>, LinearLayout> {
    public C1728806pq(ReusedUIAssem reusedUIAssem) {
        super(2, reusedUIAssem, TakoNovelChoiceAssem.class, "createCardRootLayout", "createCardRootLayout(Landroid/content/Context;Ljava/util/List;)Landroid/widget/LinearLayout;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final LinearLayout invoke(Context context, List<? extends Integer> list) {
        Context context2 = context;
        List<? extends Integer> list2 = list;
        TakoNovelChoiceAssem takoNovelChoiceAssem = (TakoNovelChoiceAssem) this.receiver;
        takoNovelChoiceAssem.getClass();
        LinearLayout linearLayout = new LinearLayout(context2);
        linearLayout.setOrientation(1);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1_);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
        linearLayout.setBackground(c384050F3z.LIZ(context2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list2, 0))));
        layoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list2, 1)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list2, 2))));
        layoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ((Number) ListProtector.get(list2, 3)));
        C786410Ut5.d6(linearLayout, layoutParams);
        linearLayout.addView((View) takoNovelChoiceAssem.LLLZIL.getValue());
        linearLayout.addView(takoNovelChoiceAssem.Vr());
        return linearLayout;
    }
}

package Y;

import X.AnonymousClass1915;
import X.AnonymousClass1916;
import X.C1143680frq;
import X.C1447810nmN;
import X.C1447920nmY;
import X.C19KU;
import X.C1C7U;
import X.C214795194f;
import X.C21495819Am;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.Record;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS433S0200000_32;
import webcast.data.AnchorTaskProgress;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS20S0500000_32 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Drawable drawableLIZ = C1143680frq.LIZ("tiktok_live_broadcast_demand_5", "ttlive_coin_icon.png");
        LinearLayout linearLayout = (LinearLayout) this.l0;
        ImageView imageView = (ImageView) linearLayout.findViewWithTag(linearLayout.toString());
        if (drawableLIZ != null && imageView != null) {
            imageView.setImageDrawable(drawableLIZ);
        }
        ((LinearLayout) this.l0).measure(0, 0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((LinearLayout) this.l0).getMeasuredWidth(), ((LinearLayout) this.l0).getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        LinearLayout linearLayout2 = (LinearLayout) this.l0;
        linearLayout2.layout(0, 0, linearLayout2.getMeasuredWidth(), ((LinearLayout) this.l0).getMeasuredHeight());
        ((LinearLayout) this.l0).draw(canvas);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(((C19KU) this.l1).LLIZLLLIL.getResources(), bitmapCreateBitmap);
        bitmapDrawable.setBounds(0, 0, (int) C497740JfY.LIZIZ(27.0f), (int) C497740JfY.LIZIZ(12.0f));
        ImageSpan imageSpan = Build.VERSION.SDK_INT >= 29 ? new ImageSpan(bitmapDrawable, 2) : new ImageSpan(bitmapDrawable);
        C786410Ut5.q2((SpannableStringBuilder) this.l2, imageSpan, r3.length() - 1, ((SpannableStringBuilder) this.l2).length(), 17);
        C19KU c19ku = (C19KU) this.l1;
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.l2;
        c19ku.I5(spannableStringBuilder, (AnchorTaskProgress) this.l3, spannableStringBuilder.length());
        C500260Jjc.LJJLIIIJJIZ(new AwS433S0200000_32((Function1) this.l4, (Function1<? super ImageSpan, Unit>) imageSpan, (ImageSpan) 57));
    }

    public static final void run$0(ARunnableS20S0500000_32 aRunnableS20S0500000_32) {
        boolean zLIZ;
        C1C7U.LIZ("GrowthTaskItemViewHolder@ba6a.generateScoreLabelDrawable$1");
        try {
            aRunnableS20S0500000_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GrowthTaskItemViewHolder@ba6a.generateScoreLabelDrawable$1");
    }

    public static final void run$1(ARunnableS20S0500000_32 aRunnableS20S0500000_32) {
        C21495819Am c21495819Am = (C21495819Am) aRunnableS20S0500000_32.l0;
        C1447810nmN c1447810nmN = (C1447810nmN) aRunnableS20S0500000_32.l1;
        Scene scene = (Scene) aRunnableS20S0500000_32.l2;
        Record record = (Record) aRunnableS20S0500000_32.l3;
        Runnable runnable = (Runnable) aRunnableS20S0500000_32.l4;
        C1C7U.LIZ("PushAnimationOperation@3ef5.execute$1L");
        ((ArrayList) c21495819Am.LIZ.LJJI().LIZ).remove(c1447810nmN);
        c21495819Am.LIZ.LJIIZILJ(scene, record.mScene, true);
        runnable.run();
        C1C7U.LIZIZ("PushAnimationOperation@3ef5.execute$1L");
    }

    public static final void run$2(ARunnableS20S0500000_32 aRunnableS20S0500000_32) {
        boolean zLIZ;
        C1C7U.LIZ("SharedElementSceneTransitionExecutor@9880.executePushChangeV21$1");
        try {
            AnonymousClass1915 anonymousClass1915 = (AnonymousClass1915) aRunnableS20S0500000_32.l4;
            anonymousClass1915.LJII.LJIIIZ(anonymousClass1915.LIZ);
            ((AnonymousClass1915) aRunnableS20S0500000_32.l4).LJII.LJ((C214795194f) aRunnableS20S0500000_32.l0, (C214795194f) aRunnableS20S0500000_32.l1, (Runnable) aRunnableS20S0500000_32.l2, (C1447920nmY) aRunnableS20S0500000_32.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SharedElementSceneTransitionExecutor@9880.executePushChangeV21$1");
    }

    public static final void run$3(ARunnableS20S0500000_32 aRunnableS20S0500000_32) {
        boolean zLIZ;
        C1C7U.LIZ("SharedElementSceneTransitionExecutor@9880.executePopChangeV21$1");
        try {
            AnonymousClass1915 anonymousClass1915 = (AnonymousClass1915) aRunnableS20S0500000_32.l4;
            anonymousClass1915.LJII.LJIIIZ(anonymousClass1915.LIZ);
            ((AnonymousClass1915) aRunnableS20S0500000_32.l4).LJII.LIZJ((C214795194f) aRunnableS20S0500000_32.l0, (C214795194f) aRunnableS20S0500000_32.l1, (Runnable) aRunnableS20S0500000_32.l2, (C1447920nmY) aRunnableS20S0500000_32.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SharedElementSceneTransitionExecutor@9880.executePopChangeV21$1");
    }

    public static final void run$4(ARunnableS20S0500000_32 aRunnableS20S0500000_32) {
        boolean zLIZ;
        C1C7U.LIZ("SharedElementSceneTransitionExecutor2@77b9.executePushChangeV21$1");
        try {
            AnonymousClass1916 anonymousClass1916 = (AnonymousClass1916) aRunnableS20S0500000_32.l4;
            anonymousClass1916.LJII.LJIIIZ(anonymousClass1916.LIZ);
            ((AnonymousClass1916) aRunnableS20S0500000_32.l4).LJII.LJ((C214795194f) aRunnableS20S0500000_32.l0, (C214795194f) aRunnableS20S0500000_32.l1, (Runnable) aRunnableS20S0500000_32.l2, (C1447920nmY) aRunnableS20S0500000_32.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SharedElementSceneTransitionExecutor2@77b9.executePushChangeV21$1");
    }

    public static final void run$5(ARunnableS20S0500000_32 aRunnableS20S0500000_32) {
        boolean zLIZ;
        C1C7U.LIZ("SharedElementSceneTransitionExecutor2@77b9.executePopChangeV21$1");
        try {
            AnonymousClass1916 anonymousClass1916 = (AnonymousClass1916) aRunnableS20S0500000_32.l4;
            anonymousClass1916.LJII.LJIIIZ(anonymousClass1916.LIZ);
            ((AnonymousClass1916) aRunnableS20S0500000_32.l4).LJII.LIZJ((C214795194f) aRunnableS20S0500000_32.l0, (C214795194f) aRunnableS20S0500000_32.l1, (Runnable) aRunnableS20S0500000_32.l2, (C1447920nmY) aRunnableS20S0500000_32.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SharedElementSceneTransitionExecutor2@77b9.executePopChangeV21$1");
    }

    public ARunnableS20S0500000_32(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}

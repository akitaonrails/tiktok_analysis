package X;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model.MixCardBgModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0ePO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087600ePO extends FrameLayout {
    public C1883920z7m LL;
    public View LLILLJJLI;

    public final View getOverlayView() {
        return this.LLILLJJLI;
    }

    public final C1883920z7m getSparkView() {
        return this.LL;
    }

    public C1087600ePO(Context context) {
        super(context, null, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0JBN] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public final void setBackground$livegame_impl_release(MixCardBgModel mixCardBgModel) {
        ?? arrayList;
        Object c098200Yq;
        View view;
        EnumC1083750eJB enumC1083750eJB;
        Object c098200Yq2;
        View view2;
        int iIntValue;
        if (this.LLILLJJLI == null) {
            View view3 = new View(getContext());
            this.LLILLJJLI = view3;
            addView(view3, 0);
        }
        List<String> list = mixCardBgModel.images;
        if (list != null) {
            arrayList = new ArrayList();
            for (String str : list) {
                if (str.length() > 0) {
                    arrayList.add(str);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        Object obj = null;
        if (!arrayList.isEmpty()) {
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(arrayList);
            Integer num = mixCardBgModel.imageLayout;
            if (num != null && (iIntValue = num.intValue()) != 0) {
                if (iIntValue != 1) {
                    if (iIntValue != 2) {
                        if (iIntValue != 3) {
                            if (iIntValue != 4) {
                                enumC1083750eJB = EnumC1083750eJB.CENTER;
                            } else {
                                enumC1083750eJB = EnumC1083750eJB.RIGHT;
                            }
                        } else {
                            enumC1083750eJB = EnumC1083750eJB.LEFT;
                        }
                    } else {
                        enumC1083750eJB = EnumC1083750eJB.TOP;
                    }
                } else {
                    enumC1083750eJB = EnumC1083750eJB.BOTTOM;
                }
            } else {
                enumC1083750eJB = EnumC1083750eJB.CENTER;
            }
            c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.MATRIX;
            c1324610kZfLIZJ.LJIILLIIL = enumC1083750eJB;
            c1324610kZfLIZJ.LJJI(this);
            String str2 = mixCardBgModel.imageOverlay;
            if (str2 != null) {
                try {
                    c098200Yq2 = Integer.valueOf(Color.parseColor(str2));
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                    obj = c098200Yq2;
                }
                Integer num2 = (Integer) obj;
                if (num2 != null && (view2 = this.LLILLJJLI) != null) {
                    view2.setBackgroundColor(num2.intValue());
                    return;
                }
                return;
            }
            return;
        }
        String str3 = mixCardBgModel.color;
        if (str3 != null) {
            try {
                c098200Yq = Integer.valueOf(Color.parseColor(str3));
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            Integer num3 = (Integer) obj;
            if (num3 != null && (view = this.LLILLJJLI) != null) {
                view.setBackgroundColor(num3.intValue());
            }
        }
    }

    public final void setOverlayView(View view) {
        this.LLILLJJLI = view;
    }

    public final void setSparkView(C1883920z7m c1883920z7m) {
        this.LL = c1883920z7m;
    }

    public final void setSparkView$livegame_impl_release(C1883920z7m c1883920z7m) {
        if (this.LL != null) {
            return;
        }
        this.LL = c1883920z7m;
        addView(c1883920z7m.LIZJ());
    }
}
